/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.melee;

import com.vicmatskiv.weaponlib.AttachmentContainer;
import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.CustomRenderer;
import com.vicmatskiv.weaponlib.DefaultPart;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemSkin;
import com.vicmatskiv.weaponlib.ModelWithAttachments;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.Tuple;
import com.vicmatskiv.weaponlib.animation.DebugPositioner;
import com.vicmatskiv.weaponlib.animation.MultipartPositioning;
import com.vicmatskiv.weaponlib.animation.MultipartRenderStateManager;
import com.vicmatskiv.weaponlib.animation.MultipartTransition;
import com.vicmatskiv.weaponlib.animation.MultipartTransitionProvider;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMeleeRenderer;
import com.vicmatskiv.weaponlib.melee.AsyncMeleeState;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeSkin;
import com.vicmatskiv.weaponlib.melee.PlayerMeleeInstance;
import com.vicmatskiv.weaponlib.melee.RenderableState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class MeleeRenderer
extends CompatibleMeleeRenderer {
    private static final Logger logger = LogManager.getLogger(MeleeRenderer.class);
    private static final float DEFAULT_RANDOMIZING_RATE = 0.33f;
    private static final float DEFAULT_NORMAL_RANDOMIZING_AMPLITUDE = 0.06f;
    private static final int DEFAULT_ANIMATION_DURATION = 70;
    private Builder builder;
    private Map<EntityPlayer, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>> firstPersonStateManagers;
    private MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> weaponTransitionProvider;
    protected ClientModContext clientModContext;

    private MeleeRenderer(Builder builder) {
        super(builder);
        this.builder = builder;
        this.firstPersonStateManagers = new HashMap<EntityPlayer, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>>();
        this.weaponTransitionProvider = new WeaponPositionProvider();
    }

    protected long getTotalAttackDuration() {
        return this.builder.totalAttackingDuration;
    }

    protected long getTotalHeavyAttackDuration() {
        return this.builder.totalHeavyAttackingDuration;
    }

    @Override
    protected ClientModContext getClientModContext() {
        return this.clientModContext;
    }

    public void setClientModContext(ClientModContext clientModContext) {
        this.clientModContext = clientModContext;
    }

    @Override
    protected CompatibleMeleeRenderer.StateDescriptor getStateDescriptor(EntityPlayer player, ItemStack itemStack) {
        MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager;
        float amplitude = this.builder.normalRandomizingAmplitude;
        float rate = this.builder.normalRandomizingRate;
        RenderableState currentState = null;
        PlayerItemInstance<?> playerItemInstance = this.clientModContext.getPlayerItemInstanceRegistry().getItemInstance((EntityLivingBase)player, itemStack);
        PlayerMeleeInstance playerMeleeInstance = null;
        if (playerItemInstance == null || !(playerItemInstance instanceof PlayerMeleeInstance) || playerItemInstance.getItem() != itemStack.func_77973_b()) {
            logger.error("Invalid or mismatching item. Player item instance: {}. Item stack: {}", playerItemInstance, (Object)itemStack);
        } else {
            playerMeleeInstance = (PlayerMeleeInstance)playerItemInstance;
        }
        if (playerMeleeInstance != null) {
            AsyncMeleeState asyncWeaponState = this.getNextNonExpiredState(playerMeleeInstance);
            switch (asyncWeaponState.getState()) {
                case ATTACKING: 
                case ATTACKING_STABBING: {
                    currentState = RenderableState.ATTACKING;
                    break;
                }
                case HEAVY_ATTACKING: 
                case HEAVY_ATTACKING_STABBING: {
                    currentState = RenderableState.HEAVY_ATTACKING;
                    break;
                }
                case MODIFYING: 
                case MODIFYING_REQUESTED: 
                case NEXT_ATTACHMENT: 
                case NEXT_ATTACHMENT_REQUESTED: {
                    currentState = RenderableState.MODIFYING;
                    break;
                }
                default: {
                    if (!player.func_70051_ag() || this.builder.firstPersonPositioningRunning == null) break;
                    currentState = RenderableState.RUNNING;
                }
            }
            logger.trace("Rendering state {} created from {}", (Object)currentState, (Object)asyncWeaponState.getState());
        }
        if (currentState == null) {
            currentState = RenderableState.NORMAL;
        }
        if ((stateManager = this.firstPersonStateManagers.get(player)) == null) {
            stateManager = new MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>(currentState, this.weaponTransitionProvider);
            this.firstPersonStateManagers.put(player, stateManager);
        } else {
            stateManager.setState(currentState, true, currentState == RenderableState.ATTACKING);
        }
        return new CompatibleMeleeRenderer.StateDescriptor(playerMeleeInstance, stateManager, rate, amplitude);
    }

    private AsyncMeleeState getNextNonExpiredState(PlayerMeleeInstance playerWeaponState) {
        AsyncMeleeState asyncWeaponState = null;
        while ((asyncWeaponState = playerWeaponState.nextHistoryState()) != null && System.currentTimeMillis() > asyncWeaponState.getTimestamp() + asyncWeaponState.getDuration()) {
        }
        return asyncWeaponState;
    }

    private Consumer<RenderContext<RenderableState>> createWeaponPartPositionFunction(Transition<RenderContext<RenderableState>> t) {
        if (t == null) {
            return context -> {};
        }
        Consumer<RenderContext<RenderableState>> weaponPositionFunction = t.getItemPositioning();
        if (weaponPositionFunction != null) {
            return context -> weaponPositionFunction.accept((RenderContext<RenderableState>)context);
        }
        return context -> {};
    }

    private Consumer<RenderContext<RenderableState>> createWeaponPartPositionFunction(Consumer<RenderContext<RenderableState>> weaponPositionFunction) {
        if (weaponPositionFunction != null) {
            return context -> weaponPositionFunction.accept((RenderContext<RenderableState>)context);
        }
        return context -> {};
    }

    private List<MultipartTransition<Part, RenderContext<RenderableState>>> getComplexTransition(List<Transition<RenderContext<RenderableState>>> wt, List<Transition<RenderContext<RenderableState>>> lht, List<Transition<RenderContext<RenderableState>>> rht, LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> custom) {
        ArrayList<MultipartTransition<Part, RenderContext<RenderableState>>> result = new ArrayList<MultipartTransition<Part, RenderContext<RenderableState>>>();
        for (int i = 0; i < wt.size(); ++i) {
            DebugPositioner.TransitionConfiguration transitionConfiguration;
            Transition<RenderContext<RenderableState>> p = wt.get(i);
            Transition<RenderContext<RenderableState>> l = lht.get(i);
            Transition<RenderContext<RenderableState>> r = rht.get(i);
            long pause = p.getPause();
            if (DebugPositioner.isDebugModeEnabled() && (transitionConfiguration = DebugPositioner.getTransitionConfiguration(i, false)) != null) {
                pause = transitionConfiguration.getPause();
            }
            MultipartTransition<Part, RenderContext<RenderableState>> t = new MultipartTransition<Part, RenderContext<RenderableState>>(p.getDuration(), pause).withPartPositionFunction(Part.MAIN_ITEM, this.createWeaponPartPositionFunction(p)).withPartPositionFunction(Part.LEFT_HAND, this.createWeaponPartPositionFunction(l)).withPartPositionFunction(Part.RIGHT_HAND, this.createWeaponPartPositionFunction(r));
            for (Map.Entry<Part, List<Transition<RenderContext<RenderableState>>>> e : custom.entrySet()) {
                List<Transition<RenderContext<RenderableState>>> partTransitions = e.getValue();
                Transition<RenderContext<RenderableState>> partTransition = null;
                if (partTransitions != null && partTransitions.size() > i) {
                    partTransition = partTransitions.get(i);
                } else {
                    logger.warn("Transition not defined for part {}", custom);
                }
                t.withPartPositionFunction(e.getKey(), this.createWeaponPartPositionFunction(partTransition));
            }
            result.add(t);
        }
        return result;
    }

    private List<MultipartTransition<Part, RenderContext<RenderableState>>> getSimpleTransition(Consumer<RenderContext<RenderableState>> w, Consumer<RenderContext<RenderableState>> lh, Consumer<RenderContext<RenderableState>> rh, LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> custom, int duration) {
        MultipartTransition<Part, RenderContext<RenderableState>> mt = new MultipartTransition<Part, RenderContext<RenderableState>>(duration, 0L).withPartPositionFunction(Part.MAIN_ITEM, this.createWeaponPartPositionFunction(w)).withPartPositionFunction(Part.LEFT_HAND, this.createWeaponPartPositionFunction(lh)).withPartPositionFunction(Part.RIGHT_HAND, this.createWeaponPartPositionFunction(rh));
        custom.forEach((part, position) -> mt.withPartPositionFunction((Part)part, this.createWeaponPartPositionFunction((Consumer<RenderContext<RenderableState>>)position)));
        return Collections.singletonList(mt);
    }

    @Override
    public void renderItem(ItemStack weaponItemStack, RenderContext<RenderableState> renderContext, MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner) {
        List<CompatibleAttachment<? extends AttachmentContainer>> attachments = null;
        if (this.builder.getModel() instanceof ModelWithAttachments) {
            attachments = ((ItemMelee)weaponItemStack.func_77973_b()).getActiveAttachments(renderContext.getPlayer(), weaponItemStack);
        }
        if (this.builder.getTextureName() != null) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation(this.builder.getModId() + ":textures/models/" + this.builder.getTextureName()));
        } else {
            int textureIndex;
            PlayerItemInstance<?> itemInstance;
            String textureName = null;
            CompatibleAttachment compatibleSkin = attachments.stream().filter(ca -> ca.getAttachment() instanceof MeleeSkin).findAny().orElse(null);
            if (compatibleSkin != null && (itemInstance = this.getClientModContext().getPlayerItemInstanceRegistry().getItemInstance(renderContext.getPlayer(), weaponItemStack)) instanceof PlayerMeleeInstance && (textureIndex = ((PlayerMeleeInstance)itemInstance).getActiveTextureIndex()) >= 0) {
                textureName = ((MeleeSkin)compatibleSkin.getAttachment()).getTextureVariant(textureIndex) + ".png";
            }
            if (textureName == null) {
                ItemMelee weapon = (ItemMelee)weaponItemStack.func_77973_b();
                textureName = weapon.getTextureName();
            }
            Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation(this.builder.getModId() + ":textures/models/" + textureName));
        }
        this.builder.getModel().func_78088_a(null, renderContext.getLimbSwing(), renderContext.getFlimbSwingAmount(), renderContext.getAgeInTicks(), renderContext.getNetHeadYaw(), renderContext.getHeadPitch(), renderContext.getScale());
        if (attachments != null) {
            this.renderAttachments(positioner, renderContext, attachments);
        }
    }

    public void renderAttachments(MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, RenderContext<RenderableState> renderContext, List<CompatibleAttachment<? extends AttachmentContainer>> attachments) {
        for (CompatibleAttachment<? extends AttachmentContainer> compatibleAttachment : attachments) {
            if (compatibleAttachment == null || compatibleAttachment.getAttachment() instanceof ItemSkin) continue;
            this.renderCompatibleAttachment(compatibleAttachment, positioner, renderContext);
        }
    }

    private void renderCompatibleAttachment(CompatibleAttachment<?> compatibleAttachment, MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, RenderContext<RenderableState> renderContext) {
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)8193);
        if (compatibleAttachment.getPositioning() instanceof BiConsumer) {
            ((BiConsumer)compatibleAttachment.getPositioning()).accept(renderContext.getPlayer(), renderContext.getWeapon());
        } else if (compatibleAttachment.getPositioning() instanceof Consumer) {
            ((Consumer)compatibleAttachment.getPositioning()).accept(renderContext);
        }
        ItemAttachment<?> itemAttachment = compatibleAttachment.getAttachment();
        if (positioner != null) {
            if (itemAttachment instanceof Part) {
                positioner.position((Part)((Object)itemAttachment), renderContext);
            } else if (itemAttachment.getRenderablePart() != null) {
                positioner.position(itemAttachment.getRenderablePart(), renderContext);
            }
        }
        for (Tuple<ModelBase, String> texturedModel : compatibleAttachment.getAttachment().getTexturedModels()) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation(this.builder.getModId() + ":textures/models/" + texturedModel.getV()));
            GL11.glPushMatrix();
            GL11.glPushAttrib((int)8193);
            if (compatibleAttachment.getModelPositioning() != null) {
                compatibleAttachment.getModelPositioning().accept(texturedModel.getU());
            }
            texturedModel.getU().func_78088_a((Entity)renderContext.getPlayer(), renderContext.getLimbSwing(), renderContext.getFlimbSwingAmount(), renderContext.getAgeInTicks(), renderContext.getNetHeadYaw(), renderContext.getHeadPitch(), renderContext.getScale());
            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }
        CustomRenderer<?> postRenderer = compatibleAttachment.getAttachment().getPostRenderer();
        if (postRenderer != null) {
            GL11.glPushMatrix();
            GL11.glPushAttrib((int)8193);
            postRenderer.render(renderContext);
            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }
        for (CompatibleAttachment<?> childAttachment : itemAttachment.getAttachments()) {
            this.renderCompatibleAttachment(childAttachment, positioner, renderContext);
        }
        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    public boolean hasRecoilPositioning() {
        return this.builder.hasRecoilPositioningDefined;
    }

    @Override
    protected BiConsumer<Part, RenderContext<RenderableState>> getPartDebugPositioning() {
        return this.builder.partDebugPositioning;
    }

    private class WeaponPositionProvider
    implements MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> {
        private WeaponPositionProvider() {
        }

        @Override
        public List<MultipartTransition<Part, RenderContext<RenderableState>>> getTransitions(RenderableState state) {
            switch (state) {
                case MODIFYING: {
                    return MeleeRenderer.this.getSimpleTransition(MeleeRenderer.this.builder.firstPersonPositioningModifying, MeleeRenderer.this.builder.firstPersonLeftHandPositioningModifying, MeleeRenderer.this.builder.firstPersonRightHandPositioningModifying, MeleeRenderer.this.builder.firstPersonCustomPositioning, ((MeleeRenderer)MeleeRenderer.this).builder.animationDuration);
                }
                case RUNNING: {
                    return MeleeRenderer.this.getSimpleTransition(MeleeRenderer.this.builder.firstPersonPositioningRunning, MeleeRenderer.this.builder.firstPersonLeftHandPositioningRunning, MeleeRenderer.this.builder.firstPersonRightHandPositioningRunning, MeleeRenderer.this.builder.firstPersonCustomPositioning, ((MeleeRenderer)MeleeRenderer.this).builder.animationDuration);
                }
                case ATTACKING: {
                    return MeleeRenderer.this.getComplexTransition(MeleeRenderer.this.builder.firstPersonPositioningAttacking, MeleeRenderer.this.builder.firstPersonLeftHandPositioningAttacking, MeleeRenderer.this.builder.firstPersonRightHandPositioningAttacking, MeleeRenderer.this.builder.firstPersonCustomPositioningAttacking);
                }
                case HEAVY_ATTACKING: {
                    return MeleeRenderer.this.getComplexTransition(MeleeRenderer.this.builder.firstPersonPositioningHeavyAttacking, MeleeRenderer.this.builder.firstPersonLeftHandPositioningHeavyAttacking, MeleeRenderer.this.builder.firstPersonRightHandPositioningHeavyAttacking, MeleeRenderer.this.builder.firstPersonCustomPositioningHeavyAttacking);
                }
                case NORMAL: {
                    return MeleeRenderer.this.getSimpleTransition(MeleeRenderer.this.builder.firstPersonPositioning, MeleeRenderer.this.builder.firstPersonLeftHandPositioning, MeleeRenderer.this.builder.firstPersonRightHandPositioning, MeleeRenderer.this.builder.firstPersonCustomPositioning, ((MeleeRenderer)MeleeRenderer.this).builder.animationDuration);
                }
            }
            return null;
        }
    }

    public static class Builder {
        private ModelBase model;
        private String textureName;
        private BiConsumer<Part, RenderContext<RenderableState>> partDebugPositioning;
        private Consumer<ItemStack> entityPositioning;
        private Consumer<ItemStack> inventoryPositioning;
        private Consumer<RenderContext<RenderableState>> thirdPersonPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningRunning;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningModifying;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningRunning;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningModifying;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningRunning;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningModifying;
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningAttacking;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningAttacking;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningAttacking;
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningHeavyAttacking;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningHeavyAttacking;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningHeavyAttacking;
        private long totalAttackingDuration;
        private long totalHeavyAttackingDuration;
        private String modId;
        private float normalRandomizingRate = 0.33f;
        private float normalRandomizingAmplitude = 0.06f;
        private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioning = new LinkedHashMap();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningAttacking = new LinkedHashMap();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningHeavyAttacking = new LinkedHashMap();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningEjectSpentRound = new LinkedHashMap();
        private boolean hasRecoilPositioningDefined;
        public int animationDuration = 70;

        public Builder withModId(String modId) {
            this.modId = modId;
            return this;
        }

        public Builder withModel(ModelBase model) {
            this.model = model;
            return this;
        }

        public Builder withAnimationDuration(int animationDuration) {
            this.animationDuration = animationDuration;
            return this;
        }

        public Builder withNormalRandomizingRate(float normalRandomizingRate) {
            this.normalRandomizingRate = normalRandomizingRate;
            return this;
        }

        public Builder withTextureName(String textureName) {
            this.textureName = textureName + ".png";
            return this;
        }

        public Builder withEntityPositioning(Consumer<ItemStack> entityPositioning) {
            this.entityPositioning = entityPositioning;
            return this;
        }

        public Builder withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
            this.inventoryPositioning = inventoryPositioning;
            return this;
        }

        public Builder withPartDebugPositioning(BiConsumer<Part, RenderContext<RenderableState>> partDebugPositioning) {
            this.partDebugPositioning = partDebugPositioning;
            return this;
        }

        public Builder withThirdPersonPositioning(Consumer<RenderContext<RenderableState>> thirdPersonPositioning) {
            this.thirdPersonPositioning = thirdPersonPositioning;
            return this;
        }

        public Builder withFirstPersonPositioning(Consumer<RenderContext<RenderableState>> firstPersonPositioning) {
            this.firstPersonPositioning = firstPersonPositioning;
            return this;
        }

        public Builder withFirstPersonPositioningRunning(Consumer<RenderContext<RenderableState>> firstPersonPositioningRunning) {
            this.firstPersonPositioningRunning = firstPersonPositioningRunning;
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningAttacking(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningAttacking = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningHeavyAttacking(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningHeavyAttacking = Arrays.asList(transitions);
            return this;
        }

        public Builder withFirstPersonPositioningModifying(Consumer<RenderContext<RenderableState>> firstPersonPositioningModifying) {
            this.firstPersonPositioningModifying = firstPersonPositioningModifying;
            return this;
        }

        public Builder withFirstPersonHandPositioning(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioning = leftHand;
            this.firstPersonRightHandPositioning = rightHand;
            return this;
        }

        public Builder withFirstPersonHandPositioningRunning(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningRunning = leftHand;
            this.firstPersonRightHandPositioningRunning = rightHand;
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningAttacking(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningAttacking = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningHeavyAttacking(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningHeavyAttacking = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningHeavyAttacking(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningHeavyAttacking = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningAttacking(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningAttacking = Arrays.asList(transitions);
            return this;
        }

        public Builder withFirstPersonHandPositioningModifying(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningModifying = leftHand;
            this.firstPersonRightHandPositioningModifying = rightHand;
            return this;
        }

        public Builder withFirstPersonCustomPositioning(Part part, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioning.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningAttacking(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningAttacking.put(part, Arrays.asList(transitions));
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningHeavyAttacking(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningHeavyAttacking.put(part, Arrays.asList(transitions));
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningEjectSpentRound(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningEjectSpentRound.put(part, Arrays.asList(transitions));
            return this;
        }

        public MeleeRenderer build() {
            if (!CompatibilityProvider.compatibility.isClientSide()) {
                return null;
            }
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            if (this.inventoryPositioning == null) {
                this.inventoryPositioning = itemStack -> GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.0f);
            }
            if (this.entityPositioning == null) {
                this.entityPositioning = itemStack -> {};
            }
            MeleeRenderer renderer = new MeleeRenderer(this);
            if (this.firstPersonPositioning == null) {
                this.firstPersonPositioning = renderContext -> {};
            }
            if (this.firstPersonPositioningAttacking == null) {
                this.firstPersonPositioningAttacking = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.firstPersonPositioning, this.animationDuration));
            }
            if (this.firstPersonPositioningHeavyAttacking == null) {
                this.firstPersonPositioningHeavyAttacking = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.firstPersonPositioning, this.animationDuration));
            }
            for (Transition<RenderContext<RenderableState>> t2 : this.firstPersonPositioningAttacking) {
                this.totalAttackingDuration += t2.getDuration();
                this.totalAttackingDuration += t2.getPause();
            }
            for (Transition<RenderContext<RenderableState>> t2 : this.firstPersonPositioningHeavyAttacking) {
                this.totalHeavyAttackingDuration += t2.getDuration();
                this.totalHeavyAttackingDuration += t2.getPause();
            }
            if (this.firstPersonPositioningRunning == null) {
                this.firstPersonPositioningRunning = this.firstPersonPositioning;
            }
            if (this.firstPersonPositioningModifying == null) {
                this.firstPersonPositioningModifying = this.firstPersonPositioning;
            }
            if (this.thirdPersonPositioning == null) {
                this.thirdPersonPositioning = context -> {
                    GL11.glTranslatef((float)-0.4f, (float)0.2f, (float)0.4f);
                    GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                };
            }
            if (this.firstPersonLeftHandPositioning == null) {
                this.firstPersonLeftHandPositioning = context -> {};
            }
            if (this.firstPersonLeftHandPositioningAttacking == null) {
                this.firstPersonLeftHandPositioningAttacking = this.firstPersonPositioningAttacking.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonLeftHandPositioningHeavyAttacking == null) {
                this.firstPersonLeftHandPositioningHeavyAttacking = this.firstPersonPositioningHeavyAttacking.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningHeavyAttacking == null) {
                this.firstPersonRightHandPositioningHeavyAttacking = this.firstPersonPositioningHeavyAttacking.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonLeftHandPositioningRunning == null) {
                this.firstPersonLeftHandPositioningRunning = this.firstPersonLeftHandPositioning;
            }
            if (this.firstPersonLeftHandPositioningModifying == null) {
                this.firstPersonLeftHandPositioningModifying = this.firstPersonLeftHandPositioning;
            }
            if (this.firstPersonRightHandPositioning == null) {
                this.firstPersonRightHandPositioning = context -> {};
            }
            if (this.firstPersonRightHandPositioningAttacking == null) {
                this.firstPersonRightHandPositioningAttacking = this.firstPersonPositioningAttacking.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningHeavyAttacking == null) {
                this.firstPersonRightHandPositioningHeavyAttacking = this.firstPersonPositioningHeavyAttacking.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningRunning == null) {
                this.firstPersonRightHandPositioningRunning = this.firstPersonRightHandPositioning;
            }
            if (this.firstPersonRightHandPositioningModifying == null) {
                this.firstPersonRightHandPositioningModifying = this.firstPersonRightHandPositioning;
            }
            this.firstPersonCustomPositioningAttacking.forEach((p, t) -> {
                if (t.size() != this.firstPersonPositioningAttacking.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + this.firstPersonPositioningAttacking.size() + ", actual: " + t.size());
                }
            });
            this.firstPersonCustomPositioningHeavyAttacking.forEach((p, t) -> {
                if (t.size() != this.firstPersonPositioningHeavyAttacking.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + this.firstPersonPositioningAttacking.size() + ", actual: " + t.size());
                }
            });
            return renderer;
        }

        public Consumer<ItemStack> getEntityPositioning() {
            return this.entityPositioning;
        }

        public Consumer<ItemStack> getInventoryPositioning() {
            return this.inventoryPositioning;
        }

        public Consumer<RenderContext<RenderableState>> getThirdPersonPositioning() {
            return this.thirdPersonPositioning;
        }

        public String getTextureName() {
            return this.textureName;
        }

        public ModelBase getModel() {
            return this.model;
        }

        public String getModId() {
            return this.modId;
        }
    }
}


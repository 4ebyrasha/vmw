/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.grenade;

import com.vicmatskiv.weaponlib.AttachmentContainer;
import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.CustomRenderer;
import com.vicmatskiv.weaponlib.DefaultPart;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemSkin;
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
import com.vicmatskiv.weaponlib.compatibility.CompatibleGrenadeRenderer;
import com.vicmatskiv.weaponlib.grenade.AsyncGrenadeState;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import com.vicmatskiv.weaponlib.grenade.PlayerGrenadeInstance;
import com.vicmatskiv.weaponlib.grenade.RenderableState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class GrenadeRenderer
extends CompatibleGrenadeRenderer {
    private static final Logger logger = LogManager.getLogger(GrenadeRenderer.class);
    private static final float DEFAULT_RANDOMIZING_RATE = 0.33f;
    private static final float DEFAULT_NORMAL_RANDOMIZING_AMPLITUDE = 0.06f;
    private static final int DEFAULT_ANIMATION_DURATION = 70;
    private Builder builder;
    private Map<StateManagerKey, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>> firstPersonStateManagers;
    private MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> weaponTransitionProvider;
    protected ClientModContext clientModContext;

    private GrenadeRenderer(Builder builder) {
        super(builder);
        this.builder = builder;
        this.firstPersonStateManagers = new HashMap<StateManagerKey, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>>();
        this.weaponTransitionProvider = new WeaponPositionProvider();
    }

    protected long getTotalTakingSafetyPinOffDuration() {
        return this.builder.totalTakingPinOffDuration;
    }

    protected long getTotalThrowingDuration() {
        return this.builder.totalThrowingDuration;
    }

    @Override
    protected ClientModContext getClientModContext() {
        return this.clientModContext;
    }

    public void setClientModContext(ClientModContext clientModContext) {
        this.clientModContext = clientModContext;
    }

    @Override
    protected CompatibleGrenadeRenderer.StateDescriptor getStateDescriptor(EntityLivingBase player, ItemStack itemStack) {
        StateManagerKey key;
        MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager;
        float amplitude = this.builder.normalRandomizingAmplitude;
        float rate = this.builder.normalRandomizingRate;
        RenderableState currentState = null;
        PlayerItemInstance<?> playerItemInstance = this.clientModContext.getPlayerItemInstanceRegistry().getItemInstance(player, itemStack);
        PlayerGrenadeInstance playerGrenadeInstance = null;
        if (playerItemInstance == null || !(playerItemInstance instanceof PlayerGrenadeInstance) || playerItemInstance.getItem() != itemStack.func_77973_b()) {
            logger.error("Invalid or mismatching item. Player item instance: {}. Item stack: {}", playerItemInstance, (Object)itemStack);
        } else {
            playerGrenadeInstance = (PlayerGrenadeInstance)playerItemInstance;
        }
        if (playerGrenadeInstance != null) {
            AsyncGrenadeState asyncWeaponState = this.getNextNonExpiredState(playerGrenadeInstance);
            switch (asyncWeaponState.getState()) {
                case SAFETY_PING_OFF: {
                    currentState = RenderableState.SAFETY_PIN_OFF;
                    break;
                }
                case STRIKER_LEVER_RELEASED: {
                    currentState = RenderableState.STRIKER_LEVEL_OFF;
                    break;
                }
                case THROWING: {
                    currentState = RenderableState.THROWING;
                    break;
                }
                case THROWN: {
                    currentState = RenderableState.THROWN;
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
        if ((stateManager = this.firstPersonStateManagers.get(key = new StateManagerKey(player, playerGrenadeInstance != null ? playerGrenadeInstance.getItemInventoryIndex() : -1))) == null) {
            stateManager = new MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>(currentState, this.weaponTransitionProvider);
            this.firstPersonStateManagers.put(key, stateManager);
        } else {
            stateManager.setState(currentState, true, currentState == RenderableState.THROWING);
        }
        return new CompatibleGrenadeRenderer.StateDescriptor(playerGrenadeInstance, stateManager, rate, amplitude);
    }

    private AsyncGrenadeState getNextNonExpiredState(PlayerGrenadeInstance playerWeaponState) {
        AsyncGrenadeState asyncWeaponState = null;
        while ((asyncWeaponState = playerWeaponState.nextHistoryState()) != null && System.currentTimeMillis() > asyncWeaponState.getTimestamp() + asyncWeaponState.getDuration()) {
        }
        return asyncWeaponState;
    }

    private Consumer<RenderContext<RenderableState>> createWeaponPartPositionFunction(Transition<RenderContext<RenderableState>> t) {
        if (t == null) {
            return context -> {};
        }
        Consumer<RenderContext<RenderableState>> weaponPositionFunction = t.getItemPositioning();
        if (weaponPositionFunction == Transition.anchoredPosition()) {
            return MultipartTransition.anchoredPosition();
        }
        if (weaponPositionFunction != null) {
            return context -> weaponPositionFunction.accept((RenderContext<RenderableState>)context);
        }
        return context -> {};
    }

    private Consumer<RenderContext<RenderableState>> createWeaponPartPositionFunction(Consumer<RenderContext<RenderableState>> weaponPositionFunction) {
        if (weaponPositionFunction == Transition.anchoredPosition()) {
            return MultipartTransition.anchoredPosition();
        }
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
            MultipartTransition<Part, RenderContext<RenderableState>> t = new MultipartTransition<Part, RenderContext<RenderableState>>(p.getDuration(), pause).withPartPositionFunction(Part.MAIN_ITEM, p.getAttachedTo(), this.createWeaponPartPositionFunction(p)).withPartPositionFunction(Part.LEFT_HAND, l.getAttachedTo(), this.createWeaponPartPositionFunction(l)).withPartPositionFunction(Part.RIGHT_HAND, r.getAttachedTo(), this.createWeaponPartPositionFunction(r));
            for (Map.Entry<Part, List<Transition<RenderContext<RenderableState>>>> e : custom.entrySet()) {
                List<Transition<RenderContext<RenderableState>>> partTransitions = e.getValue();
                Transition<RenderContext<RenderableState>> partTransition = null;
                if (partTransitions != null && partTransitions.size() > i) {
                    partTransition = partTransitions.get(i);
                } else {
                    logger.warn("Transition not defined for part {}", custom);
                }
                t.withPartPositionFunction(e.getKey(), partTransition.getAttachedTo(), this.createWeaponPartPositionFunction(partTransition));
            }
            result.add(t);
        }
        return result;
    }

    private List<MultipartTransition<Part, RenderContext<RenderableState>>> getSimpleTransition(Consumer<RenderContext<RenderableState>> w, Consumer<RenderContext<RenderableState>> lh, Consumer<RenderContext<RenderableState>> rh, LinkedHashMap<Part, SimplePositioning> custom, int duration) {
        DebugPositioner.TransitionConfiguration transitionConfiguration;
        long pause = 0L;
        if (DebugPositioner.isDebugModeEnabled() && (transitionConfiguration = DebugPositioner.getTransitionConfiguration(0, false)) != null) {
            pause = transitionConfiguration.getPause();
        }
        MultipartTransition<Object, RenderContext<RenderableState>> mt = new MultipartTransition<Part, RenderContext<RenderableState>>(duration, pause).withPartPositionFunction(Part.MAIN_ITEM, null, this.createWeaponPartPositionFunction(w)).withPartPositionFunction(Part.LEFT_HAND, null, this.createWeaponPartPositionFunction(lh)).withPartPositionFunction(Part.RIGHT_HAND, null, this.createWeaponPartPositionFunction(rh));
        custom.forEach((part, position) -> mt.withPartPositionFunction(part, position.attachedTo, this.createWeaponPartPositionFunction(position.positioning)));
        return Collections.singletonList(mt);
    }

    @Override
    public void renderItem(ItemStack weaponItemStack, RenderContext<RenderableState> renderContext, MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner) {
        if (this.builder.getTextureName() != null) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation(this.builder.getModId() + ":textures/models/" + this.builder.getTextureName()));
        } else {
            String textureName = null;
            if (textureName == null) {
                ItemGrenade weapon = (ItemGrenade)weaponItemStack.func_77973_b();
                textureName = weapon.getTextureName();
            }
            Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation(this.builder.getModId() + ":textures/models/" + textureName));
        }
        this.builder.getModel().func_78088_a(null, renderContext.getLimbSwing(), renderContext.getFlimbSwingAmount(), renderContext.getAgeInTicks(), renderContext.getNetHeadYaw(), renderContext.getHeadPitch(), renderContext.getScale());
        PlayerItemInstance<?> itemInstance = renderContext.getPlayerItemInstance();
        if (!(itemInstance instanceof PlayerGrenadeInstance)) {
            return;
        }
        PlayerGrenadeInstance grenadeInstance = (PlayerGrenadeInstance)itemInstance;
        List<CompatibleAttachment<? extends AttachmentContainer>> attachments = grenadeInstance.getActiveAttachments(renderContext, true);
        this.renderAttachments(positioner, renderContext, attachments);
    }

    @Override
    public void renderAttachments(MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, RenderContext<RenderableState> renderContext, List<CompatibleAttachment<? extends AttachmentContainer>> attachments) {
        for (CompatibleAttachment<? extends AttachmentContainer> compatibleAttachment : attachments) {
            if (compatibleAttachment == null || compatibleAttachment.getAttachment() instanceof ItemSkin) continue;
            this.renderCompatibleAttachment(compatibleAttachment, positioner, renderContext);
        }
    }

    private void renderCompatibleAttachment(CompatibleAttachment<?> compatibleAttachment, MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, RenderContext<RenderableState> renderContext) {
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)8193);
        if (compatibleAttachment.getPositioning() != null) {
            // empty if block
        }
        ItemAttachment<?> itemAttachment = compatibleAttachment.getAttachment();
        if (positioner != null) {
            if (itemAttachment instanceof Part) {
                positioner.position((Part)((Object)itemAttachment), renderContext);
                if (DebugPositioner.isDebugModeEnabled()) {
                    DebugPositioner.position((Part)((Object)itemAttachment), renderContext);
                }
            } else if (itemAttachment.getRenderablePart() != null) {
                positioner.position(itemAttachment.getRenderablePart(), renderContext);
                if (DebugPositioner.isDebugModeEnabled()) {
                    DebugPositioner.position(itemAttachment.getRenderablePart(), renderContext);
                }
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

    public String getTextureName() {
        return this.builder.getTextureName();
    }

    public ModelBase getModel() {
        return this.builder.getModel();
    }

    public Supplier<Float> getXRotationCenterOffset() {
        return this.builder.xCenterOffset;
    }

    public Supplier<Float> getYRotationCenterOffset() {
        return this.builder.yCenterOffset;
    }

    public Supplier<Float> getZRotationCenterOffset() {
        return this.builder.zCenterOffset;
    }

    public Runnable getThrownEntityPositioning() {
        return this.builder.thrownEntityPositioning;
    }

    private class WeaponPositionProvider
    implements MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> {
        private WeaponPositionProvider() {
        }

        @Override
        public List<MultipartTransition<Part, RenderContext<RenderableState>>> getTransitions(RenderableState state) {
            switch (state) {
                case SAFETY_PIN_OFF: {
                    return GrenadeRenderer.this.getComplexTransition(GrenadeRenderer.this.builder.firstPersonPositioningSafetyPinOff, GrenadeRenderer.this.builder.firstPersonLeftHandPositioningSafetyPinOff, GrenadeRenderer.this.builder.firstPersonRightHandPositioningSafetyPinOff, GrenadeRenderer.this.builder.firstPersonCustomPositioningSafetyPinOff);
                }
                case STRIKER_LEVEL_OFF: {
                    return GrenadeRenderer.this.getSimpleTransition(GrenadeRenderer.this.builder.firstPersonPositioningStrikerLeverOff, GrenadeRenderer.this.builder.firstPersonLeftHandPositioningStrikerLeverOff, GrenadeRenderer.this.builder.firstPersonRightHandPositioningStrikerLeverOff, GrenadeRenderer.this.builder.firstPersonCustomPositioningStrikerLeverOff, ((GrenadeRenderer)GrenadeRenderer.this).builder.animationDuration);
                }
                case THROWING: {
                    return GrenadeRenderer.this.getComplexTransition(GrenadeRenderer.this.builder.firstPersonPositioningThrowing, GrenadeRenderer.this.builder.firstPersonLeftHandPositioningThrowing, GrenadeRenderer.this.builder.firstPersonRightHandPositioningThrowing, GrenadeRenderer.this.builder.firstPersonCustomPositioningThrowing);
                }
                case THROWN: {
                    return GrenadeRenderer.this.getSimpleTransition(GrenadeRenderer.this.builder.firstPersonPositioningThrown, GrenadeRenderer.this.builder.firstPersonLeftHandPositioningThrown, GrenadeRenderer.this.builder.firstPersonRightHandPositioningThrown, GrenadeRenderer.this.builder.firstPersonCustomPositioningThrown, ((GrenadeRenderer)GrenadeRenderer.this).builder.animationDuration);
                }
                case NORMAL: 
                case RUNNING: {
                    return GrenadeRenderer.this.getSimpleTransition(GrenadeRenderer.this.builder.firstPersonPositioning, GrenadeRenderer.this.builder.firstPersonLeftHandPositioning, GrenadeRenderer.this.builder.firstPersonRightHandPositioning, GrenadeRenderer.this.builder.firstPersonCustomPositioning, ((GrenadeRenderer)GrenadeRenderer.this).builder.animationDuration);
                }
            }
            return null;
        }
    }

    private static class StateManagerKey {
        EntityLivingBase player;
        int slot = -1;

        public StateManagerKey(EntityLivingBase player, int slot) {
            this.player = player;
            this.slot = slot;
        }

        public int hashCode() {
            int prime = 31;
            int result = 1;
            result = 31 * result + (this.player == null ? 0 : this.player.hashCode());
            result = 31 * result + this.slot;
            return result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            StateManagerKey other = (StateManagerKey)obj;
            if (this.player == null ? other.player != null : !this.player.equals((Object)other.player)) {
                return false;
            }
            return this.slot == other.slot;
        }
    }

    public static class Builder {
        private ModelBase model;
        private String textureName;
        private Consumer<ItemStack> entityPositioning;
        private Runnable thrownEntityPositioning = () -> {};
        private Consumer<ItemStack> inventoryPositioning;
        private Consumer<RenderContext<RenderableState>> thirdPersonPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;
        private LinkedHashMap<Part, SimplePositioning> firstPersonCustomPositioning = new LinkedHashMap();
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningRunning;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningRunning;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningRunning;
        private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningRunning = new LinkedHashMap();
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningSafetyPinOff;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningSafetyPinOff;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningSafetyPinOff;
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningSafetyPinOff = new LinkedHashMap();
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningStrikerLeverOff;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningStrikerLeverOff;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningStrikerLeverOff;
        private LinkedHashMap<Part, SimplePositioning> firstPersonCustomPositioningStrikerLeverOff = new LinkedHashMap();
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningThrowing;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningThrowing;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningThrowing;
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningThrowing = new LinkedHashMap();
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningThrown;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningThrown;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningThrown;
        private LinkedHashMap<Part, SimplePositioning> firstPersonCustomPositioningThrown = new LinkedHashMap();
        private long totalTakingPinOffDuration;
        private long totalThrowingDuration;
        private String modId;
        private float normalRandomizingRate = 0.33f;
        private float normalRandomizingAmplitude = 0.06f;
        public int animationDuration = 70;
        private Supplier<Float> xCenterOffset = () -> Float.valueOf(0.0f);
        private Supplier<Float> yCenterOffset = () -> Float.valueOf(0.0f);
        private Supplier<Float> zCenterOffset = () -> Float.valueOf(0.0f);

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

        public Builder withThrownEntityPositioning(Runnable throwEntityPositioning) {
            this.thrownEntityPositioning = throwEntityPositioning;
            return this;
        }

        public Builder withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
            this.inventoryPositioning = inventoryPositioning;
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

        public Builder withFirstPersonHandPositioning(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioning = leftHand;
            this.firstPersonRightHandPositioning = rightHand;
            return this;
        }

        public Builder withFirstPersonCustomPositioning(Part part, Part attachedTo, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioning.put(part, new SimplePositioning(attachedTo, positioning)) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        public Builder withFirstPersonPositioningRunning(Consumer<RenderContext<RenderableState>> firstPersonPositioningRunning) {
            this.firstPersonPositioningRunning = firstPersonPositioningRunning;
            return this;
        }

        public Builder withFirstPersonHandPositioningRunning(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningRunning = leftHand;
            this.firstPersonRightHandPositioningRunning = rightHand;
            return this;
        }

        public Builder withFirstPersonCustomPositioningRunning(Part part, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningRunning.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        public Builder withFirstPersonPositioningThrown(Consumer<RenderContext<RenderableState>> firstPersonPositioningThrown) {
            this.firstPersonPositioningThrown = firstPersonPositioningThrown;
            return this;
        }

        public Builder withFirstPersonHandPositioningThrown(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningThrown = leftHand;
            this.firstPersonRightHandPositioningThrown = rightHand;
            return this;
        }

        public Builder withFirstPersonCustomPositioningThrown(Part part, Part attachedTo, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningThrown.put(part, new SimplePositioning(attachedTo, positioning)) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningSafetyPinOff(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningSafetyPinOff = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningThrowing(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningThrowing = Arrays.asList(transitions);
            return this;
        }

        public Builder withFirstPersonPositioningStrikerLeverOff(Consumer<RenderContext<RenderableState>> firstPersonPositioningStrikerLeverOff) {
            this.firstPersonPositioningStrikerLeverOff = firstPersonPositioningStrikerLeverOff;
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningSafetyPinOff(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningSafetyPinOff = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningThrowing(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningThrowing = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningThrowing(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningThrowing = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningSafetyPinOff(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningSafetyPinOff = Arrays.asList(transitions);
            return this;
        }

        public Builder withFirstPersonHandPositioningStrikerLevelOff(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningStrikerLeverOff = leftHand;
            this.firstPersonRightHandPositioningStrikerLeverOff = rightHand;
            return this;
        }

        public Builder withFirstPersonCustomPositioningStrikerLeverOff(Part part, Part attachedTo, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningStrikerLeverOff.put(part, new SimplePositioning(attachedTo, positioning)) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningSafetyPinOff(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningSafetyPinOff.put(part, Arrays.asList(transitions));
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningThrowing(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningThrowing.put(part, Arrays.asList(transitions));
            return this;
        }

        public Builder withEntityRotationCenterOffsets(Supplier<Float> xCenterOffset, Supplier<Float> yCenterOffset, Supplier<Float> zCenterOffset) {
            this.xCenterOffset = xCenterOffset;
            this.yCenterOffset = yCenterOffset;
            this.zCenterOffset = zCenterOffset;
            return this;
        }

        public GrenadeRenderer build() {
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
            GrenadeRenderer renderer = new GrenadeRenderer(this);
            if (this.firstPersonPositioning == null) {
                this.firstPersonPositioning = renderContext -> {};
            }
            if (this.firstPersonPositioningSafetyPinOff == null) {
                this.firstPersonPositioningSafetyPinOff = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.firstPersonPositioning, this.animationDuration));
            }
            if (this.firstPersonPositioningThrowing == null) {
                this.firstPersonPositioningThrowing = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.firstPersonPositioning, this.animationDuration));
            }
            for (Transition<RenderContext<RenderableState>> t2 : this.firstPersonPositioningSafetyPinOff) {
                this.totalTakingPinOffDuration += t2.getDuration();
                this.totalTakingPinOffDuration += t2.getPause();
            }
            for (Transition<RenderContext<RenderableState>> t2 : this.firstPersonPositioningThrowing) {
                this.totalThrowingDuration += t2.getDuration();
                this.totalThrowingDuration += t2.getPause();
            }
            if (this.firstPersonPositioningRunning == null) {
                this.firstPersonPositioningRunning = this.firstPersonPositioning;
            }
            if (this.firstPersonPositioningStrikerLeverOff == null) {
                if (this.firstPersonPositioningSafetyPinOff != null && !this.firstPersonPositioningSafetyPinOff.isEmpty()) {
                    this.firstPersonPositioningStrikerLeverOff = this.firstPersonPositioningSafetyPinOff.get(this.firstPersonPositioningSafetyPinOff.size() - 1).getItemPositioning();
                }
                if (this.firstPersonPositioningStrikerLeverOff == null) {
                    this.firstPersonPositioningStrikerLeverOff = this.firstPersonPositioning;
                }
            }
            if (this.firstPersonPositioningThrown == null) {
                if (this.firstPersonPositioningThrowing != null && !this.firstPersonPositioningThrowing.isEmpty()) {
                    this.firstPersonPositioningThrown = this.firstPersonPositioningThrowing.get(this.firstPersonPositioningThrowing.size() - 1).getItemPositioning();
                }
                if (this.firstPersonPositioningThrown == null) {
                    this.firstPersonPositioningThrown = this.firstPersonPositioning;
                }
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
            if (this.firstPersonLeftHandPositioningSafetyPinOff == null) {
                this.firstPersonLeftHandPositioningSafetyPinOff = this.firstPersonPositioningSafetyPinOff.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonLeftHandPositioningThrowing == null) {
                this.firstPersonLeftHandPositioningThrowing = this.firstPersonPositioningThrowing.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningThrowing == null) {
                this.firstPersonRightHandPositioningThrowing = this.firstPersonPositioningThrowing.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonLeftHandPositioningRunning == null) {
                this.firstPersonLeftHandPositioningRunning = this.firstPersonLeftHandPositioning;
            }
            if (this.firstPersonLeftHandPositioningStrikerLeverOff == null) {
                if (this.firstPersonLeftHandPositioningSafetyPinOff != null && !this.firstPersonLeftHandPositioningSafetyPinOff.isEmpty()) {
                    this.firstPersonLeftHandPositioningStrikerLeverOff = this.firstPersonLeftHandPositioningSafetyPinOff.get(this.firstPersonLeftHandPositioningSafetyPinOff.size() - 1).getItemPositioning();
                }
                if (this.firstPersonLeftHandPositioningStrikerLeverOff == null) {
                    this.firstPersonLeftHandPositioningStrikerLeverOff = this.firstPersonLeftHandPositioning;
                }
            }
            if (this.firstPersonLeftHandPositioningThrown == null) {
                if (this.firstPersonLeftHandPositioningThrowing != null && !this.firstPersonLeftHandPositioningThrowing.isEmpty()) {
                    this.firstPersonLeftHandPositioningThrown = this.firstPersonLeftHandPositioningThrowing.get(this.firstPersonLeftHandPositioningThrowing.size() - 1).getItemPositioning();
                }
                if (this.firstPersonLeftHandPositioningThrown == null) {
                    this.firstPersonLeftHandPositioningThrown = this.firstPersonLeftHandPositioning;
                }
            }
            if (this.firstPersonRightHandPositioning == null) {
                this.firstPersonRightHandPositioning = context -> {};
            }
            if (this.firstPersonRightHandPositioningSafetyPinOff == null) {
                this.firstPersonRightHandPositioningSafetyPinOff = this.firstPersonPositioningSafetyPinOff.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningThrowing == null) {
                this.firstPersonRightHandPositioningThrowing = this.firstPersonPositioningThrowing.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningRunning == null) {
                this.firstPersonRightHandPositioningRunning = this.firstPersonRightHandPositioning;
            }
            if (this.firstPersonRightHandPositioningStrikerLeverOff == null) {
                if (this.firstPersonRightHandPositioningSafetyPinOff != null && !this.firstPersonRightHandPositioningSafetyPinOff.isEmpty()) {
                    this.firstPersonRightHandPositioningStrikerLeverOff = this.firstPersonRightHandPositioningSafetyPinOff.get(this.firstPersonRightHandPositioningSafetyPinOff.size() - 1).getItemPositioning();
                }
                if (this.firstPersonRightHandPositioningStrikerLeverOff == null) {
                    this.firstPersonRightHandPositioningStrikerLeverOff = this.firstPersonRightHandPositioning;
                }
            }
            if (this.firstPersonRightHandPositioningThrown == null) {
                if (this.firstPersonRightHandPositioningThrowing != null && !this.firstPersonRightHandPositioningThrowing.isEmpty()) {
                    this.firstPersonRightHandPositioningThrown = this.firstPersonRightHandPositioningThrowing.get(this.firstPersonRightHandPositioningThrowing.size() - 1).getItemPositioning();
                }
                if (this.firstPersonRightHandPositioningThrown == null) {
                    this.firstPersonRightHandPositioningThrown = this.firstPersonRightHandPositioning;
                }
            }
            this.firstPersonCustomPositioningSafetyPinOff.forEach((p, t) -> {
                if (t.size() != this.firstPersonPositioningSafetyPinOff.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + this.firstPersonPositioningSafetyPinOff.size() + ", actual: " + t.size());
                }
            });
            this.firstPersonCustomPositioningThrowing.forEach((p, t) -> {
                if (t.size() != this.firstPersonPositioningThrowing.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + this.firstPersonPositioningThrowing.size() + ", actual: " + t.size());
                }
            });
            if (!this.firstPersonCustomPositioning.isEmpty() && this.firstPersonCustomPositioningStrikerLeverOff.isEmpty()) {
                this.firstPersonCustomPositioning.forEach((part, pos) -> this.firstPersonCustomPositioningStrikerLeverOff.put((Part)part, new SimplePositioning(null, pos.positioning)));
            }
            if (!this.firstPersonCustomPositioning.isEmpty() && this.firstPersonCustomPositioningThrown.isEmpty()) {
                this.firstPersonCustomPositioning.forEach((part, pos) -> this.firstPersonCustomPositioningThrown.put((Part)part, new SimplePositioning(null, pos.positioning)));
            }
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

    private static class SimplePositioning {
        Part attachedTo;
        Consumer<RenderContext<RenderableState>> positioning;

        SimplePositioning(Part attachedTo, Consumer<RenderContext<RenderableState>> positioning) {
            this.attachedTo = attachedTo;
            this.positioning = positioning;
        }
    }
}


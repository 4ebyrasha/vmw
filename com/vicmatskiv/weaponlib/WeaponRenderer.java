/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.ActiveRenderInfo
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.Vec3d
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AsyncWeaponState;
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
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Tuple;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponState;
import com.vicmatskiv.weaponlib.animation.DebugPositioner;
import com.vicmatskiv.weaponlib.animation.MultipartPositioning;
import com.vicmatskiv.weaponlib.animation.MultipartRenderStateManager;
import com.vicmatskiv.weaponlib.animation.MultipartTransition;
import com.vicmatskiv.weaponlib.animation.MultipartTransitionProvider;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWeaponRenderer;
import com.vicmatskiv.weaponlib.compatibility.Interceptors;
import com.vicmatskiv.weaponlib.config.Projectiles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class WeaponRenderer
extends CompatibleWeaponRenderer {
    private static final Logger logger = LogManager.getLogger(WeaponRenderer.class);
    private static final float DEFAULT_RANDOMIZING_RATE = 0.33f;
    private static final float DEFAULT_RANDOMIZING_FIRING_RATE = 20.0f;
    private static final float DEFAULT_RANDOMIZING_ZOOM_RATE = 0.25f;
    private static final float DEFAULT_NORMAL_RANDOMIZING_AMPLITUDE = 0.06f;
    private static final float DEFAULT_ZOOM_RANDOMIZING_AMPLITUDE = 0.005f;
    private static final float DEFAULT_FIRING_RANDOMIZING_AMPLITUDE = 0.03f;
    private static final int DEFAULT_ANIMATION_DURATION = 250;
    private static final int DEFAULT_RECOIL_ANIMATION_DURATION = 100;
    private static final int DEFAULT_SHOOTING_ANIMATION_DURATION = 100;
    private static final int DEFAULT_ITERATION_COMPLETED_ANIMATION_DURATION = 100;
    private static final int DEFAULT_PREPARE_FIRST_LOAD_ITERATION_ANIMATION_DURATION = 100;
    private static final int DEFAULT_ALL_LOAD_ITERATION_ANIMATIONS_COMPLETED_DURATION = 100;
    private Builder builder;
    private Map<EntityLivingBase, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>> firstPersonStateManagers;
    private Map<EntityLivingBase, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>> thirdPersonStateManagers;
    private MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> firstPersonTransitionProvider;
    private MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> thirdPersonTransitionProvider;
    protected ClientModContext clientModContext;

    private WeaponRenderer(Builder builder) {
        super(builder);
        this.builder = builder;
        this.firstPersonStateManagers = new HashMap<EntityLivingBase, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>>();
        this.thirdPersonStateManagers = new HashMap<EntityLivingBase, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>>();
        this.firstPersonTransitionProvider = new FirstPersonWeaponTransitionProvider();
        this.thirdPersonTransitionProvider = new ThirdPersonWeaponTransitionProvider();
    }

    protected long getTotalReloadingDuration() {
        return this.builder.totalReloadingDuration;
    }

    protected long getTotalUnloadingDuration() {
        return this.builder.totalUnloadingDuration;
    }

    protected long getTotalDrawingDuration() {
        return this.builder.totalDrawingDuration;
    }

    @Override
    protected ClientModContext getClientModContext() {
        return this.clientModContext;
    }

    protected void setClientModContext(ClientModContext clientModContext) {
        this.clientModContext = clientModContext;
    }

    @Override
    protected CompatibleWeaponRenderer.StateDescriptor getFirstPersonStateDescriptor(EntityLivingBase player, ItemStack itemStack) {
        MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager;
        float amplitude = this.builder.normalRandomizingAmplitude;
        float rate = this.builder.normalRandomizingRate;
        RenderableState currentState = null;
        PlayerItemInstance<?> playerItemInstance = this.clientModContext.getPlayerItemInstanceRegistry().getItemInstance(player, itemStack);
        PlayerWeaponInstance playerWeaponInstance = null;
        if (playerItemInstance == null || !(playerItemInstance instanceof PlayerWeaponInstance) || playerItemInstance.getItem() != itemStack.func_77973_b()) {
            logger.error("Invalid or mismatching item. Player item instance: {}. Item stack: {}", playerItemInstance, (Object)itemStack);
        } else {
            playerWeaponInstance = (PlayerWeaponInstance)playerItemInstance;
        }
        if (playerWeaponInstance != null) {
            AsyncWeaponState asyncWeaponState = this.getNextNonExpiredState(playerWeaponInstance);
            switch (asyncWeaponState.getState()) {
                case RECOILED: {
                    if (playerWeaponInstance.isAutomaticModeEnabled() && !this.hasRecoilPositioning()) {
                        if (playerWeaponInstance.isAimed()) {
                            currentState = RenderableState.ZOOMING;
                            rate = this.builder.firingRandomizingRate;
                            amplitude = this.builder.zoomRandomizingAmplitude;
                            break;
                        }
                        currentState = RenderableState.NORMAL;
                        rate = this.builder.firingRandomizingRate;
                        amplitude = this.builder.firingRandomizingAmplitude;
                        break;
                    }
                    if (playerWeaponInstance.isAimed()) {
                        currentState = RenderableState.ZOOMING_RECOILED;
                        amplitude = this.builder.zoomRandomizingAmplitude;
                        break;
                    }
                    currentState = RenderableState.RECOILED;
                    break;
                }
                case PAUSED: {
                    if (playerWeaponInstance.isAutomaticModeEnabled() && !this.hasRecoilPositioning()) {
                        boolean isLongPaused;
                        boolean bl = isLongPaused = (float)(System.currentTimeMillis() - asyncWeaponState.getTimestamp()) > 50.0f / playerWeaponInstance.getFireRate() && asyncWeaponState.isInfinite();
                        if (playerWeaponInstance.isAimed()) {
                            currentState = RenderableState.ZOOMING;
                            if (!isLongPaused) {
                                rate = this.builder.firingRandomizingRate;
                            }
                            amplitude = this.builder.zoomRandomizingAmplitude;
                            break;
                        }
                        currentState = RenderableState.NORMAL;
                        if (isLongPaused) break;
                        rate = this.builder.firingRandomizingRate;
                        amplitude = this.builder.firingRandomizingAmplitude;
                        break;
                    }
                    if (playerWeaponInstance.isAimed()) {
                        currentState = RenderableState.ZOOMING_SHOOTING;
                        amplitude = this.builder.zoomRandomizingAmplitude;
                        break;
                    }
                    currentState = RenderableState.SHOOTING;
                    break;
                }
                case UNLOAD_PREPARING: 
                case UNLOAD_REQUESTED: 
                case UNLOAD: {
                    currentState = RenderableState.UNLOADING;
                    break;
                }
                case LOAD: {
                    currentState = RenderableState.RELOADING;
                    break;
                }
                case LOAD_ITERATION: {
                    currentState = RenderableState.LOAD_ITERATION;
                    break;
                }
                case LOAD_ITERATION_COMPLETED: {
                    currentState = RenderableState.LOAD_ITERATION_COMPLETED;
                    break;
                }
                case ALL_LOAD_ITERATIONS_COMPLETED: {
                    currentState = RenderableState.ALL_LOAD_ITERATIONS_COMPLETED;
                    break;
                }
                case EJECTING: {
                    if (playerWeaponInstance.isAimed()) {
                        currentState = RenderableState.EJECT_SPENT_ROUND_AIMED;
                        break;
                    }
                    currentState = RenderableState.EJECT_SPENT_ROUND;
                    break;
                }
                case MODIFYING: 
                case MODIFYING_REQUESTED: 
                case NEXT_ATTACHMENT: 
                case NEXT_ATTACHMENT_REQUESTED: {
                    if (playerWeaponInstance.isAltMofificationModeEnabled()) {
                        currentState = RenderableState.MODIFYING_ALT;
                        break;
                    }
                    currentState = RenderableState.MODIFYING;
                    break;
                }
                case INSPECTING: {
                    currentState = RenderableState.INSPECTING;
                    break;
                }
                case DRAWING: {
                    currentState = RenderableState.DRAWING;
                    break;
                }
                default: {
                    if (player.func_70051_ag() && this.builder.firstPersonPositioningRunning != null) {
                        currentState = RenderableState.RUNNING;
                        break;
                    }
                    if (!playerWeaponInstance.isAimed()) break;
                    currentState = RenderableState.ZOOMING;
                    rate = this.builder.zoomRandomizingRate;
                    amplitude = this.builder.zoomRandomizingAmplitude;
                }
            }
        }
        if (currentState == null) {
            currentState = RenderableState.NORMAL;
        }
        if (player instanceof EntityPlayer && Interceptors.isProning((EntityPlayer)player)) {
            switch (currentState) {
                case NORMAL: {
                    currentState = RenderableState.PRONING;
                    break;
                }
                case RECOILED: {
                    currentState = RenderableState.PRONING_RECOILED;
                    break;
                }
                case SHOOTING: {
                    currentState = RenderableState.PRONING_SHOOTING;
                    break;
                }
            }
        }
        if ((stateManager = this.firstPersonStateManagers.get(player)) == null) {
            stateManager = new MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>(currentState, this.firstPersonTransitionProvider);
            this.firstPersonStateManagers.put(player, stateManager);
        } else {
            stateManager.setState(currentState, true, currentState == RenderableState.SHOOTING || currentState == RenderableState.PRONING_SHOOTING || currentState == RenderableState.ZOOMING_SHOOTING || currentState == RenderableState.RUNNING || currentState == RenderableState.ZOOMING || currentState == RenderableState.DRAWING);
        }
        return new CompatibleWeaponRenderer.StateDescriptor(playerWeaponInstance, stateManager, rate, amplitude);
    }

    @Override
    protected CompatibleWeaponRenderer.StateDescriptor getThirdPersonStateDescriptor(EntityLivingBase player, ItemStack itemStack) {
        MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager;
        float amplitude = this.builder.normalRandomizingAmplitude;
        float rate = this.builder.normalRandomizingRate;
        RenderableState currentState = null;
        PlayerItemInstance<?> playerItemInstance = this.clientModContext.getPlayerItemInstanceRegistry().getItemInstance(player, itemStack);
        PlayerWeaponInstance playerWeaponInstance = null;
        if (playerItemInstance == null || !(playerItemInstance instanceof PlayerWeaponInstance) || playerItemInstance.getItem() != itemStack.func_77973_b()) {
            logger.error("Invalid or mismatching item. Player item instance: {}. Item stack: {}", playerItemInstance, (Object)itemStack);
        } else {
            playerWeaponInstance = (PlayerWeaponInstance)playerItemInstance;
        }
        if (playerWeaponInstance != null) {
            AsyncWeaponState asyncWeaponState = this.getNextNonExpiredState(playerWeaponInstance);
            switch (asyncWeaponState.getState()) {
                case RECOILED: {
                    if (playerWeaponInstance.isAutomaticModeEnabled() && !this.hasRecoilPositioning()) {
                        if (playerWeaponInstance.isAimed()) {
                            currentState = RenderableState.ZOOMING;
                            rate = this.builder.firingRandomizingRate;
                            amplitude = this.builder.zoomRandomizingAmplitude;
                            break;
                        }
                        currentState = RenderableState.NORMAL;
                        rate = this.builder.firingRandomizingRate;
                        amplitude = this.builder.firingRandomizingAmplitude;
                        break;
                    }
                    if (playerWeaponInstance.isAimed()) {
                        currentState = RenderableState.ZOOMING_RECOILED;
                        amplitude = this.builder.zoomRandomizingAmplitude;
                        break;
                    }
                    currentState = RenderableState.RECOILED;
                    break;
                }
                case PAUSED: {
                    if (playerWeaponInstance.isAutomaticModeEnabled() && !this.hasRecoilPositioning()) {
                        boolean isLongPaused;
                        boolean bl = isLongPaused = (float)(System.currentTimeMillis() - asyncWeaponState.getTimestamp()) > 50.0f / playerWeaponInstance.getFireRate() && asyncWeaponState.isInfinite();
                        if (playerWeaponInstance.isAimed()) {
                            currentState = RenderableState.ZOOMING;
                            if (!isLongPaused) {
                                rate = this.builder.firingRandomizingRate;
                            }
                            amplitude = this.builder.zoomRandomizingAmplitude;
                            break;
                        }
                        currentState = RenderableState.NORMAL;
                        if (isLongPaused) break;
                        rate = this.builder.firingRandomizingRate;
                        amplitude = this.builder.firingRandomizingAmplitude;
                        break;
                    }
                    if (playerWeaponInstance.isAimed()) {
                        currentState = RenderableState.ZOOMING_SHOOTING;
                        amplitude = this.builder.zoomRandomizingAmplitude;
                        break;
                    }
                    currentState = RenderableState.SHOOTING;
                    break;
                }
                case UNLOAD_PREPARING: 
                case UNLOAD_REQUESTED: 
                case UNLOAD: {
                    currentState = RenderableState.UNLOADING;
                    break;
                }
                case LOAD: {
                    currentState = RenderableState.RELOADING;
                    break;
                }
                case LOAD_ITERATION: {
                    currentState = RenderableState.LOAD_ITERATION;
                    break;
                }
                case LOAD_ITERATION_COMPLETED: {
                    currentState = RenderableState.LOAD_ITERATION_COMPLETED;
                    break;
                }
                case ALL_LOAD_ITERATIONS_COMPLETED: {
                    currentState = RenderableState.ALL_LOAD_ITERATIONS_COMPLETED;
                    break;
                }
                case EJECTING: {
                    if (playerWeaponInstance.isAimed()) {
                        currentState = RenderableState.EJECT_SPENT_ROUND_AIMED;
                        break;
                    }
                    currentState = RenderableState.EJECT_SPENT_ROUND;
                    break;
                }
                case MODIFYING: 
                case MODIFYING_REQUESTED: 
                case NEXT_ATTACHMENT: 
                case NEXT_ATTACHMENT_REQUESTED: {
                    currentState = RenderableState.MODIFYING;
                    break;
                }
                case INSPECTING: {
                    currentState = RenderableState.INSPECTING;
                    break;
                }
                default: {
                    if (player.func_70051_ag() && this.builder.firstPersonPositioningRunning != null) {
                        currentState = RenderableState.RUNNING;
                        break;
                    }
                    if (!playerWeaponInstance.isAimed()) break;
                    currentState = RenderableState.ZOOMING;
                    rate = this.builder.zoomRandomizingRate;
                    amplitude = this.builder.zoomRandomizingAmplitude;
                }
            }
        }
        if (currentState == null) {
            currentState = RenderableState.NORMAL;
        }
        if ((stateManager = this.thirdPersonStateManagers.get(player)) == null) {
            stateManager = new MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>(currentState, this.thirdPersonTransitionProvider);
            this.thirdPersonStateManagers.put(player, stateManager);
        } else {
            stateManager.setState(currentState, true, currentState == RenderableState.SHOOTING || currentState == RenderableState.ZOOMING_SHOOTING || currentState == RenderableState.RUNNING || currentState == RenderableState.ZOOMING);
        }
        return new CompatibleWeaponRenderer.StateDescriptor(playerWeaponInstance, stateManager, rate, amplitude);
    }

    private AsyncWeaponState getNextNonExpiredState(PlayerWeaponInstance playerWeaponState) {
        AsyncWeaponState asyncWeaponState = null;
        while ((asyncWeaponState = playerWeaponState.nextHistoryState()) != null && (System.currentTimeMillis() >= asyncWeaponState.getTimestamp() + asyncWeaponState.getDuration() || asyncWeaponState.getState() == WeaponState.FIRING && (this.hasRecoilPositioning() || !playerWeaponState.isAutomaticModeEnabled()))) {
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void renderItem(ItemStack weaponItemStack, RenderContext<RenderableState> renderContext, MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner) {
        List<CompatibleAttachment<? extends AttachmentContainer>> attachments = null;
        if (this.builder.getModel() instanceof ModelWithAttachments) {
            attachments = ((Weapon)weaponItemStack.func_77973_b()).getActiveAttachments(renderContext.getPlayer(), weaponItemStack);
        }
        if (this.builder.getTextureName() != null) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation(this.builder.getModId() + ":textures/models/" + this.builder.getTextureName()));
        } else {
            int textureIndex;
            PlayerItemInstance<?> itemInstance;
            String textureName = null;
            CompatibleAttachment compatibleSkin = attachments.stream().filter(ca -> ca.getAttachment() instanceof ItemSkin).findAny().orElse(null);
            if (compatibleSkin != null && (itemInstance = this.getClientModContext().getPlayerItemInstanceRegistry().getItemInstance(renderContext.getPlayer(), weaponItemStack)) instanceof PlayerWeaponInstance && (textureIndex = ((PlayerWeaponInstance)itemInstance).getActiveTextureIndex()) >= 0) {
                textureName = ((ItemSkin)compatibleSkin.getAttachment()).getTextureVariant(textureIndex) + ".png";
            }
            if (textureName == null) {
                Weapon weapon = (Weapon)weaponItemStack.func_77973_b();
                textureName = weapon.getTextureName();
            }
            Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation(this.builder.getModId() + ":textures/models/" + textureName));
        }
        double sqDistance = 0.0;
        if (this.player != null && this.player != Minecraft.func_71410_x().field_71439_g) {
            Vec3d projectView = ActiveRenderInfo.func_178806_a((Entity)Minecraft.func_71410_x().field_71439_g, (double)renderContext.getAgeInTicks());
            sqDistance = projectView.func_186679_c(this.player.field_70165_t, this.player.field_70163_u, this.player.field_70161_v);
        }
        Float renderOptimization = null;
        Projectiles projectilesConfig = this.clientModContext.configurationManager.getProjectiles();
        if (projectilesConfig != null) {
            renderOptimization = projectilesConfig.getRenderOptimization();
        }
        if (renderOptimization == null) {
            renderOptimization = Float.valueOf(0.25f);
        }
        double volumeThreshold = sqDistance * (double)renderOptimization.floatValue();
        Interceptors.setRenderVolumeThreshold(volumeThreshold);
        try {
            this.builder.getModel().func_78088_a((Entity)this.player, renderContext.getLimbSwing(), renderContext.getFlimbSwingAmount(), renderContext.getAgeInTicks(), renderContext.getNetHeadYaw(), renderContext.getHeadPitch(), renderContext.getScale());
            if (sqDistance < 900.0) {
                Interceptors.setRenderVolumeThreshold(volumeThreshold);
                if (attachments != null) {
                    this.renderAttachments(positioner, renderContext, attachments);
                }
            }
        }
        finally {
            Interceptors.setRenderVolumeThreshold(0.0);
        }
    }

    public void renderAttachments(MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, RenderContext<RenderableState> renderContext, List<CompatibleAttachment<? extends AttachmentContainer>> attachments) {
        for (CompatibleAttachment<? extends AttachmentContainer> compatibleAttachment : attachments) {
            if (compatibleAttachment == null || compatibleAttachment.getAttachment() instanceof ItemSkin) continue;
            this.renderCompatibleAttachment(compatibleAttachment, positioner, renderContext);
        }
    }

    private void renderCompatibleAttachment(CompatibleAttachment<?> compatibleAttachment, MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, RenderContext<RenderableState> renderContext) {
        Entity renderViewEntity;
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
        if ((renderViewEntity = Minecraft.func_71410_x().func_175606_aa()) == null) {
            renderViewEntity = Minecraft.func_71410_x().field_71439_g;
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

    public long getTotalLoadIterationDuration() {
        return this.builder.totalLoadIterationDuration;
    }

    public long getPrepareFirstLoadIterationAnimationDuration() {
        return this.builder.prepareFirstLoadIterationAnimationDuration;
    }

    public long getAllLoadIterationAnimationsCompletedDuration() {
        return this.builder.allLoadIterationAnimationsCompletedDuration;
    }

    public MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> getStateManager(EntityPlayer player) {
        return this.firstPersonStateManagers.get(player);
    }

    private class ThirdPersonWeaponTransitionProvider
    implements MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> {
        private ThirdPersonWeaponTransitionProvider() {
        }

        @Override
        public List<MultipartTransition<Part, RenderContext<RenderableState>>> getTransitions(RenderableState state) {
            switch (state) {
                case UNLOADING: {
                    return WeaponRenderer.this.getComplexTransition(WeaponRenderer.this.builder.thirdPersonPositioningUnloading, WeaponRenderer.this.builder.thirdPersonLeftHandPositioningUnloading, WeaponRenderer.this.builder.thirdPersonRightHandPositioningUnloading, WeaponRenderer.this.builder.thirdPersonCustomPositioningUnloading);
                }
                case RELOADING: {
                    return WeaponRenderer.this.getComplexTransition(WeaponRenderer.this.builder.thirdPersonPositioningReloading, WeaponRenderer.this.builder.thirdPersonLeftHandPositioningReloading, WeaponRenderer.this.builder.thirdPersonRightHandPositioningReloading, WeaponRenderer.this.builder.thirdPersonCustomPositioningReloading);
                }
            }
            return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.thirdPersonPositioning, context -> {}, context -> {}, new LinkedHashMap(), 250);
        }
    }

    private class FirstPersonWeaponTransitionProvider
    implements MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> {
        private FirstPersonWeaponTransitionProvider() {
        }

        @Override
        public List<MultipartTransition<Part, RenderContext<RenderableState>>> getTransitions(RenderableState state) {
            switch (state) {
                case MODIFYING: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningModifying, WeaponRenderer.this.builder.firstPersonLeftHandPositioningModifying, WeaponRenderer.this.builder.firstPersonRightHandPositioningModifying, WeaponRenderer.this.builder.firstPersonCustomPositioning, 250);
                }
                case MODIFYING_ALT: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningModifyingAlt, WeaponRenderer.this.builder.firstPersonLeftHandPositioningModifyingAlt, WeaponRenderer.this.builder.firstPersonRightHandPositioningModifyingAlt, WeaponRenderer.this.builder.firstPersonCustomPositioning, 250);
                }
                case RUNNING: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningRunning, WeaponRenderer.this.builder.firstPersonLeftHandPositioningRunning, WeaponRenderer.this.builder.firstPersonRightHandPositioningRunning, WeaponRenderer.this.builder.firstPersonCustomPositioning, 250);
                }
                case UNLOADING: {
                    return WeaponRenderer.this.getComplexTransition(WeaponRenderer.this.builder.firstPersonPositioningUnloading, WeaponRenderer.this.builder.firstPersonLeftHandPositioningUnloading, WeaponRenderer.this.builder.firstPersonRightHandPositioningUnloading, WeaponRenderer.this.builder.firstPersonCustomPositioningUnloading);
                }
                case RELOADING: {
                    return WeaponRenderer.this.getComplexTransition(WeaponRenderer.this.builder.firstPersonPositioningReloading, WeaponRenderer.this.builder.firstPersonLeftHandPositioningReloading, WeaponRenderer.this.builder.firstPersonRightHandPositioningReloading, WeaponRenderer.this.builder.firstPersonCustomPositioningReloading);
                }
                case LOAD_ITERATION: {
                    return WeaponRenderer.this.getComplexTransition(WeaponRenderer.this.builder.firstPersonPositioningLoadIteration, WeaponRenderer.this.builder.firstPersonLeftHandPositioningLoadIteration, WeaponRenderer.this.builder.firstPersonRightHandPositioningLoadIteration, WeaponRenderer.this.builder.firstPersonCustomPositioningLoadIteration);
                }
                case INSPECTING: {
                    return WeaponRenderer.this.getComplexTransition(WeaponRenderer.this.builder.firstPersonPositioningInspecting, WeaponRenderer.this.builder.firstPersonLeftHandPositioningInspecting, WeaponRenderer.this.builder.firstPersonRightHandPositioningInspecting, WeaponRenderer.this.builder.firstPersonCustomPositioningInspecting);
                }
                case DRAWING: {
                    return WeaponRenderer.this.getComplexTransition(WeaponRenderer.this.builder.firstPersonPositioningDrawing, WeaponRenderer.this.builder.firstPersonLeftHandPositioningDrawing, WeaponRenderer.this.builder.firstPersonRightHandPositioningDrawing, WeaponRenderer.this.builder.firstPersonCustomPositioningDrawing);
                }
                case LOAD_ITERATION_COMPLETED: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningLoadIterationCompleted, WeaponRenderer.this.builder.firstPersonLeftHandPositioningLoadIterationCompleted, WeaponRenderer.this.builder.firstPersonRightHandPositioningLoadIterationCompleted, WeaponRenderer.this.builder.firstPersonCustomPositioningLoadIterationCompleted, WeaponRenderer.this.builder.loadIterationCompletedAnimationDuration);
                }
                case ALL_LOAD_ITERATIONS_COMPLETED: {
                    return WeaponRenderer.this.getComplexTransition(WeaponRenderer.this.builder.firstPersonPositioningAllLoadIterationsCompleted, WeaponRenderer.this.builder.firstPersonLeftHandPositioningAllLoadIterationsCompleted, WeaponRenderer.this.builder.firstPersonRightHandPositioningAllLoadIterationsCompleted, WeaponRenderer.this.builder.firstPersonCustomPositioningLoadIterationsCompleted);
                }
                case RECOILED: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningRecoiled, WeaponRenderer.this.builder.firstPersonLeftHandPositioningRecoiled, WeaponRenderer.this.builder.firstPersonRightHandPositioningRecoiled, WeaponRenderer.this.builder.firstPersonCustomPositioningRecoiled, WeaponRenderer.this.builder.recoilAnimationDuration);
                }
                case PRONING_RECOILED: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningProningRecoiled, WeaponRenderer.this.builder.firstPersonLeftHandPositioningProningRecoiled, WeaponRenderer.this.builder.firstPersonRightHandPositioningProningRecoiled, WeaponRenderer.this.builder.firstPersonCustomPositioningProningRecoiled, WeaponRenderer.this.builder.recoilAnimationDuration);
                }
                case SHOOTING: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningShooting, WeaponRenderer.this.builder.firstPersonLeftHandPositioningShooting, WeaponRenderer.this.builder.firstPersonRightHandPositioningShooting, WeaponRenderer.this.builder.firstPersonCustomPositioning, WeaponRenderer.this.builder.shootingAnimationDuration);
                }
                case PRONING_SHOOTING: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningProningShooting, WeaponRenderer.this.builder.firstPersonLeftHandPositioningProningShooting, WeaponRenderer.this.builder.firstPersonRightHandPositioningProningShooting, WeaponRenderer.this.builder.firstPersonCustomPositioning, WeaponRenderer.this.builder.shootingAnimationDuration);
                }
                case EJECT_SPENT_ROUND: {
                    return WeaponRenderer.this.getComplexTransition(WeaponRenderer.this.builder.firstPersonPositioningEjectSpentRound, WeaponRenderer.this.builder.firstPersonLeftHandPositioningEjectSpentRound, WeaponRenderer.this.builder.firstPersonRightHandPositioningEjectSpentRound, WeaponRenderer.this.builder.firstPersonCustomPositioningEjectSpentRound);
                }
                case EJECT_SPENT_ROUND_AIMED: {
                    return WeaponRenderer.this.getComplexTransition(WeaponRenderer.this.builder.firstPersonPositioningEjectSpentRoundAimed, WeaponRenderer.this.builder.firstPersonLeftHandPositioningEjectSpentRoundAimed, WeaponRenderer.this.builder.firstPersonRightHandPositioningEjectSpentRoundAimed, WeaponRenderer.this.builder.firstPersonCustomPositioningEjectSpentRoundAimed);
                }
                case NORMAL: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioning, WeaponRenderer.this.builder.firstPersonLeftHandPositioning, WeaponRenderer.this.builder.firstPersonRightHandPositioning, WeaponRenderer.this.builder.firstPersonCustomPositioning, 250);
                }
                case PRONING: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningProning, WeaponRenderer.this.builder.firstPersonLeftHandPositioningProning, WeaponRenderer.this.builder.firstPersonRightHandPositioningProning, WeaponRenderer.this.builder.firstPersonCustomPositioningProning, 250);
                }
                case ZOOMING: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningZooming, WeaponRenderer.this.builder.firstPersonLeftHandPositioningZooming, WeaponRenderer.this.builder.firstPersonRightHandPositioningZooming, WeaponRenderer.this.builder.firstPersonCustomPositioningZooming, 250);
                }
                case ZOOMING_SHOOTING: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningZoomingShooting, WeaponRenderer.this.builder.firstPersonLeftHandPositioningZooming, WeaponRenderer.this.builder.firstPersonRightHandPositioningZooming, WeaponRenderer.this.builder.firstPersonCustomPositioningZoomingShooting, 60);
                }
                case ZOOMING_RECOILED: {
                    return WeaponRenderer.this.getSimpleTransition(WeaponRenderer.this.builder.firstPersonPositioningZoomingRecoiled, WeaponRenderer.this.builder.firstPersonLeftHandPositioningZooming, WeaponRenderer.this.builder.firstPersonRightHandPositioningZooming, WeaponRenderer.this.builder.firstPersonCustomPositioningZoomingRecoiled, 60);
                }
            }
            return null;
        }
    }

    public static class Builder {
        private Random random = new Random();
        private ModelBase model;
        private String textureName;
        private float weaponProximity;
        private float yOffsetZoom;
        private float xOffsetZoom = 0.69f;
        private Consumer<ItemStack> entityPositioning;
        private Consumer<ItemStack> inventoryPositioning;
        private Consumer<RenderContext<RenderableState>> thirdPersonPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningProning;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningZooming;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningRunning;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningModifying;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningModifyingAlt;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningRecoiled;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningProningRecoiled;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningShooting;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningProningShooting;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningZoomingRecoiled;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningZoomingShooting;
        private Consumer<RenderContext<RenderableState>> firstPersonPositioningLoadIterationCompleted;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningProning;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningZooming;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningRunning;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningModifying;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningModifyingAlt;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningRecoiled;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningProningRecoiled;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningShooting;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningProningShooting;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningLoadIterationCompleted;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningProning;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningZooming;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningRunning;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningModifying;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningModifyingAlt;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningRecoiled;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningProningRecoiled;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningShooting;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningProningShooting;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningLoadIterationCompleted;
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningReloading;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningReloading;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningReloading;
        private List<Transition<RenderContext<RenderableState>>> thirdPersonPositioningReloading;
        private List<Transition<RenderContext<RenderableState>>> thirdPersonLeftHandPositioningReloading;
        private List<Transition<RenderContext<RenderableState>>> thirdPersonRightHandPositioningReloading;
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningInspecting;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningInspecting;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningInspecting;
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningDrawing;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningDrawing;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningDrawing;
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningUnloading;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningUnloading;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningUnloading;
        private List<Transition<RenderContext<RenderableState>>> thirdPersonPositioningUnloading;
        private List<Transition<RenderContext<RenderableState>>> thirdPersonLeftHandPositioningUnloading;
        private List<Transition<RenderContext<RenderableState>>> thirdPersonRightHandPositioningUnloading;
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningLoadIteration;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningLoadIteration;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningLoadIteration;
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningAllLoadIterationsCompleted;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningAllLoadIterationsCompleted;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningAllLoadIterationsCompleted;
        private long totalReloadingDuration;
        private long totalUnloadingDuration;
        private long totalDrawingDuration;
        private long totalLoadIterationDuration;
        private String modId;
        private int recoilAnimationDuration = 100;
        private int shootingAnimationDuration = 100;
        private int loadIterationCompletedAnimationDuration = 100;
        private int prepareFirstLoadIterationAnimationDuration = 100;
        private int allLoadIterationAnimationsCompletedDuration = 100;
        private float normalRandomizingRate = 0.33f;
        private float firingRandomizingRate = 20.0f;
        private float zoomRandomizingRate = 0.25f;
        private float normalRandomizingAmplitude = 0.06f;
        private float zoomRandomizingAmplitude = 0.005f;
        private float firingRandomizingAmplitude = 0.03f;
        private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioning = new LinkedHashMap();
        private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningProning = new LinkedHashMap();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningUnloading = new LinkedHashMap();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningReloading = new LinkedHashMap();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> thirdPersonCustomPositioningUnloading = new LinkedHashMap();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> thirdPersonCustomPositioningReloading = new LinkedHashMap();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningLoadIteration = new LinkedHashMap();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningLoadIterationsCompleted = new LinkedHashMap();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningInspecting = new LinkedHashMap();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningDrawing = new LinkedHashMap();
        private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningRecoiled = new LinkedHashMap();
        private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningProningRecoiled = new LinkedHashMap();
        private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningZoomingRecoiled = new LinkedHashMap();
        private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningZoomingShooting = new LinkedHashMap();
        private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningLoadIterationCompleted = new LinkedHashMap();
        private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningZooming = new LinkedHashMap();
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningEjectSpentRound;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningEjectSpentRound;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningEjectSpentRound;
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningEjectSpentRound = new LinkedHashMap();
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningEjectSpentRoundAimed;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningEjectSpentRoundAimed;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningEjectSpentRoundAimed;
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningEjectSpentRoundAimed = new LinkedHashMap();
        private boolean hasRecoilPositioningDefined;

        public Builder withModId(String modId) {
            this.modId = modId;
            return this;
        }

        public Builder withModel(ModelBase model) {
            this.model = model;
            return this;
        }

        public Builder withShootingAnimationDuration(int shootingAnimationDuration) {
            this.shootingAnimationDuration = shootingAnimationDuration;
            return this;
        }

        public Builder withRecoilAnimationDuration(int recoilAnimationDuration) {
            this.recoilAnimationDuration = recoilAnimationDuration;
            return this;
        }

        public Builder withPrepareFirstLoadIterationAnimationDuration(int prepareFirstLoadIterationAnimationDuration) {
            this.prepareFirstLoadIterationAnimationDuration = prepareFirstLoadIterationAnimationDuration;
            return this;
        }

        public Builder withAllLoadIterationAnimationsCompletedDuration(int allLoadIterationAnimationsCompletedDuration) {
            this.allLoadIterationAnimationsCompletedDuration = allLoadIterationAnimationsCompletedDuration;
            return this;
        }

        public Builder withNormalRandomizingRate(float normalRandomizingRate) {
            this.normalRandomizingRate = normalRandomizingRate;
            return this;
        }

        public Builder withZoomRandomizingRate(float zoomRandomizingRate) {
            this.zoomRandomizingRate = zoomRandomizingRate;
            return this;
        }

        public Builder withFiringRandomizingRate(float firingRandomizingRate) {
            this.firingRandomizingRate = firingRandomizingRate;
            return this;
        }

        public Builder withFiringRandomizingAmplitude(float firingRandomizingAmplitude) {
            this.firingRandomizingAmplitude = firingRandomizingAmplitude;
            return this;
        }

        public Builder withNormalRandomizingAmplitude(float firingRandomizingRate) {
            this.firingRandomizingRate = firingRandomizingRate;
            return this;
        }

        public Builder withZoomRandomizingAmplitude(float zoomRandomizingAmplitude) {
            this.zoomRandomizingAmplitude = zoomRandomizingAmplitude;
            return this;
        }

        public Builder withTextureName(String textureName) {
            this.textureName = textureName + ".png";
            return this;
        }

        public Builder withWeaponProximity(float weaponProximity) {
            this.weaponProximity = weaponProximity;
            return this;
        }

        public Builder withYOffsetZoom(float yOffsetZoom) {
            this.yOffsetZoom = yOffsetZoom;
            return this;
        }

        public Builder withXOffsetZoom(float xOffsetZoom) {
            this.xOffsetZoom = xOffsetZoom;
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

        public Builder withThirdPersonPositioning(Consumer<RenderContext<RenderableState>> thirdPersonPositioning) {
            this.thirdPersonPositioning = thirdPersonPositioning;
            return this;
        }

        public Builder withFirstPersonPositioning(Consumer<RenderContext<RenderableState>> firstPersonPositioning) {
            this.firstPersonPositioning = firstPersonPositioning;
            return this;
        }

        public Builder withFirstPersonPositioningProning(Consumer<RenderContext<RenderableState>> firstPersonPositioningProning) {
            this.firstPersonPositioningProning = firstPersonPositioningProning;
            return this;
        }

        public Builder withFirstPersonPositioningRunning(Consumer<RenderContext<RenderableState>> firstPersonPositioningRunning) {
            this.firstPersonPositioningRunning = firstPersonPositioningRunning;
            return this;
        }

        public Builder withFirstPersonPositioningZooming(Consumer<RenderContext<RenderableState>> firstPersonPositioningZooming) {
            this.firstPersonPositioningZooming = firstPersonPositioningZooming;
            return this;
        }

        public Builder withFirstPersonPositioningRecoiled(Consumer<RenderContext<RenderableState>> firstPersonPositioningRecoiled) {
            this.hasRecoilPositioningDefined = true;
            this.firstPersonPositioningRecoiled = firstPersonPositioningRecoiled;
            return this;
        }

        public Builder withFirstPersonPositioningProningRecoiled(Consumer<RenderContext<RenderableState>> firstPersonPositioningProningRecoiled) {
            this.firstPersonPositioningProningRecoiled = firstPersonPositioningProningRecoiled;
            return this;
        }

        public Builder withFirstPersonPositioningShooting(Consumer<RenderContext<RenderableState>> firstPersonPositioningShooting) {
            this.firstPersonPositioningShooting = firstPersonPositioningShooting;
            return this;
        }

        public Builder withFirstPersonPositioningProningShooting(Consumer<RenderContext<RenderableState>> firstPersonPositioningProningShooting) {
            this.firstPersonPositioningProningShooting = firstPersonPositioningProningShooting;
            return this;
        }

        public Builder withFirstPersonPositioningZoomingRecoiled(Consumer<RenderContext<RenderableState>> firstPersonPositioningZoomingRecoiled) {
            this.firstPersonPositioningZoomingRecoiled = firstPersonPositioningZoomingRecoiled;
            return this;
        }

        public Builder withFirstPersonPositioningZoomingShooting(Consumer<RenderContext<RenderableState>> firstPersonPositioningZoomingShooting) {
            this.firstPersonPositioningZoomingShooting = firstPersonPositioningZoomingShooting;
            return this;
        }

        public Builder withFirstPersonPositioningLoadIterationCompleted(Consumer<RenderContext<RenderableState>> firstPersonPositioningLoadIterationCompleted) {
            this.firstPersonPositioningLoadIterationCompleted = firstPersonPositioningLoadIterationCompleted;
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningReloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningReloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningUnloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningUnloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withThirdPersonPositioningReloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.thirdPersonPositioningReloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withThirdPersonPositioningUnloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.thirdPersonPositioningUnloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningInspecting(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningInspecting = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningDrawing(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningDrawing = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningLoadIteration(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningLoadIteration = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningAllLoadIterationsCompleted(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningAllLoadIterationsCompleted = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningEjectSpentRound(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningEjectSpentRound = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningEjectSpentRoundAimed(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonPositioningEjectSpentRoundAimed = Arrays.asList(transitions);
            return this;
        }

        public Builder withFirstPersonPositioningModifying(Consumer<RenderContext<RenderableState>> firstPersonPositioningModifying) {
            this.firstPersonPositioningModifying = firstPersonPositioningModifying;
            return this;
        }

        public Builder withFirstPersonPositioningModifyingAlt(Consumer<RenderContext<RenderableState>> firstPersonPositioningModifyingAlt) {
            this.firstPersonPositioningModifyingAlt = firstPersonPositioningModifyingAlt;
            return this;
        }

        public Builder withFirstPersonHandPositioning(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioning = leftHand;
            this.firstPersonRightHandPositioning = rightHand;
            return this;
        }

        public Builder withFirstPersonHandPositioningProning(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningProning = leftHand;
            this.firstPersonRightHandPositioningProning = rightHand;
            return this;
        }

        public Builder withFirstPersonHandPositioningRunning(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningRunning = leftHand;
            this.firstPersonRightHandPositioningRunning = rightHand;
            return this;
        }

        public Builder withFirstPersonHandPositioningZooming(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningZooming = leftHand;
            this.firstPersonRightHandPositioningZooming = rightHand;
            return this;
        }

        public Builder withFirstPersonHandPositioningRecoiled(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningRecoiled = leftHand;
            this.firstPersonRightHandPositioningRecoiled = rightHand;
            return this;
        }

        public Builder withFirstPersonHandPositioningProningRecoiled(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningProningRecoiled = leftHand;
            this.firstPersonRightHandPositioningProningRecoiled = rightHand;
            return this;
        }

        public Builder withFirstPersonHandPositioningShooting(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningShooting = leftHand;
            this.firstPersonRightHandPositioningShooting = rightHand;
            return this;
        }

        public Builder withFirstPersonHandPositioningProningShooting(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningProningShooting = leftHand;
            this.firstPersonRightHandPositioningProningShooting = rightHand;
            return this;
        }

        public Builder withFirstPersonHandPositioningLoadIterationCompleted(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningLoadIterationCompleted = leftHand;
            this.firstPersonRightHandPositioningLoadIterationCompleted = rightHand;
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningReloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningReloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withThirdPersonLeftHandPositioningReloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.thirdPersonLeftHandPositioningReloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningInspecting(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningInspecting = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningDrawing(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningDrawing = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningEjectSpentRound(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningEjectSpentRound = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningEjectSpentRoundAimed(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningEjectSpentRoundAimed = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningUnloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningUnloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withThirdPersonLeftHandPositioningUnloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.thirdPersonLeftHandPositioningUnloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningLoadIteration(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningLoadIteration = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonLeftHandPositioningAllLoadIterationsCompleted = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningReloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningReloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withThirdPersonRightHandPositioningReloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.thirdPersonRightHandPositioningReloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningUnloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningUnloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withThirdPersonRightHandPositioningUnloading(Transition<RenderContext<RenderableState>> ... transitions) {
            this.thirdPersonRightHandPositioningUnloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningInspecting(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningInspecting = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningDrawing(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningDrawing = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningEjectSpentRound(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningEjectSpentRound = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningEjectSpentRoundAimed(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningEjectSpentRoundAimed = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningLoadIteration(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningLoadIteration = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningAllLoadIterationsCompleted(Transition<RenderContext<RenderableState>> ... transitions) {
            this.firstPersonRightHandPositioningAllLoadIterationsCompleted = Arrays.asList(transitions);
            return this;
        }

        public Builder withFirstPersonHandPositioningModifying(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningModifying = leftHand;
            this.firstPersonRightHandPositioningModifying = rightHand;
            return this;
        }

        public Builder withFirstPersonHandPositioningModifyingAlt(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningModifyingAlt = leftHand;
            this.firstPersonRightHandPositioningModifyingAlt = rightHand;
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

        public Builder withFirstPersonCustomPositioningProning(Part part, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningProning.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        public Builder withFirstPersonCustomPositioningZooming(Part part, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningZooming.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        public Builder withFirstPersonPositioningCustomRecoiled(Part part, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningRecoiled.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        public Builder withFirstPersonPositioningCustomProningRecoiled(Part part, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningProningRecoiled.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        public Builder withFirstPersonPositioningCustomZoomingShooting(Part part, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningZoomingShooting.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        public Builder withFirstPersonPositioningCustomZoomingRecoiled(Part part, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningZoomingRecoiled.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningReloading(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningReloading.put(part, Arrays.asList(transitions));
            return this;
        }

        @SafeVarargs
        public final Builder withThirdPersonCustomPositioningReloading(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.thirdPersonCustomPositioningReloading.put(part, Arrays.asList(transitions));
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningInspecting(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningInspecting.put(part, Arrays.asList(transitions));
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningDrawing(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningDrawing.put(part, Arrays.asList(transitions));
            return this;
        }

        public Builder withFirstPersonCustomPositioningLoadIterationCompleted(Part part, Consumer<RenderContext<RenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningLoadIterationCompleted.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningUnloading(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningUnloading.put(part, Arrays.asList(transitions));
            return this;
        }

        @SafeVarargs
        public final Builder withThirdPersonCustomPositioningUnloading(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.thirdPersonCustomPositioningUnloading.put(part, Arrays.asList(transitions));
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

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningEjectSpentRoundAimed(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningEjectSpentRoundAimed.put(part, Arrays.asList(transitions));
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningLoadIteration(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningLoadIteration.put(part, Arrays.asList(transitions));
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningAllLoadIterationsCompleted(Part part, Transition<RenderContext<RenderableState>> ... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningLoadIterationsCompleted.put(part, Arrays.asList(transitions));
            return this;
        }

        public WeaponRenderer build() {
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
            WeaponRenderer renderer = new WeaponRenderer(this);
            if (this.firstPersonPositioning == null) {
                this.firstPersonPositioning = renderContext -> {
                    GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    if (renderer.getClientModContext() != null) {
                        PlayerWeaponInstance instance = renderer.getClientModContext().getMainHeldWeapon();
                        if (instance != null && instance.isAimed()) {
                            GL11.glTranslatef((float)this.xOffsetZoom, (float)this.yOffsetZoom, (float)this.weaponProximity);
                        } else {
                            GL11.glTranslatef((float)0.0f, (float)-1.2f, (float)0.0f);
                        }
                    }
                };
            }
            if (this.firstPersonPositioningProning == null) {
                this.firstPersonPositioningProning = this.firstPersonPositioning;
            }
            if (this.firstPersonPositioningZooming == null) {
                this.firstPersonPositioningZooming = this.firstPersonPositioning;
            }
            if (this.firstPersonPositioningReloading == null) {
                this.firstPersonPositioningReloading = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.firstPersonPositioning, 250L));
            }
            if (this.thirdPersonPositioningReloading == null) {
                this.thirdPersonPositioningReloading = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.thirdPersonPositioning, 250L));
            }
            if (this.firstPersonPositioningInspecting == null) {
                this.firstPersonPositioningInspecting = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.firstPersonPositioning, 250L));
            }
            if (this.firstPersonPositioningDrawing == null) {
                this.firstPersonPositioningDrawing = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.firstPersonPositioning, 250L));
            }
            if (this.firstPersonPositioningLoadIteration == null) {
                this.firstPersonPositioningLoadIteration = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.firstPersonPositioning, 250L));
            }
            for (Transition<RenderContext<RenderableState>> t2 : this.firstPersonPositioningReloading) {
                this.totalReloadingDuration += t2.getDuration();
                this.totalReloadingDuration += t2.getPause();
            }
            for (Transition<RenderContext<RenderableState>> t2 : this.firstPersonPositioningLoadIteration) {
                this.totalLoadIterationDuration += t2.getDuration();
                this.totalLoadIterationDuration += t2.getPause();
            }
            if (this.firstPersonPositioningUnloading == null) {
                this.firstPersonPositioningUnloading = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.firstPersonPositioning, 250L));
            }
            if (this.thirdPersonPositioningUnloading == null) {
                this.thirdPersonPositioningUnloading = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.thirdPersonPositioning, 250L));
            }
            for (Transition<RenderContext<RenderableState>> t2 : this.firstPersonPositioningUnloading) {
                this.totalUnloadingDuration += t2.getDuration();
                this.totalUnloadingDuration += t2.getPause();
            }
            for (Transition<RenderContext<RenderableState>> t2 : this.firstPersonPositioningDrawing) {
                this.totalDrawingDuration += t2.getDuration();
                this.totalDrawingDuration += t2.getPause();
            }
            if (this.firstPersonPositioningLoadIteration == null) {
                this.firstPersonPositioningLoadIteration = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.firstPersonPositioning, 250L));
            }
            if (this.firstPersonPositioningAllLoadIterationsCompleted == null) {
                this.firstPersonPositioningAllLoadIterationsCompleted = Collections.singletonList(new Transition<RenderContext<RenderableState>>(this.firstPersonPositioning, 250L));
            }
            if (this.firstPersonPositioningRecoiled == null) {
                this.firstPersonPositioningRecoiled = this.firstPersonPositioning;
            } else {
                Consumer<RenderContext<RenderableState>> firstPersonPositioningRecoiledOrig = this.firstPersonPositioningRecoiled;
                this.firstPersonPositioningRecoiled = renderContext -> {
                    float maxAngle = 1.5f;
                    float xRotation = this.random.nextFloat() * maxAngle;
                    float yRotation = this.random.nextFloat() * maxAngle;
                    float zRotation = this.random.nextFloat() * maxAngle;
                    GL11.glRotatef((float)xRotation, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)yRotation, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)zRotation, (float)0.0f, (float)0.0f, (float)1.0f);
                    float amplitude = 0.0f;
                    float xRandomOffset = this.random.nextFloat() * amplitude;
                    float yRandomOffset = this.random.nextFloat() * amplitude;
                    float zRandomOffset = this.random.nextFloat() * amplitude;
                    GL11.glTranslatef((float)xRandomOffset, (float)yRandomOffset, (float)zRandomOffset);
                    firstPersonPositioningRecoiledOrig.accept((RenderContext<RenderableState>)renderContext);
                };
            }
            if (this.firstPersonPositioningProningRecoiled == null) {
                this.firstPersonPositioningProningRecoiled = this.firstPersonPositioningRecoiled;
            }
            if (this.firstPersonPositioningRunning == null) {
                this.firstPersonPositioningRunning = this.firstPersonPositioning;
            }
            if (this.firstPersonPositioningModifying == null) {
                this.firstPersonPositioningModifying = this.firstPersonPositioning;
            }
            if (this.firstPersonPositioningModifyingAlt == null) {
                this.firstPersonPositioningModifyingAlt = this.firstPersonPositioning;
            }
            if (this.firstPersonPositioningShooting == null) {
                this.firstPersonPositioningShooting = this.firstPersonPositioning;
            }
            if (this.firstPersonPositioningProningShooting == null) {
                this.firstPersonPositioningProningShooting = this.firstPersonPositioningProning;
            }
            if (this.firstPersonPositioningZoomingRecoiled == null) {
                this.firstPersonPositioningZoomingRecoiled = this.firstPersonPositioningZooming;
            }
            if (this.firstPersonPositioningZoomingShooting == null) {
                this.firstPersonPositioningZoomingShooting = this.firstPersonPositioningZooming;
            }
            if (this.firstPersonPositioningLoadIterationCompleted == null) {
                this.firstPersonPositioningLoadIterationCompleted = this.firstPersonPositioning;
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
            if (this.firstPersonLeftHandPositioningProning == null) {
                this.firstPersonLeftHandPositioningProning = this.firstPersonLeftHandPositioning;
            }
            if (this.firstPersonLeftHandPositioningReloading == null) {
                this.firstPersonLeftHandPositioningReloading = this.firstPersonPositioningReloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonLeftHandPositioningUnloading == null) {
                this.firstPersonLeftHandPositioningUnloading = this.firstPersonPositioningUnloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.thirdPersonLeftHandPositioningReloading == null) {
                this.thirdPersonLeftHandPositioningReloading = this.thirdPersonPositioningReloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.thirdPersonLeftHandPositioningUnloading == null) {
                this.thirdPersonLeftHandPositioningUnloading = this.thirdPersonPositioningUnloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonLeftHandPositioningInspecting == null) {
                this.firstPersonLeftHandPositioningInspecting = this.firstPersonPositioningInspecting.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonLeftHandPositioningDrawing == null) {
                this.firstPersonLeftHandPositioningDrawing = this.firstPersonPositioningDrawing.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonLeftHandPositioningLoadIteration == null) {
                this.firstPersonLeftHandPositioningLoadIteration = this.firstPersonPositioningReloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonLeftHandPositioningAllLoadIterationsCompleted == null) {
                this.firstPersonLeftHandPositioningAllLoadIterationsCompleted = this.firstPersonPositioningReloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonLeftHandPositioningRecoiled == null) {
                this.firstPersonLeftHandPositioningRecoiled = this.firstPersonLeftHandPositioning;
            }
            if (this.firstPersonLeftHandPositioningProningRecoiled == null) {
                this.firstPersonLeftHandPositioningProningRecoiled = this.firstPersonLeftHandPositioningProning;
            }
            if (this.firstPersonLeftHandPositioningShooting == null) {
                this.firstPersonLeftHandPositioningShooting = this.firstPersonLeftHandPositioning;
            }
            if (this.firstPersonLeftHandPositioningProningShooting == null) {
                this.firstPersonLeftHandPositioningProningShooting = this.firstPersonLeftHandPositioningProning;
            }
            if (this.firstPersonLeftHandPositioningZooming == null) {
                this.firstPersonLeftHandPositioningZooming = this.firstPersonLeftHandPositioning;
            }
            if (this.firstPersonLeftHandPositioningRunning == null) {
                this.firstPersonLeftHandPositioningRunning = this.firstPersonLeftHandPositioning;
            }
            if (this.firstPersonLeftHandPositioningModifying == null) {
                this.firstPersonLeftHandPositioningModifying = this.firstPersonLeftHandPositioning;
            }
            if (this.firstPersonLeftHandPositioningModifyingAlt == null) {
                this.firstPersonLeftHandPositioningModifyingAlt = this.firstPersonLeftHandPositioning;
            }
            if (this.firstPersonLeftHandPositioningLoadIterationCompleted == null) {
                this.firstPersonLeftHandPositioningLoadIterationCompleted = this.firstPersonLeftHandPositioning;
            }
            if (this.firstPersonRightHandPositioning == null) {
                this.firstPersonRightHandPositioning = context -> {};
            }
            if (this.firstPersonRightHandPositioningProning == null) {
                this.firstPersonRightHandPositioningProning = this.firstPersonRightHandPositioning;
            }
            if (this.firstPersonRightHandPositioningReloading == null) {
                this.firstPersonRightHandPositioningReloading = this.firstPersonPositioningReloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningUnloading == null) {
                this.firstPersonRightHandPositioningUnloading = this.firstPersonPositioningUnloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.thirdPersonRightHandPositioningReloading == null) {
                this.thirdPersonRightHandPositioningReloading = this.thirdPersonPositioningReloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.thirdPersonRightHandPositioningUnloading == null) {
                this.thirdPersonRightHandPositioningUnloading = this.thirdPersonPositioningUnloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningInspecting == null) {
                this.firstPersonRightHandPositioningInspecting = this.firstPersonPositioningInspecting.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningDrawing == null) {
                this.firstPersonRightHandPositioningDrawing = this.firstPersonPositioningDrawing.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningLoadIteration == null) {
                this.firstPersonRightHandPositioningLoadIteration = this.firstPersonPositioningReloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningAllLoadIterationsCompleted == null) {
                this.firstPersonRightHandPositioningAllLoadIterationsCompleted = this.firstPersonPositioningReloading.stream().map(t -> new Transition<RenderContext>(c -> {}, 0L)).collect(Collectors.toList());
            }
            if (this.firstPersonRightHandPositioningRecoiled == null) {
                this.firstPersonRightHandPositioningRecoiled = this.firstPersonRightHandPositioning;
            }
            if (this.firstPersonRightHandPositioningProningRecoiled == null) {
                this.firstPersonRightHandPositioningProningRecoiled = this.firstPersonRightHandPositioningProning;
            }
            if (this.firstPersonRightHandPositioningShooting == null) {
                this.firstPersonRightHandPositioningShooting = this.firstPersonRightHandPositioning;
            }
            if (this.firstPersonRightHandPositioningProningShooting == null) {
                this.firstPersonRightHandPositioningProningShooting = this.firstPersonRightHandPositioningProning;
            }
            if (this.firstPersonRightHandPositioningZooming == null) {
                this.firstPersonRightHandPositioningZooming = this.firstPersonRightHandPositioning;
            }
            if (this.firstPersonRightHandPositioningRunning == null) {
                this.firstPersonRightHandPositioningRunning = this.firstPersonRightHandPositioning;
            }
            if (this.firstPersonRightHandPositioningModifying == null) {
                this.firstPersonRightHandPositioningModifying = this.firstPersonRightHandPositioning;
            }
            if (this.firstPersonRightHandPositioningModifyingAlt == null) {
                this.firstPersonRightHandPositioningModifyingAlt = this.firstPersonRightHandPositioning;
            }
            if (this.firstPersonRightHandPositioningLoadIterationCompleted == null) {
                this.firstPersonRightHandPositioningLoadIterationCompleted = this.firstPersonLeftHandPositioning;
            }
            if (!this.firstPersonCustomPositioning.isEmpty() && this.firstPersonCustomPositioningRecoiled.isEmpty()) {
                this.firstPersonCustomPositioning.forEach((part, pos) -> this.firstPersonCustomPositioningRecoiled.put((Part)part, (Consumer<RenderContext<RenderableState>>)pos));
            }
            if (!this.firstPersonCustomPositioning.isEmpty() && this.firstPersonCustomPositioningProning.isEmpty()) {
                this.firstPersonCustomPositioning.forEach((part, pos) -> this.firstPersonCustomPositioningProning.put((Part)part, (Consumer<RenderContext<RenderableState>>)pos));
            }
            if (!this.firstPersonCustomPositioning.isEmpty() && this.firstPersonCustomPositioningZooming.isEmpty()) {
                this.firstPersonCustomPositioning.forEach((part, pos) -> this.firstPersonCustomPositioningZooming.put((Part)part, (Consumer<RenderContext<RenderableState>>)pos));
            }
            if (!this.firstPersonCustomPositioning.isEmpty() && this.firstPersonCustomPositioningZoomingRecoiled.isEmpty()) {
                this.firstPersonCustomPositioning.forEach((part, pos) -> this.firstPersonCustomPositioningZoomingRecoiled.put((Part)part, (Consumer<RenderContext<RenderableState>>)pos));
            }
            if (!this.firstPersonCustomPositioning.isEmpty() && this.firstPersonCustomPositioningProningRecoiled.isEmpty()) {
                this.firstPersonCustomPositioningRecoiled.forEach((part, pos) -> this.firstPersonCustomPositioningProningRecoiled.put((Part)part, (Consumer<RenderContext<RenderableState>>)pos));
            }
            if (!this.firstPersonCustomPositioning.isEmpty() && this.firstPersonCustomPositioningZoomingShooting.isEmpty()) {
                this.firstPersonCustomPositioning.forEach((part, pos) -> this.firstPersonCustomPositioningZoomingShooting.put((Part)part, (Consumer<RenderContext<RenderableState>>)pos));
            }
            if (!this.firstPersonCustomPositioning.isEmpty() && this.firstPersonCustomPositioningLoadIterationCompleted.isEmpty()) {
                this.firstPersonCustomPositioning.forEach((part, pos) -> this.firstPersonCustomPositioningLoadIterationCompleted.put((Part)part, (Consumer<RenderContext<RenderableState>>)pos));
            }
            this.firstPersonCustomPositioningReloading.forEach((p, t) -> {
                if (t.size() != this.firstPersonPositioningReloading.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + this.firstPersonPositioningReloading.size() + ", actual: " + t.size());
                }
            });
            this.thirdPersonCustomPositioningReloading.forEach((p, t) -> {
                if (t.size() != this.thirdPersonPositioningReloading.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + this.thirdPersonPositioningReloading.size() + ", actual: " + t.size());
                }
            });
            this.firstPersonCustomPositioningUnloading.forEach((p, t) -> {
                if (t.size() != this.firstPersonPositioningUnloading.size()) {
                    throw new IllegalStateException("Custom unloading transition number mismatch. Expected " + this.firstPersonPositioningUnloading.size() + ", actual: " + t.size());
                }
            });
            this.thirdPersonCustomPositioningUnloading.forEach((p, t) -> {
                if (t.size() != this.thirdPersonPositioningUnloading.size()) {
                    throw new IllegalStateException("Custom unloading transition number mismatch. Expected " + this.thirdPersonPositioningUnloading.size() + ", actual: " + t.size());
                }
            });
            this.firstPersonCustomPositioningInspecting.forEach((p, t) -> {
                if (t.size() != this.firstPersonPositioningInspecting.size()) {
                    throw new IllegalStateException("Custom inspecting transition number mismatch. Expected " + this.firstPersonPositioningInspecting.size() + ", actual: " + t.size());
                }
            });
            this.firstPersonCustomPositioningDrawing.forEach((p, t) -> {
                if (t.size() != this.firstPersonPositioningDrawing.size()) {
                    throw new IllegalStateException("Custom Drawing transition number mismatch. Expected " + this.firstPersonPositioningDrawing.size() + ", actual: " + t.size());
                }
            });
            this.firstPersonCustomPositioningLoadIteration.forEach((p, t) -> {
                if (t.size() != this.firstPersonPositioningLoadIteration.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + this.firstPersonPositioningLoadIteration.size() + ", actual: " + t.size());
                }
            });
            this.firstPersonCustomPositioningLoadIterationsCompleted.forEach((p, t) -> {
                if (t.size() != this.firstPersonPositioningAllLoadIterationsCompleted.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + this.firstPersonPositioningAllLoadIterationsCompleted.size() + ", actual: " + t.size());
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


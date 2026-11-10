/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.attributes.AttributeModifier
 *  net.minecraft.entity.player.EntityPlayer
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.LightExposure;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PipelineShaderGroupSourceProvider;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.SafeGlobals;
import com.vicmatskiv.weaponlib.SpreadableExposure;
import com.vicmatskiv.weaponlib.WeaponState;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleClientEventHandler;
import com.vicmatskiv.weaponlib.compatibility.CompatibleClientTickEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExposureCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderHandEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderPlayerPreEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderTickEvent;
import com.vicmatskiv.weaponlib.perspective.Perspective;
import com.vicmatskiv.weaponlib.shader.DynamicShaderContext;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroupManager;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroupSource;
import com.vicmatskiv.weaponlib.shader.DynamicShaderPhase;
import com.vicmatskiv.weaponlib.tracking.PlayerEntityTracker;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientEventHandler
extends CompatibleClientEventHandler {
    private static final int DEFAULT_RECONCILE_TIMEOUT_MILLIS = 5000;
    private static final float SLOW_DOWN_WHEN_POISONED_DOSE_THRESHOLD = 0.4f;
    private static final UUID SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER_UUID = UUID.fromString("8efa8469-0256-4f8e-bdd9-3e7b23970663");
    private static final AttributeModifier SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER = new AttributeModifier(SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER_UUID, "Slow Down While Zooming", -0.3, 2).func_111168_a(false);
    private static final UUID SLOW_DOWN_WHILE_PRONING_ATTRIBUTE_MODIFIER_UUID = UUID.fromString("a3fa1751-953d-4b6c-955b-6824a193d271");
    private static final AttributeModifier SLOW_DOWN_WHILE_PRONING_ATTRIBUTE_MODIFIER = new AttributeModifier(SLOW_DOWN_WHILE_PRONING_ATTRIBUTE_MODIFIER_UUID, "Slow Down While Proning", -0.7, 2).func_111168_a(false);
    private static final UUID SLOW_DOWN_WHILE_POISONED_ATTRIBUTE_MODIFIER_UUID = UUID.fromString("9d2eac95-9b9c-4942-8287-7952c6de353e");
    private static final AttributeModifier SLOW_DOWN_WHILE_POISONED_ATTRIBUTE_MODIFIER = new AttributeModifier(SLOW_DOWN_WHILE_POISONED_ATTRIBUTE_MODIFIER_UUID, "Slow Down While Poisoned", -0.7, 2).func_111168_a(false);
    private static final Logger logger = LogManager.getLogger(ClientEventHandler.class);
    private Lock mainLoopLock = new ReentrantLock();
    private SafeGlobals safeGlobals;
    private Queue<Runnable> runInClientThreadQueue;
    private ClientModContext modContext;
    private DynamicShaderGroupManager shaderGroupManager;
    private PipelineShaderGroupSourceProvider pipelineShaderGroupSourceProvider = new PipelineShaderGroupSourceProvider();
    private int currentSlotIndex;

    public ClientEventHandler(ClientModContext modContext, Lock mainLoopLock, SafeGlobals safeGlobals, Queue<Runnable> runInClientThreadQueue) {
        this.modContext = modContext;
        this.mainLoopLock = mainLoopLock;
        this.safeGlobals = safeGlobals;
        this.runInClientThreadQueue = runInClientThreadQueue;
        this.shaderGroupManager = new DynamicShaderGroupManager();
    }

    @Override
    public void onCompatibleClientTick(CompatibleClientTickEvent event) {
        if (event.getPhase() == CompatibleClientTickEvent.Phase.START) {
            this.mainLoopLock.lock();
            this.updateOnStartTick();
        } else if (event.getPhase() == CompatibleClientTickEvent.Phase.END) {
            this.update();
            this.modContext.getSyncManager().run();
            PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer());
            if (tracker != null) {
                tracker.update();
            }
            this.mainLoopLock.unlock();
            this.processRunInClientThreadQueue();
            this.safeGlobals.objectMouseOver.set(CompatibilityProvider.compatibility.getObjectMouseOver());
            if (CompatibilityProvider.compatibility.clientPlayer() != null) {
                this.safeGlobals.currentItemIndex.set(CompatibilityProvider.compatibility.clientPlayer().field_71071_by.field_70461_c);
            }
        }
    }

    private void updateOnStartTick() {
        int newSlotIndex;
        EntityPlayer player = CompatibilityProvider.compatibility.clientPlayer();
        if (player != null && this.currentSlotIndex != (newSlotIndex = CompatibilityProvider.compatibility.getCurrentInventoryItemIndex(player))) {
            this.currentSlotIndex = newSlotIndex;
            this.modContext.getWeaponReloadAspect().drawMainHeldItem(player);
        }
    }

    private void update() {
        EntityPlayer player = CompatibilityProvider.compatibility.clientPlayer();
        this.modContext.getPlayerItemInstanceRegistry().update(player);
        PlayerWeaponInstance mainHandHeldWeaponInstance = this.modContext.getMainHeldWeapon();
        if (player != null) {
            if (ClientEventHandler.isProning(player)) {
                this.slowPlayerDown(player, SLOW_DOWN_WHILE_PRONING_ATTRIBUTE_MODIFIER);
            } else {
                this.restorePlayerSpeed(player, SLOW_DOWN_WHILE_PRONING_ATTRIBUTE_MODIFIER);
            }
        }
        if (mainHandHeldWeaponInstance != null) {
            if (player.func_70051_ag()) {
                mainHandHeldWeaponInstance.setAimed(false);
            }
            if (mainHandHeldWeaponInstance.isAimed()) {
                this.slowPlayerDown(player, SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER);
            } else {
                this.restorePlayerSpeed(player, SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER);
            }
            if (mainHandHeldWeaponInstance != null && mainHandHeldWeaponInstance.getState() == WeaponState.READY && mainHandHeldWeaponInstance.getStateUpdateTimestamp() + 5000L < System.currentTimeMillis() && mainHandHeldWeaponInstance.getSyncStartTimestamp() == 0L && mainHandHeldWeaponInstance.getUpdateTimestamp() + 5000L < System.currentTimeMillis()) {
                mainHandHeldWeaponInstance.reconcile();
            }
        } else if (player != null) {
            this.restorePlayerSpeed(player, SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER);
        }
        if (player != null) {
            SpreadableExposure spreadableExposure = CompatibleExposureCapability.getExposure((Entity)CompatibilityProvider.compatibility.clientPlayer(), SpreadableExposure.class);
            if (spreadableExposure != null && spreadableExposure.getTotalDose() > 0.4f) {
                this.slowPlayerDown(player, SLOW_DOWN_WHILE_POISONED_ATTRIBUTE_MODIFIER);
            } else {
                this.restorePlayerSpeed(player, SLOW_DOWN_WHILE_POISONED_ATTRIBUTE_MODIFIER);
            }
            LightExposure lightExposure = CompatibleExposureCapability.getExposure((Entity)CompatibilityProvider.compatibility.clientPlayer(), LightExposure.class);
            if (lightExposure != null) {
                lightExposure.update((Entity)CompatibilityProvider.compatibility.clientPlayer());
            }
        }
    }

    private static boolean isProning(EntityPlayer player) {
        return (CompatibleExtraEntityFlags.getFlags((Entity)player) & CompatibleExtraEntityFlags.PRONING) != 0;
    }

    private void restorePlayerSpeed(EntityPlayer entityPlayer, AttributeModifier modifier) {
        if (entityPlayer.func_110148_a(CompatibilityProvider.compatibility.getMovementSpeedAttribute()).func_111127_a(modifier.func_111167_a()) != null) {
            entityPlayer.func_110148_a(CompatibilityProvider.compatibility.getMovementSpeedAttribute()).func_111124_b(modifier);
        }
    }

    private void slowPlayerDown(EntityPlayer entityPlayer, AttributeModifier modifier) {
        if (entityPlayer.func_110148_a(CompatibilityProvider.compatibility.getMovementSpeedAttribute()).func_111127_a(modifier.func_111167_a()) == null) {
            entityPlayer.func_110148_a(CompatibilityProvider.compatibility.getMovementSpeedAttribute()).func_111121_a(modifier);
        }
    }

    private void processRunInClientThreadQueue() {
        Runnable r;
        while ((r = this.runInClientThreadQueue.poll()) != null) {
            r.run();
        }
    }

    @Override
    public void onCompatibleRenderHand(CompatibleRenderHandEvent event) {
        Minecraft minecraft = Minecraft.func_71410_x();
        if (minecraft.field_71474_y.field_74320_O == 0 && !CompatibilityProvider.compatibility.isShadersModEnabled()) {
            PlayerWeaponInstance weaponInstance = this.modContext.getMainHeldWeapon();
            DynamicShaderContext shaderContext = new DynamicShaderContext(DynamicShaderPhase.PRE_ITEM_RENDER, null, minecraft.func_147110_a(), event.getPartialTicks()).withProperty("weaponInstance", weaponInstance);
            this.shaderGroupManager.applyShader(shaderContext, weaponInstance);
        }
    }

    @Override
    protected void onCompatibleRenderTickEvent(CompatibleRenderTickEvent event) {
        Minecraft minecraft = Minecraft.func_71410_x();
        DynamicShaderContext shaderContext = new DynamicShaderContext(DynamicShaderPhase.POST_WORLD_RENDER, minecraft.field_71460_t, minecraft.func_147110_a(), event.getRenderTickTime());
        EntityPlayer clientPlayer = CompatibilityProvider.compatibility.clientPlayer();
        if (event.getPhase() == CompatibleRenderTickEvent.Phase.START) {
            ClientModContext.currentContext.set(this.modContext);
            this.mainLoopLock.lock();
            if (clientPlayer != null) {
                Perspective<?> view;
                PlayerItemInstance<?> instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)clientPlayer);
                DynamicShaderGroupSource source = this.pipelineShaderGroupSourceProvider.getShaderSource(shaderContext.getPhase());
                if (source != null) {
                    this.shaderGroupManager.loadFromSource(shaderContext, source);
                }
                if (instance != null && (view = this.modContext.getViewManager().getPerspective(instance, true)) != null) {
                    view.update(event);
                }
            }
        } else if (event.getPhase() == CompatibleRenderTickEvent.Phase.END) {
            this.safeGlobals.renderingPhase.set(null);
            this.shaderGroupManager.removeStaleShaders(shaderContext);
            this.mainLoopLock.unlock();
            ClientModContext.currentContext.remove();
        }
    }

    @Override
    protected ModContext getModContext() {
        return this.modContext;
    }

    @Override
    protected void onCompatibleRenderPlayerPreEvent(CompatibleRenderPlayerPreEvent event) {
    }
}


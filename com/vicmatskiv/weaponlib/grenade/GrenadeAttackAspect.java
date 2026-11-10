/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.grenade;

import com.vicmatskiv.weaponlib.CommonModContext;
import com.vicmatskiv.weaponlib.Explosion;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.grenade.EntityFlashGrenade;
import com.vicmatskiv.weaponlib.grenade.EntityGasGrenade;
import com.vicmatskiv.weaponlib.grenade.EntityGrenade;
import com.vicmatskiv.weaponlib.grenade.EntitySmokeGrenade;
import com.vicmatskiv.weaponlib.grenade.GrenadeMessage;
import com.vicmatskiv.weaponlib.grenade.GrenadeState;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import com.vicmatskiv.weaponlib.grenade.PlayerGrenadeInstance;
import com.vicmatskiv.weaponlib.state.Aspect;
import com.vicmatskiv.weaponlib.state.PermitManager;
import com.vicmatskiv.weaponlib.state.StateManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GrenadeAttackAspect
implements Aspect<GrenadeState, PlayerGrenadeInstance> {
    private static final Logger logger = LogManager.getLogger(GrenadeAttackAspect.class);
    private static final long ALERT_TIMEOUT = 300L;
    private Predicate<PlayerGrenadeInstance> hasSafetyPin = instance -> instance.getWeapon().hasSafetyPin();
    private static Predicate<PlayerGrenadeInstance> reequipTimeoutExpired = instance -> System.currentTimeMillis() > instance.getStateUpdateTimestamp() + instance.getWeapon().getReequipTimeout();
    private static Predicate<PlayerGrenadeInstance> throwingCompleted = instance -> (double)System.currentTimeMillis() >= (double)instance.getStateUpdateTimestamp() + instance.getWeapon().getTotalThrowingDuration() * 1.1;
    private static Predicate<PlayerGrenadeInstance> explosionTimeoutExpired = instance -> System.currentTimeMillis() >= instance.getStateUpdateTimestamp() + (long)instance.getWeapon().getExplosionTimeout();
    private static final Set<GrenadeState> allowedAttackFromStates = new HashSet<GrenadeState>(Arrays.asList(GrenadeState.READY, GrenadeState.STRIKER_LEVER_RELEASED));
    private static final Set<GrenadeState> allowedPinOffFromStates = new HashSet<GrenadeState>(Arrays.asList(GrenadeState.SAFETY_PING_OFF));
    private static final Set<GrenadeState> allowedUpdateFromStates = new HashSet<GrenadeState>(Arrays.asList(GrenadeState.STRIKER_LEVER_RELEASED, GrenadeState.THROWING, GrenadeState.THROWN, GrenadeState.EXPLODED_IN_HANDS));
    private static final int SAFETY_IN_ALERT_TIMEOUT = 1000;
    private ModContext modContext;
    private StateManager<GrenadeState, ? super PlayerGrenadeInstance> stateManager;

    public GrenadeAttackAspect(CommonModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setPermitManager(PermitManager permitManager) {
    }

    @Override
    public void setStateManager(StateManager<GrenadeState, ? super PlayerGrenadeInstance> stateManager) {
        this.stateManager = stateManager;
        stateManager.in(this).change(GrenadeState.READY).to(GrenadeState.SAFETY_PING_OFF).withAction(i -> this.takeSafetyPinOff((PlayerGrenadeInstance)i)).when(this.hasSafetyPin).manual().in(this).change(GrenadeState.SAFETY_PING_OFF).to(GrenadeState.STRIKER_LEVER_RELEASED).withAction(i -> this.releaseStrikerLever((PlayerGrenadeInstance)i)).manual().in(this).change(GrenadeState.STRIKER_LEVER_RELEASED).to(GrenadeState.EXPLODED_IN_HANDS).withAction(i -> this.explode((PlayerGrenadeInstance)i)).when(explosionTimeoutExpired.and(i -> i.getWeapon().getType() == ItemGrenade.Type.REGULAR)).automatic().in(this).change(GrenadeState.READY).to(GrenadeState.THROWING).when(this.hasSafetyPin.negate()).manual().in(this).change(GrenadeState.THROWING).to(GrenadeState.THROWN).withAction(i -> this.throwIt((PlayerGrenadeInstance)i)).when(throwingCompleted).automatic().in(this).change(GrenadeState.STRIKER_LEVER_RELEASED).to(GrenadeState.THROWING).manual().in(this).change(GrenadeState.THROWN).to(GrenadeState.READY).withAction(i -> this.reequip((PlayerGrenadeInstance)i)).when(reequipTimeoutExpired).automatic().in(this).change(GrenadeState.EXPLODED_IN_HANDS).to(GrenadeState.READY).withAction(i -> this.reequip((PlayerGrenadeInstance)i)).when(reequipTimeoutExpired).automatic();
    }

    private void explode(PlayerGrenadeInstance instance) {
        logger.debug("Exploding!");
        this.modContext.getChannel().getChannel().sendToServer((IMessage)new GrenadeMessage(instance, 0L));
    }

    private void throwIt(PlayerGrenadeInstance instance) {
        logger.debug("Throwing with state " + instance.getState());
        long activationTimestamp = instance.getWeapon().getType() != ItemGrenade.Type.REGULAR ? System.currentTimeMillis() : (instance.getWeapon().getExplosionTimeout() > 0 ? instance.getActivationTimestamp() : -1L);
        CompatibilityProvider.compatibility.playSound(instance.getPlayer(), instance.getWeapon().getThrowSound(), 1.0f, 1.0f);
        this.modContext.getChannel().getChannel().sendToServer((IMessage)new GrenadeMessage(instance, activationTimestamp));
    }

    private void reequip(PlayerGrenadeInstance instance) {
        logger.debug("Reequipping");
    }

    private void takeSafetyPinOff(PlayerGrenadeInstance instance) {
        CompatibilityProvider.compatibility.playSound(instance.getPlayer(), instance.getWeapon().getSafetyPinOffSound(), 1.0f, 1.0f);
        logger.debug("Taking safety pin off");
    }

    private void releaseStrikerLever(PlayerGrenadeInstance instance) {
        logger.debug("Safety pin is off");
        instance.setActivationTimestamp(System.currentTimeMillis());
    }

    void onAttackButtonClick(EntityPlayer player, boolean throwingFar) {
        PlayerGrenadeInstance grenadeInstance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerGrenadeInstance.class);
        if (grenadeInstance != null) {
            grenadeInstance.setThrowingFar(throwingFar);
            this.stateManager.changeStateFromAnyOf(this, grenadeInstance, allowedAttackFromStates, new GrenadeState[]{GrenadeState.SAFETY_PING_OFF, GrenadeState.THROWING});
        }
    }

    void onAttackButtonUp(EntityPlayer player, boolean throwingFar) {
        PlayerGrenadeInstance grenadeInstance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerGrenadeInstance.class);
        if (grenadeInstance != null) {
            grenadeInstance.setThrowingFar(throwingFar);
            this.stateManager.changeStateFromAnyOf(this, grenadeInstance, allowedPinOffFromStates, new GrenadeState[]{GrenadeState.STRIKER_LEVER_RELEASED});
        }
    }

    void onUpdate(EntityPlayer player) {
        PlayerGrenadeInstance grenadeInstance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerGrenadeInstance.class);
        if (grenadeInstance != null) {
            if (grenadeInstance.getState() == GrenadeState.STRIKER_LEVER_RELEASED && grenadeInstance.getWeapon().getType() == ItemGrenade.Type.REGULAR && System.currentTimeMillis() > grenadeInstance.getLastSafetyPinAlertTimestamp() + 1000L) {
                long remainingTimeUntilExplosion = (long)grenadeInstance.getWeapon().getExplosionTimeout() - (System.currentTimeMillis() - grenadeInstance.getActivationTimestamp());
                if (remainingTimeUntilExplosion < 0L) {
                    remainingTimeUntilExplosion = 0L;
                }
                String message = CompatibilityProvider.compatibility.getLocalizedString("gui.grenadeExplodes", Math.round((float)remainingTimeUntilExplosion / 1000.0f));
                this.modContext.getStatusMessageCenter().addAlertMessage(message, 1, 1000L, 0L);
                grenadeInstance.setLastSafetyPinAlertTimestamp(System.currentTimeMillis());
            }
            this.stateManager.changeStateFromAnyOf(this, grenadeInstance, allowedUpdateFromStates, new GrenadeState[0]);
        }
    }

    public void serverThrowGrenade(EntityPlayer player, PlayerGrenadeInstance instance, long activationTimestamp) {
        logger.debug("Throwing grenade");
        GrenadeAttackAspect.serverThrowGrenade(this.modContext, (EntityLivingBase)player, instance, activationTimestamp);
        CompatibilityProvider.compatibility.consumeInventoryItemFromSlot(player, instance.getItemInventoryIndex());
    }

    public static void serverThrowGrenade(ModContext modContext, EntityLivingBase player, PlayerGrenadeInstance instance, long activationTimestamp) {
        if (activationTimestamp == 0L && instance.getWeapon().getType() == ItemGrenade.Type.REGULAR) {
            Explosion.createServerSideExplosion(modContext, CompatibilityProvider.compatibility.world((Entity)player), null, player.field_70165_t, player.field_70163_u, player.field_70161_v, instance.getWeapon().getExplosionStrength(), false, true, instance.getWeapon().isDestroyingBlocks(), 1.0f, 1.0f, 1.5f, 1.0f, null, null, modContext.getExplosionSound());
        } else if (instance.getWeapon().getType() == ItemGrenade.Type.SMOKE) {
            float velocity = instance.isThrowingFar() ? instance.getWeapon().getFarVelocity() : instance.getWeapon().getVelocity();
            EntitySmokeGrenade entityGrenade = new EntitySmokeGrenade.Builder().withThrower(player).withActivationTimestamp(activationTimestamp).withGrenade(instance.getWeapon()).withSmokeAmount(instance.getWeapon().getExplosionStrength()).withActivationDelay(0L).withActiveDuration(instance.getWeapon().getActiveDuration()).withVelocity(velocity).withGravityVelocity(instance.getWeapon().getGravityVelocity()).withRotationSlowdownFactor(instance.getWeapon().getRotationSlowdownFactor()).build(modContext);
            logger.debug("Throwing velocity {} ", (Object)Float.valueOf(velocity));
            CompatibilityProvider.compatibility.spawnEntity(player, entityGrenade);
        } else if (instance.getWeapon().getType() == ItemGrenade.Type.GAS) {
            float velocity = instance.isThrowingFar() ? instance.getWeapon().getFarVelocity() : instance.getWeapon().getVelocity();
            EntityGasGrenade entityGrenade = new EntityGasGrenade.Builder().withThrower(player).withActivationTimestamp(activationTimestamp).withGrenade(instance.getWeapon()).withSmokeAmount(instance.getWeapon().getExplosionStrength()).withActivationDelay(0L).withActiveDuration(instance.getWeapon().getActiveDuration()).withVelocity(velocity).withGravityVelocity(instance.getWeapon().getGravityVelocity()).withRotationSlowdownFactor(instance.getWeapon().getRotationSlowdownFactor()).build(modContext);
            logger.debug("Throwing velocity {} ", (Object)Float.valueOf(velocity));
            CompatibilityProvider.compatibility.spawnEntity(player, entityGrenade);
        } else if (instance.getWeapon().getType() == ItemGrenade.Type.FLASH) {
            float velocity = instance.isThrowingFar() ? instance.getWeapon().getFarVelocity() : instance.getWeapon().getVelocity();
            EntityFlashGrenade entityGrenade = new EntityFlashGrenade.Builder().withThrower(player).withActivationTimestamp(activationTimestamp).withGrenade(instance.getWeapon()).withExplosionStrength(instance.getWeapon().getExplosionStrength()).withExplosionTimeout(instance.getWeapon().getExplosionTimeout()).withVelocity(velocity).withGravityVelocity(instance.getWeapon().getGravityVelocity()).withRotationSlowdownFactor(instance.getWeapon().getRotationSlowdownFactor()).withDestroyingBlocks(false).build(modContext);
            logger.debug("Throwing velocity {} ", (Object)Float.valueOf(velocity));
            CompatibilityProvider.compatibility.spawnEntity(player, entityGrenade);
        } else {
            float velocity = instance.isThrowingFar() ? instance.getWeapon().getFarVelocity() : instance.getWeapon().getVelocity();
            EntityGrenade entityGrenade = new EntityGrenade.Builder().withThrower(player).withActivationTimestamp(activationTimestamp).withGrenade(instance.getWeapon()).withExplosionStrength(instance.getWeapon().getExplosionStrength()).withExplosionTimeout(instance.getWeapon().getExplosionTimeout()).withVelocity(velocity).withGravityVelocity(instance.getWeapon().getGravityVelocity()).withRotationSlowdownFactor(instance.getWeapon().getRotationSlowdownFactor()).withDestroyingBlocks(instance.getWeapon().isDestroyingBlocks()).build(modContext);
            logger.debug("Throwing velocity {} ", (Object)Float.valueOf(velocity));
            CompatibilityProvider.compatibility.spawnEntity(player, entityGrenade);
        }
    }

    int getParticleCount(float damage) {
        return (int)(-0.11 * (double)(damage - 30.0f) * (double)(damage - 30.0f) + 100.0);
    }
}


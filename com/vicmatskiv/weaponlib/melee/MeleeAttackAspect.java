/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.melee;

import com.vicmatskiv.weaponlib.CommonModContext;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTargetPoint;
import com.vicmatskiv.weaponlib.melee.MeleeState;
import com.vicmatskiv.weaponlib.melee.PlayerMeleeInstance;
import com.vicmatskiv.weaponlib.melee.TryAttackMessage;
import com.vicmatskiv.weaponlib.particle.SpawnParticleMessage;
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
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MeleeAttackAspect
implements Aspect<MeleeState, PlayerMeleeInstance> {
    private static final Logger logger = LogManager.getLogger(MeleeAttackAspect.class);
    private static final long STUB_DURATION = 250L;
    private static final long HEAVY_STUB_DURATION = 250L;
    private static final long ALERT_TIMEOUT = 300L;
    private static Predicate<PlayerMeleeInstance> attackTimeoutExpired = instance -> System.currentTimeMillis() > instance.getStateUpdateTimestamp() + 250L;
    private static Predicate<PlayerMeleeInstance> heavyAttackTimeoutExpired = instance -> System.currentTimeMillis() > instance.getStateUpdateTimestamp() + 250L;
    private static Predicate<PlayerMeleeInstance> attackCooldownTimeoutExpired = instance -> System.currentTimeMillis() > instance.getLastAttackTimestamp() + instance.getWeapon().getAttackCooldownTimeout();
    private static Predicate<PlayerMeleeInstance> heavyAttackCooldownTimeoutExpired = instance -> System.currentTimeMillis() > instance.getLastAttackTimestamp() + instance.getWeapon().getHeavyAttackCooldownTimeout();
    private static Predicate<PlayerMeleeInstance> readyToStab = instance -> System.currentTimeMillis() > instance.getStateUpdateTimestamp() + instance.getWeapon().getPrepareStubTimeout();
    private static Predicate<PlayerMeleeInstance> readyToHeavyStab = instance -> System.currentTimeMillis() > instance.getStateUpdateTimestamp() + instance.getWeapon().getPrepareHeavyStubTimeout();
    private static final Set<MeleeState> allowedAttackFromStates = new HashSet<MeleeState>(Arrays.asList(MeleeState.READY));
    private static final Set<MeleeState> allowedUpdateFromStates = new HashSet<MeleeState>(Arrays.asList(MeleeState.ATTACKING, MeleeState.HEAVY_ATTACKING, MeleeState.ATTACKING_STABBING, MeleeState.HEAVY_ATTACKING_STABBING, MeleeState.ALERT));
    private ModContext modContext;
    private StateManager<MeleeState, ? super PlayerMeleeInstance> stateManager;

    public MeleeAttackAspect(CommonModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setPermitManager(PermitManager permitManager) {
    }

    @Override
    public void setStateManager(StateManager<MeleeState, ? super PlayerMeleeInstance> stateManager) {
        this.stateManager = stateManager;
        stateManager.in(this).change(MeleeState.READY).to(MeleeState.ATTACKING).when(attackCooldownTimeoutExpired).manual().in(this).change(MeleeState.ATTACKING).to(MeleeState.ATTACKING_STABBING).withAction(i -> this.attack((PlayerMeleeInstance)i, false)).when(readyToStab).automatic().in(this).change(MeleeState.ATTACKING_STABBING).to(MeleeState.READY).withAction(i -> i.setLastAttackTimestamp(System.currentTimeMillis())).when(attackTimeoutExpired).automatic().in(this).change(MeleeState.READY).to(MeleeState.HEAVY_ATTACKING).when(heavyAttackCooldownTimeoutExpired).manual().in(this).change(MeleeState.HEAVY_ATTACKING).to(MeleeState.HEAVY_ATTACKING_STABBING).withAction(i -> this.attack((PlayerMeleeInstance)i, true)).when(readyToHeavyStab).automatic().in(this).change(MeleeState.HEAVY_ATTACKING_STABBING).to(MeleeState.READY).withAction(i -> i.setLastAttackTimestamp(System.currentTimeMillis())).when(heavyAttackTimeoutExpired).automatic();
    }

    void onAttackButtonClick(EntityPlayer player) {
        PlayerMeleeInstance weaponInstance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerMeleeInstance.class);
        if (weaponInstance != null) {
            this.stateManager.changeStateFromAnyOf(this, weaponInstance, allowedAttackFromStates, new MeleeState[]{MeleeState.ATTACKING, MeleeState.ALERT});
        }
    }

    void onHeavyAttackButtonClick(EntityPlayer player) {
        PlayerMeleeInstance weaponInstance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerMeleeInstance.class);
        if (weaponInstance != null) {
            this.stateManager.changeStateFromAnyOf(this, weaponInstance, allowedAttackFromStates, new MeleeState[]{MeleeState.HEAVY_ATTACKING, MeleeState.ALERT});
        }
    }

    void onUpdate(EntityPlayer player) {
        PlayerMeleeInstance weaponInstance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerMeleeInstance.class);
        if (weaponInstance != null) {
            this.stateManager.changeStateFromAnyOf(this, weaponInstance, allowedUpdateFromStates, new MeleeState[0]);
        }
    }

    private void cannotAttack(PlayerMeleeInstance meleeInstance) {
        this.modContext.getStatusMessageCenter().addAlertMessage(CompatibilityProvider.compatibility.getLocalizedString("gui.coolingDown", new Object[0]), 2, 200L, 100L);
        CompatibilityProvider.compatibility.playSound(meleeInstance.getPlayer(), this.modContext.getNoAmmoSound(), 1.0f, 1.0f);
    }

    private void attack(PlayerMeleeInstance meleeInstance, boolean isHeavyAttack) {
        CompatibleRayTraceResult objectMouseOver = CompatibilityProvider.compatibility.getObjectMouseOver();
        if (objectMouseOver != null) {
            EntityPlayer player = CompatibilityProvider.compatibility.clientPlayer();
            World world = CompatibilityProvider.compatibility.world((Entity)player);
            CompatibilityProvider.compatibility.playSound((EntityLivingBase)player, isHeavyAttack ? meleeInstance.getWeapon().getHeavyAtackSound() : meleeInstance.getWeapon().getLightAtackSound(), 1.0f, 1.0f);
            switch (objectMouseOver.getTypeOfHit()) {
                case ENTITY: {
                    this.attackEntity(objectMouseOver.getEntityHit(), player, meleeInstance, isHeavyAttack);
                    break;
                }
                case BLOCK: {
                    if (CompatibilityProvider.compatibility.isAirBlock(world, objectMouseOver.getBlockPos())) break;
                    CompatibilityProvider.compatibility.clickBlock(objectMouseOver.getBlockPos(), objectMouseOver.getSideHit());
                }
            }
        }
    }

    private void attackEntity(Entity entity, EntityPlayer player, PlayerMeleeInstance instance, boolean isHeavyAttack) {
        this.modContext.getChannel().getChannel().sendToServer((IMessage)new TryAttackMessage(instance, entity, isHeavyAttack));
        entity.func_70097_a(DamageSource.func_76365_a((EntityPlayer)player), instance.getWeapon().getDamage(isHeavyAttack));
    }

    public void serverAttack(EntityPlayer player, PlayerMeleeInstance instance, Entity entity, boolean isHeavyAttack) {
        logger.debug("Player {} hits {} with {} in state {} with damage {}", (Object)player, (Object)entity, (Object)instance, instance.getState(), (Object)Float.valueOf(instance.getWeapon().getDamage(isHeavyAttack)));
        float damage = instance.getWeapon().getDamage(isHeavyAttack);
        entity.func_70097_a(DamageSource.func_76365_a((EntityPlayer)player), damage);
        CompatibleTargetPoint point = new CompatibleTargetPoint(entity.field_71093_bK, entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 100.0);
        double motionX = entity.field_70165_t - player.field_70165_t;
        double motionY = entity.field_70163_u - player.field_70163_u;
        double motionZ = entity.field_70161_v - player.field_70161_v;
        int count = this.getParticleCount(damage);
        logger.debug("Generating {} particle(s) per damage {}", (Object)count, (Object)Float.valueOf(damage));
        this.modContext.getChannel().sendToAllAround(new SpawnParticleMessage(SpawnParticleMessage.ParticleType.BLOOD, count, entity.field_70165_t - motionX / 2.0, entity.field_70163_u - motionY / 2.0, entity.field_70161_v - motionZ / 2.0), point);
    }

    int getParticleCount(float damage) {
        return (int)(-0.11 * (double)(damage - 30.0f) * (double)(damage - 30.0f) + 100.0);
    }
}


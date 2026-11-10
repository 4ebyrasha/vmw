/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 */
package com.vicmatskiv.weaponlib.ai;

import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityAIBase;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class EntityAIAttackRangedWeapon
extends CompatibleEntityAIBase {
    private static final float DEFAULT_SECONDARY_EQUIPMENT_USE_CHANCE = 0.25f;
    private final EntityCustomMob entity;
    private final double moveSpeedAmp;
    private int attackCooldown;
    private final float maxAttackDistanceSquared;
    private int attackTime = -1;
    private int seeTime;
    private boolean strafingClockwise;
    private boolean strafingBackwards;
    private int strafingTime = -1;
    private Set<Class<?>> attackWithItemType = new HashSet();
    private float secondaryEquipmentUseChance;

    public EntityAIAttackRangedWeapon(EntityCustomMob customMob, double speedAmplifier, int delay, float maxDistance, Class<?> ... attackWithItemType) {
        this(customMob, speedAmplifier, delay, maxDistance, 0.25f, attackWithItemType);
    }

    public EntityAIAttackRangedWeapon(EntityCustomMob customMob, double speedAmplifier, int delay, float maxDistance, float secondaryEquipmentUseChance, Class<?> ... attackWithItemType) {
        for (Class<?> c : attackWithItemType) {
            this.attackWithItemType.add(c);
        }
        this.entity = customMob;
        this.moveSpeedAmp = speedAmplifier;
        this.attackCooldown = delay;
        this.maxAttackDistanceSquared = maxDistance * maxDistance;
        this.secondaryEquipmentUseChance = secondaryEquipmentUseChance;
        this.func_75248_a(3);
    }

    public boolean func_75250_a() {
        if (this.entity.func_70638_az() == null) {
            return false;
        }
        return this.isItemTypeInMainHand();
    }

    protected boolean isItemTypeInMainHand() {
        return CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)this.entity) != null && (this.attackWithItemType.isEmpty() || this.attackWithItemType.stream().anyMatch(a -> a.isInstance(CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)this.entity).func_77973_b())));
    }

    @Override
    public boolean func_75253_b() {
        return this.func_75250_a() || !this.entity.func_70661_as().func_75500_f();
    }

    public void func_75249_e() {
        super.func_75249_e();
        this.entity.func_184724_a(true);
    }

    public void func_75251_c() {
        super.func_75251_c();
        this.entity.func_184724_a(false);
        this.seeTime = 0;
        this.attackTime = -1;
        this.entity.func_184602_cy();
    }

    public void func_75246_d() {
        EntityLivingBase attackTarget = this.entity.func_70638_az();
        if (attackTarget != null) {
            boolean flag1;
            double d0 = this.entity.func_70092_e(attackTarget.field_70165_t, CompatibilityProvider.compatibility.getBoundingBox((Entity)attackTarget).getMinY(), attackTarget.field_70161_v);
            boolean canSeeTarget = this.entity.func_70635_at().func_75522_a((Entity)attackTarget);
            boolean bl = flag1 = this.seeTime > 0;
            if (canSeeTarget != flag1) {
                this.seeTime = 0;
            }
            this.seeTime = canSeeTarget ? ++this.seeTime : --this.seeTime;
            if (d0 <= (double)this.maxAttackDistanceSquared && this.seeTime >= 20) {
                this.entity.func_70661_as().func_75499_g();
                ++this.strafingTime;
            } else {
                this.entity.func_70661_as().func_75497_a((Entity)attackTarget, this.moveSpeedAmp);
                this.strafingTime = -1;
            }
            if (this.strafingTime >= 20) {
                if ((double)this.entity.func_70681_au().nextFloat() < 0.3) {
                    boolean bl2 = this.strafingClockwise = !this.strafingClockwise;
                }
                if ((double)this.entity.func_70681_au().nextFloat() < 0.3) {
                    this.strafingBackwards = !this.strafingBackwards;
                }
                this.strafingTime = 0;
            }
            if (CompatibilityProvider.compatibility.isStrafingSupported() && this.strafingTime > -1) {
                if (d0 > (double)(this.maxAttackDistanceSquared * 0.75f)) {
                    this.strafingBackwards = false;
                } else if (d0 < (double)(this.maxAttackDistanceSquared * 0.25f)) {
                    this.strafingBackwards = true;
                }
                CompatibilityProvider.compatibility.strafe(this.entity, this.strafingBackwards ? -0.5f : 0.5f, this.strafingClockwise ? 0.5f : -0.5f);
                this.entity.func_70625_a((Entity)attackTarget, 30.0f, 30.0f);
            } else {
                this.entity.func_70671_ap().func_75651_a((Entity)attackTarget, 30.0f, 30.0f);
            }
            if (this.entity.func_184587_cr()) {
                if (!canSeeTarget && this.seeTime < -60) {
                    this.entity.func_184602_cy();
                } else if (canSeeTarget && this.entity.isFacingEntity(attackTarget)) {
                    this.entity.func_184602_cy();
                    if (this.entity.getSecondaryEquipment() != null && this.entity.func_70681_au().nextFloat() < this.secondaryEquipmentUseChance) {
                        this.entity.attackWithSecondaryEquipment(attackTarget, 0.0f);
                    } else {
                        this.entity.func_82196_d(attackTarget, 0.0f);
                    }
                    this.attackTime = (this.attackCooldown >> 1) + this.entity.func_70681_au().nextInt(this.attackCooldown << 1);
                }
            } else if (--this.attackTime <= 0 && this.seeTime >= -60) {
                this.entity.setActiveMainHand();
            }
        }
    }
}


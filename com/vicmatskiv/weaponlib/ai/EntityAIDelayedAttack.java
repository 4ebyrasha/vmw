/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 */
package com.vicmatskiv.weaponlib.ai;

import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityAIBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class EntityAIDelayedAttack
extends CompatibleEntityAIBase {
    private EntityCustomMob entityCustomMob;
    private EntityLivingBase targetEntity;

    public EntityAIDelayedAttack(EntityCustomMob entityCustomMob) {
        this.entityCustomMob = entityCustomMob;
        this.func_75248_a(1);
    }

    public boolean func_75250_a() {
        EntityLivingBase entitylivingbase = this.entityCustomMob.func_70638_az();
        return this.entityCustomMob.getDelayedAttackTimerIncrement() > 0 || entitylivingbase != null && this.entityCustomMob.func_70068_e((Entity)entitylivingbase) < 9.0;
    }

    public void func_75249_e() {
        this.entityCustomMob.func_70661_as().func_75499_g();
        this.targetEntity = this.entityCustomMob.func_70638_az();
    }

    public void func_75251_c() {
        this.targetEntity = null;
    }

    public void func_75246_d() {
        if (this.targetEntity == null) {
            this.entityCustomMob.setDelayedAttackTimerIncrement(-1);
        } else if (this.entityCustomMob.func_70068_e((Entity)this.targetEntity) > 49.0) {
            this.entityCustomMob.setDelayedAttackTimerIncrement(-1);
        } else if (!this.entityCustomMob.func_70635_at().func_75522_a((Entity)this.targetEntity)) {
            this.entityCustomMob.setDelayedAttackTimerIncrement(-1);
        } else {
            this.entityCustomMob.setDelayedAttackTimerIncrement(1);
        }
    }

    @Override
    public boolean func_75253_b() {
        return this.func_75250_a() || !this.entityCustomMob.func_70661_as().func_75500_f();
    }
}


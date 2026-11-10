/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.DamageSource
 *  net.minecraftforge.event.entity.living.LivingHurtEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class CompatibleLivingHurtEvent {
    private LivingHurtEvent event;

    public CompatibleLivingHurtEvent(LivingHurtEvent event) {
        this.event = event;
    }

    public EntityLivingBase getEntityLiving() {
        return this.event.getEntityLiving();
    }

    public float getAmount() {
        return this.event.getAmount();
    }

    public void setAmount(float amount) {
        this.event.setAmount(amount);
    }

    public DamageSource getDamageSource() {
        return this.event.getSource();
    }
}


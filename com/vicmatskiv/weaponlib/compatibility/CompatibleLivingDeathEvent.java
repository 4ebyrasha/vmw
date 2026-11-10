/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.DamageSource
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class CompatibleLivingDeathEvent {
    private LivingDeathEvent e;

    public CompatibleLivingDeathEvent(LivingDeathEvent e) {
        this.e = e;
    }

    public EntityLivingBase getEntity() {
        return this.e.getEntityLiving();
    }

    public void setAmount(double amount) {
    }

    public DamageSource getDamageSource() {
        return this.e.getSource();
    }
}


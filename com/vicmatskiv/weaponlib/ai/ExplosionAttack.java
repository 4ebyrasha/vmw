/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package com.vicmatskiv.weaponlib.ai;

import com.vicmatskiv.weaponlib.ai.CustomMobAttack;
import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.ai.Timeable;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import net.minecraft.entity.Entity;

public class ExplosionAttack
implements CustomMobAttack,
Timeable {
    private float explosionRadius;
    private boolean isSmokeEnabled;
    private int duration;

    public ExplosionAttack(float explosionRadius, boolean isSmokeEnabled, int duration) {
        this.explosionRadius = explosionRadius;
        this.isSmokeEnabled = isSmokeEnabled;
        this.duration = duration;
    }

    @Override
    public boolean attackEntity(EntityCustomMob entityMob, Entity target) {
        CompatibilityProvider.compatibility.world((Entity)entityMob).func_72876_a((Entity)entityMob, entityMob.field_70165_t, entityMob.field_70163_u, entityMob.field_70161_v, this.explosionRadius, this.isSmokeEnabled);
        entityMob.func_70106_y();
        return false;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }
}


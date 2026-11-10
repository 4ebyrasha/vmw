/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.particle.ExplosionSmokeFX;
import net.minecraft.entity.EntityLivingBase;

public interface EffectManager {
    public void spawnSmokeParticle(EntityLivingBase var1, float var2, float var3);

    public void spawnFlashParticle(EntityLivingBase var1, float var2, float var3, float var4, float var5, String var6);

    public void spawnExplosionSmoke(double var1, double var3, double var5, double var7, double var9, double var11, float var13, int var14, ExplosionSmokeFX.Behavior var15, String var16);

    public void spawnExplosionParticle(double var1, double var3, double var5, double var7, double var9, double var11, float var13, int var14, String var15);
}


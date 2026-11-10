/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.EffectManager;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleVec3;
import com.vicmatskiv.weaponlib.compatibility.Interceptors;
import com.vicmatskiv.weaponlib.particle.ExplosionParticleFX;
import com.vicmatskiv.weaponlib.particle.ExplosionSmokeFX;
import com.vicmatskiv.weaponlib.particle.FlashFX;
import com.vicmatskiv.weaponlib.particle.SmokeFX;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

final class ClientEffectManager
implements EffectManager {
    ClientEffectManager() {
    }

    @Override
    public void spawnSmokeParticle(EntityLivingBase player, float xOffset, float yOffset) {
        if (CompatibilityProvider.compatibility.isShadersModEnabled()) {
            return;
        }
        double motionX = CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextGaussian() * 0.003;
        double motionY = CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextGaussian() * 0.003;
        double motionZ = CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextGaussian() * 0.003;
        CompatibleVec3 look = CompatibilityProvider.compatibility.getLookVec(player);
        float distance = 0.3f;
        float scale = 1.0f * CompatibilityProvider.compatibility.getSmokeEffectScaleFactor();
        float positionRandomizationFactor = 0.01f;
        double posX = player.field_70165_t + look.getXCoord() * (double)distance + (double)((CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextFloat() * 2.0f - 1.0f) * positionRandomizationFactor) + -look.getZCoord() * (double)xOffset;
        double posY = player.field_70163_u + look.getYCoord() * (double)distance + (double)((CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextFloat() * 2.0f - 1.0f) * positionRandomizationFactor) - (double)yOffset;
        double posZ = player.field_70161_v + look.getZCoord() * (double)distance + (double)((CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextFloat() * 2.0f - 1.0f) * positionRandomizationFactor) + look.getXCoord() * (double)xOffset;
        if (player instanceof EntityPlayer) {
            if (player.func_70093_af()) {
                posY -= (double)0.1f;
            } else if (Interceptors.isProning((EntityPlayer)player)) {
                posY -= (double)1.2f;
            }
        }
        SmokeFX smokeParticle = new SmokeFX(CompatibilityProvider.compatibility.world((Entity)player), posX, posY, posZ, scale, (float)motionX, (float)motionY, (float)motionZ);
        Minecraft.func_71410_x().field_71452_i.func_78873_a((Particle)smokeParticle);
    }

    @Override
    public void spawnFlashParticle(EntityLivingBase player, float flashIntensity, float flashScale, float xOffset, float yOffset, String texture) {
        if (CompatibilityProvider.compatibility.isShadersModEnabled()) {
            return;
        }
        float distance = 0.5f;
        float scale = 0.8f * CompatibilityProvider.compatibility.getEffectScaleFactor() * flashScale;
        float positionRandomizationFactor = 0.003f;
        CompatibleVec3 look = CompatibilityProvider.compatibility.getLookVec(player);
        float motionX = (float)CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextGaussian() * 0.003f;
        float motionY = (float)CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextGaussian() * 0.003f;
        float motionZ = (float)CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextGaussian() * 0.003f;
        double posX = player.field_70165_t + look.getXCoord() * (double)distance + (double)((CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextFloat() * 2.0f - 1.0f) * positionRandomizationFactor) + -look.getZCoord() * (double)xOffset;
        double posY = player.field_70163_u + look.getYCoord() * (double)distance + (double)((CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextFloat() * 2.0f - 1.0f) * positionRandomizationFactor) - (double)yOffset;
        double posZ = player.field_70161_v + look.getZCoord() * (double)distance + (double)((CompatibilityProvider.compatibility.world((Entity)player).field_73012_v.nextFloat() * 2.0f - 1.0f) * positionRandomizationFactor) + look.getXCoord() * (double)xOffset;
        if (player instanceof EntityPlayer) {
            if (player.func_70093_af()) {
                posY -= (double)0.1f;
            } else if (Interceptors.isProning((EntityPlayer)player)) {
                posY -= (double)1.2f;
            }
        }
        FlashFX flashParticle = new FlashFX(CompatibilityProvider.compatibility.world((Entity)player), posX, posY, posZ, scale, flashIntensity * CompatibilityProvider.compatibility.getFlashIntencityFactor(), motionX, motionY, motionZ, texture);
        Minecraft.func_71410_x().field_71452_i.func_78873_a((Particle)flashParticle);
    }

    @Override
    public void spawnExplosionSmoke(double posX, double posY, double posZ, double motionX, double motionY, double motionZ, float scale, int maxAge, ExplosionSmokeFX.Behavior behavior, String particleTexture) {
        World world = CompatibilityProvider.compatibility.world((Entity)CompatibilityProvider.compatibility.clientPlayer());
        ExplosionSmokeFX smokeParticle = new ExplosionSmokeFX(world, posX, posY, posZ, scale, (float)motionX, (float)motionY, (float)motionZ, maxAge, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, particleTexture);
        Minecraft.func_71410_x().field_71452_i.func_78873_a((Particle)smokeParticle);
    }

    @Override
    public void spawnExplosionParticle(double posX, double posY, double posZ, double motionX, double motionY, double motionZ, float scale, int maxAge, String particleTexture) {
        World world = CompatibilityProvider.compatibility.world((Entity)CompatibilityProvider.compatibility.clientPlayer());
        ExplosionParticleFX explosionParticle = new ExplosionParticleFX(world, posX, posY, posZ, scale, motionX, motionY, motionZ, maxAge, particleTexture);
        Minecraft.func_71410_x().field_71452_i.func_78873_a((Particle)explosionParticle);
    }
}


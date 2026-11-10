/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.particle.ParticleManager
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.world.World;

public class CompatibleParticleManager {
    private ParticleManager effectRenderer;

    public CompatibleParticleManager(WorldClient world) {
        this.effectRenderer = new ParticleManager((World)world, Minecraft.func_71410_x().func_110434_K());
    }

    public CompatibleParticleManager(ParticleManager effectRenderer) {
        this.effectRenderer = effectRenderer;
    }

    public ParticleManager getParticleManager() {
        return this.effectRenderer;
    }
}


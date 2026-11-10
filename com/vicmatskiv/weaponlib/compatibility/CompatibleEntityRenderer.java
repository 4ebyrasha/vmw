/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.entity.Entity
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

public abstract class CompatibleEntityRenderer
extends Render<Entity> {
    public CompatibleEntityRenderer() {
        super(Minecraft.func_71410_x().func_175598_ae());
    }

    public final void func_76986_a(Entity entity, double x, double y, double z, float entityYaw, float partialTicks) {
        this.doCompatibleRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected abstract void doCompatibleRender(Entity var1, double var2, double var4, double var6, float var8, float var9);
}


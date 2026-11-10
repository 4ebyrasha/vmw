/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class InvisibleEntityRenderer
extends CompatibleEntityRenderer {
    @Override
    public void doCompatibleRender(Entity entity, double x, double y, double z, float yaw, float tick) {
    }

    protected ResourceLocation func_110775_a(Entity entity) {
        return null;
    }
}


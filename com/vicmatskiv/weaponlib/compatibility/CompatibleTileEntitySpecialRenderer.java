/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleTileEntity;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class CompatibleTileEntitySpecialRenderer<T extends CompatibleTileEntity>
extends TileEntitySpecialRenderer<T> {
    public void render(T te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        super.func_192841_a(te, x, y, z, partialTicks, destroyStage, alpha);
    }
}


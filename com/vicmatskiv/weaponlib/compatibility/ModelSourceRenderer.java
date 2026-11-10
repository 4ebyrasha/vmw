/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.block.model.IBakedModel
 *  net.minecraft.client.renderer.block.model.ModelResourceLocation
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public abstract class ModelSourceRenderer
implements IBakedModel {
    private ModelResourceLocation resourceLocation;

    public ModelResourceLocation getResourceLocation() {
        return this.resourceLocation;
    }

    public void setResourceLocation(ModelResourceLocation resourceLocation) {
        this.resourceLocation = resourceLocation;
    }
}


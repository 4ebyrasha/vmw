/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.util.ResourceLocation
 */
package com.vicmatskiv.weaponlib.ai;

import com.vicmatskiv.weaponlib.ai.EntityConfiguration;
import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderBiped;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.util.ResourceLocation;

public class RenderCustomMob
extends CompatibleRenderBiped<EntityCustomMob> {
    public RenderCustomMob(ModelBiped model) {
        super(model, 0.5f);
    }

    @Override
    protected ResourceLocation getCompatibleEntityTexture(EntityCustomMob entity) {
        EntityConfiguration configuration = entity.getConfiguration();
        return configuration.getTexturedModelVariants().get((int)entity.getVariant()).textureResource;
    }

    @Override
    public void prepareCompatibleRender(EntityCustomMob entity, double x, double y, double z, float entityYaw, float partialTicks) {
        EntityConfiguration configuration = entity.getConfiguration();
        this.field_77045_g = configuration.getTexturedModelVariants().get((int)entity.getVariant()).model;
    }
}


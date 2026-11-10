/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TracerProjectile
extends ModelBase {
    ModelRenderer tracreprojectile;

    public TracerProjectile() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.tracreprojectile = new ModelRenderer((ModelBase)this, 0, 0);
        this.tracreprojectile.func_78789_a(0.0f, 0.0f, 0.0f, 0, 1, 500);
        this.tracreprojectile.func_78793_a(-5.0f, -5.0f, 10.0f);
        this.tracreprojectile.func_78787_b(256, 256);
        this.tracreprojectile.field_78809_i = true;
        this.setRotation(this.tracreprojectile, 0.5f, -29.8f, -45.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.tracreprojectile.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }

    public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.func_78087_a(f, f1, f2, f3, f4, f5, entity);
    }
}


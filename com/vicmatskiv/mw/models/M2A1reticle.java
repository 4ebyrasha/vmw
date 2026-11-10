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

public class M2A1reticle
extends ModelBase {
    ModelRenderer m2a1reticle1;
    ModelRenderer m2a1reticle2;

    public M2A1reticle() {
        this.field_78090_t = 64;
        this.field_78089_u = 32;
        this.m2a1reticle1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.m2a1reticle1.func_78789_a(0.0f, 0.0f, 0.0f, 1, 10, 0);
        this.m2a1reticle1.func_78793_a(0.0f, -1.0f, 0.0f);
        this.m2a1reticle1.func_78787_b(64, 32);
        this.m2a1reticle1.field_78809_i = true;
        this.setRotation(this.m2a1reticle1, 0.0f, 0.0f, 0.0f);
        this.m2a1reticle2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.m2a1reticle2.func_78789_a(0.0f, 0.0f, 0.0f, 10, 1, 0);
        this.m2a1reticle2.func_78793_a(-4.5f, 3.5f, 0.0f);
        this.m2a1reticle2.func_78787_b(64, 32);
        this.m2a1reticle2.field_78809_i = true;
        this.setRotation(this.m2a1reticle2, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.m2a1reticle1.func_78785_a(f5);
        this.m2a1reticle2.func_78785_a(f5);
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


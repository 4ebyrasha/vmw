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

public class ChainsawFuel
extends ModelBase {
    ModelRenderer fuel1;
    ModelRenderer fuel2;
    ModelRenderer fuel3;
    ModelRenderer fuel4;

    public ChainsawFuel() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.fuel1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.fuel1.func_78789_a(0.0f, 0.0f, 0.0f, 6, 15, 6);
        this.fuel1.func_78793_a(0.0f, -13.0f, 0.0f);
        this.fuel1.func_78787_b(128, 128);
        this.fuel1.field_78809_i = true;
        this.setRotation(this.fuel1, 0.0f, 0.0f, 0.0f);
        this.fuel2 = new ModelRenderer((ModelBase)this, 0, 50);
        this.fuel2.func_78789_a(0.0f, 0.0f, 0.0f, 7, 9, 7);
        this.fuel2.func_78793_a(-0.5f, -10.0f, -0.5f);
        this.fuel2.func_78787_b(128, 128);
        this.fuel2.field_78809_i = true;
        this.setRotation(this.fuel2, 0.0f, 0.0f, 0.0f);
        this.fuel3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.fuel3.func_78789_a(0.0f, 0.0f, 0.0f, 7, 3, 7);
        this.fuel3.func_78793_a(-0.5f, -13.5f, -0.5f);
        this.fuel3.func_78787_b(128, 128);
        this.fuel3.field_78809_i = true;
        this.setRotation(this.fuel3, 0.0f, 0.0f, 0.0f);
        this.fuel4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.fuel4.func_78789_a(0.0f, 0.0f, 0.0f, 7, 3, 7);
        this.fuel4.func_78793_a(-0.5f, -0.5f, -0.5f);
        this.fuel4.func_78787_b(128, 128);
        this.fuel4.field_78809_i = true;
        this.setRotation(this.fuel4, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.fuel1.func_78785_a(f5);
        this.fuel2.func_78785_a(f5);
        this.fuel3.func_78785_a(f5);
        this.fuel4.func_78785_a(f5);
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


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

public class TV
extends ModelBase {
    ModelRenderer tv1;
    ModelRenderer tv2;
    ModelRenderer tv3;
    ModelRenderer tv4;
    ModelRenderer tv5;
    ModelRenderer tv6;
    ModelRenderer tv7;
    ModelRenderer tv8;

    public TV() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.tv1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.tv1.func_78789_a(0.0f, 0.0f, 0.0f, 14, 1, 5);
        this.tv1.func_78793_a(-7.0f, 23.0f, -3.0f);
        this.tv1.func_78787_b(128, 128);
        this.tv1.field_78809_i = true;
        this.setRotation(this.tv1, 0.0f, 0.0f, 0.0f);
        this.tv2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.tv2.func_78789_a(0.0f, -3.0f, 0.0f, 7, 11, 3);
        this.tv2.func_78793_a(-3.5f, 15.5f, -1.5f);
        this.tv2.func_78787_b(128, 128);
        this.tv2.field_78809_i = true;
        this.setRotation(this.tv2, -0.0371786f, 0.0f, 0.0f);
        this.tv3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.tv3.func_78789_a(0.0f, 0.0f, 0.0f, 43, 2, 1);
        this.tv3.func_78793_a(-21.5f, 18.5f, -2.5f);
        this.tv3.func_78787_b(128, 128);
        this.tv3.field_78809_i = true;
        this.setRotation(this.tv3, 0.0f, 0.0f, 0.0f);
        this.tv4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.tv4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 19, 1);
        this.tv4.func_78793_a(-21.5f, -0.5f, -2.5f);
        this.tv4.func_78787_b(128, 128);
        this.tv4.field_78809_i = true;
        this.setRotation(this.tv4, 0.0f, 0.0f, 0.0f);
        this.tv5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.tv5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 19, 1);
        this.tv5.func_78793_a(20.5f, -0.5f, -2.5f);
        this.tv5.func_78787_b(128, 128);
        this.tv5.field_78809_i = true;
        this.setRotation(this.tv5, 0.0f, 0.0f, 0.0f);
        this.tv6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.tv6.func_78789_a(0.0f, 0.0f, 0.0f, 43, 1, 1);
        this.tv6.func_78793_a(-21.5f, -1.5f, -2.5f);
        this.tv6.func_78787_b(128, 128);
        this.tv6.field_78809_i = true;
        this.setRotation(this.tv6, 0.0f, 0.0f, 0.0f);
        this.tv7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.tv7.func_78789_a(0.0f, 0.0f, 0.0f, 42, 20, 1);
        this.tv7.func_78793_a(-21.0f, -1.0f, -1.5f);
        this.tv7.func_78787_b(128, 128);
        this.tv7.field_78809_i = true;
        this.setRotation(this.tv7, 0.0f, 0.0f, 0.0f);
        this.tv8 = new ModelRenderer((ModelBase)this, 0, 50);
        this.tv8.func_78789_a(0.0f, 0.0f, 0.0f, 41, 19, 1);
        this.tv8.func_78793_a(-20.5f, -0.5f, -2.4f);
        this.tv8.func_78787_b(128, 128);
        this.tv8.field_78809_i = true;
        this.setRotation(this.tv8, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.tv1.func_78785_a(f5);
        this.tv2.func_78785_a(f5);
        this.tv3.func_78785_a(f5);
        this.tv4.func_78785_a(f5);
        this.tv5.func_78785_a(f5);
        this.tv6.func_78785_a(f5);
        this.tv7.func_78785_a(f5);
        this.tv8.func_78785_a(f5);
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


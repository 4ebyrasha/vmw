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

public class HomeChair
extends ModelBase {
    ModelRenderer chair1;
    ModelRenderer chair2;
    ModelRenderer chair3;
    ModelRenderer chair4;
    ModelRenderer chair5;
    ModelRenderer chair6;

    public HomeChair() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.chair1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.chair1.func_78789_a(0.0f, 0.0f, 0.0f, 14, 4, 13);
        this.chair1.func_78793_a(-7.0f, 13.0f, -6.0f);
        this.chair1.func_78787_b(128, 128);
        this.chair1.field_78809_i = true;
        this.setRotation(this.chair1, 0.0f, 0.0f, 0.0f);
        this.chair2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.chair2.func_78789_a(0.0f, 0.0f, 0.0f, 14, 12, 3);
        this.chair2.func_78793_a(-7.0f, 17.0f, 7.0f);
        this.chair2.func_78787_b(128, 128);
        this.chair2.field_78809_i = true;
        this.setRotation(this.chair2, 2.825574f, 0.0f, 0.0f);
        this.chair3 = new ModelRenderer((ModelBase)this, 0, 50);
        this.chair3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 7, 2);
        this.chair3.func_78793_a(-6.5f, 17.0f, -5.5f);
        this.chair3.func_78787_b(128, 128);
        this.chair3.field_78809_i = true;
        this.setRotation(this.chair3, 0.0f, 0.0f, 0.0f);
        this.chair4 = new ModelRenderer((ModelBase)this, 0, 50);
        this.chair4.func_78789_a(0.0f, 0.0f, 0.0f, 2, 7, 2);
        this.chair4.func_78793_a(4.5f, 17.0f, -5.5f);
        this.chair4.func_78787_b(128, 128);
        this.chair4.field_78809_i = true;
        this.setRotation(this.chair4, 0.0f, 0.0f, 0.0f);
        this.chair5 = new ModelRenderer((ModelBase)this, 0, 50);
        this.chair5.func_78789_a(0.0f, 0.0f, 0.0f, 2, 7, 2);
        this.chair5.func_78793_a(4.5f, 17.0f, 4.5f);
        this.chair5.func_78787_b(128, 128);
        this.chair5.field_78809_i = true;
        this.setRotation(this.chair5, 0.0f, 0.0f, 0.0f);
        this.chair6 = new ModelRenderer((ModelBase)this, 0, 50);
        this.chair6.func_78789_a(0.0f, 0.0f, 0.0f, 2, 7, 2);
        this.chair6.func_78793_a(-6.5f, 17.0f, 4.5f);
        this.chair6.func_78787_b(128, 128);
        this.chair6.field_78809_i = true;
        this.setRotation(this.chair6, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.chair1.func_78785_a(f5);
        this.chair2.func_78785_a(f5);
        this.chair3.func_78785_a(f5);
        this.chair4.func_78785_a(f5);
        this.chair5.func_78785_a(f5);
        this.chair6.func_78785_a(f5);
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


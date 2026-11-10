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

public class CeilingLampAlt
extends ModelBase {
    ModelRenderer light1;
    ModelRenderer light2;
    ModelRenderer light3;
    ModelRenderer light4;
    ModelRenderer light5;
    ModelRenderer light6;
    ModelRenderer light7;

    public CeilingLampAlt() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.light1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.light1.func_78789_a(0.0f, 0.0f, 0.0f, 32, 2, 7);
        this.light1.func_78793_a(-16.0f, 14.0f, -3.5f);
        this.light1.func_78787_b(128, 128);
        this.light1.field_78809_i = true;
        this.setRotation(this.light1, 0.0f, 0.0f, 0.0f);
        this.light2 = new ModelRenderer((ModelBase)this, 0, 20);
        this.light2.func_78789_a(0.0f, 0.0f, 0.0f, 30, 2, 2);
        this.light2.func_78793_a(-15.0f, 16.5f, -2.5f);
        this.light2.func_78787_b(128, 128);
        this.light2.field_78809_i = true;
        this.setRotation(this.light2, 0.7853982f, 0.0f, 0.0f);
        this.light3 = new ModelRenderer((ModelBase)this, 0, 20);
        this.light3.func_78789_a(0.0f, 0.0f, 0.0f, 30, 2, 2);
        this.light3.func_78793_a(-15.0f, 16.5f, -0.5f);
        this.light3.func_78787_b(128, 128);
        this.light3.field_78809_i = true;
        this.setRotation(this.light3, 0.7853982f, 0.0f, 0.0f);
        this.light4 = new ModelRenderer((ModelBase)this, 0, 40);
        this.light4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 1);
        this.light4.func_78793_a(-15.0f, 10.0f, -2.0f);
        this.light4.func_78787_b(128, 128);
        this.light4.field_78809_i = true;
        this.setRotation(this.light4, 0.0f, 0.7853982f, 0.0f);
        this.light5 = new ModelRenderer((ModelBase)this, 0, 40);
        this.light5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 1);
        this.light5.func_78793_a(-15.0f, 10.0f, 2.0f);
        this.light5.func_78787_b(128, 128);
        this.light5.field_78809_i = true;
        this.setRotation(this.light5, 0.0f, 0.7853982f, 0.0f);
        this.light6 = new ModelRenderer((ModelBase)this, 0, 40);
        this.light6.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 1);
        this.light6.func_78793_a(15.0f, 10.0f, 2.0f);
        this.light6.func_78787_b(128, 128);
        this.light6.field_78809_i = true;
        this.setRotation(this.light6, 0.0f, -2.356194f, 0.0f);
        this.light7 = new ModelRenderer((ModelBase)this, 0, 40);
        this.light7.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 1);
        this.light7.func_78793_a(15.0f, 10.0f, -2.0f);
        this.light7.func_78787_b(128, 128);
        this.light7.field_78809_i = true;
        this.setRotation(this.light7, 0.0f, -2.356194f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.light1.func_78785_a(f5);
        this.light2.func_78785_a(f5);
        this.light3.func_78785_a(f5);
        this.light4.func_78785_a(f5);
        this.light5.func_78785_a(f5);
        this.light6.func_78785_a(f5);
        this.light7.func_78785_a(f5);
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


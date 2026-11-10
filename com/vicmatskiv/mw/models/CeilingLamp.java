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

public class CeilingLamp
extends ModelBase {
    ModelRenderer light1;
    ModelRenderer light2;
    ModelRenderer light3;
    ModelRenderer light4;

    public CeilingLamp() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.light1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.light1.func_78789_a(0.0f, 0.0f, 0.0f, 16, 3, 3);
        this.light1.func_78793_a(-8.0f, 14.0f, -1.5f);
        this.light1.func_78787_b(128, 128);
        this.light1.field_78809_i = true;
        this.setRotation(this.light1, 0.0f, 0.0f, 0.0f);
        this.light2 = new ModelRenderer((ModelBase)this, 0, 60);
        this.light2.func_78789_a(0.0f, 0.0f, 0.0f, 16, 2, 2);
        this.light2.func_78793_a(-8.0f, 17.5f, -1.4f);
        this.light2.func_78787_b(128, 128);
        this.light2.field_78809_i = true;
        this.setRotation(this.light2, 0.7853982f, 0.0f, 0.0f);
        this.light3 = new ModelRenderer((ModelBase)this, 0, 20);
        this.light3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 3, 3);
        this.light3.func_78793_a(-0.5f, 17.2f, -2.1f);
        this.light3.func_78787_b(128, 128);
        this.light3.field_78809_i = true;
        this.setRotation(this.light3, 0.7853982f, 0.0f, 0.0f);
        this.light4 = new ModelRenderer((ModelBase)this, 0, 20);
        this.light4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 35, 1);
        this.light4.func_78793_a(-0.7f, -21.0f, 0.0f);
        this.light4.func_78787_b(128, 128);
        this.light4.field_78809_i = true;
        this.setRotation(this.light4, 0.0f, 0.7853982f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.light1.func_78785_a(f5);
        this.light2.func_78785_a(f5);
        this.light3.func_78785_a(f5);
        this.light4.func_78785_a(f5);
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


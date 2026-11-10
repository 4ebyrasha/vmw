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

public class M4Grip
extends ModelBase {
    ModelRenderer grip1;
    ModelRenderer grip2;
    ModelRenderer grip3;
    ModelRenderer grip4;
    ModelRenderer grip5;
    ModelRenderer grip6;
    ModelRenderer grip7;
    ModelRenderer grip8;
    ModelRenderer grip9;
    ModelRenderer grip10;
    ModelRenderer grip11;
    ModelRenderer grip12;

    public M4Grip() {
        this.field_78090_t = 256;
        this.field_78089_u = 128;
        this.grip1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip1.func_78789_a(0.0f, 0.0f, 0.0f, 4, 5, 5);
        this.grip1.func_78793_a(-3.5f, -7.0f, -6.0f);
        this.grip1.func_78787_b(256, 128);
        this.grip1.field_78809_i = true;
        this.setRotation(this.grip1, 0.0f, 0.0f, 0.0f);
        this.grip2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip2.func_78789_a(0.0f, -0.5f, 0.0f, 4, 11, 4);
        this.grip2.func_78793_a(-3.5f, -2.0f, -5.5f);
        this.grip2.func_78787_b(256, 128);
        this.grip2.field_78809_i = true;
        this.setRotation(this.grip2, 0.3717861f, 0.0f, 0.0f);
        this.grip3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip3.func_78789_a(0.0f, 0.0f, 0.0f, 4, 3, 12);
        this.grip3.func_78793_a(-3.5f, -5.0f, -1.0f);
        this.grip3.func_78787_b(256, 128);
        this.grip3.field_78809_i = true;
        this.setRotation(this.grip3, -1.07818f, 0.0f, 0.0f);
        this.grip4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip4.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 7);
        this.grip4.func_78793_a(-3.5f, 7.2f, -2.6f);
        this.grip4.func_78787_b(256, 128);
        this.grip4.field_78809_i = true;
        this.setRotation(this.grip4, 0.2230717f, 0.0f, 0.0f);
        this.grip5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip5.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 1);
        this.grip5.func_78793_a(-3.5f, 7.2f, -2.6f);
        this.grip5.func_78787_b(256, 128);
        this.grip5.field_78809_i = true;
        this.setRotation(this.grip5, 1.07818f, 0.0f, 0.0f);
        this.grip6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip6.func_78789_a(0.0f, 0.0f, 0.0f, 3, 5, 1);
        this.grip6.func_78793_a(-3.0f, -7.0f, -1.0f);
        this.grip6.func_78787_b(256, 128);
        this.grip6.field_78809_i = true;
        this.setRotation(this.grip6, 0.0f, 0.0f, 0.0f);
        this.grip7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip7.func_78789_a(0.0f, -1.0f, 0.0f, 3, 1, 12);
        this.grip7.func_78793_a(-3.0f, -5.0f, -1.0f);
        this.grip7.func_78787_b(256, 128);
        this.grip7.field_78809_i = true;
        this.setRotation(this.grip7, -1.07818f, 0.0f, 0.0f);
        this.grip8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip8.func_78789_a(0.0f, 0.0f, 6.5f, 4, 1, 1);
        this.grip8.func_78793_a(-3.5f, 7.2f, -2.6f);
        this.grip8.func_78787_b(256, 128);
        this.grip8.field_78809_i = true;
        this.setRotation(this.grip8, 0.2230717f, 0.0f, 0.0f);
        this.grip9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip9.func_78789_a(0.0f, 0.0f, 7.5f, 3, 1, 1);
        this.grip9.func_78793_a(-3.0f, 7.2f, -2.6f);
        this.grip9.func_78787_b(256, 128);
        this.grip9.field_78809_i = true;
        this.setRotation(this.grip9, 0.2230717f, 0.0f, 0.0f);
        this.grip10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip10.func_78789_a(0.0f, -0.3f, 7.5f, 3, 1, 1);
        this.grip10.func_78793_a(-3.0f, 7.2f, -2.6f);
        this.grip10.func_78787_b(256, 128);
        this.grip10.field_78809_i = true;
        this.setRotation(this.grip10, 0.2230717f, 0.0f, 0.0f);
        this.grip11 = new ModelRenderer((ModelBase)this, 0, 15);
        this.grip11.func_78789_a(0.0f, 0.5f, 1.0f, 1, 9, 4);
        this.grip11.func_78793_a(-0.4f, -2.0f, -5.5f);
        this.grip11.func_78787_b(256, 128);
        this.grip11.field_78809_i = true;
        this.setRotation(this.grip11, 0.3717861f, 0.0f, 0.0f);
        this.grip12 = new ModelRenderer((ModelBase)this, 0, 15);
        this.grip12.func_78789_a(0.0f, 0.5f, 1.0f, 1, 9, 4);
        this.grip12.func_78793_a(-3.6f, -2.0f, -5.5f);
        this.grip12.func_78787_b(256, 128);
        this.grip12.field_78809_i = true;
        this.setRotation(this.grip12, 0.3717861f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.grip1.func_78785_a(f5);
        this.grip2.func_78785_a(f5);
        this.grip3.func_78785_a(f5);
        this.grip4.func_78785_a(f5);
        this.grip5.func_78785_a(f5);
        this.grip6.func_78785_a(f5);
        this.grip7.func_78785_a(f5);
        this.grip8.func_78785_a(f5);
        this.grip9.func_78785_a(f5);
        this.grip10.func_78785_a(f5);
        this.grip11.func_78785_a(f5);
        this.grip12.func_78785_a(f5);
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


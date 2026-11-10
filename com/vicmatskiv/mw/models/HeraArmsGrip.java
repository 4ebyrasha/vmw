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

public class HeraArmsGrip
extends ModelBase {
    ModelRenderer grip1;
    ModelRenderer grip2;
    ModelRenderer grip3;
    ModelRenderer grip4;
    ModelRenderer grip5;
    ModelRenderer grip6;
    ModelRenderer grip7;
    ModelRenderer grip11;
    ModelRenderer grip12;
    ModelRenderer grip13;
    ModelRenderer grip14;
    ModelRenderer grip15;

    public HeraArmsGrip() {
        this.field_78090_t = 256;
        this.field_78089_u = 128;
        this.grip1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip1.func_78789_a(0.0f, 0.0f, 0.0f, 4, 5, 5);
        this.grip1.func_78793_a(-3.5f, -7.0f, -6.0f);
        this.grip1.func_78787_b(64, 32);
        this.grip1.field_78809_i = true;
        this.setRotation(this.grip1, 0.0f, 0.0f, 0.0f);
        this.grip2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip2.func_78789_a(0.0f, -0.5f, 0.0f, 4, 11, 4);
        this.grip2.func_78793_a(-3.5f, -2.0f, -5.5f);
        this.grip2.func_78787_b(64, 32);
        this.grip2.field_78809_i = true;
        this.setRotation(this.grip2, 0.3717861f, 0.0f, 0.0f);
        this.grip3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip3.func_78789_a(0.0f, 0.0f, -0.2f, 4, 3, 13);
        this.grip3.func_78793_a(-3.5f, -5.0f, -1.0f);
        this.grip3.func_78787_b(64, 32);
        this.grip3.field_78809_i = true;
        this.setRotation(this.grip3, -1.041001f, 0.0f, 0.0f);
        this.grip4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip4.func_78789_a(0.0f, 0.0f, 0.0f, 4, 2, 1);
        this.grip4.func_78793_a(-3.5f, 7.2f, -2.6f);
        this.grip4.func_78787_b(64, 32);
        this.grip4.field_78809_i = true;
        this.setRotation(this.grip4, 0.3717861f, 0.0f, 0.0f);
        this.grip5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip5.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 1);
        this.grip5.func_78793_a(-3.5f, 7.2f, -2.6f);
        this.grip5.func_78787_b(64, 32);
        this.grip5.field_78809_i = true;
        this.setRotation(this.grip5, 1.07818f, 0.0f, 0.0f);
        this.grip6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip6.func_78789_a(0.0f, 0.0f, 0.0f, 3, 5, 2);
        this.grip6.func_78793_a(-3.0f, -8.0f, -1.5f);
        this.grip6.func_78787_b(64, 32);
        this.grip6.field_78809_i = true;
        this.setRotation(this.grip6, 0.0f, 0.0f, 0.0f);
        this.grip7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip7.func_78789_a(0.0f, -1.0f, 0.0f, 3, 1, 12);
        this.grip7.func_78793_a(-3.0f, -5.0f, -1.0f);
        this.grip7.func_78787_b(64, 32);
        this.grip7.field_78809_i = true;
        this.setRotation(this.grip7, -1.07818f, 0.0f, 0.0f);
        this.grip11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip11.func_78789_a(0.0f, 0.0f, 1.0f, 1, 12, 4);
        this.grip11.func_78793_a(-0.4f, -2.0f, -5.5f);
        this.grip11.func_78787_b(64, 32);
        this.grip11.field_78809_i = true;
        this.setRotation(this.grip11, 0.3717861f, 0.0f, 0.0f);
        this.grip12 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip12.func_78789_a(0.0f, 0.5f, 1.0f, 1, 9, 4);
        this.grip12.func_78793_a(-3.6f, -2.0f, -5.5f);
        this.grip12.func_78787_b(64, 32);
        this.grip12.field_78809_i = true;
        this.setRotation(this.grip12, 0.3717861f, 0.0f, 0.0f);
        this.grip13 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip13.func_78789_a(0.0f, -2.0f, 0.0f, 4, 3, 3);
        this.grip13.func_78793_a(-3.5f, 8.1f, -1.8f);
        this.grip13.func_78787_b(64, 32);
        this.grip13.field_78809_i = true;
        this.setRotation(this.grip13, -0.0743572f, 0.0f, 0.0f);
        this.grip14 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip14.func_78789_a(0.0f, 0.0f, 0.0f, 4, 7, 1);
        this.grip14.func_78793_a(-3.5f, 9.3f, 1.1f);
        this.grip14.func_78787_b(64, 32);
        this.grip14.field_78809_i = true;
        this.setRotation(this.grip14, 2.193538f, 0.0f, 0.0f);
        this.grip15 = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip15.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 2);
        this.grip15.func_78793_a(-3.5f, 4.5f, 4.2f);
        this.grip15.func_78787_b(64, 32);
        this.grip15.field_78809_i = true;
        this.setRotation(this.grip15, 0.0f, 0.0f, 0.0f);
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
        this.grip11.func_78785_a(f5);
        this.grip12.func_78785_a(f5);
        this.grip13.func_78785_a(f5);
        this.grip14.func_78785_a(f5);
        this.grip15.func_78785_a(f5);
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


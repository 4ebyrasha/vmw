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

public class F2000Scope2
extends ModelBase {
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;

    public F2000Scope2() {
        this.field_78090_t = 64;
        this.field_78089_u = 32;
        this.Shape1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape1.func_78789_a(0.0f, 0.0f, 0.0f, 5, 2, 1);
        this.Shape1.func_78793_a(-0.5f, 0.0f, 0.0f);
        this.Shape1.func_78787_b(64, 32);
        this.Shape1.field_78809_i = true;
        this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
        this.Shape2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 5, 1);
        this.Shape2.func_78793_a(-4.0f, -6.5f, 0.0f);
        this.Shape2.func_78787_b(64, 32);
        this.Shape2.field_78809_i = true;
        this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
        this.Shape3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 5, 1);
        this.Shape3.func_78793_a(6.0f, -6.5f, 0.0f);
        this.Shape3.func_78787_b(64, 32);
        this.Shape3.field_78809_i = true;
        this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
        this.Shape4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape4.func_78789_a(0.0f, 0.0f, 0.0f, 5, 2, 1);
        this.Shape4.func_78793_a(-0.5f, -10.0f, 0.0f);
        this.Shape4.func_78787_b(64, 32);
        this.Shape4.field_78809_i = true;
        this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
        this.Shape8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape8.func_78789_a(0.0f, 0.0f, 0.0f, 3, 2, 1);
        this.Shape8.func_78793_a(-0.5f, 2.0f, 0.0f);
        this.Shape8.func_78787_b(64, 32);
        this.Shape8.field_78809_i = true;
        this.setRotation(this.Shape8, 0.0f, 0.0f, -2.356194f);
        this.Shape9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape9.func_78789_a(2.9f, 0.0f, 0.0f, 2, 2, 1);
        this.Shape9.func_78793_a(-0.5f, 2.0f, 0.0f);
        this.Shape9.func_78787_b(64, 32);
        this.Shape9.field_78809_i = true;
        this.setRotation(this.Shape9, 0.0f, 0.0f, -2.356194f);
        this.Shape10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape10.func_78789_a(0.0f, 0.0f, 0.0f, 3, 2, 1);
        this.Shape10.func_78793_a(-4.0f, -6.5f, 0.0f);
        this.Shape10.func_78787_b(64, 32);
        this.Shape10.field_78809_i = true;
        this.setRotation(this.Shape10, 0.0f, 0.0f, -0.7853982f);
        this.Shape11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape11.func_78789_a(2.9f, 0.0f, 0.0f, 2, 2, 1);
        this.Shape11.func_78793_a(-4.0f, -6.5f, 0.0f);
        this.Shape11.func_78787_b(64, 32);
        this.Shape11.field_78809_i = true;
        this.setRotation(this.Shape11, 0.0f, 0.0f, -0.7853982f);
        this.Shape12 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape12.func_78789_a(0.0f, 0.0f, 0.0f, 3, 2, 1);
        this.Shape12.func_78793_a(4.5f, -10.0f, 0.0f);
        this.Shape12.func_78787_b(64, 32);
        this.Shape12.field_78809_i = true;
        this.setRotation(this.Shape12, 0.0f, 0.0f, 0.7853982f);
        this.Shape13 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape13.func_78789_a(2.9f, 0.0f, 0.0f, 2, 2, 1);
        this.Shape13.func_78793_a(4.5f, -10.0f, 0.0f);
        this.Shape13.func_78787_b(64, 32);
        this.Shape13.field_78809_i = true;
        this.setRotation(this.Shape13, 0.0f, 0.0f, 0.7853982f);
        this.Shape14 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape14.func_78789_a(0.0f, 0.0f, 0.0f, 2, 3, 1);
        this.Shape14.func_78793_a(4.5f, 2.0f, 0.0f);
        this.Shape14.func_78787_b(64, 32);
        this.Shape14.field_78809_i = true;
        this.setRotation(this.Shape14, 0.0f, 0.0f, -2.356194f);
        this.Shape15 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape15.func_78789_a(0.0f, 2.9f, 0.0f, 2, 2, 1);
        this.Shape15.func_78793_a(4.5f, 2.0f, 0.0f);
        this.Shape15.func_78787_b(64, 32);
        this.Shape15.field_78809_i = true;
        this.setRotation(this.Shape15, 0.0f, 0.0f, -2.356194f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Shape1.func_78785_a(f5);
        this.Shape2.func_78785_a(f5);
        this.Shape3.func_78785_a(f5);
        this.Shape4.func_78785_a(f5);
        this.Shape8.func_78785_a(f5);
        this.Shape9.func_78785_a(f5);
        this.Shape10.func_78785_a(f5);
        this.Shape11.func_78785_a(f5);
        this.Shape12.func_78785_a(f5);
        this.Shape13.func_78785_a(f5);
        this.Shape14.func_78785_a(f5);
        this.Shape15.func_78785_a(f5);
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


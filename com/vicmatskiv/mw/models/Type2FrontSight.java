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

public class Type2FrontSight
extends ModelBase {
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;

    public Type2FrontSight() {
        this.field_78090_t = 64;
        this.field_78089_u = 32;
        this.Shape1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape1.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 10);
        this.Shape1.func_78793_a(-0.5f, 1.0f, 0.0f);
        this.Shape1.func_78787_b(64, 32);
        this.Shape1.field_78809_i = true;
        this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
        this.Shape2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape2.func_78789_a(0.0f, 0.0f, 0.0f, 5, 1, 10);
        this.Shape2.func_78793_a(-1.0f, 0.0f, 0.0f);
        this.Shape2.func_78787_b(64, 32);
        this.Shape2.field_78809_i = true;
        this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
        this.Shape3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 10);
        this.Shape3.func_78793_a(-1.0f, 1.0f, 0.0f);
        this.Shape3.func_78787_b(64, 32);
        this.Shape3.field_78809_i = true;
        this.setRotation(this.Shape3, 0.0f, 0.0f, -0.5251479f);
        this.Shape4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape4.func_78789_a(-1.0f, 0.0f, 0.0f, 1, 1, 10);
        this.Shape4.func_78793_a(4.0f, 1.0f, 0.0f);
        this.Shape4.func_78787_b(64, 32);
        this.Shape4.field_78809_i = true;
        this.setRotation(this.Shape4, 0.0f, 0.0f, 0.5251521f);
        this.Shape5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 3);
        this.Shape5.func_78793_a(-1.0f, -1.9f, 2.0f);
        this.Shape5.func_78787_b(64, 32);
        this.Shape5.field_78809_i = true;
        this.setRotation(this.Shape5, -0.7063936f, 0.0f, 0.0f);
        this.Shape6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape6.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 3);
        this.Shape6.func_78793_a(3.0f, -1.9f, 2.0f);
        this.Shape6.func_78787_b(64, 32);
        this.Shape6.field_78809_i = true;
        this.setRotation(this.Shape6, -0.7063936f, 0.0f, 0.0f);
        this.Shape7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape7.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.Shape7.func_78793_a(3.0f, -1.9f, 1.5f);
        this.Shape7.func_78787_b(64, 32);
        this.Shape7.field_78809_i = true;
        this.setRotation(this.Shape7, -0.6320364f, 0.0f, 0.0f);
        this.Shape8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape8.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.Shape8.func_78793_a(-1.0f, -1.9f, 1.5f);
        this.Shape8.func_78787_b(64, 32);
        this.Shape8.field_78809_i = true;
        this.setRotation(this.Shape8, -0.6320364f, 0.0f, 0.0f);
        this.Shape9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape9.func_78789_a(0.0f, 1.4f, 0.0f, 1, 1, 1);
        this.Shape9.func_78793_a(-1.0f, -1.9f, 1.5f);
        this.Shape9.func_78787_b(64, 32);
        this.Shape9.field_78809_i = true;
        this.setRotation(this.Shape9, -0.6320364f, 0.0f, 0.0f);
        this.Shape10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape10.func_78789_a(0.0f, 1.4f, 0.0f, 1, 1, 1);
        this.Shape10.func_78793_a(3.0f, -1.9f, 1.5f);
        this.Shape10.func_78787_b(64, 32);
        this.Shape10.field_78809_i = true;
        this.setRotation(this.Shape10, -0.6320364f, 0.0f, 0.0f);
        this.Shape11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape11.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 2);
        this.Shape11.func_78793_a(-1.0f, -0.9f, 1.0f);
        this.Shape11.func_78787_b(64, 32);
        this.Shape11.field_78809_i = true;
        this.setRotation(this.Shape11, 0.0f, 0.0f, 0.0f);
        this.Shape12 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape12.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 2);
        this.Shape12.func_78793_a(3.0f, -0.9f, 1.0f);
        this.Shape12.func_78787_b(64, 32);
        this.Shape12.field_78809_i = true;
        this.setRotation(this.Shape12, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Shape1.func_78785_a(f5);
        this.Shape2.func_78785_a(f5);
        this.Shape3.func_78785_a(f5);
        this.Shape4.func_78785_a(f5);
        this.Shape5.func_78785_a(f5);
        this.Shape6.func_78785_a(f5);
        this.Shape7.func_78785_a(f5);
        this.Shape8.func_78785_a(f5);
        this.Shape9.func_78785_a(f5);
        this.Shape10.func_78785_a(f5);
        this.Shape11.func_78785_a(f5);
        this.Shape12.func_78785_a(f5);
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


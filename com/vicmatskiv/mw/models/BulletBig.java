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

public class BulletBig
extends ModelBase {
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;
    ModelRenderer Shape22;

    public BulletBig() {
        this.field_78090_t = 64;
        this.field_78089_u = 32;
        this.Shape1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape1.func_78789_a(0.0f, 0.0f, 0.0f, 3, 8, 3);
        this.Shape1.func_78793_a(0.0f, -2.0f, 0.0f);
        this.Shape1.func_78787_b(64, 32);
        this.Shape1.field_78809_i = true;
        this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
        this.Shape3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 8, 1);
        this.Shape3.func_78793_a(0.5f, -2.0f, -0.2f);
        this.Shape3.func_78787_b(64, 32);
        this.Shape3.field_78809_i = true;
        this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
        this.Shape4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape4.func_78789_a(0.0f, 0.0f, 0.0f, 2, 8, 1);
        this.Shape4.func_78793_a(0.5f, -2.0f, 2.2f);
        this.Shape4.func_78787_b(64, 32);
        this.Shape4.field_78809_i = true;
        this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
        this.Shape5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 8, 2);
        this.Shape5.func_78793_a(-0.2f, -2.0f, 0.5f);
        this.Shape5.func_78787_b(64, 32);
        this.Shape5.field_78809_i = true;
        this.setRotation(this.Shape5, 0.0f, 0.0f, 0.0f);
        this.Shape6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape6.func_78789_a(0.0f, 0.0f, 0.0f, 1, 8, 2);
        this.Shape6.func_78793_a(2.2f, -2.0f, 0.5f);
        this.Shape6.func_78787_b(64, 32);
        this.Shape6.field_78809_i = true;
        this.setRotation(this.Shape6, 0.0f, 0.0f, 0.0f);
        this.Shape11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape11.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.Shape11.func_78793_a(0.0f, 5.5f, -0.4f);
        this.Shape11.func_78787_b(64, 32);
        this.Shape11.field_78809_i = true;
        this.setRotation(this.Shape11, 0.0f, 0.0f, 0.0f);
        this.Shape12 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape12.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 1);
        this.Shape12.func_78793_a(0.0f, 5.5f, 2.4f);
        this.Shape12.func_78787_b(64, 32);
        this.Shape12.field_78809_i = true;
        this.setRotation(this.Shape12, 0.0f, 0.0f, 0.0f);
        this.Shape13 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape13.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 3);
        this.Shape13.func_78793_a(2.4f, 5.5f, 0.0f);
        this.Shape13.func_78787_b(64, 32);
        this.Shape13.field_78809_i = true;
        this.setRotation(this.Shape13, 0.0f, 0.0f, 0.0f);
        this.Shape14 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape14.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 3);
        this.Shape14.func_78793_a(-0.4f, 5.5f, 0.0f);
        this.Shape14.func_78787_b(64, 32);
        this.Shape14.field_78809_i = true;
        this.setRotation(this.Shape14, 0.0f, 0.0f, 0.0f);
        this.Shape15 = new ModelRenderer((ModelBase)this, 20, 0);
        this.Shape15.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.Shape15.func_78793_a(1.0f, -8.0f, 1.0f);
        this.Shape15.func_78787_b(64, 32);
        this.Shape15.field_78809_i = true;
        this.setRotation(this.Shape15, 0.0f, 0.0f, 0.0f);
        this.Shape16 = new ModelRenderer((ModelBase)this, 20, 0);
        this.Shape16.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 1);
        this.Shape16.func_78793_a(2.0f, -8.0f, 1.0f);
        this.Shape16.func_78787_b(64, 32);
        this.Shape16.field_78809_i = true;
        this.setRotation(this.Shape16, 0.0f, 0.0f, 1.301251f);
        this.Shape17 = new ModelRenderer((ModelBase)this, 20, 0);
        this.Shape17.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 1);
        this.Shape17.func_78793_a(1.0f, -8.0f, 1.0f);
        this.Shape17.func_78787_b(64, 32);
        this.Shape17.field_78809_i = true;
        this.setRotation(this.Shape17, -0.2602503f, 0.0f, 0.0f);
        this.Shape18 = new ModelRenderer((ModelBase)this, 20, 0);
        this.Shape18.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 1);
        this.Shape18.func_78793_a(1.0f, -8.0f, 1.0f);
        this.Shape18.func_78787_b(64, 32);
        this.Shape18.field_78809_i = true;
        this.setRotation(this.Shape18, 0.0f, 0.0f, 0.2602503f);
        this.Shape19 = new ModelRenderer((ModelBase)this, 20, 0);
        this.Shape19.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 4);
        this.Shape19.func_78793_a(1.0f, -8.0f, 2.0f);
        this.Shape19.func_78787_b(64, 32);
        this.Shape19.field_78809_i = true;
        this.setRotation(this.Shape19, -1.301251f, 0.0f, 0.0f);
        this.Shape20 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape20.func_78789_a(0.0f, 0.0f, 0.0f, 3, 3, 1);
        this.Shape20.func_78793_a(0.0f, -4.2f, 1.0f);
        this.Shape20.func_78787_b(64, 32);
        this.Shape20.field_78809_i = true;
        this.setRotation(this.Shape20, 0.0f, 0.0f, 0.0f);
        this.Shape21 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape21.func_78789_a(0.0f, 0.0f, 0.0f, 1, 3, 3);
        this.Shape21.func_78793_a(1.0f, -4.2f, 0.0f);
        this.Shape21.func_78787_b(64, 32);
        this.Shape21.field_78809_i = true;
        this.setRotation(this.Shape21, 0.0f, 0.0f, 0.0f);
        this.Shape22 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape22.func_78789_a(0.0f, 0.0f, 0.0f, 2, 3, 2);
        this.Shape22.func_78793_a(0.5f, -4.2f, 0.5f);
        this.Shape22.func_78787_b(64, 32);
        this.Shape22.field_78809_i = true;
        this.setRotation(this.Shape22, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Shape1.func_78785_a(f5);
        this.Shape3.func_78785_a(f5);
        this.Shape4.func_78785_a(f5);
        this.Shape5.func_78785_a(f5);
        this.Shape6.func_78785_a(f5);
        this.Shape11.func_78785_a(f5);
        this.Shape12.func_78785_a(f5);
        this.Shape13.func_78785_a(f5);
        this.Shape14.func_78785_a(f5);
        this.Shape15.func_78785_a(f5);
        this.Shape16.func_78785_a(f5);
        this.Shape17.func_78785_a(f5);
        this.Shape18.func_78785_a(f5);
        this.Shape19.func_78785_a(f5);
        this.Shape20.func_78785_a(f5);
        this.Shape21.func_78785_a(f5);
        this.Shape22.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


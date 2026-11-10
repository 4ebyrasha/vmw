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

public class DeskShelfAlt1
extends ModelBase {
    ModelRenderer shelf1;
    ModelRenderer shelf2;
    ModelRenderer shelf3;
    ModelRenderer shelf4;
    ModelRenderer shelf6;
    ModelRenderer shelf7;
    ModelRenderer shelf11;

    public DeskShelfAlt1() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.shelf1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.shelf1.func_78789_a(0.0f, 0.0f, 0.0f, 15, 2, 8);
        this.shelf1.func_78793_a(-7.0f, 15.0f, 0.0f);
        this.shelf1.func_78787_b(64, 32);
        this.shelf1.field_78809_i = true;
        this.setRotation(this.shelf1, 0.0f, 0.0f, 0.0f);
        this.shelf2 = new ModelRenderer((ModelBase)this, 0, 50);
        this.shelf2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 5, 5);
        this.shelf2.func_78793_a(-6.5f, 10.0f, 2.5f);
        this.shelf2.func_78787_b(64, 32);
        this.shelf2.field_78809_i = true;
        this.setRotation(this.shelf2, 0.0f, 0.0f, 0.0f);
        this.shelf3 = new ModelRenderer((ModelBase)this, 0, 90);
        this.shelf3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 6, 4);
        this.shelf3.func_78793_a(-4.1f, 9.5f, 3.0f);
        this.shelf3.func_78787_b(64, 32);
        this.shelf3.field_78809_i = true;
        this.setRotation(this.shelf3, 0.0f, 0.0f, 0.0f);
        this.shelf4 = new ModelRenderer((ModelBase)this, 0, 70);
        this.shelf4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 4);
        this.shelf4.func_78793_a(-2.0f, 11.0f, 3.5f);
        this.shelf4.func_78787_b(64, 32);
        this.shelf4.field_78809_i = true;
        this.setRotation(this.shelf4, 0.0f, 0.0f, 0.0f);
        this.shelf6 = new ModelRenderer((ModelBase)this, 0, 30);
        this.shelf6.func_78789_a(0.0f, 0.0f, 0.0f, 8, 4, 4);
        this.shelf6.func_78793_a(-5.0f, 20.0f, -3.0f);
        this.shelf6.func_78787_b(64, 32);
        this.shelf6.field_78809_i = true;
        this.setRotation(this.shelf6, 0.0f, -0.3346075f, 0.0f);
        this.shelf7 = new ModelRenderer((ModelBase)this, 40, 30);
        this.shelf7.func_78789_a(0.0f, 0.0f, 0.0f, 4, 2, 1);
        this.shelf7.func_78793_a(-4.0f, 19.0f, 0.0f);
        this.shelf7.func_78787_b(64, 32);
        this.shelf7.field_78809_i = true;
        this.setRotation(this.shelf7, -0.3717861f, 0.0f, 0.0f);
        this.shelf11 = new ModelRenderer((ModelBase)this, 0, 110);
        this.shelf11.func_78789_a(0.0f, 0.0f, 0.0f, 1, 15, 14);
        this.shelf11.func_78793_a(-8.0f, 9.0f, -6.0f);
        this.shelf11.func_78787_b(64, 32);
        this.shelf11.field_78809_i = true;
        this.setRotation(this.shelf11, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.shelf1.func_78785_a(f5);
        this.shelf2.func_78785_a(f5);
        this.shelf3.func_78785_a(f5);
        this.shelf4.func_78785_a(f5);
        this.shelf6.func_78785_a(f5);
        this.shelf7.func_78785_a(f5);
        this.shelf11.func_78785_a(f5);
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


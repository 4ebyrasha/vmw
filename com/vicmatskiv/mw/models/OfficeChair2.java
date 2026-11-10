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

public class OfficeChair2
extends ModelBase {
    ModelRenderer chair1;
    ModelRenderer chair3;
    ModelRenderer chair4;
    ModelRenderer chair5;
    ModelRenderer chair6;
    ModelRenderer chair7;
    ModelRenderer chair8;
    ModelRenderer chair9;
    ModelRenderer chair10;
    ModelRenderer chair12;
    ModelRenderer chair13;

    public OfficeChair2() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.chair1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.chair1.func_78789_a(0.0f, -3.0f, 0.0f, 9, 11, 2);
        this.chair1.func_78793_a(-4.5f, 8.0f, 4.0f);
        this.chair1.func_78787_b(64, 32);
        this.chair1.field_78809_i = true;
        this.setRotation(this.chair1, -0.1115358f, 0.0f, 0.0f);
        this.chair3 = new ModelRenderer((ModelBase)this, 0, 50);
        this.chair3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 6, 2);
        this.chair3.func_78793_a(-1.0f, 16.0f, -1.5f);
        this.chair3.func_78787_b(64, 32);
        this.chair3.field_78809_i = true;
        this.setRotation(this.chair3, 0.0f, 0.0f, 0.0f);
        this.chair4 = new ModelRenderer((ModelBase)this, 0, 50);
        this.chair4.func_78789_a(0.0f, 0.0f, 1.5f, 2, 1, 15);
        this.chair4.func_78793_a(-7.0f, 21.5f, -6.0f);
        this.chair4.func_78787_b(64, 32);
        this.chair4.field_78809_i = true;
        this.setRotation(this.chair4, 0.0f, 0.7853982f, 0.0f);
        this.chair5 = new ModelRenderer((ModelBase)this, 0, 50);
        this.chair5.func_78789_a(-2.0f, 0.0f, 1.5f, 2, 1, 15);
        this.chair5.func_78793_a(7.0f, 21.5f, -6.0f);
        this.chair5.func_78787_b(64, 32);
        this.chair5.field_78809_i = true;
        this.setRotation(this.chair5, 0.0f, -0.7853982f, 0.0f);
        this.chair6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.chair6.func_78789_a(0.0f, 0.0f, -1.0f, 10, 2, 9);
        this.chair6.func_78793_a(-5.0f, 14.0f, -3.5f);
        this.chair6.func_78787_b(64, 32);
        this.chair6.field_78809_i = true;
        this.setRotation(this.chair6, -0.0743572f, 0.0f, 0.0f);
        this.chair7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.chair7.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 2);
        this.chair7.func_78793_a(4.0f, 22.0f, -6.0f);
        this.chair7.func_78787_b(64, 32);
        this.chair7.field_78809_i = true;
        this.setRotation(this.chair7, 0.0f, 0.0f, 0.0f);
        this.chair8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.chair8.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 2);
        this.chair8.func_78793_a(-6.0f, 22.0f, -6.0f);
        this.chair8.func_78787_b(64, 32);
        this.chair8.field_78809_i = true;
        this.setRotation(this.chair8, 0.0f, 0.0f, 0.0f);
        this.chair9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.chair9.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 2);
        this.chair9.func_78793_a(4.0f, 22.0f, 3.5f);
        this.chair9.func_78787_b(64, 32);
        this.chair9.field_78809_i = true;
        this.setRotation(this.chair9, 0.0f, 0.0f, 0.0f);
        this.chair10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.chair10.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 2);
        this.chair10.func_78793_a(-6.0f, 22.0f, 3.5f);
        this.chair10.func_78787_b(64, 32);
        this.chair10.field_78809_i = true;
        this.setRotation(this.chair10, 0.0f, 0.0f, 0.0f);
        this.chair12 = new ModelRenderer((ModelBase)this, 0, 0);
        this.chair12.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 7);
        this.chair12.func_78793_a(4.0f, 10.5f, -2.0f);
        this.chair12.func_78787_b(64, 32);
        this.chair12.field_78809_i = true;
        this.setRotation(this.chair12, -0.0371786f, 0.0f, 0.0f);
        this.chair13 = new ModelRenderer((ModelBase)this, 0, 0);
        this.chair13.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 7);
        this.chair13.func_78793_a(-6.0f, 10.5f, -2.0f);
        this.chair13.func_78787_b(64, 32);
        this.chair13.field_78809_i = true;
        this.setRotation(this.chair13, -0.0371786f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.chair1.func_78785_a(f5);
        this.chair3.func_78785_a(f5);
        this.chair4.func_78785_a(f5);
        this.chair5.func_78785_a(f5);
        this.chair6.func_78785_a(f5);
        this.chair7.func_78785_a(f5);
        this.chair8.func_78785_a(f5);
        this.chair9.func_78785_a(f5);
        this.chair10.func_78785_a(f5);
        this.chair12.func_78785_a(f5);
        this.chair13.func_78785_a(f5);
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


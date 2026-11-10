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

public class DeskMiddleAlt1
extends ModelBase {
    ModelRenderer desk1;
    ModelRenderer desk3;
    ModelRenderer desk4;
    ModelRenderer desk5;

    public DeskMiddleAlt1() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.desk1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.desk1.func_78789_a(0.0f, 0.0f, 0.0f, 16, 15, 1);
        this.desk1.func_78793_a(-8.0f, 8.0f, 6.5f);
        this.desk1.func_78787_b(64, 32);
        this.desk1.field_78809_i = true;
        this.setRotation(this.desk1, 0.0f, 0.0f, 0.0f);
        this.desk3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.desk3.func_78789_a(0.0f, 0.0f, 0.0f, 16, 4, 13);
        this.desk3.func_78793_a(-8.0f, 8.0f, -6.5f);
        this.desk3.func_78787_b(64, 32);
        this.desk3.field_78809_i = true;
        this.setRotation(this.desk3, 0.0f, 0.0f, 0.0f);
        this.desk4 = new ModelRenderer((ModelBase)this, 0, 50);
        this.desk4.func_78789_a(0.0f, 0.0f, 0.0f, 5, 10, 12);
        this.desk4.func_78793_a(-7.0f, 14.0f, -6.0f);
        this.desk4.func_78787_b(64, 32);
        this.desk4.field_78809_i = true;
        this.setRotation(this.desk4, 0.0f, 0.0f, 0.0f);
        this.desk5 = new ModelRenderer((ModelBase)this, 0, 50);
        this.desk5.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 1);
        this.desk5.func_78793_a(-6.5f, 16.0f, -6.1f);
        this.desk5.func_78787_b(64, 32);
        this.desk5.field_78809_i = true;
        this.setRotation(this.desk5, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.desk1.func_78785_a(f5);
        this.desk3.func_78785_a(f5);
        this.desk4.func_78785_a(f5);
        this.desk5.func_78785_a(f5);
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


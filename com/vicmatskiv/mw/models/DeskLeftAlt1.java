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

public class DeskLeftAlt1
extends ModelBase {
    ModelRenderer desk1;
    ModelRenderer desk2;
    ModelRenderer desk3;
    ModelRenderer desk4;
    ModelRenderer desk5;
    ModelRenderer desk6;
    ModelRenderer desk7;
    ModelRenderer desk8;
    ModelRenderer desk9;
    ModelRenderer desk10;

    public DeskLeftAlt1() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.desk1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.desk1.func_78789_a(0.0f, 0.0f, 0.0f, 15, 15, 1);
        this.desk1.func_78793_a(-7.0f, 8.0f, 6.5f);
        this.desk1.func_78787_b(64, 32);
        this.desk1.field_78809_i = true;
        this.setRotation(this.desk1, 0.0f, 0.0f, 0.0f);
        this.desk2 = new ModelRenderer((ModelBase)this, 0, 50);
        this.desk2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 7, 5);
        this.desk2.func_78793_a(-4.9f, 17.0f, -5.5f);
        this.desk2.func_78787_b(64, 32);
        this.desk2.field_78809_i = true;
        this.setRotation(this.desk2, 0.0f, -0.5205006f, 0.0f);
        this.desk3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.desk3.func_78789_a(0.0f, 0.0f, 0.0f, 16, 4, 13);
        this.desk3.func_78793_a(-8.0f, 8.0f, -6.5f);
        this.desk3.func_78787_b(64, 32);
        this.desk3.field_78809_i = true;
        this.setRotation(this.desk3, 0.0f, 0.0f, 0.0f);
        this.desk4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.desk4.func_78789_a(0.0f, 0.0f, 0.0f, 2, 16, 13);
        this.desk4.func_78793_a(0.0f, 8.05f, -6.3f);
        this.desk4.func_78787_b(64, 32);
        this.desk4.field_78809_i = true;
        this.setRotation(this.desk4, 0.0f, 0.0f, 0.0f);
        this.desk5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.desk5.func_78789_a(0.0f, 0.0f, 0.0f, 2, 16, 2);
        this.desk5.func_78793_a(-8.0f, 8.05f, 5.6f);
        this.desk5.func_78787_b(64, 32);
        this.desk5.field_78809_i = true;
        this.setRotation(this.desk5, 0.0f, 0.0f, 0.0f);
        this.desk6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.desk6.func_78789_a(0.0f, 0.0f, 0.0f, 2, 16, 13);
        this.desk6.func_78793_a(6.0f, 8.05f, -6.3f);
        this.desk6.func_78787_b(64, 32);
        this.desk6.field_78809_i = true;
        this.setRotation(this.desk6, 0.0f, 0.0f, 0.0f);
        this.desk7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.desk7.func_78789_a(0.0f, 0.0f, 0.0f, 4, 16, 13);
        this.desk7.func_78793_a(2.0f, 8.05f, -6.1f);
        this.desk7.func_78787_b(64, 32);
        this.desk7.field_78809_i = true;
        this.setRotation(this.desk7, 0.0f, 0.0f, 0.0f);
        this.desk8 = new ModelRenderer((ModelBase)this, 0, 50);
        this.desk8.func_78789_a(4.0f, 0.0f, 0.0f, 1, 7, 5);
        this.desk8.func_78793_a(-4.9f, 17.0f, -5.5f);
        this.desk8.func_78787_b(64, 32);
        this.desk8.field_78809_i = true;
        this.setRotation(this.desk8, 0.0f, -0.5205006f, 0.0f);
        this.desk9 = new ModelRenderer((ModelBase)this, 0, 50);
        this.desk9.func_78789_a(1.0f, 0.0f, 0.0f, 3, 7, 1);
        this.desk9.func_78793_a(-4.9f, 17.0f, -5.5f);
        this.desk9.func_78787_b(64, 32);
        this.desk9.field_78809_i = true;
        this.setRotation(this.desk9, 0.0f, -0.5205006f, 0.0f);
        this.desk10 = new ModelRenderer((ModelBase)this, 0, 50);
        this.desk10.func_78789_a(1.0f, 0.0f, 4.0f, 3, 7, 1);
        this.desk10.func_78793_a(-4.9f, 17.0f, -5.5f);
        this.desk10.func_78787_b(64, 32);
        this.desk10.field_78809_i = true;
        this.setRotation(this.desk10, 0.0f, -0.5205006f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.desk1.func_78785_a(f5);
        this.desk2.func_78785_a(f5);
        this.desk3.func_78785_a(f5);
        this.desk4.func_78785_a(f5);
        this.desk5.func_78785_a(f5);
        this.desk6.func_78785_a(f5);
        this.desk7.func_78785_a(f5);
        this.desk8.func_78785_a(f5);
        this.desk9.func_78785_a(f5);
        this.desk10.func_78785_a(f5);
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


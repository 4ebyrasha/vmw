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

public class Tokyo90RearSights
extends ModelBase {
    ModelRenderer rearsights1;
    ModelRenderer rearsights2;
    ModelRenderer rearsights3;
    ModelRenderer rearsights4;
    ModelRenderer rearsights5;
    ModelRenderer rearsights6;
    ModelRenderer rearsights7;
    ModelRenderer frontsights1;
    ModelRenderer frontsights2;
    ModelRenderer frontsights3;
    ModelRenderer frontsights4;
    ModelRenderer frontsights5;

    public Tokyo90RearSights() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.rearsights1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.rearsights1.func_78789_a(0.0f, 0.0f, 0.0f, 6, 4, 5);
        this.rearsights1.func_78793_a(-2.5f, 0.0f, 0.0f);
        this.rearsights1.func_78787_b(128, 128);
        this.rearsights1.field_78809_i = true;
        this.setRotation(this.rearsights1, 0.0f, 0.0f, 0.0f);
        this.rearsights2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.rearsights2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 2);
        this.rearsights2.func_78793_a(-2.0f, -0.9f, 1.5f);
        this.rearsights2.func_78787_b(128, 128);
        this.rearsights2.field_78809_i = true;
        this.setRotation(this.rearsights2, 0.0f, 0.0f, 0.0f);
        this.rearsights3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.rearsights3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 2);
        this.rearsights3.func_78793_a(1.0f, -0.9f, 1.5f);
        this.rearsights3.func_78787_b(128, 128);
        this.rearsights3.field_78809_i = true;
        this.setRotation(this.rearsights3, 0.0f, 0.0f, 0.0f);
        this.rearsights4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.rearsights4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 2);
        this.rearsights4.func_78793_a(-2.0f, -0.9f, 1.5f);
        this.rearsights4.func_78787_b(128, 128);
        this.rearsights4.field_78809_i = true;
        this.setRotation(this.rearsights4, 0.0f, 0.0f, 0.4833219f);
        this.rearsights5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.rearsights5.func_78789_a(-1.0f, 0.0f, 0.0f, 1, 1, 2);
        this.rearsights5.func_78793_a(3.0f, -0.9f, 1.5f);
        this.rearsights5.func_78787_b(128, 128);
        this.rearsights5.field_78809_i = true;
        this.setRotation(this.rearsights5, 0.0f, 0.0f, -0.4833166f);
        this.rearsights6 = new ModelRenderer((ModelBase)this, 0, 50);
        this.rearsights6.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.rearsights6.func_78793_a(-1.3f, -0.7f, 2.6f);
        this.rearsights6.func_78787_b(128, 128);
        this.rearsights6.field_78809_i = true;
        this.setRotation(this.rearsights6, 0.0f, 0.0f, 0.0f);
        this.rearsights7 = new ModelRenderer((ModelBase)this, 0, 50);
        this.rearsights7.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.rearsights7.func_78793_a(1.3f, -0.7f, 2.6f);
        this.rearsights7.func_78787_b(128, 128);
        this.rearsights7.field_78809_i = true;
        this.setRotation(this.rearsights7, 0.0f, 0.0f, 0.0f);
        this.frontsights1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.frontsights1.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 5);
        this.frontsights1.func_78793_a(-0.5f, 1.0f, -9.0f);
        this.frontsights1.func_78787_b(128, 128);
        this.frontsights1.field_78809_i = true;
        this.setRotation(this.frontsights1, 0.0f, 0.0f, 0.0f);
        this.frontsights2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.frontsights2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 5);
        this.frontsights2.func_78793_a(-0.3f, -0.3f, -9.25f);
        this.frontsights2.func_78787_b(128, 128);
        this.frontsights2.field_78809_i = true;
        this.setRotation(this.frontsights2, 0.122173f, 0.0f, 0.0f);
        this.frontsights3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.frontsights3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 5);
        this.frontsights3.func_78793_a(0.3f, -0.3f, -9.25f);
        this.frontsights3.func_78787_b(128, 128);
        this.frontsights3.field_78809_i = true;
        this.setRotation(this.frontsights3, 0.122173f, 0.0f, 0.0f);
        this.frontsights4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.frontsights4.func_78789_a(0.0f, 0.2f, 4.1f, 1, 1, 1);
        this.frontsights4.func_78793_a(0.0f, -0.3f, -9.25f);
        this.frontsights4.func_78787_b(128, 128);
        this.frontsights4.field_78809_i = true;
        this.setRotation(this.frontsights4, 0.122173f, 0.0f, 0.0f);
        this.frontsights5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.frontsights5.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 5);
        this.frontsights5.func_78793_a(-0.5f, 0.5f, -9.0f);
        this.frontsights5.func_78787_b(128, 128);
        this.frontsights5.field_78809_i = true;
        this.setRotation(this.frontsights5, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.rearsights1.func_78785_a(f5);
        this.rearsights2.func_78785_a(f5);
        this.rearsights3.func_78785_a(f5);
        this.rearsights4.func_78785_a(f5);
        this.rearsights5.func_78785_a(f5);
        this.rearsights6.func_78785_a(f5);
        this.rearsights7.func_78785_a(f5);
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


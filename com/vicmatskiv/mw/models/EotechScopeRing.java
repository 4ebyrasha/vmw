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

public class EotechScopeRing
extends ModelBase {
    ModelRenderer scope1;
    ModelRenderer scope2;
    ModelRenderer scope3;
    ModelRenderer scope4;
    ModelRenderer scope5;
    ModelRenderer scope6;
    ModelRenderer scope7;
    ModelRenderer scope8;
    ModelRenderer scope9;
    ModelRenderer scope10;
    ModelRenderer scope11;
    ModelRenderer scope12;
    ModelRenderer scope13;
    ModelRenderer scope14;
    ModelRenderer scope15;
    ModelRenderer scope16;

    public EotechScopeRing() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.scope1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope1.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.scope1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.scope1.func_78787_b(256, 256);
        this.scope1.field_78809_i = true;
        this.setRotation(this.scope1, 0.0f, 0.0f, 0.0f);
        this.scope2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 4);
        this.scope2.func_78793_a(-3.0f, -6.0f, 0.0f);
        this.scope2.func_78787_b(256, 256);
        this.scope2.field_78809_i = true;
        this.setRotation(this.scope2, 0.0f, 0.0f, 0.0f);
        this.scope3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 4);
        this.scope3.func_78793_a(6.0f, -6.0f, 0.0f);
        this.scope3.func_78787_b(256, 256);
        this.scope3.field_78809_i = true;
        this.setRotation(this.scope3, 0.0f, 0.0f, 0.0f);
        this.scope4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope4.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.scope4.func_78793_a(0.0f, -9.0f, 0.0f);
        this.scope4.func_78787_b(256, 256);
        this.scope4.field_78809_i = true;
        this.setRotation(this.scope4, 0.0f, 0.0f, 0.0f);
        this.scope5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope5.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 4);
        this.scope5.func_78793_a(4.0f, -9.0f, 0.0f);
        this.scope5.func_78787_b(256, 256);
        this.scope5.field_78809_i = true;
        this.setRotation(this.scope5, 0.0f, 0.0f, 0.4089647f);
        this.scope6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope6.func_78789_a(-2.0f, 0.0f, 0.0f, 2, 1, 4);
        this.scope6.func_78793_a(0.0f, -9.0f, 0.0f);
        this.scope6.func_78787_b(256, 256);
        this.scope6.field_78809_i = true;
        this.setRotation(this.scope6, 0.0f, 0.0f, -0.4089656f);
        this.scope7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope7.func_78789_a(-2.0f, -1.0f, 0.0f, 2, 1, 4);
        this.scope7.func_78793_a(0.0f, 1.0f, 0.0f);
        this.scope7.func_78787_b(256, 256);
        this.scope7.field_78809_i = true;
        this.setRotation(this.scope7, 0.0f, 0.0f, 0.4089656f);
        this.scope8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope8.func_78789_a(0.0f, -1.0f, 0.0f, 2, 1, 4);
        this.scope8.func_78793_a(4.0f, 1.0f, 0.0f);
        this.scope8.func_78787_b(256, 256);
        this.scope8.field_78809_i = true;
        this.setRotation(this.scope8, 0.0f, 0.0f, -0.4089656f);
        this.scope9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope9.func_78789_a(-1.0f, -2.0f, 0.0f, 1, 2, 4);
        this.scope9.func_78793_a(7.0f, -6.0f, 0.0f);
        this.scope9.func_78787_b(256, 256);
        this.scope9.field_78809_i = true;
        this.setRotation(this.scope9, 0.0f, 0.0f, -0.4089656f);
        this.scope10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope10.func_78789_a(0.0f, -2.0f, 0.0f, 1, 2, 4);
        this.scope10.func_78793_a(-3.0f, -6.0f, 0.0f);
        this.scope10.func_78787_b(256, 256);
        this.scope10.field_78809_i = true;
        this.setRotation(this.scope10, 0.0f, 0.0f, 0.4089656f);
        this.scope11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope11.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 4);
        this.scope11.func_78793_a(-3.0f, -2.0f, 0.0f);
        this.scope11.func_78787_b(256, 256);
        this.scope11.field_78809_i = true;
        this.setRotation(this.scope11, 0.0f, 0.0f, -0.4089656f);
        this.scope12 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope12.func_78789_a(-1.0f, 0.0f, 0.0f, 1, 2, 4);
        this.scope12.func_78793_a(7.0f, -2.0f, 0.0f);
        this.scope12.func_78787_b(256, 256);
        this.scope12.field_78809_i = true;
        this.setRotation(this.scope12, 0.0f, 0.0f, 0.4089656f);
        this.scope13 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope13.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 4);
        this.scope13.func_78793_a(5.65f, -8.35f, 0.0f);
        this.scope13.func_78787_b(256, 256);
        this.scope13.field_78809_i = true;
        this.setRotation(this.scope13, 0.0f, 0.0f, 0.7853982f);
        this.scope14 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope14.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 4);
        this.scope14.func_78793_a(-1.65f, -8.35f, 0.0f);
        this.scope14.func_78787_b(256, 256);
        this.scope14.field_78809_i = true;
        this.setRotation(this.scope14, 0.0f, 0.0f, 0.7853982f);
        this.scope15 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope15.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 4);
        this.scope15.func_78793_a(-1.65f, -1.05f, 0.0f);
        this.scope15.func_78787_b(256, 256);
        this.scope15.field_78809_i = true;
        this.setRotation(this.scope15, 0.0f, 0.0f, 0.7853982f);
        this.scope16 = new ModelRenderer((ModelBase)this, 0, 0);
        this.scope16.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 4);
        this.scope16.func_78793_a(5.65f, -1.05f, 0.0f);
        this.scope16.func_78787_b(256, 256);
        this.scope16.field_78809_i = true;
        this.setRotation(this.scope16, 0.0f, 0.0f, 0.7853982f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.scope1.func_78785_a(f5);
        this.scope2.func_78785_a(f5);
        this.scope3.func_78785_a(f5);
        this.scope4.func_78785_a(f5);
        this.scope5.func_78785_a(f5);
        this.scope6.func_78785_a(f5);
        this.scope7.func_78785_a(f5);
        this.scope8.func_78785_a(f5);
        this.scope9.func_78785_a(f5);
        this.scope10.func_78785_a(f5);
        this.scope11.func_78785_a(f5);
        this.scope12.func_78785_a(f5);
        this.scope13.func_78785_a(f5);
        this.scope14.func_78785_a(f5);
        this.scope15.func_78785_a(f5);
        this.scope16.func_78785_a(f5);
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


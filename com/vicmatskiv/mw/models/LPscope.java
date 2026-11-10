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

public class LPscope
extends ModelBase {
    ModelRenderer gun1;
    ModelRenderer gun4;
    ModelRenderer gun7;
    ModelRenderer gun9;
    ModelRenderer gun10;
    ModelRenderer gun11;
    ModelRenderer gun12;

    public LPscope() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.gun1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun1.func_78789_a(0.0f, 0.0f, 0.0f, 12, 1, 0);
        this.gun1.func_78793_a(-5.5f, -10.0f, 0.0f);
        this.gun1.func_78787_b(64, 32);
        this.gun1.field_78809_i = true;
        this.setRotation(this.gun1, 0.0f, 0.0f, 0.0f);
        this.gun4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 12, 0);
        this.gun4.func_78793_a(0.0f, -15.5f, 0.0f);
        this.gun4.func_78787_b(64, 32);
        this.gun4.field_78809_i = true;
        this.setRotation(this.gun4, 0.0f, 0.0f, 0.0f);
        this.gun7 = new ModelRenderer((ModelBase)this, 0, 20);
        this.gun7.func_78789_a(0.0f, 0.0f, 0.0f, 1, 5, 0);
        this.gun7.func_78793_a(0.0f, -3.5f, 0.0f);
        this.gun7.func_78787_b(64, 32);
        this.gun7.field_78809_i = true;
        this.setRotation(this.gun7, 0.0f, 0.0f, 0.0f);
        this.gun9 = new ModelRenderer((ModelBase)this, 0, 20);
        this.gun9.func_78789_a(0.0f, 0.0f, 0.0f, 1, 20, 0);
        this.gun9.func_78793_a(0.0f, -35.5f, 0.0f);
        this.gun9.func_78787_b(64, 32);
        this.gun9.field_78809_i = true;
        this.setRotation(this.gun9, 0.0f, 0.0f, 0.0f);
        this.gun10 = new ModelRenderer((ModelBase)this, 0, 20);
        this.gun10.func_78789_a(0.0f, 0.0f, 0.0f, 22, 1, 0);
        this.gun10.func_78793_a(6.5f, -10.0f, 0.0f);
        this.gun10.func_78787_b(64, 32);
        this.gun10.field_78809_i = true;
        this.setRotation(this.gun10, 0.0f, 0.0f, 0.0f);
        this.gun11 = new ModelRenderer((ModelBase)this, 0, 20);
        this.gun11.func_78789_a(0.0f, 0.0f, 0.0f, 22, 1, 0);
        this.gun11.func_78793_a(-27.5f, -10.0f, 0.0f);
        this.gun11.func_78787_b(64, 32);
        this.gun11.field_78809_i = true;
        this.setRotation(this.gun11, 0.0f, 0.0f, 0.0f);
        this.gun12 = new ModelRenderer((ModelBase)this, 0, 20);
        this.gun12.func_78789_a(0.0f, 0.0f, 0.0f, 1, 15, 0);
        this.gun12.func_78793_a(0.0f, 1.5f, 0.0f);
        this.gun12.func_78787_b(64, 32);
        this.gun12.field_78809_i = true;
        this.setRotation(this.gun12, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.gun1.func_78785_a(f5);
        this.gun4.func_78785_a(f5);
        this.gun7.func_78785_a(f5);
        this.gun9.func_78785_a(f5);
        this.gun10.func_78785_a(f5);
        this.gun11.func_78785_a(f5);
        this.gun12.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


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

public class Trusses
extends ModelBase {
    ModelRenderer trusses1;
    ModelRenderer trusses2;
    ModelRenderer trusses3;
    ModelRenderer trusses4;
    ModelRenderer trusses5;

    public Trusses() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.trusses1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.trusses1.func_78789_a(0.0f, 0.0f, 0.0f, 16, 2, 2);
        this.trusses1.func_78793_a(-8.0f, 8.0f, -1.0f);
        this.trusses1.func_78787_b(128, 128);
        this.trusses1.field_78809_i = true;
        this.setRotation(this.trusses1, 0.0f, 0.0f, 0.0f);
        this.trusses2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.trusses2.func_78789_a(0.0f, 0.0f, 0.0f, 16, 2, 2);
        this.trusses2.func_78793_a(-8.0f, 18.0f, -1.0f);
        this.trusses2.func_78787_b(128, 128);
        this.trusses2.field_78809_i = true;
        this.setRotation(this.trusses2, 0.0f, 0.0f, 0.0f);
        this.trusses3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.trusses3.func_78789_a(0.0f, 0.0f, 0.0f, 11, 1, 1);
        this.trusses3.func_78793_a(-7.0f, 18.0f, -0.5f);
        this.trusses3.func_78787_b(128, 128);
        this.trusses3.field_78809_i = true;
        this.setRotation(this.trusses3, 0.0f, 0.0f, -0.9294653f);
        this.trusses4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.trusses4.func_78789_a(-11.0f, 0.0f, 0.0f, 12, 1, 1);
        this.trusses4.func_78793_a(7.0f, 18.0f, -0.5f);
        this.trusses4.func_78787_b(128, 128);
        this.trusses4.field_78809_i = true;
        this.setRotation(this.trusses4, 0.0f, 0.0f, 0.9294596f);
        this.trusses5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.trusses5.func_78789_a(0.0f, 0.0f, 0.0f, 16, 1, 3);
        this.trusses5.func_78793_a(-8.0f, 19.5f, -1.5f);
        this.trusses5.func_78787_b(128, 128);
        this.trusses5.field_78809_i = true;
        this.setRotation(this.trusses5, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.trusses1.func_78785_a(f5);
        this.trusses2.func_78785_a(f5);
        this.trusses3.func_78785_a(f5);
        this.trusses4.func_78785_a(f5);
        this.trusses5.func_78785_a(f5);
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


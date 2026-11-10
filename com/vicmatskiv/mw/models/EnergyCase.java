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

public class EnergyCase
extends ModelBase {
    ModelRenderer case1;
    ModelRenderer case2;
    ModelRenderer case3;
    ModelRenderer case4;
    ModelRenderer case5;

    public EnergyCase() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.case1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.case1.func_78789_a(0.0f, 0.0f, 0.0f, 2, 8, 3);
        this.case1.func_78793_a(0.5f, 0.0f, 0.0f);
        this.case1.func_78787_b(128, 128);
        this.case1.field_78809_i = true;
        this.setRotation(this.case1, 0.0f, 0.0f, 0.0f);
        this.case2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.case2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 3);
        this.case2.func_78793_a(1.6f, 4.0f, 0.1f);
        this.case2.func_78787_b(128, 128);
        this.case2.field_78809_i = true;
        this.setRotation(this.case2, 0.0f, 0.0f, 0.0f);
        this.case3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.case3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 8, 1);
        this.case3.func_78793_a(1.0f, 0.0f, -0.1f);
        this.case3.func_78787_b(128, 128);
        this.case3.field_78809_i = true;
        this.setRotation(this.case3, 0.0f, 0.0f, 0.0f);
        this.case4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.case4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 3);
        this.case4.func_78793_a(0.4f, 4.0f, 0.1f);
        this.case4.func_78787_b(128, 128);
        this.case4.field_78809_i = true;
        this.setRotation(this.case4, 0.0f, 0.0f, 0.0f);
        this.case5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.case5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 6, 3);
        this.case5.func_78793_a(1.0f, -0.3f, 0.1f);
        this.case5.func_78787_b(128, 128);
        this.case5.field_78809_i = true;
        this.setRotation(this.case5, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.case1.func_78785_a(f5);
        this.case2.func_78785_a(f5);
        this.case3.func_78785_a(f5);
        this.case4.func_78785_a(f5);
        this.case5.func_78785_a(f5);
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


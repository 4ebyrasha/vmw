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

public class VentCorner
extends ModelBase {
    ModelRenderer vent1;
    ModelRenderer vent2;
    ModelRenderer vent3;

    public VentCorner() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.vent1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.vent1.func_78789_a(0.0f, 0.0f, 0.0f, 14, 14, 1);
        this.vent1.func_78793_a(-7.0f, 9.0f, 7.0f);
        this.vent1.func_78787_b(128, 128);
        this.vent1.field_78809_i = true;
        this.setRotation(this.vent1, 0.0f, 0.0f, 0.0f);
        this.vent2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.vent2.func_78789_a(0.0f, 0.0f, 0.0f, 15, 14, 14);
        this.vent2.func_78793_a(-8.0f, 9.0f, -7.0f);
        this.vent2.func_78787_b(128, 128);
        this.vent2.field_78809_i = true;
        this.setRotation(this.vent2, 0.0f, 0.0f, 0.0f);
        this.vent3 = new ModelRenderer((ModelBase)this, 0, 40);
        this.vent3.func_78789_a(0.1f, 0.0f, 0.0f, 1, 15, 20);
        this.vent3.func_78793_a(6.5f, 8.5f, -7.5f);
        this.vent3.func_78787_b(128, 128);
        this.vent3.field_78809_i = true;
        this.setRotation(this.vent3, 0.0f, -0.7853982f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.vent1.func_78785_a(f5);
        this.vent2.func_78785_a(f5);
        this.vent3.func_78785_a(f5);
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


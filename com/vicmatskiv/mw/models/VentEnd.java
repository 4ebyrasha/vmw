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

public class VentEnd
extends ModelBase {
    ModelRenderer vent1;
    ModelRenderer vent2;
    ModelRenderer vent3;
    ModelRenderer vent4;
    ModelRenderer vent5;
    ModelRenderer vent6;
    ModelRenderer vent7;
    ModelRenderer vent8;
    ModelRenderer vent9;
    ModelRenderer vent10;

    public VentEnd() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.vent1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.vent1.func_78789_a(0.0f, 0.0f, 0.0f, 14, 14, 16);
        this.vent1.func_78793_a(-7.0f, 9.0f, -8.0f);
        this.vent1.func_78787_b(64, 32);
        this.vent1.field_78809_i = true;
        this.setRotation(this.vent1, 0.0f, 0.0f, 0.0f);
        this.vent2 = new ModelRenderer((ModelBase)this, 0, 40);
        this.vent2.func_78789_a(0.0f, 0.0f, 0.0f, 15, 15, 1);
        this.vent2.func_78793_a(-7.5f, 8.5f, -0.5f);
        this.vent2.func_78787_b(64, 32);
        this.vent2.field_78809_i = true;
        this.setRotation(this.vent2, 0.0f, 0.0f, 0.0f);
        this.vent3 = new ModelRenderer((ModelBase)this, 0, 40);
        this.vent3.func_78789_a(0.0f, 0.0f, 0.0f, 15, 1, 1);
        this.vent3.func_78793_a(-7.5f, 8.5f, -9.0f);
        this.vent3.func_78787_b(64, 32);
        this.vent3.field_78809_i = true;
        this.setRotation(this.vent3, 0.0f, 0.0f, 0.0f);
        this.vent4 = new ModelRenderer((ModelBase)this, 0, 40);
        this.vent4.func_78789_a(0.0f, 0.0f, 0.0f, 15, 1, 1);
        this.vent4.func_78793_a(-7.5f, 22.5f, -9.0f);
        this.vent4.func_78787_b(64, 32);
        this.vent4.field_78809_i = true;
        this.setRotation(this.vent4, 0.0f, 0.0f, 0.0f);
        this.vent5 = new ModelRenderer((ModelBase)this, 0, 40);
        this.vent5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 13, 1);
        this.vent5.func_78793_a(-7.5f, 9.5f, -9.0f);
        this.vent5.func_78787_b(64, 32);
        this.vent5.field_78809_i = true;
        this.setRotation(this.vent5, 0.0f, 0.0f, 0.0f);
        this.vent6 = new ModelRenderer((ModelBase)this, 0, 40);
        this.vent6.func_78789_a(0.0f, 0.0f, 0.0f, 1, 13, 1);
        this.vent6.func_78793_a(6.5f, 9.5f, -9.0f);
        this.vent6.func_78787_b(64, 32);
        this.vent6.field_78809_i = true;
        this.setRotation(this.vent6, 0.0f, 0.0f, 0.0f);
        this.vent7 = new ModelRenderer((ModelBase)this, 0, 40);
        this.vent7.func_78789_a(0.0f, 0.0f, 0.0f, 13, 2, 1);
        this.vent7.func_78793_a(-6.5f, 10.5f, -8.8f);
        this.vent7.func_78787_b(64, 32);
        this.vent7.field_78809_i = true;
        this.setRotation(this.vent7, 0.0f, 0.0f, 0.0f);
        this.vent8 = new ModelRenderer((ModelBase)this, 0, 40);
        this.vent8.func_78789_a(0.0f, 0.0f, 0.0f, 13, 2, 1);
        this.vent8.func_78793_a(-6.5f, 13.5f, -8.8f);
        this.vent8.func_78787_b(64, 32);
        this.vent8.field_78809_i = true;
        this.setRotation(this.vent8, 0.0f, 0.0f, 0.0f);
        this.vent9 = new ModelRenderer((ModelBase)this, 0, 40);
        this.vent9.func_78789_a(0.0f, 0.0f, 0.0f, 13, 2, 1);
        this.vent9.func_78793_a(-6.5f, 16.5f, -8.8f);
        this.vent9.func_78787_b(64, 32);
        this.vent9.field_78809_i = true;
        this.setRotation(this.vent9, 0.0f, 0.0f, 0.0f);
        this.vent10 = new ModelRenderer((ModelBase)this, 0, 40);
        this.vent10.func_78789_a(0.0f, 0.0f, 0.0f, 13, 2, 1);
        this.vent10.func_78793_a(-6.5f, 19.5f, -8.8f);
        this.vent10.func_78787_b(64, 32);
        this.vent10.field_78809_i = true;
        this.setRotation(this.vent10, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.vent1.func_78785_a(f5);
        this.vent2.func_78785_a(f5);
        this.vent3.func_78785_a(f5);
        this.vent4.func_78785_a(f5);
        this.vent5.func_78785_a(f5);
        this.vent6.func_78785_a(f5);
        this.vent7.func_78785_a(f5);
        this.vent8.func_78785_a(f5);
        this.vent9.func_78785_a(f5);
        this.vent10.func_78785_a(f5);
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


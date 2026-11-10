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

public class UziFrontSight
extends ModelBase {
    ModelRenderer sight1;
    ModelRenderer sight2;
    ModelRenderer sight3;
    ModelRenderer sight4;
    ModelRenderer sight5;
    ModelRenderer sight6;
    ModelRenderer sight7;
    ModelRenderer sight8;
    ModelRenderer sight9;
    ModelRenderer sight13;
    ModelRenderer sight14;

    public UziFrontSight() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.sight1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight1.func_78789_a(0.0f, 0.0f, 0.0f, 1, 5, 7);
        this.sight1.func_78793_a(0.0f, 2.0f, -1.0f);
        this.sight1.func_78787_b(64, 32);
        this.sight1.field_78809_i = true;
        this.setRotation(this.sight1, 0.0f, 0.0f, 0.0f);
        this.sight2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 3);
        this.sight2.func_78793_a(0.0f, 0.0f, 1.0f);
        this.sight2.func_78787_b(64, 32);
        this.sight2.field_78809_i = true;
        this.setRotation(this.sight2, 0.0f, 0.0f, 0.0f);
        this.sight3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 3, 2);
        this.sight3.func_78793_a(0.0f, 0.0f, 1.0f);
        this.sight3.func_78787_b(64, 32);
        this.sight3.field_78809_i = true;
        this.setRotation(this.sight3, -0.7853982f, 0.0f, 0.0f);
        this.sight4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 3);
        this.sight4.func_78793_a(0.0f, 0.0f, 4.0f);
        this.sight4.func_78787_b(64, 32);
        this.sight4.field_78809_i = true;
        this.setRotation(this.sight4, -0.7853982f, 0.0f, 0.0f);
        this.sight5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight5.func_78789_a(0.0f, 0.0f, 0.0f, 6, 2, 7);
        this.sight5.func_78793_a(1.0f, 5.5f, -1.0f);
        this.sight5.func_78787_b(64, 32);
        this.sight5.field_78809_i = true;
        this.setRotation(this.sight5, 0.0f, 0.0f, 0.0f);
        this.sight6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight6.func_78789_a(0.0f, 0.0f, 0.0f, 1, 5, 7);
        this.sight6.func_78793_a(7.0f, 2.0f, -1.0f);
        this.sight6.func_78787_b(64, 32);
        this.sight6.field_78809_i = true;
        this.setRotation(this.sight6, 0.0f, 0.0f, 0.0f);
        this.sight7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight7.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 3);
        this.sight7.func_78793_a(7.0f, 0.0f, 1.0f);
        this.sight7.func_78787_b(64, 32);
        this.sight7.field_78809_i = true;
        this.setRotation(this.sight7, 0.0f, 0.0f, 0.0f);
        this.sight8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight8.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 3);
        this.sight8.func_78793_a(7.0f, 0.0f, 4.0f);
        this.sight8.func_78787_b(64, 32);
        this.sight8.field_78809_i = true;
        this.setRotation(this.sight8, -0.7853982f, 0.0f, 0.0f);
        this.sight9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight9.func_78789_a(0.0f, 0.0f, 0.0f, 1, 3, 2);
        this.sight9.func_78793_a(7.0f, 0.0f, 1.0f);
        this.sight9.func_78787_b(64, 32);
        this.sight9.field_78809_i = true;
        this.setRotation(this.sight9, -0.7853982f, 0.0f, 0.0f);
        this.sight13 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight13.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 5);
        this.sight13.func_78793_a(0.5f, 1.5f, 0.0f);
        this.sight13.func_78787_b(64, 32);
        this.sight13.field_78809_i = true;
        this.setRotation(this.sight13, 0.0f, 0.0f, 0.0f);
        this.sight14 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight14.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 5);
        this.sight14.func_78793_a(6.5f, 1.5f, 0.0f);
        this.sight14.func_78787_b(64, 32);
        this.sight14.field_78809_i = true;
        this.setRotation(this.sight14, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.sight1.func_78785_a(f5);
        this.sight2.func_78785_a(f5);
        this.sight3.func_78785_a(f5);
        this.sight4.func_78785_a(f5);
        this.sight5.func_78785_a(f5);
        this.sight6.func_78785_a(f5);
        this.sight7.func_78785_a(f5);
        this.sight8.func_78785_a(f5);
        this.sight9.func_78785_a(f5);
        this.sight13.func_78785_a(f5);
        this.sight14.func_78785_a(f5);
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


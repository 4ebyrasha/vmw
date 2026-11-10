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

public class AcogReticle
extends ModelBase {
    ModelRenderer reticle1;
    ModelRenderer reticle2;
    ModelRenderer reticle3;
    ModelRenderer reticle4;
    ModelRenderer reticle5;
    ModelRenderer reticle55;
    ModelRenderer reticle6;
    ModelRenderer reticle7;
    ModelRenderer reticle8;
    ModelRenderer reticle9;
    ModelRenderer reticle10;
    ModelRenderer reticle11;
    ModelRenderer reticle12;
    ModelRenderer reticle13;
    ModelRenderer reticle14;
    ModelRenderer reticle15;
    ModelRenderer reticle16;

    public AcogReticle() {
        this.field_78090_t = 256;
        this.field_78089_u = 128;
        this.reticle1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle1.func_78789_a(0.0f, 0.0f, 0.0f, 1, 41, 0);
        this.reticle1.func_78793_a(0.0f, -30.0f, 0.0f);
        this.reticle1.func_78787_b(256, 128);
        this.reticle1.field_78809_i = true;
        this.setRotation(this.reticle1, 0.0f, 0.0f, 0.0f);
        this.reticle2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle2.func_78789_a(0.0f, 0.0f, 0.0f, 30, 1, 0);
        this.reticle2.func_78793_a(5.0f, -34.0f, 0.0f);
        this.reticle2.func_78787_b(256, 128);
        this.reticle2.field_78809_i = true;
        this.setRotation(this.reticle2, 0.0f, 0.0f, 0.0f);
        this.reticle3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle3.func_78789_a(0.0f, 0.0f, 0.0f, 30, 1, 0);
        this.reticle3.func_78793_a(-34.0f, -34.0f, 0.0f);
        this.reticle3.func_78787_b(256, 128);
        this.reticle3.field_78809_i = true;
        this.setRotation(this.reticle3, 0.0f, 0.0f, 0.0f);
        this.reticle4 = new ModelRenderer((ModelBase)this, 100, 0);
        this.reticle4.func_78789_a(0.0f, 0.0f, 0.0f, 5, 1, 0);
        this.reticle4.func_78793_a(0.5f, -34.0f, 0.0f);
        this.reticle4.func_78787_b(256, 128);
        this.reticle4.field_78809_i = true;
        this.setRotation(this.reticle4, 0.0f, 0.0f, 0.7853982f);
        this.reticle5 = new ModelRenderer((ModelBase)this, 100, 0);
        this.reticle5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 5, 0);
        this.reticle5.func_78793_a(0.5f, -34.0f, 0.0f);
        this.reticle5.func_78787_b(256, 128);
        this.reticle5.field_78809_i = true;
        this.setRotation(this.reticle5, 0.0f, 0.0f, 0.7853982f);
        this.reticle55 = new ModelRenderer((ModelBase)this, 100, 0);
        this.reticle55.func_78789_a(0.0f, 0.0f, 0.0f, 1, 4, 0);
        this.reticle55.func_78793_a(0.1f, -33.0f, 0.0f);
        this.reticle55.func_78787_b(256, 128);
        this.reticle55.field_78809_i = true;
        this.setRotation(this.reticle55, 0.0f, 0.0f, 0.7853982f);
        this.reticle6 = new ModelRenderer((ModelBase)this, 100, 0);
        this.reticle6.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 0);
        this.reticle6.func_78793_a(0.9f, -33.0f, 0.0f);
        this.reticle6.func_78787_b(256, 128);
        this.reticle6.field_78809_i = true;
        this.setRotation(this.reticle6, 0.0f, 0.0f, 0.7853982f);
        this.reticle7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle7.func_78789_a(0.0f, 0.0f, 0.0f, 8, 1, 0);
        this.reticle7.func_78793_a(-3.5f, -23.0f, 0.0f);
        this.reticle7.func_78787_b(256, 128);
        this.reticle7.field_78809_i = true;
        this.setRotation(this.reticle7, 0.0f, 0.0f, 0.0f);
        this.reticle8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle8.func_78789_a(0.0f, 0.0f, 0.0f, 6, 1, 0);
        this.reticle8.func_78793_a(-2.5f, -17.0f, 0.0f);
        this.reticle8.func_78787_b(256, 128);
        this.reticle8.field_78809_i = true;
        this.setRotation(this.reticle8, 0.0f, 0.0f, 0.0f);
        this.reticle9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle9.func_78789_a(0.0f, 0.0f, 0.0f, 5, 1, 0);
        this.reticle9.func_78793_a(-2.0f, -8.0f, 0.0f);
        this.reticle9.func_78787_b(256, 128);
        this.reticle9.field_78809_i = true;
        this.setRotation(this.reticle9, 0.0f, 0.0f, 0.0f);
        this.reticle10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle10.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 0);
        this.reticle10.func_78793_a(-1.5f, 2.0f, 0.0f);
        this.reticle10.func_78787_b(256, 128);
        this.reticle10.field_78809_i = true;
        this.setRotation(this.reticle10, 0.0f, 0.0f, 0.0f);
        this.reticle11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle11.func_78789_a(0.0f, 0.0f, 0.0f, 1, 5, 0);
        this.reticle11.func_78793_a(-34.0f, -36.0f, 0.0f);
        this.reticle11.func_78787_b(256, 128);
        this.reticle11.field_78809_i = true;
        this.setRotation(this.reticle11, 0.0f, 0.0f, 0.0f);
        this.reticle12 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle12.func_78789_a(0.0f, 0.0f, 0.0f, 1, 5, 0);
        this.reticle12.func_78793_a(-24.0f, -36.0f, 0.0f);
        this.reticle12.func_78787_b(256, 128);
        this.reticle12.field_78809_i = true;
        this.setRotation(this.reticle12, 0.0f, 0.0f, 0.0f);
        this.reticle13 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle13.func_78789_a(0.0f, 0.0f, 0.0f, 1, 5, 0);
        this.reticle13.func_78793_a(-14.0f, -36.0f, 0.0f);
        this.reticle13.func_78787_b(256, 128);
        this.reticle13.field_78809_i = true;
        this.setRotation(this.reticle13, 0.0f, 0.0f, 0.0f);
        this.reticle14 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle14.func_78789_a(0.0f, 0.0f, 0.0f, 1, 5, 0);
        this.reticle14.func_78793_a(34.0f, -36.0f, 0.0f);
        this.reticle14.func_78787_b(256, 128);
        this.reticle14.field_78809_i = true;
        this.setRotation(this.reticle14, 0.0f, 0.0f, 0.0f);
        this.reticle15 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle15.func_78789_a(0.0f, 0.0f, 0.0f, 1, 5, 0);
        this.reticle15.func_78793_a(24.0f, -36.0f, 0.0f);
        this.reticle15.func_78787_b(256, 128);
        this.reticle15.field_78809_i = true;
        this.setRotation(this.reticle15, 0.0f, 0.0f, 0.0f);
        this.reticle16 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle16.func_78789_a(0.0f, 0.0f, 0.0f, 1, 5, 0);
        this.reticle16.func_78793_a(14.0f, -36.0f, 0.0f);
        this.reticle16.func_78787_b(256, 128);
        this.reticle16.field_78809_i = true;
        this.setRotation(this.reticle16, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.reticle1.func_78785_a(f5);
        this.reticle2.func_78785_a(f5);
        this.reticle3.func_78785_a(f5);
        this.reticle4.func_78785_a(f5);
        this.reticle5.func_78785_a(f5);
        this.reticle55.func_78785_a(f5);
        this.reticle6.func_78785_a(f5);
        this.reticle7.func_78785_a(f5);
        this.reticle8.func_78785_a(f5);
        this.reticle9.func_78785_a(f5);
        this.reticle10.func_78785_a(f5);
        this.reticle11.func_78785_a(f5);
        this.reticle12.func_78785_a(f5);
        this.reticle13.func_78785_a(f5);
        this.reticle14.func_78785_a(f5);
        this.reticle15.func_78785_a(f5);
        this.reticle16.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


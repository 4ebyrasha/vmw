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

public class F2000Reticle
extends ModelBase {
    ModelRenderer reticle1;
    ModelRenderer reticle2;
    ModelRenderer reticle3;
    ModelRenderer reticle4;
    ModelRenderer reticle5;
    ModelRenderer reticle6;
    ModelRenderer reticle7;
    ModelRenderer reticle8;
    ModelRenderer reticle9;
    ModelRenderer reticle10;

    public F2000Reticle() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.reticle1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle1.func_78789_a(0.0f, 0.0f, 0.0f, 1, 47, 0);
        this.reticle1.func_78793_a(0.0f, -27.0f, 0.0f);
        this.reticle1.func_78787_b(256, 256);
        this.reticle1.field_78809_i = true;
        this.setRotation(this.reticle1, 0.0f, 0.0f, 0.0f);
        this.reticle2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle2.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 0);
        this.reticle2.func_78793_a(-1.5f, -15.0f, 0.0f);
        this.reticle2.func_78787_b(256, 256);
        this.reticle2.field_78809_i = true;
        this.setRotation(this.reticle2, 0.0f, 0.0f, 0.0f);
        this.reticle3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle3.func_78789_a(0.0f, 0.0f, 0.0f, 35, 1, 0);
        this.reticle3.func_78793_a(11.5f, -27.0f, 0.0f);
        this.reticle3.func_78787_b(256, 256);
        this.reticle3.field_78809_i = true;
        this.setRotation(this.reticle3, 0.0f, 0.0f, 0.0f);
        this.reticle4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle4.func_78789_a(0.0f, 0.0f, 0.0f, 35, 1, 0);
        this.reticle4.func_78793_a(-45.5f, -27.0f, 0.0f);
        this.reticle4.func_78787_b(256, 256);
        this.reticle4.field_78809_i = true;
        this.setRotation(this.reticle4, 0.0f, 0.0f, 0.0f);
        this.reticle5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 0);
        this.reticle5.func_78793_a(-12.0f, -26.5f, 0.0f);
        this.reticle5.func_78787_b(256, 256);
        this.reticle5.field_78809_i = true;
        this.setRotation(this.reticle5, 0.0f, 0.0f, 0.0f);
        this.reticle6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle6.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 0);
        this.reticle6.func_78793_a(12.0f, -26.5f, 0.0f);
        this.reticle6.func_78787_b(256, 256);
        this.reticle6.field_78809_i = true;
        this.setRotation(this.reticle6, 0.0f, 0.0f, 0.0f);
        this.reticle7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle7.func_78789_a(0.0f, 0.0f, 0.0f, 1, 7, 0);
        this.reticle7.func_78793_a(-12.0f, -24.5f, 0.0f);
        this.reticle7.func_78787_b(256, 256);
        this.reticle7.field_78809_i = true;
        this.setRotation(this.reticle7, 0.0f, 0.0f, -0.3392548f);
        this.reticle8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle8.func_78789_a(-1.0f, 0.0f, 0.0f, 1, 7, 0);
        this.reticle8.func_78793_a(13.0f, -24.5f, 0.0f);
        this.reticle8.func_78787_b(256, 256);
        this.reticle8.field_78809_i = true;
        this.setRotation(this.reticle8, 0.0f, 0.0f, 0.3392478f);
        this.reticle9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle9.func_78789_a(0.0f, -1.0f, 0.0f, 9, 1, 0);
        this.reticle9.func_78793_a(2.5f, -14.0f, 0.0f);
        this.reticle9.func_78787_b(256, 256);
        this.reticle9.field_78809_i = true;
        this.setRotation(this.reticle9, 0.0f, 0.0f, -0.4461433f);
        this.reticle10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle10.func_78789_a(-9.0f, -1.0f, 0.0f, 9, 1, 0);
        this.reticle10.func_78793_a(-1.5f, -14.0f, 0.0f);
        this.reticle10.func_78787_b(256, 256);
        this.reticle10.field_78809_i = true;
        this.setRotation(this.reticle10, 0.0f, 0.0f, 0.4461411f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.reticle1.func_78785_a(f5);
        this.reticle2.func_78785_a(f5);
        this.reticle3.func_78785_a(f5);
        this.reticle4.func_78785_a(f5);
        this.reticle5.func_78785_a(f5);
        this.reticle6.func_78785_a(f5);
        this.reticle7.func_78785_a(f5);
        this.reticle8.func_78785_a(f5);
        this.reticle9.func_78785_a(f5);
        this.reticle10.func_78785_a(f5);
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


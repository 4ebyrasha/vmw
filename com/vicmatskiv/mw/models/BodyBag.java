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

public class BodyBag
extends ModelBase {
    ModelRenderer bodybag1;
    ModelRenderer bodybag2;
    ModelRenderer bodybag3;
    ModelRenderer bodybag4;
    ModelRenderer bodybag5;
    ModelRenderer bodybag6;
    ModelRenderer bodybag7;
    ModelRenderer bodybag8;
    ModelRenderer bodybag9;
    ModelRenderer bodybag10;
    ModelRenderer bodybag11;

    public BodyBag() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.bodybag1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bodybag1.func_78789_a(0.0f, 0.0f, 0.0f, 8, 8, 8);
        this.bodybag1.func_78793_a(-4.0f, 17.0f, 5.0f);
        this.bodybag1.func_78787_b(256, 256);
        this.bodybag1.field_78809_i = true;
        this.setRotation(this.bodybag1, 0.0743572f, 0.0f, 0.0f);
        this.bodybag2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bodybag2.func_78789_a(0.0f, 0.0f, 0.0f, 8, 4, 12);
        this.bodybag2.func_78793_a(-4.0f, 19.5f, -6.0f);
        this.bodybag2.func_78787_b(256, 256);
        this.bodybag2.field_78809_i = true;
        this.setRotation(this.bodybag2, 0.0500879f, 0.0f, 0.0f);
        this.bodybag3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bodybag3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 4, 24);
        this.bodybag3.func_78793_a(-4.0f, 21.0f, -18.0f);
        this.bodybag3.func_78787_b(256, 256);
        this.bodybag3.field_78809_i = true;
        this.setRotation(this.bodybag3, 0.0f, 0.0f, 1.003822f);
        this.bodybag4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bodybag4.func_78789_a(-2.0f, 0.0f, 0.0f, 2, 4, 24);
        this.bodybag4.func_78793_a(4.0f, 21.0f, -18.0f);
        this.bodybag4.func_78787_b(256, 256);
        this.bodybag4.field_78809_i = true;
        this.setRotation(this.bodybag4, 0.0f, 0.0f, -1.003826f);
        this.bodybag5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bodybag5.func_78789_a(-3.0f, 0.0f, 0.0f, 3, 5, 12);
        this.bodybag5.func_78793_a(4.0f, 19.5f, -6.0f);
        this.bodybag5.func_78787_b(256, 256);
        this.bodybag5.field_78809_i = true;
        this.setRotation(this.bodybag5, 0.0f, 0.0f, -1.226898f);
        this.bodybag6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bodybag6.func_78789_a(0.0f, 0.0f, 0.0f, 3, 5, 12);
        this.bodybag6.func_78793_a(-4.0f, 19.5f, -6.0f);
        this.bodybag6.func_78787_b(256, 256);
        this.bodybag6.field_78809_i = true;
        this.setRotation(this.bodybag6, 0.0f, 0.0f, 1.226897f);
        this.bodybag7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bodybag7.func_78789_a(0.0f, 0.0f, 0.0f, 8, 12, 4);
        this.bodybag7.func_78793_a(-4.0f, 19.5f, -6.0f);
        this.bodybag7.func_78787_b(256, 256);
        this.bodybag7.field_78809_i = true;
        this.setRotation(this.bodybag7, -1.474235f, 0.0f, 0.0f);
        this.bodybag8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bodybag8.func_78789_a(0.0f, 0.0f, 0.0f, 8, 8, 3);
        this.bodybag8.func_78793_a(-4.0f, 17.0f, 5.0f);
        this.bodybag8.func_78787_b(256, 256);
        this.bodybag8.field_78809_i = true;
        this.setRotation(this.bodybag8, -1.209441f, 0.0f, 0.0f);
        this.bodybag9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bodybag9.func_78789_a(-4.0f, 0.0f, 0.0f, 4, 6, 8);
        this.bodybag9.func_78793_a(4.0f, 17.0f, 5.0f);
        this.bodybag9.func_78787_b(256, 256);
        this.bodybag9.field_78809_i = true;
        this.setRotation(this.bodybag9, 0.0f, 0.0f, -0.5576828f);
        this.bodybag10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bodybag10.func_78789_a(0.0f, 0.0f, 0.0f, 4, 6, 8);
        this.bodybag10.func_78793_a(-4.0f, 17.0f, 5.0f);
        this.bodybag10.func_78787_b(256, 256);
        this.bodybag10.field_78809_i = true;
        this.setRotation(this.bodybag10, 0.0f, 0.0f, 0.5576851f);
        this.bodybag11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bodybag11.func_78789_a(0.0f, 0.0f, 0.0f, 18, 1, 31);
        this.bodybag11.func_78793_a(-9.0f, 23.0f, -18.0f);
        this.bodybag11.func_78787_b(256, 256);
        this.bodybag11.field_78809_i = true;
        this.setRotation(this.bodybag11, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.bodybag1.func_78785_a(f5);
        this.bodybag2.func_78785_a(f5);
        this.bodybag3.func_78785_a(f5);
        this.bodybag4.func_78785_a(f5);
        this.bodybag5.func_78785_a(f5);
        this.bodybag6.func_78785_a(f5);
        this.bodybag7.func_78785_a(f5);
        this.bodybag8.func_78785_a(f5);
        this.bodybag9.func_78785_a(f5);
        this.bodybag10.func_78785_a(f5);
        this.bodybag11.func_78785_a(f5);
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


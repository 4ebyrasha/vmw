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

public class Dufflebag
extends ModelBase {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer dufflebag1;
    ModelRenderer dufflebag2;
    ModelRenderer dufflebag3;
    ModelRenderer dufflebag4;
    ModelRenderer dufflebag5;
    ModelRenderer dufflebag6;
    ModelRenderer dufflebag7;
    ModelRenderer dufflebag8;
    ModelRenderer dufflebag9;
    ModelRenderer dufflebag10;
    ModelRenderer dufflebag11;
    ModelRenderer dufflebag12;

    public Dufflebag() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.func_78789_a(-4.0f, -8.0f, -4.0f, 8, 8, 8);
        this.head.func_78793_a(0.0f, 0.0f, 0.0f);
        this.head.func_78787_b(256, 256);
        this.head.field_78809_i = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 16, 16);
        this.body.func_78789_a(-4.0f, 0.0f, -2.0f, 8, 12, 4);
        this.body.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body.func_78787_b(256, 256);
        this.body.field_78809_i = true;
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.rightarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.rightarm.func_78789_a(-3.0f, -2.0f, -2.0f, 4, 12, 4);
        this.rightarm.func_78793_a(-5.0f, 2.0f, 0.0f);
        this.rightarm.func_78787_b(256, 256);
        this.rightarm.field_78809_i = true;
        this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
        this.leftarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.leftarm.func_78789_a(-1.0f, -2.0f, -2.0f, 4, 12, 4);
        this.leftarm.func_78793_a(5.0f, 2.0f, 0.0f);
        this.leftarm.func_78787_b(256, 256);
        this.leftarm.field_78809_i = true;
        this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
        this.rightleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.rightleg.func_78789_a(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.rightleg.func_78793_a(-2.0f, 12.0f, 0.0f);
        this.rightleg.func_78787_b(256, 256);
        this.rightleg.field_78809_i = true;
        this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
        this.leftleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.leftleg.func_78789_a(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.leftleg.func_78793_a(2.0f, 12.0f, 0.0f);
        this.leftleg.func_78787_b(256, 256);
        this.leftleg.field_78809_i = true;
        this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
        this.dufflebag1 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag1.func_78789_a(1.0f, -4.0f, 2.0f, 6, 16, 6);
        this.dufflebag1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag1.func_78787_b(256, 256);
        this.dufflebag1.field_78809_i = true;
        this.setRotation(this.dufflebag1, 0.0f, 0.0f, 0.7807508f);
        this.dufflebag2 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag2.func_78789_a(0.5f, -4.0f, 3.0f, 1, 16, 4);
        this.dufflebag2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag2.func_78787_b(256, 256);
        this.dufflebag2.field_78809_i = true;
        this.setRotation(this.dufflebag2, 0.0f, 0.0f, 0.7807508f);
        this.dufflebag3 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag3.func_78789_a(6.5f, -4.0f, 3.0f, 1, 16, 4);
        this.dufflebag3.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag3.func_78787_b(256, 256);
        this.dufflebag3.field_78809_i = true;
        this.setRotation(this.dufflebag3, 0.0f, 0.0f, 0.7807508f);
        this.dufflebag4 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag4.func_78789_a(1.1f, -1.0f, 6.1f, 6, 2, 2);
        this.dufflebag4.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag4.func_78787_b(256, 256);
        this.dufflebag4.field_78809_i = true;
        this.setRotation(this.dufflebag4, 0.0f, 0.0f, 0.7807508f);
        this.dufflebag5 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag5.func_78789_a(0.9f, -1.0f, 6.1f, 1, 2, 2);
        this.dufflebag5.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag5.func_78787_b(256, 256);
        this.dufflebag5.field_78809_i = true;
        this.setRotation(this.dufflebag5, 0.0f, 0.0f, 0.7807508f);
        this.dufflebag6 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag6.func_78789_a(1.1f, 6.0f, 6.1f, 6, 2, 2);
        this.dufflebag6.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag6.func_78787_b(256, 256);
        this.dufflebag6.field_78809_i = true;
        this.setRotation(this.dufflebag6, 0.0f, 0.0f, 0.7807508f);
        this.dufflebag7 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag7.func_78789_a(0.9f, 6.0f, 6.1f, 1, 2, 2);
        this.dufflebag7.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag7.func_78787_b(256, 256);
        this.dufflebag7.field_78809_i = true;
        this.setRotation(this.dufflebag7, 0.0f, 0.0f, 0.7807508f);
        this.dufflebag8 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag8.func_78789_a(6.6f, -3.5f, 5.5f, 1, 15, 1);
        this.dufflebag8.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag8.func_78787_b(256, 256);
        this.dufflebag8.field_78809_i = true;
        this.setRotation(this.dufflebag8, 0.0f, 0.0f, 0.7807508f);
        this.dufflebag9 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag9.func_78789_a(0.4f, -3.5f, 5.5f, 1, 15, 1);
        this.dufflebag9.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag9.func_78787_b(256, 256);
        this.dufflebag9.field_78809_i = true;
        this.setRotation(this.dufflebag9, 0.0f, 0.0f, 0.7807508f);
        this.dufflebag10 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag10.func_78789_a(-4.1f, 10.0f, -2.1f, 1, 1, 5);
        this.dufflebag10.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag10.func_78787_b(256, 256);
        this.dufflebag10.field_78809_i = true;
        this.setRotation(this.dufflebag10, 0.0f, 0.0f, 0.0f);
        this.dufflebag11 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag11.func_78789_a(2.5f, -0.1f, -2.1f, 1, 1, 5);
        this.dufflebag11.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag11.func_78787_b(256, 256);
        this.dufflebag11.field_78809_i = true;
        this.setRotation(this.dufflebag11, 0.0f, 0.0f, 0.0f);
        this.dufflebag12 = new ModelRenderer((ModelBase)this, 0, 100);
        this.dufflebag12.func_78789_a(2.4f, -1.0f, -2.1f, 1, 12, 1);
        this.dufflebag12.func_78793_a(0.0f, 0.0f, 0.0f);
        this.dufflebag12.func_78787_b(256, 256);
        this.dufflebag12.field_78809_i = true;
        this.setRotation(this.dufflebag12, 0.0f, 0.0f, 0.5576792f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.dufflebag1.func_78785_a(f5);
        this.dufflebag2.func_78785_a(f5);
        this.dufflebag3.func_78785_a(f5);
        this.dufflebag4.func_78785_a(f5);
        this.dufflebag5.func_78785_a(f5);
        this.dufflebag6.func_78785_a(f5);
        this.dufflebag7.func_78785_a(f5);
        this.dufflebag8.func_78785_a(f5);
        this.dufflebag9.func_78785_a(f5);
        this.dufflebag10.func_78785_a(f5);
        this.dufflebag11.func_78785_a(f5);
        this.dufflebag12.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


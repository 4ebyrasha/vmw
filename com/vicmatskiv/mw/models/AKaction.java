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

public class AKaction
extends ModelBase {
    ModelRenderer Action1;
    ModelRenderer Action2;
    ModelRenderer Action3;
    ModelRenderer Action4;
    ModelRenderer Action5;
    ModelRenderer Action6;
    ModelRenderer Action7;
    ModelRenderer Action8;
    ModelRenderer Action9;
    ModelRenderer Action10;
    ModelRenderer Action11;
    ModelRenderer Action12;

    public AKaction() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.Action1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action1.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 13);
        this.Action1.func_78793_a(-2.5f, -15.0f, -33.5f);
        this.Action1.func_78787_b(128, 64);
        this.Action1.field_78809_i = true;
        this.setRotation(this.Action1, 0.0f, 0.0f, 0.1858931f);
        this.Action2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 7);
        this.Action2.func_78793_a(-3.5f, -13.0f, -33.5f);
        this.Action2.func_78787_b(128, 64);
        this.Action2.field_78809_i = true;
        this.setRotation(this.Action2, 0.0f, 0.0f, 0.0f);
        this.Action3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 6);
        this.Action3.func_78793_a(-3.2f, -13.0f, -26.5f);
        this.Action3.func_78787_b(128, 64);
        this.Action3.field_78809_i = true;
        this.setRotation(this.Action3, 0.0f, 0.0f, 0.0f);
        this.Action4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 11);
        this.Action4.func_78793_a(-3.0f, -13.0f, -20.5f);
        this.Action4.func_78787_b(128, 64);
        this.Action4.field_78809_i = true;
        this.setRotation(this.Action4, 0.0f, 0.0f, 0.0f);
        this.Action5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 2);
        this.Action5.func_78793_a(-3.5f, -13.0f, -26.5f);
        this.Action5.func_78787_b(128, 64);
        this.Action5.field_78809_i = true;
        this.setRotation(this.Action5, 0.0f, 0.1858931f, 0.0f);
        this.Action6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action6.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 1);
        this.Action6.func_78793_a(-7.0f, -12.2f, -33.5f);
        this.Action6.func_78787_b(128, 64);
        this.Action6.field_78809_i = true;
        this.setRotation(this.Action6, 0.0f, 0.0f, 0.0f);
        this.Action7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action7.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 7);
        this.Action7.func_78793_a(-3.5f, -13.0f, -33.5f);
        this.Action7.func_78787_b(128, 64);
        this.Action7.field_78809_i = true;
        this.setRotation(this.Action7, 0.0f, 0.0f, -0.5205006f);
        this.Action8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action8.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 6);
        this.Action8.func_78793_a(-3.2f, -13.0f, -26.5f);
        this.Action8.func_78787_b(128, 64);
        this.Action8.field_78809_i = true;
        this.setRotation(this.Action8, 0.0f, 0.0f, -0.8551081f);
        this.Action9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action9.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 13);
        this.Action9.func_78793_a(-2.9f, -13.6f, -33.5f);
        this.Action9.func_78787_b(128, 64);
        this.Action9.field_78809_i = true;
        this.setRotation(this.Action9, 0.0f, 0.0f, -0.5576792f);
        this.Action10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action10.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Action10.func_78793_a(-7.0f, -12.8f, -33.5f);
        this.Action10.func_78787_b(128, 64);
        this.Action10.field_78809_i = true;
        this.setRotation(this.Action10, 0.0f, 0.0f, 0.0f);
        this.Action11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action11.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Action11.func_78793_a(-6.0f, -12.8f, -33.5f);
        this.Action11.func_78787_b(128, 64);
        this.Action11.field_78809_i = true;
        this.setRotation(this.Action11, 0.0f, 0.0f, 0.0f);
        this.Action12 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action12.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Action12.func_78793_a(-5.0f, -12.8f, -33.5f);
        this.Action12.func_78787_b(128, 64);
        this.Action12.field_78809_i = true;
        this.setRotation(this.Action12, 0.0f, 0.0f, 0.7435722f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Action1.func_78785_a(f5);
        this.Action2.func_78785_a(f5);
        this.Action3.func_78785_a(f5);
        this.Action4.func_78785_a(f5);
        this.Action5.func_78785_a(f5);
        this.Action6.func_78785_a(f5);
        this.Action7.func_78785_a(f5);
        this.Action8.func_78785_a(f5);
        this.Action9.func_78785_a(f5);
        this.Action10.func_78785_a(f5);
        this.Action11.func_78785_a(f5);
        this.Action12.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


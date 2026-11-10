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

public class AR15Action
extends ModelBase {
    ModelRenderer Action1;
    ModelRenderer Action2;
    ModelRenderer Action3;
    ModelRenderer Action4;
    ModelRenderer Action5;
    ModelRenderer Action6;
    ModelRenderer Action7;

    public AR15Action() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.Action1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action1.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 15);
        this.Action1.func_78793_a(-0.3f, 0.0f, 0.0f);
        this.Action1.func_78787_b(128, 64);
        this.Action1.field_78809_i = true;
        this.setRotation(this.Action1, 0.0f, 0.0f, 0.0f);
        this.Action2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action2.func_78789_a(0.0f, 0.0f, 0.0f, 6, 2, 1);
        this.Action2.func_78793_a(-2.0f, -0.5f, 14.5f);
        this.Action2.func_78787_b(128, 64);
        this.Action2.field_78809_i = true;
        this.setRotation(this.Action2, 0.0f, 0.0f, 0.0f);
        this.Action3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 1);
        this.Action3.func_78793_a(-2.0f, -0.5f, 14.5f);
        this.Action3.func_78787_b(128, 64);
        this.Action3.field_78809_i = true;
        this.setRotation(this.Action3, 0.0f, 0.5576792f, 0.0f);
        this.Action4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 2);
        this.Action4.func_78793_a(4.0f, -0.5f, 14.5f);
        this.Action4.func_78787_b(128, 64);
        this.Action4.field_78809_i = true;
        this.setRotation(this.Action4, 0.0f, -2.119181f, 0.0f);
        this.Action5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action5.func_78789_a(0.0f, 0.0f, 0.0f, 4, 2, 1);
        this.Action5.func_78793_a(-1.0f, -0.5f, 14.0f);
        this.Action5.func_78787_b(128, 64);
        this.Action5.field_78809_i = true;
        this.setRotation(this.Action5, 0.0f, 0.0f, 0.0f);
        this.Action6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action6.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 1);
        this.Action6.func_78793_a(1.5f, 0.0f, 13.7f);
        this.Action6.func_78787_b(128, 64);
        this.Action6.field_78809_i = true;
        this.setRotation(this.Action6, 0.0f, 0.0743572f, 0.0f);
        this.Action7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Action7.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 15);
        this.Action7.func_78793_a(1.3f, 0.0f, 0.0f);
        this.Action7.func_78787_b(128, 64);
        this.Action7.field_78809_i = true;
        this.setRotation(this.Action7, 0.0f, 0.0f, 0.0f);
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
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


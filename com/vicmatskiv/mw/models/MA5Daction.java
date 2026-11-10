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

public class MA5Daction
extends ModelBase {
    ModelRenderer action1;
    ModelRenderer action2;
    ModelRenderer action3;
    ModelRenderer action4;
    ModelRenderer action5;
    ModelRenderer action6;
    ModelRenderer action7;
    ModelRenderer action8;

    public MA5Daction() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.action1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action1.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 12);
        this.action1.func_78793_a(0.1f, -16.7f, -10.2f);
        this.action1.func_78787_b(64, 32);
        this.action1.field_78809_i = true;
        this.setRotation(this.action1, 0.0f, 0.0f, 0.7853982f);
        this.action2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 12);
        this.action2.func_78793_a(0.2f, -16.6f, -10.2f);
        this.action2.func_78787_b(64, 32);
        this.action2.field_78809_i = true;
        this.setRotation(this.action2, 0.0f, 0.0f, 0.7853982f);
        this.action3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 12);
        this.action3.func_78793_a(-3.1f, -16.7f, -10.2f);
        this.action3.func_78787_b(64, 32);
        this.action3.field_78809_i = true;
        this.setRotation(this.action3, 0.0f, 0.0f, 0.7853982f);
        this.action4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 12);
        this.action4.func_78793_a(-3.2f, -16.6f, -10.2f);
        this.action4.func_78787_b(64, 32);
        this.action4.field_78809_i = true;
        this.setRotation(this.action4, 0.0f, 0.0f, 0.7853982f);
        this.action5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.action5.func_78793_a(0.6f, -17.6f, -9.2f);
        this.action5.func_78787_b(64, 32);
        this.action5.field_78809_i = true;
        this.setRotation(this.action5, 0.0f, 0.0f, 0.4507907f);
        this.action6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action6.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 1);
        this.action6.func_78793_a(0.6f, -17.6f, -9.2f);
        this.action6.func_78787_b(64, 32);
        this.action6.field_78809_i = true;
        this.setRotation(this.action6, 0.0f, 0.0f, -0.255603f);
        this.action7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action7.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 1);
        this.action7.func_78793_a(2.0f, -18.2f, -9.7f);
        this.action7.func_78787_b(64, 32);
        this.action7.field_78809_i = true;
        this.setRotation(this.action7, 0.0f, 0.0f, -0.255603f);
        this.action8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action8.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 1);
        this.action8.func_78793_a(2.15f, -17.75f, -9.7f);
        this.action8.func_78787_b(64, 32);
        this.action8.field_78809_i = true;
        this.setRotation(this.action8, 0.0f, 0.0f, -0.255603f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.action1.func_78785_a(f5);
        this.action2.func_78785_a(f5);
        this.action3.func_78785_a(f5);
        this.action4.func_78785_a(f5);
        this.action5.func_78785_a(f5);
        this.action6.func_78785_a(f5);
        this.action7.func_78785_a(f5);
        this.action8.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


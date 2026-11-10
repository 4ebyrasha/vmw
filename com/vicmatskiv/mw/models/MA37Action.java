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

public class MA37Action
extends ModelBase {
    ModelRenderer action1;
    ModelRenderer action2;
    ModelRenderer action3;
    ModelRenderer action4;
    ModelRenderer mag1;
    ModelRenderer mag2;
    ModelRenderer mag3;
    ModelRenderer mag4;
    ModelRenderer mag5;
    ModelRenderer mag6;
    ModelRenderer mag7;
    ModelRenderer mag8;
    ModelRenderer mag9;
    ModelRenderer mag10;
    ModelRenderer mag11;
    ModelRenderer mag12;
    ModelRenderer mag13;
    ModelRenderer mag14;

    public MA37Action() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.action1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action1.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 10);
        this.action1.func_78793_a(-3.3f, -16.0f, -11.2f);
        this.action1.func_78787_b(64, 32);
        this.action1.field_78809_i = true;
        this.setRotation(this.action1, 0.0f, 0.0f, 0.0f);
        this.action2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 10);
        this.action2.func_78793_a(-0.7f, -16.0f, -11.2f);
        this.action2.func_78787_b(64, 32);
        this.action2.field_78809_i = true;
        this.setRotation(this.action2, 0.0f, 0.0f, 0.0f);
        this.action3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action3.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 1);
        this.action3.func_78793_a(-0.2f, -15.7f, -11.2f);
        this.action3.func_78787_b(64, 32);
        this.action3.field_78809_i = true;
        this.setRotation(this.action3, 0.0f, 0.0f, 0.0f);
        this.action4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action4.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 1);
        this.action4.func_78793_a(2.8f, -15.7f, -10.2f);
        this.action4.func_78787_b(64, 32);
        this.action4.field_78809_i = true;
        this.setRotation(this.action4, 0.0f, -2.825574f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.action1.func_78785_a(f5);
        this.action2.func_78785_a(f5);
        this.action3.func_78785_a(f5);
        this.action4.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


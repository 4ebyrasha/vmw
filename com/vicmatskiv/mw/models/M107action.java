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

public class M107action
extends ModelBase {
    ModelRenderer action1;
    ModelRenderer action2;
    ModelRenderer action3;
    ModelRenderer action4;
    ModelRenderer action5;
    ModelRenderer action6;
    ModelRenderer action7;
    ModelRenderer action8;
    ModelRenderer action9;
    ModelRenderer action10;
    ModelRenderer action14;

    public M107action() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.action1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action1.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 32);
        this.action1.func_78793_a(-4.8f, -14.5f, -33.0f);
        this.action1.func_78787_b(64, 32);
        this.action1.field_78809_i = true;
        this.setRotation(this.action1, 0.0f, 0.0f, 0.0f);
        this.action2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 15);
        this.action2.func_78793_a(-4.8f, -14.5f, -33.0f);
        this.action2.func_78787_b(64, 32);
        this.action2.field_78809_i = true;
        this.setRotation(this.action2, 0.0f, 0.0f, -1.041001f);
        this.action3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.action3.func_78793_a(-4.9f, -14.5f, -8.0f);
        this.action3.func_78787_b(64, 32);
        this.action3.field_78809_i = true;
        this.setRotation(this.action3, 0.0f, 0.0f, 0.0f);
        this.action4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.action4.func_78793_a(-4.9f, -14.5f, -6.0f);
        this.action4.func_78787_b(64, 32);
        this.action4.field_78809_i = true;
        this.setRotation(this.action4, 0.0f, 0.0f, 0.0f);
        this.action5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.action5.func_78793_a(-4.9f, -14.5f, -4.0f);
        this.action5.func_78787_b(64, 32);
        this.action5.field_78809_i = true;
        this.setRotation(this.action5, 0.0f, 0.0f, 0.0f);
        this.action6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action6.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.action6.func_78793_a(-4.9f, -14.5f, -2.0f);
        this.action6.func_78787_b(64, 32);
        this.action6.field_78809_i = true;
        this.setRotation(this.action6, 0.0f, 0.0f, 0.0f);
        this.action7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action7.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 9);
        this.action7.func_78793_a(-4.8f, -14.5f, -18.0f);
        this.action7.func_78787_b(64, 32);
        this.action7.field_78809_i = true;
        this.setRotation(this.action7, 0.0f, 0.0f, -1.041001f);
        this.action8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action8.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 6);
        this.action8.func_78793_a(-4.6f, -14.5f, -18.0f);
        this.action8.func_78787_b(64, 32);
        this.action8.field_78809_i = true;
        this.setRotation(this.action8, 0.0f, 0.0f, -1.041001f);
        this.action9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action9.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 1);
        this.action9.func_78793_a(-6.3f, -14.5f, -33.0f);
        this.action9.func_78787_b(64, 32);
        this.action9.field_78809_i = true;
        this.setRotation(this.action9, 0.0f, 0.0f, 0.0f);
        this.action10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action10.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 2);
        this.action10.func_78793_a(-6.3f, -13.5f, -33.0f);
        this.action10.func_78787_b(64, 32);
        this.action10.field_78809_i = true;
        this.setRotation(this.action10, 1.933288f, 0.0f, 0.0f);
        this.action14 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action14.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 1);
        this.action14.func_78793_a(-8.3f, -15.0f, -33.55f);
        this.action14.func_78787_b(64, 32);
        this.action14.field_78809_i = true;
        this.setRotation(this.action14, 1.933288f, 0.0f, 0.0f);
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
        this.action9.func_78785_a(f5);
        this.action10.func_78785_a(f5);
        this.action14.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


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

public class M9Mag30
extends ModelBase {
    ModelRenderer mag1;
    ModelRenderer mag2;
    ModelRenderer mag3;
    ModelRenderer mag4;

    public M9Mag30() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.mag1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag1.func_78789_a(0.0f, 0.0f, 0.0f, 3, 25, 5);
        this.mag1.func_78793_a(-3.0f, -5.0f, -5.0f);
        this.mag1.func_78787_b(128, 128);
        this.mag1.field_78809_i = true;
        this.setRotation(this.mag1, 0.2230717f, 0.0f, 0.0f);
        this.mag2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag2.func_78789_a(0.0f, 0.0f, -0.5f, 2, 25, 1);
        this.mag2.func_78793_a(-2.5f, -5.0f, -5.0f);
        this.mag2.func_78787_b(128, 128);
        this.mag2.field_78809_i = true;
        this.setRotation(this.mag2, 0.2230717f, 0.0f, 0.0f);
        this.mag3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag3.func_78789_a(0.0f, 0.0f, 0.0f, 4, 2, 6);
        this.mag3.func_78793_a(-3.5f, 18.0f, -0.5f);
        this.mag3.func_78787_b(128, 128);
        this.mag3.field_78809_i = true;
        this.setRotation(this.mag3, 0.0f, 0.0f, 0.0f);
        this.mag4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag4.func_78789_a(0.0f, 0.0f, 0.0f, 3, 2, 7);
        this.mag4.func_78793_a(-3.0f, 18.0f, -1.3f);
        this.mag4.func_78787_b(128, 128);
        this.mag4.field_78809_i = true;
        this.setRotation(this.mag4, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.mag1.func_78785_a(f5);
        this.mag2.func_78785_a(f5);
        this.mag3.func_78785_a(f5);
        this.mag4.func_78785_a(f5);
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


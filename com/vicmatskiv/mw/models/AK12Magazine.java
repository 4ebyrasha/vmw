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

public class AK12Magazine
extends ModelBase {
    ModelRenderer Mag1;
    ModelRenderer Mag2;
    ModelRenderer Mag3;
    ModelRenderer Mag4;
    ModelRenderer Mag5;
    ModelRenderer Mag6;

    public AK12Magazine() {
        this.field_78090_t = 64;
        this.field_78089_u = 32;
        this.Mag1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Mag1.func_78789_a(0.0f, 0.0f, 0.0f, 4, 7, 6);
        this.Mag1.func_78793_a(-3.5f, -8.5f, -19.3f);
        this.Mag1.func_78787_b(64, 32);
        this.Mag1.field_78809_i = true;
        this.setRotation(this.Mag1, -0.1115358f, 0.0f, 0.0f);
        this.Mag2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Mag2.func_78789_a(0.0f, 0.0f, 0.0f, 4, 6, 6);
        this.Mag2.func_78793_a(-3.5f, -0.9f, -14.1f);
        this.Mag2.func_78787_b(64, 32);
        this.Mag2.field_78809_i = true;
        this.setRotation(this.Mag2, -1.821752f, 0.0f, 0.0f);
        this.Mag3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Mag3.func_78789_a(0.0f, 0.0f, 0.0f, 4, 6, 7);
        this.Mag3.func_78793_a(-3.5f, 4.9f, -15.55f);
        this.Mag3.func_78787_b(64, 32);
        this.Mag3.field_78809_i = true;
        this.setRotation(this.Mag3, -1.970466f, 0.0f, 0.0f);
        this.Mag4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Mag4.func_78789_a(0.0f, 0.0f, 0.0f, 3, 7, 2);
        this.Mag4.func_78793_a(-3.0f, -8.65f, -20.6f);
        this.Mag4.func_78787_b(64, 32);
        this.Mag4.field_78809_i = true;
        this.setRotation(this.Mag4, -0.1115358f, 0.0f, 0.0f);
        this.Mag5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Mag5.func_78789_a(0.0f, 0.0f, 0.0f, 3, 2, 6);
        this.Mag5.func_78793_a(-3.0f, -2.2f, -19.2f);
        this.Mag5.func_78787_b(64, 32);
        this.Mag5.field_78809_i = true;
        this.setRotation(this.Mag5, -1.821752f, 0.0f, 0.0f);
        this.Mag6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Mag6.func_78789_a(0.0f, 0.0f, 0.0f, 3, 2, 7);
        this.Mag6.func_78793_a(-3.0f, 2.9f, -20.4f);
        this.Mag6.func_78787_b(64, 32);
        this.Mag6.field_78809_i = true;
        this.setRotation(this.Mag6, -1.970466f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Mag1.func_78785_a(f5);
        this.Mag2.func_78785_a(f5);
        this.Mag3.func_78785_a(f5);
        this.Mag4.func_78785_a(f5);
        this.Mag5.func_78785_a(f5);
        this.Mag6.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


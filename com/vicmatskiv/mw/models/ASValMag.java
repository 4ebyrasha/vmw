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

public class ASValMag
extends ModelBase {
    ModelRenderer Mag1;
    ModelRenderer Mag2;
    ModelRenderer Mag3;
    ModelRenderer Mag4;

    public ASValMag() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.Mag1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Mag1.func_78789_a(0.0f, 0.0f, 0.0f, 4, 18, 5);
        this.Mag1.func_78793_a(0.5f, 8.1f, -2.2f);
        this.Mag1.func_78787_b(64, 32);
        this.Mag1.field_78809_i = true;
        this.setRotation(this.Mag1, 2.862753f, 0.0f, 0.0f);
        this.Mag2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Mag2.func_78789_a(0.0f, 0.0f, 0.0f, 3, 18, 2);
        this.Mag2.func_78793_a(1.0f, 7.15f, -6.3f);
        this.Mag2.func_78787_b(64, 32);
        this.Mag2.field_78809_i = true;
        this.setRotation(this.Mag2, 2.862753f, 0.0f, 0.0f);
        this.Mag3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Mag3.func_78789_a(0.0f, 0.0f, 0.0f, 4, 2, 2);
        this.Mag3.func_78793_a(0.5f, 7.3f, -6.5f);
        this.Mag3.func_78787_b(64, 32);
        this.Mag3.field_78809_i = true;
        this.setRotation(this.Mag3, 2.862753f, 0.0f, 0.0f);
        this.Mag4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Mag4.func_78789_a(0.0f, 0.0f, 0.0f, 5, 2, 5);
        this.Mag4.func_78793_a(0.0f, 8.55f, -2.3f);
        this.Mag4.func_78787_b(64, 32);
        this.Mag4.field_78809_i = true;
        this.setRotation(this.Mag4, 2.862753f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Mag1.func_78785_a(f5);
        this.Mag2.func_78785_a(f5);
        this.Mag3.func_78785_a(f5);
        this.Mag4.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


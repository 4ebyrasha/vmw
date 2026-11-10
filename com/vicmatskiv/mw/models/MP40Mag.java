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

public class MP40Mag
extends ModelBase {
    ModelRenderer gun102;
    ModelRenderer gun103;

    public MP40Mag() {
        this.field_78090_t = 256;
        this.field_78089_u = 128;
        this.gun102 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun102.func_78789_a(0.0f, 0.0f, 0.0f, 2, 20, 4);
        this.gun102.func_78793_a(1.2f, -9.0f, -19.5f);
        this.gun102.func_78787_b(64, 32);
        this.gun102.field_78809_i = true;
        this.setRotation(this.gun102, 0.0f, 0.0f, 0.0f);
        this.gun103 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun103.func_78789_a(0.0f, 0.0f, 0.0f, 2, 20, 4);
        this.gun103.func_78793_a(1.8f, -9.0f, -19.5f);
        this.gun103.func_78787_b(64, 32);
        this.gun103.field_78809_i = true;
        this.setRotation(this.gun103, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.gun102.func_78785_a(f5);
        this.gun103.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


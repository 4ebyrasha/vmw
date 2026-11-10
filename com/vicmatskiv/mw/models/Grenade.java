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

public class Grenade
extends ModelBase {
    ModelRenderer Grenade1;
    ModelRenderer Grenade2;

    public Grenade() {
        this.field_78090_t = 64;
        this.field_78089_u = 32;
        this.Grenade1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Grenade1.func_78789_a(0.0f, 0.0f, 0.0f, 3, 3, 5);
        this.Grenade1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Grenade1.func_78787_b(64, 32);
        this.Grenade1.field_78809_i = true;
        this.setRotation(this.Grenade1, 0.0f, 0.0f, 0.0f);
        this.Grenade2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Grenade2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 1);
        this.Grenade2.func_78793_a(0.5f, 0.5f, -1.0f);
        this.Grenade2.func_78787_b(64, 32);
        this.Grenade2.field_78809_i = true;
        this.setRotation(this.Grenade2, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Grenade1.func_78785_a(f5);
        this.Grenade2.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


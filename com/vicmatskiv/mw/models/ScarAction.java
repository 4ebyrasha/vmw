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

public class ScarAction
extends ModelBase {
    ModelRenderer gun149;
    ModelRenderer gun150;
    ModelRenderer gun151;
    ModelRenderer gun152;
    ModelRenderer gun116;

    public ScarAction() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.gun149 = new ModelRenderer((ModelBase)this, 100, 50);
        this.gun149.func_78789_a(0.0f, 0.0f, 0.0f, 7, 1, 1);
        this.gun149.func_78793_a(-5.0f, -19.1f, -32.0f);
        this.gun149.func_78787_b(64, 32);
        this.gun149.field_78809_i = true;
        this.setRotation(this.gun149, 0.0f, 0.0f, 0.0f);
        this.gun150 = new ModelRenderer((ModelBase)this, 100, 50);
        this.gun150.func_78789_a(0.0f, 0.0f, 0.0f, 7, 1, 1);
        this.gun150.func_78793_a(-5.0f, -18.9f, -32.0f);
        this.gun150.func_78787_b(64, 32);
        this.gun150.field_78809_i = true;
        this.setRotation(this.gun150, 0.0f, 0.0f, 0.0f);
        this.gun151 = new ModelRenderer((ModelBase)this, 100, 50);
        this.gun151.func_78789_a(0.0f, 0.0f, 0.0f, 7, 1, 1);
        this.gun151.func_78793_a(-5.0f, -19.0f, -32.1f);
        this.gun151.func_78787_b(64, 32);
        this.gun151.field_78809_i = true;
        this.setRotation(this.gun151, 0.0f, 0.0f, 0.0f);
        this.gun152 = new ModelRenderer((ModelBase)this, 100, 50);
        this.gun152.func_78789_a(0.0f, 0.0f, 0.0f, 7, 1, 1);
        this.gun152.func_78793_a(-5.0f, -19.0f, -31.9f);
        this.gun152.func_78787_b(64, 32);
        this.gun152.field_78809_i = true;
        this.setRotation(this.gun152, 0.0f, 0.0f, 0.0f);
        this.gun116 = new ModelRenderer((ModelBase)this, 100, 50);
        this.gun116.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 18);
        this.gun116.func_78793_a(-3.0f, -19.0f, -32.0f);
        this.gun116.func_78787_b(64, 32);
        this.gun116.field_78809_i = true;
        this.setRotation(this.gun116, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.gun149.func_78785_a(f5);
        this.gun150.func_78785_a(f5);
        this.gun151.func_78785_a(f5);
        this.gun152.func_78785_a(f5);
        this.gun116.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


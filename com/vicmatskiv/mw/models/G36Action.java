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

public class G36Action
extends ModelBase {
    ModelRenderer gun93;
    ModelRenderer gun376;
    ModelRenderer gun377;
    ModelRenderer gun378;
    ModelRenderer gun379;
    ModelRenderer gun380;
    ModelRenderer gun381;

    public G36Action() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.gun93 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun93.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 13);
        this.gun93.func_78793_a(-3.3f, -15.7f, -28.0f);
        this.gun93.func_78787_b(64, 32);
        this.gun93.field_78809_i = true;
        this.setRotation(this.gun93, 0.0f, 0.0f, 0.0f);
        this.gun376 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun376.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 12);
        this.gun376.func_78793_a(-2.5f, -20.0f, -27.0f);
        this.gun376.func_78787_b(64, 32);
        this.gun376.field_78809_i = true;
        this.setRotation(this.gun376, 0.0f, 0.0f, 0.0f);
        this.gun377 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun377.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.gun377.func_78793_a(-2.5f, -19.7f, -32.0f);
        this.gun377.func_78787_b(64, 32);
        this.gun377.field_78809_i = true;
        this.setRotation(this.gun377, 0.0f, 0.0f, 0.0f);
        this.gun378 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun378.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 1);
        this.gun378.func_78793_a(-2.5f, -20.0f, -27.0f);
        this.gun378.func_78787_b(64, 32);
        this.gun378.field_78809_i = true;
        this.setRotation(this.gun378, -0.8551081f, 0.0f, 0.0f);
        this.gun379 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun379.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 7);
        this.gun379.func_78793_a(-2.3f, -19.8f, -38.8f);
        this.gun379.func_78787_b(64, 32);
        this.gun379.field_78809_i = true;
        this.setRotation(this.gun379, -0.0261799f, 0.0f, 0.0f);
        this.gun380 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun380.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 7);
        this.gun380.func_78793_a(-1.7f, -19.8f, -38.8f);
        this.gun380.func_78787_b(64, 32);
        this.gun380.field_78809_i = true;
        this.setRotation(this.gun380, -0.0261799f, 0.0f, 0.0f);
        this.gun381 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun381.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 2);
        this.gun381.func_78793_a(-2.5f, -19.1f, -34.0f);
        this.gun381.func_78787_b(64, 32);
        this.gun381.field_78809_i = true;
        this.setRotation(this.gun381, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.gun93.func_78785_a(f5);
        this.gun376.func_78785_a(f5);
        this.gun377.func_78785_a(f5);
        this.gun378.func_78785_a(f5);
        this.gun379.func_78785_a(f5);
        this.gun380.func_78785_a(f5);
        this.gun381.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


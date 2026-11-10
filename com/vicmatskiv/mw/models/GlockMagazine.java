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

public class GlockMagazine
extends ModelBase {
    ModelRenderer gun1;
    ModelRenderer gun2;
    ModelRenderer gun3;
    ModelRenderer gun4;
    ModelRenderer gun5;
    ModelRenderer gun6;
    ModelRenderer gun7;
    ModelRenderer gun8;
    ModelRenderer gun9;
    ModelRenderer gun10;
    ModelRenderer gun11;

    public GlockMagazine() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.gun1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun1.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 6);
        this.gun1.func_78793_a(-3.5f, 4.0f, -4.5f);
        this.gun1.func_78787_b(64, 32);
        this.gun1.field_78809_i = true;
        this.setRotation(this.gun1, 0.0f, 0.0f, 0.0f);
        this.gun2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun2.func_78789_a(0.0f, 0.0f, 0.0f, 3, 11, 5);
        this.gun2.func_78793_a(-3.3f, -6.0f, -7.0f);
        this.gun2.func_78787_b(64, 32);
        this.gun2.field_78809_i = true;
        this.setRotation(this.gun2, 0.2974289f, 0.0f, 0.0f);
        this.gun3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun3.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.gun3.func_78793_a(-3.3f, 3.9f, -1.9f);
        this.gun3.func_78787_b(64, 32);
        this.gun3.field_78809_i = true;
        this.setRotation(this.gun3, 0.2974289f, 0.0f, 0.0f);
        this.gun4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun4.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 1);
        this.gun4.func_78793_a(-3.3f, 3.5f, -2.5f);
        this.gun4.func_78787_b(64, 32);
        this.gun4.field_78809_i = true;
        this.setRotation(this.gun4, 0.0f, 0.0f, 0.0f);
        this.gun5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 11, 5);
        this.gun5.func_78793_a(-0.7f, -6.0f, -7.0f);
        this.gun5.func_78787_b(64, 32);
        this.gun5.field_78809_i = true;
        this.setRotation(this.gun5, 0.2974289f, 0.0f, 0.0f);
        this.gun6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun6.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 3);
        this.gun6.func_78793_a(-0.7f, 3.9f, -1.9f);
        this.gun6.func_78787_b(64, 32);
        this.gun6.field_78809_i = true;
        this.setRotation(this.gun6, 0.2974289f, 0.0f, 0.0f);
        this.gun7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun7.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.gun7.func_78793_a(-0.7f, 3.5f, -2.5f);
        this.gun7.func_78787_b(64, 32);
        this.gun7.field_78809_i = true;
        this.setRotation(this.gun7, 0.0f, 0.0f, 0.0f);
        this.gun8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun8.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 1);
        this.gun8.func_78793_a(-3.3f, 4.0f, -4.5f);
        this.gun8.func_78787_b(64, 32);
        this.gun8.field_78809_i = true;
        this.setRotation(this.gun8, 0.8551081f, 0.0f, 0.0f);
        this.gun9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun9.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.gun9.func_78793_a(-0.7f, 4.0f, -4.5f);
        this.gun9.func_78787_b(64, 32);
        this.gun9.field_78809_i = true;
        this.setRotation(this.gun9, 0.8551081f, 0.0f, 0.0f);
        this.gun10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun10.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 2);
        this.gun10.func_78793_a(-3.0f, -6.5f, -7.0f);
        this.gun10.func_78787_b(64, 32);
        this.gun10.field_78809_i = true;
        this.setRotation(this.gun10, 0.2974289f, 0.0f, 0.0f);
        this.gun11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun11.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 4);
        this.gun11.func_78793_a(-3.0f, -7.5f, -7.0f);
        this.gun11.func_78787_b(64, 32);
        this.gun11.field_78809_i = true;
        this.setRotation(this.gun11, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.gun1.func_78785_a(f5);
        this.gun2.func_78785_a(f5);
        this.gun3.func_78785_a(f5);
        this.gun4.func_78785_a(f5);
        this.gun5.func_78785_a(f5);
        this.gun6.func_78785_a(f5);
        this.gun7.func_78785_a(f5);
        this.gun8.func_78785_a(f5);
        this.gun9.func_78785_a(f5);
        this.gun10.func_78785_a(f5);
        this.gun11.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


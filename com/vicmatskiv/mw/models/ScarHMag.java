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

public class ScarHMag
extends ModelBase {
    ModelRenderer gun1;
    ModelRenderer gun3;
    ModelRenderer gun4;
    ModelRenderer gun8;
    ModelRenderer gun9;
    ModelRenderer gun11;
    ModelRenderer gun13;
    ModelRenderer gun14;
    ModelRenderer gun15;
    ModelRenderer gun16;

    public ScarHMag() {
        this.field_78090_t = 256;
        this.field_78089_u = 128;
        this.gun1 = new ModelRenderer((ModelBase)this, 200, 0);
        this.gun1.func_78789_a(0.0f, 0.0f, 0.0f, 3, 11, 6);
        this.gun1.func_78793_a(1.0f, -12.0f, -4.5f);
        this.gun1.func_78787_b(64, 32);
        this.gun1.field_78809_i = true;
        this.setRotation(this.gun1, 0.0f, 0.0f, 0.0f);
        this.gun3 = new ModelRenderer((ModelBase)this, 200, 0);
        this.gun3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 12, 2);
        this.gun3.func_78793_a(0.8f, -12.0f, -0.5f);
        this.gun3.func_78787_b(64, 32);
        this.gun3.field_78809_i = true;
        this.setRotation(this.gun3, 0.0f, 0.0f, 0.0f);
        this.gun4 = new ModelRenderer((ModelBase)this, 200, 0);
        this.gun4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 12, 2);
        this.gun4.func_78793_a(3.2f, -12.0f, -0.5f);
        this.gun4.func_78787_b(64, 32);
        this.gun4.field_78809_i = true;
        this.setRotation(this.gun4, 0.0f, 0.0f, 0.0f);
        this.gun8 = new ModelRenderer((ModelBase)this, 200, 0);
        this.gun8.func_78789_a(0.0f, 0.0f, 0.0f, 1, 11, 2);
        this.gun8.func_78793_a(3.2f, -12.0f, -3.0f);
        this.gun8.func_78787_b(64, 32);
        this.gun8.field_78809_i = true;
        this.setRotation(this.gun8, 0.0f, 0.0f, 0.0f);
        this.gun9 = new ModelRenderer((ModelBase)this, 200, 0);
        this.gun9.func_78789_a(0.0f, 0.0f, 0.0f, 1, 11, 1);
        this.gun9.func_78793_a(3.2f, -12.0f, -4.5f);
        this.gun9.func_78787_b(64, 32);
        this.gun9.field_78809_i = true;
        this.setRotation(this.gun9, 0.0f, 0.0f, 0.0f);
        this.gun11 = new ModelRenderer((ModelBase)this, 200, 0);
        this.gun11.func_78789_a(0.0f, 0.0f, 0.0f, 1, 11, 1);
        this.gun11.func_78793_a(0.8f, -12.0f, -4.5f);
        this.gun11.func_78787_b(64, 32);
        this.gun11.field_78809_i = true;
        this.setRotation(this.gun11, 0.0f, 0.0f, 0.0f);
        this.gun13 = new ModelRenderer((ModelBase)this, 200, 0);
        this.gun13.func_78789_a(0.0f, 0.0f, 0.0f, 1, 11, 2);
        this.gun13.func_78793_a(0.8f, -12.0f, -3.0f);
        this.gun13.func_78787_b(64, 32);
        this.gun13.field_78809_i = true;
        this.setRotation(this.gun13, 0.0f, 0.0f, 0.0f);
        this.gun14 = new ModelRenderer((ModelBase)this, 200, 0);
        this.gun14.func_78789_a(0.0f, 0.0f, 0.0f, 3, 6, 1);
        this.gun14.func_78793_a(1.0f, -1.0f, -4.5f);
        this.gun14.func_78787_b(64, 32);
        this.gun14.field_78809_i = true;
        this.setRotation(this.gun14, 1.412787f, 0.0f, 0.0f);
        this.gun15 = new ModelRenderer((ModelBase)this, 200, 0);
        this.gun15.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 6);
        this.gun15.func_78793_a(1.5f, -1.0f, -4.5f);
        this.gun15.func_78787_b(64, 32);
        this.gun15.field_78809_i = true;
        this.setRotation(this.gun15, 0.0f, 0.0f, 0.0f);
        this.gun16 = new ModelRenderer((ModelBase)this, 200, 0);
        this.gun16.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 6);
        this.gun16.func_78793_a(1.0f, 0.0f, -4.5f);
        this.gun16.func_78787_b(64, 32);
        this.gun16.field_78809_i = true;
        this.setRotation(this.gun16, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.gun1.func_78785_a(f5);
        this.gun3.func_78785_a(f5);
        this.gun4.func_78785_a(f5);
        this.gun8.func_78785_a(f5);
        this.gun9.func_78785_a(f5);
        this.gun11.func_78785_a(f5);
        this.gun13.func_78785_a(f5);
        this.gun14.func_78785_a(f5);
        this.gun15.func_78785_a(f5);
        this.gun16.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


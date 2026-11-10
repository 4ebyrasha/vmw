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

public class AKMiron1
extends ModelBase {
    ModelRenderer sight1;
    ModelRenderer sight2;
    ModelRenderer sight3;
    ModelRenderer sight4;
    ModelRenderer sight5;
    ModelRenderer sight6;

    public AKMiron1() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.sight1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight1.func_78789_a(0.0f, 0.0f, 0.0f, 5, 2, 3);
        this.sight1.func_78793_a(-0.5f, 5.0f, -2.0f);
        this.sight1.func_78787_b(64, 32);
        this.sight1.field_78809_i = true;
        this.setRotation(this.sight1, 0.0f, 0.0f, 0.0f);
        this.sight2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 3, 4);
        this.sight2.func_78793_a(-1.5f, 4.0f, -2.5f);
        this.sight2.func_78787_b(64, 32);
        this.sight2.field_78809_i = true;
        this.setRotation(this.sight2, 0.0f, 0.0f, 0.0f);
        this.sight3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 3, 4);
        this.sight3.func_78793_a(4.5f, 4.0f, -2.5f);
        this.sight3.func_78787_b(64, 32);
        this.sight3.field_78809_i = true;
        this.setRotation(this.sight3, 0.0f, 0.0f, 0.0f);
        this.sight4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight4.func_78789_a(0.0f, 0.0f, 0.0f, 4, 2, 3);
        this.sight4.func_78793_a(0.0f, 5.3f, 1.0f);
        this.sight4.func_78787_b(64, 32);
        this.sight4.field_78809_i = true;
        this.setRotation(this.sight4, 0.0f, 0.0f, 0.0f);
        this.sight5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.sight5.func_78793_a(0.0f, 3.3f, 3.0f);
        this.sight5.func_78787_b(64, 32);
        this.sight5.field_78809_i = true;
        this.setRotation(this.sight5, 0.0f, 0.0f, 0.0f);
        this.sight6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.sight6.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.sight6.func_78793_a(3.0f, 3.3f, 3.0f);
        this.sight6.func_78787_b(64, 32);
        this.sight6.field_78809_i = true;
        this.setRotation(this.sight6, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.sight1.func_78785_a(f5);
        this.sight2.func_78785_a(f5);
        this.sight3.func_78785_a(f5);
        this.sight4.func_78785_a(f5);
        this.sight5.func_78785_a(f5);
        this.sight6.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


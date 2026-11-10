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

public class FilingCabinet
extends ModelBase {
    ModelRenderer cabinet1;
    ModelRenderer cabinet2;
    ModelRenderer cabinet3;
    ModelRenderer cabinet4;
    ModelRenderer cabinet5;

    public FilingCabinet() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.cabinet1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.cabinet1.func_78789_a(0.0f, 0.0f, 0.0f, 13, 16, 14);
        this.cabinet1.func_78793_a(-6.5f, 8.0f, -6.5f);
        this.cabinet1.func_78787_b(256, 256);
        this.cabinet1.field_78809_i = true;
        this.setRotation(this.cabinet1, 0.0f, 0.0f, 0.0f);
        this.cabinet2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.cabinet2.func_78789_a(0.0f, 0.0f, 0.0f, 11, 6, 1);
        this.cabinet2.func_78793_a(-5.5f, 16.0f, -6.7f);
        this.cabinet2.func_78787_b(256, 256);
        this.cabinet2.field_78809_i = true;
        this.setRotation(this.cabinet2, 0.0f, 0.0f, 0.0f);
        this.cabinet3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.cabinet3.func_78789_a(0.0f, 0.0f, 0.0f, 5, 2, 1);
        this.cabinet3.func_78793_a(-2.5f, 18.0f, -7.3f);
        this.cabinet3.func_78787_b(256, 256);
        this.cabinet3.field_78809_i = true;
        this.setRotation(this.cabinet3, 0.1487144f, 0.0f, 0.0f);
        this.cabinet4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.cabinet4.func_78789_a(0.0f, 0.0f, 0.0f, 11, 6, 1);
        this.cabinet4.func_78793_a(-5.5f, 9.5f, -6.7f);
        this.cabinet4.func_78787_b(256, 256);
        this.cabinet4.field_78809_i = true;
        this.setRotation(this.cabinet4, 0.0f, 0.0f, 0.0f);
        this.cabinet5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.cabinet5.func_78789_a(0.0f, 0.0f, 0.0f, 5, 2, 1);
        this.cabinet5.func_78793_a(-2.5f, 11.5f, -7.3f);
        this.cabinet5.func_78787_b(256, 256);
        this.cabinet5.field_78809_i = true;
        this.setRotation(this.cabinet5, 0.1487144f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.cabinet1.func_78785_a(f5);
        this.cabinet2.func_78785_a(f5);
        this.cabinet3.func_78785_a(f5);
        this.cabinet4.func_78785_a(f5);
        this.cabinet5.func_78785_a(f5);
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


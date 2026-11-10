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

public class AKiron3
extends ModelBase {
    ModelRenderer Iron1;
    ModelRenderer Iron2;
    ModelRenderer Iron3;
    ModelRenderer Iron4;
    ModelRenderer Iron5;
    ModelRenderer Iron6;
    ModelRenderer Iron7;

    public AKiron3() {
        this.field_78090_t = 64;
        this.field_78089_u = 32;
        this.Iron1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Iron1.func_78789_a(0.0f, 0.0f, 0.0f, 2, 8, 1);
        this.Iron1.func_78793_a(0.0f, -5.0f, 0.0f);
        this.Iron1.func_78787_b(64, 32);
        this.Iron1.field_78809_i = true;
        this.setRotation(this.Iron1, 0.0f, 0.0f, 0.0f);
        this.Iron2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Iron2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 4, 2);
        this.Iron2.func_78793_a(0.0f, -5.0f, 1.0f);
        this.Iron2.func_78787_b(64, 32);
        this.Iron2.field_78809_i = true;
        this.setRotation(this.Iron2, 0.0f, 0.0f, 0.0f);
        this.Iron3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Iron3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 8);
        this.Iron3.func_78793_a(0.0f, -5.0f, 3.0f);
        this.Iron3.func_78787_b(64, 32);
        this.Iron3.field_78809_i = true;
        this.setRotation(this.Iron3, -1.189716f, 0.0f, 0.0f);
        this.Iron4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Iron4.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 1);
        this.Iron4.func_78793_a(0.0f, -3.0f, 2.8f);
        this.Iron4.func_78787_b(64, 32);
        this.Iron4.field_78809_i = true;
        this.setRotation(this.Iron4, 0.0f, 0.0f, 0.0f);
        this.Iron5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Iron5.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 5);
        this.Iron5.func_78793_a(0.0f, 2.0f, 1.0f);
        this.Iron5.func_78787_b(64, 32);
        this.Iron5.field_78809_i = true;
        this.setRotation(this.Iron5, 0.0f, 0.0f, 0.0f);
        this.Iron6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Iron6.func_78789_a(0.0f, 0.0f, 0.0f, 2, 2, 1);
        this.Iron6.func_78793_a(0.0f, 0.0f, 4.0f);
        this.Iron6.func_78787_b(64, 32);
        this.Iron6.field_78809_i = true;
        this.setRotation(this.Iron6, 0.0f, 0.0f, 0.0f);
        this.Iron7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Iron7.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 3);
        this.Iron7.func_78793_a(0.0f, -1.5f, 1.0f);
        this.Iron7.func_78787_b(64, 32);
        this.Iron7.field_78809_i = true;
        this.setRotation(this.Iron7, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Iron1.func_78785_a(f5);
        this.Iron2.func_78785_a(f5);
        this.Iron3.func_78785_a(f5);
        this.Iron4.func_78785_a(f5);
        this.Iron5.func_78785_a(f5);
        this.Iron6.func_78785_a(f5);
        this.Iron7.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


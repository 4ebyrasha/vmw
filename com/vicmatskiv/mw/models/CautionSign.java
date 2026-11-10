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

public class CautionSign
extends ModelBase {
    ModelRenderer Caution1;
    ModelRenderer Caution2;
    ModelRenderer Caution3;
    ModelRenderer Caution4;
    ModelRenderer Caution5;
    ModelRenderer Caution6;
    ModelRenderer Caution7;
    ModelRenderer Caution8;
    ModelRenderer Caution9;
    ModelRenderer Caution10;

    public CautionSign() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.Caution1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Caution1.func_78789_a(0.0f, 0.0f, 0.0f, 3, 26, 1);
        this.Caution1.func_78793_a(-5.0f, -1.0f, -0.5f);
        this.Caution1.func_78787_b(128, 128);
        this.Caution1.field_78809_i = true;
        this.setRotation(this.Caution1, -0.2230717f, 0.0f, 0.0f);
        this.Caution2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Caution2.func_78789_a(0.0f, 0.0f, 0.0f, 3, 26, 1);
        this.Caution2.func_78793_a(2.0f, -1.0f, -0.5f);
        this.Caution2.func_78787_b(128, 128);
        this.Caution2.field_78809_i = true;
        this.setRotation(this.Caution2, -0.2230717f, 0.0f, 0.0f);
        this.Caution3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Caution3.func_78789_a(0.0f, 0.0f, -1.0f, 3, 26, 1);
        this.Caution3.func_78793_a(-5.0f, -1.0f, 0.5f);
        this.Caution3.func_78787_b(128, 128);
        this.Caution3.field_78809_i = true;
        this.setRotation(this.Caution3, 0.2230705f, 0.0f, 0.0f);
        this.Caution4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Caution4.func_78789_a(0.0f, 0.0f, -1.0f, 3, 26, 1);
        this.Caution4.func_78793_a(2.0f, -1.0f, 0.5f);
        this.Caution4.func_78787_b(128, 128);
        this.Caution4.field_78809_i = true;
        this.setRotation(this.Caution4, 0.2230705f, 0.0f, 0.0f);
        this.Caution5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Caution5.func_78789_a(0.0f, 0.0f, 0.0f, 4, 2, 1);
        this.Caution5.func_78793_a(-2.0f, -1.0f, -0.5f);
        this.Caution5.func_78787_b(128, 128);
        this.Caution5.field_78809_i = true;
        this.setRotation(this.Caution5, -0.2230717f, 0.0f, 0.0f);
        this.Caution6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Caution6.func_78789_a(0.0f, 6.0f, 0.0f, 4, 16, 1);
        this.Caution6.func_78793_a(-2.0f, -1.0f, -0.5f);
        this.Caution6.func_78787_b(128, 128);
        this.Caution6.field_78809_i = true;
        this.setRotation(this.Caution6, -0.2230717f, 0.0f, 0.0f);
        this.Caution7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Caution7.func_78789_a(0.0f, 0.0f, -1.0f, 4, 2, 1);
        this.Caution7.func_78793_a(-2.0f, -1.0f, 0.5f);
        this.Caution7.func_78787_b(128, 128);
        this.Caution7.field_78809_i = true;
        this.setRotation(this.Caution7, 0.2230705f, 0.0f, 0.0f);
        this.Caution8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Caution8.func_78789_a(0.0f, 6.0f, -1.0f, 4, 16, 1);
        this.Caution8.func_78793_a(-2.0f, -1.0f, 0.5f);
        this.Caution8.func_78787_b(128, 128);
        this.Caution8.field_78809_i = true;
        this.setRotation(this.Caution8, 0.2230705f, 0.0f, 0.0f);
        this.Caution9 = new ModelRenderer((ModelBase)this, 0, 50);
        this.Caution9.func_78789_a(0.0f, 9.0f, -0.1f, 5, 5, 1);
        this.Caution9.func_78793_a(-2.5f, -1.0f, -0.5f);
        this.Caution9.func_78787_b(128, 128);
        this.Caution9.field_78809_i = true;
        this.setRotation(this.Caution9, -0.2230717f, 0.0f, 0.0f);
        this.Caution10 = new ModelRenderer((ModelBase)this, 0, 50);
        this.Caution10.func_78789_a(0.0f, 9.0f, 0.1f, 5, 5, 1);
        this.Caution10.func_78793_a(-2.5f, -1.0f, -0.5f);
        this.Caution10.func_78787_b(128, 128);
        this.Caution10.field_78809_i = true;
        this.setRotation(this.Caution10, 0.2230705f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Caution1.func_78785_a(f5);
        this.Caution2.func_78785_a(f5);
        this.Caution3.func_78785_a(f5);
        this.Caution4.func_78785_a(f5);
        this.Caution5.func_78785_a(f5);
        this.Caution6.func_78785_a(f5);
        this.Caution7.func_78785_a(f5);
        this.Caution8.func_78785_a(f5);
        this.Caution9.func_78785_a(f5);
        this.Caution10.func_78785_a(f5);
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


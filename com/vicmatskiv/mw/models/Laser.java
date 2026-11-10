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

public class Laser
extends ModelBase {
    ModelRenderer laser1;
    ModelRenderer laser2;
    ModelRenderer laser3;
    ModelRenderer laser4;
    ModelRenderer laser5;
    ModelRenderer laser6;
    ModelRenderer laser7;
    ModelRenderer laser8;
    ModelRenderer laser9;
    ModelRenderer laser11;

    public Laser() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.laser1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.laser1.func_78789_a(0.0f, 0.0f, 0.0f, 3, 3, 10);
        this.laser1.func_78793_a(2.0f, 0.0f, 0.0f);
        this.laser1.func_78787_b(64, 32);
        this.laser1.field_78809_i = true;
        this.setRotation(this.laser1, 0.0f, 0.0f, 0.0f);
        this.laser2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.laser2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 10);
        this.laser2.func_78793_a(2.5f, -0.3f, 0.0f);
        this.laser2.func_78787_b(64, 32);
        this.laser2.field_78809_i = true;
        this.setRotation(this.laser2, 0.0f, 0.0f, 0.0f);
        this.laser3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.laser3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 10);
        this.laser3.func_78793_a(4.3f, 0.5f, 0.0f);
        this.laser3.func_78787_b(64, 32);
        this.laser3.field_78809_i = true;
        this.setRotation(this.laser3, 0.0f, 0.0f, 0.0f);
        this.laser4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.laser4.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 10);
        this.laser4.func_78793_a(2.5f, 2.3f, 0.0f);
        this.laser4.func_78787_b(64, 32);
        this.laser4.field_78809_i = true;
        this.setRotation(this.laser4, 0.0f, 0.0f, 0.0f);
        this.laser5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.laser5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 4);
        this.laser5.func_78793_a(5.3f, 0.5f, 4.0f);
        this.laser5.func_78787_b(64, 32);
        this.laser5.field_78809_i = true;
        this.setRotation(this.laser5, 0.0f, 0.0f, 0.0f);
        this.laser6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.laser6.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 4);
        this.laser6.func_78793_a(2.5f, -1.3f, 4.0f);
        this.laser6.func_78787_b(64, 32);
        this.laser6.field_78809_i = true;
        this.setRotation(this.laser6, 0.0f, 0.0f, 0.0f);
        this.laser7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.laser7.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 4);
        this.laser7.func_78793_a(2.5f, 3.3f, 4.0f);
        this.laser7.func_78787_b(64, 32);
        this.laser7.field_78809_i = true;
        this.setRotation(this.laser7, 0.0f, 0.0f, 0.0f);
        this.laser8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.laser8.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 4);
        this.laser8.func_78793_a(5.8f, 0.5f, 4.0f);
        this.laser8.func_78787_b(64, 32);
        this.laser8.field_78809_i = true;
        this.setRotation(this.laser8, 0.0f, 0.0f, 2.379431f);
        this.laser9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.laser9.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 4);
        this.laser9.func_78793_a(5.8f, 2.5f, 4.0f);
        this.laser9.func_78787_b(64, 32);
        this.laser9.field_78809_i = true;
        this.setRotation(this.laser9, 0.0f, 0.0f, 2.379431f);
        this.laser11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.laser11.func_78789_a(0.0f, 0.0f, 0.0f, 2, 4, 4);
        this.laser11.func_78793_a(0.0f, -0.5f, 4.0f);
        this.laser11.func_78787_b(64, 32);
        this.laser11.field_78809_i = true;
        this.setRotation(this.laser11, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.laser1.func_78785_a(f5);
        this.laser2.func_78785_a(f5);
        this.laser3.func_78785_a(f5);
        this.laser4.func_78785_a(f5);
        this.laser5.func_78785_a(f5);
        this.laser6.func_78785_a(f5);
        this.laser7.func_78785_a(f5);
        this.laser8.func_78785_a(f5);
        this.laser9.func_78785_a(f5);
        this.laser11.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


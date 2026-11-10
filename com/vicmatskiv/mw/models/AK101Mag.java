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

public class AK101Mag
extends ModelBase {
    ModelRenderer Magazine1;
    ModelRenderer Magazine4;
    ModelRenderer Magazine5;
    ModelRenderer Magazine7;

    public AK101Mag() {
        this.field_78090_t = 256;
        this.field_78089_u = 128;
        this.Magazine1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Magazine1.func_78789_a(0.0f, 0.0f, 0.0f, 4, 11, 7);
        this.Magazine1.func_78793_a(-3.5f, -8.0f, -25.0f);
        this.Magazine1.func_78787_b(64, 32);
        this.Magazine1.field_78809_i = true;
        this.setRotation(this.Magazine1, -0.1858931f, 0.0f, 0.0f);
        this.Magazine4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Magazine4.func_78789_a(0.0f, 0.0f, 0.0f, 4, 7, 12);
        this.Magazine4.func_78793_a(-3.5f, 4.0f, -20.1f);
        this.Magazine4.func_78787_b(64, 32);
        this.Magazine4.field_78809_i = true;
        this.setRotation(this.Magazine4, -2.082002f, 0.0f, 0.0f);
        this.Magazine5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Magazine5.func_78789_a(0.0f, 0.0f, 0.0f, 3, 11, 2);
        this.Magazine5.func_78793_a(-3.0f, -8.3f, -26.6f);
        this.Magazine5.func_78787_b(64, 32);
        this.Magazine5.field_78809_i = true;
        this.setRotation(this.Magazine5, -0.1858931f, 0.0f, 0.0f);
        this.Magazine7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Magazine7.func_78789_a(0.0f, 0.0f, 0.0f, 3, 2, 11);
        this.Magazine7.func_78793_a(-3.0f, 1.6f, -26.5f);
        this.Magazine7.func_78787_b(64, 32);
        this.Magazine7.field_78809_i = true;
        this.setRotation(this.Magazine7, -2.082002f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Magazine1.func_78785_a(f5);
        this.Magazine4.func_78785_a(f5);
        this.Magazine5.func_78785_a(f5);
        this.Magazine7.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


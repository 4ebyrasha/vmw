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

public class HKMP5Mag
extends ModelBase {
    ModelRenderer Magazine1;
    ModelRenderer Magazine2;
    ModelRenderer Magazine3;
    ModelRenderer Magazine4;
    ModelRenderer Magazine5;
    ModelRenderer Magazine6;
    ModelRenderer Magazine7;

    public HKMP5Mag() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.Magazine1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Magazine1.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 12);
        this.Magazine1.func_78793_a(-3.5f, 1.0f, -24.2f);
        this.Magazine1.func_78787_b(128, 128);
        this.Magazine1.field_78809_i = true;
        this.setRotation(this.Magazine1, 1.375609f, 0.0f, 0.0f);
        this.Magazine2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Magazine2.func_78789_a(0.0f, 0.0f, 0.0f, 4, 3, 12);
        this.Magazine2.func_78793_a(-3.5f, 2.0f, -19.3f);
        this.Magazine2.func_78787_b(128, 128);
        this.Magazine2.field_78809_i = true;
        this.setRotation(this.Magazine2, -2.044824f, 0.0f, 0.0f);
        this.Magazine3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Magazine3.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 12);
        this.Magazine3.func_78793_a(-3.5f, 0.3f, -22.8f);
        this.Magazine3.func_78787_b(128, 128);
        this.Magazine3.field_78809_i = true;
        this.setRotation(this.Magazine3, -2.044824f, 0.0f, 0.0f);
        this.Magazine4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Magazine4.func_78789_a(0.0f, 0.0f, 0.0f, 4, 3, 12);
        this.Magazine4.func_78793_a(-3.5f, 1.4f, -22.2f);
        this.Magazine4.func_78787_b(128, 128);
        this.Magazine4.field_78809_i = true;
        this.setRotation(this.Magazine4, 1.375609f, 0.0f, 0.0f);
        this.Magazine5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Magazine5.func_78789_a(0.0f, 0.0f, 0.0f, 4, 2, 1);
        this.Magazine5.func_78793_a(-3.5f, 10.75f, -26.4f);
        this.Magazine5.func_78787_b(128, 128);
        this.Magazine5.field_78809_i = true;
        this.setRotation(this.Magazine5, -2.044824f, 0.0f, 0.0f);
        this.Magazine6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Magazine6.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 12);
        this.Magazine6.func_78793_a(-3.0f, 0.3f, -21.8f);
        this.Magazine6.func_78787_b(128, 128);
        this.Magazine6.field_78809_i = true;
        this.setRotation(this.Magazine6, -2.044824f, 0.0f, 0.0f);
        this.Magazine7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Magazine7.func_78789_a(0.0f, 0.0f, 0.0f, 3, 2, 12);
        this.Magazine7.func_78793_a(-3.0f, 1.2f, -23.5f);
        this.Magazine7.func_78787_b(128, 128);
        this.Magazine7.field_78809_i = true;
        this.setRotation(this.Magazine7, 1.375609f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Magazine1.func_78785_a(f5);
        this.Magazine2.func_78785_a(f5);
        this.Magazine3.func_78785_a(f5);
        this.Magazine4.func_78785_a(f5);
        this.Magazine5.func_78785_a(f5);
        this.Magazine6.func_78785_a(f5);
        this.Magazine7.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


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

public class MA5Dmag
extends ModelBase {
    ModelRenderer mag1;
    ModelRenderer mag2;
    ModelRenderer mag3;
    ModelRenderer mag4;
    ModelRenderer mag5;
    ModelRenderer mag6;
    ModelRenderer mag7;
    ModelRenderer mag9;
    ModelRenderer mag10;
    ModelRenderer mag11;
    ModelRenderer mag12;
    ModelRenderer mag13;

    public MA5Dmag() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.mag1 = new ModelRenderer((ModelBase)this, 200, 100);
        this.mag1.func_78789_a(0.0f, 0.0f, 0.0f, 5, 1, 13);
        this.mag1.func_78793_a(-4.0f, 7.2f, 10.5f);
        this.mag1.func_78787_b(64, 32);
        this.mag1.field_78809_i = true;
        this.setRotation(this.mag1, 0.3346075f, 0.0f, 0.0f);
        this.mag2 = new ModelRenderer((ModelBase)this, 200, 100);
        this.mag2.func_78789_a(0.0f, 0.0f, 0.0f, 5, 2, 1);
        this.mag2.func_78793_a(-4.0f, 5.2f, 10.5f);
        this.mag2.func_78787_b(64, 32);
        this.mag2.field_78809_i = true;
        this.setRotation(this.mag2, 0.0f, 0.0f, 0.0f);
        this.mag3 = new ModelRenderer((ModelBase)this, 200, 100);
        this.mag3.func_78789_a(0.0f, 0.0f, 0.0f, 5, 2, 1);
        this.mag3.func_78793_a(-4.0f, 4.1f, 10.5f);
        this.mag3.func_78787_b(64, 32);
        this.mag3.field_78809_i = true;
        this.setRotation(this.mag3, 0.0f, 0.0f, 0.0f);
        this.mag4 = new ModelRenderer((ModelBase)this, 200, 100);
        this.mag4.func_78789_a(0.0f, 0.0f, 0.0f, 5, 3, 7);
        this.mag4.func_78793_a(-4.0f, 4.1f, 10.5f);
        this.mag4.func_78787_b(64, 32);
        this.mag4.field_78809_i = true;
        this.setRotation(this.mag4, 0.3089233f, 0.0f, 0.0f);
        this.mag5 = new ModelRenderer((ModelBase)this, 200, 100);
        this.mag5.func_78789_a(0.0f, 0.0f, 0.0f, 5, 3, 1);
        this.mag5.func_78793_a(-4.0f, 2.05f, 17.0f);
        this.mag5.func_78787_b(64, 32);
        this.mag5.field_78809_i = true;
        this.setRotation(this.mag5, 0.2974289f, 0.0f, 0.0f);
        this.mag6 = new ModelRenderer((ModelBase)this, 200, 100);
        this.mag6.func_78789_a(0.0f, 0.0f, 0.0f, 5, 2, 4);
        this.mag6.func_78793_a(-4.0f, 1.75f, 18.0f);
        this.mag6.func_78787_b(64, 32);
        this.mag6.field_78809_i = true;
        this.setRotation(this.mag6, 0.0f, 0.0f, 0.0f);
        this.mag7 = new ModelRenderer((ModelBase)this, 200, 100);
        this.mag7.func_78789_a(0.0f, 0.0f, 0.0f, 5, 1, 1);
        this.mag7.func_78793_a(-4.0f, 2.8f, 22.4f);
        this.mag7.func_78787_b(64, 32);
        this.mag7.field_78809_i = true;
        this.setRotation(this.mag7, 0.0f, 0.0f, 0.0f);
        this.mag9 = new ModelRenderer((ModelBase)this, 200, 100);
        this.mag9.func_78789_a(0.0f, 0.0f, 0.0f, 5, 2, 1);
        this.mag9.func_78793_a(-4.0f, 1.5f, 22.4f);
        this.mag9.func_78787_b(64, 32);
        this.mag9.field_78809_i = true;
        this.setRotation(this.mag9, 0.0f, 0.0f, 0.0f);
        this.mag10 = new ModelRenderer((ModelBase)this, 200, 100);
        this.mag10.func_78789_a(0.0f, 0.0f, 0.0f, 5, 1, 2);
        this.mag10.func_78793_a(-4.0f, 1.5f, 22.4f);
        this.mag10.func_78787_b(64, 32);
        this.mag10.field_78809_i = true;
        this.setRotation(this.mag10, -1.189716f, 0.0f, 0.0f);
        this.mag11 = new ModelRenderer((ModelBase)this, 200, 100);
        this.mag11.func_78789_a(0.0f, 0.0f, 0.0f, 5, 1, 4);
        this.mag11.func_78793_a(-4.0f, 3.6f, 18.4f);
        this.mag11.func_78787_b(64, 32);
        this.mag11.field_78809_i = true;
        this.setRotation(this.mag11, 0.2974289f, 0.0f, 0.0f);
        this.mag12 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag12.func_78789_a(0.0f, 0.0f, 0.0f, 2, 11, 11);
        this.mag12.func_78793_a(-2.9f, -6.9f, 11.5f);
        this.mag12.func_78787_b(64, 32);
        this.mag12.field_78809_i = true;
        this.setRotation(this.mag12, 0.0f, 0.0f, 0.0f);
        this.mag13 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag13.func_78789_a(0.0f, 0.0f, 0.0f, 1, 11, 11);
        this.mag13.func_78793_a(-1.1f, -6.9f, 11.5f);
        this.mag13.func_78787_b(64, 32);
        this.mag13.field_78809_i = true;
        this.setRotation(this.mag13, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.mag1.func_78785_a(f5);
        this.mag2.func_78785_a(f5);
        this.mag3.func_78785_a(f5);
        this.mag4.func_78785_a(f5);
        this.mag5.func_78785_a(f5);
        this.mag6.func_78785_a(f5);
        this.mag7.func_78785_a(f5);
        this.mag9.func_78785_a(f5);
        this.mag10.func_78785_a(f5);
        this.mag11.func_78785_a(f5);
        this.mag12.func_78785_a(f5);
        this.mag13.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


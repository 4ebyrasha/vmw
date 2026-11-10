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

public class L115Bolt2
extends ModelBase {
    ModelRenderer gun1;
    ModelRenderer gun2;
    ModelRenderer gun3;

    public L115Bolt2() {
        this.field_78090_t = 256;
        this.field_78089_u = 128;
        this.gun1 = new ModelRenderer((ModelBase)this, 150, 0);
        this.gun1.func_78789_a(0.0f, 0.0f, 0.0f, 1, 3, 1);
        this.gun1.func_78793_a(1.9f, -16.6f, 6.0f);
        this.gun1.func_78787_b(64, 32);
        this.gun1.field_78809_i = true;
        this.setRotation(this.gun1, 0.0f, 0.0f, 1.226894f);
        this.gun2 = new ModelRenderer((ModelBase)this, 150, 0);
        this.gun2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.gun2.func_78793_a(-1.0f, -15.5f, 6.0f);
        this.gun2.func_78787_b(64, 32);
        this.gun2.field_78809_i = true;
        this.setRotation(this.gun2, 0.4461411f, 0.2230705f, 1.041002f);
        this.gun3 = new ModelRenderer((ModelBase)this, 150, 0);
        this.gun3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.gun3.func_78793_a(-2.4f, -14.8f, 7.0f);
        this.gun3.func_78787_b(64, 32);
        this.gun3.field_78809_i = true;
        this.setRotation(this.gun3, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.gun1.func_78785_a(f5);
        this.gun2.func_78785_a(f5);
        this.gun3.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


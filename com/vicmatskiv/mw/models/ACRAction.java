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

public class ACRAction
extends ModelBase {
    ModelRenderer ACRAction1;
    ModelRenderer ACRAction2;
    ModelRenderer ACRAction3;
    ModelRenderer ACRAction4;

    public ACRAction() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.ACRAction1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.ACRAction1.func_78789_a(0.0f, 0.0f, 0.0f, 5, 1, 1);
        this.ACRAction1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.ACRAction1.func_78787_b(128, 64);
        this.ACRAction1.field_78809_i = true;
        this.setRotation(this.ACRAction1, 0.0f, 0.0f, 0.0f);
        this.ACRAction2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.ACRAction2.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 2);
        this.ACRAction2.func_78793_a(0.0f, 0.0f, 0.5f);
        this.ACRAction2.func_78787_b(128, 64);
        this.ACRAction2.field_78809_i = true;
        this.setRotation(this.ACRAction2, 0.0f, 0.0f, 0.0f);
        this.ACRAction3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.ACRAction3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 2);
        this.ACRAction3.func_78793_a(2.6f, 0.0f, 0.5f);
        this.ACRAction3.func_78787_b(128, 64);
        this.ACRAction3.field_78809_i = true;
        this.setRotation(this.ACRAction3, 0.0f, 0.0f, 0.0f);
        this.ACRAction4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.ACRAction4.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 1);
        this.ACRAction4.func_78793_a(5.0f, 0.0f, 1.0f);
        this.ACRAction4.func_78787_b(128, 64);
        this.ACRAction4.field_78809_i = true;
        this.setRotation(this.ACRAction4, 0.0f, -2.342252f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.ACRAction1.func_78785_a(f5);
        this.ACRAction2.func_78785_a(f5);
        this.ACRAction3.func_78785_a(f5);
        this.ACRAction4.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


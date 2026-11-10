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

public class ServerRackEmptyRight
extends ModelBase {
    ModelRenderer rack1;
    ModelRenderer rack2;
    ModelRenderer rack3;
    ModelRenderer rack4;

    public ServerRackEmptyRight() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.rack1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.rack1.func_78789_a(0.0f, 0.0f, 0.0f, 16, 2, 13);
        this.rack1.func_78793_a(-8.0f, 20.0f, -6.0f);
        this.rack1.func_78787_b(256, 256);
        this.rack1.field_78809_i = true;
        this.setRotation(this.rack1, 0.0f, 0.0f, 0.0f);
        this.rack2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.rack2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 16, 2);
        this.rack2.func_78793_a(6.2f, 8.0f, -6.1f);
        this.rack2.func_78787_b(256, 256);
        this.rack2.field_78809_i = true;
        this.setRotation(this.rack2, 0.0f, 0.0f, 0.0f);
        this.rack3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.rack3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 16, 2);
        this.rack3.func_78793_a(6.2f, 8.0f, 5.1f);
        this.rack3.func_78787_b(256, 256);
        this.rack3.field_78809_i = true;
        this.setRotation(this.rack3, 0.0f, 0.0f, 0.0f);
        this.rack4 = new ModelRenderer((ModelBase)this, 0, 50);
        this.rack4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 15, 9);
        this.rack4.func_78793_a(7.1f, 8.0f, -4.1f);
        this.rack4.func_78787_b(256, 256);
        this.rack4.field_78809_i = true;
        this.setRotation(this.rack4, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.rack1.func_78785_a(f5);
        this.rack2.func_78785_a(f5);
        this.rack3.func_78785_a(f5);
        this.rack4.func_78785_a(f5);
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


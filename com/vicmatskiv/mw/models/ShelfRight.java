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

public class ShelfRight
extends ModelBase {
    ModelRenderer shelf1;
    ModelRenderer shelf2;
    ModelRenderer shelf3;

    public ShelfRight() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.shelf1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.shelf1.func_78789_a(0.0f, 0.0f, 0.0f, 16, 2, 10);
        this.shelf1.func_78793_a(-8.0f, 21.0f, -5.0f);
        this.shelf1.func_78787_b(128, 128);
        this.shelf1.field_78809_i = true;
        this.setRotation(this.shelf1, 0.0f, 0.0f, 0.0f);
        this.shelf2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.shelf2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 16, 2);
        this.shelf2.func_78793_a(6.1f, 8.0f, -5.1f);
        this.shelf2.func_78787_b(128, 128);
        this.shelf2.field_78809_i = true;
        this.setRotation(this.shelf2, 0.0f, 0.0f, 0.0f);
        this.shelf3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.shelf3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 16, 2);
        this.shelf3.func_78793_a(6.1f, 8.0f, 3.1f);
        this.shelf3.func_78787_b(128, 128);
        this.shelf3.field_78809_i = true;
        this.setRotation(this.shelf3, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.shelf1.func_78785_a(f5);
        this.shelf2.func_78785_a(f5);
        this.shelf3.func_78785_a(f5);
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


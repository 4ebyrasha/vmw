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

public class ServerRackLeftAlt2
extends ModelBase {
    ModelRenderer rack1;
    ModelRenderer rack2;
    ModelRenderer rack3;
    ModelRenderer rack4;
    ModelRenderer rack5;
    ModelRenderer rack6;
    ModelRenderer rack7;
    ModelRenderer rack8;
    ModelRenderer rack9;
    ModelRenderer rack10;

    public ServerRackLeftAlt2() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.rack1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.rack1.func_78789_a(0.0f, 0.0f, 0.0f, 16, 2, 13);
        this.rack1.func_78793_a(-8.0f, 20.0f, -6.0f);
        this.rack1.func_78787_b(64, 32);
        this.rack1.field_78809_i = true;
        this.setRotation(this.rack1, 0.0f, 0.0f, 0.0f);
        this.rack2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.rack2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 16, 2);
        this.rack2.func_78793_a(-8.2f, 8.0f, -6.1f);
        this.rack2.func_78787_b(64, 32);
        this.rack2.field_78809_i = true;
        this.setRotation(this.rack2, 0.0f, 0.0f, 0.0f);
        this.rack3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.rack3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 16, 2);
        this.rack3.func_78793_a(-8.2f, 8.0f, 5.1f);
        this.rack3.func_78787_b(64, 32);
        this.rack3.field_78809_i = true;
        this.setRotation(this.rack3, 0.0f, 0.0f, 0.0f);
        this.rack4 = new ModelRenderer((ModelBase)this, 0, 50);
        this.rack4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 15, 9);
        this.rack4.func_78793_a(-8.1f, 8.0f, -4.1f);
        this.rack4.func_78787_b(64, 32);
        this.rack4.field_78809_i = true;
        this.setRotation(this.rack4, 0.0f, 0.0f, 0.0f);
        this.rack5 = new ModelRenderer((ModelBase)this, 100, 0);
        this.rack5.func_78789_a(0.0f, 0.0f, 0.0f, 15, 8, 12);
        this.rack5.func_78793_a(-7.0f, 8.0f, -5.5f);
        this.rack5.func_78787_b(64, 32);
        this.rack5.field_78809_i = true;
        this.setRotation(this.rack5, 0.0f, 0.0f, 0.0f);
        this.rack6 = new ModelRenderer((ModelBase)this, 100, 0);
        this.rack6.func_78789_a(0.0f, 0.0f, 0.0f, 15, 4, 11);
        this.rack6.func_78793_a(-7.0f, 16.0f, -5.2f);
        this.rack6.func_78787_b(64, 32);
        this.rack6.field_78809_i = true;
        this.setRotation(this.rack6, 0.0f, 0.0f, 0.0f);
        this.rack7 = new ModelRenderer((ModelBase)this, 100, 50);
        this.rack7.func_78789_a(0.0f, 0.0f, 0.0f, 13, 2, 1);
        this.rack7.func_78793_a(-6.0f, 16.3f, -5.5f);
        this.rack7.func_78787_b(64, 32);
        this.rack7.field_78809_i = true;
        this.setRotation(this.rack7, 0.0f, 0.0f, 0.0f);
        this.rack8 = new ModelRenderer((ModelBase)this, 100, 50);
        this.rack8.func_78789_a(0.0f, 0.0f, 0.0f, 13, 1, 1);
        this.rack8.func_78793_a(-6.0f, 18.7f, -5.5f);
        this.rack8.func_78787_b(64, 32);
        this.rack8.field_78809_i = true;
        this.setRotation(this.rack8, 0.0f, 0.0f, 0.0f);
        this.rack9 = new ModelRenderer((ModelBase)this, 100, 50);
        this.rack9.func_78789_a(0.0f, 0.0f, 0.0f, 8, 2, 1);
        this.rack9.func_78793_a(-5.5f, 16.3f, -5.7f);
        this.rack9.func_78787_b(64, 32);
        this.rack9.field_78809_i = true;
        this.setRotation(this.rack9, 0.0f, 0.0f, 0.0f);
        this.rack10 = new ModelRenderer((ModelBase)this, 100, 0);
        this.rack10.func_78789_a(0.0f, 0.0f, 0.0f, 15, 1, 1);
        this.rack10.func_78793_a(-7.0f, 9.0f, -5.6f);
        this.rack10.func_78787_b(64, 32);
        this.rack10.field_78809_i = true;
        this.setRotation(this.rack10, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.rack1.func_78785_a(f5);
        this.rack2.func_78785_a(f5);
        this.rack3.func_78785_a(f5);
        this.rack4.func_78785_a(f5);
        this.rack5.func_78785_a(f5);
        this.rack6.func_78785_a(f5);
        this.rack7.func_78785_a(f5);
        this.rack8.func_78785_a(f5);
        this.rack9.func_78785_a(f5);
        this.rack10.func_78785_a(f5);
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


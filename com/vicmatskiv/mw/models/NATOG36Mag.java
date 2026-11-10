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

public class NATOG36Mag
extends ModelBase {
    ModelRenderer gun133;
    ModelRenderer gun134;
    ModelRenderer gun135;
    ModelRenderer gun136;
    ModelRenderer gun137;
    ModelRenderer gun138;
    ModelRenderer gun139;
    ModelRenderer gun140;
    ModelRenderer gun141;
    ModelRenderer gun142;

    public NATOG36Mag() {
        this.field_78090_t = 256;
        this.field_78089_u = 128;
        this.gun133 = new ModelRenderer((ModelBase)this, 0, 50);
        this.gun133.func_78789_a(0.0f, 0.0f, 0.0f, 1, 8, 2);
        this.gun133.func_78793_a(0.8f, -12.4f, -2.8f);
        this.gun133.func_78787_b(64, 32);
        this.gun133.field_78809_i = true;
        this.setRotation(this.gun133, -0.1487144f, 0.0f, 0.0f);
        this.gun134 = new ModelRenderer((ModelBase)this, 0, 50);
        this.gun134.func_78789_a(0.0f, 0.0f, 0.0f, 3, 8, 2);
        this.gun134.func_78793_a(1.2f, -12.4f, -2.8f);
        this.gun134.func_78787_b(64, 32);
        this.gun134.field_78809_i = true;
        this.setRotation(this.gun134, -0.1487144f, 0.0f, 0.0f);
        this.gun135 = new ModelRenderer((ModelBase)this, 0, 50);
        this.gun135.func_78789_a(0.0f, 0.0f, 0.0f, 3, 8, 3);
        this.gun135.func_78793_a(1.2f, -11.9f, 0.1f);
        this.gun135.func_78787_b(64, 32);
        this.gun135.field_78809_i = true;
        this.setRotation(this.gun135, -0.1487144f, 0.0f, 0.0f);
        this.gun136 = new ModelRenderer((ModelBase)this, 0, 50);
        this.gun136.func_78789_a(0.0f, 0.0f, 0.0f, 1, 8, 3);
        this.gun136.func_78793_a(0.8f, -11.9f, 0.1f);
        this.gun136.func_78787_b(64, 32);
        this.gun136.field_78809_i = true;
        this.setRotation(this.gun136, -0.1487144f, 0.0f, 0.0f);
        this.gun137 = new ModelRenderer((ModelBase)this, 0, 50);
        this.gun137.func_78789_a(0.0f, 0.0f, 0.0f, 1, 3, 5);
        this.gun137.func_78793_a(0.8f, -3.6f, 1.9f);
        this.gun137.func_78787_b(64, 32);
        this.gun137.field_78809_i = true;
        this.setRotation(this.gun137, -1.896109f, 0.0f, 0.0f);
        this.gun138 = new ModelRenderer((ModelBase)this, 0, 50);
        this.gun138.func_78789_a(0.0f, 0.0f, 0.0f, 3, 3, 5);
        this.gun138.func_78793_a(1.2f, -3.6f, 1.9f);
        this.gun138.func_78787_b(64, 32);
        this.gun138.field_78809_i = true;
        this.setRotation(this.gun138, -1.896109f, 0.0f, 0.0f);
        this.gun139 = new ModelRenderer((ModelBase)this, 0, 50);
        this.gun139.func_78789_a(0.0f, 0.0f, 0.0f, 3, 2, 4);
        this.gun139.func_78793_a(1.2f, -4.2f, -2.05f);
        this.gun139.func_78787_b(64, 32);
        this.gun139.field_78809_i = true;
        this.setRotation(this.gun139, -1.896109f, 0.0f, 0.0f);
        this.gun140 = new ModelRenderer((ModelBase)this, 0, 50);
        this.gun140.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 4);
        this.gun140.func_78793_a(0.8f, -4.2f, -2.05f);
        this.gun140.func_78787_b(64, 32);
        this.gun140.field_78809_i = true;
        this.setRotation(this.gun140, -1.896109f, 0.0f, 0.0f);
        this.gun141 = new ModelRenderer((ModelBase)this, 0, 50);
        this.gun141.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 6);
        this.gun141.func_78793_a(0.5f, -1.2f, -5.2f);
        this.gun141.func_78787_b(64, 32);
        this.gun141.field_78809_i = true;
        this.setRotation(this.gun141, -0.2974289f, 0.0f, 0.0f);
        this.gun142 = new ModelRenderer((ModelBase)this, 0, 50);
        this.gun142.func_78789_a(0.0f, 0.0f, 0.0f, 3, 12, 3);
        this.gun142.func_78793_a(1.0f, -12.4f, -2.5f);
        this.gun142.func_78787_b(64, 32);
        this.gun142.field_78809_i = true;
        this.setRotation(this.gun142, -0.1858931f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.gun133.func_78785_a(f5);
        this.gun134.func_78785_a(f5);
        this.gun135.func_78785_a(f5);
        this.gun136.func_78785_a(f5);
        this.gun137.func_78785_a(f5);
        this.gun138.func_78785_a(f5);
        this.gun139.func_78785_a(f5);
        this.gun140.func_78785_a(f5);
        this.gun141.func_78785_a(f5);
        this.gun142.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


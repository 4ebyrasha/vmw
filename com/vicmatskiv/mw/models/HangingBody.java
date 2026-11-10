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

public class HangingBody
extends ModelBase {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer rope1;
    ModelRenderer rope2;

    public HangingBody() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.func_78789_a(0.0f, 0.0f, 0.0f, 8, 8, 8);
        this.head.func_78793_a(-4.0f, -8.0f, -6.0f);
        this.head.func_78787_b(256, 256);
        this.head.field_78809_i = true;
        this.setRotation(this.head, 0.2974289f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 16, 16);
        this.body.func_78789_a(0.0f, 0.0f, 0.0f, 8, 12, 4);
        this.body.func_78793_a(-4.0f, -2.0f, -2.0f);
        this.body.func_78787_b(256, 256);
        this.body.field_78809_i = true;
        this.setRotation(this.body, -0.0743572f, 0.0f, 0.0f);
        this.rightarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.rightarm.func_78789_a(-3.0f, -2.0f, -2.0f, 4, 12, 4);
        this.rightarm.func_78793_a(-5.0f, 1.0f, 0.0f);
        this.rightarm.func_78787_b(256, 256);
        this.rightarm.field_78809_i = true;
        this.setRotation(this.rightarm, -0.0371786f, 0.0f, 0.0371786f);
        this.leftarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.leftarm.func_78789_a(0.0f, 0.0f, 0.0f, 4, 12, 4);
        this.leftarm.func_78793_a(3.5f, -1.5f, -2.0f);
        this.leftarm.func_78787_b(256, 256);
        this.leftarm.field_78809_i = true;
        this.setRotation(this.leftarm, 0.0f, 0.0f, -0.1115358f);
        this.rightleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.rightleg.func_78789_a(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.rightleg.func_78793_a(-2.0f, 10.0f, -1.0f);
        this.rightleg.func_78787_b(256, 256);
        this.rightleg.field_78809_i = true;
        this.setRotation(this.rightleg, 0.0f, 0.0f, 0.1115358f);
        this.leftleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.leftleg.func_78789_a(0.0f, 0.0f, 0.0f, 4, 12, 4);
        this.leftleg.func_78793_a(0.0f, 10.0f, -3.0f);
        this.leftleg.func_78787_b(256, 256);
        this.leftleg.field_78809_i = true;
        this.setRotation(this.leftleg, 0.1858931f, 0.0f, 0.0f);
        this.rope1 = new ModelRenderer((ModelBase)this, 0, 46);
        this.rope1.func_78789_a(0.0f, 0.0f, 0.0f, 9, 2, 9);
        this.rope1.func_78793_a(-4.5f, -0.5f, -4.3f);
        this.rope1.func_78787_b(256, 256);
        this.rope1.field_78809_i = true;
        this.setRotation(this.rope1, 0.4461433f, 0.0f, 0.0f);
        this.rope2 = new ModelRenderer((ModelBase)this, 0, 46);
        this.rope2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 18, 2);
        this.rope2.func_78793_a(-1.0f, -20.5f, 2.7f);
        this.rope2.func_78787_b(256, 256);
        this.rope2.field_78809_i = true;
        this.setRotation(this.rope2, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.head.func_78785_a(f5);
        this.body.func_78785_a(f5);
        this.rightarm.func_78785_a(f5);
        this.leftarm.func_78785_a(f5);
        this.rightleg.func_78785_a(f5);
        this.leftleg.func_78785_a(f5);
        this.rope1.func_78785_a(f5);
        this.rope2.func_78785_a(f5);
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


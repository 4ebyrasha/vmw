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

public class TacticalPushPack
extends ModelBase {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer pack1;
    ModelRenderer pack2;
    ModelRenderer pack3;
    ModelRenderer pack4;
    ModelRenderer pack5;
    ModelRenderer pack6;
    ModelRenderer pack7;
    ModelRenderer pack8;
    ModelRenderer pack9;
    ModelRenderer pack10;
    ModelRenderer pack11;
    ModelRenderer pack12;
    ModelRenderer pack13;
    ModelRenderer pack14;
    ModelRenderer pack15;
    ModelRenderer pack16;
    ModelRenderer pack17;
    ModelRenderer pack18;
    ModelRenderer pack19;

    public TacticalPushPack() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.func_78789_a(-4.0f, -8.0f, -4.0f, 8, 8, 8);
        this.head.func_78793_a(0.0f, 0.0f, 0.0f);
        this.head.func_78787_b(256, 256);
        this.head.field_78809_i = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 16, 16);
        this.body.func_78789_a(-4.0f, 0.0f, -2.0f, 8, 12, 4);
        this.body.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body.func_78787_b(256, 256);
        this.body.field_78809_i = true;
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.rightarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.rightarm.func_78789_a(-3.0f, -2.0f, -2.0f, 4, 12, 4);
        this.rightarm.func_78793_a(-5.0f, 2.0f, 0.0f);
        this.rightarm.func_78787_b(256, 256);
        this.rightarm.field_78809_i = true;
        this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
        this.leftarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.leftarm.func_78789_a(-1.0f, -2.0f, -2.0f, 4, 12, 4);
        this.leftarm.func_78793_a(5.0f, 2.0f, 0.0f);
        this.leftarm.func_78787_b(256, 256);
        this.leftarm.field_78809_i = true;
        this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
        this.rightleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.rightleg.func_78789_a(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.rightleg.func_78793_a(-2.0f, 12.0f, 0.0f);
        this.rightleg.func_78787_b(256, 256);
        this.rightleg.field_78809_i = true;
        this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
        this.leftleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.leftleg.func_78789_a(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.leftleg.func_78793_a(2.0f, 12.0f, 0.0f);
        this.leftleg.func_78787_b(256, 256);
        this.leftleg.field_78809_i = true;
        this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
        this.pack1 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack1.func_78789_a(-6.0f, 8.0f, -2.5f, 3, 1, 5);
        this.pack1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack1.func_78787_b(256, 256);
        this.pack1.field_78809_i = true;
        this.setRotation(this.pack1, 0.0f, 0.0f, 0.0f);
        this.pack2 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack2.func_78789_a(-6.5f, 9.0f, -2.5f, 2, 4, 5);
        this.pack2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack2.func_78787_b(256, 256);
        this.pack2.field_78809_i = true;
        this.setRotation(this.pack2, 0.0f, 0.0f, 0.0f);
        this.pack3 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack3.func_78789_a(-5.0f, 9.0f, -3.5f, 2, 4, 7);
        this.pack3.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack3.func_78787_b(256, 256);
        this.pack3.field_78809_i = true;
        this.setRotation(this.pack3, 0.0f, 0.0f, 0.0f);
        this.pack4 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack4.func_78789_a(-5.5f, 10.0f, -3.0f, 2, 4, 6);
        this.pack4.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack4.func_78787_b(256, 256);
        this.pack4.field_78809_i = true;
        this.setRotation(this.pack4, 0.0f, 0.0f, 0.0f);
        this.pack5 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack5.func_78789_a(-6.0f, 13.0f, -2.5f, 2, 1, 5);
        this.pack5.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack5.func_78787_b(256, 256);
        this.pack5.field_78809_i = true;
        this.setRotation(this.pack5, 0.0f, 0.0f, 0.0f);
        this.pack6 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack6.func_78789_a(-4.3f, 6.0f, -2.5f, 1, 2, 5);
        this.pack6.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack6.func_78787_b(256, 256);
        this.pack6.field_78809_i = true;
        this.setRotation(this.pack6, 0.0f, 0.0f, 0.0f);
        this.pack7 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack7.func_78789_a(-0.2f, 6.8f, -2.5f, 3, 6, 5);
        this.pack7.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack7.func_78787_b(256, 256);
        this.pack7.field_78809_i = true;
        this.setRotation(this.pack7, 0.0f, 0.0f, 0.4833219f);
        this.pack8 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack8.func_78789_a(1.5f, -1.2f, -2.2f, 2, 8, 1);
        this.pack8.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack8.func_78787_b(256, 256);
        this.pack8.field_78809_i = true;
        this.setRotation(this.pack8, 0.0f, 0.0f, 0.669215f);
        this.pack9 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack9.func_78789_a(1.5f, -1.2f, 1.2f, 2, 8, 1);
        this.pack9.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack9.func_78787_b(256, 256);
        this.pack9.field_78809_i = true;
        this.setRotation(this.pack9, 0.0f, 0.0f, 0.669215f);
        this.pack10 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack10.func_78789_a(1.0f, -0.2f, -2.3f, 3, 1, 4);
        this.pack10.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack10.func_78787_b(256, 256);
        this.pack10.field_78809_i = true;
        this.setRotation(this.pack10, 0.0f, 0.0f, 0.0f);
        this.pack11 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack11.func_78789_a(1.0f, 0.2f, -2.3f, 3, 1, 4);
        this.pack11.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack11.func_78787_b(256, 256);
        this.pack11.field_78809_i = true;
        this.setRotation(this.pack11, 0.0f, 0.0f, 0.0f);
        this.pack12 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack12.func_78789_a(1.0f, -0.2f, 1.3f, 3, 1, 1);
        this.pack12.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack12.func_78787_b(256, 256);
        this.pack12.field_78809_i = true;
        this.setRotation(this.pack12, 0.0f, 0.0f, 0.0f);
        this.pack13 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack13.func_78789_a(1.0f, 0.2f, 1.3f, 3, 1, 1);
        this.pack13.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack13.func_78787_b(256, 256);
        this.pack13.field_78809_i = true;
        this.setRotation(this.pack13, 0.0f, 0.0f, 0.0f);
        this.pack14 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack14.func_78789_a(-6.6f, 7.9f, -2.0f, 2, 3, 4);
        this.pack14.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack14.func_78787_b(256, 256);
        this.pack14.field_78809_i = true;
        this.setRotation(this.pack14, 0.0f, 0.0f, 0.0f);
        this.pack15 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack15.func_78789_a(-6.7f, 10.1f, -1.0f, 1, 3, 2);
        this.pack15.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack15.func_78787_b(256, 256);
        this.pack15.field_78809_i = true;
        this.setRotation(this.pack15, 0.0f, 0.0f, 0.0f);
        this.pack16 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack16.func_78789_a(-6.7f, 8.5f, -1.5f, 1, 1, 3);
        this.pack16.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack16.func_78787_b(256, 256);
        this.pack16.field_78809_i = true;
        this.setRotation(this.pack16, 0.0f, 0.0f, 0.0f);
        this.pack17 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack17.func_78789_a(-5.6f, 11.0f, -3.1f, 1, 1, 1);
        this.pack17.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack17.func_78787_b(256, 256);
        this.pack17.field_78809_i = true;
        this.setRotation(this.pack17, 0.0f, 0.0f, 0.0f);
        this.pack18 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack18.func_78789_a(-5.6f, 11.0f, 2.1f, 1, 1, 1);
        this.pack18.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack18.func_78787_b(256, 256);
        this.pack18.field_78809_i = true;
        this.setRotation(this.pack18, 0.0f, 0.0f, 0.0f);
        this.pack19 = new ModelRenderer((ModelBase)this, 0, 100);
        this.pack19.func_78789_a(-4.6f, 6.5f, -2.0f, 1, 2, 4);
        this.pack19.func_78793_a(0.0f, 0.0f, 0.0f);
        this.pack19.func_78787_b(256, 256);
        this.pack19.field_78809_i = true;
        this.setRotation(this.pack19, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.pack1.func_78785_a(f5);
        this.pack2.func_78785_a(f5);
        this.pack3.func_78785_a(f5);
        this.pack4.func_78785_a(f5);
        this.pack5.func_78785_a(f5);
        this.pack6.func_78785_a(f5);
        this.pack7.func_78785_a(f5);
        this.pack8.func_78785_a(f5);
        this.pack9.func_78785_a(f5);
        this.pack10.func_78785_a(f5);
        this.pack11.func_78785_a(f5);
        this.pack12.func_78785_a(f5);
        this.pack13.func_78785_a(f5);
        this.pack14.func_78785_a(f5);
        this.pack15.func_78785_a(f5);
        this.pack16.func_78785_a(f5);
        this.pack17.func_78785_a(f5);
        this.pack18.func_78785_a(f5);
        this.pack19.func_78785_a(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


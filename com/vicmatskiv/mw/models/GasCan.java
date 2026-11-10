/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package com.vicmatskiv.mw.models;

import com.vicmatskiv.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GasCan
extends ModelWithAttachments {
    ModelRenderer can1;
    ModelRenderer can2;
    ModelRenderer can3;
    ModelRenderer can4;
    ModelRenderer can5;
    ModelRenderer can6;
    ModelRenderer can7;
    ModelRenderer can8;
    ModelRenderer can9;
    ModelRenderer can10;
    ModelRenderer can11;
    ModelRenderer can12;

    public GasCan() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.can1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.can1.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 7);
        this.can1.func_78793_a(-0.5f, -10.0f, -2.0f);
        this.can1.func_78787_b(256, 256);
        this.can1.field_78809_i = true;
        this.setRotation(this.can1, 0.0f, 0.0f, 0.0f);
        this.can2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.can2.func_78789_a(0.0f, 0.0f, 0.0f, 3, 4, 2);
        this.can2.func_78793_a(-1.0f, -10.5f, -4.0f);
        this.can2.func_78787_b(256, 256);
        this.can2.field_78809_i = true;
        this.setRotation(this.can2, 0.0f, 0.0f, 0.0f);
        this.can3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.can3.func_78789_a(0.0f, 0.0f, 0.0f, 3, 4, 3);
        this.can3.func_78793_a(-1.0f, -10.5f, 5.0f);
        this.can3.func_78787_b(256, 256);
        this.can3.field_78809_i = true;
        this.setRotation(this.can3, 0.0f, 0.0f, 0.0f);
        this.can4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.can4.func_78789_a(0.0f, 0.0f, 0.0f, 5, 18, 17);
        this.can4.func_78793_a(-2.0f, -6.5f, -8.0f);
        this.can4.func_78787_b(256, 256);
        this.can4.field_78809_i = true;
        this.setRotation(this.can4, 0.0f, 0.0f, 0.0f);
        this.can5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.can5.func_78789_a(0.0f, 0.0f, 0.0f, 3, 4, 2);
        this.can5.func_78793_a(-1.0f, -10.5f, -4.0f);
        this.can5.func_78787_b(256, 256);
        this.can5.field_78809_i = true;
        this.setRotation(this.can5, -0.4461433f, 0.0f, 0.0f);
        this.can6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.can6.func_78789_a(0.0f, 0.0f, 0.0f, 5, 2, 4);
        this.can6.func_78793_a(-2.0f, -6.5f, -8.0f);
        this.can6.func_78787_b(256, 256);
        this.can6.field_78809_i = true;
        this.setRotation(this.can6, 0.4089647f, 0.0f, 0.0f);
        this.can7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.can7.func_78789_a(0.0f, 0.0f, 0.0f, 2, 4, 2);
        this.can7.func_78793_a(-1.0f, -10.5f, -4.0f);
        this.can7.func_78787_b(256, 256);
        this.can7.field_78809_i = true;
        this.setRotation(this.can7, 0.0f, 0.0f, 0.2443461f);
        this.can8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.can8.func_78789_a(-2.0f, 0.0f, 0.0f, 2, 4, 2);
        this.can8.func_78793_a(2.0f, -10.5f, -4.0f);
        this.can8.func_78787_b(256, 256);
        this.can8.field_78809_i = true;
        this.setRotation(this.can8, 0.0f, 0.0f, -0.2443461f);
        this.can9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.can9.func_78789_a(-2.0f, 0.0f, 0.0f, 2, 4, 3);
        this.can9.func_78793_a(2.0f, -10.5f, 5.0f);
        this.can9.func_78787_b(256, 256);
        this.can9.field_78809_i = true;
        this.setRotation(this.can9, 0.0f, 0.0f, -0.2443461f);
        this.can10 = new ModelRenderer((ModelBase)this, 0, 0);
        this.can10.func_78789_a(0.0f, 0.0f, 0.0f, 2, 4, 3);
        this.can10.func_78793_a(-1.0f, -10.5f, 5.0f);
        this.can10.func_78787_b(256, 256);
        this.can10.field_78809_i = true;
        this.setRotation(this.can10, 0.0f, 0.0f, 0.2443461f);
        this.can11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.can11.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 4);
        this.can11.func_78793_a(-1.0f, -10.5f, 8.0f);
        this.can11.func_78787_b(256, 256);
        this.can11.field_78809_i = true;
        this.setRotation(this.can11, -1.33843f, 0.0f, 0.0f);
        this.can12 = new ModelRenderer((ModelBase)this, 0, 50);
        this.can12.func_78789_a(0.0f, 0.0f, 0.0f, 2, 5, 2);
        this.can12.func_78793_a(-0.5f, -11.0f, -9.0f);
        this.can12.func_78787_b(256, 256);
        this.can12.field_78809_i = true;
        this.setRotation(this.can12, 0.669215f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.can1.func_78785_a(f5);
        this.can2.func_78785_a(f5);
        this.can3.func_78785_a(f5);
        this.can4.func_78785_a(f5);
        this.can5.func_78785_a(f5);
        this.can6.func_78785_a(f5);
        this.can7.func_78785_a(f5);
        this.can8.func_78785_a(f5);
        this.can9.func_78785_a(f5);
        this.can10.func_78785_a(f5);
        this.can11.func_78785_a(f5);
        this.can12.func_78785_a(f5);
    }
}


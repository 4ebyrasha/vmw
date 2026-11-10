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

public class M1A1mag
extends ModelWithAttachments {
    ModelRenderer mag1;
    ModelRenderer mag2;
    ModelRenderer mag3;
    ModelRenderer mag4;
    ModelRenderer mag5;
    ModelRenderer mag6;

    public M1A1mag() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.mag1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag1.func_78789_a(0.0f, 0.0f, 0.0f, 2, 25, 4);
        this.mag1.func_78793_a(-2.3f, -7.5f, -11.5f);
        this.mag1.func_78787_b(64, 32);
        this.mag1.field_78809_i = true;
        this.setRotation(this.mag1, 0.0f, 0.0f, 0.0f);
        this.mag2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 25, 4);
        this.mag2.func_78793_a(-0.7f, -7.5f, -11.5f);
        this.mag2.func_78787_b(64, 32);
        this.mag2.field_78809_i = true;
        this.setRotation(this.mag2, 0.0f, 0.0f, 0.0f);
        this.mag3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 25, 1);
        this.mag3.func_78793_a(-2.0f, -7.5f, -12.5f);
        this.mag3.func_78787_b(64, 32);
        this.mag3.field_78809_i = true;
        this.setRotation(this.mag3, 0.0f, 0.0f, 0.0f);
        this.mag4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag4.func_78789_a(0.0f, 0.0f, 0.0f, 1, 25, 1);
        this.mag4.func_78793_a(0.3f, -7.5f, -11.5f);
        this.mag4.func_78787_b(64, 32);
        this.mag4.field_78809_i = true;
        this.setRotation(this.mag4, 0.0f, -2.876695f, 0.0f);
        this.mag5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag5.func_78789_a(0.0f, 0.0f, 0.0f, 1, 25, 1);
        this.mag5.func_78793_a(-2.3f, -7.5f, -11.5f);
        this.mag5.func_78787_b(64, 32);
        this.mag5.field_78809_i = true;
        this.setRotation(this.mag5, 0.0f, 1.301251f, 0.0f);
        this.mag6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.mag6.func_78789_a(0.0f, 0.0f, 0.0f, 2, 25, 1);
        this.mag6.func_78793_a(-2.0f, -7.5f, -8.0f);
        this.mag6.func_78787_b(64, 32);
        this.mag6.field_78809_i = true;
        this.setRotation(this.mag6, 0.0f, 0.0f, 0.0f);
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
    }
}


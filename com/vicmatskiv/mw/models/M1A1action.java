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

public class M1A1action
extends ModelWithAttachments {
    ModelRenderer action1;
    ModelRenderer action2;
    ModelRenderer action3;
    ModelRenderer action4;
    ModelRenderer action45;
    ModelRenderer action5;
    ModelRenderer action6;
    ModelRenderer action7;
    ModelRenderer action8;

    public M1A1action() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.action1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action1.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 14);
        this.action1.func_78793_a(-2.3f, -9.0f, -4.5f);
        this.action1.func_78787_b(64, 32);
        this.action1.field_78809_i = true;
        this.setRotation(this.action1, 0.0f, 0.0f, 0.0f);
        this.action2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action2.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 1);
        this.action2.func_78793_a(-4.3f, -9.2f, -4.5f);
        this.action2.func_78787_b(64, 32);
        this.action2.field_78809_i = true;
        this.setRotation(this.action2, 0.0f, 0.0f, 0.0f);
        this.action3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 1);
        this.action3.func_78793_a(-4.3f, -8.8f, -4.5f);
        this.action3.func_78787_b(64, 32);
        this.action3.field_78809_i = true;
        this.setRotation(this.action3, 0.0f, 0.0f, 0.0f);
        this.action4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action4.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 1);
        this.action4.func_78793_a(-4.3f, -9.0f, -4.7f);
        this.action4.func_78787_b(64, 32);
        this.action4.field_78809_i = true;
        this.setRotation(this.action4, 0.0f, 0.0f, 0.0f);
        this.action45 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action45.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 1);
        this.action45.func_78793_a(-4.3f, -9.0f, -4.3f);
        this.action45.func_78787_b(64, 32);
        this.action45.field_78809_i = true;
        this.setRotation(this.action45, 0.0f, 0.0f, 0.0f);
        this.action5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action5.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 7);
        this.action5.func_78793_a(-2.3f, -8.8f, -14.5f);
        this.action5.func_78787_b(64, 32);
        this.action5.field_78809_i = true;
        this.setRotation(this.action5, 0.0f, 0.0f, 0.0f);
        this.action6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action6.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 7);
        this.action6.func_78793_a(-1.3f, -9.8f, -14.5f);
        this.action6.func_78787_b(64, 32);
        this.action6.field_78809_i = true;
        this.setRotation(this.action6, 0.0f, 0.0f, 0.0f);
        this.action7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action7.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 7);
        this.action7.func_78793_a(-1.3f, -9.8f, -14.5f);
        this.action7.func_78787_b(64, 32);
        this.action7.field_78809_i = true;
        this.setRotation(this.action7, 0.0f, 0.0f, 0.7853982f);
        this.action8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.action8.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 7);
        this.action8.func_78793_a(-2.3f, -8.8f, -14.5f);
        this.action8.func_78787_b(64, 32);
        this.action8.field_78809_i = true;
        this.setRotation(this.action8, 0.0f, 0.0f, -0.7853982f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.action1.func_78785_a(f5);
        this.action2.func_78785_a(f5);
        this.action3.func_78785_a(f5);
        this.action4.func_78785_a(f5);
        this.action4.func_78785_a(f5);
        this.action5.func_78785_a(f5);
        this.action6.func_78785_a(f5);
        this.action7.func_78785_a(f5);
        this.action8.func_78785_a(f5);
    }
}


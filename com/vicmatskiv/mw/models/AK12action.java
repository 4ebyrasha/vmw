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

public class AK12action
extends ModelWithAttachments {
    ModelRenderer gun74;
    ModelRenderer gun75;
    ModelRenderer gun76;
    ModelRenderer gun77;
    ModelRenderer gun87;
    ModelRenderer gun90;

    public AK12action() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.gun74 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun74.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 11);
        this.gun74.func_78793_a(-0.6f, -11.5f, -27.0f);
        this.gun74.func_78787_b(64, 32);
        this.gun74.field_78809_i = true;
        this.setRotation(this.gun74, 0.0f, 0.0f, 0.0f);
        this.gun75 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun75.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 11);
        this.gun75.func_78793_a(-3.4f, -11.5f, -27.0f);
        this.gun75.func_78787_b(64, 32);
        this.gun75.field_78809_i = true;
        this.setRotation(this.gun75, 0.0f, 0.0f, 0.0f);
        this.gun76 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun76.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 11);
        this.gun76.func_78793_a(-3.4f, -11.5f, -27.0f);
        this.gun76.func_78787_b(64, 32);
        this.gun76.field_78809_i = true;
        this.setRotation(this.gun76, 0.0f, 0.0f, -1.33843f);
        this.gun77 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun77.func_78789_a(0.0f, 0.0f, 0.0f, 1, 3, 11);
        this.gun77.func_78793_a(0.4f, -11.5f, -27.0f);
        this.gun77.func_78787_b(64, 32);
        this.gun77.field_78809_i = true;
        this.setRotation(this.gun77, 0.0f, 0.0f, 2.899932f);
        this.gun87 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun87.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 8);
        this.gun87.func_78793_a(-3.0f, -13.8f, -35.0f);
        this.gun87.func_78787_b(64, 32);
        this.gun87.field_78809_i = true;
        this.setRotation(this.gun87, 0.0f, 0.0f, 0.0f);
        this.gun90 = new ModelRenderer((ModelBase)this, 0, 0);
        this.gun90.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 1);
        this.gun90.func_78793_a(-0.3f, -13.9f, -34.8f);
        this.gun90.func_78787_b(64, 32);
        this.gun90.field_78809_i = true;
        this.setRotation(this.gun90, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.gun74.func_78785_a(f5);
        this.gun75.func_78785_a(f5);
        this.gun76.func_78785_a(f5);
        this.gun77.func_78785_a(f5);
        this.gun87.func_78785_a(f5);
        this.gun90.func_78785_a(f5);
    }
}


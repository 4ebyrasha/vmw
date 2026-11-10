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

public class Bat
extends ModelWithAttachments {
    ModelRenderer Handle1;
    ModelRenderer Handle2;
    ModelRenderer Handle3;
    ModelRenderer Handle4;
    ModelRenderer Handle5;
    ModelRenderer Handle6;
    ModelRenderer Bat1;
    ModelRenderer Bat2;
    ModelRenderer Bat3;
    ModelRenderer Bat4;
    ModelRenderer Bat5;
    ModelRenderer Bat6;

    public Bat() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.Handle1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Handle1.func_78789_a(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.Handle1.func_78793_a(0.0f, 19.0f, 0.0f);
        this.Handle1.func_78787_b(64, 32);
        this.Handle1.field_78809_i = true;
        this.setRotation(this.Handle1, 0.0f, 0.0f, 0.0f);
        this.Handle2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Handle2.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.Handle2.func_78793_a(0.5f, 18.7f, 0.5f);
        this.Handle2.func_78787_b(64, 32);
        this.Handle2.field_78809_i = true;
        this.setRotation(this.Handle2, 0.0f, 0.0f, 0.0f);
        this.Handle3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Handle3.func_78789_a(0.0f, 0.0f, 0.0f, 1, 12, 3);
        this.Handle3.func_78793_a(1.5f, 6.7f, 0.5f);
        this.Handle3.func_78787_b(64, 32);
        this.Handle3.field_78809_i = true;
        this.setRotation(this.Handle3, 0.0f, 0.0f, 0.0f);
        this.Handle4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Handle4.func_78789_a(0.0f, 0.0f, 0.0f, 3, 12, 1);
        this.Handle4.func_78793_a(0.5f, 6.7f, 1.5f);
        this.Handle4.func_78787_b(64, 32);
        this.Handle4.field_78809_i = true;
        this.setRotation(this.Handle4, 0.0f, 0.0f, 0.0f);
        this.Handle5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Handle5.func_78789_a(-0.5f, 0.0f, 1.4f, 1, 12, 3);
        this.Handle5.func_78793_a(0.0f, 6.7f, 0.0f);
        this.Handle5.func_78787_b(64, 32);
        this.Handle5.field_78809_i = true;
        this.setRotation(this.Handle5, 0.0f, 0.7679449f, 0.0f);
        this.Handle6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Handle6.func_78789_a(0.2f, 0.0f, 0.6f, 1, 12, 3);
        this.Handle6.func_78793_a(3.0f, 6.7f, 0.0f);
        this.Handle6.func_78787_b(64, 32);
        this.Handle6.field_78809_i = true;
        this.setRotation(this.Handle6, 0.0f, -0.7679449f, 0.0f);
        this.Bat1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bat1.func_78789_a(0.0f, 0.0f, 0.0f, 2, 33, 4);
        this.Bat1.func_78793_a(1.0f, -26.0f, 0.0f);
        this.Bat1.func_78787_b(64, 32);
        this.Bat1.field_78809_i = true;
        this.setRotation(this.Bat1, 0.0f, 0.0f, 0.0f);
        this.Bat2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bat2.func_78789_a(0.0f, 0.0f, 0.0f, 4, 33, 2);
        this.Bat2.func_78793_a(0.0f, -26.0f, 1.0f);
        this.Bat2.func_78787_b(64, 32);
        this.Bat2.field_78809_i = true;
        this.setRotation(this.Bat2, 0.0f, 0.0f, 0.0f);
        this.Bat3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bat3.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 2);
        this.Bat3.func_78793_a(1.0f, -26.5f, 1.0f);
        this.Bat3.func_78787_b(64, 32);
        this.Bat3.field_78809_i = true;
        this.setRotation(this.Bat3, 0.0f, 0.0f, 0.0f);
        this.Bat4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bat4.func_78789_a(0.0f, 0.0f, 0.0f, 5, 24, 2);
        this.Bat4.func_78793_a(-0.5f, -24.0f, 1.0f);
        this.Bat4.func_78787_b(64, 32);
        this.Bat4.field_78809_i = true;
        this.setRotation(this.Bat4, 0.0f, 0.0f, 0.0f);
        this.Bat5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bat5.func_78789_a(0.0f, 0.0f, 0.0f, 2, 24, 5);
        this.Bat5.func_78793_a(1.0f, -24.0f, -0.5f);
        this.Bat5.func_78787_b(64, 32);
        this.Bat5.field_78809_i = true;
        this.setRotation(this.Bat5, 0.0f, 0.0f, 0.0f);
        this.Bat6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bat6.func_78789_a(0.0f, 0.0f, 0.0f, 4, 22, 4);
        this.Bat6.func_78793_a(0.0f, -24.0f, 0.0f);
        this.Bat6.func_78787_b(64, 32);
        this.Bat6.field_78809_i = true;
        this.setRotation(this.Bat6, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.Handle1.func_78785_a(f5);
        this.Handle2.func_78785_a(f5);
        this.Handle3.func_78785_a(f5);
        this.Handle4.func_78785_a(f5);
        this.Handle5.func_78785_a(f5);
        this.Handle6.func_78785_a(f5);
        this.Bat1.func_78785_a(f5);
        this.Bat2.func_78785_a(f5);
        this.Bat3.func_78785_a(f5);
        this.Bat4.func_78785_a(f5);
        this.Bat5.func_78785_a(f5);
        this.Bat6.func_78785_a(f5);
    }
}


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

public class M1CarbineAction
extends ModelWithAttachments {
    ModelRenderer action81;
    ModelRenderer action90;
    ModelRenderer action91;
    ModelRenderer action92;
    ModelRenderer action93;
    ModelRenderer action94;
    ModelRenderer action149;
    ModelRenderer action200;
    ModelRenderer action201;
    ModelRenderer action202;
    ModelRenderer action203;

    public M1CarbineAction() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.action81 = new ModelRenderer((ModelBase)this, 150, 0);
        this.action81.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 1);
        this.action81.func_78793_a(-5.5f, -12.5f, -21.5f);
        this.action81.func_78787_b(64, 32);
        this.action81.field_78809_i = true;
        this.setRotation(this.action81, 0.0f, 0.0f, 0.0f);
        this.action90 = new ModelRenderer((ModelBase)this, 150, 0);
        this.action90.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 8);
        this.action90.func_78793_a(-2.5f, -12.8f, -22.5f);
        this.action90.func_78787_b(64, 32);
        this.action90.field_78809_i = true;
        this.setRotation(this.action90, 0.0f, 0.0f, 0.0f);
        this.action91 = new ModelRenderer((ModelBase)this, 150, 0);
        this.action91.func_78789_a(0.0f, 0.0f, 0.0f, 2, 1, 2);
        this.action91.func_78793_a(-2.5f, -13.0f, -23.0f);
        this.action91.func_78787_b(64, 32);
        this.action91.field_78809_i = true;
        this.setRotation(this.action91, 0.0f, 0.0f, 0.0f);
        this.action92 = new ModelRenderer((ModelBase)this, 150, 0);
        this.action92.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 2);
        this.action92.func_78793_a(-2.5f, -13.0f, -23.0f);
        this.action92.func_78787_b(64, 32);
        this.action92.field_78809_i = true;
        this.setRotation(this.action92, 0.0f, 0.0f, 0.5948578f);
        this.action93 = new ModelRenderer((ModelBase)this, 150, 0);
        this.action93.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 2);
        this.action93.func_78793_a(-2.0f, -13.2f, -23.0f);
        this.action93.func_78787_b(64, 32);
        this.action93.field_78809_i = true;
        this.setRotation(this.action93, 0.0f, 0.0f, 0.0f);
        this.action94 = new ModelRenderer((ModelBase)this, 150, 0);
        this.action94.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 8);
        this.action94.func_78793_a(-2.0f, -13.0f, -22.5f);
        this.action94.func_78787_b(64, 32);
        this.action94.field_78809_i = true;
        this.setRotation(this.action94, 0.0f, 0.0f, 0.0f);
        this.action149 = new ModelRenderer((ModelBase)this, 150, 0);
        this.action149.func_78789_a(0.0f, 0.0f, 0.0f, 3, 1, 1);
        this.action149.func_78793_a(-5.5f, -13.0f, -21.5f);
        this.action149.func_78787_b(64, 32);
        this.action149.field_78809_i = true;
        this.setRotation(this.action149, 0.0f, 0.0f, 0.0f);
        this.action200 = new ModelRenderer((ModelBase)this, 150, 0);
        this.action200.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.action200.func_78793_a(-3.5f, -13.0f, -22.0f);
        this.action200.func_78787_b(64, 32);
        this.action200.field_78809_i = true;
        this.setRotation(this.action200, 0.0f, 0.0f, 0.0f);
        this.action201 = new ModelRenderer((ModelBase)this, 150, 0);
        this.action201.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.action201.func_78793_a(-3.5f, -12.5f, -22.0f);
        this.action201.func_78787_b(64, 32);
        this.action201.field_78809_i = true;
        this.setRotation(this.action201, 0.0f, 0.0f, 0.0f);
        this.action202 = new ModelRenderer((ModelBase)this, 150, 0);
        this.action202.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.action202.func_78793_a(-3.5f, -12.5f, -22.0f);
        this.action202.func_78787_b(64, 32);
        this.action202.field_78809_i = true;
        this.setRotation(this.action202, 0.0f, -1.041001f, 0.0f);
        this.action203 = new ModelRenderer((ModelBase)this, 150, 0);
        this.action203.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.action203.func_78793_a(-3.5f, -13.0f, -22.0f);
        this.action203.func_78787_b(64, 32);
        this.action203.field_78809_i = true;
        this.setRotation(this.action203, 0.0f, -1.041001f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.action81.func_78785_a(f5);
        this.action90.func_78785_a(f5);
        this.action91.func_78785_a(f5);
        this.action92.func_78785_a(f5);
        this.action93.func_78785_a(f5);
        this.action94.func_78785_a(f5);
        this.action149.func_78785_a(f5);
        this.action200.func_78785_a(f5);
        this.action201.func_78785_a(f5);
        this.action202.func_78785_a(f5);
        this.action203.func_78785_a(f5);
    }
}


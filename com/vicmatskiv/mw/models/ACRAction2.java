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

public class ACRAction2
extends ModelWithAttachments {
    ModelRenderer ACR96;
    ModelRenderer ACR97;
    ModelRenderer ACR139;
    ModelRenderer ACR140;

    public ACRAction2() {
        this.field_78090_t = 512;
        this.field_78089_u = 256;
        this.ACR96 = new ModelRenderer((ModelBase)this, 100, 0);
        this.ACR96.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 10);
        this.ACR96.func_78793_a(-3.6f, -14.5f, -22.0f);
        this.ACR96.func_78787_b(64, 32);
        this.ACR96.field_78809_i = true;
        this.setRotation(this.ACR96, 0.0f, 0.0f, 0.0f);
        this.ACR97 = new ModelRenderer((ModelBase)this, 100, 0);
        this.ACR97.func_78789_a(0.0f, 0.0f, 0.0f, 1, 2, 10);
        this.ACR97.func_78793_a(-3.5f, -15.5f, -22.0f);
        this.ACR97.func_78787_b(64, 32);
        this.ACR97.field_78809_i = true;
        this.setRotation(this.ACR97, 0.0f, 0.0f, 0.0f);
        this.ACR139 = new ModelRenderer((ModelBase)this, 100, 0);
        this.ACR139.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 14);
        this.ACR139.func_78793_a(-3.1f, -16.7f, -36.0f);
        this.ACR139.func_78787_b(64, 32);
        this.ACR139.field_78809_i = true;
        this.setRotation(this.ACR139, 0.0f, 0.0f, -0.9294653f);
        this.ACR140 = new ModelRenderer((ModelBase)this, 100, 0);
        this.ACR140.func_78789_a(0.0f, 0.0f, 0.0f, 1, 1, 14);
        this.ACR140.func_78793_a(0.2f, -16.6f, -36.0f);
        this.ACR140.func_78787_b(64, 32);
        this.ACR140.field_78809_i = true;
        this.setRotation(this.ACR140, 0.0f, 0.0f, 2.513274f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.ACR96.func_78785_a(f5);
        this.ACR97.func_78785_a(f5);
        this.ACR139.func_78785_a(f5);
        this.ACR140.func_78785_a(f5);
    }
}


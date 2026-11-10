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

public class UnertlReticle
extends ModelWithAttachments {
    ModelRenderer reticle1;
    ModelRenderer reticle2;
    ModelRenderer reticle3;
    ModelRenderer reticle4;
    ModelRenderer reticle5;
    ModelRenderer reticle6;

    public UnertlReticle() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.reticle1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle1.func_78789_a(0.0f, 0.0f, 0.0f, 2, 80, 0);
        this.reticle1.func_78793_a(-0.5f, -56.0f, 0.0f);
        this.reticle1.func_78787_b(256, 256);
        this.reticle1.field_78809_i = true;
        this.setRotation(this.reticle1, 0.0f, 0.0f, 0.0f);
        this.reticle2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle2.func_78789_a(0.0f, 0.0f, 0.0f, 1, 25, 0);
        this.reticle2.func_78793_a(0.0f, -81.0f, 0.0f);
        this.reticle2.func_78787_b(256, 256);
        this.reticle2.field_78809_i = true;
        this.setRotation(this.reticle2, 0.0f, 0.0f, 0.0f);
        this.reticle3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle3.func_78789_a(0.0f, 0.0f, 0.0f, 25, 1, 0);
        this.reticle3.func_78793_a(-12.0f, -70.0f, 0.0f);
        this.reticle3.func_78787_b(256, 256);
        this.reticle3.field_78809_i = true;
        this.setRotation(this.reticle3, 0.0f, 0.0f, 0.0f);
        this.reticle4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle4.func_78789_a(0.0f, 0.0f, 0.0f, 2, 80, 0);
        this.reticle4.func_78793_a(-0.5f, -161.0f, 0.0f);
        this.reticle4.func_78787_b(256, 256);
        this.reticle4.field_78809_i = true;
        this.setRotation(this.reticle4, 0.0f, 0.0f, 0.0f);
        this.reticle5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle5.func_78789_a(0.0f, 0.0f, 0.0f, 80, 2, 0);
        this.reticle5.func_78793_a(-92.0f, -70.5f, 0.0f);
        this.reticle5.func_78787_b(256, 256);
        this.reticle5.field_78809_i = true;
        this.setRotation(this.reticle5, 0.0f, 0.0f, 0.0f);
        this.reticle6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.reticle6.func_78789_a(0.0f, 0.0f, 0.0f, 80, 2, 0);
        this.reticle6.func_78793_a(13.0f, -70.5f, 0.0f);
        this.reticle6.func_78787_b(256, 256);
        this.reticle6.field_78809_i = true;
        this.setRotation(this.reticle6, 0.0f, 0.0f, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.reticle1.func_78785_a(f5);
        this.reticle2.func_78785_a(f5);
        this.reticle3.func_78785_a(f5);
        this.reticle4.func_78785_a(f5);
        this.reticle5.func_78785_a(f5);
        this.reticle6.func_78785_a(f5);
    }
}


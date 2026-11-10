/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBox
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class APC9Action
extends ModelBase {
    private final ModelRenderer bone41;
    private final ModelRenderer cube_r1;

    public APC9Action() {
        this.field_78090_t = 16;
        this.field_78089_u = 16;
        this.bone41 = new ModelRenderer((ModelBase)this);
        this.bone41.func_78793_a(1.0f, -15.0f, -10.5f);
        this.bone41.field_78804_l.add(new ModelBox(this.bone41, 20, 64, -2.0f, -2.7189f, -10.2321f, 1, 2, 9, 0.0f, false));
        this.bone41.field_78804_l.add(new ModelBox(this.bone41, 22, 0, -4.0f, -2.7189f, -10.2321f, 1, 2, 9, 0.0f, false));
        this.cube_r1 = new ModelRenderer((ModelBase)this);
        this.cube_r1.func_78793_a(-0.25f, -2.2189f, -9.7321f);
        this.bone41.func_78792_a(this.cube_r1);
        this.setRotationAngle(this.cube_r1, 0.0f, -0.1745f, 0.0f);
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 77, 44, -1.4566f, -0.5f, -0.2538f, 3, 1, 1, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone41.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


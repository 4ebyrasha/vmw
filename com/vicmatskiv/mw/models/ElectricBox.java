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

public class ElectricBox
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;

    public ElectricBox() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(1.0264f, 7.0f, 3.9276f);
        this.setRotationAngle(this.bone, 0.0f, 3.1416f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 20, 0, -2.7986f, -7.01f, -0.6682f, 8, 14, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 4, 74, -3.0128f, -6.5f, -0.4836f, 1, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 74, -3.0128f, 5.5f, -0.4836f, 1, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 24, 70, 3.3242f, -1.5f, -0.3646f, 1, 3, 1, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, 20.5f, 7.0f);
        this.setRotationAngle(this.bone2, 0.0f, -0.7854f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 49, -0.5f, -6.5f, -1.0f, 1, 13, 2, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.0f, 20.5f, 7.0f);
        this.setRotationAngle(this.bone3, 0.0f, 0.7854f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 20, 34, -0.5f, -6.5f, -1.0f, 1, 13, 2, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 18, 16, -5.0f, -24.0f, 4.0f, 10, 14, 4, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.func_78785_a(f5);
        this.bone2.func_78785_a(f5);
        this.bone3.func_78785_a(f5);
        this.bone4.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


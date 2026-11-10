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

public class Camera
extends ModelBase {
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone6;

    public Camera() {
        this.field_78090_t = 80;
        this.field_78089_u = 80;
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(-4.0f, 18.5f, -5.75f);
        this.setRotationAngle(this.bone3, -0.4363f, -0.7854f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 30, 15, 5.2592f, -0.4377f, -6.0019f, 3, 1, 11, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, 4.2592f, -3.7126f, -6.0f, 5, 1, 11, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 20, 0, 8.5f, -3.92f, -6.451f, 1, 3, 12, -0.2f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 12, 5.75f, -4.3617f, -6.45f, 2, 1, 12, -0.2f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 29, 44, 7.97f, -3.15f, -6.0019f, 1, 3, 11, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 39, 5.2592f, -3.4377f, -6.002f, 3, 3, 10, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 16, 33, 4.58f, -3.15f, -6.0019f, 1, 3, 11, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 16, 16, 4.0f, -3.92f, -6.451f, 1, 3, 12, -0.2f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(12.5374f, 0.9588f, -2.4245f);
        this.bone3.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, -0.7854f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 44, 27, -2.7448f, -4.3055f, -3.5755f, 1, 1, 11, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 34, 0, -4.8674f, -6.4088f, -3.5755f, 1, 1, 11, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(3.936f, -6.0859f, -1.0709f);
        this.bone3.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, 1.309f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 30, 30, 2.1751f, -1.6334f, -5.3791f, 1, 2, 12, -0.2f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(14.5426f, -1.6033f, -10.6837f);
        this.bone3.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -1.309f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 25, -0.1185f, -7.6607f, 4.2337f, 1, 2, 12, -0.2f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, 0.75f, -6.5f, -2.75f, 2, 2, 2, 0.2f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 42, 44, 0.75f, -4.35f, -7.75f, 2, 1, 7, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 4, 0.25f, -5.5f, -7.75f, 3, 4, 0, 0.2f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone3.func_78785_a(f5);
        this.bone6.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


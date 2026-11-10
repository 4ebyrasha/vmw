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

public class HescoBastion
extends ModelBase {
    private final ModelRenderer bastion;
    private final ModelRenderer bone;
    private final ModelRenderer bone3;
    private final ModelRenderer bone2;

    public HescoBastion() {
        this.field_78090_t = 100;
        this.field_78089_u = 100;
        this.bastion = new ModelRenderer((ModelBase)this);
        this.bastion.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bastion.field_78804_l.add(new ModelBox(this.bastion, 0, 0, -7.5f, -15.0f, -7.5f, 15, 14, 15, 0.0f, false));
        this.bastion.field_78804_l.add(new ModelBox(this.bastion, 0, 29, -7.0f, -1.0f, -7.0f, 14, 1, 14, 0.0f, false));
        this.bastion.field_78804_l.add(new ModelBox(this.bastion, 45, 0, -7.5f, -16.001f, -7.75f, 15, 3, 1, 0.0f, false));
        this.bastion.field_78804_l.add(new ModelBox(this.bastion, 17, 44, -7.5f, -16.001f, 6.75f, 15, 3, 1, 0.0f, false));
        this.bastion.field_78804_l.add(new ModelBox(this.bastion, 0, 44, -7.75f, -16.0f, -7.5f, 1, 3, 15, 0.0f, false));
        this.bastion.field_78804_l.add(new ModelBox(this.bastion, 41, 41, 6.75f, -16.0f, -7.5f, 1, 3, 15, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(6.0f, -15.4f, -5.7f);
        this.bastion.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, -1.0821f, -0.2967f, -0.0873f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 45, 4, -7.0f, -7.0f, 0.0f, 7, 7, 3, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(-2.4f, -15.2f, -8.6f);
        this.bastion.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, -1.0821f, 0.7505f, -0.0873f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 17, 48, -7.0f, -5.0f, 0.0f, 5, 5, 3, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-5.1f, -15.3f, 7.5f);
        this.bastion.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, -1.2741f, -2.9147f, -0.0175f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 42, 29, -12.0f, -7.0f, 0.0f, 12, 7, 3, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bastion.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


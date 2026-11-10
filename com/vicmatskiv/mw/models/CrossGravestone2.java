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

public class CrossGravestone2
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bb_main;

    public CrossGravestone2() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-5.5f, 24.0f, -3.5f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.0f, -3.0f, 0.0f, 13, 3, 7, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 10, 0.0f, -14.0f, 1.0f, 11, 11, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 25, 27, 3.0f, -16.0f, 0.999f, 5, 2, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 24, 34, 4.5f, -26.0f, 2.499f, 2, 12, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 27, 10, 2.0f, -23.5f, 2.5f, 7, 2, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 26, 0.5f, -15.0f, 1.001f, 10, 1, 5, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(5.5f, -17.0f, 1.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -1.9373f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 12, 32, -1.0f, -7.0f, 0.0f, 1, 7, 5, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(5.5f, -17.0f, 1.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 1.9373f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 32, 0.0f, -7.0f, 0.0f, 1, 7, 5, 0.0f, false));
        this.bb_main = new ModelRenderer((ModelBase)this);
        this.bb_main.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bb_main.field_78804_l.add(new ModelBox(this.bb_main, 0, 0, -8.0f, -16.0f, -8.0f, 16, 16, 16, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


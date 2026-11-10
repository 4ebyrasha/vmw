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

public class CrossGravestone
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;

    public CrossGravestone() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-6.0f, 24.0f, -4.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 0.0f, -2.0f, 1.0f, 12, 2, 6, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 33, 4.0f, -4.0f, 2.0f, 4, 2, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 20, 20, 4.0f, -16.0f, 2.5f, 1, 12, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 36, 6, 4.0f, -24.0f, 2.5f, 1, 6, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 12, 14, 7.0f, -16.0f, 2.5f, 1, 12, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 37, 7.0f, -24.0f, 2.5f, 1, 6, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 36, 32, 5.0f, -24.0f, 2.5f, 2, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 14, 4.5f, -23.75f, 2.5f, 3, 20, 3, -0.2f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 8, -1.5f, -18.75f, 2.501f, 15, 3, 3, -0.2f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 28, 22, -2.0f, -19.0f, 2.501f, 6, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 25, 18, 8.0f, -19.0f, 2.501f, 6, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 21, 38, 13.0f, -18.0f, 2.501f, 1, 2, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 37, 37, -2.0f, -18.0f, 2.501f, 1, 2, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 28, 28, -2.0f, -16.0f, 2.501f, 6, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 20, 14, 8.0f, -16.0f, 2.501f, 6, 1, 3, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(4.0f, -4.0f, 2.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.5585f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 24, 32, -4.0f, 0.0f, -0.01f, 4, 2, 4, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(8.0f, -4.0f, 2.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.5585f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 30, 0, 0.0f, 0.0f, -0.01f, 4, 2, 4, 0.0f, false));
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


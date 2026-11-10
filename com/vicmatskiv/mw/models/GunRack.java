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

public class GunRack
extends ModelBase {
    private final ModelRenderer bone;

    public GunRack() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 187, 117, -2.0f, -48.0f, 28.0f, 11, 44, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 187, 117, -2.0f, -48.0f, -19.0f, 11, 44, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 61, 10.5f, -48.0f, -17.0f, 0, 44, 43, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 52, 10.0f, -32.0f, 22.5f, 1, 11, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 83, 40, -1.0f, -39.0f, -15.0f, 7, 2, 7, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 83, 71, -1.0f, -39.0f, -7.0f, 7, 2, 7, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 83, 83, -2.0f, -35.0f, -11.0f, 10, 4, 12, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 86, 104, -2.0f, -23.0f, -12.0f, 6, 4, 13, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 72, -2.0f, -29.0f, -17.0f, 10, 4, 12, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 52, -2.0f, -17.0f, -16.0f, 8, 4, 16, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 88, 0.0f, -11.0f, -9.0f, 7, 4, 9, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 28, 168, -2.0f, -24.0f, 21.0f, 6, 20, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 14, 168, -2.0f, -24.0f, 18.0f, 6, 20, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 163, 0, -2.0f, -24.0f, 12.0f, 6, 20, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 48, 163, -2.0f, -24.0f, 8.75f, 6, 20, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 32, 52, -2.0f, -41.0f, 21.0f, 6, 4, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 32, 57, -2.0f, -41.0f, 18.0f, 6, 4, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 32, 72, -2.0f, -41.0f, 12.0f, 6, 4, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 83, 0, -2.0f, -41.0f, 9.25f, 6, 4, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 123, 41, -2.0f, -37.0f, -17.0f, 11, 1, 18, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 123, 22, -2.0f, -31.0f, -17.0f, 11, 1, 18, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 83, 21, -2.0f, -25.0f, -17.0f, 11, 1, 18, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 83, 52, -2.0f, -19.0f, -17.0f, 11, 1, 18, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 123, 3, -2.0f, -13.0f, -17.0f, 11, 1, 18, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 83, 0, -2.0f, -7.0f, -17.0f, 11, 3, 18, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.0f, -48.0f, 1.0f, 10, 44, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 89, 89, -3.0f, -48.0f, -17.0f, 1, 44, 43, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 24, 0, -5.0f, -48.0f, 26.0f, 3, 44, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 36, 0, 9.0f, -48.0f, 26.0f, 3, 44, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 134, 79, 9.0f, -48.0f, -20.0f, 3, 44, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 146, 79, -5.0f, -48.0f, -20.0f, 3, 44, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -5.0f, -51.0f, -20.0f, 17, 3, 49, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 52, -5.0f, -4.0f, -20.0f, 17, 3, 49, 0.0f, false));
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


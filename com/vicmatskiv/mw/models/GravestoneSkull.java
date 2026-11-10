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

public class GravestoneSkull
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;

    public GravestoneSkull() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-6.0f, 24.0f, -3.5f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 21, -1.0f, -2.0f, 0.0f, 14, 2, 7, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 30, -0.5f, -3.0f, 1.0f, 13, 1, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 36, 0.25f, -12.0f, 1.0f, 1, 9, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 35, 10, 10.75f, -12.0f, 1.0f, 1, 9, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 12, 42, 11.3f, -17.0f, 1.0f, 1, 5, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 38, 39, -0.3f, -17.0f, 1.0f, 1, 5, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 45, 45, 0.25f, -18.5f, 1.0f, 1, 2, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 24, 44, 10.75f, -18.5f, 1.0f, 1, 2, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 25, 38, 4.0f, -20.5f, 1.0f, 4, 1, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 0.5f, -18.75f, 1.0f, 11, 16, 5, -0.2f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 31, 31, 2.0f, -19.75f, 1.001f, 8, 2, 5, -0.2f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(4.0f, -20.5f, 1.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.4712f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 37, 25, -4.0f, 0.0f, -0.001f, 4, 1, 5, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(8.0f, -20.5f, 1.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.4712f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 12, 36, 0.0f, 0.0f, -0.001f, 4, 1, 5, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(9.0f, -11.0f, 0.0f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.1571f, 0.0f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 32, 0, -6.0f, -6.0f, 0.0f, 6, 6, 4, 0.0f, false));
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


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

public class Floodlight
extends ModelBase {
    private final ModelRenderer bone5;
    private final ModelRenderer bone4;
    private final ModelRenderer bone3;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;

    public Floodlight() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(0.0f, 24.0f, 0.0f);
        this.setRotationAngle(this.bone5, 0.0f, -0.3927f, 0.0f);
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(0.0f, 0.0f, -4.0f);
        this.bone5.func_78792_a(this.bone4);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 40, -3.0f, -1.0f, 7.0f, 6, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 22, 0, -1.0f, -2.75f, -0.5f, 2, 2, 9, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 14, -1.0f, -3.25f, -0.5f, 2, 1, 9, -0.2f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 6, 46, -1.0f, -5.75f, -0.5f, 2, 3, 1, -0.2f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 46, -1.0f, -5.75f, 7.5f, 2, 3, 1, -0.2f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 36, 34, -3.0f, -1.0f, 0.0f, 6, 1, 1, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(1.0683f, -12.6342f, 4.5f);
        this.bone5.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, -0.7854f, 0.0f, -0.3927f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 20, 46, -4.4692f, 4.6723f, -6.4092f, 1, 2, 1, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(1.0683f, -12.6342f, 4.5f);
        this.bone5.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.7854f, 0.0f, -0.3927f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 24, 46, -4.4692f, -1.6917f, -0.9548f, 1, 2, 1, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-0.25f, -6.0f, 0.0f);
        this.bone5.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, -0.3927f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 24, -2.0f, -3.0f, -3.5f, 1, 3, 7, 0.2f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 22, 14, -3.0f, -3.0f, -3.5f, 1, 3, 7, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.0f, -4.0f, -4.5f, 2, 5, 9, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 12, 46, 0.443f, -3.9604f, -5.01f, 1, 4, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 33, 42, 0.4424f, -4.1f, -5.0f, 1, 1, 10, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 32, 40, -0.7125f, -5.4387f, -4.75f, 1, 5, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 24, 40, -0.7125f, -6.8529f, 0.3358f, 1, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 14, 40, -0.7125f, -6.8529f, -3.3358f, 1, 1, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 16, 24, -0.7125f, -6.8529f, -2.5858f, 1, 1, 5, 0.1f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 33, 42, 0.4424f, 0.0396f, -5.0f, 1, 1, 10, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 16, 46, 0.443f, -3.9604f, 4.01f, 1, 4, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 36, 40, -0.7125f, -5.4387f, 3.75f, 1, 5, 1, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone5.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


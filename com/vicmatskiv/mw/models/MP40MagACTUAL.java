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

public class MP40MagACTUAL
extends ModelBase {
    private final ModelRenderer gun102;
    private final ModelRenderer bone;
    private final ModelRenderer bone3;
    private final ModelRenderer bone2;

    public MP40MagACTUAL() {
        this.field_78090_t = 256;
        this.field_78089_u = 128;
        this.gun102 = new ModelRenderer((ModelBase)this);
        this.gun102.func_78793_a(1.2f, -9.0f, -19.5f);
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 0.0f, 0.0f, -0.01f, 2, 23, 1, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 0.0f, 0.0f, 1.49f, 2, 18, 1, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 0.0f, 0.0f, 2.99f, 2, 18, 1, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 1.6f, 0.0f, 2.99f, 1, 18, 1, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 1.6f, 18.0f, 0.99f, 1, 4, 3, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 0.0f, 18.0f, 0.99f, 1, 4, 3, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 1.6f, 0.0f, 1.49f, 1, 18, 1, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 1.5f, 0.0f, 0.99f, 1, 23, 2, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 0.1f, 0.0f, 0.99f, 1, 23, 2, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 0.6f, 0.0f, 0.0f, 2, 23, 1, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, -0.2f, 22.0f, 0.1f, 3, 1, 4, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 0.3f, -5.0f, 0.0f, 2, 5, 4, 0.0f, true));
        this.gun102.field_78804_l.add(new ModelBox(this.gun102, 0, 0, 0.8f, -5.25f, 3.15f, 1, 28, 1, 0.0f, true));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(1.25f, 0.0f, 0.5f);
        this.gun102.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, -0.7854f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.0f, -1.0f, 0.0f, 1, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 0.0607f, 0.0607f, 0.0f, 1, 1, 3, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(2.35f, -4.9f, 0.0f);
        this.gun102.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0698f, -2.0769f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, -0.05f, -1.0f, 0.0f, 1, 1, 4, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.2f, -4.8f, 0.0f);
        this.gun102.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, -0.0698f, 2.0769f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, -1.05f, -1.0f, 0.0f, 1, 1, 4, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.gun102.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


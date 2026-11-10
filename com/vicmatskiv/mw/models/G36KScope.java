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

public class G36KScope
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;

    public G36KScope() {
        this.field_78090_t = 16;
        this.field_78089_u = 16;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.0f, -7.0f, -1.0f, 3, 1, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.0f, -13.24f, -1.0f, 3, 1, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -3.12f, -11.12f, -1.0f, 1, 3, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 3.12f, -11.12f, -1.0f, 1, 3, 2, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-1.0f, -6.0f, 0.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, 0.7854f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, -3.0f, -1.0f, -1.0f, 3, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 1.1213f, -5.1213f, -1.0f, 1, 3, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, -5.1213f, -5.1213f, -1.0f, 1, 3, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, -3.0f, -7.2426f, -1.0f, 3, 1, 2, 0.0f, false));
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


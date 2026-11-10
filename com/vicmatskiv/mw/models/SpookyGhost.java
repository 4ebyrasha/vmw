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

public class SpookyGhost
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;

    public SpookyGhost() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(8.5f, 7.75f, 0.0f);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, 0.6981f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 40, 40, -6.2856f, -6.5321f, -2.0f, 5, 10, 4, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-8.5f, 7.75f, 0.0f);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.6981f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 40, 0, 0.0f, -5.0f, -2.0f, 5, 10, 4, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, -0.5f, -33.0f, -0.5f, 1, 7, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 40, 14, -11.0f, -21.0f, 0.0f, 6, 14, 0, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 48, 5.0f, -23.0f, 0.0f, 6, 14, 0, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, -5.0f, -26.0f, -5.0f, 10, 2, 10, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 20, 38, -5.0f, -24.0f, -5.0f, 10, 18, 0, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 20, 5.0f, -24.0f, -5.0f, 0, 18, 10, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 2, -5.0f, -24.0f, -5.0f, 0, 18, 10, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 20, 20, -5.0f, -24.0f, 5.0f, 10, 18, 0, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.func_78785_a(f5);
        this.bone2.func_78785_a(f5);
        this.bone3.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


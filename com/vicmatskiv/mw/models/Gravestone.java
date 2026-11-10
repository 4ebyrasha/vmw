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

public class Gravestone
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone2;
    private final ModelRenderer bone5;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;

    public Gravestone() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, -3.5f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -6.0f, -2.0f, 0.0f, 12, 2, 7, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 22, 22, -5.0f, -3.0f, 0.5f, 10, 1, 6, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 28, 9, -3.5f, -17.75f, 1.5f, 7, 1, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 9, -5.0f, -15.9f, 1.5f, 10, 14, 4, -0.2f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 27, -4.0f, -17.1f, 1.499f, 8, 2, 4, -0.2f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(-3.5f, -17.75f, 1.5f);
        this.bone.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.0f, 0.0f, -1.0647f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 31, 0, -2.0f, 0.0f, -0.001f, 2, 1, 4, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(3.5f, -17.75f, 1.5f);
        this.bone.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, 0.0f, 1.0647f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 28, 14, 0.0f, 0.0f, -0.001f, 2, 1, 4, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-5.75f, -15.0f, 1.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.0698f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 30, 30, 0.0f, 0.0f, 0.5f, 1, 13, 4, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(-5.75f, -15.0f, 1.0f);
        this.bone.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, -0.6981f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 33, 0.0f, 0.0f, 0.501f, 2, 1, 4, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(5.75f, -15.0f, 1.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.0698f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 20, 29, -1.0f, 0.0f, 0.5f, 1, 13, 4, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(5.75f, -15.0f, 1.0f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, 0.6981f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 8, 34, -2.0f, 0.0f, 0.501f, 2, 1, 4, 0.0f, false));
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


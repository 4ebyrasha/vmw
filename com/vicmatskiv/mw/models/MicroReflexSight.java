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

public class MicroReflexSight
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone12;
    private final ModelRenderer bone5;
    private final ModelRenderer bone11;
    private final ModelRenderer bone6;
    private final ModelRenderer bone14;
    private final ModelRenderer bone7;
    private final ModelRenderer bone13;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;

    public MicroReflexSight() {
        this.field_78090_t = 16;
        this.field_78089_u = 16;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-2.0f, 24.0f, 0.0f);
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-2.0f, -9.0f, -4.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, 0.7854f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 0.7071f, -2.0f, 0.0f, 1, 2, 15, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(8.0f, -9.0f, -4.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, -0.7854f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, -1.7071f, -2.0f, 0.0f, 1, 2, 15, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(-1.0f, -14.25f, -4.0f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, 0.5236f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, 0.0f, -2.0f, 0.0f, 1, 2, 3, 0.0f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(-1.0f, -14.25f, -1.0f);
        this.bone.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, 0.2618f, 0.0f, 0.5236f);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 0, 0, 0.0f, -2.0f, 0.0f, 1, 2, 1, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(7.0f, -14.25f, -4.0f);
        this.bone.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, -0.5236f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -1.0f, -2.0f, 0.0f, 1, 2, 3, 0.0f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(7.0f, -14.25f, -1.0f);
        this.bone.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, 0.2618f, 0.0f, -0.5236f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 0, -1.0f, -2.0f, 0.0f, 1, 2, 1, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(0.0f, -16.0f, -4.0f);
        this.bone.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.0f, 0.0f, 2.7576f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, -2.0f, -1.0f, 0.0f, 2, 1, 3, 0.0f, false));
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(-0.1f, -16.0f, -1.4f);
        this.bone.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.0f, -0.3491f, 2.7576f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 0, 0, -2.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(6.0f, -16.0f, -4.0f);
        this.bone.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, 0.0f, -2.7576f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, 0.0f, -1.0f, 0.0f, 2, 1, 3, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(6.1f, -16.0f, -1.4f);
        this.bone.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, 0.0f, 0.3491f, -2.7576f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 0, 0, 0.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(0.0f, 0.0f, 0.0f);
        this.bone.func_78792_a(this.bone8);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, -1.5f, -8.5f, -4.0f, 2, 2, 15, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, -0.5f, -10.25f, -4.0f, 7, 3, 15, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, -0.75f, -11.25f, -4.0f, 1, 1, 15, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, -0.25f, -11.15f, -4.0f, 6, 1, 3, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, 0.25f, -11.0f, -1.0f, 1, 1, 9, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, 4.75f, -11.0f, -1.0f, 1, 1, 9, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, 0.0f, -11.25f, 8.0f, 6, 2, 4, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, 5.75f, -11.25f, -4.0f, 1, 1, 15, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, -1.0f, -14.25f, -4.0f, 1, 4, 4, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, 1.85f, -16.75f, -4.0f, 2, 1, 3, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, 3.2f, -16.75f, -4.0f, 1, 1, 3, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, 6.0f, -14.25f, -4.0f, 1, 4, 4, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, 6.5f, -11.75f, -4.0f, 1, 2, 10, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, -1.5f, -11.75f, -4.0f, 1, 2, 10, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, 5.5f, -8.5f, -4.0f, 2, 2, 15, 0.0f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(-1.0f, -14.25f, 0.0f);
        this.bone.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, -0.384f, 0.0349f, 0.0f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 0, 0, 0.0f, 0.0f, 0.0f, 1, 3, 8, 0.0f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(7.0f, -14.25f, 0.0f);
        this.bone.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, -0.384f, -0.0349f, 0.0f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 0, 0, -1.0f, 0.0f, 0.0f, 1, 3, 8, 0.0f, false));
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(7.8f, -10.75f, -4.5f);
        this.bone.func_78792_a(this.bone15);
        this.setRotationAngle(this.bone15, 0.0f, 0.0f, 0.6981f);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 0, 0, -1.0f, -1.0f, 0.0f, 2, 2, 11, 0.0f, false));
        this.bone16 = new ModelRenderer((ModelBase)this);
        this.bone16.func_78793_a(0.0f, 0.0f, 0.0f);
        this.bone15.func_78792_a(this.bone16);
        this.setRotationAngle(this.bone16, 0.0f, 0.0f, -0.4363f);
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 0, 0, -1.0f, -1.0f, -2.0f, 2, 2, 2, 0.0f, false));
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


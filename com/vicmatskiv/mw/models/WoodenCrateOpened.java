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

public class WoodenCrateOpened
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone10;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;

    public WoodenCrateOpened() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(7.0f, 16.0f, -7.0f);
        this.setRotationAngle(this.bone, -1.5708f, 0.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 18, 75, -1.0f, -1.0f, -9.0f, 2, 2, 14, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 57, -15.0f, -1.0f, -9.0f, 2, 2, 14, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(7.0f, 16.0f, 7.0f);
        this.setRotationAngle(this.bone2, -1.5708f, 0.0f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 73, -1.0f, -1.0f, -9.0f, 2, 2, 14, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 18, 59, -15.0f, -1.0f, -9.0f, 2, 2, 14, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(-21.0f, 10.0f, 15.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 52, 52, 14.0f, -1.0f, -22.0f, 14, 12, 14, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 89, 27.0f, -3.0f, -21.0f, 2, 2, 12, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 82, 84, 13.0f, -3.0f, -21.0f, 2, 2, 12, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 48, 20, 13.0f, 11.0f, -23.0f, 16, 2, 16, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 36, 57, 15.0f, -3.0f, -23.0f, 12, 2, 2, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 94, 51, 13.0f, 13.0f, -9.0f, 16, 1, 2, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 90, 46, 13.0f, 13.0f, -16.0f, 16, 1, 2, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 66, 17, 13.0f, 13.0f, -23.0f, 16, 1, 2, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 36, 61, 15.0f, -3.0f, -9.0f, 12, 2, 2, 0.0f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(24.0f, -4.9167f, -16.0f);
        this.bone3.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, 0.0f, -1.2217f, 0.0f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 54, 38, -6.0f, 0.9167f, -6.0f, 12, 1, 12, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 38, 82, -8.0f, -0.0833f, -6.0f, 2, 2, 12, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 90, 42, -8.0f, -0.0833f, -8.0f, 16, 2, 2, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 90, 38, -8.0f, -0.0833f, 6.0f, 16, 2, 2, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 66, 82, 6.0f, -0.0833f, -6.0f, 2, 2, 12, 0.0f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(0.0f, 0.6667f, 0.0f);
        this.bone11.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, 0.0f, -0.7854f, 0.0f);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 76, 78, -9.0f, -0.5f, -1.0f, 18, 2, 2, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(0.0f, 0.5f, 0.0f);
        this.bone12.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, 0.0f, 1.5708f, 0.0f);
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(0.0f, 0.5f, 0.0f);
        this.bone12.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.0f, 1.5708f, 0.0f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 36, 78, -9.0f, -1.01f, -1.0f, 18, 2, 2, 0.0f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(20.5f, 7.5f, -4.0f);
        this.bone3.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, -1.0472f, 0.0f, 0.0f);
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(14.0f, 5.0f, -15.0f);
        this.bone3.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.7854f, 0.0f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, -0.5f, -1.0f, -9.0f, 15, 2, 18, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(14.25f, 5.0f, -15.0f);
        this.bone3.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, -0.7854f, 0.0f, 0.0f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 20, -0.74f, -1.0f, -9.0f, 15, 2, 18, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(21.0f, 5.0f, -22.0f);
        this.bone3.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.0f, 0.0f, -0.7854f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 40, -9.0f, -1.0f, -0.51f, 18, 2, 15, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(21.0f, 5.0f, -21.75f);
        this.bone3.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, 0.0f, 0.7854f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 48, 0, -9.0f, -1.0f, -0.75f, 18, 2, 15, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(21.0f, -2.0f, 1.0f);
        this.bone3.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.0f, -0.7854f, 0.0f);
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(21.0f, 12.0f, -15.0f);
        this.bone3.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, 0.0f, 0.7854f, 0.0f);
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


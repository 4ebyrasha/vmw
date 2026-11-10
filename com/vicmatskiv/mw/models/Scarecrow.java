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

public class Scarecrow
extends ModelBase {
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;

    public Scarecrow() {
        this.field_78090_t = 150;
        this.field_78089_u = 150;
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-1.0f, -5.0f, -2.0f);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.0175f);
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.0f, -3.75f, 2.0f);
        this.bone2.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, -0.0175f, -0.1047f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 86, -1.0105f, -7.9983f, -0.0994f, 3, 41, 3, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(4.0f, -7.0f, -4.0f);
        this.bone2.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.1571f, 0.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 37, -12.0f, -16.0f, 0.0f, 16, 16, 16, -2.5f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(-18.0f, -9.5f, -1.0f);
        this.bone2.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, -0.1047f, -0.1047f, 0.0349f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, -6.0f, -1.0f, 0.0f, 49, 3, 3, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(3.9f, -20.1f, -5.65f);
        this.bone2.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.1525f, -0.07f, -0.0868f);
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(0.0f, 0.0f, 0.0f);
        this.bone5.func_78792_a(this.bone6);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 60, 71, -7.0f, -1.0f, 0.0f, 7, 1, 16, 0.1f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 78, 59, -11.5f, -1.0f, 4.5f, 16, 1, 7, 0.1f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(-0.25f, 0.0f, 0.0f);
        this.bone6.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, 0.7854f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 78, 51, -16.0f, -1.01f, 0.0f, 16, 1, 7, 0.1f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 30, 70, -11.4194f, -1.02f, -4.6315f, 7, 1, 16, 0.1f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(0.0f, -8.7f, 6.0f);
        this.bone5.func_78792_a(this.bone8);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 80, 22, -7.0f, -1.0f, -1.0f, 7, 1, 7, 0.1f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(0.0f, -1.0f, -1.0f);
        this.bone8.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, -0.2618f, 0.0f, 0.0f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 52, 88, -7.0f, 0.0f, 0.0f, 7, 9, 3, 0.1f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(0.0f, -1.0f, 6.0f);
        this.bone8.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, 0.2618f, 0.0f, 0.0f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 32, 87, -7.0f, 0.0f, -3.0f, 7, 9, 3, 0.1f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(0.0f, -1.0f, -1.0f);
        this.bone8.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, 0.0f, 0.0f, -0.2618f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 12, 86, -3.0f, 0.0f, 0.0f, 3, 9, 7, 0.1f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(-7.0f, -1.0f, -1.0f);
        this.bone8.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, 0.0f, 0.0f, 0.2618f);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 80, 6, 0.0f, 0.0f, 0.0f, 3, 9, 7, 0.1f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(0.0f, -7.5f, -5.0f);
        this.bone2.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, 0.3142f, -0.1396f, 0.0f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 0, 69, -1.0086f, -0.5242f, -0.1533f, 7, 1, 16, 0.0f, false));
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(-6.6843f, -8.6999f, -3.8f);
        this.bone2.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.3142f, 0.3316f, 0.1047f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 48, 53, -1.0083f, -0.5254f, -0.1572f, 7, 1, 16, 0.0f, false));
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(-11.75f, -10.15f, 1.95f);
        this.bone2.func_78792_a(this.bone15);
        this.setRotationAngle(this.bone15, 0.2269f, 0.9076f, 0.1745f);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 48, 37, -3.0f, -1.0f, 0.0f, 9, 1, 13, 0.0f, false));
        this.bone16 = new ModelRenderer((ModelBase)this);
        this.bone16.func_78793_a(9.25f, -8.05f, -2.8f);
        this.bone2.func_78792_a(this.bone16);
        this.setRotationAngle(this.bone16, 0.6283f, -1.0996f, -0.5411f);
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 79, 37, -1.0f, -1.0f, 0.0f, 11, 1, 10, 0.0f, false));
        this.bone17 = new ModelRenderer((ModelBase)this);
        this.bone17.func_78793_a(20.0f, -9.6f, 2.5f);
        this.bone2.func_78792_a(this.bone17);
        this.setRotationAngle(this.bone17, 0.0f, -0.1047f, 0.0297f);
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 0, 31, -40.0f, 0.0f, 0.0f, 40, 1, 5, 0.0f, false));
        this.bone18 = new ModelRenderer((ModelBase)this);
        this.bone18.func_78793_a(0.0f, 1.0f, 0.0f);
        this.bone17.func_78792_a(this.bone18);
        this.setRotationAngle(this.bone18, 0.0349f, 0.0f, -0.0175f);
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 0, 6, -40.0f, -1.0f, 0.0f, 40, 25, 0, 0.0f, false));
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 51, 102, -40.0f, 24.0f, 0.0f, 40, 7, 0, 0.0f, false));
        this.bone19 = new ModelRenderer((ModelBase)this);
        this.bone19.func_78793_a(-39.9865f, 1.9923f, 5.0072f);
        this.bone17.func_78792_a(this.bone19);
        this.setRotationAngle(this.bone19, 0.0349f, 3.1416f, -0.0175f);
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 0, 6, -40.0f, -1.0f, 0.0f, 40, 25, 0, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone2.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


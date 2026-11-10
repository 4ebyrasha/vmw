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

public class USPMatchCompensator
extends ModelBase {
    private final ModelRenderer matchcompensator;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;

    public USPMatchCompensator() {
        this.field_78090_t = 100;
        this.field_78089_u = 100;
        this.matchcompensator = new ModelRenderer((ModelBase)this);
        this.matchcompensator.func_78793_a(0.0f, -5.0f, -26.0f);
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 21, 1, -0.1f, -4.2f, -9.25f, 1, 1, 19, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 21, 0, -0.35f, -8.1f, -10.1f, 1, 4, 7, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 0, 0, -3.65f, -8.1f, -10.1f, 1, 4, 7, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 16, 56, -0.1f, -1.2f, -3.2f, 1, 1, 14, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 0, 40, -3.0f, -0.45f, -3.2f, 3, 1, 14, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 42, 0, -0.101f, -1.95f, -3.2f, 1, 1, 14, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 36, 42, -3.901f, -1.95f, -3.2f, 1, 1, 14, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 21, 21, -0.102f, -3.7f, -3.2f, 1, 2, 2, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 10, 20, -3.902f, -3.7f, -3.2f, 1, 2, 2, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 0, 11, -0.102f, -3.7f, 7.8f, 1, 2, 2, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 58, 0, -0.202f, -3.7f, -1.2f, 1, 2, 9, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 32, 57, -3.802f, -3.7f, -1.2f, 1, 2, 9, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 0, 0, -3.902f, -3.7f, 7.8f, 1, 2, 2, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 0, 0, -3.9f, -4.2f, -9.25f, 1, 1, 19, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 20, 41, -3.9f, -1.2f, -3.2f, 1, 1, 14, 0.0f, false));
        this.matchcompensator.field_78804_l.add(new ModelBox(this.matchcompensator, 0, 11, -2.5f, -8.0f, -9.5f, 2, 2, 6, 0.0f, false));
        this.cube_r1 = new ModelRenderer((ModelBase)this);
        this.cube_r1.func_78793_a(-2.9f, -4.2f, 9.75f);
        this.matchcompensator.func_78792_a(this.cube_r1);
        this.setRotationAngle(this.cube_r1, -1.1345f, 0.0f, 0.0f);
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 0, 29, -1.0f, 0.0f, 0.0f, 2, 1, 4, 0.0f, false));
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 21, 11, 0.8f, 0.0f, 0.0f, 3, 1, 4, 0.0f, false));
        this.cube_r2 = new ModelRenderer((ModelBase)this);
        this.cube_r2.func_78793_a(-2.9f, -0.2f, -3.2f);
        this.matchcompensator.func_78792_a(this.cube_r2);
        this.setRotationAngle(this.cube_r2, 0.2269f, 0.0f, 0.0f);
        this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 9, 0, -0.999f, -4.0f, 0.0f, 4, 4, 1, 0.0f, false));
        this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 31, 31, 2.801f, -4.0f, 0.0f, 1, 4, 1, 0.0f, false));
        this.cube_r3 = new ModelRenderer((ModelBase)this);
        this.cube_r3.func_78793_a(-1.9f, -0.2f, -5.2f);
        this.matchcompensator.func_78792_a(this.cube_r3);
        this.setRotationAngle(this.cube_r3, 0.2269f, 0.0f, 0.0f);
        this.cube_r3.field_78804_l.add(new ModelBox(this.cube_r3, 9, 5, -1.1f, -0.23f, 0.0f, 3, 1, 1, 0.0f, false));
        this.cube_r4 = new ModelRenderer((ModelBase)this);
        this.cube_r4.func_78793_a(-1.9f, -0.2f, -7.2f);
        this.matchcompensator.func_78792_a(this.cube_r4);
        this.setRotationAngle(this.cube_r4, 0.2269f, 0.0f, 0.0f);
        this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 10, 14, -1.1f, -0.23f, 0.0f, 3, 1, 1, 0.0f, false));
        this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 30, 0, -1.999f, -4.0f, 0.0f, 4, 4, 1, 0.0f, false));
        this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 15, 23, 1.801f, -4.0f, 0.0f, 1, 4, 1, 0.0f, false));
        this.cube_r5 = new ModelRenderer((ModelBase)this);
        this.cube_r5.func_78793_a(-1.9f, -0.2f, -9.2f);
        this.matchcompensator.func_78792_a(this.cube_r5);
        this.setRotationAngle(this.cube_r5, 0.2269f, 0.0f, 0.0f);
        this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 0, 20, -1.1f, -0.23f, 0.0f, 3, 1, 1, 0.0f, false));
        this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 21, 30, -1.999f, -4.0f, 0.0f, 4, 4, 1, 0.0f, false));
        this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 4, 22, 1.801f, -4.0f, 0.0f, 1, 4, 1, 0.0f, false));
        this.cube_r6 = new ModelRenderer((ModelBase)this);
        this.cube_r6.func_78793_a(-1.85f, -4.15f, -10.2f);
        this.matchcompensator.func_78792_a(this.cube_r6);
        this.setRotationAngle(this.cube_r6, 0.2269f, 0.0f, 0.0f);
        this.cube_r6.field_78804_l.add(new ModelBox(this.cube_r6, 10, 11, -1.049f, -1.65f, 0.0f, 3, 2, 1, 0.0f, false));
        this.cube_r6.field_78804_l.add(new ModelBox(this.cube_r6, 21, 0, -1.799f, -4.0f, 0.0f, 1, 4, 1, 0.0f, false));
        this.cube_r6.field_78804_l.add(new ModelBox(this.cube_r6, 0, 22, 1.501f, -4.0f, 0.0f, 1, 4, 1, 0.0f, false));
        this.cube_r7 = new ModelRenderer((ModelBase)this);
        this.cube_r7.func_78793_a(-2.9f, -0.2f, -5.2f);
        this.matchcompensator.func_78792_a(this.cube_r7);
        this.setRotationAngle(this.cube_r7, 0.2269f, 0.0f, 0.0f);
        this.cube_r7.field_78804_l.add(new ModelBox(this.cube_r7, 0, 34, -0.999f, -4.0f, 0.0f, 4, 4, 1, 0.0f, false));
        this.cube_r7.field_78804_l.add(new ModelBox(this.cube_r7, 12, 29, 2.801f, -4.0f, 0.0f, 1, 4, 1, 0.0f, false));
        this.cube_r8 = new ModelRenderer((ModelBase)this);
        this.cube_r8.func_78793_a(-3.0f, 0.55f, -9.0f);
        this.matchcompensator.func_78792_a(this.cube_r8);
        this.setRotationAngle(this.cube_r8, 0.1745f, -0.1396f, 0.6981f);
        this.cube_r8.field_78804_l.add(new ModelBox(this.cube_r8, 0, 4, -1.17f, -1.001f, -0.03f, 1, 1, 1, 0.0f, false));
        this.cube_r8.field_78804_l.add(new ModelBox(this.cube_r8, 21, 13, -1.0f, -1.0f, -0.03f, 1, 1, 1, 0.0f, false));
        this.cube_r9 = new ModelRenderer((ModelBase)this);
        this.cube_r9.func_78793_a(-3.0f, 0.55f, -7.0f);
        this.matchcompensator.func_78792_a(this.cube_r9);
        this.setRotationAngle(this.cube_r9, 0.1745f, -0.1396f, 0.6981f);
        this.cube_r9.field_78804_l.add(new ModelBox(this.cube_r9, 3, 5, -1.17f, -1.001f, -0.03f, 1, 1, 1, 0.0f, false));
        this.cube_r9.field_78804_l.add(new ModelBox(this.cube_r9, 21, 16, -1.0f, -1.0f, -0.03f, 1, 1, 1, 0.0f, false));
        this.cube_r10 = new ModelRenderer((ModelBase)this);
        this.cube_r10.func_78793_a(-3.0f, 0.55f, -5.0f);
        this.matchcompensator.func_78792_a(this.cube_r10);
        this.setRotationAngle(this.cube_r10, 0.1745f, -0.1396f, 0.6981f);
        this.cube_r10.field_78804_l.add(new ModelBox(this.cube_r10, 0, 15, -1.17f, -1.001f, -0.03f, 1, 1, 1, 0.0f, false));
        this.cube_r10.field_78804_l.add(new ModelBox(this.cube_r10, 10, 24, -1.0f, -1.0f, -0.03f, 1, 1, 1, 0.0f, false));
        this.cube_r11 = new ModelRenderer((ModelBase)this);
        this.cube_r11.func_78793_a(-3.0f, 0.55f, -3.2f);
        this.matchcompensator.func_78792_a(this.cube_r11);
        this.setRotationAngle(this.cube_r11, 0.0f, 0.0f, 0.6981f);
        this.cube_r11.field_78804_l.add(new ModelBox(this.cube_r11, 42, 21, -1.17f, -1.001f, 0.0f, 1, 1, 14, 0.0f, false));
        this.cube_r11.field_78804_l.add(new ModelBox(this.cube_r11, 52, 36, -1.0f, -1.0f, 0.0f, 1, 1, 14, 0.0f, false));
        this.cube_r12 = new ModelRenderer((ModelBase)this);
        this.cube_r12.func_78793_a(0.0f, 0.55f, -9.0f);
        this.matchcompensator.func_78792_a(this.cube_r12);
        this.setRotationAngle(this.cube_r12, 0.1745f, 0.1396f, -0.6981f);
        this.cube_r12.field_78804_l.add(new ModelBox(this.cube_r12, 14, 20, 0.17f, -1.001f, -0.04f, 1, 1, 1, 0.0f, false));
        this.cube_r12.field_78804_l.add(new ModelBox(this.cube_r12, 24, 4, 0.0f, -1.0f, -0.04f, 1, 1, 1, 0.0f, false));
        this.cube_r13 = new ModelRenderer((ModelBase)this);
        this.cube_r13.func_78793_a(0.0f, 0.55f, -7.0f);
        this.matchcompensator.func_78792_a(this.cube_r13);
        this.setRotationAngle(this.cube_r13, 0.1745f, 0.1396f, -0.6981f);
        this.cube_r13.field_78804_l.add(new ModelBox(this.cube_r13, 21, 5, 0.17f, -1.001f, -0.04f, 1, 1, 1, 0.0f, false));
        this.cube_r13.field_78804_l.add(new ModelBox(this.cube_r13, 24, 17, 0.0f, -1.0f, -0.04f, 1, 1, 1, 0.0f, false));
        this.cube_r14 = new ModelRenderer((ModelBase)this);
        this.cube_r14.func_78793_a(0.0f, 0.55f, -5.0f);
        this.matchcompensator.func_78792_a(this.cube_r14);
        this.setRotationAngle(this.cube_r14, 0.1745f, 0.1396f, -0.6981f);
        this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 21, 11, 0.17f, -1.001f, -0.04f, 1, 1, 1, 0.0f, false));
        this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 21, 25, 0.0f, -1.0f, -0.04f, 1, 1, 1, 0.0f, false));
        this.cube_r15 = new ModelRenderer((ModelBase)this);
        this.cube_r15.func_78793_a(0.0f, 0.55f, -3.2f);
        this.matchcompensator.func_78792_a(this.cube_r15);
        this.setRotationAngle(this.cube_r15, 0.0f, 0.0f, -0.6981f);
        this.cube_r15.field_78804_l.add(new ModelBox(this.cube_r15, 52, 52, 0.17f, -1.001f, 0.0f, 1, 1, 14, 0.0f, false));
        this.cube_r15.field_78804_l.add(new ModelBox(this.cube_r15, 0, 55, 0.0f, -1.0f, 0.0f, 1, 1, 14, 0.0f, false));
        this.cube_r16 = new ModelRenderer((ModelBase)this);
        this.cube_r16.func_78793_a(-3.65f, -8.1f, -10.1f);
        this.matchcompensator.func_78792_a(this.cube_r16);
        this.setRotationAngle(this.cube_r16, 0.0f, 0.0f, 0.5934f);
        this.cube_r16.field_78804_l.add(new ModelBox(this.cube_r16, 0, 20, 0.0f, -1.0f, -1.0f, 1, 1, 8, 0.0f, false));
        this.cube_r17 = new ModelRenderer((ModelBase)this);
        this.cube_r17.func_78793_a(0.65f, -8.1f, -10.1f);
        this.matchcompensator.func_78792_a(this.cube_r17);
        this.setRotationAngle(this.cube_r17, 0.0f, 0.0f, -0.5934f);
        this.cube_r17.field_78804_l.add(new ModelBox(this.cube_r17, 21, 21, -1.0f, -1.0f, -1.0f, 1, 1, 8, 0.0f, false));
        this.cube_r18 = new ModelRenderer((ModelBase)this);
        this.cube_r18.func_78793_a(0.9f, -4.2f, 8.75f);
        this.matchcompensator.func_78792_a(this.cube_r18);
        this.setRotationAngle(this.cube_r18, 0.0f, 0.0f, 0.9599f);
        this.cube_r18.field_78804_l.add(new ModelBox(this.cube_r18, 25, 25, -1.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, false));
        this.cube_r19 = new ModelRenderer((ModelBase)this);
        this.cube_r19.func_78793_a(-3.9f, -4.2f, 8.75f);
        this.matchcompensator.func_78792_a(this.cube_r19);
        this.setRotationAngle(this.cube_r19, 0.0f, 0.0f, -0.9599f);
        this.cube_r19.field_78804_l.add(new ModelBox(this.cube_r19, 25, 21, 0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, false));
        this.cube_r19.field_78804_l.add(new ModelBox(this.cube_r19, 0, 20, 0.0f, 0.0f, -18.85f, 1, 1, 19, 0.0f, false));
        this.cube_r20 = new ModelRenderer((ModelBase)this);
        this.cube_r20.func_78793_a(0.9f, -4.2f, -10.1f);
        this.matchcompensator.func_78792_a(this.cube_r20);
        this.setRotationAngle(this.cube_r20, 0.0f, 0.0f, 0.9599f);
        this.cube_r20.field_78804_l.add(new ModelBox(this.cube_r20, 21, 21, -1.0f, 0.0f, 0.0f, 1, 1, 19, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.matchcompensator.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


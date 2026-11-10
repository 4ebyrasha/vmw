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

public class ACRPolymerHandguard
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone25;
    private final ModelRenderer bone26;
    private final ModelRenderer bone24;
    private final ModelRenderer bone18;
    private final ModelRenderer bone23;
    private final ModelRenderer bone19;
    private final ModelRenderer bone22;
    private final ModelRenderer bone2;
    private final ModelRenderer bone20;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone3;
    private final ModelRenderer bone10;
    private final ModelRenderer bone13;
    private final ModelRenderer bone21;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone5;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;

    public ACRPolymerHandguard() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.25f, 24.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 32, -3.35f, -35.3f, -54.0f, 2, 1, 31, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 0, -3.85f, -35.9f, -54.2f, 4, 2, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 15, 22, -3.25f, -41.9f, -51.45f, 3, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 16, 12, -3.25f, -42.4f, -49.15f, 3, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.15f, -35.3f, -54.0f, 2, 1, 31, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 23, 5, -1.55f, -34.6f, -27.0f, 1, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 21, 12, -2.95f, -34.6f, -27.0f, 2, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 32, -1.45f, -34.8f, -26.0f, 1, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 27, 18, -3.05f, -34.8f, -26.0f, 1, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 96, 96, -4.25f, -39.8f, -53.0f, 1, 3, 28, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 95, 62, -0.25f, -39.8f, -53.0f, 1, 3, 28, 0.0f, false));
        this.bone25 = new ModelRenderer((ModelBase)this);
        this.bone25.func_78793_a(-3.25f, -42.4f, -48.85f);
        this.bone.func_78792_a(this.bone25);
        this.setRotationAngle(this.bone25, -0.2094f, -0.4014f, 0.0f);
        this.bone25.field_78804_l.add(new ModelBox(this.bone25, 23, 18, -0.1172f, 0.0574f, -0.2701f, 1, 1, 2, 0.0f, false));
        this.bone26 = new ModelRenderer((ModelBase)this);
        this.bone26.func_78793_a(-0.25f, -42.4f, -48.85f);
        this.bone.func_78792_a(this.bone26);
        this.setRotationAngle(this.bone26, -0.2094f, 0.4014f, 0.0f);
        this.bone26.field_78804_l.add(new ModelBox(this.bone26, 8, 3, -0.8828f, 0.0574f, -0.2701f, 1, 1, 2, 0.0f, false));
        this.bone24 = new ModelRenderer((ModelBase)this);
        this.bone24.func_78793_a(-2.3f, -41.9f, -51.45f);
        this.bone.func_78792_a(this.bone24);
        this.setRotationAngle(this.bone24, 0.4887f, 0.0f, 0.0f);
        this.bone24.field_78804_l.add(new ModelBox(this.bone24, 23, 16, -0.95f, 0.0f, -1.0f, 3, 1, 1, 0.0f, false));
        this.bone18 = new ModelRenderer((ModelBase)this);
        this.bone18.func_78793_a(-0.25f, -41.9f, -52.45f);
        this.bone.func_78792_a(this.bone18);
        this.setRotationAngle(this.bone18, 0.0f, 0.0f, -0.7505f);
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 6, 24, -1.0f, 0.0f, 1.0f, 1, 1, 4, 0.0f, false));
        this.bone23 = new ModelRenderer((ModelBase)this);
        this.bone23.func_78793_a(0.0f, 0.0f, 1.0f);
        this.bone18.func_78792_a(this.bone23);
        this.setRotationAngle(this.bone23, 0.5061f, 0.0f, -0.0349f);
        this.bone23.field_78804_l.add(new ModelBox(this.bone23, 0, 12, -2.0f, 0.0f, -1.0f, 2, 1, 1, 0.0f, false));
        this.bone19 = new ModelRenderer((ModelBase)this);
        this.bone19.func_78793_a(-3.25f, -41.9f, -52.45f);
        this.bone.func_78792_a(this.bone19);
        this.setRotationAngle(this.bone19, 0.0f, 0.0f, 0.7505f);
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 0, 22, 0.0f, 0.0f, 1.0f, 1, 1, 4, 0.0f, false));
        this.bone22 = new ModelRenderer((ModelBase)this);
        this.bone22.func_78793_a(0.0f, 0.0f, 1.0f);
        this.bone19.func_78792_a(this.bone22);
        this.setRotationAngle(this.bone22, 0.6109f, 0.0f, 0.0524f);
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 5, 29, 0.0f, 0.0f, -1.0f, 2, 1, 1, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(1.3f, -37.4f, -49.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.2269f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 95, -1.0f, 0.0f, -5.0f, 1, 1, 29, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 100, 0, -0.999f, -2.45f, -4.0f, 1, 2, 28, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 9, 10, -0.998f, -3.9f, -3.5f, 1, 2, 5, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 16, 16, -0.999f, -0.6f, 19.0f, 1, 1, 5, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 8, -0.999f, -0.6f, 11.5f, 1, 1, 6, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 12, 32, -0.999f, -0.6f, 6.0f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 6, 32, -0.999f, -0.6f, 1.5f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 32, -0.999f, -0.6f, -5.0f, 1, 1, 4, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 22, -1.0f, -1.0f, 23.7f, 1, 2, 1, 0.0f, false));
        this.bone20 = new ModelRenderer((ModelBase)this);
        this.bone20.func_78793_a(-0.0522f, -3.8857f, 1.5f);
        this.bone2.func_78792_a(this.bone20);
        this.setRotationAngle(this.bone20, -0.384f, 0.0f, 0.0f);
        this.bone20.field_78804_l.add(new ModelBox(this.bone20, 8, 18, -0.9478f, 0.0f, 0.0f, 1, 2, 4, 0.0f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(0.2923f, 1.0675f, 26.0f);
        this.bone2.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, 0.4887f, 0.0f, -0.0873f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 18, 26, -2.0f, -3.0f, -1.0f, 2, 3, 1, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 27, 9, -1.0f, -3.9f, -1.0f, 1, 1, 1, 0.0f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(-0.0221f, -3.9051f, -3.5f);
        this.bone2.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, -2.0159f, 0.0f, -0.1745f);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 16, 0, -2.0f, -1.0f, 0.0f, 2, 1, 4, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(-4.8f, -37.4f, -49.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.2269f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 64, 68, 0.0f, 0.0f, -5.0f, 1, 1, 29, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 12, 26, 0.0f, -0.6f, -5.0f, 1, 1, 4, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 32, 99, -0.001f, -2.45f, -4.0f, 1, 2, 28, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 9, 3, -0.002f, -3.9f, -3.5f, 1, 2, 5, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 15, 0.0f, -1.0f, 19.0f, 1, 2, 5, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 15, 0.0f, -1.0f, 23.8f, 1, 2, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, 0.0f, -1.0f, 11.5f, 1, 2, 6, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 8, 10, 0.0f, -1.0f, 6.0f, 1, 2, 2, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 8, 0.0f, -1.0f, 1.5f, 1, 2, 2, 0.0f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(-0.2923f, 1.0675f, 26.0f);
        this.bone3.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, 0.4887f, 0.0f, 0.0873f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 24, 26, 0.0f, -3.0f, -1.0f, 2, 3, 1, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 12, 25, 0.0f, -3.9f, -1.0f, 1, 1, 1, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(0.0221f, -3.9051f, -3.5f);
        this.bone3.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, -0.4538f, 0.0f, 0.1745f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 0, 0, 0.0f, 0.0f, 0.0f, 2, 4, 1, 0.0f, false));
        this.bone21 = new ModelRenderer((ModelBase)this);
        this.bone21.func_78793_a(-0.0907f, -4.4031f, 1.5f);
        this.bone3.func_78792_a(this.bone21);
        this.setRotationAngle(this.bone21, -0.384f, 0.0f, 0.0f);
        this.bone21.field_78804_l.add(new ModelBox(this.bone21, 17, 6, 0.1007f, 0.4726f, 0.1909f, 1, 2, 4, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(1.8f, -36.4f, -49.0f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, -0.7854f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 68, 31, -1.0f, -1.0f, -5.0f, 1, 1, 30, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(0.0f, 0.0f, -1.0f);
        this.bone4.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.0f, 0.0f, -0.4363f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 32, 68, -1.0f, -1.0f, -4.0f, 1, 1, 30, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 6, 24, -1.1195f, -0.7437f, 25.0f, 1, 1, 1, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(-5.3f, -36.4f, -49.0f);
        this.bone.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, -0.7854f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 68, 0, 0.0f, 0.0f, -5.0f, 1, 1, 30, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(0.0f, 0.0f, 0.0f);
        this.bone5.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, 0.0f, 0.4363f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 64, 0.0f, 0.0f, -5.0f, 1, 1, 30, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 18, -0.2563f, 0.1195f, 24.0f, 1, 1, 1, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(1.47f, -35.47f, -49.0f);
        this.bone.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.0f, 0.0f, 0.9774f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 36, 2, -1.0f, 0.0f, -5.0f, 1, 2, 30, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 7, 17, -0.7224f, -0.054f, 24.0f, 1, 2, 1, 0.0f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(-4.95f, -35.47f, -49.0f);
        this.bone.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, 0.0f, 0.0f, -0.9774f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 36, 36, 0.0f, 0.0f, -5.0f, 1, 2, 30, 0.0f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 16, 5, -0.2776f, -0.054f, 24.0f, 1, 2, 1, 0.0f, false));
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(1.9f, -37.9f, -54.2f);
        this.bone.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.0f, 0.0f, -0.2269f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 0, 27, -2.0974f, -0.0225f, 0.0f, 2, 2, 1, 0.0f, false));
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(-5.3f, -37.9f, -54.2f);
        this.bone.func_78792_a(this.bone15);
        this.setRotationAngle(this.bone15, 0.0f, 0.0f, 0.2269f);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 24, 22, 0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f, false));
        this.bone16 = new ModelRenderer((ModelBase)this);
        this.bone16.func_78793_a(-5.8f, -36.0f, -54.2f);
        this.bone.func_78792_a(this.bone16);
        this.setRotationAngle(this.bone16, 0.0f, 0.0f, -0.8203f);
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 24, 0, 0.0f, 0.0f, -0.01f, 2, 3, 1, 0.0f, false));
        this.bone17 = new ModelRenderer((ModelBase)this);
        this.bone17.func_78793_a(2.3f, -36.0f, -54.2f);
        this.bone.func_78792_a(this.bone17);
        this.setRotationAngle(this.bone17, 0.0f, 0.0f, 0.8203f);
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 14, 17, -2.0f, 0.0f, -0.01f, 2, 3, 1, 0.0f, false));
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


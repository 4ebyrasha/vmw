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

public class ARCarryHandle
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone3;
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
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;

    public ARCarryHandle() {
        this.field_78090_t = 512;
        this.field_78089_u = 512;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, -4.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 62, 0, -1.0f, -1.0f, -1.0f, 1, 5, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 10, 54, 2.0f, -1.0f, -1.0f, 1, 5, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 21, 23, 0.0f, 1.0f, -1.0f, 2, 3, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 36, 0.0f, -2.0f, -1.0f, 2, 1, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 71, -3.5f, 4.0f, -6.0f, 9, 3, 11, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 144, -2.51f, 4.05f, -67.0f, 7, 1, 61, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 144, 73, -2.52f, 1.15f, -42.0f, 1, 3, 36, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 75, 144, 3.48f, 1.15f, -42.0f, 1, 3, 36, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 136, 144, -1.5f, 5.05f, -67.0f, 5, 1, 61, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 21, 52, -1.5f, 6.05f, -63.5f, 5, 8, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 73, 73, -2.5f, 7.0f, -6.0f, 7, 2, 12, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 21, 28, 0.0f, 6.99f, 5.5f, 2, 2, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.5f, 13.0f, -12.0f, 7, 3, 20, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -4.0f, 13.2f, -69.5f, 10, 3, 68, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 73, 87, -2.49f, 5.0f, -12.0f, 7, 8, 6, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 42, 79, -2.5f, 5.75f, -69.51f, 7, 8, 6, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 85, -3.0f, 9.1f, -5.5f, 8, 3, 10, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 21, 44, -4.5f, 9.09f, -3.0f, 11, 3, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 12, -2.49f, 9.0f, 5.0f, 7, 4, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 25, 52, -2.5f, 12.3f, -6.0f, 7, 1, 13, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 88, 14, -3.5f, 1.0f, -6.0f, 1, 3, 11, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 88, 0, 4.5f, 1.0f, -6.0f, 1, 3, 11, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 73, 73, 3.75f, -1.0f, -9.75f, 2, 8, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 44, -3.75f, -1.0f, -9.75f, 2, 8, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 87, 2, 6.0f, 14.0f, -70.0f, 1, 2, 69, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 44, -5.0f, 12.7f, -18.0f, 2, 4, 17, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 23, -5.0f, 12.7f, -70.0f, 2, 4, 17, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, 2.0f, 0.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, 0.7854f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 10, 26, -1.4f, -1.0f, -1.01f, 1, 1, 2, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(2.3f, -0.3f, 0.0f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, 0.7854f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 10, 23, -1.0f, -1.0f, -0.99f, 1, 1, 2, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 23, -1.4f, -1.0f, -1.01f, 1, 1, 2, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(2.0f, 2.0f, 0.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.7854f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 26, -1.0f, -1.4f, -1.01f, 1, 1, 2, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(-0.3f, -0.3f, 0.0f);
        this.bone.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, 0.7854f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 3, -1.0f, -1.0f, -0.99f, 1, 1, 2, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -1.0f, -1.4f, -1.01f, 1, 1, 2, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(-2.0f, 3.6f, -0.7f);
        this.bone.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, -0.4538f, 0.0f, 0.0f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 17, -1.0f, -1.0f, 0.0f, 8, 1, 1, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(5.5f, 1.0f, 5.0f);
        this.bone.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 2.5831f, 0.0f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 51, 97, -1.01f, -4.0f, 0.0f, 1, 4, 6, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 38, 34, -8.99f, -4.0f, 0.0f, 1, 4, 6, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(5.5f, -2.2f, -0.1f);
        this.bone.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, -1.501f, 0.0f, 0.0f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 88, 0, -0.99f, 0.0f, 0.0f, 1, 6, 4, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 37, 71, -1.74f, 5.7674f, 0.0478f, 2, 7, 3, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 8, 71, -9.24f, 5.7674f, 0.0478f, 2, 7, 3, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 8, 85, -9.01f, 0.0f, 0.0f, 1, 6, 4, 0.0f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(0.0f, 7.0f, 7.0f);
        this.bone.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, -1.1345f, 0.0f, 0.0f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 88, 50, 0.0f, -0.5438f, 0.2536f, 2, 2, 9, 0.0f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 21, 23, -2.51f, 1.1782f, -0.2f, 7, 2, 9, 0.0f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(0.0f, -0.4532f, 0.2113f);
        this.bone9.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, 0.0f, 0.0f, -0.5934f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 88, 39, -2.9493f, -0.0751f, 0.0423f, 3, 2, 9, 0.0f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(2.0f, -0.4532f, 0.2113f);
        this.bone9.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, 0.0f, 0.0f, 0.5934f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 88, 28, -0.0507f, -0.0751f, 0.0423f, 3, 2, 9, 0.0f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(0.0f, 7.0f, 7.5f);
        this.bone.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, 0.0f, -0.5934f, 0.0f);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 0, 65, -3.0f, 0.01f, -2.0f, 3, 1, 2, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(2.0f, 7.0f, 7.5f);
        this.bone.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, 0.0f, 0.5934f, 0.0f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 0, 56, 0.0f, 0.01f, -2.0f, 3, 1, 2, 0.0f, false));
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(6.5f, 14.0f, -70.0f);
        this.bone.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.0f, 0.0f, 0.7854f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 0, 71, -1.6464f, -0.3536f, 0.0f, 2, 1, 69, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 73, 73, 0.7678f, 1.0607f, 0.0f, 1, 2, 69, 0.0f, false));
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(6.5f, 10.5f, 2.0f);
        this.bone.func_78792_a(this.bone15);
        this.setRotationAngle(this.bone15, 0.0f, -0.5411f, 0.0f);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 44, 0, -2.0f, -1.39f, 0.0f, 2, 3, 3, 0.0f, false));
        this.bone16 = new ModelRenderer((ModelBase)this);
        this.bone16.func_78793_a(6.5f, 10.5f, -3.0f);
        this.bone.func_78792_a(this.bone16);
        this.setRotationAngle(this.bone16, 0.0f, 0.5411f, 0.0f);
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 31, 34, -2.0f, -1.39f, -3.0f, 2, 3, 3, 0.0f, false));
        this.bone17 = new ModelRenderer((ModelBase)this);
        this.bone17.func_78793_a(-4.5f, 10.5f, -3.0f);
        this.bone.func_78792_a(this.bone17);
        this.setRotationAngle(this.bone17, 0.0f, -0.5411f, 0.0f);
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 21, 34, 0.0f, -1.39f, -3.0f, 2, 3, 3, 0.0f, false));
        this.bone18 = new ModelRenderer((ModelBase)this);
        this.bone18.func_78793_a(-4.5f, 10.5f, -3.0f);
        this.bone.func_78792_a(this.bone18);
        this.setRotationAngle(this.bone18, 0.0f, 0.5411f, 0.0f);
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 10, 0, -2.5752f, -1.39f, 4.2858f, 2, 3, 3, 0.0f, false));
        this.bone19 = new ModelRenderer((ModelBase)this);
        this.bone19.func_78793_a(4.5f, 5.75f, -69.5f);
        this.bone.func_78792_a(this.bone19);
        this.setRotationAngle(this.bone19, -0.8203f, 0.0f, 0.0f);
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 47, 71, -7.01f, -4.0f, -0.01f, 1, 4, 4, 0.0f, false));
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 44, 23, -0.99f, -4.0f, -0.01f, 1, 4, 4, 0.0f, false));
        this.bone20 = new ModelRenderer((ModelBase)this);
        this.bone20.func_78793_a(4.5f, 3.05f, -66.7f);
        this.bone.func_78792_a(this.bone20);
        this.setRotationAngle(this.bone20, -1.4923f, 0.0f, 0.0f);
        this.bone20.field_78804_l.add(new ModelBox(this.bone20, 0, 71, -7.0f, -61.0f, -0.01f, 1, 61, 3, 0.0f, false));
        this.bone20.field_78804_l.add(new ModelBox(this.bone20, 54, 0, -1.0f, -61.0f, -0.01f, 1, 61, 3, 0.0f, false));
        this.bone21 = new ModelRenderer((ModelBase)this);
        this.bone21.func_78793_a(6.0f, 7.2f, -9.5f);
        this.bone.func_78792_a(this.bone21);
        this.setRotationAngle(this.bone21, 0.4887f, 0.0f, 0.0f);
        this.bone21.field_78804_l.add(new ModelBox(this.bone21, 20, 98, -2.26f, -6.294f, -0.1268f, 2, 6, 4, 0.0f, false));
        this.bone21.field_78804_l.add(new ModelBox(this.bone21, 8, 98, -9.76f, -6.294f, -0.1268f, 2, 6, 4, 0.0f, false));
        this.bone22 = new ModelRenderer((ModelBase)this);
        this.bone22.func_78793_a(8.0f, 16.0f, -15.0f);
        this.bone.func_78792_a(this.bone22);
        this.setRotationAngle(this.bone22, -0.4189f, 0.0f, 0.0f);
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 94, 96, -1.0f, -5.0f, 0.0f, 4, 5, 5, 0.0f, false));
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 39, 93, -1.0f, 16.557f, -48.4179f, 4, 5, 5, 0.0f, false));
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 34, 0, 3.0f, 16.0905f, -49.0014f, 2, 6, 6, 0.0f, false));
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 0, 23, 3.0f, -5.4666f, -0.5835f, 2, 6, 6, 0.0f, false));
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 0, 0, -13.5f, -20.9032f, 4.5847f, 2, 6, 6, 0.0f, false));
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 44, 12, -14.5f, -19.9032f, 5.5847f, 1, 4, 4, 0.0f, false));
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 34, 12, -3.0f, -19.9032f, 5.5847f, 1, 4, 4, 0.0f, false));
        this.bone23 = new ModelRenderer((ModelBase)this);
        this.bone23.func_78793_a(0.0f, 2.7f, 0.4f);
        this.bone.func_78792_a(this.bone23);
        this.setRotationAngle(this.bone23, 0.384f, 0.0f, 0.0f);
        this.bone23.field_78804_l.add(new ModelBox(this.bone23, 0, 35, -0.99f, -1.0f, 0.0f, 4, 2, 1, 0.0f, false));
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


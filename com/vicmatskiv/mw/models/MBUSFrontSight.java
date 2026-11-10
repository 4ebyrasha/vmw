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

public class MBUSFrontSight
extends ModelBase {
    private final ModelRenderer sight44;
    private final ModelRenderer bone10;
    private final ModelRenderer bone;
    private final ModelRenderer bone13;
    private final ModelRenderer bone11;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone9;
    private final ModelRenderer bone19;
    private final ModelRenderer bone5;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone14;
    private final ModelRenderer bone12;
    private final ModelRenderer bone6;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;

    public MBUSFrontSight() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.sight44 = new ModelRenderer((ModelBase)this);
        this.sight44.func_78793_a(-3.7f, 5.0f, -2.8f);
        this.setRotationAngle(this.sight44, -1.3271f, 0.0f, 0.0f);
        this.sight44.field_78804_l.add(new ModelBox(this.sight44, 0, 10, 1.7f, 0.7291f, -1.2118f, 7, 5, 2, 0.0f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(1.7f, 0.0f, 0.0f);
        this.sight44.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, 0.0f, 0.7854f, 0.0f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 40, 43, -0.1432f, 0.7291f, -0.8568f, 1, 5, 1, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 36, 43, 4.8066f, 0.7291f, 4.0929f, 1, 5, 1, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 15, 15, -2.0f, -18.8f, -8.7f, 7, 3, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 34, 2, -2.7f, -17.0f, -8.71f, 2, 2, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 30, 34, 3.7f, -17.0f, -8.71f, 2, 2, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 4, 2.5f, -25.95f, -3.01f, 2, 2, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 4, -1.5f, -25.95f, -3.01f, 2, 2, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 4, -0.2f, -25.75f, -2.99f, 1, 4, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 4, -0.2f, -25.55f, -1.99f, 3, 4, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 4, 2.2f, -25.75f, -2.99f, 1, 4, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 14, 20, -2.0f, -24.2f, -3.011f, 7, 6, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 22, 24, -2.5f, -26.2f, -3.0f, 1, 5, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 28, 20, -3.0f, -22.1f, -3.0f, 1, 4, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 40, 16, -2.49f, -24.1f, -0.5f, 2, 5, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 38, 7, 3.49f, -24.1f, -0.5f, 2, 5, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 32, 12, -3.0f, -18.1f, -3.0f, 2, 3, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 32, 4.0f, -18.1f, -3.0f, 2, 3, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 38, -2.0f, -19.1f, -1.0f, 1, 3, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 17, -0.5f, -20.1f, -1.0f, 1, 4, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 31, 32, -1.5f, -17.1f, 0.01f, 6, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 4, 44, 3.5f, -19.1f, -0.24f, 1, 2, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 44, -1.5f, -19.1f, -0.24f, 1, 2, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 17, 2.5f, -20.1f, -1.0f, 1, 4, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 38, 4.0f, -19.1f, -1.0f, 1, 3, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 16, 7, -0.5f, -23.2f, -2.01f, 4, 3, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 28, 3, 5.0f, -22.1f, -3.0f, 1, 4, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 12, 24, 4.5f, -26.2f, -3.0f, 1, 5, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 16, 38, 1.0f, -27.6f, -1.0f, 1, 5, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 18, 12, -2.0f, -20.0f, -3.8f, 7, 2, 1, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(5.7f, -17.2f, -3.0f);
        this.bone.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, -1.3788f, 0.0f, 0.0f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 38, 24, -1.0f, -1.0184f, -0.1908f, 1, 2, 2, 0.0f, false));
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 26, 33, -8.4f, -1.0184f, -0.1908f, 1, 2, 2, 0.0f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(5.7f, -17.0f, -7.7f);
        this.bone.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, 0.2443f, 0.0f, 0.0f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 17, -0.99f, -1.2419f, -0.9703f, 1, 2, 6, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 16, 0, -8.41f, -1.2419f, -0.9703f, 1, 2, 6, 0.0f, false));
        this.bone17 = new ModelRenderer((ModelBase)this);
        this.bone17.func_78793_a(-0.4f, -25.95f, 1.0f);
        this.bone.func_78792_a(this.bone17);
        this.setRotationAngle(this.bone17, 0.0f, 0.0f, -1.8151f);
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 0, 0, -4.0f, -1.0f, 0.0f, 3, 1, 1, 0.0f, false));
        this.bone18 = new ModelRenderer((ModelBase)this);
        this.bone18.func_78793_a(3.4f, -25.95f, 1.0f);
        this.bone.func_78792_a(this.bone18);
        this.setRotationAngle(this.bone18, 0.0f, 0.0f, 1.8151f);
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 0, 0, 1.0f, -1.0f, 0.0f, 3, 1, 1, 0.0f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(-2.25f, -25.2f, 1.0f);
        this.bone.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, 0.2967f, 0.0f, 0.0f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 0, 0, -0.75f, 5.9681f, -9.1577f, 9, 2, 2, 0.0f, false));
        this.bone19 = new ModelRenderer((ModelBase)this);
        this.bone19.func_78793_a(-2.5f, -26.2f, 0.5f);
        this.bone.func_78792_a(this.bone19);
        this.setRotationAngle(this.bone19, 0.0f, 0.0f, 0.2094f);
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(1.0f, -3.5f, 1.0f);
        this.bone19.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.192f, 0.0f, 0.0f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 16, 33, -1.0f, -0.1908f, -3.9816f, 1, 1, 4, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(1.0f, 0.0f, -2.5f);
        this.bone19.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 1.3788f, 0.0f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 24, 2, -1.0f, -0.9816f, -0.1908f, 1, 1, 3, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(1.0f, 0.0f, 1.5f);
        this.bone19.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, -1.4486f, 0.0f, 0.0f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 37, 37, -1.01f, 0.0f, -3.0f, 1, 4, 3, 0.0f, false));
        this.bone20 = new ModelRenderer((ModelBase)this);
        this.bone20.func_78793_a(5.49f, -26.2f, -1.0f);
        this.bone.func_78792_a(this.bone20);
        this.setRotationAngle(this.bone20, 0.0f, 0.0f, -0.2094f);
        this.bone21 = new ModelRenderer((ModelBase)this);
        this.bone21.func_78793_a(-6.99f, 0.0f, 3.0f);
        this.bone20.func_78792_a(this.bone21);
        this.setRotationAngle(this.bone21, -1.4486f, 0.0f, 0.0f);
        this.bone21.field_78804_l.add(new ModelBox(this.bone21, 34, 18, 5.99f, 0.0f, -3.0f, 1, 4, 3, 0.0f, false));
        this.bone22 = new ModelRenderer((ModelBase)this);
        this.bone22.func_78793_a(-6.99f, 0.0f, -1.0f);
        this.bone20.func_78792_a(this.bone22);
        this.setRotationAngle(this.bone22, 1.3788f, 0.0f, 0.0f);
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 8, 24, 6.0f, -0.9816f, -0.1908f, 1, 1, 3, 0.0f, false));
        this.bone23 = new ModelRenderer((ModelBase)this);
        this.bone23.func_78793_a(-6.99f, -3.5f, 2.5f);
        this.bone20.func_78792_a(this.bone23);
        this.setRotationAngle(this.bone23, 0.192f, 0.0f, 0.0f);
        this.bone23.field_78804_l.add(new ModelBox(this.bone23, 18, 24, 6.0f, -0.1908f, -3.9816f, 1, 1, 4, 0.0f, false));
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(6.0f, -15.9f, -2.0f);
        this.bone.func_78792_a(this.bone15);
        this.setRotationAngle(this.bone15, 0.0f, 0.0f, -2.6354f);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 0, 0, -0.7576f, -1.5627f, -1.0f, 4, 2, 4, 0.0f, false));
        this.bone16 = new ModelRenderer((ModelBase)this);
        this.bone16.func_78793_a(-3.0f, -15.9f, -2.0f);
        this.bone.func_78792_a(this.bone16);
        this.setRotationAngle(this.bone16, 0.0f, 0.0f, 2.6354f);
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 0, 0, -3.2424f, -1.5627f, -1.0f, 4, 2, 4, 0.0f, false));
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(6.0f, -22.1f, 0.0f);
        this.bone.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.0f, 0.0f, -0.7854f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 20, 33, -1.0f, -1.0f, -3.01f, 1, 1, 5, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 10, 33, -6.364f, -6.364f, -3.01f, 1, 1, 5, 0.0f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(5.0f, -19.0f, -2.8f);
        this.bone.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, 0.0f, 0.0f, -0.7854f);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 13, 38, -0.2929f, -0.7071f, -1.0f, 1, 1, 1, 0.0f, false));
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 10, 35, -5.2426f, -5.6569f, -1.0f, 1, 1, 1, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(0.5f, -24.9f, 0.7f);
        this.bone.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.7854f, 0.0f, 0.0f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 24, 0, -1.99f, 4.1619f, -6.1619f, 6, 1, 1, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-2.0f, -17.2f, 1.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, 0.6981f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 24, -0.8071f, -4.3199f, 0.0f, 1, 3, 1, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(5.0f, -17.2f, 1.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, -0.6981f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 4, -0.1929f, -4.3199f, 0.0f, 1, 3, 1, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(-2.0f, -15.1f, 1.0f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, -0.6981f, 0.0f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 32, 30, -1.0f, -1.346f, -0.8987f, 2, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 16, 4, 6.0f, -1.346f, -0.8987f, 2, 1, 1, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.sight44.func_78785_a(f5);
        this.bone.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


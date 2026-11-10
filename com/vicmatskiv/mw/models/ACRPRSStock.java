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

public class ACRPRSStock
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer ACR175;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer ACR181;
    private final ModelRenderer ACR185;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
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
    private final ModelRenderer bone24;

    public ACRPRSStock() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
        this.ACR175 = new ModelRenderer((ModelBase)this);
        this.ACR175.func_78793_a(-2.5f, -41.4f, 3.0f);
        this.bone.func_78792_a(this.ACR175);
        this.setRotationAngle(this.ACR175, -0.3498f, 0.0f, 0.0f);
        this.ACR175.field_78804_l.add(new ModelBox(this.ACR175, 12, 56, 0.0f, 0.0f, 0.0f, 2, 2, 5, 0.0f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(0.0f, 0.0f, 0.0f);
        this.ACR175.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, 0.0f, 0.0f, -2.7925f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 38, 24, -1.0f, -2.0f, 0.0f, 1, 2, 5, 0.0f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(2.0f, 0.0f, 0.0f);
        this.ACR175.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, 0.0f, 0.0f, 2.7925f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 38, 0, 0.0f, -2.0f, 0.0f, 1, 2, 5, 0.0f, false));
        this.ACR181 = new ModelRenderer((ModelBase)this);
        this.ACR181.func_78793_a(-2.4f, -39.8f, 2.7f);
        this.bone.func_78792_a(this.ACR181);
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 53, 24, -1.1f, 0.8f, 0.0f, 4, 4, 7, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 31, 56, -1.1f, 1.8f, 7.0f, 4, 2, 2, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 53, 38, -0.6f, -0.07f, 0.0f, 3, 1, 7, 0.0f, false));
        this.ACR185 = new ModelRenderer((ModelBase)this);
        this.ACR185.func_78793_a(-3.0f, -37.05f, 2.2f);
        this.bone.func_78792_a(this.ACR185);
        this.ACR185.field_78804_l.add(new ModelBox(this.ACR185, 53, 14, 0.0f, 2.0f, 0.5f, 3, 1, 9, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.5f, -38.0f, 11.7f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 2.81f, 0.0f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 53, 46, -3.99f, -1.0f, 0.0f, 4, 1, 3, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.5f, -36.0f, 11.7f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, -2.81f, 0.0f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 38, 14, -3.99f, 0.0f, 0.0f, 4, 1, 3, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(-3.5f, -39.0f, 2.7f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 1.1868f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 8, 20, -1.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(0.5f, -39.0f, 2.7f);
        this.bone.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, -1.1868f, 0.0f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 20, 0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(-3.9f, -38.0f, 3.6f);
        this.bone.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.0f, 1.6755f, 0.0f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 17, 33, -4.0f, -1.0f, 0.0f, 4, 1, 1, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 33, -4.0f, 2.0f, 0.0f, 4, 1, 1, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(0.9f, -38.0f, 3.6f);
        this.bone.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, -1.6755f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 25, 24, 0.0f, -1.0f, 0.0f, 4, 1, 1, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 13, 0.0f, 2.0f, 0.0f, 4, 1, 1, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(-3.5f, -39.0f, 2.7f);
        this.bone.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.0f, 0.0f, 2.0944f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 22, 56, -1.0f, -1.0f, 0.0f, 1, 1, 7, 0.0f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(0.5f, -39.0f, 2.7f);
        this.bone.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, 0.0f, 0.0f, -2.0944f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 34, 40, 0.0f, -1.0f, 0.0f, 1, 1, 7, 0.0f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(0.0f, -38.75f, 9.7f);
        this.bone.func_78792_a(this.bone12);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 0, 0, -3.0f, -1.0f, 0.0f, 3, 5, 15, 0.0f, false));
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 21, 5, -0.6f, -0.25f, 0.0f, 1, 4, 15, 0.0f, false));
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 0, 20, -3.4f, -0.25f, 0.0f, 1, 4, 15, 0.0f, false));
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 53, 53, -0.6f, 3.75f, 5.0f, 1, 5, 10, 0.0f, false));
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 35, 52, -4.1f, 8.25f, 6.0f, 5, 1, 9, 0.0f, false));
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 0, 53, -3.4f, 3.75f, 5.0f, 1, 5, 10, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(0.0f, 10.0f, 5.0f);
        this.bone12.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, -0.0873f, 0.0f, 0.0f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 18, 43, -3.41f, -2.4801f, -0.2055f, 3, 3, 10, 0.0f, false));
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 53, 0, -0.59f, -2.4801f, -0.2055f, 1, 3, 10, 0.0f, false));
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(0.0f, 8.75f, 5.0f);
        this.bone12.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.576f, 0.0f, 0.0f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 54, 52, -3.41f, -6.0f, 0.0f, 1, 6, 3, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 53, 14, -0.61f, -6.0f, 0.0f, 1, 6, 3, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 46, 62, -2.51f, -6.0f, -0.5f, 2, 7, 1, 0.0f, false));
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(0.0f, 4.25f, 0.0f);
        this.bone12.func_78792_a(this.bone15);
        this.setRotationAngle(this.bone15, 1.2217f, 0.0f, 0.0f);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 22, 64, -3.409f, -2.0f, 0.0f, 3, 5, 2, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 17, 22, -0.609f, -2.0f, 0.0f, 1, 5, 2, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 0, 0, -2.509f, -0.829f, -0.4698f, 2, 4, 1, 0.0f, false));
        this.bone16 = new ModelRenderer((ModelBase)this);
        this.bone16.func_78793_a(0.0f, -39.15f, 11.0f);
        this.bone.func_78792_a(this.bone16);
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 19, 26, -3.0f, -1.0f, 0.0f, 3, 1, 13, 0.0f, false));
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 0, 20, -0.41f, 0.4f, 4.5f, 1, 7, 6, 0.0f, false));
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 38, 31, -0.405f, 0.4f, 1.1f, 1, 2, 4, 0.0f, false));
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 38, 7, -3.605f, 0.4f, 1.1f, 1, 2, 4, 0.0f, false));
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 0, 0, -3.59f, 0.4f, 4.5f, 1, 7, 6, 0.0f, false));
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 38, 0, -3.6f, -0.2f, 0.0f, 1, 1, 13, 0.0f, false));
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 38, 38, -0.4f, -0.2f, 0.0f, 1, 1, 13, 0.0f, false));
        this.bone17 = new ModelRenderer((ModelBase)this);
        this.bone17.func_78793_a(0.0f, -1.0f, 0.0f);
        this.bone16.func_78792_a(this.bone17);
        this.setRotationAngle(this.bone17, 0.0f, 0.0f, -0.6458f);
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 0, 39, -1.0f, 0.0f, 0.0f, 1, 1, 13, 0.0f, false));
        this.bone18 = new ModelRenderer((ModelBase)this);
        this.bone18.func_78793_a(-3.0f, -1.0f, 0.0f);
        this.bone16.func_78792_a(this.bone18);
        this.setRotationAngle(this.bone18, 0.0f, 0.0f, 0.6458f);
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 38, 24, 0.0f, 0.0f, 0.0f, 1, 1, 13, 0.0f, false));
        this.bone19 = new ModelRenderer((ModelBase)this);
        this.bone19.func_78793_a(0.6f, 0.8f, 0.0f);
        this.bone16.func_78792_a(this.bone19);
        this.setRotationAngle(this.bone19, -0.9774f, 0.0f, 0.0f);
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 8, 3, -0.99f, -1.0f, 0.0f, 1, 1, 2, 0.0f, false));
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 32, 62, -1.0f, -3.0f, 2.0f, 1, 3, 6, 0.0f, false));
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 17, 24, -4.2f, -3.0f, 2.0f, 1, 3, 6, 0.0f, false));
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 8, 0, -4.21f, -1.0f, 0.0f, 1, 1, 2, 0.0f, false));
        this.bone20 = new ModelRenderer((ModelBase)this);
        this.bone20.func_78793_a(0.6f, 0.8f, 13.0f);
        this.bone16.func_78792_a(this.bone20);
        this.setRotationAngle(this.bone20, 2.81f, 0.0f, 0.0f);
        this.bone20.field_78804_l.add(new ModelBox(this.bone20, 15, 40, -0.99f, -7.0f, 0.0f, 1, 7, 3, 0.0f, false));
        this.bone20.field_78804_l.add(new ModelBox(this.bone20, 0, 39, -4.21f, -7.0f, 0.0f, 1, 7, 3, 0.0f, false));
        this.bone21 = new ModelRenderer((ModelBase)this);
        this.bone21.func_78793_a(-1.6f, -38.9f, 24.4f);
        this.bone.func_78792_a(this.bone21);
        this.bone21.field_78804_l.add(new ModelBox(this.bone21, 21, 0, -1.9f, -1.0f, 0.0f, 4, 12, 2, 0.0f, false));
        this.bone22 = new ModelRenderer((ModelBase)this);
        this.bone22.func_78793_a(-0.9f, -1.0f, 2.0f);
        this.bone21.func_78792_a(this.bone22);
        this.setRotationAngle(this.bone22, -0.1745f, 0.0f, 0.0f);
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 53, 0, -0.99f, 0.0f, 0.0f, 4, 6, 1, 0.0f, false));
        this.bone23 = new ModelRenderer((ModelBase)this);
        this.bone23.func_78793_a(-0.9f, 4.9f, 1.9f);
        this.bone21.func_78792_a(this.bone23);
        this.setRotationAngle(this.bone23, 0.1745f, 0.0f, 0.0f);
        this.bone23.field_78804_l.add(new ModelBox(this.bone23, 0, 53, -0.99f, 0.0f, -1.0f, 4, 6, 1, 0.0f, false));
        this.bone24 = new ModelRenderer((ModelBase)this);
        this.bone24.func_78793_a(1.3f, -30.3f, 22.4f);
        this.bone.func_78792_a(this.bone24);
        this.setRotationAngle(this.bone24, 0.0f, 0.0f, 0.7854f);
        this.bone24.field_78804_l.add(new ModelBox(this.bone24, 43, 43, -3.0f, -1.0f, 0.0f, 3, 3, 1, 0.0f, false));
        this.bone24.field_78804_l.add(new ModelBox(this.bone24, 33, 0, -5.0153f, 1.0153f, 0.0f, 3, 3, 1, 0.0f, false));
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


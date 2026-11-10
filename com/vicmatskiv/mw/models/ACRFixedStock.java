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

public class ACRFixedStock
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer ACR181;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone21;
    private final ModelRenderer bone29;
    private final ModelRenderer bone28;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone25;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone15;
    private final ModelRenderer bone12;
    private final ModelRenderer bone14;
    private final ModelRenderer bone13;
    private final ModelRenderer bone16;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone24;

    public ACRFixedStock() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
        this.ACR181 = new ModelRenderer((ModelBase)this);
        this.ACR181.func_78793_a(-2.4f, -39.8f, 2.7f);
        this.bone.func_78792_a(this.ACR181);
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 0, 0, -1.1f, 2.3f, 0.0f, 4, 2, 23, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 50, 57, -1.1f, 4.3f, 0.0f, 4, 1, 10, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 23, 35, -1.1f, -0.2f, 0.0f, 4, 3, 2, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 18, 16, 2.6f, 0.8f, 0.2f, 1, 4, 1, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 16, 48, -0.1f, -1.9f, 0.0f, 2, 2, 2, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 16, 48, -0.6f, 4.75f, 0.0f, 3, 1, 9, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(-1.1f, -0.2f, 0.0f);
        this.ACR181.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.0f, 0.0f, -1.0472f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 48, 48, 0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(2.9f, -0.2f, 0.0f);
        this.ACR181.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, 0.0f, 0.0f, 1.0472f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 5, 48, -2.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(-3.5f, -39.0f, 2.7f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 1.1868f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 25, -1.0f, 1.5f, 0.0f, 1, 3, 1, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(0.5f, -39.0f, 2.7f);
        this.bone.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, -1.1868f, 0.0f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 19, 10, 0.0f, 1.5f, 0.0f, 1, 3, 1, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(-3.9f, -38.0f, 3.6f);
        this.bone.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.0f, 1.6755f, 0.0f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 31, 48, -4.0f, 0.5f, 0.0f, 4, 1, 1, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 44, 42, -4.0f, 2.5f, 0.0f, 4, 1, 1, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(0.9f, -38.0f, 3.6f);
        this.bone.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, -1.6755f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 23, 42, 0.0f, 0.5f, 0.0f, 4, 1, 1, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 21, 0.0f, 2.5f, 0.0f, 4, 1, 1, 0.0f, false));
        this.bone21 = new ModelRenderer((ModelBase)this);
        this.bone21.func_78793_a(-1.6f, -38.9f, 24.4f);
        this.bone.func_78792_a(this.bone21);
        this.bone21.field_78804_l.add(new ModelBox(this.bone21, 0, 0, -1.9f, 0.0f, 1.25f, 4, 12, 3, 0.0f, false));
        this.bone21.field_78804_l.add(new ModelBox(this.bone21, 23, 30, -1.9f, 10.0f, -1.75f, 4, 2, 3, 0.0f, false));
        this.bone21.field_78804_l.add(new ModelBox(this.bone21, 31, 0, -1.9f, 11.0f, -4.75f, 4, 1, 3, 0.0f, false));
        this.bone29 = new ModelRenderer((ModelBase)this);
        this.bone29.func_78793_a(0.0f, 10.0f, 0.25f);
        this.bone21.func_78792_a(this.bone29);
        this.setRotationAngle(this.bone29, 0.7854f, 0.0f, 0.0f);
        this.bone29.field_78804_l.add(new ModelBox(this.bone29, 11, 0, -1.89f, 0.0f, 0.0f, 4, 1, 2, 0.0f, false));
        this.bone29.field_78804_l.add(new ModelBox(this.bone29, 9, 40, -1.89f, -4.7376f, 4.7376f, 4, 2, 1, 0.0f, false));
        this.bone29.field_78804_l.add(new ModelBox(this.bone29, 23, 25, -1.91f, -13.0915f, -4.6163f, 4, 2, 3, 0.0f, false));
        this.bone28 = new ModelRenderer((ModelBase)this);
        this.bone28.func_78793_a(0.0f, 12.0f, -1.75f);
        this.bone21.func_78792_a(this.bone28);
        this.setRotationAngle(this.bone28, 2.5656f, 0.0f, 0.0f);
        this.bone28.field_78804_l.add(new ModelBox(this.bone28, 31, 0, -1.89f, 0.0f, 0.0f, 4, 2, 14, 0.0f, false));
        this.bone28.field_78804_l.add(new ModelBox(this.bone28, 0, 31, -1.89f, -1.6339f, 2.516f, 4, 1, 3, 0.0f, false));
        this.bone28.field_78804_l.add(new ModelBox(this.bone28, 0, 38, -1.89f, -1.6339f, 5.516f, 4, 2, 1, 0.0f, false));
        this.bone22 = new ModelRenderer((ModelBase)this);
        this.bone22.func_78793_a(-0.9f, -1.0f, 2.0f);
        this.bone21.func_78792_a(this.bone22);
        this.setRotationAngle(this.bone22, -0.1745f, 0.0f, 0.0f);
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 43, 25, -0.99f, 0.5941f, 2.3895f, 4, 6, 1, 0.0f, false));
        this.bone23 = new ModelRenderer((ModelBase)this);
        this.bone23.func_78793_a(-0.9f, 4.9f, 1.9f);
        this.bone21.func_78792_a(this.bone23);
        this.setRotationAngle(this.bone23, 0.1745f, 0.0f, 0.0f);
        this.bone23.field_78804_l.add(new ModelBox(this.bone23, 43, 16, -0.99f, 1.3755f, 1.0422f, 4, 6, 1, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-3.5f, -40.0f, 4.7f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, -0.7505f, 0.0f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 25, -0.01f, 0.0f, 0.0f, 4, 2, 4, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.5f, -39.4f, 22.2f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.6981f, 0.0f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 15, -4.01f, 0.0f, -4.0f, 4, 2, 4, 0.0f, false));
        this.bone25 = new ModelRenderer((ModelBase)this);
        this.bone25.func_78793_a(0.0f, 0.0f, 0.0f);
        this.bone3.func_78792_a(this.bone25);
        this.setRotationAngle(this.bone25, -2.3562f, 0.0f, 0.0f);
        this.bone25.field_78804_l.add(new ModelBox(this.bone25, 31, 4, -3.99f, -4.0f, 0.0f, 4, 4, 2, 0.0f, false));
        this.bone25.field_78804_l.add(new ModelBox(this.bone25, 14, 3, -2.99f, -7.0087f, -0.9004f, 2, 7, 1, 0.0f, false));
        this.bone26 = new ModelRenderer((ModelBase)this);
        this.bone26.func_78793_a(-3.0f, -0.0212f, -0.9053f);
        this.bone25.func_78792_a(this.bone26);
        this.setRotationAngle(this.bone26, 0.0f, -0.8378f, 0.0f);
        this.bone26.field_78804_l.add(new ModelBox(this.bone26, 47, 33, 0.0f, -7.0f, 0.0f, 1, 7, 1, 0.0f, false));
        this.bone26.field_78804_l.add(new ModelBox(this.bone26, 43, 33, -0.01f, -7.0f, 0.3553f, 1, 7, 1, 0.0f, false));
        this.bone27 = new ModelRenderer((ModelBase)this);
        this.bone27.func_78793_a(-1.0f, -0.0212f, -0.9053f);
        this.bone25.func_78792_a(this.bone27);
        this.setRotationAngle(this.bone27, 0.0f, 0.8378f, 0.0f);
        this.bone27.field_78804_l.add(new ModelBox(this.bone27, 44, 44, -1.0f, -7.0f, 0.0f, 1, 7, 1, 0.0f, false));
        this.bone27.field_78804_l.add(new ModelBox(this.bone27, 15, 30, -1.01f, -7.0f, 0.3553f, 1, 7, 1, 0.0f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(-0.5f, -41.75f, 5.25f);
        this.bone.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, -0.0873f, 0.0f, 0.0f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 23, 25, -2.0f, 0.0f, 0.0f, 2, 1, 16, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 0, 25, -2.0f, 0.2989f, -0.9739f, 2, 4, 19, 0.0f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(0.0f, 0.0f, 0.0f);
        this.bone10.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, 0.0f, 0.0f, -2.1642f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 43, 16, -1.0f, -1.0f, 0.0f, 1, 1, 16, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 48, -2.0f, -1.0f, 1.0f, 1, 1, 14, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 31, 16, -3.0f, -1.0f, 2.0f, 1, 1, 5, 0.0f, false));
        this.bone17 = new ModelRenderer((ModelBase)this);
        this.bone17.func_78793_a(0.5f, 0.756f, 16.0269f);
        this.bone10.func_78792_a(this.bone17);
        this.setRotationAngle(this.bone17, 0.1571f, -2.3387f, -2.2864f);
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 0, 48, -1.0f, -1.0f, 0.0f, 1, 1, 3, 0.0f, false));
        this.bone18 = new ModelRenderer((ModelBase)this);
        this.bone18.func_78793_a(-2.5f, 0.8557f, 16.0356f);
        this.bone10.func_78792_a(this.bone18);
        this.setRotationAngle(this.bone18, 1.6057f, -0.7505f, 2.0769f);
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 0, 15, -1.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f, false));
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(0.6f, 0.8966f, 0.0784f);
        this.bone10.func_78792_a(this.bone15);
        this.setRotationAngle(this.bone15, 0.1047f, 0.576f, -1.9897f);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 0, 41, -3.0f, -1.0f, 0.0f, 3, 1, 2, 0.0f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(-2.0f, 0.0f, 0.0f);
        this.bone10.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, 0.0f, 0.0f, 2.1642f);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 26, 42, 0.0f, -1.0f, 0.0f, 1, 1, 16, 0.0f, false));
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 44, 42, 1.0f, -1.0f, 1.0f, 1, 1, 14, 0.0f, false));
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 11, 16, 2.0f, -1.0f, 2.0f, 1, 1, 5, 0.0f, false));
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(-2.6f, 0.8966f, 0.0784f);
        this.bone10.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.1222f, 0.9774f, 2.1642f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 12, 12, -2.0f, -1.0f, 0.0f, 2, 1, 3, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(-2.6f, 5.0327f, 0.9924f);
        this.bone10.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, 0.0873f, 0.0f, 0.0f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 53, 0, -0.9f, -2.0f, 1.6f, 5, 2, 11, 0.0f, false));
        this.bone16 = new ModelRenderer((ModelBase)this);
        this.bone16.func_78793_a(-0.9f, 0.0f, 1.6f);
        this.bone13.func_78792_a(this.bone16);
        this.setRotationAngle(this.bone16, -1.1694f, 0.0f, 0.0f);
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 0, 35, -0.01f, -1.0f, -2.0f, 5, 1, 2, 0.0f, false));
        this.bone19 = new ModelRenderer((ModelBase)this);
        this.bone19.func_78793_a(0.1f, 0.0f, 12.6f);
        this.bone13.func_78792_a(this.bone19);
        this.setRotationAngle(this.bone19, 1.0647f, 0.0f, 0.0f);
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 31, 10, -0.95f, -1.0f, 0.0f, 5, 1, 2, 0.0f, false));
        this.bone20 = new ModelRenderer((ModelBase)this);
        this.bone20.func_78793_a(-0.9f, -2.0f, 1.7f);
        this.bone13.func_78792_a(this.bone20);
        this.setRotationAngle(this.bone20, 0.0f, 0.0f, -0.6632f);
        this.bone20.field_78804_l.add(new ModelBox(this.bone20, 34, 60, 0.0f, 0.0f, 0.0f, 2, 1, 11, 0.0f, false));
        this.bone24 = new ModelRenderer((ModelBase)this);
        this.bone24.func_78793_a(4.1f, -2.0f, 1.7f);
        this.bone13.func_78792_a(this.bone24);
        this.setRotationAngle(this.bone24, 0.0f, 0.0f, 0.6632f);
        this.bone24.field_78804_l.add(new ModelBox(this.bone24, 19, 59, -2.0f, 0.0f, 0.0f, 2, 1, 11, 0.0f, false));
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


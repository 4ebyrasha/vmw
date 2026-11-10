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

public class Reflex
extends ModelBase {
    private final ModelRenderer gun1;
    private final ModelRenderer gun2;
    private final ModelRenderer gun3;
    private final ModelRenderer gun8;
    private final ModelRenderer bone10;
    private final ModelRenderer gun9;
    private final ModelRenderer gun11;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer gun10;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer gun14;
    private final ModelRenderer gun13;
    private final ModelRenderer gun15;
    private final ModelRenderer bone15;
    private final ModelRenderer bone17;
    private final ModelRenderer bone16;
    private final ModelRenderer bone18;
    private final ModelRenderer gun5;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone3;
    private final ModelRenderer bone5;
    private final ModelRenderer gun7;
    private final ModelRenderer gun6;
    private final ModelRenderer bone6;
    private final ModelRenderer bone8;
    private final ModelRenderer bone7;
    private final ModelRenderer bone9;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;

    public Reflex() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.gun1 = new ModelRenderer((ModelBase)this);
        this.gun1.func_78793_a(-5.0f, -6.0f, -2.0f);
        this.gun1.field_78804_l.add(new ModelBox(this.gun1, 0, 0, 0.0f, 0.0f, 0.0f, 7, 2, 15, 0.0f, false));
        this.gun1.field_78804_l.add(new ModelBox(this.gun1, 0, 33, -0.01f, -0.3f, 10.9f, 7, 1, 4, 0.0f, false));
        this.gun2 = new ModelRenderer((ModelBase)this);
        this.gun2.func_78793_a(-4.0f, -4.0f, -1.5f);
        this.gun2.field_78804_l.add(new ModelBox(this.gun2, 28, 17, 0.0f, 0.0f, 0.0f, 5, 1, 13, 0.0f, false));
        this.gun3 = new ModelRenderer((ModelBase)this);
        this.gun3.func_78793_a(-5.0f, -3.0f, -2.0f);
        this.gun3.field_78804_l.add(new ModelBox(this.gun3, 28, 31, -0.01f, 1.0f, 0.0f, 1, 1, 14, 0.0f, false));
        this.gun3.field_78804_l.add(new ModelBox(this.gun3, 29, 0, 6.01f, 1.0f, 0.0f, 1, 1, 14, 0.0f, false));
        this.gun8 = new ModelRenderer((ModelBase)this);
        this.gun8.func_78793_a(-5.0f, -3.5f, -2.0f);
        this.gun8.field_78804_l.add(new ModelBox(this.gun8, 0, 17, 0.0f, 0.0f, 0.0f, 7, 2, 14, 0.0f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(-5.0f, -6.0f, -2.0f);
        this.setRotationAngle(this.bone10, 0.0f, 0.0f, -2.3562f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 21, 48, -1.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 13, 48, -4.9497f, 3.9497f, 0.0f, 1, 1, 3, 0.0f, false));
        this.gun9 = new ModelRenderer((ModelBase)this);
        this.gun9.func_78793_a(-4.5f, -6.0f, -2.0f);
        this.setRotationAngle(this.gun9, -0.0698f, 0.0f, 0.0f);
        this.gun9.field_78804_l.add(new ModelBox(this.gun9, 45, 0, 0.0f, -2.0f, 0.0f, 6, 2, 3, 0.0f, false));
        this.gun11 = new ModelRenderer((ModelBase)this);
        this.gun11.func_78793_a(5.5f, -6.0f, 0.0f);
        this.gun9.func_78792_a(this.gun11);
        this.gun11.field_78804_l.add(new ModelBox(this.gun11, 34, 35, 0.5f, 0.8005f, -0.014f, 1, 2, 3, 0.0f, false));
        this.gun11.field_78804_l.add(new ModelBox(this.gun11, 8, 46, 0.51f, 0.3005f, -0.014f, 1, 1, 3, 0.0f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(1.5f, 0.5f, 0.0f);
        this.gun11.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, 0.0f, 0.0f, -0.5236f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 34, 7, -0.9002f, -2.1728f, -0.014f, 1, 2, 3, 0.0f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(1.5f, 3.0f, 0.0f);
        this.gun11.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, 0.0f, 0.0f, 0.5236f);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 34, 2, -1.0998f, -0.1728f, -0.014f, 1, 2, 3, 0.0f, false));
        this.gun10 = new ModelRenderer((ModelBase)this);
        this.gun10.func_78793_a(0.5f, -6.1995f, -0.014f);
        this.gun9.func_78792_a(this.gun10);
        this.setRotationAngle(this.gun10, 0.0f, 3.1416f, 0.0f);
        this.gun10.field_78804_l.add(new ModelBox(this.gun10, 28, 33, 0.5f, 1.0f, -3.0f, 1, 2, 3, 0.0f, false));
        this.gun10.field_78804_l.add(new ModelBox(this.gun10, 29, 10, 0.51f, 0.5f, -3.0f, 1, 1, 3, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(1.5f, 0.5f, 0.0f);
        this.gun10.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, 0.0f, 0.0f, -0.5236f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 29, 5, -1.0f, -2.0f, -3.0f, 1, 2, 3, 0.0f, false));
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(1.5f, 3.0f, 0.0f);
        this.gun10.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.0f, 0.0f, 0.5236f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 29, 0, -1.0f, 0.0f, -3.0f, 1, 2, 3, 0.0f, false));
        this.gun14 = new ModelRenderer((ModelBase)this);
        this.gun14.func_78793_a(5.0f, -7.0f, 0.0f);
        this.gun9.func_78792_a(this.gun14);
        this.gun13 = new ModelRenderer((ModelBase)this);
        this.gun13.func_78793_a(0.0f, -7.0f, 0.0f);
        this.gun9.func_78792_a(this.gun13);
        this.gun15 = new ModelRenderer((ModelBase)this);
        this.gun15.func_78793_a(0.5f, -7.5f, 0.0f);
        this.gun9.func_78792_a(this.gun15);
        this.gun15.field_78804_l.add(new ModelBox(this.gun15, 24, 41, -0.5f, 0.07f, 0.0f, 6, 1, 3, 0.0f, false));
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(-0.65f, -6.2f, 3.25f);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 44, 31, -3.85f, -1.0f, 0.25f, 6, 2, 3, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 16, 33, -2.35f, -1.0f, -1.25f, 3, 2, 6, 0.0f, false));
        this.bone17 = new ModelRenderer((ModelBase)this);
        this.bone17.func_78793_a(0.4f, -0.3f, 0.25f);
        this.bone15.func_78792_a(this.bone17);
        this.setRotationAngle(this.bone17, 0.0f, -0.7854f, 0.0f);
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 45, 5, -1.85f, -1.0f, 0.0f, 4, 2, 4, 0.0f, false));
        this.bone16 = new ModelRenderer((ModelBase)this);
        this.bone16.func_78793_a(-3.85f, 0.0f, 0.25f);
        this.bone15.func_78792_a(this.bone16);
        this.setRotationAngle(this.bone16, 0.0f, 0.7854f, 0.0f);
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 43, 46, 0.0f, -1.0f, 0.0f, 2, 2, 2, 0.0f, false));
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 35, 46, -2.1213f, -1.0f, 2.1213f, 2, 2, 2, 0.0f, false));
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 27, 46, 0.1213f, -1.0f, 4.364f, 2, 2, 2, 0.0f, false));
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 0, 46, 2.2426f, -1.0f, 2.2426f, 2, 2, 2, 0.0f, false));
        this.bone18 = new ModelRenderer((ModelBase)this);
        this.bone18.func_78793_a(0.0f, 24.0f, -0.6f);
        this.gun5 = new ModelRenderer((ModelBase)this);
        this.gun5.func_78793_a(-4.0f, -32.0f, 12.0f);
        this.bone18.func_78792_a(this.gun5);
        this.setRotationAngle(this.gun5, 0.0436f, 0.0f, 0.0f);
        this.gun5.field_78804_l.add(new ModelBox(this.gun5, 0, 38, 0.5f, 0.0654f, 1.4986f, 4, 3, 5, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(4.5f, -0.001f, -0.0436f);
        this.gun5.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, -0.7854f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 28, 23, -1.0463f, 0.0463f, 1.4986f, 1, 1, 5, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 28, 17, -3.8747f, -2.7822f, 1.4986f, 1, 1, 5, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(5.2f, 1.6984f, 4.9258f);
        this.gun5.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0698f, -0.1571f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 7, -0.7656f, -0.8315f, -4.528f, 1, 1, 6, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(0.0f, -1.0f, 0.0f);
        this.bone2.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, 0.4712f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 23, -0.7146f, 0.0437f, -3.528f, 1, 1, 5, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(-0.2f, 1.6984f, 4.9258f);
        this.gun5.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0698f, 0.1571f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, -0.2344f, -0.8315f, -4.528f, 1, 1, 6, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(-0.0585f, -0.9691f, -0.0576f);
        this.bone3.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, -0.4712f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 17, -0.2268f, 0.0437f, -3.528f, 1, 1, 5, 0.0f, false));
        this.gun7 = new ModelRenderer((ModelBase)this);
        this.gun7.func_78793_a(-0.5f, -32.0f, 12.0f);
        this.bone18.func_78792_a(this.gun7);
        this.setRotationAngle(this.gun7, -1.0038f, -0.2618f, 0.0f);
        this.gun7.field_78804_l.add(new ModelBox(this.gun7, 0, 7, 0.3882f, -1.2222f, 0.7782f, 1, 4, 2, 0.0f, false));
        this.gun7.field_78804_l.add(new ModelBox(this.gun7, 8, 8, 1.0782f, -0.2222f, 0.7782f, 1, 3, 2, 0.0f, false));
        this.gun6 = new ModelRenderer((ModelBase)this);
        this.gun6.func_78793_a(-2.5f, -32.0f, 12.0f);
        this.bone18.func_78792_a(this.gun6);
        this.setRotationAngle(this.gun6, -1.0038f, 0.2618f, 0.0f);
        this.gun6.field_78804_l.add(new ModelBox(this.gun6, 0, 0, -1.3882f, -1.2222f, 0.7782f, 1, 4, 2, 0.0f, false));
        this.gun6.field_78804_l.add(new ModelBox(this.gun6, 8, 0, -2.0782f, -0.2222f, 0.7782f, 1, 3, 2, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(2.0f, -29.0f, 12.0f);
        this.bone18.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.0f, -0.1658f, 0.0f);
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(0.0f, 0.0f, 0.0f);
        this.bone6.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.1047f, 0.0f, 0.0f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 44, 36, -2.7424f, -0.8454f, 1.4713f, 3, 2, 5, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(-5.0f, -29.0f, 12.0f);
        this.bone18.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, 0.1658f, 0.0f);
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(0.0f, 0.0f, 0.0f);
        this.bone7.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, 0.1047f, 0.0f, 0.0f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 13, 41, -0.2576f, -0.8454f, 1.4713f, 3, 2, 5, 0.0f, false));
        this.bone19 = new ModelRenderer((ModelBase)this);
        this.bone19.func_78793_a(2.2f, -5.2f, 10.2f);
        this.setRotationAngle(this.bone19, -0.7854f, 0.0f, 0.0f);
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 10, 18, -1.0f, -1.0f, 0.0f, 1, 1, 1, 0.0f, false));
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 7, 17, -0.8f, 1.192f, 2.0506f, 1, 1, 1, 0.0f, false));
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 0, 17, -0.8f, 9.3945f, -6.1518f, 1, 1, 1, 0.0f, false));
        this.bone20 = new ModelRenderer((ModelBase)this);
        this.bone20.func_78793_a(-0.2f, -3.0f, 13.05f);
        this.setRotationAngle(this.bone20, 0.0f, -0.7854f, 0.0f);
        this.bone20.field_78804_l.add(new ModelBox(this.bone20, 39, 52, -2.0f, -1.6f, 0.0f, 4, 2, 4, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.gun1.func_78785_a(f5);
        this.gun2.func_78785_a(f5);
        this.gun3.func_78785_a(f5);
        this.gun8.func_78785_a(f5);
        this.bone10.func_78785_a(f5);
        this.gun9.func_78785_a(f5);
        this.bone15.func_78785_a(f5);
        this.bone18.func_78785_a(f5);
        this.bone19.func_78785_a(f5);
        this.bone20.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


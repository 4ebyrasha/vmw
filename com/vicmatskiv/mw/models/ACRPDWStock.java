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

public class ACRPDWStock
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer ACR181;
    private final ModelRenderer bone3;
    private final ModelRenderer bone6;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;
    private final ModelRenderer bone2;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;

    public ACRPDWStock() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
        this.ACR181 = new ModelRenderer((ModelBase)this);
        this.ACR181.func_78793_a(-2.4f, -39.8f, 2.7f);
        this.bone.func_78792_a(this.ACR181);
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 0, 28, -2.1f, 2.4f, 0.0f, 6, 1, 7, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 0, 28, -1.9f, 2.4f, -4.0f, 1, 1, 27, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 0, 0, 2.7f, 2.4f, -4.0f, 1, 1, 27, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 29, 50, -2.1f, 2.4f, 21.0f, 6, 1, 4, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 29, 14, -1.1f, 1.2f, 0.0f, 4, 3, 7, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 44, 0, -1.1f, 1.2f, 21.0f, 4, 3, 5, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 14, 7, -1.09f, -0.8f, 24.4f, 4, 2, 2, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 48, 57, -0.6f, 4.2f, 21.0f, 3, 3, 5, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 58, 15, -0.6f, 7.2f, 22.5f, 3, 4, 4, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 29, 42, -0.6f, 0.7f, 0.0f, 3, 1, 7, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 57, 58, 0.4f, -0.3f, 0.0f, 1, 1, 7, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 29, 29, -0.6f, -0.7f, 0.0f, 3, 1, 12, 0.0f, false));
        this.ACR181.field_78804_l.add(new ModelBox(this.ACR181, 43, 15, 0.4f, -1.7f, 0.0f, 1, 1, 13, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(-2.1f, 2.4f, 0.05f);
        this.ACR181.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, -0.5061f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 14, 56, 0.0f, 0.0f, -0.05f, 2, 1, 7, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 14, 14, 0.0f, 0.0f, 20.95f, 2, 1, 4, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(-2.1f, 3.4f, 0.05f);
        this.ACR181.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.0f, 0.0f, 0.5061f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 45, 0.0f, -1.0f, -0.05f, 2, 1, 7, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 13, 0.0f, -1.0f, 20.95f, 2, 1, 4, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(3.9f, 2.4f, 0.05f);
        this.ACR181.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, 0.5061f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 55, 1, -2.0f, 0.0f, -0.05f, 2, 1, 7, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 5, -2.0f, 0.0f, 20.95f, 2, 1, 4, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(3.9f, 3.4f, 0.05f);
        this.ACR181.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, -0.5061f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 47, 29, -2.0f, -1.0f, -0.05f, 2, 1, 7, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -2.0f, -1.0f, 20.95f, 2, 1, 4, 0.0f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(1.4f, -3.0f, 0.9f);
        this.ACR181.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, -0.8029f, 0.0f, 0.0f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 28, -1.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(0.0f, 0.0f, 0.0f);
        this.bone11.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, 0.0f, 0.0f, -0.4189f);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 20, 20, -1.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(-1.0f, 0.0f, 0.0f);
        this.bone11.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, 0.0f, 0.0f, 0.4189f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 14, 19, 0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, false));
        this.bone21 = new ModelRenderer((ModelBase)this);
        this.bone21.func_78793_a(-1.6f, -38.9f, 24.4f);
        this.bone.func_78792_a(this.bone21);
        this.bone21.field_78804_l.add(new ModelBox(this.bone21, 0, 56, -1.9f, -1.7f, 4.3f, 4, 12, 3, 0.0f, false));
        this.bone22 = new ModelRenderer((ModelBase)this);
        this.bone22.func_78793_a(-0.9f, -1.0f, 2.0f);
        this.bone21.func_78792_a(this.bone22);
        this.setRotationAngle(this.bone22, -0.1745f, 0.0f, 0.0f);
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 0, 18, -0.99f, -1.6097f, 5.0979f, 4, 6, 1, 0.0f, false));
        this.bone23 = new ModelRenderer((ModelBase)this);
        this.bone23.func_78793_a(-0.9f, 4.9f, 1.9f);
        this.bone21.func_78792_a(this.bone23);
        this.setRotationAngle(this.bone23, 0.1745f, 0.0f, 0.0f);
        this.bone23.field_78804_l.add(new ModelBox(this.bone23, 14, 0, -0.99f, 0.231f, 4.341f, 4, 6, 1, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, -35.4f, 9.7f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, -2.9758f, 0.0f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 36, -3.49f, 0.0f, 0.0f, 4, 2, 7, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(-3.0f, -40.5f, 2.7f);
        this.bone.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, 0.0f, -0.7854f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 13, 0.0f, 0.0f, 0.0f, 1, 1, 12, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 29, 0, 0.4f, -0.01f, 0.0f, 1, 1, 13, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, 1.1213f, 1.1213f, 0.0f, 1, 1, 12, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 43, 43, 1.13f, 0.7f, 0.0f, 1, 1, 13, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(0.5f, -38.6f, 23.7f);
        this.bone.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.5236f, 0.0f, 0.0f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 57, 9, -4.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(0.5f, -38.6f, 8.7f);
        this.bone.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, 0.0f, 0.0f, 0.5236f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 32, 56, -1.0f, 0.0f, -6.0f, 1, 1, 7, 0.0f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(-3.5f, -38.6f, 8.7f);
        this.bone.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, 0.0f, 0.0f, -0.5236f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 11, 46, 0.0f, 0.0f, -6.0f, 1, 1, 7, 0.0f, false));
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


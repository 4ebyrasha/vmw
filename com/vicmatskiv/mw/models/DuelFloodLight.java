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

public class DuelFloodLight
extends ModelBase {
    private final ModelRenderer bone11;
    private final ModelRenderer bone10;
    private final ModelRenderer bone9;
    private final ModelRenderer bone8;
    private final ModelRenderer bone7;
    private final ModelRenderer bone3;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;

    public DuelFloodLight() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(0.0f, 24.0f, 0.0f);
        this.setRotationAngle(this.bone11, 0.0f, -0.7854f, 0.0f);
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(0.5f, -9.25f, 0.0f);
        this.bone11.func_78792_a(this.bone10);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 28, 58, -1.0f, -12.0f, 0.0f, 1, 1, 1, 0.2f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 40, 0, -1.0f, -14.25f, 0.0f, 1, 22, 1, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 0, 0, -10.0f, -15.25f, 0.0f, 19, 1, 1, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 16, 48, -8.0f, -15.5f, -1.0f, 1, 1, 3, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 12, 58, -8.0f, -18.25f, 0.0f, 1, 3, 1, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 8, 58, 6.0f, -18.25f, 0.0f, 1, 3, 1, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 4, 58, 1.0f, -19.25f, 0.0f, 1, 4, 1, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 0, 58, -3.0f, -19.25f, 0.0f, 1, 4, 1, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 8, 52, 6.0f, -15.5f, -1.0f, 1, 1, 3, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 8, 48, -1.0f, -15.5f, -1.0f, 1, 1, 3, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 4, 63, -1.0f, 4.0f, 0.0f, 1, 1, 1, 0.2f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 0, 63, -1.0f, -2.0f, 0.0f, 1, 1, 1, 0.2f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(0.0f, -23.0f, 1.75f);
        this.bone11.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, -0.7854f, 0.0f, 0.0f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 16, 34, -2.5f, -0.1161f, -1.8839f, 5, 2, 2, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(-4.5f, -30.0f, 0.3333f);
        this.bone11.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, -0.0873f, 0.1745f, 0.0f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 23, -3.0f, -1.5f, -0.3333f, 6, 4, 2, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 18, 38, -4.0434f, -2.5215f, -1.0881f, 1, 6, 2, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 12, 38, 2.9566f, -2.5215f, -1.0881f, 1, 6, 2, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 34, -3.0434f, 2.4785f, -1.0881f, 6, 1, 2, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 29, -3.0434f, -2.5215f, -1.0881f, 6, 1, 2, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(4.5f, -30.0f, 0.3333f);
        this.bone11.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, -0.0873f, -0.1745f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 14, 23, -3.0f, -1.5f, -0.3333f, 6, 4, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 6, 38, 3.0434f, -2.5215f, -1.0881f, 1, 6, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 38, -3.9566f, -2.5215f, -1.0881f, 1, 6, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 30, 29, -2.9566f, 2.4785f, -1.0881f, 6, 1, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 28, 23, -2.9566f, -2.5215f, -1.0881f, 6, 1, 2, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.25f, -2.0f, -3.75f);
        this.bone11.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, -0.9599f, 0.0f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 24, 38, -0.7266f, -5.3943f, -0.5f, 1, 9, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 16, 63, -0.7266f, 2.6057f, -0.5f, 1, 1, 1, 0.2f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(4.005f, -2.5f, 2.8335f);
        this.bone11.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.4538f, -0.192f, -1.0821f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 48, -0.9532f, -5.2887f, -0.5f, 1, 9, 1, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 8, 63, -0.9532f, 2.7113f, -0.5f, 1, 1, 1, 0.2f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-3.6515f, -2.5f, 2.6213f);
        this.bone11.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.4538f, 0.3316f, 1.0821f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 4, 48, -0.0468f, -5.2887f, -0.5f, 1, 9, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 12, 63, -0.0468f, 2.7113f, -0.5f, 1, 1, 1, 0.2f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone11.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


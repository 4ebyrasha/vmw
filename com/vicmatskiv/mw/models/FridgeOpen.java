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

public class FridgeOpen
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;

    public FridgeOpen() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, -9.5f, 0.0f);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, -0.2618f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 63, -7.0f, -0.3628f, -7.5f, 4, 2, 15, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, -9.5f, 0.0f);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, 0.2618f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 38, 46, 3.0f, -0.3628f, -7.5f, 4, 2, 15, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(-0.25f, -2.0f, -11.0f);
        this.setRotationAngle(this.bone3, 0.0f, -0.5236f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 26, 80, -4.7745f, -5.0f, -0.2745f, 12, 10, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 99, -3.7745f, -4.0f, -1.2745f, 1, 8, 1, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(3.5f, 13.0f, -15.0f);
        this.setRotationAngle(this.bone4, 0.0f, -1.2217f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 100, 94, -2.8103f, 0.5f, 1.0f, 10, 2, 2, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 100, 94, -2.8103f, -5.5f, 1.0f, 10, 2, 2, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 80, -3.75f, -9.0f, 0.0f, 12, 18, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 52, 80, -2.75f, -8.0f, -1.0f, 1, 16, 1, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 12, 99, -6.0f, -1.0f, 4.5f, 2, 1, 2, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 4, 105, -6.0f, -1.0f, -6.5f, 2, 1, 2, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -7.0f, -32.0f, -7.5f, 1, 31, 15, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 54, 103, -6.0f, -2.0f, -7.5f, 12, 1, 14, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 54, 103, -6.0f, -21.0f, -7.5f, 12, 1, 14, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 54, 103, -6.0f, -14.0f, -6.5f, 12, 1, 13, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 54, 103, -6.0f, -8.0f, -6.5f, 12, 1, 13, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 2, 111, -6.0f, -7.0f, -5.5f, 12, 5, 12, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 75, 6, -6.0f, -32.0f, 6.5f, 12, 31, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 96, 42, 6.0f, -32.0f, -7.5f, 1, 31, 15, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 46, -3.0f, -33.0353f, -7.5f, 6, 2, 15, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 4, 102, 4.0f, -1.0f, -6.5f, 2, 1, 2, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 4, 99, 4.0f, -1.0f, 4.5f, 2, 1, 2, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.func_78785_a(f5);
        this.bone2.func_78785_a(f5);
        this.bone3.func_78785_a(f5);
        this.bone4.func_78785_a(f5);
        this.bone5.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


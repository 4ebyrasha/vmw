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

public class UMP9Mag
extends ModelBase {
    private final ModelRenderer mag3;
    private final ModelRenderer mag;
    private final ModelRenderer mag2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;

    public UMP9Mag() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.mag3 = new ModelRenderer((ModelBase)this);
        this.mag3.func_78793_a(-2.0f, 24.0f, 0.0f);
        this.mag = new ModelRenderer((ModelBase)this);
        this.mag.func_78793_a(0.25f, -27.75f, -23.0f);
        this.mag3.func_78792_a(this.mag);
        this.setRotationAngle(this.mag, -0.1571f, 0.0f, 0.0f);
        this.mag.field_78804_l.add(new ModelBox(this.mag, 0, 0, -1.25f, -4.0f, 0.0f, 3, 4, 5, 0.0f, false));
        this.mag2 = new ModelRenderer((ModelBase)this);
        this.mag2.func_78793_a(0.25f, -26.95f, -18.0f);
        this.mag3.func_78792_a(this.mag2);
        this.setRotationAngle(this.mag2, -0.2443f, 0.0f, 0.0f);
        this.mag2.field_78804_l.add(new ModelBox(this.mag2, 33, 8, 0.9f, 0.0f, -2.0f, 1, 6, 2, 0.0f, false));
        this.mag2.field_78804_l.add(new ModelBox(this.mag2, 32, 23, 0.7f, 0.0476f, -3.431f, 1, 6, 2, 0.0f, false));
        this.mag2.field_78804_l.add(new ModelBox(this.mag2, 18, 31, -1.2f, 0.0476f, -3.431f, 1, 6, 2, 0.0f, false));
        this.mag2.field_78804_l.add(new ModelBox(this.mag2, 20, 23, -1.4f, 0.0f, -2.0f, 3, 6, 2, 0.0f, false));
        this.mag2.field_78804_l.add(new ModelBox(this.mag2, 0, 0, 0.9f, 5.15f, -4.1f, 1, 1, 1, 0.0f, false));
        this.mag2.field_78804_l.add(new ModelBox(this.mag2, 9, 10, -1.3f, 5.15f, -4.1f, 3, 1, 1, 0.0f, false));
        this.mag2.field_78804_l.add(new ModelBox(this.mag2, 12, 31, 0.9f, -0.0268f, -5.1f, 1, 6, 2, 0.0f, false));
        this.mag2.field_78804_l.add(new ModelBox(this.mag2, 12, 12, -1.3f, -0.0268f, -5.1f, 3, 6, 2, 0.0f, false));
        this.cube_r1 = new ModelRenderer((ModelBase)this);
        this.cube_r1.func_78793_a(0.1f, 5.9396f, -4.1f);
        this.mag2.func_78792_a(this.cube_r1);
        this.setRotationAngle(this.cube_r1, -0.2269f, 0.0f, 0.0f);
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 34, 34, -1.4f, 4.9104f, 2.0f, 3, 1, 2, 0.0f, false));
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 0, 18, -1.4f, -0.8896f, 2.0f, 3, 6, 2, 0.0f, false));
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 10, 23, -1.4f, 0.0f, -1.0f, 3, 6, 2, 0.0f, false));
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 11, 0, 0.8f, 4.9104f, 2.0f, 1, 1, 2, 0.0f, false));
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 0, 26, -1.3f, -0.4322f, 0.6618f, 1, 7, 2, 0.0f, false));
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 6, 29, 0.6001f, -0.4322f, 0.6618f, 1, 7, 2, 0.0f, false));
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 29, 15, 0.8f, -0.8896f, 2.0f, 1, 6, 2, 0.0f, false));
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 34, 31, -1.4f, 5.2104f, -1.0f, 3, 1, 2, 0.0f, false));
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 10, 20, 0.8f, 5.2104f, -1.0f, 1, 1, 2, 0.0f, false));
        this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 30, 0, 0.8f, 0.0f, -1.0f, 1, 6, 2, 0.0f, false));
        this.cube_r2 = new ModelRenderer((ModelBase)this);
        this.cube_r2.func_78793_a(-0.3f, 11.7354f, -5.4376f);
        this.mag2.func_78792_a(this.cube_r2);
        this.setRotationAngle(this.cube_r2, -0.4538f, 0.0f, 0.0f);
        this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 28, 29, 1.2f, -0.9352f, 1.8876f, 1, 6, 2, 0.0f, false));
        this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 22, 8, 1.2f, 0.0f, -1.0f, 1, 6, 3, 0.0f, false));
        this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 20, 0, -1.0f, -0.9352f, 1.8876f, 3, 6, 2, 0.0f, false));
        this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 0, 9, -1.0f, 0.0f, -1.0f, 3, 6, 3, 0.0f, false));
        this.cube_r3 = new ModelRenderer((ModelBase)this);
        this.cube_r3.func_78793_a(-0.1f, 17.5571f, -3.9861f);
        this.mag2.func_78792_a(this.cube_r3);
        this.setRotationAngle(this.cube_r3, -0.4538f, 0.0f, 0.0f);
        this.cube_r3.field_78804_l.add(new ModelBox(this.cube_r3, 11, 4, -1.2f, 0.3584f, -4.9604f, 2, 1, 5, 0.1f, false));
        this.cube_r3.field_78804_l.add(new ModelBox(this.cube_r3, 17, 17, 1.0f, 0.3584f, -4.9604f, 1, 1, 5, 0.1f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.mag3.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


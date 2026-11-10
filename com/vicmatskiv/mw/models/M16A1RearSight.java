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

public class M16A1RearSight
extends ModelBase {
    private final ModelRenderer bone24;
    private final ModelRenderer bone23_r1;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone4_r1;
    private final ModelRenderer bone5_r1;
    private final ModelRenderer bone5;
    private final ModelRenderer bone4;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone23;

    public M16A1RearSight() {
        this.field_78090_t = 16;
        this.field_78089_u = 16;
        this.bone24 = new ModelRenderer((ModelBase)this);
        this.bone24.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone24.field_78804_l.add(new ModelBox(this.bone24, 62, 0, -1.0f, -29.0f, -1.0f, 1, 5, 2, 0.0f, false));
        this.bone24.field_78804_l.add(new ModelBox(this.bone24, 10, 54, 2.0f, -29.0f, -1.0f, 1, 5, 2, 0.0f, false));
        this.bone24.field_78804_l.add(new ModelBox(this.bone24, 8, 36, 0.0f, -30.0f, -1.0f, 2, 1, 2, 0.0f, false));
        this.bone24.field_78804_l.add(new ModelBox(this.bone24, 21, 23, 0.0f, -27.0f, -1.0f, 2, 3, 2, 0.0f, false));
        this.bone23_r1 = new ModelRenderer((ModelBase)this);
        this.bone23_r1.func_78793_a(0.0f, -25.3f, 0.4f);
        this.bone24.func_78792_a(this.bone23_r1);
        this.setRotationAngle(this.bone23_r1, 0.384f, 0.0f, 0.0f);
        this.bone3_r1 = new ModelRenderer((ModelBase)this);
        this.bone3_r1.func_78793_a(2.0f, -26.0f, 0.0f);
        this.bone24.func_78792_a(this.bone3_r1);
        this.setRotationAngle(this.bone3_r1, 0.0f, 0.0f, 0.7854f);
        this.bone2_r1 = new ModelRenderer((ModelBase)this);
        this.bone2_r1.func_78793_a(0.0f, -26.0f, 0.0f);
        this.bone24.func_78792_a(this.bone2_r1);
        this.setRotationAngle(this.bone2_r1, 0.0f, 0.0f, 0.7854f);
        this.bone4_r1 = new ModelRenderer((ModelBase)this);
        this.bone4_r1.func_78793_a(2.3f, -28.3f, 0.0f);
        this.bone24.func_78792_a(this.bone4_r1);
        this.setRotationAngle(this.bone4_r1, 0.0f, 0.0f, 0.7854f);
        this.bone5_r1 = new ModelRenderer((ModelBase)this);
        this.bone5_r1.func_78793_a(-0.3f, -28.3f, 0.0f);
        this.bone24.func_78792_a(this.bone5_r1);
        this.setRotationAngle(this.bone5_r1, 0.0f, 0.0f, 0.7854f);
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(-0.3f, -28.3f, 0.0f);
        this.bone24.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, 0.7854f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 3, -1.0f, -1.0f, -0.99f, 1, 1, 2, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -1.0f, -1.4f, -1.01f, 1, 1, 2, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(2.3f, -28.3f, 0.0f);
        this.bone24.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, 0.7854f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 10, 23, -1.0f, -1.0f, -0.99f, 1, 1, 2, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 23, -1.4f, -1.0f, -1.01f, 1, 1, 2, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, -26.0f, 0.0f);
        this.bone24.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, 0.7854f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 10, 26, -1.4f, -1.0f, -1.01f, 1, 1, 2, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(2.0f, -26.0f, 0.0f);
        this.bone24.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.7854f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 26, -1.0f, -1.4f, -1.01f, 1, 1, 2, 0.0f, false));
        this.bone23 = new ModelRenderer((ModelBase)this);
        this.bone23.func_78793_a(0.0f, -25.3f, 0.4f);
        this.bone24.func_78792_a(this.bone23);
        this.setRotationAngle(this.bone23, 0.384f, 0.0f, 0.0f);
        this.bone23.field_78804_l.add(new ModelBox(this.bone23, 0, 35, -0.99f, -1.0f, 0.0f, 4, 2, 1, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone24.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


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

public class Shotgun12Gauge2
extends ModelBase {
    private final ModelRenderer Shape1;
    private final ModelRenderer Shape3;
    private final ModelRenderer Shape4;
    private final ModelRenderer Shape5;
    private final ModelRenderer Shape6;
    private final ModelRenderer Shape11;
    private final ModelRenderer Shape12;
    private final ModelRenderer Shape13;
    private final ModelRenderer Shape14;

    public Shotgun12Gauge2() {
        this.field_78090_t = 32;
        this.field_78089_u = 32;
        this.Shape1 = new ModelRenderer((ModelBase)this);
        this.Shape1.func_78793_a(0.0f, -5.0f, 0.0f);
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 0, 0.0f, 0.0f, 0.0f, 3, 9, 3, 0.0f, false));
        this.Shape3 = new ModelRenderer((ModelBase)this);
        this.Shape3.func_78793_a(0.5f, -5.0f, -0.2f);
        this.Shape3.field_78804_l.add(new ModelBox(this.Shape3, 16, 16, 0.0f, 0.0f, 0.0f, 2, 9, 1, 0.0f, false));
        this.Shape4 = new ModelRenderer((ModelBase)this);
        this.Shape4.func_78793_a(0.5f, -5.0f, 2.2f);
        this.Shape4.field_78804_l.add(new ModelBox(this.Shape4, 12, 0, 0.0f, 0.0f, 0.0f, 2, 9, 1, 0.0f, false));
        this.Shape5 = new ModelRenderer((ModelBase)this);
        this.Shape5.func_78793_a(-0.2f, -5.0f, 0.5f);
        this.Shape5.field_78804_l.add(new ModelBox(this.Shape5, 0, 12, 0.0f, 0.0f, 0.0f, 1, 9, 2, 0.0f, false));
        this.Shape6 = new ModelRenderer((ModelBase)this);
        this.Shape6.func_78793_a(2.2f, -5.0f, 0.5f);
        this.Shape6.field_78804_l.add(new ModelBox(this.Shape6, 10, 10, 0.0f, 0.0f, 0.0f, 1, 9, 2, 0.0f, false));
        this.Shape11 = new ModelRenderer((ModelBase)this);
        this.Shape11.func_78793_a(0.0f, 3.5f, -0.4f);
        this.Shape11.field_78804_l.add(new ModelBox(this.Shape11, 16, 11, 0.0f, 0.0f, 0.0f, 3, 1, 2, 0.0f, false));
        this.Shape12 = new ModelRenderer((ModelBase)this);
        this.Shape12.func_78793_a(0.0f, 3.5f, 2.4f);
        this.Shape12.field_78804_l.add(new ModelBox(this.Shape12, 16, 8, 0.0f, 0.0f, -1.0f, 3, 1, 2, 0.0f, false));
        this.Shape13 = new ModelRenderer((ModelBase)this);
        this.Shape13.func_78793_a(2.4f, 3.5f, 0.0f);
        this.Shape13.field_78804_l.add(new ModelBox(this.Shape13, 18, 4, 0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, false));
        this.Shape14 = new ModelRenderer((ModelBase)this);
        this.Shape14.func_78793_a(-0.4f, 3.5f, 0.0f);
        this.Shape14.field_78804_l.add(new ModelBox(this.Shape14, 18, 0, 0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Shape1.func_78785_a(f5);
        this.Shape3.func_78785_a(f5);
        this.Shape4.func_78785_a(f5);
        this.Shape5.func_78785_a(f5);
        this.Shape6.func_78785_a(f5);
        this.Shape11.func_78785_a(f5);
        this.Shape12.func_78785_a(f5);
        this.Shape13.func_78785_a(f5);
        this.Shape14.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


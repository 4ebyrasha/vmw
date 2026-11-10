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

public class GunCase
extends ModelBase {
    private final ModelRenderer Shape1;
    private final ModelRenderer Shape22;
    private final ModelRenderer Shape23;
    private final ModelRenderer Shape24;
    private final ModelRenderer Shape25;
    private final ModelRenderer Shape75Hatch;
    private final ModelRenderer Shape79Hatch;
    private final ModelRenderer Shape82Hatch;
    private final ModelRenderer Shape86Hatch;

    public GunCase() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.Shape1 = new ModelRenderer((ModelBase)this);
        this.Shape1.func_78793_a(-5.0f, 18.0f, -24.0f);
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 0, 0.0f, 0.0f, 0.0f, 14, 5, 60, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 91, 7, -1.0f, -0.01f, 1.0f, 16, 5, 58, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 65, -2.3f, -1.5f, 10.0f, 2, 3, 9, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 33, 42, -2.3f, -1.5f, 41.0f, 2, 3, 9, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 65, -1.0f, -3.1f, 0.45f, 16, 3, 59, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 13, -0.99f, -3.3f, 24.0f, 16, 1, 12, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 0, -0.99f, -3.3f, 9.0f, 16, 1, 12, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 26, -0.99f, -3.3f, 39.0f, 16, 1, 12, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 45, -0.99f, -3.3f, 54.0f, 16, 1, 5, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 39, -0.99f, -3.3f, 1.0f, 16, 1, 5, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 44, 13, 14.5f, -2.1f, 6.0f, 2, 5, 3, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 26, 14.5f, -2.1f, 21.0f, 2, 5, 3, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 13, 14.5f, -2.1f, 36.0f, 2, 5, 3, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 0, 14.5f, -2.1f, 51.0f, 2, 5, 3, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 46, 39, 6.0f, -2.1f, -1.5f, 3, 5, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 44, 26, 6.0f, -2.1f, 59.5f, 3, 5, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 53, 0, 16.0f, -1.1f, 9.5f, 1, 2, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 53, 53, 16.0f, -1.1f, 18.5f, 1, 2, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 50, 8, 16.0f, -1.1f, 39.5f, 1, 2, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 127, 15.0f, -1.1f, 1.0f, 1, 2, 58, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 44, 21, 16.0f, -1.1f, 48.5f, 1, 2, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 44, 8, 16.0f, -1.1f, 54.5f, 1, 2, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 55, 0.0f, -1.1f, 59.0f, 14, 2, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 51, 0.0f, -1.1f, -1.0f, 14, 2, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 92, 92, -2.0f, -1.1f, 1.0f, 1, 2, 58, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 44, 0, 16.0f, -1.1f, 3.5f, 1, 2, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 52, 31, 14.2f, 1.0f, 25.0f, 2, 3, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 52, 19, 14.2f, 1.0f, 33.0f, 2, 3, 2, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 36, 15.2f, 2.5f, 33.5f, 3, 1, 1, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 0, 34, 15.2f, 2.5f, 25.5f, 3, 1, 1, 0.0f, false));
        this.Shape1.field_78804_l.add(new ModelBox(this.Shape1, 44, 0, 17.5f, 2.5f, 26.5f, 1, 1, 7, 0.0f, false));
        this.Shape22 = new ModelRenderer((ModelBase)this);
        this.Shape22.func_78793_a(8.0f, 19.0f, -23.0f);
        this.setRotationAngle(this.Shape22, 0.0f, 0.6981f, 0.0f);
        this.Shape22.field_78804_l.add(new ModelBox(this.Shape22, 37, 45, 0.5f, 0.0f, 0.1f, 1, 4, 1, 0.0f, false));
        this.Shape23 = new ModelRenderer((ModelBase)this);
        this.Shape23.func_78793_a(-6.0f, 19.0f, 35.0f);
        this.setRotationAngle(this.Shape23, 0.0f, 0.6981f, 0.0f);
        this.Shape23.field_78804_l.add(new ModelBox(this.Shape23, 0, 45, -0.1f, 0.0f, 0.2f, 1, 4, 1, 0.0f, false));
        this.Shape24 = new ModelRenderer((ModelBase)this);
        this.Shape24.func_78793_a(-6.0f, 19.0f, -23.0f);
        this.setRotationAngle(this.Shape24, 0.0f, 0.6981f, 0.0f);
        this.Shape24.field_78804_l.add(new ModelBox(this.Shape24, 37, 39, 0.2f, 0.0f, -0.2f, 1, 4, 1, 0.0f, false));
        this.Shape25 = new ModelRenderer((ModelBase)this);
        this.Shape25.func_78793_a(8.0f, 19.0f, 35.0f);
        this.setRotationAngle(this.Shape25, 0.0f, 0.6981f, 0.0f);
        this.Shape25.field_78804_l.add(new ModelBox(this.Shape25, 0, 39, 0.3f, 0.0f, 0.4f, 1, 4, 1, 0.0f, false));
        this.Shape75Hatch = new ModelRenderer((ModelBase)this);
        this.Shape75Hatch.func_78793_a(8.0f, 16.9f, 35.0f);
        this.setRotationAngle(this.Shape75Hatch, 0.0f, 0.8203f, 0.0f);
        this.Shape75Hatch.field_78804_l.add(new ModelBox(this.Shape75Hatch, 0, 21, -0.8f, 0.0f, 0.1f, 3, 2, 2, 0.0f, false));
        this.Shape79Hatch = new ModelRenderer((ModelBase)this);
        this.Shape79Hatch.func_78793_a(-6.0f, 16.9f, 35.0f);
        this.setRotationAngle(this.Shape79Hatch, 0.0f, 0.7854f, 0.0f);
        this.Shape79Hatch.field_78804_l.add(new ModelBox(this.Shape79Hatch, 46, 46, -0.7f, 0.0f, -0.8f, 2, 2, 3, 0.0f, false));
        this.Shape82Hatch = new ModelRenderer((ModelBase)this);
        this.Shape82Hatch.func_78793_a(-6.0f, 16.9f, -23.0f);
        this.setRotationAngle(this.Shape82Hatch, 0.0f, 0.7679f, 0.0f);
        this.Shape82Hatch.field_78804_l.add(new ModelBox(this.Shape82Hatch, 0, 8, -0.8f, 0.0f, -0.7f, 3, 2, 2, 0.0f, false));
        this.Shape86Hatch = new ModelRenderer((ModelBase)this);
        this.Shape86Hatch.func_78793_a(8.0f, 16.9f, -23.0f);
        this.setRotationAngle(this.Shape86Hatch, 0.0f, 0.7505f, 0.0f);
        this.Shape86Hatch.field_78804_l.add(new ModelBox(this.Shape86Hatch, 44, 33, 0.1f, 0.0f, -0.9f, 2, 2, 3, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Shape1.func_78785_a(f5);
        this.Shape22.func_78785_a(f5);
        this.Shape23.func_78785_a(f5);
        this.Shape24.func_78785_a(f5);
        this.Shape25.func_78785_a(f5);
        this.Shape75Hatch.func_78785_a(f5);
        this.Shape79Hatch.func_78785_a(f5);
        this.Shape82Hatch.func_78785_a(f5);
        this.Shape86Hatch.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


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

public class Barrier
extends ModelBase {
    private final ModelRenderer bone3;
    private final ModelRenderer bone5;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;

    public Barrier() {
        this.field_78090_t = 90;
        this.field_78089_u = 90;
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(4.5f, 21.0f, 0.0f);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.6981f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 44, 44, -3.4421f, -0.8409f, -7.999f, 6, 3, 16, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(4.5f, 21.0f, 0.0f);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, -0.6981f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 40, 0, -9.4523f, -6.626f, -7.999f, 6, 3, 16, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(-2.7057f, 19.2234f, 0.0f);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, 0.0873f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 24, 24, -0.5019f, -9.0436f, -8.001f, 2, 12, 16, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(-3.0f, 27.75f, 13.0f);
        this.setRotationAngle(this.bone6, 0.0f, 0.0f, -0.0873f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 36, 4.6621f, -17.0285f, -21.001f, 2, 12, 16, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 38, 8, -7.0f, -2.0f, 4.0f, 5, 2, 4, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 24, 6, 2.0f, -2.0f, 4.0f, 5, 2, 4, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 38, 2, -7.0f, -2.0f, -8.0f, 5, 2, 4, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 29, 2.0f, -2.0f, -8.0f, 5, 2, 4, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 18, 29, -7.0f, -2.0f, -2.0f, 5, 2, 4, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 9, -7.0f, -2.0f, 2.0f, 5, 1, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 6, -7.0f, -2.0f, -4.0f, 5, 1, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 3, 2.0f, -2.0f, -4.0f, 5, 1, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, 2.0f, -2.0f, 2.0f, 5, 1, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 24, 0, 2.0f, -2.0f, -2.0f, 5, 2, 4, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, -2.0397f, -13.9737f, -8.01f, 4, 13, 16, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone3.func_78785_a(f5);
        this.bone5.func_78785_a(f5);
        this.bone4.func_78785_a(f5);
        this.bone6.func_78785_a(f5);
        this.bone7.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


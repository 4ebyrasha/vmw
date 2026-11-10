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

public class M4Iron2
extends ModelBase {
    private final ModelRenderer sight7;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;

    public M4Iron2() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.sight7 = new ModelRenderer((ModelBase)this);
        this.sight7.func_78793_a(-1.8f, -3.0f, 2.0f);
        this.setRotationAngle(this.sight7, -1.085f, 0.0f, 0.0f);
        this.sight7.field_78804_l.add(new ModelBox(this.sight7, 0, 0, 0.3f, -0.01f, 0.0f, 1, 1, 5, 0.0f, true));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(0.0f, 0.0f, 0.0f);
        this.sight7.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, -0.1396f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, 0.0f, 0.0f, 0.0f, 1, 1, 5, 0.0f, true));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(1.6f, 0.0f, 0.0f);
        this.sight7.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.1396f, 0.0f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -1.0f, 0.0f, 0.0f, 1, 1, 5, 0.0f, true));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.5f, -25.5f, 0.0f, 1, 5, 1, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.5f, -25.0f, 0.5f, 1, 1, 1, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.5f, -22.6f, 3.4f, 3, 3, 1, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.49f, -21.0f, -0.01f, 3, 1, 4, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.8f, -27.0f, 0.0f, 1, 1, 2, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.2f, -27.0f, 0.0f, 1, 1, 2, 0.0f, true));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-2.5f, 3.0f, 0.0f);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, 1.6842f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, -6.0f, -1.0f, -0.01f, 6, 1, 1, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, -6.0f, -1.0f, 0.99f, 2, 1, 1, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.5f, 3.0f, 0.0f);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, -1.6842f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, 0.0f, -1.0f, -0.01f, 6, 1, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, 4.0f, -1.0f, 0.99f, 2, 1, 1, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.sight7.func_78785_a(f5);
        this.bone.func_78785_a(f5);
        this.bone2.func_78785_a(f5);
        this.bone3.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


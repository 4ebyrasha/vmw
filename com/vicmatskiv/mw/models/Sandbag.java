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

public class Sandbag
extends ModelBase {
    private final ModelRenderer Sandbag;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone3;
    private final ModelRenderer bone;

    public Sandbag() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.Sandbag = new ModelRenderer((ModelBase)this);
        this.Sandbag.func_78793_a(0.0f, 24.0f, 0.0f);
        this.Sandbag.field_78804_l.add(new ModelBox(this.Sandbag, 0, 0, -8.0f, -4.9f, -4.5f, 16, 4, 8, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, -0.1222f, 0.0f, 0.0873f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 28, 30, 0.0396f, 0.0f, 0.0f, 8, 2, 4, -0.001f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.1222f, 0.0f, 0.0873f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 28, 18, 0.0396f, 0.0f, -4.0f, 8, 2, 4, -0.001f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.1222f, 0.0f, -0.0873f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 24, 12, -7.9604f, 0.0f, -4.0f, 8, 2, 4, -0.001f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, -0.1222f, 0.0f, -0.0873f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 24, 24, -7.9604f, 0.0f, 0.0f, 8, 2, 4, -0.001f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.1f, -8.0f, -1.0f);
        this.Sandbag.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.0873f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 22, -7.403f, 6.1725f, -3.5f, 8, 2, 8, -0.001f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, -7.0f, 0.0f);
        this.Sandbag.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, -0.0873f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 12, -0.6576f, 5.1672f, -4.5f, 8, 2, 8, -0.001f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Sandbag.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


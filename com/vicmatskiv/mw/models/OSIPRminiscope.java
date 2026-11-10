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

public class OSIPRminiscope
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone5;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;

    public OSIPRminiscope() {
        this.field_78090_t = 16;
        this.field_78089_u = 16;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 6.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.0f, -1.0f, 0.0f, 1, 8, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -9.0f, -1.0f, 0.0f, 1, 8, 3, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-8.0f, -1.0f, 0.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, -1.3614f, 0.0f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, -1.01f, 0.0f, 0.0f, 1, 10, 8, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 6.99f, 0.0f, 0.0f, 1, 10, 8, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.5f, 5.0f, -9.5f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.1396f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, -4.0f, -2.0f, 0.0f, 4, 4, 8, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(0.5f, 3.0f, -9.5f);
        this.bone.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.1222f, 0.0698f, 1.117f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -2.0f, 0.0f, 0.0f, 2, 2, 8, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(-9.5f, 5.0f, -9.5f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, -0.1396f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, 0.0f, -2.0f, 0.0f, 4, 4, 8, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(-9.5f, 3.0f, -9.5f);
        this.bone.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.1222f, -0.0698f, -1.117f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, 0.0f, 0.0f, 0.0f, 2, 2, 8, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(-2.5f, 1.0f, 3.5f);
        this.bone.func_78792_a(this.bone7);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, -3.5f, -1.0f, -8.0f, 3, 1, 9, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, -3.5f, 4.0f, -8.0f, 3, 1, 9, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, -5.0f, 0.5f, -8.0f, 1, 3, 9, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, 0.0f, 0.5f, -8.0f, 1, 3, 9, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(-0.5f, -1.0f, 0.0f);
        this.bone7.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.0f, 0.0f, -0.7854f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, -1.0f, 0.0f, -8.0f, 1, 2, 9, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, -4.1213f, -2.1213f, -8.0f, 2, 1, 9, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, -6.364f, 0.1213f, -8.0f, 1, 2, 9, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 0, -4.2426f, 3.2426f, -8.0f, 2, 1, 9, 0.0f, false));
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


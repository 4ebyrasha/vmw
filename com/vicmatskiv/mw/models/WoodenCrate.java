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

public class WoodenCrate
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;

    public WoodenCrate() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(7.0f, 16.0f, 0.0f);
        this.setRotationAngle(this.bone, -0.7854f, 0.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 20, -14.49f, -1.7071f, -9.7071f, 15, 2, 18, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(7.0f, 16.0f, 0.0f);
        this.setRotationAngle(this.bone2, 0.7854f, 0.0f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, -14.5f, -1.7071f, -8.2929f, 15, 2, 18, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.0f, 16.0f, -6.75f);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.7854f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 48, 20, -9.7071f, -1.7071f, -0.75f, 18, 2, 15, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(0.0f, 16.0f, -6.75f);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, -0.7854f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 48, 0, -8.2929f, -1.7071f, -0.76f, 18, 2, 15, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(0.0f, 9.0f, 0.0f);
        this.setRotationAngle(this.bone5, 0.0f, -0.7854f, 0.0f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 22, 70, -1.0f, -1.75f, -9.0f, 2, 2, 18, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(0.0f, 9.0f, 0.0f);
        this.setRotationAngle(this.bone6, 0.0f, 0.7854f, 0.0f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 68, -1.0f, -1.76f, -9.0f, 2, 2, 18, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 80, 37, -8.0f, -3.0f, -8.0f, 2, 3, 16, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 40, 52, -6.0f, -3.0f, -8.0f, 12, 2, 16, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 80, 60, -6.0f, -17.0f, -8.0f, 12, 2, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 80, 56, -6.0f, -17.0f, 6.0f, 12, 2, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 44, 70, -8.0f, -17.0f, -6.0f, 2, 2, 12, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 54, 37, 6.0f, -17.0f, -6.0f, 2, 2, 12, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, -8.0f, -17.0f, 6.0f, 2, 14, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 40, -7.0f, -16.0f, -7.0f, 14, 14, 14, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 8, 20, -8.0f, -17.0f, -8.0f, 2, 14, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 20, 6.0f, -17.0f, -8.0f, 2, 14, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 8, 0, 6.0f, -17.0f, 6.0f, 2, 14, 2, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 62, 70, 6.0f, -3.0f, -8.0f, 2, 3, 16, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 82, 82, -1.0f, -1.0f, -8.0f, 2, 1, 16, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.func_78785_a(f5);
        this.bone2.func_78785_a(f5);
        this.bone3.func_78785_a(f5);
        this.bone4.func_78785_a(f5);
        this.bone5.func_78785_a(f5);
        this.bone6.func_78785_a(f5);
        this.bone7.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


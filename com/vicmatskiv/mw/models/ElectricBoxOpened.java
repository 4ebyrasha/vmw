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

public class ElectricBoxOpened
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;

    public ElectricBoxOpened() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-7.0f, 7.0f, 0.5f);
        this.setRotationAngle(this.bone, 0.0f, 0.9599f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 20, 0, 3.2278f, -7.0f, 11.0093f, 8, 14, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 4, 74, 3.0136f, -6.5f, 11.1939f, 1, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 74, 3.0136f, 5.5f, 11.1939f, 1, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 24, 70, 9.3506f, -1.5f, 11.313f, 1, 3, 1, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, 20.5f, 7.0f);
        this.setRotationAngle(this.bone2, 0.0f, -0.7854f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 49, -0.5f, -6.5f, -1.0f, 1, 13, 2, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.0f, 20.5f, 7.0f);
        this.setRotationAngle(this.bone3, 0.0f, 0.7854f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 20, 34, -0.5f, -6.5f, -1.0f, 1, 13, 2, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(1.75f, 11.75f, 5.5f);
        this.setRotationAngle(this.bone4, 0.0f, -0.7854f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 18, 70, -0.7929f, -0.5f, -0.6464f, 2, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 70, -0.7929f, -2.5f, -0.6464f, 2, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 42, 67, -0.7929f, -8.5f, -0.6464f, 2, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 12, 72, -3.2678f, -2.5f, 1.8284f, 2, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 12, 70, -3.2678f, -4.5f, 1.8284f, 2, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 6, 72, -3.2678f, -6.5f, 1.8284f, 2, 1, 1, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(1.75f, 11.75f, 2.5f);
        this.setRotationAngle(this.bone5, 0.0f, 0.7854f, 0.0f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 6, 70, -3.4445f, -4.5f, 1.6517f, 2, 1, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 36, 67, -5.9194f, -0.5f, -0.8232f, 2, 1, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 30, 67, -5.9194f, -8.5f, -0.8232f, 2, 1, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 72, -3.4445f, -6.5f, 1.6517f, 2, 1, 1, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 18, 16, -5.0f, -24.0f, 4.0f, 1, 14, 4, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 28, 16, 4.0f, -24.0f, 4.0f, 1, 14, 4, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, -4.0f, -24.0f, 6.0f, 8, 14, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 16, -3.5f, -22.5f, 5.75f, 7, 11, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 20, 67, -3.25f, -12.75f, 5.5f, 3, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 40, 64, -3.25f, -14.75f, 5.5f, 3, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 20, 64, -3.25f, -16.75f, 5.5f, 3, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 64, -3.25f, -18.75f, 5.5f, 3, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 6, 52, -3.25f, -20.75f, 5.5f, 3, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 10, 67, 0.25f, -12.75f, 5.5f, 3, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 67, 0.25f, -14.75f, 5.5f, 3, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 30, 64, 0.25f, -16.75f, 5.5f, 3, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 10, 64, 0.25f, -18.75f, 5.5f, 3, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 6, 55, 0.25f, -20.75f, 5.5f, 3, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 6, 49, -1.5f, -22.25f, 5.5f, 3, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 37, -4.0f, -24.0f, 4.0f, 8, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 34, -4.0f, -11.0f, 4.0f, 8, 1, 2, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.func_78785_a(f5);
        this.bone2.func_78785_a(f5);
        this.bone3.func_78785_a(f5);
        this.bone4.func_78785_a(f5);
        this.bone5.func_78785_a(f5);
        this.bone6.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


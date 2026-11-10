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

public class GunCaseSmall
extends ModelBase {
    private final ModelRenderer Shape22;
    private final ModelRenderer Shape23;
    private final ModelRenderer Shape24;
    private final ModelRenderer Shape25;
    private final ModelRenderer Shape32Hatch;
    private final ModelRenderer Shape39Hatch;
    private final ModelRenderer Shape44Hatch;
    private final ModelRenderer Shape46Hatch;
    private final ModelRenderer Shape51Hatch;
    private final ModelRenderer bone;

    public GunCaseSmall() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.Shape22 = new ModelRenderer((ModelBase)this);
        this.Shape22.func_78793_a(9.0f, 18.0f, -15.0f);
        this.setRotationAngle(this.Shape22, 0.0f, -0.8203f, 0.0f);
        this.Shape22.field_78804_l.add(new ModelBox(this.Shape22, 52, 29, 1.0f, 0.0f, 4.8f, 1, 4, 1, 0.0f, false));
        this.Shape23 = new ModelRenderer((ModelBase)this);
        this.Shape23.func_78793_a(-11.0f, 18.0f, -10.0f);
        this.setRotationAngle(this.Shape23, 0.0f, 0.733f, 0.0f);
        this.Shape23.field_78804_l.add(new ModelBox(this.Shape23, 14, 52, 1.0f, 0.0f, 0.5f, 1, 4, 1, 0.0f, false));
        this.Shape24 = new ModelRenderer((ModelBase)this);
        this.Shape24.func_78793_a(4.0f, 18.0f, 10.0f);
        this.setRotationAngle(this.Shape24, 0.0f, 0.733f, 0.0f);
        this.Shape24.field_78804_l.add(new ModelBox(this.Shape24, 0, 52, 1.0f, 0.0f, 0.0f, 1, 4, 2, 0.0f, false));
        this.Shape25 = new ModelRenderer((ModelBase)this);
        this.Shape25.func_78793_a(-9.0f, 18.0f, 8.0f);
        this.setRotationAngle(this.Shape25, 0.0f, -0.8203f, 0.0f);
        this.Shape25.field_78804_l.add(new ModelBox(this.Shape25, 16, 10, 1.0f, 0.0f, 0.3f, 1, 4, 2, 0.0f, false));
        this.Shape32Hatch = new ModelRenderer((ModelBase)this);
        this.Shape32Hatch.func_78793_a(9.0f, 15.9f, -15.0f);
        this.setRotationAngle(this.Shape32Hatch, 0.0f, -0.8203f, 0.0f);
        this.Shape32Hatch.field_78804_l.add(new ModelBox(this.Shape32Hatch, 8, 40, 0.0f, 0.0f, 3.8f, 3, 2, 2, 0.0f, false));
        this.Shape39Hatch = new ModelRenderer((ModelBase)this);
        this.Shape39Hatch.func_78793_a(6.5f, 15.9f, -5.0f);
        this.Shape39Hatch.field_78804_l.add(new ModelBox(this.Shape39Hatch, 56, 0, 0.0f, 0.0f, -1.0f, 2, 2, 12, 0.0f, false));
        this.Shape44Hatch = new ModelRenderer((ModelBase)this);
        this.Shape44Hatch.func_78793_a(4.0f, 15.9f, 10.0f);
        this.setRotationAngle(this.Shape44Hatch, 0.0f, 0.733f, 0.0f);
        this.Shape44Hatch.field_78804_l.add(new ModelBox(this.Shape44Hatch, 0, 34, 0.0f, 0.0f, 1.0f, 3, 2, 2, 0.0f, false));
        this.Shape46Hatch = new ModelRenderer((ModelBase)this);
        this.Shape46Hatch.func_78793_a(-9.0f, 15.9f, 8.0f);
        this.setRotationAngle(this.Shape46Hatch, 0.0f, -0.8203f, 0.0f);
        this.Shape46Hatch.field_78804_l.add(new ModelBox(this.Shape46Hatch, 12, 25, 0.0f, 0.0f, 1.3f, 3, 2, 2, 0.0f, false));
        this.Shape51Hatch = new ModelRenderer((ModelBase)this);
        this.Shape51Hatch.func_78793_a(-11.0f, 15.9f, -10.0f);
        this.setRotationAngle(this.Shape51Hatch, 0.0f, 0.733f, 0.0f);
        this.Shape51Hatch.field_78804_l.add(new ModelBox(this.Shape51Hatch, 0, 18, 0.0f, 0.0f, -0.5f, 3, 2, 2, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 56, 14, -9.99f, -10.3f, -10.0f, 17, 1, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 56, 17, -9.99f, -10.3f, 8.0f, 17, 1, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 52, 25, -9.99f, -10.3f, -6.0f, 17, 1, 12, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 7.0f, -9.3f, 6.0f, 2, 6, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 11, 0, 7.0f, -9.3f, -8.0f, 2, 6, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 54, 38, -11.5f, -8.1f, -10.0f, 2, 2, 20, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 54, 60, -9.0f, -8.1f, -12.5f, 15, 2, 25, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -10.0f, -10.1f, -11.0f, 17, 3, 22, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 36, 6.5f, -8.1f, -10.0f, 3, 2, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 38, 6.5f, -8.1f, 8.0f, 3, 2, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 10, -12.0f, -8.5f, 4.0f, 2, 3, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 13, -12.0f, -8.5f, -8.0f, 2, 3, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 42, 6.7f, -5.8f, -1.0f, 2, 2, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 52, -10.0f, -7.01f, -10.0f, 17, 5, 20, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 25, -9.0f, -7.0f, -11.0f, 15, 5, 22, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 11.0f, -5.6f, -4.5f, 1, 1, 9, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 10, 8.0f, -5.6f, 4.0f, 3, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 10, 20, 8.0f, -5.6f, -5.0f, 3, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 6, 52, 6.5f, -6.0f, -9.0f, 3, 3, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 52, 25, 6.5f, -6.0f, 8.0f, 3, 3, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 25, 6.7f, -7.0f, 3.0f, 3, 4, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 9, 29, 6.7f, -7.0f, -6.0f, 3, 4, 3, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Shape22.func_78785_a(f5);
        this.Shape23.func_78785_a(f5);
        this.Shape24.func_78785_a(f5);
        this.Shape25.func_78785_a(f5);
        this.Shape32Hatch.func_78785_a(f5);
        this.Shape39Hatch.func_78785_a(f5);
        this.Shape44Hatch.func_78785_a(f5);
        this.Shape46Hatch.func_78785_a(f5);
        this.Shape51Hatch.func_78785_a(f5);
        this.bone.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


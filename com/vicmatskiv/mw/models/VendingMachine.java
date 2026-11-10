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

public class VendingMachine
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;

    public VendingMachine() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-1.0f, -19.5f, 5.5f);
        this.setRotationAngle(this.bone, -0.2618f, 0.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 48, 130, -6.0f, -0.7511f, -1.4014f, 14, 3, 10, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-1.0f, -19.5f, 5.5f);
        this.setRotationAngle(this.bone2, 0.2618f, 0.0f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 130, -6.0f, -3.5981f, -19.2238f, 14, 3, 10, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(-1.0f, -8.0f, 2.5f);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, -0.1745f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 104, 111, -3.0f, -1.0f, -8.5f, 9, 2, 17, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 52, 111, -4.9101f, 9.8329f, -8.5f, 9, 2, 17, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 111, -6.9939f, 21.6506f, -8.5f, 9, 2, 17, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, 5.0f, -42.0f, -6.0f, 2, 35, 17, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 62, 67, -7.0f, -42.0f, 11.0f, 14, 41, 3, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 56, 0, -7.0f, -42.0f, -14.0f, 14, 41, 8, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 74, 146, -8.0f, -29.0f, -13.0f, 1, 21, 6, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 36, 173, -6.0f, -40.0f, -6.0f, 0, 33, 17, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 67, -7.0f, -7.0f, -6.0f, 14, 6, 17, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 96, 67, -7.0f, -42.0f, -6.0f, 12, 2, 17, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 38, 146, -7.0f, -44.5882f, -4.3407f, 14, 3, 4, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 162, -7.0f, -44.5882f, -0.6593f, 14, 3, 5, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 178, -7.0f, -1.0f, 9.0f, 14, 1, 4, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 173, -7.0f, -1.0f, -13.0f, 14, 1, 4, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.func_78785_a(f5);
        this.bone2.func_78785_a(f5);
        this.bone3.func_78785_a(f5);
        this.bone4.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


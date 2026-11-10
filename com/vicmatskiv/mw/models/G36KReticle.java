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

public class G36KReticle
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;

    public G36KReticle() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 2, -1.0f, -72.0f, 0.0f, 1, 25, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 1, -79.0f, -79.0f, 0.0f, 72, 1, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 6.0f, -79.0f, 0.0f, 72, 1, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 2, 5, -2.0f, -76.0f, 0.0f, 3, 1, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 2, 2, -2.0f, -82.25f, 0.0f, 3, 1, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 6, 6, -4.12f, -80.12f, 0.0f, 1, 3, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 4, 6, 2.1f, -80.12f, 0.0f, 1, 3, 0, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-1.5f, -75.0f, 0.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, 0.7854f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 2, 4, -3.3536f, -0.6464f, 0.0f, 3, 1, 0, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 2, 6, -5.4749f, -4.7678f, 0.0f, 1, 3, 0, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 8, 8, 0.7678f, -4.7678f, 0.0f, 1, 3, 0, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 2, 3, -3.3536f, -6.8891f, 0.0f, 3, 1, 0, 0.0f, false));
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


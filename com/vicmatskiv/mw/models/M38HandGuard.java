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

public class M38HandGuard
extends ModelBase {
    private final ModelRenderer handguard19;
    private final ModelRenderer handguard26;
    private final ModelRenderer handguard33;
    private final ModelRenderer handguard40;
    private final ModelRenderer handguard43;
    private final ModelRenderer bone;
    private final ModelRenderer handguard10;

    public M38HandGuard() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.handguard19 = new ModelRenderer((ModelBase)this);
        this.handguard19.func_78793_a(0.7f, -14.4f, -48.7f);
        this.setRotationAngle(this.handguard19, 0.0f, 0.0f, 0.7436f);
        this.handguard19.field_78804_l.add(new ModelBox(this.handguard19, 0, 0, -1.9f, 0.0f, 0.0f, 1, 1, 18, 0.0f, true));
        this.handguard19.field_78804_l.add(new ModelBox(this.handguard19, 0, 0, -0.4f, 0.0f, 0.0f, 1, 1, 18, 0.0f, true));
        this.handguard19.field_78804_l.add(new ModelBox(this.handguard19, 0, 0, -2.0f, 0.0f, 18.0f, 2, 1, 8, 0.0f, true));
        this.handguard19.field_78804_l.add(new ModelBox(this.handguard19, 0, 0, -1.0f, 0.0f, 15.0f, 1, 1, 1, 0.0f, true));
        this.handguard19.field_78804_l.add(new ModelBox(this.handguard19, 0, 0, -1.0f, 0.0f, 11.0f, 1, 1, 1, 0.0f, true));
        this.handguard19.field_78804_l.add(new ModelBox(this.handguard19, 0, 0, -1.0f, 0.0f, 7.0f, 1, 1, 1, 0.0f, true));
        this.handguard19.field_78804_l.add(new ModelBox(this.handguard19, 0, 0, -1.0f, 0.0f, 3.0f, 1, 1, 1, 0.0f, true));
        this.handguard19.field_78804_l.add(new ModelBox(this.handguard19, 0, 0, -2.0f, 0.0f, -2.0f, 2, 1, 2, 0.0f, true));
        this.handguard26 = new ModelRenderer((ModelBase)this);
        this.handguard26.func_78793_a(-3.7f, -14.4f, -48.7f);
        this.setRotationAngle(this.handguard26, 0.0f, 0.0f, -0.7436f);
        this.handguard26.field_78804_l.add(new ModelBox(this.handguard26, 0, 0, -0.6f, 0.0f, 0.0f, 1, 1, 18, 0.0f, true));
        this.handguard26.field_78804_l.add(new ModelBox(this.handguard26, 0, 0, 0.9f, 0.0f, 0.0f, 1, 1, 18, 0.0f, true));
        this.handguard26.field_78804_l.add(new ModelBox(this.handguard26, 0, 0, 0.0f, 0.0f, 18.0f, 2, 1, 8, 0.0f, true));
        this.handguard26.field_78804_l.add(new ModelBox(this.handguard26, 0, 0, 0.0f, 0.0f, 15.0f, 1, 1, 1, 0.0f, true));
        this.handguard26.field_78804_l.add(new ModelBox(this.handguard26, 0, 0, 0.0f, 0.0f, 11.0f, 1, 1, 1, 0.0f, true));
        this.handguard26.field_78804_l.add(new ModelBox(this.handguard26, 0, 0, 0.0f, 0.0f, 7.0f, 1, 1, 1, 0.0f, true));
        this.handguard26.field_78804_l.add(new ModelBox(this.handguard26, 0, 0, 0.0f, 0.0f, 3.0f, 1, 1, 1, 0.0f, true));
        this.handguard26.field_78804_l.add(new ModelBox(this.handguard26, 0, 0, 0.0f, 0.0f, -2.0f, 2, 1, 2, 0.0f, true));
        this.handguard33 = new ModelRenderer((ModelBase)this);
        this.handguard33.func_78793_a(-3.7f, -12.5f, -48.7f);
        this.setRotationAngle(this.handguard33, 0.0f, 0.0f, 0.6692f);
        this.handguard33.field_78804_l.add(new ModelBox(this.handguard33, 0, 0, 0.9f, -1.0f, 0.0f, 1, 1, 18, 0.0f, true));
        this.handguard33.field_78804_l.add(new ModelBox(this.handguard33, 0, 0, -0.6f, -1.0f, 0.0f, 1, 1, 18, 0.0f, true));
        this.handguard33.field_78804_l.add(new ModelBox(this.handguard33, 0, 0, 0.0f, -1.0f, 18.0f, 2, 1, 8, 0.0f, true));
        this.handguard33.field_78804_l.add(new ModelBox(this.handguard33, 0, 0, 0.0f, -1.0f, 15.0f, 1, 1, 1, 0.0f, true));
        this.handguard33.field_78804_l.add(new ModelBox(this.handguard33, 0, 0, 0.0f, -1.0f, 11.0f, 1, 1, 1, 0.0f, true));
        this.handguard33.field_78804_l.add(new ModelBox(this.handguard33, 0, 0, 0.0f, -1.0f, 7.0f, 1, 1, 1, 0.0f, true));
        this.handguard33.field_78804_l.add(new ModelBox(this.handguard33, 0, 0, 0.0f, -1.0f, 3.0f, 1, 1, 1, 0.0f, true));
        this.handguard33.field_78804_l.add(new ModelBox(this.handguard33, 0, 0, 0.0f, -1.0f, -2.0f, 2, 1, 2, 0.0f, true));
        this.handguard40 = new ModelRenderer((ModelBase)this);
        this.handguard40.func_78793_a(0.7f, -12.5f, -48.7f);
        this.setRotationAngle(this.handguard40, 0.0f, 0.0f, -0.6692f);
        this.handguard40.field_78804_l.add(new ModelBox(this.handguard40, 0, 0, -1.9f, -1.0f, 0.0f, 1, 1, 18, 0.0f, true));
        this.handguard40.field_78804_l.add(new ModelBox(this.handguard40, 0, 0, -0.4f, -1.0f, 0.0f, 1, 1, 18, 0.0f, true));
        this.handguard40.field_78804_l.add(new ModelBox(this.handguard40, 0, 0, -2.0f, -1.0f, 18.0f, 2, 1, 8, 0.0f, true));
        this.handguard40.field_78804_l.add(new ModelBox(this.handguard40, 0, 0, -1.0f, -1.0f, 15.0f, 1, 1, 1, 0.0f, true));
        this.handguard40.field_78804_l.add(new ModelBox(this.handguard40, 0, 0, -1.0f, -1.0f, 11.0f, 1, 1, 1, 0.0f, true));
        this.handguard40.field_78804_l.add(new ModelBox(this.handguard40, 0, 0, -1.0f, -1.0f, 7.0f, 1, 1, 1, 0.0f, true));
        this.handguard40.field_78804_l.add(new ModelBox(this.handguard40, 0, 0, -1.0f, -1.0f, 3.0f, 1, 1, 1, 0.0f, true));
        this.handguard40.field_78804_l.add(new ModelBox(this.handguard40, 0, 0, -2.0f, -1.0f, -2.0f, 2, 1, 2, 0.0f, true));
        this.handguard43 = new ModelRenderer((ModelBase)this);
        this.handguard43.func_78793_a(-3.7f, -12.3f, -27.3f);
        this.setRotationAngle(this.handguard43, 0.2603f, 0.0f, 0.0f);
        this.handguard43.field_78804_l.add(new ModelBox(this.handguard43, 0, 0, 0.1f, 0.0f, 0.0f, 1, 1, 1, 0.0f, true));
        this.handguard43.field_78804_l.add(new ModelBox(this.handguard43, 0, 0, 3.3f, 0.0f, 0.0f, 1, 1, 1, 0.0f, true));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -3.5f, -37.2f, -27.7f, 4, 2, 2, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 0.0f, -38.4f, -50.7f, 1, 2, 28, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.3f, -36.2f, -50.7f, 2, 1, 28, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.7f, -39.8f, -50.7f, 1, 1, 28, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.3f, -39.8f, -50.7f, 2, 1, 28, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.5f, -35.9f, -50.7f, 2, 1, 28, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.5f, -40.1f, -50.7f, 2, 1, 28, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -4.0f, -38.4f, -50.7f, 1, 2, 28, 0.0f, true));
        this.handguard10 = new ModelRenderer((ModelBase)this);
        this.handguard10.func_78793_a(-2.7f, -36.2f, -50.7f);
        this.bone.func_78792_a(this.handguard10);
        this.handguard10.field_78804_l.add(new ModelBox(this.handguard10, 0, 0, 0.0f, 0.0f, 0.0f, 1, 1, 28, 0.0f, true));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.handguard19.func_78785_a(f5);
        this.handguard26.func_78785_a(f5);
        this.handguard33.func_78785_a(f5);
        this.handguard40.func_78785_a(f5);
        this.handguard43.func_78785_a(f5);
        this.bone.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


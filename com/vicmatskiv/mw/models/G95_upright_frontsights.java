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

public class G95_upright_frontsights
extends ModelBase {
    private final ModelRenderer sight1;
    private final ModelRenderer sight2;
    private final ModelRenderer sight3;
    private final ModelRenderer sight4;
    private final ModelRenderer sight5;
    private final ModelRenderer sight6;
    private final ModelRenderer sight7;
    private final ModelRenderer sight8;
    private final ModelRenderer sight9;
    private final ModelRenderer sight13;
    private final ModelRenderer sight14;
    private final ModelRenderer sight15;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;

    public G95_upright_frontsights() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.sight1 = new ModelRenderer((ModelBase)this);
        this.sight1.func_78793_a(5.0f, 8.0f, -9.0f);
        this.sight1.field_78804_l.add(new ModelBox(this.sight1, 0, 0, 0.0f, 0.0f, 0.0f, 2, 4, 17, 0.0f, true));
        this.sight2 = new ModelRenderer((ModelBase)this);
        this.sight2.func_78793_a(-4.0f, 8.0f, -9.0f);
        this.sight2.field_78804_l.add(new ModelBox(this.sight2, 0, 0, 0.0f, 0.0f, 0.0f, 2, 4, 17, 0.0f, true));
        this.sight3 = new ModelRenderer((ModelBase)this);
        this.sight3.func_78793_a(5.0f, 7.0f, -9.0f);
        this.sight3.field_78804_l.add(new ModelBox(this.sight3, 0, 0, 0.0f, 0.0f, 0.0f, 2, 1, 7, 0.0f, true));
        this.sight4 = new ModelRenderer((ModelBase)this);
        this.sight4.func_78793_a(-4.0f, 7.0f, -9.0f);
        this.sight4.field_78804_l.add(new ModelBox(this.sight4, 0, 0, 0.0f, 0.0f, 0.0f, 2, 1, 7, 0.0f, true));
        this.sight5 = new ModelRenderer((ModelBase)this);
        this.sight5.func_78793_a(-4.0f, 7.5f, -11.0f);
        this.sight5.field_78804_l.add(new ModelBox(this.sight5, 0, 0, 0.0f, 0.0f, 0.0f, 11, 5, 2, 0.0f, true));
        this.sight6 = new ModelRenderer((ModelBase)this);
        this.sight6.func_78793_a(-4.0f, 8.5f, -16.0f);
        this.sight6.field_78804_l.add(new ModelBox(this.sight6, 0, 0, 0.0f, 0.0f, 0.0f, 11, 4, 5, 0.0f, true));
        this.sight7 = new ModelRenderer((ModelBase)this);
        this.sight7.func_78793_a(-4.0f, 7.5f, -11.0f);
        this.setRotationAngle(this.sight7, -1.3756f, 0.0f, 0.0f);
        this.sight7.field_78804_l.add(new ModelBox(this.sight7, 0, 0, 0.0f, 0.0f, 0.0f, 11, 5, 1, 0.0f, true));
        this.sight8 = new ModelRenderer((ModelBase)this);
        this.sight8.func_78793_a(-2.0f, 6.5f, -7.0f);
        this.setRotationAngle(this.sight8, -0.409f, 0.0f, 0.0f);
        this.sight8.field_78804_l.add(new ModelBox(this.sight8, 0, 0, 0.0f, 0.0f, 0.0f, 7, 4, 4, 0.0f, true));
        this.sight9 = new ModelRenderer((ModelBase)this);
        this.sight9.func_78793_a(0.0f, 7.0f, -7.0f);
        this.sight9.field_78804_l.add(new ModelBox(this.sight9, 0, 0, 0.0f, -8.0f, 0.0f, 3, 11, 3, 0.0f, true));
        this.sight13 = new ModelRenderer((ModelBase)this);
        this.sight13.func_78793_a(-6.0f, 8.5f, -13.0f);
        this.setRotationAngle(this.sight13, -0.5577f, 0.0f, 0.0f);
        this.sight13.field_78804_l.add(new ModelBox(this.sight13, 0, 0, 0.0f, 0.0f, 0.0f, 15, 3, 3, 0.0f, true));
        this.sight14 = new ModelRenderer((ModelBase)this);
        this.sight14.func_78793_a(-4.5f, 7.5f, -6.0f);
        this.setRotationAngle(this.sight14, -0.5577f, 0.0f, 0.0f);
        this.sight14.field_78804_l.add(new ModelBox(this.sight14, 0, 0, 0.0f, 0.0f, 0.0f, 12, 2, 2, 0.0f, true));
        this.sight15 = new ModelRenderer((ModelBase)this);
        this.sight15.func_78793_a(-2.0f, 9.5f, -9.0f);
        this.sight15.field_78804_l.add(new ModelBox(this.sight15, 0, 0, 0.0f, 0.0f, 0.0f, 7, 2, 16, 0.0f, true));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(2.0f, -1.0f, -6.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.0f, -2.0f, 0.0f, 1, 2, 1, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-2.0f, 0.5f, 0.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.4014f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 0.0f, -3.0f, -1.0f, 1, 3, 3, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(1.0f, 0.5f, 0.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.4014f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, -1.0f, -3.0f, -1.0f, 1, 3, 3, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.sight1.func_78785_a(f5);
        this.sight2.func_78785_a(f5);
        this.sight3.func_78785_a(f5);
        this.sight4.func_78785_a(f5);
        this.sight5.func_78785_a(f5);
        this.sight6.func_78785_a(f5);
        this.sight7.func_78785_a(f5);
        this.sight8.func_78785_a(f5);
        this.sight9.func_78785_a(f5);
        this.sight13.func_78785_a(f5);
        this.sight14.func_78785_a(f5);
        this.sight15.func_78785_a(f5);
        this.bone.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


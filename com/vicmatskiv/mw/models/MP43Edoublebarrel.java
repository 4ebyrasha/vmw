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

public class MP43Edoublebarrel
extends ModelBase {
    private final ModelRenderer Barrel1;
    private final ModelRenderer Barrel4;
    private final ModelRenderer Barrel5;
    private final ModelRenderer Barrel6;
    private final ModelRenderer Barrel7;
    private final ModelRenderer Barrel8;
    private final ModelRenderer Barrel9;
    private final ModelRenderer Barrel10;
    private final ModelRenderer Barrel12;
    private final ModelRenderer Barrel13;
    private final ModelRenderer Barrel14;
    private final ModelRenderer Barrel22;
    private final ModelRenderer Barrel25;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;

    public MP43Edoublebarrel() {
        this.field_78090_t = 470;
        this.field_78089_u = 470;
        this.Barrel1 = new ModelRenderer((ModelBase)this);
        this.Barrel1.func_78793_a(-1.5f, -8.0f, -77.0f);
        this.Barrel1.field_78804_l.add(new ModelBox(this.Barrel1, 0, 0, 0.0f, 1.0f, 0.0f, 1, 2, 79, 0.0f, false));
        this.Barrel4 = new ModelRenderer((ModelBase)this);
        this.Barrel4.func_78793_a(-3.0f, -3.0f, -6.0f);
        this.setRotationAngle(this.Barrel4, 3.0858f, 0.0f, 0.0f);
        this.Barrel4.field_78804_l.add(new ModelBox(this.Barrel4, 0, 0, -0.001f, 0.0f, 0.0f, 4, 1, 4, 0.0f, false));
        this.Barrel5 = new ModelRenderer((ModelBase)this);
        this.Barrel5.func_78793_a(1.0f, -4.8f, -5.9f);
        this.setRotationAngle(this.Barrel5, 0.0f, -1.7474f, 0.0f);
        this.Barrel5.field_78804_l.add(new ModelBox(this.Barrel5, 12, 0, 0.0f, 0.0f, 0.0f, 2, 3, 1, 0.0f, false));
        this.Barrel6 = new ModelRenderer((ModelBase)this);
        this.Barrel6.func_78793_a(-3.0f, -4.8f, -5.9f);
        this.setRotationAngle(this.Barrel6, 0.0f, 0.1859f, 0.0f);
        this.Barrel6.field_78804_l.add(new ModelBox(this.Barrel6, 0, 10, 0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f, false));
        this.Barrel7 = new ModelRenderer((ModelBase)this);
        this.Barrel7.func_78793_a(-3.0f, -2.6f, -6.0f);
        this.setRotationAngle(this.Barrel7, 3.0858f, 0.0f, 0.0f);
        this.Barrel7.field_78804_l.add(new ModelBox(this.Barrel7, 0, 81, 0.001f, 0.0f, 0.0f, 4, 1, 22, 0.0f, false));
        this.Barrel8 = new ModelRenderer((ModelBase)this);
        this.Barrel8.func_78793_a(1.0f, -4.8f, -30.9f);
        this.setRotationAngle(this.Barrel8, 0.0f, 0.0f, 2.3562f);
        this.Barrel8.field_78804_l.add(new ModelBox(this.Barrel8, 27, 53, 0.0f, 0.0f, 0.0f, 1, 1, 25, 0.0f, false));
        this.Barrel9 = new ModelRenderer((ModelBase)this);
        this.Barrel9.func_78793_a(-3.0f, -4.8f, -30.9f);
        this.setRotationAngle(this.Barrel9, 0.0f, 0.0f, -0.7854f);
        this.Barrel9.field_78804_l.add(new ModelBox(this.Barrel9, 0, 52, 0.0f, 0.0f, 0.0f, 1, 1, 25, 0.0f, false));
        this.Barrel10 = new ModelRenderer((ModelBase)this);
        this.Barrel10.func_78793_a(-3.0f, -4.8f, -30.9f);
        this.setRotationAngle(this.Barrel10, -0.7808f, 0.0f, 0.0f);
        this.Barrel10.field_78804_l.add(new ModelBox(this.Barrel10, 0, 8, 0.001f, 0.0f, 0.0f, 4, 1, 1, 0.0f, false));
        this.Barrel12 = new ModelRenderer((ModelBase)this);
        this.Barrel12.func_78793_a(-3.0f, -1.6f, -6.0f);
        this.setRotationAngle(this.Barrel12, 3.0858f, 0.0f, 0.0f);
        this.Barrel12.field_78804_l.add(new ModelBox(this.Barrel12, 0, 0, -0.001f, 0.0f, 0.0f, 4, 1, 25, 0.0f, false));
        this.Barrel13 = new ModelRenderer((ModelBase)this);
        this.Barrel13.func_78793_a(-0.3f, -1.8f, -4.0f);
        this.setRotationAngle(this.Barrel13, -3.0486f, 0.0f, 0.0f);
        this.Barrel13.field_78804_l.add(new ModelBox(this.Barrel13, 8, 8, 0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f, false));
        this.Barrel14 = new ModelRenderer((ModelBase)this);
        this.Barrel14.func_78793_a(-2.7f, -1.8f, -4.0f);
        this.setRotationAngle(this.Barrel14, -3.0486f, 0.0f, 0.0f);
        this.Barrel14.field_78804_l.add(new ModelBox(this.Barrel14, 0, 5, 0.0f, 0.0f, 0.0f, 3, 1, 2, 0.0f, false));
        this.Barrel22 = new ModelRenderer((ModelBase)this);
        this.Barrel22.func_78793_a(1.5f, -6.6f, -77.0f);
        this.setRotationAngle(this.Barrel22, 0.0f, 0.0f, 2.3562f);
        this.Barrel22.field_78804_l.add(new ModelBox(this.Barrel22, 0, 321, 0.0f, 0.0f, -0.01f, 1, 1, 79, 0.0f, false));
        this.Barrel22.field_78804_l.add(new ModelBox(this.Barrel22, 162, 240, 2.5456f, 2.5456f, -0.01f, 1, 1, 79, 0.0f, false));
        this.Barrel22.field_78804_l.add(new ModelBox(this.Barrel22, 162, 0, 2.12f, 2.5456f, -0.01f, 1, 1, 79, 0.0f, false));
        this.Barrel22.field_78804_l.add(new ModelBox(this.Barrel22, 162, 160, 3.2527f, 1.8385f, -0.01f, 1, 1, 79, 0.0f, false));
        this.Barrel22.field_78804_l.add(new ModelBox(this.Barrel22, 162, 80, 3.253f, 1.42f, -0.011f, 1, 1, 79, 0.0f, false));
        this.Barrel22.field_78804_l.add(new ModelBox(this.Barrel22, 0, 161, 2.5459f, 0.7129f, -0.011f, 1, 1, 79, 0.0f, false));
        this.Barrel22.field_78804_l.add(new ModelBox(this.Barrel22, 81, 82, 1.8388f, 0.0058f, -0.011f, 1, 1, 79, 0.0f, false));
        this.Barrel22.field_78804_l.add(new ModelBox(this.Barrel22, 0, 241, 0.7071f, -0.7071f, -0.01f, 1, 1, 79, 0.0f, false));
        this.Barrel22.field_78804_l.add(new ModelBox(this.Barrel22, 81, 162, 1.12f, -0.708f, -0.011f, 1, 1, 79, 0.0f, false));
        this.Barrel22.field_78804_l.add(new ModelBox(this.Barrel22, 81, 242, 0.001f, 0.42f, -0.011f, 1, 1, 79, 0.0f, false));
        this.Barrel25 = new ModelRenderer((ModelBase)this);
        this.Barrel25.func_78793_a(-2.5f, -7.6f, -77.0f);
        this.Barrel25.field_78804_l.add(new ModelBox(this.Barrel25, 243, 161, 0.0f, 0.0f, 0.0f, 1, 1, 79, 0.0f, false));
        this.Barrel25.field_78804_l.add(new ModelBox(this.Barrel25, 243, 81, 0.0f, 2.0f, 0.0f, 1, 1, 79, 0.0f, false));
        this.Barrel25.field_78804_l.add(new ModelBox(this.Barrel25, 243, 1, 2.0f, 2.0f, 0.0f, 1, 1, 79, 0.0f, false));
        this.Barrel25.field_78804_l.add(new ModelBox(this.Barrel25, 243, 243, -1.0f, 1.0f, 0.0f, 1, 1, 79, 0.0f, false));
        this.Barrel25.field_78804_l.add(new ModelBox(this.Barrel25, 162, 320, 3.0f, 1.0f, 0.0f, 1, 1, 79, 0.0f, false));
        this.Barrel25.field_78804_l.add(new ModelBox(this.Barrel25, 81, 322, 2.0f, 0.0f, 0.0f, 1, 1, 79, 0.0f, false));
        this.Barrel25.field_78804_l.add(new ModelBox(this.Barrel25, 0, 26, -0.5f, 2.8f, 46.1f, 4, 1, 25, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-0.5f, -7.9f, 1.0f);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, -0.1745f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 81, 2, -0.9609f, -0.0921f, -78.001f, 1, 1, 79, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-1.5f, -7.9f, 1.0f);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, 0.1745f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 81, -0.0391f, -0.0921f, -77.999f, 1, 1, 79, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Barrel1.func_78785_a(f5);
        this.Barrel4.func_78785_a(f5);
        this.Barrel5.func_78785_a(f5);
        this.Barrel6.func_78785_a(f5);
        this.Barrel7.func_78785_a(f5);
        this.Barrel8.func_78785_a(f5);
        this.Barrel9.func_78785_a(f5);
        this.Barrel10.func_78785_a(f5);
        this.Barrel12.func_78785_a(f5);
        this.Barrel13.func_78785_a(f5);
        this.Barrel14.func_78785_a(f5);
        this.Barrel22.func_78785_a(f5);
        this.Barrel25.func_78785_a(f5);
        this.bone.func_78785_a(f5);
        this.bone2.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


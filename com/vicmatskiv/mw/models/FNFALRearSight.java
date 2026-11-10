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

public class FNFALRearSight
extends ModelBase {
    private final ModelRenderer sight17;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;

    public FNFALRearSight() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.sight17 = new ModelRenderer((ModelBase)this);
        this.sight17.func_78793_a(0.0f, 5.3f, 0.8f);
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -0.5f, -8.05f, -1.5f, 4, 7, 2, 0.0f, true));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, 2.5f, -10.05f, -1.5f, 1, 2, 2, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -0.5f, -10.05f, -1.5f, 1, 2, 2, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, 0.5f, -11.05f, -1.5f, 2, 1, 2, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(3.3f, -7.1f, -1.45f);
        this.sight17.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, -0.1047f, -0.0698f, -0.576f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -1.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(-0.3f, -7.1f, -1.45f);
        this.sight17.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, -0.1047f, 0.0698f, 0.576f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, 0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-1.0f, -3.25f, -0.75f);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.7854f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 0.0f, 0.7071f, 0.049f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 1.4142f, -0.7071f, 0.049f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 1.8f, -0.7071f, 0.051f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 3.2426f, 1.1213f, 0.049f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 3.2426f, 0.75f, 0.051f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 1.8284f, 2.5355f, 0.049f, 1, 1, 2, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-0.5f, -0.3f, -0.85f);
        this.setRotationAngle(this.bone, -0.1396f, 0.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.0f, 0.0f, 0.0f, 6, 6, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.0f, 2.0f, 4.0f, 6, 4, 3, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(-1.0f, 2.0f, 7.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.9774f, 0.0f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, -0.001f, -3.0f, -2.0f, 6, 3, 2, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, 0.001f, -3.6f, -1.999f, 6, 1, 2, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(5.5f, 3.2f, 0.8f);
        this.setRotationAngle(this.bone4, -0.7854f, 0.0f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, -9.0f, -3.0f, 0.0f, 9, 3, 3, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, -8.0f, -3.3536f, -0.6464f, 1, 4, 4, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.sight17.func_78785_a(f5);
        this.bone2.func_78785_a(f5);
        this.bone.func_78785_a(f5);
        this.bone4.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


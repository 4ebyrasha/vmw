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

public class PropaneTank
extends ModelBase {
    private final ModelRenderer bone5;
    private final ModelRenderer bone4;
    private final ModelRenderer bone3;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;

    public PropaneTank() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(-0.25f, 22.0f, -7.75f);
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(0.0f, 0.0f, 0.0f);
        this.bone5.func_78792_a(this.bone4);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 98, -2.25f, -18.0f, 12.8211f, 5, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 94, -2.25f, -22.0f, 12.8211f, 5, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 12, 98, -2.25f, -18.0f, 1.75f, 4, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 12, 94, -2.25f, -22.0f, 1.75f, 4, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 36, 68, -3.2929f, -16.0f, -0.7071f, 7, 17, 2, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 18, 68, -3.2929f, -16.0f, 14.1924f, 7, 17, 2, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.25f, 1.5f, 3.25f);
        this.bone5.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, -2.3562f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 62, 91, 0.7071f, -20.5f, -9.2426f, 5, 2, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 12, 102, 0.7071f, -21.5f, -9.2426f, 1, 1, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 12, 100, 4.7071f, -21.5f, -9.2426f, 1, 1, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 38, 91, 0.7071f, -23.5f, -9.2426f, 5, 2, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 50, 91, 0.7071f, -20.5f, 1.8284f, 5, 2, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 87, 1.5303f, -19.5f, -4.7626f, 3, 1, 3, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 54, 68, 1.5303f, -22.75f, -4.7626f, 3, 1, 3, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 100, 2.5303f, -21.5f, -3.7626f, 1, 3, 1, 0.5f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 43, 96, 0.5303f, -20.5f, -3.7626f, 3, 0, 1, 0.3f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 4, 102, 4.7071f, -21.5f, 1.8284f, 1, 1, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 4, 100, 0.7071f, -21.5f, 1.8284f, 1, 1, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 14, 91, 0.7071f, -23.5f, 1.8284f, 5, 2, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 18, 49, -0.2929f, -17.5f, -11.5962f, 7, 17, 2, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 82, 53, 0.2021f, -18.501f, -10.677f, 6, 19, 15, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 82, 53, -4.35f, -18.505f, -6.2f, 15, 19, 6, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 49, -0.2929f, -17.5f, 3.3033f, 7, 17, 2, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.25f, 1.5f, 3.25f);
        this.bone5.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, -1.5708f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 96, 2.0355f, -23.5f, 5.0355f, 5, 1, 1, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 86, 91, 2.0355f, -19.5f, 5.0355f, 5, 1, 1, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 22, 94, 3.0355f, -19.5f, -6.0355f, 4, 1, 1, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 12, 96, 3.0355f, -23.5f, -6.0355f, 4, 1, 1, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 54, 49, 0.9926f, -17.5f, -8.4069f, 7, 17, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 81, 58, 1.5f, -18.5f, -7.5f, 6, 19, 15, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 81, 58, -3.0f, -18.51f, -3.0f, 15, 19, 6, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 36, 49, 0.9926f, -17.5f, 6.4926f, 7, 17, 2, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.25f, 1.5f, 3.25f);
        this.bone5.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.0f, -0.7854f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 74, 91, 0.7071f, -20.5f, 8.2426f, 5, 2, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 102, 4.7071f, -21.5f, 8.2426f, 1, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 100, 0.7071f, -21.5f, 8.2426f, 1, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 26, 91, 0.7071f, -23.5f, 8.2426f, 5, 2, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 36, 94, 5.4142f, -23.5f, -2.1213f, 1, 5, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 32, 94, 0.0f, -23.5f, -2.1213f, 1, 5, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 68, -0.3536f, -17.5f, -5.2426f, 7, 17, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 80, 30, -0.3536f, -17.5f, 9.6569f, 7, 17, 2, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone5.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


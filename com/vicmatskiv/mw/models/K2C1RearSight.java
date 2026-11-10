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

public class K2C1RearSight
extends ModelBase {
    private final ModelRenderer sight17;
    private final ModelRenderer bone5;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone6;

    public K2C1RearSight() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.sight17 = new ModelRenderer((ModelBase)this);
        this.sight17.func_78793_a(0.0f, 5.3f, 0.8f);
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -0.5f, -8.05f, -1.5f, 4, 5, 2, 0.0f, true));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, 2.5f, -10.05f, -1.5f, 1, 2, 2, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -0.5f, -10.05f, -1.5f, 1, 2, 2, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, 0.5f, -11.05f, -1.5f, 2, 1, 2, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -4.0f, -3.4f, -24.0f, 11, 8, 25, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -1.0f, -7.15f, -23.0f, 5, 2, 8, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -0.75f, -6.901f, -15.0f, 1, 1, 9, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, 2.75f, -6.901f, -15.0f, 1, 1, 9, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -1.0f, -6.9f, -6.5f, 5, 2, 5, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, 5.0f, -7.4f, -24.0f, 2, 4, 2, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -4.0f, -7.4f, -24.0f, 2, 4, 2, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -5.0f, 1.1f, -24.01f, 13, 2, 26, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, 5.0f, -11.0f, -5.0f, 2, 8, 2, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -4.0f, -11.0f, -5.0f, 2, 8, 2, 0.0f, false));
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, -4.0f, -1.4f, 1.0f, 11, 6, 1, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(8.0f, 1.1f, -20.01f);
        this.sight17.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, 0.7854f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -2.0f, 0.0f, -4.01f, 2, 1, 26, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -9.1924f, 7.1924f, -4.01f, 1, 2, 26, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -7.7782f, 8.6066f, -4.01f, 2, 2, 26, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -0.5858f, 1.4142f, -4.01f, 2, 2, 26, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(7.0f, -11.0f, -3.0f);
        this.sight17.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, -0.8552f, 0.0f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, -2.001f, 0.0f, 0.0f, 2, 4, 5, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, -11.001f, 0.0f, 0.0f, 2, 4, 5, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(7.0f, -7.2f, 0.3f);
        this.sight17.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, -1.309f, 0.0f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, -2.001f, 0.0f, 0.0f, 2, 5, 6, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, -11.001f, 0.0f, 0.0f, 2, 5, 6, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, -9.001f, 0.0f, 4.0f, 7, 1, 2, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(7.0f, -11.0f, -5.0f);
        this.sight17.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, -1.4137f, 0.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.99f, 0.0f, 0.0f, 2, 19, 8, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -10.99f, 0.0f, 0.0f, 2, 19, 8, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-1.0f, -8.55f, -1.55f);
        this.sight17.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.7854f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 0.0f, 0.7071f, 0.049f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 1.4142f, -0.7071f, 0.049f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 1.8f, -0.7071f, 0.051f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 3.2426f, 1.1213f, 0.049f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 3.2426f, 0.75f, 0.051f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 1.8284f, 2.5355f, 0.049f, 1, 1, 2, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(0.0f, -4.5f, -6.5f);
        this.sight17.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, -0.7854f, 0.0f, 0.0f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, -2.0f, -3.0f, 0.0f, 7, 2, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, -8.0f, -4.0f, -1.0f, 4, 4, 4, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, 7.0f, -6.0f, -3.0f, 2, 8, 8, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, 6.5f, -4.0f, -1.0f, 4, 4, 4, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, 5.5f, 3.0711f, -9.4853f, 2, 4, 4, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.sight17.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


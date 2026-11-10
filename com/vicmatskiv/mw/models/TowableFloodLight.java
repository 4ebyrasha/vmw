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

public class TowableFloodLight
extends ModelBase {
    private final ModelRenderer Floodlight;
    private final ModelRenderer bone15;
    private final ModelRenderer bone9;
    private final ModelRenderer bone8;
    private final ModelRenderer bone7;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer bone4;

    public TowableFloodLight() {
        this.field_78090_t = 300;
        this.field_78089_u = 300;
        this.Floodlight = new ModelRenderer((ModelBase)this);
        this.Floodlight.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(-1.0f, -14.25f, -1.25f);
        this.Floodlight.func_78792_a(this.bone15);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 90, 0, -7.0f, 0.25f, -8.751f, 16, 10, 26, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 43, 280, -6.0f, 3.25f, -9.25f, 14, 2, 1, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 0, 0, 0.0f, 7.25f, -2.75f, 2, 1, 43, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 94, 249, 0.0f, 6.25f, 38.25f, 2, 1, 4, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 42, 243, 0.0f, 2.25f, 29.25f, 2, 9, 2, -0.5f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 58, 116, -11.0f, 1.25f, -0.75f, 24, 2, 10, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 34, 196, -4.0f, -1.75f, 17.251f, 10, 8, 1, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 64, 83, -4.5944f, -7.3797f, -8.751f, 11, 7, 26, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 44, 222, -2.4965f, -6.5186f, 17.252f, 7, 7, 1, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 131, 165, -0.4056f, -49.1297f, 11.0f, 3, 42, 3, -0.3f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 50, 144, -12.4056f, -51.1297f, 11.0f, 27, 3, 3, -0.3f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 136, 233, 12.4f, -54.8797f, 11.01f, 2, 11, 2, -0.3f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 136, 233, -6.4056f, -54.8797f, 11.01f, 2, 11, 2, -0.3f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 136, 233, 6.5944f, -54.8797f, 11.01f, 2, 10, 2, -0.3f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 136, 233, -12.4f, -54.8797f, 11.01f, 2, 10, 2, -0.3f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 28, 243, -10.51f, 12.4216f, 2.25f, 3, 2, 4, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 28, 243, 9.49f, 12.4216f, 2.25f, 3, 2, 4, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 14, 243, -10.51f, 4.7647f, 2.25f, 3, 2, 4, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 14, 243, 9.49f, 4.7647f, 2.25f, 3, 2, 4, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 70, 254, -10.51f, 7.5931f, -0.5784f, 3, 4, 2, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 70, 254, 9.49f, 7.5931f, -0.5784f, 3, 4, 2, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 60, 254, -10.51f, 7.5931f, 7.0784f, 3, 4, 2, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 60, 254, 9.49f, 7.5931f, 7.0784f, 3, 4, 2, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 72, 196, -10.0f, 6.3f, 1.2f, 2, 7, 6, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 72, 196, 10.0f, 6.3f, 1.2f, 2, 7, 6, 0.0f, true));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(-9.4056f, -71.8797f, 11.85f);
        this.Floodlight.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, -0.0873f, -0.3927f, 0.0f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 66, 217, 3.0f, -5.0f, -1.1f, 2, 10, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 66, 217, 20.5537f, -4.3663f, -8.3433f, 2, 10, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 66, 217, 20.3241f, 11.6211f, -7.501f, 2, 10, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 66, 217, 2.7704f, 10.9874f, -0.2577f, 2, 10, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 76, 217, -5.0f, -5.0f, -1.1f, 2, 10, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 76, 217, 12.5537f, -4.3663f, -8.3433f, 2, 10, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 76, 217, 12.3241f, 11.6211f, -7.501f, 2, 10, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 76, 217, -5.2296f, 10.9874f, -0.2577f, 2, 10, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 72, 209, -4.0f, -5.0f, -1.1f, 8, 2, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 72, 209, 13.5537f, -4.3663f, -8.3433f, 8, 2, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 72, 209, 13.3241f, 11.6211f, -7.501f, 8, 2, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 72, 209, -4.2296f, 10.9874f, -0.2577f, 8, 2, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 94, 196, -4.0f, 3.0f, -1.1f, 8, 2, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 94, 196, 13.5537f, 3.6337f, -8.3433f, 8, 2, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 94, 196, 13.3241f, 19.6211f, -7.501f, 8, 2, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 94, 196, -4.2296f, 18.9874f, -0.2577f, 8, 2, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 54, 168, -4.0f, -4.0f, -3.1f, 8, 8, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 54, 168, 13.5537f, -3.3663f, -10.3433f, 8, 8, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 54, 168, 13.3241f, 12.6211f, -9.501f, 8, 8, 3, -0.3f, false));
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 54, 168, -4.2296f, 11.9874f, -2.2577f, 8, 8, 3, -0.3f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(5.0f, -6.0f, 9.0f);
        this.Floodlight.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.0f, 0.48f, 0.0f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 180, 75, -1.0f, -1.0f, -26.0f, 2, 1, 40, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 66, 243, -1.0f, -1.5f, 12.0f, 2, 8, 2, -0.3f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 58, 243, -1.0313f, -1.5f, -26.0523f, 2, 8, 2, -0.3f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(-5.0f, -6.0f, 9.0f);
        this.Floodlight.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, -0.48f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 116, -1.0f, -1.0f, -26.0f, 2, 1, 40, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 74, 243, -1.0f, -1.5f, 12.0f, 2, 8, 2, -0.3f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 50, 243, -1.0191f, -1.5f, -26.1676f, 2, 8, 2, -0.3f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, -13.5f, 4.5f);
        this.Floodlight.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, 1.2654f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 44, -6.0712f, -7.7801f, -14.498f, 8, 13, 26, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 82, 243, -5.8808f, -5.5203f, 11.5f, 5, 5, 1, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, -13.5f, 4.5f);
        this.Floodlight.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, -1.2654f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 68, 44, -1.9288f, -7.7801f, -14.499f, 8, 13, 26, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 94, 243, 0.8808f, -5.5203f, 11.5f, 5, 5, 1, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(0.5f, 0.0f, 4.0f);
        this.Floodlight.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.7854f, 0.0f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 243, -12.01f, -1.1716f, 0.5858f, 3, 2, 4, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 243, 7.99f, -1.1716f, 0.5858f, 3, 2, 4, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 50, 254, -12.01f, -6.0f, 5.4142f, 3, 4, 2, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 50, 254, 7.99f, -6.0f, 5.4142f, 3, 4, 2, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 50, 156, -12.5f, -6.364f, 10.0208f, 24, 4, 2, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 40, 254, -12.01f, -6.0f, -2.2426f, 3, 4, 2, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 40, 254, 7.99f, -6.0f, -2.2426f, 3, 4, 2, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 78, 230, -12.01f, -8.8284f, 0.5858f, 3, 2, 4, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 78, 230, 7.99f, -8.8284f, 0.5858f, 3, 2, 4, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 50, 150, -12.5f, -13.435f, 0.9497f, 24, 2, 4, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Floodlight.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


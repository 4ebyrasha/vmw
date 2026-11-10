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

public class SandbagWall
extends ModelBase {
    private final ModelRenderer Sandbag;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone3;
    private final ModelRenderer bone;
    private final ModelRenderer Sandbag2;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer Sandbag3;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer Sandbag4;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;
    private final ModelRenderer bone24;

    public SandbagWall() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.Sandbag = new ModelRenderer((ModelBase)this);
        this.Sandbag.func_78793_a(0.0f, 24.0f, 0.0f);
        this.Sandbag.field_78804_l.add(new ModelBox(this.Sandbag, 0, 0, -8.0f, -4.9f, -4.5f, 16, 4, 8, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, -0.1222f, 0.0f, 0.0873f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 28, 30, 0.0396f, 0.0f, 0.0f, 8, 2, 4, -0.001f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.1222f, 0.0f, 0.0873f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 28, 18, 0.0396f, 0.0f, -4.0f, 8, 2, 4, -0.001f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.1222f, 0.0f, -0.0873f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 24, 12, -7.9604f, 0.0f, -4.0f, 8, 2, 4, -0.001f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, -0.1222f, 0.0f, -0.0873f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 24, 24, -7.9604f, 0.0f, 0.0f, 8, 2, 4, -0.001f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.1f, -8.0f, -1.0f);
        this.Sandbag.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.0873f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 22, -7.403f, 6.1725f, -3.5f, 8, 2, 8, -0.001f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, -7.0f, 0.0f);
        this.Sandbag.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, -0.0873f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 12, -0.6576f, 5.1672f, -4.5f, 8, 2, 8, -0.001f, false));
        this.Sandbag2 = new ModelRenderer((ModelBase)this);
        this.Sandbag2.func_78793_a(8.1f, 18.6f, 0.0f);
        this.Sandbag2.field_78804_l.add(new ModelBox(this.Sandbag2, 0, 0, -8.0f, -5.1f, -4.5f, 16, 4, 8, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag2.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, -0.1222f, 0.0f, 0.0873f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 28, 30, 0.0222f, -0.1978f, -0.0243f, 8, 2, 4, -0.001f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag2.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.1222f, 0.0f, 0.0873f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 28, 18, 0.0222f, -0.1978f, -3.9757f, 8, 2, 4, -0.001f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag2.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, 0.1222f, 0.0f, -0.0873f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 24, 12, -7.9429f, -0.1978f, -3.9757f, 8, 2, 4, -0.001f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag2.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, -0.1222f, 0.0f, -0.0873f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 24, 24, -7.9429f, -0.1978f, -0.0243f, 8, 2, 4, -0.001f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(0.1f, -8.0f, -1.0f);
        this.Sandbag2.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, 0.0f, 0.0f, 0.0873f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 22, -7.4205f, 5.9733f, -3.5f, 8, 2, 8, -0.001f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(0.0f, -7.0f, 0.0f);
        this.Sandbag2.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, 0.0f, 0.0f, -0.0873f);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 0, 12, -0.6402f, 4.968f, -4.5f, 8, 2, 8, -0.001f, false));
        this.Sandbag3 = new ModelRenderer((ModelBase)this);
        this.Sandbag3.func_78793_a(-8.0f, 18.6f, 0.0f);
        this.Sandbag3.field_78804_l.add(new ModelBox(this.Sandbag3, 0, 0, -8.0f, -5.1f, -4.5f, 16, 4, 8, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag3.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, -0.1222f, 0.0f, 0.0873f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 28, 30, 0.0222f, -0.1978f, -0.0243f, 8, 2, 4, -0.001f, false));
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag3.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.1222f, 0.0f, 0.0873f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 28, 18, 0.0222f, -0.1978f, -3.9757f, 8, 2, 4, -0.001f, false));
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag3.func_78792_a(this.bone15);
        this.setRotationAngle(this.bone15, 0.1222f, 0.0f, -0.0873f);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 24, 12, -7.9429f, -0.1978f, -3.9757f, 8, 2, 4, -0.001f, false));
        this.bone16 = new ModelRenderer((ModelBase)this);
        this.bone16.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag3.func_78792_a(this.bone16);
        this.setRotationAngle(this.bone16, -0.1222f, 0.0f, -0.0873f);
        this.bone16.field_78804_l.add(new ModelBox(this.bone16, 24, 24, -7.9429f, -0.1978f, -0.0243f, 8, 2, 4, -0.001f, false));
        this.bone17 = new ModelRenderer((ModelBase)this);
        this.bone17.func_78793_a(0.1f, -8.0f, -1.0f);
        this.Sandbag3.func_78792_a(this.bone17);
        this.setRotationAngle(this.bone17, 0.0f, 0.0f, 0.0873f);
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 0, 22, -7.4205f, 5.9733f, -3.5f, 8, 2, 8, -0.001f, false));
        this.bone18 = new ModelRenderer((ModelBase)this);
        this.bone18.func_78793_a(0.0f, -7.0f, 0.0f);
        this.Sandbag3.func_78792_a(this.bone18);
        this.setRotationAngle(this.bone18, 0.0f, 0.0f, -0.0873f);
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 0, 12, -0.6402f, 4.968f, -4.5f, 8, 2, 8, -0.001f, false));
        this.Sandbag4 = new ModelRenderer((ModelBase)this);
        this.Sandbag4.func_78793_a(0.0f, 12.7f, 0.0f);
        this.Sandbag4.field_78804_l.add(new ModelBox(this.Sandbag4, 0, 0, -8.0f, -4.9f, -4.5f, 16, 4, 8, 0.0f, false));
        this.bone19 = new ModelRenderer((ModelBase)this);
        this.bone19.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag4.func_78792_a(this.bone19);
        this.setRotationAngle(this.bone19, -0.1222f, 0.0f, 0.0873f);
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 28, 30, 0.0396f, 0.0f, 0.0f, 8, 2, 4, -0.001f, false));
        this.bone20 = new ModelRenderer((ModelBase)this);
        this.bone20.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag4.func_78792_a(this.bone20);
        this.setRotationAngle(this.bone20, 0.1222f, 0.0f, 0.0873f);
        this.bone20.field_78804_l.add(new ModelBox(this.bone20, 28, 18, 0.0396f, 0.0f, -4.0f, 8, 2, 4, -0.001f, false));
        this.bone21 = new ModelRenderer((ModelBase)this);
        this.bone21.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag4.func_78792_a(this.bone21);
        this.setRotationAngle(this.bone21, 0.1222f, 0.0f, -0.0873f);
        this.bone21.field_78804_l.add(new ModelBox(this.bone21, 24, 12, -7.9604f, 0.0f, -4.0f, 8, 2, 4, -0.001f, false));
        this.bone22 = new ModelRenderer((ModelBase)this);
        this.bone22.func_78793_a(0.0f, -6.3f, -0.5f);
        this.Sandbag4.func_78792_a(this.bone22);
        this.setRotationAngle(this.bone22, -0.1222f, 0.0f, -0.0873f);
        this.bone22.field_78804_l.add(new ModelBox(this.bone22, 24, 24, -7.9604f, 0.0f, 0.0f, 8, 2, 4, -0.001f, false));
        this.bone23 = new ModelRenderer((ModelBase)this);
        this.bone23.func_78793_a(0.1f, -8.0f, -1.0f);
        this.Sandbag4.func_78792_a(this.bone23);
        this.setRotationAngle(this.bone23, 0.0f, 0.0f, 0.0873f);
        this.bone23.field_78804_l.add(new ModelBox(this.bone23, 0, 22, -7.403f, 6.1725f, -3.5f, 8, 2, 8, -0.001f, false));
        this.bone24 = new ModelRenderer((ModelBase)this);
        this.bone24.func_78793_a(0.0f, -7.0f, 0.0f);
        this.Sandbag4.func_78792_a(this.bone24);
        this.setRotationAngle(this.bone24, 0.0f, 0.0f, -0.0873f);
        this.bone24.field_78804_l.add(new ModelBox(this.bone24, 0, 12, -0.6576f, 5.1672f, -4.5f, 8, 2, 8, -0.001f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Sandbag.func_78785_a(f5);
        this.Sandbag2.func_78785_a(f5);
        this.Sandbag3.func_78785_a(f5);
        this.Sandbag4.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


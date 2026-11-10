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

public class OSIPRscopereticle
extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone3;
    private final ModelRenderer bone5;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;

    public OSIPRscopereticle() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-6.0f, 8.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 5, 3.0f, -1.0f, 1.0f, 6, 1, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 9, 4.8f, -20.6f, 1.0f, 2, 1, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 4, 12, 6.2f, -20.6f, 1.0f, 1, 1, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 6, 6, -4.65f, -13.0f, 1.0f, 1, 5, 0, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 4, 6, 15.6f, -13.0f, 1.0f, 1, 5, 0, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(4.8f, -20.6f, 1.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, -0.6807f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 25, 0, -12.0f, 0.0f, 0.0f, 12, 1, 0, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(7.2f, -20.6f, 1.0f);
        this.bone.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, 0.6807f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 25, 0.0f, 0.0f, 0.0f, 12, 1, 0, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(3.0f, 0.0f, 1.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, 0.8029f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 3, -11.0f, -1.0f, 0.0f, 11, 1, 0, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, -4.0f, 0.0f, -23.0f, 1, 0, 23, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(9.0f, 0.0f, 1.0f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, -0.8029f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 2, 0.0f, -1.0f, 0.0f, 11, 1, 0, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 2, 2, 3.0f, 0.0f, -23.0f, 1, 0, 23, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(-6.0f, 8.0f, -36.0f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 4, 3.0f, -1.0f, 1.0f, 6, 1, 0, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 8, 7, 4.8f, -20.6f, 1.0f, 2, 1, 0, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 2, 12, 6.2f, -20.6f, 1.0f, 1, 1, 0, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 2, 6, -4.65f, -13.0f, 1.0f, 1, 5, 0, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 6, 15.6f, -13.0f, 1.0f, 1, 5, 0, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(4.8f, -20.6f, 1.0f);
        this.bone6.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, 0.0f, -0.6807f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 24, -12.0f, 0.0f, 0.0f, 12, 1, 0, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 4, 4, -10.0f, 0.0f, 0.0f, 1, 0, 23, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 4, 4, -10.0f, 0.0f, -17.0f, 1, 0, 23, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(7.2f, -20.6f, 1.0f);
        this.bone6.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.0f, 0.0f, 0.6807f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 23, 0.0f, 0.0f, 0.0f, 12, 1, 0, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 6, 6, 9.0f, 0.0f, 0.0f, 1, 0, 23, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 6, 6, 9.0f, 0.0f, -17.0f, 1, 0, 23, 0.0f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(3.0f, 0.0f, 1.0f);
        this.bone6.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, 0.0f, 0.0f, 0.8029f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 0, 1, -11.0f, -1.0f, 0.0f, 11, 1, 0, 0.0f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(9.0f, 0.0f, 1.0f);
        this.bone6.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, 0.0f, 0.0f, -0.8029f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 0, 0, 0.0f, -1.0f, 0.0f, 11, 1, 0, 0.0f, false));
        this.bone16 = new ModelRenderer((ModelBase)this);
        this.bone16.func_78793_a(0.5f, -4.0f, -81.0f);
        this.bone17 = new ModelRenderer((ModelBase)this);
        this.bone17.func_78793_a(-0.5f, -1.0f, 0.0f);
        this.bone16.func_78792_a(this.bone17);
        this.setRotationAngle(this.bone17, 0.0f, 0.0f, 0.7854f);
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 8, 6, -1.7678f, -1.7678f, 0.0f, 2, 1, 0, 0.0f, false));
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 8, 10, 5.7175f, 4.7175f, 0.0f, 1, 2, 0, 0.0f, false));
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 4, 11, 4.7175f, 5.7175f, 0.0f, 1, 1, 0, 0.0f, false));
        this.bone17.field_78804_l.add(new ModelBox(this.bone17, 0, 12, -1.7678f, -0.7678f, 0.0f, 1, 1, 0, 0.0f, false));
        this.bone18 = new ModelRenderer((ModelBase)this);
        this.bone18.func_78793_a(3.0f, 2.5f, 0.0f);
        this.bone16.func_78792_a(this.bone18);
        this.setRotationAngle(this.bone18, 0.0f, 0.0f, -0.7854f);
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 10, 10, 0.7678f, -0.2322f, 0.0f, 1, 2, 0, 0.0f, false));
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 8, 8, -6.7175f, -6.7175f, 0.0f, 2, 1, 0, 0.0f, false));
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 2, 11, -6.7175f, -5.7175f, 0.0f, 1, 1, 0, 0.0f, false));
        this.bone18.field_78804_l.add(new ModelBox(this.bone18, 6, 11, -0.2322f, 0.7678f, 0.0f, 1, 1, 0, 0.0f, false));
        this.bone19 = new ModelRenderer((ModelBase)this);
        this.bone19.func_78793_a(0.0f, 3.0f, -27.0f);
        this.bone16.func_78792_a(this.bone19);
        this.bone19.field_78804_l.add(new ModelBox(this.bone19, 0, 11, -1.0f, -1.0f, 0.0f, 1, 1, 0, 0.0f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(-6.0f, 8.0f, -53.0f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 4, 3.0f, -1.0f, 1.0f, 6, 1, 0, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 8, 7, 4.8f, -20.6f, 1.0f, 2, 1, 0, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 2, 12, 6.2f, -20.6f, 1.0f, 1, 1, 0, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 2, 6, -4.65f, -13.0f, 1.0f, 1, 5, 0, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 6, 15.6f, -13.0f, 1.0f, 1, 5, 0, 0.0f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(4.8f, -20.6f, 1.0f);
        this.bone11.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, 0.0f, 0.0f, -0.6807f);
        this.bone12.field_78804_l.add(new ModelBox(this.bone12, 0, 24, -12.0f, 0.0f, 0.0f, 12, 1, 0, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(7.2f, -20.6f, 1.0f);
        this.bone11.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, 0.0f, 0.0f, 0.6807f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 0, 23, 0.0f, 0.0f, 0.0f, 12, 1, 0, 0.0f, false));
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(3.0f, 0.0f, 1.0f);
        this.bone11.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.0f, 0.0f, 0.8029f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 0, 1, -11.0f, -1.0f, 0.0f, 11, 1, 0, 0.0f, false));
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(9.0f, 0.0f, 1.0f);
        this.bone11.func_78792_a(this.bone15);
        this.setRotationAngle(this.bone15, 0.0f, 0.0f, -0.8029f);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 0, 0, 0.0f, -1.0f, 0.0f, 11, 1, 0, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.func_78785_a(f5);
        this.bone6.func_78785_a(f5);
        this.bone16.func_78785_a(f5);
        this.bone11.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


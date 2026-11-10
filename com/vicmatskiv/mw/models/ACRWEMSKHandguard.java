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

public class ACRWEMSKHandguard
extends ModelBase {
    private final ModelRenderer handguard1;
    private final ModelRenderer bone;
    private final ModelRenderer bone5;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone11;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone12;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;

    public ACRWEMSKHandguard() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.handguard1 = new ModelRenderer((ModelBase)this);
        this.handguard1.func_78793_a(0.3f, -15.4f, -49.0f);
        this.handguard1.field_78804_l.add(new ModelBox(this.handguard1, 0, 0, -2.8f, 4.1f, -3.0f, 2, 1, 29, 0.0f, false));
        this.handguard1.field_78804_l.add(new ModelBox(this.handguard1, 0, 6, -1.6f, 4.8f, 20.0f, 1, 1, 5, 0.0f, false));
        this.handguard1.field_78804_l.add(new ModelBox(this.handguard1, 0, 0, -3.0f, 4.8f, 20.0f, 2, 1, 5, 0.0f, false));
        this.handguard1.field_78804_l.add(new ModelBox(this.handguard1, 22, 25, -1.5f, 4.6f, 23.0f, 1, 1, 1, 0.0f, false));
        this.handguard1.field_78804_l.add(new ModelBox(this.handguard1, 14, 25, -3.1f, 4.6f, 23.0f, 1, 1, 1, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.5f, 0.0f, 0.0f);
        this.handguard1.func_78792_a(this.bone);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 59, 0.0f, 0.3f, -2.0f, 1, 1, 27, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 6, 16, 0.0f, 1.3f, 21.0f, 1, 1, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 22, 17, 0.0f, 1.3f, 15.0f, 1, 1, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 22, 9, 0.0f, 1.3f, 9.0f, 1, 1, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 22, 22, 0.0f, 1.3f, 3.0f, 1, 1, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 14, 22, 0.0f, 1.3f, -3.0f, 1, 1, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 30, 31, 0.0f, 2.3f, -3.0f, 1, 1, 28, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(1.1f, 2.5f, 4.0f);
        this.bone.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.7854f, 0.0f, 0.0f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 24, 12, -1.0f, -1.0f, 0.0f, 1, 1, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 19, 24, -1.0f, 3.2426f, 4.2426f, 1, 1, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 11, 24, -1.0f, 7.4853f, 8.4853f, 1, 1, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 7, 24, -1.0f, 11.7279f, 12.7279f, 1, 1, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 3, 24, -1.0f, -5.2426f, -4.2426f, 1, 1, 1, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(1.0f, 0.3f, 0.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.6632f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 84, 84, -1.0f, -1.0f, -1.0f, 1, 1, 26, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 84, 55, -0.99f, -1.4f, 0.0f, 1, 1, 25, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.0f, -1.4f, 0.0f);
        this.bone2.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, -1.2043f, 0.0f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 6, -1.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(1.0f, 0.3f, -2.0f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, -0.7854f, 0.0f, 0.0f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 25, -1.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 24, 14, -1.0f, 0.4f, 0.0f, 1, 1, 1, 0.0f, false));
        this.bone11 = new ModelRenderer((ModelBase)this);
        this.bone11.func_78793_a(1.0f, 3.3f, -3.0f);
        this.bone.func_78792_a(this.bone11);
        this.setRotationAngle(this.bone11, 0.0f, 0.0f, -0.6458f);
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 15, 0, -3.0f, -1.0f, 0.0f, 3, 1, 2, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 12, -2.0f, -1.0f, 24.0f, 1, 1, 4, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 20, -2.0f, -1.0f, 18.0f, 1, 1, 2, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 19, 6, -2.0f, -1.0f, 12.0f, 1, 1, 2, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 19, 3, -2.0f, -1.0f, 6.0f, 1, 1, 2, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 26, 87, -3.0f, -1.0f, 2.0f, 1, 1, 23, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 13, 5, -1.0f, -1.0f, 2.0f, 1, 1, 4, 0.0f, false));
        this.bone11.field_78804_l.add(new ModelBox(this.bone11, 60, 28, -1.4f, -1.01f, 2.0f, 1, 1, 26, 0.0f, false));
        this.bone13 = new ModelRenderer((ModelBase)this);
        this.bone13.func_78793_a(-2.4821f, 0.1341f, 7.0f);
        this.bone11.func_78792_a(this.bone13);
        this.setRotationAngle(this.bone13, 0.7854f, 0.0f, 1.5446f);
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 12, 16, -1.0f, -1.0f, 0.0f, 1, 1, 1, 0.0f, false));
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 0, 14, -1.0f, 3.2426f, 4.2426f, 1, 1, 1, 0.0f, false));
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 13, 7, -1.0f, 7.4853f, 8.4853f, 1, 1, 1, 0.0f, false));
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 13, 5, -1.0f, 11.7279f, 12.7279f, 1, 1, 1, 0.0f, false));
        this.bone13.field_78804_l.add(new ModelBox(this.bone13, 0, 12, -1.0f, -5.2426f, -4.2426f, 1, 1, 1, 0.0f, false));
        this.bone14 = new ModelRenderer((ModelBase)this);
        this.bone14.func_78793_a(-5.6f, 3.3f, -3.0f);
        this.bone.func_78792_a(this.bone14);
        this.setRotationAngle(this.bone14, 0.0f, 0.0f, 0.6458f);
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 14, 11, 0.0f, -1.0f, 0.0f, 3, 1, 2, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 8, 11, 1.0f, -1.0f, 24.0f, 1, 1, 4, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 14, 19, 1.0f, -1.0f, 18.0f, 1, 1, 2, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 0, 17, 1.0f, -1.0f, 12.0f, 1, 1, 2, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 6, 12, 1.0f, -1.0f, 6.0f, 1, 1, 2, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 9, 0, 0.0f, -1.0f, 2.0f, 1, 1, 4, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 51, 87, 0.4f, -1.0f, 6.0f, 1, 1, 22, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 7, 6, 2.0f, -1.0f, 2.0f, 1, 1, 4, 0.0f, false));
        this.bone14.field_78804_l.add(new ModelBox(this.bone14, 56, 60, 1.6f, -1.01f, 2.0f, 1, 1, 26, 0.0f, false));
        this.bone15 = new ModelRenderer((ModelBase)this);
        this.bone15.func_78793_a(0.5909f, -2.9328f, 7.0f);
        this.bone14.func_78792_a(this.bone15);
        this.setRotationAngle(this.bone15, 0.7854f, 0.0f, 1.5446f);
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 9, 2, 2.0f, -1.0f, 0.0f, 1, 1, 1, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 9, 0, 2.0f, 3.2426f, 4.2426f, 1, 1, 1, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 0, 9, 2.0f, 7.4853f, 8.4853f, 1, 1, 1, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 7, 7, 2.0f, 11.7279f, 12.7279f, 1, 1, 1, 0.0f, false));
        this.bone15.field_78804_l.add(new ModelBox(this.bone15, 0, 3, 2.0f, -5.2426f, -4.2426f, 1, 1, 1, 0.0f, false));
        this.bone12 = new ModelRenderer((ModelBase)this);
        this.bone12.func_78793_a(-5.6f, 3.3f, -3.0f);
        this.bone.func_78792_a(this.bone12);
        this.setRotationAngle(this.bone12, 0.0f, 0.0f, 0.6458f);
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(-5.1f, 0.0f, 0.0f);
        this.handguard1.func_78792_a(this.bone6);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 33, 0, 0.0f, 0.3f, -2.0f, 1, 1, 27, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 14, 14, 0.0f, 1.3f, 21.0f, 1, 1, 4, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 10, 21, 0.0f, 1.3f, 15.0f, 1, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 4, 21, 0.0f, 1.3f, 9.0f, 1, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 20, 14, 0.0f, 1.3f, 3.0f, 1, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 18, 20, 0.0f, 1.3f, -3.0f, 1, 1, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 30, 0.0f, 2.3f, -3.0f, 1, 1, 28, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(0.9f, 2.5f, 4.0f);
        this.bone6.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.7854f, 0.0f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 23, 6, -1.0f, -1.0f, 0.0f, 1, 1, 1, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 23, 3, -1.0f, 3.2426f, 4.2426f, 1, 1, 1, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 23, 0, -1.0f, 7.4853f, 8.4853f, 1, 1, 1, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 23, -1.0f, 11.7279f, 12.7279f, 1, 1, 1, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 22, 20, -1.0f, -5.2426f, -4.2426f, 1, 1, 1, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(0.0f, 0.3f, 0.0f);
        this.bone6.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.0f, 0.0f, 0.6632f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 62, 0, 0.0f, -1.0f, -1.0f, 1, 1, 26, 0.0f, false));
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 29, 60, 0.01f, -1.4f, 0.0f, 1, 1, 25, 0.0f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(0.0f, -1.4f, 0.0f);
        this.bone8.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, -1.2043f, 0.0f, 0.0f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 0, 0, 0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, false));
        this.bone10 = new ModelRenderer((ModelBase)this);
        this.bone10.func_78793_a(1.0f, 0.3f, -2.0f);
        this.bone6.func_78792_a(this.bone10);
        this.setRotationAngle(this.bone10, -0.7854f, 0.0f, 0.0f);
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 8, 21, -1.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, false));
        this.bone10.field_78804_l.add(new ModelBox(this.bone10, 4, 17, -1.0f, 0.4f, 0.0f, 1, 1, 1, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.handguard1.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


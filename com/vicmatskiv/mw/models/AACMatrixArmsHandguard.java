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

public class AACMatrixArmsHandguard
extends ModelBase {
    private final ModelRenderer handguard;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone7;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone5;

    public AACMatrixArmsHandguard() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.handguard = new ModelRenderer((ModelBase)this);
        this.handguard.func_78793_a(0.0f, 24.0f, 0.0f);
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 34, 103, -4.0f, -38.5f, -54.7f, 1, 1, 32, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 102, 102, 0.0f, -38.5f, -54.7f, 1, 1, 32, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 22, 22, 0.01f, -37.5f, -40.7f, 1, 1, 3, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 25, 28, 0.11f, -37.5f, -25.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 27, 11, -4.09f, -37.5f, -25.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 21, 28, 0.11f, -37.5f, -32.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 27, 9, -4.09f, -37.5f, -32.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 9, 28, 0.11f, -37.5f, -39.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 27, 7, -4.09f, -37.5f, -39.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 3, 28, 0.11f, -37.5f, -46.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 18, 27, -4.09f, -37.5f, -46.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 27, 22, 0.11f, -37.5f, -53.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 27, 16, -4.09f, -37.5f, -53.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 15, 0, 0.01f, -37.5f, -47.7f, 1, 1, 3, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 14, 11, 0.01f, -37.5f, -54.7f, 1, 1, 3, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 0, 21, -3.99f, -37.5f, -40.7f, 1, 1, 3, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 15, 5, -3.99f, -37.5f, -47.7f, 1, 1, 3, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 15, 15, -3.99f, -37.5f, -54.7f, 1, 1, 3, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 0, 12, 0.01f, -37.5f, -26.7f, 1, 1, 4, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 104, 0, -3.49f, -37.5f, -46.7f, 4, 1, 24, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 8, 11, -3.99f, -37.5f, -26.7f, 1, 1, 4, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 20, 13, 0.01f, -37.5f, -33.7f, 1, 1, 3, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 20, 1, -3.99f, -37.5f, -33.7f, 1, 1, 3, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 68, 99, -2.1f, -40.1f, -54.7f, 1, 1, 32, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 36, 1, -1.9f, -40.11f, -54.7f, 1, 1, 32, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 25, 2, -2.0f, -40.21f, -25.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 5, 17, -2.0f, -35.41f, -25.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 25, 0, -2.0f, -40.21f, -32.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 10, 20, -2.0f, -35.41f, -32.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 0, 25, -2.0f, -40.21f, -39.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 22, 20, -2.0f, -35.41f, -39.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 24, 10, -2.0f, -40.21f, -46.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 24, 8, -2.0f, -35.41f, -46.7f, 1, 1, 1, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 7, 6, -2.5f, -40.21f, -53.7f, 2, 1, 4, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 7, 0, -2.5f, -35.31f, -53.7f, 2, 1, 4, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 0, 99, -4.0f, -36.9f, -54.7f, 1, 1, 32, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 70, 66, 0.0f, -36.9f, -54.7f, 1, 1, 32, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 0, 33, -2.5f, -35.51f, -54.7f, 2, 1, 32, 0.0f, false));
        this.handguard.field_78804_l.add(new ModelBox(this.handguard, 128, 57, -2.6f, -35.5f, -42.7f, 1, 1, 20, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(-1.4f, -40.2f, -53.7f);
        this.handguard.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, -0.2094f, 0.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 12, 23, -1.1f, -2.0f, 0.0f, 2, 2, 1, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, -0.2079f, 0.9781f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, -0.733f, 0.0f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 21, 17, -1.11f, -1.0f, -1.0f, 2, 1, 2, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(-1.6f, -34.3f, -53.7f);
        this.handguard.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, -0.2094f, 0.0f, -3.1416f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 6, 12, -1.1f, -2.0f, 0.0f, 2, 2, 1, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(0.0f, -0.2079f, 0.9781f);
        this.bone3.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, -0.733f, 0.0f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 20, 5, -1.1f, -1.0f, -1.0f, 2, 1, 2, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(1.0f, -38.5f, -42.7f);
        this.handguard.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, -0.8727f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 17, 20, -1.0f, -2.0f, -3.0f, 1, 1, 3, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, -1.0f, -2.0f, -12.0f, 1, 1, 5, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 70, 33, -0.99f, -2.5f, -12.0f, 1, 1, 32, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 5, 20, -1.0f, -2.0f, 4.0f, 1, 1, 3, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 104, 33, -1.5f, -2.0f, -4.0f, 1, 1, 23, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 19, 9, -1.0f, -2.0f, 11.0f, 1, 1, 3, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 16, 24, -1.0f, -2.0f, 18.0f, 1, 1, 2, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 25, 26, -0.9f, -1.7f, 18.5f, 1, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 21, 26, -0.9f, -1.7f, 12.0f, 1, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 11, 26, -0.9f, -1.7f, 5.0f, 1, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 3, 26, -0.9f, -1.7f, -2.0f, 1, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 25, 13, -0.9f, -1.7f, -9.0f, 1, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 70, 0, -1.0f, -1.0f, -12.0f, 1, 1, 32, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(1.0f, -35.9f, -42.7f);
        this.handguard.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.0f, 0.0f, 0.7854f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 36, 36, -1.0f, 0.0f, -12.0f, 1, 2, 32, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, -3.5355f, 2.5355f, -12.0f, 2, 1, 32, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 12, 16, -3.0f, 2.65f, 18.5f, 1, 1, 1, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, -0.9494f, 0.5994f, 18.5f, 1, 1, 1, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 14, -3.0f, 2.65f, 12.0f, 1, 1, 1, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 2, -0.9494f, 0.5994f, 12.0f, 1, 1, 1, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 12, -3.0f, 2.65f, 5.0f, 1, 1, 1, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 6, -0.9494f, 0.5994f, 5.0f, 1, 1, 1, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 8, -3.0f, 2.65f, -2.0f, 1, 1, 1, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 7, 7, -0.9494f, 0.5994f, -2.0f, 1, 1, 1, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 7, 2, -3.0f, 2.65f, -9.0f, 1, 1, 1, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 7, 0, -0.9494f, 0.5994f, -9.0f, 1, 1, 1, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(-4.0f, -38.5f, -42.7f);
        this.handguard.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, 0.8727f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 12, 19, 0.0f, -2.0f, -3.0f, 1, 1, 3, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 6, 0.0f, -2.0f, -12.0f, 1, 1, 5, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 34, 70, 0.0f, -1.0f, -12.0f, 1, 1, 32, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 66, -0.01f, -2.5f, -12.0f, 1, 1, 32, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 17, 0.0f, -2.0f, 4.0f, 1, 1, 3, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 104, 66, 0.5f, -2.0f, -4.0f, 1, 1, 22, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 7, 16, 0.0f, -2.0f, 11.0f, 1, 1, 3, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 6, 24, 0.0f, -2.0f, 18.0f, 1, 1, 2, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 14, 27, -0.1f, -1.8f, 18.5f, 1, 1, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 6, 27, -0.1f, -1.8f, 12.0f, 1, 1, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 27, -0.1f, -1.8f, 5.0f, 1, 1, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 26, 20, -0.1f, -1.8f, -9.0f, 1, 1, 1, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 26, 5, -0.1f, -1.8f, -2.0f, 1, 1, 1, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.handguard.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


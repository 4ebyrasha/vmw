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

public class ACRSBRHandguard
extends ModelBase {
    private final ModelRenderer handguard1;
    private final ModelRenderer bone;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone2;
    private final ModelRenderer ACR109;
    private final ModelRenderer bone5;
    private final ModelRenderer ACR2;
    private final ModelRenderer bone7;
    private final ModelRenderer ACR111;

    public ACRSBRHandguard() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.handguard1 = new ModelRenderer((ModelBase)this);
        this.handguard1.func_78793_a(0.3f, -15.4f, -49.0f);
        this.handguard1.field_78804_l.add(new ModelBox(this.handguard1, 0, 0, -3.1f, 4.1f, -3.0f, 2, 1, 29, 0.0f, false));
        this.handguard1.field_78804_l.add(new ModelBox(this.handguard1, 0, 30, -1.5f, 4.1f, -3.0f, 1, 1, 29, 0.0f, false));
        this.handguard1.field_78804_l.add(new ModelBox(this.handguard1, 8, 1, -1.6f, 4.8f, 21.0f, 1, 1, 4, 0.0f, false));
        this.handguard1.field_78804_l.add(new ModelBox(this.handguard1, 0, 0, -3.0f, 4.8f, 21.0f, 2, 1, 4, 0.0f, false));
        this.handguard1.field_78804_l.add(new ModelBox(this.handguard1, 5, 11, -1.5f, 4.6f, 23.0f, 1, 1, 1, 0.0f, false));
        this.handguard1.field_78804_l.add(new ModelBox(this.handguard1, 8, 2, -3.1f, 4.6f, 23.0f, 1, 1, 1, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 0.0f, 0.0f);
        this.handguard1.func_78792_a(this.bone);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 89, 0.0f, 1.15f, -3.0f, 1, 1, 27, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 11, 0.01f, -0.3f, 21.0f, 1, 3, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 8, 0, 0.01f, 1.7f, 24.0f, 1, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 6, 6, -4.59f, 1.7f, 24.0f, 1, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 22, 0, 0.01f, -0.3f, 15.0f, 1, 3, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 22, 22, 0.01f, -0.3f, 9.0f, 1, 3, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 6, 22, 0.01f, -0.3f, 3.0f, 1, 3, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 21, 0.01f, -0.3f, -3.0f, 1, 3, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 30, 62, 0.0f, 2.7f, -3.0f, 1, 1, 28, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 60, 62, 0.0f, -0.4f, -3.0f, 1, 1, 27, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(1.0f, 3.7f, -3.0f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.8203f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 34, 2, -1.0f, 0.0f, 0.0f, 1, 2, 28, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(-4.6f, 3.7f, -3.0f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, -0.8203f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 32, 32, 0.0f, 0.0f, 0.0f, 1, 2, 28, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(-4.6f, 0.0f, 0.0f);
        this.handguard1.func_78792_a(this.bone6);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 64, 0, 0.0f, 1.15f, -3.0f, 1, 1, 27, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 62, 32, 0.0f, -0.4f, -3.0f, 1, 1, 27, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 6, 6, 4.5f, 0.3f, -1.0f, 1, 1, 4, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 5, 0.1f, 0.3f, -1.0f, 1, 1, 4, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 10, -0.01f, -0.3f, 21.0f, 1, 3, 3, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 19, 11, -0.01f, -0.3f, 15.0f, 1, 3, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 18, 19, -0.01f, -0.3f, 9.0f, 1, 3, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 12, 19, -0.01f, -0.3f, 3.0f, 1, 3, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 18, 3, -0.01f, -0.3f, -3.0f, 1, 3, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 60, 0.0f, 2.7f, -3.0f, 1, 1, 28, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(1.0f, -1.1f, 24.0f);
        this.handguard1.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, -0.7679f, 0.0f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 13, 14, -1.0f, 0.5035f, 0.4863f, 1, 2, 3, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 13, 8, -5.6f, 0.5035f, 0.4863f, 1, 2, 3, 0.0f, false));
        this.ACR109 = new ModelRenderer((ModelBase)this);
        this.ACR109.func_78793_a(1.0f, -15.8f, -49.0f);
        this.setRotationAngle(this.ACR109, 0.0f, 0.0f, 2.5133f);
        this.ACR109.field_78804_l.add(new ModelBox(this.ACR109, 6, 17, 0.0f, 0.0f, -2.0f, 1, 3, 2, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(0.0f, 3.0f, -2.0f);
        this.ACR109.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.3316f, 0.0f, 0.0f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 5, 0.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f, false));
        this.ACR2 = new ModelRenderer((ModelBase)this);
        this.ACR2.func_78793_a(-4.0f, -15.8f, -49.0f);
        this.setRotationAngle(this.ACR2, 0.0f, 0.0f, -2.5133f);
        this.ACR2.field_78804_l.add(new ModelBox(this.ACR2, 0, 16, -1.0f, 0.0f, -2.0f, 1, 3, 2, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(0.0f, 3.0f, -2.0f);
        this.ACR2.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.3316f, 0.0f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, -1.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f, false));
        this.ACR111 = new ModelRenderer((ModelBase)this);
        this.ACR111.func_78793_a(-1.3f, -18.3f, -51.0f);
        this.ACR111.field_78804_l.add(new ModelBox(this.ACR111, 18, 8, 0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, false));
        this.ACR111.field_78804_l.add(new ModelBox(this.ACR111, 14, 0, -1.4f, 0.0f, 0.0f, 2, 1, 2, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.handguard1.func_78785_a(f5);
        this.ACR109.func_78785_a(f5);
        this.ACR2.func_78785_a(f5);
        this.ACR111.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


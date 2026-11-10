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

public class M4AsiimovMag
extends ModelBase {
    private final ModelRenderer gun1;
    private final ModelRenderer gun2;
    private final ModelRenderer gun3;
    private final ModelRenderer gun4;
    private final ModelRenderer gun5;
    private final ModelRenderer gun6;
    private final ModelRenderer gun7;
    private final ModelRenderer gun8;
    private final ModelRenderer gun9;
    private final ModelRenderer gun10;
    private final ModelRenderer gun11;
    private final ModelRenderer gun12;
    private final ModelRenderer gun13;
    private final ModelRenderer gun14;
    private final ModelRenderer gun15;
    private final ModelRenderer gun16;

    public M4AsiimovMag() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.gun1 = new ModelRenderer((ModelBase)this);
        this.gun1.func_78793_a(1.0f, -12.0f, -4.5f);
        this.gun1.field_78804_l.add(new ModelBox(this.gun1, 0, 28, 0.0f, 0.0f, 0.0f, 3, 7, 6, 0.0f, false));
        this.gun2 = new ModelRenderer((ModelBase)this);
        this.gun2.func_78793_a(1.0f, -5.0f, 1.5f);
        this.setRotationAngle(this.gun2, -1.7846f, 0.0f, 0.0f);
        this.gun2.field_78804_l.add(new ModelBox(this.gun2, 0, 0, 0.0f, 0.0f, 0.0f, 3, 6, 10, 0.0f, false));
        this.gun3 = new ModelRenderer((ModelBase)this);
        this.gun3.func_78793_a(0.8f, -12.0f, -0.5f);
        this.gun3.field_78804_l.add(new ModelBox(this.gun3, 16, 0, 0.0f, 0.0f, 0.0f, 1, 7, 2, 0.0f, false));
        this.gun4 = new ModelRenderer((ModelBase)this);
        this.gun4.func_78793_a(3.2f, -12.0f, -0.5f);
        this.gun4.field_78804_l.add(new ModelBox(this.gun4, 12, 16, 0.0f, 0.0f, 0.0f, 1, 7, 2, 0.0f, false));
        this.gun5 = new ModelRenderer((ModelBase)this);
        this.gun5.func_78793_a(0.8f, -5.0f, 1.5f);
        this.setRotationAngle(this.gun5, -1.7846f, 0.0f, 0.0f);
        this.gun5.field_78804_l.add(new ModelBox(this.gun5, 16, 6, 0.0f, 0.0f, 0.0f, 1, 2, 10, 0.0f, false));
        this.gun6 = new ModelRenderer((ModelBase)this);
        this.gun6.func_78793_a(3.2f, -5.0f, 1.5f);
        this.setRotationAngle(this.gun6, -1.7846f, 0.0f, 0.0f);
        this.gun6.field_78804_l.add(new ModelBox(this.gun6, 0, 16, 0.0f, 0.0f, 0.0f, 1, 2, 10, 0.0f, false));
        this.gun7 = new ModelRenderer((ModelBase)this);
        this.gun7.func_78793_a(3.2f, -5.0f, -1.0f);
        this.setRotationAngle(this.gun7, -1.7846f, 0.0f, 0.0f);
        this.gun7.field_78804_l.add(new ModelBox(this.gun7, 24, 24, -0.01f, 0.0f, 0.0f, 1, 2, 9, 0.0f, false));
        this.gun8 = new ModelRenderer((ModelBase)this);
        this.gun8.func_78793_a(3.2f, -12.0f, -3.0f);
        this.gun8.field_78804_l.add(new ModelBox(this.gun8, 0, 16, 0.0f, 0.0f, 0.0f, 1, 7, 2, 0.0f, false));
        this.gun9 = new ModelRenderer((ModelBase)this);
        this.gun9.func_78793_a(3.2f, -12.0f, -4.5f);
        this.gun9.field_78804_l.add(new ModelBox(this.gun9, 6, 16, 0.0f, 0.0f, 0.0f, 1, 7, 1, 0.0f, false));
        this.gun10 = new ModelRenderer((ModelBase)this);
        this.gun10.func_78793_a(3.2f, -5.0f, -3.5f);
        this.setRotationAngle(this.gun10, -1.7846f, 0.0f, 0.0f);
        this.gun10.field_78804_l.add(new ModelBox(this.gun10, 29, 10, 0.0f, 0.0f, 0.0f, 1, 1, 9, 0.0f, false));
        this.gun11 = new ModelRenderer((ModelBase)this);
        this.gun11.func_78793_a(0.8f, -12.0f, -4.5f);
        this.gun11.field_78804_l.add(new ModelBox(this.gun11, 6, 0, 0.0f, 0.0f, 0.0f, 1, 7, 1, 0.0f, false));
        this.gun12 = new ModelRenderer((ModelBase)this);
        this.gun12.func_78793_a(0.8f, -5.0f, -1.0f);
        this.setRotationAngle(this.gun12, -1.7846f, 0.0f, 0.0f);
        this.gun12.field_78804_l.add(new ModelBox(this.gun12, 13, 19, 0.01f, 0.0f, 0.0f, 1, 2, 9, 0.0f, false));
        this.gun13 = new ModelRenderer((ModelBase)this);
        this.gun13.func_78793_a(0.8f, -12.0f, -3.0f);
        this.gun13.field_78804_l.add(new ModelBox(this.gun13, 0, 0, 0.0f, 0.0f, 0.0f, 1, 7, 2, 0.0f, false));
        this.gun14 = new ModelRenderer((ModelBase)this);
        this.gun14.func_78793_a(0.8f, -5.0f, -3.5f);
        this.setRotationAngle(this.gun14, -1.7846f, 0.0f, 0.0f);
        this.gun14.field_78804_l.add(new ModelBox(this.gun14, 28, 0, 0.0f, 0.0f, 0.0f, 1, 1, 9, 0.0f, false));
        this.gun15 = new ModelRenderer((ModelBase)this);
        this.gun15.func_78793_a(3.2f, 3.3f, -2.7f);
        this.setRotationAngle(this.gun15, -1.7846f, 0.0f, 0.0f);
        this.gun15.field_78804_l.add(new ModelBox(this.gun15, 18, 21, 0.0f, 0.1f, 0.0f, 1, 2, 1, 0.0f, false));
        this.gun16 = new ModelRenderer((ModelBase)this);
        this.gun16.func_78793_a(0.8f, 3.3f, -2.7f);
        this.setRotationAngle(this.gun16, -1.7846f, 0.0f, 0.0f);
        this.gun16.field_78804_l.add(new ModelBox(this.gun16, 18, 18, 0.0f, 0.1f, 0.0f, 1, 2, 1, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.gun1.func_78785_a(f5);
        this.gun2.func_78785_a(f5);
        this.gun3.func_78785_a(f5);
        this.gun4.func_78785_a(f5);
        this.gun5.func_78785_a(f5);
        this.gun6.func_78785_a(f5);
        this.gun7.func_78785_a(f5);
        this.gun8.func_78785_a(f5);
        this.gun9.func_78785_a(f5);
        this.gun10.func_78785_a(f5);
        this.gun11.func_78785_a(f5);
        this.gun12.func_78785_a(f5);
        this.gun13.func_78785_a(f5);
        this.gun14.func_78785_a(f5);
        this.gun15.func_78785_a(f5);
        this.gun16.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


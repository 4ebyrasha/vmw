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

public class AK74VulcanMag
extends ModelBase {
    private final ModelRenderer Magazine1;
    private final ModelRenderer Magazine4;
    private final ModelRenderer Magazine5;
    private final ModelRenderer Magazine7;

    public AK74VulcanMag() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.Magazine1 = new ModelRenderer((ModelBase)this);
        this.Magazine1.func_78793_a(-3.5f, -8.0f, -25.0f);
        this.setRotationAngle(this.Magazine1, -0.1859f, 0.0f, 0.0f);
        this.Magazine1.field_78804_l.add(new ModelBox(this.Magazine1, 21, 25, 0.01f, 0.0f, 0.0f, 4, 11, 7, 0.0f, false));
        this.Magazine4 = new ModelRenderer((ModelBase)this);
        this.Magazine4.func_78793_a(-3.5f, 4.0f, -20.1f);
        this.setRotationAngle(this.Magazine4, -2.082f, 0.0f, 0.0f);
        this.Magazine4.field_78804_l.add(new ModelBox(this.Magazine4, 0, 0, 0.0f, 0.0f, 0.0f, 4, 7, 12, 0.0f, false));
        this.Magazine5 = new ModelRenderer((ModelBase)this);
        this.Magazine5.func_78793_a(-3.0f, -8.3f, -26.6f);
        this.setRotationAngle(this.Magazine5, -0.1859f, 0.0f, 0.0f);
        this.Magazine5.field_78804_l.add(new ModelBox(this.Magazine5, 0, 32, 0.0f, 0.0f, 0.0f, 3, 11, 2, 0.0f, false));
        this.Magazine7 = new ModelRenderer((ModelBase)this);
        this.Magazine7.func_78793_a(-3.0f, 1.6f, -26.5f);
        this.setRotationAngle(this.Magazine7, -2.082f, 0.0f, 0.0f);
        this.Magazine7.field_78804_l.add(new ModelBox(this.Magazine7, 0, 19, 0.0f, 0.0f, 0.0f, 3, 2, 11, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Magazine1.func_78785_a(f5);
        this.Magazine4.func_78785_a(f5);
        this.Magazine5.func_78785_a(f5);
        this.Magazine7.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


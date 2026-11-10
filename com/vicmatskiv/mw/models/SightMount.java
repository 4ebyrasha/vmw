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

public class SightMount
extends ModelBase {
    private final ModelRenderer mount;
    private final ModelRenderer mount2;
    private final ModelRenderer mount3;
    private final ModelRenderer mount4;

    public SightMount() {
        this.field_78090_t = 16;
        this.field_78089_u = 16;
        this.mount = new ModelRenderer((ModelBase)this);
        this.mount.func_78793_a(-2.0f, 17.25f, 0.9f);
        this.mount.field_78804_l.add(new ModelBox(this.mount, 0, 0, -1.0f, -1.0f, -4.0f, 8, 2, 14, 0.0f, false));
        this.mount.field_78804_l.add(new ModelBox(this.mount, 0, 0, -1.0f, 4.0f, -4.0f, 8, 2, 14, 0.0f, false));
        this.mount.field_78804_l.add(new ModelBox(this.mount, 0, 0, 7.0f, 4.0f, -4.5f, 1, 3, 15, 0.0f, false));
        this.mount.field_78804_l.add(new ModelBox(this.mount, 0, 0, 0.0f, 1.0f, -4.0f, 6, 3, 14, 0.0f, false));
        this.mount.field_78804_l.add(new ModelBox(this.mount, 0, 0, -2.65f, 5.5f, -4.0f, 2, 2, 14, 0.0f, false));
        this.mount2 = new ModelRenderer((ModelBase)this);
        this.mount2.func_78793_a(8.0f, 4.0f, -4.5f);
        this.mount.func_78792_a(this.mount2);
        this.setRotationAngle(this.mount2, 0.0f, 0.0f, -0.7854f);
        this.mount2.field_78804_l.add(new ModelBox(this.mount2, 0, 0, -1.0f, -1.0f, 0.0f, 1, 1, 15, 0.0f, false));
        this.mount2.field_78804_l.add(new ModelBox(this.mount2, 0, 0, -3.1213f, 1.1213f, 0.0f, 1, 1, 15, 0.0f, false));
        this.mount2.field_78804_l.add(new ModelBox(this.mount2, 0, 0, -8.6014f, -6.4801f, 0.49f, 4, 2, 14, 0.0f, false));
        this.mount3 = new ModelRenderer((ModelBase)this);
        this.mount3.func_78793_a(7.0f, 1.0f, -4.0f);
        this.mount.func_78792_a(this.mount3);
        this.setRotationAngle(this.mount3, 0.0f, 0.0f, 0.7854f);
        this.mount3.field_78804_l.add(new ModelBox(this.mount3, 0, 0, -1.0f, 0.0f, -0.01f, 1, 2, 14, 0.0f, false));
        this.mount3.field_78804_l.add(new ModelBox(this.mount3, 0, 0, -5.6569f, 4.6569f, -0.01f, 2, 1, 14, 0.0f, false));
        this.mount4 = new ModelRenderer((ModelBase)this);
        this.mount4.func_78793_a(8.5f, 6.0f, -2.75f);
        this.mount.func_78792_a(this.mount4);
        this.setRotationAngle(this.mount4, -0.576f, 0.0f, 0.0f);
        this.mount4.field_78804_l.add(new ModelBox(this.mount4, 0, 0, -1.0f, -3.0f, 0.0f, 1, 3, 3, 0.0f, false));
        this.mount4.field_78804_l.add(new ModelBox(this.mount4, 0, 0, -1.0f, -7.221f, 6.4997f, 1, 3, 3, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.mount.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


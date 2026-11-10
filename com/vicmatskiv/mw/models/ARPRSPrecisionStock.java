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

public class ARPRSPrecisionStock
extends ModelBase {
    private final ModelRenderer stock;
    private final ModelRenderer bone43;
    private final ModelRenderer bone41;
    private final ModelRenderer bone39;
    private final ModelRenderer bone44;
    private final ModelRenderer bone46;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone42;
    private final ModelRenderer bone51;
    private final ModelRenderer bone50;
    private final ModelRenderer bone49;

    public ARPRSPrecisionStock() {
        this.field_78090_t = 256;
        this.field_78089_u = 256;
        this.stock = new ModelRenderer((ModelBase)this);
        this.stock.func_78793_a(-1.5f, -14.25f, 3.0f);
        this.stock.field_78804_l.add(new ModelBox(this.stock, 0, 41, -1.0f, -0.75f, 0.0f, 2, 1, 39, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 63, 63, -2.0f, 2.25f, 33.9f, 4, 15, 2, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 0, 7, -2.0f, 8.25f, 31.75f, 4, 6, 1, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 84, 42, -1.5f, 2.25f, 2.0f, 3, 3, 37, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 19, 0, -1.0f, 2.25f, 0.0f, 2, 3, 2, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 48, 123, -1.5f, 13.25f, 19.0f, 3, 3, 20, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 0, 121, -1.5f, 5.25f, 18.0f, 3, 5, 21, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 17, 41, -1.5f, 10.25f, 31.0f, 3, 3, 8, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 47, 16, -0.5f, 10.25f, 19.9f, 1, 3, 12, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 0, 32, -2.0f, 10.5f, 20.4f, 4, 2, 5, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 0, 0, -2.0f, 5.75f, 28.4f, 4, 5, 2, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 19, 5, -1.5f, 10.25f, 18.9f, 3, 3, 1, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 0, 0, -2.0f, 0.25f, 0.0f, 4, 2, 39, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 0, 16, -1.0f, -3.0f, 15.0f, 2, 1, 15, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 47, 0, 1.4f, -1.6f, 15.0f, 1, 1, 15, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 23, 62, 1.4f, -0.6f, 19.0f, 1, 8, 7, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 60, 42, -2.4f, -0.6f, 19.0f, 1, 8, 7, 0.0f, false));
        this.stock.field_78804_l.add(new ModelBox(this.stock, 43, 43, -2.4f, -1.6f, 15.0f, 1, 1, 15, 0.0f, false));
        this.bone43 = new ModelRenderer((ModelBase)this);
        this.bone43.func_78793_a(1.0f, -0.75f, 0.0f);
        this.stock.func_78792_a(this.bone43);
        this.setRotationAngle(this.bone43, 0.0f, 0.0f, -0.7854f);
        this.bone43.field_78804_l.add(new ModelBox(this.bone43, 41, 83, -1.0f, 0.0f, 0.0f, 1, 1, 39, 0.0f, false));
        this.bone43.field_78804_l.add(new ModelBox(this.bone43, 43, 43, -1.0f, 0.4f, 0.0f, 1, 1, 39, 0.0f, false));
        this.bone43.field_78804_l.add(new ModelBox(this.bone43, 0, 81, -2.4142f, -1.4142f, 0.0f, 1, 1, 39, 0.0f, false));
        this.bone43.field_78804_l.add(new ModelBox(this.bone43, 47, 2, -2.8f, -1.4142f, 0.0f, 1, 1, 39, 0.0f, false));
        this.bone41 = new ModelRenderer((ModelBase)this);
        this.bone41.func_78793_a(-0.5f, 16.25f, 19.0f);
        this.stock.func_78792_a(this.bone41);
        this.setRotationAngle(this.bone41, 1.4835f, 0.0f, 0.0f);
        this.bone41.field_78804_l.add(new ModelBox(this.bone41, 0, 58, -1.01f, 0.0f, 0.0f, 3, 20, 2, 0.0f, false));
        this.bone39 = new ModelRenderer((ModelBase)this);
        this.bone39.func_78793_a(0.5f, 14.25f, 19.0f);
        this.stock.func_78792_a(this.bone39);
        this.setRotationAngle(this.bone39, 0.5411f, 0.0f, 0.0f);
        this.bone39.field_78804_l.add(new ModelBox(this.bone39, 61, 16, -2.001f, -11.0f, 0.0f, 3, 7, 5, 0.0f, false));
        this.bone39.field_78804_l.add(new ModelBox(this.bone39, 18, 32, -2.001f, -4.0f, 0.0f, 3, 5, 2, 0.0f, false));
        this.bone44 = new ModelRenderer((ModelBase)this);
        this.bone44.func_78793_a(-2.0f, 2.25f, 0.0f);
        this.stock.func_78792_a(this.bone44);
        this.setRotationAngle(this.bone44, 0.0f, 0.0f, -0.2269f);
        this.bone44.field_78804_l.add(new ModelBox(this.bone44, 88, 0, 0.0f, 0.0f, 2.0f, 1, 3, 37, 0.0f, false));
        this.bone46 = new ModelRenderer((ModelBase)this);
        this.bone46.func_78793_a(2.0f, 2.25f, 0.0f);
        this.stock.func_78792_a(this.bone46);
        this.setRotationAngle(this.bone46, 0.0f, 0.0f, 0.2269f);
        this.bone46.field_78804_l.add(new ModelBox(this.bone46, 84, 86, -1.0f, 0.0f, 2.0f, 1, 3, 37, 0.0f, false));
        this.bone47 = new ModelRenderer((ModelBase)this);
        this.bone47.func_78793_a(2.0f, 2.25f, 2.0f);
        this.stock.func_78792_a(this.bone47);
        this.setRotationAngle(this.bone47, 0.0f, 0.0873f, 0.2793f);
        this.bone47.field_78804_l.add(new ModelBox(this.bone47, 28, 32, -1.0f, 0.0f, -2.0f, 1, 3, 2, 0.0f, false));
        this.bone48 = new ModelRenderer((ModelBase)this);
        this.bone48.func_78793_a(-2.0f, 2.25f, 2.0f);
        this.stock.func_78792_a(this.bone48);
        this.setRotationAngle(this.bone48, 0.0f, -0.0873f, -0.2793f);
        this.bone48.field_78804_l.add(new ModelBox(this.bone48, 30, 0, 0.0f, 0.0f, -2.0f, 1, 3, 2, 0.0f, false));
        this.bone42 = new ModelRenderer((ModelBase)this);
        this.bone42.func_78793_a(-1.0f, 4.0f, 5.0f);
        this.stock.func_78792_a(this.bone42);
        this.setRotationAngle(this.bone42, -0.7854f, 0.0f, 0.0f);
        this.bone42.field_78804_l.add(new ModelBox(this.bone42, 0, 27, -1.0f, -2.0f, 0.0f, 4, 2, 2, 0.0f, false));
        this.bone42.field_78804_l.add(new ModelBox(this.bone42, 19, 11, -0.999f, -17.4503f, 21.1071f, 4, 2, 2, 0.0f, false));
        this.bone51 = new ModelRenderer((ModelBase)this);
        this.bone51.func_78793_a(2.4f, 1.4f, 30.0f);
        this.stock.func_78792_a(this.bone51);
        this.setRotationAngle(this.bone51, -0.4538f, 0.0f, 0.0f);
        this.bone51.field_78804_l.add(new ModelBox(this.bone51, 30, 16, -0.999f, -1.7976f, -2.8767f, 1, 9, 2, 0.0f, false));
        this.bone51.field_78804_l.add(new ModelBox(this.bone51, 6, 16, -0.997f, -0.9647f, -4.5845f, 1, 9, 2, 0.0f, false));
        this.bone51.field_78804_l.add(new ModelBox(this.bone51, 0, 16, -4.797f, -0.9647f, -4.5845f, 1, 9, 2, 0.0f, false));
        this.bone51.field_78804_l.add(new ModelBox(this.bone51, 19, 16, -4.799f, -1.7976f, -2.8767f, 1, 9, 2, 0.0f, false));
        this.bone50 = new ModelRenderer((ModelBase)this);
        this.bone50.func_78793_a(2.4f, 1.4f, 16.0f);
        this.stock.func_78792_a(this.bone50);
        this.setRotationAngle(this.bone50, -1.117f, 0.0f, 0.0f);
        this.bone50.field_78804_l.add(new ModelBox(this.bone50, 43, 59, -0.999f, -1.9779f, -2.236f, 1, 2, 9, 0.0f, false));
        this.bone50.field_78804_l.add(new ModelBox(this.bone50, 19, 19, -4.799f, -1.9779f, -2.236f, 1, 2, 9, 0.0f, false));
        this.bone50.field_78804_l.add(new ModelBox(this.bone50, 10, 58, -0.998f, -3.7755f, -1.3592f, 1, 2, 9, 0.0f, false));
        this.bone50.field_78804_l.add(new ModelBox(this.bone50, 19, 0, -4.798f, -3.7755f, -1.3592f, 1, 2, 9, 0.0f, false));
        this.bone49 = new ModelRenderer((ModelBase)this);
        this.bone49.func_78793_a(1.5f, -1.0f, 16.0f);
        this.stock.func_78792_a(this.bone49);
        this.setRotationAngle(this.bone49, 0.0f, 0.0f, -0.7854f);
        this.bone49.field_78804_l.add(new ModelBox(this.bone49, 0, 41, 0.0607f, -1.7678f, -1.0f, 1, 2, 15, 0.0f, false));
        this.bone49.field_78804_l.add(new ModelBox(this.bone49, 0, 0, -2.3536f, -3.182f, -1.0f, 2, 1, 15, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.stock.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


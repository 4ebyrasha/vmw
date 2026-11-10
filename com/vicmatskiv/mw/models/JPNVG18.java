/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelBox
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class JPNVG18
extends ModelBiped {
    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer rightarm;
    private final ModelRenderer leftarm;
    private final ModelRenderer rightleg;
    private final ModelRenderer leftleg;
    private final ModelRenderer helmet1;
    private final ModelRenderer helmet2;
    private final ModelRenderer helmet3;
    private final ModelRenderer helmet4;
    private final ModelRenderer helmet5;
    private final ModelRenderer helmet6;
    private final ModelRenderer helmet7;
    private final ModelRenderer helmet8;
    private final ModelRenderer helmet9;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer helmet10;
    private final ModelRenderer bone3;
    private final ModelRenderer helmet11;
    private final ModelRenderer bone4;

    public JPNVG18() {
        super(0.01f, 0.0f, 128, 128);
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.head = new ModelRenderer((ModelBase)this);
        this.head.func_78793_a(0.0f, 0.0f, 0.0f);
        this.head.field_78804_l.add(new ModelBox(this.head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f, false));
        this.body = new ModelRenderer((ModelBase)this);
        this.body.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body.field_78804_l.add(new ModelBox(this.body, 0, 16, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f, false));
        this.rightarm = new ModelRenderer((ModelBase)this);
        this.rightarm.func_78793_a(-5.0f, 2.0f, 0.0f);
        this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, 36, 36, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f, false));
        this.leftarm = new ModelRenderer((ModelBase)this);
        this.leftarm.func_78793_a(5.0f, 2.0f, 0.0f);
        this.leftarm.field_78804_l.add(new ModelBox(this.leftarm, 32, 0, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f, false));
        this.rightleg = new ModelRenderer((ModelBase)this);
        this.rightleg.func_78793_a(-2.0f, 12.0f, 0.0f);
        this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, 0, 32, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f, false));
        this.leftleg = new ModelRenderer((ModelBase)this);
        this.leftleg.func_78793_a(2.0f, 12.0f, 0.0f);
        this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, 24, 24, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f, false));
        this.helmet1 = new ModelRenderer((ModelBase)this);
        this.helmet1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.helmet1, -0.2269f, 0.0f, 0.0f);
        this.helmet1.field_78804_l.add(new ModelBox(this.helmet1, 40, 25, -4.4f, -5.5306f, -5.5642f, 1, 2, 9, 0.0f, false));
        this.helmet1.field_78804_l.add(new ModelBox(this.helmet1, 18, 40, -3.4f, -6.5531f, 2.5332f, 7, 3, 1, 0.0f, false));
        this.helmet1.field_78804_l.add(new ModelBox(this.helmet1, 7, 39, 3.4f, -5.5306f, -5.5642f, 1, 2, 9, 0.0f, false));
        this.helmet2 = new ModelRenderer((ModelBase)this);
        this.helmet2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.helmet2, -0.2443f, 0.0f, -0.2269f);
        this.helmet2.field_78804_l.add(new ModelBox(this.helmet2, 36, 25, -2.9526f, -6.2438f, -6.0209f, 4, 2, 1, 0.0f, false));
        this.helmet3 = new ModelRenderer((ModelBase)this);
        this.helmet3.func_78793_a(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.helmet3, -0.2443f, 0.0f, 0.2269f);
        this.helmet3.field_78804_l.add(new ModelBox(this.helmet3, 20, 16, -1.05f, -6.27f, -6.03f, 4, 2, 1, 0.0f, false));
        this.helmet4 = new ModelRenderer((ModelBase)this);
        this.helmet4.func_78793_a(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.helmet4, -0.4014f, 0.0f, 0.0f);
        this.helmet4.field_78804_l.add(new ModelBox(this.helmet4, 53, 53, -1.5f, -6.2841f, -7.2271f, 3, 3, 1, 0.0f, false));
        this.helmet4.field_78804_l.add(new ModelBox(this.helmet4, 0, 5, -1.0f, -5.5881f, -7.7907f, 2, 2, 1, 0.0f, false));
        this.helmet5 = new ModelRenderer((ModelBase)this);
        this.helmet5.func_78793_a(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.helmet5, -0.0349f, 0.0f, 0.0f);
        this.helmet5.field_78804_l.add(new ModelBox(this.helmet5, 36, 16, -1.5f, -8.5662f, -4.1596f, 3, 1, 8, 0.0f, false));
        this.helmet5.field_78804_l.add(new ModelBox(this.helmet5, 0, 50, -2.0f, -7.984f, 3.361f, 4, 7, 1, 0.0f, false));
        this.helmet5.field_78804_l.add(new ModelBox(this.helmet5, 21, 46, -4.2f, -1.2775f, -1.8144f, 4, 1, 6, 0.0f, false));
        this.helmet5.field_78804_l.add(new ModelBox(this.helmet5, 24, 16, 0.2f, -1.2775f, -1.8144f, 4, 1, 6, 0.0f, false));
        this.helmet5.field_78804_l.add(new ModelBox(this.helmet5, 12, 32, -2.5f, -5.2136f, 4.2583f, 5, 2, 1, 0.0f, false));
        this.helmet6 = new ModelRenderer((ModelBase)this);
        this.helmet6.func_78793_a(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.helmet6, 0.192f, 0.0f, 0.0f);
        this.helmet6.field_78804_l.add(new ModelBox(this.helmet6, 44, 0, -3.7f, -1.6f, -4.1f, 8, 1, 3, 0.0f, false));
        this.helmet6.field_78804_l.add(new ModelBox(this.helmet6, 48, 4, -4.5f, -4.8147f, -2.2526f, 9, 4, 1, 0.0f, false));
        this.helmet6.field_78804_l.add(new ModelBox(this.helmet6, 24, 0, -1.5f, -1.4418f, -4.3345f, 3, 1, 3, 0.0f, false));
        this.helmet6.field_78804_l.add(new ModelBox(this.helmet6, 0, 0, -0.5f, -8.4991f, -5.629f, 1, 2, 3, 0.0f, false));
        this.helmet6.field_78804_l.add(new ModelBox(this.helmet6, 32, 53, -4.3f, -1.6f, -4.1f, 1, 1, 3, 0.0f, false));
        this.helmet7 = new ModelRenderer((ModelBase)this);
        this.helmet7.func_78793_a(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.helmet7, 0.0f, 0.2443f, 0.0f);
        this.helmet7.field_78804_l.add(new ModelBox(this.helmet7, 43, 53, -2.3505f, -6.0f, -6.4887f, 4, 1, 1, 0.0f, false));
        this.helmet7.field_78804_l.add(new ModelBox(this.helmet7, 48, 9, -2.5446f, -5.0f, -6.5371f, 4, 1, 1, 0.0f, false));
        this.helmet8 = new ModelRenderer((ModelBase)this);
        this.helmet8.func_78793_a(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.helmet8, 0.0f, -0.2443f, 0.0f);
        this.helmet8.field_78804_l.add(new ModelBox(this.helmet8, 25, 53, -1.6416f, -6.0f, -6.4645f, 4, 1, 1, 0.0f, false));
        this.helmet8.field_78804_l.add(new ModelBox(this.helmet8, 18, 44, -1.3505f, -5.0f, -6.5371f, 4, 1, 1, 0.0f, false));
        this.helmet9 = new ModelRenderer((ModelBase)this);
        this.helmet9.func_78793_a(0.0f, 0.0f, 0.0f);
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 0.0f, 0.0f);
        this.helmet9.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, -0.7854f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 20, 53, 3.2048f, -2.7879f, -7.8f, 1, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 52, 40, 2.9219f, -2.505f, -7.8f, 1, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 52, 44, 3.4876f, -2.505f, -7.8f, 1, 1, 3, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 24, 19, 3.2048f, -2.505f, -7.81f, 1, 1, 1, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 38, 52, 3.2048f, -2.2222f, -7.8f, 1, 1, 3, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.helmet9.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.7854f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 51, 29, 1.5077f, -4.4849f, -7.8f, 1, 1, 3, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 51, 25, 1.2249f, -4.2021f, -7.8f, 1, 1, 3, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 15, 51, 1.7906f, -4.2021f, -7.8f, 1, 1, 3, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 24, 24, 1.5077f, -4.2021f, -7.81f, 1, 1, 1, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 50, 19, 1.5077f, -3.9192f, -7.8f, 1, 1, 3, 0.0f, false));
        this.helmet10 = new ModelRenderer((ModelBase)this);
        this.helmet10.func_78793_a(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.helmet10, 0.0f, -0.2967f, 0.0f);
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.0f, 0.0f, 0.0f);
        this.helmet10.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, -0.7854f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 50, 15, 3.2048f, -2.7879f, -8.1f, 1, 1, 3, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 10, 50, 2.9219f, -2.505f, -8.1f, 1, 1, 3, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 49, 49, 3.4876f, -2.505f, -8.1f, 1, 1, 3, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 18, 3.2048f, -2.505f, -8.11f, 1, 1, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 48, 36, 3.2048f, -2.2222f, -8.1f, 1, 1, 3, 0.0f, false));
        this.helmet11 = new ModelRenderer((ModelBase)this);
        this.helmet11.func_78793_a(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.helmet11, 0.0f, 0.2967f, 0.0f);
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(0.0f, 0.0f, 0.0f);
        this.helmet11.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, -0.7854f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 48, 11, 1.4841f, -4.5085f, -8.0659f, 1, 1, 3, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 40, 28, 1.2013f, -4.2257f, -8.0659f, 1, 1, 3, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 16, 35, 1.7669f, -4.2257f, -8.0659f, 1, 1, 3, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 16, 1.4841f, -4.2257f, -8.0759f, 1, 1, 1, 0.0f, false));
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 24, 4, 1.4841f, -3.9429f, -8.0659f, 1, 1, 3, 0.0f, false));
        this.field_78116_c.func_78792_a(this.helmet1);
        this.field_78116_c.func_78792_a(this.helmet2);
        this.field_78116_c.func_78792_a(this.helmet3);
        this.field_78116_c.func_78792_a(this.helmet4);
        this.field_78116_c.func_78792_a(this.helmet5);
        this.field_78116_c.func_78792_a(this.helmet6);
        this.field_78116_c.func_78792_a(this.helmet7);
        this.field_78116_c.func_78792_a(this.helmet8);
        this.field_78116_c.func_78792_a(this.helmet9);
        this.field_78116_c.func_78792_a(this.helmet10);
        this.field_78116_c.func_78792_a(this.helmet11);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.func_78785_a(f5);
        this.body.func_78785_a(f5);
        this.rightarm.func_78785_a(f5);
        this.leftarm.func_78785_a(f5);
        this.rightleg.func_78785_a(f5);
        this.leftleg.func_78785_a(f5);
        this.helmet1.func_78785_a(f5);
        this.helmet2.func_78785_a(f5);
        this.helmet3.func_78785_a(f5);
        this.helmet4.func_78785_a(f5);
        this.helmet5.func_78785_a(f5);
        this.helmet6.func_78785_a(f5);
        this.helmet7.func_78785_a(f5);
        this.helmet8.func_78785_a(f5);
        this.helmet9.func_78785_a(f5);
        this.helmet10.func_78785_a(f5);
        this.helmet11.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


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

public class AACKnightsArmamentReceiver
extends ModelBase {
    private final ModelRenderer receiver;
    private final ModelRenderer gun767;
    private final ModelRenderer gun764;
    private final ModelRenderer bone4;
    private final ModelRenderer gun2;
    private final ModelRenderer gun97;
    private final ModelRenderer gun135;
    private final ModelRenderer bone3;
    private final ModelRenderer bone9;
    private final ModelRenderer gun138;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer gun99;
    private final ModelRenderer gun765;
    private final ModelRenderer gun3;
    private final ModelRenderer gun73;
    private final ModelRenderer gun70;
    private final ModelRenderer gun95;
    private final ModelRenderer gun303;
    private final ModelRenderer gun104;
    private final ModelRenderer gun111;
    private final ModelRenderer gun125;
    private final ModelRenderer gun319;
    private final ModelRenderer gun121;
    private final ModelRenderer gun103;
    private final ModelRenderer gun109;
    private final ModelRenderer gun346;
    private final ModelRenderer gun251;
    private final ModelRenderer gun263;
    private final ModelRenderer gun112;
    private final ModelRenderer gun113;
    private final ModelRenderer gun98;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone5;

    public AACKnightsArmamentReceiver() {
        this.field_78090_t = 128;
        this.field_78089_u = 128;
        this.receiver = new ModelRenderer((ModelBase)this);
        this.receiver.func_78793_a(0.0f, 24.0f, 0.0f);
        this.gun767 = new ModelRenderer((ModelBase)this);
        this.gun767.func_78793_a(0.5f, -36.9f, -9.0f);
        this.receiver.func_78792_a(this.gun767);
        this.setRotationAngle(this.gun767, 0.0f, 0.0f, 0.7854f);
        this.gun767.field_78804_l.add(new ModelBox(this.gun767, 0, 0, 0.0f, 0.4f, 0.1f, 1, 2, 12, 0.0f, false));
        this.gun767.field_78804_l.add(new ModelBox(this.gun767, 0, 0, -2.5456f, 2.9456f, -13.9f, 2, 1, 26, 0.0f, false));
        this.gun764 = new ModelRenderer((ModelBase)this);
        this.gun764.func_78793_a(0.7f, -38.3f, -9.0f);
        this.receiver.func_78792_a(this.gun764);
        this.setRotationAngle(this.gun764, 0.0f, 0.0f, 0.9425f);
        this.gun764.field_78804_l.add(new ModelBox(this.gun764, 56, 0, -0.0342f, -0.1372f, -5.0f, 1, 1, 17, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(2.1622f, 1.4473f, -0.9f);
        this.gun764.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, -0.6458f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 27, -1.0f, -2.0f, -1.0f, 1, 3, 2, 0.0f, false));
        this.gun2 = new ModelRenderer((ModelBase)this);
        this.gun2.func_78793_a(-5.2f, -38.1f, -9.0f);
        this.receiver.func_78792_a(this.gun2);
        this.setRotationAngle(this.gun2, 0.0f, 0.0f, -0.9425f);
        this.gun2.field_78804_l.add(new ModelBox(this.gun2, 69, 49, -0.0342f, 0.8628f, -3.0f, 1, 1, 15, 0.0f, false));
        this.gun2.field_78804_l.add(new ModelBox(this.gun2, 26, 27, 1.9658f, 0.8628f, -12.0f, 1, 1, 10, 0.0f, false));
        this.gun2.field_78804_l.add(new ModelBox(this.gun2, 0, 3, 0.9658f, 0.8628f, -3.0f, 1, 1, 1, 0.0f, false));
        this.gun2.field_78804_l.add(new ModelBox(this.gun2, 14, 10, -0.0342f, 0.8628f, -12.0f, 2, 1, 1, 0.0f, false));
        this.gun97 = new ModelRenderer((ModelBase)this);
        this.gun97.func_78793_a(-0.3f, -37.8f, -22.0f);
        this.receiver.func_78792_a(this.gun97);
        this.gun97.field_78804_l.add(new ModelBox(this.gun97, 30, 0, 0.11f, -0.3f, -0.7f, 1, 1, 24, 0.0f, false));
        this.gun135 = new ModelRenderer((ModelBase)this);
        this.gun135.func_78793_a(-0.3f, -39.1f, -19.5f);
        this.receiver.func_78792_a(this.gun135);
        this.gun135.field_78804_l.add(new ModelBox(this.gun135, 26, 30, -0.19f, -0.3f, 1.0f, 1, 1, 2, 0.0f, false));
        this.gun135.field_78804_l.add(new ModelBox(this.gun135, 0, 6, -0.189f, 0.2f, -3.2f, 1, 1, 5, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(0.8f, 0.2f, -3.2f);
        this.gun135.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, 0.5585f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 30, 11, -2.0f, 0.0f, 0.0f, 2, 1, 5, 0.0f, false));
        this.bone9 = new ModelRenderer((ModelBase)this);
        this.bone9.func_78793_a(1.0f, 0.0f, 3.0f);
        this.gun135.func_78792_a(this.bone9);
        this.setRotationAngle(this.bone9, -1.0996f, 0.0f, 0.0f);
        this.bone9.field_78804_l.add(new ModelBox(this.bone9, 7, 0, -1.21f, -0.1362f, -0.2673f, 1, 1, 1, 0.0f, false));
        this.gun138 = new ModelRenderer((ModelBase)this);
        this.gun138.func_78793_a(0.7f, -39.1f, -18.5f);
        this.receiver.func_78792_a(this.gun138);
        this.setRotationAngle(this.gun138, 0.0f, 0.0f, 2.0206f);
        this.gun138.field_78804_l.add(new ModelBox(this.gun138, 12, 27, -0.2096f, 0.2934f, 0.0f, 1, 2, 2, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(0.0076f, 0.0199f, 2.0f);
        this.gun138.func_78792_a(this.bone7);
        this.setRotationAngle(this.bone7, 0.0f, 1.0996f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 7, 7, -0.0951f, 0.2934f, -0.1867f, 1, 2, 1, 0.0f, false));
        this.bone8 = new ModelRenderer((ModelBase)this);
        this.bone8.func_78793_a(0.0076f, 0.0199f, 0.0f);
        this.gun138.func_78792_a(this.bone8);
        this.setRotationAngle(this.bone8, 0.0f, -1.0996f, 0.0f);
        this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 6, -0.0951f, 0.2934f, -0.8133f, 1, 2, 1, 0.0f, false));
        this.gun99 = new ModelRenderer((ModelBase)this);
        this.gun99.func_78793_a(0.7f, -36.8f, -22.0f);
        this.receiver.func_78792_a(this.gun99);
        this.setRotationAngle(this.gun99, 0.0f, 0.0f, 2.3562f);
        this.gun99.field_78804_l.add(new ModelBox(this.gun99, 26, 29, -0.2828f, 0.1414f, -0.7f, 1, 1, 24, 0.0f, false));
        this.gun765 = new ModelRenderer((ModelBase)this);
        this.gun765.func_78793_a(1.1f, -37.7f, -8.9f);
        this.receiver.func_78792_a(this.gun765);
        this.setRotationAngle(this.gun765, 0.0f, 0.0f, 1.7453f);
        this.gun765.field_78804_l.add(new ModelBox(this.gun765, 52, 77, -0.0985f, 0.0174f, 0.0f, 2, 1, 12, 0.0f, false));
        this.gun3 = new ModelRenderer((ModelBase)this);
        this.gun3.func_78793_a(-4.3f, -37.9f, -8.9f);
        this.receiver.func_78792_a(this.gun3);
        this.setRotationAngle(this.gun3, 0.0f, 0.0f, -1.7453f);
        this.gun3.field_78804_l.add(new ModelBox(this.gun3, 36, 76, -2.0985f, 0.0174f, 0.0f, 2, 1, 12, 0.0f, false));
        this.gun3.field_78804_l.add(new ModelBox(this.gun3, 0, 14, -2.3592f, -0.2317f, -3.0f, 2, 2, 3, 0.0f, false));
        this.gun3.field_78804_l.add(new ModelBox(this.gun3, 18, 27, -2.3592f, -0.2317f, -12.1f, 2, 2, 1, 0.0f, false));
        this.gun73 = new ModelRenderer((ModelBase)this);
        this.gun73.func_78793_a(-0.55f, -38.0f, -21.2f);
        this.receiver.func_78792_a(this.gun73);
        this.gun73.field_78804_l.add(new ModelBox(this.gun73, 0, 27, 0.0f, 0.0f, 0.0f, 1, 2, 10, 0.0f, false));
        this.gun70 = new ModelRenderer((ModelBase)this);
        this.gun70.func_78793_a(-0.75f, -38.0f, -22.0f);
        this.receiver.func_78792_a(this.gun70);
        this.gun70.field_78804_l.add(new ModelBox(this.gun70, 0, 27, 0.0f, 0.0f, 0.0f, 1, 2, 24, 0.0f, false));
        this.gun95 = new ModelRenderer((ModelBase)this);
        this.gun95.func_78793_a(-0.75f, -38.0f, -22.7f);
        this.receiver.func_78792_a(this.gun95);
        this.gun95.field_78804_l.add(new ModelBox(this.gun95, 0, 0, 0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, false));
        this.gun303 = new ModelRenderer((ModelBase)this);
        this.gun303.func_78793_a(-1.3f, -39.3f, -22.0f);
        this.receiver.func_78792_a(this.gun303);
        this.gun303.field_78804_l.add(new ModelBox(this.gun303, 0, 53, 0.0f, 0.0f, 0.0f, 1, 2, 23, 0.0f, false));
        this.gun104 = new ModelRenderer((ModelBase)this);
        this.gun104.func_78793_a(-2.5f, -40.1f, -22.0f);
        this.receiver.func_78792_a(this.gun104);
        this.gun104.field_78804_l.add(new ModelBox(this.gun104, 25, 54, 0.0f, 0.0f, 0.0f, 2, 1, 21, 0.0f, false));
        this.gun111 = new ModelRenderer((ModelBase)this);
        this.gun111.func_78793_a(-2.5f, -40.1f, -22.7f);
        this.receiver.func_78792_a(this.gun111);
        this.gun111.field_78804_l.add(new ModelBox(this.gun111, 20, 10, -0.001f, -0.001f, 0.0f, 2, 1, 1, 0.0f, false));
        this.gun125 = new ModelRenderer((ModelBase)this);
        this.gun125.func_78793_a(-2.5f, -40.1f, -1.0f);
        this.receiver.func_78792_a(this.gun125);
        this.setRotationAngle(this.gun125, -0.632f, 0.0f, 0.0f);
        this.gun125.field_78804_l.add(new ModelBox(this.gun125, 13, 22, 0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, false));
        this.gun319 = new ModelRenderer((ModelBase)this);
        this.gun319.func_78793_a(-2.0f, -40.3f, -1.0f);
        this.receiver.func_78792_a(this.gun319);
        this.gun319.field_78804_l.add(new ModelBox(this.gun319, 4, 30, 0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, false));
        this.gun121 = new ModelRenderer((ModelBase)this);
        this.gun121.func_78793_a(-2.5f, -39.3f, 1.0f);
        this.receiver.func_78792_a(this.gun121);
        this.gun121.field_78804_l.add(new ModelBox(this.gun121, 0, 19, 0.0f, 0.0f, 0.0f, 2, 4, 2, 0.0f, false));
        this.gun103 = new ModelRenderer((ModelBase)this);
        this.gun103.func_78793_a(-2.7f, -39.3f, -22.0f);
        this.receiver.func_78792_a(this.gun103);
        this.gun103.field_78804_l.add(new ModelBox(this.gun103, 52, 25, 0.0f, 0.0f, 0.0f, 2, 1, 23, 0.0f, false));
        this.gun109 = new ModelRenderer((ModelBase)this);
        this.gun109.func_78793_a(-2.7f, -39.3f, -22.7f);
        this.receiver.func_78792_a(this.gun109);
        this.gun109.field_78804_l.add(new ModelBox(this.gun109, 17, 30, 0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f, false));
        this.gun346 = new ModelRenderer((ModelBase)this);
        this.gun346.func_78793_a(-2.8f, -39.3f, -21.0f);
        this.receiver.func_78792_a(this.gun346);
        this.gun346.field_78804_l.add(new ModelBox(this.gun346, 30, 0, 0.0f, 0.0f, 0.0f, 1, 1, 10, 0.0f, false));
        this.gun251 = new ModelRenderer((ModelBase)this);
        this.gun251.func_78793_a(-3.3f, -39.2f, -10.3f);
        this.receiver.func_78792_a(this.gun251);
        this.setRotationAngle(this.gun251, 0.2094f, 2.6529f, -0.1859f);
        this.gun251.field_78804_l.add(new ModelBox(this.gun251, 13, 19, -2.0798f, -0.4222f, -1.9864f, 3, 1, 2, 0.0f, false));
        this.gun263 = new ModelRenderer((ModelBase)this);
        this.gun263.func_78793_a(-4.1f, -37.0f, -21.5f);
        this.receiver.func_78792_a(this.gun263);
        this.setRotationAngle(this.gun263, 0.0f, 0.0f, -0.9295f);
        this.gun263.field_78804_l.add(new ModelBox(this.gun263, 0, 14, 0.0f, 0.0f, 0.0f, 1, 1, 11, 0.0f, false));
        this.gun112 = new ModelRenderer((ModelBase)this);
        this.gun112.func_78793_a(-3.7f, -38.4f, -22.7f);
        this.receiver.func_78792_a(this.gun112);
        this.setRotationAngle(this.gun112, 0.0f, 0.0f, 1.2269f);
        this.gun112.field_78804_l.add(new ModelBox(this.gun112, 20, 5, 0.0f, -2.0f, 0.0f, 1, 2, 2, 0.0f, false));
        this.gun113 = new ModelRenderer((ModelBase)this);
        this.gun113.func_78793_a(-3.7f, -38.4f, -22.7f);
        this.receiver.func_78792_a(this.gun113);
        this.gun113.field_78804_l.add(new ModelBox(this.gun113, 26, 27, 0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, false));
        this.gun98 = new ModelRenderer((ModelBase)this);
        this.gun98.func_78793_a(-3.7f, -37.8f, -22.7f);
        this.receiver.func_78792_a(this.gun98);
        this.gun98.field_78804_l.add(new ModelBox(this.gun98, 20, 0, 0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, false));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.8f, -38.1f, -9.0f);
        this.receiver.func_78792_a(this.bone);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, -0.8378f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 50, 54, -1.0f, -2.0f, -9.0f, 1, 2, 17, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 14, 5, -1.0f, -1.0f, 8.0f, 1, 1, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 14, 0, -1.0f, -1.7f, 8.0f, 1, 1, 4, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.0f, -1.0f, -13.7f, 1, 1, 5, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(0.0f, 0.0f, -9.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, -0.576f, 0.0f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 13, 14, -2.99f, -2.708f, 1.0903f, 3, 2, 3, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(-3.8f, -38.1f, -9.0f);
        this.receiver.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, 0.8378f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 75, 0, 0.0f, -1.0f, -2.0f, 1, 1, 14, 0.0f, false));
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 72, 72, 0.0f, -1.7f, -2.0f, 1, 1, 14, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.receiver.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


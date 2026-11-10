/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class ZombieBlistered
extends ModelBiped {
    ModelRenderer rightarm1;
    ModelRenderer rightarm2;
    ModelRenderer rightarm3;
    ModelRenderer rightarm4;
    ModelRenderer rightarm5;
    ModelRenderer rightarm6;
    ModelRenderer rightarm7;
    ModelRenderer rightarm8;
    ModelRenderer rightarm9;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer head1;
    public int heldItemLeft;
    public int heldItemRight;
    public boolean field_78117_n;
    public boolean aimedBow;

    public ZombieBlistered() {
        this(0.0f);
    }

    public ZombieBlistered(float p_i1148_1_) {
        this(p_i1148_1_, 0.0f, 256, 256);
    }

    public ZombieBlistered(float p_i1149_1_, float p_i1149_2_, int p_i1149_3_, int p_i1149_4_) {
        this.field_78090_t = p_i1149_3_;
        this.field_78089_u = p_i1149_4_;
        this.field_78116_c = new ModelRenderer((ModelBase)this, 0, 0);
        this.field_78116_c.func_78789_a(-4.0f, -8.0f, -4.0f, 8, 8, 8);
        this.field_78116_c.func_78793_a(0.0f, 0.0f, 0.0f);
        this.field_78116_c.func_78787_b(256, 256);
        this.field_78116_c.field_78809_i = true;
        this.setRotation(this.field_78116_c, 0.0f, 0.0f, -0.0743572f);
        this.field_78115_e = new ModelRenderer((ModelBase)this, 16, 16);
        this.field_78115_e.func_78789_a(-4.0f, 0.0f, -2.0f, 8, 12, 4);
        this.field_78115_e.func_78793_a(0.0f, 0.0f, 0.0f);
        this.field_78115_e.func_78787_b(256, 256);
        this.field_78115_e.field_78809_i = true;
        this.setRotation(this.field_78115_e, 0.0f, 0.0f, 0.0f);
        this.field_178723_h = new ModelRenderer((ModelBase)this, 0, 60);
        this.field_178723_h.func_78789_a(-3.0f, -2.0f, -2.0f, 4, 6, 4);
        this.field_178723_h.func_78793_a(-5.0f, 2.0f, 0.0f);
        this.field_178723_h.func_78787_b(256, 256);
        this.field_178723_h.field_78809_i = true;
        this.setRotation(this.field_178723_h, 0.5205006f, 0.0f, 0.0f);
        this.field_178724_i = new ModelRenderer((ModelBase)this, 40, 16);
        this.field_178724_i.func_78789_a(-1.0f, -2.0f, -2.0f, 4, 12, 4);
        this.field_178724_i.func_78793_a(5.0f, 2.0f, 0.0f);
        this.field_178724_i.func_78787_b(256, 256);
        this.field_178724_i.field_78809_i = true;
        this.setRotation(this.field_178724_i, 0.0f, 0.0f, 0.0f);
        this.field_178721_j = new ModelRenderer((ModelBase)this, 0, 16);
        this.field_178721_j.func_78789_a(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.field_178721_j.func_78793_a(-2.0f, 12.0f, 0.0f);
        this.field_178721_j.func_78787_b(256, 256);
        this.field_178721_j.field_78809_i = true;
        this.setRotation(this.field_178721_j, 0.0f, 0.0f, 0.0f);
        this.field_178722_k = new ModelRenderer((ModelBase)this, 0, 16);
        this.field_178722_k.func_78789_a(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.field_178722_k.func_78793_a(2.0f, 12.0f, 0.0f);
        this.field_178722_k.func_78787_b(256, 256);
        this.field_178722_k.field_78809_i = true;
        this.setRotation(this.field_178722_k, 0.0f, 0.0f, 0.0f);
        this.rightarm1 = new ModelRenderer((ModelBase)this, 0, 60);
        this.rightarm1.func_78789_a(-2.5f, 2.0f, -1.0f, 4, 4, 4);
        this.rightarm1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightarm1.func_78787_b(256, 256);
        this.rightarm1.field_78809_i = true;
        this.setRotation(this.rightarm1, 0.0f, 0.0f, 0.2230717f);
        this.rightarm2 = new ModelRenderer((ModelBase)this, 0, 60);
        this.rightarm2.func_78789_a(-4.0f, 2.0f, 3.0f, 4, 7, 3);
        this.rightarm2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightarm2.func_78787_b(256, 256);
        this.rightarm2.field_78809_i = true;
        this.setRotation(this.rightarm2, -0.7435722f, 0.0f, 0.0f);
        this.rightarm3 = new ModelRenderer((ModelBase)this, 0, 60);
        this.rightarm3.func_78789_a(-4.5f, 4.0f, 3.5f, 2, 7, 2);
        this.rightarm3.func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightarm3.func_78787_b(256, 256);
        this.rightarm3.field_78809_i = true;
        this.setRotation(this.rightarm3, -0.7435722f, 0.0f, 0.0f);
        this.rightarm4 = new ModelRenderer((ModelBase)this, 0, 60);
        this.rightarm4.func_78789_a(-4.2f, 4.0f, 3.2f, 2, 9, 2);
        this.rightarm4.func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightarm4.func_78787_b(256, 256);
        this.rightarm4.field_78809_i = true;
        this.setRotation(this.rightarm4, -0.7435722f, 0.0f, 0.0f);
        this.rightarm5 = new ModelRenderer((ModelBase)this, 0, 60);
        this.rightarm5.func_78789_a(-4.0f, 2.0f, -5.0f, 3, 4, 4);
        this.rightarm5.func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightarm5.func_78787_b(256, 256);
        this.rightarm5.field_78809_i = true;
        this.setRotation(this.rightarm5, 0.5205006f, 0.0f, 0.0f);
        this.rightarm6 = new ModelRenderer((ModelBase)this, 0, 60);
        this.rightarm6.func_78789_a(-5.0f, -2.0f, -0.8f, 4, 5, 4);
        this.rightarm6.func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightarm6.func_78787_b(256, 256);
        this.rightarm6.field_78809_i = true;
        this.setRotation(this.rightarm6, 0.0f, 0.0f, -0.1487144f);
        this.rightarm7 = new ModelRenderer((ModelBase)this, 0, 60);
        this.rightarm7.func_78789_a(-5.0f, -2.0f, -1.8f, 4, 3, 4);
        this.rightarm7.func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightarm7.func_78787_b(256, 256);
        this.rightarm7.field_78809_i = true;
        this.setRotation(this.rightarm7, 0.0f, 0.0f, 0.3346075f);
        this.rightarm8 = new ModelRenderer((ModelBase)this, 0, 60);
        this.rightarm8.func_78789_a(-5.5f, -6.0f, -1.4f, 3, 7, 3);
        this.rightarm8.func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightarm8.func_78787_b(256, 256);
        this.rightarm8.field_78809_i = true;
        this.setRotation(this.rightarm8, 0.0f, 0.0f, -0.1115358f);
        this.rightarm9 = new ModelRenderer((ModelBase)this, 0, 60);
        this.rightarm9.func_78789_a(-2.3f, -1.0f, 4.0f, 2, 11, 4);
        this.rightarm9.func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightarm9.func_78787_b(256, 256);
        this.rightarm9.field_78809_i = true;
        this.setRotation(this.rightarm9, -1.041001f, 0.0f, 0.0f);
        this.body1 = new ModelRenderer((ModelBase)this, 0, 60);
        this.body1.func_78789_a(-3.0f, -1.0f, -2.5f, 4, 4, 3);
        this.body1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body1.func_78787_b(256, 256);
        this.body1.field_78809_i = true;
        this.setRotation(this.body1, -0.5205006f, 0.0f, 0.0f);
        this.body2 = new ModelRenderer((ModelBase)this, 0, 60);
        this.body2.func_78789_a(-3.0f, 3.0f, -4.0f, 3, 2, 2);
        this.body2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body2.func_78787_b(256, 256);
        this.body2.field_78809_i = true;
        this.setRotation(this.body2, 0.0f, 0.4833219f, 0.0f);
        this.body3 = new ModelRenderer((ModelBase)this, 0, 60);
        this.body3.func_78789_a(-3.0f, 5.0f, -4.5f, 4, 2, 2);
        this.body3.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body3.func_78787_b(256, 256);
        this.body3.field_78809_i = true;
        this.setRotation(this.body3, 0.0f, 1.041001f, 0.0f);
        this.body4 = new ModelRenderer((ModelBase)this, 0, 60);
        this.body4.func_78789_a(-7.0f, 5.0f, -3.5f, 4, 2, 2);
        this.body4.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body4.func_78787_b(256, 256);
        this.body4.field_78809_i = true;
        this.setRotation(this.body4, 0.0f, 0.0f, -0.4089647f);
        this.body5 = new ModelRenderer((ModelBase)this, 0, 60);
        this.body5.func_78789_a(1.5f, 8.0f, -3.0f, 4, 2, 2);
        this.body5.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body5.func_78787_b(256, 256);
        this.body5.field_78809_i = true;
        this.setRotation(this.body5, 0.0f, 0.0f, 0.669215f);
        this.body6 = new ModelRenderer((ModelBase)this, 0, 60);
        this.body6.func_78789_a(-2.0f, 3.0f, 1.0f, 6, 2, 4);
        this.body6.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body6.func_78787_b(256, 256);
        this.body6.field_78809_i = true;
        this.setRotation(this.body6, 0.0f, -0.7435669f, 0.0f);
        this.body7 = new ModelRenderer((ModelBase)this, 0, 60);
        this.body7.func_78789_a(-3.0f, 1.0f, 1.0f, 4, 2, 3);
        this.body7.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body7.func_78787_b(256, 256);
        this.body7.field_78809_i = true;
        this.setRotation(this.body7, 0.0f, -0.5204952f, 0.0f);
        this.body8 = new ModelRenderer((ModelBase)this, 0, 60);
        this.body8.func_78789_a(-3.5f, 5.0f, -5.0f, 3, 3, 9);
        this.body8.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body8.func_78787_b(256, 256);
        this.body8.field_78809_i = true;
        this.setRotation(this.body8, 0.5948578f, 0.0f, 0.0f);
        this.head1 = new ModelRenderer((ModelBase)this, 0, 60);
        this.head1.func_78789_a(-3.5f, -9.0f, -4.5f, 5, 5, 7);
        this.head1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.head1.func_78787_b(256, 256);
        this.head1.field_78809_i = true;
        this.setRotation(this.head1, 0.0f, 0.0f, -0.3717861f);
        this.field_178723_h.func_78792_a(this.rightarm1);
        this.field_178723_h.func_78792_a(this.rightarm2);
        this.field_178723_h.func_78792_a(this.rightarm3);
        this.field_178723_h.func_78792_a(this.rightarm4);
        this.field_178723_h.func_78792_a(this.rightarm5);
        this.field_178723_h.func_78792_a(this.rightarm6);
        this.field_178723_h.func_78792_a(this.rightarm7);
        this.field_178723_h.func_78792_a(this.rightarm8);
        this.field_178723_h.func_78792_a(this.rightarm9);
        this.field_78115_e.func_78792_a(this.body1);
        this.field_78115_e.func_78792_a(this.body2);
        this.field_78115_e.func_78792_a(this.body3);
        this.field_78115_e.func_78792_a(this.body4);
        this.field_78115_e.func_78792_a(this.body5);
        this.field_78115_e.func_78792_a(this.body6);
        this.field_78115_e.func_78792_a(this.body7);
        this.field_78115_e.func_78792_a(this.body8);
        this.field_78116_c.func_78792_a(this.head1);
    }

    public void func_78088_a(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
        this.func_78087_a(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);
        if (this.field_78091_s) {
            float f6 = 2.0f;
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.5f / f6), (float)(1.5f / f6), (float)(1.5f / f6));
            GL11.glTranslatef((float)0.0f, (float)(16.0f * p_78088_7_), (float)0.0f);
            this.field_78116_c.func_78785_a(p_78088_7_);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * p_78088_7_), (float)0.0f);
            this.field_78115_e.func_78785_a(p_78088_7_);
            this.field_178723_h.func_78785_a(p_78088_7_);
            this.field_178724_i.func_78785_a(p_78088_7_);
            this.field_178721_j.func_78785_a(p_78088_7_);
            this.field_178722_k.func_78785_a(p_78088_7_);
            this.field_178720_f.func_78785_a(p_78088_7_);
            GL11.glPopMatrix();
        } else {
            this.field_78116_c.func_78785_a(p_78088_7_);
            this.field_78115_e.func_78785_a(p_78088_7_);
            this.field_178723_h.func_78785_a(p_78088_7_);
            this.field_178724_i.func_78785_a(p_78088_7_);
            this.field_178721_j.func_78785_a(p_78088_7_);
            this.field_178722_k.func_78785_a(p_78088_7_);
            this.field_178720_f.func_78785_a(p_78088_7_);
        }
    }

    public void func_78087_a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
        this.field_78116_c.field_78796_g = p_78087_4_ / 57.295776f;
        this.field_78116_c.field_78795_f = p_78087_5_ / 57.295776f;
        this.field_178720_f.field_78796_g = this.field_78116_c.field_78796_g;
        this.field_178720_f.field_78795_f = this.field_78116_c.field_78795_f;
        this.field_178723_h.field_78795_f = MathHelper.func_76134_b((float)(p_78087_1_ * 0.6662f + (float)Math.PI)) * 2.0f * p_78087_2_ * 0.5f;
        this.field_178724_i.field_78795_f = MathHelper.func_76134_b((float)(p_78087_1_ * 0.6662f)) * 2.0f * p_78087_2_ * 0.5f;
        this.field_178723_h.field_78808_h = 0.0f;
        this.field_178724_i.field_78808_h = 0.0f;
        this.field_178721_j.field_78795_f = MathHelper.func_76134_b((float)(p_78087_1_ * 0.6662f)) * 1.4f * p_78087_2_;
        this.field_178722_k.field_78795_f = MathHelper.func_76134_b((float)(p_78087_1_ * 0.6662f + (float)Math.PI)) * 1.4f * p_78087_2_;
        this.field_178721_j.field_78796_g = 0.0f;
        this.field_178722_k.field_78796_g = 0.0f;
        if (this.field_78093_q) {
            this.field_178723_h.field_78795_f += -0.62831855f;
            this.field_178724_i.field_78795_f += -0.62831855f;
            this.field_178721_j.field_78795_f = -1.2566371f;
            this.field_178722_k.field_78795_f = -1.2566371f;
            this.field_178721_j.field_78796_g = 0.31415927f;
            this.field_178722_k.field_78796_g = -0.31415927f;
        }
        if (this.heldItemLeft != 0) {
            this.field_178724_i.field_78795_f = this.field_178724_i.field_78795_f * 0.5f - 0.31415927f * (float)this.heldItemLeft;
        }
        if (this.heldItemRight != 0) {
            this.field_178723_h.field_78795_f = this.field_178723_h.field_78795_f * 0.5f - 0.31415927f * (float)this.heldItemRight;
        }
        this.field_178723_h.field_78796_g = 0.0f;
        this.field_178724_i.field_78796_g = 0.0f;
        if (this.field_78117_n) {
            this.field_78115_e.field_78795_f = 0.5f;
            this.field_178723_h.field_78795_f += 0.4f;
            this.field_178724_i.field_78795_f += 0.4f;
            this.field_178721_j.field_78798_e = 4.0f;
            this.field_178722_k.field_78798_e = 4.0f;
            this.field_178721_j.field_78797_d = 9.0f;
            this.field_178722_k.field_78797_d = 9.0f;
            this.field_78116_c.field_78797_d = 1.0f;
            this.field_178720_f.field_78797_d = 1.0f;
        } else {
            this.field_78115_e.field_78795_f = 0.0f;
            this.field_178721_j.field_78798_e = 0.1f;
            this.field_178722_k.field_78798_e = 0.1f;
            this.field_178721_j.field_78797_d = 12.0f;
            this.field_178722_k.field_78797_d = 12.0f;
            this.field_78116_c.field_78797_d = 0.0f;
            this.field_178720_f.field_78797_d = 0.0f;
        }
        this.field_178723_h.field_78808_h += MathHelper.func_76134_b((float)(p_78087_3_ * 0.09f)) * 0.05f + 0.05f;
        this.field_178724_i.field_78808_h -= MathHelper.func_76134_b((float)(p_78087_3_ * 0.09f)) * 0.05f + 0.05f;
        this.field_178723_h.field_78795_f += MathHelper.func_76126_a((float)(p_78087_3_ * 0.067f)) * 0.05f;
        this.field_178724_i.field_78795_f -= MathHelper.func_76126_a((float)(p_78087_3_ * 0.067f)) * 0.05f;
        if (this.aimedBow) {
            float f6 = 0.0f;
            float f7 = 0.0f;
            this.field_178723_h.field_78808_h = 0.0f;
            this.field_178724_i.field_78808_h = 0.0f;
            this.field_178723_h.field_78796_g = -(0.1f - f6 * 0.6f) + this.field_78116_c.field_78796_g;
            this.field_178724_i.field_78796_g = 0.1f - f6 * 0.6f + this.field_78116_c.field_78796_g + 0.4f;
            this.field_178723_h.field_78795_f = -1.5707964f + this.field_78116_c.field_78795_f;
            this.field_178724_i.field_78795_f = -1.5707964f + this.field_78116_c.field_78795_f;
            this.field_178723_h.field_78795_f -= f6 * 1.2f - f7 * 0.4f;
            this.field_178724_i.field_78795_f -= f6 * 1.2f - f7 * 0.4f;
            this.field_178723_h.field_78808_h += MathHelper.func_76134_b((float)(p_78087_3_ * 0.09f)) * 0.05f + 0.05f;
            this.field_178724_i.field_78808_h -= MathHelper.func_76134_b((float)(p_78087_3_ * 0.09f)) * 0.05f + 0.05f;
            this.field_178723_h.field_78795_f += MathHelper.func_76126_a((float)(p_78087_3_ * 0.067f)) * 0.05f;
            this.field_178724_i.field_78795_f -= MathHelper.func_76126_a((float)(p_78087_3_ * 0.067f)) * 0.05f;
        }
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class Zombie
extends ModelBiped {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;

    public Zombie() {
        this(0.0f);
    }

    public Zombie(float p_i1148_1_) {
        this(p_i1148_1_, 0.0f, 128, 128);
    }

    public Zombie(float p_i1149_1_, float p_i1149_2_, int p_i1149_3_, int p_i1149_4_) {
        this.field_78090_t = p_i1149_3_;
        this.field_78089_u = p_i1149_4_;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.func_78789_a(-4.0f, -8.0f, -4.0f, 8, 8, 8);
        this.head.func_78793_a(0.0f, 0.0f, 0.0f);
        this.head.func_78787_b(128, 128);
        this.head.field_78809_i = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 16, 16);
        this.body.func_78789_a(-4.0f, 0.0f, -2.0f, 8, 12, 4);
        this.body.func_78793_a(0.0f, 0.0f, 0.0f);
        this.body.func_78787_b(128, 128);
        this.body.field_78809_i = true;
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.rightarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.rightarm.func_78789_a(-3.0f, -2.0f, -2.0f, 4, 12, 4);
        this.rightarm.func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightarm.func_78787_b(128, 128);
        this.rightarm.field_78809_i = true;
        this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
        this.leftarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.leftarm.func_78789_a(-1.0f, -2.0f, -2.0f, 4, 12, 4);
        this.leftarm.func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftarm.func_78787_b(128, 128);
        this.leftarm.field_78809_i = true;
        this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
        this.rightleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.rightleg.func_78789_a(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.rightleg.func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightleg.func_78787_b(128, 128);
        this.rightleg.field_78809_i = true;
        this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
        this.leftleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.leftleg.func_78789_a(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.leftleg.func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftleg.func_78787_b(128, 128);
        this.leftleg.field_78809_i = true;
        this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
        this.field_178723_h = new ModelRenderer((ModelBase)this, 40, 16);
        this.field_178723_h.func_78790_a(-3.0f, -2.0f, -2.0f, 0, 0, 0, p_i1149_1_);
        this.field_178723_h.func_78793_a(-5.0f, 2.0f + p_i1149_2_, 0.0f);
        this.field_178724_i = new ModelRenderer((ModelBase)this, 40, 16);
        this.field_178724_i.field_78809_i = true;
        this.field_178724_i.func_78790_a(-1.0f, -2.0f, -2.0f, 0, 0, 0, p_i1149_1_);
        this.field_178724_i.func_78793_a(5.0f, 2.0f + p_i1149_2_, 0.0f);
        this.field_178721_j = new ModelRenderer((ModelBase)this, 0, 16);
        this.field_178721_j.func_78790_a(-2.0f, 0.0f, -2.0f, 0, 0, 0, p_i1149_1_);
        this.field_178721_j.func_78793_a(-1.9f, 12.0f + p_i1149_2_, 0.0f);
        this.field_178722_k = new ModelRenderer((ModelBase)this, 0, 16);
        this.field_178722_k.field_78809_i = true;
        this.field_178722_k.func_78790_a(-2.0f, 0.0f, -2.0f, 0, 0, 0, p_i1149_1_);
        this.field_178722_k.func_78793_a(1.9f, 12.0f + p_i1149_2_, 0.0f);
        this.field_78116_c = new ModelRenderer((ModelBase)this, 0, 0);
        this.field_78116_c.func_78790_a(-4.0f, -8.0f, -4.0f, 0, 0, 0, p_i1149_1_);
        this.field_78116_c.func_78793_a(0.0f, 0.0f + p_i1149_2_, 0.0f);
        this.field_78115_e = new ModelRenderer((ModelBase)this, 16, 16);
        this.field_78115_e.func_78790_a(-4.0f, 0.0f, -2.0f, 0, 0, 0, p_i1149_1_);
        this.field_78115_e.func_78793_a(0.0f, 0.0f + p_i1149_2_, 0.0f);
        this.field_178723_h.func_78792_a(this.rightarm);
        this.field_178724_i.func_78792_a(this.leftarm);
        this.field_78115_e.func_78792_a(this.body);
        this.field_78116_c.func_78792_a(this.head);
        this.field_178722_k.func_78792_a(this.leftleg);
        this.field_178721_j.func_78792_a(this.rightleg);
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
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.field_78795_f = x;
        model.field_78796_g = y;
        model.field_78808_h = z;
    }
}


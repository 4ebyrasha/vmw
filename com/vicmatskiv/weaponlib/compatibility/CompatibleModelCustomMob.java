/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelBiped$ArmPose
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.EnumHandSide
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class CompatibleModelCustomMob
extends ModelBiped {
    public CompatibleModelCustomMob() {
        this(0.0f, false);
    }

    public CompatibleModelCustomMob(float modelSize, boolean p_i46303_2_) {
        super(modelSize, 0.0f, 64, 32);
        if (!p_i46303_2_) {
            this.field_178723_h = new ModelRenderer((ModelBase)this, 40, 16);
            this.field_178723_h.func_78790_a(-1.0f, -2.0f, -1.0f, 2, 12, 2, modelSize);
            this.field_178723_h.func_78793_a(-5.0f, 2.0f, 0.0f);
            this.field_178724_i = new ModelRenderer((ModelBase)this, 40, 16);
            this.field_178724_i.field_78809_i = true;
            this.field_178724_i.func_78790_a(-1.0f, -2.0f, -1.0f, 2, 12, 2, modelSize);
            this.field_178724_i.func_78793_a(5.0f, 2.0f, 0.0f);
            this.field_178721_j = new ModelRenderer((ModelBase)this, 0, 16);
            this.field_178721_j.func_78790_a(-1.0f, 0.0f, -1.0f, 2, 12, 2, modelSize);
            this.field_178721_j.func_78793_a(-2.0f, 12.0f, 0.0f);
            this.field_178722_k = new ModelRenderer((ModelBase)this, 0, 16);
            this.field_178722_k.field_78809_i = true;
            this.field_178722_k.func_78790_a(-1.0f, 0.0f, -1.0f, 2, 12, 2, modelSize);
            this.field_178722_k.func_78793_a(2.0f, 12.0f, 0.0f);
        }
    }

    public void func_78086_a(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime) {
        this.field_187076_m = ModelBiped.ArmPose.EMPTY;
        this.field_187075_l = ModelBiped.ArmPose.EMPTY;
        ItemStack itemstack = entitylivingbaseIn.func_184586_b(EnumHand.MAIN_HAND);
        if (itemstack != null && itemstack.func_77973_b() == Items.field_151031_f && ((EntityCustomMob)entitylivingbaseIn).isSwingingArms()) {
            if (entitylivingbaseIn.func_184591_cq() == EnumHandSide.RIGHT) {
                this.field_187076_m = ModelBiped.ArmPose.BOW_AND_ARROW;
            } else {
                this.field_187075_l = ModelBiped.ArmPose.BOW_AND_ARROW;
            }
        }
        super.func_78086_a(entitylivingbaseIn, p_78086_2_, p_78086_3_, partialTickTime);
    }

    public void func_78087_a(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        super.func_78087_a(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        ItemStack itemstack = ((EntityLivingBase)entityIn).func_184614_ca();
        EntityCustomMob entityCustomMob = (EntityCustomMob)entityIn;
        if (entityCustomMob.isSwingingArms() && (itemstack == null || itemstack.func_77973_b() != Items.field_151031_f)) {
            float f = MathHelper.func_76126_a((float)(this.field_78095_p * (float)Math.PI));
            float f1 = MathHelper.func_76126_a((float)((1.0f - (1.0f - this.field_78095_p) * (1.0f - this.field_78095_p)) * (float)Math.PI));
            this.field_178723_h.field_78808_h = 0.0f;
            this.field_178724_i.field_78808_h = 0.0f;
            this.field_178723_h.field_78796_g = -(0.1f - f * 0.6f);
            this.field_178724_i.field_78796_g = 0.1f - f * 0.6f;
            this.field_178723_h.field_78795_f = -1.5707964f;
            this.field_178724_i.field_78795_f = -1.5707964f;
            this.field_178723_h.field_78795_f -= f * 1.2f - f1 * 0.4f;
            this.field_178724_i.field_78795_f -= f * 1.2f - f1 * 0.4f;
            this.field_178723_h.field_78808_h += MathHelper.func_76134_b((float)(ageInTicks * 0.09f)) * 0.05f + 0.05f;
            this.field_178724_i.field_78808_h -= MathHelper.func_76134_b((float)(ageInTicks * 0.09f)) * 0.05f + 0.05f;
            this.field_178723_h.field_78795_f += MathHelper.func_76126_a((float)(ageInTicks * 0.067f)) * 0.05f;
            this.field_178724_i.field_78795_f -= MathHelper.func_76126_a((float)(ageInTicks * 0.067f)) * 0.05f;
        }
    }

    public void func_187073_a(float scale, EnumHandSide side) {
        float f = side == EnumHandSide.RIGHT ? 1.0f : -1.0f;
        ModelRenderer modelrenderer = this.func_187074_a(side);
        modelrenderer.field_78800_c += f;
        modelrenderer.func_78794_c(scale);
        modelrenderer.field_78800_c -= f;
    }
}


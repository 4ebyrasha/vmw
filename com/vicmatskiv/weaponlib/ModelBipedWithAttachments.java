/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.client.model.TextureOffset
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.Tuple;
import com.vicmatskiv.weaponlib.compatibility.CompatibleModelBiped;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.TextureOffset;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ModelBipedWithAttachments
extends CompatibleModelBiped {
    public ModelBipedWithAttachments(ModelBiped delegate) {
        super(delegate);
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    public void func_78086_a(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_) {
        this.delegate.func_78086_a(p_78086_1_, p_78086_2_, p_78086_3_, p_78086_4_);
    }

    public ModelRenderer func_85181_a(Random p_85181_1_) {
        return this.delegate.func_85181_a(p_85181_1_);
    }

    public TextureOffset func_78084_a(String p_78084_1_) {
        return this.delegate.func_78084_a(p_78084_1_);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.delegate.func_78088_a(entity, f, f1, f2, f3, f4, f5);
    }

    public boolean equals(Object obj) {
        return this.delegate.equals(obj);
    }

    public void func_78087_a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
        this.delegate.func_78087_a(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
    }

    public String toString() {
        return this.delegate.toString();
    }

    public void renderAttachments(String modId, List<CompatibleAttachment<?>> attachments, Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        for (CompatibleAttachment<?> compatibleAttachment : attachments) {
            if (compatibleAttachment == null) continue;
            for (Tuple<ModelBase, String> texturedModel : compatibleAttachment.getAttachment().getTexturedModels()) {
                Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation(modId + ":textures/models/" + texturedModel.getV()));
                GL11.glPushMatrix();
                if (compatibleAttachment.getModelPositioning() != null) {
                    compatibleAttachment.getModelPositioning().accept(texturedModel.getU());
                }
                texturedModel.getU().func_78088_a(entity, f, f1, f2, f3, f4, f5);
                GL11.glPopMatrix();
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.renderer.entity.RenderBiped
 *  net.minecraft.client.renderer.entity.RenderLivingBase
 *  net.minecraft.client.renderer.entity.layers.LayerBipedArmor
 *  net.minecraft.client.renderer.entity.layers.LayerHeldItem
 *  net.minecraft.client.renderer.entity.layers.LayerRenderer
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleModelCustomMob;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class CompatibleRenderBiped<T extends EntityLiving>
extends RenderBiped<T> {
    public CompatibleRenderBiped(ModelBiped model, float f) {
        super(Minecraft.func_71410_x().func_175598_ae(), model, f);
        this.func_177094_a((LayerRenderer)new LayerHeldItem((RenderLivingBase)this));
        this.func_177094_a((LayerRenderer)new LayerBipedArmor((RenderLivingBase)this){

            protected void func_177177_a() {
                this.field_177189_c = new CompatibleModelCustomMob(0.5f, true);
                this.field_177186_d = new CompatibleModelCustomMob(1.0f, true);
            }
        });
    }

    protected void preRenderCallback(T entitylivingbaseIn, float partialTickTime) {
    }

    public void func_82422_c() {
        GL11.glTranslatef((float)0.09375f, (float)0.1875f, (float)0.0f);
    }

    protected ResourceLocation func_110775_a(T entity) {
        return this.getCompatibleEntityTexture(entity);
    }

    protected ResourceLocation getCompatibleEntityTexture(T entity) {
        return super.func_110775_a(entity);
    }

    public void func_76986_a(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        this.prepareCompatibleRender(entity, x, y, z, entityYaw, partialTicks);
        super.func_76986_a(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void prepareCompatibleRender(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
    }
}


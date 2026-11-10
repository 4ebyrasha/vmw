/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.World
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.particle;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleParticle;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTessellator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class FlashFX
extends CompatibleParticle {
    private static final float FLASH_ALPHA_FACTOR = 0.1f;
    private static final double FLASH_SCALE_FACTOR = (double)0.1f;
    private static final String FLASH_TEXTURE = "weaponlib:/com/vicmatskiv/weaponlib/resources/flashes.png";
    private int imageIndex;
    private static final int imagesPerRow = 8;
    private String texture;

    public FlashFX(World par1World, double positionX, double positionY, double positionZ, float scale, float alpha, float motionX, float motionY, float motionZ, String texture) {
        super(par1World, positionX, positionY, positionZ, 0.0, 0.0, 0.0);
        this.field_187129_i = motionX;
        this.field_187130_j = motionY;
        this.field_187131_k = motionZ;
        if (motionX == 0.0f) {
            motionX = 0.01f;
        }
        if (motionZ == 0.0f) {
            motionZ = 0.01f;
        }
        if (motionY == 0.0f) {
            motionY = 0.01f;
        }
        this.field_94054_b = 0;
        this.field_94055_c = 0;
        this.field_70552_h = 1.0f;
        this.field_70553_i = 1.0f;
        this.field_70551_j = 1.0f;
        this.field_82339_as = alpha;
        this.field_70544_f *= 1.4f;
        this.field_70544_f *= scale;
        this.field_70547_e = 1;
        this.imageIndex = this.field_187136_p.nextInt() % 8;
        this.texture = texture != null ? texture : FLASH_TEXTURE;
    }

    public void func_189213_a() {
        this.field_187123_c = this.field_187126_f;
        this.field_187124_d = this.field_187127_g;
        this.field_187125_e = this.field_187128_h;
        if (this.field_70546_d++ >= this.field_70547_e) {
            this.func_187112_i();
        }
        CompatibilityProvider.compatibility.moveParticle(this, this.field_187129_i, this.field_187130_j, this.field_187131_k);
        this.field_187129_i *= 0.9999999785423279;
        this.field_187130_j *= 0.9999999785423279;
        this.field_187131_k *= 0.9999999785423279;
        this.field_82339_as *= 0.1f;
        this.field_70544_f = (float)((double)this.field_70544_f * (double)0.1f);
        if (this.isCollided()) {
            this.field_187129_i *= (double)0.7f;
            this.field_187131_k *= (double)0.7f;
        }
    }

    @Override
    public void renderParticle(CompatibleTessellator tessellator, float partialTicks, float par3, float par4, float par5, float par6, float par7) {
        Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation(this.texture));
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)8192);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glAlphaFunc((int)516, (float)0.003921569f);
        tessellator.startDrawingParticles();
        int i = this.func_189214_a(partialTicks);
        int j = i >> 16 & 0xFFFF;
        int k = i & 0xFFFF;
        tessellator.setLightMap(j, k);
        RenderHelper.func_74518_a();
        float f10 = 0.1f * this.field_70544_f;
        float f11 = (float)(this.field_187123_c + (this.field_187126_f - this.field_187123_c) * (double)partialTicks - field_70556_an);
        float f12 = (float)(this.field_187124_d + (this.field_187127_g - this.field_187124_d) * (double)partialTicks - field_70554_ao);
        float f13 = (float)(this.field_187125_e + (this.field_187128_h - this.field_187125_e) * (double)partialTicks - field_70555_ap);
        tessellator.setColorRgba(this.field_70552_h, this.field_70553_i, this.field_70551_j, this.field_82339_as);
        float uWidth = 0.125f;
        float aU = (float)(this.imageIndex + 1) * uWidth;
        float aV = 1.0f;
        float bU = (float)(this.imageIndex + 1) * uWidth;
        float bV = 0.0f;
        float cU = (float)this.imageIndex * uWidth;
        float cV = 0.0f;
        float dU = (float)this.imageIndex * uWidth;
        float dV = 1.0f;
        tessellator.addVertexWithUV(f11 - par3 * f10 - par6 * f10, f12 - par4 * f10, f13 - par5 * f10 - par7 * f10, aU, aV);
        tessellator.addVertexWithUV(f11 - par3 * f10 + par6 * f10, f12 + par4 * f10, f13 - par5 * f10 + par7 * f10, bU, bV);
        tessellator.addVertexWithUV(f11 + par3 * f10 + par6 * f10, f12 + par4 * f10, f13 + par5 * f10 + par7 * f10, cU, cV);
        tessellator.addVertexWithUV(f11 + par3 * f10 - par6 * f10, f12 - par4 * f10, f13 + par5 * f10 - par7 * f10, dU, dV);
        tessellator.draw();
        RenderHelper.func_74519_b();
        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    public int func_70537_b() {
        return 3;
    }
}


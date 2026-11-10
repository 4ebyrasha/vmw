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

public class ExplosionParticleFX
extends CompatibleParticle {
    private static final String DEFAULT_TEXTURE = "weaponlib:/com/vicmatskiv/weaponlib/resources/explosion-particles.png";
    private int imageIndex;
    private static final int columnCount = 5;
    private static final int rowCount = 5;
    private String particleTexture;

    public ExplosionParticleFX(World par1World, double positionX, double positionY, double positionZ, float scale, float motionX, float motionY, float motionZ) {
        this(par1World, positionY, positionY, positionZ, scale, motionX, motionY, motionZ, 0, DEFAULT_TEXTURE);
    }

    public ExplosionParticleFX(World par1World, double positionX, double positionY, double positionZ, float scale, double motionX, double motionY, double motionZ, int particleMaxAge, String particleTexture) {
        super(par1World, positionX, positionY, positionZ, 0.0, 0.0, 0.0);
        this.field_187129_i = motionX;
        this.field_187130_j = motionY;
        this.field_187131_k = motionZ;
        if (motionX == 0.0) {
            motionX = 1.0;
        }
        this.field_94054_b = 0;
        this.field_94055_c = 0;
        this.field_70552_h = 1.0f;
        this.field_70553_i = 1.0f;
        this.field_70551_j = 1.0f;
        this.field_82339_as = 1.0f;
        this.field_70544_f = scale;
        this.field_70547_e = particleMaxAge == 0 ? 50 + (int)(this.field_187136_p.nextFloat() * 30.0f) : particleMaxAge;
        this.imageIndex = this.field_187136_p.nextInt(25);
        this.particleTexture = particleTexture != null ? particleTexture : DEFAULT_TEXTURE;
    }

    public void func_189213_a() {
        this.field_187123_c = this.field_187126_f;
        this.field_187124_d = this.field_187127_g;
        this.field_187125_e = this.field_187128_h;
        if (this.field_70546_d++ >= this.field_70547_e) {
            this.func_187112_i();
        }
        this.field_187130_j += 0.004;
        CompatibilityProvider.compatibility.moveParticle(this, this.field_187129_i, this.field_187130_j, this.field_187131_k);
        this.field_187129_i *= 0.99;
        this.field_187130_j *= 0.99;
        this.field_187130_j -= 0.07;
        this.field_187131_k *= 0.99;
        if (CompatibilityProvider.compatibility.isCollided(this)) {
            this.field_187129_i *= (double)0.7f;
            this.field_187131_k *= (double)0.7f;
        }
        this.field_82339_as = this.field_70546_d < 9 ? 1.0f : (float)(1 + 9 / this.field_70547_e - this.field_70546_d / this.field_70547_e);
    }

    @Override
    public void renderParticle(CompatibleTessellator tessellator, float partialTicks, float par3, float par4, float par5, float par6, float par7) {
        Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation(this.particleTexture));
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)8192);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glAlphaFunc((int)516, (float)0.003921569f);
        RenderHelper.func_74518_a();
        tessellator.startDrawingParticles();
        float f10 = 0.1f * this.field_70544_f;
        float f11 = (float)(this.field_187123_c + (this.field_187126_f - this.field_187123_c) * (double)partialTicks - field_70556_an);
        float f12 = (float)(this.field_187124_d + (this.field_187127_g - this.field_187124_d) * (double)partialTicks - field_70554_ao);
        float f13 = (float)(this.field_187125_e + (this.field_187128_h - this.field_187125_e) * (double)partialTicks - field_70555_ap);
        tessellator.setColorRgba(this.field_70552_h, this.field_70553_i, this.field_70551_j, this.field_82339_as);
        int i = this.func_189214_a(partialTicks);
        int j = i >> 16 & 0xFFFF;
        int k = i & 0xFFFF;
        tessellator.setLightMap(j, k);
        float columnWidth = 0.2f;
        float rowHeight = 0.2f;
        int rowIndex = Math.floorDiv(this.imageIndex, 5);
        int columnIndex = this.imageIndex % 5;
        float aU = (float)(columnIndex + 1) * columnWidth;
        float aV = (float)(rowIndex + 1) * rowHeight;
        float bU = aU;
        float bV = (float)rowIndex * rowHeight;
        float cU = (float)columnIndex * columnWidth;
        float cV = bV;
        float dU = cU;
        float dV = aV;
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


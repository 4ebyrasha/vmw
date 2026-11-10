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

public class ExplosionSmokeFX
extends CompatibleParticle {
    private static final String DEFAULT_SMOKE_TEXTURE = "weaponlib:/com/vicmatskiv/weaponlib/resources/large-smoke.png";
    private String particleTexture;
    private float scale;
    private int imageIndex;
    private static final int columnCount = 4;
    private static final int rowCount = 4;
    private static final TriFunction<Float, Integer, Integer, Float> EXPLOSION_SCALE_UPDATE_FUNCTION = (currentScale, ticks, maxTicks) -> {
        currentScale = currentScale.floatValue() > 25.0f ? Float.valueOf(currentScale.floatValue() * 1.0008f) : (currentScale.floatValue() > 20.0f ? Float.valueOf(currentScale.floatValue() * 1.002f) : (currentScale.floatValue() > 15.0f ? Float.valueOf(currentScale.floatValue() * 1.004f) : (currentScale.floatValue() > 10.0f ? Float.valueOf(currentScale.floatValue() * 1.05f) : Float.valueOf(currentScale.floatValue() * 3.0f))));
        return currentScale;
    };
    private static final TriFunction<Float, Integer, Integer, Float> SMOKE_GRENADE_SCALE_UPDATE_FUNCTION = (currentScale, ticks, maxTicks) -> {
        currentScale = currentScale.floatValue() > 25.0f ? Float.valueOf(currentScale.floatValue() * 1.0008f) : (currentScale.floatValue() > 20.0f ? Float.valueOf(currentScale.floatValue() * 1.002f) : (currentScale.floatValue() > 15.0f ? Float.valueOf(currentScale.floatValue() * 1.004f) : (currentScale.floatValue() > 5.0f ? Float.valueOf(currentScale.floatValue() * 1.05f) : Float.valueOf(currentScale.floatValue() * 2.0f))));
        return currentScale;
    };
    private static final TriFunction<Float, Integer, Integer, Float> EXPLOSION_ALPHA_UPDATE_FUNCTION = (currentAlpha, ticks, maxTicks) -> {
        double alphaRadians = 0.7853981633974483 + Math.PI * (double)ticks.intValue() / (double)maxTicks.intValue();
        return Float.valueOf(0.3f * (float)Math.sin(alphaRadians > Math.PI ? Math.PI : alphaRadians));
    };
    private static final TriFunction<Float, Integer, Integer, Float> SMOKE_GRENADE_ALPHA_UPDATE_FUNCTION = (currentAlpha, ticks, maxTicks) -> {
        double alphaRadians = 0.7853981633974483 + Math.PI * (double)ticks.intValue() / (double)maxTicks.intValue();
        return Float.valueOf(0.3f * (float)Math.sin(alphaRadians > Math.PI ? Math.PI : alphaRadians));
    };
    private Behavior behavior;

    public ExplosionSmokeFX(World par1World, double positionX, double positionY, double positionZ, float scale, float motionX, float motionY, float motionZ, int particleMaxAge, Behavior behavior, String particleTexture) {
        super(par1World, positionX, positionY, positionZ, 0.0, 0.0, 0.0);
        this.field_187129_i = motionX;
        this.field_187130_j = motionY;
        this.field_187131_k = motionZ;
        if (motionX == 0.0f) {
            motionX = 1.0f;
        }
        this.behavior = behavior;
        this.field_70552_h = 1.0f;
        this.field_70553_i = 1.0f;
        this.field_70551_j = 1.0f;
        this.field_82339_as = 0.0f;
        this.scale = scale;
        this.field_70547_e = particleMaxAge == 0 ? 50 + (int)(this.field_187136_p.nextFloat() * 30.0f) : particleMaxAge;
        this.imageIndex = this.field_187136_p.nextInt(16);
        this.particleTexture = particleTexture != null ? particleTexture : DEFAULT_SMOKE_TEXTURE;
    }

    public void func_189213_a() {
        this.field_187123_c = this.field_187126_f;
        this.field_187124_d = this.field_187127_g;
        this.field_187125_e = this.field_187128_h;
        if (this.field_70546_d++ >= this.field_70547_e) {
            this.func_187112_i();
        }
        this.field_187130_j += 1.0E-5;
        CompatibilityProvider.compatibility.moveParticle(this, this.field_187129_i, this.field_187130_j, this.field_187131_k);
        this.field_187129_i *= 0.799999785423279;
        this.field_187130_j *= 0.9999999785423279;
        this.field_187131_k *= 0.799999785423279;
        this.field_82339_as = ((Float)this.behavior.alphaUpdateFunction.apply(Float.valueOf(this.field_82339_as), this.field_70546_d, this.field_70547_e)).floatValue();
        this.field_70544_f = ((Float)this.behavior.scaleUpdateFunction.apply(Float.valueOf(this.field_70544_f), this.field_70546_d, this.field_70547_e)).floatValue();
        if (this.isCollided()) {
            this.field_187129_i *= (double)0.7f;
            this.field_187131_k *= (double)0.7f;
        }
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
        float f10 = 0.1f * this.field_70544_f * this.scale;
        float f11 = (float)(this.field_187123_c + (this.field_187126_f - this.field_187123_c) * (double)partialTicks - field_70556_an);
        float f12 = (float)(this.field_187124_d + (this.field_187127_g - this.field_187124_d) * (double)partialTicks - field_70554_ao);
        float f13 = (float)(this.field_187125_e + (this.field_187128_h - this.field_187125_e) * (double)partialTicks - field_70555_ap);
        tessellator.setColorRgba(this.field_70552_h, this.field_70553_i, this.field_70551_j, this.field_82339_as);
        int i = this.func_189214_a(partialTicks);
        int j = i >> 16 & 0xFFFF;
        int k = i & 0xFFFF;
        tessellator.setLightMap(j, k);
        float columnWidth = 0.25f;
        float rowHeight = 0.25f;
        int rowIndex = Math.floorDiv(this.imageIndex, 4);
        int columnIndex = this.imageIndex % 4;
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

    static /* synthetic */ TriFunction access$000() {
        return EXPLOSION_SCALE_UPDATE_FUNCTION;
    }

    static /* synthetic */ TriFunction access$100() {
        return EXPLOSION_ALPHA_UPDATE_FUNCTION;
    }

    static /* synthetic */ TriFunction access$200() {
        return SMOKE_GRENADE_SCALE_UPDATE_FUNCTION;
    }

    static /* synthetic */ TriFunction access$300() {
        return SMOKE_GRENADE_ALPHA_UPDATE_FUNCTION;
    }

    public static enum Behavior {
        EXPLOSION(ExplosionSmokeFX.access$000(), ExplosionSmokeFX.access$100()),
        SMOKE_GRENADE(ExplosionSmokeFX.access$200(), ExplosionSmokeFX.access$300());

        private TriFunction<Float, Integer, Integer, Float> scaleUpdateFunction;
        private TriFunction<Float, Integer, Integer, Float> alphaUpdateFunction;

        private Behavior(TriFunction<Float, Integer, Integer, Float> scaleUpdateFunction, TriFunction<Float, Integer, Integer, Float> alphaUpdateFunction) {
            this.scaleUpdateFunction = scaleUpdateFunction;
            this.alphaUpdateFunction = alphaUpdateFunction;
        }
    }

    public static interface TriFunction<T, U, V, R> {
        public R apply(T var1, U var2, V var3);
    }
}


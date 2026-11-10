/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.MathHelper
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.CustomArmor;
import com.vicmatskiv.weaponlib.LightExposure;
import com.vicmatskiv.weaponlib.MiscUtils;
import com.vicmatskiv.weaponlib.SpreadableExposure;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExposureCapability;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroupSource;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroupSourceProvider;
import com.vicmatskiv.weaponlib.shader.DynamicShaderPhase;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

class PipelineShaderGroupSourceProvider
implements DynamicShaderGroupSourceProvider {
    private boolean flashEnabled;
    private boolean nightVisionEnabled;
    private boolean blurEnabled;
    private boolean vignetteEnabled;
    private float sepiaRatio;
    private float spreadableExposureProgress;
    private float vignetteRadius;
    private float brightness;
    private SpreadableExposure spreadableExposure;
    private LightExposure lightExposure;
    private float colorImpairmentR;
    private float colorImpairmentG;
    private float colorImpairmentB;
    final DynamicShaderGroupSource source = new DynamicShaderGroupSource(UUID.randomUUID(), new ResourceLocation("weaponlib:/com/vicmatskiv/weaponlib/resources/post-processing-pipeline.json")).withUniform("NightVisionEnabled", context -> Float.valueOf(this.nightVisionEnabled ? 1.0f : 0.0f)).withUniform("BlurEnabled", context -> Float.valueOf(this.blurEnabled ? 1.0f : 0.0f)).withUniform("BlurVignetteRadius", context -> Float.valueOf(0.0f)).withUniform("Radius", context -> Float.valueOf(10.0f)).withUniform("Progress", context -> Float.valueOf(this.spreadableExposureProgress)).withUniform("VignetteEnabled", context -> Float.valueOf(this.vignetteEnabled ? 1.0f : 0.0f)).withUniform("VignetteRadius", context -> Float.valueOf(this.vignetteRadius)).withUniform("Brightness", context -> Float.valueOf(this.brightness)).withUniform("SepiaRatio", context -> Float.valueOf(this.sepiaRatio)).withUniform("SepiaColor", context -> new float[]{this.colorImpairmentR, this.colorImpairmentG, this.colorImpairmentB}).withUniform("IntensityAdjust", context -> Float.valueOf(40.0f - Minecraft.func_71410_x().field_71474_y.field_74333_Y * 38.0f)).withUniform("NoiseAmplification", context -> Float.valueOf(2.0f + 3.0f * Minecraft.func_71410_x().field_71474_y.field_74333_Y));

    PipelineShaderGroupSourceProvider() {
    }

    @Override
    public DynamicShaderGroupSource getShaderSource(DynamicShaderPhase phase) {
        this.lightExposure = CompatibleExposureCapability.getExposure((Entity)CompatibilityProvider.compatibility.clientPlayer(), LightExposure.class);
        this.spreadableExposure = CompatibleExposureCapability.getExposure((Entity)CompatibilityProvider.compatibility.clientPlayer(), SpreadableExposure.class);
        this.spreadableExposureProgress = MiscUtils.smoothstep(0.0f, 1.0f, this.spreadableExposure != null ? this.spreadableExposure.getTotalDose() : 0.0f);
        this.updateNightVision();
        this.updateVignette();
        this.updateBlur();
        this.updateSepia();
        this.updateBrightness();
        this.spreadableExposure = null;
        this.lightExposure = null;
        return this.nightVisionEnabled || this.blurEnabled || this.vignetteEnabled || this.sepiaRatio > 0.0f || this.flashEnabled ? this.source : null;
    }

    private void updateBrightness() {
        this.brightness = 1.0f;
        long worldTime = CompatibilityProvider.compatibility.world((Entity)CompatibilityProvider.compatibility.clientPlayer()).func_72820_D();
        if (this.lightExposure != null && this.lightExposure.getTotalDose() > 3.0E-4f) {
            this.flashEnabled = true;
            float dayBrightness = (MathHelper.func_76126_a((float)((float)Math.PI * 2 * ((float)(worldTime % 24000L) - 24000.0f) / 24000.0f)) + 1.0f) / 2.0f;
            this.brightness = 1.0f + (100.0f + (1.0f - dayBrightness) * 100.0f) * this.lightExposure.getTotalDose();
        }
        if (this.spreadableExposure != null && !CompatibilityProvider.compatibility.clientPlayer().field_70128_L) {
            SpreadableExposure.Blackout blackout = this.spreadableExposure.getBlackout();
            blackout.update();
            switch (blackout.getPhase()) {
                case ENTER: {
                    this.brightness = 1.0f - blackout.getEnterProgress();
                    break;
                }
                case EXIT: {
                    this.brightness = blackout.getExitProgress();
                    break;
                }
                case DARK: {
                    this.brightness = 0.0f;
                    break;
                }
                case NONE: {
                    this.brightness = 1.0f;
                }
            }
        }
    }

    private void updateBlur() {
        this.blurEnabled = this.spreadableExposureProgress > 0.01f;
    }

    private void updateVignette() {
        this.vignetteEnabled = this.nightVisionEnabled;
        ItemStack helmetStack = CompatibilityProvider.compatibility.getHelmet();
        if (this.nightVisionEnabled && helmetStack != null && helmetStack.func_77973_b() instanceof CustomArmor) {
            CustomArmor helmet = (CustomArmor)helmetStack.func_77973_b();
            this.vignetteEnabled = helmet.isVignetteEnabled();
        }
        this.vignetteRadius = 0.55f;
    }

    private void updateNightVision() {
        NBTTagCompound tagCompound;
        ItemStack helmetStack = CompatibilityProvider.compatibility.getHelmet();
        this.nightVisionEnabled = helmetStack != null ? ((tagCompound = CompatibilityProvider.compatibility.getTagCompound(helmetStack)) != null ? tagCompound.func_74767_n("nv") : false) : false;
    }

    private void updateSepia() {
        this.sepiaRatio = this.spreadableExposureProgress;
        if (this.spreadableExposure != null) {
            this.colorImpairmentR = this.spreadableExposure.getColorImpairmentR();
            this.colorImpairmentG = this.spreadableExposure.getColorImpairmentG();
            this.colorImpairmentB = this.spreadableExposure.getColorImpairmentB();
        }
    }
}


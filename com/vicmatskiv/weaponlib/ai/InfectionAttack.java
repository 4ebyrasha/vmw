/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 */
package com.vicmatskiv.weaponlib.ai;

import com.vicmatskiv.weaponlib.Spreadable;
import com.vicmatskiv.weaponlib.SpreadableExposure;
import com.vicmatskiv.weaponlib.ai.CustomMobAttack;
import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExposureCapability;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class InfectionAttack
implements CustomMobAttack,
Spreadable {
    private static UUID uuid = UUID.randomUUID();
    private float dose;
    private long firstExposureImpactDelay;
    private float colorImpairmentR;
    private float colorImpairmentG;
    private float colorImpairmentB;

    public InfectionAttack(float dose, long firstExposureImpactDelay, float colorImpairmentR, float colorImpairmentG, float colorImpairmentB) {
        this.dose = dose;
        this.firstExposureImpactDelay = firstExposureImpactDelay;
        this.colorImpairmentR = colorImpairmentR;
        this.colorImpairmentG = colorImpairmentG;
        this.colorImpairmentB = colorImpairmentB;
    }

    @Override
    public boolean attackEntity(EntityCustomMob entityMob, Entity target) {
        if (target instanceof EntityLivingBase) {
            SpreadableExposure exposure = CompatibleExposureCapability.getExposure(target, SpreadableExposure.class);
            if (exposure == null) {
                exposure = new SpreadableExposure(this.firstExposureImpactDelay, CompatibilityProvider.compatibility.world((Entity)entityMob).func_82737_E()).withColorImpairment(this.colorImpairmentR, this.colorImpairmentG, this.colorImpairmentB);
                CompatibleExposureCapability.updateExposure((Entity)((EntityLivingBase)target), exposure);
            }
            exposure.apply(this, target, this.dose);
        }
        return false;
    }

    @Override
    public UUID getId() {
        return uuid;
    }
}


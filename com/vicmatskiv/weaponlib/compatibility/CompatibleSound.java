/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.SoundEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class CompatibleSound {
    public static final CompatibleSound SNOWBALL_THROW = new CompatibleSound(SoundEvents.field_187797_fA);
    private SoundEvent soundEvent;
    private ResourceLocation soundResourceLocation;

    public CompatibleSound(ResourceLocation soundResourceLocation) {
        this.soundResourceLocation = soundResourceLocation;
        this.soundEvent = new SoundEvent(soundResourceLocation);
    }

    private CompatibleSound(SoundEvent soundEvent) {
        this.soundEvent = soundEvent;
    }

    public SoundEvent getSound() {
        return this.soundEvent;
    }

    public ResourceLocation getResourceLocation() {
        return this.soundResourceLocation;
    }
}


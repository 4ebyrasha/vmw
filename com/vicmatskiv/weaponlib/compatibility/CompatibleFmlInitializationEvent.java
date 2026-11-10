/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.event.FMLInitializationEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class CompatibleFmlInitializationEvent {
    private FMLInitializationEvent event;

    public CompatibleFmlInitializationEvent(FMLInitializationEvent event) {
        this.event = event;
    }

    public FMLInitializationEvent getEvent() {
        return this.event;
    }
}


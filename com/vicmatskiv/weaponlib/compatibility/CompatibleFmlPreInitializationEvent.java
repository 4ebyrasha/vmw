/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.event.FMLPreInitializationEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CompatibleFmlPreInitializationEvent {
    private FMLPreInitializationEvent event;

    public CompatibleFmlPreInitializationEvent(FMLPreInitializationEvent event) {
        this.event = event;
    }

    public FMLPreInitializationEvent getEvent() {
        return this.event;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ServerTickEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraftforge.fml.common.gameevent.TickEvent;

public class CompatibleServerTickEvent {
    private TickEvent.ServerTickEvent event;

    public CompatibleServerTickEvent(TickEvent.ServerTickEvent event) {
        this.event = event;
    }

    public TickEvent.ServerTickEvent getEvent() {
        return this.event;
    }
}


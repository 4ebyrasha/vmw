/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraftforge.fml.common.gameevent.TickEvent;

public class CompatibleClientTickEvent {
    private TickEvent.ClientTickEvent event;

    public CompatibleClientTickEvent(TickEvent.ClientTickEvent event) {
        this.event = event;
    }

    public Phase getPhase() {
        return this.event.phase == TickEvent.Phase.START ? Phase.START : Phase.END;
    }

    public static enum Phase {
        START,
        END;

    }
}


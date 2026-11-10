/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraftforge.fml.common.gameevent.TickEvent;

public class CompatibleRenderTickEvent {
    private TickEvent.RenderTickEvent event;

    public CompatibleRenderTickEvent(TickEvent.RenderTickEvent event) {
        this.event = event;
    }

    public Phase getPhase() {
        return this.event.phase == TickEvent.Phase.START ? Phase.START : Phase.END;
    }

    public float getRenderTickTime() {
        return this.event.renderTickTime;
    }

    public static enum Phase {
        START,
        END;

    }
}


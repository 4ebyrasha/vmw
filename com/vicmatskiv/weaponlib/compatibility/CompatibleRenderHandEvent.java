/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.RenderHandEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraftforge.client.event.RenderHandEvent;

public class CompatibleRenderHandEvent {
    private RenderHandEvent event;

    public CompatibleRenderHandEvent(RenderHandEvent event) {
        this.event = event;
    }

    public float getPartialTicks() {
        return this.event.getPartialTicks();
    }
}


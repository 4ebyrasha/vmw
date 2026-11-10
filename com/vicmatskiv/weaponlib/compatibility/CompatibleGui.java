/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Pre
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public abstract class CompatibleGui
extends Gui {
    @SubscribeEvent
    public final void onRenderHud(RenderGameOverlayEvent.Pre event) {
        this.onCompatibleRenderHud(event);
    }

    public abstract void onCompatibleRenderHud(RenderGameOverlayEvent.Pre var1);

    @SubscribeEvent
    public final void onRenderCrosshair(RenderGameOverlayEvent.Pre event) {
        this.onCompatibleRenderCrosshair(event);
    }

    public abstract void onCompatibleRenderCrosshair(RenderGameOverlayEvent.Pre var1);
}


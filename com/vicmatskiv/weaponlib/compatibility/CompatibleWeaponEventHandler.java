/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.FOVUpdateEvent
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.client.event.MouseEvent
 *  net.minecraftforge.client.event.RenderLivingEvent$Pre
 *  net.minecraftforge.event.entity.EntityJoinWorldEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityJoinWorldEvent;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public abstract class CompatibleWeaponEventHandler {
    @SubscribeEvent
    public final void onGuiOpenEvent(GuiOpenEvent event) {
        this.onCompatibleGuiOpenEvent(event);
    }

    protected abstract void onCompatibleGuiOpenEvent(GuiOpenEvent var1);

    @SubscribeEvent
    public final void zoom(FOVUpdateEvent event) {
        this.compatibleZoom(event);
    }

    protected abstract void compatibleZoom(FOVUpdateEvent var1);

    @SubscribeEvent
    public final void onMouse(MouseEvent event) {
        this.onCompatibleMouse(event);
    }

    protected abstract void onCompatibleMouse(MouseEvent var1);

    @SubscribeEvent
    public final void handleRenderLivingEvent(RenderLivingEvent.Pre event) {
        this.onCompatibleHandleRenderLivingEvent(event);
    }

    protected abstract void onCompatibleHandleRenderLivingEvent(RenderLivingEvent.Pre var1);

    @SubscribeEvent
    public final void onEntityJoinedWorldEvent(EntityJoinWorldEvent event) {
        this.onCompatibleEntityJoinedWorldEvent(new CompatibleEntityJoinWorldEvent(event));
    }

    protected abstract void onCompatibleEntityJoinedWorldEvent(CompatibleEntityJoinWorldEvent var1);

    protected abstract ModContext getModContext();
}


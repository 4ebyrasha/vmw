/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraftforge.client.event.RenderHandEvent
 *  net.minecraftforge.client.event.RenderPlayerEvent$Post
 *  net.minecraftforge.client.event.RenderPlayerEvent$Pre
 *  net.minecraftforge.client.event.TextureStitchEvent$Pre
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.RenderingPhase;
import com.vicmatskiv.weaponlib.compatibility.CompatibleClientTickEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderHandEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderPlayerPreEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderTickEvent;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class CompatibleClientEventHandler {
    private Entity origRenderVeiwEntity;

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public final void onClientTick(TickEvent.ClientTickEvent event) {
        this.onCompatibleClientTick(new CompatibleClientTickEvent(event));
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public final void onRenderTickEvent(TickEvent.RenderTickEvent event) {
        this.onCompatibleRenderTickEvent(new CompatibleRenderTickEvent(event));
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public final void onPreRenderPlayer(RenderPlayerEvent.Pre event) {
        ClientModContext modContext = (ClientModContext)this.getModContext();
        if (modContext.getSafeGlobals().renderingPhase.get() == RenderingPhase.RENDER_PERSPECTIVE && event.getEntityPlayer() instanceof EntityPlayerSP) {
            this.origRenderVeiwEntity = event.getRenderer().func_177068_d().field_78734_h;
            event.getRenderer().func_177068_d().field_78734_h = event.getEntityPlayer();
        }
        this.onCompatibleRenderPlayerPreEvent(new CompatibleRenderPlayerPreEvent(event));
    }

    protected abstract ModContext getModContext();

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public final void onPostRenderPlayer(RenderPlayerEvent.Post event) {
        ClientModContext modContext = (ClientModContext)this.getModContext();
        if (modContext.getSafeGlobals().renderingPhase.get() == RenderingPhase.RENDER_PERSPECTIVE && event.getEntityPlayer() instanceof EntityPlayerSP) {
            event.getRenderer().func_177068_d().field_78734_h = this.origRenderVeiwEntity;
        }
    }

    @SubscribeEvent
    public void onRenderHand(RenderHandEvent event) {
        this.onCompatibleRenderHand(new CompatibleRenderHandEvent(event));
    }

    @SubscribeEvent
    public void onTextureStitchEvent(TextureStitchEvent.Pre event) {
        event.getMap().func_174942_a(this.getModContext().getNamedResource("particle/blood"));
    }

    protected abstract void onCompatibleRenderTickEvent(CompatibleRenderTickEvent var1);

    protected abstract void onCompatibleClientTick(CompatibleClientTickEvent var1);

    protected abstract void onCompatibleRenderHand(CompatibleRenderHandEvent var1);

    protected abstract void onCompatibleRenderPlayerPreEvent(CompatibleRenderPlayerPreEvent var1);
}


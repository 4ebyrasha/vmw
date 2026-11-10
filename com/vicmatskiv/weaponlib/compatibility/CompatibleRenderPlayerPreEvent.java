/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.client.event.RenderPlayerEvent$Pre
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;

public class CompatibleRenderPlayerPreEvent {
    private RenderPlayerEvent.Pre event;

    public CompatibleRenderPlayerPreEvent(RenderPlayerEvent.Pre event) {
        this.event = event;
    }

    public EntityPlayer getPlayer() {
        return this.event.getEntityPlayer();
    }
}


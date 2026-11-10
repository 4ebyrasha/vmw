/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerRespawnEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class CompatiblePlayerRespawnEvent {
    private PlayerEvent.PlayerRespawnEvent event;

    public CompatiblePlayerRespawnEvent(PlayerEvent.PlayerRespawnEvent event) {
        this.event = event;
    }

    public EntityPlayer getPlayer() {
        return this.event.player;
    }
}


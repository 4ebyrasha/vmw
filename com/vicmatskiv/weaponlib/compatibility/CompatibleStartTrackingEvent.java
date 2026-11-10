/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.event.entity.player.PlayerEvent$StartTracking
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class CompatibleStartTrackingEvent {
    private PlayerEvent.StartTracking event;

    public CompatibleStartTrackingEvent(PlayerEvent.StartTracking event) {
        this.event = event;
    }

    public EntityPlayer getPlayer() {
        return this.event.getEntityPlayer();
    }

    public Entity getTarget() {
        return this.event.getTarget();
    }

    public Entity getEntity() {
        return this.event.getEntity();
    }
}


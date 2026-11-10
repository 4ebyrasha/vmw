/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteract
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class CompatiblePlayerEntityInteractEvent {
    private PlayerInteractEvent event;

    public CompatiblePlayerEntityInteractEvent(PlayerInteractEvent.EntityInteract event) {
        this.event = event;
    }

    public Entity getEntity() {
        return this.event.getEntity();
    }

    public EntityPlayer getPlayer() {
        return this.event.getEntityPlayer();
    }
}


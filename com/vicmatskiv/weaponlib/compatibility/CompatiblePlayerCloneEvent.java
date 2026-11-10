/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.event.entity.player.PlayerEvent$Clone
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class CompatiblePlayerCloneEvent {
    private PlayerEvent.Clone event;

    public CompatiblePlayerCloneEvent(PlayerEvent.Clone event) {
        this.event = event;
    }

    public void copyInventory() {
        this.event.getEntityPlayer().field_71071_by.func_70455_b(this.event.getOriginal().field_71071_by);
    }

    public EntityPlayer getPlayer() {
        return this.event.getEntityPlayer();
    }

    public EntityPlayer getOriginalPlayer() {
        return this.event.getOriginal();
    }
}


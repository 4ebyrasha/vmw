/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.event.entity.player.PlayerDropsEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import java.util.List;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;

public class CompatiblePlayerDropsEvent {
    private PlayerDropsEvent event;

    public CompatiblePlayerDropsEvent(PlayerDropsEvent event) {
        this.event = event;
    }

    public List<EntityItem> getDrops() {
        return this.event.getDrops();
    }

    public EntityPlayer getPlayer() {
        return this.event.getEntityPlayer();
    }
}


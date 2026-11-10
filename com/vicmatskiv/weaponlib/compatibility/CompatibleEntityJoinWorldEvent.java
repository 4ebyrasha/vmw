/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.EntityJoinWorldEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class CompatibleEntityJoinWorldEvent {
    private EntityJoinWorldEvent event;

    public CompatibleEntityJoinWorldEvent(EntityJoinWorldEvent event) {
        this.event = event;
    }

    public World getWorld() {
        return this.event.getWorld();
    }

    public Entity getEntity() {
        return this.event.getEntity();
    }
}


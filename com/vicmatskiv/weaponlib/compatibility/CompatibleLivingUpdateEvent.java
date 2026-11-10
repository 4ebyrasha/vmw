/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraftforge.event.entity.living.LivingEvent$LivingUpdateEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.living.LivingEvent;

public class CompatibleLivingUpdateEvent {
    private LivingEvent.LivingUpdateEvent event;

    public CompatibleLivingUpdateEvent(LivingEvent.LivingUpdateEvent event) {
        this.event = event;
    }

    public Entity getEntity() {
        return this.event.getEntity();
    }

    public EntityLivingBase getEntityLiving() {
        return this.event.getEntityLiving();
    }
}


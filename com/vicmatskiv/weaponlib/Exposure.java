/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.network.UniversallySerializable;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public interface Exposure
extends UniversallySerializable {
    public boolean isEffective(World var1);

    public void update(Entity var1);

    public long getLastSyncTimestamp();

    public void updateFrom(Exposure var1);
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.mission.Mission;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import java.util.Map;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;

public interface MissionAssigner {
    public int getEntityId();

    public void redeem(Mission var1, EntityPlayer var2);

    public Map<UUID, MissionOffering> getMissionOfferings();

    public void assign(MissionOffering var1, EntityPlayer var2);
}


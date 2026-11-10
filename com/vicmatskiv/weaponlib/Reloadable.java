/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib;

import net.minecraft.entity.player.EntityPlayer;

public interface Reloadable {
    public void reloadMainHeldItemForPlayer(EntityPlayer var1);

    public void unloadMainHeldItemForPlayer(EntityPlayer var1);
}


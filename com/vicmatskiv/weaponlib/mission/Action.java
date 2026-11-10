/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.network.UniversallySerializable;
import net.minecraft.entity.player.EntityPlayer;

public abstract class Action
implements UniversallySerializable {
    public abstract int matches(Action var1, EntityPlayer var2);

    public Object getResult(EntityPlayer player) {
        return null;
    }

    public boolean isTransient() {
        return true;
    }

    public boolean quantityMatches(EntityPlayer player, int requiredQuantity) {
        return false;
    }
}


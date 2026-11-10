/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraftforge.fml.relauncher.Side;

public enum CompatibleSide {
    CLIENT(Side.CLIENT),
    SERVER(Side.SERVER);

    private Side side;

    private CompatibleSide(Side side) {
        this.side = side;
    }

    public static CompatibleSide fromSide(Side side) {
        if (side == Side.SERVER) {
            return SERVER;
        }
        return CLIENT;
    }

    public Side getSide() {
        return this.side;
    }
}


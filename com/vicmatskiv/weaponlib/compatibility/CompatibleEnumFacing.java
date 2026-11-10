/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumFacing
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.util.EnumFacing;

public enum CompatibleEnumFacing {
    DOWN(EnumFacing.DOWN),
    UP(EnumFacing.UP),
    NORTH(EnumFacing.NORTH),
    SOUTH(EnumFacing.SOUTH),
    WEST(EnumFacing.WEST),
    EAST(EnumFacing.EAST);

    private EnumFacing enumFacing;

    private CompatibleEnumFacing(EnumFacing enumFacing) {
        this.enumFacing = enumFacing;
    }

    public EnumFacing getEnumFacing() {
        return this.enumFacing;
    }

    static CompatibleEnumFacing valueOf(EnumFacing enumFacing) {
        CompatibleEnumFacing result = null;
        switch (enumFacing) {
            case UP: {
                result = UP;
                break;
            }
            case DOWN: {
                result = DOWN;
                break;
            }
            case EAST: {
                result = EAST;
                break;
            }
            case WEST: {
                result = WEST;
                break;
            }
            case NORTH: {
                result = NORTH;
                break;
            }
            case SOUTH: {
                result = SOUTH;
            }
        }
        return result;
    }
}


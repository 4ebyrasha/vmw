/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumHandSide
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.util.EnumHandSide;

public enum CompatibleEnumHandSide {
    LEFT,
    RIGHT;


    public static CompatibleEnumHandSide fromEnumHandSide(EnumHandSide side) {
        CompatibleEnumHandSide result = null;
        switch (side) {
            case LEFT: {
                result = LEFT;
                break;
            }
            case RIGHT: {
                result = RIGHT;
            }
        }
        return result;
    }
}


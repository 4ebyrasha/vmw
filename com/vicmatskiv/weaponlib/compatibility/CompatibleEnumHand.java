/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumHand
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.util.EnumHand;

public enum CompatibleEnumHand {
    MAIN_HAND,
    OFF_HAND;


    public static CompatibleEnumHand valueOf(EnumHand side) {
        CompatibleEnumHand result = null;
        switch (side) {
            case MAIN_HAND: {
                result = MAIN_HAND;
                break;
            }
            case OFF_HAND: {
                result = OFF_HAND;
            }
        }
        return result;
    }
}


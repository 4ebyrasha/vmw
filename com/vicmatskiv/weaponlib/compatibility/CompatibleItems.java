/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CompatibleItems {
    public static final CompatibleItems GUNPOWDER = new CompatibleItems(Items.field_151016_H){};
    public static final CompatibleItems DYE = new CompatibleItems(Items.field_151100_aR){};
    public static final CompatibleItems IRON_INGOT = new CompatibleItems(Items.field_151042_j){};
    public static final CompatibleItems GOLD_INGOT = new CompatibleItems(Items.field_151043_k){};
    public static final CompatibleItems EMERALD = new CompatibleItems(Items.field_151166_bC){};
    public static final CompatibleItems DIAMOND = new CompatibleItems(Items.field_151045_i){};
    public static final CompatibleItems GOLD_NUGGET = new CompatibleItems(Items.field_151074_bl){};
    public static final CompatibleItems STRING = new CompatibleItems(Items.field_151007_F){};
    public static final CompatibleItems COAL = new CompatibleItems(Items.field_151044_h){};
    public static final CompatibleItems WATER_BUCKET = new CompatibleItems(Items.field_151131_as){};
    public static final CompatibleItems STICK = new CompatibleItems(Items.field_151055_y){};
    public static final CompatibleItems FLINT_AND_STEEL = new CompatibleItems(Items.field_151033_d){};
    public static final CompatibleItems SLIME_BALL = new CompatibleItems(Items.field_151123_aH){};
    private Item item;

    private CompatibleItems(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return this.item;
    }
}


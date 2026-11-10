/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class CompatibleBlocks {
    public static final CompatibleBlocks PLANK = new CompatibleBlocks(Blocks.field_150344_f);
    public static final CompatibleBlocks AIR = new CompatibleBlocks(Blocks.field_150350_a);
    public static final CompatibleBlocks TALLGRASS = new CompatibleBlocks((Block)Blocks.field_150329_H);
    public static final CompatibleBlocks LEAVES = new CompatibleBlocks((Block)Blocks.field_150362_t);
    public static final CompatibleBlocks LEAVES2 = new CompatibleBlocks((Block)Blocks.field_150361_u);
    public static final CompatibleBlocks FIRE = new CompatibleBlocks((Block)Blocks.field_150480_ab);
    public static final CompatibleBlocks HAY = new CompatibleBlocks(Blocks.field_150407_cf);
    public static final CompatibleBlocks DOUBLE_PLANT = new CompatibleBlocks((Block)Blocks.field_150398_cm);
    public static final CompatibleBlocks WEB = new CompatibleBlocks(Blocks.field_150321_G);
    public static final CompatibleBlocks WHEAT = new CompatibleBlocks(Blocks.field_150464_aj);
    public static final CompatibleBlocks STONE = new CompatibleBlocks(Blocks.field_150348_b);
    public static final CompatibleBlocks SAND = new CompatibleBlocks((Block)Blocks.field_150354_m);
    public static final CompatibleBlocks TNT = new CompatibleBlocks(Blocks.field_150335_W);
    public static final CompatibleBlocks GLASS_PANE = new CompatibleBlocks(Blocks.field_150410_aZ);
    public static final CompatibleBlocks WOOL = new CompatibleBlocks(Blocks.field_150325_L);
    public static final CompatibleBlocks SANDSTONE = new CompatibleBlocks(Blocks.field_150322_A);
    public static final CompatibleBlocks STONE_BUTTON = new CompatibleBlocks(Blocks.field_150430_aB);
    public static final CompatibleBlocks CRAFTING_TABLE = new CompatibleBlocks(Blocks.field_150462_ai);
    private Block block;

    private CompatibleBlocks(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return this.block;
    }
}


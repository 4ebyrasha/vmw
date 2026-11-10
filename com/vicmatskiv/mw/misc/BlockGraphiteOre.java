/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.SoundType
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.item.Item
 */
package com.vicmatskiv.mw.misc;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockGraphiteOre
extends Block {
    public BlockGraphiteOre() {
        super(Material.field_151576_e);
        this.func_149663_c("mw_GraphiteOre");
        this.func_149711_c(6.0f);
        this.func_149752_b(15.0f);
        this.func_149672_a(SoundType.field_185851_d);
        this.setHarvestLevel("pickaxe", 2);
        this.func_149647_a(ModernWarfareMod.BlocksTab);
    }

    public Item func_180660_a(IBlockState state, Random rand, int fortune) {
        return Ores.GraphiteChunk;
    }
}


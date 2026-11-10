/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.SoundType
 *  net.minecraft.block.material.Material
 */
package com.vicmatskiv.mw.misc;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCopperOre
extends Block {
    public BlockCopperOre() {
        super(Material.field_151576_e);
        this.func_149663_c("mw_CopperOre");
        this.func_149711_c(6.0f);
        this.func_149752_b(15.0f);
        this.func_149672_a(SoundType.field_185851_d);
        this.setHarvestLevel("pickaxe", 2);
        this.func_149647_a(ModernWarfareMod.BlocksTab);
    }

    public Block getBlockDropped(int meta, Random rand, int fortune) {
        return Ores.CopperOre;
    }
}


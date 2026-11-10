/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.feature.WorldGenMinable
 *  net.minecraftforge.fml.common.IWorldGenerator
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public abstract class CompatibleWorldGenerator
implements IWorldGenerator {
    public void generate(Block block, int maxVeinSize, CompatibleBlocks target, World world, Random random, int posX, int posY, int posZ) {
        new WorldGenMinable(block.func_176223_P(), maxVeinSize).func_180709_b(world, random, new BlockPos(posX, posY, posZ));
    }
}


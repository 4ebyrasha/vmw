/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.world.World
 *  net.minecraft.world.chunk.IChunkProvider
 *  net.minecraft.world.gen.IChunkGenerator
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWorldGenerator;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldGeneratorEventHandler
extends CompatibleWorldGenerator {
    private ConfigurationManager configurationManager;

    public WorldGeneratorEventHandler(ConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.field_73011_w.getDimension()) {
            case -1: {
                this.generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            }
            case 0: {
                this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            }
            case 1: {
                this.generateEnd(world, random, chunkX * 16, chunkZ * 16);
            }
        }
    }

    private void generateEnd(World world, Random random, int x, int z) {
    }

    private void generateSurface(World world, Random random, int x, int z) {
        this.addOreSpawn(Ores.CopperOre, CompatibleBlocks.STONE, world, this.configurationManager.getOre("CopperOre").getSpawnsPerChunk(), random, x, z, 9, 9, 6 + random.nextInt(4), 2, 110);
        this.addOreSpawn(Ores.SulfurOre, CompatibleBlocks.STONE, world, this.configurationManager.getOre("SulfurOre").getSpawnsPerChunk(), random, x, z, 13, 13, 6 + random.nextInt(7), 5, 90);
        this.addOreSpawn(Ores.LeadOre, CompatibleBlocks.STONE, world, this.configurationManager.getOre("LeadOre").getSpawnsPerChunk(), random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);
        this.addOreSpawn(Ores.TinOre, CompatibleBlocks.STONE, world, this.configurationManager.getOre("TinOre").getSpawnsPerChunk(), random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);
        this.addOreSpawn(Ores.GraphiteOre, CompatibleBlocks.STONE, world, this.configurationManager.getOre("GraphiteOre").getSpawnsPerChunk(), random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);
    }

    private void generateNether(World world, Random random, int x, int z) {
    }

    public void addOreSpawn(Block block, CompatibleBlocks target, World world, int chancesToSpawn, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int minY, int maxY) {
        int diffBetweenMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; ++x) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBetweenMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            this.generate(block, maxVeinSize, target, world, random, posX, posY, posZ);
        }
    }
}


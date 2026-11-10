/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.compatibility.CompatibleVec3;
import java.util.function.BiPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CompatibleRayTracing {
    public static CompatibleRayTraceResult rayTraceBlocks(World world, CompatibleVec3 cvec31, CompatibleVec3 cvec32, BiPredicate<Block, CompatibleBlockState> isCollidable) {
        Vec3d vec31 = cvec31.getVec();
        Vec3d vec32 = cvec32.getVec();
        boolean ignoreBlockWithoutBoundingBox = false;
        boolean returnLastUncollidableBlock = false;
        if (!(Double.isNaN(vec31.field_72450_a) || Double.isNaN(vec31.field_72448_b) || Double.isNaN(vec31.field_72449_c))) {
            if (!(Double.isNaN(vec32.field_72450_a) || Double.isNaN(vec32.field_72448_b) || Double.isNaN(vec32.field_72449_c))) {
                RayTraceResult raytraceresult;
                int i = MathHelper.func_76128_c((double)vec32.field_72450_a);
                int j = MathHelper.func_76128_c((double)vec32.field_72448_b);
                int k = MathHelper.func_76128_c((double)vec32.field_72449_c);
                int l = MathHelper.func_76128_c((double)vec31.field_72450_a);
                int i1 = MathHelper.func_76128_c((double)vec31.field_72448_b);
                int j1 = MathHelper.func_76128_c((double)vec31.field_72449_c);
                BlockPos blockpos = new BlockPos(l, i1, j1);
                IBlockState iblockstate = world.func_180495_p(blockpos);
                Block block = iblockstate.func_177230_c();
                CompatibleBlockState compatibleBlockState = new CompatibleBlockState(iblockstate);
                if ((!ignoreBlockWithoutBoundingBox || iblockstate.func_185890_d((IBlockAccess)world, blockpos) != Block.field_185506_k) && isCollidable.test(block, compatibleBlockState) && (raytraceresult = iblockstate.func_185910_a(world, blockpos, vec31, vec32)) != null) {
                    return CompatibleRayTraceResult.fromRayTraceResult(raytraceresult);
                }
                RayTraceResult raytraceresult2 = null;
                int k1 = 200;
                while (k1-- >= 0) {
                    EnumFacing enumfacing;
                    if (Double.isNaN(vec31.field_72450_a) || Double.isNaN(vec31.field_72448_b) || Double.isNaN(vec31.field_72449_c)) {
                        return null;
                    }
                    if (l == i && i1 == j && j1 == k) {
                        return returnLastUncollidableBlock ? CompatibleRayTraceResult.fromRayTraceResult(raytraceresult2) : null;
                    }
                    boolean flag2 = true;
                    boolean flag = true;
                    boolean flag1 = true;
                    double d0 = 999.0;
                    double d1 = 999.0;
                    double d2 = 999.0;
                    if (i > l) {
                        d0 = (double)l + 1.0;
                    } else if (i < l) {
                        d0 = (double)l + 0.0;
                    } else {
                        flag2 = false;
                    }
                    if (j > i1) {
                        d1 = (double)i1 + 1.0;
                    } else if (j < i1) {
                        d1 = (double)i1 + 0.0;
                    } else {
                        flag = false;
                    }
                    if (k > j1) {
                        d2 = (double)j1 + 1.0;
                    } else if (k < j1) {
                        d2 = (double)j1 + 0.0;
                    } else {
                        flag1 = false;
                    }
                    double d3 = 999.0;
                    double d4 = 999.0;
                    double d5 = 999.0;
                    double d6 = vec32.field_72450_a - vec31.field_72450_a;
                    double d7 = vec32.field_72448_b - vec31.field_72448_b;
                    double d8 = vec32.field_72449_c - vec31.field_72449_c;
                    if (flag2) {
                        d3 = (d0 - vec31.field_72450_a) / d6;
                    }
                    if (flag) {
                        d4 = (d1 - vec31.field_72448_b) / d7;
                    }
                    if (flag1) {
                        d5 = (d2 - vec31.field_72449_c) / d8;
                    }
                    if (d3 == -0.0) {
                        d3 = -1.0E-4;
                    }
                    if (d4 == -0.0) {
                        d4 = -1.0E-4;
                    }
                    if (d5 == -0.0) {
                        d5 = -1.0E-4;
                    }
                    if (d3 < d4 && d3 < d5) {
                        enumfacing = i > l ? EnumFacing.WEST : EnumFacing.EAST;
                        vec31 = new Vec3d(d0, vec31.field_72448_b + d7 * d3, vec31.field_72449_c + d8 * d3);
                    } else if (d4 < d5) {
                        enumfacing = j > i1 ? EnumFacing.DOWN : EnumFacing.UP;
                        vec31 = new Vec3d(vec31.field_72450_a + d6 * d4, d1, vec31.field_72449_c + d8 * d4);
                    } else {
                        enumfacing = k > j1 ? EnumFacing.NORTH : EnumFacing.SOUTH;
                        vec31 = new Vec3d(vec31.field_72450_a + d6 * d5, vec31.field_72448_b + d7 * d5, d2);
                    }
                    l = MathHelper.func_76128_c((double)vec31.field_72450_a) - (enumfacing == EnumFacing.EAST ? 1 : 0);
                    i1 = MathHelper.func_76128_c((double)vec31.field_72448_b) - (enumfacing == EnumFacing.UP ? 1 : 0);
                    j1 = MathHelper.func_76128_c((double)vec31.field_72449_c) - (enumfacing == EnumFacing.SOUTH ? 1 : 0);
                    blockpos = new BlockPos(l, i1, j1);
                    IBlockState iblockstate1 = world.func_180495_p(blockpos);
                    Block block1 = iblockstate1.func_177230_c();
                    CompatibleBlockState compatibleBlockState1 = new CompatibleBlockState(iblockstate1);
                    if (ignoreBlockWithoutBoundingBox && iblockstate1.func_185904_a() != Material.field_151567_E && iblockstate1.func_185890_d((IBlockAccess)world, blockpos) == Block.field_185506_k) continue;
                    if (isCollidable.test(block1, compatibleBlockState1)) {
                        RayTraceResult raytraceresult1 = iblockstate1.func_185910_a(world, blockpos, vec31, vec32);
                        if (raytraceresult1 == null) continue;
                        return CompatibleRayTraceResult.fromRayTraceResult(raytraceresult1);
                    }
                    raytraceresult2 = new RayTraceResult(RayTraceResult.Type.MISS, vec31, enumfacing, blockpos);
                }
                return returnLastUncollidableBlock ? CompatibleRayTraceResult.fromRayTraceResult(raytraceresult2) : null;
            }
            return null;
        }
        return null;
    }
}


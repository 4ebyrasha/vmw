/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumBlockRenderType
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockRenderType;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEnumFacing;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEnumHand;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMaterial;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class CompatibleBlockContainer
extends BlockContainer {
    protected CompatibleBlockContainer(CompatibleMaterial materialIn) {
        super(materialIn.getMaterial());
    }

    public void setBlockTextureName(String string) {
    }

    public Block setBlockName(String name) {
        return super.func_149663_c(name);
    }

    public final boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
        return this.isNormalCube(new CompatibleBlockState(state), new CompatibleBlockPos(pos));
    }

    public boolean isNormalCube(CompatibleBlockState state, CompatibleBlockPos pos) {
        return false;
    }

    public final EnumBlockRenderType func_149645_b(IBlockState state) {
        return this.getRenderType(new CompatibleBlockState(state)).getRenderType();
    }

    public CompatibleBlockRenderType getRenderType(CompatibleBlockState state) {
        return CompatibleBlockRenderType.INVISIBLE;
    }

    public boolean func_149662_c(IBlockState state) {
        return this.isOpaqueCube(new CompatibleBlockState(state));
    }

    public boolean isOpaqueCube(CompatibleBlockState state) {
        return true;
    }

    public final boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return this.onBlockActivated(worldIn, new CompatibleBlockPos(pos), new CompatibleBlockState(state), playerIn, CompatibleEnumHand.valueOf(hand), CompatibleEnumFacing.valueOf(facing), hitX, hitY, hitZ);
    }

    public boolean onBlockActivated(World worldIn, CompatibleBlockPos pos, CompatibleBlockState state, EntityPlayer playerIn, CompatibleEnumHand hand, CompatibleEnumFacing facing, float hitX, float hitY, float hitZ) {
        return false;
    }

    public final void func_180633_a(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        this.onBlockPlacedBy(worldIn, new CompatibleBlockPos(pos), new CompatibleBlockState(state), placer, stack);
    }

    public void onBlockPlacedBy(World worldIn, CompatibleBlockPos pos, CompatibleBlockState state, EntityLivingBase placer, ItemStack stack) {
    }
}


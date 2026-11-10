/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockHorizontal
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyDirection
 *  net.minecraft.block.state.BlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.tile;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockContainer;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockRenderType;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEnumFacing;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEnumHand;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMaterial;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMathHelper;
import com.vicmatskiv.weaponlib.tile.CustomTileEntity;
import java.util.function.Function;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CustomTileEntityBlock
extends CompatibleBlockContainer {
    public static final PropertyDirection FACING = BlockHorizontal.field_185512_D;
    private Class<? extends TileEntity> tileEntityClass;
    private Function<IBlockState, AxisAlignedBB> customBoundingBox;

    protected CustomTileEntityBlock(CompatibleMaterial material, Class<? extends TileEntity> tileEntityClass) {
        super(material);
        this.tileEntityClass = tileEntityClass;
        this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a((IProperty)FACING, (Comparable)EnumFacing.NORTH));
    }

    protected BlockStateContainer func_180661_e() {
        return new BlockStateContainer((Block)this, new IProperty[]{FACING});
    }

    public void setBoundingBox(Function<IBlockState, AxisAlignedBB> customBoundingBox) {
        this.customBoundingBox = customBoundingBox;
    }

    public AxisAlignedBB func_185496_a(IBlockState state, IBlockAccess source, BlockPos pos) {
        return this.customBoundingBox != null ? this.customBoundingBox.apply(state) : super.func_185496_a(state, source, pos);
    }

    @Override
    public boolean isNormalCube(CompatibleBlockState state, CompatibleBlockPos pos) {
        return false;
    }

    @Override
    public CompatibleBlockRenderType getRenderType(CompatibleBlockState state) {
        return CompatibleBlockRenderType.INVISIBLE;
    }

    @Override
    public boolean isOpaqueCube(CompatibleBlockState state) {
        return false;
    }

    public TileEntity func_149915_a(World world, int p_149915_2_) {
        try {
            return this.tileEntityClass.newInstance();
        }
        catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("Cannot create tile entity from class " + this.tileEntityClass, e);
        }
    }

    @Override
    public boolean onBlockActivated(World world, CompatibleBlockPos pos, CompatibleBlockState state, EntityPlayer player, CompatibleEnumHand hand, CompatibleEnumFacing facing, float hitX, float hitY, float hitZ) {
        CustomTileEntity entity = (CustomTileEntity)CompatibilityProvider.compatibility.getTileEntity(world, pos);
        if (entity != null) {
            entity.onEntityBlockActivated(world, pos, player);
        }
        CompatibilityProvider.compatibility.markBlockForUpdate(world, pos);
        return true;
    }

    @Override
    public void onBlockPlacedBy(World world, CompatibleBlockPos pos, CompatibleBlockState state, EntityLivingBase player, ItemStack stack) {
        CustomTileEntity entity = (CustomTileEntity)CompatibilityProvider.compatibility.getTileEntity(world, pos);
        if (entity != null) {
            int side = CompatibleMathHelper.floor_double((double)(player.field_70177_z / 90.0f) + 0.5) & 3;
            entity.setSide(side);
        }
    }

    public IBlockState func_176203_a(int meta) {
        return this.func_176223_P().func_177226_a((IProperty)FACING, (Comparable)EnumFacing.func_176731_b((int)(meta & 3)));
    }

    public int func_176201_c(IBlockState state) {
        int i = 0;
        return i |= ((EnumFacing)state.func_177229_b((IProperty)FACING)).func_176736_b();
    }

    public IBlockState func_180642_a(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        EnumFacing enumfacing = placer.func_174811_aO();
        try {
            return super.func_180642_a(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).func_177226_a((IProperty)FACING, (Comparable)enumfacing);
        }
        catch (IllegalArgumentException var11) {
            if (!worldIn.field_72995_K && placer instanceof EntityPlayer) {
                placer.func_145747_a((ITextComponent)new TextComponentTranslation("Invalid damage property. Please pick in [0, 1, 2]", new Object[0]));
            }
            return super.func_180642_a(worldIn, pos, facing, hitX, hitY, hitZ, 0, placer).func_177226_a((IProperty)FACING, (Comparable)enumfacing);
        }
    }
}


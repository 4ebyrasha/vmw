/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.util.ITooltipFlag
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.compatibility;

import java.util.List;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class CompatibleItem
extends Item {
    public void func_77622_d(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        super.func_77622_d(stack, worldIn, playerIn);
        stack.func_77982_d(new NBTTagCompound());
    }

    public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer player, EnumHand hand) {
        return new ActionResult(EnumActionResult.SUCCESS, (Object)this.onCompatibleItemRightClick(player.func_184614_ca(), world, player, hand == EnumHand.MAIN_HAND));
    }

    protected ItemStack onCompatibleItemRightClick(ItemStack itemStack, World world, EntityPlayer player, boolean mainHand) {
        return itemStack;
    }

    public EnumActionResult onItemUseFirst(EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
        return this.onItemUseFirst(player.func_184614_ca(), player, world) ? EnumActionResult.SUCCESS : EnumActionResult.PASS;
    }

    protected boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world) {
        return false;
    }

    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return true;
    }

    public EnumActionResult func_180614_a(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return EnumActionResult.SUCCESS;
    }

    public void func_77624_a(ItemStack itemStack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        this.addInformation(itemStack, tooltip, true);
    }

    public void addInformation(ItemStack itemStack, List<String> info, boolean flag) {
    }
}


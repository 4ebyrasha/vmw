/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.Grenades;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GrenadesTab
extends CreativeTabs {
    public GrenadesTab(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @SideOnly(value=Side.CLIENT)
    public ItemStack func_78016_d() {
        return new ItemStack((Item)Grenades.FuseGrenade);
    }
}


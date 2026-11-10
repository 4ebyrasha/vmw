/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.Armors;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SpartanTab
extends CreativeTabs {
    public SpartanTab(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @SideOnly(value=Side.CLIENT)
    public ItemStack func_78016_d() {
        return new ItemStack(Armors.MKVIMainhelmet);
    }
}


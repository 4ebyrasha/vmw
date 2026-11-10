/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.inventory.InventoryTab;
import com.vicmatskiv.weaponlib.inventory.InventoryTabs;
import net.minecraft.item.ItemStack;

public class StandardPlayerInventoryTab
extends InventoryTab {
    public StandardPlayerInventoryTab() {
        super(0, 0, 0, new ItemStack(CompatibleBlocks.CRAFTING_TABLE.getBlock()));
    }

    @Override
    public void onTabClicked() {
        InventoryTabs.getInstance().openInventoryGui();
    }

    @Override
    public boolean shouldAddToList() {
        return true;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.inventory.InventoryTab;
import com.vicmatskiv.weaponlib.inventory.OpenCustomPlayerInventoryGuiMessage;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class CustomPlayerInventoryTab
extends InventoryTab {
    private ModContext clientModContext;

    public CustomPlayerInventoryTab(ModContext clientModContext, Item tabIconItem) {
        super(0, 0, 0, new ItemStack(tabIconItem));
        this.clientModContext = clientModContext;
    }

    @Override
    public void onTabClicked() {
        this.clientModContext.getChannel().getChannel().sendToServer((IMessage)new OpenCustomPlayerInventoryGuiMessage(2));
    }

    @Override
    public boolean shouldAddToList() {
        return true;
    }
}


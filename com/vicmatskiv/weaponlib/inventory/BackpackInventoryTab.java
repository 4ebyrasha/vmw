/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.ItemStorage;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventory;
import com.vicmatskiv.weaponlib.inventory.InventoryTab;
import com.vicmatskiv.weaponlib.inventory.OpenCustomPlayerInventoryGuiMessage;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class BackpackInventoryTab
extends InventoryTab {
    private ModContext clientModContext;

    public BackpackInventoryTab(ModContext clientModContext) {
        super(0, 0, 0);
        this.clientModContext = clientModContext;
    }

    @Override
    public void onTabClicked() {
        this.clientModContext.getChannel().getChannel().sendToServer((IMessage)new OpenCustomPlayerInventoryGuiMessage(1));
    }

    @Override
    public boolean shouldAddToList() {
        ItemStack stackInSlot = BackpackInventoryTab.getBackpackStackInSlot();
        return stackInSlot != null && stackInSlot.func_77973_b() instanceof ItemStorage;
    }

    @Override
    protected ItemStack getItemStack() {
        return BackpackInventoryTab.getBackpackStackInSlot();
    }

    protected static ItemStack getBackpackStackInSlot() {
        CustomPlayerInventory customInventory = CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase)CompatibilityProvider.compatibility.getClientPlayer());
        return customInventory != null ? customInventory.func_70301_a(0) : null;
    }
}


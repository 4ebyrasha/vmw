/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleContainer;
import com.vicmatskiv.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleGuiContainer;
import com.vicmatskiv.weaponlib.compatibility.CompatibleGuiHandler;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventory;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventoryContainer;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventoryGuiContainer;
import com.vicmatskiv.weaponlib.inventory.StorageInventory;
import com.vicmatskiv.weaponlib.inventory.StorageItemContainer;
import com.vicmatskiv.weaponlib.inventory.StorageItemGuiContainer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiHandler
extends CompatibleGuiHandler {
    public static final int STORAGE_ITEM_INVENTORY_GUI_ID = 1;
    public static final int CUSTOM_PLAYER_INVENTORY_GUI_ID = 2;

    @Override
    public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
        CompatibleContainer container = null;
        switch (guiId) {
            case 1: {
                CustomPlayerInventory customInventory = CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase)player);
                if (customInventory == null || customInventory.func_70301_a(0) == null) break;
                container = new StorageItemContainer(player, player.field_71071_by, new StorageInventory(customInventory.func_70301_a(0)));
                break;
            }
            case 2: {
                container = new CustomPlayerInventoryContainer(player, player.field_71071_by, CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase)player));
            }
        }
        return container;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
        CompatibleGuiContainer guiContainer = null;
        switch (guiId) {
            case 1: {
                CustomPlayerInventory customInventory = CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase)CompatibilityProvider.compatibility.getClientPlayer());
                if (customInventory == null || customInventory.func_70301_a(0) == null) break;
                guiContainer = new StorageItemGuiContainer(new StorageItemContainer(player, player.field_71071_by, new StorageInventory(customInventory.func_70301_a(0))));
                break;
            }
            case 2: {
                guiContainer = new CustomPlayerInventoryGuiContainer(player, player.field_71071_by, CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase)player));
            }
        }
        return guiContainer;
    }
}


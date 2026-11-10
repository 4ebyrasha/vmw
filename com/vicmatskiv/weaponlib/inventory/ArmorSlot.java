/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSlot;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArmorSlot
extends CompatibleSlot {
    final EntityPlayer player;

    public ArmorSlot(EntityPlayer player, IInventory inventory, int slotIndex, int x, int y, CompatibleEntityEquipmentSlot armorType) {
        super(inventory, slotIndex, x, y, armorType);
        this.player = player;
    }

    public int func_75219_a() {
        return 1;
    }

    public boolean func_75214_a(ItemStack itemstack) {
        Item item = itemstack == null ? null : itemstack.func_77973_b();
        return item != null && CompatibilityProvider.compatibility.isValidArmor(itemstack, this.armorType, (Entity)this.player);
    }
}


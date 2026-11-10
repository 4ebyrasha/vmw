/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleContainer;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import com.vicmatskiv.weaponlib.inventory.ArmorSlot;
import com.vicmatskiv.weaponlib.inventory.StorageInventory;
import com.vicmatskiv.weaponlib.inventory.StorageSlot;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class StorageItemContainer
extends CompatibleContainer {
    private final StorageInventory inventory;
    private int customSlotStartIndex;
    private int customSlotEndIndex;
    private int armorSlotStartIndex;
    private int armorSlotEndIndex;
    private int standardInventorySlotStartIndex;
    private int standardInventorySlotEndIndex;
    private int hotbarSlotStartIndex;
    private int hotbarSlotEndIndex;
    private List<Slot> storageSlots;

    public StorageItemContainer(EntityPlayer player, InventoryPlayer inventoryPlayer, StorageInventory inventoryItem) {
        this.inventory = inventoryItem;
        this.storageSlots = this.createStorageSlots(this.inventory);
        this.storageSlots.forEach(slot -> this.func_75146_a((Slot)slot));
        this.customSlotStartIndex = 0;
        this.customSlotEndIndex = this.customSlotStartIndex + this.storageSlots.size() - 1;
        List<Slot> armorSlots = this.createArmorSlots(player, inventoryPlayer);
        armorSlots.forEach(slot -> this.func_75146_a((Slot)slot));
        this.armorSlotStartIndex = this.customSlotEndIndex + 1;
        this.armorSlotEndIndex = this.armorSlotStartIndex + armorSlots.size() - 1;
        List<Slot> standardInventorySlots = this.createStandardInventorySlots(inventoryPlayer);
        standardInventorySlots.forEach(slot -> this.func_75146_a((Slot)slot));
        this.standardInventorySlotStartIndex = this.armorSlotEndIndex + 1;
        this.standardInventorySlotEndIndex = this.standardInventorySlotStartIndex + standardInventorySlots.size() - 1;
        List<Slot> hotbarSlots = this.createHotbarSlots(inventoryPlayer);
        hotbarSlots.forEach(slot -> this.func_75146_a((Slot)slot));
        this.hotbarSlotStartIndex = this.standardInventorySlotEndIndex + 1;
        this.hotbarSlotEndIndex = this.hotbarSlotStartIndex + hotbarSlots.size() - 1;
    }

    protected List<Slot> createStorageSlots(StorageInventory inventoryCustom) {
        ArrayList<Slot> slots = new ArrayList<Slot>();
        for (int i = 0; i < inventoryCustom.func_70302_i_(); ++i) {
            slots.add(new StorageSlot(this.inventory, i, 80 + 18 * (i / 4), 8 + 18 * (i % 4)));
        }
        return slots;
    }

    protected List<Slot> createHotbarSlots(InventoryPlayer inventoryPlayer) {
        ArrayList<Slot> slots = new ArrayList<Slot>();
        for (int i = 0; i < 9; ++i) {
            slots.add(new Slot((IInventory)inventoryPlayer, i, 8 + i * 18, 142));
        }
        return slots;
    }

    protected List<Slot> createStandardInventorySlots(InventoryPlayer inventoryPlayer) {
        ArrayList<Slot> slots = new ArrayList<Slot>();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                slots.add(new Slot((IInventory)inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        return slots;
    }

    protected List<Slot> createArmorSlots(EntityPlayer player, InventoryPlayer inventoryPlayer) {
        ArrayList<Slot> slots = new ArrayList<Slot>();
        for (int i = 0; i < 4; ++i) {
            slots.add(new ArmorSlot(player, (IInventory)inventoryPlayer, inventoryPlayer.func_70302_i_() - 1 - i, 8, 8 + i * 18, CompatibleEntityEquipmentSlot.valueOf(i)));
        }
        return slots;
    }

    public boolean func_75145_c(EntityPlayer player) {
        return this.inventory.func_70300_a(player);
    }

    public ItemStack func_82846_b(EntityPlayer par1EntityPlayer, int index) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.field_75151_b.get(index);
        if (slot != null && slot.func_75216_d()) {
            ItemStack itemstack1 = slot.func_75211_c();
            itemstack = itemstack1.func_77946_l();
            if (index < this.standardInventorySlotStartIndex) {
                if (!this.func_75135_a(itemstack1, this.standardInventorySlotStartIndex, this.hotbarSlotEndIndex + 1, true)) {
                    return CompatibilityProvider.compatibility.stackForEmptySlot();
                }
                slot.func_75220_a(itemstack1, itemstack);
            } else {
                CompatibleEntityEquipmentSlot type;
                if (index >= this.standardInventorySlotStartIndex ? !this.func_75135_a(itemstack1, 0, this.standardInventorySlotStartIndex, false) : index >= this.armorSlotStartIndex && index <= this.armorSlotEndIndex && !this.func_75135_a(itemstack1, this.armorSlotStartIndex + (type = CompatibilityProvider.compatibility.getArmorType((ItemArmor)itemstack1.func_77973_b())).ordinal(), this.armorSlotStartIndex + type.ordinal() + 1, false)) {
                    return CompatibilityProvider.compatibility.stackForEmptySlot();
                }
                if (index >= this.standardInventorySlotStartIndex && index <= this.standardInventorySlotEndIndex ? !this.func_75135_a(itemstack1, this.hotbarSlotStartIndex, this.hotbarSlotEndIndex + 1, false) : index >= this.hotbarSlotStartIndex && index <= this.hotbarSlotEndIndex && !this.func_75135_a(itemstack1, this.standardInventorySlotStartIndex, this.standardInventorySlotEndIndex + 1, false)) {
                    return CompatibilityProvider.compatibility.stackForEmptySlot();
                }
            }
            if (CompatibilityProvider.compatibility.getStackSize(itemstack1) == 0) {
                slot.func_75215_d((ItemStack)null);
            } else {
                slot.func_75218_e();
            }
            if (CompatibilityProvider.compatibility.getStackSize(itemstack1) == CompatibilityProvider.compatibility.getStackSize(itemstack)) {
                return null;
            }
            this.onTakeFromSlot(slot, par1EntityPlayer, itemstack1);
        }
        return itemstack != null ? itemstack : CompatibilityProvider.compatibility.stackForEmptySlot();
    }

    StorageInventory getStorageInventory() {
        return this.inventory;
    }
}


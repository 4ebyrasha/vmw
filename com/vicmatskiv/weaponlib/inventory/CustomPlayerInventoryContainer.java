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

import com.vicmatskiv.weaponlib.ItemStorage;
import com.vicmatskiv.weaponlib.ItemVest;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleContainer;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import com.vicmatskiv.weaponlib.inventory.ArmorSlot;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventory;
import com.vicmatskiv.weaponlib.inventory.CustomSlot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CustomPlayerInventoryContainer
extends CompatibleContainer {
    private CustomPlayerInventory customPlayerInventory;
    private int customSlotStartIndex;
    private int customSlotEndIndex;
    private int armorSlotStartIndex;
    private int armorSlotEndIndex;
    private int standardInventorySlotStartIndex;
    private int standardInventorySlotEndIndex;
    private int hotbarSlotStartIndex;
    private int hotbarSlotEndIndex;
    private List<Slot> customSlots;

    public CustomPlayerInventoryContainer(EntityPlayer player, InventoryPlayer inventoryPlayer, CustomPlayerInventory customPlayerInventory) {
        this.customPlayerInventory = customPlayerInventory;
        this.customSlots = this.createCustomSlots(customPlayerInventory);
        this.customSlots.forEach(slot -> this.func_75146_a((Slot)slot));
        this.customSlotStartIndex = 0;
        this.customSlotEndIndex = this.customSlotStartIndex + this.customSlots.size() - 1;
        List<Slot> armorSlots = this.createArmorSlots(player, inventoryPlayer);
        armorSlots.forEach(slot -> this.func_75146_a((Slot)slot));
        this.armorSlotStartIndex = customPlayerInventory.func_70302_i_();
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

    protected List<Slot> createCustomSlots(CustomPlayerInventory inventoryCustom) {
        return Arrays.asList(new Slot[]{new CustomSlot(ItemStorage.class, inventoryCustom, 0, 80, 8), new CustomSlot(ItemVest.class, inventoryCustom, 1, 80, 26)});
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
            slots.add(new ArmorSlot(player, (IInventory)inventoryPlayer, inventoryPlayer.func_70302_i_() - 1 - i - 1, 8, 8 + i * 18, CompatibleEntityEquipmentSlot.valueOf(i)));
        }
        return slots;
    }

    public boolean func_75145_c(EntityPlayer player) {
        return true;
    }

    public ItemStack func_82846_b(EntityPlayer player, int slotIndex) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.field_75151_b.get(slotIndex);
        if (slot != null && slot.func_75216_d()) {
            CompatibleEntityEquipmentSlot type;
            ItemStack itemstack1 = slot.func_75211_c();
            itemstack = itemstack1.func_77946_l();
            if (slotIndex < this.standardInventorySlotStartIndex) {
                if (!this.func_75135_a(itemstack1, this.standardInventorySlotStartIndex, this.hotbarSlotEndIndex + 1, true)) {
                    return CompatibilityProvider.compatibility.stackForEmptySlot();
                }
                slot.func_75220_a(itemstack1, itemstack);
            } else if (this.customSlots.stream().anyMatch(s -> s.func_75214_a(itemstack1)) ? !this.func_75135_a(itemstack1, this.customSlotStartIndex, this.customSlotEndIndex + 1, false) : (itemstack1.func_77973_b() instanceof ItemArmor ? !this.func_75135_a(itemstack1, this.armorSlotStartIndex + (type = CompatibilityProvider.compatibility.getArmorType((ItemArmor)itemstack1.func_77973_b())).ordinal(), this.armorSlotStartIndex + type.ordinal() + 1, false) : (slotIndex >= this.standardInventorySlotStartIndex && slotIndex < this.hotbarSlotStartIndex ? !this.func_75135_a(itemstack1, this.hotbarSlotStartIndex, this.hotbarSlotEndIndex + 1, false) : slotIndex >= this.hotbarSlotStartIndex && slotIndex < this.hotbarSlotEndIndex + 1 && !this.func_75135_a(itemstack1, this.standardInventorySlotStartIndex, this.standardInventorySlotEndIndex + 1, false)))) {
                return CompatibilityProvider.compatibility.stackForEmptySlot();
            }
            if (CompatibilityProvider.compatibility.getStackSize(itemstack1) == 0) {
                slot.func_75215_d(CompatibilityProvider.compatibility.stackForEmptySlot());
            } else {
                slot.func_75218_e();
            }
            if (CompatibilityProvider.compatibility.getStackSize(itemstack1) == CompatibilityProvider.compatibility.getStackSize(itemstack)) {
                return null;
            }
            this.onTakeFromSlot(slot, player, itemstack1);
        }
        return itemstack != null ? itemstack : CompatibilityProvider.compatibility.stackForEmptySlot();
    }
}


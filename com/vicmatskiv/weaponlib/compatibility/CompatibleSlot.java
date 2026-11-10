/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.Slot
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class CompatibleSlot
extends Slot {
    protected final CompatibleEntityEquipmentSlot armorType;

    public CompatibleSlot(IInventory inventoryIn, int index, int xPosition, int yPosition, CompatibleEntityEquipmentSlot armorType) {
        super(inventoryIn, index, xPosition, yPosition);
        this.armorType = armorType;
    }
}


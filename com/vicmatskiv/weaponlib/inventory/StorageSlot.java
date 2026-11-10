/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.ItemStorage;
import com.vicmatskiv.weaponlib.inventory.StorageInventory;
import java.util.function.Predicate;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class StorageSlot
extends Slot {
    private Predicate<Item> validItemPredicate;

    public StorageSlot(StorageInventory inv, int index, int xPos, int yPos) {
        super((IInventory)inv, index, xPos, yPos);
        this.validItemPredicate = inv.getItemStorage().getValidItemPredicate();
    }

    public boolean func_75214_a(ItemStack itemstack) {
        return !(itemstack.func_77973_b() instanceof ItemStorage) && this.validItemPredicate.test(itemstack.func_77973_b());
    }

    public void func_75218_e() {
        super.func_75218_e();
    }
}


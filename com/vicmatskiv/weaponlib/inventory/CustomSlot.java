/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventoryGuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class CustomSlot
extends Slot {
    private Class<?> itemClass;

    public CustomSlot(Class<?> itemClass, IInventory inventory, int slotIndex, int x, int y) {
        super(inventory, slotIndex, x, y);
        this.itemClass = itemClass;
    }

    public boolean func_75214_a(ItemStack stack) {
        return this.itemClass.isInstance(stack.func_77973_b());
    }

    public void func_75218_e() {
        super.func_75218_e();
        if (CompatibilityProvider.compatibility.isClientSide()) {
            SlotChangeHandler.onGuiSlotChanged();
        }
    }

    private static class SlotChangeHandler {
        private SlotChangeHandler() {
        }

        private static void onGuiSlotChanged() {
            CustomPlayerInventoryGuiContainer container = CustomPlayerInventoryGuiContainer.getClickedGuiContainer();
            if (container != null) {
                container.func_73866_w_();
            }
        }
    }
}


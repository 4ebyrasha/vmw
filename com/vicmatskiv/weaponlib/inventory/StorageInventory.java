/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.ItemStorage;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleInventory;
import java.util.ArrayList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class StorageInventory
extends CompatibleInventory {
    private static final String TAG_SLOT_INDEX = "Slot";
    private static final String TAG_SIZE = "size";
    private String name = "Inventory Item";
    private final ItemStack storageItemStack;
    private ItemStack[] inventory;

    public StorageInventory(ItemStack storageItemStack) {
        this.storageItemStack = storageItemStack;
        int size = 0;
        Item item = storageItemStack.func_77973_b();
        if (item instanceof ItemStorage) {
            size = ((ItemStorage)item).getSize();
        }
        this.inventory = new ItemStack[size];
        for (int i = 0; i < this.inventory.length; ++i) {
            this.inventory[i] = CompatibilityProvider.compatibility.stackForEmptySlot();
        }
        if (!storageItemStack.func_77942_o()) {
            NBTTagCompound storageCompound = new NBTTagCompound();
            storageCompound.func_74768_a(TAG_SIZE, size);
            storageItemStack.func_77982_d(storageCompound);
        }
        this.deserialize(storageItemStack.func_77978_p());
    }

    public ItemStorage getItemStorage() {
        return (ItemStorage)this.storageItemStack.func_77973_b();
    }

    public int func_70302_i_() {
        return this.inventory.length;
    }

    public ItemStack func_70301_a(int slot) {
        return this.inventory[slot];
    }

    public ItemStack func_70298_a(int slot, int amount) {
        ItemStack stack = this.func_70301_a(slot);
        if (stack != null) {
            if (CompatibilityProvider.compatibility.getStackSize(stack) > amount) {
                stack = stack.func_77979_a(amount);
                this.func_70296_d();
            } else {
                this.func_70299_a(slot, CompatibilityProvider.compatibility.stackForEmptySlot());
            }
        }
        return stack;
    }

    public void func_70299_a(int slot, ItemStack stack) {
        ItemStack itemStack = this.inventory[slot] = stack != null ? stack : CompatibilityProvider.compatibility.stackForEmptySlot();
        if (stack != null && CompatibilityProvider.compatibility.getStackSize(stack) > this.func_70297_j_()) {
            CompatibilityProvider.compatibility.setStackSize(stack, this.func_70297_j_());
        }
        this.func_70296_d();
    }

    public String func_70005_c_() {
        return this.name;
    }

    public boolean func_145818_k_() {
        return this.name.length() > 0;
    }

    public int func_70297_j_() {
        return 64;
    }

    public void func_70296_d() {
        for (int i = 0; i < this.func_70302_i_(); ++i) {
            if (this.func_70301_a(i) == null || CompatibilityProvider.compatibility.getStackSize(this.func_70301_a(i)) != 0) continue;
            this.inventory[i] = CompatibilityProvider.compatibility.stackForEmptySlot();
        }
        this.serialize(this.storageItemStack.func_77978_p());
    }

    public boolean func_70300_a(EntityPlayer entityplayer) {
        return true;
    }

    public boolean func_94041_b(int slot, ItemStack itemstack) {
        return true;
    }

    private void deserialize(NBTTagCompound compound) {
        NBTTagList items = compound.func_150295_c("ItemInventory", 10);
        int size = compound.func_74762_e(TAG_SIZE);
        if (size >= 0 && items.func_74745_c() >= 0) {
            int i;
            this.inventory = new ItemStack[size];
            for (i = 0; i < size; ++i) {
                this.inventory[i] = CompatibilityProvider.compatibility.stackForEmptySlot();
            }
            for (i = 0; i < size && i < items.func_74745_c(); ++i) {
                NBTTagCompound item = items.func_150305_b(i);
                int slot = item.func_74762_e(TAG_SLOT_INDEX);
                if (slot < 0 || slot >= size) continue;
                this.inventory[slot] = CompatibilityProvider.compatibility.createItemStack(item);
            }
        }
    }

    private void serialize(NBTTagCompound tagcompound) {
        tagcompound.func_74768_a(TAG_SIZE, this.inventory.length);
        NBTTagList items = new NBTTagList();
        ArrayList<ItemStack> stackInSlots = new ArrayList<ItemStack>();
        for (int i = 0; i < this.func_70302_i_(); ++i) {
            ItemStack stackInSlot = this.func_70301_a(i);
            if (stackInSlot == null) continue;
            NBTTagCompound item = new NBTTagCompound();
            item.func_74768_a(TAG_SLOT_INDEX, i);
            stackInSlot.func_77955_b(item);
            items.func_74742_a((NBTBase)item);
            stackInSlots.add(stackInSlot);
        }
        tagcompound.func_74782_a("ItemInventory", (NBTBase)items);
    }
}


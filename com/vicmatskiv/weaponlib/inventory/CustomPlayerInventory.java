/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.Contextual;
import com.vicmatskiv.weaponlib.ItemStorage;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleInventory;
import com.vicmatskiv.weaponlib.inventory.EntityInventorySyncMessage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class CustomPlayerInventory
extends CompatibleInventory
implements Contextual {
    private final String name = "Custom Inventory";
    private static final String tagName = "CustomInvTag";
    private static final int INV_SIZE = 2;
    private ItemStack[] inventory = new ItemStack[2];
    private ModContext modContext;
    private EntityPlayer owner;

    public CustomPlayerInventory() {
        for (int i = 0; i < this.inventory.length; ++i) {
            this.inventory[i] = CompatibilityProvider.compatibility.stackForEmptySlot();
        }
    }

    public void setOwner(EntityPlayer player) {
        this.owner = player;
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

    public boolean func_145818_k_() {
        return true;
    }

    public void func_70299_a(int slot, ItemStack itemstack) {
        ItemStack itemStack = this.inventory[slot] = itemstack != null ? itemstack : CompatibilityProvider.compatibility.stackForEmptySlot();
        if (itemstack != null && CompatibilityProvider.compatibility.getStackSize(itemstack) > this.func_70297_j_()) {
            if (itemstack.func_77973_b() instanceof ItemStorage) {
                // empty if block
            }
            CompatibilityProvider.compatibility.setStackSize(itemstack, this.func_70297_j_());
        }
        this.func_70296_d();
    }

    public String func_70005_c_() {
        return "Custom Inventory";
    }

    public int func_70297_j_() {
        return 1;
    }

    public void func_70296_d() {
        for (int i = 0; i < this.func_70302_i_(); ++i) {
            if (this.func_70301_a(i) == null || CompatibilityProvider.compatibility.getStackSize(this.func_70301_a(i)) != 0) continue;
            this.inventory[i] = CompatibilityProvider.compatibility.stackForEmptySlot();
        }
        if (this.modContext != null && this.owner != null && CompatibilityProvider.compatibility.world((Entity)this.owner).field_72995_K) {
            this.modContext.getChannel().getChannel().sendToServer((IMessage)new EntityInventorySyncMessage((Entity)this.owner, this, true));
        }
    }

    public boolean func_70300_a(EntityPlayer player) {
        return true;
    }

    public boolean func_94041_b(int slot, ItemStack itemstack) {
        return true;
    }

    public void writeToNBT(NBTTagCompound compound) {
        NBTTagList items = new NBTTagList();
        for (int i = 0; i < this.func_70302_i_(); ++i) {
            ItemStack stackInSlot = this.func_70301_a(i);
            if (stackInSlot == null) continue;
            NBTTagCompound item = new NBTTagCompound();
            item.func_74774_a("Slot", (byte)i);
            stackInSlot.func_77955_b(item);
            items.func_74742_a((NBTBase)item);
        }
        compound.func_74782_a(tagName, (NBTBase)items);
    }

    public void readFromNBT(NBTTagCompound compound) {
        NBTTagList tagList = compound.func_150295_c(tagName, (int)compound.func_74732_a());
        for (int i = 0; i < tagList.func_74745_c(); ++i) {
            NBTTagCompound item = tagList.func_150305_b(i);
            byte slot = item.func_74771_c("Slot");
            if (slot < 0 || slot >= this.func_70302_i_()) continue;
            this.inventory[slot] = CompatibilityProvider.compatibility.createItemStack(item);
        }
    }

    @Override
    public void setContext(ModContext modContext) {
        this.modContext = modContext;
    }
}


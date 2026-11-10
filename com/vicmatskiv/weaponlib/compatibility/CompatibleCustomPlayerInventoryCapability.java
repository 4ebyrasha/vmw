/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.EnumFacing
 *  net.minecraftforge.common.capabilities.Capability
 *  net.minecraftforge.common.capabilities.Capability$IStorage
 *  net.minecraftforge.common.capabilities.CapabilityInject
 *  net.minecraftforge.common.capabilities.CapabilityManager
 *  net.minecraftforge.common.capabilities.ICapabilitySerializable
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.CommonModContext;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventory;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class CompatibleCustomPlayerInventoryCapability
implements ICapabilitySerializable<NBTBase> {
    @CapabilityInject(value=InventoryContainer.class)
    static Capability<InventoryContainer> capabilityContainer = null;
    private InventoryContainer instance = (InventoryContainer)capabilityContainer.getDefaultInstance();

    public static void setInventory(EntityLivingBase entity, CustomPlayerInventory inventory) {
        if (entity == null) {
            return;
        }
        InventoryContainer container = (InventoryContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            container.setInventory(inventory);
        }
    }

    public static void register(CommonModContext commonModContext) {
        CapabilityManager.INSTANCE.register(InventoryContainer.class, (Capability.IStorage)new InventoryStorage(), InventoryContainerImpl.class);
    }

    public static CustomPlayerInventory getInventory(EntityLivingBase entity) {
        if (entity == null) {
            return null;
        }
        InventoryContainer container = (InventoryContainer)entity.getCapability(capabilityContainer, null);
        return container != null ? container.getInventory() : null;
    }

    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == capabilityContainer;
    }

    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        return (T)(capability == capabilityContainer ? capabilityContainer.cast((Object)this.instance) : null);
    }

    public NBTBase serializeNBT() {
        return capabilityContainer.getStorage().writeNBT(capabilityContainer, (Object)this.instance, null);
    }

    public void deserializeNBT(NBTBase nbt) {
        capabilityContainer.getStorage().readNBT(capabilityContainer, (Object)this.instance, null, nbt);
    }

    public static class InventoryStorage
    implements Capability.IStorage<InventoryContainer> {
        public NBTBase writeNBT(Capability<InventoryContainer> capability, InventoryContainer instance, EnumFacing side) {
            NBTTagCompound compound = new NBTTagCompound();
            instance.getInventory().writeToNBT(compound);
            return compound;
        }

        public void readNBT(Capability<InventoryContainer> capability, InventoryContainer instance, EnumFacing side, NBTBase nbt) {
            CustomPlayerInventory inventory = new CustomPlayerInventory();
            inventory.readFromNBT((NBTTagCompound)nbt);
            instance.setInventory(inventory);
        }
    }

    public static class InventoryContainerImpl
    implements InventoryContainer {
        private CustomPlayerInventory inventory = new CustomPlayerInventory();

        @Override
        public void setInventory(CustomPlayerInventory inventory) {
            this.inventory = inventory;
        }

        @Override
        public CustomPlayerInventory getInventory() {
            return this.inventory;
        }
    }

    public static interface InventoryContainer {
        public void setInventory(CustomPlayerInventory var1);

        public CustomPlayerInventory getInventory();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagInt
 *  net.minecraft.util.EnumFacing
 *  net.minecraftforge.common.capabilities.Capability
 *  net.minecraftforge.common.capabilities.Capability$IStorage
 *  net.minecraftforge.common.capabilities.CapabilityInject
 *  net.minecraftforge.common.capabilities.CapabilityManager
 *  net.minecraftforge.common.capabilities.ICapabilitySerializable
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.ModContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class CompatibleExtraEntityFlags
implements ICapabilitySerializable<NBTBase> {
    public static int PRONING = 1;
    public static int FLIP = Integer.MIN_VALUE;
    @CapabilityInject(value=ExtraEntityFlagsContainer.class)
    static Capability<ExtraEntityFlagsContainer> capabilityContainer = null;
    private ExtraEntityFlagsContainer instance = (ExtraEntityFlagsContainer)capabilityContainer.getDefaultInstance();

    public static void register(ModContext modContext) {
        CapabilityManager.INSTANCE.register(ExtraEntityFlagsContainer.class, (Capability.IStorage)new ExtraEntityFlagsContainerStorage(), ExtraEntityFlagsContainerImpl.class);
    }

    public static int getFlags(Entity entity) {
        if (entity == null) {
            return 0;
        }
        ExtraEntityFlagsContainer container = (ExtraEntityFlagsContainer)entity.getCapability(capabilityContainer, null);
        return container != null ? container.getFlags() : 0;
    }

    public static void removeFlags(Entity entity) {
        if (entity == null) {
            return;
        }
        ExtraEntityFlagsContainer container = (ExtraEntityFlagsContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            container.setFlags(0);
        }
    }

    public static void setFlag(Entity entity, int flag, boolean on) {
        if (entity == null) {
            return;
        }
        ExtraEntityFlagsContainer container = (ExtraEntityFlagsContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            int flags = container.getFlags();
            if (on) {
                container.setFlags(flags | flag);
            } else {
                container.setFlags(flags & ~flag);
            }
        }
    }

    public static void setFlags(Entity entity, int flagsToSet, int values) {
        if (entity == null) {
            return;
        }
        ExtraEntityFlagsContainer container = (ExtraEntityFlagsContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            if ((flagsToSet & FLIP) != 0) {
                values = ~(container.getFlags() & (flagsToSet &= ~FLIP));
            }
            container.setFlags(container.getFlags() & ~flagsToSet | flagsToSet & values);
        }
    }

    public final boolean hasCapability(Capability<?> capability, EnumFacing facing) {
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

    public static boolean isProning(EntityPlayer player) {
        return (CompatibleExtraEntityFlags.getFlags((Entity)player) & PRONING) != 0;
    }

    public static class ExtraEntityFlagsContainerStorage
    implements Capability.IStorage<ExtraEntityFlagsContainer> {
        public NBTBase writeNBT(Capability<ExtraEntityFlagsContainer> capability, ExtraEntityFlagsContainer instance, EnumFacing side) {
            return new NBTTagInt(instance.getFlags());
        }

        public void readNBT(Capability<ExtraEntityFlagsContainer> capability, ExtraEntityFlagsContainer instance, EnumFacing side, NBTBase nbt) {
            instance.setFlags(((NBTTagInt)nbt).func_150287_d());
        }
    }

    public static class ExtraEntityFlagsContainerImpl
    implements ExtraEntityFlagsContainer {
        int flags;

        @Override
        public int getFlags() {
            return this.flags;
        }

        @Override
        public void setFlags(int flags) {
            this.flags = flags;
        }
    }

    public static interface ExtraEntityFlagsContainer {
        public int getFlags();

        public void setFlags(int var1);
    }
}


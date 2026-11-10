/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagByteArray
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.world.World
 *  net.minecraftforge.common.capabilities.Capability
 *  net.minecraftforge.common.capabilities.Capability$IStorage
 *  net.minecraftforge.common.capabilities.CapabilityInject
 *  net.minecraftforge.common.capabilities.CapabilityManager
 *  net.minecraftforge.common.capabilities.ICapabilitySerializable
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.tracking.PlayerEntityTracker;
import java.util.function.Function;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagByteArray;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class CompatiblePlayerEntityTrackerProvider
implements ICapabilitySerializable<NBTBase> {
    @CapabilityInject(value=PlayerEntityTrackerContainer.class)
    static Capability<PlayerEntityTrackerContainer> playerEntityTrackerContainer = null;
    private PlayerEntityTrackerContainer instance = (PlayerEntityTrackerContainer)playerEntityTrackerContainer.getDefaultInstance();

    public static void register(ModContext modContext) {
        CapabilityManager.INSTANCE.register(PlayerEntityTrackerContainer.class, (Capability.IStorage)new PlayerEntityTrackerStorage(), PlayerEntityTrackerContainerImpl.class);
    }

    public static PlayerEntityTracker getTracker(EntityLivingBase player) {
        if (player == null) {
            return null;
        }
        PlayerEntityTrackerContainer container = (PlayerEntityTrackerContainer)player.getCapability(playerEntityTrackerContainer, null);
        PlayerEntityTracker result = container != null ? container.getTracker(player.field_70170_p) : null;
        return result;
    }

    public static void setTracker(EntityLivingBase player, PlayerEntityTracker tracker) {
        PlayerEntityTrackerContainer container = (PlayerEntityTrackerContainer)player.getCapability(playerEntityTrackerContainer, null);
        if (container != null) {
            container.setInitializer(w -> tracker);
        }
    }

    public final boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == playerEntityTrackerContainer;
    }

    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        return (T)(capability == playerEntityTrackerContainer ? playerEntityTrackerContainer.cast((Object)this.instance) : null);
    }

    public NBTBase serializeNBT() {
        return playerEntityTrackerContainer.getStorage().writeNBT(playerEntityTrackerContainer, (Object)this.instance, null);
    }

    public void deserializeNBT(NBTBase nbt) {
        playerEntityTrackerContainer.getStorage().readNBT(playerEntityTrackerContainer, (Object)this.instance, null, nbt);
    }

    public static class PlayerEntityTrackerStorage
    implements Capability.IStorage<PlayerEntityTrackerContainer> {
        public NBTBase writeNBT(Capability<PlayerEntityTrackerContainer> capability, PlayerEntityTrackerContainer instance, EnumFacing side) {
            return new NBTTagByteArray(instance.toByteArray());
        }

        public void readNBT(Capability<PlayerEntityTrackerContainer> capability, PlayerEntityTrackerContainer instance, EnumFacing side, NBTBase nbt) {
            NBTTagByteArray content = (NBTTagByteArray)nbt;
            byte[] bytes = content.func_150292_c();
            if (bytes != null) {
                instance.setBytes(bytes);
                instance.setInitializer(w -> PlayerEntityTracker.fromByteArray(bytes, () -> w));
            }
        }
    }

    public static class PlayerEntityTrackerContainerImpl
    implements PlayerEntityTrackerContainer {
        private Function<World, PlayerEntityTracker> initializer;
        private PlayerEntityTracker resolved;
        private byte[] bytes = new byte[0];

        @Override
        public byte[] toByteArray() {
            return this.resolved == null ? this.bytes : this.resolved.toByteArray();
        }

        @Override
        public void setBytes(byte[] bytes) {
            this.bytes = bytes;
        }

        @Override
        public void setInitializer(Function<World, PlayerEntityTracker> initializer) {
            this.initializer = initializer;
            this.resolved = null;
        }

        @Override
        public PlayerEntityTracker getTracker(World world) {
            if (this.resolved == null) {
                this.resolved = this.initializer != null ? this.initializer.apply(world) : new PlayerEntityTracker(() -> world);
            }
            return this.resolved;
        }
    }

    public static interface PlayerEntityTrackerContainer {
        public byte[] toByteArray();

        public void setInitializer(Function<World, PlayerEntityTracker> var1);

        public void setBytes(byte[] var1);

        public PlayerEntityTracker getTracker(World var1);
    }
}


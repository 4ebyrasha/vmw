/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  net.minecraft.entity.Entity
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagByteArray
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.util.EnumFacing
 *  net.minecraftforge.common.capabilities.Capability
 *  net.minecraftforge.common.capabilities.Capability$IStorage
 *  net.minecraftforge.common.capabilities.CapabilityInject
 *  net.minecraftforge.common.capabilities.CapabilityManager
 *  net.minecraftforge.common.capabilities.ICapabilitySerializable
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagByteArray;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class CompatibleMissionOfferingCapability
implements ICapabilitySerializable<NBTBase> {
    @CapabilityInject(value=MissionOfferingContainer.class)
    static Capability<MissionOfferingContainer> capabilityContainer = null;
    private MissionOfferingContainer instance = (MissionOfferingContainer)capabilityContainer.getDefaultInstance();

    public static void register(ModContext modContext) {
        CapabilityManager.INSTANCE.register(MissionOfferingContainer.class, (Capability.IStorage)new MissionOfferingContainerStorage(), MissionContainerImpl.class);
    }

    public static Set<MissionOffering> getMissions(Entity entity) {
        if (entity == null) {
            return null;
        }
        MissionOfferingContainer container = (MissionOfferingContainer)entity.getCapability(capabilityContainer, null);
        return container != null ? container.getMissions() : Collections.emptySet();
    }

    public static void updateMissionOffering(Entity entity, MissionOffering mission) {
        if (entity == null) {
            return;
        }
        MissionOfferingContainer container = (MissionOfferingContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            container.getMissions().add(mission);
        }
    }

    public static void updateMissionOfferings(Entity entity, Set<MissionOffering> missions) {
        if (entity == null) {
            return;
        }
        MissionOfferingContainer container = (MissionOfferingContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            container.setMissions(missions);
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

    public static class MissionOfferingContainerStorage
    implements Capability.IStorage<MissionOfferingContainer> {
        public NBTBase writeNBT(Capability<MissionOfferingContainer> capability, MissionOfferingContainer instance, EnumFacing side) {
            NBTTagList tagList = new NBTTagList();
            for (MissionOffering mission : instance.getMissions()) {
                ByteBuf buf = Unpooled.buffer();
                TypeRegistry.getInstance().toBytes(mission, buf);
                tagList.func_74742_a((NBTBase)new NBTTagByteArray(buf.array()));
            }
            return tagList;
        }

        public void readNBT(Capability<MissionOfferingContainer> capability, MissionOfferingContainer instance, EnumFacing side, NBTBase nbt) {
            NBTTagList tagList = (NBTTagList)nbt;
            for (int i = 0; i < tagList.func_74745_c(); ++i) {
                NBTTagByteArray byteArray = (NBTTagByteArray)tagList.func_179238_g(i);
                ByteBuf buf = Unpooled.wrappedBuffer((byte[])byteArray.func_150292_c());
                MissionOffering mission = (MissionOffering)TypeRegistry.getInstance().fromBytes(buf);
                instance.getMissions().add(mission);
            }
        }
    }

    public static class MissionContainerImpl
    implements MissionOfferingContainer {
        Set<MissionOffering> missions = new LinkedHashSet<MissionOffering>();

        @Override
        public Set<MissionOffering> getMissions() {
            return this.missions;
        }

        @Override
        public void setMissions(Set<MissionOffering> missions) {
            this.missions = new LinkedHashSet<MissionOffering>(missions);
        }
    }

    public static interface MissionOfferingContainer {
        public Set<MissionOffering> getMissions();

        public void setMissions(Set<MissionOffering> var1);
    }
}


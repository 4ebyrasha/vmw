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
import com.vicmatskiv.weaponlib.mission.Mission;
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

public class CompatibleMissionCapability
implements ICapabilitySerializable<NBTBase> {
    @CapabilityInject(value=MissionContainer.class)
    static Capability<MissionContainer> capabilityContainer = null;
    private MissionContainer instance = (MissionContainer)capabilityContainer.getDefaultInstance();

    public static void register(ModContext modContext) {
        CapabilityManager.INSTANCE.register(MissionContainer.class, (Capability.IStorage)new MissionContainerStorage(), MissionContainerImpl.class);
    }

    public static Set<Mission> getMissions(Entity entity) {
        if (entity == null) {
            return null;
        }
        MissionContainer container = (MissionContainer)entity.getCapability(capabilityContainer, null);
        return container != null ? container.getMissions() : Collections.emptySet();
    }

    public static void removeMission(Entity entity, Mission mission) {
        if (entity == null) {
            return;
        }
        MissionContainer container = (MissionContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            container.getMissions().remove(mission);
        }
    }

    public static void updateMission(Entity entity, Mission mission) {
        if (entity == null) {
            return;
        }
        MissionContainer container = (MissionContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            container.getMissions().add(mission);
        }
    }

    public static void updateMissions(Entity entity, Set<Mission> missions) {
        if (entity == null) {
            return;
        }
        MissionContainer container = (MissionContainer)entity.getCapability(capabilityContainer, null);
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

    public static class MissionContainerStorage
    implements Capability.IStorage<MissionContainer> {
        public NBTBase writeNBT(Capability<MissionContainer> capability, MissionContainer instance, EnumFacing side) {
            NBTTagList tagList = new NBTTagList();
            for (Mission mission : instance.getMissions()) {
                ByteBuf buf = Unpooled.buffer();
                TypeRegistry.getInstance().toBytes(mission, buf);
                tagList.func_74742_a((NBTBase)new NBTTagByteArray(buf.array()));
            }
            return tagList;
        }

        public void readNBT(Capability<MissionContainer> capability, MissionContainer instance, EnumFacing side, NBTBase nbt) {
            NBTTagList tagList = (NBTTagList)nbt;
            for (int i = 0; i < tagList.func_74745_c(); ++i) {
                NBTTagByteArray byteArray = (NBTTagByteArray)tagList.func_179238_g(i);
                ByteBuf buf = Unpooled.wrappedBuffer((byte[])byteArray.func_150292_c());
                Mission mission = (Mission)TypeRegistry.getInstance().fromBytes(buf);
                instance.getMissions().add(mission);
            }
        }
    }

    public static class MissionContainerImpl
    implements MissionContainer {
        Set<Mission> missions = new LinkedHashSet<Mission>();

        @Override
        public Set<Mission> getMissions() {
            return this.missions;
        }

        @Override
        public void setMissions(Set<Mission> missions) {
            this.missions = new LinkedHashSet<Mission>(missions);
        }
    }

    public static interface MissionContainer {
        public Set<Mission> getMissions();

        public void setMissions(Set<Mission> var1);
    }
}


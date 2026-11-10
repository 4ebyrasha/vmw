/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  net.minecraft.entity.Entity
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagByteArray
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.util.EnumFacing
 *  net.minecraftforge.common.capabilities.Capability
 *  net.minecraftforge.common.capabilities.Capability$IStorage
 *  net.minecraftforge.common.capabilities.CapabilityInject
 *  net.minecraftforge.common.capabilities.CapabilityManager
 *  net.minecraftforge.common.capabilities.ICapabilitySerializable
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.Exposure;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagByteArray;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class CompatibleExposureCapability
implements ICapabilitySerializable<NBTBase> {
    @CapabilityInject(value=ExposureContainer.class)
    static Capability<ExposureContainer> capabilityContainer = null;
    private ExposureContainer instance = (ExposureContainer)capabilityContainer.getDefaultInstance();

    public static void register(ModContext modContext) {
        CapabilityManager.INSTANCE.register(ExposureContainer.class, (Capability.IStorage)new ExposureContainerStorage(), ExposureContainerImpl.class);
    }

    public static <T extends Exposure> T getExposure(Entity entity, Class<T> targetClass) {
        if (entity == null) {
            return null;
        }
        ExposureContainer container = (ExposureContainer)entity.getCapability(capabilityContainer, null);
        return (T)(container != null ? (Exposure)targetClass.cast(container.getExposures().get(targetClass)) : null);
    }

    public static Collection<? extends Exposure> getExposures(Entity entity) {
        if (entity == null) {
            return null;
        }
        ExposureContainer container = (ExposureContainer)entity.getCapability(capabilityContainer, null);
        return container != null ? container.getExposures().values() : null;
    }

    public static <T extends Exposure> T removeExposure(Entity entity, Class<T> targetClass) {
        if (entity == null) {
            return null;
        }
        ExposureContainer container = (ExposureContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            container.setLastUpdateTimestamp(entity.field_70170_p.func_82737_E());
            return (T)((Exposure)targetClass.cast(container.getExposures().remove(targetClass)));
        }
        return null;
    }

    public static void updateExposure(Entity entity, Exposure exposure) {
        if (entity == null) {
            return;
        }
        ExposureContainer container = (ExposureContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            container.getExposures().put(exposure.getClass(), exposure);
            container.setLastUpdateTimestamp(entity.field_70170_p.func_82737_E());
        }
    }

    public static void updateExposures(Entity entity, Collection<? extends Exposure> updatedExposures) {
        if (updatedExposures == null) {
            return;
        }
        ExposureContainer container = (ExposureContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            Map<Class<?>, Exposure> currentExposures = container.getExposures();
            Set updatedClasses = updatedExposures.stream().map(e -> e.getClass()).collect(Collectors.toSet());
            Iterator<Map.Entry<Class<?>, Exposure>> it = currentExposures.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Class<?>, Exposure> entry = it.next();
                if (updatedClasses.contains(entry.getKey())) continue;
                it.remove();
            }
            for (Exposure exposure : updatedExposures) {
                Exposure currentExposure = currentExposures.get(exposure.getClass());
                if (currentExposure != null) {
                    currentExposure.updateFrom(exposure);
                    continue;
                }
                currentExposures.put(exposure.getClass(), exposure);
            }
            container.setLastUpdateTimestamp(entity.field_70170_p.func_82737_E());
        }
    }

    public static long getLastSyncTimestamp(Entity entity) {
        ExposureContainer container = (ExposureContainer)entity.getCapability(capabilityContainer, null);
        return container != null ? container.getLastSyncTimestmap() : 0L;
    }

    public static void setLastSyncTimestamp(Entity entity, long lastSyncTimestamp) {
        ExposureContainer container = (ExposureContainer)entity.getCapability(capabilityContainer, null);
        if (container != null) {
            container.setLastSyncTimestamp(lastSyncTimestamp);
        }
    }

    public static long getLastUpdateTimestamp(Entity entity) {
        ExposureContainer container = (ExposureContainer)entity.getCapability(capabilityContainer, null);
        return container != null ? container.getLastUpdateTimestamp() : 0L;
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

    public static class ExposureContainerStorage
    implements Capability.IStorage<ExposureContainer> {
        private static final String TAG_EXPOSURES = "exposures";
        private static final String TAG_LAST_UPDATE = "lastUpdate";
        private static final String TAG_LAST_SYNC = "lastSync";

        public NBTBase writeNBT(Capability<ExposureContainer> capability, ExposureContainer instance, EnumFacing side) {
            NBTTagCompound tagCompound = new NBTTagCompound();
            NBTTagList exposureTags = new NBTTagList();
            for (Exposure exposure : instance.getExposures().values()) {
                ByteBuf buf = Unpooled.buffer();
                TypeRegistry.getInstance().toBytes(exposure, buf);
                exposureTags.func_74742_a((NBTBase)new NBTTagByteArray(buf.array()));
            }
            tagCompound.func_74782_a(TAG_EXPOSURES, (NBTBase)exposureTags);
            tagCompound.func_74772_a(TAG_LAST_SYNC, instance.getLastSyncTimestmap());
            tagCompound.func_74772_a(TAG_LAST_UPDATE, instance.getLastUpdateTimestamp());
            return tagCompound;
        }

        public void readNBT(Capability<ExposureContainer> capability, ExposureContainer instance, EnumFacing side, NBTBase nbt) {
            if (nbt instanceof NBTTagCompound) {
                NBTTagCompound tagCompound = (NBTTagCompound)nbt;
                NBTTagList exposureTags = (NBTTagList)tagCompound.func_74781_a(TAG_EXPOSURES);
                for (int i = 0; i < exposureTags.func_74745_c(); ++i) {
                    NBTTagByteArray byteArray = (NBTTagByteArray)exposureTags.func_179238_g(i);
                    ByteBuf buf = Unpooled.wrappedBuffer((byte[])byteArray.func_150292_c());
                    Exposure exposure = (Exposure)TypeRegistry.getInstance().fromBytes(buf);
                    instance.getExposures().put(exposure.getClass(), exposure);
                }
                instance.setLastSyncTimestamp(tagCompound.func_74763_f(TAG_LAST_SYNC));
                instance.setLastUpdateTimestamp(tagCompound.func_74763_f(TAG_LAST_UPDATE));
            }
        }
    }

    public static class ExposureContainerImpl
    implements ExposureContainer {
        Map<Class<?>, Exposure> exposures = new HashMap();
        long lastSyncTimestamp;
        long lastUpdateTimestamp;

        @Override
        public Map<Class<?>, Exposure> getExposures() {
            return this.exposures;
        }

        @Override
        public long getLastSyncTimestmap() {
            return this.lastSyncTimestamp;
        }

        @Override
        public void setLastSyncTimestamp(long lastSyncTimestamp) {
            this.lastSyncTimestamp = lastSyncTimestamp;
        }

        @Override
        public long getLastUpdateTimestamp() {
            return this.lastUpdateTimestamp;
        }

        @Override
        public void setLastUpdateTimestamp(long lastUpdateTimestamp) {
            this.lastUpdateTimestamp = lastUpdateTimestamp;
        }
    }

    public static interface ExposureContainer {
        public Map<Class<?>, Exposure> getExposures();

        public long getLastSyncTimestmap();

        public void setLastSyncTimestamp(long var1);

        public long getLastUpdateTimestamp();

        public void setLastUpdateTimestamp(long var1);
    }
}


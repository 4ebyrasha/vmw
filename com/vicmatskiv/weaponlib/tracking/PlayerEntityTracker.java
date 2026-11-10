/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.world.World
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.tracking;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import com.vicmatskiv.weaponlib.tracking.TrackableEntity;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Supplier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerEntityTracker {
    private static final Logger logger = LogManager.getLogger(PlayerEntityTracker.class);
    private Supplier<World> world;
    private Map<UUID, TrackableEntity> trackableEntities = new LinkedHashMap<UUID, TrackableEntity>();

    public static final PlayerEntityTracker getTracker(EntityLivingBase player) {
        return CompatiblePlayerEntityTrackerProvider.getTracker(player);
    }

    public PlayerEntityTracker(Supplier<World> world) {
        this.world = world;
    }

    public PlayerEntityTracker() {
    }

    void init(Supplier<World> world) {
        this.world = world;
    }

    public void addTrackableEntity(TrackableEntity te) {
        this.update();
        this.trackableEntities.put(te.getEntity().getPersistentID(), te);
    }

    public boolean updateTrackableEntity(Entity entity) {
        this.update();
        TrackableEntity te = this.trackableEntities.get(entity.getPersistentID());
        if (te != null) {
            te.setEntitySupplier(() -> entity);
            return true;
        }
        return false;
    }

    public Collection<TrackableEntity> getTrackableEntitites() {
        return Collections.unmodifiableCollection(this.trackableEntities.values());
    }

    public void update() {
        Iterator<TrackableEntity> it = this.trackableEntities.values().iterator();
        while (it.hasNext()) {
            TrackableEntity te = it.next();
            if (!te.isExpired()) continue;
            it.remove();
        }
    }

    public TrackableEntity getTrackableEntity(int index) {
        Collection<TrackableEntity> values = this.trackableEntities.values();
        int i = 0;
        TrackableEntity result = null;
        for (TrackableEntity te : values) {
            if (i == index) {
                result = te;
                break;
            }
            ++i;
        }
        return result;
    }

    public void serialize(ByteBuf buf) {
        this.update();
        buf.writeInt(this.trackableEntities.size());
        for (TrackableEntity te : this.trackableEntities.values()) {
            te.serialize(buf, this.world);
        }
    }

    private void init(ByteBuf buf) {
        int trackableEntitiesSize = buf.readInt();
        for (int i = 0; i < trackableEntitiesSize; ++i) {
            try {
                TrackableEntity te = TrackableEntity.fromBuf(buf, this.world);
                this.trackableEntities.put(te.getUuid(), te);
                continue;
            }
            catch (RuntimeException e) {
                logger.error("Failed to deserialize trackable entity {}", (Object)e.toString(), (Object)e);
            }
        }
    }

    public byte[] toByteArray() {
        ByteBuf buf = Unpooled.buffer();
        this.serialize(buf);
        return buf.array();
    }

    public static PlayerEntityTracker fromByteArray(byte[] bytes, Supplier<World> world) {
        ByteBuf buf = Unpooled.wrappedBuffer((byte[])bytes);
        PlayerEntityTracker tracker = new PlayerEntityTracker(world);
        if (bytes != null && bytes.length > 0) {
            tracker.init(buf);
        } else {
            logger.warn("Cannot deserialize tracker from empty byte array");
        }
        return tracker;
    }

    public static PlayerEntityTracker fromBuf(ByteBuf buf) {
        PlayerEntityTracker tracker = new PlayerEntityTracker(() -> CompatibilityProvider.compatibility.world((Entity)CompatibilityProvider.compatibility.clientPlayer()));
        tracker.init(buf);
        return tracker;
    }
}


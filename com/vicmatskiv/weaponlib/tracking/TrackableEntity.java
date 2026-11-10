/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.tracking;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import io.netty.buffer.ByteBuf;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.function.Supplier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrackableEntity {
    private static final Logger logger = LogManager.getLogger(TrackableEntity.class);
    private Supplier<Entity> entitySupplier;
    private long startTimestamp;
    private UUID uuid;
    private int entityId;
    private long trackingDuration;
    private WeakReference<Entity> entityRef;
    private String displayName = "";
    private Supplier<World> worldSupplier;

    private TrackableEntity() {
    }

    public TrackableEntity(Entity entity, long startTimestamp, long trackingDuration) {
        this.uuid = entity.getPersistentID();
        this.entityId = entity.func_145782_y();
        this.entitySupplier = () -> entity;
        this.startTimestamp = startTimestamp;
        this.trackingDuration = trackingDuration;
        this.worldSupplier = () -> CompatibilityProvider.compatibility.world(entity);
    }

    public UUID getUuid() {
        if (this.uuid != null) {
            return this.uuid;
        }
        Entity entity = this.getEntity();
        return entity != null ? entity.getPersistentID() : null;
    }

    public void setEntitySupplier(Supplier<Entity> entitySupplier) {
        this.entitySupplier = entitySupplier;
        this.entityId = -1;
        this.entityRef = null;
    }

    public Entity getEntity() {
        if (this.entityRef == null || this.entityRef.get() == null) {
            Entity entity = this.entitySupplier.get();
            if (entity != null) {
                if (entity instanceof EntityPlayer) {
                    this.displayName = CompatibilityProvider.compatibility.getDisplayName((EntityPlayer)entity);
                } else if (entity instanceof EntityLivingBase) {
                    this.displayName = EntityList.func_75621_b((Entity)entity);
                }
                this.entityId = entity.func_145782_y();
            }
            this.entityRef = new WeakReference<Entity>(entity);
        }
        return (Entity)this.entityRef.get();
    }

    public static TrackableEntity fromBuf(ByteBuf buf, Supplier<World> world) {
        TrackableEntity te = new TrackableEntity();
        te.init(buf, world);
        return te;
    }

    public void init(ByteBuf buf, Supplier<World> worldSupplier) {
        this.worldSupplier = worldSupplier;
        this.uuid = new UUID(buf.readLong(), buf.readLong());
        this.entityId = buf.readInt();
        logger.debug("Deserializing entity uuid {}, id {}", (Object)this.uuid, (Object)this.entityId);
        this.startTimestamp = buf.readLong();
        this.trackingDuration = buf.readLong();
        World world = worldSupplier.get();
        if (world != null && this.startTimestamp > world.func_72820_D() + 1000L) {
            this.startTimestamp = world.func_72820_D();
            this.trackingDuration /= 50L;
        }
        this.entitySupplier = () -> {
            World w = (World)worldSupplier.get();
            if (w.field_72995_K) {
                return w.func_73045_a(this.entityId);
            }
            return CompatibilityProvider.compatibility.getEntityByUuid(this.uuid, w);
        };
    }

    public void serialize(ByteBuf buf, Supplier<World> world) {
        buf.writeLong(this.uuid.getMostSignificantBits());
        buf.writeLong(this.uuid.getLeastSignificantBits());
        Entity entity = this.getEntity();
        int entityId = -1;
        if (entity != null) {
            entityId = entity.func_145782_y();
        }
        logger.debug("Serializing server entity uuid {}, id {}", (Object)this.uuid, (Object)entityId);
        buf.writeInt(entityId);
        buf.writeLong(this.startTimestamp);
        buf.writeLong(this.trackingDuration);
    }

    public boolean isExpired() {
        if (this.worldSupplier == null) {
            return true;
        }
        return this.startTimestamp + this.trackingDuration < this.worldSupplier.get().func_72820_D();
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public long getTrackingDuration() {
        return this.trackingDuration;
    }

    public long getStartTimestamp() {
        return this.startTimestamp;
    }
}


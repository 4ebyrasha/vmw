/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class EntityControlMessage
implements CompatibleMessage {
    private int flags;
    private int values;
    private int entityId;

    public EntityControlMessage() {
    }

    public EntityControlMessage(Entity entity, int values) {
        this(entity, 0xFFFFFFFF & ~CompatibleExtraEntityFlags.FLIP, values);
    }

    public EntityControlMessage(Entity entity, int flags, int values) {
        this.entityId = entity.func_145782_y();
        this.flags = flags;
        this.values = values;
    }

    public void fromBytes(ByteBuf buf) {
        this.entityId = buf.readInt();
        this.flags = buf.readInt();
        this.values = buf.readInt();
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.entityId);
        buf.writeInt(this.flags);
        buf.writeInt(this.values);
    }

    public int getFlags() {
        return this.flags;
    }

    public int getValues() {
        return this.values;
    }

    public Entity getEntity(World world) {
        return world.func_73045_a(this.entityId);
    }
}


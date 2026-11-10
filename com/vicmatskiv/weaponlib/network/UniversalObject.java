/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib.network;

import com.vicmatskiv.weaponlib.network.UniversallySerializable;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public abstract class UniversalObject
implements UniversallySerializable {
    private UUID uuid = UUID.randomUUID();

    protected int getSerialVersion() {
        return 0;
    }

    protected UniversalObject() {
    }

    public UUID getUuid() {
        return this.uuid;
    }

    @Override
    public void init(ByteBuf buf) {
        if (this.getSerialVersion() != buf.readInt()) {
            throw new IndexOutOfBoundsException("Serial version mismatch");
        }
        this.uuid = new UUID(buf.readLong(), buf.readLong());
    }

    @Override
    public void serialize(ByteBuf buf) {
        buf.writeInt(this.getSerialVersion());
        buf.writeLong(this.uuid.getMostSignificantBits());
        buf.writeLong(this.uuid.getLeastSignificantBits());
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = 31 * result + (this.uuid == null ? 0 : this.uuid.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        UniversalObject other = (UniversalObject)obj;
        return !(this.uuid == null ? other.uuid != null : !this.uuid.equals(other.uuid));
    }
}


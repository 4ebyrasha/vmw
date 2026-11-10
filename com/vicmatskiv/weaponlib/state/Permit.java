/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib.state;

import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.network.UniversalObject;
import com.vicmatskiv.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;

public class Permit<S extends ManagedState<S>>
extends UniversalObject {
    protected S state;
    protected Status status;
    protected long timestamp;

    public Permit() {
        this.status = Status.UNKNOWN;
    }

    public Permit(S state) {
        this.state = state;
        this.status = Status.REQUESTED;
        this.timestamp = System.currentTimeMillis();
    }

    public S getState() {
        return this.state;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
        this.timestamp = buf.readLong();
        this.status = Status.values()[buf.readInt()];
        this.state = (ManagedState)TypeRegistry.getInstance().fromBytes(buf);
    }

    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
        buf.writeLong(this.timestamp);
        buf.writeInt(this.status.ordinal());
        TypeRegistry.getInstance().toBytes(this.state, buf);
    }

    static {
        TypeRegistry.getInstance().register(Permit.class);
    }

    public static enum Status {
        REQUESTED,
        GRANTED,
        DENIED,
        UNKNOWN;

    }
}


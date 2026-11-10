/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.SpreadableExposure;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;

public class SpreadableExposureMessage
implements CompatibleMessage {
    private SpreadableExposure spreadableExposure;
    private boolean removed;

    public SpreadableExposureMessage() {
    }

    public SpreadableExposureMessage(SpreadableExposure spreadableExposure) {
        this.spreadableExposure = spreadableExposure;
        this.removed = spreadableExposure == null;
    }

    public void fromBytes(ByteBuf buf) {
        this.removed = buf.readBoolean();
        if (!this.removed) {
            this.spreadableExposure = (SpreadableExposure)TypeRegistry.getInstance().fromBytes(buf);
        }
    }

    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(this.removed);
        if (!this.removed) {
            TypeRegistry.getInstance().toBytes(this.spreadableExposure, buf);
        }
    }

    public SpreadableExposure getSpreadableExposure() {
        return this.spreadableExposure;
    }
}


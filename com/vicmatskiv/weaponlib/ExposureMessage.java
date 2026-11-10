/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.Exposure;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;

public class ExposureMessage
implements CompatibleMessage {
    private Collection<? extends Exposure> exposures;

    public ExposureMessage() {
        this.exposures = new ArrayList<Exposure>();
    }

    public ExposureMessage(Collection<? extends Exposure> exposures) {
        this.exposures = exposures;
    }

    public void fromBytes(ByteBuf buf) {
        int count = buf.readInt();
        for (int i = 0; i < count; ++i) {
            this.exposures.add((Exposure)TypeRegistry.getInstance().fromBytes(buf));
        }
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.exposures.size());
        for (Exposure exposure : this.exposures) {
            TypeRegistry.getInstance().toBytes(exposure, buf);
        }
    }

    public Collection<? extends Exposure> getExposures() {
        return this.exposures;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import io.netty.buffer.ByteBuf;

public class ArmorControlMessage
implements CompatibleMessage {
    public static final int NIGHT_VISION_MASK = 1;
    private int toggles;

    public ArmorControlMessage() {
    }

    public ArmorControlMessage(boolean toggleNightVision) {
        this.toggles |= 1;
    }

    public void fromBytes(ByteBuf buf) {
        this.toggles = buf.readInt();
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.toggles);
    }

    public boolean isToggleNightVision() {
        return (this.toggles & 1) == 1;
    }

    public static enum EntityAction {
        STOP;

    }
}


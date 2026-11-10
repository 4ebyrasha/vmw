/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import io.netty.buffer.ByteBuf;

public class OpenMissionGuiMessage
implements CompatibleMessage {
    private int guiInventoryId;

    public OpenMissionGuiMessage() {
    }

    public OpenMissionGuiMessage(int inventoryId) {
        this.guiInventoryId = inventoryId;
    }

    public void fromBytes(ByteBuf buf) {
        this.guiInventoryId = buf.readInt();
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.guiInventoryId);
    }

    public int getGuiInventoryId() {
        return this.guiInventoryId;
    }
}


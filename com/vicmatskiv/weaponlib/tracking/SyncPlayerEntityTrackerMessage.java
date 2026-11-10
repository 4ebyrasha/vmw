/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.tracking;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.tracking.PlayerEntityTracker;
import io.netty.buffer.ByteBuf;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SyncPlayerEntityTrackerMessage
implements CompatibleMessage {
    private static final Logger logger = LogManager.getLogger(SyncPlayerEntityTrackerMessage.class);
    private PlayerEntityTracker playerEntityTracker;
    private String statusMessage;

    public SyncPlayerEntityTrackerMessage() {
    }

    public SyncPlayerEntityTrackerMessage(PlayerEntityTracker playerEntityTracker) {
        this(playerEntityTracker, null);
    }

    public SyncPlayerEntityTrackerMessage(PlayerEntityTracker playerEntityTracker, String statusMessage) {
        this.playerEntityTracker = playerEntityTracker;
        this.statusMessage = statusMessage;
    }

    public void fromBytes(ByteBuf buf) {
        try {
            int statusMessageBytesLength = buf.readInt();
            if (statusMessageBytesLength > 0) {
                byte[] bytes = new byte[statusMessageBytesLength];
                buf.readBytes(bytes);
                this.statusMessage = new String(bytes);
            }
            this.playerEntityTracker = PlayerEntityTracker.fromBuf(buf);
        }
        catch (Exception e) {
            logger.error("Failed to deserialize tracker {}", (Throwable)e);
        }
    }

    public void toBytes(ByteBuf buf) {
        byte[] statusMessageBytes = this.statusMessage != null ? this.statusMessage.getBytes() : new byte[]{};
        buf.writeInt(statusMessageBytes.length);
        if (statusMessageBytes.length > 0) {
            buf.writeBytes(statusMessageBytes);
        }
        this.playerEntityTracker.serialize(buf);
    }

    public PlayerEntityTracker getTracker() {
        return this.playerEntityTracker;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }
}


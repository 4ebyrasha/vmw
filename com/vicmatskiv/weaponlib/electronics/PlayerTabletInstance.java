/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.electronics;

import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.electronics.TabletState;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.perspective.Perspective;
import com.vicmatskiv.weaponlib.perspective.WirelessCameraPerspective;
import com.vicmatskiv.weaponlib.tracking.PlayerEntityTracker;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerTabletInstance
extends PlayerItemInstance<TabletState> {
    private static final int SERIAL_VERSION = 1;
    private static final Logger logger = LogManager.getLogger(PlayerTabletInstance.class);
    private int activeWatchIndex;

    public PlayerTabletInstance() {
    }

    public PlayerTabletInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    public PlayerTabletInstance(int itemInventoryIndex, EntityLivingBase player) {
        super(itemInventoryIndex, player);
    }

    @Override
    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        return WirelessCameraPerspective.class;
    }

    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
        buf.writeInt(this.activeWatchIndex);
    }

    public void setActiveWatchIndex(int activeWatchIndex) {
        if (this.activeWatchIndex != activeWatchIndex) {
            logger.debug("Changing active watch index to {}", (Object)activeWatchIndex);
            this.activeWatchIndex = activeWatchIndex;
            this.markDirty();
        }
    }

    public int getActiveWatchIndex() {
        return this.activeWatchIndex;
    }

    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
        this.activeWatchIndex = buf.readInt();
    }

    @Override
    protected int getSerialVersion() {
        return 1;
    }

    public void nextActiveWatchIndex() {
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker(this.player);
        if (tracker != null) {
            if (this.activeWatchIndex >= tracker.getTrackableEntitites().size() - 1) {
                this.setActiveWatchIndex(0);
            } else {
                this.setActiveWatchIndex(this.activeWatchIndex + 1);
            }
        }
    }

    public void previousActiveWatchIndex() {
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker(this.player);
        if (tracker != null) {
            if (this.activeWatchIndex == 0) {
                this.setActiveWatchIndex(tracker.getTrackableEntitites().size() - 1);
            } else {
                this.setActiveWatchIndex(this.activeWatchIndex - 1);
            }
        }
    }

    public String toString() {
        return "Tablet [" + this.getUuid() + "]";
    }

    static {
        TypeRegistry.getInstance().register(PlayerTabletInstance.class);
    }
}


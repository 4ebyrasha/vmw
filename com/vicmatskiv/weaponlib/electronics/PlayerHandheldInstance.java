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
import com.vicmatskiv.weaponlib.electronics.HandheldState;
import com.vicmatskiv.weaponlib.electronics.ItemHandheld;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.perspective.Perspective;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerHandheldInstance
extends PlayerItemInstance<HandheldState> {
    private static final int SERIAL_VERSION = 1;
    private static final Logger logger = LogManager.getLogger(PlayerHandheldInstance.class);

    public PlayerHandheldInstance() {
    }

    public PlayerHandheldInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    public PlayerHandheldInstance(int itemInventoryIndex, EntityLivingBase player) {
        super(itemInventoryIndex, player);
    }

    @Override
    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        ItemHandheld item = (ItemHandheld)this.getItem();
        return item != null ? item.getRequiredPespectiveType() : null;
    }

    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
    }

    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
    }

    @Override
    protected int getSerialVersion() {
        return 1;
    }

    public String toString() {
        return "Handheld [" + this.getUuid() + "]";
    }

    static {
        TypeRegistry.getInstance().register(PlayerHandheldInstance.class);
    }
}


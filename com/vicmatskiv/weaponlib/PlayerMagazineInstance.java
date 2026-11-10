/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.MagazineState;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class PlayerMagazineInstance
extends PlayerItemInstance<MagazineState> {
    public PlayerMagazineInstance() {
    }

    public PlayerMagazineInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    public PlayerMagazineInstance(int itemInventoryIndex, EntityLivingBase player) {
        super(itemInventoryIndex, player);
    }

    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
    }

    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
    }

    @Override
    protected void updateWith(PlayerItemInstance<MagazineState> otherItemInstance, boolean updateManagedState) {
        super.updateWith(otherItemInstance, updateManagedState);
    }

    public ItemMagazine getMagazine() {
        return (ItemMagazine)this.item;
    }

    static {
        TypeRegistry.getInstance().register(PlayerMagazineInstance.class);
    }
}


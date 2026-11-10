/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventory;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;

public class EntityInventorySyncMessage
implements CompatibleMessage {
    private NBTTagCompound inventoryCompound;
    private int entityId;
    private boolean excludeEntity;

    public EntityInventorySyncMessage() {
    }

    public EntityInventorySyncMessage(Entity entity, CustomPlayerInventory inventory, boolean excludeEntity) {
        this.entityId = entity.func_145782_y();
        this.excludeEntity = excludeEntity;
        this.inventoryCompound = new NBTTagCompound();
        inventory.writeToNBT(this.inventoryCompound);
    }

    public void fromBytes(ByteBuf buf) {
        PacketBuffer packetBuf = new PacketBuffer(buf);
        this.entityId = packetBuf.readInt();
        this.excludeEntity = packetBuf.readBoolean();
        try {
            this.inventoryCompound = CompatibilityProvider.compatibility.readTagCompound(packetBuf);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void toBytes(ByteBuf buf) {
        PacketBuffer packetBuf = new PacketBuffer(buf);
        packetBuf.writeInt(this.entityId);
        packetBuf.writeBoolean(this.excludeEntity);
        try {
            CompatibilityProvider.compatibility.writeTagCompound(packetBuf, this.inventoryCompound);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected CustomPlayerInventory getInventory() {
        CustomPlayerInventory inventory = new CustomPlayerInventory();
        if (this.inventoryCompound != null) {
            inventory.readFromNBT(this.inventoryCompound);
        }
        return inventory;
    }

    public Entity getEntity(World world) {
        return world.func_73045_a(this.entityId);
    }

    public boolean isExcludeEntity() {
        return this.excludeEntity;
    }
}


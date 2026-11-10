/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketUpdateTileEntity
 *  net.minecraft.tileentity.TileEntity
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class CompatibleTileEntity
extends TileEntity {
    public final NBTTagCompound func_189515_b(NBTTagCompound tagCompound) {
        return this.compatibleWriteToNBT(tagCompound);
    }

    public NBTTagCompound compatibleWriteToNBT(NBTTagCompound tagCompound) {
        return super.func_189515_b(tagCompound);
    }

    public final void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        this.onDataPacket(net, pkt.func_148857_g());
    }

    protected void onDataPacket(NetworkManager net, NBTTagCompound nbtCompound) {
    }

    public SPacketUpdateTileEntity func_189518_D_() {
        return (SPacketUpdateTileEntity)this.getCompatibleUpdatePacket();
    }

    public Packet<?> getCompatibleUpdatePacket() {
        NBTTagCompound tagCompound = new NBTTagCompound();
        this.func_189515_b(tagCompound);
        return new SPacketUpdateTileEntity(this.field_174879_c, 1, tagCompound);
    }

    public CompatibleBlockPos getCompatiblePos() {
        return new CompatibleBlockPos(this.func_174877_v());
    }

    public NBTTagCompound func_189517_E_() {
        NBTTagCompound tagCompound = super.func_189517_E_();
        this.compatibleWriteToNBT(tagCompound);
        return tagCompound;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.tile;

import com.vicmatskiv.weaponlib.Configurable;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTileEntity;
import com.vicmatskiv.weaponlib.tile.CustomTileEntityClassFactory;
import com.vicmatskiv.weaponlib.tile.CustomTileEntityConfiguration;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.world.World;

public class CustomTileEntity<T extends CustomTileEntityConfiguration<T>>
extends CompatibleTileEntity
implements Configurable<T> {
    private static final String TAG_SIDE = "side";
    protected CustomTileEntityConfiguration<?> configuration;
    private int side;

    private T safeCast(Object input) {
        return (T)((CustomTileEntityConfiguration)input);
    }

    @Override
    public T getConfiguration() {
        if (this.configuration == null) {
            this.configuration = CustomTileEntityClassFactory.getInstance().getConfiguration(this.getClass());
        }
        return this.safeCast(this.configuration);
    }

    protected void setSide(int side) {
        this.side = side;
    }

    protected int getSide() {
        return this.side;
    }

    public void onEntityBlockActivated(World world, CompatibleBlockPos pos, EntityPlayer player) {
    }

    public void func_145839_a(NBTTagCompound tagCompound) {
        super.func_145839_a(tagCompound);
        this.side = tagCompound.func_74762_e(TAG_SIDE);
    }

    @Override
    public NBTTagCompound compatibleWriteToNBT(NBTTagCompound tagCompound) {
        super.compatibleWriteToNBT(tagCompound);
        tagCompound.func_74768_a(TAG_SIDE, this.side);
        return tagCompound;
    }

    @Override
    public void onDataPacket(NetworkManager net, NBTTagCompound tagCompound) {
        this.func_145839_a(tagCompound);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleVec3;
import net.minecraft.util.math.BlockPos;

public class CompatibleBlockPos {
    private BlockPos blockPos;

    public CompatibleBlockPos(BlockPos blockPos) {
        this.blockPos = blockPos;
    }

    public CompatibleBlockPos(int xCoord, int yCoord, int zCoord) {
        this.blockPos = new BlockPos(xCoord, yCoord, zCoord);
    }

    public CompatibleBlockPos(CompatibleVec3 projectedPos) {
        this.blockPos = new BlockPos(projectedPos.getVec());
    }

    public BlockPos getBlockPos() {
        return this.blockPos;
    }

    public int getBlockPosX() {
        return this.blockPos.func_177958_n();
    }

    public int getBlockPosY() {
        return this.blockPos.func_177956_o();
    }

    public int getBlockPosZ() {
        return this.blockPos.func_177952_p();
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = 31 * result + (this.blockPos == null ? 0 : this.blockPos.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        CompatibleBlockPos other = (CompatibleBlockPos)obj;
        return !(this.blockPos == null ? other.blockPos != null : !this.blockPos.equals((Object)other.blockPos));
    }
}


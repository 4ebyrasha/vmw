/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMaterial;
import net.minecraft.block.state.IBlockState;

public class CompatibleBlockState {
    private IBlockState blockState;

    static CompatibleBlockState fromBlockState(IBlockState blockState) {
        return blockState != null ? new CompatibleBlockState(blockState) : null;
    }

    CompatibleBlockState(IBlockState blockState) {
        this.blockState = blockState;
    }

    public IBlockState getBlockState() {
        return this.blockState;
    }

    public CompatibleMaterial getMaterial() {
        return new CompatibleMaterial(this.blockState.func_185904_a());
    }
}


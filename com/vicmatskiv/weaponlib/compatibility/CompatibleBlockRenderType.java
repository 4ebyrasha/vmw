/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumBlockRenderType
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.util.EnumBlockRenderType;

public enum CompatibleBlockRenderType {
    INVISIBLE(EnumBlockRenderType.INVISIBLE),
    LIQUID(EnumBlockRenderType.LIQUID),
    ENTITYBLOCK_ANIMATED(EnumBlockRenderType.ENTITYBLOCK_ANIMATED),
    MODEL(EnumBlockRenderType.MODEL);

    private EnumBlockRenderType renderType;

    private CompatibleBlockRenderType(EnumBlockRenderType renderType) {
        this.renderType = renderType;
    }

    EnumBlockRenderType getRenderType() {
        return this.renderType;
    }
}


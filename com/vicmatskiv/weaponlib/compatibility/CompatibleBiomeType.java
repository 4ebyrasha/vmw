/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.BiomeDictionary$Type
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraftforge.common.BiomeDictionary;

public enum CompatibleBiomeType {
    PLAINS(BiomeDictionary.Type.PLAINS),
    HILLS(BiomeDictionary.Type.HILLS),
    FOREST(BiomeDictionary.Type.FOREST),
    SWAMP(BiomeDictionary.Type.SWAMP);

    private BiomeDictionary.Type[] types;

    private CompatibleBiomeType(BiomeDictionary.Type ... types) {
        this.types = types;
    }

    public BiomeDictionary.Type[] getTypes() {
        return this.types;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.DifficultyInstance
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.world.DifficultyInstance;

public class CompatibleDifficulty {
    private DifficultyInstance difficulty;

    public CompatibleDifficulty(DifficultyInstance difficulty) {
        this.difficulty = difficulty;
    }

    public DifficultyInstance getDifficulty() {
        return this.difficulty;
    }

    public float getClampedAdditionalDifficulty() {
        return this.difficulty.func_180170_c();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.stats.StatBase
 *  net.minecraft.stats.StatList
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;

public enum CompatibleAchievement {
    KILL_ENEMY(StatList.field_188070_B);

    private StatBase achievement;

    private CompatibleAchievement(StatBase achievement) {
        this.achievement = achievement;
    }

    public StatBase getAchievement() {
        return this.achievement;
    }
}


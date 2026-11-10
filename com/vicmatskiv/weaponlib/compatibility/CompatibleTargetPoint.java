/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.network.NetworkRegistry$TargetPoint
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CompatibleTargetPoint {
    private NetworkRegistry.TargetPoint targetPoint;

    public CompatibleTargetPoint(int dimension, double x, double y, double z, double range) {
        this.targetPoint = new NetworkRegistry.TargetPoint(dimension, x, y, z, range);
    }

    NetworkRegistry.TargetPoint getTargetPoint() {
        return this.targetPoint;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.util.math.Vec3d;

public class CompatibleVec3 {
    private Vec3d vec;

    public CompatibleVec3(Vec3d vec) {
        this.vec = vec;
    }

    public CompatibleVec3(double posX, double posY, double posZ) {
        this.vec = new Vec3d(posX, posY, posZ);
    }

    public CompatibleVec3(CompatibleVec3 hitVec) {
        this.vec = new Vec3d(hitVec.getVec().field_72450_a, hitVec.getVec().field_72448_b, hitVec.getVec().field_72449_c);
    }

    public Vec3d getVec() {
        return this.vec;
    }

    public double distanceTo(CompatibleVec3 otherVec) {
        return this.vec.func_72438_d(otherVec.vec);
    }

    public double getXCoord() {
        return this.vec.field_72450_a;
    }

    public double getYCoord() {
        return this.vec.field_72448_b;
    }

    public double getZCoord() {
        return this.vec.field_72449_c;
    }

    public static CompatibleVec3 fromCompatibleVec3(CompatibleVec3 other) {
        return other != null ? new CompatibleVec3(other) : null;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.compatibility.CompatibleVec3;
import net.minecraft.util.math.AxisAlignedBB;

public class CompatibleAxisAlignedBB {
    private AxisAlignedBB boundingBox;

    public CompatibleAxisAlignedBB(double x1, double y1, double z1, double x2, double y2, double z2) {
        this.boundingBox = new AxisAlignedBB(x1, y1, z1, x2, y2, z2);
    }

    CompatibleAxisAlignedBB(AxisAlignedBB boundingBox) {
        this.boundingBox = boundingBox;
    }

    public CompatibleAxisAlignedBB(CompatibleBlockPos blockPos) {
        this.boundingBox = new AxisAlignedBB(blockPos.getBlockPos());
    }

    AxisAlignedBB getBoundingBox() {
        return this.boundingBox;
    }

    public CompatibleAxisAlignedBB offset(double x, double y, double z) {
        return new CompatibleAxisAlignedBB(this.boundingBox.func_72317_d(x, y, z));
    }

    public boolean intersectsWith(CompatibleAxisAlignedBB other) {
        return this.boundingBox.func_72326_a(other.boundingBox);
    }

    public CompatibleRayTraceResult calculateIntercept(CompatibleVec3 vec3, CompatibleVec3 vec31) {
        return CompatibleRayTraceResult.fromRayTraceResult(this.boundingBox.func_72327_a(vec3.getVec(), vec31.getVec()));
    }

    public CompatibleAxisAlignedBB addCoord(double x, double y, double z) {
        return new CompatibleAxisAlignedBB(this.boundingBox.func_72321_a(x, y, z));
    }

    public CompatibleAxisAlignedBB expand(double x, double y, double z) {
        return new CompatibleAxisAlignedBB(this.boundingBox.func_72314_b(x, y, z));
    }

    public double getAverageEdgeLength() {
        return this.boundingBox.func_72320_b();
    }

    public double getMinY() {
        return this.boundingBox.field_72338_b;
    }
}


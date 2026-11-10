/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.RayTraceResult
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEnumFacing;
import com.vicmatskiv.weaponlib.compatibility.CompatibleVec3;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RayTraceResult;

public class CompatibleRayTraceResult {
    private RayTraceResult position;
    private CompatibleVec3 hitVec;
    private CompatibleBlockPos blockPos;

    static CompatibleRayTraceResult fromRayTraceResult(RayTraceResult position) {
        return position != null ? new CompatibleRayTraceResult(position) : null;
    }

    private CompatibleRayTraceResult(RayTraceResult position) {
        this.position = position;
        this.init();
    }

    public CompatibleRayTraceResult(Entity entity) {
        this.position = new RayTraceResult(entity);
        this.init();
    }

    private void init() {
        this.hitVec = this.position.field_72307_f != null ? new CompatibleVec3(this.position.field_72307_f) : null;
        this.blockPos = this.position.func_178782_a() != null ? new CompatibleBlockPos(this.position.func_178782_a()) : null;
    }

    protected RayTraceResult getPosition() {
        return this.position;
    }

    public Entity getEntityHit() {
        return this.position.field_72308_g;
    }

    public Type getTypeOfHit() {
        Type result = null;
        switch (this.position.field_72313_a) {
            case BLOCK: {
                result = Type.BLOCK;
                break;
            }
            case ENTITY: {
                result = Type.ENTITY;
                break;
            }
            case MISS: {
                result = Type.MISS;
            }
        }
        return result;
    }

    public int getBlockPosX() {
        return this.blockPos.getBlockPos().func_177958_n();
    }

    public int getBlockPosY() {
        return this.blockPos.getBlockPos().func_177956_o();
    }

    public int getBlockPosZ() {
        return this.blockPos.getBlockPos().func_177952_p();
    }

    public CompatibleBlockPos getBlockPos() {
        return this.blockPos;
    }

    public void setSideHit(CompatibleEnumFacing sideHit) {
        this.position.field_178784_b = sideHit.getEnumFacing();
    }

    public CompatibleEnumFacing getSideHit() {
        CompatibleEnumFacing result = null;
        switch (this.position.field_178784_b) {
            case UP: {
                result = CompatibleEnumFacing.UP;
                break;
            }
            case DOWN: {
                result = CompatibleEnumFacing.DOWN;
                break;
            }
            case EAST: {
                result = CompatibleEnumFacing.EAST;
                break;
            }
            case WEST: {
                result = CompatibleEnumFacing.WEST;
                break;
            }
            case NORTH: {
                result = CompatibleEnumFacing.NORTH;
                break;
            }
            case SOUTH: {
                result = CompatibleEnumFacing.SOUTH;
            }
        }
        return result;
    }

    public CompatibleVec3 getHitVec() {
        return this.hitVec;
    }

    public void setHitVec(CompatibleVec3 hitVec) {
        this.position.field_72307_f = hitVec.getVec();
        this.hitVec = hitVec;
    }

    public static enum Type {
        MISS,
        BLOCK,
        ENTITY;

    }
}


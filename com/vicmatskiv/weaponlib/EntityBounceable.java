/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.Contextual;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleAxisAlignedBB;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleIEntityAdditionalSpawnData;
import com.vicmatskiv.weaponlib.compatibility.CompatibleIThrowableEntity;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMathHelper;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTracing;
import com.vicmatskiv.weaponlib.compatibility.CompatibleVec3;
import io.netty.buffer.ByteBuf;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityBounceable
extends Entity
implements Contextual,
CompatibleIEntityAdditionalSpawnData,
CompatibleIThrowableEntity {
    private static final Logger logger = LogManager.getLogger(EntityBounceable.class);
    private static final int VELOCITY_HISTORY_SIZE = 10;
    private static final double STOP_THRESHOLD = 0.001;
    private static final int MAX_TICKS = 2000;
    protected ModContext modContext;
    private float gravityVelocity;
    private float slowdownFactor = 0.5f;
    private int ticksInAir;
    private EntityLivingBase thrower;
    protected int bounceCount;
    private float initialYaw;
    private float initialPitch;
    private float xRotation;
    private float yRotation;
    private float zRotation;
    private float xRotationChange;
    private float yRotationChange;
    private float zRotationChange;
    private float rotationSlowdownFactor = 0.99f;
    private float maxRotationChange = 20.0f;
    protected boolean stopped;
    private Queue<Double> velocityHistory = new ArrayDeque<Double>(10);

    public EntityBounceable(ModContext modContext, World world, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(world);
        this.modContext = modContext;
        this.thrower = thrower;
        this.gravityVelocity = gravityVelocity;
        this.rotationSlowdownFactor = rotationSlowdownFactor;
        this.func_70105_a(0.3f, 0.3f);
        this.func_70012_b(thrower.field_70165_t, thrower.field_70163_u + (double)thrower.func_70047_e(), thrower.field_70161_v, CompatibilityProvider.compatibility.getCompatibleAimingRotationYaw(thrower), thrower.field_70125_A);
        this.field_70165_t -= (double)(CompatibleMathHelper.cos(this.field_70177_z / 180.0f * (float)Math.PI) * 0.16f);
        this.field_70163_u -= (double)0.1f;
        this.field_70161_v -= (double)(CompatibleMathHelper.sin(this.field_70177_z / 180.0f * (float)Math.PI) * 0.16f);
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        float f = 0.4f;
        this.field_70159_w = -CompatibleMathHelper.sin(this.field_70177_z / 180.0f * (float)Math.PI) * CompatibleMathHelper.cos(this.field_70125_A / 180.0f * (float)Math.PI) * f;
        this.field_70179_y = CompatibleMathHelper.cos(this.field_70177_z / 180.0f * (float)Math.PI) * CompatibleMathHelper.cos(this.field_70125_A / 180.0f * (float)Math.PI) * f;
        this.field_70181_x = -CompatibleMathHelper.sin((this.field_70125_A + 0.0f) / 180.0f * (float)Math.PI) * f;
        this.initialYaw = this.field_70177_z;
        this.initialPitch = this.field_70125_A;
        this.setThrowableHeading(this.field_70159_w, this.field_70181_x, this.field_70179_y, velocity, 10.0f);
        logger.debug("Throwing with position {}{}{}, rotation pitch {}, velocity {}, {}, {}", (Object)this.field_70165_t, (Object)this.field_70163_u, (Object)this.field_70161_v, (Object)Float.valueOf(this.field_70125_A), (Object)this.field_70159_w, (Object)this.field_70181_x, (Object)this.field_70179_y);
    }

    public void setThrowableHeading(double motionX, double motionY, double motionZ, float velocity, float inaccuracy) {
        float f2 = CompatibleMathHelper.sqrt_double(motionX * motionX + motionY * motionY + motionZ * motionZ);
        motionX /= (double)f2;
        motionY /= (double)f2;
        motionZ /= (double)f2;
        motionX += this.field_70146_Z.nextGaussian() * (double)0.0075f * (double)inaccuracy;
        motionY += this.field_70146_Z.nextGaussian() * (double)0.0075f * (double)inaccuracy;
        motionZ += this.field_70146_Z.nextGaussian() * (double)0.0075f * (double)inaccuracy;
        this.field_70159_w = motionX *= (double)velocity;
        this.field_70181_x = motionY *= (double)velocity;
        this.field_70179_y = motionZ *= (double)velocity;
        float f3 = CompatibleMathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
        this.field_70126_B = this.field_70177_z = (float)(Math.atan2(motionX, motionZ) * 180.0 / Math.PI);
        this.field_70127_C = this.field_70125_A = (float)(Math.atan2(motionY, f3) * 180.0 / Math.PI);
    }

    public EntityBounceable(World world) {
        super(world);
        this.setRotations();
    }

    private void setRotations() {
        this.xRotationChange = this.maxRotationChange * (float)this.field_70146_Z.nextGaussian();
        this.yRotationChange = this.maxRotationChange * (float)this.field_70146_Z.nextGaussian();
        this.zRotationChange = this.maxRotationChange * (float)this.field_70146_Z.nextGaussian();
    }

    public EntityLivingBase getThrower() {
        return this.thrower;
    }

    public void setThrower(Entity thrower) {
        this.thrower = (EntityLivingBase)thrower;
    }

    public void func_70071_h_() {
        if (!CompatibilityProvider.compatibility.world((Entity)this).field_72995_K && this.field_70173_aa > 2000) {
            this.func_70106_y();
            return;
        }
        this.xRotation += this.xRotationChange;
        this.yRotation += this.yRotationChange;
        this.zRotation += this.zRotationChange;
        this.xRotationChange *= this.rotationSlowdownFactor;
        this.yRotationChange *= this.rotationSlowdownFactor;
        this.zRotationChange *= this.rotationSlowdownFactor;
        this.field_70142_S = this.field_70165_t;
        this.field_70137_T = this.field_70163_u;
        this.field_70136_U = this.field_70161_v;
        super.func_70071_h_();
        ++this.ticksInAir;
        if (this.stopped) {
            return;
        }
        CompatibleVec3 vec3 = new CompatibleVec3(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        CompatibleVec3 vec31 = new CompatibleVec3(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
        CompatibleRayTraceResult movingobjectposition = CompatibleRayTracing.rayTraceBlocks(CompatibilityProvider.compatibility.world(this), vec3, vec31, (block, blockMetadata) -> this.canCollideWithBlock((Block)block, (CompatibleBlockState)blockMetadata));
        vec3 = new CompatibleVec3(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        vec31 = new CompatibleVec3(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
        if (movingobjectposition != null) {
            vec31 = CompatibleVec3.fromCompatibleVec3(movingobjectposition.getHitVec());
        }
        if (this.thrower != null) {
            Entity entity = null;
            List<Entity> list = CompatibilityProvider.compatibility.getEntitiesWithinAABBExcludingEntity(CompatibilityProvider.compatibility.world(this), this, CompatibilityProvider.compatibility.getBoundingBox(this).addCoord(this.field_70159_w, this.field_70181_x, this.field_70179_y).expand(1.0, 1.0, 1.0));
            double d0 = 0.0;
            EntityLivingBase entitylivingbase = this.getThrower();
            CompatibleRayTraceResult entityMovingObjectPosition = null;
            for (int j = 0; j < list.size(); ++j) {
                double d1;
                float f;
                CompatibleAxisAlignedBB axisalignedbb;
                CompatibleRayTraceResult movingobjectposition1;
                Entity entity1 = list.get(j);
                if (!entity1.func_70067_L() || entity1 == entitylivingbase && this.ticksInAir < 5 || (movingobjectposition1 = (axisalignedbb = CompatibilityProvider.compatibility.expandEntityBoundingBox(entity1, f = 0.3f, f, f)).calculateIntercept(vec3, vec31)) == null || !((d1 = vec3.distanceTo(movingobjectposition1.getHitVec())) < d0) && d0 != 0.0) continue;
                entity = entity1;
                entityMovingObjectPosition = movingobjectposition1;
                d0 = d1;
            }
            if (entity != null) {
                movingobjectposition = new CompatibleRayTraceResult(entity);
                movingobjectposition.setSideHit(entityMovingObjectPosition.getSideHit());
                movingobjectposition.setHitVec(entityMovingObjectPosition.getHitVec());
            }
        }
        logger.trace("Ori position to {}, {}, {}, motion {} {} {} ", (Object)this.field_70165_t, (Object)this.field_70163_u, (Object)this.field_70161_v, (Object)this.field_70159_w, (Object)this.field_70181_x, (Object)this.field_70179_y);
        if (movingobjectposition != null && (movingobjectposition.getTypeOfHit() == CompatibleRayTraceResult.Type.BLOCK || movingobjectposition.getTypeOfHit() == CompatibleRayTraceResult.Type.ENTITY)) {
            logger.trace("Hit {}, vec set to {}, {}, {}", (Object)movingobjectposition.getTypeOfHit(), (Object)movingobjectposition.getHitVec().getXCoord(), (Object)movingobjectposition.getHitVec().getYCoord(), (Object)movingobjectposition.getHitVec().getZCoord());
            logger.trace("Before bouncing {}, side {}, motion set to {}, {}, {}", (Object)this.bounceCount, (Object)movingobjectposition.getSideHit(), (Object)this.field_70159_w, (Object)this.field_70181_x, (Object)this.field_70179_y);
            this.field_70165_t = movingobjectposition.getHitVec().getXCoord();
            this.field_70163_u = movingobjectposition.getHitVec().getYCoord();
            this.field_70161_v = movingobjectposition.getHitVec().getZCoord();
            switch (movingobjectposition.getSideHit()) {
                case DOWN: {
                    this.field_70181_x = -this.field_70181_x;
                    this.field_70163_u += this.field_70181_x;
                    break;
                }
                case UP: {
                    this.field_70181_x = -this.field_70181_x;
                    break;
                }
                case NORTH: {
                    this.field_70179_y = -this.field_70179_y;
                    this.field_70161_v += this.field_70179_y;
                    break;
                }
                case SOUTH: {
                    this.field_70179_y = -this.field_70179_y;
                    break;
                }
                case WEST: {
                    this.field_70159_w = -this.field_70159_w;
                    this.field_70165_t += this.field_70159_w;
                    break;
                }
                case EAST: {
                    this.field_70159_w = -this.field_70159_w;
                }
            }
            this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
            if (movingobjectposition.getTypeOfHit() == CompatibleRayTraceResult.Type.ENTITY) {
                this.avoidEntityCollisionAfterBounce(movingobjectposition);
            } else if (movingobjectposition.getTypeOfHit() == CompatibleRayTraceResult.Type.BLOCK) {
                this.avoidBlockCollisionAfterBounce(movingobjectposition);
            }
            logger.trace("After bouncing {}  motion set to {}, {}, {}", (Object)this.bounceCount, (Object)this.field_70159_w, (Object)this.field_70181_x, (Object)this.field_70179_y);
            this.onBounce(movingobjectposition);
            ++this.bounceCount;
            if (this.field_70128_L) {
                return;
            }
        } else {
            this.field_70165_t += this.field_70159_w;
            this.field_70163_u += this.field_70181_x;
            this.field_70161_v += this.field_70179_y;
        }
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        float motionSquared = CompatibleMathHelper.sqrt_double(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
        this.field_70177_z = (float)(Math.atan2(this.field_70159_w, this.field_70179_y) * 180.0 / Math.PI);
        this.field_70125_A = (float)(Math.atan2(this.field_70181_x, motionSquared) * 180.0 / Math.PI);
        while (this.field_70125_A - this.field_70127_C < -180.0f) {
            this.field_70127_C -= 360.0f;
        }
        while (this.field_70125_A - this.field_70127_C >= 180.0f) {
            this.field_70127_C += 360.0f;
        }
        while (this.field_70177_z - this.field_70126_B < -180.0f) {
            this.field_70126_B -= 360.0f;
        }
        while (this.field_70177_z - this.field_70126_B >= 180.0f) {
            this.field_70126_B += 360.0f;
        }
        this.field_70125_A = this.field_70127_C + (this.field_70125_A - this.field_70127_C) * 0.2f;
        this.field_70177_z = this.field_70126_B + (this.field_70177_z - this.field_70126_B) * 0.2f;
        float f2 = 0.99f;
        float currentGravityVelocity = this.getGravityVelocity();
        if (this.func_70090_H()) {
            for (int i = 0; i < 4; ++i) {
                float f4 = 0.25f;
                CompatibilityProvider.compatibility.spawnParticle(CompatibilityProvider.compatibility.world(this), "bubble", this.field_70165_t - this.field_70159_w * (double)f4, this.field_70163_u - this.field_70181_x * (double)f4, this.field_70161_v - this.field_70179_y * (double)f4, this.field_70159_w, this.field_70181_x, this.field_70179_y);
            }
            f2 = 0.8f;
        }
        if (movingobjectposition != null && (movingobjectposition.getTypeOfHit() == CompatibleRayTraceResult.Type.BLOCK || movingobjectposition.getTypeOfHit() == CompatibleRayTraceResult.Type.ENTITY)) {
            f2 = this.slowdownFactor;
            this.rotationSlowdownFactor *= this.slowdownFactor * 1.5f;
        }
        this.field_70159_w *= (double)f2;
        this.field_70181_x *= (double)f2;
        this.field_70179_y *= (double)f2;
        this.recordVelocityHistory();
        if (!this.velocityHistory.stream().anyMatch(v -> v > 0.001)) {
            this.field_70179_y = 0.0;
            this.field_70181_x = 0.0;
            this.field_70159_w = 0.0;
            this.stopped = true;
            logger.trace("Stopping {}", (Object)this);
            this.onStop();
        } else {
            this.field_70181_x -= (double)currentGravityVelocity;
        }
        logger.trace("Set position to {}, {}, {}, motion {} {} {} ", (Object)this.field_70165_t, (Object)this.field_70163_u, (Object)this.field_70161_v, (Object)this.field_70159_w, (Object)this.field_70181_x, (Object)this.field_70179_y);
    }

    public void onStop() {
    }

    public void onBounce(CompatibleRayTraceResult movingobjectposition) {
    }

    private void avoidBlockCollisionAfterBounce(CompatibleRayTraceResult movingobjectposition) {
        if (movingobjectposition.getTypeOfHit() != CompatibleRayTraceResult.Type.BLOCK) {
            return;
        }
        double dX = Math.signum(this.field_70159_w) * 0.05;
        double dY = Math.signum(this.field_70181_x) * 0.05;
        double dZ = Math.signum(this.field_70179_y) * 0.05;
        for (int i = 0; i < 10; ++i) {
            double projectedXPos = this.field_70165_t + dX * (double)i;
            double projectedYPos = this.field_70163_u + dY * (double)i;
            double projectedZPos = this.field_70161_v + dZ * (double)i;
            CompatibleVec3 projectedPos = new CompatibleVec3(projectedXPos, projectedYPos, projectedZPos);
            CompatibleBlockPos blockPos = new CompatibleBlockPos(projectedPos);
            CompatibleAxisAlignedBB projectedEntityBoundingBox = CompatibilityProvider.compatibility.getBoundingBox(this).offset(dX * (double)i, dY * (double)i, dZ * (double)i);
            if (!CompatibilityProvider.compatibility.isAirBlock(CompatibilityProvider.compatibility.world(this), blockPos) && new CompatibleAxisAlignedBB(blockPos).intersectsWith(projectedEntityBoundingBox)) continue;
            this.field_70165_t = projectedXPos;
            this.field_70163_u = projectedYPos;
            this.field_70161_v = projectedZPos;
            logger.trace("Found non-intercepting post-bounce position on iteration {}", (Object)i);
            break;
        }
    }

    private void avoidEntityCollisionAfterBounce(CompatibleRayTraceResult movingobjectposition) {
        if (movingobjectposition.getEntityHit() == null) {
            return;
        }
        this.slowdownFactor = 0.3f;
        double dX = Math.signum(this.field_70159_w) * 0.05;
        double dY = Math.signum(this.field_70181_x) * 0.05;
        double dZ = Math.signum(this.field_70179_y) * 0.05;
        float f = 0.3f;
        CompatibleAxisAlignedBB axisalignedbb = CompatibilityProvider.compatibility.getBoundingBox(movingobjectposition.getEntityHit()).expand(f, f, f);
        CompatibleRayTraceResult intercept = movingobjectposition;
        for (int i = 0; i < 10; ++i) {
            CompatibleVec3 currentPos = new CompatibleVec3(this.field_70165_t + dX * (double)i, this.field_70163_u + dY * (double)i, this.field_70161_v + dY * (double)i);
            CompatibleVec3 projectedPos = new CompatibleVec3(this.field_70165_t + dX * (double)(i + 1), this.field_70163_u + dY * (double)(i + 1), this.field_70161_v + dZ * (double)(i + 1));
            intercept = axisalignedbb.calculateIntercept(currentPos, projectedPos);
            if (intercept != null) continue;
            CompatibleBlockPos blockPos = new CompatibleBlockPos(projectedPos);
            CompatibleBlockState blockState = CompatibilityProvider.compatibility.getBlockAtPosition(CompatibilityProvider.compatibility.world(this), blockPos);
            if (blockState != null && !CompatibilityProvider.compatibility.isAirBlock(blockState)) {
                logger.debug("Found non-intercept position colliding with block {}", (Object)blockState);
                intercept = movingobjectposition;
                break;
            }
            this.field_70165_t = projectedPos.getXCoord();
            this.field_70163_u = projectedPos.getYCoord();
            this.field_70161_v = projectedPos.getZCoord();
            break;
        }
        if (intercept != null) {
            logger.debug("Could not find non-intercept position after bounce");
        }
    }

    protected float getGravityVelocity() {
        return this.gravityVelocity;
    }

    protected void func_70088_a() {
    }

    protected void func_70037_a(NBTTagCompound tagCompound) {
    }

    protected void func_70014_b(NBTTagCompound tagCompound) {
    }

    public void writeSpawnData(ByteBuf buffer) {
        buffer.writeInt(this.thrower != null ? this.thrower.func_145782_y() : -1);
        buffer.writeDouble(this.field_70165_t);
        buffer.writeDouble(this.field_70163_u);
        buffer.writeDouble(this.field_70161_v);
        buffer.writeDouble(this.field_70159_w);
        buffer.writeDouble(this.field_70181_x);
        buffer.writeDouble(this.field_70179_y);
        buffer.writeFloat(this.gravityVelocity);
        buffer.writeFloat(this.rotationSlowdownFactor);
        buffer.writeFloat(this.initialYaw);
        buffer.writeFloat(this.initialPitch);
    }

    public void readSpawnData(ByteBuf buffer) {
        Entity entity;
        int entityId = buffer.readInt();
        if (this.thrower == null && entityId >= 0 && (entity = CompatibilityProvider.compatibility.world(this).func_73045_a(entityId)) instanceof EntityLivingBase) {
            this.thrower = (EntityPlayer)entity;
        }
        this.field_70165_t = buffer.readDouble();
        this.field_70163_u = buffer.readDouble();
        this.field_70161_v = buffer.readDouble();
        this.field_70159_w = buffer.readDouble();
        this.field_70181_x = buffer.readDouble();
        this.field_70179_y = buffer.readDouble();
        this.gravityVelocity = buffer.readFloat();
        this.rotationSlowdownFactor = buffer.readFloat();
        this.initialYaw = buffer.readFloat();
        this.initialPitch = buffer.readFloat();
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        logger.debug("Restoring with position {}{}{}, rotation pitch {}, velocity {}, {}, {}", (Object)this.field_70165_t, (Object)this.field_70163_u, (Object)this.field_70161_v, (Object)Float.valueOf(this.field_70125_A), (Object)this.field_70159_w, (Object)this.field_70181_x, (Object)this.field_70179_y);
    }

    public float getXRotation() {
        return this.xRotation;
    }

    public float getYRotation() {
        return this.yRotation - this.initialYaw - 90.0f;
    }

    public float getZRotation() {
        return this.zRotation;
    }

    public boolean canCollideWithBlock(Block block, CompatibleBlockState metadata) {
        return CompatibilityProvider.compatibility.canCollideCheck(block, metadata, false);
    }

    private void recordVelocityHistory() {
        double velocity = this.field_70159_w * this.field_70159_w + this.field_70181_x * this.field_70181_x + this.field_70179_y * this.field_70179_y;
        this.velocityHistory.add(velocity);
        if (this.velocityHistory.size() > 10) {
            this.velocityHistory.poll();
        }
    }

    @Override
    public void setContext(ModContext modContext) {
        if (this.modContext == null) {
            this.modContext = modContext;
        }
    }
}


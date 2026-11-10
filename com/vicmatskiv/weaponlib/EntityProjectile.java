/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IProjectile
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleAxisAlignedBB;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleIEntityAdditionalSpawnData;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMathHelper;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTracing;
import com.vicmatskiv.weaponlib.compatibility.CompatibleVec3;
import io.netty.buffer.ByteBuf;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class EntityProjectile
extends Entity
implements IProjectile,
CompatibleIEntityAdditionalSpawnData {
    private static final Logger logger = LogManager.getLogger(EntityProjectile.class);
    private static final String TAG_GRAVITY_VELOCITY = "gravityVelocity";
    private static final int MAX_TICKS = 200;
    private static final int DEFAULT_MAX_LIFETIME = 5000;
    private int xTile = -1;
    private int yTile = -1;
    private int zTile = -1;
    protected boolean inGround;
    public int throwableShake;
    protected EntityLivingBase thrower;
    private String throwerName;
    private int ticksInAir;
    protected float gravityVelocity;
    protected float velocity;
    protected float inaccuracy;
    private long timestamp;
    private double aimTan;
    protected long maxLifetime = 5000L;

    public EntityProjectile(World world) {
        super(world);
        this.func_70105_a(0.25f, 0.25f);
        this.timestamp = System.currentTimeMillis();
    }

    public EntityProjectile(World world, EntityLivingBase thrower, float velocity, float gravityVelocity, float inaccuracy) {
        this(world);
        this.thrower = thrower;
        this.velocity = velocity;
        this.gravityVelocity = gravityVelocity;
        this.inaccuracy = inaccuracy;
    }

    public void setPositionAndDirection() {
        this.func_70012_b(this.thrower.field_70165_t, this.thrower.field_70163_u + (double)this.thrower.func_70047_e(), this.thrower.field_70161_v, CompatibilityProvider.compatibility.getCompatibleAimingRotationYaw(this.thrower), this.thrower.field_70125_A);
        this.field_70165_t -= (double)(CompatibleMathHelper.cos(this.field_70177_z / 180.0f * (float)Math.PI) * 0.16f);
        this.field_70163_u -= (double)0.1f;
        this.field_70161_v -= (double)(CompatibleMathHelper.sin(this.field_70177_z / 180.0f * (float)Math.PI) * 0.16f);
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        float f = this.velocity;
        this.field_70159_w = -CompatibleMathHelper.sin(this.field_70177_z / 180.0f * (float)Math.PI) * CompatibleMathHelper.cos(this.field_70125_A / 180.0f * (float)Math.PI) * f;
        this.field_70179_y = CompatibleMathHelper.cos(this.field_70177_z / 180.0f * (float)Math.PI) * CompatibleMathHelper.cos(this.field_70125_A / 180.0f * (float)Math.PI) * f;
        this.field_70181_x = -CompatibleMathHelper.sin((this.field_70125_A + this.getPitchOffset()) / 180.0f * (float)Math.PI) * f;
        this.func_70186_c(this.field_70159_w, this.field_70181_x, this.field_70179_y, this.velocity, this.inaccuracy);
    }

    public void setPositionAndDirection(double x, double y, double z, float rotationYaw, float rotationPitch) {
        this.func_70012_b(x, y + (double)this.thrower.func_70047_e(), z, rotationYaw, rotationPitch);
        this.field_70165_t -= (double)(CompatibleMathHelper.cos(this.field_70177_z / 180.0f * (float)Math.PI) * 0.16f);
        this.field_70163_u -= (double)0.1f;
        this.field_70161_v -= (double)(CompatibleMathHelper.sin(this.field_70177_z / 180.0f * (float)Math.PI) * 0.16f);
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        float f = this.velocity;
        this.field_70159_w = -CompatibleMathHelper.sin(this.field_70177_z / 180.0f * (float)Math.PI) * CompatibleMathHelper.cos(this.field_70125_A / 180.0f * (float)Math.PI) * f;
        this.field_70179_y = CompatibleMathHelper.cos(this.field_70177_z / 180.0f * (float)Math.PI) * CompatibleMathHelper.cos(this.field_70125_A / 180.0f * (float)Math.PI) * f;
        this.field_70181_x = -CompatibleMathHelper.sin((this.field_70125_A + this.getPitchOffset()) / 180.0f * (float)Math.PI) * f;
        this.func_70186_c(this.field_70159_w, this.field_70181_x, this.field_70179_y, this.velocity, this.inaccuracy);
    }

    public EntityProjectile(World world, double posX, double posY, double posZ) {
        super(world);
        this.func_70105_a(0.25f, 0.25f);
        this.func_70107_b(posX, posY, posZ);
    }

    protected float getPitchOffset() {
        return 0.0f;
    }

    public void func_70186_c(double x, double y, double z, float velocity, float inaccuracy) {
        float f2 = CompatibleMathHelper.sqrt_double(x * x + y * y + z * z);
        x /= (double)f2;
        y /= (double)f2;
        z /= (double)f2;
        x += this.field_70146_Z.nextGaussian() * (double)0.0075f * (double)inaccuracy;
        y += this.field_70146_Z.nextGaussian() * (double)0.0075f * (double)inaccuracy;
        z += this.field_70146_Z.nextGaussian() * (double)0.0075f * (double)inaccuracy;
        this.field_70159_w = x *= (double)velocity;
        this.field_70181_x = y *= (double)velocity;
        this.field_70179_y = z *= (double)velocity;
        float f3 = CompatibleMathHelper.sqrt_double(x * x + z * z);
        this.field_70126_B = this.field_70177_z = (float)(Math.atan2(x, z) * 180.0 / Math.PI);
        this.field_70127_C = this.field_70125_A = (float)(Math.atan2(y, f3) * 180.0 / Math.PI);
    }

    public void func_70016_h(double mX, double mY, double mZ) {
        this.field_70159_w = mX;
        this.field_70181_x = mY;
        this.field_70179_y = mZ;
        if (this.field_70127_C == 0.0f && this.field_70126_B == 0.0f) {
            float f = CompatibleMathHelper.sqrt_double(mX * mX + mZ * mZ);
            this.field_70126_B = this.field_70177_z = (float)(Math.atan2(mX, mZ) * 180.0 / Math.PI);
            this.field_70127_C = this.field_70125_A = (float)(Math.atan2(mY, f) * 180.0 / Math.PI);
        }
    }

    public void func_70071_h_() {
        Entity entity;
        if (this.field_70173_aa > 200) {
            this.func_70106_y();
            return;
        }
        this.field_70142_S = this.field_70165_t;
        this.field_70137_T = this.field_70163_u;
        this.field_70136_U = this.field_70161_v;
        super.func_70071_h_();
        if (this.throwableShake > 0) {
            --this.throwableShake;
        }
        if (this.inGround) {
            this.inGround = false;
            this.field_70159_w *= (double)(this.field_70146_Z.nextFloat() * 0.2f);
            this.field_70181_x *= (double)(this.field_70146_Z.nextFloat() * 0.2f);
            this.field_70179_y *= (double)(this.field_70146_Z.nextFloat() * 0.2f);
            this.ticksInAir = 0;
        } else {
            ++this.ticksInAir;
        }
        CompatibleVec3 vec3 = new CompatibleVec3(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        CompatibleVec3 vec31 = new CompatibleVec3(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
        CompatibleRayTraceResult movingobjectposition = CompatibleRayTracing.rayTraceBlocks(CompatibilityProvider.compatibility.world(this), vec3, vec31, (block, blockMetadata) -> this.canCollideWithBlock((Block)block, (CompatibleBlockState)blockMetadata));
        vec3 = new CompatibleVec3(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        vec31 = new CompatibleVec3(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
        if (movingobjectposition != null) {
            vec31 = CompatibleVec3.fromCompatibleVec3(movingobjectposition.getHitVec());
        }
        if (!CompatibilityProvider.compatibility.world((Entity)this).field_72995_K && (entity = this.getRayTraceEntities(vec3, vec31)) != null) {
            movingobjectposition = new CompatibleRayTraceResult(entity);
        }
        if (movingobjectposition != null) {
            this.onImpact(movingobjectposition);
        }
        this.field_70165_t += this.field_70159_w;
        this.field_70163_u += this.field_70181_x;
        this.field_70161_v += this.field_70179_y;
        float f1 = CompatibleMathHelper.sqrt_double(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
        this.field_70177_z = (float)(Math.atan2(this.field_70159_w, this.field_70179_y) * 180.0 / Math.PI);
        this.field_70125_A = (float)(Math.atan2(this.field_70181_x, f1) * 180.0 / Math.PI);
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
        float f3 = this.gravityVelocity;
        if (this.func_70090_H()) {
            for (int i = 0; i < 4; ++i) {
                float f4 = 0.25f;
                CompatibilityProvider.compatibility.spawnParticle(CompatibilityProvider.compatibility.world(this), "bubble", this.field_70165_t - this.field_70159_w * (double)f4, this.field_70163_u - this.field_70181_x * (double)f4, this.field_70161_v - this.field_70179_y * (double)f4, this.field_70159_w, this.field_70181_x, this.field_70179_y);
            }
            f2 = 0.8f;
        }
        this.field_70159_w *= (double)f2;
        this.field_70181_x *= (double)f2;
        this.field_70179_y *= (double)f2;
        this.field_70181_x -= (double)f3;
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
    }

    private Entity getRayTraceEntities(CompatibleVec3 vec3, CompatibleVec3 vec31) {
        Entity entity = null;
        List<Entity> list = CompatibilityProvider.compatibility.getEntitiesWithinAABBExcludingEntity(CompatibilityProvider.compatibility.world(this), this, CompatibilityProvider.compatibility.getBoundingBox(this).addCoord(this.field_70159_w, this.field_70181_x, this.field_70179_y).expand(1.0, 1.0, 1.0));
        double d0 = 0.0;
        EntityLivingBase entitylivingbase = this.getThrower();
        for (int j = 0; j < list.size(); ++j) {
            double d1;
            float f;
            CompatibleAxisAlignedBB axisalignedbb;
            CompatibleRayTraceResult movingobjectposition1;
            Entity entity1 = list.get(j);
            if (!entity1.func_70067_L() || entity1 == entitylivingbase && this.ticksInAir < 5 || (movingobjectposition1 = (axisalignedbb = CompatibilityProvider.compatibility.expandEntityBoundingBox(entity1, f = 0.3f, f, f)).calculateIntercept(vec3, vec31)) == null || !((d1 = vec3.distanceTo(movingobjectposition1.getHitVec())) < d0) && d0 != 0.0) continue;
            entity = entity1;
            d0 = d1;
        }
        return entity;
    }

    protected abstract void onImpact(CompatibleRayTraceResult var1);

    public void func_70014_b(NBTTagCompound tagCompound) {
        tagCompound.func_74772_a("timestamp", this.timestamp);
        tagCompound.func_74777_a("xTile", (short)this.xTile);
        tagCompound.func_74777_a("yTile", (short)this.yTile);
        tagCompound.func_74777_a("zTile", (short)this.zTile);
        tagCompound.func_74774_a("shake", (byte)this.throwableShake);
        tagCompound.func_74774_a("inGround", (byte)(this.inGround ? 1 : 0));
        if ((this.throwerName == null || this.throwerName.length() == 0) && this.thrower != null && this.thrower instanceof EntityPlayer) {
            this.throwerName = CompatibilityProvider.compatibility.getPlayerName((EntityPlayer)this.thrower);
        }
        tagCompound.func_74778_a("ownerName", this.throwerName == null ? "" : this.throwerName);
        tagCompound.func_74776_a(TAG_GRAVITY_VELOCITY, this.gravityVelocity);
        tagCompound.func_74780_a("aimTan", this.aimTan);
    }

    public void func_70037_a(NBTTagCompound tagCompound) {
        this.xTile = tagCompound.func_74765_d("xTile");
        this.yTile = tagCompound.func_74765_d("yTile");
        this.zTile = tagCompound.func_74765_d("zTile");
        this.throwableShake = tagCompound.func_74771_c("shake") & 0xFF;
        this.inGround = tagCompound.func_74771_c("inGround") == 1;
        this.throwerName = tagCompound.func_74779_i("ownerName");
        if (this.throwerName != null && this.throwerName.length() == 0) {
            this.throwerName = null;
        }
        this.gravityVelocity = tagCompound.func_74760_g(TAG_GRAVITY_VELOCITY);
        this.timestamp = tagCompound.func_74763_f("timestamp");
        this.aimTan = tagCompound.func_74769_h("aimTan");
        if (System.currentTimeMillis() > this.timestamp + this.maxLifetime) {
            this.func_70106_y();
        }
    }

    public void writeSpawnData(ByteBuf buffer) {
        buffer.writeFloat(this.gravityVelocity);
        buffer.writeDouble(this.aimTan);
    }

    public void readSpawnData(ByteBuf buffer) {
        this.gravityVelocity = buffer.readFloat();
        this.aimTan = buffer.readDouble();
    }

    public float getShadowSize() {
        return 0.0f;
    }

    public double getAimTan() {
        return this.aimTan;
    }

    public EntityLivingBase getThrower() {
        if (this.thrower == null && this.throwerName != null && this.throwerName.length() > 0) {
            this.thrower = CompatibilityProvider.compatibility.world(this).func_72924_a(this.throwerName);
        }
        return this.thrower;
    }

    protected void func_70088_a() {
    }

    public boolean func_70112_a(double p_70112_1_) {
        double d1 = CompatibilityProvider.compatibility.getBoundingBox(this).getAverageEdgeLength() * 4.0;
        return p_70112_1_ < (d1 *= 64.0) * d1;
    }

    public boolean canCollideWithBlock(Block block, CompatibleBlockState metadata) {
        return CompatibilityProvider.compatibility.canCollideCheck(block, metadata, false);
    }
}


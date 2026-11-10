/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.projectile.EntityThrowable
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

public abstract class CompatibleThrowableEntity
extends EntityThrowable
implements IEntityAdditionalSpawnData {
    static final float DEFAULT_INACCURACY = 1.0f;
    private int ticksInAir;

    public CompatibleThrowableEntity(World world) {
        super(world);
    }

    public CompatibleThrowableEntity(World par1World, EntityLivingBase player) {
        super(par1World, player);
    }

    protected void func_70184_a(RayTraceResult position) {
        this.onImpact(CompatibleRayTraceResult.fromRayTraceResult(position));
    }

    protected abstract void onImpact(CompatibleRayTraceResult var1);

    public final void func_70186_c(double motionX, double motionY, double motionZ, float velocity, float inaccuracy) {
        this.setCompatibleThrowableHeading(motionX, motionY, motionZ, velocity, inaccuracy);
    }

    protected abstract void setCompatibleThrowableHeading(double var1, double var3, double var5, float var7, float var8);

    protected abstract float getVelocity();

    protected abstract float getInaccuracy();

    public void func_70071_h_() {
        this.field_70142_S = this.field_70165_t;
        this.field_70137_T = this.field_70163_u;
        this.field_70136_U = this.field_70161_v;
        if (this.field_70191_b > 0) {
            --this.field_70191_b;
        }
        if (!this.field_174854_a) {
            ++this.ticksInAir;
        }
        Vec3d vec3 = new Vec3d(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        Vec3d vec31 = new Vec3d(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
        RayTraceResult movingobjectposition = this.field_70170_p.func_72933_a(vec3, vec31);
        vec3 = new Vec3d(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        vec31 = new Vec3d(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
        if (movingobjectposition != null) {
            vec31 = new Vec3d(movingobjectposition.field_72307_f.field_72450_a, movingobjectposition.field_72307_f.field_72448_b, movingobjectposition.field_72307_f.field_72449_c);
        }
        if (!this.field_70170_p.field_72995_K) {
            Entity entity = null;
            List list = this.field_70170_p.func_72839_b((Entity)this, this.func_174813_aQ().func_72321_a(this.field_70159_w, this.field_70181_x, this.field_70179_y).func_186662_g(1.0));
            double d0 = 0.0;
            EntityLivingBase entitylivingbase = this.func_85052_h();
            for (int j = 0; j < list.size(); ++j) {
                double d1;
                Entity entity1 = (Entity)list.get(j);
                if (!entity1.func_70067_L() || entity1 == entitylivingbase && this.ticksInAir < 5) continue;
                float f = 0.3f;
                AxisAlignedBB axisalignedbb = entity1.func_174813_aQ().func_72321_a((double)f, (double)f, (double)f);
                RayTraceResult movingobjectposition1 = axisalignedbb.func_72327_a(vec3, vec31);
                if (movingobjectposition1 == null || !((d1 = vec3.func_72436_e(movingobjectposition1.field_72307_f)) < d0) && d0 != 0.0) continue;
                entity = entity1;
                d0 = d1;
            }
            if (entity != null) {
                movingobjectposition = new RayTraceResult(entity);
            }
        }
        if (movingobjectposition != null) {
            if (movingobjectposition.field_72313_a == RayTraceResult.Type.BLOCK && this.field_70170_p.func_180495_p(movingobjectposition.func_178782_a()).func_177230_c() == Blocks.field_150427_aO) {
                this.func_181015_d(movingobjectposition.func_178782_a());
            } else {
                this.func_70184_a(movingobjectposition);
            }
        }
        this.field_70165_t += this.field_70159_w;
        this.field_70163_u += this.field_70181_x;
        this.field_70161_v += this.field_70179_y;
        float f1 = MathHelper.func_76133_a((double)(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y));
        this.field_70177_z = (float)(MathHelper.func_181159_b((double)this.field_70159_w, (double)this.field_70179_y) * 180.0 / Math.PI);
        this.field_70125_A = (float)(MathHelper.func_181159_b((double)this.field_70181_x, (double)f1) * 180.0 / Math.PI);
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
        float f3 = this.func_70185_h();
        if (this.func_70090_H()) {
            for (int i = 0; i < 4; ++i) {
                float f4 = 0.25f;
                this.field_70170_p.func_175688_a(EnumParticleTypes.WATER_BUBBLE, this.field_70165_t - this.field_70159_w * (double)f4, this.field_70163_u - this.field_70181_x * (double)f4, this.field_70161_v - this.field_70179_y * (double)f4, this.field_70159_w, this.field_70181_x, this.field_70179_y, new int[0]);
            }
            f2 = 0.8f;
        }
        this.field_70159_w *= (double)f2;
        this.field_70181_x *= (double)f2;
        this.field_70179_y *= (double)f2;
        this.field_70181_x -= (double)f3;
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
    }
}


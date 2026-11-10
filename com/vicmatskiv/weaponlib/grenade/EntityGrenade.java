/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.grenade;

import com.vicmatskiv.weaponlib.Explosion;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleAxisAlignedBB;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTracing;
import com.vicmatskiv.weaponlib.compatibility.CompatibleVec3;
import com.vicmatskiv.weaponlib.grenade.AbstractEntityGrenade;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.BiPredicate;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityGrenade
extends AbstractEntityGrenade {
    private static final Logger logger = LogManager.getLogger(EntityGrenade.class);
    private long explosionTimeout;
    private float explosionStrength;
    private boolean destroyBlocks;
    private long activationTimestamp;

    private EntityGrenade(ModContext modContext, ItemGrenade itemGrenade, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(modContext, itemGrenade, thrower, velocity, gravityVelocity, rotationSlowdownFactor);
    }

    public EntityGrenade(World world) {
        super(world);
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        super.writeSpawnData(buffer);
        buffer.writeLong(this.activationTimestamp);
        buffer.writeLong(this.explosionTimeout);
        buffer.writeFloat(this.explosionStrength);
        buffer.writeBoolean(this.destroyBlocks);
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        super.readSpawnData(buffer);
        this.activationTimestamp = buffer.readLong();
        this.explosionTimeout = buffer.readLong();
        this.explosionStrength = buffer.readFloat();
        this.destroyBlocks = buffer.readBoolean();
    }

    @Override
    public void onGrenadeUpdate() {
        if (!CompatibilityProvider.compatibility.world((Entity)this).field_72995_K && this.explosionTimeout > 0L && System.currentTimeMillis() > this.activationTimestamp + this.explosionTimeout) {
            this.explode();
            return;
        }
    }

    @Override
    public void onBounce(CompatibleRayTraceResult movingobjectposition) {
        if (this.explosionTimeout == -1L && !CompatibilityProvider.compatibility.world((Entity)this).field_72995_K) {
            this.explode();
        } else {
            super.onBounce(movingobjectposition);
        }
    }

    private void explode() {
        logger.debug("Exploding {}", (Object)this);
        Explosion.createServerSideExplosion(this.modContext, CompatibilityProvider.compatibility.world(this), this, this.field_70165_t, this.field_70163_u, this.field_70161_v, this.explosionStrength, false, true, this.destroyBlocks, 1.0f, 1.0f, 1.5f, 1.0f, null, null, this.modContext.getExplosionSound());
        List<Entity> nearbyEntities = CompatibilityProvider.compatibility.getEntitiesWithinAABBExcludingEntity(CompatibilityProvider.compatibility.world(this), this, CompatibilityProvider.compatibility.getBoundingBox(this).expand(5.0, 5.0, 5.0));
        Float damageCoefficient = this.modContext.getConfigurationManager().getExplosions().getDamage();
        float effectiveRadius = this.itemGrenade.getEffectiveRadius() * damageCoefficient.floatValue();
        float fragmentDamage = this.itemGrenade.getFragmentDamage();
        float configuredFragmentCount = (float)this.itemGrenade.getFragmentCount() * damageCoefficient.floatValue();
        int i = 0;
        while ((float)i < configuredFragmentCount) {
            double z;
            double y;
            double x = (this.field_70146_Z.nextDouble() - 0.5) * 2.0;
            double d2 = x * x + (y = (this.field_70146_Z.nextDouble() - 0.5) * 2.0) * y + (z = (this.field_70146_Z.nextDouble() - 0.5) * 2.0) * z;
            if (d2 == 0.0) {
                logger.debug("Ignoring zero distance index {}", (Object)i);
            } else {
                double k = Math.sqrt((double)(effectiveRadius * effectiveRadius) / d2);
                double k2 = 0.1;
                CompatibleVec3 cvec1 = new CompatibleVec3(this.field_70165_t + x * k2, this.field_70163_u + y * k2, this.field_70161_v + z * k2);
                CompatibleVec3 cvec10 = new CompatibleVec3(this.field_70165_t + x * k2, this.field_70163_u + y * k2, this.field_70161_v + z * k2);
                CompatibleVec3 cvec2 = new CompatibleVec3(this.field_70165_t + x * k, this.field_70163_u + y * k, this.field_70161_v + z * k);
                BiPredicate<Block, CompatibleBlockState> isCollidable = (block, blockMetadata) -> CompatibilityProvider.compatibility.canCollideCheck((Block)block, (CompatibleBlockState)blockMetadata, false);
                CompatibleRayTraceResult rayTraceResult = CompatibleRayTracing.rayTraceBlocks(CompatibilityProvider.compatibility.world(this), cvec1, cvec2, isCollidable);
                if (rayTraceResult != null) {
                    cvec2 = CompatibleVec3.fromCompatibleVec3(rayTraceResult.getHitVec());
                }
                for (Entity nearbyEntityObject : nearbyEntities) {
                    float f;
                    CompatibleAxisAlignedBB axisalignedbb;
                    CompatibleRayTraceResult movingobjectposition1;
                    Entity nearbyEntity = nearbyEntityObject;
                    if (!nearbyEntity.func_70067_L() || (movingobjectposition1 = (axisalignedbb = CompatibilityProvider.compatibility.expandEntityBoundingBox(nearbyEntity, f = 0.5f, f, f)).calculateIntercept(cvec10, cvec2)) == null) continue;
                    double distanceToEntity = cvec10.distanceTo(movingobjectposition1.getHitVec());
                    float damageDistanceReductionFactor = (float)Math.abs(1.0 - distanceToEntity / (double)effectiveRadius);
                    logger.trace("Hit entity {} at distance {}, damage reduction {}", (Object)nearbyEntity, (Object)distanceToEntity, (Object)Float.valueOf(damageDistanceReductionFactor));
                    nearbyEntity.func_70097_a(DamageSource.func_76356_a((Entity)this, (Entity)this.getThrower()), Math.max(0.1f, this.field_70146_Z.nextFloat()) * fragmentDamage * damageDistanceReductionFactor);
                }
            }
            ++i;
        }
        this.func_70106_y();
    }

    @Override
    public ItemGrenade getItemGrenade() {
        return this.itemGrenade;
    }

    public static class Builder {
        private long explosionTimeout;
        private float explosionStrength;
        private boolean isDestroyingBlocks = true;
        private long activationTimestamp;
        private EntityLivingBase thrower;
        private ItemGrenade itemGrenade;
        private float velocity = 1.0f;
        private float gravityVelocity = 0.06f;
        private float rotationSlowdownFactor = 0.99f;

        public Builder withActivationTimestamp(long activationTimestamp) {
            this.activationTimestamp = activationTimestamp;
            return this;
        }

        public Builder withExplosionTimeout(long explosionTimeout) {
            this.explosionTimeout = explosionTimeout;
            return this;
        }

        public Builder withThrower(EntityLivingBase thrower) {
            this.thrower = thrower;
            return this;
        }

        public Builder withExplosionStrength(float explosionStrength) {
            this.explosionStrength = explosionStrength;
            return this;
        }

        public Builder withGrenade(ItemGrenade itemGrenade) {
            this.itemGrenade = itemGrenade;
            return this;
        }

        public Builder withVelocity(float velocity) {
            this.velocity = velocity;
            return this;
        }

        public Builder withGravityVelocity(float gravityVelocity) {
            this.gravityVelocity = gravityVelocity;
            return this;
        }

        public Builder withRotationSlowdownFactor(float rotationSlowdownFactor) {
            this.rotationSlowdownFactor = rotationSlowdownFactor;
            return this;
        }

        public Builder withDestroyingBlocks(boolean isDestroyingBlocks) {
            this.isDestroyingBlocks = isDestroyingBlocks;
            return this;
        }

        public EntityGrenade build(ModContext modContext) {
            EntityGrenade entityGrenade = new EntityGrenade(modContext, this.itemGrenade, this.thrower, this.velocity, this.gravityVelocity, this.rotationSlowdownFactor);
            entityGrenade.activationTimestamp = this.activationTimestamp;
            entityGrenade.explosionTimeout = this.explosionTimeout;
            entityGrenade.explosionStrength = this.explosionStrength;
            entityGrenade.itemGrenade = this.itemGrenade;
            entityGrenade.destroyBlocks = this.isDestroyingBlocks;
            return entityGrenade;
        }
    }
}


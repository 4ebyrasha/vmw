/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.grenade;

import com.vicmatskiv.weaponlib.Explosion;
import com.vicmatskiv.weaponlib.LightExposure;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExposureCapability;
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityFlashGrenade
extends AbstractEntityGrenade {
    private static final Logger logger = LogManager.getLogger(EntityFlashGrenade.class);
    public static int MAX_EFFECTIVE_DISTANCE = 15;
    private long explosionTimeout;
    private float explosionStrength;
    private boolean destroyBlocks;
    private long activationTimestamp;
    public int effectiveDistance;
    float offset = 0.3f;
    float[][] offsets = new float[][]{{0.0f, 0.0f, 0.0f}, {this.offset, 0.0f, 0.0f}, {-this.offset, 0.0f, 0.0f}, {0.0f, this.offset, 0.0f}, {0.0f, -this.offset, 0.0f}, {0.0f, 0.0f, this.offset}, {0.0f, 0.0f, -this.offset}};

    private EntityFlashGrenade(ModContext modContext, ItemGrenade itemGrenade, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(modContext, itemGrenade, thrower, velocity, gravityVelocity, rotationSlowdownFactor);
    }

    public EntityFlashGrenade(World world) {
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
        this.explosionStrength = 0.1f;
        Explosion.createServerSideExplosion(this.modContext, CompatibilityProvider.compatibility.world(this), this, this.field_70165_t, this.field_70163_u, this.field_70161_v, this.explosionStrength, false, true, false, 1.0f, 1.0f, 1.5f, 1.0f, null, null, this.modContext.getFlashExplosionSound());
        List<Entity> nearbyEntities = CompatibilityProvider.compatibility.getEntitiesWithinAABBExcludingEntity(CompatibilityProvider.compatibility.world(this), this, CompatibilityProvider.compatibility.getBoundingBox(this).expand(this.effectiveDistance, this.effectiveDistance, this.effectiveDistance));
        for (Entity nearbyEntityObject : nearbyEntities) {
            LightExposure exposure;
            Entity nearbyEntity = nearbyEntityObject;
            if (!(nearbyEntity instanceof EntityPlayer)) continue;
            float dose = this.getMaxDose(nearbyEntity);
            if (dose < 0.0f) {
                dose = 0.0f;
            }
            if ((exposure = CompatibleExposureCapability.getExposure(nearbyEntity, LightExposure.class)) == null) {
                exposure = new LightExposure(CompatibilityProvider.compatibility.world(nearbyEntity).func_82737_E(), 4000L, dose, 0.99f);
                CompatibleExposureCapability.updateExposure(nearbyEntity, exposure);
                continue;
            }
            float totalDose = exposure.getTotalDose() + dose;
            if (totalDose > 1.0f) {
                totalDose = 1.0f;
            }
            exposure.setTotalDose(totalDose);
            CompatibleExposureCapability.updateExposure(nearbyEntity, exposure);
        }
        this.func_70106_y();
    }

    private float getMaxDose(Entity nearbyEntity) {
        float dose = 0.0f;
        for (int i = 0; i < this.offsets.length; ++i) {
            float offsetDose = this.getDoseWithOffset(nearbyEntity, this.offsets[i][0], this.offsets[i][1], this.offsets[i][2]);
            float coefficient = (this.offset * 3.0f - Math.abs(this.offsets[i][0]) - Math.abs(this.offsets[i][1]) - Math.abs(this.offsets[i][2])) / (this.offset * 3.0f);
            if ((offsetDose *= coefficient) > dose) {
                dose = offsetDose;
            }
            if (dose > 0.97f) break;
        }
        return dose;
    }

    private float getDoseWithOffset(Entity nearbyEntity, double xOffset, double yOffset, double zOffset) {
        double posX = this.field_70165_t + xOffset;
        double posY = this.field_70163_u + yOffset;
        double posZ = this.field_70161_v + zOffset;
        CompatibleVec3 grenadePos = new CompatibleVec3(posX, posY, posZ);
        BiPredicate<Block, CompatibleBlockState> isCollidable = (block, blockMetadata) -> !this.isTransparentBlock((Block)block) && CompatibilityProvider.compatibility.canCollideCheck((Block)block, (CompatibleBlockState)blockMetadata, false);
        EntityPlayer player = (EntityPlayer)nearbyEntity;
        Vec3d playerLookVec = player.func_70676_i(1.0f);
        Vec3d playerEyePosition = player.func_174824_e(1.0f);
        Vec3d playerGrenadeVector = playerEyePosition.func_72444_a(new Vec3d(posX, posY, posZ));
        double dotProduct = playerLookVec.func_72430_b(playerGrenadeVector);
        double cos = dotProduct / (double)(MathHelper.func_76133_a((double)playerLookVec.func_189985_c()) * MathHelper.func_76133_a((double)playerGrenadeVector.func_189985_c()));
        float exposureFactor = (float)((cos + 1.0) / 2.0);
        exposureFactor *= exposureFactor;
        CompatibleVec3 compatiblePlayerEyePos = new CompatibleVec3(playerEyePosition.field_72450_a, playerEyePosition.field_72448_b, playerEyePosition.field_72449_c);
        CompatibleRayTraceResult rayTraceResult = CompatibleRayTracing.rayTraceBlocks(CompatibilityProvider.compatibility.world(this), grenadePos, compatiblePlayerEyePos, isCollidable);
        float dose = 0.0f;
        if (rayTraceResult == null) {
            dose = exposureFactor * (1.0f - (float)playerGrenadeVector.func_189985_c() / (float)(this.effectiveDistance * this.effectiveDistance));
        }
        return dose;
    }

    @Override
    public ItemGrenade getItemGrenade() {
        return this.itemGrenade;
    }

    private boolean isTransparentBlock(Block block) {
        return block == Blocks.field_150345_g || block == Blocks.field_150362_t || block == Blocks.field_150361_u || block == Blocks.field_150359_w || block == Blocks.field_150324_C || block == Blocks.field_150318_D || block == Blocks.field_150319_E || block == Blocks.field_150321_G || block == Blocks.field_150329_H || block == Blocks.field_150330_I || block == Blocks.field_150332_K || block == Blocks.field_180384_M || block == Blocks.field_150327_N || block == Blocks.field_150328_O || block == Blocks.field_150338_P || block == Blocks.field_150337_Q || block == Blocks.field_150333_U || block == Blocks.field_150478_aa || block == Blocks.field_150480_ab || block == Blocks.field_150474_ac || block == Blocks.field_150476_ad || block == Blocks.field_150488_af || block == Blocks.field_150464_aj || block == Blocks.field_150472_an || block == Blocks.field_150468_ap || block == Blocks.field_150448_aq || block == Blocks.field_150446_ar || block == Blocks.field_150444_as || block == Blocks.field_150442_at || block == Blocks.field_150456_au || block == Blocks.field_150452_aw || block == Blocks.field_150437_az || block == Blocks.field_150429_aA || block == Blocks.field_150430_aB || block == Blocks.field_150431_aC || block == Blocks.field_150436_aH || block == Blocks.field_180407_aO || block == Blocks.field_180408_aP || block == Blocks.field_180404_aQ || block == Blocks.field_180403_aR || block == Blocks.field_180406_aS || block == Blocks.field_180405_aT || block == Blocks.field_150427_aO || block == Blocks.field_150414_aQ || block == Blocks.field_150413_aR || block == Blocks.field_150416_aS || block == Blocks.field_150418_aU || block == Blocks.field_150411_aY || block == Blocks.field_150410_aZ || block == Blocks.field_150393_bb || block == Blocks.field_150394_bc || block == Blocks.field_150395_bd || block == Blocks.field_180390_bo || block == Blocks.field_180391_bp || block == Blocks.field_180392_bq || block == Blocks.field_180386_br || block == Blocks.field_180385_bs || block == Blocks.field_180387_bt || block == Blocks.field_150389_bf || block == Blocks.field_150390_bg || block == Blocks.field_150392_bi || block == Blocks.field_150386_bk || block == Blocks.field_150387_bl || block == Blocks.field_150388_bm || block == Blocks.field_150381_bn || block == Blocks.field_150382_bo || block == Blocks.field_150380_bt || block == Blocks.field_150379_bu || block == Blocks.field_150374_bv || block == Blocks.field_150376_bx || block == Blocks.field_150375_by || block == Blocks.field_150372_bz || block == Blocks.field_150479_bC || block == Blocks.field_150473_bD || block == Blocks.field_150485_bF || block == Blocks.field_150487_bG || block == Blocks.field_150481_bH || block == Blocks.field_150457_bL || block == Blocks.field_150459_bM || block == Blocks.field_150469_bN || block == Blocks.field_150471_bO || block == Blocks.field_150465_bP || block == Blocks.field_150467_bQ || block == Blocks.field_150445_bS || block == Blocks.field_150443_bT || block == Blocks.field_150441_bU || block == Blocks.field_150455_bV || block == Blocks.field_150453_bW || block == Blocks.field_180402_cm || block == Blocks.field_150438_bZ || block == Blocks.field_150370_cb || block == Blocks.field_150408_cc || block == Blocks.field_150409_cd || block == Blocks.field_180401_cv || block == Blocks.field_150404_cg || block == Blocks.field_150400_ck || block == Blocks.field_150401_cl || block == Blocks.field_150398_cm || block == Blocks.field_150399_cn || block == Blocks.field_150397_co || block == Blocks.field_180393_cK || block == Blocks.field_180394_cL || block == Blocks.field_180396_cN || block == Blocks.field_180389_cP || block == Blocks.field_185764_cQ || block == Blocks.field_185773_cZ || block == Blocks.field_189881_dj || block == Blocks.field_185779_df;
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
        private int effectiveDistance = MAX_EFFECTIVE_DISTANCE;

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

        public Builder withEffectiveDistance(int effectiveDistance) {
            this.effectiveDistance = effectiveDistance > MAX_EFFECTIVE_DISTANCE ? MAX_EFFECTIVE_DISTANCE : effectiveDistance;
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

        public EntityFlashGrenade build(ModContext modContext) {
            EntityFlashGrenade entityGrenade = new EntityFlashGrenade(modContext, this.itemGrenade, this.thrower, this.velocity, this.gravityVelocity, this.rotationSlowdownFactor);
            entityGrenade.activationTimestamp = this.activationTimestamp;
            entityGrenade.explosionTimeout = this.explosionTimeout;
            entityGrenade.explosionStrength = this.explosionStrength;
            entityGrenade.itemGrenade = this.itemGrenade;
            entityGrenade.destroyBlocks = this.isDestroyingBlocks;
            entityGrenade.effectiveDistance = this.effectiveDistance;
            return entityGrenade;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.Item
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.EntityProjectile;
import com.vicmatskiv.weaponlib.Explosion;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTargetPoint;
import com.vicmatskiv.weaponlib.config.Projectiles;
import com.vicmatskiv.weaponlib.particle.SpawnParticleMessage;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WeaponSpawnEntity
extends EntityProjectile {
    private static final Logger logger = LogManager.getLogger(WeaponSpawnEntity.class);
    private static final String TAG_ENTITY_ITEM = "entityItem";
    private static final String TAG_DAMAGE = "damage";
    private static final String TAG_EXPLOSION_RADIUS = "explosionRadius";
    private static final String TAG_EXPLOSION_IS_DESTROYING_BLOCKS = "destroyBlocks";
    private static final String TAG_EXPLOSION_PARTICLE_AGE_COEFFICIENT = "epac";
    private static final String TAG_SMOKE_PARTICLE_AGE_COEFFICIENT = "spac";
    private static final String TAG_EXPLOSION_PARTICLE_SCALE_COEFFICIENT = "epsc";
    private static final String TAG_SMOKE_PARTICLE_SCALE_COEFFICIENT = "spsc";
    private static final String TAG_EXPLOSION_PARTICLE_TEXTURE_ID = "epti";
    private static final String TAG_SMOKE_PARTICLE_TEXTURE_ID = "spti";
    private float explosionRadius;
    private float damage = 6.0f;
    private boolean isDestroyingBlocks;
    private float explosionParticleAgeCoefficient;
    private float smokeParticleAgeCoefficient;
    private float explosionParticleScaleCoefficient;
    private float smokeParticleScaleCoefficient;
    private Weapon weapon;
    private int explosionParticleTextureId;
    private int smokeParticleTextureId;

    public WeaponSpawnEntity(World world) {
        super(world);
    }

    public WeaponSpawnEntity(Weapon weapon, World world, EntityLivingBase player, float speed, float gravityVelocity, float inaccuracy, float damage, float explosionRadius, boolean isDestroyingBlocks, float explosionParticleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, int explosionParticleTextureId, int smokeParticleTextureId, Material ... damageableBlockMaterials) {
        super(world, player, speed, gravityVelocity, inaccuracy);
        this.weapon = weapon;
        this.damage = damage;
        this.explosionRadius = explosionRadius;
        this.isDestroyingBlocks = isDestroyingBlocks;
        this.explosionParticleAgeCoefficient = explosionParticleAgeCoefficient;
        this.smokeParticleAgeCoefficient = smokeParticleAgeCoefficient;
        this.explosionParticleScaleCoefficient = explosionParticleScaleCoefficient;
        this.smokeParticleScaleCoefficient = smokeParticleScaleCoefficient;
        this.explosionParticleTextureId = explosionParticleTextureId;
        this.smokeParticleTextureId = smokeParticleTextureId;
    }

    @Override
    public void func_70071_h_() {
        super.func_70071_h_();
    }

    @Override
    protected void onImpact(CompatibleRayTraceResult position) {
        if (CompatibilityProvider.compatibility.world((Entity)this).field_72995_K) {
            return;
        }
        if (this.weapon == null) {
            return;
        }
        if (this.explosionRadius > 0.0f) {
            Explosion.createServerSideExplosion(this.weapon.getModContext(), CompatibilityProvider.compatibility.world(this), this, position.getHitVec().getXCoord(), position.getHitVec().getYCoord(), position.getHitVec().getZCoord(), this.explosionRadius, false, true, this.isDestroyingBlocks, this.explosionParticleAgeCoefficient, this.smokeParticleAgeCoefficient, this.explosionParticleScaleCoefficient, this.smokeParticleScaleCoefficient, this.weapon.getModContext().getRegisteredTexture(this.explosionParticleTextureId), this.weapon.getModContext().getRegisteredTexture(this.smokeParticleTextureId), this.weapon.getModContext().getExplosionSound());
        } else if (position.getEntityHit() != null) {
            Projectiles projectilesConfig = this.weapon.getModContext().getConfigurationManager().getProjectiles();
            if (this.getThrower() != null) {
                position.getEntityHit().func_70097_a(DamageSource.func_76356_a((Entity)this, (Entity)this.getThrower()), this.damage);
            } else {
                position.getEntityHit().func_70097_a(CompatibilityProvider.compatibility.genericDamageSource(), this.damage);
            }
            position.getEntityHit().field_70172_ad = 0;
            position.getEntityHit().field_70126_B = (float)((double)position.getEntityHit().field_70126_B - 0.3);
            logger.debug("Hit entity {}", (Object)position.getEntityHit());
            CompatibleTargetPoint point = new CompatibleTargetPoint(position.getEntityHit().field_71093_bK, this.field_70165_t, this.field_70163_u, this.field_70161_v, 100.0);
            double magnitude = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70181_x * this.field_70181_x + this.field_70179_y * this.field_70179_y) + 1.0;
            float bleedingCoefficient = this.weapon.getBleedingCoefficient();
            if (projectilesConfig.getBleedingOnHit() != null) {
                bleedingCoefficient *= projectilesConfig.getBleedingOnHit().floatValue();
            }
            if (bleedingCoefficient > 0.0f) {
                int count = (int)((float)this.getParticleCount(this.damage) * bleedingCoefficient);
                logger.debug("Generating {} particle(s) per damage {}", (Object)count, (Object)Float.valueOf(this.damage));
                this.weapon.getModContext().getChannel().sendToAllAround(new SpawnParticleMessage(SpawnParticleMessage.ParticleType.BLOOD, count, position.getEntityHit().field_70165_t - this.field_70159_w / magnitude, position.getEntityHit().field_70163_u - this.field_70181_x / magnitude, position.getEntityHit().field_70161_v - this.field_70179_y / magnitude), point);
            }
        } else if (position.getTypeOfHit() == CompatibleRayTraceResult.Type.BLOCK) {
            this.weapon.onSpawnEntityBlockImpact(CompatibilityProvider.compatibility.world(this), null, this, position);
        }
        this.func_70106_y();
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        super.writeSpawnData(buffer);
        buffer.writeInt(Item.func_150891_b((Item)this.weapon));
        buffer.writeFloat(this.damage);
        buffer.writeFloat(this.explosionRadius);
        buffer.writeBoolean(this.isDestroyingBlocks);
        buffer.writeFloat(this.explosionParticleAgeCoefficient);
        buffer.writeFloat(this.smokeParticleAgeCoefficient);
        buffer.writeFloat(this.explosionParticleScaleCoefficient);
        buffer.writeFloat(this.smokeParticleScaleCoefficient);
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        super.readSpawnData(buffer);
        this.weapon = (Weapon)Item.func_150899_d((int)buffer.readInt());
        this.damage = buffer.readFloat();
        this.explosionRadius = buffer.readFloat();
        this.isDestroyingBlocks = buffer.readBoolean();
        this.explosionParticleAgeCoefficient = buffer.readFloat();
        this.smokeParticleAgeCoefficient = buffer.readFloat();
        this.explosionParticleScaleCoefficient = buffer.readFloat();
        this.smokeParticleScaleCoefficient = buffer.readFloat();
    }

    @Override
    public void func_70037_a(NBTTagCompound tagCompound) {
        super.func_70037_a(tagCompound);
        Item item = Item.func_150899_d((int)tagCompound.func_74762_e(TAG_ENTITY_ITEM));
        if (item instanceof Weapon) {
            this.weapon = (Weapon)item;
        }
        this.damage = tagCompound.func_74760_g(TAG_DAMAGE);
        this.explosionRadius = tagCompound.func_74760_g(TAG_EXPLOSION_RADIUS);
        this.isDestroyingBlocks = tagCompound.func_74767_n(TAG_EXPLOSION_IS_DESTROYING_BLOCKS);
        this.explosionParticleAgeCoefficient = tagCompound.func_74760_g(TAG_EXPLOSION_PARTICLE_AGE_COEFFICIENT);
        this.smokeParticleAgeCoefficient = tagCompound.func_74760_g(TAG_SMOKE_PARTICLE_AGE_COEFFICIENT);
        this.explosionParticleScaleCoefficient = tagCompound.func_74760_g(TAG_EXPLOSION_PARTICLE_SCALE_COEFFICIENT);
        this.smokeParticleScaleCoefficient = tagCompound.func_74760_g(TAG_SMOKE_PARTICLE_SCALE_COEFFICIENT);
        this.explosionParticleTextureId = tagCompound.func_74762_e(TAG_EXPLOSION_PARTICLE_TEXTURE_ID);
        this.smokeParticleTextureId = tagCompound.func_74762_e(TAG_SMOKE_PARTICLE_TEXTURE_ID);
    }

    @Override
    public void func_70014_b(NBTTagCompound tagCompound) {
        super.func_70014_b(tagCompound);
        tagCompound.func_74768_a(TAG_ENTITY_ITEM, Item.func_150891_b((Item)this.weapon));
        tagCompound.func_74776_a(TAG_DAMAGE, this.damage);
        tagCompound.func_74776_a(TAG_EXPLOSION_RADIUS, this.explosionRadius);
        tagCompound.func_74757_a(TAG_EXPLOSION_IS_DESTROYING_BLOCKS, this.isDestroyingBlocks);
        tagCompound.func_74776_a(TAG_EXPLOSION_PARTICLE_AGE_COEFFICIENT, this.explosionParticleAgeCoefficient);
        tagCompound.func_74776_a(TAG_SMOKE_PARTICLE_AGE_COEFFICIENT, this.smokeParticleAgeCoefficient);
        tagCompound.func_74776_a(TAG_EXPLOSION_PARTICLE_SCALE_COEFFICIENT, this.explosionParticleScaleCoefficient);
        tagCompound.func_74776_a(TAG_SMOKE_PARTICLE_SCALE_COEFFICIENT, this.smokeParticleScaleCoefficient);
        tagCompound.func_74768_a(TAG_EXPLOSION_PARTICLE_TEXTURE_ID, this.explosionParticleTextureId);
        tagCompound.func_74768_a(TAG_SMOKE_PARTICLE_TEXTURE_ID, this.smokeParticleTextureId);
    }

    Weapon getWeapon() {
        return this.weapon;
    }

    boolean isDamageableEntity(Entity entity) {
        return false;
    }

    int getParticleCount(float damage) {
        return (int)(damage - 1.0f);
    }

    @Override
    public boolean canCollideWithBlock(Block block, CompatibleBlockState metadata) {
        return !CompatibilityProvider.compatibility.isBlockPenetratableByBullets(block) && super.canCollideWithBlock(block, metadata);
    }

    public Item getSpawnedItem() {
        return null;
    }
}


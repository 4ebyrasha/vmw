/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityTNTPrimed
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.vicmatskiv.weaponlib;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.vicmatskiv.weaponlib.ExplosionMessage;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleAxisAlignedBB;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMathHelper;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.compatibility.CompatibleVec3;
import com.vicmatskiv.weaponlib.particle.ExplosionSmokeFX;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class Explosion {
    private static final ResourceLocation SMOKE_TEXTURE = new ResourceLocation("weaponlib:/com/vicmatskiv/weaponlib/resources/large-smoke.png");
    private ModContext modContext;
    private final boolean isFlaming;
    private final boolean isSmoking;
    private final Random explosionRNG;
    private final World world;
    private final double explosionX;
    private final double explosionY;
    private final double explosionZ;
    private final Entity exploder;
    private final float explosionSize;
    private final List<CompatibleBlockPos> affectedBlockPositions;
    private final Map<EntityPlayer, CompatibleVec3> playerKnockbackMap;
    private final CompatibleVec3 position;
    private final float explosionParticleAgeCoefficient;
    private final float smokeParticleAgeCoefficient;
    private final float explosionParticleScaleCoefficient;
    private final float smokeParticleScaleCoefficient;
    private String explosionParticleTextureName;
    private String smokeParticleTextureName;
    private CompatibleSound explosionSound;

    public static void createServerSideExplosion(ModContext modContext, World world, Entity entity, double posX, double posY, double posZ, float explosionStrength, boolean isFlaming, boolean isSmoking, boolean isDestroyingBlocks, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, CompatibleSound explosionSound) {
        Float damageCoefficient = modContext.getConfigurationManager().getExplosions().getDamage();
        Explosion explosion = new Explosion(modContext, world, entity, posX, posY, posZ, explosionStrength *= damageCoefficient.floatValue(), isFlaming, isSmoking, particleAgeCoefficient, smokeParticleAgeCoefficient, explosionParticleScaleCoefficient, smokeParticleScaleCoefficient, explosionParticleTextureName, smokeParticleTextureName, explosionSound);
        explosion.doExplosionA();
        explosion.doExplosionB(false, isDestroyingBlocks);
        if (!isSmoking) {
            explosion.clearAffectedBlockPositions();
        }
        for (Object o : world.field_73010_i) {
            EntityPlayer player = (EntityPlayer)o;
            if (!(player.func_70092_e(posX, posY, posZ) < 4096.0)) continue;
            modContext.getChannel().getChannel().sendTo((IMessage)new ExplosionMessage(posX, posY, posZ, explosionStrength, isDestroyingBlocks, explosion.getAffectedBlockPositions(), explosion.getPlayerKnockbackMap().get(player), particleAgeCoefficient, smokeParticleAgeCoefficient, explosionParticleScaleCoefficient, smokeParticleScaleCoefficient, modContext.getRegisteredTextureId(explosionParticleTextureName), modContext.getRegisteredTextureId(smokeParticleTextureName)), (EntityPlayerMP)player);
        }
    }

    public Explosion(ModContext modContext, World worldIn, Entity entityIn, double x, double y, double z, float size, List<CompatibleBlockPos> affectedPositions, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, CompatibleSound explosionSound) {
        this(modContext, worldIn, entityIn, x, y, z, size, false, true, affectedPositions, particleAgeCoefficient, smokeParticleAgeCoefficient, explosionParticleScaleCoefficient, smokeParticleScaleCoefficient, explosionParticleTextureName, smokeParticleTextureName, explosionSound);
    }

    public Explosion(ModContext modContext, World worldIn, Entity entityIn, double x, double y, double z, float size, boolean flaming, boolean smoking, List<CompatibleBlockPos> affectedPositions, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, CompatibleSound explosionSound) {
        this(modContext, worldIn, entityIn, x, y, z, size, flaming, smoking, particleAgeCoefficient, smokeParticleAgeCoefficient, explosionParticleScaleCoefficient, smokeParticleScaleCoefficient, explosionParticleTextureName, smokeParticleTextureName, explosionSound);
        this.affectedBlockPositions.addAll(affectedPositions);
    }

    public Explosion(ModContext modContext, World worldIn, Entity entityIn, double x, double y, double z, float size, boolean flaming, boolean smoking, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, CompatibleSound explosionSound) {
        this.modContext = modContext;
        this.explosionRNG = new Random();
        this.affectedBlockPositions = Lists.newArrayList();
        this.playerKnockbackMap = Maps.newHashMap();
        this.world = worldIn;
        this.exploder = entityIn;
        this.explosionSize = size;
        this.explosionX = x;
        this.explosionY = y;
        this.explosionZ = z;
        this.isFlaming = flaming;
        this.isSmoking = smoking;
        this.position = new CompatibleVec3(this.explosionX, this.explosionY, this.explosionZ);
        this.explosionParticleAgeCoefficient = particleAgeCoefficient;
        this.smokeParticleAgeCoefficient = smokeParticleAgeCoefficient;
        this.explosionParticleScaleCoefficient = explosionParticleScaleCoefficient;
        this.smokeParticleScaleCoefficient = smokeParticleScaleCoefficient;
        this.explosionParticleTextureName = explosionParticleTextureName;
        this.smokeParticleTextureName = smokeParticleTextureName;
        this.explosionSound = explosionSound;
    }

    public double getExplosionX() {
        return this.explosionX;
    }

    public double getExplosionY() {
        return this.explosionY;
    }

    public double getExplosionZ() {
        return this.explosionZ;
    }

    public World getWorld() {
        return this.world;
    }

    public Entity getExploder() {
        return this.exploder;
    }

    public float getExplosionSize() {
        return this.explosionSize;
    }

    public void doExplosionA() {
        HashSet set = Sets.newHashSet();
        for (int j = 0; j < 16; ++j) {
            for (int k = 0; k < 16; ++k) {
                for (int l = 0; l < 16; ++l) {
                    if (j != 0 && j != 15 && k != 0 && k != 15 && l != 0 && l != 15) continue;
                    double d0 = (float)j / 15.0f * 2.0f - 1.0f;
                    double d1 = (float)k / 15.0f * 2.0f - 1.0f;
                    double d2 = (float)l / 15.0f * 2.0f - 1.0f;
                    double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                    d0 /= d3;
                    d1 /= d3;
                    d2 /= d3;
                    double d4 = this.explosionX;
                    double d6 = this.explosionY;
                    double d8 = this.explosionZ;
                    for (float f = this.explosionSize * (0.7f + this.world.field_73012_v.nextFloat() * 0.6f); f > 0.0f; f -= 0.22500001f) {
                        CompatibleBlockPos blockpos = new CompatibleBlockPos((int)d4, (int)d6, (int)d8);
                        CompatibleBlockState blockState = CompatibilityProvider.compatibility.getBlockAtPosition(this.world, blockpos);
                        if (!CompatibilityProvider.compatibility.isAirBlock(blockState) && !CompatibilityProvider.compatibility.isBlockPenetratableByBullets(blockState)) {
                            float f2 = this.exploder != null ? CompatibilityProvider.compatibility.getExplosionResistance(this.world, this.exploder, this, blockpos, blockState) : CompatibilityProvider.compatibility.getExplosionResistance(this.world, blockState, blockpos, (Entity)null, this);
                            f -= (f2 + 0.3f) * 0.3f;
                        }
                        if (f > 0.0f && (this.exploder == null || CompatibilityProvider.compatibility.verifyExplosion(this.world, this.exploder, this, blockpos, blockState, f))) {
                            set.add(blockpos);
                        }
                        d4 += d0 * (double)0.3f;
                        d6 += d1 * (double)0.3f;
                        d8 += d2 * (double)0.3f;
                    }
                }
            }
        }
        this.affectedBlockPositions.addAll(set);
        float f3 = this.explosionSize * 4.0f;
        int k1 = CompatibleMathHelper.floor_double(this.explosionX - (double)f3 - 1.0);
        int l1 = CompatibleMathHelper.floor_double(this.explosionX + (double)f3 + 1.0);
        int i2 = CompatibleMathHelper.floor_double(this.explosionY - (double)f3 - 1.0);
        int i1 = CompatibleMathHelper.floor_double(this.explosionY + (double)f3 + 1.0);
        int j2 = CompatibleMathHelper.floor_double(this.explosionZ - (double)f3 - 1.0);
        int j1 = CompatibleMathHelper.floor_double(this.explosionZ + (double)f3 + 1.0);
        List<Entity> list = CompatibilityProvider.compatibility.getEntitiesWithinAABBExcludingEntity(this.world, this.exploder, new CompatibleAxisAlignedBB(k1, i2, j2, l1, i1, j1));
        CompatibleVec3 vec3d = new CompatibleVec3(this.explosionX, this.explosionY, this.explosionZ);
        for (int k2 = 0; k2 < list.size(); ++k2) {
            EntityPlayer entityplayer;
            double d9;
            double d7;
            double d5;
            double d13;
            double d12;
            Entity entity = list.get(k2);
            if (CompatibilityProvider.compatibility.isImmuneToExplosions(entity) || !((d12 = entity.func_70011_f(this.explosionX, this.explosionY, this.explosionZ) / (double)f3) <= 1.0) || (d13 = (double)CompatibleMathHelper.sqrt_double((d5 = entity.field_70165_t - this.explosionX) * d5 + (d7 = entity.field_70163_u + (double)entity.func_70047_e() - this.explosionY) * d7 + (d9 = entity.field_70161_v - this.explosionZ) * d9)) == 0.0) continue;
            d5 /= d13;
            d7 /= d13;
            d9 /= d13;
            double d14 = CompatibilityProvider.compatibility.getBlockDensity(this.world, vec3d, CompatibilityProvider.compatibility.getBoundingBox(entity), (block, blockMetadata) -> this.canCollideWithBlock((Block)block, (CompatibleBlockState)blockMetadata));
            double d10 = (1.0 - d12) * d14;
            entity.func_70097_a(CompatibilityProvider.compatibility.getDamageSource(this), (float)((int)((d10 * d10 + d10) / 2.0 * 7.0 * (double)f3 + 1.0)));
            double d11 = 1.0;
            if (entity instanceof EntityLivingBase) {
                d11 = CompatibilityProvider.compatibility.getBlastDamageReduction((EntityLivingBase)entity, d10);
            }
            entity.field_70159_w += d5 * d11;
            entity.field_70181_x += d7 * d11;
            entity.field_70179_y += d9 * d11;
            if (!(entity instanceof EntityPlayer) || CompatibilityProvider.compatibility.isSpectator(entityplayer = (EntityPlayer)entity) || CompatibilityProvider.compatibility.isCreative(entityplayer) && entityplayer.field_71075_bZ.field_75100_b) continue;
            this.playerKnockbackMap.put(entityplayer, new CompatibleVec3(d5 * d10, d7 * d10, d9 * d10));
        }
    }

    public boolean canCollideWithBlock(Block block, CompatibleBlockState metadata) {
        return !CompatibilityProvider.compatibility.isBlockPenetratableByBullets(block) && CompatibilityProvider.compatibility.canCollideCheck(block, metadata, false);
    }

    public void doExplosionB(boolean spawnParticles, boolean destroyBlocks) {
        if (!this.world.field_72995_K && this.explosionSound != null) {
            CompatibilityProvider.compatibility.playSound(this.world, this.explosionX, this.explosionY, this.explosionZ, this.explosionSound, 4.0f, (1.0f + (this.world.field_73012_v.nextFloat() - this.world.field_73012_v.nextFloat()) * 0.2f) * 0.7f);
        }
        if (this.isSmoking) {
            int counter = 0;
            for (CompatibleBlockPos blockpos : this.affectedBlockPositions) {
                if (counter++ % 2 != 0) continue;
                CompatibleBlockState blockState = CompatibilityProvider.compatibility.getBlockAtPosition(this.world, blockpos);
                if (spawnParticles) {
                    for (int i = 0; i < 1; ++i) {
                        double d0 = (float)blockpos.getBlockPosX() + this.world.field_73012_v.nextFloat();
                        double d1 = (float)blockpos.getBlockPosY() + this.world.field_73012_v.nextFloat();
                        double d2 = (float)blockpos.getBlockPosZ() + this.world.field_73012_v.nextFloat();
                        double d3 = d0 - this.explosionX;
                        double d4 = d1 - this.explosionY;
                        double d5 = d2 - this.explosionZ;
                        double d6 = CompatibleMathHelper.sqrt_double(d3 * d3 + d4 * d4 + d5 * d5);
                        d3 /= d6;
                        d4 /= d6;
                        d5 /= d6;
                        double d7 = 4.0 / (d6 / (double)this.explosionSize + 0.1);
                        this.modContext.getEffectManager().spawnExplosionParticle((d0 + this.explosionX) / 2.0, (d1 + this.explosionY) / 2.0, (d2 + this.explosionZ) / 2.0, (d3 *= (d7 *= (double)(this.world.field_73012_v.nextFloat() * this.world.field_73012_v.nextFloat() + 0.3f))) / 2.0, (d4 *= d7) * 2.0, (d5 *= d7) / 2.0, this.explosionParticleScaleCoefficient * this.world.field_73012_v.nextFloat(), (int)((float)(15 + (int)(this.world.field_73012_v.nextFloat() * 10.0f)) * this.explosionParticleAgeCoefficient), this.explosionParticleTextureName);
                    }
                }
                if (!destroyBlocks || CompatibilityProvider.compatibility.isAirBlock(blockState)) continue;
                if (CompatibilityProvider.compatibility.canDropBlockFromExplosion(blockState, this)) {
                    CompatibilityProvider.compatibility.dropBlockAsItemWithChance(this.world, blockState, blockpos, this.modContext.getConfigurationManager().getExplosions().getDropBlockChance().floatValue() * (1.0f / this.explosionSize), 0);
                }
                CompatibilityProvider.compatibility.onBlockExploded(this.world, blockState, blockpos, this);
            }
            if (spawnParticles) {
                for (int i = 0; i < 15; ++i) {
                    double pX = this.explosionX + this.world.field_73012_v.nextGaussian() * 0.8;
                    double pY = this.explosionY + this.world.field_73012_v.nextGaussian() * 0.9;
                    double pZ = this.explosionZ + this.world.field_73012_v.nextGaussian() * 0.8;
                    double motionX = this.world.field_73012_v.nextGaussian() * 0.001;
                    double motionY = this.world.field_73012_v.nextGaussian() * 1.0E-4;
                    double motionZ = this.world.field_73012_v.nextGaussian() * 0.001;
                    this.modContext.getEffectManager().spawnExplosionSmoke(pX, pY, pZ, motionX, motionY, motionZ, this.smokeParticleScaleCoefficient, (int)((float)(250 + (int)(this.world.field_73012_v.nextFloat() * 30.0f)) * this.smokeParticleAgeCoefficient), ExplosionSmokeFX.Behavior.EXPLOSION, this.smokeParticleTextureName);
                }
            }
        }
        if (this.isFlaming && destroyBlocks) {
            for (CompatibleBlockPos blockpos1 : this.affectedBlockPositions) {
                if (!CompatibilityProvider.compatibility.isAirBlock(this.world, blockpos1) || !CompatibilityProvider.compatibility.isFullBlock(CompatibilityProvider.compatibility.getBlockBelow(this.world, blockpos1)) || this.explosionRNG.nextInt(3) != 0) continue;
                CompatibilityProvider.compatibility.setBlockToFire(this.world, blockpos1);
            }
        }
    }

    public Map<EntityPlayer, CompatibleVec3> getPlayerKnockbackMap() {
        return this.playerKnockbackMap;
    }

    public EntityLivingBase getExplosivePlacedBy() {
        return this.exploder == null ? null : (this.exploder instanceof EntityTNTPrimed ? ((EntityTNTPrimed)this.exploder).func_94083_c() : (this.exploder instanceof EntityLivingBase ? (EntityLivingBase)this.exploder : null));
    }

    public void clearAffectedBlockPositions() {
        this.affectedBlockPositions.clear();
    }

    public List<CompatibleBlockPos> getAffectedBlockPositions() {
        return this.affectedBlockPositions;
    }

    public CompatibleVec3 getPosition() {
        return this.position;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.vicmatskiv.weaponlib.grenade;

import com.vicmatskiv.weaponlib.EntitySpreadable;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.grenade.AbstractEntityGrenade;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import com.vicmatskiv.weaponlib.particle.SpawnParticleMessage;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class EntityGasGrenade
extends AbstractEntityGrenade {
    private long activationDelay;
    private long activationTimestamp;
    private float smokeAmount;
    private long activeDuration;

    private EntityGasGrenade(ModContext modContext, ItemGrenade itemGrenade, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(modContext, itemGrenade, thrower, velocity, gravityVelocity, rotationSlowdownFactor);
    }

    public EntityGasGrenade(World world) {
        super(world);
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        super.writeSpawnData(buffer);
        buffer.writeLong(this.activationTimestamp);
        buffer.writeLong(this.activationDelay);
        buffer.writeLong(this.activeDuration);
        buffer.writeFloat(this.smokeAmount);
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        super.readSpawnData(buffer);
        this.activationTimestamp = buffer.readLong();
        this.activationDelay = buffer.readLong();
        this.activeDuration = buffer.readLong();
        this.smokeAmount = buffer.readFloat();
    }

    @Override
    public void func_70014_b(NBTTagCompound tagCompound) {
        super.func_70014_b(tagCompound);
        tagCompound.func_74772_a("activationTimestamp", this.activationTimestamp);
        tagCompound.func_74772_a("activationDelay", this.activationDelay);
        tagCompound.func_74772_a("activeDuration", this.activeDuration);
        tagCompound.func_74776_a("smokeAmount", this.smokeAmount);
    }

    @Override
    public void func_70037_a(NBTTagCompound tagCompound) {
        super.func_70037_a(tagCompound);
        this.activationTimestamp = tagCompound.func_74763_f("activationTimestamp");
        this.activationDelay = tagCompound.func_74763_f("activationDelay");
        this.activeDuration = tagCompound.func_74763_f("activeDuration");
        this.smokeAmount = tagCompound.func_74760_g("smokeAmount");
    }

    @Override
    public void onGrenadeUpdate() {
        if (this.modContext == null) {
            return;
        }
        long timeRemaining = this.activationTimestamp + this.activationDelay + this.activeDuration - System.currentTimeMillis();
        if (this.activationDelay != -1L) {
            if (timeRemaining < 0L) {
                this.func_70106_y();
            } else if (!CompatibilityProvider.compatibility.world((Entity)this).field_72995_K && timeRemaining <= this.activeDuration && this.stopped) {
                double f = 0.1 + Math.sin(Math.PI * (1.0 - (double)timeRemaining / (double)this.activeDuration)) * 0.1;
                if (this.field_70146_Z.nextDouble() <= f) {
                    for (Object o : CompatibilityProvider.compatibility.world((Entity)this).field_73010_i) {
                        EntityPlayer player = (EntityPlayer)o;
                        if (!(player.func_70092_e(this.field_70165_t, this.field_70163_u, this.field_70161_v) < 4096.0)) continue;
                        SpawnParticleMessage.ParticleType particleType = SpawnParticleMessage.ParticleType.SMOKE_GRENADE_YELLOW_SMOKE;
                        double movement = this.bounceCount > 0 ? 0.007 : 0.001;
                        this.modContext.getChannel().getChannel().sendTo((IMessage)new SpawnParticleMessage(particleType, 1, this.field_70165_t + this.field_70146_Z.nextGaussian() / 7.0, this.field_70163_u + this.field_70146_Z.nextGaussian() / 10.0, this.field_70161_v + this.field_70146_Z.nextGaussian() / 7.0, this.field_70146_Z.nextGaussian() * movement, this.field_70146_Z.nextGaussian() * movement, this.field_70146_Z.nextGaussian() * movement), (EntityPlayerMP)player);
                    }
                }
            }
        }
    }

    @Override
    public void onBounce(CompatibleRayTraceResult movingobjectposition) {
        if (this.activationDelay == -1L) {
            this.activationDelay = 0L;
            this.activationTimestamp = System.currentTimeMillis();
        } else {
            super.onBounce(movingobjectposition);
        }
    }

    @Override
    public void onStop() {
        World world = CompatibilityProvider.compatibility.world(this);
        if (!world.field_72995_K && this.itemGrenade != null) {
            CompatibilityProvider.compatibility.playSound(CompatibilityProvider.compatibility.world(this), this.field_70165_t, this.field_70163_u, this.field_70161_v, this.itemGrenade.getStopAfterThrowingSound(), 2.0f, (1.0f + (world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()) * 0.2f) * 0.7f);
            EntitySpreadable gasEntity = new EntitySpreadable(world);
            gasEntity.field_70165_t = this.field_70165_t;
            gasEntity.field_70163_u = this.field_70163_u;
            gasEntity.field_70161_v = this.field_70161_v;
            if (this.getThrower() != null) {
                CompatibilityProvider.compatibility.spawnEntity(this.getThrower(), gasEntity);
            }
        }
    }

    public static class Builder {
        private long activationDelay;
        private long activationTimestamp;
        private long activeDuration;
        private float smokeAmount;
        private EntityLivingBase thrower;
        private ItemGrenade itemGrenade;
        private float velocity = 1.0f;
        private float gravityVelocity = 0.06f;
        private float rotationSlowdownFactor = 0.99f;

        public Builder withActivationTimestamp(long activationTimestamp) {
            this.activationTimestamp = activationTimestamp;
            return this;
        }

        public Builder withActivationDelay(long activationDelay) {
            this.activationDelay = activationDelay;
            return this;
        }

        public Builder withThrower(EntityLivingBase thrower) {
            this.thrower = thrower;
            return this;
        }

        public Builder withSmokeAmount(float smokeAmount) {
            this.smokeAmount = smokeAmount;
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

        public Builder withActiveDuration(long activeDuration) {
            this.activeDuration = activeDuration;
            return this;
        }

        public EntityGasGrenade build(ModContext modContext) {
            EntityGasGrenade entityGrenade = new EntityGasGrenade(modContext, this.itemGrenade, this.thrower, this.velocity, this.gravityVelocity, this.rotationSlowdownFactor);
            entityGrenade.activationTimestamp = this.activationTimestamp;
            entityGrenade.activationDelay = this.activationDelay;
            entityGrenade.smokeAmount = this.smokeAmount;
            entityGrenade.activeDuration = this.activeDuration;
            return entityGrenade;
        }
    }
}


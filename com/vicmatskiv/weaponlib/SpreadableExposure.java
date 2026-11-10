/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.Exposure;
import com.vicmatskiv.weaponlib.ExposureProtection;
import com.vicmatskiv.weaponlib.MiscUtils;
import com.vicmatskiv.weaponlib.Spreadable;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.network.UniversalObject;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.function.Function;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpreadableExposure
extends UniversalObject
implements Exposure {
    private static final float MIN_EFFECTIVE_TOTAL_DOSE = 0.01f;
    public static final int DEFAULT_IMPACT_DELAY = 5000;
    private static final float DEFAULT_DECAY_FACTOR = 0.999f;
    private long firstExposureTimestamp;
    private float totalDose;
    private float lastDose;
    private Map<UUID, Float> cycleDoseMap = new HashMap<UUID, Float>();
    private long firstExposureImpactDelay = 5000L;
    private float decayFactor = 0.999f;
    private long startCycleTimestamp;
    private long lastSyncTimestamp;
    private long lastApplyTimestamp;
    private float entityImpactRate = 0.5f;
    private long cycleLengthMillis = 10L;
    private int tickCount;
    private Function<Float, Float> absorbFunction = dose -> Float.valueOf(dose.floatValue() * Math.min(0.2f, 0.2f / this.totalDose));
    private Blackout blackout = new Blackout();
    private Collection<Listener> listeners = new LinkedHashSet<Listener>();
    private float colorImpairmentR = 1.2f;
    private float colorImpairmentG = 1.0f;
    private float colorImpairmentB = 0.8f;

    public SpreadableExposure() {
        this(5000L, 0L);
    }

    public SpreadableExposure(long firstExposureImpactDelay, long firstExposureTimestamp) {
        this.firstExposureImpactDelay = firstExposureImpactDelay;
        this.firstExposureTimestamp = firstExposureTimestamp;
    }

    public SpreadableExposure withColorImpairment(float r, float g, float b) {
        this.colorImpairmentR = r;
        this.colorImpairmentG = g;
        this.colorImpairmentB = b;
        return this;
    }

    public long getFirstExposureTimestamp() {
        return this.firstExposureTimestamp;
    }

    public float getTotalDose() {
        return this.totalDose;
    }

    public float getLastDose() {
        return this.lastDose;
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void apply(Spreadable spreadable, Entity entity, float dose) {
        Float currentSourceDose = this.cycleDoseMap.get(spreadable.getId());
        if (currentSourceDose == null) {
            ItemStack helmet;
            this.cycleDoseMap.put(spreadable.getId(), Float.valueOf(dose));
            this.lastDose = 0.0f;
            this.cycleDoseMap.forEach((k, v) -> this.lastDose += v.floatValue());
            Function<Float, Float> absorbFunction = null;
            if (entity instanceof EntityLivingBase && (helmet = CompatibilityProvider.compatibility.getHelmet((EntityLivingBase)entity)) != null && helmet.func_77973_b() instanceof ExposureProtection) {
                absorbFunction = ((ExposureProtection)helmet.func_77973_b()).getAbsorbFunction(spreadable);
            }
            if (absorbFunction == null) {
                absorbFunction = this.absorbFunction;
            }
            Float absorbedDose = absorbFunction.apply(Float.valueOf(dose));
            this.totalDose += absorbedDose.floatValue();
        }
    }

    public void setLastSyncTimestamp(long lastSyncTimestamp) {
        this.lastSyncTimestamp = lastSyncTimestamp;
    }

    @Override
    public long getLastSyncTimestamp() {
        return this.lastSyncTimestamp;
    }

    @Override
    public void updateFrom(Exposure otherExposure) {
        if (otherExposure instanceof SpreadableExposure) {
            SpreadableExposure other = (SpreadableExposure)otherExposure;
            this.firstExposureImpactDelay = other.firstExposureImpactDelay;
            this.firstExposureTimestamp = other.firstExposureTimestamp;
            this.totalDose = other.totalDose;
            this.lastDose = other.lastDose;
            this.colorImpairmentR = other.colorImpairmentR;
            this.colorImpairmentG = other.colorImpairmentG;
            this.colorImpairmentB = other.colorImpairmentB;
        }
    }

    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
        this.firstExposureImpactDelay = buf.readLong();
        this.firstExposureTimestamp = buf.readLong();
        this.totalDose = buf.readFloat();
        this.lastDose = buf.readFloat();
        this.colorImpairmentR = buf.readFloat();
        this.colorImpairmentG = buf.readFloat();
        this.colorImpairmentB = buf.readFloat();
    }

    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
        buf.writeLong(this.firstExposureImpactDelay);
        buf.writeLong(this.firstExposureTimestamp);
        buf.writeFloat(this.totalDose);
        buf.writeFloat(this.lastDose);
        buf.writeFloat(this.colorImpairmentR);
        buf.writeFloat(this.colorImpairmentG);
        buf.writeFloat(this.colorImpairmentB);
    }

    @Override
    public void update(Entity entity) {
        long worldTime = CompatibilityProvider.compatibility.world(entity).func_82737_E();
        if (this.firstExposureTimestamp > worldTime) {
            this.firstExposureTimestamp = worldTime;
        }
        if (this.firstExposureImpactDelay >= 1000L) {
            this.firstExposureImpactDelay = 20L;
        }
        if (worldTime - this.startCycleTimestamp > this.cycleLengthMillis) {
            this.startCycleTimestamp = CompatibilityProvider.compatibility.world(entity).func_82737_E();
            this.cycleDoseMap.clear();
        }
        if (this.firstExposureTimestamp > 0L) {
            if (this.firstExposureTimestamp + this.firstExposureImpactDelay < worldTime && entity instanceof EntityLivingBase) {
                EntityLivingBase entityLiving = (EntityLivingBase)entity;
                this.applyToEntity(entityLiving);
            }
            this.totalDose *= this.decayFactor;
        }
    }

    public void applyToEntity(EntityLivingBase entityLiving) {
        long worldTime = CompatibilityProvider.compatibility.world((Entity)entityLiving).func_82737_E();
        if (this.totalDose > 0.01f && (float)(worldTime - this.lastApplyTimestamp) >= 20.0f / this.entityImpactRate) {
            boolean isCreative = false;
            if (entityLiving instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer)entityLiving;
                isCreative = player.field_71075_bZ.field_75098_d;
            }
            if (!isCreative) {
                if (entityLiving instanceof EntityPlayer) {
                    entityLiving.func_70606_j(entityLiving.func_110143_aJ() - this.totalDose);
                } else {
                    entityLiving.func_70097_a(CompatibilityProvider.compatibility.genericDamageSource(), this.totalDose);
                }
            }
            this.lastApplyTimestamp = worldTime;
        }
    }

    public void incrementTickCount() {
        ++this.tickCount;
    }

    public int getTickCount() {
        return this.tickCount;
    }

    public Blackout getBlackout() {
        return this.blackout;
    }

    @Override
    public boolean isEffective(World world) {
        return this.getLastDose() > 0.0f || this.getTotalDose() > 0.01f;
    }

    public float getColorImpairmentR() {
        return this.colorImpairmentR;
    }

    public float getColorImpairmentG() {
        return this.colorImpairmentG;
    }

    public float getColorImpairmentB() {
        return this.colorImpairmentB;
    }

    public class Blackout {
        private long duration = 2000L;
        private long enterDuration = 1000L;
        private long exitDuration = 500L;
        private long startTime;
        private long minIntervalBetweenBlackouts = 10000L;
        private Random random = new Random();

        public float getProgress() {
            return MiscUtils.clamp((float)(System.currentTimeMillis() - this.startTime) / (float)this.duration, 0.0f, 1.0f);
        }

        public float getEnterProgress() {
            return MiscUtils.clamp((float)(System.currentTimeMillis() - this.startTime) / (float)this.enterDuration, 0.0f, 1.0f);
        }

        public float getExitProgress() {
            return MiscUtils.clamp((float)(System.currentTimeMillis() - (this.startTime + this.duration - this.exitDuration)) / (float)this.exitDuration, 0.0f, 1.0f);
        }

        public BlackoutPhase getPhase() {
            long currentTime = System.currentTimeMillis();
            BlackoutPhase phase = BlackoutPhase.NONE;
            if (currentTime >= this.startTime && currentTime < this.startTime + this.enterDuration) {
                phase = BlackoutPhase.ENTER;
            } else if (currentTime >= this.startTime + this.enterDuration && currentTime < this.startTime + this.duration - this.exitDuration) {
                phase = BlackoutPhase.DARK;
            } else if (currentTime >= this.startTime + this.duration - this.exitDuration && currentTime < this.startTime + this.duration) {
                phase = BlackoutPhase.EXIT;
            }
            return phase;
        }

        public void update() {
            if (this.getPhase() != BlackoutPhase.NONE) {
                return;
            }
            if (SpreadableExposure.this.totalDose > 0.7f && this.random.nextFloat() < SpreadableExposure.this.totalDose * SpreadableExposure.this.totalDose && this.startTime + this.duration + this.minIntervalBetweenBlackouts < System.currentTimeMillis()) {
                this.startTime = System.currentTimeMillis();
                this.exitDuration = 300L;
                this.duration = this.enterDuration + this.exitDuration + 500L + (long)(this.random.nextFloat() * SpreadableExposure.this.totalDose * 2000.0f);
            }
        }
    }

    public static enum BlackoutPhase {
        NONE,
        ENTER,
        DARK,
        EXIT;

    }

    public static interface Listener {
        public void onUpdate(SpreadableExposure var1);
    }
}


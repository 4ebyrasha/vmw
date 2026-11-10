/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.Exposure;
import com.vicmatskiv.weaponlib.network.UniversalObject;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class LightExposure
extends UniversalObject
implements Exposure {
    private long lastExposureTimestamp;
    private long maxDuration;
    private float totalDose = 1.0f;
    private float decayFactor = 0.995f;

    public LightExposure() {
    }

    public LightExposure(long lastExposureTimestamp, long maxDuration, float dose, float decayFactor) {
        this.lastExposureTimestamp = lastExposureTimestamp;
        this.maxDuration = maxDuration;
        this.totalDose = dose;
        this.decayFactor = decayFactor;
    }

    public float getTotalDose() {
        return this.totalDose;
    }

    public void setTotalDose(float totalDose) {
        this.totalDose = totalDose;
    }

    @Override
    public boolean isEffective(World world) {
        return this.totalDose > 3.0E-4f && world.func_82737_E() - this.lastExposureTimestamp <= this.maxDuration;
    }

    @Override
    public void update(Entity entity) {
        this.totalDose *= this.decayFactor;
    }

    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
        buf.writeLong(this.lastExposureTimestamp);
        buf.writeFloat(this.totalDose);
    }

    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
        this.lastExposureTimestamp = buf.readLong();
        this.totalDose = buf.readFloat();
    }

    @Override
    public void updateFrom(Exposure otherExposure) {
        if (otherExposure instanceof LightExposure) {
            LightExposure other = (LightExposure)otherExposure;
            this.lastExposureTimestamp = other.lastExposureTimestamp;
            this.totalDose = other.totalDose;
        }
    }

    @Override
    public long getLastSyncTimestamp() {
        return 0L;
    }
}


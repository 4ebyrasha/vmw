/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.Contextual;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.Spreadable;
import com.vicmatskiv.weaponlib.SpreadableExposure;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleAxisAlignedBB;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExposureCapability;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntitySpreadable
extends Entity
implements Contextual,
Spreadable {
    private static final String TAG_SPREAD_MAP = "spreadMap";
    private static final float DEFAULT_CONCENTRATION_SPREAD_FACTOR = 0.8f;
    private static final float DEFAULT_MIN_CONCENTRATION_THRESHOLD = 0.01f;
    private static final float DEFAULT_SPREAD_RATE = 0.5f;
    private static final float DEFAULT_CONCENTRATION_DECAY_FACTOR = 0.99f;
    private Map<CompatibleBlockPos, Float> spreadMap = new HashMap<CompatibleBlockPos, Float>();
    private List<CompatibleBlockPos> currentSpread;
    private float initialConcentration = 1.0f;
    private float concentrationSpreadUpFactor = 0.8f;
    private float concentrationSpreadDownFactor = 0.8f;
    private float concentrationSpreadSideFactor = 0.8f;
    private float minConcentrationThreshold = 0.01f;
    private CompatibleAxisAlignedBB spreadBox;
    private float spreadRate = 0.5f;
    private long lastSpreadTimestamp;
    private float concentrationDecayAdjustment = 1.0f;
    private float concentrationDecayFactor = 0.99f;
    private ModContext modContext;

    public EntitySpreadable(World worldIn) {
        super(worldIn);
    }

    @Override
    public void setContext(ModContext modContext) {
        this.modContext = modContext;
    }

    EntitySpreadable setConcentrationSpreadUpFactor(float concentrationSpreadUpFactor) {
        this.concentrationSpreadUpFactor = concentrationSpreadUpFactor;
        return this;
    }

    EntitySpreadable setConcentrationSpreadDownFactor(float concentrationSpreadDownFactor) {
        this.concentrationSpreadDownFactor = concentrationSpreadDownFactor;
        return this;
    }

    EntitySpreadable setConcentrationSpreadSideFactor(float concentrationSpreadSideFactor) {
        this.concentrationSpreadSideFactor = concentrationSpreadSideFactor;
        return this;
    }

    EntitySpreadable setMinConcentrationThreshold(float minConcentrationThreshold) {
        this.minConcentrationThreshold = minConcentrationThreshold;
        return this;
    }

    EntitySpreadable setSpreadRate(float spreadRate) {
        this.spreadRate = spreadRate;
        return this;
    }

    EntitySpreadable setConcentrationDecayFactor(float concentrationDecayFactor) {
        this.concentrationDecayFactor = concentrationDecayFactor;
        return this;
    }

    protected void func_70088_a() {
    }

    private void initSpreadBox() {
        double spreadUpDistance = Math.log10(this.minConcentrationThreshold / this.initialConcentration) / Math.log10(this.concentrationSpreadUpFactor) + 1.0;
        double spreadDownDistance = Math.log10(this.minConcentrationThreshold / this.initialConcentration) / Math.log10(this.concentrationSpreadDownFactor) + 1.0;
        double spreadSideDistance = Math.log10(this.minConcentrationThreshold / this.initialConcentration) / Math.log10(this.concentrationSpreadSideFactor) + 1.0;
        this.spreadBox = new CompatibleAxisAlignedBB(this.field_70165_t - spreadSideDistance, this.field_70163_u - spreadDownDistance, this.field_70161_v - spreadSideDistance, this.field_70165_t + spreadSideDistance, this.field_70163_u + spreadUpDistance, this.field_70161_v + spreadSideDistance);
    }

    protected void func_70037_a(NBTTagCompound compound) {
        CompatibleBlockPos blockPos;
        byte[] bytes = compound.func_74770_j(TAG_SPREAD_MAP);
        ByteBuf buf = Unpooled.wrappedBuffer((byte[])bytes);
        this.concentrationSpreadUpFactor = buf.readFloat();
        this.concentrationSpreadDownFactor = buf.readFloat();
        this.concentrationSpreadSideFactor = buf.readFloat();
        this.minConcentrationThreshold = buf.readFloat();
        this.spreadRate = buf.readFloat();
        this.lastSpreadTimestamp = buf.readLong();
        this.concentrationDecayAdjustment = buf.readFloat();
        this.concentrationDecayFactor = buf.readFloat();
        int spreadMapSize = buf.readInt();
        for (int i = 0; i < spreadMapSize; ++i) {
            blockPos = new CompatibleBlockPos(buf.readInt(), buf.readInt(), buf.readInt());
            this.spreadMap.put(blockPos, Float.valueOf(buf.readFloat()));
        }
        int currentSpreadSize = buf.readInt();
        if (this.currentSpread == null) {
            this.currentSpread = new ArrayList<CompatibleBlockPos>();
            this.initSpreadBox();
            blockPos = new CompatibleBlockPos((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
            this.spreadMap.put(blockPos, Float.valueOf(this.initialConcentration));
        }
        for (int i = 0; i < currentSpreadSize; ++i) {
            CompatibleBlockPos blockPos2 = new CompatibleBlockPos(buf.readInt(), buf.readInt(), buf.readInt());
            this.currentSpread.add(blockPos2);
        }
        this.initSpreadBox();
    }

    protected void func_70014_b(NBTTagCompound compound) {
        ByteBuf buf = Unpooled.buffer();
        buf.writeFloat(this.concentrationSpreadUpFactor);
        buf.writeFloat(this.concentrationSpreadDownFactor);
        buf.writeFloat(this.concentrationSpreadSideFactor);
        buf.writeFloat(this.minConcentrationThreshold);
        buf.writeFloat(this.spreadRate);
        buf.writeLong(this.lastSpreadTimestamp);
        buf.writeFloat(this.concentrationDecayAdjustment);
        buf.writeFloat(this.concentrationDecayFactor);
        buf.writeInt(this.spreadMap.size());
        for (Map.Entry<CompatibleBlockPos, Float> e : this.spreadMap.entrySet()) {
            CompatibleBlockPos blockPos = e.getKey();
            buf.writeInt(blockPos.getBlockPosX());
            buf.writeInt(blockPos.getBlockPosY());
            buf.writeInt(blockPos.getBlockPosZ());
            buf.writeFloat(e.getValue().floatValue());
        }
        if (this.currentSpread != null) {
            buf.writeInt(this.currentSpread.size());
            for (CompatibleBlockPos blockPos : this.currentSpread) {
                buf.writeInt(blockPos.getBlockPosX());
                buf.writeInt(blockPos.getBlockPosY());
                buf.writeInt(blockPos.getBlockPosZ());
            }
        } else {
            buf.writeInt(0);
        }
        compound.func_74773_a(TAG_SPREAD_MAP, buf.array());
    }

    public void func_70071_h_() {
        super.func_70071_h_();
        if (!CompatibilityProvider.compatibility.world((Entity)this).field_72995_K) {
            this.spread();
            this.updateNearbyEntities();
        }
    }

    private void updateNearbyEntities() {
        if (this.spreadBox == null) {
            return;
        }
        List<Entity> entities = CompatibilityProvider.compatibility.getEntitiesWithinAABBExcludingEntity(CompatibilityProvider.compatibility.world(this), this, this.spreadBox);
        for (Entity entity : entities) {
            CompatibleBlockPos entityPos = new CompatibleBlockPos((int)entity.field_70165_t, (int)entity.field_70163_u, (int)entity.field_70161_v);
            float adjustedConcentration = this.spreadMap.getOrDefault(entityPos, Float.valueOf(0.0f)).floatValue() * this.concentrationDecayAdjustment;
            if (!(entity instanceof EntityLivingBase)) continue;
            this.onEntityExposure((EntityLivingBase)entity, adjustedConcentration);
        }
    }

    protected void onEntityExposure(EntityLivingBase entity, float concentration) {
        SpreadableExposure exposure = CompatibleExposureCapability.getExposure((Entity)entity, this.getExposureType());
        if (exposure == null) {
            exposure = this.createSpreadableExposure();
            CompatibleExposureCapability.updateExposure((Entity)entity, exposure);
        }
        exposure.apply(this, (Entity)entity, concentration);
    }

    protected Class<SpreadableExposure> getExposureType() {
        return SpreadableExposure.class;
    }

    protected SpreadableExposure createSpreadableExposure() {
        return new SpreadableExposure(5000L, CompatibilityProvider.compatibility.world(this).func_82737_E());
    }

    private void spread() {
        long currentWorldTime = CompatibilityProvider.compatibility.world(this).func_82737_E();
        if ((float)(currentWorldTime - this.lastSpreadTimestamp) <= 20.0f / this.spreadRate) {
            return;
        }
        this.lastSpreadTimestamp = currentWorldTime;
        if (this.currentSpread == null) {
            this.currentSpread = new ArrayList<CompatibleBlockPos>();
            this.initSpreadBox();
            CompatibleBlockPos blockPos = new CompatibleBlockPos((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
            this.currentSpread.add(blockPos);
            this.spreadMap.put(blockPos, Float.valueOf(this.initialConcentration));
        }
        ArrayList<CompatibleBlockPos> newSpread = new ArrayList<CompatibleBlockPos>();
        for (CompatibleBlockPos blockPos : this.currentSpread) {
            CompatibleBlockPos nearer;
            CompatibleBlockPos farther;
            CompatibleBlockPos right;
            CompatibleBlockPos left;
            CompatibleBlockPos bottom;
            float concentration = this.spreadMap.getOrDefault(blockPos, Float.valueOf(0.0f)).floatValue();
            CompatibleBlockPos top = new CompatibleBlockPos(blockPos.getBlockPosX(), blockPos.getBlockPosY() + 1, blockPos.getBlockPosZ());
            if (this.updateSpreadAtPosition(top, concentration * this.concentrationSpreadUpFactor)) {
                newSpread.add(top);
            }
            if (this.updateSpreadAtPosition(bottom = new CompatibleBlockPos(blockPos.getBlockPosX(), blockPos.getBlockPosY() - 1, blockPos.getBlockPosZ()), concentration * this.concentrationSpreadDownFactor)) {
                newSpread.add(bottom);
            }
            if (this.updateSpreadAtPosition(left = new CompatibleBlockPos(blockPos.getBlockPosX() - 1, blockPos.getBlockPosY(), blockPos.getBlockPosZ()), concentration * this.concentrationSpreadSideFactor)) {
                newSpread.add(left);
            }
            if (this.updateSpreadAtPosition(right = new CompatibleBlockPos(blockPos.getBlockPosX() + 1, blockPos.getBlockPosY(), blockPos.getBlockPosZ()), concentration * this.concentrationSpreadSideFactor)) {
                newSpread.add(right);
            }
            if (this.updateSpreadAtPosition(farther = new CompatibleBlockPos(blockPos.getBlockPosX(), blockPos.getBlockPosY(), blockPos.getBlockPosZ() + 1), concentration * this.concentrationSpreadSideFactor)) {
                newSpread.add(farther);
            }
            if (!this.updateSpreadAtPosition(nearer = new CompatibleBlockPos(blockPos.getBlockPosX(), blockPos.getBlockPosY(), blockPos.getBlockPosZ() - 1), concentration * this.concentrationSpreadSideFactor)) continue;
            newSpread.add(nearer);
        }
        this.currentSpread = newSpread;
        this.concentrationDecayAdjustment *= this.concentrationDecayFactor;
        if (this.currentSpread.isEmpty()) {
            Iterator<Map.Entry<CompatibleBlockPos, Float>> it = this.spreadMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<CompatibleBlockPos, Float> e = it.next();
                if (!(e.getValue().floatValue() * this.concentrationDecayAdjustment < this.minConcentrationThreshold)) continue;
                it.remove();
            }
            if (this.spreadMap.isEmpty()) {
                this.func_70106_y();
            }
        }
    }

    private boolean updateSpreadAtPosition(CompatibleBlockPos blockPos, float concentration) {
        Float currentConcentration;
        float adjustedConcentration = concentration * this.concentrationDecayAdjustment;
        if (adjustedConcentration < this.minConcentrationThreshold) {
            return false;
        }
        boolean result = false;
        CompatibleBlockState compatibleBlockState = CompatibilityProvider.compatibility.getBlockAtPosition(CompatibilityProvider.compatibility.world(this), blockPos);
        if (CompatibilityProvider.compatibility.isAirBlock(compatibleBlockState) && ((currentConcentration = this.spreadMap.get(blockPos)) == null || currentConcentration.floatValue() < concentration)) {
            this.spreadMap.put(blockPos, Float.valueOf(concentration));
            result = true;
        }
        return result;
    }

    @Override
    public UUID getId() {
        return this.func_110124_au();
    }
}


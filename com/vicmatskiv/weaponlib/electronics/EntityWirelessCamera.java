/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.item.Item
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.electronics;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMathHelper;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.compatibility.CompatibleThrowableEntity;
import com.vicmatskiv.weaponlib.electronics.ItemWirelessCamera;
import com.vicmatskiv.weaponlib.tracking.PlayerEntityTracker;
import com.vicmatskiv.weaponlib.tracking.SyncPlayerEntityTrackerMessage;
import com.vicmatskiv.weaponlib.tracking.TrackableEntity;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityWirelessCamera
extends CompatibleThrowableEntity {
    private static final Logger logger = LogManager.getLogger(EntityWirelessCamera.class);
    private ModContext modContext;
    private ItemWirelessCamera itemWirelessCamera;
    private long timestamp;
    private long duration;

    public EntityWirelessCamera(ModContext modContext, World world, EntityPlayer player, ItemWirelessCamera itemWirelessCamera, long duration) {
        super(world, (EntityLivingBase)player);
        this.timestamp = world.func_72820_D();
        this.duration = (long)((float)duration / 50.0f);
        this.modContext = modContext;
        this.itemWirelessCamera = itemWirelessCamera;
        this.func_70105_a(0.25f, 0.25f);
        this.func_70012_b(player.field_70165_t, player.field_70163_u + (double)player.func_70047_e(), player.field_70161_v, player.field_70177_z, player.field_70125_A);
        CompatibilityProvider.compatibility.getMathHelper();
        this.field_70165_t -= (double)(CompatibleMathHelper.cos(this.field_70177_z / 180.0f * (float)Math.PI) * 0.16f);
        this.field_70163_u -= (double)0.1f;
        CompatibilityProvider.compatibility.getMathHelper();
        this.field_70161_v -= (double)(CompatibleMathHelper.sin(this.field_70177_z / 180.0f * (float)Math.PI) * 0.16f);
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        float f = 0.4f;
        CompatibilityProvider.compatibility.getMathHelper();
        float f2 = -CompatibleMathHelper.sin(this.field_70177_z / 180.0f * (float)Math.PI);
        CompatibilityProvider.compatibility.getMathHelper();
        this.field_70159_w = f2 * CompatibleMathHelper.cos(this.field_70125_A / 180.0f * (float)Math.PI) * f;
        CompatibilityProvider.compatibility.getMathHelper();
        float f3 = CompatibleMathHelper.cos(this.field_70177_z / 180.0f * (float)Math.PI);
        CompatibilityProvider.compatibility.getMathHelper();
        this.field_70179_y = f3 * CompatibleMathHelper.cos(this.field_70125_A / 180.0f * (float)Math.PI) * f;
        float pitchOffset = 0.0f;
        CompatibilityProvider.compatibility.getMathHelper();
        this.field_70181_x = -CompatibleMathHelper.sin((this.field_70125_A + pitchOffset) / 180.0f * (float)Math.PI) * f;
        this.func_70186_c(this.field_70159_w, this.field_70181_x, this.field_70179_y, 1.5f, 0.0f);
    }

    public EntityWirelessCamera(World world, EntityLivingBase player) {
        super(world, player);
    }

    public EntityWirelessCamera(World world) {
        super(world);
    }

    @Override
    protected void onImpact(CompatibleRayTraceResult rayTraceResult) {
        Entity entityHit = rayTraceResult.getEntityHit();
        logger.debug("Player {} hit entity {}", (Object)this.func_85052_h(), (Object)rayTraceResult.getEntityHit());
        boolean hit = false;
        if (entityHit != null && this.func_85052_h() instanceof EntityPlayer) {
            String displayName = "";
            if (entityHit instanceof EntityPlayer) {
                displayName = CompatibilityProvider.compatibility.getDisplayName((EntityPlayer)entityHit);
            } else if (entityHit instanceof EntityLivingBase) {
                displayName = EntityList.func_75621_b((Entity)entityHit);
            }
            if (!CompatibilityProvider.compatibility.world((Entity)this).field_72995_K) {
                logger.debug("Server hit entity uuid {}", (Object)rayTraceResult.getEntityHit().getPersistentID());
                PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityLivingBase)((EntityPlayer)this.func_85052_h()));
                if (tracker != null) {
                    hit = true;
                    tracker.addTrackableEntity(new TrackableEntity(entityHit, this.timestamp, this.duration));
                    this.modContext.getChannel().getChannel().sendTo((IMessage)new SyncPlayerEntityTrackerMessage(tracker, "Tracking " + displayName), (EntityPlayerMP)this.func_85052_h());
                }
                entityHit.func_70097_a(DamageSource.func_76356_a((Entity)this, (Entity)this.func_85052_h()), 0.001f);
            }
        }
        if (!CompatibilityProvider.compatibility.world((Entity)this).field_72995_K) {
            if (!hit) {
                this.func_145779_a(this.itemWirelessCamera, 1);
            }
            this.func_70106_y();
        }
    }

    @Override
    public void func_70071_h_() {
        super.func_70071_h_();
    }

    public void writeSpawnData(ByteBuf buffer) {
        buffer.writeInt(Item.func_150891_b((Item)this.itemWirelessCamera));
        buffer.writeLong(this.timestamp);
        buffer.writeLong(this.duration);
    }

    public void readSpawnData(ByteBuf buffer) {
        Item item = Item.func_150899_d((int)buffer.readInt());
        if (item instanceof ItemWirelessCamera) {
            this.itemWirelessCamera = (ItemWirelessCamera)item;
        }
        this.timestamp = buffer.readLong();
        this.duration = buffer.readLong();
    }

    @Override
    protected void setCompatibleThrowableHeading(double motionX, double motionY, double motionZ, float velocity, float inaccuracy) {
        CompatibilityProvider.compatibility.getMathHelper();
        float f2 = CompatibleMathHelper.sqrt_double(motionX * motionX + motionY * motionY + motionZ * motionZ);
        motionX /= (double)f2;
        motionY /= (double)f2;
        motionZ /= (double)f2;
        motionX += this.field_70146_Z.nextGaussian() * (double)0.0075f * (double)inaccuracy;
        motionY += this.field_70146_Z.nextGaussian() * (double)0.0075f * (double)inaccuracy;
        motionZ += this.field_70146_Z.nextGaussian() * (double)0.0075f * (double)inaccuracy;
        this.field_70159_w = motionX *= (double)velocity;
        this.field_70181_x = motionY *= (double)velocity;
        this.field_70179_y = motionZ *= (double)velocity;
        CompatibilityProvider.compatibility.getMathHelper();
        float f3 = CompatibleMathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
        this.field_70126_B = this.field_70177_z = (float)(Math.atan2(motionX, motionZ) * 180.0 / Math.PI);
        this.field_70127_C = this.field_70125_A = (float)(Math.atan2(motionY, f3) * 180.0 / Math.PI);
    }

    @Override
    protected float getInaccuracy() {
        return 0.0f;
    }

    @Override
    protected float getVelocity() {
        return 0.5f;
    }

    public ItemWirelessCamera getItem() {
        return this.itemWirelessCamera;
    }
}


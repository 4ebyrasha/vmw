/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.EntityProjectile;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMathHelper;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import io.netty.buffer.ByteBuf;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityShellCasing
extends EntityProjectile {
    private static final Logger logger = LogManager.getLogger(EntityShellCasing.class);
    private static final String TAG_ENTITY_ITEM = "entity_item";
    static final float DEFAULT_INACCURACY = 1.0f;
    private Random random = new Random();
    private Weapon weapon;
    private PlayerWeaponInstance weaponInstance;
    private float initialYaw;
    private float initialPitch;
    private float xRotation;
    private float yRotation;
    private float zRotation;
    private float xRotationChange;
    private float yRotationChange;
    private float zRotationChange;
    private float rotationSlowdownFactor = 0.95f;
    private float maxRotationChange = 30.0f;

    public EntityShellCasing(World world) {
        super(world);
        this.setRotations();
    }

    public EntityShellCasing(PlayerWeaponInstance weaponInstance, World world, EntityLivingBase player, float velocity, float gravityVelocity, float inaccuracy) {
        super(world, player, velocity, gravityVelocity, inaccuracy);
        this.weapon = weaponInstance.getWeapon();
        this.weaponInstance = weaponInstance;
    }

    @Override
    public void setPositionAndDirection() {
        this.func_70105_a(0.001f, 0.001f);
        float forwardOffset = CompatibilityProvider.compatibility.getCompatibleShellCasingForwardOffset() + this.weapon.getShellCasingForwardOffset();
        float sideOffset = this.weapon.getShellCasingEjectDirection() == Weapon.ShellCasingEjectDirection.RIGHT ? (this.weaponInstance.isAimed() ? this.weapon.getShellCasingSideOffsetAimed() : this.weapon.getShellCasingSideOffset()) : (this.weaponInstance.isAimed() ? -0.1f : 0.0f);
        float yOffset = this.weapon.getShellCasingVerticalOffset();
        if (this.thrower.func_70093_af()) {
            yOffset -= 0.1f;
        } else if (this.thrower instanceof EntityPlayer && (CompatibleExtraEntityFlags.getFlags((Entity)this.thrower) & CompatibleExtraEntityFlags.PRONING) != 0) {
            yOffset -= 0.0f;
        }
        this.func_70012_b(this.thrower.field_70165_t, this.thrower.field_70163_u + (double)this.thrower.func_70047_e() + (double)yOffset, this.thrower.field_70161_v, this.thrower.field_70177_z, this.thrower.field_70125_A);
        this.field_70165_t -= (double)(CompatibleMathHelper.cos(this.field_70177_z / 180.0f * (float)Math.PI) * sideOffset) + (double)(CompatibleMathHelper.sin(this.field_70177_z / 180.0f * (float)Math.PI) * CompatibleMathHelper.cos(this.field_70125_A / 180.0f * (float)Math.PI) * forwardOffset);
        this.field_70163_u += (double)(-CompatibleMathHelper.sin(this.field_70125_A / 180.0f * (float)Math.PI) * forwardOffset);
        this.field_70161_v -= (double)(CompatibleMathHelper.sin(this.field_70177_z / 180.0f * (float)Math.PI) * sideOffset) - (double)(CompatibleMathHelper.cos(this.field_70177_z / 180.0f * (float)Math.PI) * CompatibleMathHelper.cos(this.field_70125_A / 180.0f * (float)Math.PI) * forwardOffset);
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        float f = this.velocity;
        float adjustedRotationYaw = this.weapon.getShellCasingEjectDirection() == Weapon.ShellCasingEjectDirection.RIGHT ? this.field_70177_z + (this.weaponInstance.isAimed() ? -10.0f : -30.0f) : this.field_70177_z + 0.0f;
        int directionSignum = this.weapon.getShellCasingEjectDirection() == Weapon.ShellCasingEjectDirection.RIGHT ? 1 : -1;
        this.field_70159_w = (double)directionSignum * -((double)(CompatibleMathHelper.cos(adjustedRotationYaw / 180.0f * (float)Math.PI) * f));
        this.field_70179_y = (double)directionSignum * (double)(-CompatibleMathHelper.sin(adjustedRotationYaw / 180.0f * (float)Math.PI) * f);
        this.field_70181_x = 0.0;
        this.initialYaw = this.field_70177_z;
        this.initialPitch = this.field_70125_A;
        this.func_70186_c(this.field_70159_w, this.field_70181_x, this.field_70179_y, this.velocity, this.inaccuracy);
    }

    private void setRotations() {
        this.xRotationChange = this.maxRotationChange * (float)this.random.nextGaussian();
        this.yRotationChange = this.maxRotationChange * (float)this.random.nextGaussian();
        this.zRotationChange = this.maxRotationChange * (float)this.random.nextGaussian();
    }

    @Override
    public void func_70071_h_() {
        super.func_70071_h_();
        this.xRotation += this.xRotationChange;
        this.yRotation += this.yRotationChange;
        this.zRotation += this.zRotationChange;
        this.xRotationChange *= this.rotationSlowdownFactor;
        this.yRotationChange *= this.rotationSlowdownFactor;
        this.zRotationChange *= this.rotationSlowdownFactor;
    }

    @Override
    protected void onImpact(CompatibleRayTraceResult position) {
        if (!CompatibilityProvider.compatibility.world((Entity)this).field_72995_K) {
            this.func_70106_y();
        }
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        super.writeSpawnData(buffer);
        buffer.writeInt(Item.func_150891_b((Item)this.weapon));
        buffer.writeFloat(this.initialYaw);
        buffer.writeFloat(this.initialPitch);
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        super.readSpawnData(buffer);
        this.weapon = (Weapon)Item.func_150899_d((int)buffer.readInt());
        this.initialYaw = buffer.readFloat();
        this.initialPitch = buffer.readFloat();
    }

    @Override
    public void func_70037_a(NBTTagCompound tagCompound) {
        super.func_70037_a(tagCompound);
        Item item = Item.func_150899_d((int)tagCompound.func_74762_e(TAG_ENTITY_ITEM));
        if (item instanceof Weapon) {
            this.weapon = (Weapon)item;
        }
    }

    @Override
    public void func_70014_b(NBTTagCompound tagCompound) {
        super.func_70014_b(tagCompound);
        tagCompound.func_74768_a(TAG_ENTITY_ITEM, Item.func_150891_b((Item)this.weapon));
    }

    Weapon getWeapon() {
        return this.weapon;
    }

    boolean isDamageableEntity(Entity entity) {
        return false;
    }

    public float getInitialYaw() {
        return this.initialYaw;
    }

    public float getInitialPitch() {
        return this.initialPitch;
    }

    public float getXRotation() {
        return this.initialPitch - this.xRotation;
    }

    public float getYRotation() {
        return this.yRotation - this.initialYaw - 90.0f;
    }

    public float getZRotation() {
        return this.zRotation;
    }

    public void func_70106_y() {
        super.func_70106_y();
    }
}


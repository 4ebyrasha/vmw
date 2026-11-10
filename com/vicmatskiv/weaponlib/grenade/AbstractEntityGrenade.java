/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.Item
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.grenade;

import com.vicmatskiv.weaponlib.EntityBounceable;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public abstract class AbstractEntityGrenade
extends EntityBounceable {
    private static final String TAG_ENTITY_ITEM = "entity_item";
    protected ItemGrenade itemGrenade;

    protected AbstractEntityGrenade(ModContext modContext, ItemGrenade itemGrenade, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(modContext, CompatibilityProvider.compatibility.world((Entity)thrower), thrower, velocity, gravityVelocity, rotationSlowdownFactor);
        this.itemGrenade = itemGrenade;
    }

    public AbstractEntityGrenade(World world) {
        super(world);
    }

    @Override
    public void func_70037_a(NBTTagCompound tagCompound) {
        super.func_70037_a(tagCompound);
        Item item = Item.func_150899_d((int)tagCompound.func_74762_e(TAG_ENTITY_ITEM));
        if (item instanceof ItemGrenade) {
            this.itemGrenade = (ItemGrenade)item;
        }
    }

    @Override
    public void func_70014_b(NBTTagCompound tagCompound) {
        super.func_70014_b(tagCompound);
        tagCompound.func_74768_a(TAG_ENTITY_ITEM, Item.func_150891_b((Item)this.itemGrenade));
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        super.writeSpawnData(buffer);
        buffer.writeInt(Item.func_150891_b((Item)this.itemGrenade));
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        super.readSpawnData(buffer);
        Item item = Item.func_150899_d((int)buffer.readInt());
        if (item instanceof ItemGrenade) {
            this.itemGrenade = (ItemGrenade)item;
        }
    }

    @Override
    public void func_70071_h_() {
        super.func_70071_h_();
        this.onGrenadeUpdate();
    }

    protected abstract void onGrenadeUpdate();

    @Override
    public void onBounce(CompatibleRayTraceResult movingobjectposition) {
        if (movingobjectposition.getTypeOfHit() == CompatibleRayTraceResult.Type.BLOCK && this.itemGrenade != null) {
            CompatibleBlockState blockState;
            CompatibleSound bounceSoftSound;
            CompatibleBlockState blockState2;
            CompatibleSound bounceHardSound = this.itemGrenade.getBounceHardSound();
            if (bounceHardSound != null && CompatibilityProvider.compatibility.madeFromHardMaterial(blockState2 = CompatibilityProvider.compatibility.getBlockAtPosition(CompatibilityProvider.compatibility.world(this), movingobjectposition))) {
                CompatibilityProvider.compatibility.playSoundAtEntity(this, bounceHardSound, 2.0f / ((float)this.bounceCount + 1.0f), 1.0f);
            }
            if ((bounceSoftSound = this.itemGrenade.getBounceSoftSound()) != null && !CompatibilityProvider.compatibility.madeFromHardMaterial(blockState = CompatibilityProvider.compatibility.getBlockAtPosition(CompatibilityProvider.compatibility.world(this), movingobjectposition))) {
                CompatibilityProvider.compatibility.playSoundAtEntity(this, bounceSoftSound, 1.0f / ((float)this.bounceCount + 1.0f), 1.0f);
            }
        }
    }

    public ItemGrenade getItemGrenade() {
        return this.itemGrenade;
    }

    @Override
    public boolean canCollideWithBlock(Block block, CompatibleBlockState metadata) {
        return !CompatibilityProvider.compatibility.isBlockPenetratableByGrenades(block) && super.canCollideWithBlock(block, metadata);
    }
}


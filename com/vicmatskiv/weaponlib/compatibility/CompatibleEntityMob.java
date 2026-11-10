/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleDataManager;
import com.vicmatskiv.weaponlib.compatibility.CompatibleDifficulty;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import java.util.Arrays;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public abstract class CompatibleEntityMob
extends EntityMob {
    protected CompatibleDataManager compatibleDataManager;

    public CompatibleEntityMob(World worldIn) {
        super(worldIn);
    }

    protected void func_70088_a() {
        super.func_70088_a();
        this.compatibleDataManager = new CompatibleDataManager(this.field_70180_af);
    }

    protected final SoundEvent func_184639_G() {
        CompatibleSound sound = this.getCompatibleAmbientSound();
        return sound != null ? sound.getSound() : null;
    }

    protected CompatibleSound getCompatibleAmbientSound() {
        return null;
    }

    protected SoundEvent func_184601_bQ(DamageSource p_184601_1_) {
        return this.getHurtSound();
    }

    protected final SoundEvent getHurtSound() {
        CompatibleSound sound = this.getCompatibleHurtSound();
        return sound != null ? sound.getSound() : null;
    }

    protected CompatibleSound getCompatibleHurtSound() {
        return null;
    }

    protected final SoundEvent func_184615_bR() {
        CompatibleSound sound = this.getCompatibleDeathSound();
        return sound != null ? sound.getSound() : null;
    }

    protected CompatibleSound getCompatibleDeathSound() {
        return null;
    }

    protected void func_180429_a(BlockPos pos, Block block) {
        this.playStepSound(new CompatibleBlockPos(pos), block);
    }

    protected void playStepSound(CompatibleBlockPos pos, Block blockIn) {
    }

    public void func_184598_c(EnumHand hand) {
        ItemStack itemstack = this.func_184586_b(hand);
        if (itemstack != null && !this.func_184587_cr()) {
            this.field_184627_bm = itemstack;
            this.field_184628_bn = 100;
            if (!this.field_70170_p.field_72995_K) {
                int i = 1;
                if (hand == EnumHand.OFF_HAND) {
                    i |= 2;
                }
                this.field_70180_af.func_187227_b(field_184621_as, (Object)((byte)i));
            }
        }
    }

    public float func_180484_a(BlockPos pos) {
        return this.getCompatibleBlockPathWeight(new CompatibleBlockPos(pos));
    }

    public float getCompatibleBlockPathWeight(CompatibleBlockPos pos) {
        return super.func_180484_a(pos.getBlockPos());
    }

    protected void setCompatibleInventoryHandsDropChances(float chance) {
        Arrays.fill(this.field_82174_bp, chance);
    }

    protected void setCompatibleInventoryArmorDropChances(float chance) {
        Arrays.fill(this.field_184655_bs, chance);
    }

    protected void func_180481_a(DifficultyInstance difficulty) {
        super.func_180481_a(difficulty);
        this.setEquipmentBasedOnDifficulty(new CompatibleDifficulty(difficulty));
    }

    protected void setEquipmentBasedOnDifficulty(CompatibleDifficulty difficulty) {
    }

    public IEntityLivingData func_180482_a(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        livingdata = super.func_180482_a(difficulty, livingdata);
        return this.onCompatibleSpawn(new CompatibleDifficulty(difficulty), livingdata);
    }

    public IEntityLivingData onCompatibleSpawn(CompatibleDifficulty difficulty, IEntityLivingData livingdata) {
        return livingdata;
    }

    protected void setEnchantmentBasedOnDifficulty(CompatibleDifficulty difficulty) {
        this.func_180483_b(difficulty.getDifficulty());
    }

    public void setActiveMainHand() {
        this.func_184598_c(EnumHand.MAIN_HAND);
    }

    public boolean isFacingEntity(EntityLivingBase otherEntity) {
        return true;
    }
}


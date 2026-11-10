/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.entity.ai.EntityAISwimming
 *  net.minecraft.entity.ai.EntityAIWander
 *  net.minecraft.entity.ai.EntityAIWatchClosest
 *  net.minecraft.entity.monster.EntityIronGolem
 *  net.minecraft.entity.passive.EntityWolf
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.EnumDifficulty
 */
package com.vicmatskiv.mw.entities;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.Guns;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.entities.EntityFactory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.ai.EntityAIAttackRangedWeapon;
import com.vicmatskiv.weaponlib.ai.EntityConfiguration;
import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBiomeType;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumDifficulty;

public class BanditEntityFactory
implements EntityFactory {
    @Override
    public void createEntity(ModContext modContext) {
        new EntityConfiguration.Builder().withName("bandit1").withBaseClass(EntityCustomMob.class).withMaxHealth(20.0).withEntityIdSupplier(() -> 10000).withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag).withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag, Attachments.PSO1).withEquipmentOption(Guns.Remington870, EnumDifficulty.EASY, 0.07f, new ItemAttachment[0]).withPrimaryEquipmentDropChance(1.0f).withSpawn(1, 1, 7, CompatibleBiomeType.PLAINS, CompatibleBiomeType.FOREST, CompatibleBiomeType.HILLS).withSpawnEgg(0xA0A000, 0xA0A010).withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit1.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit3.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit4.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit5.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit6.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit7.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit8.png").withHurtSound("hurt").withAmbientSound("drawweapon").withAiTask(1, e -> new EntityAISwimming(e)).withAiTask(3, e -> CompatibilityProvider.compatibility.createAiAvoidEntity((EntityLivingBase)((EntityCreature)e), EntityWolf.class, 6.0f, 1.0, 1.2)).withAiTask(4, e -> new EntityAIAttackRangedWeapon((EntityCustomMob)e, 1.0, 10, 30.0f, new Class[0])).withAiTask(5, e -> new EntityAIWander((EntityCreature)e, 1.0)).withAiTask(6, e -> new EntityAIWatchClosest(e, EntityPlayer.class, 50.0f)).withAiTask(6, e -> new EntityAILookIdle(e)).withAiTargetTask(1, e -> new EntityAIHurtByTarget((EntityCreature)e, false, new Class[0])).withAiTargetTask(2, e -> CompatibilityProvider.compatibility.createAINearestAttackableTarget((EntityLivingBase)e, EntityPlayer.class, true)).withAiTargetTask(3, e -> CompatibilityProvider.compatibility.createAINearestAttackableTarget((EntityLivingBase)e, EntityIronGolem.class, true)).register(modContext);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.entity.ai.EntityAIWatchClosest
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.EnumDifficulty
 */
package com.vicmatskiv.mw.entities;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.Guns;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.entities.EntityFactory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.ai.EntityConfiguration;
import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumDifficulty;

public class SampleMissionGiverEntityFactory
implements EntityFactory {
    @Override
    public void createEntity(ModContext modContext) {
        String missionDescription = "Put your long mission description here as long as it does not exceed the dialog area on the screen";
        new EntityConfiguration.Builder().withName("sampleMissionGiver").withBaseClass(EntityCustomMob.class).withMaxHealth(20.0).withEntityIdSupplier(() -> 20000).withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag).withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag, Attachments.PSO1).withEquipmentOption(Guns.Remington870, EnumDifficulty.EASY, 0.07f, new ItemAttachment[0]).withPrimaryEquipmentDropChance(1.0f).withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit1.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit3.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit4.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit5.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit6.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit7.png").withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit8.png").withHurtSound("hurt").withDespawnability(false).withInvulnerability().withAmbientSound("drawweapon").withAiTask(6, e -> new EntityAIWatchClosest(e, EntityPlayer.class, 50.0f)).withAiTask(6, e -> new EntityAILookIdle(e)).withIntroDialog("The Mysterious Stranger admired your family cow and asked if it was for sale.\n\nWhen you nodded, he offered to trade some Magic Beans, that (if planted in tilled dirt) would lead to more wealth than you could imagine.").withIntroDialog("So you handed him your cow, and grabbed the Magic Beans.\n\nPleased with yourself, you hurried away, looking for tilled dirt in which to plant the Magic Beans.\n\nYou couldn't wait to see how proud your mother would be for").withIntroDialog("being so shrewd!  Untold wealth in return for an old, milkless cow; what a good deal you made!\n\nSo off you went, looking for a place to plant the Magic Beans with room to grow...").withIntroImage("mob.png").withDialogBackground("black_leather.png").withMissionSelectionBackground("mission_selection_background.png").withRewardsBackground("rewards.png").register(ModernWarfareMod.MOD_CONTEXT);
    }
}


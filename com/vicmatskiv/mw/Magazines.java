/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.AK101Mag;
import com.vicmatskiv.mw.models.AK12Magazine;
import com.vicmatskiv.mw.models.AK15Mag;
import com.vicmatskiv.mw.models.AK60Mag;
import com.vicmatskiv.mw.models.AK74VulcanMag;
import com.vicmatskiv.mw.models.AKDrum100;
import com.vicmatskiv.mw.models.APC9Mag;
import com.vicmatskiv.mw.models.APSmag;
import com.vicmatskiv.mw.models.AS50mag;
import com.vicmatskiv.mw.models.ASValMag;
import com.vicmatskiv.mw.models.AUG9mmConvMAG;
import com.vicmatskiv.mw.models.AX50Mag;
import com.vicmatskiv.mw.models.BrenMkIIMag;
import com.vicmatskiv.mw.models.C8Mag;
import com.vicmatskiv.mw.models.ChainsawFuel;
import com.vicmatskiv.mw.models.DP28Mag;
import com.vicmatskiv.mw.models.DesertEagleMag;
import com.vicmatskiv.mw.models.Drum50AK;
import com.vicmatskiv.mw.models.FNFALMag;
import com.vicmatskiv.mw.models.G11Mag;
import com.vicmatskiv.mw.models.G43GewehrMag;
import com.vicmatskiv.mw.models.Glock13rndMagazine;
import com.vicmatskiv.mw.models.Glock18Cmag;
import com.vicmatskiv.mw.models.GlockMagazine;
import com.vicmatskiv.mw.models.HK50Drum;
import com.vicmatskiv.mw.models.HKMP5Mag;
import com.vicmatskiv.mw.models.InterventionMag;
import com.vicmatskiv.mw.models.JohnsonLMGMAG;
import com.vicmatskiv.mw.models.KBP9A91Mag;
import com.vicmatskiv.mw.models.KedrMag;
import com.vicmatskiv.mw.models.L115Mag;
import com.vicmatskiv.mw.models.L131A1Mag;
import com.vicmatskiv.mw.models.M107Mag;
import com.vicmatskiv.mw.models.M110Mag;
import com.vicmatskiv.mw.models.M134Mag;
import com.vicmatskiv.mw.models.M14Drum50;
import com.vicmatskiv.mw.models.M17Mag;
import com.vicmatskiv.mw.models.M1928ThompsonMag;
import com.vicmatskiv.mw.models.M1A1mag;
import com.vicmatskiv.mw.models.M249Mag;
import com.vicmatskiv.mw.models.M38Mag;
import com.vicmatskiv.mw.models.M40A6Mag;
import com.vicmatskiv.mw.models.M4A1Mag;
import com.vicmatskiv.mw.models.M4AsiimovMag;
import com.vicmatskiv.mw.models.M60Mag;
import com.vicmatskiv.mw.models.M712mag;
import com.vicmatskiv.mw.models.M9A1mag;
import com.vicmatskiv.mw.models.M9DrumMag;
import com.vicmatskiv.mw.models.M9Mag30;
import com.vicmatskiv.mw.models.MAC10Mag;
import com.vicmatskiv.mw.models.MG42mag;
import com.vicmatskiv.mw.models.MP40Mag;
import com.vicmatskiv.mw.models.MP40MagACTUAL;
import com.vicmatskiv.mw.models.MP443Magazine;
import com.vicmatskiv.mw.models.MP7MagazineMEDIUM;
import com.vicmatskiv.mw.models.MPXMag;
import com.vicmatskiv.mw.models.Mag75rnd;
import com.vicmatskiv.mw.models.Magazine762x39;
import com.vicmatskiv.mw.models.MakarovMag;
import com.vicmatskiv.mw.models.Mk14EBRmag;
import com.vicmatskiv.mw.models.NATODrum100;
import com.vicmatskiv.mw.models.NATOG36Mag;
import com.vicmatskiv.mw.models.NATOMag60rnd;
import com.vicmatskiv.mw.models.NTW20MAG;
import com.vicmatskiv.mw.models.Origin12DrumMag;
import com.vicmatskiv.mw.models.Origin12Mag;
import com.vicmatskiv.mw.models.P2022Mag;
import com.vicmatskiv.mw.models.P90Mag;
import com.vicmatskiv.mw.models.PGMHecateIIMagazine;
import com.vicmatskiv.mw.models.Remington700Mag;
import com.vicmatskiv.mw.models.SCCYCPX2Mag;
import com.vicmatskiv.mw.models.SOCOM_Mag;
import com.vicmatskiv.mw.models.SSG08Magazine;
import com.vicmatskiv.mw.models.STG44Mag;
import com.vicmatskiv.mw.models.SV98Mag;
import com.vicmatskiv.mw.models.Saiga12mag;
import com.vicmatskiv.mw.models.Scar40Mag;
import com.vicmatskiv.mw.models.ScarHMag;
import com.vicmatskiv.mw.models.ScorpionEVO3A1Magazine;
import com.vicmatskiv.mw.models.Stanag50;
import com.vicmatskiv.mw.models.Stanag60;
import com.vicmatskiv.mw.models.StonerA1MAG;
import com.vicmatskiv.mw.models.UMP45mag;
import com.vicmatskiv.mw.models.UMP9Mag;
import com.vicmatskiv.mw.models.USP45Mag;
import com.vicmatskiv.mw.models.UziMag;
import com.vicmatskiv.mw.models.VP70mag;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import org.lwjgl.opengl.GL11;

public class Magazines {
    public static ItemMagazine AUG9mmMag;
    public static ItemMagazine M4A1Mag;
    public static ItemMagazine M4AsiimovMag;
    public static ItemMagazine M38Mag;
    public static ItemMagazine SOCOM_Mag;
    public static ItemMagazine C8Mag;
    public static ItemMagazine SA80Mag;
    public static ItemMagazine Stanag50;
    public static ItemMagazine Stanag60;
    public static ItemMagazine Stanag100;
    public static ItemMagazine AK101Mag;
    public static ItemMagazine AK74Mag;
    public static ItemMagazine AKMVulcanMag;
    public static ItemMagazine AK60Mag;
    public static ItemMagazine AK15Mag;
    public static ItemMagazine AK12Mag;
    public static ItemMagazine AK47PMAGTan;
    public static ItemMagazine AK47Mag;
    public static ItemMagazine AK50Mag;
    public static ItemMagazine AK75Mag;
    public static ItemMagazine AK100Mag;
    public static ItemMagazine M9A1Mag;
    public static ItemMagazine SamuraiEdgeMag;
    public static ItemMagazine SCCYCPX2Mag;
    public static ItemMagazine M9Mag30;
    public static ItemMagazine M9DrumMag;
    public static ItemMagazine MP443Mag;
    public static ItemMagazine M45A1Mag;
    public static ItemMagazine M45A1Mag14;
    public static ItemMagazine M1911_44Mag;
    public static ItemMagazine M17Mag;
    public static ItemMagazine MakarovMag;
    public static ItemMagazine USP45Mag;
    public static ItemMagazine P2022Mag;
    public static ItemMagazine HiPowerMag;
    public static ItemMagazine APSMag;
    public static ItemMagazine AS50Mag;
    public static ItemMagazine M82Mag;
    public static ItemMagazine NTW20Mag;
    public static ItemMagazine FrommerStopMag;
    public static ItemMagazine G36CMag;
    public static ItemMagazine GlockMag13;
    public static ItemMagazine Glock18CMag;
    public static ItemMagazine GlockMag50;
    public static ItemMagazine L131A1Mag;
    public static ItemMagazine KBP9A91Mag;
    public static ItemMagazine KedrMag;
    public static ItemMagazine L96A1Mag;
    public static ItemMagazine InterventionMag;
    public static ItemMagazine M110Mag;
    public static ItemMagazine M1928Mag;
    public static ItemMagazine M1A1Mag;
    public static ItemMagazine M40A6Mag;
    public static ItemMagazine AX50Mag;
    public static ItemMagazine R700Mag;
    public static ItemMagazine SSG08Mag;
    public static ItemMagazine HecateIIMag;
    public static ItemMagazine M712Mag;
    public static ItemMagazine DP28Mag;
    public static ItemMagazine MG42Mag;
    public static ItemMagazine M1CarbineMag;
    public static ItemMagazine FNFALMag;
    public static ItemMagazine Mk14EBRMag;
    public static ItemMagazine M14Drum50;
    public static ItemMagazine MP40Mag;
    public static ItemMagazine MP5A5Mag;
    public static ItemMagazine HK50Drum;
    public static ItemMagazine MP7Mag;
    public static ItemMagazine UMP45Mag;
    public static ItemMagazine UMP9Mag;
    public static ItemMagazine MPXMag;
    public static ItemMagazine APC9Mag;
    public static ItemMagazine ScorpionMag;
    public static ItemMagazine P90Mag;
    public static ItemMagazine MAC10Mag;
    public static ItemMagazine P90TerminatorMag;
    public static ItemMagazine G11Mag;
    public static ItemMagazine SaigaMag;
    public static ItemMagazine Origin12Mag;
    public static ItemMagazine Origin12DrumMag;
    public static ItemMagazine ScarHMag;
    public static ItemMagazine Scar40Mag;
    public static ItemMagazine Scar60Mag;
    public static ItemMagazine VSSVintorezMag;
    public static ItemMagazine STG44Mag;
    public static ItemMagazine G43GewehrMag;
    public static ItemMagazine BrenMag;
    public static ItemMagazine JohnsonMAG;
    public static ItemMagazine SV98Mag;
    public static ItemMagazine UziMag;
    public static ItemMagazine VP70Mag;
    public static ItemMagazine HoneyBadgerMag;
    public static ItemMagazine VectorMag;
    public static ItemMagazine DesertEagleMag;
    public static ItemMagazine M60Mag;
    public static ItemMagazine M249Mag;
    public static ItemMagazine StonerMag;
    public static ItemMagazine M134Mag;
    public static ItemMagazine FuelCell;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        FuelCell = new ItemMagazine.Builder().withAmmo(1000).withName("FuelCell").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new ChainsawFuel(), "ChainsawFuel.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.5f, (float)-0.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        BrenMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x51).withName("BrenMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new BrenMkIIMag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.0f, (float)0.3f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        JohnsonMAG = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet3006Springfield).withName("JohnsonMAG").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new JohnsonLMGMAG(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-1.4f, (float)1.1f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        VectorMag = new ItemMagazine.Builder().withAmmo(25).withCompatibleBullet(Bullets.Bullet45ACP).withName("VectorMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new MP40Mag(), "gun.png").withRequiredAttachments(Attachments.VectorHandguard).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.7f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-1.0f, (float)-1.3f, (float)0.8f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.2f, (float)0.0f, (float)-1.3f);
            GL11.glRotatef((float)-130.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(5).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M4A1Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("M4A1Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M4A1Mag(), "M4A1Mag.png").withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.M4AsiimovStock, Attachments.M16A1RearSights).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.6f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M4AsiimovMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("M4AsiimovMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M4AsiimovMag(), "M4AsiimovMag.png").withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.M4AsiimovStock).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.6f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        SA80Mag = new ItemMagazine.Builder().withAmmo(60).withCompatibleBullet(Bullets.Bullet556x45).withName("SA80Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new NATOMag60rnd(), "M4A1Mag.png").withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AUGDefaultKit, Attachments.Vector556Handguard).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.6f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AUG9mmMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("AUG9mmMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new AUG9mmConvMAG(), "gun.png").withRequiredAttachments(Attachments.AUGParaConversion).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-0.8f, (float)1.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M134Mag = new ItemMagazine.Builder().withAmmo(1000).withCompatibleBullet(Bullets.Bullet762x51).withName("M134Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M134Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-0.5f, (float)-0.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M60Mag = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet762x51).withName("M60Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M60Mag(), "m60.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-2.9f, (float)4.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M249Mag = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet556x45).withName("M249Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M249Mag(), "m249.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-2.2f, (float)3.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        StonerMag = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet556x45).withName("StonerMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new StonerA1MAG(), "m249.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-2.2f, (float)3.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        HoneyBadgerMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x35).withName("HoneyBadgerMag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M4A1Mag(), "M4A1Mag.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.6f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M38Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("M38Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M38Mag(), "M38Mag.png").withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.M16A1RearSights).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.6f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        SOCOM_Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("socom_mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new SOCOM_Mag(), "socom_mag.png").withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.C8SFWReceiver).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.6f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        C8Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("C8Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new C8Mag(), "c8mag.png").withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.C8SFWReceiver).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.6f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        Stanag50 = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet556x45).withName("Stanag50").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Stanag50(), "gun.png").withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.M16A1RearSights).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.2f, (float)-2.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        Stanag60 = new ItemMagazine.Builder().withAmmo(60).withCompatibleBullet(Bullets.Bullet556x45).withName("Stanag60").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Stanag60(), "gun.png").withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.M16A1RearSights).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.2f, (float)-2.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        Stanag100 = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet556x45).withName("Stanag100").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new NATODrum100(), "gun.png").withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.M16A1RearSights).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.2f, (float)-0.6f);
            GL11.glRotatef((float)-160.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        G36CMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("G36CMag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new NATOG36Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.8f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AK101Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("AK101Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new AK101Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-2.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AK74Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet545x39).withName("AK74Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new AK101Mag(), "brown.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-2.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AKMVulcanMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet545x39).withName("AKMVulcanMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new AK74VulcanMag(), "ak74vulcanmag.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-2.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AK60Mag = new ItemMagazine.Builder().withAmmo(60).withCompatibleBullet(Bullets.Bullet556x45).withName("AK60Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new AK60Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.5f, (float)-2.4f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AK15Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x39).withName("AK15Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new AK15Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-2.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AK12Mag = new ItemMagazine.Builder().withAmmo(31).withCompatibleBullet(Bullets.Bullet545x39).withName("AK12Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new AK12Magazine(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.8f, (float)-2.3f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AK47PMAGTan = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x39).withName("AK47PMAGTan").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new AK15Mag(), "tan.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-2.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AK47Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x39).withName("AK47Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Magazine762x39(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-2.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AK50Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet762x39).withName("AK50Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Drum50AK(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.8f, (float)-2.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AK75Mag = new ItemMagazine.Builder().withAmmo(75).withCompatibleBullet(Bullets.Bullet762x39).withName("AK75Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Mag75rnd(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.2f, (float)-3.2f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AK100Mag = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet762x39).withName("AK100Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new AKDrum100(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.6f, (float)-2.4f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        SaigaMag = new ItemMagazine.Builder().withAmmo(5).withCompatibleBullet(Bullets.Shotgun12Guage).withName("SaigaMag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Saiga12mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-2.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        Origin12Mag = new ItemMagazine.Builder().withAmmo(5).withCompatibleBullet(Bullets.Shotgun12Guage).withName("Origin12Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Origin12Mag(), "Origin12.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-2.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        Origin12DrumMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Shotgun12Guage).withName("Origin12DrumMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Origin12DrumMag(), "Origin12DrumMag.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-2.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M9A1Mag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Bullets.Bullet9x19mm).withName("M9Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M9A1mag(), "gun.png").withRequiredAttachments(Attachments.M9A1Body, Attachments.P226Slide).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.5f, (float)-1.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        SamuraiEdgeMag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Bullets.Bullet40SW).withName("SamuraiEdgeMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M9A1mag(), "gun.png").withRequiredAttachments(Attachments.SamuraiEdgeBody, Attachments.SamuraiEdgeAWBody).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.5f, (float)-1.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        SCCYCPX2Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet9x19mm).withName("sccy_cpx_2_mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new SCCYCPX2Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.5f, (float)-1.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        DesertEagleMag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet50AE).withName("DesertEagleMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new DesertEagleMag(), "deserteagle.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.5f, (float)-1.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M9Mag30 = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("M9Mag30").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M9Mag30(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-0.1f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M9DrumMag = new ItemMagazine.Builder().withAmmo(65).withCompatibleBullet(Bullets.Bullet9x19mm).withName("M9DrumMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M9DrumMag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-0.1f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        MP443Mag = new ItemMagazine.Builder().withAmmo(18).withCompatibleBullet(Bullets.Bullet9x19mm).withName("MP443Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new MP443Magazine(), "MP443.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.4f, (float)-0.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M45A1Mag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet45ACP).withName("M45A1Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new GlockMagazine(), "gun.png").withRequiredAttachments(Attachments.M1911Body).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-0.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M1911_44Mag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet44).withName("M1911_44Mag").withRequiredAttachments(Attachments.M191144MagBody).withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new GlockMagazine(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-0.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M45A1Mag14 = new ItemMagazine.Builder().withAmmo(14).withCompatibleBullet(Bullets.Bullet45ACP).withName("M45A1Mag14").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M9Mag30(), "gun.png").withRequiredAttachments(Attachments.M1911Body).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-0.1f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M17Mag = new ItemMagazine.Builder().withAmmo(17).withCompatibleBullet(Bullets.Bullet9x19mm).withName("M17Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M17Mag(), "m17.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-0.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        MakarovMag = new ItemMagazine.Builder().withAmmo(8).withCompatibleBullet(Bullets.Bullet9x18mm).withName("MakarovMag").withRequiredAttachments(Attachments.MakarovSlide, Attachments.MakarovPBBody).withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new MakarovMag(), "makarovmag.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-0.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        P2022Mag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Bullets.Bullet9x19mm).withName("P2022Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new P2022Mag(), "p2022.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-0.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        USP45Mag = new ItemMagazine.Builder().withAmmo(8).withCompatibleBullet(Bullets.Bullet45ACP).withName("USP45Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new USP45Mag(), "USP45.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-0.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        HiPowerMag = new ItemMagazine.Builder().withAmmo(13).withCompatibleBullet(Bullets.Bullet9x19mm).withName("HiPowerMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new GlockMagazine(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-0.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        FrommerStopMag = new ItemMagazine.Builder().withAmmo(8).withCompatibleBullet(Bullets.Bullet380ACP).withName("FrommerStopMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M9A1mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.5f, (float)-0.8f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        APSMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x19mm).withName("APSMag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new APSmag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.5f, (float)-0.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        GlockMag13 = new ItemMagazine.Builder().withAmmo(13).withCompatibleBullet(Bullets.Bullet9x19mm).withName("GlockMag13").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Glock13rndMagazine(), "glock19.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.3f, (float)-0.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        L131A1Mag = new ItemMagazine.Builder().withAmmo(17).withCompatibleBullet(Bullets.Bullet9x19mm).withName("L131A1Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new L131A1Mag(), "L131A1.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.3f, (float)-0.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        Glock18CMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x19mm).withName("Glock18Cmag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Glock18Cmag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.1f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        GlockMag50 = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet9x19mm).withName("GlockMag50").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M9DrumMag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-0.1f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AS50Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet50BMG).withName("AS50Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new AS50mag(), "M4A1Mag.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.8f, (float)-3.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M82Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet50BMG).withName("M82Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M107Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-0.8f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        NTW20Mag = new ItemMagazine.Builder().withAmmo(3).withCompatibleBullet(Bullets.Bullet20x82mm).withName("NTW20Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new NTW20MAG(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-1.2f, (float)3.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        KBP9A91Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x39mm).withName("KBP9A91Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new KBP9A91Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.8f, (float)-2.8f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        KedrMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x19mm).withName("KedrMag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new KedrMag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.8f, (float)-2.2f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        L96A1Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x54).withName("L96A1Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new L115Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.3f, (float)-0.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        InterventionMag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet408CT).withName("InterventionMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new InterventionMag(), "Intervention.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.5f, (float)-1.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M40A6Mag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet308Winchester).withName("M40A6Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M40A6Mag(), "M40A6.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.4f, (float)-1.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        AX50Mag = new ItemMagazine.Builder().withAmmo(5).withCompatibleBullet(Bullets.Bullet50BMG).withName("AX50Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new AX50Mag(), "ax50.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.3f, (float)-3.4f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        R700Mag = new ItemMagazine.Builder().withAmmo(6).withCompatibleBullet(Bullets.Bullet762x51).withName("R700Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Remington700Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.0f, (float)-0.8f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        SSG08Mag = new ItemMagazine.Builder().withAmmo(8).withCompatibleBullet(Bullets.Bullet308Winchester).withName("SSG08Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new SSG08Magazine(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)2.6f, (float)-4.7f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        HecateIIMag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet50BMG).withName("HecateIIMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new PGMHecateIIMagazine(), "pgmhecateii.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.8f, (float)-3.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M110Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x51).withName("M110Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M110Mag(), "M4A1Mag.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.6f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M1928Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet45ACP).withName("M1928Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M1928ThompsonMag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.5f, (float)-1.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M1A1Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet45ACP).withName("M1A1Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M1A1mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.5f, (float)-1.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M712Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet763x25).withName("M712mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M712mag(), "m712.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.0f, (float)-2.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        MG42Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet792x57).withName("MG42Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new MG42mag(), "mg42mag.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.0f, (float)-0.5f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        DP28Mag = new ItemMagazine.Builder().withAmmo(47).withCompatibleBullet(Bullets.Bullet762x54).withName("DP28Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new DP28Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-1.3f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M1CarbineMag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Bullets.Bullet762x51).withName("M1CarbineMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Mk14EBRmag(), "Mk14ebr.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)-4.2f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        FNFALMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet762x51).withName("FNFALMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new FNFALMag(), "fnfal.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.4f, (float)-3.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        Mk14EBRMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet762x51).withName("Mk14EBRmag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Mk14EBRmag(), "Mk14ebr.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)-4.2f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        M14Drum50 = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet762x51).withName("M14Drum50").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M14Drum50(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.2f, (float)-3.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        MP40Mag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullets.Bullet9x19mm).withName("MP40Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new MP40MagACTUAL(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.8f, (float)-2.2f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        MP5A5Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("MP5A5Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new HKMP5Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.9f, (float)-2.2f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        HK50Drum = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet9x19mm).withName("HK50Drum").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new HK50Drum(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.9f, (float)-2.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        MP7Mag = new ItemMagazine.Builder().withAmmo(40).withCompatibleBullet(Bullets.Bullet46x30mm).withName("MP7Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new MP7MagazineMEDIUM(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-0.9f, (float)0.9f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        UMP45Mag = new ItemMagazine.Builder().withAmmo(25).withCompatibleBullet(Bullets.Bullet45ACP).withName("UMP45Mag").withRequiredAttachments(Attachments.UMP45Receiver).withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new UMP45mag(), "ump45.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.9f, (float)-2.2f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        UMP9Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("UMP9Mag").withRequiredAttachments(Attachments.UMP9Receiver).withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new UMP9Mag(), "ump9mag.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.9f, (float)-2.2f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        MPXMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("MPXMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new MPXMag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.8f, (float)-2.5f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        APC9Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("APC9Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new APC9Mag(), "apc9.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.8f, (float)-2.5f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        ScorpionMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("ScorpionMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new ScorpionEVO3A1Magazine(), "scorpionevo3a1.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.9f, (float)-2.2f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        P90Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet57x28mm).withName("P90Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new P90Mag(), "p90.png").withRequiredAttachments(Attachments.P90DefaultKit, Attachments.AR57Receiver).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.8f, (float)-0.3f);
            GL11.glRotatef((float)-160.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        P90TerminatorMag = new ItemMagazine.Builder().withAmmo(65).withCompatibleBullet(Bullets.Bullet46x30mm).withName("P90TerminatorMag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new M4A1Mag(), "M4A1Mag.png").withRequiredAttachments(Attachments.P90Terminator).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.6f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        MAC10Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet45ACP).withName("MAC10Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new MAC10Mag(), "mac10.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.2f, (float)-1.0f);
            GL11.glRotatef((float)-160.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        G11Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet473x33mm).withName("G11Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new G11Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.8f, (float)-2.3f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        ScarHMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet762x51).withName("ScarHMag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new ScarHMag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.9f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        Scar40Mag = new ItemMagazine.Builder().withAmmo(40).withCompatibleBullet(Bullets.Bullet762x51).withName("Scar40Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Scar40Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.6f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        Scar60Mag = new ItemMagazine.Builder().withAmmo(60).withCompatibleBullet(Bullets.Bullet762x51).withName("Scar60Mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new Stanag50(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.2f, (float)-2.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        VSSVintorezMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x39mm).withName("VSSVintorezMag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new ASValMag(), "ASValMag.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.3f, (float)-0.6f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        STG44Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet792x33Kurz).withName("STG44Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new STG44Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.7f, (float)-2.3f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        G43GewehrMag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet792x57).withName("g43_gewehr_mag").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new G43GewehrMag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.9f, (float)-2.0f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        SV98Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x54).withName("SV98Mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new SV98Mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)1.4f, (float)-0.8f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        UziMag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullets.Bullet9x19mm).withName("UziMag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new UziMag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)0.3f, (float)-0.8f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        VP70Mag = new ItemMagazine.Builder().withAmmo(18).withCompatibleBullet(Bullets.Bullet9x19mm).withName("VP70mag_2").withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withModel(new VP70mag(), "gun.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.3f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.3f, (float)0.5f, (float)0.1f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)0.3f, (float)-0.4f, (float)-0.1f);
            GL11.glRotatef((float)-150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withMaxStackSize(6).withCrafting(CraftingComplexity.MEDIUM, "ingotSteel", Ores.GunmetalIngot).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
    }
}


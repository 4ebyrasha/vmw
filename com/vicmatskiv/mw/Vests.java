/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.FlyyeFieldCompactCarrier;
import com.vicmatskiv.mw.models.FlyyeMOLLERRV;
import com.vicmatskiv.mw.models.ForceReconVest;
import com.vicmatskiv.mw.models.FortArmor;
import com.vicmatskiv.mw.models.HECUVest;
import com.vicmatskiv.mw.models.HammerDownVest;
import com.vicmatskiv.mw.models.Juggernautbodyarmor;
import com.vicmatskiv.mw.models.MarineVest;
import com.vicmatskiv.mw.models.Mercvest;
import com.vicmatskiv.mw.models.SCARSuitVest;
import com.vicmatskiv.mw.models.SwatVest;
import com.vicmatskiv.mw.models.USMCVest;
import com.vicmatskiv.mw.models.UmbrellaCorpVest;
import com.vicmatskiv.mw.models.ViperSFvest;
import com.vicmatskiv.mw.models.WFITaskForceVest;
import com.vicmatskiv.weaponlib.ItemVest;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import net.minecraft.creativetab.CreativeTabs;
import org.lwjgl.opengl.GL11;

public class Vests {
    public static void preInit(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        new ItemVest.Builder().withName("flyye_field_compact_plate_carrier").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new FlyyeFieldCompactCarrier()).withModelTextureName("f4m_terminator_backpack.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("forest_flyye_field_compact_plate_carrier").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new FlyyeFieldCompactCarrier()).withModelTextureName("forest_bergen_backpack.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("black_flyye_field_compact_plate_carrier").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new FlyyeFieldCompactCarrier()).withModelTextureName("black_tru_spec_cordura_backpack.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("flyye_molle_rrv").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new FlyyeMOLLERRV()).withModelTextureName("f4m_terminator_backpack.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("black_flyye_molle_rrv").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new FlyyeMOLLERRV()).withModelTextureName("black_tru_spec_cordura_backpack.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("urban_flyye_molle_rrv").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new FlyyeMOLLERRV()).withModelTextureName("urban_f4m_terminator_backpack.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("force_recon_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new ForceReconVest()).withModelTextureName("f4m_terminator_backpack.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("forest_force_recon_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new ForceReconVest()).withModelTextureName("forest_bergen_backpack.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("urban_force_recon_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new ForceReconVest()).withModelTextureName("urban_f4m_terminator_backpack.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("black_force_recon_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new ForceReconVest()).withModelTextureName("black_tru_spec_cordura_backpack.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("usmc_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new USMCVest()).withModelTextureName("usmc.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("umbrella_corp_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new UmbrellaCorpVest()).withModelTextureName("umbrellacorp.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("hammer_down_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new HammerDownVest()).withModelTextureName("hammerdownvest.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("hecu_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new HECUVest()).withModelTextureName("hecu.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.9f, (float)0.9f, (float)0.9f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.98f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.45f, (float)-0.6f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("juggernaut_body_armor").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new Juggernautbodyarmor()).withModelTextureName("juggernautbodyarmor.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("marine_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new MarineVest()).withModelTextureName("marine.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("swat_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new SwatVest()).withModelTextureName("swat.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("fort_armor").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new FortArmor()).withModelTextureName("fortarmor.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("viper_sf").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new ViperSFvest()).withModelTextureName("vipersfvest.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("viper_sf_green").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new ViperSFvest()).withModelTextureName("vipersfvest_green.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("viper_sf_desert").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new ViperSFvest()).withModelTextureName("vipersfvest_desert.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("blackhawk_ballistic_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new Mercvest()).withModelTextureName("merc.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("wfi_task_force_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new WFITaskForceVest()).withModelTextureName("wfitaskforcevest.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemVest.Builder().withName("scar_vest").withDamageReduceAmount(25).withDurability(100).withTab(CreativeTabs.field_78026_f).withModel(new SCARSuitVest()).withModelTextureName("scarsuit.png").withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withInventoryPositioning(stack -> {
            GL11.glScalef((float)1.3f, (float)1.3f, (float)1.3f);
            GL11.glTranslatef((float)0.0f, (float)-0.55f, (float)0.0f);
            GL11.glRotatef((float)-200.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


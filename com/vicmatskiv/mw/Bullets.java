/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.BFGproj;
import com.vicmatskiv.mw.models.Bullet44;
import com.vicmatskiv.mw.models.BulletBig;
import com.vicmatskiv.mw.models.ChainsawFuel;
import com.vicmatskiv.mw.models.EnergyCase;
import com.vicmatskiv.mw.models.GL06Grenade;
import com.vicmatskiv.mw.models.M202Rocket;
import com.vicmatskiv.mw.models.MiniNuke;
import com.vicmatskiv.mw.models.RPG7rocketPROJECTILE;
import com.vicmatskiv.mw.models.Shotgun12Gauge;
import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import org.lwjgl.opengl.GL11;

public class Bullets {
    public static ItemBullet Bullet20x82mm;
    public static ItemBullet Bullet50BMG;
    public static ItemBullet Bullet408CT;
    public static ItemBullet Bullet308Winchester;
    public static ItemBullet Bullet8x58;
    public static ItemBullet Bullet792x57;
    public static ItemBullet Bullet792x33Kurz;
    public static ItemBullet Bullet3006Springfield;
    public static ItemBullet Bullet762x54;
    public static ItemBullet Bullet762x51;
    public static ItemBullet Shotgun12Guage;
    public static ItemBullet Shotgun4G;
    public static ItemBullet Bullet4570;
    public static ItemBullet Bullet4440;
    public static ItemBullet Bullet762x39;
    public static ItemBullet Bullet556x45;
    public static ItemBullet Bullet545x39;
    public static ItemBullet Bullet45ACP;
    public static ItemBullet Bullet357;
    public static ItemBullet Bullet40SW;
    public static ItemBullet Bullet44;
    public static ItemBullet Bullet50AE;
    public static ItemBullet Bullet500;
    public static ItemBullet Bullet380ACP;
    public static ItemBullet Bullet10mm;
    public static ItemBullet Bullet763x25;
    public static ItemBullet Bullet762x35;
    public static ItemBullet Bullet765x21;
    public static ItemBullet Bullet9x39mm;
    public static ItemBullet Bullet9x19mm;
    public static ItemBullet Bullet9x18mm;
    public static ItemBullet Bullet57x28mm;
    public static ItemBullet Bullet46x30mm;
    public static ItemBullet Bullet473x33mm;
    public static ItemBullet Grenade40mm;
    public static ItemBullet RPGRocket;
    public static ItemBullet M202Rocket;
    public static ItemBullet MiniNuke;
    public static ItemBullet EnergyCase;
    public static ItemBullet PlasmaCapsule;
    public static ItemBullet BFGammo;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        Grenade40mm = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Grenade40mm").withMaxStackSize(64).withModel(new GL06Grenade(), "GL06.png").withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.2f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.9f, (float)-0.29f, (float)0.8f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)1.0f, (float)2.1f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        MiniNuke = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("mininuke").withMaxStackSize(64).withModel(new MiniNuke(), "MiniNuke.png").withCrafting(8, CraftingComplexity.HIGH, "ingotIridium", Ores.GunmetalPlate, Ores.GunmetalIngot).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.2f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.9f, (float)-0.29f, (float)0.8f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-1.3f, (float)0.8f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        M202Rocket = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("m202rocket").withMaxStackSize(64).withModel(new M202Rocket(), "gun.png").withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", Ores.GunmetalPlate, Ores.GunmetalIngot).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.2f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.9f, (float)-0.29f, (float)0.8f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.8f, (float)-0.2f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        RPGRocket = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("rpg7_rocket").withMaxStackSize(64).withModel(new RPG7rocketPROJECTILE(), "rpg7.png").withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", Ores.GunmetalPlate, Ores.GunmetalIngot).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.2f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.9f, (float)-0.29f, (float)0.8f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-1.0f, (float)0.5f);
            GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        EnergyCase = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("EnergyCase").withModel(new EnergyCase(), "gun.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-1.1f, (float)0.6f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        PlasmaCapsule = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("PlasmaCapsule").withModel(new ChainsawFuel(), "PlasmaCapsule.png").withFirstPersonPositioning((player, itemStack) -> {
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
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        BFGammo = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("BFGammo").withModel(new BFGproj(), "BFGproj.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.6f, (float)-3.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet3006Springfield = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet3006Springfield").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet8x58 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet8x58").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet792x33Kurz = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet792x33Kurz").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet50BMG = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet50BMG").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet20x82mm = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet20x82mm").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet408CT = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet408CT").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet308Winchester = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet308Winchester").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet792x57 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet792x57").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet762x54 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet762x54").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet762x51 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet762x51").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Shotgun12Guage = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Shotgun12Gauge").withModel(new Shotgun12Gauge(), "Shotgun12Gauge.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Shotgun4G = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Shotgun4G").withModel(new Shotgun12Gauge(), "Shotgun4Gauge.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet762x35 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet762x35").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet765x21 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet765x21").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet762x39 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet762x39").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet556x45 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet556x45").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet545x39 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet545x39").withModel(new BulletBig(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet4570 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet4570").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet4440 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet4440").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet45ACP = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet45ACP").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet357 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet357").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet44 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet44").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet40SW = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet40SW").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet50AE = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet50AE").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet500 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet500").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet380ACP = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet380ACP").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet763x25 = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet763x25").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet9x39mm = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet9x39mm").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet9x19mm = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet9x19mm").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet9x18mm = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet9x18mm").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet57x28mm = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet57x28mm").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet46x30mm = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet46x30mm").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet10mm = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet10mm").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        Bullet473x33mm = new ItemBullet.Builder().withModId("mw").withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet473x33mm").withModel(new Bullet44(), "Bullet.png").withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER).withFirstPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)0.1f, (float)-1.0f, (float)0.4f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }).withThirdPersonPositioning((player, itemStack) -> {
            GL11.glTranslatef((float)-0.7f, (float)-0.29f, (float)0.7f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withInventoryPositioning(itemStack -> {
            GL11.glTranslatef((float)-0.8f, (float)-0.45f, (float)0.4f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
    }
}


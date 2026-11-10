/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBiped
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.Armors;
import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Backpacks;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.Electronics;
import com.vicmatskiv.mw.Entities;
import com.vicmatskiv.mw.Grenades;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.Guns;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.MeleeSkins;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.TileEntities;
import com.vicmatskiv.mw.Vests;
import com.vicmatskiv.mw.WorldGeneratorEventHandler;
import com.vicmatskiv.mw.items.melee.BaseballBatFactory;
import com.vicmatskiv.mw.items.melee.BaseballBatNailsFactory;
import com.vicmatskiv.mw.items.melee.NightStickFactory;
import com.vicmatskiv.mw.items.melee.TacticalTomahawkFactory;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleChannel;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMaterial;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import net.minecraft.client.model.ModelBiped;

public class CommonProxy {
    public ModelBiped getArmorModel(int id) {
        return null;
    }

    protected boolean isClient() {
        return false;
    }

    public void preInit(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        ModernWarfareMod.MOD_CONTEXT.preInit(mod, "mw", configurationManager, event, new CompatibleChannel(ModernWarfareMod.CHANNEL));
        ModernWarfareMod.MOD_CONTEXT.setChangeZoomSound("OpticZoom");
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOnSound("nightvision_on");
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOffSound("nightvision_off");
        ModernWarfareMod.MOD_CONTEXT.setChangeFireModeSound("firerate_toggle");
        ModernWarfareMod.MOD_CONTEXT.setNoAmmoSound("dry_fire");
        ModernWarfareMod.MOD_CONTEXT.setExplosionSound("grenadeexplosion");
        ModernWarfareMod.MOD_CONTEXT.setFlashExplosionSound("flashbang");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.ROCK, 1.5f, "bullet_3_rock", "bullet_2_rock", "bullet_4_rock", "bullet_12_stone");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.WOOD, 1.5f, "bullet_3_rock", "bullet_2_rock", "bullet_4_rock", "bullet_12_stone", "bullet_10_snap");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.GRASS, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.GROUND, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.SAND, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.SNOW, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.IRON, 1.5f, "bullet_6_iron", "bullet_7_iron", "bullet_8_iron");
        Backpacks.preInit(mod, configurationManager, event);
        Vests.preInit(mod, configurationManager, event);
        Ores.init(mod, configurationManager, event);
        Armors.init(mod, configurationManager, event, ModernWarfareMod.MOD_CONTEXT);
        Attachments.init(mod, configurationManager, event);
        AuxiliaryAttachments.init(mod, configurationManager, event);
        GunSkins.init(mod, configurationManager, event);
        MeleeSkins.init(mod, configurationManager, event);
        Bullets.init(mod, configurationManager, event);
        Magazines.init(mod, configurationManager, event);
        Guns.init(mod, configurationManager, event, this);
        Electronics.init(mod, configurationManager, event);
        Grenades.init(mod, configurationManager, event, this);
        new TacticalTomahawkFactory().createMelee(this);
        new BaseballBatFactory().createMelee(this);
        new BaseballBatNailsFactory().createMelee(this);
        new NightStickFactory().createMelee(this);
        TileEntities.init(this);
    }

    public void init(ModernWarfareMod mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {
        ModernWarfareMod.MOD_CONTEXT.init(mod, "mw");
        Entities.init(this);
        CompatibilityProvider.compatibility.registerWorldGenerator(new WorldGeneratorEventHandler(configurationManager), 0);
    }
}


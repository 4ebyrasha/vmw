/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.common.Mod$EventHandler
 *  net.minecraftforge.fml.common.SidedProxy
 *  net.minecraftforge.fml.common.event.FMLInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLPostInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLPreInitializationEvent
 *  net.minecraftforge.fml.common.network.NetworkRegistry
 *  net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.AmmoTab;
import com.vicmatskiv.mw.ArmorTab;
import com.vicmatskiv.mw.AssaultRiflesTab;
import com.vicmatskiv.mw.AttachmentsTab;
import com.vicmatskiv.mw.CombatServerTab;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.GadgetsTab;
import com.vicmatskiv.mw.GrenadesTab;
import com.vicmatskiv.mw.PropsTab;
import com.vicmatskiv.mw.RecipeManager;
import com.vicmatskiv.mw.SpartanTab;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import java.io.File;
import javax.xml.transform.stream.StreamSource;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid="mw", version="0.4.6.2", acceptedMinecraftVersions="[1.12.2]")
public class ModernWarfareMod {
    private static final String DEFAULT_CONFIG_RESOURCE = "/mw.cfg";
    private static final String MODERN_WARFARE_CONFIG_FILE_NAME = "ModernWarfare.cfg";
    public static final String MODID = "mw";
    public static final String VERSION = "0.4.6.2";
    @SidedProxy(serverSide="com.vicmatskiv.weaponlib.CommonModContext", clientSide="com.vicmatskiv.weaponlib.ClientModContext")
    public static ModContext MOD_CONTEXT;
    public static final SimpleNetworkWrapper CHANNEL;
    public static CreativeTabs ArmorTab;
    public static CreativeTabs SpartanTab;
    public static CreativeTabs AssaultRiflesTab;
    public static CreativeTabs CombatServerTab;
    public static CreativeTabs AmmoTab;
    public static CreativeTabs AttachmentsTab;
    public static CreativeTabs GrenadesTab;
    public static CreativeTabs GadgetsTab;
    public static CreativeTabs PropsTab;
    public static CreativeTabs BlocksTab;
    @SidedProxy(serverSide="com.vicmatskiv.mw.CommonProxy", clientSide="com.vicmatskiv.mw.ClientProxy")
    public static CommonProxy proxy;
    public static boolean oreGenerationEnabled;
    private ConfigurationManager configurationManager;

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event) {
        this.initConfigurationManager(event);
        proxy.preInit(this, this.configurationManager, new CompatibleFmlPreInitializationEvent(event));
        this.initRecipies(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(this, this.configurationManager, new CompatibleFmlInitializationEvent(event));
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if (this.configurationManager != null) {
            this.configurationManager.save();
        }
    }

    private void initConfigurationManager(FMLPreInitializationEvent event) {
        File parentDirectory = event.getSuggestedConfigurationFile().getParentFile();
        File configFile = parentDirectory != null ? new File(parentDirectory, MODERN_WARFARE_CONFIG_FILE_NAME) : new File(MODERN_WARFARE_CONFIG_FILE_NAME);
        this.configurationManager = new ConfigurationManager.Builder().withUserConfiguration(configFile).withDefaultConfiguration(new StreamSource(this.getClass().getResourceAsStream(DEFAULT_CONFIG_RESOURCE))).build();
    }

    public void initRecipies(FMLPreInitializationEvent event) {
        RecipeManager.init(MOD_CONTEXT);
    }

    static {
        CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);
        ArmorTab = new ArmorTab(CreativeTabs.getNextID(), "ArmorTab");
        SpartanTab = new SpartanTab(CreativeTabs.getNextID(), "SpartanTab");
        AssaultRiflesTab = new AssaultRiflesTab(CreativeTabs.getNextID(), "AssaultRifles_tab");
        CombatServerTab = new CombatServerTab(CreativeTabs.getNextID(), "CombatServer_tab");
        AmmoTab = new AmmoTab(CreativeTabs.getNextID(), "AmmoTab");
        AttachmentsTab = new AttachmentsTab(CreativeTabs.getNextID(), "AttachmentsTab");
        GrenadesTab = new GrenadesTab(CreativeTabs.getNextID(), "GrenadesTab");
        GadgetsTab = new GadgetsTab(CreativeTabs.getNextID(), "GadgetsTab");
        PropsTab = new PropsTab(CreativeTabs.getNextID(), "props_tab");
        BlocksTab = new PropsTab(CreativeTabs.getNextID(), "BlocksTab");
        oreGenerationEnabled = true;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.item.Item
 *  net.minecraftforge.oredict.OreDictionary
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.misc.BlockCopperOre;
import com.vicmatskiv.mw.misc.BlockGraphiteOre;
import com.vicmatskiv.mw.misc.BlockLeadOre;
import com.vicmatskiv.mw.misc.BlockSulfurOre;
import com.vicmatskiv.mw.misc.BlockTinOre;
import com.vicmatskiv.mw.misc.ItemCarbonComposite;
import com.vicmatskiv.mw.misc.ItemCarbonFiber;
import com.vicmatskiv.mw.misc.ItemCopperIngot;
import com.vicmatskiv.mw.misc.ItemGraphiteChunk;
import com.vicmatskiv.mw.misc.ItemGunmetalComposite;
import com.vicmatskiv.mw.misc.ItemGunmetalIngot;
import com.vicmatskiv.mw.misc.ItemGunmetalPlate;
import com.vicmatskiv.mw.misc.ItemLeadIngot;
import com.vicmatskiv.mw.misc.ItemPlasticPlate;
import com.vicmatskiv.mw.misc.ItemSteelDust;
import com.vicmatskiv.mw.misc.ItemSteelIngot;
import com.vicmatskiv.mw.misc.ItemSyntheticPlastic;
import com.vicmatskiv.mw.misc.ItemSyntheticPolymerComposite;
import com.vicmatskiv.mw.resources.ItemSulfurDust;
import com.vicmatskiv.mw.resources.ItemTinIngot;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class Ores {
    public static final String DUST_SULFUR = "dustSulfur";
    public static final String INGOT_STEEL = "ingotSteel";
    public static final String INGOT_COPPER = "ingotCopper";
    public static final String INGOT_TIN = "ingotTin";
    public static final String INGOT_LEAD = "ingotLead";
    public static Block LeadOre;
    public static Item LeadIngot;
    public static Block CopperOre;
    public static Item CopperIngot;
    public static Block GraphiteOre;
    public static Item GraphiteChunk;
    public static Block TinOre;
    public static Item TinIngot;
    public static Block SulfurOre;
    public static Item SulfurDust;
    public static Item GunmetalComposite;
    public static Item GunmetalIngot;
    public static Item GunmetalPlate;
    public static Item SteelDust;
    public static Item SteelIngot;
    public static Item CarbonComposite;
    public static Item CarbonFiber;
    public static Item SyntheticPolymerComposite;
    public static Item SyntheticPlastic;
    public static Item PlasticPlate;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        LeadOre = new BlockLeadOre();
        LeadIngot = new ItemLeadIngot();
        CopperOre = new BlockCopperOre();
        CopperIngot = new ItemCopperIngot();
        GraphiteOre = new BlockGraphiteOre();
        GraphiteChunk = new ItemGraphiteChunk();
        TinOre = new BlockTinOre();
        TinIngot = new ItemTinIngot();
        SulfurOre = new BlockSulfurOre();
        SulfurDust = new ItemSulfurDust();
        SteelDust = new ItemSteelDust();
        SteelIngot = new ItemSteelIngot();
        GunmetalComposite = new ItemGunmetalComposite();
        GunmetalIngot = new ItemGunmetalIngot();
        GunmetalPlate = new ItemGunmetalPlate();
        CarbonComposite = new ItemCarbonComposite();
        CarbonFiber = new ItemCarbonFiber();
        SyntheticPolymerComposite = new ItemSyntheticPolymerComposite();
        SyntheticPlastic = new ItemSyntheticPlastic();
        PlasticPlate = new ItemPlasticPlate();
        CompatibilityProvider.compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, LeadOre, "LeadOre");
        CompatibilityProvider.compatibility.registerItem("mw", LeadIngot, "leadingot");
        CompatibilityProvider.compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, CopperOre, "CopperOre");
        CompatibilityProvider.compatibility.registerItem("mw", CopperIngot, "CopperIngot");
        CompatibilityProvider.compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, GraphiteOre, "GraphiteOre");
        CompatibilityProvider.compatibility.registerItem("mw", GraphiteChunk, "GraphiteChunk");
        CompatibilityProvider.compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, TinOre, "TinOre");
        CompatibilityProvider.compatibility.registerItem("mw", TinIngot, "TinIngot");
        CompatibilityProvider.compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, SulfurOre, "SulfurOre");
        CompatibilityProvider.compatibility.registerItem("mw", SulfurDust, "SulfureDust");
        CompatibilityProvider.compatibility.registerItem("mw", SteelDust, "SteelDust");
        CompatibilityProvider.compatibility.registerItem("mw", SteelIngot, "SteelIngot");
        CompatibilityProvider.compatibility.registerItem("mw", GunmetalIngot, "GunmetalIngot");
        CompatibilityProvider.compatibility.registerItem("mw", GunmetalPlate, "GunmetalPlate");
        CompatibilityProvider.compatibility.registerItem("mw", GunmetalComposite, "GunmetalComposite");
        CompatibilityProvider.compatibility.registerItem("mw", CarbonComposite, "CarbonComposite");
        CompatibilityProvider.compatibility.registerItem("mw", CarbonFiber, "CarbonFiber");
        CompatibilityProvider.compatibility.registerItem("mw", SyntheticPolymerComposite, "SyntheticPolymerComposite");
        CompatibilityProvider.compatibility.registerItem("mw", SyntheticPlastic, "SyntheticPlastic");
        CompatibilityProvider.compatibility.registerItem("mw", PlasticPlate, "PlasticPlate");
        OreDictionary.registerOre((String)INGOT_LEAD, (Item)LeadIngot);
        OreDictionary.registerOre((String)INGOT_COPPER, (Item)CopperIngot);
        OreDictionary.registerOre((String)INGOT_TIN, (Item)TinIngot);
        OreDictionary.registerOre((String)DUST_SULFUR, (Item)SulfurDust);
        OreDictionary.registerOre((String)INGOT_STEEL, (Item)SteelIngot);
    }
}


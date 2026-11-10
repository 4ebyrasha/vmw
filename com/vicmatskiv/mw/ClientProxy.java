/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.RenderItem
 *  net.minecraft.client.renderer.block.model.ModelResourceLocation
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.Armors;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.PlayerAnimations;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.inventory.BackpackInventoryTab;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventoryTab;
import com.vicmatskiv.weaponlib.inventory.InventoryTabs;
import com.vicmatskiv.weaponlib.inventory.StandardPlayerInventoryTab;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ClientProxy
extends CommonProxy {
    @Override
    protected boolean isClient() {
        return true;
    }

    @Override
    public void preInit(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        super.preInit(mod, configurationManager, event);
        InventoryTabs inventoryTabs = InventoryTabs.getInstance();
        inventoryTabs.registerTab(new StandardPlayerInventoryTab());
        inventoryTabs.registerTab(new CustomPlayerInventoryTab(ModernWarfareMod.MOD_CONTEXT, (Item)Items.field_151163_ad));
        inventoryTabs.registerTab(new BackpackInventoryTab(ModernWarfareMod.MOD_CONTEXT));
    }

    @Override
    public void init(ModernWarfareMod mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {
        super.init(mod, configurationManager, event);
        PlayerAnimations.init(mod, null, event);
        Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(Item.func_150898_a((Block)Ores.CopperOre), 0, new ModelResourceLocation("mw:copperore", "inventory"));
        Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(Item.func_150898_a((Block)Ores.LeadOre), 0, new ModelResourceLocation("mw:leadore", "inventory"));
        Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(Item.func_150898_a((Block)Ores.SulfurOre), 0, new ModelResourceLocation("mw:sulfurore", "inventory"));
        Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(Item.func_150898_a((Block)Ores.TinOre), 0, new ModelResourceLocation("mw:tinore", "inventory"));
        Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(Item.func_150898_a((Block)Ores.GraphiteOre), 0, new ModelResourceLocation("mw:graphiteore", "inventory"));
        RenderItem renderItem = Minecraft.func_71410_x().func_175599_af();
        renderItem.func_175037_a().func_178086_a(Ores.CopperIngot, 0, new ModelResourceLocation("mw:copperingot", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.LeadIngot, 0, new ModelResourceLocation("mw:leadingot", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.SteelDust, 0, new ModelResourceLocation("mw:steeldust", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.SteelIngot, 0, new ModelResourceLocation("mw:steelingot", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.SulfurDust, 0, new ModelResourceLocation("mw:sulfurdust", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.TinIngot, 0, new ModelResourceLocation("mw:tiningot", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.GraphiteChunk, 0, new ModelResourceLocation("mw:graphitechunk", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.GunmetalIngot, 0, new ModelResourceLocation("mw:gunmetalingot", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.GunmetalPlate, 0, new ModelResourceLocation("mw:gunmetalplate", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.GunmetalComposite, 0, new ModelResourceLocation("mw:gunmetalcomposite", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.CarbonComposite, 0, new ModelResourceLocation("mw:carboncomposite", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.CarbonFiber, 0, new ModelResourceLocation("mw:carbonfiber", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.SyntheticPolymerComposite, 0, new ModelResourceLocation("mw:syntheticpolymercomposite", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.SyntheticPlastic, 0, new ModelResourceLocation("mw:syntheticplastic", "inventory"));
        renderItem.func_175037_a().func_178086_a(Ores.PlasticPlate, 0, new ModelResourceLocation("mw:plasticplate", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Dclassboots, 0, new ModelResourceLocation("mw:dclass_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Dclasschest, 0, new ModelResourceLocation("mw:dclass_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.SCPGuardboots, 0, new ModelResourceLocation("mw:swat_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.SCPGuardchest, 0, new ModelResourceLocation("mw:scpguard_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.SCPGuardhelmet, 0, new ModelResourceLocation("mw:scpguard_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Marineboots, 0, new ModelResourceLocation("mw:marine_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Marinechest, 0, new ModelResourceLocation("mw:marine_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Marinehelmet, 0, new ModelResourceLocation("mw:marine_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Spetznazboots, 0, new ModelResourceLocation("mw:spetznaz_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Spetznazchest, 0, new ModelResourceLocation("mw:spetznaz_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Spetznazhelmet, 0, new ModelResourceLocation("mw:spetznaz_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Swatboots, 0, new ModelResourceLocation("mw:swat_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Swatchest, 0, new ModelResourceLocation("mw:swat_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Swathelmet, 0, new ModelResourceLocation("mw:swat_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Santaboots, 0, new ModelResourceLocation("mw:santa_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Santachest, 0, new ModelResourceLocation("mw:santa_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Santahelmet, 0, new ModelResourceLocation("mw:santa_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.NaziSantaboots, 0, new ModelResourceLocation("mw:nazisanta_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.NaziSantachest, 0, new ModelResourceLocation("mw:nazisanta_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.NaziSantahelmet, 0, new ModelResourceLocation("mw:nazisanta_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.SpecOpsboots, 0, new ModelResourceLocation("mw:spec_ops_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.SpecOpschest, 0, new ModelResourceLocation("mw:spec_ops_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.SpecOpshelmet, 0, new ModelResourceLocation("mw:spec_ops_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.HECUboots, 0, new ModelResourceLocation("mw:hecu_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.HECUchest, 0, new ModelResourceLocation("mw:hecu_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.HECUhelmet, 0, new ModelResourceLocation("mw:hecu_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Juggernautboots, 0, new ModelResourceLocation("mw:juggernaut_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Juggernautchest, 0, new ModelResourceLocation("mw:juggernaut_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Juggernauthelmet, 0, new ModelResourceLocation("mw:juggernaut_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Mercboots, 0, new ModelResourceLocation("mw:merc_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Mercchest, 0, new ModelResourceLocation("mw:merc_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Merchelmet, 0, new ModelResourceLocation("mw:merc_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.STARSboots, 0, new ModelResourceLocation("mw:stars_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.STARSchest, 0, new ModelResourceLocation("mw:stars_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.NCRboots, 0, new ModelResourceLocation("mw:ncr_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.NCRchest, 0, new ModelResourceLocation("mw:ncr_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.NCRhelmet, 0, new ModelResourceLocation("mw:ncr_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.T60boots, 0, new ModelResourceLocation("mw:t60_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.T60chest, 0, new ModelResourceLocation("mw:t60_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.T60helmet, 0, new ModelResourceLocation("mw:t60_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Umbrellaboots, 0, new ModelResourceLocation("mw:umbrella_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Umbrellachest, 0, new ModelResourceLocation("mw:umbrella_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Umbrellahelmet, 0, new ModelResourceLocation("mw:umbrella_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Astronautboots, 0, new ModelResourceLocation("mw:Astronaut_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Astronautchest, 0, new ModelResourceLocation("mw:Astronaut_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Astronauthelmet, 0, new ModelResourceLocation("mw:Astronaut_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Scarboots, 0, new ModelResourceLocation("mw:scar_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Scarchest, 0, new ModelResourceLocation("mw:scar_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Scarhelmet, 0, new ModelResourceLocation("mw:scar_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.KCPDboots, 0, new ModelResourceLocation("mw:kcpd_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.KCPDchest, 0, new ModelResourceLocation("mw:kcpd_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIMainboots, 0, new ModelResourceLocation("mw:mkvi_main_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIMainchest, 0, new ModelResourceLocation("mw:mkvi_main_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIMainhelmet, 0, new ModelResourceLocation("mw:mkvi_main_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIDefaultboots, 0, new ModelResourceLocation("mw:mkvidefault_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIDefaultchest, 0, new ModelResourceLocation("mw:mkvidefault_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIDefaulthelmet, 0, new ModelResourceLocation("mw:mkvidefault_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIRedboots, 0, new ModelResourceLocation("mw:mkvired_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIRedchest, 0, new ModelResourceLocation("mw:mkvired_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIRedhelmet, 0, new ModelResourceLocation("mw:mkvired_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIBlueboots, 0, new ModelResourceLocation("mw:mkviblue_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIBluechest, 0, new ModelResourceLocation("mw:mkviblue_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVIBluehelmet, 0, new ModelResourceLocation("mw:mkviblue_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVRedboots, 0, new ModelResourceLocation("mw:mkv_red_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVRedchest, 0, new ModelResourceLocation("mw:mkv_red_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVRedhelmet, 0, new ModelResourceLocation("mw:mkv_red_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVBlueboots, 0, new ModelResourceLocation("mw:mkv_blue_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVBluechest, 0, new ModelResourceLocation("mw:mkv_blue_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVBluehelmet, 0, new ModelResourceLocation("mw:mkv_blue_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVGreenboots, 0, new ModelResourceLocation("mw:mkv_green_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVGreenchest, 0, new ModelResourceLocation("mw:mkv_green_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVGreenhelmet, 0, new ModelResourceLocation("mw:mkv_green_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVDefaultboots, 0, new ModelResourceLocation("mw:mkv_default_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVDefaultchest, 0, new ModelResourceLocation("mw:mkv_default_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVDefaulthelmet, 0, new ModelResourceLocation("mw:mkv_default_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVRedODSTboots, 0, new ModelResourceLocation("mw:mkv_red_odst_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVRedODSTchest, 0, new ModelResourceLocation("mw:mkv_red_odst_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVRedODSThelmet, 0, new ModelResourceLocation("mw:mkv_red_odst_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVBlueODSTboots, 0, new ModelResourceLocation("mw:mkv_blue_odst_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVBlueODSTchest, 0, new ModelResourceLocation("mw:mkv_blue_odst_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVBlueODSThelmet, 0, new ModelResourceLocation("mw:mkv_blue_odst_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVGreenODSTboots, 0, new ModelResourceLocation("mw:mkv_green_odst_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVGreenODSTchest, 0, new ModelResourceLocation("mw:mkv_green_odst_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVGreenODSThelmet, 0, new ModelResourceLocation("mw:mkv_green_odst_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVDefaultODSTboots, 0, new ModelResourceLocation("mw:mkv_default_odst_boots", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVDefaultODSTchest, 0, new ModelResourceLocation("mw:mkv_default_odst_chest", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.MKVDefaultODSThelmet, 0, new ModelResourceLocation("mw:mkv_default_odst_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.Tacticalhelmet, 0, new ModelResourceLocation("mw:tactical_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a(Armors.JPNVG18helmet, 0, new ModelResourceLocation("mw:jpnvg18_helmet", "inventory"));
        renderItem.func_175037_a().func_178086_a((Item)Armors.GasMaskM40, 0, new ModelResourceLocation("mw:m40gasmask_helmet", "inventory"));
    }
}


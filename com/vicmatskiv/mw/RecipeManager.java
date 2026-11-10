/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import net.minecraft.item.ItemStack;

public class RecipeManager {
    public static void init(ModContext modContext) {
        CompatibilityProvider.compatibility.addSmelting(Ores.CopperOre, new ItemStack(Ores.CopperIngot), 5.0f);
        CompatibilityProvider.compatibility.addSmelting(Ores.LeadOre, new ItemStack(Ores.LeadIngot), 5.0f);
        CompatibilityProvider.compatibility.addSmelting(Ores.TinOre, new ItemStack(Ores.TinIngot), 5.0f);
        CompatibilityProvider.compatibility.addSmelting(Ores.GunmetalComposite, new ItemStack(Ores.GunmetalIngot), 5.0f);
        CompatibilityProvider.compatibility.addSmelting(Ores.SulfurDust, CompatibilityProvider.compatibility.createItemStack(CompatibleItems.GUNPOWDER, 1, 0), 5.0f);
        CompatibilityProvider.compatibility.addSmelting(Ores.SteelDust, new ItemStack(Ores.SteelIngot), 5.0f);
        CompatibilityProvider.compatibility.addSmelting(Ores.CarbonComposite, new ItemStack(Ores.CarbonFiber), 5.0f);
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.GunmetalComposite, 3), "XXX", "FFF", Character.valueOf('X'), "ingotCopper", Character.valueOf('F'), "ingotTin");
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.GunmetalPlate, 1), "XXX", "XXX", Character.valueOf('X'), Ores.GunmetalIngot);
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.SteelDust, 1), "XXX", "XAX", "XXX", Character.valueOf('X'), CompatibleItems.COAL, Character.valueOf('A'), CompatibleItems.IRON_INGOT);
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.CarbonComposite, 3), "XXX", "AAA", Character.valueOf('X'), Ores.GraphiteChunk, Character.valueOf('A'), CompatibleItems.SLIME_BALL);
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.SyntheticPolymerComposite, 3), "FFF", "XXX", "AAA", Character.valueOf('F'), Ores.SulfurDust, Character.valueOf('X'), Ores.GraphiteChunk, Character.valueOf('A'), CompatibleItems.SLIME_BALL);
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.SyntheticPlastic, 1), "FFF", "XXX", Character.valueOf('F'), Ores.SyntheticPolymerComposite, Character.valueOf('X'), Ores.CarbonFiber);
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.PlasticPlate, 1), "XXX", Character.valueOf('X'), Ores.SyntheticPlastic);
    }
}


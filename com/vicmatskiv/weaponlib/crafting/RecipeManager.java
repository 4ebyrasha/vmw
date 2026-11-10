/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.crafting;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.crafting.OptionsMetadata;
import com.vicmatskiv.weaponlib.crafting.RecipeGenerator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RecipeManager {
    private static final Logger logger = LogManager.getLogger(RecipeManager.class);
    private RecipeGenerator recipeGenerator = new RecipeGenerator();
    private Map<Item, List<Object>> recipes = new HashMap<Item, List<Object>>();

    public List<Object> createShapedRecipe(Item item, String name, OptionsMetadata optionsMetadata) {
        List<Object> recipe = this.recipeGenerator.createShapedRecipe(name, optionsMetadata);
        if (this.recipes.put(item, recipe) != null) {
            logger.warn("Duplicate recipe registered for item {}", (Object)item);
        }
        return recipe;
    }

    public List<Object> registerShapedRecipe(Item item, Object ... recipe) {
        return this.registerShapedRecipe(new ItemStack(item), recipe);
    }

    public List<Object> registerShapedRecipe(ItemStack itemStack, Object ... recipe) {
        ArrayList<Object> recipeAslist = new ArrayList<Object>(recipe.length);
        boolean hasOres = false;
        for (Object option : recipe) {
            if (option instanceof CompatibleBlocks) {
                option = ((CompatibleBlocks)option).getBlock();
            } else if (option instanceof CompatibleItems) {
                option = ((CompatibleItems)option).getItem();
            } else if (option instanceof String) {
                hasOres = true;
            }
            recipeAslist.add(option);
        }
        if (hasOres) {
            CompatibilityProvider.compatibility.addShapedOreRecipe(itemStack, recipeAslist.toArray());
        } else {
            CompatibilityProvider.compatibility.addShapedRecipe(itemStack, recipeAslist.toArray());
        }
        if (this.recipes.put(itemStack.func_77973_b(), recipeAslist) != null) {
            logger.warn("Duplicate recipe registered for item {}", (Object)itemStack.func_77973_b());
        }
        return recipeAslist;
    }

    public List<Object> getRecipe(Item item) {
        return this.recipes.get(item);
    }
}


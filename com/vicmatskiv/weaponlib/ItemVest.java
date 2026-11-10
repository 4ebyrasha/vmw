/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.DamageSource
 *  net.minecraftforge.common.ISpecialArmor
 *  net.minecraftforge.common.ISpecialArmor$ArmorProperties
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.CustomRenderer;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.ModelSource;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.StaticModelSourceRenderer;
import com.vicmatskiv.weaponlib.Tuple;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

public class ItemVest
extends CompatibleItem
implements ISpecialArmor,
ModelSource {
    private List<Tuple<ModelBase, String>> texturedModels = new ArrayList<Tuple<ModelBase, String>>();
    private int size;
    private final int damageReduceAmount;
    private int durability;

    public ItemVest(ModContext context, int damageReduceAmount, int durability) {
        this.damageReduceAmount = damageReduceAmount;
        this.durability = durability;
    }

    public int func_77626_a(ItemStack stack) {
        return 1;
    }

    @Override
    public List<Tuple<ModelBase, String>> getTexturedModels() {
        return this.texturedModels;
    }

    @Override
    public CustomRenderer<?> getPostRenderer() {
        return null;
    }

    public int getSize() {
        return this.size;
    }

    private static String addFileExtension(String s, String ext) {
        return s != null && !s.endsWith(ext) ? s + ext : s;
    }

    public ISpecialArmor.ArmorProperties getProperties(EntityLivingBase player, ItemStack vestStack, DamageSource source, double damage, int slot) {
        return new ISpecialArmor.ArmorProperties(0, (double)this.damageReduceAmount / 25.0, this.durability);
    }

    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        return this.damageReduceAmount;
    }

    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
        double absorb = (double)damage * ((double)this.damageReduceAmount / 25.0);
        int itemDamage = (int)(absorb / 25.0 < 1.0 ? 1.0 : absorb / 25.0);
        stack.func_77972_a(itemDamage, entity);
    }

    public static class Builder {
        private String name;
        private CreativeTabs tab;
        private ModelBase model;
        private String textureName;
        private int durability;
        private int damageReduceAmount;
        private Consumer<ItemStack> entityPositioning;
        private Consumer<ItemStack> inventoryPositioning;
        private BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning;
        private BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning;
        private BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning;
        private BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning;
        private BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning;
        private BiConsumer<ModelBase, ItemStack> inventoryModelPositioning;
        private BiConsumer<ModelBase, ItemStack> entityModelPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDamageReduceAmount(int damageReduceAmount) {
            this.damageReduceAmount = damageReduceAmount;
            return this;
        }

        public Builder withDurability(int durability) {
            this.durability = durability;
            return this;
        }

        public Builder withTab(CreativeTabs tab) {
            this.tab = tab;
            return this;
        }

        public Builder withModel(ModelBase model) {
            this.model = model;
            return this;
        }

        public Builder withModelTextureName(String textureName) {
            this.textureName = textureName;
            return this;
        }

        public Builder withEntityPositioning(Consumer<ItemStack> entityPositioning) {
            this.entityPositioning = entityPositioning;
            return this;
        }

        public Builder withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
            this.inventoryPositioning = inventoryPositioning;
            return this;
        }

        public Builder withThirdPersonPositioning(BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning) {
            this.thirdPersonPositioning = thirdPersonPositioning;
            return this;
        }

        public Builder withCustomEquippedPositioning(BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning) {
            this.customEquippedPositioning = customEquippedPositioning;
            return this;
        }

        public Builder withFirstPersonPositioning(BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning) {
            this.firstPersonPositioning = firstPersonPositioning;
            return this;
        }

        public Builder withFirstPersonModelPositioning(BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning) {
            this.firstPersonModelPositioning = firstPersonModelPositioning;
            return this;
        }

        public Builder withEntityModelPositioning(BiConsumer<ModelBase, ItemStack> entityModelPositioning) {
            this.entityModelPositioning = entityModelPositioning;
            return this;
        }

        public Builder withInventoryModelPositioning(BiConsumer<ModelBase, ItemStack> inventoryModelPositioning) {
            this.inventoryModelPositioning = inventoryModelPositioning;
            return this;
        }

        public Builder withThirdPersonModelPositioning(BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning) {
            this.thirdPersonModelPositioning = thirdPersonModelPositioning;
            return this;
        }

        public Builder withFirstPersonHandPositioning(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioning = leftHand;
            this.firstPersonRightHandPositioning = rightHand;
            return this;
        }

        public ItemVest build(ModContext modContext) {
            if (this.name == null) {
                throw new IllegalStateException("ItemStorage name not set");
            }
            ItemVest item = new ItemVest(modContext, this.damageReduceAmount, this.durability);
            item.func_77655_b(modContext.getModId() + "_" + this.name);
            if (this.model != null) {
                item.texturedModels.add(new Tuple<ModelBase, String>(this.model, ItemVest.addFileExtension(this.textureName, ".png")));
            }
            if (this.tab != null) {
                item.func_77637_a(this.tab);
            }
            modContext.registerRenderableItem(this.name, (Item)item, CompatibilityProvider.compatibility.isClientSide() ? RendererRegistrationHelper.registerRenderer(this, modContext) : null);
            return item;
        }

        private static class RendererRegistrationHelper {
            private RendererRegistrationHelper() {
            }

            private static Object registerRenderer(Builder builder, ModContext modContext) {
                return new StaticModelSourceRenderer.Builder().withHiddenInventory(builder.tab == null).withEntityPositioning(builder.entityPositioning).withFirstPersonPositioning(builder.firstPersonPositioning).withThirdPersonPositioning(builder.thirdPersonPositioning).withCustomEquippedPositioning(builder.customEquippedPositioning).withInventoryPositioning(builder.inventoryPositioning).withEntityModelPositioning(builder.entityModelPositioning).withFirstPersonModelPositioning(builder.firstPersonModelPositioning).withThirdPersonModelPositioning(builder.thirdPersonModelPositioning).withInventoryModelPositioning(builder.inventoryModelPositioning).withFirstPersonHandPositioning(builder.firstPersonLeftHandPositioning, builder.firstPersonRightHandPositioning).withModContext(modContext).withModId(modContext.getModId()).build();
            }
        }
    }
}


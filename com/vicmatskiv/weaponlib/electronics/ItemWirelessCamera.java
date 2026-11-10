/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.electronics;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.CustomRenderer;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.ModelSource;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.StaticModelSourceRenderer;
import com.vicmatskiv.weaponlib.Tuple;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItem;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import com.vicmatskiv.weaponlib.crafting.OptionsMetadata;
import com.vicmatskiv.weaponlib.electronics.EntityWirelessCamera;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWirelessCamera
extends CompatibleItem
implements ModelSource {
    public static final long DEFAULT_DURATION = 300000L;
    private Builder builder;
    private ModContext modContext;
    private List<Tuple<ModelBase, String>> texturedModels = new ArrayList<Tuple<ModelBase, String>>();

    public ItemWirelessCamera(Builder builder, ModContext modContext) {
        this.builder = builder;
        this.modContext = modContext;
        this.field_77777_bU = 16;
    }

    @Override
    protected ItemStack onCompatibleItemRightClick(ItemStack itemStack, World world, EntityPlayer player, boolean mainHand) {
        CompatibilityProvider.compatibility.setStackSize(itemStack, CompatibilityProvider.compatibility.getStackSize(itemStack) - 1);
        if (!world.field_72995_K) {
            CompatibilityProvider.compatibility.spawnEntity((EntityLivingBase)player, (Entity)new EntityWirelessCamera(this.modContext, world, player, this, this.builder.duration));
        }
        return itemStack;
    }

    @Override
    public List<Tuple<ModelBase, String>> getTexturedModels() {
        return this.texturedModels;
    }

    @Override
    public CustomRenderer<?> getPostRenderer() {
        return null;
    }

    public ModelBase getModel() {
        return this.texturedModels.get(0).getU();
    }

    public String getTextureName() {
        return this.texturedModels.get(0).getV();
    }

    public static class Builder {
        protected String name;
        protected String modId;
        protected ModelBase model;
        protected String textureName;
        protected Consumer<ItemStack> entityPositioning;
        protected Consumer<ItemStack> inventoryPositioning;
        protected BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning;
        protected BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning;
        protected BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> inventoryModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> entityModelPositioning;
        protected Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
        protected Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;
        protected CreativeTabs tab;
        protected AttachmentCategory attachmentCategory;
        private List<Tuple<ModelBase, String>> texturedModels = new ArrayList<Tuple<ModelBase, String>>();
        private int maxStackSize = 1;
        private CraftingComplexity craftingComplexity;
        private Object[] craftingMaterials;
        private int craftingCount = 1;
        private long duration = 300000L;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCreativeTab(CreativeTabs tab) {
            this.tab = tab;
            return this;
        }

        public Builder withModId(String modId) {
            this.modId = modId;
            return this;
        }

        public Builder withModel(ModelBase model) {
            this.model = model;
            return this;
        }

        public Builder withTextureName(String textureName) {
            this.textureName = textureName.toLowerCase();
            return this;
        }

        public Builder withMaxStackSize(int maxStackSize) {
            this.maxStackSize = maxStackSize;
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

        public Builder withModel(ModelBase model, String textureName) {
            this.texturedModels.add(new Tuple<ModelBase, String>(model, textureName.toLowerCase()));
            return this;
        }

        public Builder withCrafting(CraftingComplexity craftingComplexity, Object ... craftingMaterials) {
            return this.withCrafting(1, craftingComplexity, craftingMaterials);
        }

        public Builder withCrafting(int craftingCount, CraftingComplexity craftingComplexity, Object ... craftingMaterials) {
            if (craftingComplexity == null) {
                throw new IllegalArgumentException("Crafting complexity not set");
            }
            if (craftingMaterials.length < 2) {
                throw new IllegalArgumentException("2 or more materials required for crafting");
            }
            if (craftingCount == 0) {
                throw new IllegalArgumentException("Invalid item count");
            }
            this.craftingComplexity = craftingComplexity;
            this.craftingMaterials = craftingMaterials;
            this.craftingCount = craftingCount;
            return this;
        }

        public Builder withDuration(long duration) {
            this.duration = duration;
            return this;
        }

        public ItemWirelessCamera build(ModContext modContext) {
            ItemWirelessCamera camera = new ItemWirelessCamera(this, modContext);
            camera.func_77655_b(this.modId + "_" + this.name);
            camera.func_77637_a(this.tab);
            camera.field_77777_bU = this.maxStackSize;
            this.texturedModels.forEach(tm -> camera.texturedModels.add(new Tuple(tm.getU(), Builder.addFileExtension((String)tm.getV(), ".png"))));
            if (this.model != null) {
                this.texturedModels.add(new Tuple<ModelBase, String>(this.model, Builder.addFileExtension(this.textureName, ".png")));
            }
            if (this.model != null || !this.texturedModels.isEmpty()) {
                modContext.registerRenderableItem(this.name, (Item)camera, CompatibilityProvider.compatibility.isClientSide() ? this.registerRenderer(camera, modContext) : null);
            }
            if (this.craftingComplexity != null) {
                OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder().withSlotCount(9).build(this.craftingComplexity, Arrays.copyOf(this.craftingMaterials, this.craftingMaterials.length));
                List<Object> shape = modContext.getRecipeManager().createShapedRecipe(camera, this.name, optionsMetadata);
                ItemStack itemStack = new ItemStack((Item)camera);
                CompatibilityProvider.compatibility.setStackSize(itemStack, this.craftingCount);
                if (optionsMetadata.hasOres()) {
                    CompatibilityProvider.compatibility.addShapedOreRecipe(itemStack, shape.toArray());
                } else {
                    CompatibilityProvider.compatibility.addShapedRecipe(itemStack, shape.toArray());
                }
            }
            return camera;
        }

        static String addFileExtension(String s, String ext) {
            return s != null && !s.endsWith(ext) ? s + ext : s;
        }

        protected static String stripFileExtension(String str, String extension) {
            return str.endsWith(extension) ? str.substring(0, str.length() - extension.length()) : str;
        }

        private Object registerRenderer(ItemWirelessCamera camera, ModContext modContext) {
            return new StaticModelSourceRenderer.Builder().withEntityPositioning(this.entityPositioning).withFirstPersonPositioning(this.firstPersonPositioning).withThirdPersonPositioning(this.thirdPersonPositioning).withInventoryPositioning(this.inventoryPositioning).withEntityModelPositioning(this.entityModelPositioning).withFirstPersonModelPositioning(this.firstPersonModelPositioning).withThirdPersonModelPositioning(this.thirdPersonModelPositioning).withInventoryModelPositioning(this.inventoryModelPositioning).withFirstPersonHandPositioning(this.firstPersonLeftHandPositioning, this.firstPersonRightHandPositioning).withModContext(modContext).withModId(this.modId).build();
        }
    }
}


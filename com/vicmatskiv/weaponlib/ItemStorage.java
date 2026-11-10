/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
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
import java.util.function.Predicate;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemStorage
extends CompatibleItem
implements ModelSource {
    private List<Tuple<ModelBase, String>> texturedModels = new ArrayList<Tuple<ModelBase, String>>();
    private int size;
    private ResourceLocation guiTextureLocation;
    private int guiTextureWidth;
    private Predicate<Item> validItemPredicate;

    public ItemStorage(ModContext context, int size, Predicate<Item> validItemPredicate, ResourceLocation guiTextureLocation, int guiTextureWidth) {
        this.validItemPredicate = validItemPredicate;
        this.size = size;
        this.guiTextureLocation = guiTextureLocation;
        this.guiTextureWidth = guiTextureWidth;
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

    public ResourceLocation getGuiTextureLocation() {
        return this.guiTextureLocation;
    }

    private static String addFileExtension(String s, String ext) {
        return s != null && !s.endsWith(ext) ? s + ext : s;
    }

    public int getGuiTextureWidth() {
        return this.guiTextureWidth;
    }

    public Predicate<Item> getValidItemPredicate() {
        return this.validItemPredicate;
    }

    public static class Builder {
        private static final int DEFAULT_GUI_TEXTURE_WIDTH = 176;
        private String name;
        private CreativeTabs tab;
        private ModelBase model;
        private String textureName;
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
        private int size;
        private String guiTextureName;
        private int guiTextureWidth = 176;
        private Predicate<Item> validItemPredicate = item -> true;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSize(int size) {
            this.size = size;
            return this;
        }

        public Builder withValidItemPredicate(Predicate<Item> validItemPredicate) {
            this.validItemPredicate = validItemPredicate;
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

        public Builder withGuiTextureName(String guiTextureName) {
            this.guiTextureName = guiTextureName;
            return this;
        }

        public Builder withGuiTextureWidth(int guiTextureWidth) {
            this.guiTextureWidth = guiTextureWidth;
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

        public ItemStorage build(ModContext modContext) {
            if (this.name == null) {
                throw new IllegalStateException("ItemStorage name not set");
            }
            if (this.size <= 0) {
                throw new IllegalStateException("ItemStorage size must be greater than 0");
            }
            if (this.guiTextureName == null) {
                throw new IllegalStateException("ItemStorage gui texture not set");
            }
            if (!this.guiTextureName.startsWith("textures/gui/")) {
                this.guiTextureName = "textures/gui/" + this.guiTextureName;
            }
            ResourceLocation guiTextureLocation = new ResourceLocation(modContext.getModId(), ItemStorage.addFileExtension(this.guiTextureName, ".png"));
            ItemStorage item = new ItemStorage(modContext, this.size, this.validItemPredicate, guiTextureLocation, this.guiTextureWidth);
            item.func_77655_b(modContext.getModId() + "_" + this.name);
            if (this.model != null) {
                item.texturedModels.add(new Tuple<ModelBase, String>(this.model, ItemStorage.addFileExtension(this.textureName, ".png")));
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


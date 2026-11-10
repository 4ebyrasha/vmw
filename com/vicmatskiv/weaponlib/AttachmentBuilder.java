/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.CustomRenderer;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.StaticModelSourceRenderer;
import com.vicmatskiv.weaponlib.Tuple;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import com.vicmatskiv.weaponlib.crafting.OptionsMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class AttachmentBuilder<T> {
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
    protected ItemAttachment.ApplyHandler<T> apply;
    protected ItemAttachment.ApplyHandler<T> remove;
    protected ItemAttachment.ApplyHandler2<T> apply2;
    protected ItemAttachment.ApplyHandler2<T> remove2;
    private String crosshair;
    private CustomRenderer<?> postRenderer;
    private List<Tuple<ModelBase, String>> texturedModels = new ArrayList<Tuple<ModelBase, String>>();
    private boolean isRenderablePart;
    private int maxStackSize = 1;
    private Function<ItemStack, String> informationProvider;
    private CraftingComplexity craftingComplexity;
    private Object[] craftingMaterials;
    Map<ItemAttachment<T>, CompatibleAttachment<T>> compatibleAttachments = new HashMap<ItemAttachment<T>, CompatibleAttachment<T>>();
    private int craftingCount = 1;
    private Object[] craftingRecipe;
    private List<ItemAttachment<T>> requiredAttachments = new ArrayList<ItemAttachment<T>>();

    public AttachmentBuilder<T> withCategory(AttachmentCategory attachmentCategory) {
        this.attachmentCategory = attachmentCategory;
        return this;
    }

    public AttachmentBuilder<T> withName(String name) {
        this.name = name;
        return this;
    }

    public AttachmentBuilder<T> withCreativeTab(CreativeTabs tab) {
        this.tab = tab;
        return this;
    }

    public AttachmentBuilder<T> withModId(String modId) {
        this.modId = modId;
        return this;
    }

    public AttachmentBuilder<T> withCompatibleAttachment(ItemAttachment<T> attachment, Consumer<ModelBase> positioner) {
        this.compatibleAttachments.put(attachment, new CompatibleAttachment<T>(attachment, positioner));
        return this;
    }

    @SafeVarargs
    public final AttachmentBuilder<T> withRequiredAttachments(ItemAttachment<T> ... requiredAttachments) {
        for (int i = 0; i < requiredAttachments.length; ++i) {
            this.requiredAttachments.add(requiredAttachments[i]);
        }
        return this;
    }

    public AttachmentBuilder<T> withModel(ModelBase model) {
        this.model = model;
        return this;
    }

    public AttachmentBuilder<T> withTextureName(String textureName) {
        this.textureName = textureName.toLowerCase();
        return this;
    }

    public AttachmentBuilder<T> withMaxStackSize(int maxStackSize) {
        this.maxStackSize = maxStackSize;
        return this;
    }

    public AttachmentBuilder<T> withEntityPositioning(Consumer<ItemStack> entityPositioning) {
        this.entityPositioning = entityPositioning;
        return this;
    }

    public AttachmentBuilder<T> withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
        this.inventoryPositioning = inventoryPositioning;
        return this;
    }

    public AttachmentBuilder<T> withThirdPersonPositioning(BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning) {
        this.thirdPersonPositioning = thirdPersonPositioning;
        return this;
    }

    public AttachmentBuilder<T> withFirstPersonPositioning(BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning) {
        this.firstPersonPositioning = firstPersonPositioning;
        return this;
    }

    public AttachmentBuilder<T> withFirstPersonModelPositioning(BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning) {
        this.firstPersonModelPositioning = firstPersonModelPositioning;
        return this;
    }

    public AttachmentBuilder<T> withEntityModelPositioning(BiConsumer<ModelBase, ItemStack> entityModelPositioning) {
        this.entityModelPositioning = entityModelPositioning;
        return this;
    }

    public AttachmentBuilder<T> withInventoryModelPositioning(BiConsumer<ModelBase, ItemStack> inventoryModelPositioning) {
        this.inventoryModelPositioning = inventoryModelPositioning;
        return this;
    }

    public AttachmentBuilder<T> withThirdPersonModelPositioning(BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning) {
        this.thirdPersonModelPositioning = thirdPersonModelPositioning;
        return this;
    }

    public AttachmentBuilder<T> withFirstPersonHandPositioning(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
        this.firstPersonLeftHandPositioning = leftHand;
        this.firstPersonRightHandPositioning = rightHand;
        return this;
    }

    public AttachmentBuilder<T> withCrosshair(String crosshair) {
        this.crosshair = crosshair.toLowerCase();
        return this;
    }

    public AttachmentBuilder<T> withPostRender(CustomRenderer<?> postRenderer) {
        this.postRenderer = postRenderer;
        return this;
    }

    public AttachmentBuilder<T> withModel(ModelBase model, String textureName) {
        this.texturedModels.add(new Tuple<ModelBase, String>(model, textureName.toLowerCase()));
        return this;
    }

    public AttachmentBuilder<T> withRenderablePart() {
        this.isRenderablePart = true;
        return this;
    }

    public AttachmentBuilder<T> withApply(ItemAttachment.ApplyHandler<T> apply) {
        this.apply = apply;
        return this;
    }

    public AttachmentBuilder<T> withRemove(ItemAttachment.ApplyHandler<T> remove) {
        this.remove = remove;
        return this;
    }

    public AttachmentBuilder<T> withApply(ItemAttachment.ApplyHandler2<T> apply) {
        this.apply2 = apply;
        return this;
    }

    public AttachmentBuilder<T> withRemove(ItemAttachment.ApplyHandler2<T> remove) {
        this.remove2 = remove;
        return this;
    }

    public AttachmentBuilder<T> withCrafting(CraftingComplexity craftingComplexity, Object ... craftingMaterials) {
        return this.withCrafting(1, craftingComplexity, craftingMaterials);
    }

    public AttachmentBuilder<T> withInformationProvider(Function<ItemStack, String> informationProvider) {
        this.informationProvider = informationProvider;
        return this;
    }

    public AttachmentBuilder<T> withCrafting(int craftingCount, CraftingComplexity craftingComplexity, Object ... craftingMaterials) {
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

    public AttachmentBuilder<T> withCraftingRecipe(Object ... craftingRecipe) {
        this.craftingRecipe = craftingRecipe;
        return this;
    }

    protected ItemAttachment<T> createAttachment(ModContext modContext) {
        return new ItemAttachment<T>(this.getModId(), this.attachmentCategory, this.crosshair, this.apply, this.remove);
    }

    public ItemAttachment<T> build(ModContext modContext) {
        ItemAttachment attachment = this.createAttachment(modContext);
        attachment.func_77655_b(this.getModId() + "_" + this.name);
        attachment.func_77637_a(this.tab);
        attachment.setPostRenderer(this.postRenderer);
        attachment.setName(this.name);
        attachment.apply2 = this.apply2;
        attachment.remove2 = this.remove2;
        attachment.field_77777_bU = this.maxStackSize;
        attachment.setRequiredAttachments(this.requiredAttachments);
        if (attachment.getInformationProvider() == null) {
            attachment.setInformationProvider(this.informationProvider);
        }
        if (this.getTextureName() != null) {
            attachment.setTextureName(this.getModId() + ":" + AttachmentBuilder.stripFileExtension(this.getTextureName(), ".png"));
        }
        if (this.isRenderablePart) {
            attachment.setRenderablePart(new Part(){

                public String toString() {
                    return AttachmentBuilder.this.name != null ? "Part [" + AttachmentBuilder.this.name + "]" : super.toString();
                }
            });
        }
        if (this.getModel() != null) {
            attachment.addModel(this.getModel(), AttachmentBuilder.addFileExtension(this.getTextureName(), ".png"));
        }
        this.texturedModels.forEach(tm -> attachment.addModel((ModelBase)tm.getU(), AttachmentBuilder.addFileExtension((String)tm.getV(), ".png")));
        this.compatibleAttachments.values().forEach(a -> attachment.addCompatibleAttachment((CompatibleAttachment)a));
        if (this.getModel() != null || !this.texturedModels.isEmpty()) {
            modContext.registerRenderableItem(this.name, attachment, CompatibilityProvider.compatibility.isClientSide() ? this.registerRenderer(attachment, modContext) : null);
        }
        if (this.craftingRecipe != null && this.craftingRecipe.length >= 2) {
            modContext.getRecipeManager().registerShapedRecipe(attachment, this.craftingRecipe);
        } else if (this.craftingComplexity != null) {
            OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder().withSlotCount(9).build(this.craftingComplexity, Arrays.copyOf(this.craftingMaterials, this.craftingMaterials.length));
            List<Object> shape = modContext.getRecipeManager().createShapedRecipe(attachment, this.name, optionsMetadata);
            ItemStack itemStack = new ItemStack(attachment);
            CompatibilityProvider.compatibility.setStackSize(itemStack, this.craftingCount);
            if (optionsMetadata.hasOres()) {
                CompatibilityProvider.compatibility.addShapedOreRecipe(itemStack, shape.toArray());
            } else {
                CompatibilityProvider.compatibility.addShapedRecipe(itemStack, shape.toArray());
            }
        } else if (attachment.getCategory() == AttachmentCategory.GRIP || attachment.getCategory() == AttachmentCategory.SCOPE || attachment.getCategory() == AttachmentCategory.MAGAZINE || attachment.getCategory() == AttachmentCategory.BULLET || attachment.getCategory() == AttachmentCategory.SILENCER || attachment.getCategory() == AttachmentCategory.SKIN || attachment.getCategory() == AttachmentCategory.LASER) {
            System.err.println("!!!No recipe defined for attachment " + this.name);
        }
        return attachment;
    }

    private Object registerRenderer(ItemAttachment<T> attachment, ModContext modContext) {
        return new StaticModelSourceRenderer.Builder().withHiddenInventory(this.tab == null).withEntityPositioning(this.entityPositioning).withFirstPersonPositioning(this.firstPersonPositioning).withThirdPersonPositioning(this.thirdPersonPositioning).withInventoryPositioning(this.inventoryPositioning).withEntityModelPositioning(this.entityModelPositioning).withFirstPersonModelPositioning(this.firstPersonModelPositioning).withThirdPersonModelPositioning(this.thirdPersonModelPositioning).withInventoryModelPositioning(this.inventoryModelPositioning).withFirstPersonHandPositioning(this.firstPersonLeftHandPositioning, this.firstPersonRightHandPositioning).withModContext(modContext).withModId(this.getModId()).build();
    }

    static String addFileExtension(String s, String ext) {
        return s != null && !s.endsWith(ext) ? s + ext : s;
    }

    protected static String stripFileExtension(String str, String extension) {
        return str.endsWith(extension) ? str.substring(0, str.length() - extension.length()) : str;
    }

    public <V extends ItemAttachment<T>> V build(ModContext modContext, Class<V> target) {
        return (V)((ItemAttachment)target.cast(this.build(modContext)));
    }

    public String getModId() {
        return this.modId;
    }

    public ModelBase getModel() {
        return this.model;
    }

    public String getTextureName() {
        return this.textureName;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 *  net.minecraftforge.common.ISpecialArmor
 *  net.minecraftforge.common.ISpecialArmor$ArmorProperties
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.ExposureProtection;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.Spreadable;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleCustomArmor;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.model.ModelBaseRendererWrapper;
import com.vicmatskiv.weaponlib.model.WrappableModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;

public class CustomArmor
extends CompatibleCustomArmor
implements ExposureProtection,
ISpecialArmor {
    private static final String ACTIVE_ATTACHMENT_TAG = "ActiveAttachments";
    private static final String SHIELD_CAPACITY_TAG = "ShieldCapacity";
    private static final String SHIELD_HIT_TIMESTAMP_TAG = "ShieldHitTimestamp";
    private Map<ItemAttachment<CustomArmor>, CompatibleAttachment<CustomArmor>> compatibleAttachments = new HashMap<ItemAttachment<CustomArmor>, CompatibleAttachment<CustomArmor>>();
    private boolean hasNightVision;
    private boolean vignetteEnabled;
    private float exposureReductionFactor;
    private CompatibleSound breathingSound;
    private CompatibleEntityEquipmentSlot compatibleEquipmentType;
    private long shieldRegenerationTimeout = 1000L;
    private double shieldRegenerationRate = 1.0;
    private double maxShieldCapacity;
    private String unlocalizedArmorSetName;
    private double shieldIndicatorPositionX;
    private double shieldIndicatorPositionY;
    private double shieldIndicatorWidth;
    private double shieldIndicatorHeight;
    private String shieldIndicatorMaskTextureName;
    private String shieldIndicatorProgressBarTextureName;

    private CustomArmor(String modId, String unlocalizedArmorSetName, ItemArmor.ArmorMaterial material, int renderIndex, CompatibleEntityEquipmentSlot armorType, String iconName, String textureName, ModelBiped model, String hudTextureName) {
        super(modId, material, renderIndex, armorType, iconName.toLowerCase(), textureName, model, hudTextureName);
        this.compatibleEquipmentType = armorType;
        this.unlocalizedArmorSetName = unlocalizedArmorSetName;
    }

    @Override
    public String getHudTexture() {
        return this.modId + ":textures/hud/" + this.hudTextureName + ".png";
    }

    public String getShieldIndicatorMaskTextureName() {
        return this.modId + ":textures/hud/" + this.shieldIndicatorMaskTextureName + ".png";
    }

    public String getShieldIndicatorProgressBarTextureName() {
        return this.modId + ":textures/hud/" + this.shieldIndicatorProgressBarTextureName + ".png";
    }

    public String getUnlocalizedArmorSetName() {
        return this.unlocalizedArmorSetName;
    }

    public void changeAttachment(AttachmentCategory attachmentCategory, ItemStack itemStack, EntityPlayer player) {
        ItemAttachment<CustomArmor> nextAttachment;
        CompatibilityProvider.compatibility.ensureTagCompound(itemStack);
        int[] activeAttachmentsIds = this.ensureActiveAttachments(itemStack);
        int activeAttachmentIdForThisCategory = activeAttachmentsIds[attachmentCategory.ordinal()];
        ItemAttachment item = null;
        if (activeAttachmentIdForThisCategory > 0 && (item = (ItemAttachment)Item.func_150899_d((int)activeAttachmentIdForThisCategory)) != null && item.getRemove() != null) {
            item.getRemove().apply(item, this, (EntityLivingBase)player);
        }
        if ((nextAttachment = this.nextCompatibleAttachment(attachmentCategory, item, player)) != null && nextAttachment.getApply() != null) {
            nextAttachment.getApply().apply(nextAttachment, this, (EntityLivingBase)player);
        }
        activeAttachmentsIds[attachmentCategory.ordinal()] = Item.func_150891_b(nextAttachment);
        CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74783_a(ACTIVE_ATTACHMENT_TAG, activeAttachmentsIds);
    }

    private ItemAttachment<CustomArmor> nextCompatibleAttachment(AttachmentCategory category, Item currentAttachment, EntityPlayer player) {
        ItemAttachment nextAttachment = null;
        boolean foundCurrent = false;
        for (int i = 0; i < 36; ++i) {
            ItemAttachment compatibleAttachment;
            ItemStack itemStack = player.field_71071_by.func_70301_a(i);
            if (itemStack == null || !(itemStack.func_77973_b() instanceof ItemAttachment) || (compatibleAttachment = (ItemAttachment)itemStack.func_77973_b()).getCategory() != category) continue;
            if (foundCurrent || currentAttachment == null) {
                nextAttachment = compatibleAttachment;
                break;
            }
            if (currentAttachment != compatibleAttachment) continue;
            foundCurrent = true;
        }
        return nextAttachment;
    }

    public ItemAttachment<CustomArmor> getActiveAttachment(ItemStack itemStack, AttachmentCategory category) {
        int[] activeAttachmentsIds;
        CompatibilityProvider.compatibility.ensureTagCompound(itemStack);
        ItemAttachment<CustomArmor> itemAttachment = null;
        for (int activeIndex : activeAttachmentsIds = this.ensureActiveAttachments(itemStack)) {
            CompatibleAttachment<CustomArmor> compatibleAttachment;
            Item item;
            if (activeIndex == 0 || !((item = Item.func_150899_d((int)activeIndex)) instanceof ItemAttachment) || (compatibleAttachment = this.compatibleAttachments.get(item)) == null || category != compatibleAttachment.getAttachment().getCategory()) continue;
            itemAttachment = compatibleAttachment.getAttachment();
            break;
        }
        return itemAttachment;
    }

    public List<CompatibleAttachment<CustomArmor>> getActiveAttachments(ItemStack itemStack) {
        int[] activeAttachmentsIds;
        CompatibilityProvider.compatibility.ensureTagCompound(itemStack);
        ArrayList<CompatibleAttachment<CustomArmor>> activeAttachments = new ArrayList<CompatibleAttachment<CustomArmor>>();
        for (int activeIndex : activeAttachmentsIds = this.ensureActiveAttachments(itemStack)) {
            CompatibleAttachment<CustomArmor> compatibleAttachment;
            Item item;
            if (activeIndex == 0 || !((item = Item.func_150899_d((int)activeIndex)) instanceof ItemAttachment) || (compatibleAttachment = this.compatibleAttachments.get(item)) == null) continue;
            activeAttachments.add(compatibleAttachment);
        }
        return activeAttachments;
    }

    private int[] ensureActiveAttachments(ItemStack itemStack) {
        int[] activeAttachmentsIds = CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74759_k(ACTIVE_ATTACHMENT_TAG);
        if (activeAttachmentsIds == null || activeAttachmentsIds.length != AttachmentCategory.values.length) {
            activeAttachmentsIds = new int[AttachmentCategory.values.length];
            CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74783_a(ACTIVE_ATTACHMENT_TAG, activeAttachmentsIds);
            for (CompatibleAttachment<CustomArmor> attachment : this.compatibleAttachments.values()) {
                if (!attachment.isDefault()) continue;
                activeAttachmentsIds[attachment.getAttachment().getCategory().ordinal()] = Item.func_150891_b(attachment.getAttachment());
            }
        }
        return activeAttachmentsIds;
    }

    public static boolean isActiveAttachment(ItemStack itemStack, ItemAttachment<CustomArmor> attachment) {
        CustomArmor armor = (CustomArmor)itemStack.func_77973_b();
        int[] activeAttachmentsIds = armor.ensureActiveAttachments(itemStack);
        return Arrays.stream(activeAttachmentsIds).anyMatch(attachmentId -> attachment == Item.func_150899_d((int)attachmentId));
    }

    public boolean hasNightVision() {
        return this.hasNightVision;
    }

    public boolean isVignetteEnabled() {
        return this.vignetteEnabled;
    }

    @Override
    public Function<Float, Float> getAbsorbFunction(Spreadable spreadable) {
        return dose -> Float.valueOf(dose.floatValue() * (1.0f - this.exposureReductionFactor));
    }

    public void func_77663_a(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        double currentShieldCapacity;
        super.func_77663_a(stack, worldIn, entityIn, itemSlot, isSelected);
        if (!worldIn.field_72995_K && entityIn != null && this.maxShieldCapacity > 0.0 && (currentShieldCapacity = this.getShieldCapacity(stack)) < this.maxShieldCapacity) {
            long shieldHitTimestamp = this.getShieldHitTimestamp(stack);
            if (System.currentTimeMillis() - shieldHitTimestamp > this.shieldRegenerationTimeout) {
                if ((currentShieldCapacity += this.shieldRegenerationRate / 20.0) > this.maxShieldCapacity) {
                    currentShieldCapacity = this.maxShieldCapacity;
                }
                this.setShieldCapacity(stack, currentShieldCapacity);
            }
        }
    }

    public CompatibleEntityEquipmentSlot getCompatibleEquipmentSlot() {
        return this.compatibleEquipmentType;
    }

    public ISpecialArmor.ArmorProperties getProperties(EntityLivingBase player, ItemStack armorStack, DamageSource source, double damage, int slot) {
        double damageReduceRatio = this.maxShieldCapacity > 0.0 ? (this.getShieldCapacity(armorStack) > 0.0 ? 1.0 : 0.001) : (double)this.field_77879_b / 25.0;
        return new ISpecialArmor.ArmorProperties(0, damageReduceRatio, Integer.MAX_VALUE);
    }

    private void ensureTagCompound(ItemStack itemStack) {
        if (CompatibilityProvider.compatibility.getTagCompound(itemStack) == null) {
            NBTTagCompound tagCompound = new NBTTagCompound();
            CompatibilityProvider.compatibility.setTagCompound(itemStack, tagCompound);
            tagCompound.func_74780_a(SHIELD_CAPACITY_TAG, this.maxShieldCapacity);
        }
    }

    public double getShieldCapacity(ItemStack armorStack) {
        this.ensureTagCompound(armorStack);
        NBTTagCompound tagCompound = CompatibilityProvider.compatibility.getTagCompound(armorStack);
        return tagCompound.func_74769_h(SHIELD_CAPACITY_TAG);
    }

    private void setShieldCapacity(ItemStack armorStack, double capacity) {
        this.ensureTagCompound(armorStack);
        NBTTagCompound tagCompound = CompatibilityProvider.compatibility.getTagCompound(armorStack);
        tagCompound.func_74780_a(SHIELD_CAPACITY_TAG, capacity);
    }

    private long getShieldHitTimestamp(ItemStack armorStack) {
        this.ensureTagCompound(armorStack);
        NBTTagCompound tagCompound = CompatibilityProvider.compatibility.getTagCompound(armorStack);
        return tagCompound.func_74763_f(SHIELD_HIT_TIMESTAMP_TAG);
    }

    private void setShieldHitTimestamp(ItemStack armorStack, long timestamp) {
        CompatibilityProvider.compatibility.ensureTagCompound(armorStack);
        NBTTagCompound tagCompound = CompatibilityProvider.compatibility.getTagCompound(armorStack);
        tagCompound.func_74772_a(SHIELD_HIT_TIMESTAMP_TAG, timestamp);
    }

    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        return this.field_77879_b;
    }

    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
        if (this.maxShieldCapacity > 0.0) {
            double shieldCapacity = this.getShieldCapacity(stack) - (double)damage;
            if (shieldCapacity < 0.0) {
                shieldCapacity = 0.0;
            }
            this.setShieldCapacity(stack, shieldCapacity);
            this.setShieldHitTimestamp(stack, System.currentTimeMillis());
        } else {
            double absorb = (double)damage * ((double)this.field_77879_b / 25.0);
            int itemDamage = (int)(absorb / 25.0 < 1.0 ? 1.0 : absorb / 25.0);
            stack.func_77972_a(itemDamage, entity);
        }
    }

    public double getMaxShieldCapacity() {
        return this.maxShieldCapacity;
    }

    public double getShieldIndicatorPositionX() {
        return this.shieldIndicatorPositionX;
    }

    public double getShieldIndicatorPositionY() {
        return this.shieldIndicatorPositionY;
    }

    public double getShieldIndicatorWidth() {
        return this.shieldIndicatorWidth;
    }

    public double getShieldIndicatorHeight() {
        return this.shieldIndicatorHeight;
    }

    public static class Builder {
        private String modId;
        private String textureName;
        private String iconName;
        private ItemArmor.ArmorMaterial material;
        private String unlocalizedName;
        private ModelBiped bootsModel;
        private ModelBiped chestModel;
        private ModelBiped helmetModel;
        private String modelClassName;
        private String hudTextureName;
        private Map<ItemAttachment<CustomArmor>, CompatibleAttachment<CustomArmor>> compatibleAttachments = new HashMap<ItemAttachment<CustomArmor>, CompatibleAttachment<CustomArmor>>();
        private CreativeTabs creativeTab;
        private boolean nightVision;
        private boolean vignetteEnabled;
        private float exposureReductionFactor;
        private String breathingSound;
        private double maxShieldCapacity = 0.0;
        private long shieldRegenerationTimeout = 2000L;
        private double shieldRegenerationRate = 1.0;
        private double shieldIndicatorPositionX = 15.0;
        private double shieldIndicatorPositionY = 20.0;
        private double shieldIndicatorWidth = 100.0;
        private double shieldIndicatorHeight = 15.0;
        private String shieldIndicatorMaskTextureName;
        private String shieldIndicatorProgressBarTextureName;

        public Builder withModId(String modId) {
            this.modId = modId;
            return this;
        }

        public Builder withCreativeTab(CreativeTabs creativeTab) {
            this.creativeTab = creativeTab;
            return this;
        }

        public Builder withTextureName(String textureName) {
            this.textureName = textureName.toLowerCase();
            return this;
        }

        public Builder withMaterial(ItemArmor.ArmorMaterial material) {
            this.material = material;
            return this;
        }

        public Builder withUnlocalizedName(String unlocalizedName) {
            this.unlocalizedName = unlocalizedName;
            return this;
        }

        public Builder withModelClass(String modelClass) {
            this.modelClassName = modelClass;
            return this;
        }

        public Builder withHudTextureName(String hudTextureName) {
            this.hudTextureName = hudTextureName.toLowerCase();
            return this;
        }

        public Builder withNightVision(boolean nightVision) {
            this.nightVision = nightVision;
            this.vignetteEnabled = nightVision;
            return this;
        }

        public Builder withNightVision(boolean nightVision, boolean vignetteEnabled) {
            this.nightVision = nightVision;
            this.vignetteEnabled = vignetteEnabled;
            return this;
        }

        public Builder withExposureReductionFactor(float exposureReductionFactor) {
            this.exposureReductionFactor = exposureReductionFactor;
            return this;
        }

        public Builder withBreathingSound(String sound) {
            this.breathingSound = sound.toLowerCase();
            return this;
        }

        public Builder withCompatibleAttachment(AttachmentCategory category, ModelBase attachmentModel, String textureName, Consumer<ModelBase> positioner) {
            ItemAttachment item = new ItemAttachment(this.modId, category, attachmentModel, textureName, null);
            this.compatibleAttachments.put(item, new CompatibleAttachment(item, positioner));
            return this;
        }

        public Builder withShieldCapacity(double capacity) {
            this.maxShieldCapacity = capacity;
            return this;
        }

        public Builder withShieldRegenerationTimeout(long shieldRegenerationTimeout) {
            this.shieldRegenerationTimeout = shieldRegenerationTimeout;
            return this;
        }

        public Builder withShieldRegenerationRate(double shieldRegenerationRate) {
            this.shieldRegenerationRate = shieldRegenerationRate;
            return this;
        }

        public Builder withShieldIndicatorPosition(double x, double y, double width, double height) {
            this.shieldIndicatorPositionX = x;
            this.shieldIndicatorPositionY = y;
            this.shieldIndicatorWidth = width;
            this.shieldIndicatorHeight = height;
            return this;
        }

        public Builder withShieldIndicatorTexture(String shieldIndicatorMaskTextureName, String shieldIndicatorProgressBarTextureName) {
            this.shieldIndicatorMaskTextureName = shieldIndicatorMaskTextureName.toLowerCase();
            this.shieldIndicatorProgressBarTextureName = shieldIndicatorProgressBarTextureName.toLowerCase();
            return this;
        }

        public void build(boolean isClient) {
            if (isClient) {
                // empty if block
            }
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            String unlocalizedHelmetName = this.unlocalizedName + "_helmet";
            CustomArmor armorHelmet = new CustomArmor(this.modId, this.unlocalizedName, this.material, 4, CompatibleEntityEquipmentSlot.HEAD, unlocalizedHelmetName, this.textureName, this.chestModel, this.hudTextureName);
            if (this.creativeTab != null) {
                armorHelmet.func_77637_a(this.creativeTab);
            }
            armorHelmet.func_77655_b(unlocalizedHelmetName);
            CompatibilityProvider.compatibility.registerItem((Item)armorHelmet, unlocalizedHelmetName.toLowerCase());
            String unlocalizedChestName = this.unlocalizedName + "_chest";
            CustomArmor armorChest = new CustomArmor(this.modId, this.unlocalizedName, this.material, 4, CompatibleEntityEquipmentSlot.CHEST, unlocalizedChestName, this.textureName, this.chestModel, this.hudTextureName);
            if (this.creativeTab != null) {
                armorChest.func_77637_a(this.creativeTab);
            }
            armorChest.func_77655_b(unlocalizedChestName);
            CompatibilityProvider.compatibility.registerItem((Item)armorChest, unlocalizedChestName.toLowerCase());
            String unlocalizedBootsName = this.unlocalizedName + "_boots";
            CustomArmor armorBoots = new CustomArmor(this.modId, this.unlocalizedName, this.material, 4, CompatibleEntityEquipmentSlot.FEET, unlocalizedBootsName, this.textureName, this.bootsModel, this.hudTextureName);
            if (armorBoots != null) {
                armorBoots.func_77637_a(this.creativeTab);
            }
            armorBoots.func_77655_b(unlocalizedBootsName);
            CompatibilityProvider.compatibility.registerItem((Item)armorBoots, unlocalizedBootsName.toLowerCase());
            armorHelmet.maxShieldCapacity = this.maxShieldCapacity;
            armorHelmet.shieldRegenerationRate = this.shieldRegenerationRate;
            armorHelmet.shieldRegenerationTimeout = this.shieldRegenerationTimeout;
            armorHelmet.shieldIndicatorPositionX = this.shieldIndicatorPositionX;
            armorHelmet.shieldIndicatorPositionY = this.shieldIndicatorPositionY;
            armorHelmet.shieldIndicatorWidth = this.shieldIndicatorWidth;
            armorHelmet.shieldIndicatorHeight = this.shieldIndicatorHeight;
            armorHelmet.shieldIndicatorMaskTextureName = this.shieldIndicatorMaskTextureName;
            armorHelmet.shieldIndicatorProgressBarTextureName = this.shieldIndicatorProgressBarTextureName;
            armorBoots.maxShieldCapacity = this.maxShieldCapacity;
            armorBoots.shieldRegenerationRate = this.shieldRegenerationRate;
            armorBoots.shieldRegenerationTimeout = this.shieldRegenerationTimeout;
            armorBoots.shieldIndicatorPositionX = this.shieldIndicatorPositionX;
            armorBoots.shieldIndicatorPositionY = this.shieldIndicatorPositionY;
            armorBoots.shieldIndicatorWidth = this.shieldIndicatorWidth;
            armorBoots.shieldIndicatorHeight = this.shieldIndicatorHeight;
            armorBoots.shieldIndicatorMaskTextureName = this.shieldIndicatorMaskTextureName;
            armorBoots.shieldIndicatorProgressBarTextureName = this.shieldIndicatorProgressBarTextureName;
            armorChest.maxShieldCapacity = this.maxShieldCapacity;
            armorChest.shieldRegenerationRate = this.shieldRegenerationRate;
            armorChest.shieldRegenerationTimeout = this.shieldRegenerationTimeout;
            armorChest.shieldIndicatorPositionX = this.shieldIndicatorPositionX;
            armorChest.shieldIndicatorPositionY = this.shieldIndicatorPositionY;
            armorChest.shieldIndicatorWidth = this.shieldIndicatorWidth;
            armorChest.shieldIndicatorHeight = this.shieldIndicatorHeight;
            armorChest.shieldIndicatorMaskTextureName = this.shieldIndicatorMaskTextureName;
            armorChest.shieldIndicatorProgressBarTextureName = this.shieldIndicatorProgressBarTextureName;
        }

        public CustomArmor buildHelmet(ModContext context) {
            if (context.isClient() && this.helmetModel == null) {
                this.helmetModel = HelmetModelFactory.create(this.modelClassName);
            }
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            String unlocalizedHelmetName = this.unlocalizedName + "_helmet";
            CustomArmor armorHelmet = new CustomArmor(this.modId, this.unlocalizedName, this.material, 4, CompatibleEntityEquipmentSlot.HEAD, unlocalizedHelmetName, this.textureName, this.helmetModel, this.hudTextureName);
            armorHelmet.hasNightVision = this.nightVision;
            armorHelmet.vignetteEnabled = this.vignetteEnabled;
            armorHelmet.exposureReductionFactor = this.exposureReductionFactor;
            armorHelmet.func_77655_b(unlocalizedHelmetName);
            armorHelmet.breathingSound = context.registerSound(this.breathingSound);
            CompatibilityProvider.compatibility.registerItem((Item)armorHelmet, unlocalizedHelmetName.toLowerCase());
            if (this.creativeTab != null) {
                armorHelmet.func_77637_a(this.creativeTab);
            }
            return armorHelmet;
        }

        public CustomArmor buildChest(boolean isClient) {
            if (isClient && this.chestModel == null) {
                this.chestModel = ChestModelFactory.createModel(this.modelClassName);
            }
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            String unlocalizedChestName = this.unlocalizedName + "_chest";
            CustomArmor armorChest = new CustomArmor(this.modId, this.unlocalizedName, this.material, 4, CompatibleEntityEquipmentSlot.CHEST, unlocalizedChestName, this.textureName, this.chestModel, this.hudTextureName);
            if (this.creativeTab != null) {
                armorChest.func_77637_a(this.creativeTab);
            }
            armorChest.func_77655_b(unlocalizedChestName);
            CompatibilityProvider.compatibility.registerItem((Item)armorChest, unlocalizedChestName.toLowerCase());
            armorChest.maxShieldCapacity = this.maxShieldCapacity;
            armorChest.shieldRegenerationRate = this.shieldRegenerationRate;
            armorChest.shieldRegenerationTimeout = this.shieldRegenerationTimeout;
            armorChest.shieldIndicatorPositionX = this.shieldIndicatorPositionX;
            armorChest.shieldIndicatorPositionY = this.shieldIndicatorPositionY;
            armorChest.shieldIndicatorWidth = this.shieldIndicatorWidth;
            armorChest.shieldIndicatorHeight = this.shieldIndicatorHeight;
            armorChest.shieldIndicatorMaskTextureName = this.shieldIndicatorMaskTextureName;
            armorChest.shieldIndicatorProgressBarTextureName = this.shieldIndicatorProgressBarTextureName;
            return armorChest;
        }

        public CustomArmor buildBoots(boolean isClient) {
            if (isClient && this.bootsModel == null) {
                this.bootsModel = BootsModelFactory.createModel(this.modelClassName);
            }
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            String unlocalizedBootsName = this.unlocalizedName + "_boots";
            CustomArmor armorBoots = new CustomArmor(this.modId, this.unlocalizedName, this.material, 4, CompatibleEntityEquipmentSlot.FEET, unlocalizedBootsName, this.textureName, this.bootsModel, this.hudTextureName);
            if (this.creativeTab != null) {
                armorBoots.func_77637_a(this.creativeTab);
            }
            armorBoots.func_77655_b(unlocalizedBootsName);
            CompatibilityProvider.compatibility.registerItem((Item)armorBoots, unlocalizedBootsName.toLowerCase());
            return armorBoots;
        }

        private static final class BootsModelFactory {
            private BootsModelFactory() {
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            private static ModelBiped createModel(String modelClassName) {
                ModelBiped bootsModel = null;
                try {
                    Class<?> modelClass = Class.forName(modelClassName);
                    if (ModelBiped.class.isAssignableFrom(modelClass)) {
                        return (ModelBiped)modelClass.newInstance();
                    }
                    if (!ModelBase.class.isAssignableFrom(modelClass)) return bootsModel;
                }
                catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    throw new IllegalStateException("Missing boots model", e);
                }
                return bootsModel;
            }
        }

        private static class HelmetModelFactory {
            private HelmetModelFactory() {
            }

            private static ModelBiped create(String modelClassName) {
                ModelBiped helmetModel = null;
                try {
                    final Class<?> modelClass = Class.forName(modelClassName);
                    if (ModelBiped.class.isAssignableFrom(modelClass)) {
                        helmetModel = (ModelBiped)modelClass.newInstance();
                    } else if (ModelBase.class.isAssignableFrom(modelClass)) {
                        helmetModel = new ModelBiped(){
                            {
                                this.field_78116_c = new ModelBaseRendererWrapper((WrappableModel)((Object)modelClass.newInstance()));
                                this.field_178720_f.field_78807_k = true;
                            }
                        };
                    }
                }
                catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    throw new IllegalStateException("Missing helmet model", e);
                }
                return helmetModel;
            }
        }

        private static class ChestModelFactory {
            private ChestModelFactory() {
            }

            private static ModelBiped createModel(String modelClassName) {
                try {
                    return (ModelBiped)Class.forName(modelClassName).newInstance();
                }
                catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    throw new IllegalStateException("Missing chest model", e);
                }
            }
        }
    }
}


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
 */
package com.vicmatskiv.weaponlib.grenade;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.AttachmentContainer;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerItemInstanceFactory;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Updatable;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItem;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import com.vicmatskiv.weaponlib.crafting.OptionsMetadata;
import com.vicmatskiv.weaponlib.grenade.GrenadeRenderer;
import com.vicmatskiv.weaponlib.grenade.GrenadeState;
import com.vicmatskiv.weaponlib.grenade.PlayerGrenadeInstance;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGrenade
extends CompatibleItem
implements PlayerItemInstanceFactory<PlayerGrenadeInstance, GrenadeState>,
AttachmentContainer,
Updatable {
    public static final int DEFAULT_FUSE_TIMEOUT = 3000;
    public static final float DEFAULT_EXPLOSION_STRENTH = 2.0f;
    public static final int EXPLODE_ON_IMPACT = -1;
    public static final float DEFAULT_GRAVITY_VELOCITY = 0.06f;
    public static final float DEFAULT_FAR_VELOCITY = 1.3f;
    public static final float DEFAULT_VELOCITY = 1.0f;
    public static final float DEFAULT_ROTATION_SLOWDOWN_FACTOR = 0.99f;
    public static final float DEFAULT_EFFECTIVE_RADIUS = 20.0f;
    public static final float DEFAULT_FRAGMENT_DAMAGE = 15.0f;
    public static final int DEFAULT_FRAGMENT_COUNT = 100;
    Builder builder;
    private ModContext modContext;
    private CompatibleSound bounceHardSound;
    private CompatibleSound bounceSoftSound;
    private CompatibleSound explosionSound;
    private CompatibleSound safetyPinOffSound;
    private CompatibleSound throwSound;
    private CompatibleSound stopAfterThrowingSound;

    public ItemGrenade(Builder builder, ModContext modContext) {
        this.builder = builder;
        this.modContext = modContext;
        this.field_77777_bU = 16;
    }

    public GrenadeRenderer getRenderer() {
        return this.builder.renderer;
    }

    public String getTextureName() {
        return this.builder.textureNames.get(0);
    }

    public boolean hasSafetyPin() {
        return this.builder.explosionTimeout > 0;
    }

    @Override
    public List<CompatibleAttachment<? extends AttachmentContainer>> getActiveAttachments(EntityLivingBase player, ItemStack itemStack) {
        return new ArrayList<CompatibleAttachment<? extends AttachmentContainer>>(this.builder.compatibleAttachments.values());
    }

    Map<ItemAttachment<ItemGrenade>, CompatibleAttachment<ItemGrenade>> getCompatibleAttachments() {
        return this.builder.compatibleAttachments;
    }

    public String getName() {
        return this.builder.name;
    }

    @Override
    public PlayerGrenadeInstance createItemInstance(EntityLivingBase player, ItemStack itemStack, int slot) {
        PlayerGrenadeInstance instance = new PlayerGrenadeInstance(slot, player, itemStack);
        instance.setState(GrenadeState.READY);
        return instance;
    }

    public void attack(EntityPlayer player, boolean throwingFar) {
        this.modContext.getGrenadeAttackAspect().onAttackButtonClick(player, throwingFar);
    }

    public void attackUp(EntityPlayer player, boolean throwingFar) {
        this.modContext.getGrenadeAttackAspect().onAttackButtonUp(player, throwingFar);
    }

    @Override
    public void update(EntityPlayer player) {
        this.modContext.getGrenadeAttackAspect().onUpdate(player);
    }

    public float getExplosionStrength() {
        return this.builder.explosionStrength;
    }

    public int getExplosionTimeout() {
        return this.builder.explosionTimeout;
    }

    public long getThrowTimeout() {
        return 200L;
    }

    public long getTotalTakeSafetyPinOffDuration() {
        return this.builder.renderer.getTotalTakingSafetyPinOffDuration();
    }

    public long getReequipTimeout() {
        return 800L;
    }

    public double getTotalThrowingDuration() {
        return this.builder.renderer.getTotalThrowingDuration();
    }

    public float getVelocity() {
        return ((Float)this.builder.velocity.get()).floatValue();
    }

    public float getFarVelocity() {
        return ((Float)this.builder.farVelocity.get()).floatValue();
    }

    public float getGravityVelocity() {
        return ((Float)this.builder.gravityVelocity.get()).floatValue();
    }

    public float getRotationSlowdownFactor() {
        return ((Float)this.builder.rotationSlowdownFactor.get()).floatValue();
    }

    public CompatibleSound getBounceHardSound() {
        return this.bounceHardSound;
    }

    public CompatibleSound getBounceSoftSound() {
        return this.bounceSoftSound;
    }

    public CompatibleSound getExplosionSound() {
        return this.explosionSound;
    }

    public CompatibleSound getSafetyPinOffSound() {
        return this.safetyPinOffSound;
    }

    public CompatibleSound getThrowSound() {
        return this.throwSound;
    }

    public CompatibleSound getStopAfterThrowingSound() {
        return this.stopAfterThrowingSound;
    }

    public float getEffectiveRadius() {
        return this.builder.effectiveRadius;
    }

    public float getFragmentDamage() {
        return this.builder.fragmentDamage;
    }

    public int getFragmentCount() {
        return this.builder.fragmentCount;
    }

    public boolean isDestroyingBlocks() {
        return this.builder.isDestroyingBlocks;
    }

    public Type getType() {
        return this.builder.type;
    }

    public long getActiveDuration() {
        return this.builder.activeDuration;
    }

    @Override
    public Collection<CompatibleAttachment<? extends AttachmentContainer>> getCompatibleAttachments(AttachmentCategory ... categories) {
        Collection<CompatibleAttachment<ItemGrenade>> c = this.builder.compatibleAttachments.values();
        List<AttachmentCategory> inputCategoryList = Arrays.asList(categories);
        return c.stream().filter(e -> inputCategoryList.contains(e)).collect(Collectors.toList());
    }

    public static class Builder {
        protected String name;
        protected String modId;
        protected ModelBase model;
        protected String textureName;
        protected Consumer<ItemStack> entityPositioning;
        protected Consumer<ItemStack> inventoryPositioning;
        protected BiConsumer<EntityLivingBase, ItemStack> thirdPersonPositioning;
        protected BiConsumer<EntityLivingBase, ItemStack> firstPersonPositioning;
        protected BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> inventoryModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> entityModelPositioning;
        protected Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
        protected Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;
        protected Map<ItemAttachment<ItemGrenade>, CompatibleAttachment<ItemGrenade>> compatibleAttachments = new HashMap<ItemAttachment<ItemGrenade>, CompatibleAttachment<ItemGrenade>>();
        private Supplier<Float> velocity = () -> Float.valueOf(1.0f);
        private Supplier<Float> farVelocity = () -> Float.valueOf(1.3f);
        private Supplier<Float> gravityVelocity = () -> Float.valueOf(0.06f);
        private int maxStackSize = 1;
        private int explosionTimeout = 3000;
        private float explosionStrength = 2.0f;
        protected CreativeTabs tab;
        private CraftingComplexity craftingComplexity;
        private Object[] craftingMaterials;
        private int craftingCount = 1;
        private GrenadeRenderer renderer;
        List<String> textureNames = new ArrayList<String>();
        private Supplier<Float> rotationSlowdownFactor = () -> Float.valueOf(0.99f);
        private String bounceHardSound;
        private String bounceSoftSound;
        private String explosionSound;
        private String safetyPinOffSound;
        private String stopAfterThrowingSound;
        private String throwSound;
        private float effectiveRadius = 20.0f;
        private float fragmentDamage = 15.0f;
        private int fragmentCount = 100;
        private Type type = Type.REGULAR;
        private long activeDuration;
        private Object[] craftingRecipe;
        private boolean isDestroyingBlocks = true;

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

        public Builder withVelocity(Supplier<Float> velocity) {
            this.velocity = velocity;
            return this;
        }

        public Builder withFarVelocity(Supplier<Float> farVelocity) {
            this.farVelocity = farVelocity;
            return this;
        }

        public Builder withGravityVelocity(Supplier<Float> gravityVelocity) {
            this.gravityVelocity = gravityVelocity;
            return this;
        }

        public Builder withRotationSlowdownFactor(Supplier<Float> rotationSlowdownFactor) {
            this.rotationSlowdownFactor = rotationSlowdownFactor;
            return this;
        }

        public Builder withExplosionStrength(float explosionStrength) {
            this.explosionStrength = explosionStrength;
            return this;
        }

        public Builder withExplosionTimeout(int explosionTimeout) {
            this.explosionTimeout = explosionTimeout;
            return this;
        }

        public Builder withExplosionOnImpact() {
            this.explosionTimeout = -1;
            return this;
        }

        public Builder withDestroyingBlocks(boolean isDestroyingBlocks) {
            this.isDestroyingBlocks = isDestroyingBlocks;
            return this;
        }

        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder withTextureNames(String ... textureNames) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            for (String textureName : textureNames) {
                this.textureNames.add(textureName.toLowerCase() + ".png");
            }
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<ItemGrenade> attachment, BiConsumer<EntityLivingBase, ItemStack> positioning) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<ItemGrenade>(attachment, positioning, null, true));
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

        public Builder withThirdPersonPositioning(BiConsumer<EntityLivingBase, ItemStack> thirdPersonPositioning) {
            this.thirdPersonPositioning = thirdPersonPositioning;
            return this;
        }

        public Builder withFirstPersonPositioning(BiConsumer<EntityLivingBase, ItemStack> firstPersonPositioning) {
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

        public Builder withRenderer(GrenadeRenderer renderer) {
            this.renderer = renderer;
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

        public Builder withCraftingRecipe(Object ... craftingRecipe) {
            this.craftingRecipe = craftingRecipe;
            return this;
        }

        public Builder withBounceHardSound(String sound) {
            this.bounceHardSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withBounceSoftSound(String sound) {
            this.bounceSoftSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withExplosionSound(String sound) {
            this.explosionSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withSafetyPinOffSound(String sound) {
            this.safetyPinOffSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withThrowSound(String sound) {
            this.throwSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withStopAfterThrowingSond(String sound) {
            this.stopAfterThrowingSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withEffectiveRadius(float effectiveRadius) {
            this.effectiveRadius = effectiveRadius;
            return this;
        }

        public Builder withFragmentDamage(float fragmentDamage) {
            this.fragmentDamage = fragmentDamage;
            return this;
        }

        public Builder withFragmentCount(int fragmentCount) {
            this.fragmentCount = fragmentCount;
            return this;
        }

        public Builder withActiveDuration(long duration) {
            this.activeDuration = duration;
            return this;
        }

        public ItemGrenade build(ModContext modContext) {
            ItemGrenade grenade = new ItemGrenade(this, modContext);
            grenade.func_77655_b(this.modId + "_" + this.name);
            grenade.func_77637_a(this.tab);
            grenade.field_77777_bU = this.maxStackSize;
            if (this.bounceHardSound != null) {
                grenade.bounceHardSound = modContext.registerSound(this.bounceHardSound);
            }
            if (this.bounceSoftSound != null) {
                grenade.bounceSoftSound = modContext.registerSound(this.bounceSoftSound);
            }
            if (this.explosionSound != null) {
                grenade.explosionSound = modContext.registerSound(this.explosionSound);
            }
            if (this.safetyPinOffSound != null) {
                grenade.safetyPinOffSound = modContext.registerSound(this.safetyPinOffSound);
            }
            if (this.throwSound != null) {
                grenade.throwSound = modContext.registerSound(this.throwSound);
            }
            if (this.stopAfterThrowingSound != null) {
                grenade.stopAfterThrowingSound = modContext.registerSound(this.stopAfterThrowingSound);
            }
            modContext.registerGrenadeWeapon(this.name, grenade, this.renderer);
            if (this.craftingRecipe != null && this.craftingRecipe.length >= 2) {
                ItemStack itemStack = new ItemStack((Item)grenade);
                List<Object> registeredRecipe = modContext.getRecipeManager().registerShapedRecipe(grenade, this.craftingRecipe);
                boolean hasOres = Arrays.stream(this.craftingRecipe).anyMatch(r -> r instanceof String);
                if (hasOres) {
                    CompatibilityProvider.compatibility.addShapedOreRecipe(itemStack, registeredRecipe.toArray());
                } else {
                    CompatibilityProvider.compatibility.addShapedRecipe(itemStack, registeredRecipe.toArray());
                }
            } else if (this.craftingComplexity != null) {
                OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder().withSlotCount(9).build(this.craftingComplexity, Arrays.copyOf(this.craftingMaterials, this.craftingMaterials.length));
                List<Object> shape = modContext.getRecipeManager().createShapedRecipe(grenade, this.name, optionsMetadata);
                ItemStack itemStack = new ItemStack((Item)grenade);
                CompatibilityProvider.compatibility.setStackSize(itemStack, this.craftingCount);
                if (optionsMetadata.hasOres()) {
                    CompatibilityProvider.compatibility.addShapedOreRecipe(itemStack, shape.toArray());
                } else {
                    CompatibilityProvider.compatibility.addShapedRecipe(itemStack, shape.toArray());
                }
            } else {
                System.err.println("!!!No recipe defined for grenade " + this.name);
            }
            return grenade;
        }

        static String addFileExtension(String s, String ext) {
            return s != null && !s.endsWith(ext) ? s + ext : s;
        }

        protected static String stripFileExtension(String str, String extension) {
            return str.endsWith(extension) ? str.substring(0, str.length() - extension.length()) : str;
        }
    }

    public static enum Type {
        REGULAR,
        SMOKE,
        GAS,
        FLASH;

    }
}


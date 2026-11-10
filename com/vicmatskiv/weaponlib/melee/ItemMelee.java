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
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.melee;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.AttachmentContainer;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.ImpactHandler;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.Modifiable;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.PlayerItemInstanceFactory;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.Updatable;
import com.vicmatskiv.weaponlib.WeaponSpawnEntity;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItem;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import com.vicmatskiv.weaponlib.crafting.OptionsMetadata;
import com.vicmatskiv.weaponlib.melee.MeleeAttachmentAspect;
import com.vicmatskiv.weaponlib.melee.MeleeRenderer;
import com.vicmatskiv.weaponlib.melee.MeleeSkin;
import com.vicmatskiv.weaponlib.melee.MeleeState;
import com.vicmatskiv.weaponlib.melee.PlayerMeleeInstance;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ItemMelee
extends CompatibleItem
implements PlayerItemInstanceFactory<PlayerMeleeInstance, MeleeState>,
AttachmentContainer,
Modifiable,
Updatable {
    private static final Logger logger = LogManager.getLogger(ItemMelee.class);
    static final long MAX_RELOAD_TIMEOUT_TICKS = 60L;
    static final long MAX_UNLOAD_TIMEOUT_TICKS = 60L;
    Builder builder;
    private ModContext modContext;
    private CompatibleSound attackSound;
    private CompatibleSound silencedShootSound;
    private CompatibleSound heavyAttackSound;
    private CompatibleSound unloadSound;
    private CompatibleSound ejectSpentRoundSound;

    ItemMelee(Builder builder, ModContext modContext) {
        this.builder = builder;
        this.modContext = modContext;
        this.func_77625_d(1);
    }

    public String getName() {
        return this.builder.name;
    }

    public CompatibleSound getShootSound() {
        return this.attackSound;
    }

    public CompatibleSound getSilencedShootSound() {
        return this.silencedShootSound;
    }

    public CompatibleSound getReloadSound() {
        return this.heavyAttackSound;
    }

    public CompatibleSound getUnloadSound() {
        return this.unloadSound;
    }

    public CompatibleSound getEjectSpentRoundSound() {
        return this.ejectSpentRoundSound;
    }

    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack itemStack) {
        return true;
    }

    public void func_77663_a(ItemStack itemStack, World world, Entity entity, int p_77663_4_, boolean active) {
    }

    Map<ItemAttachment<ItemMelee>, CompatibleAttachment<ItemMelee>> getCompatibleAttachments() {
        return this.builder.compatibleAttachments;
    }

    public static boolean isActiveAttachment(PlayerMeleeInstance weaponInstance, ItemAttachment<ItemMelee> attachment) {
        return weaponInstance != null ? MeleeAttachmentAspect.isActiveAttachment(attachment, weaponInstance) : false;
    }

    public int func_77626_a(ItemStack itemStack) {
        return 0;
    }

    @Override
    public List<CompatibleAttachment<? extends AttachmentContainer>> getActiveAttachments(EntityLivingBase player, ItemStack itemStack) {
        return this.modContext.getMeleeAttachmentAspect().getActiveAttachments(player, itemStack);
    }

    public MeleeRenderer getRenderer() {
        return this.builder.renderer;
    }

    List<ItemAttachment<ItemMelee>> getCompatibleAttachments(Class<? extends ItemAttachment<ItemMelee>> target) {
        return this.builder.compatibleAttachments.entrySet().stream().filter(e -> target.isInstance(e.getKey())).map(e -> (ItemAttachment)e.getKey()).collect(Collectors.toList());
    }

    @Override
    public void addInformation(ItemStack itemStack, List<String> info, boolean flag) {
        if (info != null && this.builder.informationProvider != null) {
            info.addAll((Collection)this.builder.informationProvider.apply(itemStack));
        }
    }

    @Override
    public void update(EntityPlayer player) {
        this.modContext.getMeleeAttackAspect().onUpdate(player);
        this.modContext.getMeleeAttachmentAspect().onUpdate(player);
    }

    @Override
    public PlayerMeleeInstance createItemInstance(EntityLivingBase player, ItemStack itemStack, int slot) {
        PlayerMeleeInstance instance = new PlayerMeleeInstance(slot, player, itemStack);
        instance.setState(MeleeState.READY);
        for (CompatibleAttachment<ItemMelee> compatibleAttachment : ((ItemMelee)itemStack.func_77973_b()).getCompatibleAttachments().values()) {
            ItemAttachment<ItemMelee> attachment = compatibleAttachment.getAttachment();
            if (!compatibleAttachment.isDefault() || attachment.getApply3() == null) continue;
            attachment.getApply3().apply(attachment, instance);
        }
        return instance;
    }

    @Override
    public void toggleClientAttachmentSelectionMode(EntityPlayer player) {
        this.modContext.getMeleeAttachmentAspect().toggleClientAttachmentSelectionMode(player);
    }

    public String getTextureName() {
        return this.builder.textureNames.get(0);
    }

    public ItemAttachment.ApplyHandler2<ItemMelee> getEquivalentHandler(AttachmentCategory attachmentCategory) {
        return null;
    }

    public void attack(EntityPlayer player, boolean heavy) {
        if (heavy) {
            this.modContext.getMeleeAttackAspect().onAttackButtonClick(player);
        } else {
            this.modContext.getMeleeAttackAspect().onHeavyAttackButtonClick(player);
        }
    }

    public boolean func_77644_a(ItemStack stack, EntityLivingBase target, EntityLivingBase player) {
        PlayerItemInstance<?> instance = Tags.getInstance(stack);
        if (instance instanceof PlayerMeleeInstance) {
            logger.debug("Player {} hits {} with {} in state {}", (Object)player, (Object)target, instance, instance.getState());
        }
        return true;
    }

    public float getDamage(boolean isHeavyAttack) {
        return isHeavyAttack ? this.builder.heavyAttackDamage : this.builder.attackDamage;
    }

    public long getPrepareStubTimeout() {
        return this.builder.prepareStubTimeout.get().intValue();
    }

    public long getPrepareHeavyStubTimeout() {
        return this.builder.prepareHeavyStubTimeout.get().intValue();
    }

    public long getAttackCooldownTimeout() {
        return this.builder.attackCooldownTimeout.get().intValue();
    }

    public long getHeavyAttackCooldownTimeout() {
        return this.builder.heavyAttackCooldownTimeout.get().intValue();
    }

    public CompatibleSound getHeavyAtackSound() {
        return this.heavyAttackSound;
    }

    public CompatibleSound getLightAtackSound() {
        return this.attackSound;
    }

    @Override
    public Collection<CompatibleAttachment<? extends AttachmentContainer>> getCompatibleAttachments(AttachmentCategory ... categories) {
        Collection<CompatibleAttachment<ItemMelee>> c = this.builder.compatibleAttachments.values();
        List<AttachmentCategory> inputCategoryList = Arrays.asList(categories);
        return c.stream().filter(e -> inputCategoryList.contains(e)).collect(Collectors.toList());
    }

    public static enum State {
        READY,
        SHOOTING,
        RELOAD_REQUESTED,
        RELOAD_CONFIRMED,
        UNLOAD_STARTED,
        UNLOAD_REQUESTED_FROM_SERVER,
        UNLOAD_CONFIRMED,
        PAUSED,
        MODIFYING,
        EJECT_SPENT_ROUND;

    }

    public static class Builder {
        private static final int DEFAULT_PREPARE_STUB_TIMEOUT = 100;
        private static final int DEFAULT_ATTACK_COOLDOWN_TIMEOUT = 500;
        private static final int DEFAULT_HEAVY_ATTACK_COOLDOWN_TIMEOUT = 1000;
        String name;
        List<String> textureNames = new ArrayList<String>();
        private String attackSound;
        private String heavyAttackSound;
        private CreativeTabs creativeTab;
        private MeleeRenderer renderer;
        private String modId;
        Map<ItemAttachment<ItemMelee>, CompatibleAttachment<ItemMelee>> compatibleAttachments = new HashMap<ItemAttachment<ItemMelee>, CompatibleAttachment<ItemMelee>>();
        private Class<? extends WeaponSpawnEntity> spawnEntityClass;
        ImpactHandler blockImpactHandler;
        private Function<ItemStack, List<String>> informationProvider;
        private CraftingComplexity craftingComplexity;
        private Object[] craftingMaterials;
        public float attackDamage = 1.0f;
        public float heavyAttackDamage = 2.0f;
        public Supplier<Integer> prepareStubTimeout = () -> 100;
        public Supplier<Integer> prepareHeavyStubTimeout = () -> 100;
        public Supplier<Integer> attackCooldownTimeout = () -> 500;
        public Supplier<Integer> heavyAttackCooldownTimeout = () -> 1000;
        private Object[] craftingRecipe;

        public Builder withModId(String modId) {
            this.modId = modId;
            return this;
        }

        public Builder withInformationProvider(Function<ItemStack, List<String>> informationProvider) {
            this.informationProvider = informationProvider;
            return this;
        }

        public Builder withPrepareStubTimeout(Supplier<Integer> prepareStubTimeout) {
            this.prepareStubTimeout = prepareStubTimeout;
            return this;
        }

        public Builder withPrepareHeavyStubTimeout(Supplier<Integer> prepareHeavyStubTimeout) {
            this.prepareHeavyStubTimeout = prepareHeavyStubTimeout;
            return this;
        }

        public Builder withAttackCooldownTimeout(Supplier<Integer> attackCooldownTimeout) {
            this.attackCooldownTimeout = attackCooldownTimeout;
            return this;
        }

        public Builder withHeavyAttackCooldownTimeout(Supplier<Integer> heavyAttackCooldownTimeout) {
            this.heavyAttackCooldownTimeout = heavyAttackCooldownTimeout;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAttackDamage(float attackDamage) {
            this.attackDamage = attackDamage;
            return this;
        }

        public Builder withHeavyAttackDamage(float heavyAttackDamage) {
            this.heavyAttackDamage = heavyAttackDamage;
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

        public Builder withAttackSound(String attackSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.attackSound = attackSound.toLowerCase();
            return this;
        }

        public Builder withHeavyAttackSound(String heavyAttackSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.heavyAttackSound = heavyAttackSound.toLowerCase();
            return this;
        }

        public Builder withCreativeTab(CreativeTabs creativeTab) {
            this.creativeTab = creativeTab;
            return this;
        }

        public Builder withRenderer(MeleeRenderer renderer) {
            this.renderer = renderer;
            return this;
        }

        public Builder withCompatibleSkin(MeleeSkin skin, String activeTextureName) {
            this.withCompatibleAttachment((ItemAttachment<ItemMelee>)skin, (a, i) -> i.setActiveTextureIndex(skin.getTextureVariantIndex(activeTextureName.toLowerCase())), (ItemAttachment<ItemMelee> a, PlayerMeleeInstance i) -> {});
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<ItemMelee> attachment, ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> applyHandler, ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> removeHandler) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<ItemMelee>(attachment, applyHandler, removeHandler));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<ItemMelee> attachment, BiConsumer<EntityLivingBase, ItemStack> positioning) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<ItemMelee>(attachment, positioning, null, false));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<ItemMelee> attachment, boolean isDefault, BiConsumer<EntityLivingBase, ItemStack> positioning, Consumer<ModelBase> modelPositioning) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<ItemMelee>(attachment, positioning, modelPositioning, isDefault));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<ItemMelee> attachment, boolean isDefault, Consumer<ModelBase> positioner) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<ItemMelee>(attachment, positioner, isDefault));
            return this;
        }

        public Builder withCrafting(CraftingComplexity craftingComplexity, Object ... craftingMaterials) {
            if (craftingComplexity == null) {
                throw new IllegalArgumentException("Crafting complexity not set");
            }
            if (craftingMaterials.length < 2) {
                throw new IllegalArgumentException("2 or more materials required for crafting");
            }
            this.craftingComplexity = craftingComplexity;
            this.craftingMaterials = craftingMaterials;
            return this;
        }

        public Builder withCraftingRecipe(Object ... craftingRecipe) {
            this.craftingRecipe = craftingRecipe;
            return this;
        }

        public ItemMelee build(ModContext modContext) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            if (this.name == null) {
                throw new IllegalStateException("Item name not provided");
            }
            if (this.heavyAttackSound == null) {
                this.heavyAttackSound = this.attackSound;
            }
            if (this.spawnEntityClass == null) {
                this.spawnEntityClass = WeaponSpawnEntity.class;
            }
            ItemMelee itemMelee = new ItemMelee(this, modContext);
            itemMelee.attackSound = this.attackSound != null ? modContext.registerSound(this.attackSound) : CompatibleSound.SNOWBALL_THROW;
            itemMelee.heavyAttackSound = this.heavyAttackSound != null ? modContext.registerSound(this.heavyAttackSound) : CompatibleSound.SNOWBALL_THROW;
            itemMelee.func_77637_a(this.creativeTab);
            itemMelee.func_77655_b(this.name);
            modContext.registerMeleeWeapon(this.name, itemMelee, this.renderer);
            if (this.craftingRecipe != null && this.craftingRecipe.length >= 2) {
                ItemStack itemStack = new ItemStack((Item)itemMelee);
                List<Object> registeredRecipe = modContext.getRecipeManager().registerShapedRecipe(itemMelee, this.craftingRecipe);
                boolean hasOres = Arrays.stream(this.craftingRecipe).anyMatch(r -> r instanceof String);
                if (hasOres) {
                    CompatibilityProvider.compatibility.addShapedOreRecipe(itemStack, registeredRecipe.toArray());
                } else {
                    CompatibilityProvider.compatibility.addShapedRecipe(itemStack, registeredRecipe.toArray());
                }
            } else if (this.craftingComplexity != null) {
                OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder().withSlotCount(9).build(this.craftingComplexity, Arrays.copyOf(this.craftingMaterials, this.craftingMaterials.length));
                List<Object> shape = modContext.getRecipeManager().createShapedRecipe(itemMelee, itemMelee.getName(), optionsMetadata);
                CompatibilityProvider.compatibility.addShapedRecipe(new ItemStack((Item)itemMelee), shape.toArray());
            } else {
                System.err.println("!!!No recipe defined for melee weapon " + this.name);
            }
            return itemMelee;
        }
    }
}


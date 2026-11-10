/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EnumCreatureAttribute
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAITasks
 *  net.minecraft.item.Item
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.EnumDifficulty
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.ai;

import com.vicmatskiv.weaponlib.CustomArmor;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.WeightedOptions;
import com.vicmatskiv.weaponlib.ai.CustomMobAttack;
import com.vicmatskiv.weaponlib.ai.EntityClassFactory;
import com.vicmatskiv.weaponlib.ai.RenderCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBiomeType;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.config.AIEntity;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumDifficulty;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityConfiguration {
    private static final Logger logger = LogManager.getLogger(EntityConfiguration.class);
    private static final int DEFAULT_TRACKING_RANGE = 64;
    private static final int DEFAULT_UPDATE_FREQUENCY = 3;
    private static final int DEFAULT_MAX_HEALTH = 20;
    private static final double DEFAULT_MAX_SPEED = 0.25;
    private static final double DEFAULT_FOLLOW_RANGE = 35.0;
    private static final double DEFAULT_COLLISION_ATTACK_DAMAGE = 3.0;
    private static final float DEFAULT_MAX_TOLERABLE_LIGHT_BRIGHTNESS = 1.0f;
    private static final float DEFAULT_PRIMARY_EQUIPMENT_DROP_CHANCE = 0.5f;
    private static final float DEFAULT_SECONDARY_EQUIPMENT_DROP_CHANCE = 0.25f;
    private static final float DEFAULT_ARMOR_DROP_CHANCE = 0.25f;
    private static final int DEFAULT_MAX_AMMO = 36000;
    private WeightedOptions<EnumDifficulty, Equipment> equipmentOptions;
    private WeightedOptions<EnumDifficulty, Equipment> secondaryEquipmentOptions;
    private List<AiTask> aiTasks;
    private List<AiTask> aiTargetTasks;
    private CompatibleSound ambientSound;
    private CompatibleSound hurtSound;
    private CompatibleSound deathSound;
    private CompatibleSound stepSound;
    private ResourceLocation lootTable;
    private double maxHealth;
    private Predicate<Entity> canSpawnHere;
    private Predicate<Entity> isValidLightLevel;
    private EnumCreatureAttribute creatureAttribute;
    private float maxTolerableLightBrightness;
    private double maxSpeed;
    private List<TexturedModel> texturedModelVariants;
    private double followRange;
    private double collisionAttackDamage;
    private boolean isPushable;
    private boolean isInvulnerable;
    private boolean isCollidable;
    private boolean isDespawnable;
    private Map<UUID, MissionOffering> missionOfferings;
    private Map<CompatibleEntityEquipmentSlot, CustomArmor> armor;
    private float primaryEquipmentDropChance;
    private float secondaryEquipmentDropChance;
    private float armorDropChance;
    private int maxAmmo;
    private CustomMobAttack collisionAttack;
    private CustomMobAttack delayedAttack;
    private List<String> dialogContent;
    private ResourceLocation introImage;
    private ResourceLocation dialogBackground;
    private ResourceLocation rewardsBackground;
    private ResourceLocation missionSelectionBackground;

    protected EntityConfiguration() {
    }

    public WeightedOptions<EnumDifficulty, Equipment> getEquipmentOptions() {
        return this.equipmentOptions;
    }

    public WeightedOptions<EnumDifficulty, Equipment> getSecondaryEquipmentOptions() {
        return this.secondaryEquipmentOptions;
    }

    public void addAiTasks(EntityLiving e, EntityAITasks tasks) {
        this.aiTasks.stream().forEach(t -> tasks.func_75776_a(t.priority, t.taskSupplier.apply(e)));
    }

    public void addAiTargetTasks(EntityLiving e, EntityAITasks tasks) {
        this.aiTargetTasks.stream().forEach(t -> tasks.func_75776_a(t.priority, t.taskSupplier.apply(e)));
    }

    public CompatibleSound getAmbientSound() {
        return this.ambientSound;
    }

    public CompatibleSound getHurtSound() {
        return this.hurtSound;
    }

    public CompatibleSound getDeathSound() {
        return this.deathSound;
    }

    public CompatibleSound getStepSound() {
        return this.stepSound;
    }

    public ResourceLocation getLootTable() {
        return this.lootTable;
    }

    public double getMaxHealth() {
        return this.maxHealth;
    }

    public Predicate<Entity> getCanSpawnHere() {
        return this.canSpawnHere;
    }

    public Predicate<Entity> isValidLightLevel() {
        return this.isValidLightLevel;
    }

    public EnumCreatureAttribute getCreatureAttribute() {
        return this.creatureAttribute;
    }

    public float getMaxTolerableLightBrightness() {
        return this.maxTolerableLightBrightness;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public double getFollowRange() {
        return this.followRange;
    }

    public List<TexturedModel> getTexturedModelVariants() {
        return this.texturedModelVariants;
    }

    public Collection<CustomArmor> getArmorSet() {
        return this.armor.values();
    }

    public float getPrimaryEquipmentDropChance() {
        return this.primaryEquipmentDropChance;
    }

    public float getSecondaryEquipmentDropChance() {
        return this.secondaryEquipmentDropChance;
    }

    public float getArmorDropChance() {
        return this.armorDropChance;
    }

    public int getMaxAmmo() {
        return this.maxAmmo;
    }

    public CustomMobAttack getCollisionAttack() {
        return this.collisionAttack;
    }

    public CustomMobAttack getDelayedAttack() {
        return this.delayedAttack;
    }

    public double getCollisionAttackDamage() {
        return this.collisionAttackDamage;
    }

    public boolean isPushable() {
        return this.isPushable;
    }

    public boolean isInvulnerable() {
        return this.isInvulnerable;
    }

    public boolean isCollidable() {
        return this.isCollidable;
    }

    public Map<UUID, MissionOffering> getMissionOfferings() {
        return this.missionOfferings;
    }

    public List<String> getDialogContent() {
        return this.dialogContent;
    }

    public ResourceLocation getIntroImage() {
        return this.introImage;
    }

    public ResourceLocation getDialogBackground() {
        return this.dialogBackground;
    }

    public ResourceLocation getRewardsBackground() {
        return this.rewardsBackground;
    }

    public ResourceLocation getMissionSelectionBackground() {
        return this.missionSelectionBackground;
    }

    public boolean isDespawnable() {
        return this.isDespawnable;
    }

    public static class Builder {
        private int trackingRange = 64;
        private int updateFrequency = 3;
        private boolean sendVelocityUpdates = true;
        private Supplier<Integer> entityIdSupplier;
        private Map<EquipmentKey, EquipmentValue> equipmentOptions = new HashMap<EquipmentKey, EquipmentValue>();
        private Map<EquipmentKey, EquipmentValue> secondaryEquipmentOptions = new HashMap<EquipmentKey, EquipmentValue>();
        private Class<? extends Entity> baseClass;
        private List<Spawn> spawns = new ArrayList<Spawn>();
        private List<AiTask> aiTasks = new ArrayList<AiTask>();
        private List<AiTask> aiTargetTasks = new ArrayList<AiTask>();
        private List<TexturedModel> texturedModelVariants = new ArrayList<TexturedModel>();
        private String name;
        private String ambientSound;
        private String hurtSound;
        private String deathSound;
        private String stepSound;
        private ResourceLocation lootTable;
        private Predicate<Entity> canSpawnHere;
        private Predicate<Entity> isValidLightLevel = e -> CompatibilityProvider.compatibility.world((Entity)e).field_73012_v.nextFloat() > 0.5f;
        private float maxTolerableLightBrightness = 1.0f;
        private EnumCreatureAttribute creatureAttribute = EnumCreatureAttribute.UNDEFINED;
        private double maxHealth = 20.0;
        private double maxSpeed = 0.25;
        private double followRange = 35.0;
        private double collisionAttackDamage = 3.0;
        private boolean spawnEgg;
        private int primaryEggColor;
        private int secondaryEggColor;
        private Map<CompatibleEntityEquipmentSlot, CustomArmor> armor = new HashMap<CompatibleEntityEquipmentSlot, CustomArmor>();
        private float primaryEquipmentDropChance = 0.5f;
        private float secondaryEquipmentDropChance = 0.25f;
        private float armorDropChance = 0.25f;
        private int maxAmmo = 36000;
        private CustomMobAttack collisionAttack;
        private CustomMobAttack delayedAttack;
        private boolean isPushable = true;
        private boolean isInvulnerable = false;
        private boolean isCollidable = true;
        private boolean isDespawnable = true;
        private List<MissionOffering> missionOfferings = new ArrayList<MissionOffering>();
        private List<String> introDialogs = new ArrayList<String>();
        private String introImage;
        private String dialogBackground;
        private String rewardsBackground;
        private String missionSelectionBackground;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withBaseClass(Class<? extends Entity> baseClass) {
            this.baseClass = baseClass;
            return this;
        }

        public Builder withCreatureAttribute(EnumCreatureAttribute creatureAttribute) {
            this.creatureAttribute = creatureAttribute;
            return this;
        }

        public Builder withMaxTolerableLightBrightness(float maxTolerableLightBrightness) {
            this.maxTolerableLightBrightness = maxTolerableLightBrightness;
            return this;
        }

        public Builder withEntityIdSupplier(Supplier<Integer> entityIdSupplier) {
            this.entityIdSupplier = entityIdSupplier;
            return this;
        }

        public Builder withEquipmentOption(Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?> ... attachments) {
            this.withEquipmentOption(this.equipmentOptions, item, difficultyLevel, weight, attachments);
            return this;
        }

        public Builder withSecondaryEquipmentOption(Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?> ... attachments) {
            this.withEquipmentOption(this.secondaryEquipmentOptions, item, difficultyLevel, weight, attachments);
            return this;
        }

        private Builder withEquipmentOption(Map<EquipmentKey, EquipmentValue> equipmentOptions, Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?> ... attachments) {
            if (item == null) {
                logger.warn("Attempted to configure entity equipment with null item");
                return this;
            }
            Equipment equipment = new Equipment();
            equipment.item = item;
            equipment.attachments = Arrays.asList(attachments);
            EnumDifficulty[] difficultyValues = EnumDifficulty.values();
            for (int i = difficultyLevel.ordinal(); i < difficultyValues.length; ++i) {
                equipmentOptions.put(new EquipmentKey(difficultyValues[i], equipment.item, attachments), new EquipmentValue(equipment, weight));
            }
            return this;
        }

        public Builder withPrimaryEquipmentDropChance(float chance) {
            this.primaryEquipmentDropChance = chance;
            return this;
        }

        public Builder withSecondaryEquipmentDropChance(float chance) {
            this.secondaryEquipmentDropChance = chance;
            return this;
        }

        public Builder withArmor(CustomArmor armor) {
            this.armor.put(armor.getCompatibleEquipmentSlot(), armor);
            return this;
        }

        public Builder withArmorDropChance(float chance) {
            this.armorDropChance = chance;
            return this;
        }

        public Builder withSpawn(int weightedProb, int min, int max, CompatibleBiomeType ... biomeTypes) {
            this.spawns.add(new Spawn(weightedProb, min, max, biomeTypes));
            return this;
        }

        public Builder withTexturedModelVariant(String modelClassName, String texture) {
            TexturedModel tm = new TexturedModel();
            tm.modelClassName = modelClassName;
            tm.textureName = texture;
            this.texturedModelVariants.add(tm);
            return this;
        }

        public Builder withAiTask(int priority, Function<EntityLiving, EntityAIBase> taskSupplier) {
            AiTask task = new AiTask();
            task.priority = priority;
            task.taskSupplier = taskSupplier;
            this.aiTasks.add(task);
            return this;
        }

        public Builder withAiTargetTask(int priority, Function<EntityLiving, EntityAIBase> taskSupplier) {
            AiTask task = new AiTask();
            task.priority = priority;
            task.taskSupplier = taskSupplier;
            this.aiTargetTasks.add(task);
            return this;
        }

        public Builder withAmbientSound(String sound) {
            this.ambientSound = sound.toLowerCase();
            return this;
        }

        public Builder withHurtSound(String sound) {
            this.hurtSound = sound.toLowerCase();
            return this;
        }

        public Builder withDeathSound(String sound) {
            this.deathSound = sound.toLowerCase();
            return this;
        }

        public Builder withStepSound(String sound) {
            this.stepSound = sound.toLowerCase();
            return this;
        }

        public Builder withLootTable(ResourceLocation lootTable) {
            this.lootTable = lootTable;
            return this;
        }

        public Builder withMaxHealth(double maxHealth) {
            this.maxHealth = maxHealth;
            return this;
        }

        public Builder withMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder withFollowRange(double followRange) {
            this.followRange = followRange;
            return this;
        }

        public Builder withCollisionAttackDamage(double collisionAttackDamage) {
            this.collisionAttackDamage = collisionAttackDamage;
            return this;
        }

        public Builder withSpawnLocationPredicate(Predicate<Entity> canSpawnHere) {
            this.canSpawnHere = canSpawnHere;
            return this;
        }

        public Builder withSpawnLightLevelPredicate(Predicate<Entity> isValidLightLevel) {
            this.isValidLightLevel = isValidLightLevel;
            return this;
        }

        public Builder withSpawnEgg(int primaryEggColor, int secondaryEggColor) {
            this.spawnEgg = true;
            this.primaryEggColor = primaryEggColor;
            this.secondaryEggColor = secondaryEggColor;
            return this;
        }

        public Builder withMaxAmmo(int maxAmmo) {
            this.maxAmmo = maxAmmo;
            return this;
        }

        public Builder withCollisionAttack(CustomMobAttack collisionAttack) {
            this.collisionAttack = collisionAttack;
            return this;
        }

        public Builder withDelayedAttack(CustomMobAttack delayedAttack) {
            this.delayedAttack = delayedAttack;
            return this;
        }

        public Builder withPushability(boolean isPushable) {
            this.isPushable = isPushable;
            return this;
        }

        public Builder withCollidability(boolean isCollidable) {
            this.isCollidable = isCollidable;
            return this;
        }

        public Builder withDespawnability(boolean isDespawnable) {
            this.isDespawnable = isDespawnable;
            return this;
        }

        public Builder withInvulnerability() {
            this.isInvulnerable = true;
            return this;
        }

        public Builder withIntroDialog(String dialog) {
            this.introDialogs.add(dialog);
            return this;
        }

        public Builder withIntroImage(String introImage) {
            this.introImage = introImage.toLowerCase();
            if (!this.introImage.endsWith(".png")) {
                this.introImage = this.introImage + ".png";
            }
            return this;
        }

        public Builder withDialogBackground(String dialogBackground) {
            this.dialogBackground = dialogBackground.toLowerCase();
            if (!this.dialogBackground.endsWith(".png")) {
                this.dialogBackground = this.dialogBackground + ".png";
            }
            return this;
        }

        public Builder withRewardsBackground(String rewardsBackground) {
            this.rewardsBackground = rewardsBackground.toLowerCase();
            if (!this.rewardsBackground.endsWith(".png")) {
                this.rewardsBackground = this.rewardsBackground + ".png";
            }
            return this;
        }

        public Builder withMissionSelectionBackground(String missionSelectionBackground) {
            this.missionSelectionBackground = missionSelectionBackground.toLowerCase();
            if (!this.missionSelectionBackground.endsWith(".png")) {
                this.missionSelectionBackground = this.missionSelectionBackground + ".png";
            }
            return this;
        }

        public void register(ModContext context) {
            EntityConfiguration configuration = new EntityConfiguration();
            configuration.creatureAttribute = this.creatureAttribute;
            configuration.aiTasks = this.aiTasks;
            configuration.aiTargetTasks = this.aiTargetTasks;
            configuration.collisionAttack = this.collisionAttack;
            configuration.delayedAttack = this.delayedAttack;
            int modEntityId = this.entityIdSupplier.get();
            String entityName = this.name != null ? this.name : this.baseClass.getSimpleName() + "Ext" + modEntityId;
            AIEntity entityConfig = context.getConfigurationManager().getAIEntity(entityName);
            WeightedOptions.Builder equipmentOptionsBuilder = new WeightedOptions.Builder();
            if (entityConfig == null || entityConfig.getEquipment().isEmpty()) {
                this.equipmentOptions.forEach((key, value) -> equipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight));
            } else {
                HashMap<EquipmentKey, EquipmentValue> equipmentOptions = new HashMap<EquipmentKey, EquipmentValue>();
                EnumDifficulty difficultyLevel = EnumDifficulty.EASY;
                EnumDifficulty[] difficultyValues = EnumDifficulty.values();
                entityConfig.getEquipment().forEach(ee -> {
                    Item equipmentItem = CompatibilityProvider.compatibility.findItemByName(context.getModId(), ee.getId());
                    if (equipmentItem != null) {
                        Equipment equipment = new Equipment();
                        equipment.item = equipmentItem;
                        equipment.attachments = ee.getAttachment().stream().map(a -> CompatibilityProvider.compatibility.findItemByName(context.getModId(), a.getId())).filter(e -> e instanceof ItemAttachment).map(a -> (ItemAttachment)a).collect(Collectors.toList());
                        for (int i = difficultyLevel.ordinal(); i < difficultyValues.length; ++i) {
                            equipmentOptions.put(new EquipmentKey(difficultyValues[i], equipment.item, equipment.attachments.toArray(new ItemAttachment[0])), new EquipmentValue(equipment, ee.getWeight().floatValue()));
                        }
                    } else {
                        logger.warn("Attempted to configure entity equipment with invalid item {}", (Object)ee.getId());
                    }
                });
                equipmentOptions.forEach((key, value) -> equipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight));
            }
            configuration.equipmentOptions = equipmentOptionsBuilder.build();
            WeightedOptions.Builder secondaryEquipmentOptionsBuilder = new WeightedOptions.Builder();
            this.secondaryEquipmentOptions.forEach((key, value) -> secondaryEquipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight));
            configuration.secondaryEquipmentOptions = secondaryEquipmentOptionsBuilder.build();
            configuration.ambientSound = context.registerSound(this.ambientSound);
            configuration.hurtSound = context.registerSound(this.hurtSound);
            configuration.deathSound = context.registerSound(this.deathSound);
            configuration.stepSound = context.registerSound(this.stepSound);
            configuration.lootTable = this.lootTable;
            configuration.maxHealth = entityConfig != null ? (double)entityConfig.getHealth().floatValue() * this.maxHealth : this.maxHealth;
            configuration.maxSpeed = this.maxSpeed;
            configuration.followRange = this.followRange;
            configuration.canSpawnHere = this.canSpawnHere;
            configuration.isValidLightLevel = this.isValidLightLevel;
            configuration.maxTolerableLightBrightness = this.maxTolerableLightBrightness;
            configuration.texturedModelVariants = this.texturedModelVariants;
            configuration.armor = this.armor;
            configuration.primaryEquipmentDropChance = this.primaryEquipmentDropChance;
            configuration.secondaryEquipmentDropChance = this.secondaryEquipmentDropChance;
            configuration.armorDropChance = this.armorDropChance;
            configuration.maxAmmo = this.maxAmmo;
            configuration.collisionAttackDamage = this.collisionAttackDamage;
            configuration.isPushable = this.isPushable;
            configuration.isInvulnerable = this.isInvulnerable;
            configuration.isCollidable = this.isCollidable;
            configuration.isDespawnable = this.isDespawnable;
            LinkedHashMap<UUID, MissionOffering> tmpMap = new LinkedHashMap<UUID, MissionOffering>();
            for (MissionOffering missionOffering : this.missionOfferings) {
                tmpMap.put(missionOffering.getId(), missionOffering);
            }
            configuration.missionOfferings = Collections.unmodifiableMap(tmpMap);
            configuration.dialogContent = Collections.unmodifiableList(this.introDialogs);
            if (this.introImage != null) {
                configuration.introImage = new ResourceLocation(context.getModId(), "textures/gui/" + this.introImage);
            }
            if (this.dialogBackground != null) {
                configuration.dialogBackground = new ResourceLocation(context.getModId(), "textures/gui/" + this.dialogBackground);
            }
            if (this.rewardsBackground != null) {
                configuration.rewardsBackground = new ResourceLocation(context.getModId(), "textures/gui/" + this.rewardsBackground);
            }
            if (this.missionSelectionBackground != null) {
                configuration.missionSelectionBackground = new ResourceLocation(context.getModId(), "textures/gui/" + this.missionSelectionBackground);
            }
            Class<? extends Entity> entityClass = EntityClassFactory.getInstance().generateEntitySubclass(this.baseClass, modEntityId, configuration);
            CompatibilityProvider.compatibility.registerModEntity(entityClass, entityName, modEntityId, context.getMod(), context.getModId(), this.trackingRange, this.updateFrequency, this.sendVelocityUpdates);
            if (this.spawnEgg) {
                CompatibilityProvider.compatibility.registerEgg(context, entityClass, entityName, this.primaryEggColor, this.secondaryEggColor);
            }
            for (Spawn spawn : this.spawns) {
                int weightedProb = entityConfig != null ? (int)(entityConfig.getSpawn().floatValue() * (float)spawn.weightedProb) : spawn.weightedProb;
                if (weightedProb <= 0) continue;
                CompatibilityProvider.compatibility.addSpawn(this.safeCast(entityClass), weightedProb, spawn.min, spawn.max, spawn.biomeTypes);
            }
            if (CompatibilityProvider.compatibility.isClientSide()) {
                for (TexturedModel tmv : this.texturedModelVariants) {
                    tmv.textureResource = new ResourceLocation(context.getModId(), "textures/entity/" + tmv.textureName);
                    try {
                        tmv.model = (ModelBiped)Class.forName(tmv.modelClassName).newInstance();
                    }
                    catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                        e.printStackTrace();
                    }
                }
                RendererRegistration.registerRenderableEntity(context, entityClass, this.texturedModelVariants);
            }
        }

        private Class<? extends EntityLiving> safeCast(Class<? extends Entity> entityClass) {
            return entityClass;
        }

        private static class RendererRegistration {
            private RendererRegistration() {
            }

            private static void registerRenderableEntity(ModContext context, Class<? extends Entity> entityClass, List<TexturedModel> texturedModelVariants) {
                try {
                    ModelBiped model = (ModelBiped)Class.forName(texturedModelVariants.get((int)0).modelClassName).newInstance();
                    context.registerRenderableEntity(entityClass, (Object)new RenderCustomMob(model));
                }
                catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }

        private static class EquipmentKey {
            EnumDifficulty difficulty;
            Item item;
            ItemAttachment<?>[] attachments;

            public EquipmentKey(EnumDifficulty difficulty, Item item, ItemAttachment<?>[] attachments) {
                this.difficulty = difficulty;
                this.item = item;
                this.attachments = attachments;
            }

            public int hashCode() {
                int prime = 31;
                int result = 1;
                result = 31 * result + Arrays.hashCode(this.attachments);
                result = 31 * result + (this.difficulty == null ? 0 : this.difficulty.hashCode());
                result = 31 * result + (this.item == null ? 0 : this.item.hashCode());
                return result;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (this.getClass() != obj.getClass()) {
                    return false;
                }
                EquipmentKey other = (EquipmentKey)obj;
                if (!Arrays.equals(this.attachments, other.attachments)) {
                    return false;
                }
                if (this.difficulty != other.difficulty) {
                    return false;
                }
                return !(this.item == null ? other.item != null : !this.item.equals(other.item));
            }
        }

        private static class EquipmentValue {
            Equipment equipment;
            float weight;

            public EquipmentValue(Equipment equipment, float weight) {
                this.equipment = equipment;
                this.weight = weight;
            }
        }

        private static class Spawn {
            int weightedProb;
            int min;
            int max;
            CompatibleBiomeType[] biomeTypes;

            public Spawn(int weightedProb, int min, int max, CompatibleBiomeType[] biomeTypes) {
                this.weightedProb = weightedProb;
                this.min = min;
                this.max = max;
                this.biomeTypes = biomeTypes;
            }
        }
    }

    static class TexturedModel {
        String modelClassName;
        ModelBiped model;
        private String textureName;
        ResourceLocation textureResource;

        TexturedModel() {
        }
    }

    static class Equipment {
        Item item;
        List<ItemAttachment<?>> attachments;

        Equipment() {
        }
    }

    private static class AiTask {
        int priority;
        Function<EntityLiving, EntityAIBase> taskSupplier;

        private AiTask() {
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureAttribute
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.IRangedAttackMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldType
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.weaponlib.ai;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.Configurable;
import com.vicmatskiv.weaponlib.Contextual;
import com.vicmatskiv.weaponlib.CustomArmor;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.PlayerItemInstanceFactory;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponFireAspect;
import com.vicmatskiv.weaponlib.WeaponSpawnEntity;
import com.vicmatskiv.weaponlib.ai.CustomMobAttack;
import com.vicmatskiv.weaponlib.ai.EntityClassFactory;
import com.vicmatskiv.weaponlib.ai.EntityConfiguration;
import com.vicmatskiv.weaponlib.ai.Timeable;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleAchievement;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleDataManager;
import com.vicmatskiv.weaponlib.compatibility.CompatibleDifficulty;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMissionCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSharedMonsterAttributes;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.grenade.GrenadeAttackAspect;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import com.vicmatskiv.weaponlib.grenade.PlayerGrenadeInstance;
import com.vicmatskiv.weaponlib.mission.Goal;
import com.vicmatskiv.weaponlib.mission.Mission;
import com.vicmatskiv.weaponlib.mission.MissionAcceptGui;
import com.vicmatskiv.weaponlib.mission.MissionAssigner;
import com.vicmatskiv.weaponlib.mission.MissionIntroGui;
import com.vicmatskiv.weaponlib.mission.MissionManager;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import com.vicmatskiv.weaponlib.mission.Missions;
import com.vicmatskiv.weaponlib.mission.ObtainItemAction;
import com.vicmatskiv.weaponlib.mission.PlayerMissionSyncMessage;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityCustomMob
extends CompatibleEntityMob
implements IRangedAttackMob,
Contextual,
MissionAssigner,
Configurable<EntityConfiguration> {
    private static final float FLAT_WORLD_SPAWN_CHANCE = 0.01f;
    private static final CompatibleDataManager.Key VARIANT = CompatibleDataManager.createKey(EntityCustomMob.class, Integer.TYPE);
    private static final CompatibleDataManager.Key SWINGING_ARMS = CompatibleDataManager.createKey(EntityCustomMob.class, Boolean.TYPE);
    private static final CompatibleDataManager.Key DELAYED_ATTACK_TIMER_INCREMENT = CompatibleDataManager.createKey(EntityCustomMob.class, Integer.TYPE);
    private static final CompatibleDataManager.Key DELAYED_ATTACK_STARTED = CompatibleDataManager.createKey(EntityCustomMob.class, Boolean.TYPE);
    private ModContext modContext;
    private EntityConfiguration configuration;
    private ItemStack secondaryEquipment;
    private int delayedAttackTimer;
    private EntityPlayer customer;

    public EntityCustomMob(World worldIn) {
        super(worldIn);
        this.func_70105_a(0.6f, 1.99f);
    }

    @Override
    public EntityConfiguration getConfiguration() {
        if (this.configuration == null) {
            this.configuration = EntityClassFactory.getInstance().getConfiguration(this.getClass());
        }
        return this.configuration;
    }

    protected void func_184651_r() {
        this.getConfiguration().addAiTasks((EntityLiving)this, this.field_70714_bg);
        this.getConfiguration().addAiTargetTasks((EntityLiving)this, this.field_70715_bh);
    }

    protected void func_110147_ax() {
        super.func_110147_ax();
        CompatibilityProvider.compatibility.setEntityAttribute((EntityLivingBase)this, CompatibleSharedMonsterAttributes.FOLLOW_RANGE, this.getConfiguration().getFollowRange());
        CompatibilityProvider.compatibility.setEntityAttribute((EntityLivingBase)this, CompatibleSharedMonsterAttributes.MOVEMENT_SPEED, this.getConfiguration().getMaxSpeed());
        CompatibilityProvider.compatibility.setEntityAttribute((EntityLivingBase)this, CompatibleSharedMonsterAttributes.MAX_HEALTH, this.getConfiguration().getMaxHealth());
        CompatibilityProvider.compatibility.setEntityAttribute((EntityLivingBase)this, CompatibleSharedMonsterAttributes.ATTACK_DAMAGE, this.getConfiguration().getCollisionAttackDamage());
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.compatibleDataManager.register(VARIANT, 0);
        this.compatibleDataManager.register(SWINGING_ARMS, false);
        this.compatibleDataManager.register(DELAYED_ATTACK_TIMER_INCREMENT, 0);
        this.compatibleDataManager.register(DELAYED_ATTACK_STARTED, false);
    }

    @Override
    protected CompatibleSound getCompatibleAmbientSound() {
        return this.getConfiguration().getAmbientSound();
    }

    @Override
    protected CompatibleSound getCompatibleHurtSound() {
        return this.getConfiguration().getHurtSound();
    }

    @Override
    protected CompatibleSound getCompatibleDeathSound() {
        return this.getConfiguration().getDeathSound();
    }

    @Override
    protected void playStepSound(CompatibleBlockPos pos, Block blockIn) {
        CompatibilityProvider.compatibility.playSound((EntityLivingBase)this, this.getConfiguration().getStepSound(), 0.15f, 1.0f);
    }

    public EnumCreatureAttribute func_70668_bt() {
        return this.getConfiguration().getCreatureAttribute();
    }

    public void func_70636_d() {
        if (this.func_70089_S() && this.getConfiguration().getDelayedAttack() != null) {
            if (this.isDelayedAttackStarted()) {
                this.setDelayedAttackTimerIncrement(1);
            }
            int delayedAttackTimerIncrement = this.getDelayedAttackTimerIncrement();
            this.delayedAttackTimer += delayedAttackTimerIncrement;
            if (this.delayedAttackTimer < 0) {
                this.delayedAttackTimer = 0;
            }
            if (this.delayedAttackTimer >= ((Timeable)((Object)this.getConfiguration().getDelayedAttack())).getDuration()) {
                this.completeDelayedAttack();
            }
        }
        super.func_70636_d();
    }

    private void completeDelayedAttack() {
        CustomMobAttack delayedAttack = this.configuration.getDelayedAttack();
        if (delayedAttack != null) {
            delayedAttack.attackEntity(this, (Entity)this.func_70638_az());
        }
    }

    public void func_70645_a(DamageSource cause) {
        ItemStack itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)this);
        if (!CompatibilityProvider.compatibility.world((Entity)this).field_72995_K && itemStack != null) {
            this.initAmmo(itemStack);
        }
        super.func_70645_a(cause);
        Entity trueDamageSource = CompatibilityProvider.compatibility.getTrueDamageSource(cause);
        if (trueDamageSource instanceof EntityPlayer) {
            EntityPlayer entityplayer = (EntityPlayer)trueDamageSource;
            CompatibilityProvider.compatibility.addStat(entityplayer, CompatibleAchievement.KILL_ENEMY);
        }
        if (this.secondaryEquipment != null && this.field_70146_Z.nextFloat() < this.getConfiguration().getPrimaryEquipmentDropChance()) {
            this.func_70099_a(this.secondaryEquipment, 0.0f);
        }
    }

    private void initAmmo(ItemStack itemStack) {
        PlayerItemInstance<?> instance = Tags.getInstance(itemStack);
        if (instance instanceof PlayerWeaponInstance) {
            PlayerWeaponInstance weaponInstance = (PlayerWeaponInstance)instance;
            ItemMagazine existingMagazine = (ItemMagazine)WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance);
            int maxAmmo = 0;
            if (existingMagazine != null) {
                maxAmmo = existingMagazine.getAmmo();
            } else if (weaponInstance.getWeapon().getAmmoCapacity() > 0) {
                maxAmmo = weaponInstance.getWeapon().getAmmoCapacity();
            }
            if (maxAmmo > 0) {
                weaponInstance.setAmmo(this.field_70146_Z.nextInt(maxAmmo));
                Tags.setInstance(itemStack, weaponInstance);
            }
        }
    }

    @Nullable
    protected ResourceLocation func_184647_J() {
        return this.getConfiguration().getLootTable();
    }

    @Override
    protected void setEquipmentBasedOnDifficulty(CompatibleDifficulty difficulty) {
        this.setArmorEquipment();
        this.setPrimaryEquipment();
        this.setSecondaryEquipment();
    }

    private void setArmorEquipment() {
        EntityConfiguration configuration = this.getConfiguration();
        this.setCompatibleInventoryArmorDropChances(configuration.getArmorDropChance());
        for (CustomArmor armor : configuration.getArmorSet()) {
            CompatibilityProvider.compatibility.setItemStackToSlot((Entity)this, armor.getCompatibleEquipmentSlot(), new ItemStack((Item)armor));
        }
    }

    private void setSecondaryEquipment() {
        EntityConfiguration configuration = this.getConfiguration();
        EntityConfiguration.Equipment secondaryEquipment = configuration.getSecondaryEquipmentOptions().pick(CompatibilityProvider.compatibility.getDifficulty(CompatibilityProvider.compatibility.world((Entity)this)));
        if (secondaryEquipment != null) {
            ItemStack equipmentItemStack = new ItemStack(secondaryEquipment.item);
            if (secondaryEquipment.item instanceof ItemGrenade) {
                this.initGrenade(secondaryEquipment, equipmentItemStack);
            }
            this.secondaryEquipment = equipmentItemStack;
        }
    }

    private void setPrimaryEquipment() {
        EntityConfiguration configuration = this.getConfiguration();
        EntityConfiguration.Equipment equipment = configuration.getEquipmentOptions().pick(CompatibilityProvider.compatibility.getDifficulty(CompatibilityProvider.compatibility.world((Entity)this)));
        this.setCompatibleInventoryHandsDropChances(configuration.getPrimaryEquipmentDropChance());
        if (equipment != null) {
            ItemStack equipmentItemStack = new ItemStack(equipment.item);
            if (equipment.item instanceof Weapon) {
                this.initWeaponWithAttachments(equipment, equipmentItemStack);
            } else if (equipment.item instanceof ItemGrenade) {
                this.initGrenade(equipment, equipmentItemStack);
            }
            CompatibilityProvider.compatibility.setItemStackToSlot((Entity)this, CompatibleEntityEquipmentSlot.MAIN_HAND, equipmentItemStack);
        }
    }

    private void initWeaponWithAttachments(EntityConfiguration.Equipment equipment, ItemStack itemStack) {
        if (equipment.attachments != null && equipment.item instanceof Weapon && equipment.item instanceof PlayerItemInstanceFactory) {
            PlayerWeaponInstance weaponInstance = (PlayerWeaponInstance)((PlayerItemInstanceFactory)equipment.item).createItemInstance((EntityLivingBase)this, new ItemStack(equipment.item), 0);
            for (ItemAttachment<Weapon> itemAttachment : equipment.attachments) {
                Set<ItemAttachment<Weapon>> compatibleAttachments = weaponInstance.getWeapon().getCompatibleAttachments().keySet();
                compatibleAttachments.contains(itemAttachment);
                WeaponAttachmentAspect.addAttachment(itemAttachment, weaponInstance);
            }
            Tags.setInstance(itemStack, weaponInstance);
            Tags.setAmmo(itemStack, this.getConfiguration().getMaxAmmo());
        }
    }

    private void initGrenade(EntityConfiguration.Equipment equipment, ItemStack itemStack) {
        if (equipment.item instanceof ItemGrenade) {
            PlayerGrenadeInstance grenadeInstance = (PlayerGrenadeInstance)((PlayerItemInstanceFactory)equipment.item).createItemInstance((EntityLivingBase)this, new ItemStack(equipment.item), 0);
            grenadeInstance.setThrowingFar(true);
            Tags.setInstance(itemStack, grenadeInstance);
        }
    }

    @Override
    @Nullable
    public IEntityLivingData onCompatibleSpawn(CompatibleDifficulty difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onCompatibleSpawn(difficulty, livingdata);
        List<EntityConfiguration.TexturedModel> variants = this.getConfiguration().getTexturedModelVariants();
        int variant = 0;
        if (!variants.isEmpty()) {
            variant = this.field_70146_Z.nextInt(variants.size());
        }
        this.setVariant(variant);
        this.setEquipmentBasedOnDifficulty(difficulty);
        this.setEnchantmentBasedOnDifficulty(difficulty);
        this.func_98053_h(this.field_70146_Z.nextFloat() < 0.55f * difficulty.getClampedAdditionalDifficulty());
        return livingdata;
    }

    public boolean func_70652_k(Entity target) {
        EntityConfiguration configuration = this.getConfiguration();
        CustomMobAttack collisionAttack = configuration.getCollisionAttack();
        if (collisionAttack != null) {
            return collisionAttack.attackEntity(this, target);
        }
        return super.func_70652_k(target);
    }

    public void func_82196_d(EntityLivingBase target, float distanceFactor) {
        if (this.modContext == null) {
            return;
        }
        ItemStack itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)this);
        if (itemStack == null) {
            return;
        }
        if (itemStack.func_77973_b() instanceof Weapon) {
            WeaponFireAspect fireAspect = this.modContext.getWeaponFireAspect();
            BiFunction<Weapon, EntityLivingBase, WeaponSpawnEntity> spawnEntityWith = (weapon, player) -> {
                int difficultyId = CompatibilityProvider.compatibility.getDifficulty(CompatibilityProvider.compatibility.world((Entity)this)).func_151525_a();
                float inaccuracy = weapon.getInaccuracy() + (3.0f - (float)difficultyId) * 0.5f;
                WeaponSpawnEntity bullet = new WeaponSpawnEntity((Weapon)weapon, CompatibilityProvider.compatibility.world((Entity)player), (EntityLivingBase)player, weapon.getSpawnEntityVelocity(), weapon.getSpawnEntityGravityVelocity(), inaccuracy, weapon.getSpawnEntityDamage(), weapon.getSpawnEntityExplosionRadius(), false, 1.0f, 1.0f, 1.5f, 1.0f, -1, -1, new Material[0]);
                bullet.setPositionAndDirection();
                return bullet;
            };
            fireAspect.serverFire((EntityLivingBase)this, itemStack, spawnEntityWith, false);
        } else if (itemStack.func_77973_b() instanceof ItemGrenade) {
            float rotationPitchAdjustment = 20.0f;
            this.field_70125_A -= rotationPitchAdjustment;
            PlayerGrenadeInstance grenadeInstance = (PlayerGrenadeInstance)Tags.getInstance(itemStack);
            GrenadeAttackAspect.serverThrowGrenade(this.modContext, (EntityLivingBase)this, grenadeInstance, System.currentTimeMillis() + 2000L);
            this.field_70125_A += rotationPitchAdjustment;
        }
    }

    void attackWithSecondaryEquipment(EntityLivingBase target, float distanceFactor) {
        if (this.modContext == null) {
            return;
        }
        if (this.secondaryEquipment == null) {
            return;
        }
        if (this.secondaryEquipment.func_77973_b() instanceof ItemGrenade) {
            float rotationPitchAdjustment = 20.0f;
            this.field_70125_A -= rotationPitchAdjustment;
            PlayerGrenadeInstance grenadeInstance = (PlayerGrenadeInstance)Tags.getInstance(this.secondaryEquipment);
            GrenadeAttackAspect.serverThrowGrenade(this.modContext, (EntityLivingBase)this, grenadeInstance, System.currentTimeMillis() + 2000L);
            this.field_70125_A += rotationPitchAdjustment;
        }
    }

    public void func_70037_a(NBTTagCompound compound) {
        super.func_70037_a(compound);
        int variant = compound.func_74762_e("Variant");
        this.setVariant(variant);
        int delayedAttackTimerIncrement = compound.func_74762_e("DATI");
        this.setDelayedAttackTimerIncrement(delayedAttackTimerIncrement);
        NBTTagCompound secondaryNbt = compound.func_74775_l("Secondary");
        if (secondaryNbt != null) {
            this.secondaryEquipment = CompatibilityProvider.compatibility.createItemStack(secondaryNbt);
        }
    }

    public void func_70014_b(NBTTagCompound compound) {
        super.func_70014_b(compound);
        compound.func_74768_a("Variant", this.getVariant());
        compound.func_74768_a("DATI", this.getDelayedAttackTimerIncrement());
        if (this.secondaryEquipment != null) {
            compound.func_74782_a("Secondary", (NBTBase)this.secondaryEquipment.func_77955_b(new NBTTagCompound()));
        }
    }

    public float func_70047_e() {
        return 1.74f;
    }

    public double func_70033_W() {
        return -0.35;
    }

    public int getVariant() {
        return this.compatibleDataManager.get(VARIANT).intValue();
    }

    public void setVariant(int variant) {
        this.compatibleDataManager.set(VARIANT, variant);
    }

    public boolean isSwingingArms() {
        return this.compatibleDataManager.get(SWINGING_ARMS).booleanValue();
    }

    public void func_184724_a(boolean swingingArms) {
        this.compatibleDataManager.set(SWINGING_ARMS, swingingArms);
    }

    protected boolean func_70814_o() {
        Predicate<Entity> predicate = this.getConfiguration().isValidLightLevel();
        return predicate != null ? predicate.test((Entity)this) : super.func_70814_o();
    }

    @Override
    public float getCompatibleBlockPathWeight(CompatibleBlockPos pos) {
        return this.getConfiguration().getMaxTolerableLightBrightness() - CompatibilityProvider.compatibility.getLightBrightness(CompatibilityProvider.compatibility.world((Entity)this), pos);
    }

    protected boolean func_70692_ba() {
        return this.getConfiguration().isDespawnable();
    }

    public boolean func_70104_M() {
        return this.getConfiguration().isPushable();
    }

    public boolean func_180431_b(DamageSource source) {
        return this.getConfiguration().isInvulnerable() || super.func_180431_b(source);
    }

    public boolean func_70067_L() {
        return this.getConfiguration().isCollidable() || super.func_70067_L();
    }

    public boolean func_70601_bi() {
        boolean canSpawn = CompatibilityProvider.compatibility.getWorldType(CompatibilityProvider.compatibility.world((Entity)this)) != WorldType.field_77138_c || this.field_70146_Z.nextFloat() > 0.99f;
        Predicate<Entity> predicate = this.getConfiguration().getCanSpawnHere();
        return canSpawn && (predicate != null ? predicate.test((Entity)this) : super.func_70601_bi());
    }

    @Override
    public void setContext(ModContext modContext) {
        this.modContext = modContext;
    }

    public ItemStack getSecondaryEquipment() {
        return this.secondaryEquipment;
    }

    public void setDelayedAttackTimerIncrement(int increment) {
        this.compatibleDataManager.set(DELAYED_ATTACK_TIMER_INCREMENT, increment);
    }

    public int getDelayedAttackTimerIncrement() {
        return this.compatibleDataManager.get(DELAYED_ATTACK_TIMER_INCREMENT).intValue();
    }

    public boolean isDelayedAttackStarted() {
        return this.compatibleDataManager.get(DELAYED_ATTACK_STARTED).booleanValue();
    }

    public void startDelayedAttack() {
        this.compatibleDataManager.set(DELAYED_ATTACK_STARTED, true);
    }

    @Override
    public Map<UUID, MissionOffering> getMissionOfferings() {
        MissionManager missionManager = this.modContext.getMissionManager();
        if (missionManager != null) {
            return missionManager.getEntityMissionOfferings(EntityList.func_75621_b((Entity)this));
        }
        return Collections.emptyMap();
    }

    public boolean func_184645_a(EntityPlayer player, EnumHand hand) {
        boolean flag;
        ItemStack itemstack = player.func_184586_b(hand);
        boolean bl = flag = itemstack.func_77973_b() == Items.field_151057_cb;
        if (flag) {
            itemstack.func_111282_a(player, (EntityLivingBase)this, hand);
            return true;
        }
        if (this.func_70089_S() && !player.func_70093_af()) {
            Map<UUID, MissionOffering> missionOfferings = this.getMissionOfferings();
            if (!missionOfferings.isEmpty() || !this.getConfiguration().getDialogContent().isEmpty()) {
                this.setCustomer(player);
                if (this.field_70170_p.field_72995_K) {
                    this.displayTradeGui(player);
                }
            } else if (missionOfferings.isEmpty()) {
                return super.func_184645_a(player, hand);
            }
            return true;
        }
        return super.func_184645_a(player, hand);
    }

    @SideOnly(value=Side.CLIENT)
    protected void displayTradeGui(EntityPlayer player) {
        Collection<MissionOffering> redeemableMissionOfferings = Missions.getRedeemableMissionOfferings(this, player);
        if (!redeemableMissionOfferings.isEmpty()) {
            Minecraft.func_71410_x().func_147108_a((GuiScreen)new MissionAcceptGui(true, redeemableMissionOfferings.iterator().next(), this, player, this.modContext, this.getConfiguration().getDialogBackground(), this.getConfiguration().getRewardsBackground(), null));
        } else {
            Minecraft.func_71410_x().func_147108_a((GuiScreen)new MissionIntroGui(this, player, this.modContext, this.getConfiguration().getDialogContent(), this.getConfiguration().getDialogBackground(), this.getConfiguration().getIntroImage(), this.getConfiguration().getRewardsBackground(), this.getConfiguration().getMissionSelectionBackground()));
        }
    }

    public void setCustomer(EntityPlayer customer) {
        this.customer = customer;
    }

    public EntityPlayer getCustomer() {
        return this.customer;
    }

    protected boolean isTrading() {
        return this.customer != null;
    }

    @Override
    public void redeem(Mission mission, EntityPlayer player) {
        MissionOffering missionOffering = this.getMissionOfferings().get(mission.getMissionOfferingId());
        if (missionOffering != null && !mission.isRedeemed() && mission.isCompleted(player) && !mission.isExpired(CompatibilityProvider.compatibility.world((Entity)player).func_82737_E()) && mission.getAssignerId().equals(this.func_110124_au())) {
            boolean goalsMet = true;
            for (Goal goal : mission.getGoals()) {
                if (!(goal.getRequiredAction() instanceof ObtainItemAction) || CompatibilityProvider.compatibility.removeMatchingInventoryItemStacks(player, ((ObtainItemAction)goal.getRequiredAction()).getItem(), goal.getQuantity()) >= goal.getQuantity()) continue;
                goalsMet = false;
                break;
            }
            if (goalsMet) {
                mission.setRedeemed(CompatibilityProvider.compatibility.world((Entity)player).func_82737_E());
                missionOffering.getRewards().forEach(reward -> reward.redeem(player));
                CompatibleMissionCapability.updateMission((Entity)player, mission);
                this.modContext.getChannel().getChannel().sendTo((IMessage)new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions((Entity)player)), (EntityPlayerMP)player);
            }
        }
    }

    @Override
    public void assign(MissionOffering offering, EntityPlayer player) {
        if (offering.isAvailableFor(player)) {
            CompatibleMissionCapability.updateMission((Entity)player, new Mission(offering.getId(), (Entity)this, CompatibilityProvider.compatibility.world((Entity)player).func_82737_E(), offering.getMaxDuration(), offering.createGoals()));
            this.modContext.getChannel().getChannel().sendTo((IMessage)new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions((Entity)player)), (EntityPlayerMP)player);
            this.customer = null;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
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
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.AttachmentContainer;
import com.vicmatskiv.weaponlib.BlockHitMessage;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.EntityShellCasing;
import com.vicmatskiv.weaponlib.ImpactHandler;
import com.vicmatskiv.weaponlib.Inspectable;
import com.vicmatskiv.weaponlib.ItemAmmo;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.ItemScope;
import com.vicmatskiv.weaponlib.MaterialImpactSound;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.Modifiable;
import com.vicmatskiv.weaponlib.PlayerItemInstanceFactory;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.Reloadable;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.Updatable;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WeaponSpawnEntity;
import com.vicmatskiv.weaponlib.WeaponState;
import com.vicmatskiv.weaponlib.animation.ScreenShakeAnimation;
import com.vicmatskiv.weaponlib.animation.ScreenShakingAnimationManager;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItem;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTargetPoint;
import com.vicmatskiv.weaponlib.config.Gun;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import com.vicmatskiv.weaponlib.crafting.OptionsMetadata;
import com.vicmatskiv.weaponlib.model.Shell;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.minecraft.block.material.Material;
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

public class Weapon
extends CompatibleItem
implements PlayerItemInstanceFactory<PlayerWeaponInstance, WeaponState>,
AttachmentContainer,
Reloadable,
Inspectable,
Modifiable,
Updatable {
    private static final Logger logger = LogManager.getLogger(Weapon.class);
    private static final long DEFAULT_RELOADING_TIMEOUT_TICKS = 10L;
    private static final long DEFAULT_UNLOADING_TIMEOUT_TICKS = 10L;
    private static final long DEFAULT_LOAD_ITERATION_TIMEOUT_TICKS = 10L;
    static final long MAX_RELOAD_TIMEOUT_TICKS = 60L;
    static final long MAX_UNLOAD_TIMEOUT_TICKS = 60L;
    private static final long DEFAULT_BURST_TIMEOUT_MILLISECONDS = 150L;
    public static final float DEFAULT_SHELL_CASING_FORWARD_OFFSET = 0.1f;
    public static final float DEFAULT_SHELL_CASING_VERTICAL_OFFSET = 0.0f;
    public static final float DEFAULT_SHELL_CASING_SIDE_OFFSET = 0.15f;
    public static final float DEFAULT_SHELL_CASING_SIDE_OFFSET_AIMED = 0.05f;
    private static final float DEFAULT_FIRE_RATE = 0.5f;
    private static final float DEFAULT_SILENCED_SHOOT_SOUND_VOLUME = 0.7f;
    private static final float DEFAULT_SHOOT_SOUND_VOLUME = 10.0f;
    Builder builder;
    private ModContext modContext;
    private CompatibleSound shootSound;
    private CompatibleSound endOfShootSound;
    private CompatibleSound silencedShootSound;
    private CompatibleSound reloadSound;
    private CompatibleSound reloadIterationSound;
    private CompatibleSound inspectSound;
    private CompatibleSound drawSound;
    private CompatibleSound allReloadIterationsCompletedSound;
    private CompatibleSound unloadSound;
    private CompatibleSound ejectSpentRoundSound;
    private CompatibleSound burstShootSound;
    private CompatibleSound silencedBurstShootSound;

    Weapon(Builder builder, ModContext modContext) {
        this.builder = builder;
        this.modContext = modContext;
        this.func_77625_d(1);
    }

    public String getName() {
        return this.builder.name;
    }

    public CompatibleSound getShootSound() {
        return this.shootSound;
    }

    public CompatibleSound getBurstShootSound() {
        return this.burstShootSound;
    }

    public CompatibleSound getSilencedBurstShootSound() {
        return this.silencedBurstShootSound;
    }

    public CompatibleSound getEndOfShootSound() {
        return this.endOfShootSound;
    }

    public CompatibleSound getSilencedShootSound() {
        return this.silencedShootSound;
    }

    public CompatibleSound getReloadSound() {
        return this.reloadSound;
    }

    public CompatibleSound getReloadIterationSound() {
        return this.reloadIterationSound;
    }

    public CompatibleSound getInspectSound() {
        return this.inspectSound;
    }

    public CompatibleSound getDrawSound() {
        return this.drawSound;
    }

    public CompatibleSound getAllReloadIterationsCompletedSound() {
        return this.allReloadIterationsCompletedSound;
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

    void toggleAiming() {
        PlayerWeaponInstance mainHandHeldWeaponInstance = this.modContext.getMainHeldWeapon();
        if (mainHandHeldWeaponInstance != null && (mainHandHeldWeaponInstance.getState() == WeaponState.READY || mainHandHeldWeaponInstance.getState() == WeaponState.PAUSED || mainHandHeldWeaponInstance.getState() == WeaponState.EJECT_REQUIRED)) {
            mainHandHeldWeaponInstance.setAimed(!mainHandHeldWeaponInstance.isAimed());
        }
    }

    public void func_77663_a(ItemStack itemStack, World world, Entity entity, int p_77663_4_, boolean active) {
    }

    public void changeRecoil(EntityLivingBase player, float factor) {
        PlayerWeaponInstance instance = this.modContext.getMainHeldWeapon();
        if (instance != null) {
            float recoil = instance.getWeapon().builder.recoil * factor;
            logger.debug("Changing recoil to {} for instance {}", (Object)Float.valueOf(recoil), (Object)instance);
            instance.setRecoil(recoil);
        }
    }

    public Map<ItemAttachment<Weapon>, CompatibleAttachment<Weapon>> getCompatibleAttachments() {
        return this.builder.compatibleAttachments;
    }

    @Override
    public Collection<CompatibleAttachment<? extends AttachmentContainer>> getCompatibleAttachments(AttachmentCategory ... categories) {
        Collection<CompatibleAttachment<Weapon>> c = this.builder.compatibleAttachments.values();
        List<AttachmentCategory> inputCategoryList = Arrays.asList(categories);
        return c.stream().filter(e -> inputCategoryList.contains((Object)e.getAttachment().getCategory())).collect(Collectors.toList());
    }

    String getCrosshair(PlayerWeaponInstance weaponInstance) {
        if (weaponInstance.isAimed()) {
            String crosshair = null;
            ItemAttachment<Weapon> scopeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.SCOPE, weaponInstance);
            if (scopeAttachment != null) {
                crosshair = scopeAttachment.getCrosshair();
            }
            if (crosshair == null) {
                crosshair = this.builder.crosshairZoomed;
            }
            return crosshair;
        }
        if (weaponInstance.getPlayer().func_70051_ag()) {
            return this.builder.crosshairRunning;
        }
        return this.builder.crosshair;
    }

    public static boolean isActiveAttachment(PlayerWeaponInstance weaponInstance, ItemAttachment<Weapon> attachment) {
        return weaponInstance != null ? WeaponAttachmentAspect.isActiveAttachment(attachment, weaponInstance) : false;
    }

    public int func_77626_a(ItemStack itemStack) {
        return 0;
    }

    int getCurrentAmmo(EntityPlayer player) {
        PlayerWeaponInstance state = this.modContext.getMainHeldWeapon();
        return state.getAmmo();
    }

    public int getAmmoCapacity() {
        return this.builder.ammoCapacity;
    }

    int getMaxBulletsPerReload() {
        return this.builder.maxBulletsPerReload;
    }

    ModelBase getAmmoModel() {
        return this.builder.ammoModel;
    }

    String getAmmoModelTextureName() {
        return this.builder.ammoModelTextureName;
    }

    ModelBase getShellCasingModel() {
        return this.builder.shellCasingModel;
    }

    String getShellCasingTextureName() {
        return this.builder.shellCasingModelTextureName;
    }

    void onSpawnEntityBlockImpact(World world, EntityPlayer player, WeaponSpawnEntity entity, CompatibleRayTraceResult position) {
        if (this.builder.blockImpactHandler != null) {
            this.builder.blockImpactHandler.onImpact(world, player, entity, position);
        }
    }

    @Override
    public List<CompatibleAttachment<? extends AttachmentContainer>> getActiveAttachments(EntityLivingBase player, ItemStack itemStack) {
        return this.modContext.getAttachmentAspect().getActiveAttachments(player, itemStack);
    }

    long getUnloadTimeoutTicks() {
        return this.builder.unloadingTimeout;
    }

    boolean ejectSpentRoundRequired() {
        return this.builder.ejectSpentRoundRequired;
    }

    List<ItemMagazine> getCompatibleMagazines() {
        return this.builder.compatibleAttachments.keySet().stream().filter(a -> a instanceof ItemMagazine).map(a -> (ItemMagazine)a).collect(Collectors.toList());
    }

    public WeaponRenderer getRenderer() {
        return this.builder.renderer;
    }

    List<ItemAttachment<Weapon>> getCompatibleAttachments(Class<? extends ItemAttachment<Weapon>> target) {
        return this.builder.compatibleAttachments.entrySet().stream().filter(e -> target.isInstance(e.getKey())).map(e -> (ItemAttachment)e.getKey()).collect(Collectors.toList());
    }

    @Override
    public void addInformation(ItemStack itemStack, List<String> info, boolean flag) {
        if (info != null && this.builder.informationProvider != null) {
            info.addAll((Collection)this.builder.informationProvider.apply(itemStack));
        }
    }

    @Override
    public void reloadMainHeldItemForPlayer(EntityPlayer player) {
        this.modContext.getWeaponReloadAspect().reloadMainHeldItem(player);
    }

    @Override
    public void unloadMainHeldItemForPlayer(EntityPlayer player) {
        this.modContext.getWeaponReloadAspect().unloadMainHeldItem(player);
    }

    @Override
    public void inspectMainHeldItemForPlayer(EntityPlayer player) {
        this.modContext.getWeaponReloadAspect().inspectMainHeldItem(player);
    }

    @Override
    public void update(EntityPlayer player) {
        this.modContext.getWeaponReloadAspect().updateMainHeldItem(player);
        this.modContext.getWeaponFireAspect().onUpdate(player);
        this.modContext.getAttachmentAspect().updateMainHeldItem(player);
    }

    public void tryFire(EntityPlayer player) {
        this.modContext.getWeaponFireAspect().onFireButtonDown(player);
    }

    public void tryStopFire(EntityPlayer player) {
        this.modContext.getWeaponFireAspect().onFireButtonRelease(player);
    }

    @Override
    public PlayerWeaponInstance createItemInstance(EntityLivingBase player, ItemStack itemStack, int slot) {
        PlayerWeaponInstance instance = new PlayerWeaponInstance(slot, player, itemStack);
        instance.setState(WeaponState.READY);
        instance.setRecoil(this.builder.recoil);
        instance.setMaxShots(this.builder.maxShots.get(0));
        for (CompatibleAttachment<Weapon> compatibleAttachment : ((Weapon)itemStack.func_77973_b()).getCompatibleAttachments().values()) {
            ItemAttachment<Weapon> attachment = compatibleAttachment.getAttachment();
            if (!compatibleAttachment.isDefault() || attachment.getApply2() == null) continue;
            attachment.apply2.apply(attachment, instance);
        }
        return instance;
    }

    @Override
    public void toggleClientAttachmentSelectionMode(EntityPlayer player) {
        this.modContext.getAttachmentAspect().toggleClientAttachmentSelectionMode(player);
    }

    public boolean onDroppedByPlayer(ItemStack itemStack, EntityPlayer player) {
        PlayerWeaponInstance instance = (PlayerWeaponInstance)Tags.getInstance(itemStack);
        return instance == null || instance.getState() == WeaponState.READY;
    }

    void changeFireMode(PlayerWeaponInstance instance) {
        Iterator<Integer> it = this.builder.maxShots.iterator();
        while (it.hasNext() && instance.getMaxShots() != it.next().intValue()) {
        }
        int result = it.hasNext() ? it.next().intValue() : this.builder.maxShots.get(0).intValue();
        instance.setMaxShots(result);
        String message = result == 1 ? CompatibilityProvider.compatibility.getLocalizedString("gui.firearmMode.semi", new Object[0]) : (result == Integer.MAX_VALUE ? CompatibilityProvider.compatibility.getLocalizedString("gui.firearmMode.auto", new Object[0]) : CompatibilityProvider.compatibility.getLocalizedString("gui.firearmMode.burst", new Object[0]));
        logger.debug("Changed fire mode of {} to {}", (Object)instance, (Object)result);
        this.modContext.getStatusMessageCenter().addMessage(CompatibilityProvider.compatibility.getLocalizedString("gui.firearmMode", message), 1000L);
        CompatibilityProvider.compatibility.playSound(instance.getPlayer(), this.modContext.getChangeFireModeSound(), 1.0f, 1.0f);
    }

    public long getTotalReloadingDuration() {
        return this.builder.renderer.getTotalReloadingDuration();
    }

    public long getPrepareFirstLoadIterationAnimationDuration() {
        return this.builder.renderer.getPrepareFirstLoadIterationAnimationDuration();
    }

    public long getAllLoadIterationAnimationsCompletedDuration() {
        return this.builder.renderer.getAllLoadIterationAnimationsCompletedDuration();
    }

    public long getTotalLoadIterationDuration() {
        return this.builder.renderer.getTotalLoadIterationDuration();
    }

    public long getTotalUnloadingDuration() {
        return this.builder.renderer.getTotalUnloadingDuration();
    }

    public long getTotalDrawingDuration() {
        return this.builder.renderer.getTotalDrawingDuration();
    }

    public boolean hasRecoilPositioning() {
        return this.builder.renderer.hasRecoilPositioning();
    }

    void incrementZoom(PlayerWeaponInstance instance) {
        ItemAttachment<Weapon> scopeItem = instance.getAttachmentItemWithCategory(AttachmentCategory.SCOPE);
        if (scopeItem instanceof ItemScope && ((ItemScope)scopeItem).isOptical()) {
            float minZoom = ((ItemScope)scopeItem).getMinZoom();
            float maxZoom = ((ItemScope)scopeItem).getMaxZoom();
            float increment = (minZoom - maxZoom) / 20.0f;
            float zoom = instance.getZoom();
            if (zoom > maxZoom) {
                zoom = Math.max(zoom - increment, maxZoom);
            }
            instance.setZoom(zoom);
            float ratio = (minZoom - zoom) / (minZoom - maxZoom);
            this.modContext.getStatusMessageCenter().addMessage(CompatibilityProvider.compatibility.getLocalizedString("gui.currentZoom", Math.round(ratio * 100.0f)), 800L);
            CompatibilityProvider.compatibility.playSound(instance.getPlayer(), this.modContext.getZoomSound(), 1.0f, 1.0f);
            logger.debug("Changed optical zoom to {}", (Object)Float.valueOf(instance.getZoom()));
        } else {
            logger.debug("Cannot change non-optical zoom");
        }
    }

    void decrementZoom(PlayerWeaponInstance instance) {
        ItemAttachment<Weapon> scopeItem = instance.getAttachmentItemWithCategory(AttachmentCategory.SCOPE);
        if (scopeItem instanceof ItemScope && ((ItemScope)scopeItem).isOptical()) {
            float minZoom = ((ItemScope)scopeItem).getMinZoom();
            float maxZoom = ((ItemScope)scopeItem).getMaxZoom();
            float increment = (minZoom - maxZoom) / 20.0f;
            float zoom = instance.getZoom();
            if (zoom < minZoom) {
                zoom = Math.min(zoom + increment, minZoom);
            }
            instance.setZoom(zoom);
            float ratio = (minZoom - zoom) / (minZoom - maxZoom);
            this.modContext.getStatusMessageCenter().addMessage(CompatibilityProvider.compatibility.getLocalizedString("gui.currentZoom", Math.round(ratio * 100.0f)), 800L);
            CompatibilityProvider.compatibility.playSound(instance.getPlayer(), this.modContext.getZoomSound(), 1.0f, 1.0f);
            logger.debug("Changed optical zoom to {}", (Object)Float.valueOf(zoom));
        } else {
            logger.debug("Cannot change non-optical zoom");
        }
    }

    public ItemAttachment.ApplyHandler2<Weapon> getEquivalentHandler(AttachmentCategory attachmentCategory) {
        ItemAttachment.ApplyHandler2<Weapon> handler = (a, i) -> {};
        switch (attachmentCategory) {
            case SCOPE: {
                handler = (a, i) -> {};
                break;
            }
            case GRIP: {
                handler = (a, i) -> i.setRecoil(this.builder.recoil);
                break;
            }
        }
        return handler;
    }

    public String getTextureName() {
        return this.builder.textureNames.get(0);
    }

    public float getRecoil() {
        return this.builder.recoil;
    }

    public ModContext getModContext() {
        return this.modContext;
    }

    public float getShellCasingVerticalOffset() {
        return this.builder.shellCasingVerticalOffset;
    }

    public float getShellCasingForwardOffset() {
        return this.builder.shellCasingForwardOffset;
    }

    public float getShellCasingSideOffset() {
        return this.builder.shellCasingSideOffset;
    }

    public float getShellCasingSideOffsetAimed() {
        return this.builder.shellCasingSideOffsetAimed;
    }

    public boolean isShellCasingEjectEnabled() {
        return this.builder.shellCasingEjectEnabled;
    }

    public ShellCasingEjectDirection getShellCasingEjectDirection() {
        return this.builder.shellCasingEjectDirection;
    }

    public float getSilencedShootSoundVolume() {
        return this.builder.silencedShootSoundVolume;
    }

    public float getShootSoundVolume() {
        return this.builder.shootSoundVolume;
    }

    public boolean hasIteratedLoad() {
        return this.builder.hasIteratedLoad;
    }

    public float getSpawnEntityVelocity() {
        return this.builder.spawnEntitySpeed;
    }

    public float getSpawnEntityGravityVelocity() {
        return this.builder.spawnEntityGravityVelocity;
    }

    public float getSpawnEntityDamage() {
        return this.builder.spawnEntityDamage;
    }

    public float getSpawnEntityExplosionRadius() {
        return this.builder.spawnEntityExplosionRadius;
    }

    public float getInaccuracy() {
        return this.builder.inaccuracy;
    }

    public boolean isCategoryRemovable(AttachmentCategory category) {
        return !this.builder.unremovableAttachmentCategories.contains((Object)category);
    }

    public boolean isSmokeEnabled() {
        return this.builder.smokeEnabled;
    }

    public float getBleedingCoefficient() {
        return this.builder.bleedingCoefficient;
    }

    public ScreenShakeAnimation.Builder getScreenShakeAnimationBuilder(RenderableState renderableState) {
        return (ScreenShakeAnimation.Builder)this.builder.screenShakingBuilders.get((Object)renderableState);
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
        private static final float DEFAULT_SPAWN_ENTITY_SPEED = 120.0f;
        private static final float DEFAULT_INACCURACY = 0.0f;
        private static final String DEFAULT_SHELL_CASING_TEXTURE_NAME = "weaponlib:/com/vicmatskiv/weaponlib/resources/shell.png";
        private static final float DEFAULT_SHELL_CASING_VELOCITY = 0.1f;
        private static final float DEFAULT_SHELL_CASING_GRAVITY_VELOCITY = 0.05f;
        private static final float DEFAULT_SHELL_CASING_INACCURACY = 20.0f;
        String name;
        List<String> textureNames = new ArrayList<String>();
        int ammoCapacity = 0;
        float recoil = 1.0f;
        private String shootSound;
        private String silencedShootSound;
        private String reloadSound;
        private String reloadIterationSound;
        private String inspectSound;
        private String drawSound;
        private String allReloadIterationsCompletedSound;
        private String unloadSound;
        private String ejectSpentRoundSound;
        private String endOfShootSound;
        private String burstShootSound;
        private String silencedBurstShootSound;
        private String exceededMaxShotsSound;
        ItemAmmo ammo;
        float fireRate = 0.5f;
        private CreativeTabs creativeTab;
        private WeaponRenderer renderer;
        List<Integer> maxShots = new ArrayList<Integer>();
        String crosshair;
        String crosshairRunning;
        String crosshairZoomed;
        BiFunction<Weapon, EntityLivingBase, ? extends WeaponSpawnEntity> spawnEntityWith;
        BiFunction<PlayerWeaponInstance, EntityLivingBase, ? extends EntityShellCasing> spawnShellWith;
        private float spawnEntityDamage;
        private float spawnEntityExplosionRadius;
        private boolean isDestroyingBlocks = true;
        private float spawnEntityGravityVelocity;
        private float spawnEntityParticleAgeCoefficient = 1.0f;
        private float spawnEntitySmokeParticleAgeCoefficient = 1.0f;
        private float spawnEntityExplosionParticleScaleCoefficient = 1.5f;
        private float spawnEntitySmokeParticleScaleCoefficient = 1.0f;
        long reloadingTimeout = 10L;
        long loadIterationTimeout = 10L;
        private String modId;
        boolean crosshairFullScreen = false;
        boolean crosshairZoomedFullScreen = false;
        Map<ItemAttachment<Weapon>, CompatibleAttachment<Weapon>> compatibleAttachments = new HashMap<ItemAttachment<Weapon>, CompatibleAttachment<Weapon>>();
        ModelBase ammoModel;
        String ammoModelTextureName;
        ModelBase shellCasingModel;
        String shellCasingModelTextureName;
        private float spawnEntitySpeed = 120.0f;
        private Class<? extends WeaponSpawnEntity> spawnEntityClass;
        ImpactHandler blockImpactHandler;
        long pumpTimeoutMilliseconds;
        long burstTimeoutMilliseconds = 150L;
        private float inaccuracy = 0.0f;
        int pellets = 1;
        boolean smokeEnabled = true;
        float bleedingCoefficient = 1.0f;
        String explosionParticleTexture;
        String smokeParticleTexture;
        float flashIntensity = 0.2f;
        Supplier<Float> flashScale = () -> Float.valueOf(1.0f);
        Supplier<Float> flashOffsetX = () -> Float.valueOf(0.0f);
        Supplier<Float> flashOffsetY = () -> Float.valueOf(0.0f);
        Supplier<Float> smokeOffsetX = () -> Float.valueOf(0.0f);
        Supplier<Float> smokeOffsetY = () -> Float.valueOf(0.0f);
        long unloadingTimeout = 10L;
        private boolean ejectSpentRoundRequired;
        public int maxBulletsPerReload;
        private Function<ItemStack, List<String>> informationProvider;
        private CraftingComplexity craftingComplexity;
        private Object[] craftingMaterials;
        private float shellCasingForwardOffset = 0.1f;
        private float shellCasingVerticalOffset = 0.0f;
        private float shellCasingSideOffset = 0.15f;
        private float shellCasingSideOffsetAimed = 0.05f;
        public boolean shellCasingEjectEnabled = true;
        private boolean hasIteratedLoad;
        private ShellCasingEjectDirection shellCasingEjectDirection = ShellCasingEjectDirection.RIGHT;
        private float silencedShootSoundVolume = 0.7f;
        private float shootSoundVolume = 10.0f;
        private Object[] craftingRecipe;
        public boolean isOneClickBurstAllowed;
        String flashTexture;
        private Set<AttachmentCategory> unremovableAttachmentCategories = new HashSet<AttachmentCategory>();
        private Map<RenderableState, ScreenShakeAnimation.Builder> screenShakingBuilders = new HashMap<RenderableState, ScreenShakeAnimation.Builder>();

        public Builder() {
            ScreenShakeAnimation.Builder defaultShootingStateScreenShakingBuilder = new ScreenShakeAnimation.Builder().withState(ScreenShakingAnimationManager.State.SHOOTING).withRotationAttenuation(0.5f).withTranslationAttenuation(0.05f).withZRotationCoefficient(2.0f).withTransitionDuration(50L);
            this.screenShakingBuilders.put(RenderableState.SHOOTING, defaultShootingStateScreenShakingBuilder);
        }

        public Builder withModId(String modId) {
            this.modId = modId;
            return this;
        }

        public Builder withEjectRoundRequired() {
            this.ejectSpentRoundRequired = true;
            return this;
        }

        public Builder withInformationProvider(Function<ItemStack, List<String>> informationProvider) {
            this.informationProvider = informationProvider;
            return this;
        }

        public Builder withReloadingTime(long reloadingTime) {
            this.reloadingTimeout = reloadingTime;
            return this;
        }

        public Builder withUnloadingTime(long unloadingTime) {
            this.unloadingTimeout = unloadingTime;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAmmoCapacity(int ammoCapacity) {
            this.ammoCapacity = ammoCapacity;
            return this;
        }

        public Builder withMaxBulletsPerReload(int maxBulletsPerReload) {
            this.maxBulletsPerReload = maxBulletsPerReload;
            return this;
        }

        public Builder withIteratedLoad() {
            this.hasIteratedLoad = true;
            return this;
        }

        public Builder withRecoil(float recoil) {
            this.recoil = recoil;
            return this;
        }

        @Deprecated
        public Builder withZoom(float zoom) {
            return this;
        }

        public Builder withAmmo(ItemAmmo ammo) {
            this.ammo = ammo;
            return this;
        }

        public Builder withMaxShots(int ... maxShots) {
            for (int m : maxShots) {
                this.maxShots.add(m);
            }
            return this;
        }

        public Builder withOneClickBurst() {
            this.isOneClickBurstAllowed = true;
            return this;
        }

        public Builder withBurstTimeout(long burstTimeoutMilliseconds) {
            this.burstTimeoutMilliseconds = burstTimeoutMilliseconds;
            return this;
        }

        public Builder withFireRate(float fireRate) {
            if (fireRate >= 1.0f || fireRate <= 0.0f) {
                throw new IllegalArgumentException("Invalid fire rate " + fireRate);
            }
            this.fireRate = fireRate;
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

        public Builder withCrosshair(String crosshair) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.crosshair = this.modId + ":textures/crosshairs/" + crosshair.toLowerCase() + ".png";
            return this;
        }

        public Builder withCrosshair(String crosshair, boolean fullScreen) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.crosshair = this.modId + ":textures/crosshairs/" + crosshair.toLowerCase() + ".png";
            this.crosshairFullScreen = fullScreen;
            return this;
        }

        public Builder withCrosshairRunning(String crosshairRunning) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.crosshairRunning = this.modId + ":textures/crosshairs/" + crosshairRunning.toLowerCase() + ".png";
            return this;
        }

        public Builder withCrosshairZoomed(String crosshairZoomed) {
            return this.withCrosshairZoomed(crosshairZoomed, true);
        }

        public Builder withCrosshairZoomed(String crosshairZoomed, boolean fullScreen) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.crosshairZoomed = this.modId + ":textures/crosshairs/" + crosshairZoomed.toLowerCase() + ".png";
            this.crosshairZoomedFullScreen = fullScreen;
            return this;
        }

        public Builder withShootSound(String shootSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.shootSound = shootSound.toLowerCase();
            return this;
        }

        public Builder withEndOfShootSound(String endOfShootSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.endOfShootSound = endOfShootSound.toLowerCase();
            return this;
        }

        public Builder withEjectSpentRoundSound(String ejectSpentRoundSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.ejectSpentRoundSound = ejectSpentRoundSound.toLowerCase();
            return this;
        }

        public Builder withSilencedShootSound(String silencedShootSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.silencedShootSound = silencedShootSound.toLowerCase();
            return this;
        }

        public Builder withBurstShootSound(String burstShootSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.burstShootSound = burstShootSound.toLowerCase();
            return this;
        }

        public Builder withSilencedBurstShootSound(String silencedBurstShootSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.silencedBurstShootSound = silencedBurstShootSound.toLowerCase();
            return this;
        }

        public Builder withReloadSound(String reloadSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.reloadSound = reloadSound.toLowerCase();
            return this;
        }

        public Builder withReloadIterationSound(String reloadIterationSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.reloadIterationSound = reloadIterationSound.toLowerCase();
            return this;
        }

        public Builder withInspectSound(String inspectSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.inspectSound = inspectSound.toLowerCase();
            return this;
        }

        public Builder withDrawSound(String drawSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.drawSound = drawSound.toLowerCase();
            return this;
        }

        public Builder withAllReloadIterationsCompletedSound(String allReloadIterationCompletedSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.allReloadIterationsCompletedSound = allReloadIterationCompletedSound.toLowerCase();
            return this;
        }

        public Builder withUnloadSound(String unloadSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.unloadSound = unloadSound.toLowerCase();
            return this;
        }

        public Builder withShootSoundVolume(float volume) {
            this.shootSoundVolume = volume;
            return this;
        }

        public Builder withSilenceShootSoundVolume(float volume) {
            this.silencedShootSoundVolume = volume;
            return this;
        }

        public Builder withExceededMaxShotsSound(String shootSound) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.exceededMaxShotsSound = shootSound.toLowerCase();
            return this;
        }

        public Builder withCreativeTab(CreativeTabs creativeTab) {
            this.creativeTab = creativeTab;
            return this;
        }

        public Builder withSpawnEntityDamage(float spawnEntityDamage) {
            this.spawnEntityDamage = spawnEntityDamage;
            return this;
        }

        public Builder withSpawnEntitySpeed(float spawnEntitySpeed) {
            this.spawnEntitySpeed = spawnEntitySpeed;
            return this;
        }

        public Builder withSpawnEntityExplosionRadius(float spawnEntityExplosionRadius) {
            this.spawnEntityExplosionRadius = spawnEntityExplosionRadius;
            return this;
        }

        public Builder withDestroyingBlocks(boolean isDestroyingBlocks) {
            this.isDestroyingBlocks = isDestroyingBlocks;
            return this;
        }

        public Builder withSpawnEntityGravityVelocity(float spawnEntityGravityVelocity) {
            this.spawnEntityGravityVelocity = spawnEntityGravityVelocity;
            return this;
        }

        public Builder withSpawnEntityParticleAgeCoefficient(float spawnEntityParticleAgeCoefficient) {
            this.spawnEntityParticleAgeCoefficient = spawnEntityParticleAgeCoefficient;
            return this;
        }

        public Builder withSpawnEntitySmokeParticleAgeCoefficient(float spawnEntitySmokeParticleAgeCoefficient) {
            this.spawnEntitySmokeParticleAgeCoefficient = spawnEntitySmokeParticleAgeCoefficient;
            return this;
        }

        public Builder withSpawnEntityExplosionParticleScaleCoefficient(float spawnEntityExplosionParticleScaleCoefficient) {
            this.spawnEntityExplosionParticleScaleCoefficient = spawnEntityExplosionParticleScaleCoefficient;
            return this;
        }

        public Builder withSpawnEntitySmokeParticleScaleCoefficient(float spawnEntitySmokeParticleScaleCoefficient) {
            this.spawnEntitySmokeParticleScaleCoefficient = spawnEntitySmokeParticleScaleCoefficient;
            return this;
        }

        public Builder withInaccuracy(float inaccuracy) {
            this.inaccuracy = inaccuracy;
            return this;
        }

        public Builder withRenderer(WeaponRenderer renderer) {
            this.renderer = renderer;
            return this;
        }

        public Builder withCompatibleBullet(ItemBullet bullet, Consumer<ModelBase> positioner) {
            this.compatibleAttachments.put(bullet, new CompatibleAttachment<Weapon>(bullet, positioner));
            return this;
        }

        public Builder withUnremovableAttachmentCategories(AttachmentCategory ... categories) {
            for (AttachmentCategory category : categories) {
                this.unremovableAttachmentCategories.add(category);
            }
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, ItemAttachment.ApplyHandler2<Weapon> applyHandler, ItemAttachment.ApplyHandler2<Weapon> removeHandler) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<Weapon>(attachment, applyHandler, removeHandler));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, BiConsumer<EntityLivingBase, ItemStack> positioning, Consumer<ModelBase> modelPositioning) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<Weapon>(attachment, positioning, modelPositioning, false));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, Consumer<RenderContext<RenderableState>> positioning, Consumer<ModelBase> modelPositioning, boolean isDefault, boolean isPermanent) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<Weapon>(attachment, positioning, modelPositioning, isDefault, isPermanent));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, BiConsumer<EntityLivingBase, ItemStack> positioning) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<Weapon>(attachment, positioning, null, false));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, Consumer<ModelBase> positioner) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<Weapon>(attachment, positioner));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, boolean isDefault, BiConsumer<EntityLivingBase, ItemStack> positioning, Consumer<ModelBase> modelPositioning) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<Weapon>(attachment, positioning, modelPositioning, isDefault));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, boolean isDefault, boolean isPermanent, BiConsumer<EntityLivingBase, ItemStack> positioning, Consumer<ModelBase> modelPositioning) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<Weapon>(attachment, positioning, modelPositioning, isDefault, isPermanent));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, boolean isDefault, Consumer<ModelBase> positioner) {
            this.compatibleAttachments.put(attachment, new CompatibleAttachment<Weapon>(attachment, positioner, isDefault));
            return this;
        }

        public Builder withSpawnEntityModel(ModelBase ammoModel) {
            this.ammoModel = ammoModel;
            return this;
        }

        public Builder withSpawnEntityModelTexture(String ammoModelTextureName) {
            this.ammoModelTextureName = this.modId + ":textures/models/" + ammoModelTextureName.toLowerCase() + ".png";
            return this;
        }

        public Builder withSpawnEntityBlockImpactHandler(ImpactHandler impactHandler) {
            this.blockImpactHandler = impactHandler;
            return this;
        }

        public Builder withShellCasingEjectEnabled(boolean shellCasingEjectEnabled) {
            this.shellCasingEjectEnabled = shellCasingEjectEnabled;
            return this;
        }

        public Builder withShellCasingModel(ModelBase shellCasingModel) {
            this.shellCasingModel = shellCasingModel;
            return this;
        }

        public Builder withShellCasingModelTexture(String shellModelTextureName) {
            this.shellCasingModelTextureName = this.modId + ":textures/models/" + shellModelTextureName.toLowerCase() + ".png";
            return this;
        }

        public Builder withShellCasingForwardOffset(float shellCasingForwardOffset) {
            this.shellCasingForwardOffset = shellCasingForwardOffset;
            return this;
        }

        public Builder withShellCasingVerticalOffset(float shellCasingVerticalOffset) {
            this.shellCasingVerticalOffset = shellCasingVerticalOffset;
            return this;
        }

        public Builder withShellCasingSideOffset(float shellCasingSideOffset) {
            this.shellCasingSideOffset = shellCasingSideOffset;
            return this;
        }

        public Builder withShellCasingSideOffsetAimed(float shellCasingSideOffsetAimed) {
            this.shellCasingSideOffsetAimed = shellCasingSideOffsetAimed;
            return this;
        }

        public Builder withShellCasingEjectDirection(ShellCasingEjectDirection shellCasingEjectDirection) {
            this.shellCasingEjectDirection = shellCasingEjectDirection;
            return this;
        }

        public Builder withPumpTimeout(long pumpTimeoutMilliseconds) {
            this.pumpTimeoutMilliseconds = pumpTimeoutMilliseconds;
            return this;
        }

        public Builder withPellets(int pellets) {
            if (pellets < 1) {
                throw new IllegalArgumentException("Pellet count must be >= 1");
            }
            this.pellets = pellets;
            return this;
        }

        public Builder withSmoke(boolean smokeEnabled) {
            this.smokeEnabled = smokeEnabled;
            return this;
        }

        public Builder withFlashIntensity(float flashIntensity) {
            if (flashIntensity < 0.0f || flashIntensity > 1.0f) {
                throw new IllegalArgumentException("Invalid flash intencity");
            }
            this.flashIntensity = flashIntensity;
            return this;
        }

        public Builder withFlashScale(Supplier<Float> flashScale) {
            this.flashScale = flashScale;
            return this;
        }

        public Builder withFlashOffsetX(Supplier<Float> flashOffsetX) {
            this.flashOffsetX = flashOffsetX;
            return this;
        }

        public Builder withFlashOffsetY(Supplier<Float> flashOffsetY) {
            this.flashOffsetY = flashOffsetY;
            return this;
        }

        public Builder withFlashTexture(String flashTexture) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.flashTexture = this.modId + ":textures/particle/" + flashTexture.toLowerCase() + ".png";
            return this;
        }

        public Builder withSmokeOffsetX(Supplier<Float> smokeOffsetX) {
            this.smokeOffsetX = smokeOffsetX;
            return this;
        }

        public Builder withSmokeOffsetY(Supplier<Float> smokeOffsetY) {
            this.smokeOffsetY = smokeOffsetY;
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

        public Builder withBleedingCoefficient(float bleedingCoefficient) {
            this.bleedingCoefficient = bleedingCoefficient;
            return this;
        }

        public Builder withExplosionParticleTexture(String explosionParticleTexture) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            if (explosionParticleTexture.endsWith(".png") && explosionParticleTexture.length() > 4) {
                explosionParticleTexture = explosionParticleTexture.substring(0, explosionParticleTexture.length() - 4);
            }
            this.explosionParticleTexture = this.modId + ":textures/particle/" + explosionParticleTexture.toLowerCase() + ".png";
            return this;
        }

        public Builder withSmokeParticleTexture(String smokeParticleTexture) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            if (smokeParticleTexture.endsWith(".png") && smokeParticleTexture.length() > 4) {
                smokeParticleTexture = smokeParticleTexture.substring(0, smokeParticleTexture.length() - 4);
            }
            this.smokeParticleTexture = this.modId + ":textures/particle/" + smokeParticleTexture.toLowerCase() + ".png";
            return this;
        }

        public Builder withScreenShaking(RenderableState state, float zRotationCoefficient) {
            ScreenShakeAnimation.Builder defaultShootingStateScreenShakingBuilder = new ScreenShakeAnimation.Builder().withState(state).withRotationAttenuation(0.5f).withTranslationAttenuation(0.05f).withZRotationCoefficient(zRotationCoefficient).withTransitionDuration(50L);
            this.screenShakingBuilders.put(RenderableState.SHOOTING, defaultShootingStateScreenShakingBuilder);
            return this;
        }

        public Builder withScreenShaking(RenderableState state, float xRotationCoefficient, float yRotationCoefficient, float zRotationCoefficient) {
            ScreenShakeAnimation.Builder defaultShootingStateScreenShakingBuilder = new ScreenShakeAnimation.Builder().withState(state).withRotationAttenuation(0.5f).withTranslationAttenuation(0.05f).withXRotationCoefficient(xRotationCoefficient).withYRotationCoefficient(yRotationCoefficient).withZRotationCoefficient(zRotationCoefficient).withTransitionDuration(50L);
            this.screenShakingBuilders.put(RenderableState.SHOOTING, defaultShootingStateScreenShakingBuilder);
            return this;
        }

        public Weapon build(ModContext modContext) {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            if (this.name == null) {
                throw new IllegalStateException("Weapon name not provided");
            }
            Gun gunConfig = modContext.getConfigurationManager().getGun(this.name);
            if (gunConfig != null) {
                this.spawnEntityDamage *= gunConfig.getDamage();
            }
            if (this.shootSound == null) {
                this.shootSound = this.name;
            }
            if (this.silencedShootSound == null) {
                this.silencedShootSound = this.shootSound;
            }
            if (this.reloadSound == null) {
                this.reloadSound = "reload";
            }
            if (this.unloadSound == null) {
                this.unloadSound = "unload";
            }
            if (this.spawnEntityClass == null) {
                this.spawnEntityClass = WeaponSpawnEntity.class;
            }
            if (this.spawnEntityWith == null) {
                int explosionParticleTextureId = modContext.registerTexture(this.explosionParticleTexture);
                int smokeParticleTextureId = modContext.registerTexture(this.smokeParticleTexture);
                this.spawnEntityWith = (weapon, player) -> {
                    WeaponSpawnEntity bullet = new WeaponSpawnEntity((Weapon)weapon, CompatibilityProvider.compatibility.world((Entity)player), (EntityLivingBase)player, this.spawnEntitySpeed, this.spawnEntityGravityVelocity, this.inaccuracy, this.spawnEntityDamage, this.spawnEntityExplosionRadius, this.isDestroyingBlocks, this.spawnEntityParticleAgeCoefficient, this.spawnEntitySmokeParticleAgeCoefficient, this.spawnEntityExplosionParticleScaleCoefficient, this.spawnEntitySmokeParticleScaleCoefficient, explosionParticleTextureId, smokeParticleTextureId, new Material[0]);
                    bullet.setPositionAndDirection();
                    return bullet;
                };
            }
            if (this.shellCasingModel == null) {
                this.shellCasingModel = new Shell();
            }
            if (this.shellCasingModelTextureName == null) {
                this.shellCasingModelTextureName = DEFAULT_SHELL_CASING_TEXTURE_NAME;
            }
            if (this.spawnShellWith == null) {
                this.spawnShellWith = (weaponInstance, player) -> {
                    EntityShellCasing shell = new EntityShellCasing((PlayerWeaponInstance)weaponInstance, CompatibilityProvider.compatibility.world((Entity)player), (EntityLivingBase)player, 0.1f, 0.05f, 20.0f);
                    shell.setPositionAndDirection();
                    return shell;
                };
            }
            if (this.crosshairRunning == null) {
                this.crosshairRunning = this.crosshair;
            }
            if (this.crosshairZoomed == null) {
                this.crosshairZoomed = this.crosshair;
            }
            if (this.blockImpactHandler == null) {
                this.blockImpactHandler = (world, player, entity, position) -> {
                    CompatibleBlockState blockState = CompatibilityProvider.compatibility.getBlockAtPosition(world, position);
                    Boolean canDestroyGlassBlocks = modContext.getConfigurationManager().getProjectiles().isDestroyGlassBlocks();
                    if (canDestroyGlassBlocks != null && canDestroyGlassBlocks.booleanValue() && CompatibilityProvider.compatibility.isGlassBlock(blockState)) {
                        CompatibilityProvider.compatibility.destroyBlock(world, position);
                    } else {
                        CompatibleTargetPoint point = new CompatibleTargetPoint(entity.field_71093_bK, position.getBlockPosX(), position.getBlockPosY(), position.getBlockPosZ(), 100.0);
                        modContext.getChannel().sendToAllAround(new BlockHitMessage(position.getBlockPosX(), position.getBlockPosY(), position.getBlockPosZ(), position.getSideHit()), point);
                        MaterialImpactSound materialImpactSound = modContext.getMaterialImpactSound(blockState, entity);
                        if (materialImpactSound != null) {
                            CompatibilityProvider.compatibility.playSound(world, position.getBlockPosX(), position.getBlockPosY(), position.getBlockPosZ(), materialImpactSound.getSound(), materialImpactSound.getVolume(), 1.0f);
                        }
                    }
                };
            }
            if (this.maxBulletsPerReload == 0) {
                this.maxBulletsPerReload = this.ammoCapacity;
            }
            if (this.maxShots.isEmpty()) {
                this.maxShots.add(Integer.MAX_VALUE);
            }
            Weapon weapon2 = new Weapon(this, modContext);
            weapon2.shootSound = modContext.registerSound(this.shootSound);
            if (this.endOfShootSound != null) {
                weapon2.endOfShootSound = modContext.registerSound(this.endOfShootSound);
            }
            weapon2.burstShootSound = modContext.registerSound(this.burstShootSound);
            weapon2.silencedBurstShootSound = modContext.registerSound(this.silencedBurstShootSound);
            weapon2.reloadSound = modContext.registerSound(this.reloadSound);
            weapon2.reloadIterationSound = modContext.registerSound(this.reloadIterationSound);
            weapon2.inspectSound = modContext.registerSound(this.inspectSound);
            weapon2.drawSound = modContext.registerSound(this.drawSound);
            weapon2.allReloadIterationsCompletedSound = modContext.registerSound(this.allReloadIterationsCompletedSound);
            weapon2.unloadSound = modContext.registerSound(this.unloadSound);
            weapon2.silencedShootSound = modContext.registerSound(this.silencedShootSound);
            if (this.ejectSpentRoundSound != null) {
                weapon2.ejectSpentRoundSound = modContext.registerSound(this.ejectSpentRoundSound);
            }
            weapon2.func_77637_a(this.creativeTab);
            weapon2.func_77655_b(this.name);
            if (this.ammo != null) {
                this.ammo.addCompatibleWeapon(weapon2);
            }
            for (ItemAttachment<Weapon> attachment : this.compatibleAttachments.keySet()) {
                attachment.addCompatibleWeapon(weapon2);
            }
            if (gunConfig == null || gunConfig.isEnabled()) {
                modContext.registerWeapon(this.name, weapon2, this.renderer);
                if (this.craftingRecipe != null && this.craftingRecipe.length >= 2) {
                    ItemStack itemStack = new ItemStack((Item)weapon2);
                    List<Object> registeredRecipe = modContext.getRecipeManager().registerShapedRecipe(weapon2, this.craftingRecipe);
                    boolean hasOres = Arrays.stream(this.craftingRecipe).anyMatch(r -> r instanceof String);
                    if (hasOres) {
                        CompatibilityProvider.compatibility.addShapedOreRecipe(itemStack, registeredRecipe.toArray());
                    } else {
                        CompatibilityProvider.compatibility.addShapedRecipe(itemStack, registeredRecipe.toArray());
                    }
                } else if (this.craftingComplexity != null) {
                    OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder().withSlotCount(9).build(this.craftingComplexity, Arrays.copyOf(this.craftingMaterials, this.craftingMaterials.length));
                    List<Object> shape = modContext.getRecipeManager().createShapedRecipe(weapon2, weapon2.getName(), optionsMetadata);
                    if (optionsMetadata.hasOres()) {
                        CompatibilityProvider.compatibility.addShapedOreRecipe(new ItemStack((Item)weapon2), shape.toArray());
                    } else {
                        CompatibilityProvider.compatibility.addShapedRecipe(new ItemStack((Item)weapon2), shape.toArray());
                    }
                } else {
                    System.err.println("!!!No recipe defined for weapon " + this.name);
                }
            }
            return weapon2;
        }
    }

    public static class ScreenShaking {
        private float zRotationCoefficient;

        public ScreenShaking(float zRotationCoefficient) {
            this.zRotationCoefficient = zRotationCoefficient;
        }

        public float getZRotationCoefficient() {
            return this.zRotationCoefficient;
        }
    }

    public static enum ShellCasingEjectDirection {
        LEFT,
        RIGHT;

    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponState;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.state.Aspect;
import com.vicmatskiv.weaponlib.state.Permit;
import com.vicmatskiv.weaponlib.state.PermitManager;
import com.vicmatskiv.weaponlib.state.StateManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WeaponReloadAspect
implements Aspect<WeaponState, PlayerWeaponInstance> {
    private static final Logger logger = LogManager.getLogger(WeaponReloadAspect.class);
    private static final long ALERT_TIMEOUT = 500L;
    private static final long INSPECT_TIMEOUT = 500L;
    private static final long UNLOAD_TIMEOUT = 1000L;
    private static final long AWAIT_FURTHER_LOAD_INSTRUCTIONS_TIMEOUT = 400L;
    private static final Set<WeaponState> allowedUpdateFromStates;
    private static Predicate<PlayerWeaponInstance> sprinting;
    private static Predicate<PlayerWeaponInstance> hasNextLoadIteration;
    private static Predicate<PlayerWeaponInstance> supportsDirectBulletLoad;
    private static Predicate<PlayerWeaponInstance> magazineAttached;
    private static Predicate<PlayerWeaponInstance> loadIterationCompleted;
    private static Predicate<PlayerWeaponInstance> allLoadIterationsCompleted;
    private static Predicate<PlayerWeaponInstance> reloadAnimationCompleted;
    private static Predicate<PlayerWeaponInstance> unloadTimeoutExpired;
    private static Predicate<PlayerWeaponInstance> awaitFurtherLoadInstructionCompleted;
    private static Predicate<PlayerWeaponInstance> loadAfterUnloadEnabled;
    private static Predicate<PlayerWeaponInstance> unloadAnimationCompleted;
    private static Predicate<PlayerWeaponInstance> prepareFirstLoadIterationAnimationCompleted;
    private Predicate<PlayerWeaponInstance> inventoryHasFreeSlots = weaponInstance -> weaponInstance.getPlayer() instanceof EntityPlayer && CompatibilityProvider.compatibility.inventoryHasFreeSlots((EntityPlayer)weaponInstance.getPlayer());
    private static Predicate<PlayerWeaponInstance> alertTimeoutExpired;
    private static Predicate<PlayerWeaponInstance> inspectTimeoutExpired;
    private static Predicate<PlayerWeaponInstance> drawingAnimationCompleted;
    private ModContext modContext;
    private PermitManager permitManager;
    private StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager;

    public WeaponReloadAspect(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setStateManager(StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager) {
        if (this.permitManager == null) {
            throw new IllegalStateException("Permit manager not initialized");
        }
        this.stateManager = stateManager.in(this).change(WeaponState.READY).to(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS).manual().in(this).change(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS).to(WeaponState.READY).when(awaitFurtherLoadInstructionCompleted).withAction(this::noFurtherLoadInstructionsReceived).automatic().in(this).change(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS).to(WeaponState.READY).withAction(this::furtherLoadInstructionsReceived).manual().in(this).change(WeaponState.READY).to(WeaponState.LOAD).when(supportsDirectBulletLoad.or(magazineAttached.negate())).withPermit((s, es) -> new LoadPermit((WeaponState)s), this.modContext.getPlayerItemInstanceRegistry()::update, this.permitManager).withAction((c, f, t, p) -> this.completeClientLoad((PlayerWeaponInstance)c, (LoadPermit)p)).manual().in(this).change(WeaponState.UNLOAD).to(WeaponState.LOAD).when(loadAfterUnloadEnabled.and(supportsDirectBulletLoad.or(magazineAttached.negate()))).withPermit((s, es) -> new LoadPermit((WeaponState)s), this.modContext.getPlayerItemInstanceRegistry()::update, this.permitManager).withAction((c, f, t, p) -> this.completeClientLoad((PlayerWeaponInstance)c, (LoadPermit)p)).manual().in(this).change(WeaponState.LOAD).to(WeaponState.READY).when(reloadAnimationCompleted.and(hasNextLoadIteration.negate())).automatic().in(this).change(WeaponState.LOAD).to(WeaponState.LOAD_ITERATION).when(hasNextLoadIteration.and(prepareFirstLoadIterationAnimationCompleted)).withAction(this::startLoadIteration).automatic().in(this).change(WeaponState.LOAD_ITERATION).to(WeaponState.LOAD_ITERATION_COMPLETED).when(loadIterationCompleted).withAction(this::completeLoadIteration).automatic().in(this).change(WeaponState.LOAD_ITERATION_COMPLETED).to(WeaponState.LOAD_ITERATION).when(hasNextLoadIteration).withAction(this::startLoadIteration).automatic().in(this).change(WeaponState.LOAD_ITERATION_COMPLETED).to(WeaponState.ALL_LOAD_ITERATIONS_COMPLETED).when(hasNextLoadIteration.negate()).automatic().in(this).change(WeaponState.ALL_LOAD_ITERATIONS_COMPLETED).to(WeaponState.READY).when(allLoadIterationsCompleted).withAction(this::completeAllLoadIterations).automatic().in(this).prepare((c, f, t) -> this.prepareUnload((PlayerWeaponInstance)c), unloadAnimationCompleted).change(WeaponState.READY).to(WeaponState.UNLOAD).when(magazineAttached.and(this.inventoryHasFreeSlots)).withPermit((s, c) -> new UnloadPermit((WeaponState)s), this.modContext.getPlayerItemInstanceRegistry()::update, this.permitManager).withAction((c, f, t, p) -> this.completeClientUnload((PlayerWeaponInstance)c, (UnloadPermit)p)).manual().in(this).change(WeaponState.UNLOAD).to(WeaponState.READY).when(loadAfterUnloadEnabled.negate().or(unloadTimeoutExpired)).automatic().in(this).change(WeaponState.READY).to(WeaponState.ALERT).when(this.inventoryHasFreeSlots.negate()).withAction(this::inventoryFullAlert).manual().in(this).change(WeaponState.ALERT).to(WeaponState.READY).when(alertTimeoutExpired).automatic().in(this).change(WeaponState.READY).to(WeaponState.INSPECTING).withAction(this::inspect).manual().in(this).change(WeaponState.INSPECTING).to(WeaponState.READY).when(inspectTimeoutExpired).automatic().in(this).change(WeaponState.READY).to(WeaponState.DRAWING).withAction(this::draw).manual().in(this).change(WeaponState.DRAWING).to(WeaponState.READY).when(drawingAnimationCompleted).automatic();
    }

    @Override
    public void setPermitManager(PermitManager permitManager) {
        this.permitManager = permitManager;
        permitManager.registerEvaluator(LoadPermit.class, PlayerWeaponInstance.class, (p, c) -> this.processLoadPermit((LoadPermit)p, (PlayerWeaponInstance)c));
        permitManager.registerEvaluator(UnloadPermit.class, PlayerWeaponInstance.class, (p, c) -> this.processUnloadPermit((UnloadPermit)p, (PlayerWeaponInstance)c));
    }

    public void reloadMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
        if (instance != null) {
            this.stateManager.changeState(this, instance, new WeaponState[]{WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS, WeaponState.READY});
        }
    }

    public void unloadMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
        if (instance != null) {
            instance.setLoadAfterUnloadEnabled(false);
            this.stateManager.changeState(this, instance, new WeaponState[]{WeaponState.UNLOAD, WeaponState.ALERT});
        }
    }

    void updateMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
        if (instance != null) {
            this.stateManager.changeStateFromAnyOf(this, instance, allowedUpdateFromStates, new WeaponState[0]);
        }
    }

    public void inspectMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
        if (instance != null) {
            this.stateManager.changeState(this, instance, new WeaponState[]{WeaponState.INSPECTING});
        }
    }

    public void drawMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
        if (instance != null) {
            this.stateManager.changeState(this, instance, new WeaponState[]{WeaponState.DRAWING});
        }
    }

    private void processLoadPermit(LoadPermit p, PlayerWeaponInstance weaponInstance) {
        ItemStack consumedStack;
        logger.debug("Processing load permit on server for {}", (Object)weaponInstance);
        ItemStack weaponItemStack = weaponInstance.getItemStack();
        if (weaponItemStack == null || !(weaponInstance.getPlayer() instanceof EntityPlayer)) {
            return;
        }
        EntityPlayer player = (EntityPlayer)weaponInstance.getPlayer();
        Permit.Status status = Permit.Status.GRANTED;
        weaponInstance.setLoadIterationCount(0);
        Weapon weapon = (Weapon)weaponInstance.getItem();
        if (CompatibilityProvider.compatibility.getTagCompound(weaponItemStack) == null) {
            CompatibilityProvider.compatibility.setTagCompound(weaponItemStack, new NBTTagCompound());
        }
        List compatibleMagazines = weapon.getCompatibleMagazines().stream().filter(compatibleMagazine -> WeaponAttachmentAspect.hasRequiredAttachments(compatibleMagazine, weaponInstance)).collect(Collectors.toList());
        List<ItemAttachment<Weapon>> compatibleBullets = weapon.getCompatibleAttachments(ItemBullet.class);
        if (!compatibleMagazines.isEmpty()) {
            ItemAttachment<Weapon> existingMagazine = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance);
            int ammo = Tags.getAmmo(weaponItemStack);
            if (existingMagazine == null) {
                ammo = 0;
                ItemStack magazineItemStack = CompatibilityProvider.compatibility.tryConsumingCompatibleItem(compatibleMagazines, (stack1, stack2) -> Integer.compare(Tags.getAmmo(stack1), Tags.getAmmo(stack2)), player);
                if (magazineItemStack != null) {
                    ammo = Tags.getAmmo(magazineItemStack);
                    Tags.setAmmo(weaponItemStack, ammo);
                    logger.debug("Setting server side ammo for {} to {}", (Object)weaponInstance, (Object)ammo);
                    WeaponAttachmentAspect.addAttachment((ItemAttachment)magazineItemStack.func_77973_b(), weaponInstance);
                    CompatibilityProvider.compatibility.playSoundToNearExcept((EntityLivingBase)player, weapon.getReloadSound(), 1.0f, 1.0f);
                } else {
                    status = Permit.Status.DENIED;
                }
            }
            weaponInstance.setAmmo(ammo);
        } else if (!compatibleBullets.isEmpty() && (consumedStack = CompatibilityProvider.compatibility.tryConsumingCompatibleItem(compatibleBullets, Math.min(weapon.getMaxBulletsPerReload(), weapon.getAmmoCapacity() - weaponInstance.getAmmo()), player, i -> true)) != null) {
            int ammo = weaponInstance.getAmmo() + CompatibilityProvider.compatibility.getStackSize(consumedStack);
            Tags.setAmmo(weaponItemStack, ammo);
            weaponInstance.setAmmo(ammo);
            if (weapon.hasIteratedLoad()) {
                weaponInstance.setLoadIterationCount(CompatibilityProvider.compatibility.getStackSize(consumedStack));
            }
            CompatibilityProvider.compatibility.playSoundToNearExcept((EntityLivingBase)player, weapon.getReloadSound(), 1.0f, 1.0f);
        } else if (CompatibilityProvider.compatibility.consumeInventoryItem(player.field_71071_by, (Item)weapon.builder.ammo)) {
            Tags.setAmmo(weaponItemStack, weapon.builder.ammoCapacity);
            weaponInstance.setAmmo(weapon.builder.ammoCapacity);
            CompatibilityProvider.compatibility.playSoundToNearExcept((EntityLivingBase)player, weapon.getReloadSound(), 1.0f, 1.0f);
        } else {
            logger.debug("No suitable ammo found for {}. Permit denied.", (Object)weaponInstance);
            status = Permit.Status.DENIED;
        }
        p.setStatus(status);
    }

    private void prepareUnload(PlayerWeaponInstance weaponInstance) {
        CompatibilityProvider.compatibility.playSound(weaponInstance.getPlayer(), weaponInstance.getWeapon().getUnloadSound(), 1.0f, 1.0f);
    }

    private void processUnloadPermit(UnloadPermit p, PlayerWeaponInstance weaponInstance) {
        logger.debug("Processing unload permit on server for {}", (Object)weaponInstance);
        if (!(weaponInstance.getPlayer() instanceof EntityPlayer)) {
            logger.warn("Not a player");
            return;
        }
        ItemStack weaponItemStack = weaponInstance.getItemStack();
        EntityPlayer player = (EntityPlayer)weaponInstance.getPlayer();
        Weapon weapon = (Weapon)weaponItemStack.func_77973_b();
        if (CompatibilityProvider.compatibility.getTagCompound(weaponItemStack) != null) {
            ItemAttachment<Weapon> attachment = this.modContext.getAttachmentAspect().removeAttachment(AttachmentCategory.MAGAZINE, weaponInstance);
            if (attachment == null) {
                p.setStatus(Permit.Status.DENIED);
                return;
            }
            if (attachment instanceof ItemMagazine) {
                ItemStack attachmentItemStack = ((ItemMagazine)attachment).createItemStack();
                Tags.setAmmo(attachmentItemStack, weaponInstance.getAmmo());
                if (!player.field_71071_by.func_70441_a(attachmentItemStack)) {
                    logger.error("Cannot add attachment " + attachment + " for " + weaponInstance + "back to the inventory");
                }
            }
            Tags.setAmmo(weaponItemStack, 0);
            weaponInstance.setAmmo(0);
            CompatibilityProvider.compatibility.playSoundToNearExcept((EntityLivingBase)player, weapon.getUnloadSound(), 1.0f, 1.0f);
            p.setStatus(Permit.Status.GRANTED);
        } else {
            p.setStatus(Permit.Status.DENIED);
        }
        p.setStatus(Permit.Status.GRANTED);
    }

    private void completeClientLoad(PlayerWeaponInstance weaponInstance, LoadPermit permit) {
        weaponInstance.setLoadAfterUnloadEnabled(false);
        if (permit == null) {
            logger.error("Permit is null, something went wrong");
            return;
        }
        if (permit.getStatus() == Permit.Status.GRANTED) {
            CompatibilityProvider.compatibility.playSound(weaponInstance.getPlayer(), weaponInstance.getWeapon().getReloadSound(), 1.0f, 1.0f);
        }
    }

    private void completeClientUnload(PlayerWeaponInstance weaponInstance, UnloadPermit p) {
        if (weaponInstance.isLoadAfterUnloadEnabled()) {
            this.stateManager.changeState(this, weaponInstance, new WeaponState[]{WeaponState.LOAD, WeaponState.ALERT});
            weaponInstance.setLoadAfterUnloadEnabled(false);
        }
    }

    public void inventoryFullAlert(PlayerWeaponInstance weaponInstance) {
        this.modContext.getStatusMessageCenter().addAlertMessage(CompatibilityProvider.compatibility.getLocalizedString("gui.inventoryFull", new Object[0]), 3, 250L, 200L);
    }

    public void inspect(PlayerWeaponInstance weaponInstance) {
        CompatibilityProvider.compatibility.playSound(weaponInstance.getPlayer(), weaponInstance.getWeapon().getInspectSound(), 1.0f, 1.0f);
    }

    public void draw(PlayerWeaponInstance weaponInstance) {
        CompatibilityProvider.compatibility.playSound(weaponInstance.getPlayer(), weaponInstance.getWeapon().getDrawSound(), 1.0f, 1.0f);
    }

    public void startLoadIteration(PlayerWeaponInstance weaponInstance) {
        CompatibilityProvider.compatibility.playSound(weaponInstance.getPlayer(), weaponInstance.getWeapon().getReloadIterationSound(), 1.0f, 1.0f);
    }

    public void completeLoadIteration(PlayerWeaponInstance weaponInstance) {
        weaponInstance.setLoadIterationCount(weaponInstance.getLoadIterationCount() - 1);
    }

    public void completeAllLoadIterations(PlayerWeaponInstance weaponInstance) {
        CompatibilityProvider.compatibility.playSound(weaponInstance.getPlayer(), weaponInstance.getWeapon().getAllReloadIterationsCompletedSound(), 1.0f, 1.0f);
    }

    public void noFurtherLoadInstructionsReceived(PlayerWeaponInstance weaponInstance) {
        this.stateManager.changeState(this, weaponInstance, new WeaponState[]{WeaponState.LOAD, WeaponState.ALERT});
    }

    public void furtherLoadInstructionsReceived(PlayerWeaponInstance weaponInstance) {
        weaponInstance.setLoadAfterUnloadEnabled(true);
        this.stateManager.changeState(this, weaponInstance, new WeaponState[]{WeaponState.UNLOAD, WeaponState.LOAD, WeaponState.ALERT});
    }

    static {
        TypeRegistry.getInstance().register(UnloadPermit.class);
        TypeRegistry.getInstance().register(LoadPermit.class);
        TypeRegistry.getInstance().register(PlayerWeaponInstance.class);
        allowedUpdateFromStates = new HashSet<WeaponState>(Arrays.asList(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS, WeaponState.LOAD_REQUESTED, WeaponState.LOAD, WeaponState.LOAD_ITERATION, WeaponState.LOAD_ITERATION_COMPLETED, WeaponState.ALL_LOAD_ITERATIONS_COMPLETED, WeaponState.UNLOAD_PREPARING, WeaponState.UNLOAD_REQUESTED, WeaponState.UNLOAD, WeaponState.ALERT, WeaponState.INSPECTING, WeaponState.DRAWING));
        sprinting = instance -> instance.getPlayer().func_70051_ag();
        hasNextLoadIteration = weaponInstance -> weaponInstance.getWeapon().hasIteratedLoad() && weaponInstance.getLoadIterationCount() > 0;
        supportsDirectBulletLoad = weaponInstance -> weaponInstance.getWeapon().getAmmoCapacity() > 0;
        magazineAttached = weaponInstance -> WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance) != null;
        loadIterationCompleted = weaponInstance -> System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + Math.max(weaponInstance.getWeapon().builder.loadIterationTimeout, weaponInstance.getWeapon().getTotalLoadIterationDuration() + 250L);
        allLoadIterationsCompleted = weaponInstance -> System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + weaponInstance.getWeapon().getAllLoadIterationAnimationsCompletedDuration();
        reloadAnimationCompleted = weaponInstance -> (double)System.currentTimeMillis() >= (double)weaponInstance.getStateUpdateTimestamp() + Math.max((double)weaponInstance.getWeapon().builder.reloadingTimeout, (double)weaponInstance.getWeapon().getTotalReloadingDuration() * 1.1);
        unloadTimeoutExpired = weaponInstance -> System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + 1000L;
        awaitFurtherLoadInstructionCompleted = weaponInstance -> System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + 400L;
        loadAfterUnloadEnabled = PlayerWeaponInstance::isLoadAfterUnloadEnabled;
        unloadAnimationCompleted = weaponInstance -> (double)System.currentTimeMillis() >= (double)weaponInstance.getStateUpdateTimestamp() + (double)weaponInstance.getWeapon().getTotalUnloadingDuration() * 1.1;
        prepareFirstLoadIterationAnimationCompleted = weaponInstance -> (double)System.currentTimeMillis() >= (double)weaponInstance.getStateUpdateTimestamp() + (double)weaponInstance.getWeapon().getPrepareFirstLoadIterationAnimationDuration() * 1.1;
        alertTimeoutExpired = instance -> System.currentTimeMillis() >= 500L + instance.getStateUpdateTimestamp();
        inspectTimeoutExpired = instance -> System.currentTimeMillis() >= 500L + instance.getStateUpdateTimestamp();
        drawingAnimationCompleted = weaponInstance -> (double)System.currentTimeMillis() >= (double)weaponInstance.getStateUpdateTimestamp() + (double)weaponInstance.getWeapon().getTotalDrawingDuration() * 1.1;
    }

    public static class LoadPermit
    extends Permit<WeaponState> {
        public LoadPermit() {
        }

        public LoadPermit(WeaponState state) {
            super(state);
        }
    }

    public static class UnloadPermit
    extends Permit<WeaponState> {
        public UnloadPermit() {
        }

        public UnloadPermit(WeaponState state) {
            super(state);
        }
    }
}


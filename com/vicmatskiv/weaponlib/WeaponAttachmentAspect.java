/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.AttachmentContainer;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponState;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.state.Aspect;
import com.vicmatskiv.weaponlib.state.Permit;
import com.vicmatskiv.weaponlib.state.PermitManager;
import com.vicmatskiv.weaponlib.state.StateManager;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class WeaponAttachmentAspect
implements Aspect<WeaponState, PlayerWeaponInstance> {
    private static final Logger logger = LogManager.getLogger(WeaponAttachmentAspect.class);
    private ModContext modContext;
    private PermitManager permitManager;
    private StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager;
    private long clickSpammingTimeout = 150L;
    private Predicate<PlayerWeaponInstance> clickSpammingPreventer = es -> System.currentTimeMillis() >= es.getStateUpdateTimestamp() + this.clickSpammingTimeout;
    private Predicate<PlayerWeaponInstance> clickSpammingPreventer2 = es -> System.currentTimeMillis() >= es.getStateUpdateTimestamp() + this.clickSpammingTimeout * 2L;
    private Collection<WeaponState> allowedUpdateFromStates = Arrays.asList(WeaponState.MODIFYING_REQUESTED);
    private static final int INVENTORY_SIZE = 36;

    WeaponAttachmentAspect(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setStateManager(StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager) {
        if (this.permitManager == null) {
            throw new IllegalStateException("Permit manager not initialized");
        }
        this.stateManager = stateManager.in(this).change(WeaponState.READY).to(WeaponState.MODIFYING).when(this.clickSpammingPreventer).withPermit((s, es) -> new EnterAttachmentModePermit((WeaponState)s), this.modContext.getPlayerItemInstanceRegistry()::update, this.permitManager).manual().in(this).change(WeaponState.MODIFYING).to(WeaponState.READY).when(this.clickSpammingPreventer2).withAction(instance -> this.permitManager.request(new ExitAttachmentModePermit(WeaponState.READY), instance, (p, e) -> {})).manual().in(this).change(WeaponState.MODIFYING).to(WeaponState.NEXT_ATTACHMENT).when(this.clickSpammingPreventer).withPermit(null, this.modContext.getPlayerItemInstanceRegistry()::update, this.permitManager).manual().in(this).change(WeaponState.NEXT_ATTACHMENT).to(WeaponState.MODIFYING).automatic();
    }

    @Override
    public void setPermitManager(PermitManager permitManager) {
        this.permitManager = permitManager;
        permitManager.registerEvaluator(EnterAttachmentModePermit.class, PlayerWeaponInstance.class, this::enterAttachmentSelectionMode);
        permitManager.registerEvaluator(ExitAttachmentModePermit.class, PlayerWeaponInstance.class, this::exitAttachmentSelectionMode);
        permitManager.registerEvaluator(ChangeAttachmentPermit.class, PlayerWeaponInstance.class, this::changeAttachment);
    }

    public void toggleClientAttachmentSelectionMode(EntityPlayer player) {
        PlayerWeaponInstance weaponInstance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
        if (weaponInstance != null) {
            this.stateManager.changeState(this, weaponInstance, new WeaponState[]{WeaponState.MODIFYING, WeaponState.READY});
        }
    }

    void updateMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
        if (instance != null) {
            this.stateManager.changeStateFromAnyOf(this, instance, this.allowedUpdateFromStates, new WeaponState[0]);
        }
    }

    private void enterAttachmentSelectionMode(EnterAttachmentModePermit permit, PlayerWeaponInstance weaponInstance) {
        logger.debug("Entering attachment mode");
        byte[] selectedAttachmentIndexes = new byte[AttachmentCategory.values.length];
        Arrays.fill(selectedAttachmentIndexes, (byte)-1);
        weaponInstance.setSelectedAttachmentIndexes(selectedAttachmentIndexes);
        permit.setStatus(Permit.Status.GRANTED);
    }

    private void exitAttachmentSelectionMode(ExitAttachmentModePermit permit, PlayerWeaponInstance weaponInstance) {
        logger.debug("Exiting attachment mode");
        weaponInstance.setSelectedAttachmentIndexes(new byte[0]);
        permit.setStatus(Permit.Status.GRANTED);
    }

    List<CompatibleAttachment<? extends AttachmentContainer>> getActiveAttachments(EntityLivingBase player, ItemStack itemStack) {
        int[] activeAttachmentsIds;
        CompatibilityProvider.compatibility.ensureTagCompound(itemStack);
        ArrayList<CompatibleAttachment<? extends AttachmentContainer>> activeAttachments = new ArrayList<CompatibleAttachment<? extends AttachmentContainer>>();
        PlayerItemInstance<?> itemInstance = this.modContext.getPlayerItemInstanceRegistry().getItemInstance(player, itemStack);
        if (!(itemInstance instanceof PlayerWeaponInstance)) {
            activeAttachmentsIds = new int[AttachmentCategory.values.length];
            for (CompatibleAttachment<Weapon> attachment : ((Weapon)itemStack.func_77973_b()).getCompatibleAttachments().values()) {
                if (!attachment.isDefault()) continue;
                activeAttachmentsIds[attachment.getAttachment().getCategory().ordinal()] = Item.func_150891_b(attachment.getAttachment());
            }
        } else {
            activeAttachmentsIds = ((PlayerWeaponInstance)itemInstance).getActiveAttachmentIds();
        }
        Weapon weapon = (Weapon)itemStack.func_77973_b();
        for (int activeIndex : activeAttachmentsIds) {
            CompatibleAttachment<Weapon> compatibleAttachment;
            Item item;
            if (activeIndex == 0 || !((item = Item.func_150899_d((int)activeIndex)) instanceof ItemAttachment) || (compatibleAttachment = weapon.getCompatibleAttachments().get(item)) == null) continue;
            activeAttachments.add(compatibleAttachment);
        }
        return activeAttachments;
    }

    void changeAttachment(AttachmentCategory attachmentCategory, PlayerWeaponInstance weaponInstance) {
        if (weaponInstance != null) {
            this.stateManager.changeState(this, weaponInstance, new ChangeAttachmentPermit(attachmentCategory), new WeaponState[]{WeaponState.NEXT_ATTACHMENT});
        }
    }

    private void changeAttachment(ChangeAttachmentPermit permit, PlayerWeaponInstance weaponInstance) {
        if (!(weaponInstance.getPlayer() instanceof EntityPlayer)) {
            return;
        }
        EntityPlayer player = (EntityPlayer)weaponInstance.getPlayer();
        AttachmentCategory attachmentCategory = permit.attachmentCategory;
        int[] originalActiveAttachmentIds = weaponInstance.getActiveAttachmentIds();
        int[] activeAttachmentIds = Arrays.copyOf(originalActiveAttachmentIds, originalActiveAttachmentIds.length);
        int activeAttachmentIdForThisCategory = activeAttachmentIds[attachmentCategory.ordinal()];
        ItemAttachment currentAttachment = null;
        if (activeAttachmentIdForThisCategory > 0) {
            currentAttachment = (ItemAttachment)Item.func_150899_d((int)activeAttachmentIdForThisCategory);
        }
        if (currentAttachment != null) {
            CompatibleAttachment<Weapon> currentCompatibleAttachment = weaponInstance.getWeapon().getCompatibleAttachments().get(currentAttachment);
            if (currentCompatibleAttachment.isPermanent()) {
                return;
            }
            if (WeaponAttachmentAspect.isAttachmentInUse(currentCompatibleAttachment.getAttachment(), weaponInstance)) {
                return;
            }
        }
        AttachmentLookupResult lookupResult = this.next(attachmentCategory, currentAttachment, weaponInstance);
        if (currentAttachment != null) {
            if (currentAttachment.getRemove() != null) {
                currentAttachment.getRemove().apply(currentAttachment, weaponInstance.getWeapon(), (EntityLivingBase)player);
            }
            if (currentAttachment.getRemove2() != null) {
                currentAttachment.getRemove2().apply(currentAttachment, weaponInstance);
            }
        }
        if (lookupResult.index >= 0) {
            ItemStack slotItemStack = player.field_71071_by.func_70301_a(lookupResult.index);
            ItemAttachment nextAttachment = (ItemAttachment)slotItemStack.func_77973_b();
            if (nextAttachment.getApply() != null) {
                nextAttachment.getApply().apply(nextAttachment, weaponInstance.getWeapon(), (EntityLivingBase)player);
            } else if (nextAttachment.getApply2() != null) {
                nextAttachment.getApply2().apply(nextAttachment, weaponInstance);
            } else if (lookupResult.compatibleAttachment.getApplyHandler() != null) {
                lookupResult.compatibleAttachment.getApplyHandler().apply(nextAttachment, weaponInstance);
            } else {
                ItemAttachment.ApplyHandler2<Weapon> handler = weaponInstance.getWeapon().getEquivalentHandler(attachmentCategory);
                if (handler != null) {
                    handler.apply(null, weaponInstance);
                }
            }
            CompatibilityProvider.compatibility.consumeInventoryItemFromSlot(player, lookupResult.index);
            activeAttachmentIds[attachmentCategory.ordinal()] = Item.func_150891_b((Item)nextAttachment);
        } else if (weaponInstance.getWeapon().isCategoryRemovable(attachmentCategory)) {
            activeAttachmentIds[attachmentCategory.ordinal()] = -1;
            ItemAttachment.ApplyHandler2<Weapon> handler = weaponInstance.getWeapon().getEquivalentHandler(attachmentCategory);
            if (handler != null) {
                handler.apply(null, weaponInstance);
            }
        } else {
            return;
        }
        if (currentAttachment != null) {
            CompatibilityProvider.compatibility.addItemToPlayerInventory(player, currentAttachment, lookupResult.index);
        }
        Tags.setAttachmentIds(weaponInstance.getItemStack(), activeAttachmentIds);
        weaponInstance.setActiveAttachmentIds(activeAttachmentIds);
    }

    private AttachmentLookupResult next(AttachmentCategory category, Item currentAttachment, PlayerWeaponInstance weaponInstance) {
        AttachmentLookupResult result = new AttachmentLookupResult();
        byte[] originallySelectedAttachmentIndexes = weaponInstance.getSelectedAttachmentIds();
        if (originallySelectedAttachmentIndexes == null || originallySelectedAttachmentIndexes.length != AttachmentCategory.values.length) {
            return result;
        }
        byte[] selectedAttachmentIndexes = Arrays.copyOf(originallySelectedAttachmentIndexes, originallySelectedAttachmentIndexes.length);
        byte activeIndex = selectedAttachmentIndexes[category.ordinal()];
        boolean isCategoryRemovable = weaponInstance.getWeapon().isCategoryRemovable(category);
        result.index = -1;
        int offset = activeIndex + 1;
        int endIndex = isCategoryRemovable ? 37 : 36;
        for (int i = 0; i < endIndex; ++i) {
            CompatibleAttachment<Weapon> compatibleAttachment;
            ItemAttachment attachmentItemFromInventory;
            int currentIndex = i + offset;
            if (currentIndex >= 36) {
                currentIndex -= 36 + (isCategoryRemovable ? 1 : 0);
            }
            logger.debug("Searching for an attachment in slot {}", (Object)currentIndex);
            if (currentIndex == -1) {
                result.index = -1;
                break;
            }
            ItemStack slotItemStack = ((EntityPlayer)weaponInstance.getPlayer()).field_71071_by.func_70301_a(currentIndex);
            if (slotItemStack == null || !(slotItemStack.func_77973_b() instanceof ItemAttachment) || (attachmentItemFromInventory = (ItemAttachment)slotItemStack.func_77973_b()).getCategory() != category || (compatibleAttachment = weaponInstance.getWeapon().getCompatibleAttachments().get(attachmentItemFromInventory)) == null || attachmentItemFromInventory == currentAttachment || !WeaponAttachmentAspect.hasRequiredAttachments(compatibleAttachment.getAttachment(), weaponInstance)) continue;
            result.index = currentIndex;
            result.compatibleAttachment = compatibleAttachment;
            break;
        }
        selectedAttachmentIndexes[category.ordinal()] = (byte)result.index;
        weaponInstance.setSelectedAttachmentIndexes(selectedAttachmentIndexes);
        return result;
    }

    public static boolean hasRequiredAttachments(ItemAttachment<Weapon> attachmentItemFromInventory, PlayerWeaponInstance weaponInstance) {
        List<ItemAttachment<Weapon>> requiredAttachments = attachmentItemFromInventory.getRequiredAttachments();
        if (requiredAttachments.isEmpty()) {
            return true;
        }
        boolean result = false;
        for (int currentAttachmentId : weaponInstance.getActiveAttachmentIds()) {
            Item attachmentItem = Item.func_150899_d((int)currentAttachmentId);
            boolean bl = result = attachmentItem != null && requiredAttachments.contains(attachmentItem);
            if (result) break;
        }
        return result;
    }

    private static boolean isAttachmentInUse(ItemAttachment<Weapon> attachmentItem, PlayerWeaponInstance weaponInstance) {
        return WeaponAttachmentAspect.isRequired(attachmentItem, weaponInstance);
    }

    private static boolean isRequired(ItemAttachment<Weapon> attachmentItem, PlayerWeaponInstance weaponInstance) {
        int currentAttachmentId;
        Item otherAttachmentItem;
        boolean result = false;
        int[] nArray = weaponInstance.getActiveAttachmentIds();
        int n = nArray.length;
        for (int i = 0; !(i >= n || (otherAttachmentItem = Item.func_150899_d((int)(currentAttachmentId = nArray[i]))) instanceof ItemAttachment && (result = ((ItemAttachment)otherAttachmentItem).getRequiredAttachments().contains(attachmentItem))); ++i) {
        }
        return result;
    }

    public static void addAttachment(ItemAttachment<Weapon> attachment, PlayerWeaponInstance weaponInstance) {
        int[] activeAttachmentsIds = weaponInstance.getActiveAttachmentIds();
        int activeAttachmentIdForThisCategory = activeAttachmentsIds[attachment.getCategory().ordinal()];
        ItemAttachment currentAttachment = null;
        if (activeAttachmentIdForThisCategory > 0) {
            currentAttachment = (ItemAttachment)Item.func_150899_d((int)activeAttachmentIdForThisCategory);
        }
        if (currentAttachment == null) {
            if (attachment != null) {
                if (attachment.getApply() != null) {
                    attachment.getApply().apply(attachment, weaponInstance.getWeapon(), weaponInstance.getPlayer());
                } else if (attachment.getApply2() != null) {
                    attachment.getApply2().apply(attachment, weaponInstance);
                }
            }
            activeAttachmentsIds[attachment.getCategory().ordinal()] = Item.func_150891_b(attachment);
        } else {
            System.err.println("Attachment of category " + (Object)((Object)attachment.getCategory()) + " installed, remove it first");
        }
    }

    ItemAttachment<Weapon> removeAttachment(AttachmentCategory attachmentCategory, PlayerWeaponInstance weaponInstance) {
        int[] activeAttachmentIds = weaponInstance.getActiveAttachmentIds();
        int activeAttachmentIdForThisCategory = activeAttachmentIds[attachmentCategory.ordinal()];
        ItemAttachment currentAttachment = null;
        if (activeAttachmentIdForThisCategory > 0 && WeaponAttachmentAspect.isAttachmentInUse(currentAttachment = (ItemAttachment)Item.func_150899_d((int)activeAttachmentIdForThisCategory), weaponInstance)) {
            return null;
        }
        if (currentAttachment != null && currentAttachment.getRemove() != null) {
            currentAttachment.getRemove().apply(currentAttachment, weaponInstance.getWeapon(), weaponInstance.getPlayer());
        }
        if (currentAttachment != null) {
            activeAttachmentIds[attachmentCategory.ordinal()] = -1;
            weaponInstance.setActiveAttachmentIds(activeAttachmentIds);
        }
        return currentAttachment;
    }

    public static ItemAttachment<Weapon> getActiveAttachment(AttachmentCategory category, PlayerWeaponInstance weaponInstance) {
        int[] activeAttachmentIds;
        ItemAttachment<Weapon> itemAttachment = null;
        for (int activeIndex : activeAttachmentIds = weaponInstance.getActiveAttachmentIds()) {
            CompatibleAttachment<Weapon> compatibleAttachment;
            Item item;
            if (activeIndex == 0 || !((item = Item.func_150899_d((int)activeIndex)) instanceof ItemAttachment) || (compatibleAttachment = weaponInstance.getWeapon().getCompatibleAttachments().get(item)) == null || category != compatibleAttachment.getAttachment().getCategory()) continue;
            itemAttachment = compatibleAttachment.getAttachment();
            break;
        }
        return itemAttachment;
    }

    static boolean isActiveAttachment(ItemAttachment<Weapon> attachment, PlayerWeaponInstance weaponInstance) {
        int[] activeAttachmentIds = weaponInstance.getActiveAttachmentIds();
        return Arrays.stream(activeAttachmentIds).anyMatch(attachmentId -> attachment == Item.func_150899_d((int)attachmentId));
    }

    boolean isSilencerOn(PlayerWeaponInstance weaponInstance) {
        int[] activeAttachmentsIds = weaponInstance.getActiveAttachmentIds();
        int activeAttachmentIdForThisCategory = activeAttachmentsIds[AttachmentCategory.SILENCER.ordinal()];
        return activeAttachmentIdForThisCategory > 0;
    }

    ItemAttachment<Weapon> getActiveAttachment(PlayerWeaponInstance weaponInstance, AttachmentCategory category) {
        return weaponInstance.getAttachmentItemWithCategory(category);
    }

    static {
        TypeRegistry.getInstance().register(EnterAttachmentModePermit.class);
        TypeRegistry.getInstance().register(ExitAttachmentModePermit.class);
        TypeRegistry.getInstance().register(ChangeAttachmentPermit.class);
    }

    public static class ChangeAttachmentPermit
    extends Permit<WeaponState> {
        AttachmentCategory attachmentCategory;

        public ChangeAttachmentPermit() {
        }

        public ChangeAttachmentPermit(AttachmentCategory attachmentCategory) {
            super(WeaponState.NEXT_ATTACHMENT);
            this.attachmentCategory = attachmentCategory;
        }

        @Override
        public void init(ByteBuf buf) {
            super.init(buf);
            this.attachmentCategory = AttachmentCategory.values()[buf.readInt()];
        }

        @Override
        public void serialize(ByteBuf buf) {
            super.serialize(buf);
            buf.writeInt(this.attachmentCategory.ordinal());
        }
    }

    public static class ExitAttachmentModePermit
    extends Permit<WeaponState> {
        public ExitAttachmentModePermit() {
        }

        public ExitAttachmentModePermit(WeaponState state) {
            super(state);
        }
    }

    public static class EnterAttachmentModePermit
    extends Permit<WeaponState> {
        public EnterAttachmentModePermit() {
        }

        public EnterAttachmentModePermit(WeaponState state) {
            super(state);
        }
    }

    private static class AttachmentLookupResult {
        CompatibleAttachment<Weapon> compatibleAttachment;
        int index = -1;

        private AttachmentLookupResult() {
        }
    }
}


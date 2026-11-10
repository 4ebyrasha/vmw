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
package com.vicmatskiv.weaponlib.melee;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.AttachmentContainer;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeState;
import com.vicmatskiv.weaponlib.melee.PlayerMeleeInstance;
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

public final class MeleeAttachmentAspect
implements Aspect<MeleeState, PlayerMeleeInstance> {
    private static final Logger logger = LogManager.getLogger(MeleeAttachmentAspect.class);
    private ModContext modContext;
    private PermitManager permitManager;
    private StateManager<MeleeState, ? super PlayerMeleeInstance> stateManager;
    private long clickSpammingTimeout = 100L;
    private Predicate<PlayerMeleeInstance> clickSpammingPreventer = es -> System.currentTimeMillis() >= es.getStateUpdateTimestamp() + this.clickSpammingTimeout;
    private Collection<MeleeState> allowedUpdateFromStates = Arrays.asList(MeleeState.MODIFYING_REQUESTED);

    public MeleeAttachmentAspect(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setStateManager(StateManager<MeleeState, ? super PlayerMeleeInstance> stateManager) {
        if (this.permitManager == null) {
            throw new IllegalStateException("Permit manager not initialized");
        }
        this.stateManager = stateManager.in(this).change(MeleeState.READY).to(MeleeState.MODIFYING).when(this.clickSpammingPreventer).withPermit((s, es) -> new EnterAttachmentModePermit((MeleeState)s), this.modContext.getPlayerItemInstanceRegistry()::update, this.permitManager).manual().in(this).change(MeleeState.MODIFYING).to(MeleeState.READY).when(this.clickSpammingPreventer).withAction(instance -> this.permitManager.request(new ExitAttachmentModePermit(MeleeState.READY), instance, (p, e) -> {})).manual().in(this).change(MeleeState.MODIFYING).to(MeleeState.NEXT_ATTACHMENT).when(this.clickSpammingPreventer).withPermit(null, this.modContext.getPlayerItemInstanceRegistry()::update, this.permitManager).manual().in(this).change(MeleeState.NEXT_ATTACHMENT).to(MeleeState.MODIFYING).automatic();
    }

    @Override
    public void setPermitManager(PermitManager permitManager) {
        this.permitManager = permitManager;
        permitManager.registerEvaluator(EnterAttachmentModePermit.class, PlayerMeleeInstance.class, this::enterAttachmentSelectionMode);
        permitManager.registerEvaluator(ExitAttachmentModePermit.class, PlayerMeleeInstance.class, this::exitAttachmentSelectionMode);
        permitManager.registerEvaluator(ChangeAttachmentPermit.class, PlayerMeleeInstance.class, this::changeAttachment);
    }

    public void toggleClientAttachmentSelectionMode(EntityPlayer player) {
        PlayerMeleeInstance weaponInstance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerMeleeInstance.class);
        if (weaponInstance != null) {
            this.stateManager.changeState(this, weaponInstance, new MeleeState[]{MeleeState.MODIFYING, MeleeState.READY});
        }
    }

    public void onUpdate(EntityPlayer player) {
        PlayerMeleeInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerMeleeInstance.class);
        if (instance != null) {
            this.stateManager.changeStateFromAnyOf(this, instance, this.allowedUpdateFromStates, new MeleeState[0]);
        }
    }

    private void enterAttachmentSelectionMode(EnterAttachmentModePermit permit, PlayerMeleeInstance weaponInstance) {
        logger.debug("Entering attachment mode");
        byte[] selectedAttachmentIndexes = new byte[AttachmentCategory.values.length];
        Arrays.fill(selectedAttachmentIndexes, (byte)-1);
        weaponInstance.setSelectedAttachmentIndexes(selectedAttachmentIndexes);
        permit.setStatus(Permit.Status.GRANTED);
    }

    private void exitAttachmentSelectionMode(ExitAttachmentModePermit permit, PlayerMeleeInstance weaponInstance) {
        logger.debug("Exiting attachment mode");
        weaponInstance.setSelectedAttachmentIndexes(new byte[0]);
        permit.setStatus(Permit.Status.GRANTED);
    }

    List<CompatibleAttachment<? extends AttachmentContainer>> getActiveAttachments(EntityLivingBase player, ItemStack itemStack) {
        int[] activeAttachmentsIds;
        CompatibilityProvider.compatibility.ensureTagCompound(itemStack);
        ArrayList<CompatibleAttachment<? extends AttachmentContainer>> activeAttachments = new ArrayList<CompatibleAttachment<? extends AttachmentContainer>>();
        PlayerItemInstance<?> itemInstance = this.modContext.getPlayerItemInstanceRegistry().getItemInstance(player, itemStack);
        if (!(itemInstance instanceof PlayerMeleeInstance)) {
            activeAttachmentsIds = new int[AttachmentCategory.values.length];
            for (CompatibleAttachment<ItemMelee> attachment : ((ItemMelee)itemStack.func_77973_b()).getCompatibleAttachments().values()) {
                if (!attachment.isDefault()) continue;
                activeAttachmentsIds[attachment.getAttachment().getCategory().ordinal()] = Item.func_150891_b(attachment.getAttachment());
            }
        } else {
            activeAttachmentsIds = ((PlayerMeleeInstance)itemInstance).getActiveAttachmentIds();
        }
        ItemMelee weapon = (ItemMelee)itemStack.func_77973_b();
        for (int activeIndex : activeAttachmentsIds) {
            CompatibleAttachment<ItemMelee> compatibleAttachment;
            Item item;
            if (activeIndex == 0 || !((item = Item.func_150899_d((int)activeIndex)) instanceof ItemAttachment) || (compatibleAttachment = weapon.getCompatibleAttachments().get(item)) == null) continue;
            activeAttachments.add(compatibleAttachment);
        }
        return activeAttachments;
    }

    public void changeAttachment(AttachmentCategory attachmentCategory, PlayerMeleeInstance weaponInstance) {
        if (weaponInstance != null) {
            this.stateManager.changeState(this, weaponInstance, new ChangeAttachmentPermit(attachmentCategory), new MeleeState[]{MeleeState.NEXT_ATTACHMENT});
        }
    }

    private void changeAttachment(ChangeAttachmentPermit permit, PlayerMeleeInstance weaponInstance) {
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
        AttachmentLookupResult lookupResult = this.next(attachmentCategory, currentAttachment, weaponInstance);
        if (currentAttachment != null) {
            if (currentAttachment.getRemove() != null) {
                currentAttachment.getRemove().apply(currentAttachment, weaponInstance.getWeapon(), (EntityLivingBase)player);
            }
            if (currentAttachment.getRemove3() != null) {
                currentAttachment.getRemove3().apply(currentAttachment, weaponInstance);
            }
        }
        if (lookupResult.index >= 0) {
            ItemStack slotItemStack = player.field_71071_by.func_70301_a(lookupResult.index);
            ItemAttachment nextAttachment = (ItemAttachment)slotItemStack.func_77973_b();
            if (nextAttachment.getApply() != null) {
                nextAttachment.getApply().apply(nextAttachment, weaponInstance.getWeapon(), (EntityLivingBase)player);
            } else if (nextAttachment.getApply3() != null) {
                nextAttachment.getApply3().apply(nextAttachment, weaponInstance);
            } else if (lookupResult.compatibleAttachment.getMeleeApplyHandler() != null) {
                lookupResult.compatibleAttachment.getMeleeApplyHandler().apply(nextAttachment, weaponInstance);
            }
            CompatibilityProvider.compatibility.consumeInventoryItemFromSlot(player, lookupResult.index);
            activeAttachmentIds[attachmentCategory.ordinal()] = Item.func_150891_b((Item)nextAttachment);
        } else {
            activeAttachmentIds[attachmentCategory.ordinal()] = -1;
        }
        if (currentAttachment != null) {
            CompatibilityProvider.compatibility.addItemToPlayerInventory(player, currentAttachment, lookupResult.index);
        }
        weaponInstance.setActiveAttachmentIds(activeAttachmentIds);
    }

    private AttachmentLookupResult next(AttachmentCategory category, Item currentAttachment, PlayerMeleeInstance weaponInstance) {
        AttachmentLookupResult result = new AttachmentLookupResult();
        byte[] originallySelectedAttachmentIndexes = weaponInstance.getSelectedAttachmentIds();
        if (originallySelectedAttachmentIndexes == null || originallySelectedAttachmentIndexes.length != AttachmentCategory.values.length) {
            return result;
        }
        byte[] selectedAttachmentIndexes = Arrays.copyOf(originallySelectedAttachmentIndexes, originallySelectedAttachmentIndexes.length);
        byte activeIndex = selectedAttachmentIndexes[category.ordinal()];
        result.index = -1;
        int offset = activeIndex + 1;
        for (int i = 0; i < 37; ++i) {
            CompatibleAttachment<ItemMelee> compatibleAttachment;
            ItemAttachment attachmentItemFromInventory;
            int currentIndex = i + offset;
            if (currentIndex >= 36) {
                currentIndex -= 37;
            }
            logger.debug("Searching for an attachment in slot {}", (Object)currentIndex);
            if (currentIndex == -1) {
                result.index = -1;
                break;
            }
            ItemStack slotItemStack = ((EntityPlayer)weaponInstance.getPlayer()).field_71071_by.func_70301_a(currentIndex);
            if (slotItemStack == null || !(slotItemStack.func_77973_b() instanceof ItemAttachment) || (attachmentItemFromInventory = (ItemAttachment)slotItemStack.func_77973_b()).getCategory() != category || (compatibleAttachment = weaponInstance.getWeapon().getCompatibleAttachments().get(attachmentItemFromInventory)) == null || attachmentItemFromInventory == currentAttachment) continue;
            result.index = currentIndex;
            result.compatibleAttachment = compatibleAttachment;
            break;
        }
        selectedAttachmentIndexes[category.ordinal()] = (byte)result.index;
        weaponInstance.setSelectedAttachmentIndexes(selectedAttachmentIndexes);
        return result;
    }

    void addAttachment(ItemAttachment<ItemMelee> attachment, PlayerMeleeInstance weaponInstance) {
        int[] activeAttachmentsIds = weaponInstance.getActiveAttachmentIds();
        int activeAttachmentIdForThisCategory = activeAttachmentsIds[attachment.getCategory().ordinal()];
        ItemAttachment currentAttachment = null;
        if (activeAttachmentIdForThisCategory > 0) {
            currentAttachment = (ItemAttachment)Item.func_150899_d((int)activeAttachmentIdForThisCategory);
        }
        if (currentAttachment == null) {
            if (attachment != null && attachment.getApply() != null) {
                attachment.getApply().apply(attachment, weaponInstance.getWeapon(), weaponInstance.getPlayer());
            }
            activeAttachmentsIds[attachment.getCategory().ordinal()] = Item.func_150891_b(attachment);
        } else {
            System.err.println("Attachment of category " + (Object)((Object)attachment.getCategory()) + " installed, remove it first");
        }
    }

    ItemAttachment<ItemMelee> removeAttachment(AttachmentCategory attachmentCategory, PlayerMeleeInstance weaponInstance) {
        int[] activeAttachmentIds = weaponInstance.getActiveAttachmentIds();
        int activeAttachmentIdForThisCategory = activeAttachmentIds[attachmentCategory.ordinal()];
        ItemAttachment currentAttachment = null;
        if (activeAttachmentIdForThisCategory > 0) {
            currentAttachment = (ItemAttachment)Item.func_150899_d((int)activeAttachmentIdForThisCategory);
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

    static ItemAttachment<ItemMelee> getActiveAttachment(AttachmentCategory category, PlayerMeleeInstance weaponInstance) {
        int[] activeAttachmentIds;
        ItemAttachment<ItemMelee> itemAttachment = null;
        for (int activeIndex : activeAttachmentIds = weaponInstance.getActiveAttachmentIds()) {
            CompatibleAttachment<ItemMelee> compatibleAttachment;
            Item item;
            if (activeIndex == 0 || !((item = Item.func_150899_d((int)activeIndex)) instanceof ItemAttachment) || (compatibleAttachment = weaponInstance.getWeapon().getCompatibleAttachments().get(item)) == null || category != compatibleAttachment.getAttachment().getCategory()) continue;
            itemAttachment = compatibleAttachment.getAttachment();
            break;
        }
        return itemAttachment;
    }

    static boolean isActiveAttachment(ItemAttachment<ItemMelee> attachment, PlayerMeleeInstance weaponInstance) {
        int[] activeAttachmentIds = weaponInstance.getActiveAttachmentIds();
        return Arrays.stream(activeAttachmentIds).anyMatch(attachmentId -> attachment == Item.func_150899_d((int)attachmentId));
    }

    ItemAttachment<ItemMelee> getActiveAttachment(PlayerMeleeInstance weaponInstance, AttachmentCategory category) {
        return weaponInstance.getAttachmentItemWithCategory(category);
    }

    static {
        TypeRegistry.getInstance().register(EnterAttachmentModePermit.class);
        TypeRegistry.getInstance().register(ExitAttachmentModePermit.class);
        TypeRegistry.getInstance().register(ChangeAttachmentPermit.class);
    }

    public static class ChangeAttachmentPermit
    extends Permit<MeleeState> {
        AttachmentCategory attachmentCategory;

        public ChangeAttachmentPermit() {
        }

        public ChangeAttachmentPermit(AttachmentCategory attachmentCategory) {
            super(MeleeState.NEXT_ATTACHMENT);
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
    extends Permit<MeleeState> {
        public ExitAttachmentModePermit() {
        }

        public ExitAttachmentModePermit(MeleeState state) {
            super(state);
        }
    }

    public static class EnterAttachmentModePermit
    extends Permit<MeleeState> {
        public EnterAttachmentModePermit() {
        }

        public EnterAttachmentModePermit(MeleeState state) {
            super(state);
        }
    }

    private static class AttachmentLookupResult {
        CompatibleAttachment<ItemMelee> compatibleAttachment;
        int index = -1;

        private AttachmentLookupResult() {
        }
    }
}


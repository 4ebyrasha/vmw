/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ArmorControlMessage;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.CustomArmor;
import com.vicmatskiv.weaponlib.EntityControlMessage;
import com.vicmatskiv.weaponlib.Inspectable;
import com.vicmatskiv.weaponlib.KeyBindings;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.Modifiable;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.Reloadable;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponState;
import com.vicmatskiv.weaponlib.animation.DebugPositioner;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleChannel;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWeaponKeyInputHandler;
import com.vicmatskiv.weaponlib.electronics.PlayerTabletInstance;
import com.vicmatskiv.weaponlib.inventory.OpenCustomPlayerInventoryGuiMessage;
import com.vicmatskiv.weaponlib.melee.MeleeState;
import com.vicmatskiv.weaponlib.melee.PlayerMeleeInstance;
import java.util.function.Function;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class WeaponKeyInputHandler
extends CompatibleWeaponKeyInputHandler {
    private CompatibleChannel channel;
    private Function<CompatibleMessageContext, EntityPlayer> entityPlayerSupplier;
    private ModContext modContext;

    public WeaponKeyInputHandler(ModContext modContext, Function<CompatibleMessageContext, EntityPlayer> entityPlayerSupplier, WeaponAttachmentAspect attachmentAspect, CompatibleChannel channel) {
        this.modContext = modContext;
        this.entityPlayerSupplier = entityPlayerSupplier;
        this.channel = channel;
    }

    @Override
    public void onCompatibleKeyInput() {
        EntityPlayer player = this.entityPlayerSupplier.apply(null);
        ItemStack itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)player);
        if (DebugPositioner.isDebugModeEnabled() && KeyBindings.upArrowKey.func_151468_f()) {
            DebugPositioner.incrementXRotation(5.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.downArrowKey.func_151468_f()) {
            DebugPositioner.incrementXRotation(-5.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.leftArrowKey.func_151468_f()) {
            DebugPositioner.incrementYRotation(5.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.rightArrowKey.func_151468_f()) {
            DebugPositioner.incrementYRotation(-5.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.jDebugKey.func_151468_f()) {
            DebugPositioner.incrementZRotation(5.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.kDebugKey.func_151468_f()) {
            DebugPositioner.incrementZRotation(-5.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.minusDebugKey.func_151468_f()) {
            DebugPositioner.incrementXPosition(-1.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.equalsDebugKey.func_151468_f()) {
            DebugPositioner.incrementXPosition(1.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.lBracketDebugKey.func_151468_f()) {
            DebugPositioner.incrementYPosition(-1.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.rBracketDebugKey.func_151468_f()) {
            DebugPositioner.incrementYPosition(1.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.semicolonDebugKey.func_151468_f()) {
            DebugPositioner.incrementZPosition(-1.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.apostropheDebugKey.func_151468_f()) {
            DebugPositioner.incrementZPosition(1.0f);
        } else if (DebugPositioner.isDebugModeEnabled() && KeyBindings.deleteDebugKey.func_151468_f()) {
            DebugPositioner.reset();
        } else if (KeyBindings.reloadKey.func_151468_f()) {
            Item item;
            if (itemStack != null && (item = itemStack.func_77973_b()) instanceof Reloadable) {
                ((Reloadable)item).reloadMainHeldItemForPlayer(player);
            }
        } else if (KeyBindings.unloadKey.func_151468_f()) {
            Item item;
            if (itemStack != null && (item = itemStack.func_77973_b()) instanceof Reloadable) {
                ((Reloadable)item).unloadMainHeldItemForPlayer(player);
            }
        } else if (KeyBindings.inspectKey.func_151468_f()) {
            Item item;
            PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
            if (instance != null && instance.getState() == WeaponState.MODIFYING) {
                instance.setAltModificationModeEnabled(!instance.isAltMofificationModeEnabled());
            } else if (itemStack != null && (item = itemStack.func_77973_b()) instanceof Inspectable) {
                ((Inspectable)item).inspectMainHeldItemForPlayer(player);
            }
        } else if (KeyBindings.laserSwitchKey.func_151468_f()) {
            PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
            if (instance != null && (instance.getState() == WeaponState.READY || instance.getState() == WeaponState.MODIFYING)) {
                instance.setLaserOn(!instance.isLaserOn());
            }
        } else if (KeyBindings.nightVisionSwitchKey.func_151468_f()) {
            ItemStack helmetStack = CompatibilityProvider.compatibility.getHelmet();
            if (helmetStack != null && helmetStack.func_77973_b() instanceof CustomArmor && ((CustomArmor)helmetStack.func_77973_b()).hasNightVision()) {
                this.modContext.getChannel().getChannel().sendToServer((IMessage)new ArmorControlMessage(true));
                NBTTagCompound tagCompound = CompatibilityProvider.compatibility.getTagCompound(helmetStack);
                boolean nightVisionOn = tagCompound != null && tagCompound.func_74767_n("nv");
                CompatibilityProvider.compatibility.playSound((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer(), nightVisionOn ? this.modContext.getNightVisionOffSound() : this.modContext.getNightVisionOnSound(), 1.0f, 1.0f);
            } else {
                PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
                if (instance != null && (instance.getState() == WeaponState.READY || instance.getState() == WeaponState.MODIFYING || instance.getState() == WeaponState.EJECT_REQUIRED)) {
                    instance.setNightVisionOn(!instance.isNightVisionOn());
                }
            }
        } else if (KeyBindings.attachmentKey.func_151468_f()) {
            if (itemStack != null && itemStack.func_77973_b() instanceof Modifiable) {
                ((Modifiable)itemStack.func_77973_b()).toggleClientAttachmentSelectionMode(player);
            }
        } else if (KeyBindings.customInventoryKey.func_151468_f()) {
            this.modContext.getChannel().getChannel().sendToServer((IMessage)new OpenCustomPlayerInventoryGuiMessage(2));
        } else if (KeyBindings.upArrowKey.func_151468_f()) {
            PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
            if (instance != null && instance.getState() == WeaponState.MODIFYING) {
                AttachmentCategory category = instance.isAltMofificationModeEnabled() ? AttachmentCategory.RAILING : AttachmentCategory.SCOPE;
                this.modContext.getAttachmentAspect().changeAttachment(category, instance);
            }
        } else if (KeyBindings.rightArrowKey.func_151468_f()) {
            PlayerItemInstance<?> instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player);
            if (instance instanceof PlayerWeaponInstance && instance.getState() == WeaponState.MODIFYING) {
                AttachmentCategory category = ((PlayerWeaponInstance)instance).isAltMofificationModeEnabled() ? AttachmentCategory.STOCK : AttachmentCategory.SKIN;
                this.modContext.getAttachmentAspect().changeAttachment(category, (PlayerWeaponInstance)instance);
            } else if (instance instanceof PlayerMeleeInstance && instance.getState() == MeleeState.MODIFYING) {
                this.modContext.getMeleeAttachmentAspect().changeAttachment(AttachmentCategory.SKIN, (PlayerMeleeInstance)instance);
            } else if (instance instanceof PlayerTabletInstance) {
                PlayerTabletInstance playerTabletInstance = (PlayerTabletInstance)instance;
                playerTabletInstance.nextActiveWatchIndex();
            }
        } else if (KeyBindings.downArrowKey.func_151468_f()) {
            PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
            if (instance != null && instance.getState() == WeaponState.MODIFYING) {
                AttachmentCategory category = instance.isAltMofificationModeEnabled() ? AttachmentCategory.GUARD : AttachmentCategory.GRIP;
                this.modContext.getAttachmentAspect().changeAttachment(category, instance);
            }
        } else if (KeyBindings.laserAttachmentKey.func_151468_f()) {
            PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
            if (instance != null && instance.getState() == WeaponState.MODIFYING) {
                AttachmentCategory category = instance.isAltMofificationModeEnabled() ? AttachmentCategory.BACKGRIP : AttachmentCategory.LASER;
                this.modContext.getAttachmentAspect().changeAttachment(category, instance);
            }
        } else if (KeyBindings.leftArrowKey.func_151468_f()) {
            PlayerItemInstance<?> instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player);
            if (instance instanceof PlayerWeaponInstance && instance.getState() == WeaponState.MODIFYING) {
                AttachmentCategory category = ((PlayerWeaponInstance)instance).isAltMofificationModeEnabled() ? AttachmentCategory.RECEIVER : AttachmentCategory.SILENCER;
                this.modContext.getAttachmentAspect().changeAttachment(category, (PlayerWeaponInstance)instance);
            } else if (instance instanceof PlayerTabletInstance) {
                PlayerTabletInstance playerTabletInstance = (PlayerTabletInstance)instance;
                playerTabletInstance.previousActiveWatchIndex();
            }
        } else if (KeyBindings.periodKey.func_151468_f()) {
            PlayerItemInstance<?> instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player);
            if (instance instanceof PlayerWeaponInstance && instance.getState() == WeaponState.MODIFYING && ((PlayerWeaponInstance)instance).isAltMofificationModeEnabled()) {
                AttachmentCategory category = AttachmentCategory.FRONTSIGHT;
                this.modContext.getAttachmentAspect().changeAttachment(category, (PlayerWeaponInstance)instance);
            }
        } else if (KeyBindings.fireModeKey.func_151468_f()) {
            PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
            if (instance != null && instance.getState() == WeaponState.READY) {
                instance.getWeapon().changeFireMode(instance);
            }
        } else if (KeyBindings.addKey.func_151468_f()) {
            PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
            if (instance != null && (instance.getState() == WeaponState.READY || instance.getState() == WeaponState.EJECT_REQUIRED)) {
                instance.getWeapon().incrementZoom(instance);
            }
        } else if (KeyBindings.subtractKey.func_151468_f()) {
            PlayerWeaponInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerWeaponInstance.class);
            if (instance != null && (instance.getState() == WeaponState.READY || instance.getState() == WeaponState.EJECT_REQUIRED)) {
                instance.getWeapon().decrementZoom(instance);
            }
        } else if (KeyBindings.proningSwitchKey.func_151468_f()) {
            this.modContext.getChannel().getChannel().sendToServer((IMessage)new EntityControlMessage((Entity)player, CompatibleExtraEntityFlags.PRONING | CompatibleExtraEntityFlags.FLIP, 0));
        }
    }
}


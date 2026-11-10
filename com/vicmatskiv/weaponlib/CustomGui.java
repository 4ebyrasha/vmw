/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Pre
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.CustomArmor;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.KeyBindings;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.StatusMessageCenter;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponState;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import com.vicmatskiv.weaponlib.compatibility.CompatibleGui;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMathHelper;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTessellator;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.electronics.ItemWirelessCamera;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class CustomGui
extends CompatibleGui {
    private static final int STATUS_BAR_BOTTOM_OFFSET = 15;
    private static final int STATUS_BAR_TOP_OFFSET = 10;
    private Minecraft mc;
    private WeaponAttachmentAspect attachmentAspect;
    private ModContext modContext;
    private ConfigurationManager.StatusBarPosition statusBarPosition;

    public CustomGui(Minecraft mc, ModContext modContext, WeaponAttachmentAspect attachmentAspect) {
        this.mc = mc;
        this.modContext = modContext;
        this.attachmentAspect = attachmentAspect;
        this.statusBarPosition = modContext.getConfigurationManager().getStatusBarPosition();
    }

    @Override
    public void onCompatibleRenderHud(RenderGameOverlayEvent.Pre event) {
        String hudTexture;
        ItemStack helmetStack;
        if (CompatibilityProvider.compatibility.getEventType(event) == RenderGameOverlayEvent.ElementType.HELMET && (helmetStack = CompatibilityProvider.compatibility.getHelmet()) != null && this.mc.field_71474_y.field_74320_O == 0 && helmetStack.func_77973_b() instanceof CustomArmor && (hudTexture = ((CustomArmor)helmetStack.func_77973_b()).getHudTexture()) != null) {
            CustomArmor armor;
            double maxShieldCapacity;
            ScaledResolution scaledResolution = CompatibilityProvider.compatibility.getResolution(event);
            int screenWidth = scaledResolution.func_78326_a();
            int screenHeight = scaledResolution.func_78328_b();
            ItemStack chestStack = CompatibilityProvider.compatibility.getItemStackFromSlot(CompatibleEntityEquipmentSlot.CHEST);
            ItemStack feetStack = CompatibilityProvider.compatibility.getItemStackFromSlot(CompatibleEntityEquipmentSlot.FEET);
            if (chestStack != null && helmetStack != null && feetStack != null && chestStack.func_77973_b() instanceof CustomArmor && helmetStack.func_77973_b() instanceof CustomArmor && feetStack.func_77973_b() instanceof CustomArmor && ((CustomArmor)chestStack.func_77973_b()).getUnlocalizedArmorSetName().equals(((CustomArmor)helmetStack.func_77973_b()).getUnlocalizedArmorSetName()) && ((CustomArmor)chestStack.func_77973_b()).getUnlocalizedArmorSetName().equals(((CustomArmor)feetStack.func_77973_b()).getUnlocalizedArmorSetName()) && (maxShieldCapacity = (armor = (CustomArmor)chestStack.func_77973_b()).getMaxShieldCapacity()) > 0.0) {
                double currentShieldCapacity = armor.getShieldCapacity(chestStack);
                this.drawShieldIndicator(armor, CompatibleMathHelper.clamp_double(currentShieldCapacity / maxShieldCapacity, 0.0, 1.0), screenWidth, screenHeight);
            }
            GL11.glPushAttrib((int)1048575);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)2896);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glEnable((int)3042);
            this.mc.field_71446_o.func_110577_a(new ResourceLocation(hudTexture));
            CustomGui.drawTexturedQuadFit(0.0, 0.0, screenWidth, screenHeight, -100.0);
            GL11.glPopAttrib();
            event.setCanceled(true);
        }
    }

    @Override
    public void onCompatibleRenderCrosshair(RenderGameOverlayEvent.Pre event) {
        if (CompatibilityProvider.compatibility.getEventType(event) != RenderGameOverlayEvent.ElementType.CROSSHAIRS) {
            return;
        }
        ItemStack itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer());
        if (itemStack == null) {
            return;
        }
        PlayerWeaponInstance weaponInstance = this.modContext.getMainHeldWeapon();
        if (weaponInstance != null) {
            String crosshair;
            Weapon weaponItem = (Weapon)itemStack.func_77973_b();
            String string = crosshair = weaponItem != null ? weaponItem.getCrosshair(weaponInstance) : null;
            if (crosshair != null) {
                ScaledResolution scaledResolution = CompatibilityProvider.compatibility.getResolution(event);
                int width = scaledResolution.func_78326_a();
                int height = scaledResolution.func_78328_b();
                FontRenderer fontRender = CompatibilityProvider.compatibility.getFontRenderer();
                this.mc.field_71460_t.func_78478_c();
                int color = 0xFFFFFF;
                GL11.glPushAttrib((int)8192);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glDisable((int)2896);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glDisable((int)3042);
                this.mc.field_71446_o.func_110577_a(new ResourceLocation(crosshair));
                if (this.isInAltModifyingState(weaponInstance)) {
                    String changeScopeMessage = CompatibilityProvider.compatibility.getLocalizedString("gui.attachmentMode.changeRailing", Keyboard.getKeyName((int)KeyBindings.upArrowKey.func_151463_i()));
                    fontRender.func_175063_a(changeScopeMessage, (float)(width / 2 - 40), 60.0f, color);
                } else if (this.isInModifyingState(weaponInstance)) {
                    String changeScopeMessage = CompatibilityProvider.compatibility.getLocalizedString("gui.attachmentMode.changeScope", Keyboard.getKeyName((int)KeyBindings.upArrowKey.func_151463_i()));
                    fontRender.func_175063_a(changeScopeMessage, (float)(width / 2 - 40), 60.0f, color);
                    String changeBarrelRigMessage = CompatibilityProvider.compatibility.getLocalizedString("gui.attachmentMode.changeBarrelRig", Keyboard.getKeyName((int)KeyBindings.leftArrowKey.func_151463_i()));
                    fontRender.func_175063_a(changeBarrelRigMessage, 10.0f, (float)(height / 2 - 10), color);
                    String changeCamoMessage = CompatibilityProvider.compatibility.getLocalizedString("gui.attachmentMode.changeCamo", Keyboard.getKeyName((int)KeyBindings.rightArrowKey.func_151463_i()));
                    fontRender.func_175063_a(changeCamoMessage, (float)(width / 2 + 60), (float)(height / 2 - 20), color);
                    String changeUnderBarrelRig = CompatibilityProvider.compatibility.getLocalizedString("gui.attachmentMode.changeUnderBarrelRig", Keyboard.getKeyName((int)KeyBindings.downArrowKey.func_151463_i()));
                    fontRender.func_175063_a(changeUnderBarrelRig, 10.0f, (float)(height - 40), color);
                    String applyLaser = CompatibilityProvider.compatibility.getLocalizedString("gui.attachmentMode.applyLaser", Keyboard.getKeyName((int)KeyBindings.laserAttachmentKey.func_151463_i()));
                    fontRender.func_175063_a(applyLaser, 150.0f, (float)(height - 100), color);
                } else {
                    String messageText;
                    StatusMessageCenter.Message message = this.modContext.getStatusMessageCenter().nextMessage();
                    if (message != null) {
                        messageText = message.getMessage();
                        if (message.isAlert()) {
                            color = 0xFFFF00;
                        }
                    } else {
                        messageText = this.getDefaultWeaponMessage(weaponInstance);
                    }
                    int x = this.getStatusBarXPosition(width, messageText, fontRender);
                    int y = this.getStatusBarYPosition(height);
                    fontRender.func_175063_a(messageText, (float)x, (float)y, color);
                }
                GL11.glPopAttrib();
                event.setCanceled(true);
            }
        } else if (itemStack.func_77973_b() instanceof ItemMagazine) {
            String messageText;
            ScaledResolution scaledResolution = CompatibilityProvider.compatibility.getResolution(event);
            int width = scaledResolution.func_78326_a();
            int height = scaledResolution.func_78328_b();
            FontRenderer fontRender = CompatibilityProvider.compatibility.getFontRenderer();
            this.mc.field_71460_t.func_78478_c();
            int color = 0xFFFFFF;
            StatusMessageCenter.Message message = this.modContext.getStatusMessageCenter().nextMessage();
            if (message != null) {
                messageText = message.getMessage();
                if (message.isAlert()) {
                    color = 0xFF0000;
                }
            } else {
                messageText = this.getDefaultMagazineMessage(itemStack);
            }
            int x = this.getStatusBarXPosition(width, messageText, fontRender);
            int y = this.getStatusBarYPosition(height);
            fontRender.func_175063_a(messageText, (float)x, (float)y, color);
            event.setCanceled(true);
        } else if (itemStack.func_77973_b() instanceof ItemWirelessCamera) {
            ScaledResolution scaledResolution = CompatibilityProvider.compatibility.getResolution(event);
            int width = scaledResolution.func_78326_a();
            int height = scaledResolution.func_78328_b();
            FontRenderer fontRender = CompatibilityProvider.compatibility.getFontRenderer();
            this.mc.field_71460_t.func_78478_c();
            int color = 0xFFFFFF;
            StatusMessageCenter.Message message = this.modContext.getStatusMessageCenter().nextMessage();
            if (message != null) {
                String messageText = message.getMessage();
                if (message.isAlert()) {
                    color = 0xFF0000;
                }
                int x = this.getStatusBarXPosition(width, messageText, fontRender);
                int y = this.getStatusBarYPosition(height);
                int stringWidth = fontRender.func_78256_a(messageText);
                if (stringWidth > 80) {
                    x = width - stringWidth - 5;
                }
                fontRender.func_175063_a(messageText, (float)x, (float)y, color);
                event.setCanceled(true);
            }
        } else if (itemStack.func_77973_b() instanceof ItemGrenade) {
            ScaledResolution scaledResolution = CompatibilityProvider.compatibility.getResolution(event);
            int width = scaledResolution.func_78326_a();
            int height = scaledResolution.func_78328_b();
            FontRenderer fontRender = CompatibilityProvider.compatibility.getFontRenderer();
            this.mc.field_71460_t.func_78478_c();
            int color = 0xFFFFFF;
            StatusMessageCenter.Message message = this.modContext.getStatusMessageCenter().nextMessage();
            if (message != null) {
                String messageText = message.getMessage();
                if (message.isAlert()) {
                    color = 0xFFFF00;
                }
                int x = this.getStatusBarXPosition(width, messageText, fontRender);
                int y = this.getStatusBarYPosition(height);
                int stringWidth = fontRender.func_78256_a(messageText);
                if (stringWidth > 80) {
                    x = width - stringWidth - 5;
                }
                fontRender.func_175063_a(messageText, (float)x, (float)y, color);
                event.setCanceled(true);
            }
        }
    }

    private void drawShieldIndicator(CustomArmor armor, double capacity, double screenWidth, double screenHeight) {
        if (!CompatibilityProvider.compatibility.isStencilEnabled(this.mc.func_147110_a())) {
            CompatibilityProvider.compatibility.enableStencil(this.mc.func_147110_a());
        }
        GL11.glEnable((int)3008);
        GL11.glEnable((int)2960);
        GL11.glPushAttrib((int)8192);
        GL11.glStencilFunc((int)519, (int)1, (int)255);
        GL11.glStencilOp((int)7680, (int)7680, (int)7681);
        GL11.glStencilMask((int)255);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
        GL11.glDepthMask((boolean)false);
        GL11.glClear((int)1024);
        this.mc.field_71446_o.func_110577_a(new ResourceLocation(armor.getShieldIndicatorMaskTextureName()));
        CustomGui.drawTexturedQuadFit((armor.getShieldIndicatorPositionX() - 1.0) * (screenWidth / 640.0), armor.getShieldIndicatorPositionY() * (screenHeight / 328.0), armor.getShieldIndicatorWidth() * (screenWidth / 640.0) + 2.0, (armor.getShieldIndicatorHeight() + 1.0) * (screenHeight / 328.0), -101.0);
        GL11.glStencilFunc((int)514, (int)1, (int)255);
        GL11.glStencilMask((int)0);
        GL11.glDepthMask((boolean)true);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)2896);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        this.mc.field_71446_o.func_110577_a(new ResourceLocation(armor.getShieldIndicatorProgressBarTextureName()));
        CustomGui.drawTexturedQuadFit((armor.getShieldIndicatorPositionX() - 1.0) * (screenWidth / 640.0), armor.getShieldIndicatorPositionY() * (screenHeight / 328.0), (armor.getShieldIndicatorWidth() + 2.0) * (screenWidth / 640.0) * capacity, (armor.getShieldIndicatorHeight() + 1.0) * (screenHeight / 328.0), -101.0);
        GL11.glPopAttrib();
        GL11.glDisable((int)3008);
        GL11.glDisable((int)2960);
    }

    private int getStatusBarXPosition(int width, String text, FontRenderer fontRender) {
        int x;
        if (this.statusBarPosition == ConfigurationManager.StatusBarPosition.BOTTOM_RIGHT || this.statusBarPosition == ConfigurationManager.StatusBarPosition.TOP_RIGHT) {
            x = width - 80;
            int stringWidth = fontRender.func_78256_a(text);
            if (stringWidth > 80) {
                x = width - stringWidth - 5;
            }
        } else {
            x = 10;
        }
        return x;
    }

    private int getStatusBarYPosition(int height) {
        int yPos;
        switch (this.statusBarPosition) {
            case TOP_RIGHT: 
            case TOP_LEFT: {
                yPos = 10;
                break;
            }
            case BOTTOM_RIGHT: 
            case BOTTOM_LEFT: {
                yPos = height - 15;
                break;
            }
            default: {
                yPos = 10;
            }
        }
        return yPos;
    }

    private String getDefaultMagazineMessage(ItemStack itemStack) {
        ItemMagazine magazine = (ItemMagazine)itemStack.func_77973_b();
        String ammoCounterMessage = CompatibilityProvider.compatibility.getLocalizedString("gui.ammoCounter", Tags.getAmmo(itemStack) + "/" + magazine.getAmmo());
        return ammoCounterMessage;
    }

    private String getDefaultWeaponMessage(PlayerWeaponInstance weaponInstance) {
        ItemMagazine magazine = (ItemMagazine)WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance);
        int totalCapacity = magazine != null ? magazine.getAmmo() : weaponInstance.getWeapon().getAmmoCapacity();
        String text = weaponInstance.getWeapon().getAmmoCapacity() == 0 && totalCapacity == 0 ? CompatibilityProvider.compatibility.getLocalizedString("gui.noMagazine", new Object[0]) : CompatibilityProvider.compatibility.getLocalizedString("gui.ammoCounter", weaponInstance.getWeapon().getCurrentAmmo(CompatibilityProvider.compatibility.clientPlayer()) + "/" + totalCapacity);
        return text;
    }

    private boolean isInModifyingState(PlayerWeaponInstance weaponInstance) {
        return weaponInstance.getState() == WeaponState.MODIFYING && !weaponInstance.isAltMofificationModeEnabled() || weaponInstance.getState() == WeaponState.MODIFYING_REQUESTED || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT_REQUESTED;
    }

    private boolean isInAltModifyingState(PlayerWeaponInstance weaponInstance) {
        return weaponInstance.isAltMofificationModeEnabled() && (weaponInstance.getState() == WeaponState.MODIFYING || weaponInstance.getState() == WeaponState.MODIFYING_REQUESTED || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT_REQUESTED);
    }

    private static void drawTexturedQuadFit(double x, double y, double width, double height, double zLevel) {
        CompatibleTessellator tessellator = CompatibleTessellator.getInstance();
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x + 0.0, y + height, zLevel, 0.0, 1.0);
        tessellator.addVertexWithUV(x + width, y + height, zLevel, 1.0, 1.0);
        tessellator.addVertexWithUV(x + width, y + 0.0, zLevel, 1.0, 0.0);
        tessellator.addVertexWithUV(x + 0.0, y + 0.0, zLevel, 0.0, 0.0);
        tessellator.draw();
    }
}


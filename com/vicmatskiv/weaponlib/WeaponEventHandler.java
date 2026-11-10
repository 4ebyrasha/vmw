/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.RenderPlayer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.client.event.FOVUpdateEvent
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.client.event.MouseEvent
 *  net.minecraftforge.client.event.RenderLivingEvent$Pre
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.Contextual;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.RenderingPhase;
import com.vicmatskiv.weaponlib.SafeGlobals;
import com.vicmatskiv.weaponlib.SpreadableExposure;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponState;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityJoinWorldEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExposureCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWeaponEventHandler;
import com.vicmatskiv.weaponlib.compatibility.Interceptors;
import com.vicmatskiv.weaponlib.grenade.PlayerGrenadeInstance;
import com.vicmatskiv.weaponlib.melee.PlayerMeleeInstance;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderLivingEvent;

public class WeaponEventHandler
extends CompatibleWeaponEventHandler {
    private SafeGlobals safeGlobals;
    private ModContext modContext;

    public WeaponEventHandler(ModContext modContext, SafeGlobals safeGlobals) {
        this.modContext = modContext;
        this.safeGlobals = safeGlobals;
    }

    @Override
    public void onCompatibleGuiOpenEvent(GuiOpenEvent event) {
        this.safeGlobals.guiOpen.set(CompatibilityProvider.compatibility.getGui(event) != null);
    }

    @Override
    public void compatibleZoom(FOVUpdateEvent event) {
        PlayerWeaponInstance instance = this.modContext.getMainHeldWeapon();
        EntityPlayer clientPlayer = CompatibilityProvider.compatibility.clientPlayer();
        if (instance != null) {
            float fov = instance.isAttachmentZoomEnabled() ? (this.safeGlobals.renderingPhase.get() == RenderingPhase.RENDER_PERSPECTIVE ? instance.getZoom() : (CompatibilityProvider.compatibility.isFlying(clientPlayer) ? 1.1f : 1.0f)) : (CompatibilityProvider.compatibility.isFlying(CompatibilityProvider.compatibility.clientPlayer()) ? 1.1f : 1.0f);
            CompatibilityProvider.compatibility.setNewFov(event, fov);
        } else {
            SpreadableExposure spreadableExposure = CompatibleExposureCapability.getExposure((Entity)CompatibilityProvider.compatibility.clientPlayer(), SpreadableExposure.class);
            if (spreadableExposure != null && spreadableExposure.getTotalDose() > 0.0f) {
                float fov = CompatibilityProvider.compatibility.isFlying(CompatibilityProvider.compatibility.clientPlayer()) ? 1.1f : 1.0f;
                CompatibilityProvider.compatibility.setNewFov(event, fov);
            }
        }
    }

    @Override
    public void onCompatibleMouse(MouseEvent event) {
        PlayerItemInstance<?> instance;
        if ((CompatibilityProvider.compatibility.getButton(event) == 0 || CompatibilityProvider.compatibility.getButton(event) == 1) && ((instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer())) instanceof PlayerWeaponInstance || instance instanceof PlayerMeleeInstance || instance instanceof PlayerGrenadeInstance)) {
            event.setCanceled(true);
        }
    }

    @Override
    public void onCompatibleHandleRenderLivingEvent(RenderLivingEvent.Pre event) {
        if (event.isCanceled() || !(CompatibilityProvider.compatibility.getEntity(event) instanceof EntityPlayer)) {
            return;
        }
        ItemStack itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand(CompatibilityProvider.compatibility.getEntity(event));
        if (itemStack != null && itemStack.func_77973_b() instanceof Weapon) {
            RenderPlayer rp = CompatibilityProvider.compatibility.getRenderer(event);
            if (itemStack != null) {
                EntityPlayer player = (EntityPlayer)CompatibilityProvider.compatibility.getEntity(event);
                PlayerItemInstance<?> instance = this.modContext.getPlayerItemInstanceRegistry().getItemInstance((EntityLivingBase)player, itemStack);
                if (instance instanceof PlayerWeaponInstance) {
                    PlayerWeaponInstance weaponInstance = (PlayerWeaponInstance)instance;
                    CompatibilityProvider.compatibility.setAimed(rp, !Interceptors.isProning(player) && (weaponInstance.isAimed() || weaponInstance.getState() == WeaponState.FIRING || weaponInstance.getState() == WeaponState.RECOILED || weaponInstance.getState() == WeaponState.PAUSED));
                }
            }
        }
    }

    @Override
    protected void onCompatibleEntityJoinedWorldEvent(CompatibleEntityJoinWorldEvent compatibleEntityJoinWorldEvent) {
        if (compatibleEntityJoinWorldEvent.getEntity() instanceof Contextual) {
            ((Contextual)compatibleEntityJoinWorldEvent.getEntity()).setContext(this.modContext);
        }
    }

    @Override
    protected ModContext getModContext() {
        return this.modContext;
    }
}


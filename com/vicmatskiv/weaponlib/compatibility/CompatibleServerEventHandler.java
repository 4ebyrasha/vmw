/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraftforge.common.capabilities.ICapabilityProvider
 *  net.minecraftforge.event.AttachCapabilitiesEvent
 *  net.minecraftforge.event.entity.EntityEvent$EntityConstructing
 *  net.minecraftforge.event.entity.EntityJoinWorldEvent
 *  net.minecraftforge.event.entity.item.ItemTossEvent
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.event.entity.living.LivingEvent$LivingUpdateEvent
 *  net.minecraftforge.event.entity.living.LivingHurtEvent
 *  net.minecraftforge.event.entity.player.PlayerDropsEvent
 *  net.minecraftforge.event.entity.player.PlayerEvent$Clone
 *  net.minecraftforge.event.entity.player.PlayerEvent$StartTracking
 *  net.minecraftforge.event.entity.player.PlayerEvent$StopTracking
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteract
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedInEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerRespawnEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ServerTickEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityJoinWorldEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExposureCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.vicmatskiv.weaponlib.compatibility.CompatibleLivingDeathEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleLivingHurtEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleLivingUpdateEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMissionCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatiblePlayerCloneEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatiblePlayerDropsEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatiblePlayerEntityInteractEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatiblePlayerRespawnEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleServerTickEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleStartTrackingEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleStopTrackingEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public abstract class CompatibleServerEventHandler {
    public abstract String getModId();

    @SubscribeEvent
    public void onItemToss(ItemTossEvent itemTossEvent) {
        this.onCompatibleItemToss(itemTossEvent);
    }

    protected abstract void onCompatibleItemToss(ItemTossEvent var1);

    @SubscribeEvent
    public final void onPlayerTickEvent(TickEvent.PlayerTickEvent event) {
        int updatedFlags;
        if (event.phase == TickEvent.Phase.END && ((updatedFlags = CompatibleExtraEntityFlags.getFlags((Entity)event.player)) & CompatibleExtraEntityFlags.PRONING) != 0) {
            this.setSize(event.player, 0.6f, 0.6f);
        }
    }

    protected void setSize(EntityPlayer entityPlayer, float width, float height) {
        if (width != entityPlayer.field_70130_N || height != entityPlayer.field_70131_O) {
            entityPlayer.field_70130_N = width;
            entityPlayer.field_70131_O = height;
            AxisAlignedBB axisalignedbb = entityPlayer.func_174813_aQ();
            entityPlayer.func_174826_a(new AxisAlignedBB(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c, axisalignedbb.field_72340_a + (double)entityPlayer.field_70130_N, axisalignedbb.field_72338_b + (double)entityPlayer.field_70131_O, axisalignedbb.field_72339_c + (double)entityPlayer.field_70130_N));
        }
    }

    @SubscribeEvent
    public void onTick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            this.onCompatibleServerTickEvent(new CompatibleServerTickEvent(event));
        }
    }

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        this.onCompatiblePlayerLoggedIn(event);
    }

    protected abstract void onCompatibleServerTickEvent(CompatibleServerTickEvent var1);

    protected abstract void onCompatiblePlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent var1);

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityPlayer) {
            ResourceLocation PLAYER_ENTITY_TRACKER = new ResourceLocation(this.getModId(), "PLAYER_ENTITY_TRACKER");
            event.addCapability(PLAYER_ENTITY_TRACKER, (ICapabilityProvider)new CompatiblePlayerEntityTrackerProvider());
            ResourceLocation extraFlagsResourceLocation = new ResourceLocation(this.getModId(), "PLAYER_ENTITY_FLAGS");
            event.addCapability(extraFlagsResourceLocation, (ICapabilityProvider)new CompatibleExtraEntityFlags());
            ResourceLocation customInventoryLocation = new ResourceLocation(this.getModId(), "PLAYER_CUSTOM_INVENTORY");
            event.addCapability(customInventoryLocation, (ICapabilityProvider)new CompatibleCustomPlayerInventoryCapability());
            ResourceLocation playerMissionsResourceLocation = new ResourceLocation(this.getModId(), "PLAYER_MISSIONS");
            event.addCapability(playerMissionsResourceLocation, (ICapabilityProvider)new CompatibleMissionCapability());
        }
        ResourceLocation exposureResourceLocation = new ResourceLocation(this.getModId(), "EXPOSURE");
        event.addCapability(exposureResourceLocation, (ICapabilityProvider)new CompatibleExposureCapability());
    }

    @SubscribeEvent
    public void onEntityConstructing(EntityEvent.EntityConstructing event) {
    }

    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent e) {
        this.onCompatibleEntityJoinWorld(new CompatibleEntityJoinWorldEvent(e));
    }

    protected abstract void onCompatibleEntityJoinWorld(CompatibleEntityJoinWorldEvent var1);

    @SubscribeEvent
    public void playerDroppedItem(PlayerDropsEvent e) {
        this.onCompatiblePlayerDropsEvent(new CompatiblePlayerDropsEvent(e));
    }

    @SubscribeEvent
    public void playerStartedTracking(PlayerEvent.StartTracking e) {
        this.onCompatiblePlayerStartedTracking(new CompatibleStartTrackingEvent(e));
    }

    @SubscribeEvent
    public void playerStoppedTracking(PlayerEvent.StopTracking e) {
    }

    @SubscribeEvent
    public void onEntityDeath(LivingDeathEvent e) {
        this.onCompatibleLivingDeathEvent(new CompatibleLivingDeathEvent(e));
    }

    @SubscribeEvent
    public void onEntityUpdate(LivingEvent.LivingUpdateEvent e) {
        this.onCompatibleLivingUpdateEvent(new CompatibleLivingUpdateEvent(e));
    }

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        this.onCompatibleLivingHurtEvent(new CompatibleLivingHurtEvent(event));
    }

    @SubscribeEvent
    public void onPlayerClone(PlayerEvent.Clone e) {
        this.onCompatiblePlayerCloneEvent(new CompatiblePlayerCloneEvent(e));
    }

    @SubscribeEvent
    public void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent e) {
        this.onCompatiblePlayerRespawnEvent(new CompatiblePlayerRespawnEvent(e));
    }

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.EntityInteract e) {
        this.onCompatiblePlayerInteractInteractEvent(new CompatiblePlayerEntityInteractEvent(e));
    }

    protected abstract void onCompatiblePlayerInteractInteractEvent(CompatiblePlayerEntityInteractEvent var1);

    protected abstract void onCompatiblePlayerStartedTracking(CompatibleStartTrackingEvent var1);

    protected abstract void onCompatiblePlayerStoppedTracking(CompatibleStopTrackingEvent var1);

    protected abstract void onCompatibleLivingUpdateEvent(CompatibleLivingUpdateEvent var1);

    protected abstract void onCompatibleLivingHurtEvent(CompatibleLivingHurtEvent var1);

    protected abstract void onCompatiblePlayerDropsEvent(CompatiblePlayerDropsEvent var1);

    protected abstract void onCompatiblePlayerCloneEvent(CompatiblePlayerCloneEvent var1);

    protected abstract void onCompatiblePlayerRespawnEvent(CompatiblePlayerRespawnEvent var1);

    protected abstract void onCompatibleLivingDeathEvent(CompatibleLivingDeathEvent var1);

    public abstract ModContext getModContext();
}


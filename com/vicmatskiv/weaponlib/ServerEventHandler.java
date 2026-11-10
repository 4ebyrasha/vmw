/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.DamageSource
 *  net.minecraftforge.event.entity.item.ItemTossEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedInEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.CommonModContext;
import com.vicmatskiv.weaponlib.Contextual;
import com.vicmatskiv.weaponlib.EntityBounceable;
import com.vicmatskiv.weaponlib.EntityControlMessage;
import com.vicmatskiv.weaponlib.EntityProjectile;
import com.vicmatskiv.weaponlib.Exposure;
import com.vicmatskiv.weaponlib.ExposureMessage;
import com.vicmatskiv.weaponlib.ItemStorage;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.SpreadableExposure;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
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
import com.vicmatskiv.weaponlib.compatibility.CompatiblePlayerRespawnEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleServerEventHandler;
import com.vicmatskiv.weaponlib.compatibility.CompatibleServerTickEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleStartTrackingEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleStopTrackingEvent;
import com.vicmatskiv.weaponlib.electronics.ItemHandheld;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventory;
import com.vicmatskiv.weaponlib.inventory.EntityInventorySyncMessage;
import com.vicmatskiv.weaponlib.mission.EntityMissionOfferingSyncMessage;
import com.vicmatskiv.weaponlib.mission.GoToLocationAction;
import com.vicmatskiv.weaponlib.mission.KillEntityAction;
import com.vicmatskiv.weaponlib.mission.MissionManager;
import com.vicmatskiv.weaponlib.mission.MissionOfferingSyncMessage;
import com.vicmatskiv.weaponlib.mission.Missions;
import com.vicmatskiv.weaponlib.mission.PlayerMissionSyncMessage;
import com.vicmatskiv.weaponlib.tracking.PlayerEntityTracker;
import com.vicmatskiv.weaponlib.tracking.SyncPlayerEntityTrackerMessage;
import java.util.Collection;
import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServerEventHandler
extends CompatibleServerEventHandler {
    private static final Logger logger = LogManager.getLogger(ServerEventHandler.class);
    private ModContext modContext;
    private String modId;

    public ServerEventHandler(ModContext modContext, String modId) {
        this.modContext = modContext;
        this.modId = modId;
    }

    @Override
    public ModContext getModContext() {
        return this.modContext;
    }

    @Override
    protected void onCompatibleServerTickEvent(CompatibleServerTickEvent e) {
        CommonModContext.currentContext.set(this.modContext);
    }

    @Override
    protected void onCompatibleLivingUpdateEvent(CompatibleLivingUpdateEvent e) {
        if (!CompatibilityProvider.compatibility.world((Entity)e.getEntity()).field_72995_K) {
            NBTTagCompound doseNbt = null;
            ItemStack itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand(e.getEntityLiving());
            if (itemStack != null && itemStack.func_77973_b() instanceof ItemHandheld) {
                CompatibilityProvider.compatibility.ensureTagCompound(itemStack);
                doseNbt = CompatibilityProvider.compatibility.getTagCompound(itemStack);
            }
            boolean effectiveUpdate = false;
            Collection<? extends Exposure> exposures = CompatibleExposureCapability.getExposures(e.getEntity());
            Iterator<? extends Exposure> iterator = exposures.iterator();
            while (iterator.hasNext()) {
                Exposure exposure = iterator.next();
                exposure.update(e.getEntity());
                if (doseNbt != null && exposure instanceof SpreadableExposure) {
                    doseNbt.func_74776_a("dose", ((SpreadableExposure)exposure).getLastDose());
                }
                if (exposure.isEffective(CompatibilityProvider.compatibility.world(e.getEntity()))) continue;
                System.out.println("Removing expired exposure " + exposure);
                iterator.remove();
                effectiveUpdate = true;
            }
            if (effectiveUpdate) {
                CompatibleExposureCapability.updateExposures(e.getEntity(), exposures);
            }
            long lastExposuresUpdateTimestamp = CompatibleExposureCapability.getLastUpdateTimestamp(e.getEntity());
            long lastSyncTimestamp = CompatibleExposureCapability.getLastSyncTimestamp(e.getEntity());
            if (lastSyncTimestamp + 5L < CompatibilityProvider.compatibility.world(e.getEntity()).func_82737_E() && e.getEntity() instanceof EntityPlayerMP) {
                this.modContext.getChannel().getChannel().sendTo((IMessage)new ExposureMessage(exposures), (EntityPlayerMP)e.getEntity());
                CompatibleExposureCapability.setLastSyncTimestamp(e.getEntity(), CompatibilityProvider.compatibility.world(e.getEntity()).func_82737_E());
            }
            if (e.getEntity() instanceof EntityPlayer) {
                Missions.update((EntityPlayer)e.getEntity(), new GoToLocationAction((float)e.getEntity().field_70165_t, (float)e.getEntity().field_70163_u, (float)e.getEntity().field_70161_v, 0.0f), this.modContext);
            }
        }
    }

    @Override
    protected void onCompatibleItemToss(ItemTossEvent itemTossEvent) {
    }

    @Override
    protected void onCompatibleEntityJoinWorld(CompatibleEntityJoinWorldEvent e) {
        if (e.getEntity() instanceof Contextual) {
            ((Contextual)e.getEntity()).setContext(this.modContext);
        }
        if (e.getEntity() instanceof EntityPlayerMP && !e.getWorld().field_72995_K) {
            logger.debug("Player {} joined the world", (Object)e.getEntity());
            PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityLivingBase)((EntityPlayer)e.getEntity()));
            if (tracker != null) {
                this.modContext.getChannel().getChannel().sendTo((IMessage)new SyncPlayerEntityTrackerMessage(tracker), (EntityPlayerMP)e.getEntity());
            }
            EntityPlayer player = (EntityPlayer)e.getEntity();
            this.modContext.getChannel().getChannel().sendTo((IMessage)new EntityControlMessage((Entity)player, CompatibleExtraEntityFlags.getFlags((Entity)player)), (EntityPlayerMP)e.getEntity());
            this.modContext.getChannel().getChannel().sendToAll((IMessage)new EntityInventorySyncMessage(e.getEntity(), CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase)player), false));
            this.modContext.getChannel().getChannel().sendTo((IMessage)new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions((Entity)player)), (EntityPlayerMP)e.getEntity());
        }
    }

    @Override
    protected void onCompatiblePlayerStartedTracking(CompatibleStartTrackingEvent e) {
        if (e.getTarget() instanceof EntityPlayer && !CompatibilityProvider.compatibility.world((Entity)e.getTarget()).field_72995_K) {
            this.modContext.getChannel().getChannel().sendTo((IMessage)new EntityInventorySyncMessage(e.getTarget(), CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase)e.getTarget()), false), (EntityPlayerMP)e.getPlayer());
            System.out.println("Player " + e.getPlayer() + " started tracking " + e.getTarget());
            return;
        }
        if (e.getTarget() instanceof EntityProjectile || e.getTarget() instanceof EntityBounceable) {
            return;
        }
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityLivingBase)((EntityPlayer)e.getEntity()));
        if (tracker != null && tracker.updateTrackableEntity(e.getTarget())) {
            logger.debug("Player {} started tracking {} with uuid {}", (Object)e.getPlayer(), (Object)e.getTarget(), (Object)e.getTarget().func_110124_au());
            this.modContext.getChannel().getChannel().sendTo((IMessage)new SyncPlayerEntityTrackerMessage(tracker), (EntityPlayerMP)e.getPlayer());
            EntityPlayer player = (EntityPlayer)e.getEntity();
            this.modContext.getChannel().getChannel().sendTo((IMessage)new EntityControlMessage((Entity)player, CompatibleExtraEntityFlags.getFlags((Entity)player)), (EntityPlayerMP)e.getEntity());
            this.modContext.getChannel().getChannel().sendTo((IMessage)new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions((Entity)player)), (EntityPlayerMP)e.getEntity());
        }
    }

    @Override
    protected void onCompatiblePlayerStoppedTracking(CompatibleStopTrackingEvent e) {
        if (e.getTarget() instanceof EntityProjectile || e.getTarget() instanceof EntityBounceable) {
            return;
        }
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityLivingBase)((EntityPlayer)e.getEntity()));
        if (tracker != null && tracker.updateTrackableEntity(e.getTarget())) {
            logger.debug("Player {} stopped tracking {}", (Object)e.getPlayer(), (Object)e.getTarget());
            this.modContext.getChannel().getChannel().sendTo((IMessage)new SyncPlayerEntityTrackerMessage(tracker), (EntityPlayerMP)e.getPlayer());
            EntityPlayer player = (EntityPlayer)e.getEntity();
            this.modContext.getChannel().getChannel().sendTo((IMessage)new EntityControlMessage((Entity)player, CompatibleExtraEntityFlags.getFlags((Entity)player)), (EntityPlayerMP)e.getEntity());
            this.modContext.getChannel().getChannel().sendTo((IMessage)new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions((Entity)player)), (EntityPlayerMP)e.getEntity());
        }
    }

    @Override
    protected void onCompatibleLivingDeathEvent(CompatibleLivingDeathEvent event) {
        DamageSource damageSource;
        EntityLivingBase entity = event.getEntity();
        if (!CompatibilityProvider.compatibility.world((Entity)entity).field_72995_K && (damageSource = event.getDamageSource()).func_76346_g() instanceof EntityPlayer) {
            Missions.update((EntityPlayer)damageSource.func_76346_g(), new KillEntityAction((Entity)entity), this.modContext);
        }
        if (entity instanceof EntityPlayer && !CompatibilityProvider.compatibility.world((Entity)entity).field_72995_K && !CompatibilityProvider.compatibility.getGameRulesBooleanValue(CompatibilityProvider.compatibility.world((Entity)entity).func_82736_K(), "keepInventory")) {
            CustomPlayerInventory inventory = CompatibleCustomPlayerInventoryCapability.getInventory(entity);
            for (int slotIndex = 0; slotIndex < inventory.func_70302_i_(); ++slotIndex) {
                ItemStack stackInSlot = inventory.func_70301_a(slotIndex);
                if (stackInSlot == null) continue;
                CompatibilityProvider.compatibility.dropItem((EntityPlayer)entity, stackInSlot, true, false);
                inventory.func_70299_a(slotIndex, null);
            }
        }
    }

    @Override
    public String getModId() {
        return this.modId;
    }

    @Override
    protected void onCompatibleLivingHurtEvent(CompatibleLivingHurtEvent e) {
        CustomPlayerInventory inventory = CompatibleCustomPlayerInventoryCapability.getInventory(e.getEntityLiving());
        if (inventory != null && inventory.func_70301_a(1) != null) {
            CompatibilityProvider.compatibility.applyArmor(e, e.getEntityLiving(), new ItemStack[]{inventory.func_70301_a(1)}, e.getDamageSource(), e.getAmount());
        }
    }

    @Override
    protected void onCompatiblePlayerDropsEvent(CompatiblePlayerDropsEvent e) {
        Iterator<EntityItem> it = e.getDrops().iterator();
        while (it.hasNext()) {
            EntityItem entityItem = it.next();
            if (!(CompatibilityProvider.compatibility.getEntityItem(entityItem).func_77973_b() instanceof ItemStorage)) continue;
            it.remove();
        }
    }

    @Override
    protected void onCompatiblePlayerCloneEvent(CompatiblePlayerCloneEvent compatiblePlayerCloneEvent) {
        CustomPlayerInventory originalInventory = CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase)compatiblePlayerCloneEvent.getOriginalPlayer());
        if (originalInventory != null) {
            CompatibleCustomPlayerInventoryCapability.setInventory((EntityLivingBase)compatiblePlayerCloneEvent.getPlayer(), originalInventory);
            originalInventory.setContext(this.modContext);
            originalInventory.setOwner(compatiblePlayerCloneEvent.getPlayer());
        }
    }

    @Override
    protected void onCompatiblePlayerRespawnEvent(CompatiblePlayerRespawnEvent compatiblePlayerRespawnEvent) {
        this.modContext.getChannel().getChannel().sendToAll((IMessage)new EntityInventorySyncMessage((Entity)compatiblePlayerRespawnEvent.getPlayer(), CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase)compatiblePlayerRespawnEvent.getPlayer()), false));
    }

    @Override
    protected void onCompatiblePlayerInteractInteractEvent(CompatiblePlayerEntityInteractEvent compatiblePlayerInteractEvent) {
    }

    @Override
    protected void onCompatiblePlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent e) {
        MissionManager missionManager = this.modContext.getMissionManager();
        if (missionManager != null) {
            this.modContext.getChannel().getChannel().sendTo((IMessage)new MissionOfferingSyncMessage(missionManager.getOfferings()), (EntityPlayerMP)e.player);
            this.modContext.getChannel().getChannel().sendTo((IMessage)new EntityMissionOfferingSyncMessage(missionManager.getEntityMissionOfferings()), (EntityPlayerMP)e.player);
        }
    }
}


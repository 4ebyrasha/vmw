/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.Cache
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.util.concurrent.UncheckedExecutionException
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.PlayerItemInstanceFactory;
import com.vicmatskiv.weaponlib.SyncManager;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.state.ManagedState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerItemInstanceRegistry {
    private static final int CACHE_EXPIRATION_TIMEOUT_SECONDS = 5;
    private static final Logger logger = LogManager.getLogger(PlayerItemInstanceRegistry.class);
    private Map<UUID, Map<Integer, PlayerItemInstance<?>>> registry = new HashMap();
    private SyncManager<?> syncManager;
    private Cache<ItemStack, Optional<PlayerItemInstance<?>>> itemStackInstanceCache;

    public PlayerItemInstanceRegistry(SyncManager<?> syncManager) {
        this.syncManager = syncManager;
        this.itemStackInstanceCache = CacheBuilder.newBuilder().weakKeys().maximumSize(1000L).expireAfterAccess(5L, TimeUnit.SECONDS).build();
    }

    public <T extends PlayerItemInstance<S>, S extends ManagedState<S>> T getMainHandItemInstance(EntityLivingBase player, Class<T> targetClass) {
        if (player == null && !(player instanceof EntityPlayer)) {
            return null;
        }
        PlayerItemInstance<?> instance = this.getItemInstance((EntityPlayer)player, CompatibilityProvider.compatibility.getCurrentInventoryItemIndex((EntityPlayer)player));
        return (T)(targetClass.isInstance(instance) ? (PlayerItemInstance)targetClass.cast(instance) : null);
    }

    public PlayerItemInstance<?> getMainHandItemInstance(EntityLivingBase player) {
        if (player == null && !(player instanceof EntityPlayer)) {
            return null;
        }
        return this.getItemInstance((EntityPlayer)player, CompatibilityProvider.compatibility.getCurrentInventoryItemIndex((EntityPlayer)player));
    }

    public PlayerItemInstance<?> getItemInstance(EntityPlayer player, int slot) {
        Map slotInstances = this.registry.computeIfAbsent(player.getPersistentID(), p -> new HashMap());
        PlayerItemInstance<?> result = (PlayerItemInstance<?>)slotInstances.get(slot);
        if (result == null) {
            result = this.createItemInstance((EntityLivingBase)player, slot);
            if (result != null) {
                ItemStack slotItemStack = CompatibilityProvider.compatibility.getInventoryItemStack(player, slot);
                if (slotItemStack != null) {
                    Tags.setInstanceUuid(slotItemStack, result.getUuid());
                }
                slotInstances.put(slot, result);
                this.syncManager.watch(result);
                if (result.getUpdateId() == 0L) {
                    result.markDirty();
                }
            }
        } else {
            ItemStack slotItemStack = CompatibilityProvider.compatibility.getInventoryItemStack(player, slot);
            if (!(slotItemStack == null || slotItemStack.func_77973_b() == result.getItem() && result.getUuid().equals(Tags.getInstanceUuid(slotItemStack)))) {
                this.syncManager.unwatch(result);
                result = this.createItemInstance((EntityLivingBase)player, slot);
                if (result != null) {
                    Tags.setInstanceUuid(slotItemStack, result.getUuid());
                    slotInstances.put(slot, result);
                    this.syncManager.watch(result);
                    if (result.getUpdateId() == 0L) {
                        result.markDirty();
                    }
                }
            }
            if (result != null && result.getItemInventoryIndex() != slot) {
                logger.warn("Invalid instance slot id, correcting...");
                result.setItemInventoryIndex(slot);
            }
            if (result != null && result.getPlayer() != player) {
                logger.warn("Invalid player " + result.getPlayer() + " associated with instance in slot, changing to {}", (Object)player);
                result.setPlayer((EntityLivingBase)player);
            }
        }
        return result;
    }

    private boolean isSameItem(PlayerItemInstance<?> instance1, PlayerItemInstance<?> instance2) {
        return Item.func_150891_b((Item)instance1.getItem()) == Item.func_150891_b((Item)instance2.getItem());
    }

    public <S extends ManagedState<S>, T extends PlayerItemInstance<S>> boolean update(S newManagedState, T extendedStateToMerge) {
        PlayerItemInstance<?> currentState;
        Map<Integer, PlayerItemInstance<?>> slotContexts = this.registry.get(extendedStateToMerge.getPlayer().func_110124_au());
        boolean result = false;
        if (slotContexts != null && (currentState = slotContexts.get(extendedStateToMerge.getItemInventoryIndex())) != null && this.isSameItem(currentState, extendedStateToMerge)) {
            extendedStateToMerge.setState(newManagedState);
            if (newManagedState.commitPhase() != null) {
                currentState.prepareTransaction(extendedStateToMerge);
            } else {
                currentState.updateWith(extendedStateToMerge, true);
            }
            result = true;
        }
        return result;
    }

    private PlayerItemInstance<?> createItemInstance(EntityLivingBase entityLivingBase, int slot) {
        if (!(entityLivingBase instanceof EntityPlayer)) {
            return null;
        }
        EntityPlayer player = (EntityPlayer)entityLivingBase;
        ItemStack itemStack = CompatibilityProvider.compatibility.getInventoryItemStack(player, slot);
        PlayerItemInstance<Object> result = null;
        if (itemStack != null && itemStack.func_77973_b() instanceof PlayerItemInstanceFactory) {
            try {
                logger.debug("Deserializing instance for slot {} from stack {}", (Object)slot, (Object)itemStack);
                result = Tags.getInstance(itemStack);
                logger.debug("Deserialized instance {} for slot {} from stack {}", result, (Object)slot, (Object)itemStack);
            }
            catch (RuntimeException e) {
                logger.debug("Failed to deserialize instance from {}", (Object)itemStack);
            }
            if (result == null) {
                logger.debug("Creating instance for slot {} from stack {}", (Object)slot, (Object)itemStack);
                result = ((PlayerItemInstanceFactory)itemStack.func_77973_b()).createItemInstance((EntityLivingBase)player, itemStack, slot);
                result.markClean();
            }
            result.setItemInventoryIndex(slot);
            result.setPlayer((EntityLivingBase)player);
        }
        return result;
    }

    public PlayerItemInstance<?> getItemInstance(EntityLivingBase player, ItemStack itemStack) {
        Optional result = Optional.empty();
        try {
            result = (Optional)this.itemStackInstanceCache.get((Object)itemStack, () -> {
                logger.debug("ItemStack {} not found in cache, initializing...", (Object)itemStack);
                PlayerItemInstance<Object> instance = null;
                int slot = -1;
                if (CompatibilityProvider.compatibility.clientPlayer() == player) {
                    slot = CompatibilityProvider.compatibility.getInventorySlot((EntityPlayer)player, itemStack);
                }
                if (slot >= 0) {
                    instance = this.getItemInstance((EntityPlayer)player, slot);
                    logger.debug("Resolved item stack instance {} in slot {}", instance, (Object)slot);
                }
                if (instance == null || instance.getItem() != itemStack.func_77973_b()) {
                    try {
                        instance = Tags.getInstance(itemStack);
                    }
                    catch (RuntimeException e) {
                        logger.error("Failed to deserialize instance from stack {}: {}", (Object)itemStack, (Object)e.toString());
                    }
                }
                if ((instance == null || instance.getItem() != itemStack.func_77973_b()) && itemStack.func_77973_b() instanceof PlayerItemInstanceFactory) {
                    logger.debug("Creating temporary item stack instance {}", instance);
                    instance = ((PlayerItemInstanceFactory)itemStack.func_77973_b()).createItemInstance(player, itemStack, -1);
                    instance.setPlayer(player);
                }
                return Optional.ofNullable(instance);
            });
        }
        catch (UncheckedExecutionException | ExecutionException e) {
            logger.error("Failed to initialize cache instance from {}", (Object)itemStack, (Object)e.getCause());
        }
        return result.orElse(null);
    }

    public void update(EntityPlayer player) {
        if (player == null) {
            return;
        }
        Map<Integer, PlayerItemInstance<?>> slotContexts = this.registry.get(player.getPersistentID());
        if (slotContexts != null) {
            Iterator<Map.Entry<Integer, PlayerItemInstance<?>>> it = slotContexts.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, PlayerItemInstance<?>> e = it.next();
                ItemStack slotStack = CompatibilityProvider.compatibility.getInventoryItemStack(player, e.getKey());
                if (slotStack != null && slotStack.func_77973_b() == e.getValue().getItem() && e.getValue().getUuid().equals(Tags.getInstanceUuid(slotStack))) continue;
                logger.debug("Removing {} from slot {}", e.getValue(), (Object)e.getKey());
                this.syncManager.unwatch(e.getValue());
                it.remove();
            }
        }
    }
}


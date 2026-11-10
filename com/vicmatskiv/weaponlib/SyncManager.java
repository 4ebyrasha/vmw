/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.state.ManagedState;
import com.vicmatskiv.weaponlib.state.Permit;
import com.vicmatskiv.weaponlib.state.PermitManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SyncManager<S extends ManagedState<S>> {
    private static final Logger logger = LogManager.getLogger(SyncManager.class);
    private PermitManager permitManager;
    private Map<PlayerItemInstance<?>, Long> watchables = new LinkedHashMap();
    private long syncTimeout = 10000L;

    public SyncManager(PermitManager permitManager) {
        this.permitManager = permitManager;
        this.permitManager.registerEvaluator(Permit.class, PlayerItemInstance.class, this::syncOnServer);
    }

    private void syncOnServer(Permit<S> permit, PlayerItemInstance<S> instance) {
        logger.debug("Syncing {} in state {} on server", instance, instance.getState());
        ItemStack itemStack = instance.getItemStack();
        if (itemStack != null) {
            if (instance.getItem() == itemStack.func_77973_b()) {
                logger.debug("Stored instance {} of {} in stack {}", instance, (Object)instance.getItem(), (Object)itemStack);
                instance.reconcile();
                Tags.setInstance(itemStack, instance);
            } else {
                logger.debug("Item mismatch, expected: {}, actual: {}", (Object)instance.getItem().func_77658_a(), (Object)itemStack.func_77973_b().func_77658_a());
            }
        }
    }

    public void watch(PlayerItemInstance<?> watchableInstance) {
        this.watchables.put(watchableInstance, watchableInstance.getUpdateId());
    }

    public void unwatch(PlayerItemInstance<?> watchableInstance) {
        this.watchables.remove(watchableInstance);
    }

    public void run() {
        List<PlayerItemInstance> instancesToUpdate = this.watchables.entrySet().stream().filter(e -> ((PlayerItemInstance)e.getKey()).getUpdateId() != ((Long)e.getValue()).longValue() && ((PlayerItemInstance)e.getKey()).getSyncStartTimestamp() + this.syncTimeout < System.currentTimeMillis()).map(e -> (PlayerItemInstance)e.getKey()).collect(Collectors.toList());
        instancesToUpdate.forEach(this::sync);
    }

    private void sync(PlayerItemInstance<?> watchable) {
        logger.debug("Syncing {} in state {} with update id {} to server", watchable, watchable.getState(), (Object)watchable.getUpdateId());
        long updateId = watchable.getUpdateId();
        watchable.setSyncStartTimestamp(System.currentTimeMillis());
        this.permitManager.request(new Permit(watchable.getState()), watchable, (p, e) -> {
            this.watchables.put(watchable, updateId);
            watchable.setSyncStartTimestamp(0L);
            logger.debug("Completed syncing {} with update id {}", (Object)watchable, (Object)updateId);
        });
    }
}


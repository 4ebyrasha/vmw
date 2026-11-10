/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.MagazineState;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerMagazineInstance;
import com.vicmatskiv.weaponlib.Tags;
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
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class MagazineReloadAspect
implements Aspect<MagazineState, PlayerMagazineInstance> {
    private static final Set<MagazineState> allowedUpdateFromStates;
    private static long reloadAnimationDuration;
    private static Predicate<PlayerMagazineInstance> reloadAnimationCompleted;
    private ModContext modContext;
    private PermitManager permitManager;
    private StateManager<MagazineState, ? super PlayerMagazineInstance> stateManager;
    private Predicate<PlayerMagazineInstance> notFull = instance -> {
        boolean result = Tags.getAmmo(instance.getItemStack()) < instance.getMagazine().getAmmo();
        return result;
    };

    public MagazineReloadAspect(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setStateManager(StateManager<MagazineState, ? super PlayerMagazineInstance> stateManager) {
        if (this.permitManager == null) {
            throw new IllegalStateException("Permit manager not initialized");
        }
        this.stateManager = stateManager.in(this).change(MagazineState.READY).to(MagazineState.LOAD).when(this.notFull).withPermit((s, es) -> new LoadPermit((MagazineState)s), this.modContext.getPlayerItemInstanceRegistry()::update, this.permitManager).withAction((c, f, t, p) -> this.doPermittedLoad((PlayerMagazineInstance)c, (LoadPermit)p)).manual().in(this).change(MagazineState.LOAD).to(MagazineState.READY).when(reloadAnimationCompleted).automatic();
    }

    @Override
    public void setPermitManager(PermitManager permitManager) {
        this.permitManager = permitManager;
        permitManager.registerEvaluator(LoadPermit.class, PlayerMagazineInstance.class, (p, c) -> this.evaluateLoad((LoadPermit)p, (PlayerMagazineInstance)c));
    }

    public void reloadMainHeldItem(EntityPlayer player) {
        PlayerMagazineInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerMagazineInstance.class);
        this.stateManager.changeState(this, instance, new MagazineState[]{MagazineState.LOAD});
    }

    void updateMainHeldItem(EntityPlayer player) {
        PlayerMagazineInstance instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)player, PlayerMagazineInstance.class);
        if (instance != null) {
            this.stateManager.changeStateFromAnyOf(this, instance, allowedUpdateFromStates, new MagazineState[0]);
        }
    }

    private void evaluateLoad(LoadPermit p, PlayerMagazineInstance magazineInstance) {
        if (!(magazineInstance.getPlayer() instanceof EntityPlayer)) {
            return;
        }
        ItemStack magazineStack = magazineInstance.getItemStack();
        Permit.Status status = Permit.Status.DENIED;
        if (magazineStack.func_77973_b() instanceof ItemMagazine) {
            ItemStack magazineItemStack = magazineStack;
            EntityPlayer player = (EntityPlayer)magazineInstance.getPlayer();
            boolean shouldSplitStack = false;
            if (CompatibilityProvider.compatibility.getStackSize(magazineItemStack) > 1) {
                shouldSplitStack = true;
                if (player.field_71071_by.func_70447_i() < 0) {
                    p.setStatus(status);
                    return;
                }
            }
            ItemMagazine magazine = (ItemMagazine)magazineItemStack.func_77973_b();
            List<ItemBullet> compatibleBullets = magazine.getCompatibleBullets();
            int currentAmmo = Tags.getAmmo(magazineStack);
            ItemStack consumedStack = CompatibilityProvider.compatibility.tryConsumingCompatibleItem(compatibleBullets, magazine.getAmmo() - currentAmmo, (EntityPlayer)magazineInstance.getPlayer(), i -> true);
            if (consumedStack != null) {
                ItemStack remainingStack = null;
                if (shouldSplitStack) {
                    remainingStack = magazineStack.func_77979_a(CompatibilityProvider.compatibility.getStackSize(magazineStack) - 1);
                }
                Tags.setAmmo(magazineStack, Tags.getAmmo(magazineStack) + CompatibilityProvider.compatibility.getStackSize(consumedStack));
                if (remainingStack != null) {
                    player.field_71071_by.func_70441_a(remainingStack);
                }
                if (magazine.getReloadSound() != null) {
                    CompatibilityProvider.compatibility.playSound(magazineInstance.getPlayer(), magazine.getReloadSound(), 1.0f, 1.0f);
                }
                status = Permit.Status.GRANTED;
            }
        }
        p.setStatus(status);
    }

    private void doPermittedLoad(PlayerMagazineInstance weaponInstance, LoadPermit permit) {
        if (permit == null) {
            System.err.println("Permit is null, something went wrong");
            return;
        }
    }

    static {
        TypeRegistry.getInstance().register(LoadPermit.class);
        allowedUpdateFromStates = new HashSet<MagazineState>(Arrays.asList(MagazineState.LOAD_REQUESTED, MagazineState.LOAD));
        reloadAnimationDuration = 1000L;
        reloadAnimationCompleted = es -> System.currentTimeMillis() >= es.getStateUpdateTimestamp() + reloadAnimationDuration;
    }

    public static class LoadPermit
    extends Permit<MagazineState> {
        public LoadPermit() {
        }

        public LoadPermit(MagazineState state) {
            super(state);
        }
    }
}


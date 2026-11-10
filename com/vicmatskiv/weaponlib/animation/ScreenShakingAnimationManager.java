/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib.animation;

import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.animation.PlayerAnimation;
import com.vicmatskiv.weaponlib.animation.PlayerRawPitchAnimation;
import com.vicmatskiv.weaponlib.animation.ScreenShakeAnimation;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;

public class ScreenShakingAnimationManager {
    private Map<Key, PlayerAnimation> allPlayerAnimations = new HashMap<Key, PlayerAnimation>();
    private Map<EntityPlayer, PlayerAnimation> activeAnimations = new HashMap<EntityPlayer, PlayerAnimation>();
    private float maxYaw = 2.0f;
    private float maxPitch = 2.0f;
    private long transitionDuration = 2000L;
    private State lastTargetState;

    public ScreenShakingAnimationManager setMaxYaw(float maxYaw) {
        this.maxYaw = maxYaw;
        return this;
    }

    public ScreenShakingAnimationManager setMaxPitch(float maxPitch) {
        this.maxPitch = maxPitch;
        return this;
    }

    public ScreenShakingAnimationManager setTransitionDuration(long transitionDuration) {
        this.transitionDuration = transitionDuration;
        return this;
    }

    public void update(EntityPlayer player, PlayerWeaponInstance weaponInstance, RenderableState weaponState) {
        State targetState = ScreenShakingAnimationManager.toManagedState(weaponState);
        PlayerAnimation activeAnimation = this.activeAnimations.get(player);
        boolean fadeOut = true;
        if (activeAnimation == null) {
            activeAnimation = this.getAnimationForManagedState(player, weaponInstance, targetState);
            this.activeAnimations.put(player, activeAnimation);
        } else {
            State currentAnimationState = activeAnimation.getState();
            if (currentAnimationState == targetState) {
                if (targetState != this.lastTargetState) {
                    activeAnimation.reset(player, false);
                }
            } else if (currentAnimationState.getPriority() < targetState.getPriority() || activeAnimation.isCompleted()) {
                activeAnimation = this.getAnimationForManagedState(player, weaponInstance, targetState);
                activeAnimation.reset(player, true);
                this.activeAnimations.put(player, activeAnimation);
            }
        }
        activeAnimation.update(player, fadeOut);
        this.lastTargetState = targetState;
    }

    public void reset(EntityPlayer player, RenderableState weaponState) {
    }

    public static State toManagedState(RenderableState weaponState) {
        State managedState;
        if (weaponState == null) {
            return State.DEFAULT;
        }
        switch (weaponState) {
            case SHOOTING: 
            case ZOOMING_SHOOTING: {
                managedState = State.SHOOTING;
                break;
            }
            case RELOADING: {
                managedState = State.RELOADING;
                break;
            }
            case ZOOMING: {
                managedState = State.AIMING;
                break;
            }
            default: {
                managedState = State.DEFAULT;
            }
        }
        return managedState;
    }

    private PlayerAnimation createAnimationForManagedState(EntityPlayer player, State managedState, Weapon weapon) {
        PlayerAnimation animation;
        switch (managedState) {
            case AIMING: {
                animation = new PlayerRawPitchAnimation(managedState).setMaxPitch(this.maxPitch).setMaxYaw(this.maxYaw).setPlayer(player).setTransitionDuration(this.transitionDuration);
                break;
            }
            case SHOOTING: {
                ScreenShakeAnimation.Builder builder = weapon.getScreenShakeAnimationBuilder(RenderableState.SHOOTING);
                animation = builder.build();
                break;
            }
            default: {
                animation = PlayerAnimation.NO_ANIMATION;
            }
        }
        return animation;
    }

    private PlayerAnimation getAnimationForManagedState(EntityPlayer player, PlayerWeaponInstance instance, State managedState) {
        return this.allPlayerAnimations.computeIfAbsent(new Key(player, managedState, instance.getWeapon()), k -> this.createAnimationForManagedState(player, k.state, instance.getWeapon()));
    }

    private static class Key {
        UUID playerId;
        State state;
        Weapon weapon;

        public Key(EntityPlayer player, State state, Weapon weapon) {
            this.playerId = player.getPersistentID();
            this.state = state;
            this.weapon = weapon;
        }

        public int hashCode() {
            int prime = 31;
            int result = 1;
            result = 31 * result + (this.playerId == null ? 0 : this.playerId.hashCode());
            result = 31 * result + (this.state == null ? 0 : this.state.hashCode());
            result = 31 * result + (this.weapon == null ? 0 : this.weapon.hashCode());
            return result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            Key other = (Key)obj;
            if (this.playerId == null ? other.playerId != null : !this.playerId.equals(other.playerId)) {
                return false;
            }
            if (this.state != other.state) {
                return false;
            }
            return !(this.weapon == null ? other.weapon != null : !this.weapon.equals(other.weapon));
        }
    }

    public static enum State {
        SHOOTING(0, 0.1f),
        RELOADING(-5, 0.0f),
        AIMING(-10, 0.0f),
        DEFAULT(Integer.MIN_VALUE, 0.0f);

        private int priority;
        private float stepAdjustement;

        private State(int priority, float stepAdjustement) {
            this.priority = priority;
        }

        int getPriority() {
            return this.priority;
        }

        public float getStepAdjustement() {
            return this.stepAdjustement;
        }
    }
}


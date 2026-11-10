/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib.animation;

import com.vicmatskiv.weaponlib.animation.PlayerAnimation;
import com.vicmatskiv.weaponlib.animation.ScreenShakingAnimationManager;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerRawPitchAnimation
implements PlayerAnimation {
    private static final float ATTENUATION_COEFFICIENT = 0.5f;
    private float lastYaw;
    private float lastPitch;
    private float anchoredYaw;
    private float anchoredPitch;
    private float startYaw;
    private float startPitch;
    private float targetYaw;
    private float targetPitch;
    private float maxYaw = 2.0f;
    private float maxPitch = 2.0f;
    private float attenuation = 0.5f;
    private Random rand = new Random();
    private long transitionDuration = 2000L;
    private long startTime;
    private EntityPlayer clientPlayer;
    private boolean forceResetYawPitch;
    private ScreenShakingAnimationManager.State state;

    public PlayerRawPitchAnimation(ScreenShakingAnimationManager.State state) {
        this.state = state;
    }

    PlayerRawPitchAnimation setMaxYaw(float maxYaw) {
        this.maxYaw = maxYaw;
        return this;
    }

    PlayerRawPitchAnimation setMaxPitch(float maxPitch) {
        this.maxPitch = maxPitch;
        return this;
    }

    PlayerRawPitchAnimation setTransitionDuration(long transitionDuration) {
        this.transitionDuration = transitionDuration;
        return this;
    }

    PlayerRawPitchAnimation setPlayer(EntityPlayer clientPlayer) {
        this.clientPlayer = clientPlayer;
        return this;
    }

    @Override
    public void update(EntityPlayer player, boolean fadeOut) {
        float progress = (float)(System.currentTimeMillis() - this.startTime) / (float)this.transitionDuration;
        if (this.forceResetYawPitch || this.rotationPitchChanged(this.clientPlayer)) {
            this.anchoredYaw = this.clientPlayer.field_70177_z;
            this.anchoredPitch = this.clientPlayer.field_70125_A;
            this.forceResetYawPitch = true;
            this.attenuation = 1.0f;
        }
        if (this.forceResetYawPitch || progress > 1.0f) {
            progress = 0.0f;
            this.startTime = System.currentTimeMillis();
            this.startYaw = this.clientPlayer.field_70177_z;
            this.startPitch = this.clientPlayer.field_70125_A;
            this.targetYaw = this.anchoredYaw + (this.rand.nextFloat() - 0.5f) * 2.0f * this.maxYaw * this.attenuation;
            this.targetPitch = this.anchoredPitch + (this.rand.nextFloat() - 0.5f) * 2.0f * this.maxPitch * this.attenuation;
            this.attenuation *= 0.5f;
            if (this.attenuation < 0.1f) {
                this.attenuation = 0.1f;
            }
        }
        if (this.forceResetYawPitch) {
            this.forceResetYawPitch = false;
        }
        this.clientPlayer.field_70177_z = this.startYaw + (this.targetYaw - this.startYaw) * progress;
        this.clientPlayer.field_70125_A = this.startPitch + (this.targetPitch - this.startPitch) * progress;
        this.lastYaw = this.clientPlayer.field_70177_z;
        this.lastPitch = this.clientPlayer.field_70125_A;
    }

    @Override
    public void reset(EntityPlayer player, boolean force) {
        if (force) {
            this.forceResetYawPitch = true;
        }
    }

    @Override
    public boolean isCompleted() {
        return true;
    }

    private boolean rotationPitchChanged(EntityPlayer clientPlayer) {
        return this.lastYaw != clientPlayer.field_70177_z || this.lastPitch != clientPlayer.field_70125_A;
    }

    @Override
    public ScreenShakingAnimationManager.State getState() {
        return this.state;
    }
}


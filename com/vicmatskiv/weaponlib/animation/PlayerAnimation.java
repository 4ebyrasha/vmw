/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib.animation;

import com.vicmatskiv.weaponlib.animation.ScreenShakingAnimationManager;
import net.minecraft.entity.player.EntityPlayer;

public interface PlayerAnimation {
    public static final PlayerAnimation NO_ANIMATION = new PlayerAnimation(){

        @Override
        public void update(EntityPlayer player, boolean fadeOut) {
        }

        @Override
        public void reset(EntityPlayer player, boolean force) {
        }

        @Override
        public boolean isCompleted() {
            return true;
        }

        @Override
        public ScreenShakingAnimationManager.State getState() {
            return ScreenShakingAnimationManager.State.DEFAULT;
        }
    };

    public void update(EntityPlayer var1, boolean var2);

    public void reset(EntityPlayer var1, boolean var2);

    public boolean isCompleted();

    public ScreenShakingAnimationManager.State getState();
}


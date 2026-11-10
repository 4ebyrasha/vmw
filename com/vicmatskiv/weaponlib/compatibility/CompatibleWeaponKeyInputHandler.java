/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public abstract class CompatibleWeaponKeyInputHandler {
    @SubscribeEvent
    public final void onKeyInput(InputEvent.KeyInputEvent event) {
        this.onCompatibleKeyInput();
    }

    protected abstract void onCompatibleKeyInput();
}


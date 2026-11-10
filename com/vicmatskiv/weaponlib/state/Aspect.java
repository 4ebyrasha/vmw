/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.state;

import com.vicmatskiv.weaponlib.state.ExtendedState;
import com.vicmatskiv.weaponlib.state.ManagedState;
import com.vicmatskiv.weaponlib.state.PermitManager;
import com.vicmatskiv.weaponlib.state.StateManager;

public interface Aspect<T extends ManagedState<T>, E extends ExtendedState<T>> {
    public void setStateManager(StateManager<T, ? super E> var1);

    public void setPermitManager(PermitManager var1);
}


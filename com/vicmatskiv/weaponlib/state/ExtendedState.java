/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.state;

import com.vicmatskiv.weaponlib.state.ManagedState;

public interface ExtendedState<T extends ManagedState<T>> {
    public boolean setState(T var1);

    public T getState();

    public long getStateUpdateTimestamp();

    public <E extends ExtendedState<T>> void prepareTransaction(E var1);
}


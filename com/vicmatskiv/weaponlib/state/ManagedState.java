/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.state;

import com.vicmatskiv.weaponlib.network.UniversallySerializable;

public interface ManagedState<T extends ManagedState<T>>
extends UniversallySerializable {
    default public T preparingPhase() {
        return null;
    }

    default public T permitRequestedPhase() {
        return null;
    }

    default public T commitPhase() {
        return null;
    }

    default public boolean isTransient() {
        return false;
    }

    public int ordinal();

    default public boolean matches(T mainState) {
        return mainState == this || mainState == this.preparingPhase() || mainState == this.permitRequestedPhase();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.state;

import com.vicmatskiv.weaponlib.state.ManagedState;
import com.vicmatskiv.weaponlib.state.Permit;

public interface PermitProvider<S extends ManagedState<S>, Context> {
    public void set(Permit<S> var1, S var2, Context var3);

    public Permit<S> get(S var1, Context var2);
}


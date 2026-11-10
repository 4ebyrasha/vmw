/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.state;

import com.vicmatskiv.weaponlib.state.ExtendedState;
import com.vicmatskiv.weaponlib.state.ManagedState;
import com.vicmatskiv.weaponlib.state.Permit;
import java.util.function.BiConsumer;

public interface PermitManager {
    public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> void request(P var1, E var2, BiConsumer<P, E> var3);

    public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> void registerEvaluator(Class<? extends P> var1, Class<? extends E> var2, BiConsumer<P, E> var3);
}


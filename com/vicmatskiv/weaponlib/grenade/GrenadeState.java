/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib.grenade;

import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;

public enum GrenadeState implements ManagedState<GrenadeState>
{
    READY(false),
    SAFETY_PING_OFF(9),
    STRIKER_LEVER_RELEASED(9),
    THROWING(9),
    THROWN(9),
    EXPLODED_IN_HANDS(9);

    private static final int DEFAULT_PRIORITY = 0;
    private GrenadeState preparingPhase;
    private GrenadeState permitRequestedPhase;
    private GrenadeState commitPhase;
    private boolean isTransient;
    private int priority = 0;

    private GrenadeState() {
        this(null, null, null, true);
    }

    private GrenadeState(int priority) {
        this(priority, null, null, null, true);
    }

    private GrenadeState(boolean isTransient) {
        this(null, null, null, isTransient);
    }

    private GrenadeState(GrenadeState preparingPhase, GrenadeState permitRequestedState, GrenadeState transactionFinalState, boolean isTransient) {
        this(0, preparingPhase, permitRequestedState, transactionFinalState, isTransient);
    }

    private GrenadeState(int priority, GrenadeState preparingPhase, GrenadeState permitRequestedState, GrenadeState transactionFinalState, boolean isTransient) {
        this.priority = priority;
        this.preparingPhase = preparingPhase;
        this.permitRequestedPhase = permitRequestedState;
        this.commitPhase = transactionFinalState;
        this.isTransient = false;
    }

    @Override
    public boolean isTransient() {
        return this.isTransient;
    }

    @Override
    public GrenadeState preparingPhase() {
        return this.preparingPhase;
    }

    @Override
    public GrenadeState permitRequestedPhase() {
        return this.permitRequestedPhase;
    }

    @Override
    public GrenadeState commitPhase() {
        return this.commitPhase;
    }

    public int getPriority() {
        return this.priority;
    }

    @Override
    public void init(ByteBuf buf) {
    }

    @Override
    public void serialize(ByteBuf buf) {
    }

    static {
        TypeRegistry.getInstance().register(GrenadeState.class);
    }
}


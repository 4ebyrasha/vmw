/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;

public enum MagazineState implements ManagedState<MagazineState>
{
    READY(false),
    LOAD_REQUESTED,
    LOAD(null, LOAD_REQUESTED, null, true);

    private static final int DEFAULT_PRIORITY = 0;
    private MagazineState preparingPhase;
    private MagazineState permitRequestedPhase;
    private MagazineState commitPhase;
    private boolean isTransient;
    private int priority = 0;

    private MagazineState() {
        this(null, null, null, true);
    }

    private MagazineState(int priority) {
        this(priority, null, null, null, true);
    }

    private MagazineState(boolean isTransient) {
        this(null, null, null, isTransient);
    }

    private MagazineState(MagazineState preparingPhase, MagazineState permitRequestedState, MagazineState transactionFinalState, boolean isTransient) {
        this(0, preparingPhase, permitRequestedState, transactionFinalState, isTransient);
    }

    private MagazineState(int priority, MagazineState preparingPhase, MagazineState permitRequestedState, MagazineState transactionFinalState, boolean isTransient) {
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
    public MagazineState preparingPhase() {
        return this.preparingPhase;
    }

    @Override
    public MagazineState permitRequestedPhase() {
        return this.permitRequestedPhase;
    }

    @Override
    public MagazineState commitPhase() {
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
        TypeRegistry.getInstance().register(MagazineState.class);
    }
}


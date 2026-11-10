/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib.electronics;

import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;

public enum TabletState implements ManagedState<TabletState>
{
    READY(false),
    MODIFYING_REQUESTED(1),
    MODIFYING(2, null, MODIFYING_REQUESTED, null, false),
    NEXT_ATTACHMENT_REQUESTED,
    NEXT_ATTACHMENT(2, null, NEXT_ATTACHMENT_REQUESTED, null, false),
    ALERT;

    private static final int DEFAULT_PRIORITY = 0;
    private TabletState preparingPhase;
    private TabletState permitRequestedPhase;
    private TabletState commitPhase;
    private boolean isTransient;
    private int priority = 0;

    private TabletState() {
        this(null, null, null, true);
    }

    private TabletState(int priority) {
        this(priority, null, null, null, true);
    }

    private TabletState(boolean isTransient) {
        this(null, null, null, isTransient);
    }

    private TabletState(TabletState preparingPhase, TabletState permitRequestedState, TabletState transactionFinalState, boolean isTransient) {
        this(0, preparingPhase, permitRequestedState, transactionFinalState, isTransient);
    }

    private TabletState(int priority, TabletState preparingPhase, TabletState permitRequestedState, TabletState transactionFinalState, boolean isTransient) {
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
    public TabletState preparingPhase() {
        return this.preparingPhase;
    }

    @Override
    public TabletState permitRequestedPhase() {
        return this.permitRequestedPhase;
    }

    @Override
    public TabletState commitPhase() {
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
        TypeRegistry.getInstance().register(TabletState.class);
    }
}


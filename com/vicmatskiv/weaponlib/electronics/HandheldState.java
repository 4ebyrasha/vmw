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

public enum HandheldState implements ManagedState<HandheldState>
{
    READY(false),
    MODIFYING_REQUESTED(1),
    MODIFYING(2, null, MODIFYING_REQUESTED, null, false),
    NEXT_ATTACHMENT_REQUESTED,
    NEXT_ATTACHMENT(2, null, NEXT_ATTACHMENT_REQUESTED, null, false),
    ALERT;

    private static final int DEFAULT_PRIORITY = 0;
    private HandheldState preparingPhase;
    private HandheldState permitRequestedPhase;
    private HandheldState commitPhase;
    private boolean isTransient;
    private int priority = 0;

    private HandheldState() {
        this(null, null, null, true);
    }

    private HandheldState(int priority) {
        this(priority, null, null, null, true);
    }

    private HandheldState(boolean isTransient) {
        this(null, null, null, isTransient);
    }

    private HandheldState(HandheldState preparingPhase, HandheldState permitRequestedState, HandheldState transactionFinalState, boolean isTransient) {
        this(0, preparingPhase, permitRequestedState, transactionFinalState, isTransient);
    }

    private HandheldState(int priority, HandheldState preparingPhase, HandheldState permitRequestedState, HandheldState transactionFinalState, boolean isTransient) {
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
    public HandheldState preparingPhase() {
        return this.preparingPhase;
    }

    @Override
    public HandheldState permitRequestedPhase() {
        return this.permitRequestedPhase;
    }

    @Override
    public HandheldState commitPhase() {
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
        TypeRegistry.getInstance().register(HandheldState.class);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.animation;

import com.vicmatskiv.weaponlib.Part;
import java.util.function.Consumer;

public class Transition<Context> {
    private static final Consumer<?> ANCHORED_POSITION = c -> {};
    private Consumer<Context> itemPositioning;
    private long duration;
    private long pause;
    private Part attachedTo;
    private boolean animated;

    public static <T> Consumer<T> anchoredPosition() {
        return ANCHORED_POSITION;
    }

    public Transition(Consumer<Context> itemPositioning, Part attachedTo, boolean animated) {
        this(itemPositioning, 0L, 0L);
        this.animated = animated;
    }

    public Transition(Consumer<Context> itemPositioning, long duration) {
        this(itemPositioning, duration, 0L);
    }

    public Transition(Consumer<Context> itemPositioning, long duration, long pause) {
        this(itemPositioning, duration, pause, null);
    }

    public Transition(Consumer<Context> itemPositioning, long duration, long pause, Part attachedTo) {
        this.itemPositioning = itemPositioning;
        this.duration = duration;
        this.pause = pause;
        this.attachedTo = attachedTo;
    }

    public Consumer<Context> getItemPositioning() {
        return this.itemPositioning;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getPause() {
        return this.pause;
    }

    public Part getAttachedTo() {
        return this.attachedTo;
    }

    public boolean isAnimated() {
        return this.animated;
    }
}


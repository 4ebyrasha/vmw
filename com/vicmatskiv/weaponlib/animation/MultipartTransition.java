/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.animation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MultipartTransition<Part, Context> {
    private static final Consumer<?> DEFAULT_POSITION = c -> {};
    private Map<Part, Consumer<Context>> multipartPositionFunctions = new HashMap<Part, Consumer<Context>>();
    private Map<Part, Part> attachedTo = new HashMap<Part, Part>();
    private long duration;
    private long pause;

    public static <Context> Consumer<Context> anchoredPosition() {
        return DEFAULT_POSITION;
    }

    public MultipartTransition(Part part, Consumer<Context> positionFunction, long duration, long pause) {
        this.duration = duration;
        this.pause = pause;
        this.multipartPositionFunctions.put(part, positionFunction);
    }

    public MultipartTransition(Part part, Consumer<Context> positionFunction, long duration) {
        this(part, positionFunction, duration, 0L);
    }

    public MultipartTransition(long duration, long pause) {
        this.duration = duration;
        this.pause = pause;
    }

    public MultipartTransition(long duration) {
        this(duration, 0L);
    }

    public MultipartTransition<Part, Context> withPartPositionFunction(Part part, Consumer<Context> positionFunction) {
        return this.withPartPositionFunction(part, null, positionFunction);
    }

    public MultipartTransition<Part, Context> withPartPositionFunction(Part part, Part attachedTo, Consumer<Context> positionFunction) {
        this.multipartPositionFunctions.put(part, positionFunction);
        this.attachedTo.put(part, attachedTo);
        return this;
    }

    public void position(Part part, Context context) {
        Consumer<Context> positionFunction = this.multipartPositionFunctions.get(part);
        if (positionFunction == null) {
            positionFunction = MultipartTransition.anchoredPosition();
        }
        positionFunction.accept(context);
    }

    public Consumer<Context> getPositioning(Part part) {
        return this.multipartPositionFunctions.get(part);
    }

    public long getDuration() {
        return this.duration;
    }

    public long getPause() {
        return this.pause;
    }

    public Part getAttachedTo(Part part) {
        return this.attachedTo.get(part);
    }
}


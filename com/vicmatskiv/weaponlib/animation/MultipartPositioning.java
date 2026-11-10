/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.animation;

import java.util.Queue;

public interface MultipartPositioning<Part, Context> {
    public <T> T getFromState(Class<T> var1);

    public <T> T getToState(Class<T> var1);

    public boolean isExpired(Queue<MultipartPositioning<Part, Context>> var1);

    public Positioner<Part, Context> getPositioner();

    public float getProgress();

    public static interface Positioner<Part, Context> {
        public void position(Part var1, Context var2);

        default public void randomize(float rate, float amplitude) {
        }
    }
}


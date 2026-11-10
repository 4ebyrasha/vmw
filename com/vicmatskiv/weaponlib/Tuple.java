/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib;

public final class Tuple<U, V> {
    private U u;
    private V v;

    public Tuple(U u, V v) {
        this.u = u;
        this.v = v;
    }

    public U getU() {
        return this.u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public V getV() {
        return this.v;
    }

    public void setV(V v) {
        this.v = v;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.Spreadable;
import java.util.function.Function;

public interface ExposureProtection {
    public Function<Float, Float> getAbsorbFunction(Spreadable var1);
}


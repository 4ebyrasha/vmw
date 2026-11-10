/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.shader;

import com.vicmatskiv.weaponlib.shader.DynamicShaderGroupSource;
import com.vicmatskiv.weaponlib.shader.DynamicShaderPhase;

public interface DynamicShaderGroupSourceProvider {
    public DynamicShaderGroupSource getShaderSource(DynamicShaderPhase var1);
}


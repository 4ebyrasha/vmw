/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.animation;

import com.vicmatskiv.weaponlib.animation.MultipartRenderStateManager;
import com.vicmatskiv.weaponlib.animation.PartPositionProvider;

public interface MultipartRenderStateDescriptor<State, Part, Context extends PartPositionProvider> {
    public MultipartRenderStateManager<State, Part, Context> getStateManager();
}


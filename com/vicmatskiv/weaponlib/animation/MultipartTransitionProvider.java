/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.animation;

import com.vicmatskiv.weaponlib.animation.MultipartTransition;
import java.util.List;

public interface MultipartTransitionProvider<State, Part, Context> {
    public List<MultipartTransition<Part, Context>> getTransitions(State var1);
}


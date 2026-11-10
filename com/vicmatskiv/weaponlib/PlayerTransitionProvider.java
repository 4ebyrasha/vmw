/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.animation.MultipartTransition;
import com.vicmatskiv.weaponlib.animation.MultipartTransitionProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerTransitionProvider
implements MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> {
    private List<MultipartTransition<Part, RenderContext<RenderableState>>> normalTransitions;
    private Builder builder;

    private PlayerTransitionProvider(Builder builder) {
        this.normalTransitions = Arrays.asList(new MultipartTransition<Part, RenderContext>(Part.MAIN, renderContext -> {}, 200L, 0L).withPartPositionFunction(Part.LEFT_HAND, rc -> {}).withPartPositionFunction(Part.RIGHT_HAND, rc -> {}).withPartPositionFunction(Part.LEFT_LEG, rc -> {}).withPartPositionFunction(Part.RIGHT_LEG, rc -> {}));
        this.builder = builder;
    }

    protected PlayerTransitionProvider() {
        this.normalTransitions = Arrays.asList(new MultipartTransition<Part, RenderContext>(Part.MAIN, renderContext -> {}, 200L, 0L).withPartPositionFunction(Part.LEFT_HAND, rc -> {}).withPartPositionFunction(Part.RIGHT_HAND, rc -> {}).withPartPositionFunction(Part.LEFT_LEG, rc -> {}).withPartPositionFunction(Part.RIGHT_LEG, rc -> {}));
    }

    @Override
    public List<MultipartTransition<Part, RenderContext<RenderableState>>> getTransitions(RenderableState state) {
        if (state == RenderableState.PRONING) {
            return this.builder.proningTransitions;
        }
        if (state == RenderableState.PRONING_AIMING) {
            return this.builder.proningAimingTransitions;
        }
        return this.normalTransitions;
    }

    public static class Builder {
        private List<MultipartTransition<Part, RenderContext<RenderableState>>> proningTransitions = new ArrayList<MultipartTransition<Part, RenderContext<RenderableState>>>();
        private List<MultipartTransition<Part, RenderContext<RenderableState>>> proningAimingTransitions = new ArrayList<MultipartTransition<Part, RenderContext<RenderableState>>>();

        public Builder withProningTransition(MultipartTransition<Part, RenderContext<RenderableState>> transition) {
            this.proningTransitions.add(transition);
            return this;
        }

        public Builder withProningAimingTransition(MultipartTransition<Part, RenderContext<RenderableState>> transition) {
            this.proningAimingTransitions.add(transition);
            return this;
        }

        public PlayerTransitionProvider build() {
            return new PlayerTransitionProvider(this);
        }
    }
}


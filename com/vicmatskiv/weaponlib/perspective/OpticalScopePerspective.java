/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.perspective;

import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.ItemScope;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderTickEvent;
import com.vicmatskiv.weaponlib.perspective.FirstPersonPerspective;
import com.vicmatskiv.weaponlib.perspective.PerspectiveManager;
import com.vicmatskiv.weaponlib.shader.DynamicShaderContext;
import com.vicmatskiv.weaponlib.shader.DynamicShaderPhase;

public class OpticalScopePerspective
extends FirstPersonPerspective<RenderableState> {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    public OpticalScopePerspective() {
        this.width = 400;
        this.height = 400;
    }

    @Override
    public void activate(ClientModContext modContext, PerspectiveManager manager) {
        ItemScope scope;
        PlayerWeaponInstance instance = modContext.getMainHeldWeapon();
        if (instance != null && (scope = instance.getScope()).isOptical()) {
            this.setSize(scope.getWidth(), scope.getHeight());
        }
        super.activate(modContext, manager);
    }

    @Override
    public float getBrightness(RenderContext<RenderableState> renderContext) {
        float brightness = 0.0f;
        PlayerWeaponInstance instance = renderContext.getWeaponInstance();
        if (instance == null) {
            return 0.0f;
        }
        boolean aimed = instance != null && instance.isAimed();
        float progress = Math.min(1.0f, renderContext.getTransitionProgress());
        if (OpticalScopePerspective.isAimingState(renderContext.getFromState()) && OpticalScopePerspective.isAimingState(renderContext.getToState())) {
            brightness = 1.0f;
        } else if (progress > 0.0f && aimed && OpticalScopePerspective.isAimingState(renderContext.getToState())) {
            brightness = progress;
        } else if (OpticalScopePerspective.isAimingState(renderContext.getFromState()) && progress > 0.0f && !aimed) {
            brightness = Math.max(1.0f - progress, 0.0f);
        }
        return brightness;
    }

    private static boolean isAimingState(RenderableState renderableState) {
        return renderableState == RenderableState.ZOOMING || renderableState == RenderableState.ZOOMING_RECOILED || renderableState == RenderableState.ZOOMING_SHOOTING;
    }

    @Override
    public void update(CompatibleRenderTickEvent event) {
        PlayerWeaponInstance instance = this.modContext.getMainHeldWeapon();
        if (instance != null && instance.isAimed()) {
            ItemScope scope = instance.getScope();
            if (scope.isOptical()) {
                this.setSize(scope.getWidth(), scope.getHeight());
            }
            super.update(event);
        }
    }

    @Override
    protected void prepareRenderWorld(CompatibleRenderTickEvent event) {
        DynamicShaderContext shaderContext = new DynamicShaderContext(DynamicShaderPhase.POST_WORLD_OPTICAL_SCOPE_RENDER, (Object)this.entityRenderer, this.framebuffer, event.getRenderTickTime());
        PlayerWeaponInstance instance = this.modContext.getMainHeldWeapon();
        this.shaderGroupManager.applyShader(shaderContext, instance);
    }

    @Override
    protected void postRenderWorld(CompatibleRenderTickEvent event) {
        DynamicShaderContext shaderContext = new DynamicShaderContext(DynamicShaderPhase.POST_WORLD_OPTICAL_SCOPE_RENDER, (Object)this.entityRenderer, this.framebuffer, event.getRenderTickTime());
        this.shaderGroupManager.removeStaleShaders(shaderContext);
    }
}


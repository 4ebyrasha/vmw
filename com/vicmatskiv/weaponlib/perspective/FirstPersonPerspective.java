/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.EntityRenderer
 */
package com.vicmatskiv.weaponlib.perspective;

import com.vicmatskiv.weaponlib.RenderingPhase;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderTickEvent;
import com.vicmatskiv.weaponlib.perspective.Perspective;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;

public class FirstPersonPerspective<S>
extends Perspective<S> {
    private long renderEndNanoTime = System.nanoTime();

    public FirstPersonPerspective() {
        this.width = Minecraft.func_71410_x().field_71443_c;
        this.height = Minecraft.func_71410_x().field_71440_d;
    }

    protected void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void update(CompatibleRenderTickEvent event) {
        this.modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.RENDER_PERSPECTIVE);
        long p_78471_2_ = this.renderEndNanoTime + 16666666L;
        int origDisplayWidth = Minecraft.func_71410_x().field_71443_c;
        int origDisplayHeight = Minecraft.func_71410_x().field_71440_d;
        EntityRenderer origEntityRenderer = Minecraft.func_71410_x().field_71460_t;
        this.framebuffer.func_147610_a(true);
        Minecraft.func_71410_x().field_71443_c = this.width;
        Minecraft.func_71410_x().field_71440_d = this.height;
        Minecraft.func_71410_x().field_71460_t = this.entityRenderer;
        this.entityRenderer.setPrepareTerrain(false);
        this.entityRenderer.func_78464_a();
        this.prepareRenderWorld(event);
        this.entityRenderer.func_78471_a(event.getRenderTickTime(), p_78471_2_);
        this.postRenderWorld(event);
        Minecraft.func_71410_x().field_71460_t = origEntityRenderer;
        Minecraft.func_71410_x().func_147110_a().func_147610_a(true);
        Minecraft.func_71410_x().field_71443_c = origDisplayWidth;
        Minecraft.func_71410_x().field_71440_d = origDisplayHeight;
        this.renderEndNanoTime = System.nanoTime();
        this.modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.NORMAL);
    }

    protected void prepareRenderWorld(CompatibleRenderTickEvent event) {
    }

    protected void postRenderWorld(CompatibleRenderTickEvent event) {
    }
}


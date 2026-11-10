/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.shader.Framebuffer
 */
package com.vicmatskiv.weaponlib.perspective;

import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleParticleManager;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderTickEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWorldRenderer;
import com.vicmatskiv.weaponlib.compatibility.Framebuffers;
import com.vicmatskiv.weaponlib.perspective.PerspectiveManager;
import com.vicmatskiv.weaponlib.shader.DynamicShaderContext;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroupManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.shader.Framebuffer;

public abstract class Perspective<S> {
    protected ClientModContext modContext;
    protected Framebuffer framebuffer;
    protected int width;
    protected int height;
    protected CompatibleWorldRenderer entityRenderer;
    protected RenderGlobal renderGlobal;
    protected CompatibleParticleManager effectRenderer;
    protected DynamicShaderGroupManager shaderGroupManager;

    public void activate(ClientModContext modContext, PerspectiveManager manager) {
        this.modContext = modContext;
        if (this.framebuffer == null) {
            this.framebuffer = new Framebuffer(this.width, this.height, true);
            this.framebuffer.func_147604_a(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.entityRenderer = manager.getEntityRenderer();
        this.effectRenderer = manager.getEffectRenderer();
        this.renderGlobal = manager.getRenderGlobal();
        this.shaderGroupManager = new DynamicShaderGroupManager();
        if (this.shaderGroupManager.hasActiveGroups()) {
            System.err.println("!!! Active shader groups found !!!");
        }
    }

    public void deactivate(ClientModContext modContext) {
        int originalFramebufferId = Framebuffers.getCurrentFramebuffer();
        this.framebuffer.func_147608_a();
        this.shaderGroupManager.removeAllShaders(new DynamicShaderContext(null, (Object)this.entityRenderer, null, 0.0f));
        Minecraft mc = Minecraft.func_71410_x();
        Framebuffers.bindFramebuffer(originalFramebufferId, true, mc.func_147110_a().field_147621_c, mc.func_147110_a().field_147618_d);
    }

    public float getBrightness(RenderContext<S> context) {
        return 1.0f;
    }

    public int getTexture(RenderContext<S> context) {
        return this.framebuffer != null ? this.framebuffer.field_147617_g : -1;
    }

    public Framebuffer getFramebuffer() {
        return this.framebuffer;
    }

    public abstract void update(CompatibleRenderTickEvent var1);
}


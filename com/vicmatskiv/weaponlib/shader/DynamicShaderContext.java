/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.shader.Framebuffer
 */
package com.vicmatskiv.weaponlib.shader;

import com.vicmatskiv.weaponlib.shader.DynamicShaderPhase;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.shader.Framebuffer;

public class DynamicShaderContext {
    private float partialTicks;
    private DynamicShaderPhase phase;
    private Map<String, Object> properties;
    private Framebuffer mainFramebuffer;
    private Object target;

    public DynamicShaderContext(DynamicShaderPhase phase, Object target, Framebuffer mainFramebuffer, float partialTicks) {
        this.partialTicks = partialTicks;
        this.phase = phase;
        this.mainFramebuffer = mainFramebuffer;
        this.target = target;
    }

    public Object getTarget() {
        return this.target;
    }

    public DynamicShaderContext withProperty(String name, Object value) {
        if (this.properties == null) {
            this.properties = new HashMap<String, Object>();
        }
        this.properties.put(name, value);
        return this;
    }

    public <T> T getProperty(String name) {
        return (T)this.properties.get(name);
    }

    public float getPartialTicks() {
        return this.partialTicks;
    }

    public DynamicShaderPhase getPhase() {
        return this.phase;
    }

    public Framebuffer getMainFramebuffer() {
        return this.mainFramebuffer;
    }
}


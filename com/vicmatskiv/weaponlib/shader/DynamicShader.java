/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.ShaderUniform
 *  net.minecraft.client.util.JsonException
 */
package com.vicmatskiv.weaponlib.shader;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleShader;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroup;
import java.io.IOException;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderUniform;
import net.minecraft.client.util.JsonException;

class DynamicShader
extends CompatibleShader {
    private DynamicShaderGroup shaderGroup;

    public DynamicShader(IResourceManager resourceManager, String programName, Framebuffer framebufferInIn, Framebuffer framebufferOutIn, DynamicShaderGroup shaderGroup) throws JsonException, IOException {
        super(resourceManager, programName, framebufferInIn, framebufferOutIn);
        this.shaderGroup = shaderGroup;
    }

    @Override
    public void func_148042_a(float partialTicks) {
        this.shaderGroup.getUniforms().forEach((name, value) -> {
            ShaderUniform uniform = CompatibilityProvider.compatibility.getShaderUniform(this.func_148043_c(), (String)name);
            if (uniform != null) {
                if (value instanceof Float) {
                    CompatibilityProvider.compatibility.setUniform(uniform, ((Float)value).floatValue());
                } else if (value instanceof float[]) {
                    float[] values = (float[])value;
                    if (values.length == 1) {
                        CompatibilityProvider.compatibility.setUniform(uniform, values[0]);
                    } else if (values.length == 2) {
                        CompatibilityProvider.compatibility.setUniform(uniform, values[0], values[1]);
                    } else if (values.length == 3) {
                        CompatibilityProvider.compatibility.setUniform(uniform, values[0], values[1], values[2]);
                    } else if (values.length == 4) {
                        CompatibilityProvider.compatibility.setUniform(uniform, values[0], values[1], values[2], values[3]);
                    }
                } else if (value instanceof Float[]) {
                    Float[] values = (Float[])value;
                    if (values.length == 1) {
                        CompatibilityProvider.compatibility.setUniform(uniform, values[0].floatValue());
                    } else if (values.length == 2) {
                        CompatibilityProvider.compatibility.setUniform(uniform, values[0].floatValue(), values[1].floatValue());
                    } else if (values.length == 3) {
                        CompatibilityProvider.compatibility.setUniform(uniform, values[0].floatValue(), values[1].floatValue(), values[2].floatValue());
                    } else if (values.length == 4) {
                        CompatibilityProvider.compatibility.setUniform(uniform, values[0].floatValue(), values[1].floatValue(), values[2].floatValue(), values[3].floatValue());
                    }
                }
            }
        });
        super.func_148042_a(partialTicks);
    }
}


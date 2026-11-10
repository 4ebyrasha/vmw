/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.Shader
 *  net.minecraft.client.util.JsonException
 */
package com.vicmatskiv.weaponlib.compatibility;

import java.io.IOException;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.util.JsonException;

public class CompatibleShader
extends Shader {
    public CompatibleShader(IResourceManager resourceManager, String programName, Framebuffer framebufferInIn, Framebuffer framebufferOutIn) throws JsonException, IOException {
        super(resourceManager, programName, framebufferInIn, framebufferOutIn);
    }

    public void func_148042_a(float partialTicks) {
        super.func_148042_a(partialTicks);
    }
}


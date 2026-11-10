/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonSyntaxException
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.client.util.JsonException
 *  net.minecraft.util.ResourceLocation
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.util.JsonException;
import net.minecraft.util.ResourceLocation;

public class CompatibleShaderGroup
extends ShaderGroup {
    public CompatibleShaderGroup(TextureManager textureManager, IResourceManager resourceManagerIn, Framebuffer mainFramebufferIn, ResourceLocation p_i1050_4_) throws JsonException, IOException, JsonSyntaxException {
        super(textureManager, resourceManagerIn, mainFramebufferIn, p_i1050_4_);
    }

    public void func_148018_a(float partialTicks) {
        super.func_148018_a(partialTicks);
    }
}


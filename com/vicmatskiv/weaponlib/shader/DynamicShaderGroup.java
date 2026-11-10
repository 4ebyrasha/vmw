/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonSyntaxException
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.Shader
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.client.util.JsonException
 *  net.minecraft.util.ResourceLocation
 */
package com.vicmatskiv.weaponlib.shader;

import com.google.gson.JsonSyntaxException;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleShaderGroup;
import com.vicmatskiv.weaponlib.shader.DynamicShader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.util.JsonException;
import net.minecraft.util.ResourceLocation;

public class DynamicShaderGroup
extends CompatibleShaderGroup {
    private Map<String, Object> uniforms = new HashMap<String, Object>();
    private boolean deleted;

    public DynamicShaderGroup(TextureManager textureManager, IResourceManager resourceManager, Framebuffer mainFramebufferIn, ResourceLocation resourceLocation) throws JsonException, IOException, JsonSyntaxException {
        super(textureManager, resourceManager, mainFramebufferIn, resourceLocation);
    }

    public Shader func_148023_a(String name, Framebuffer framebufferIn, Framebuffer framebufferOut) throws JsonException {
        DynamicShader shader;
        IResourceManager resourceManager = DynamicShaderGroup.getResourceManager(this);
        try {
            shader = new DynamicShader(resourceManager, name, framebufferIn, framebufferOut, this);
            List<Shader> listShaders = DynamicShaderGroup.getShaders(this);
            listShaders.add(listShaders.size(), shader);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return shader;
    }

    public void func_148021_a() {
        super.func_148021_a();
        this.deleted = true;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public void setUniform(String name, Object value) {
        this.uniforms.put(name, value);
    }

    protected Map<String, Object> getUniforms() {
        return this.uniforms;
    }

    private static IResourceManager getResourceManager(ShaderGroup shaderGroup) {
        return (IResourceManager)CompatibilityProvider.compatibility.getPrivateValue(ShaderGroup.class, shaderGroup, "resourceManager", "field_148033_b");
    }

    private static List<Shader> getShaders(ShaderGroup shaderGroup) {
        return (List)CompatibilityProvider.compatibility.getPrivateValue(ShaderGroup.class, shaderGroup, "listShaders", "field_148031_d");
    }
}


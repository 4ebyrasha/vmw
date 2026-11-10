/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonSyntaxException
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.shader;

import com.google.gson.JsonSyntaxException;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.TransformingResourceManager;
import com.vicmatskiv.weaponlib.TransformingTextureManager;
import com.vicmatskiv.weaponlib.compatibility.Framebuffers;
import com.vicmatskiv.weaponlib.shader.DynamicShaderContext;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroup;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroupSource;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroupSourceProvider;
import com.vicmatskiv.weaponlib.shader.DynamicShaderPhase;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DynamicShaderGroupManager {
    private static final Logger logger = LogManager.getLogger(DynamicShaderGroupManager.class);
    private static final String PATH_RESOURCES = "/com/vicmatskiv/weaponlib/resources/";
    private static final String PATH_SHADER_PROGRAMS = "/com/vicmatskiv/weaponlib/resources/shaders/programs/";
    private static final String RESOURCE_DOMAIN_WEAPONLIB = "weaponlib";
    private static final String RESOURCE_DOMAIN_TEXTURES_EFFECT_WEAPONLIB = "textures/effect/weaponlib";
    private static final String RESOURCE_DOMAIN_SHADERS_PROGRAM_WEAPONLIB = "shaders/program/weaponlib";
    private Map<UUID, LoadedShaderGroup> loaded = new LinkedHashMap<UUID, LoadedShaderGroup>();

    public boolean hasActiveGroups() {
        return this.loaded.size() > 0;
    }

    public void applyShader(DynamicShaderContext shaderContext, ItemStack itemStack) {
        DynamicShaderGroupSourceProvider shaderSourceProvider;
        DynamicShaderGroupSource source;
        Item item;
        if (itemStack != null && (item = itemStack.func_77973_b()) instanceof DynamicShaderGroupSourceProvider && (source = (shaderSourceProvider = (DynamicShaderGroupSourceProvider)item).getShaderSource(shaderContext.getPhase())) != null) {
            this.loadFromSource(shaderContext, source);
        }
    }

    public void applyShader(DynamicShaderContext shaderContext, PlayerItemInstance<?> instance) {
        DynamicShaderGroupSource source;
        DynamicShaderGroupSourceProvider shaderSourceProvider = null;
        if (instance != null) {
            if (instance instanceof DynamicShaderGroupSourceProvider) {
                shaderSourceProvider = (DynamicShaderGroupSourceProvider)((Object)instance);
            } else if (instance.getItem() instanceof DynamicShaderGroupSourceProvider) {
                shaderSourceProvider = (DynamicShaderGroupSourceProvider)instance.getItem();
            }
        }
        if (shaderSourceProvider != null && (source = shaderSourceProvider.getShaderSource(shaderContext.getPhase())) != null) {
            this.loadFromSource(shaderContext, source);
        }
    }

    public DynamicShaderGroup loadFromSource(DynamicShaderContext context, DynamicShaderGroupSource source) {
        int originalFramebufferId = Framebuffers.getCurrentFramebuffer();
        Iterator<Map.Entry<UUID, LoadedShaderGroup>> it = this.loaded.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<UUID, LoadedShaderGroup> e = it.next();
            LoadedShaderGroup loaded = e.getValue();
            if (loaded.phase != context.getPhase() || source.getSourceId().equals(e.getKey()) && context.getMainFramebuffer() == loaded.mainFrambuffer) continue;
            loaded.phase.remove(context, e.getValue().group);
            it.remove();
        }
        LoadedShaderGroup l = this.loaded.compute(source.getSourceId(), (s, currentLoaded) -> {
            if (currentLoaded != null && !currentLoaded.group.isDeleted()) {
                currentLoaded.confirmed = true;
                return currentLoaded;
            }
            LoadedShaderGroup v = new LoadedShaderGroup();
            v.confirmed = true;
            v.group = this.createShaderGroup(context, source, source.getShaderLocation());
            v.phase = context.getPhase();
            v.mainFrambuffer = context.getMainFramebuffer();
            return v;
        });
        if (l != null && l.group != null) {
            source.getUniforms(context).forEach(u -> l.group.setUniform((String)u.getU(), ((Function)u.getV()).apply(context)));
            context.getPhase().apply(context, l.group);
        }
        Minecraft mc = Minecraft.func_71410_x();
        Framebuffers.bindFramebuffer(originalFramebufferId, true, mc.func_147110_a().field_147621_c, mc.func_147110_a().field_147618_d);
        return l != null ? l.group : null;
    }

    private DynamicShaderGroup createShaderGroup(DynamicShaderContext context, DynamicShaderGroupSource source, ResourceLocation resourceLocation) {
        Minecraft mc = Minecraft.func_71410_x();
        TransformingResourceManager resourceManager = new TransformingResourceManager(mc.func_110442_L(), DynamicShaderGroupManager::modifyResourceLocation);
        TransformingTextureManager textureManager = new TransformingTextureManager(mc.func_110434_K(), DynamicShaderGroupManager::modifyResourceLocation);
        try {
            DynamicShaderGroup group = new DynamicShaderGroup(textureManager, resourceManager, context.getMainFramebuffer(), resourceLocation);
            group.func_148026_a(mc.field_71443_c, mc.field_71440_d);
            return group;
        }
        catch (JsonSyntaxException | IOException e) {
            logger.error("Failed to create shader due to " + e, e);
            return null;
        }
    }

    public void removeStaleShaders(DynamicShaderContext context) {
        Iterator<Map.Entry<UUID, LoadedShaderGroup>> it = this.loaded.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<UUID, LoadedShaderGroup> e = it.next();
            LoadedShaderGroup loaded = e.getValue();
            if (!loaded.confirmed) {
                it.remove();
                if (e.getValue().group == null) continue;
                loaded.phase.remove(context, e.getValue().group);
                continue;
            }
            e.getValue().confirmed = false;
        }
    }

    public void removeAllShaders(DynamicShaderContext context) {
        Iterator<Map.Entry<UUID, LoadedShaderGroup>> it = this.loaded.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<UUID, LoadedShaderGroup> e = it.next();
            LoadedShaderGroup loaded = e.getValue();
            if (e.getValue().group != null) {
                loaded.phase.remove(context, e.getValue().group);
            }
            it.remove();
        }
    }

    private static ResourceLocation modifyResourceLocation(ResourceLocation resourceLocation) {
        ResourceLocation result;
        switch (resourceLocation.func_110624_b()) {
            case "weaponlib": {
                if (resourceLocation.func_110623_a().startsWith("shaders/program/")) {
                    result = new ResourceLocation(RESOURCE_DOMAIN_WEAPONLIB, PATH_SHADER_PROGRAMS + resourceLocation.func_110623_a().substring(16));
                    break;
                }
                result = resourceLocation;
                break;
            }
            case "shaders/program/weaponlib": {
                result = new ResourceLocation(RESOURCE_DOMAIN_WEAPONLIB, PATH_SHADER_PROGRAMS + resourceLocation.func_110623_a());
                break;
            }
            case "textures/effect/weaponlib": {
                result = new ResourceLocation(RESOURCE_DOMAIN_WEAPONLIB, PATH_RESOURCES + resourceLocation.func_110623_a());
                break;
            }
            default: {
                result = resourceLocation;
            }
        }
        return result;
    }

    private static class LoadedShaderGroup {
        DynamicShaderGroup group;
        DynamicShaderPhase phase;
        Framebuffer mainFrambuffer;
        boolean confirmed;

        private LoadedShaderGroup() {
        }
    }
}


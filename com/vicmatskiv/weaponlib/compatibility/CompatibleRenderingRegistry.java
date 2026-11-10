/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.ItemModelMesher
 *  net.minecraft.client.renderer.RenderItem
 *  net.minecraft.client.renderer.block.model.ModelResourceLocation
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.Item
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.event.ModelBakeEvent
 *  net.minecraftforge.client.model.ICustomModelLoader
 *  net.minecraftforge.client.model.IModel
 *  net.minecraftforge.client.model.ModelLoaderRegistry
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.client.registry.RenderingRegistry
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.ModelSourceRenderer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CompatibleRenderingRegistry
implements ICustomModelLoader {
    private List<ModelSourceRenderer> renderers = new ArrayList<ModelSourceRenderer>();
    private Set<String> modelSourceLocations = new HashSet<String>();
    private List<Consumer<RenderItem>> delayedRegistrations = new ArrayList<Consumer<RenderItem>>();
    private String modId;

    public CompatibleRenderingRegistry(String modId) {
        this.modId = modId;
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void bakeModel(ModelBakeEvent event) {
        for (ModelSourceRenderer model : this.renderers) {
            event.getModelRegistry().func_82595_a((Object)model.getResourceLocation(), (Object)model);
        }
    }

    public void register(Item item, String name, Object renderer) {
        if (renderer != null) {
            this.renderers.add((ModelSourceRenderer)renderer);
        }
        this.modelSourceLocations.add(this.modId + ":models/item/" + name);
        ModelResourceLocation modelID = new ModelResourceLocation(this.modId + ":" + name, "inventory");
        if (renderer != null) {
            ((ModelSourceRenderer)renderer).setResourceLocation(modelID);
        }
        this.delayedRegistrations.add(renderItem -> {
            ItemModelMesher itemModelMesher = renderItem.func_175037_a();
            itemModelMesher.func_178086_a(item, 0, modelID);
        });
    }

    public void register(Item item, ResourceLocation name, Object renderer) {
        if (renderer != null) {
            this.renderers.add((ModelSourceRenderer)renderer);
            this.modelSourceLocations.add(this.modId + ":models/item/" + name);
        }
        ModelResourceLocation modelID = new ModelResourceLocation(name, "inventory");
        if (renderer != null) {
            ((ModelSourceRenderer)renderer).setResourceLocation(modelID);
        }
        this.delayedRegistrations.add(renderItem -> {
            ItemModelMesher itemModelMesher = renderItem.func_175037_a();
            itemModelMesher.func_178086_a(item, 0, modelID);
        });
    }

    public void func_110549_a(IResourceManager resourceManager) {
    }

    public boolean accepts(ResourceLocation modelLocation) {
        return this.modId.equals(modelLocation.func_110624_b()) && this.modelSourceLocations.contains(modelLocation.toString());
    }

    public IModel loadModel(ResourceLocation modelLocation) throws IOException {
        return ModelLoaderRegistry.getMissingModel();
    }

    public void registerEntityRenderingHandler(Class<? extends Entity> class1, Object spawnEntityRenderer) {
        RenderingRegistry.registerEntityRenderingHandler(class1, (Render)((Render)spawnEntityRenderer));
    }

    public void processDelayedRegistrations() {
        RenderItem renderItem = Minecraft.func_71410_x().func_175599_af();
        this.delayedRegistrations.forEach(r -> r.accept(renderItem));
        this.delayedRegistrations.clear();
    }

    public void preInit() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        ModelLoaderRegistry.registerLoader((ICustomModelLoader)this);
    }
}


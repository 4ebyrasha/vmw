/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  net.minecraft.client.renderer.texture.ITextureObject
 *  net.minecraft.client.renderer.texture.ITickableTextureObject
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.util.ResourceLocation
 */
package com.vicmatskiv.weaponlib;

import java.util.function.UnaryOperator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.ITickableTextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;

public class TransformingTextureManager
extends TextureManager {
    private TextureManager delegate;
    private UnaryOperator<ResourceLocation> locationTransformer;

    public TransformingTextureManager(TextureManager delegate, UnaryOperator<ResourceLocation> locationTransformer) {
        super(null);
        this.delegate = delegate;
        this.locationTransformer = locationTransformer;
    }

    public void func_110577_a(ResourceLocation resource) {
        this.delegate.func_110577_a((ResourceLocation)this.locationTransformer.apply(resource));
    }

    public boolean func_110580_a(ResourceLocation textureLocation, ITickableTextureObject textureObj) {
        return this.delegate.func_110580_a((ResourceLocation)this.locationTransformer.apply(textureLocation), textureObj);
    }

    public boolean func_110579_a(ResourceLocation textureLocation, ITextureObject textureObj) {
        return this.delegate.func_110579_a((ResourceLocation)this.locationTransformer.apply(textureLocation), textureObj);
    }

    public ITextureObject func_110581_b(ResourceLocation textureLocation) {
        return this.delegate.func_110581_b((ResourceLocation)this.locationTransformer.apply(textureLocation));
    }

    public ResourceLocation func_110578_a(String name, DynamicTexture texture) {
        return this.delegate.func_110578_a(name, texture);
    }

    public void func_110550_d() {
        this.delegate.func_110550_d();
    }

    public void func_147645_c(ResourceLocation textureLocation) {
        this.delegate.func_147645_c((ResourceLocation)this.locationTransformer.apply(textureLocation));
    }

    public void func_110549_a(IResourceManager resourceManager) {
        this.delegate.func_110549_a(resourceManager);
    }
}


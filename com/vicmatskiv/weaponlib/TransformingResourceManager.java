/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resources.IResource
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.util.ResourceLocation
 */
package com.vicmatskiv.weaponlib;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;

public class TransformingResourceManager
implements IResourceManager {
    private IResourceManager delegate;
    private UnaryOperator<ResourceLocation> locationTransformer;

    public TransformingResourceManager(IResourceManager delegate, UnaryOperator<ResourceLocation> locationTransformer) {
        this.delegate = delegate;
        this.locationTransformer = locationTransformer;
    }

    public Set<String> func_135055_a() {
        return this.delegate.func_135055_a();
    }

    public IResource func_110536_a(ResourceLocation location) throws IOException {
        return this.delegate.func_110536_a((ResourceLocation)this.locationTransformer.apply(location));
    }

    public List<IResource> func_135056_b(ResourceLocation location) throws IOException {
        return this.delegate.func_135056_b((ResourceLocation)this.locationTransformer.apply(location));
    }
}


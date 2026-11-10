/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resources.IResourcePack
 *  net.minecraft.client.resources.data.IMetadataSection
 *  net.minecraft.client.resources.data.MetadataSerializer
 */
package com.vicmatskiv.weaponlib.compatibility;

import java.io.IOException;
import java.util.Set;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.MetadataSerializer;

public abstract class CompatibleResourcePack
implements IResourcePack {
    public final Set<String> func_110587_b() {
        return this.getCompatibleResourceDomains();
    }

    protected abstract Set<String> getCompatibleResourceDomains();

    public <T extends IMetadataSection> T func_135058_a(MetadataSerializer metadataSerializer, String metadataSectionName) throws IOException {
        return null;
    }
}


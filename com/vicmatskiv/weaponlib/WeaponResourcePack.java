/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ResourceLocation
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.compatibility.CompatibleResourcePack;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.util.ResourceLocation;

public class WeaponResourcePack
extends CompatibleResourcePack {
    private static final String WEAPONLIB_RESOURCE_DOMAIN = "weaponlib";
    private static final Set<String> RESOURCE_DOMAINS = Collections.unmodifiableSet(new HashSet<String>(Collections.singleton("weaponlib")));

    public InputStream func_110590_a(ResourceLocation resourceLocation) throws IOException {
        String resourcePath = this.modifyResourcePath(resourceLocation);
        return this.getClass().getResourceAsStream(resourcePath);
    }

    private String modifyResourcePath(ResourceLocation resourceLocation) {
        int lastIndexOfSlash;
        String resourcePath = resourceLocation.func_110623_a();
        if (resourcePath.startsWith("textures") && (lastIndexOfSlash = resourcePath.lastIndexOf(47)) >= 0) {
            String fileName = resourcePath.substring(lastIndexOfSlash + 1);
            resourcePath = '/' + this.getClass().getPackage().getName().replace('.', '/') + "/resources/" + fileName;
        }
        return resourcePath;
    }

    public boolean func_110589_b(ResourceLocation resourceLocation) {
        String resourcePath = this.modifyResourcePath(resourceLocation);
        boolean value = WEAPONLIB_RESOURCE_DOMAIN.equals(resourceLocation.func_110624_b()) && this.getClass().getResource(resourcePath) != null;
        return value;
    }

    @Override
    public Set<String> getCompatibleResourceDomains() {
        return RESOURCE_DOMAINS;
    }

    public BufferedImage func_110586_a() throws IOException {
        return null;
    }

    public String func_130077_b() {
        return this.getClass().getSimpleName();
    }
}


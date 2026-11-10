/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ResourceLocation
 */
package com.vicmatskiv.weaponlib.shader;

import com.vicmatskiv.weaponlib.Tuple;
import com.vicmatskiv.weaponlib.shader.DynamicShaderContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import net.minecraft.util.ResourceLocation;

public class DynamicShaderGroupSource {
    private ResourceLocation shaderLocation;
    private List<Tuple<String, Function<DynamicShaderContext, Object>>> uniforms;
    private UUID sourceId;

    public DynamicShaderGroupSource(UUID sourceId, ResourceLocation location) {
        this.sourceId = sourceId;
        this.shaderLocation = location;
        this.uniforms = new ArrayList<Tuple<String, Function<DynamicShaderContext, Object>>>();
    }

    public UUID getSourceId() {
        return this.sourceId;
    }

    public DynamicShaderGroupSource withUniform(String name, Function<DynamicShaderContext, Object> value) {
        this.uniforms.add(new Tuple<String, Function<DynamicShaderContext, Object>>(name, value));
        return this;
    }

    public ResourceLocation getShaderLocation() {
        return this.shaderLocation;
    }

    public List<Tuple<String, Function<DynamicShaderContext, Object>>> getUniforms(DynamicShaderContext context) {
        return Collections.unmodifiableList(this.uniforms);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.shader.ShaderGroup
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.shader;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWorldRenderer;
import com.vicmatskiv.weaponlib.shader.DynamicShaderContext;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroup;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.ShaderGroup;
import org.lwjgl.opengl.GL11;

public interface DynamicShaderPhase {
    public static final DynamicShaderPhase POST_WORLD_RENDER = new EntityRendererTarget();
    public static final DynamicShaderPhase POST_WORLD_OPTICAL_SCOPE_RENDER = new CompatibleWorldRendererTarget();
    public static final DynamicShaderPhase PRE_ITEM_RENDER = new DynamicShaderPhase(){

        @Override
        public void apply(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            if (OpenGlHelper.field_148824_g) {
                int originalMatrixMode = GL11.glGetInteger((int)2976);
                GL11.glMatrixMode((int)5890);
                GL11.glPushMatrix();
                GL11.glLoadIdentity();
                GL11.glPushAttrib((int)8193);
                shaderGroup.func_148018_a(context.getPartialTicks());
                GL11.glPopAttrib();
                GL11.glPopMatrix();
                GL11.glMatrixMode((int)originalMatrixMode);
            }
        }

        @Override
        public void remove(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            shaderGroup.func_148021_a();
        }
    };

    public void apply(DynamicShaderContext var1, DynamicShaderGroup var2);

    public void remove(DynamicShaderContext var1, DynamicShaderGroup var2);

    public static class CompatibleWorldRendererTarget
    implements DynamicShaderPhase {
        @Override
        public void apply(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            CompatibleWorldRenderer entityRenderer;
            ShaderGroup currentShaderGroup;
            Object target = context.getTarget();
            if (target instanceof CompatibleWorldRenderer && (currentShaderGroup = (entityRenderer = (CompatibleWorldRenderer)((Object)target)).func_147706_e()) != shaderGroup) {
                entityRenderer.setShaderGroup(shaderGroup);
                entityRenderer.useShader(true);
            }
        }

        @Override
        public void remove(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            CompatibleWorldRenderer entityRenderer;
            ShaderGroup currentShaderGroup;
            Object target = context.getTarget();
            if (target instanceof CompatibleWorldRenderer && (currentShaderGroup = (entityRenderer = (CompatibleWorldRenderer)((Object)target)).func_147706_e()) instanceof DynamicShaderGroup) {
                currentShaderGroup.func_148021_a();
                entityRenderer.setShaderGroup(null);
            }
        }
    }

    public static class EntityRendererTarget
    implements DynamicShaderPhase {
        @Override
        public void apply(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            EntityRenderer entityRenderer;
            ShaderGroup currentShaderGroup;
            Object target = context.getTarget();
            if (target instanceof EntityRenderer && (currentShaderGroup = CompatibilityProvider.compatibility.getShaderGroup(entityRenderer = (EntityRenderer)target)) != shaderGroup) {
                this.remove(context, null);
                CompatibilityProvider.compatibility.setShaderGroup(entityRenderer, shaderGroup);
                EntityRendererTarget.setUseShader(entityRenderer, true);
            }
        }

        @Override
        public void remove(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            EntityRenderer entityRenderer;
            ShaderGroup currentShaderGroup;
            Object target = context.getTarget();
            if (target instanceof EntityRenderer && (currentShaderGroup = CompatibilityProvider.compatibility.getShaderGroup(entityRenderer = (EntityRenderer)target)) instanceof DynamicShaderGroup) {
                currentShaderGroup.func_148021_a();
                CompatibilityProvider.compatibility.setShaderGroup(entityRenderer, null);
            }
        }

        private static void setUseShader(EntityRenderer entityRenderer, boolean value) {
            CompatibilityProvider.compatibility.useShader(entityRenderer, value);
        }
    }
}


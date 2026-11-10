/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;

public class Framebuffers {
    public static int getCurrentTexture() {
        return GlStateManager.func_187397_v((int)32873);
    }

    public static void bindTexture(int textureId) {
        GlStateManager.func_179144_i((int)textureId);
    }

    public static int getCurrentFramebuffer() {
        return GlStateManager.func_187397_v((int)36006);
    }

    public static void unbindFramebuffer() {
        if (OpenGlHelper.func_148822_b()) {
            OpenGlHelper.func_153171_g((int)OpenGlHelper.field_153198_e, (int)0);
        }
    }

    public static void bindFramebuffer(int framebufferId, boolean depthEnabled, int width, int height) {
        if (OpenGlHelper.func_148822_b()) {
            OpenGlHelper.func_153171_g((int)OpenGlHelper.field_153198_e, (int)framebufferId);
            if (depthEnabled) {
                GlStateManager.func_179083_b((int)0, (int)0, (int)width, (int)height);
            }
        }
    }
}


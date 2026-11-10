/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.perspective;

import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderTickEvent;
import com.vicmatskiv.weaponlib.compatibility.Framebuffers;
import com.vicmatskiv.weaponlib.perspective.Perspective;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public abstract class ScreenPerspective
extends Perspective<RenderableState> {
    public ScreenPerspective() {
        this.width = 427;
        this.height = 240;
    }

    @Override
    public void update(CompatibleRenderTickEvent event) {
        int originalFramebufferId = Framebuffers.getCurrentFramebuffer();
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)8193);
        this.enable2DRenderingMode(427.0, 240.0);
        this.framebuffer.func_147614_f();
        this.framebuffer.func_147610_a(true);
        this.drawScreen();
        this.restoreRenderingMode();
        GL11.glPopAttrib();
        GL11.glPopMatrix();
        Minecraft mc = Minecraft.func_71410_x();
        Framebuffers.bindFramebuffer(originalFramebufferId, true, mc.func_147110_a().field_147621_c, mc.func_147110_a().field_147618_d);
    }

    protected abstract void drawScreen();

    private void enable2DRenderingMode(double projectionWidth, double projectionHeight) {
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)projectionWidth, (double)projectionHeight, (double)0.0, (double)-1.0, (double)1.0);
        GL11.glMatrixMode((int)5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
    }

    private void restoreRenderingMode() {
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
    }
}


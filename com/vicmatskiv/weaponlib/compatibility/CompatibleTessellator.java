/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

public class CompatibleTessellator {
    private static Tessellator tessellator = Tessellator.func_178181_a();
    private static CompatibleTessellator compatibleTessellator = new CompatibleTessellator();
    private boolean hasColor;
    private boolean hasLightMap;
    private float red;
    private float green;
    private float blue;
    private float alpha;
    private int i;
    private int j;

    public static CompatibleTessellator getInstance() {
        return compatibleTessellator;
    }

    public void startDrawingQuads() {
        BufferBuilder vertextBuffer = tessellator.func_178180_c();
        vertextBuffer.func_181668_a(7, DefaultVertexFormats.field_181707_g);
        this.hasColor = false;
        this.hasLightMap = false;
    }

    public void startDrawingParticles() {
        BufferBuilder vertextBuffer = tessellator.func_178180_c();
        vertextBuffer.func_181668_a(7, DefaultVertexFormats.field_181704_d);
    }

    public void startDrawingLines() {
        BufferBuilder renderer = tessellator.func_178180_c();
        renderer.func_181668_a(1, DefaultVertexFormats.field_181705_e);
    }

    public void addVertexWithUV(double d, double e, double zLevel, double u, double v) {
        BufferBuilder vertextBuffer = tessellator.func_178180_c();
        vertextBuffer.func_181662_b(d, e, zLevel);
        vertextBuffer.func_187315_a(u, v);
        if (this.hasColor) {
            vertextBuffer.func_181666_a(this.red, this.green, this.blue, this.alpha);
        }
        if (this.hasLightMap) {
            vertextBuffer.func_187314_a(this.i, this.j);
        }
        vertextBuffer.func_181675_d();
    }

    public void draw() {
        tessellator.func_78381_a();
    }

    public void setLightMap(int i, int j) {
        this.hasLightMap = true;
        this.i = i;
        this.j = j;
    }

    public void disableLightMap() {
        this.hasLightMap = false;
    }

    public void setColorRgba(float red, float green, float blue, float alpha) {
        this.hasColor = true;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public void addVertex(float x, float y, float z) {
        tessellator.func_178180_c().func_181662_b((double)x, (double)y, (double)z);
    }

    public void endVertex() {
        tessellator.func_178180_c().func_181675_d();
    }

    public BufferBuilder getBuffer() {
        return tessellator.func_178180_c();
    }
}


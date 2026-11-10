/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Matrix4f
 */
package com.vicmatskiv.weaponlib.animation;

import com.vicmatskiv.weaponlib.animation.MatrixHelper;
import java.nio.FloatBuffer;
import java.util.Random;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

public final class Randomizer {
    private Random random = new Random();
    private Matrix4f beforeMatrix;
    private Matrix4f afterMatrix;
    private Matrix4f currentMatrix = this.getMatrixForPositioning(() -> {});
    private long startTime;
    private float rate = 0.25f;
    private float amplitude = 0.04f;
    private float xbias = 0.0f;
    private float ybias = 0.0f;
    private float zbias = 0.0f;

    public Randomizer() {
        this.next();
    }

    private boolean reconfigure(float rate, float amplitude) {
        if (rate == this.rate && amplitude == this.amplitude) {
            return false;
        }
        boolean reconfigured = false;
        if (rate != this.rate || amplitude != this.amplitude) {
            if (rate == 0.0f && amplitude == 0.0f) {
                this.beforeMatrix = this.currentMatrix = this.getMatrixForPositioning(() -> {});
                this.afterMatrix = this.currentMatrix;
            } else {
                reconfigured = true;
            }
        }
        this.rate = rate;
        this.amplitude = amplitude;
        if (reconfigured) {
            this.next();
        }
        return reconfigured;
    }

    private void next() {
        this.beforeMatrix = this.currentMatrix;
        this.afterMatrix = this.createRandomMatrix();
        this.startTime = System.currentTimeMillis();
    }

    private Matrix4f createRandomMatrix() {
        Runnable c = () -> {
            float maxAngle = 5.0f;
            float xRotation = maxAngle * this.amplitude * ((this.random.nextFloat() - 0.5f) * 2.0f + this.xbias);
            float yRotation = maxAngle * this.amplitude * ((this.random.nextFloat() - 0.5f) * 2.0f + this.ybias);
            float zRotation = maxAngle * this.amplitude * ((this.random.nextFloat() - 0.5f) * 2.0f + this.zbias) * 3.0f;
            GL11.glRotatef((float)xRotation, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)yRotation, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)zRotation, (float)0.0f, (float)0.0f, (float)1.0f);
            float xRandomOffset = this.amplitude * ((this.random.nextFloat() - 0.5f) * 2.0f + this.xbias);
            float yRandomOffset = this.amplitude * ((this.random.nextFloat() - 0.5f) * 2.0f + this.ybias);
            float zRandomOffset = this.amplitude * ((this.random.nextFloat() - 0.5f) * 2.0f + this.zbias) / 3.0f;
            GL11.glTranslatef((float)xRandomOffset, (float)yRandomOffset, (float)zRandomOffset);
        };
        return this.getMatrixForPositioning(c);
    }

    private Matrix4f getMatrixForPositioning(Runnable position) {
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        FloatBuffer buf = BufferUtils.createFloatBuffer((int)16);
        position.run();
        GL11.glGetFloat((int)2982, (FloatBuffer)buf);
        buf.rewind();
        Matrix4f matrix = new Matrix4f();
        matrix.load(buf);
        GL11.glPopMatrix();
        return matrix;
    }

    public void update(float rate, float amplitude) {
        this.reconfigure(rate, amplitude);
        if (rate == 0.0f || amplitude == 0.0f) {
            return;
        }
        long currentTime = System.currentTimeMillis();
        float progress = (float)(currentTime - this.startTime) * rate / 1000.0f;
        if (progress >= 1.0f) {
            this.next();
            progress = 0.0f;
        }
        Matrix4f currentTransformMatrix = MatrixHelper.captureMatrix();
        Matrix4f m1 = MatrixHelper.interpolateMatrix(this.beforeMatrix, 1.0f - progress);
        Matrix4f m2 = MatrixHelper.interpolateMatrix(this.afterMatrix, progress);
        this.currentMatrix = Matrix4f.add((Matrix4f)m1, (Matrix4f)m2, null);
        Matrix4f composite = Matrix4f.mul((Matrix4f)currentTransformMatrix, (Matrix4f)this.currentMatrix, null);
        MatrixHelper.loadMatrix(composite);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.animation;

import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.animation.PlayerAnimation;
import com.vicmatskiv.weaponlib.animation.ScreenShakingAnimationManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class ScreenShakeAnimation
implements PlayerAnimation {
    private float startRotateX = 0.0f;
    private float startRotateY = 0.0f;
    private float startRotateZ = 0.0f;
    private float targetRotateX = 0.0f;
    private float targetRotateY = 0.0f;
    private float targetRotateZ = 0.0f;
    private float startX = 0.0f;
    private float startY = 0.0f;
    private float startZ = 0.0f;
    private float targetX = 0.0f;
    private float targetY = 0.0f;
    private float targetZ = 0.0f;
    private float xTranslateCoefficient = 0.05f;
    private float yTranslateCoefficient = 0.05f;
    private float zTranslateCoefficient = 0.1f;
    private float xRotationCoefficient = 0.01f;
    private float yRotationCoefficient = 0.01f;
    private float zRotationCoefficient = 0.5f;
    private float rotationAttenuation = 0.5f;
    private long transitionDuration = 2000L;
    private long startTime;
    private ScreenShakingAnimationManager.State state;
    private CirclePointGenerator circlePointGenerator;
    private float totalAdjustment;
    private float cumulativeAttenuation = 1.0f;
    private boolean initialized;

    private ScreenShakeAnimation(ScreenShakingAnimationManager.State state) {
        this.state = state;
    }

    @Override
    public void update(EntityPlayer player, boolean fadeOut) {
        float[] next;
        float progress = (float)(System.currentTimeMillis() - this.startTime) / (float)this.transitionDuration;
        if (progress >= 1.0f) {
            progress = 0.0f;
            this.startTime = System.currentTimeMillis();
        }
        if (!this.initialized) {
            next = this.circlePointGenerator.next();
            this.startX = this.targetX;
            this.startY = this.targetY;
            this.startZ = this.targetZ;
            this.startRotateX = this.targetRotateX;
            this.startRotateY = this.targetRotateY;
            this.startRotateZ = this.targetRotateZ;
            this.targetX = next[1] * this.xTranslateCoefficient;
            this.targetY = next[2] * this.yTranslateCoefficient;
            this.targetZ = this.zTranslateCoefficient;
            this.targetRotateX = 1.0f;
            this.targetRotateY = 1.0f;
            this.targetRotateZ = 1.0f;
            this.totalAdjustment += this.state.getStepAdjustement();
            this.initialized = true;
        } else if (progress == 0.0f) {
            next = this.circlePointGenerator.next();
            this.startX = this.targetX;
            this.startY = this.targetY;
            this.startZ = this.targetZ;
            this.startRotateX = this.targetRotateX;
            this.startRotateY = this.targetRotateY;
            this.startRotateZ = this.targetRotateZ;
            this.targetX = next[1] * this.xTranslateCoefficient;
            this.targetY = next[2] * this.yTranslateCoefficient;
            this.targetZ = this.targetZ * this.rotationAttenuation * this.zTranslateCoefficient;
            this.targetRotateX = -this.targetRotateX * this.rotationAttenuation;
            this.targetRotateY = -this.targetRotateY * this.rotationAttenuation;
            this.targetRotateZ = -this.targetRotateZ * this.rotationAttenuation;
            this.totalAdjustment += this.state.getStepAdjustement();
        }
        float adjustedProgress = MathHelper.func_76126_a((float)(progress * (float)Math.PI / 2.0f));
        float currentX = this.startX + (this.targetX - this.startX) * adjustedProgress;
        float currentY = this.startY + (this.targetY - this.startY) * adjustedProgress;
        float currentZ = this.startZ + (this.targetZ - this.startZ) * adjustedProgress;
        GL11.glTranslatef((float)currentX, (float)currentY, (float)currentZ);
        float currentRotateX = this.startRotateX + (this.targetRotateX - this.startRotateX) * adjustedProgress;
        GL11.glRotatef((float)(currentRotateX * this.xRotationCoefficient), (float)1.0f, (float)0.0f, (float)0.0f);
        float currentRotateY = this.startRotateY + (this.targetRotateY - this.startRotateY) * adjustedProgress;
        GL11.glRotatef((float)(currentRotateY * this.yRotationCoefficient), (float)0.0f, (float)1.0f, (float)0.0f);
        float currentRotateZ = this.startRotateZ + (this.targetRotateZ - this.startRotateZ) * adjustedProgress;
        GL11.glRotatef((float)(currentRotateZ * this.zRotationCoefficient), (float)0.0f, (float)0.0f, (float)1.0f);
        this.cumulativeAttenuation *= this.rotationAttenuation;
    }

    @Override
    public void reset(EntityPlayer player, boolean force) {
        if (force || this.totalAdjustment != 0.0f) {
            this.totalAdjustment = 0.0f;
            this.cumulativeAttenuation = 1.0f;
            this.circlePointGenerator.reset();
            this.targetZ = this.zTranslateCoefficient;
            this.targetRotateX = -Math.signum(this.targetRotateX);
            this.targetRotateY = -Math.signum(this.targetRotateY);
            this.targetRotateZ = -Math.signum(this.targetRotateZ);
        } else {
            this.totalAdjustment = 0.0f;
            this.cumulativeAttenuation = 1.0f;
            this.targetZ = this.zTranslateCoefficient;
            this.targetRotateX = Math.signum(this.targetRotateX) * this.rotationAttenuation;
            this.targetRotateY = Math.signum(this.targetRotateY) * this.rotationAttenuation;
            this.targetRotateZ = Math.signum(this.targetRotateZ) * this.rotationAttenuation;
        }
    }

    @Override
    public boolean isCompleted() {
        return this.cumulativeAttenuation < 0.001f && this.circlePointGenerator.cumulativeAttenuation < 0.001f;
    }

    @Override
    public ScreenShakingAnimationManager.State getState() {
        return this.state;
    }

    public static class Builder {
        private float rotationAttenuation = 0.5f;
        private float translationAttenuation = 0.5f;
        private long transitionDuration = 2000L;
        private float xTranslateCoefficient = 0.05f;
        private float yTranslateCoefficient = 0.05f;
        private float zTranslateCoefficient = 0.1f;
        private float xRotationCoefficient = 0.01f;
        private float yRotationCoefficient = 0.01f;
        private float zRotationCoefficient = 0.5f;
        private ScreenShakingAnimationManager.State state;

        public Builder withRotationAttenuation(float rotationAttenuation) {
            this.rotationAttenuation = rotationAttenuation;
            return this;
        }

        public Builder withTranslationAttenuation(float translationAttenuation) {
            this.translationAttenuation = translationAttenuation;
            return this;
        }

        public Builder withTransitionDuration(long transitionDuration) {
            this.transitionDuration = transitionDuration;
            return this;
        }

        public Builder withXTranslateCoefficient(float xTranslateCoefficient) {
            this.xTranslateCoefficient = xTranslateCoefficient;
            return this;
        }

        public Builder withYTranslateCoefficient(float yTranslateCoefficient) {
            this.yTranslateCoefficient = yTranslateCoefficient;
            return this;
        }

        public Builder withZTranslateCoefficient(float zTranslateCoefficient) {
            this.zTranslateCoefficient = zTranslateCoefficient;
            return this;
        }

        public Builder withXRotationCoefficient(float xRotationCoefficient) {
            this.xRotationCoefficient = xRotationCoefficient;
            return this;
        }

        public Builder withYRotationCoefficient(float yRotationCoefficient) {
            this.yRotationCoefficient = yRotationCoefficient;
            return this;
        }

        public Builder withZRotationCoefficient(float zRotationCoefficient) {
            this.zRotationCoefficient = zRotationCoefficient;
            return this;
        }

        public Builder withState(ScreenShakingAnimationManager.State state) {
            this.state = state;
            return this;
        }

        public Builder withState(RenderableState state) {
            this.state = ScreenShakingAnimationManager.toManagedState(state);
            return this;
        }

        PlayerAnimation build() {
            if (this.state == null) {
                throw new IllegalStateException("State is not set");
            }
            ScreenShakeAnimation animation = new ScreenShakeAnimation(this.state);
            animation.rotationAttenuation = this.rotationAttenuation;
            animation.xTranslateCoefficient = this.xTranslateCoefficient;
            animation.yTranslateCoefficient = this.yTranslateCoefficient;
            animation.zTranslateCoefficient = this.zTranslateCoefficient;
            animation.xRotationCoefficient = this.xRotationCoefficient;
            animation.yRotationCoefficient = this.yRotationCoefficient;
            animation.zRotationCoefficient = this.zRotationCoefficient;
            animation.transitionDuration = this.transitionDuration;
            animation.state = this.state;
            animation.circlePointGenerator = new CirclePointGenerator(1.0f, 0.7853982f, 0.62831855f, this.translationAttenuation);
            return animation;
        }
    }

    static class CirclePointGenerator {
        private float startingRadius;
        private float nextRadius;
        private float alpha;
        private float nextAngle;
        private float attenuation;
        private float cumulativeAttenuation = 1.0f;

        public CirclePointGenerator(float radius, float startAngle, float alpha, float attenuation) {
            this.startingRadius = radius;
            this.nextRadius = radius;
            this.alpha = alpha;
            this.nextAngle = startAngle;
            this.attenuation = attenuation;
        }

        public float[] next() {
            float currentX = this.nextRadius * MathHelper.func_76134_b((float)this.nextAngle);
            float currentY = this.nextRadius * MathHelper.func_76126_a((float)this.nextAngle);
            float currentRadius = this.nextRadius;
            this.nextAngle = (float)((double)this.nextAngle + (Math.PI * 2 - (double)(2.0f * this.alpha)));
            this.nextAngle = (float)((double)this.nextAngle % (Math.PI * 2));
            this.nextRadius *= this.attenuation;
            this.cumulativeAttenuation *= this.attenuation;
            return new float[]{currentRadius, currentX, currentY};
        }

        public void reset() {
            this.nextRadius = this.startingRadius;
            this.cumulativeAttenuation = 1.0f;
        }
    }
}


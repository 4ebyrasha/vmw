/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.perspective.PerspectiveRenderer;
import java.util.function.BiConsumer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ItemScope
extends ItemAttachment<Weapon> {
    private static final int DEFAULT_MAX_STACK_SIZE = 1;
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;
    private ModContext modContext;
    private Builder builder;

    private ItemScope(Builder builder) {
        super(builder.getModId(), AttachmentCategory.SCOPE, builder.getModel(), builder.getTextureName(), null, null, null);
        this.builder = builder;
        this.func_77625_d(1);
    }

    public float getMinZoom() {
        return this.builder.minZoom;
    }

    public float getMaxZoom() {
        return this.builder.maxZoom;
    }

    public boolean isOptical() {
        return this.builder.isOpticalZoom;
    }

    public boolean hasNightVision() {
        return this.builder.hasNightVision;
    }

    public int getWidth() {
        return this.builder.width;
    }

    public int getHeight() {
        return this.builder.height;
    }

    public static final class Builder
    extends AttachmentBuilder<Weapon> {
        private float minZoom;
        private float maxZoom;
        private boolean isOpticalZoom;
        private boolean hasNightVision;
        private BiConsumer<EntityLivingBase, ItemStack> viewfinderPositioning;
        private int width = 400;
        private int height = 400;

        public Builder withZoomRange(float minZoom, float maxZoom) {
            this.minZoom = minZoom;
            this.maxZoom = maxZoom;
            return this;
        }

        public Builder withOpticalZoom() {
            this.isOpticalZoom = true;
            return this;
        }

        public Builder withViewfinderSize(int width, int height) {
            this.width = width;
            this.height = height;
            return this;
        }

        public Builder withNightVision() {
            this.hasNightVision = true;
            return this;
        }

        public Builder withViewfinderPositioning(BiConsumer<EntityLivingBase, ItemStack> viewfinderPositioning) {
            this.viewfinderPositioning = viewfinderPositioning;
            return this;
        }

        @Override
        protected ItemAttachment<Weapon> createAttachment(ModContext modContext) {
            if (this.isOpticalZoom) {
                if (this.viewfinderPositioning == null) {
                    this.viewfinderPositioning = (p, s) -> {
                        GL11.glScalef((float)1.1f, (float)1.1f, (float)1.1f);
                        GL11.glTranslatef((float)0.1f, (float)0.4f, (float)0.6f);
                    };
                }
                this.withPostRender(new PerspectiveRenderer(this.viewfinderPositioning));
            }
            ItemScope itemScope = new ItemScope(this);
            itemScope.modContext = modContext;
            return itemScope;
        }

        @Override
        public ItemAttachment<Weapon> build(ModContext modContext) {
            this.apply2 = (a, instance) -> {
                float zoom = this.minZoom + (this.maxZoom - this.minZoom) / 2.0f;
                instance.setZoom(zoom);
            };
            this.remove2 = (a, instance) -> instance.setZoom(1.0f);
            return super.build(modContext);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.PlayerRenderer;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.animation.MultipartPositioning;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleStaticModelSourceRenderer;
import com.vicmatskiv.weaponlib.compatibility.Interceptors;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class StaticModelSourceRenderer
extends CompatibleStaticModelSourceRenderer {
    private StaticModelSourceRenderer(Builder builder) {
        super(builder);
    }

    @Override
    protected ModContext getModContext() {
        return this.builder.modContext;
    }

    @Override
    public void renderCustomEquipped(EntityPlayer player, ItemStack itemStack) {
        BiConsumer<EntityPlayer, ItemStack> positioning;
        MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> bodyPositioner;
        PlayerRenderer playerRenderer;
        RenderContext<RenderableState> renderContext = new RenderContext<RenderableState>(this.getModContext(), (EntityLivingBase)player, itemStack);
        GL11.glPushMatrix();
        CompatibilityProvider.compatibility.adjustCustomEquippedPosition();
        GL11.glScalef((float)0.33f, (float)0.33f, (float)0.33f);
        GL11.glRotatef((float)180.0f, (float)0.001f, (float)0.0f, (float)0.0f);
        GL11.glTranslatef((float)-0.5f, (float)0.5f, (float)0.5f);
        if (Interceptors.isProning(player) && (playerRenderer = Interceptors.getPlayerRenderer((Entity)player)) != null && (bodyPositioner = playerRenderer.getCurrentPositioner()) != null) {
            bodyPositioner.position(Part.MAIN, renderContext);
        }
        if ((positioning = this.builder.getCustomEquippedPositioning()) != null) {
            positioning.accept(player, itemStack);
            this.renderModelSource(renderContext, itemStack, null, null, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.08f);
        }
        GL11.glPopMatrix();
    }

    public static class Builder {
        private Consumer<ItemStack> entityPositioning;
        private Consumer<ItemStack> inventoryPositioning;
        private BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning;
        private BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning;
        private BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning;
        private BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning;
        private BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning;
        private BiConsumer<ModelBase, ItemStack> inventoryModelPositioning;
        private BiConsumer<ModelBase, ItemStack> entityModelPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;
        private String modId;
        private ModContext modContext;
        private boolean isHiddenInInventory;

        public Builder withModId(String modId) {
            this.modId = modId;
            return this;
        }

        public Builder withHiddenInventory(boolean isHiddenInInventory) {
            this.isHiddenInInventory = isHiddenInInventory;
            return this;
        }

        public Builder withModContext(ModContext modContext) {
            this.modContext = modContext;
            return this;
        }

        public Builder withFirstPersonPositioning(BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning) {
            this.firstPersonPositioning = firstPersonPositioning;
            return this;
        }

        public Builder withFirstPersonHandPositioning(Consumer<RenderContext<RenderableState>> leftHand, Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioning = leftHand;
            this.firstPersonRightHandPositioning = rightHand;
            return this;
        }

        public Builder withEntityPositioning(Consumer<ItemStack> entityPositioning) {
            this.entityPositioning = entityPositioning;
            return this;
        }

        public Builder withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
            this.inventoryPositioning = inventoryPositioning;
            return this;
        }

        public Builder withThirdPersonPositioning(BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning) {
            this.thirdPersonPositioning = thirdPersonPositioning;
            return this;
        }

        public Builder withCustomEquippedPositioning(BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning) {
            this.customEquippedPositioning = customEquippedPositioning;
            return this;
        }

        public Builder withFirstPersonModelPositioning(BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning) {
            this.firstPersonModelPositioning = firstPersonModelPositioning;
            return this;
        }

        public Builder withEntityModelPositioning(BiConsumer<ModelBase, ItemStack> entityModelPositioning) {
            this.entityModelPositioning = entityModelPositioning;
            return this;
        }

        public Builder withInventoryModelPositioning(BiConsumer<ModelBase, ItemStack> inventoryModelPositioning) {
            this.inventoryModelPositioning = inventoryModelPositioning;
            return this;
        }

        public Builder withThirdPersonModelPositioning(BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning) {
            this.thirdPersonModelPositioning = thirdPersonModelPositioning;
            return this;
        }

        public StaticModelSourceRenderer build() {
            if (this.modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            if (this.inventoryPositioning == null) {
                this.inventoryPositioning = itemStack -> {
                    if (this.isHiddenInInventory) {
                        GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
                    } else {
                        GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.0f);
                    }
                };
            }
            if (this.entityPositioning == null) {
                this.entityPositioning = itemStack -> {};
            }
            if (this.firstPersonPositioning == null) {
                this.firstPersonPositioning = (player, itemStack) -> {};
            }
            if (this.thirdPersonPositioning == null) {
                this.thirdPersonPositioning = (player, itemStack) -> {};
            }
            if (this.inventoryModelPositioning == null) {
                this.inventoryModelPositioning = (m, i) -> {
                    if (this.isHiddenInInventory) {
                        GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
                    }
                };
            }
            if (this.entityModelPositioning == null) {
                this.entityModelPositioning = (m, i) -> {};
            }
            if (this.firstPersonModelPositioning == null) {
                this.firstPersonModelPositioning = (m, i) -> {};
            }
            if (this.thirdPersonModelPositioning == null) {
                this.thirdPersonModelPositioning = (m, i) -> {};
            }
            if (this.firstPersonLeftHandPositioning == null) {
                this.firstPersonLeftHandPositioning = c -> GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
            if (this.firstPersonRightHandPositioning == null) {
                this.firstPersonRightHandPositioning = c -> GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
            return new StaticModelSourceRenderer(this);
        }

        public Consumer<ItemStack> getEntityPositioning() {
            return this.entityPositioning;
        }

        public Consumer<ItemStack> getInventoryPositioning() {
            return this.inventoryPositioning;
        }

        public BiConsumer<EntityPlayer, ItemStack> getThirdPersonPositioning() {
            return this.thirdPersonPositioning;
        }

        public BiConsumer<EntityPlayer, ItemStack> getFirstPersonPositioning() {
            return this.firstPersonPositioning;
        }

        public BiConsumer<ModelBase, ItemStack> getFirstPersonModelPositioning() {
            return this.firstPersonModelPositioning;
        }

        public BiConsumer<ModelBase, ItemStack> getThirdPersonModelPositioning() {
            return this.thirdPersonModelPositioning;
        }

        public BiConsumer<ModelBase, ItemStack> getInventoryModelPositioning() {
            return this.inventoryModelPositioning;
        }

        public BiConsumer<ModelBase, ItemStack> getEntityModelPositioning() {
            return this.entityModelPositioning;
        }

        public Consumer<RenderContext<RenderableState>> getFirstPersonLeftHandPositioning() {
            return this.firstPersonLeftHandPositioning;
        }

        public Consumer<RenderContext<RenderableState>> getFirstPersonRightHandPositioning() {
            return this.firstPersonRightHandPositioning;
        }

        public BiConsumer<EntityPlayer, ItemStack> getCustomEquippedPositioning() {
            return this.customEquippedPositioning;
        }

        public String getModId() {
            return this.modId;
        }
    }
}


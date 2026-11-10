/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.texture.ITextureObject
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.perspective;

import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.CustomRenderer;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.ViewfinderModel;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderTickEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTransformType;
import com.vicmatskiv.weaponlib.perspective.Perspective;
import java.util.function.BiConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class PerspectiveRenderer
implements CustomRenderer<RenderableState> {
    private static Perspective<RenderableState> STATIC_TEXTURE_PERSPECTIVE = new StaticTexturePerspective();
    private ViewfinderModel model = new ViewfinderModel();
    private BiConsumer<EntityLivingBase, ItemStack> positioning;

    public PerspectiveRenderer(BiConsumer<EntityLivingBase, ItemStack> positioning) {
        this.positioning = positioning;
    }

    @Override
    public void render(RenderContext<RenderableState> renderContext) {
        if (renderContext.getCompatibleTransformType() != CompatibleTransformType.FIRST_PERSON_RIGHT_HAND && renderContext.getCompatibleTransformType() != CompatibleTransformType.FIRST_PERSON_LEFT_HAND) {
            return;
        }
        if (renderContext.getModContext() == null) {
            return;
        }
        ClientModContext clientModContext = (ClientModContext)renderContext.getModContext();
        Perspective<Object> perspective = clientModContext.getViewManager().getPerspective(renderContext.getPlayerItemInstance(), false);
        if (perspective == null) {
            perspective = STATIC_TEXTURE_PERSPECTIVE;
        }
        float brightness = perspective.getBrightness(renderContext);
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)8193);
        this.positioning.accept(renderContext.getPlayer(), renderContext.getWeapon());
        GL11.glBindTexture((int)3553, (int)perspective.getTexture(renderContext));
        CompatibilityProvider.compatibility.disableLightMap();
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)3042);
        GL11.glColor4f((float)brightness, (float)brightness, (float)brightness, (float)1.0f);
        this.model.func_78088_a((Entity)renderContext.getPlayer(), renderContext.getLimbSwing(), renderContext.getFlimbSwingAmount(), renderContext.getAgeInTicks(), renderContext.getNetHeadYaw(), renderContext.getHeadPitch(), renderContext.getScale());
        CompatibilityProvider.compatibility.enableLightMap();
        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    private static class StaticTexturePerspective
    extends Perspective<RenderableState> {
        private Integer textureId;

        private StaticTexturePerspective() {
        }

        @Override
        public void update(CompatibleRenderTickEvent event) {
        }

        @Override
        public int getTexture(RenderContext<RenderableState> context) {
            if (this.textureId == null) {
                ResourceLocation textureResource = new ResourceLocation("weaponlib:/com/vicmatskiv/weaponlib/resources/dark-screen.png");
                Minecraft.func_71410_x().func_110434_K().func_110577_a(textureResource);
                ITextureObject textureObject = Minecraft.func_71410_x().func_110434_K().func_110581_b(textureResource);
                if (textureObject != null) {
                    this.textureId = textureObject.func_110552_b();
                }
            }
            return this.textureId;
        }

        @Override
        public float getBrightness(RenderContext<RenderableState> context) {
            return 0.0f;
        }
    }
}


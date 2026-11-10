/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Matrix4f
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.block.model.BakedQuad
 *  net.minecraft.client.renderer.block.model.IBakedModel
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 *  net.minecraft.client.renderer.block.model.ItemOverride
 *  net.minecraft.client.renderer.block.model.ItemOverrideList
 *  net.minecraft.client.renderer.block.model.ModelResourceLocation
 *  net.minecraft.client.renderer.texture.TextureAtlasSprite
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.commons.lang3.tuple.Pair
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.animation.DebugPositioner;
import com.vicmatskiv.weaponlib.animation.MultipartPositioning;
import com.vicmatskiv.weaponlib.animation.MultipartRenderStateManager;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTransformType;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWeaponRenderer;
import com.vicmatskiv.weaponlib.compatibility.Framebuffers;
import com.vicmatskiv.weaponlib.compatibility.ModelSourceRenderer;
import com.vicmatskiv.weaponlib.melee.MeleeRenderer;
import com.vicmatskiv.weaponlib.melee.PlayerMeleeInstance;
import com.vicmatskiv.weaponlib.melee.RenderableState;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import javax.vecmath.Matrix4f;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemOverride;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.tuple.Pair;
import org.lwjgl.opengl.GL11;

public abstract class CompatibleMeleeRenderer
extends ModelSourceRenderer
implements IBakedModel {
    protected EntityPlayer player;
    protected TextureManager textureManager;
    private Pair<? extends IBakedModel, Matrix4f> pair;
    protected ItemStack itemStack;
    protected ModelResourceLocation resourceLocation;
    private ItemOverrideList itemOverrideList = new WeaponItemOverrideList(Collections.emptyList());
    ItemCameraTransforms.TransformType transformType;
    private MeleeRenderer.Builder builder;

    protected CompatibleMeleeRenderer(MeleeRenderer.Builder builder) {
        this.builder = builder;
        this.textureManager = Minecraft.func_71410_x().func_110434_K();
        this.pair = Pair.of((Object)this, null);
    }

    protected abstract ClientModContext getClientModContext();

    protected abstract StateDescriptor getStateDescriptor(EntityPlayer var1, ItemStack var2);

    public List<BakedQuad> func_188616_a(IBlockState state, EnumFacing side, long rand) {
        if (this.itemStack == null) {
            return Collections.emptyList();
        }
        if (this.transformType == ItemCameraTransforms.TransformType.GROUND || this.transformType == ItemCameraTransforms.TransformType.GUI || this.transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND || this.transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND) {
            Tessellator tessellator = Tessellator.func_178181_a();
            BufferBuilder worldrenderer = tessellator.func_178180_c();
            tessellator.func_78381_a();
            GlStateManager.func_179094_E();
            if (this.player != null && this.transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND && this.player.func_70093_af()) {
                GlStateManager.func_179109_b((float)0.0f, (float)-0.2f, (float)0.0f);
            }
            if (this.onGround()) {
                GlStateManager.func_179152_a((float)-3.0f, (float)-3.0f, (float)-3.0f);
            }
            int currentTextureId = Framebuffers.getCurrentTexture();
            this.renderItem();
            if (currentTextureId != 0) {
                GlStateManager.func_179144_i((int)currentTextureId);
            }
            GlStateManager.func_179121_F();
            worldrenderer.func_181668_a(7, DefaultVertexFormats.field_176599_b);
        }
        this.player = null;
        this.itemStack = null;
        this.transformType = null;
        return Collections.emptyList();
    }

    protected boolean onGround() {
        return this.transformType == null;
    }

    public final boolean func_177555_b() {
        return true;
    }

    public final boolean func_177556_c() {
        return true;
    }

    public final boolean func_188618_c() {
        return false;
    }

    public TextureAtlasSprite func_177554_e() {
        return Minecraft.func_71410_x().func_147117_R().func_174944_f();
    }

    public ItemCameraTransforms func_177552_f() {
        return ItemCameraTransforms.field_178357_a;
    }

    public ItemOverrideList func_188617_f() {
        return this.itemOverrideList;
    }

    public Pair<? extends IBakedModel, Matrix4f> handlePerspective(ItemCameraTransforms.TransformType cameraTransformType) {
        this.transformType = cameraTransformType;
        return this.pair;
    }

    @SideOnly(value=Side.CLIENT)
    public void renderItem() {
        GL11.glPushMatrix();
        RenderContext<RenderableState> renderContext = new RenderContext<RenderableState>(this.getClientModContext(), (EntityLivingBase)this.player, this.itemStack);
        renderContext.setAgeInTicks(-0.4f);
        renderContext.setScale(0.08f);
        renderContext.setCompatibleTransformType(CompatibleTransformType.fromItemRenderType(this.transformType));
        MultipartPositioning.Positioner positioner = null;
        switch (this.transformType) {
            case GROUND: {
                GL11.glScaled((double)-1.0, (double)-1.0, (double)1.0);
                GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
                GL11.glTranslatef((float)-0.7f, (float)-1.0f, (float)-0.1f);
                GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                this.builder.getEntityPositioning().accept(this.itemStack);
                break;
            }
            case GUI: {
                GL11.glScaled((double)-1.0, (double)-1.0, (double)1.0);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
                GL11.glTranslatef((float)-0.7f, (float)-0.8f, (float)-0.1f);
                GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                this.builder.getInventoryPositioning().accept(this.itemStack);
                break;
            }
            case THIRD_PERSON_RIGHT_HAND: 
            case THIRD_PERSON_LEFT_HAND: {
                GL11.glScaled((double)-1.0, (double)-1.0, (double)1.0);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
                GL11.glTranslatef((float)-1.33f, (float)-2.0f, (float)0.7f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                this.builder.getThirdPersonPositioning().accept(renderContext);
                break;
            }
            case FIRST_PERSON_RIGHT_HAND: 
            case FIRST_PERSON_LEFT_HAND: {
                CompatibleWeaponRenderer.fixVersionSpecificFirstPersonPositioning(this.transformType);
                GL11.glScaled((double)-1.0, (double)-1.0, (double)1.0);
                StateDescriptor stateDescriptor = this.getStateDescriptor(this.player, this.itemStack);
                renderContext.setPlayerItemInstance(stateDescriptor.instance);
                MultipartPositioning<Part, RenderContext<RenderableState>> multipartPositioning = stateDescriptor.stateManager.nextPositioning();
                renderContext.setTransitionProgress(multipartPositioning.getProgress());
                renderContext.setFromState(multipartPositioning.getFromState(RenderableState.class));
                renderContext.setToState(multipartPositioning.getToState(RenderableState.class));
                positioner = multipartPositioning.getPositioner();
                CompatibleWeaponRenderer.renderLeftArm((EntityLivingBase)this.player, renderContext, positioner);
                CompatibleWeaponRenderer.renderRightArm((EntityLivingBase)this.player, renderContext, positioner);
                positioner.position(Part.MAIN_ITEM, renderContext);
                if (!DebugPositioner.isDebugModeEnabled()) break;
                DebugPositioner.position(Part.MAIN_ITEM, renderContext);
                break;
            }
        }
        this.renderItem(this.itemStack, renderContext, positioner);
        GL11.glPopMatrix();
    }

    protected abstract BiConsumer<Part, RenderContext<RenderableState>> getPartDebugPositioning();

    protected abstract void renderItem(ItemStack var1, RenderContext<RenderableState> var2, MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> var3);

    private class WeaponItemOverrideList
    extends ItemOverrideList {
        public WeaponItemOverrideList(List<ItemOverride> overridesIn) {
            super(overridesIn);
        }

        public IBakedModel handleItemState(IBakedModel originalModel, ItemStack stack, World world, EntityLivingBase entity) {
            CompatibleMeleeRenderer.this.itemStack = stack;
            CompatibleMeleeRenderer.this.player = (EntityPlayer)entity;
            return super.handleItemState(originalModel, stack, world, entity);
        }
    }

    protected static class StateDescriptor {
        protected MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager;
        protected float rate;
        protected float amplitude = 0.04f;
        private PlayerMeleeInstance instance;

        public StateDescriptor(PlayerMeleeInstance instance, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager, float rate, float amplitude) {
            this.instance = instance;
            this.stateManager = stateManager;
            this.rate = rate;
            this.amplitude = amplitude;
        }
    }
}


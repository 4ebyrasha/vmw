/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Matrix4f
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.commons.lang3.tuple.Pair
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.CustomRenderer;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.ModelSource;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.StaticModelSourceRenderer;
import com.vicmatskiv.weaponlib.Tuple;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTransformType;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWeaponRenderer;
import com.vicmatskiv.weaponlib.compatibility.Framebuffers;
import com.vicmatskiv.weaponlib.compatibility.ModelSourceRenderer;
import java.util.Collections;
import java.util.List;
import javax.vecmath.Matrix4f;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
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
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.tuple.Pair;
import org.lwjgl.opengl.GL11;

public abstract class CompatibleStaticModelSourceRenderer
extends ModelSourceRenderer
implements IBakedModel {
    protected StaticModelSourceRenderer.Builder builder;
    protected EntityLivingBase owner;
    protected TextureManager textureManager;
    private Pair<? extends IBakedModel, Matrix4f> pair;
    protected ModelBiped playerBiped = new ModelBiped();
    protected ItemStack itemStack;
    protected ModelResourceLocation resourceLocation;
    protected ItemCameraTransforms.TransformType transformType;
    private ItemOverrideList itemOverrideList = new WeaponItemOverrideList(Collections.emptyList());

    protected CompatibleStaticModelSourceRenderer(StaticModelSourceRenderer.Builder builder) {
        this.builder = builder;
        this.pair = Pair.of((Object)this, null);
    }

    public void renderCustomEquipped(EntityPlayer player, ItemStack itemStack) {
    }

    public List<BakedQuad> func_188616_a(IBlockState state, EnumFacing side, long rand) {
        if (this.itemStack == null) {
            return Collections.emptyList();
        }
        if (this.transformType == null || this.transformType == ItemCameraTransforms.TransformType.GROUND || this.transformType == ItemCameraTransforms.TransformType.GUI || this.transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND || this.transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND) {
            Tessellator tessellator = Tessellator.func_178181_a();
            BufferBuilder worldrenderer = tessellator.func_178180_c();
            tessellator.func_78381_a();
            GlStateManager.func_179094_E();
            if (this.owner != null && this.transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND && this.owner.func_70093_af()) {
                GlStateManager.func_179109_b((float)0.0f, (float)-0.2f, (float)0.0f);
            }
            if (this.onGround()) {
                GlStateManager.func_179152_a((float)-3.0f, (float)-3.0f, (float)-3.0f);
            }
            int currentTextureId = Framebuffers.getCurrentTexture();
            if (this.transformType == null && this.owner instanceof EntityPlayer) {
                this.renderCustomEquipped((EntityPlayer)this.owner, this.itemStack);
            } else {
                this.renderItem();
            }
            if (currentTextureId != 0) {
                GlStateManager.func_179144_i((int)currentTextureId);
            }
            GlStateManager.func_179121_F();
            worldrenderer.func_181668_a(7, DefaultVertexFormats.field_176599_b);
        }
        this.owner = null;
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

    @SideOnly(value=Side.CLIENT)
    public void renderItem() {
        GL11.glPushMatrix();
        GL11.glScaled((double)-1.0, (double)-1.0, (double)1.0);
        EntityPlayer player = CompatibilityProvider.compatibility.clientPlayer();
        RenderContext<RenderableState> renderContext = new RenderContext<RenderableState>(this.getModContext(), (EntityLivingBase)player, this.itemStack);
        switch (this.transformType) {
            case GROUND: {
                GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
                GL11.glTranslatef((float)-0.7f, (float)-1.0f, (float)-0.1f);
                GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                this.builder.getEntityPositioning().accept(this.itemStack);
                break;
            }
            case GUI: {
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
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
                GL11.glTranslatef((float)-1.5f, (float)-2.4f, (float)1.3f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                this.builder.getThirdPersonPositioning().accept(player, this.itemStack);
                break;
            }
            case FIRST_PERSON_RIGHT_HAND: 
            case FIRST_PERSON_LEFT_HAND: {
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glTranslatef((float)-0.3f, (float)-0.855f, (float)0.5f);
                this.builder.getFirstPersonPositioning().accept(player, this.itemStack);
                CompatibleWeaponRenderer.renderLeftArm((EntityLivingBase)player, renderContext, (p, c) -> this.builder.getFirstPersonLeftHandPositioning().accept((RenderContext<RenderableState>)c));
                CompatibleWeaponRenderer.renderRightArm((EntityLivingBase)player, renderContext, (p, c) -> this.builder.getFirstPersonRightHandPositioning().accept((RenderContext<RenderableState>)c));
                break;
            }
        }
        this.renderModelSource(renderContext, this.itemStack, this.transformType, null, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.08f);
        GL11.glPopMatrix();
    }

    protected void renderModelSource(RenderContext<RenderableState> renderContext, ItemStack itemStack, ItemCameraTransforms.TransformType type, Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        if (!(itemStack.func_77973_b() instanceof ModelSource)) {
            throw new IllegalArgumentException();
        }
        GL11.glPushMatrix();
        ModelSource modelSource = (ModelSource)itemStack.func_77973_b();
        for (Tuple<ModelBase, String> texturedModel : modelSource.getTexturedModels()) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation(this.builder.getModId() + ":textures/models/" + texturedModel.getV()));
            GL11.glPushMatrix();
            GL11.glPushAttrib((int)8192);
            ModelBase model = texturedModel.getU();
            if (type != null) {
                switch (type) {
                    case GROUND: {
                        this.builder.getEntityModelPositioning().accept(model, itemStack);
                        break;
                    }
                    case GUI: {
                        this.builder.getInventoryModelPositioning().accept(model, itemStack);
                        break;
                    }
                    case THIRD_PERSON_RIGHT_HAND: 
                    case THIRD_PERSON_LEFT_HAND: {
                        this.builder.getThirdPersonModelPositioning().accept(model, itemStack);
                        break;
                    }
                    case FIRST_PERSON_RIGHT_HAND: 
                    case FIRST_PERSON_LEFT_HAND: {
                        this.builder.getFirstPersonModelPositioning().accept(model, itemStack);
                        break;
                    }
                }
            }
            model.func_78088_a(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }
        CustomRenderer<?> postRenderer = modelSource.getPostRenderer();
        if (postRenderer != null) {
            renderContext.setAgeInTicks(-0.4f);
            renderContext.setScale(0.08f);
            renderContext.setCompatibleTransformType(CompatibleTransformType.fromItemRenderType(type));
            renderContext.setPlayerItemInstance(this.getModContext().getPlayerItemInstanceRegistry().getItemInstance(renderContext.getPlayer(), itemStack));
            GL11.glPushMatrix();
            GL11.glPushAttrib((int)8193);
            postRenderer.render(renderContext);
            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
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

    protected abstract ModContext getModContext();

    private class WeaponItemOverrideList
    extends ItemOverrideList {
        public WeaponItemOverrideList(List<ItemOverride> overridesIn) {
            super(overridesIn);
        }

        public IBakedModel handleItemState(IBakedModel originalModel, ItemStack stack, World world, EntityLivingBase entity) {
            CompatibleStaticModelSourceRenderer.this.itemStack = stack;
            CompatibleStaticModelSourceRenderer.this.owner = entity;
            return super.handleItemState(originalModel, stack, world, entity);
        }
    }
}


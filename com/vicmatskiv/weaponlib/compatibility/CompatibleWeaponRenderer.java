/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  javax.vecmath.Matrix4f
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelBiped$ArmPose
 *  net.minecraft.client.model.ModelPlayer
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
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.client.renderer.entity.RenderPlayer
 *  net.minecraft.client.renderer.texture.TextureAtlasSprite
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EnumPlayerModelParts
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHandSide
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.World
 *  net.minecraftforge.client.ForgeHooksClient
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.commons.lang3.tuple.Pair
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.google.common.collect.Maps;
import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.DebugPositioner;
import com.vicmatskiv.weaponlib.animation.MultipartPositioning;
import com.vicmatskiv.weaponlib.animation.MultipartRenderStateDescriptor;
import com.vicmatskiv.weaponlib.animation.MultipartRenderStateManager;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTessellator;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTransformType;
import com.vicmatskiv.weaponlib.compatibility.Framebuffers;
import com.vicmatskiv.weaponlib.compatibility.Interceptors;
import com.vicmatskiv.weaponlib.compatibility.ModelSourceRenderer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.vecmath.Matrix4f;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemOverride;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.tuple.Pair;
import org.lwjgl.opengl.GL11;

public abstract class CompatibleWeaponRenderer
extends ModelSourceRenderer
implements IBakedModel {
    private static final int INVENTORY_TEXTURE_WIDTH = 256;
    private static final int INVENTORY_TEXTURE_HEIGHT = 256;
    private static final Map<String, ResourceLocation> ARMOR_TEXTURE_RES_MAP = Maps.newHashMap();
    protected EntityLivingBase player;
    protected TextureManager textureManager;
    private Pair<? extends IBakedModel, Matrix4f> pair;
    protected ModelBiped playerBiped = new ModelBiped();
    protected ItemStack itemStack;
    protected ModelResourceLocation resourceLocation;
    private ItemOverrideList itemOverrideList = new WeaponItemOverrideList(Collections.emptyList());
    ItemCameraTransforms.TransformType transformType;
    private WeaponRenderer.Builder builder;

    protected CompatibleWeaponRenderer(WeaponRenderer.Builder builder) {
        this.builder = builder;
        this.textureManager = Minecraft.func_71410_x().func_110434_K();
        this.pair = Pair.of((Object)this, null);
        this.playerBiped = new ModelBiped();
        this.playerBiped.field_78090_t = 64;
        this.playerBiped.field_78089_u = 64;
    }

    public List<BakedQuad> func_188616_a(IBlockState state, EnumFacing side, long rand) {
        if (this.transformType == ItemCameraTransforms.TransformType.GROUND || this.transformType == ItemCameraTransforms.TransformType.GUI || this.transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND || this.transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND || this.transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND || this.transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_LEFT_HAND) {
            Tessellator tessellator = Tessellator.func_178181_a();
            BufferBuilder worldrenderer = tessellator.func_178180_c();
            tessellator.func_78381_a();
            GlStateManager.func_179094_E();
            if (this.player != null) {
                if (this.transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND) {
                    if (this.player.func_70093_af()) {
                        GlStateManager.func_179109_b((float)0.0f, (float)-0.2f, (float)0.0f);
                    }
                } else if (this.transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND || this.transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND) {
                    // empty if block
                }
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

    public void setOwner(EntityLivingBase player) {
        this.player = player;
    }

    protected abstract ClientModContext getClientModContext();

    protected abstract StateDescriptor getFirstPersonStateDescriptor(EntityLivingBase var1, ItemStack var2);

    protected abstract StateDescriptor getThirdPersonStateDescriptor(EntityLivingBase var1, ItemStack var2);

    @SideOnly(value=Side.CLIENT)
    public void renderItem() {
        GL11.glPushMatrix();
        Framebuffer framebuffer = null;
        Integer inventoryTexture = null;
        boolean inventoryTextureInitializationPhaseOn = false;
        Minecraft mc = Minecraft.func_71410_x();
        ScaledResolution scaledresolution = new ScaledResolution(mc);
        int originalFramebufferId = -1;
        if (this.transformType == ItemCameraTransforms.TransformType.GUI) {
            CompatibleWeaponRenderer textureMapKey = this;
            inventoryTexture = this.getClientModContext().getInventoryTextureMap().get(textureMapKey);
            if (inventoryTexture == null) {
                originalFramebufferId = Framebuffers.getCurrentFramebuffer();
                Framebuffers.unbindFramebuffer();
                inventoryTextureInitializationPhaseOn = true;
                framebuffer = new Framebuffer(256, 256, true);
                framebuffer.func_147610_a(true);
                inventoryTexture = framebuffer.field_147617_g;
                this.getClientModContext().getInventoryTextureMap().put(textureMapKey, inventoryTexture);
                this.setupInventoryRendering(256.0, 256.0);
            }
        }
        RenderContext<RenderableState> renderContext = new RenderContext<RenderableState>(this.getClientModContext(), this.player, this.itemStack);
        renderContext.setAgeInTicks(-0.4f);
        renderContext.setScale(0.08f);
        renderContext.setCompatibleTransformType(CompatibleTransformType.fromItemRenderType(this.transformType));
        MultipartPositioning.Positioner positioner = null;
        switch (this.transformType) {
            case GROUND: {
                GL11.glScaled((double)-1.0, (double)-1.0, (double)1.0);
                GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
                GL11.glTranslatef((float)-1.1f, (float)-0.9f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                this.builder.getEntityPositioning().accept(this.itemStack);
                break;
            }
            case GUI: {
                GL11.glScaled((double)-1.0, (double)-1.0, (double)1.0);
                GL11.glScalef((float)140.0f, (float)140.0f, (float)140.0f);
                if (DebugPositioner.isDebugModeEnabled()) {
                    DebugPositioner.position(Part.INVENTORY, null);
                }
                GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)-1.9f, (float)-1.1f, (float)0.0f);
                this.builder.getInventoryPositioning().accept(this.itemStack);
                break;
            }
            case THIRD_PERSON_RIGHT_HAND: 
            case THIRD_PERSON_LEFT_HAND: {
                GL11.glScaled((double)-1.0, (double)-1.0, (double)1.0);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
                GL11.glTranslatef((float)-1.25f, (float)-2.1f, (float)0.6f);
                GL11.glRotatef((float)110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                if (this.player instanceof EntityPlayer && !Interceptors.isProning((EntityPlayer)this.player)) {
                    StateDescriptor thirdPersonStateDescriptor = this.getThirdPersonStateDescriptor(this.player, this.itemStack);
                    renderContext.setPlayerItemInstance(thirdPersonStateDescriptor.instance);
                    MultipartPositioning<Part, RenderContext<RenderableState>> thirdPersonMultipartPositioning = thirdPersonStateDescriptor.stateManager.nextPositioning();
                    renderContext.setTransitionProgress(thirdPersonMultipartPositioning.getProgress());
                    renderContext.setFromState(thirdPersonMultipartPositioning.getFromState(RenderableState.class));
                    renderContext.setToState(thirdPersonMultipartPositioning.getToState(RenderableState.class));
                    positioner = thirdPersonMultipartPositioning.getPositioner();
                    positioner.position(Part.MAIN_ITEM, renderContext);
                    if (!DebugPositioner.isDebugModeEnabled()) break;
                    DebugPositioner.position(Part.MAIN_ITEM, renderContext);
                    break;
                }
                this.builder.getThirdPersonPositioning().accept(renderContext);
                break;
            }
            case FIRST_PERSON_RIGHT_HAND: 
            case FIRST_PERSON_LEFT_HAND: {
                CompatibleWeaponRenderer.fixVersionSpecificFirstPersonPositioning(this.transformType);
                GL11.glScaled((double)-1.0, (double)-1.0, (double)1.0);
                StateDescriptor stateDescriptor = this.getFirstPersonStateDescriptor(this.player, this.itemStack);
                renderContext.setPlayerItemInstance(stateDescriptor.instance);
                MultipartPositioning<Part, RenderContext<RenderableState>> multipartPositioning = stateDescriptor.stateManager.nextPositioning();
                renderContext.setTransitionProgress(multipartPositioning.getProgress());
                renderContext.setFromState(multipartPositioning.getFromState(RenderableState.class));
                renderContext.setToState(multipartPositioning.getToState(RenderableState.class));
                positioner = multipartPositioning.getPositioner();
                positioner.randomize(stateDescriptor.rate, stateDescriptor.amplitude);
                positioner.position(Part.MAIN_ITEM, renderContext);
                if (DebugPositioner.isDebugModeEnabled()) {
                    DebugPositioner.position(Part.MAIN_ITEM, renderContext);
                }
                if (this.player == null || this.player.func_184614_ca() == null || !(this.player.func_184614_ca().func_77973_b() instanceof Weapon)) break;
                CompatibleWeaponRenderer.renderLeftArm(this.player, renderContext, positioner);
                CompatibleWeaponRenderer.renderRightArm(this.player, renderContext, positioner);
                break;
            }
        }
        if (this.transformType != ItemCameraTransforms.TransformType.GUI || inventoryTextureInitializationPhaseOn) {
            this.renderItem(this.itemStack, renderContext, positioner);
        }
        if (this.transformType == ItemCameraTransforms.TransformType.GUI && inventoryTextureInitializationPhaseOn) {
            framebuffer.func_147609_e();
            framebuffer.field_147617_g = -1;
            framebuffer.func_147608_a();
            this.restoreInventoryRendering(scaledresolution);
        }
        GL11.glPopMatrix();
        if (originalFramebufferId >= 0) {
            Framebuffers.bindFramebuffer(originalFramebufferId, true, mc.func_147110_a().field_147621_c, mc.func_147110_a().field_147618_d);
        }
        if (this.transformType == ItemCameraTransforms.TransformType.GUI) {
            this.renderCachedInventoryTexture(inventoryTexture);
        }
    }

    static void fixVersionSpecificFirstPersonPositioning(ItemCameraTransforms.TransformType transformType) {
        int i = transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND ? 1 : -1;
        GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
        i = -i;
        GL11.glTranslatef((float)((float)i * 0.56f), (float)1.12f, (float)0.72f);
        if (transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND) {
            GL11.glScalef((float)-1.0f, (float)1.0f, (float)1.0f);
        }
        i = 1;
        GL11.glTranslatef((float)((float)i * 0.56f), (float)-1.12f, (float)-0.72f);
        GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f);
        GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glScalef((float)0.4f, (float)0.4f, (float)0.4f);
        GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
    }

    private void setupInventoryRendering(double projectionWidth, double projectionHeight) {
        GL11.glClear((int)256);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)projectionWidth, (double)projectionHeight, (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
    }

    private void restoreInventoryRendering(ScaledResolution scaledresolution) {
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)scaledresolution.func_78327_c(), (double)scaledresolution.func_78324_d(), (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
    }

    private void renderCachedInventoryTexture(Integer inventoryTexture) {
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)8192);
        GL11.glTranslatef((float)0.0f, (float)1.0f, (float)0.5f);
        GL11.glScalef((float)0.004f, (float)0.004f, (float)0.004f);
        GL11.glScalef((float)1.0f, (float)-1.0f, (float)1.0f);
        GlStateManager.func_179109_b((float)-8.0f, (float)-8.0f, (float)0.0f);
        GlStateManager.func_179144_i((int)inventoryTexture);
        CompatibleWeaponRenderer.drawTexturedQuadFit(0.0, 0.0, 256.0, 256.0, 0.0);
        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    private static void drawTexturedQuadFit(double x, double y, double width, double height, double zLevel) {
        CompatibleTessellator tessellator = CompatibleTessellator.getInstance();
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x + 0.0, y + height, zLevel, 0.0, 1.0);
        tessellator.addVertexWithUV(x + width, y + height, zLevel, 1.0, 1.0);
        tessellator.addVertexWithUV(x + width, y + 0.0, zLevel, 1.0, 0.0);
        tessellator.addVertexWithUV(x + 0.0, y + 0.0, zLevel, 0.0, 0.0);
        tessellator.draw();
    }

    static <T> void renderRightArm(EntityLivingBase player, RenderContext<T> renderContext, MultipartPositioning.Positioner<Part, RenderContext<T>> positioner) {
        Render entityRenderObject = Minecraft.func_71410_x().func_175598_ae().func_78713_a((Entity)((AbstractClientPlayer)player));
        RenderPlayer render = (RenderPlayer)entityRenderObject;
        Minecraft.func_71410_x().func_110434_K().func_110577_a(((AbstractClientPlayer)player).func_110306_p());
        GL11.glPushMatrix();
        GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        GL11.glTranslatef((float)-0.25f, (float)0.0f, (float)0.2f);
        GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        positioner.position(Part.RIGHT_HAND, renderContext);
        if (DebugPositioner.isDebugModeEnabled()) {
            DebugPositioner.position(Part.RIGHT_HAND, renderContext);
        }
        renderContext.capturePartPosition(Part.RIGHT_HAND);
        CompatibleWeaponRenderer.renderRightArm((ModelBiped)render.func_177087_b(), (AbstractClientPlayer)player);
        ItemStack itemstack = CompatibleWeaponRenderer.getItemStackFromSlot(player, EntityEquipmentSlot.CHEST);
        if (itemstack != null && itemstack.func_77973_b() instanceof ItemArmor) {
            render.func_110776_a(CompatibleWeaponRenderer.getArmorResource((Entity)player, itemstack, EntityEquipmentSlot.CHEST, null));
            ModelBiped armorModel = CompatibleWeaponRenderer.getArmorModelHook(player, itemstack, EntityEquipmentSlot.CHEST, null);
            if (armorModel != null) {
                CompatibleWeaponRenderer.renderRightArm(armorModel, (AbstractClientPlayer)player);
            }
        }
        GL11.glPopMatrix();
    }

    static <T> void renderLeftArm(EntityLivingBase player, RenderContext<T> renderContext, MultipartPositioning.Positioner<Part, RenderContext<T>> positioner) {
        Render entityRenderObject = Minecraft.func_71410_x().func_175598_ae().func_78713_a((Entity)((AbstractClientPlayer)player));
        RenderPlayer render = (RenderPlayer)entityRenderObject;
        Minecraft.func_71410_x().func_110434_K().func_110577_a(((AbstractClientPlayer)player).func_110306_p());
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)0.0f);
        GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        positioner.position(Part.LEFT_HAND, renderContext);
        if (DebugPositioner.isDebugModeEnabled()) {
            DebugPositioner.position(Part.LEFT_HAND, renderContext);
        }
        renderContext.capturePartPosition(Part.LEFT_HAND);
        CompatibleWeaponRenderer.renderLeftArm((ModelBiped)render.func_177087_b(), (AbstractClientPlayer)player);
        ItemStack itemstack = CompatibleWeaponRenderer.getItemStackFromSlot(player, EntityEquipmentSlot.CHEST);
        if (itemstack != null && itemstack.func_77973_b() instanceof ItemArmor) {
            render.func_110776_a(CompatibleWeaponRenderer.getArmorResource((Entity)player, itemstack, EntityEquipmentSlot.CHEST, null));
            ModelBiped armorModel = CompatibleWeaponRenderer.getArmorModelHook(player, itemstack, EntityEquipmentSlot.CHEST, null);
            if (armorModel != null) {
                CompatibleWeaponRenderer.renderLeftArm(armorModel, (AbstractClientPlayer)player);
            }
        }
        GL11.glPopMatrix();
    }

    protected abstract void renderItem(ItemStack var1, RenderContext<RenderableState> var2, MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> var3);

    private static void renderRightArm(ModelBiped modelplayer, AbstractClientPlayer clientPlayer) {
        float f = 1.0f;
        GlStateManager.func_179124_c((float)f, (float)f, (float)f);
        CompatibleWeaponRenderer.setModelVisibilities(modelplayer, clientPlayer);
        GlStateManager.func_179147_l();
        modelplayer.field_78095_p = 0.0f;
        modelplayer.field_78117_n = false;
        modelplayer.func_78087_a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)clientPlayer);
        modelplayer.field_178723_h.field_78795_f = -0.3f;
        modelplayer.field_178723_h.field_78796_g = 0.0f;
        modelplayer.field_178723_h.func_78785_a(0.0625f);
        if (modelplayer instanceof ModelPlayer) {
            ((ModelPlayer)modelplayer).field_178732_b.field_78795_f = 0.0f;
            ((ModelPlayer)modelplayer).field_178732_b.field_78795_f = -0.3f;
            ((ModelPlayer)modelplayer).field_178732_b.func_78785_a(0.0625f);
        }
        GlStateManager.func_179084_k();
    }

    private static void renderLeftArm(ModelBiped modelplayer, AbstractClientPlayer clientPlayer) {
        GlStateManager.func_179124_c((float)1.0f, (float)1.0f, (float)1.0f);
        CompatibleWeaponRenderer.setModelVisibilities(modelplayer, clientPlayer);
        GlStateManager.func_179147_l();
        modelplayer.field_78117_n = false;
        modelplayer.field_78095_p = 0.0f;
        modelplayer.func_78087_a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)clientPlayer);
        modelplayer.field_178724_i.field_78795_f = 0.0f;
        modelplayer.field_178724_i.func_78785_a(0.0625f);
        if (modelplayer instanceof ModelPlayer) {
            ((ModelPlayer)modelplayer).field_178734_a.field_78795_f = 0.0f;
            ((ModelPlayer)modelplayer).field_178734_a.func_78785_a(0.0625f);
        }
        GlStateManager.func_179084_k();
    }

    private static void setModelVisibilities(ModelBiped modelplayer, AbstractClientPlayer clientPlayer) {
        if (clientPlayer.func_175149_v()) {
            modelplayer.func_178719_a(true);
            modelplayer.field_78116_c.field_78806_j = true;
            modelplayer.field_178720_f.field_78806_j = true;
        } else {
            ItemStack itemstack = clientPlayer.func_184614_ca();
            ItemStack itemstack1 = clientPlayer.func_184592_cb();
            modelplayer.func_178719_a(true);
            modelplayer.field_178720_f.field_78806_j = clientPlayer.func_175148_a(EnumPlayerModelParts.HAT);
            if (modelplayer instanceof ModelPlayer) {
                ((ModelPlayer)modelplayer).field_178730_v.field_78806_j = clientPlayer.func_175148_a(EnumPlayerModelParts.JACKET);
                ((ModelPlayer)modelplayer).field_178733_c.field_78806_j = clientPlayer.func_175148_a(EnumPlayerModelParts.LEFT_PANTS_LEG);
                ((ModelPlayer)modelplayer).field_178731_d.field_78806_j = clientPlayer.func_175148_a(EnumPlayerModelParts.RIGHT_PANTS_LEG);
                ((ModelPlayer)modelplayer).field_178734_a.field_78806_j = clientPlayer.func_175148_a(EnumPlayerModelParts.LEFT_SLEEVE);
                ((ModelPlayer)modelplayer).field_178732_b.field_78806_j = clientPlayer.func_175148_a(EnumPlayerModelParts.RIGHT_SLEEVE);
            }
            modelplayer.field_78117_n = clientPlayer.func_70093_af();
            ModelBiped.ArmPose modelbiped$armpose = ModelBiped.ArmPose.EMPTY;
            ModelBiped.ArmPose modelbiped$armpose1 = ModelBiped.ArmPose.EMPTY;
            if (itemstack != null) {
                modelbiped$armpose = ModelBiped.ArmPose.ITEM;
                if (clientPlayer.func_184605_cv() > 0) {
                    EnumAction enumaction = itemstack.func_77975_n();
                    if (enumaction == EnumAction.BLOCK) {
                        modelbiped$armpose = ModelBiped.ArmPose.BLOCK;
                    } else if (enumaction == EnumAction.BOW) {
                        modelbiped$armpose = ModelBiped.ArmPose.BOW_AND_ARROW;
                    }
                }
            }
            if (itemstack1 != null) {
                EnumAction enumaction1;
                modelbiped$armpose1 = ModelBiped.ArmPose.ITEM;
                if (clientPlayer.func_184605_cv() > 0 && (enumaction1 = itemstack1.func_77975_n()) == EnumAction.BLOCK) {
                    modelbiped$armpose1 = ModelBiped.ArmPose.BLOCK;
                }
            }
            if (clientPlayer.func_184591_cq() == EnumHandSide.RIGHT) {
                modelplayer.field_187076_m = modelbiped$armpose;
                modelplayer.field_187075_l = modelbiped$armpose1;
            } else {
                modelplayer.field_187076_m = modelbiped$armpose1;
                modelplayer.field_187075_l = modelbiped$armpose;
            }
        }
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

    protected static ModelBiped getArmorModelHook(EntityLivingBase entity, ItemStack itemStack, EntityEquipmentSlot slot, ModelBiped model) {
        return ForgeHooksClient.getArmorModel((EntityLivingBase)entity, (ItemStack)itemStack, (EntityEquipmentSlot)slot, (ModelBiped)model);
    }

    protected void setModelVisible(ModelBiped model) {
        model.func_178719_a(true);
    }

    protected void setModelSlotVisible(ModelBiped p_188359_1_, EntityEquipmentSlot slotIn) {
        this.setModelVisible(p_188359_1_);
        switch (slotIn) {
            case HEAD: {
                p_188359_1_.field_78116_c.field_78806_j = true;
                p_188359_1_.field_178720_f.field_78806_j = true;
                break;
            }
            case CHEST: {
                p_188359_1_.field_78115_e.field_78806_j = true;
                p_188359_1_.field_178723_h.field_78806_j = true;
                p_188359_1_.field_178724_i.field_78806_j = true;
                break;
            }
            case LEGS: {
                p_188359_1_.field_78115_e.field_78806_j = true;
                p_188359_1_.field_178721_j.field_78806_j = true;
                p_188359_1_.field_178722_k.field_78806_j = true;
                break;
            }
            case FEET: {
                p_188359_1_.field_178721_j.field_78806_j = true;
                p_188359_1_.field_178722_k.field_78806_j = true;
            }
        }
    }

    @Nullable
    public static ItemStack getItemStackFromSlot(EntityLivingBase living, EntityEquipmentSlot slotIn) {
        return living.func_184582_a(slotIn);
    }

    private static boolean isLegSlot(EntityEquipmentSlot slotIn) {
        return slotIn == EntityEquipmentSlot.LEGS;
    }

    public static ResourceLocation getArmorResource(Entity entity, ItemStack stack, EntityEquipmentSlot slot, String type) {
        ItemArmor item = (ItemArmor)stack.func_77973_b();
        String texture = item.func_82812_d().func_179242_c();
        String domain = "minecraft";
        int idx = texture.indexOf(58);
        if (idx != -1) {
            domain = texture.substring(0, idx);
            texture = texture.substring(idx + 1);
        }
        String s1 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", domain, texture, CompatibleWeaponRenderer.isLegSlot(slot) ? 2 : 1, type == null ? "" : String.format("_%s", type));
        ResourceLocation resourcelocation = ARMOR_TEXTURE_RES_MAP.get(s1 = ForgeHooksClient.getArmorTexture((Entity)entity, (ItemStack)stack, (String)s1, (EntityEquipmentSlot)slot, (String)type));
        if (resourcelocation == null) {
            resourcelocation = new ResourceLocation(s1);
            ARMOR_TEXTURE_RES_MAP.put(s1, resourcelocation);
        }
        return resourcelocation;
    }

    private class WeaponItemOverrideList
    extends ItemOverrideList {
        public WeaponItemOverrideList(List<ItemOverride> overridesIn) {
            super(overridesIn);
        }

        public IBakedModel handleItemState(IBakedModel originalModel, ItemStack stack, World world, EntityLivingBase entity) {
            CompatibleWeaponRenderer.this.itemStack = stack;
            CompatibleWeaponRenderer.this.player = entity;
            return super.handleItemState(originalModel, stack, world, entity);
        }
    }

    protected static class StateDescriptor
    implements MultipartRenderStateDescriptor<RenderableState, Part, RenderContext<RenderableState>> {
        protected MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager;
        protected float rate;
        protected float amplitude = 0.04f;
        private PlayerWeaponInstance instance;

        public StateDescriptor(PlayerWeaponInstance instance, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager, float rate, float amplitude) {
            this.instance = instance;
            this.stateManager = stateManager;
            this.rate = rate;
            this.amplitude = amplitude;
        }

        @Override
        public MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> getStateManager() {
            return this.stateManager;
        }
    }
}


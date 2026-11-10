/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.PlayerTransitionProvider;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.animation.DebugPositioner;
import com.vicmatskiv.weaponlib.animation.MatrixHelper;
import com.vicmatskiv.weaponlib.animation.MultipartPositioning;
import com.vicmatskiv.weaponlib.animation.MultipartRenderStateDescriptor;
import com.vicmatskiv.weaponlib.animation.MultipartRenderStateManager;
import com.vicmatskiv.weaponlib.animation.MultipartTransition;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEnumHandSide;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTransformType;
import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class PlayerRenderer {
    private static final Logger logger = LogManager.getLogger(PlayerRenderer.class);
    private PlayerTransitionProvider transitionProvider;
    private ThreadLocal<PositionerDescriptor> currentPositioner = new ThreadLocal();
    private int currentFlags;
    private int newFlags;
    private long renderingStartTimestamp;
    private long playerStopMovingTimestamp;
    private ClientModContext clientModContext;
    private MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> generalPlayerStateManager;

    public PlayerRenderer(EntityPlayer player, ClientModContext clientModContext) {
        this.clientModContext = clientModContext;
        this.transitionProvider = new EquippedPlayerTransitionProvider(player, clientModContext.getPlayerTransitionProvider());
    }

    public MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> getCurrentPositioner() {
        PositionerDescriptor descriptor = this.currentPositioner.get();
        return descriptor != null ? descriptor.positioner : null;
    }

    private MultipartRenderStateDescriptor<RenderableState, Part, RenderContext<RenderableState>> getStateDescriptor(EntityPlayer player) {
        boolean isProning;
        if (this.currentFlags != this.newFlags) {
            this.generalPlayerStateManager = null;
        }
        boolean bl = isProning = (this.newFlags & CompatibleExtraEntityFlags.PRONING) != 0;
        if (this.generalPlayerStateManager == null) {
            this.generalPlayerStateManager = new MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>(RenderableState.NORMAL, this.transitionProvider, () -> this.currentTime(player));
        } else if (isProning && player.field_70140_Q == player.field_70141_P) {
            this.generalPlayerStateManager.setState(RenderableState.PRONING_AIMING, true, true, true);
        } else if (isProning) {
            this.generalPlayerStateManager.setCycleState(RenderableState.PRONING, false);
        } else {
            ItemStack heldStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)player);
            if (heldStack != null && heldStack.func_77973_b() instanceof Weapon) {
                return ((Weapon)heldStack.func_77973_b()).getRenderer().getThirdPersonStateDescriptor((EntityLivingBase)player, heldStack);
            }
            this.generalPlayerStateManager.setState(RenderableState.NORMAL, true, false);
        }
        return new StateDescriptor(this.generalPlayerStateManager, 0.0f, 0.0f);
    }

    private long currentTime(EntityPlayer player) {
        int renderingStartThreshold;
        long elapseRenderingStart = System.currentTimeMillis() - this.renderingStartTimestamp;
        if (elapseRenderingStart < (long)(renderingStartThreshold = 400)) {
            return elapseRenderingStart;
        }
        long afterStopMovingTimeout = 0L;
        if (player.field_70140_Q == player.field_70141_P) {
            if (this.playerStopMovingTimestamp == 0L) {
                this.playerStopMovingTimestamp = System.currentTimeMillis();
            } else if (afterStopMovingTimeout < 1000L) {
                afterStopMovingTimeout = System.currentTimeMillis() - this.playerStopMovingTimestamp;
            }
        } else {
            this.playerStopMovingTimestamp = 0L;
        }
        return (long)((float)renderingStartThreshold + player.field_70140_Q * 600.0f + (float)afterStopMovingTimeout);
    }

    public void renderModel(ModelBiped modelPlayer, EntityPlayer player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.newFlags = CompatibleExtraEntityFlags.getFlags((Entity)player);
        if (this.newFlags != this.currentFlags) {
            this.renderingStartTimestamp = System.currentTimeMillis();
        }
        this.currentPositioner.remove();
        this.renderAnimatedModel(modelPlayer, player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        this.currentFlags = this.newFlags;
    }

    private void renderBipedModel(ModelBiped model, Entity entity, float limbSwing, float limbSwingAmount, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
        model.func_78087_a(limbSwing, limbSwingAmount, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, entity);
        if (model.field_78091_s) {
            float f6 = 2.0f;
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.5f / f6), (float)(1.5f / f6), (float)(1.5f / f6));
            GL11.glTranslatef((float)0.0f, (float)(16.0f * p_78088_7_), (float)0.0f);
            model.field_78116_c.func_78785_a(p_78088_7_);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * p_78088_7_), (float)0.0f);
            model.field_78115_e.func_78785_a(p_78088_7_);
            model.field_178723_h.func_78785_a(p_78088_7_);
            model.field_178724_i.func_78785_a(p_78088_7_);
            model.field_178721_j.func_78785_a(p_78088_7_);
            model.field_178722_k.func_78785_a(p_78088_7_);
            model.field_178720_f.func_78785_a(p_78088_7_);
            GL11.glPopMatrix();
        } else {
            model.field_78116_c.func_78785_a(p_78088_7_);
            model.field_78115_e.func_78785_a(p_78088_7_);
            model.field_178723_h.func_78785_a(p_78088_7_);
            model.field_178724_i.func_78785_a(p_78088_7_);
            model.field_178721_j.func_78785_a(p_78088_7_);
            model.field_178722_k.func_78785_a(p_78088_7_);
            model.field_178720_f.func_78785_a(p_78088_7_);
        }
    }

    private void renderAnimatedModel(ModelBiped modelPlayer, EntityPlayer player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        MultipartRenderStateDescriptor<RenderableState, Part, RenderContext<RenderableState>> stateDescriptor = this.getStateDescriptor(player);
        MultipartPositioning<Part, RenderContext<RenderableState>> multipartPositioning = stateDescriptor.getStateManager().nextPositioning();
        MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner = multipartPositioning.getPositioner();
        this.currentPositioner.set(new PositionerDescriptor(positioner));
        GL11.glPushMatrix();
        RenderContext<RenderableState> renderContext = new RenderContext<RenderableState>(this.clientModContext, (EntityLivingBase)player, null);
        renderContext.setLimbSwing(limbSwing);
        renderContext.setFlimbSwingAmount(limbSwingAmount);
        renderContext.setAgeInTicks(ageInTicks);
        renderContext.setScale(scale);
        renderContext.setNetHeadYaw(netHeadYaw);
        renderContext.setHeadPitch(headPitch);
        renderContext.setCompatibleTransformType(CompatibleTransformType.NONE);
        positioner.position(Part.MAIN, renderContext);
        modelPlayer.func_78087_a(renderContext.getLimbSwing(), renderContext.getFlimbSwingAmount(), renderContext.getAgeInTicks(), renderContext.getNetHeadYaw(), renderContext.getHeadPitch(), renderContext.getScale(), (Entity)renderContext.getPlayer());
        this.renderBody(positioner, modelPlayer, renderContext);
        this.renderHead(positioner, modelPlayer, renderContext);
        this.renderLeftArm(positioner, modelPlayer, renderContext);
        this.renderRightArm(positioner, modelPlayer, renderContext);
        this.renderLeftLeg(positioner, modelPlayer, renderContext);
        this.renderRightLeg(positioner, modelPlayer, renderContext);
        GL11.glPopMatrix();
    }

    private void renderBody(MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, ModelBiped modelPlayer, RenderContext<RenderableState> renderContext) {
        GL11.glPushMatrix();
        modelPlayer.field_78115_e.func_78785_a(renderContext.getScale());
        CompatibilityProvider.compatibility.renderBodywear(modelPlayer, renderContext.getScale());
        GL11.glPopMatrix();
    }

    private void renderHead(MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, ModelBiped modelPlayer, RenderContext<RenderableState> renderContext) {
        GL11.glPushMatrix();
        FloatBuffer preBuf = MatrixHelper.getModelViewMatrixBuffer();
        positioner.position(Part.HEAD, renderContext);
        FloatBuffer postBuf = MatrixHelper.getModelViewMatrixBuffer();
        if (!preBuf.equals(postBuf)) {
            // empty if block
        }
        modelPlayer.field_78116_c.func_78785_a(renderContext.getScale());
        CompatibilityProvider.compatibility.renderHeadwear(modelPlayer, renderContext.getScale());
        GL11.glPopMatrix();
    }

    private void renderRightArm(MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, ModelBiped modelPlayer, RenderContext<RenderableState> renderContext) {
        FloatBuffer postBuf;
        GL11.glPushMatrix();
        FloatBuffer preBuf = MatrixHelper.getModelViewMatrixBuffer();
        positioner.position(Part.RIGHT_HAND, renderContext);
        if (DebugPositioner.isDebugModeEnabled()) {
            DebugPositioner.position(Part.RIGHT_HAND, renderContext);
        }
        if (!preBuf.equals(postBuf = MatrixHelper.getModelViewMatrixBuffer())) {
            modelPlayer.field_178723_h.field_78808_h = 0.0f;
            modelPlayer.field_178723_h.field_78796_g = 0.0f;
            modelPlayer.field_178723_h.field_78795_f = 0.0f;
            this.currentPositioner.get().rightHandPositioned = true;
        }
        modelPlayer.field_178723_h.func_78785_a(renderContext.getScale());
        CompatibilityProvider.compatibility.renderRightArmwear(modelPlayer, renderContext.getScale());
        GL11.glPopMatrix();
    }

    private void renderLeftArm(MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, ModelBiped modelPlayer, RenderContext<RenderableState> renderContext) {
        FloatBuffer postBuf;
        GL11.glPushMatrix();
        FloatBuffer preBuf = MatrixHelper.getModelViewMatrixBuffer();
        positioner.position(Part.LEFT_HAND, renderContext);
        if (DebugPositioner.isDebugModeEnabled()) {
            DebugPositioner.position(Part.LEFT_HAND, renderContext);
        }
        if (!preBuf.equals(postBuf = MatrixHelper.getModelViewMatrixBuffer())) {
            modelPlayer.field_178724_i.field_78808_h = 0.0f;
            modelPlayer.field_178724_i.field_78796_g = 0.0f;
            modelPlayer.field_178724_i.field_78795_f = 0.0f;
            this.currentPositioner.get().leftHandPositioned = true;
        }
        modelPlayer.field_178724_i.func_78785_a(renderContext.getScale());
        CompatibilityProvider.compatibility.renderLeftArmwear(modelPlayer, renderContext.getScale());
        GL11.glPopMatrix();
    }

    private void renderRightLeg(MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, ModelBiped modelPlayer, RenderContext<RenderableState> renderContext) {
        GL11.glPushMatrix();
        FloatBuffer preBuf = MatrixHelper.getModelViewMatrixBuffer();
        positioner.position(Part.RIGHT_LEG, renderContext);
        FloatBuffer postBuf = MatrixHelper.getModelViewMatrixBuffer();
        if (!preBuf.equals(postBuf)) {
            modelPlayer.field_178721_j.field_78808_h = 0.0f;
            modelPlayer.field_178721_j.field_78796_g = 0.0f;
            modelPlayer.field_178721_j.field_78795_f = 0.0f;
        }
        modelPlayer.field_178721_j.func_78785_a(renderContext.getScale());
        CompatibilityProvider.compatibility.renderRightLegwear(modelPlayer, renderContext.getScale());
        GL11.glPopMatrix();
    }

    private void renderLeftLeg(MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner, ModelBiped modelPlayer, RenderContext<RenderableState> renderContext) {
        GL11.glPushMatrix();
        FloatBuffer preBuf = MatrixHelper.getModelViewMatrixBuffer();
        positioner.position(Part.LEFT_LEG, renderContext);
        FloatBuffer postBuf = MatrixHelper.getModelViewMatrixBuffer();
        if (!preBuf.equals(postBuf)) {
            modelPlayer.field_178722_k.field_78808_h = 0.0f;
            modelPlayer.field_178722_k.field_78796_g = 0.0f;
            modelPlayer.field_178722_k.field_78795_f = 0.0f;
        }
        modelPlayer.field_178722_k.func_78785_a(renderContext.getScale());
        CompatibilityProvider.compatibility.renderLeftLegwear(modelPlayer, renderContext.getScale());
        GL11.glPopMatrix();
    }

    public boolean renderArmor(ModelBiped modelPlayer, EntityPlayer player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        PositionerDescriptor descriptor = this.currentPositioner.get();
        if (descriptor != null) {
            MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner = descriptor.positioner;
            GL11.glPushMatrix();
            RenderContext<RenderableState> renderContext = new RenderContext<RenderableState>(this.clientModContext, (EntityLivingBase)player, null);
            renderContext.setAgeInTicks(ageInTicks);
            renderContext.setScale(scale);
            renderContext.setLimbSwing(limbSwing);
            renderContext.setFlimbSwingAmount(limbSwingAmount);
            renderContext.setNetHeadYaw(netHeadYaw);
            renderContext.setHeadPitch(headPitch);
            renderContext.setCompatibleTransformType(CompatibleTransformType.NONE);
            modelPlayer.func_78087_a(renderContext.getLimbSwing(), renderContext.getFlimbSwingAmount(), renderContext.getAgeInTicks(), renderContext.getNetHeadYaw(), renderContext.getHeadPitch(), renderContext.getScale(), (Entity)renderContext.getPlayer());
            positioner.position(Part.MAIN, renderContext);
            this.renderBody(positioner, modelPlayer, renderContext);
            this.renderHead(positioner, modelPlayer, renderContext);
            this.renderLeftArm(positioner, modelPlayer, renderContext);
            this.renderRightArm(positioner, modelPlayer, renderContext);
            this.renderLeftLeg(positioner, modelPlayer, renderContext);
            this.renderRightLeg(positioner, modelPlayer, renderContext);
            GL11.glPopMatrix();
        }
        return descriptor != null;
    }

    public boolean positionItemSide(EntityPlayer player, ItemStack itemStack, CompatibleTransformType transformType, CompatibleEnumHandSide handSide) {
        PositionerDescriptor descriptor = this.currentPositioner.get();
        if (descriptor != null) {
            if (!(handSide != null && handSide != CompatibleEnumHandSide.RIGHT || descriptor.rightHandPositioned)) {
                return false;
            }
            if (handSide == CompatibleEnumHandSide.LEFT && !descriptor.leftHandPositioned) {
                return false;
            }
            MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner = descriptor.positioner;
            RenderContext renderContext = new RenderContext(this.clientModContext, (EntityLivingBase)player, null);
            positioner.position(Part.MAIN, renderContext);
            if (handSide == CompatibleEnumHandSide.LEFT) {
                positioner.position(Part.LEFT_HAND, renderContext);
            } else if (handSide == null || handSide == CompatibleEnumHandSide.RIGHT) {
                positioner.position(Part.RIGHT_HAND, renderContext);
            }
            GL11.glTranslatef((float)-0.35f, (float)0.1f, (float)-0.0f);
            GL11.glRotatef((float)-378.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)360.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }
        return descriptor != null;
    }

    private class PositionerDescriptor {
        MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner;
        boolean leftHandPositioned;
        boolean rightHandPositioned;

        PositionerDescriptor(MultipartPositioning.Positioner<Part, RenderContext<RenderableState>> positioner) {
            this.positioner = positioner;
        }
    }

    private static class EquippedPlayerTransitionProvider
    extends PlayerTransitionProvider {
        private PlayerTransitionProvider delegate;
        private EntityPlayer player;

        EquippedPlayerTransitionProvider(EntityPlayer player, PlayerTransitionProvider delegate) {
            this.player = player;
            this.delegate = delegate;
        }

        @Override
        public List<MultipartTransition<Part, RenderContext<RenderableState>>> getTransitions(RenderableState state) {
            ItemStack heldStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)this.player);
            if (heldStack == null || heldStack.func_77973_b() instanceof Weapon) {
                // empty if block
            }
            return this.delegate.getTransitions(state);
        }
    }

    protected static class StateDescriptor
    implements MultipartRenderStateDescriptor<RenderableState, Part, RenderContext<RenderableState>> {
        protected MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager;
        protected float rate;
        protected float amplitude = 0.04f;

        public StateDescriptor(MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager, float rate, float amplitude) {
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


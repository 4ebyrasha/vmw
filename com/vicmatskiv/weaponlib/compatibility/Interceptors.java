/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelBox
 *  net.minecraft.client.model.ModelPlayer
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 *  net.minecraft.client.renderer.entity.RenderLivingBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHandSide
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.OptimizedCubeList;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.PlayerRenderer;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.SpreadableExposure;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.animation.MultipartRenderStateManager;
import com.vicmatskiv.weaponlib.animation.ScreenShakingAnimationManager;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEnumHandSide;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExposureCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMathHelper;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTransformType;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import org.lwjgl.opengl.GL11;

public class Interceptors {
    private static Map<Entity, PlayerRenderer> renderers = new HashMap<Entity, PlayerRenderer>();
    private static double volumeThreshold;

    public static boolean is3dRenderableItem(Item item) {
        return CompatibilityProvider.compatibility.is3dRenderable(item);
    }

    public static void setupCameraTransformAfterHurtCameraEffect(float partialTicks) {
        PlayerWeaponInstance weaponInstance = Interceptors.getPlayerWeaponInstance();
        EntityPlayer player = CompatibilityProvider.compatibility.getClientPlayer();
        if (weaponInstance != null) {
            ClientModContext context = (ClientModContext)weaponInstance.getWeapon().getModContext();
            MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager = weaponInstance.getWeapon().getRenderer().getStateManager(player);
            ScreenShakingAnimationManager yawPitchAnimationManager = context.getPlayerRawPitchAnimationManager();
            yawPitchAnimationManager.update(player, weaponInstance, stateManager != null ? stateManager.getLastState() : null);
        }
    }

    private static PlayerWeaponInstance getPlayerWeaponInstance() {
        Item item;
        EntityPlayer player = CompatibilityProvider.compatibility.getClientPlayer();
        ItemStack itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)player);
        PlayerWeaponInstance weaponInstance = null;
        if (itemStack != null && (item = itemStack.func_77973_b()) != null && item instanceof Weapon) {
            Weapon weapon = (Weapon)item;
            ClientModContext context = (ClientModContext)weapon.getModContext();
            weaponInstance = context.getMainHeldWeapon();
        }
        return weaponInstance;
    }

    public static boolean setupViewBobbing(float partialTicks) {
        if (!(CompatibilityProvider.compatibility.getRenderViewEntity() instanceof EntityPlayer)) {
            return true;
        }
        EntityPlayer entityplayer = (EntityPlayer)CompatibilityProvider.compatibility.getRenderViewEntity();
        float f = entityplayer.field_70140_Q - entityplayer.field_70141_P;
        float f1 = -(entityplayer.field_70140_Q + f * partialTicks);
        float f2 = entityplayer.field_71107_bF + (entityplayer.field_71109_bG - entityplayer.field_71107_bF) * partialTicks;
        float f3 = entityplayer.field_70727_aS + (entityplayer.field_70726_aT - entityplayer.field_70727_aS) * partialTicks;
        GL11.glTranslatef((float)(CompatibleMathHelper.sin(f1 * (float)Math.PI) * f2 * 0.5f), (float)(-Math.abs(CompatibleMathHelper.cos(f1 * (float)Math.PI) * f2)), (float)0.0f);
        GL11.glRotatef((float)(CompatibleMathHelper.sin(f1 * (float)Math.PI) * f2 * 3.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glRotatef((float)(Math.abs(CompatibleMathHelper.cos(f1 * (float)Math.PI - 0.2f) * f2) * 5.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)f3, (float)1.0f, (float)0.0f, (float)0.0f);
        SpreadableExposure spreadableExposure = CompatibleExposureCapability.getExposure((Entity)entityplayer, SpreadableExposure.class);
        if (spreadableExposure != null) {
            float totalDose = spreadableExposure.getTotalDose();
            float f12 = totalDose;
            if (f12 > 1.0f) {
                f12 = 1.0f;
            }
            float speed = 0.4f;
            float f22 = 5.0f / (f12 * f12 + 5.0f) - f12 * 0.01f;
            f22 *= f22;
            GL11.glRotatef((float)(((float)spreadableExposure.getTickCount() + partialTicks) * speed), (float)0.0f, (float)1.0f, (float)1.0f);
            GL11.glScalef((float)(1.0f / f22), (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)(-((float)spreadableExposure.getTickCount() + partialTicks) * speed), (float)0.0f, (float)1.0f, (float)1.0f);
            spreadableExposure.incrementTickCount();
        }
        return false;
    }

    public static boolean hurtCameraEffect(float partialTicks) {
        if (!(CompatibilityProvider.compatibility.getRenderViewEntity() instanceof EntityPlayer)) {
            return true;
        }
        boolean allowDefaultEffect = false;
        EntityPlayer entitylivingbase = (EntityPlayer)CompatibilityProvider.compatibility.getRenderViewEntity();
        float f = (float)entitylivingbase.field_70737_aN - partialTicks;
        if (entitylivingbase.func_110143_aJ() <= 0.0f) {
            float f1 = (float)entitylivingbase.field_70725_aQ + partialTicks;
            GL11.glRotatef((float)(40.0f - 8000.0f / (f1 + 200.0f)), (float)0.0f, (float)0.0f, (float)1.0f);
        }
        if (f < 0.0f) {
            return allowDefaultEffect;
        }
        f /= (float)entitylivingbase.field_70738_aO;
        f = CompatibleMathHelper.sin(f * f * f * f * (float)Math.PI);
        float f2 = entitylivingbase.field_70739_aP;
        GL11.glRotatef((float)(-f2), (float)0.0f, (float)1.0f, (float)0.0f);
        SpreadableExposure spreadableExposure = CompatibleExposureCapability.getExposure((Entity)entitylivingbase, SpreadableExposure.class);
        if (spreadableExposure != null) {
            GL11.glRotatef((float)(-f * 4.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(-f * 1.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        } else {
            GL11.glRotatef((float)(-f * 14.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        }
        GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        return allowDefaultEffect;
    }

    public static boolean nauseaCameraEffect(float partialTicks) {
        boolean allowDefaultEffect = false;
        return allowDefaultEffect;
    }

    public static PlayerRenderer getPlayerRenderer(Entity entity) {
        return renderers.get(entity);
    }

    public static void render2(ModelBase modelBase, Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if (entityIn instanceof EntityPlayer && modelBase instanceof ModelPlayer) {
            ModelPlayer modelPlayer = (ModelPlayer)modelBase;
            EntityPlayer player = (EntityPlayer)entityIn;
            PlayerRenderer playerRenderer = renderers.computeIfAbsent(entityIn, e -> new PlayerRenderer((EntityPlayer)entityIn, ClientModContext.getContext()));
            playerRenderer.renderModel((ModelBiped)modelPlayer, player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            CustomPlayerInventory capability = CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase)player);
            if (capability != null) {
                ItemStack vestStack;
                ItemStack backpackStack = capability.func_70301_a(0);
                if (backpackStack != null) {
                    GL11.glPushMatrix();
                    Interceptors.adjustBodyWearablePosition(player);
                    CompatibilityProvider.compatibility.renderItem(player, backpackStack);
                    GL11.glPopMatrix();
                }
                if ((vestStack = capability.func_70301_a(1)) != null) {
                    GL11.glPushMatrix();
                    Interceptors.adjustBodyWearablePosition(player);
                    CompatibilityProvider.compatibility.renderItem(player, vestStack);
                    GL11.glPopMatrix();
                }
            }
        } else {
            modelBase.func_78088_a(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
    }

    private static void adjustBodyWearablePosition(EntityPlayer player) {
    }

    public static void renderArmorLayer(ModelBase modelBase, Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if (entityIn instanceof EntityPlayer) {
            PlayerRenderer playerRenderer = renderers.get(entityIn);
            EntityPlayer player = (EntityPlayer)entityIn;
            if (playerRenderer == null || !playerRenderer.renderArmor((ModelBiped)modelBase, player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale)) {
                modelBase.func_78088_a(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            }
        } else {
            modelBase.func_78088_a(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
    }

    public static void positionItemSide(RenderLivingBase<?> livingEntityRenderer, EntityLivingBase entity, ItemStack itemStack, ItemCameraTransforms.TransformType transformType, EnumHandSide handSide) {
        if (entity instanceof EntityPlayer) {
            PlayerRenderer playerRenderer = renderers.get(entity);
            EntityPlayer player = (EntityPlayer)entity;
            if (playerRenderer == null || !playerRenderer.positionItemSide(player, itemStack, CompatibleTransformType.fromItemRenderType(transformType), CompatibleEnumHandSide.fromEnumHandSide(handSide))) {
                ((ModelBiped)livingEntityRenderer.func_177087_b()).func_187073_a(0.0625f, handSide);
            }
        } else {
            ((ModelBiped)livingEntityRenderer.func_177087_b()).func_187073_a(0.0625f, handSide);
        }
    }

    public static boolean isProning(EntityPlayer player) {
        return (CompatibleExtraEntityFlags.getFlags((Entity)player) & CompatibleExtraEntityFlags.PRONING) != 0;
    }

    public static float adjustCameraPosition(EntityLivingBase player, float position) {
        return player instanceof EntityPlayer && Interceptors.isProning((EntityPlayer)player) && Minecraft.func_71410_x().field_71474_y.field_74320_O == 0 ? position + player.func_70047_e() * 1.6f : position;
    }

    public static void setRenderVolumeThreshold(double d) {
        volumeThreshold = d;
    }

    public static boolean shouldRender(List<ModelBox> cubeList) {
        if (volumeThreshold <= 0.1) {
            return true;
        }
        return (double)((OptimizedCubeList)cubeList).getMaxVol() > volumeThreshold;
    }
}


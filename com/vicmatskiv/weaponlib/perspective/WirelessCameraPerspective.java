/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.perspective;

import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTessellator;
import com.vicmatskiv.weaponlib.electronics.PlayerTabletInstance;
import com.vicmatskiv.weaponlib.electronics.SignalQuality;
import com.vicmatskiv.weaponlib.perspective.RemoteFirstPersonPerspective;
import com.vicmatskiv.weaponlib.tracking.PlayerEntityTracker;
import com.vicmatskiv.weaponlib.tracking.TrackableEntity;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class WirelessCameraPerspective
extends RemoteFirstPersonPerspective {
    private static final Logger logger = LogManager.getLogger(WirelessCameraPerspective.class);
    private static final String STATIC_TEXTURE = "weaponlib:/com/vicmatskiv/weaponlib/resources/static.png";
    public static final String DARK_SCREEN_TEXTURE = "weaponlib:/com/vicmatskiv/weaponlib/resources/dark-screen.png";
    private static final int STATIC_IMAGES_PER_ROW = 8;
    private int tickCounter;
    private int activeWatchIndex;
    private int badSignalTickCounter;
    private int imageIndex;
    private Random random = new Random();
    private int totalTrackableEntities;
    private String displayName;
    private Float batteryLevel;

    @Override
    protected void updateWatchablePlayer() {
        Entity realEntity;
        EntityPlayer entityPlayer = CompatibilityProvider.compatibility.clientPlayer();
        PlayerItemInstance<?> instance = this.modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)entityPlayer);
        if (!(instance instanceof PlayerTabletInstance)) {
            return;
        }
        PlayerTabletInstance tabletInstance = (PlayerTabletInstance)instance;
        PlayerEntityTracker playerEntityTracker = PlayerEntityTracker.getTracker((EntityLivingBase)entityPlayer);
        if (playerEntityTracker == null) {
            return;
        }
        this.activeWatchIndex = tabletInstance.getActiveWatchIndex();
        this.totalTrackableEntities = playerEntityTracker.getTrackableEntitites().size();
        TrackableEntity te = this.totalTrackableEntities > 0 ? playerEntityTracker.getTrackableEntity(this.activeWatchIndex) : null;
        Entity watchableEntity = null;
        if (te == null) {
            this.displayName = "";
            this.batteryLevel = null;
        } else {
            this.displayName = te.getDisplayName();
            watchableEntity = te.getEntity();
            this.batteryLevel = Float.valueOf(1.0f - (float)(CompatibilityProvider.compatibility.world((Entity)entityPlayer).func_72820_D() - te.getStartTimestamp()) / (float)te.getTrackingDuration());
            if (this.batteryLevel.floatValue() > 1.0f) {
                this.batteryLevel = Float.valueOf(1.0f);
            } else if (this.batteryLevel.floatValue() < 0.0f) {
                this.batteryLevel = Float.valueOf(0.0f);
            }
        }
        Entity entity = realEntity = watchableEntity == null ? null : CompatibilityProvider.compatibility.world(watchableEntity).func_73045_a(watchableEntity.func_145782_y());
        if (realEntity != null && realEntity != watchableEntity) {
            watchableEntity = (EntityLivingBase)realEntity;
        }
        if (this.tickCounter++ % 50 == 0) {
            logger.trace("Using entity tracker {}", (Object)playerEntityTracker);
            if (watchableEntity != null) {
                logger.debug("Watching {} with uuid {}, distance: {}  ", (Object)watchableEntity, (Object)watchableEntity.func_110124_au(), (Object)Math.sqrt(Math.pow(watchableEntity.field_70165_t - CompatibilityProvider.compatibility.getClientPlayer().field_70165_t, 2.0) + Math.pow(watchableEntity.field_70161_v - CompatibilityProvider.compatibility.getClientPlayer().field_70161_v, 2.0)));
            }
        }
        if (watchableEntity == null || watchableEntity instanceof EntityLivingBase) {
            this.watchablePlayer.setEntityLiving((EntityLivingBase)watchableEntity);
        }
    }

    @Override
    protected void renderOverlay() {
        super.renderOverlay();
        this.framebuffer.func_147610_a(true);
        int maxDistance = 120;
        int displayCameraIndex = this.activeWatchIndex + 1;
        String message = "Cam " + displayCameraIndex + "/" + this.totalTrackableEntities + ": " + this.displayName;
        EntityLivingBase watchableEntity = this.watchablePlayer.getEntityLiving();
        int color = 0xFFFF00;
        if (watchableEntity != null) {
            EntityPlayer origPlayer = CompatibilityProvider.compatibility.clientPlayer();
            double distance = Math.pow(watchableEntity.field_70165_t - origPlayer.field_70165_t, 2.0) + Math.pow(watchableEntity.field_70163_u - origPlayer.field_70163_u, 2.0) + Math.pow(watchableEntity.field_70161_v - origPlayer.field_70161_v, 2.0);
            SignalQuality quality = SignalQuality.getQuality((int)Math.sqrt(distance), maxDistance);
            if (watchableEntity.field_70128_L || quality.isInterrupted() || this.badSignalTickCounter > 0 && this.badSignalTickCounter < 5 || watchableEntity.field_70128_L) {
                if (this.badSignalTickCounter == 0) {
                    this.framebuffer.func_147614_f();
                    this.framebuffer.func_147610_a(true);
                }
                color = 0xFFFF00;
                message = "Cam " + displayCameraIndex + "/" + this.totalTrackableEntities + ": no signal";
                this.drawStatic();
                ++this.badSignalTickCounter;
            }
            if (this.badSignalTickCounter == 5) {
                this.badSignalTickCounter = 0;
            }
        } else if (this.totalTrackableEntities == 0) {
            this.framebuffer.func_147614_f();
            this.framebuffer.func_147610_a(true);
            Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation(DARK_SCREEN_TEXTURE));
            WirelessCameraPerspective.drawTexturedQuadFit(0.0, 0.0, this.width, this.height, 0.0);
            color = 0xFF0000;
            message = "No Cameras Available";
        } else {
            this.framebuffer.func_147614_f();
            this.framebuffer.func_147610_a(true);
            message = "Cam " + displayCameraIndex + "/" + this.totalTrackableEntities + ": " + this.displayName;
            this.drawStatic();
        }
        FontRenderer fontRender = CompatibilityProvider.compatibility.getFontRenderer();
        float scale = 2.0f;
        GL11.glScalef((float)scale, (float)scale, (float)scale);
        fontRender.func_175065_a(message, (float)((int)(40.0f / scale)), (float)((int)((float)(this.height - 30) / scale)), color, false);
        if (this.totalTrackableEntities > 0 && this.batteryLevel != null) {
            fontRender.func_175065_a("Battery: " + (int)(this.batteryLevel.floatValue() * 100.0f) + "%", (float)((int)(((float)this.width - 150.0f) / scale)), (float)((int)((float)(this.height - 30) / scale)), color, false);
        }
    }

    public void drawStatic() {
        Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation(STATIC_TEXTURE));
        this.imageIndex = this.random.nextInt(8);
        float uWidth = 0.125f;
        float aU = (float)(this.imageIndex + 1) * uWidth;
        float aV = 1.0f;
        float bU = (float)(this.imageIndex + 1) * uWidth;
        float bV = 0.0f;
        float cU = (float)this.imageIndex * uWidth;
        float cV = 0.0f;
        float dU = (float)this.imageIndex * uWidth;
        float dV = 1.0f;
        double x = 0.0;
        double y = 0.0;
        double width = this.width;
        double height = this.height;
        double zLevel = 0.0;
        CompatibleTessellator tessellator = CompatibleTessellator.getInstance();
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x + 0.0, y + height, zLevel, aU, aV);
        tessellator.addVertexWithUV(x + width, y + height, zLevel, bU, bV);
        tessellator.addVertexWithUV(x + width, y + 0.0, zLevel, cU, cV);
        tessellator.addVertexWithUV(x + 0.0, y + 0.0, zLevel, dU, dV);
        tessellator.draw();
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
}


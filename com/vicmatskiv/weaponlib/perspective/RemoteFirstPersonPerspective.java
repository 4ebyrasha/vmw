/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.perspective;

import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.RenderingPhase;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleParticleManager;
import com.vicmatskiv.weaponlib.compatibility.CompatiblePlayerCreatureWrapper;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderTickEvent;
import com.vicmatskiv.weaponlib.perspective.Perspective;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class RemoteFirstPersonPerspective
extends Perspective<RenderableState> {
    private static final Logger logger = LogManager.getLogger(RemoteFirstPersonPerspective.class);
    private long renderEndNanoTime = System.nanoTime();
    protected CompatiblePlayerCreatureWrapper watchablePlayer;

    public RemoteFirstPersonPerspective() {
        this.width = 427;
        this.height = 240;
        WorldClient world = (WorldClient)CompatibilityProvider.compatibility.world((Entity)CompatibilityProvider.compatibility.clientPlayer());
        this.watchablePlayer = new CompatiblePlayerCreatureWrapper(Minecraft.func_71410_x(), (World)world);
    }

    @Override
    public void update(CompatibleRenderTickEvent event) {
        if (Minecraft.func_71410_x().func_147113_T()) {
            return;
        }
        EntityPlayer origPlayer = CompatibilityProvider.compatibility.clientPlayer();
        if (origPlayer == null) {
            return;
        }
        this.updateWatchablePlayer();
        RenderGlobal origRenderGlobal = Minecraft.func_71410_x().field_71438_f;
        CompatibleParticleManager origEffectRenderer = CompatibilityProvider.compatibility.getCompatibleParticleManager();
        Entity origRenderViewEntity = CompatibilityProvider.compatibility.getRenderViewEntity();
        EntityRenderer origEntityRenderer = Minecraft.func_71410_x().field_71460_t;
        int origDisplayWidth = Minecraft.func_71410_x().field_71443_c;
        int origDisplayHeight = Minecraft.func_71410_x().field_71440_d;
        Minecraft.func_71410_x().field_71443_c = this.width;
        Minecraft.func_71410_x().field_71440_d = this.height;
        this.framebuffer.func_147610_a(true);
        Minecraft.func_71410_x().field_71438_f = this.renderGlobal;
        Minecraft.func_71410_x().field_71452_i = this.effectRenderer.getParticleManager();
        Minecraft.func_71410_x().field_71460_t = this.entityRenderer;
        if (this.watchablePlayer.getEntityLiving() != null && !this.watchablePlayer.getEntityLiving().field_70128_L) {
            CompatibilityProvider.compatibility.setRenderViewEntity((Entity)this.watchablePlayer.getEntityLiving());
            CompatibilityProvider.compatibility.setClientPlayer((EntityPlayer)this.watchablePlayer);
            this.modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.RENDER_PERSPECTIVE);
            this.entityRenderer.setPrepareTerrain(true);
            this.entityRenderer.func_78464_a();
            long p_78471_2_ = this.renderEndNanoTime + 16666666L;
            this.entityRenderer.func_78471_a(event.getRenderTickTime(), p_78471_2_);
            this.modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.NORMAL);
            CompatibilityProvider.compatibility.setRenderViewEntity(origRenderViewEntity);
            CompatibilityProvider.compatibility.setClientPlayer(origPlayer);
        }
        this.renderOverlay();
        Minecraft.func_71410_x().func_147110_a().func_147610_a(true);
        Minecraft.func_71410_x().field_71438_f = origRenderGlobal;
        Minecraft.func_71410_x().field_71452_i = origEffectRenderer.getParticleManager();
        Minecraft.func_71410_x().field_71443_c = origDisplayWidth;
        Minecraft.func_71410_x().field_71440_d = origDisplayHeight;
        Minecraft.func_71410_x().field_71460_t = origEntityRenderer;
        this.renderEndNanoTime = System.nanoTime();
    }

    protected abstract void updateWatchablePlayer();

    protected void renderOverlay() {
        this.entityRenderer.func_78478_c();
    }
}


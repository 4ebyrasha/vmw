/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.particle.ParticleBreaking
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.texture.TextureAtlasSprite
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Items
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTessellator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleBreaking;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class CompatibleParticle
extends Particle {
    public static CompatibleParticleBreaking createParticleBreaking(ModContext modContext, World worldIn, double posXIn, double posYIn, double posZIn) {
        return new CompatibleParticleBreaking(modContext, worldIn, posXIn, posYIn, posZIn);
    }

    public CompatibleParticle(World par1World, double positionX, double positionY, double positionZ, double motionX, double motionY, double motionZ) {
        super(par1World, positionX, positionY, positionZ, motionX, motionY, motionZ);
    }

    protected boolean isCollided() {
        return this.field_187133_m;
    }

    @SideOnly(value=Side.CLIENT)
    public void func_180434_a(BufferBuilder worldRendererIn, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        this.renderParticle(CompatibleTessellator.getInstance(), partialTicks, rotationX, rotationZ, rotationYZ, rotationXY, rotationXZ);
    }

    public abstract void renderParticle(CompatibleTessellator var1, float var2, float var3, float var4, float var5, float var6, float var7);

    public static class CompatibleParticleBreaking
    extends ParticleBreaking {
        public static final String TEXTURE_BLOOD_PARTICLES = "particle/blood";

        protected CompatibleParticleBreaking(ModContext modContext, World worldIn, double posXIn, double posYIn, double posZIn) {
            super(worldIn, posXIn, posYIn, posZIn, Items.field_151126_ay);
            TextureAtlasSprite sprite = Minecraft.func_71410_x().func_147117_R().func_110572_b(modContext.getNamedResource(TEXTURE_BLOOD_PARTICLES).toString());
            this.func_187117_a(sprite);
        }
    }
}


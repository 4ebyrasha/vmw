/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockChest
 *  net.minecraft.block.BlockEnderChest
 *  net.minecraft.block.BlockSign
 *  net.minecraft.block.BlockSkull
 *  net.minecraft.block.SoundType
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.ISound
 *  net.minecraft.client.audio.PositionedSoundRecord
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.renderer.BlockRendererDispatcher
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.ChunkRenderContainer
 *  net.minecraft.client.renderer.DestroyBlockProgress
 *  net.minecraft.client.renderer.GLAllocation
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.Matrix4f
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.RenderList
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.VboRenderList
 *  net.minecraft.client.renderer.Vector3d
 *  net.minecraft.client.renderer.ViewFrustum
 *  net.minecraft.client.renderer.chunk.ChunkRenderDispatcher
 *  net.minecraft.client.renderer.chunk.CompiledChunk
 *  net.minecraft.client.renderer.chunk.IRenderChunkFactory
 *  net.minecraft.client.renderer.chunk.ListChunkFactory
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.client.renderer.chunk.VboChunkFactory
 *  net.minecraft.client.renderer.chunk.VisGraph
 *  net.minecraft.client.renderer.culling.ClippingHelper
 *  net.minecraft.client.renderer.culling.ClippingHelperImpl
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.culling.ICamera
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.texture.TextureAtlasSprite
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.renderer.texture.TextureMap
 *  net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.client.renderer.vertex.VertexBuffer
 *  net.minecraft.client.renderer.vertex.VertexFormat
 *  net.minecraft.client.renderer.vertex.VertexFormatElement
 *  net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType
 *  net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.client.shader.ShaderLinkHelper
 *  net.minecraft.crash.CrashReport
 *  net.minecraft.crash.CrashReportCategory
 *  net.minecraft.crash.ICrashReportDetail
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemDye
 *  net.minecraft.item.ItemRecord
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityChest
 *  net.minecraft.util.BlockRenderLayer
 *  net.minecraft.util.ClassInheritanceMultiMap
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.ReportedException
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$MutableBlockPos
 *  net.minecraft.util.math.BlockPos$PooledMutableBlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.IWorldEventListener
 *  net.minecraft.world.World
 *  net.minecraft.world.border.WorldBorder
 *  net.minecraft.world.chunk.Chunk
 *  net.minecraftforge.client.IRenderHandler
 *  net.minecraftforge.client.MinecraftForgeClient
 *  net.minecraftforge.common.ForgeModContainer
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.block.BlockSign;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.ChunkRenderContainer;
import net.minecraft.client.renderer.DestroyBlockProgress;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderList;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VboRenderList;
import net.minecraft.client.renderer.Vector3d;
import net.minecraft.client.renderer.ViewFrustum;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.IRenderChunkFactory;
import net.minecraft.client.renderer.chunk.ListChunkFactory;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.chunk.VboChunkFactory;
import net.minecraft.client.renderer.chunk.VisGraph;
import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderLinkHelper;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ICrashReportDetail;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemRecord;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ClassInheritanceMultiMap;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.IWorldEventListener;
import net.minecraft.world.World;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

@SideOnly(value=Side.CLIENT)
public class CompatibleRenderGlobal
extends RenderGlobal {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final ResourceLocation MOON_PHASES_TEXTURES = new ResourceLocation("textures/environment/moon_phases.png");
    private static final ResourceLocation SUN_TEXTURES = new ResourceLocation("textures/environment/sun.png");
    private static final ResourceLocation CLOUDS_TEXTURES = new ResourceLocation("textures/environment/clouds.png");
    private static final ResourceLocation END_SKY_TEXTURES = new ResourceLocation("textures/environment/end_sky.png");
    private static final ResourceLocation FORCEFIELD_TEXTURES = new ResourceLocation("textures/misc/forcefield.png");
    private final Minecraft mc;
    private final TextureManager renderEngine;
    private final RenderManager renderManager;
    private WorldClient world;
    private Set<RenderChunk> chunksToUpdate = Sets.newLinkedHashSet();
    private List<ContainerLocalRenderInformation> renderInfos = Lists.newArrayListWithCapacity((int)69696);
    private final Set<TileEntity> setTileEntities = Sets.newHashSet();
    private CompatibleViewFrustum viewFrustum;
    private int starGLCallList = -1;
    private int glSkyList = -1;
    private int glSkyList2 = -1;
    private final VertexFormat vertexBufferFormat;
    private VertexBuffer starVBO;
    private VertexBuffer skyVBO;
    private VertexBuffer sky2VBO;
    private int cloudTickCounter;
    private final Map<Integer, DestroyBlockProgress> damagedBlocks = Maps.newHashMap();
    private final Map<BlockPos, ISound> mapSoundPositions = Maps.newHashMap();
    private final TextureAtlasSprite[] destroyBlockIcons = new TextureAtlasSprite[10];
    private Framebuffer entityOutlineFramebuffer;
    private ShaderGroup entityOutlineShader;
    private double frustumUpdatePosX = Double.MIN_VALUE;
    private double frustumUpdatePosY = Double.MIN_VALUE;
    private double frustumUpdatePosZ = Double.MIN_VALUE;
    private int frustumUpdatePosChunkX = Integer.MIN_VALUE;
    private int frustumUpdatePosChunkY = Integer.MIN_VALUE;
    private int frustumUpdatePosChunkZ = Integer.MIN_VALUE;
    private double lastViewEntityX = Double.MIN_VALUE;
    private double lastViewEntityY = Double.MIN_VALUE;
    private double lastViewEntityZ = Double.MIN_VALUE;
    private double lastViewEntityPitch = Double.MIN_VALUE;
    private double lastViewEntityYaw = Double.MIN_VALUE;
    private ChunkRenderDispatcher renderDispatcher;
    private ChunkRenderContainer renderContainer;
    private int renderDistanceChunks = -1;
    private int renderEntitiesStartupCounter = 2;
    private int countEntitiesTotal;
    private int countEntitiesRendered;
    private int countEntitiesHidden;
    private boolean debugFixTerrainFrustum;
    private ClippingHelper debugFixedClippingHelper;
    private final Vector4f[] debugTerrainMatrix = new Vector4f[8];
    private final Vector3d debugTerrainFrustumPosition = new Vector3d();
    private boolean vboEnabled;
    IRenderChunkFactory field_175007_a;
    private double prevRenderSortX;
    private double prevRenderSortY;
    private double prevRenderSortZ;
    private boolean displayListEntitiesDirty = true;
    private boolean entityOutlinesRendered;
    private final Set<BlockPos> setLightUpdates = Sets.newHashSet();

    public CompatibleRenderGlobal(Minecraft mcIn) {
        super(mcIn);
        this.mc = mcIn;
        this.renderManager = mcIn.func_175598_ae();
        this.renderEngine = mcIn.func_110434_K();
        this.renderEngine.func_110577_a(FORCEFIELD_TEXTURES);
        GlStateManager.func_187421_b((int)3553, (int)10242, (int)10497);
        GlStateManager.func_187421_b((int)3553, (int)10243, (int)10497);
        GlStateManager.func_179144_i((int)0);
        this.updateDestroyBlockIcons();
        this.vboEnabled = OpenGlHelper.func_176075_f();
        if (this.vboEnabled) {
            this.renderContainer = new VboRenderList();
            this.field_175007_a = new VboChunkFactory();
        } else {
            this.renderContainer = new RenderList();
            this.field_175007_a = new ListChunkFactory();
        }
        this.vertexBufferFormat = new VertexFormat();
        this.vertexBufferFormat.func_181721_a(new VertexFormatElement(0, VertexFormatElement.EnumType.FLOAT, VertexFormatElement.EnumUsage.POSITION, 3));
        this.generateStars();
        this.generateSky();
        this.generateSky2();
    }

    public void func_110549_a(IResourceManager resourceManager) {
        this.updateDestroyBlockIcons();
    }

    private void updateDestroyBlockIcons() {
        TextureMap texturemap = this.mc.func_147117_R();
        for (int i = 0; i < this.destroyBlockIcons.length; ++i) {
            this.destroyBlockIcons[i] = texturemap.func_110572_b("minecraft:blocks/destroy_stage_" + i);
        }
    }

    public void func_174966_b() {
        if (OpenGlHelper.field_148824_g) {
            if (ShaderLinkHelper.func_148074_b() == null) {
                ShaderLinkHelper.func_148076_a();
            }
            ResourceLocation resourcelocation = new ResourceLocation("shaders/post/entity_outline.json");
            try {
                this.entityOutlineShader = new ShaderGroup(this.mc.func_110434_K(), this.mc.func_110442_L(), this.mc.func_147110_a(), resourcelocation);
                this.entityOutlineShader.func_148026_a(this.mc.field_71443_c, this.mc.field_71440_d);
                this.entityOutlineFramebuffer = this.entityOutlineShader.func_177066_a("final");
            }
            catch (IOException ioexception) {
                LOGGER.warn("Failed to load shader: {}", (Object)resourcelocation, (Object)ioexception);
                this.entityOutlineShader = null;
                this.entityOutlineFramebuffer = null;
            }
            catch (JsonSyntaxException jsonsyntaxexception) {
                LOGGER.warn("Failed to load shader: {}", (Object)resourcelocation, (Object)jsonsyntaxexception);
                this.entityOutlineShader = null;
                this.entityOutlineFramebuffer = null;
            }
        } else {
            this.entityOutlineShader = null;
            this.entityOutlineFramebuffer = null;
        }
    }

    public void func_174975_c() {
        if (this.func_174985_d()) {
            GlStateManager.func_179147_l();
            GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ZERO, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE);
            this.entityOutlineFramebuffer.func_178038_a(this.mc.field_71443_c, this.mc.field_71440_d, false);
            GlStateManager.func_179084_k();
        }
    }

    protected boolean func_174985_d() {
        return this.entityOutlineFramebuffer != null && this.entityOutlineShader != null && this.mc.field_71439_g != null;
    }

    private void generateSky2() {
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferbuilder = tessellator.func_178180_c();
        if (this.sky2VBO != null) {
            this.sky2VBO.func_177362_c();
        }
        if (this.glSkyList2 >= 0) {
            GLAllocation.func_74523_b((int)this.glSkyList2);
            this.glSkyList2 = -1;
        }
        if (this.vboEnabled) {
            this.sky2VBO = new VertexBuffer(this.vertexBufferFormat);
            this.renderSky(bufferbuilder, -16.0f, true);
            bufferbuilder.func_178977_d();
            bufferbuilder.func_178965_a();
            this.sky2VBO.func_181722_a(bufferbuilder.func_178966_f());
        } else {
            this.glSkyList2 = GLAllocation.func_74526_a((int)1);
            GlStateManager.func_187423_f((int)this.glSkyList2, (int)4864);
            this.renderSky(bufferbuilder, -16.0f, true);
            tessellator.func_78381_a();
            GlStateManager.func_187415_K();
        }
    }

    private void generateSky() {
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferbuilder = tessellator.func_178180_c();
        if (this.skyVBO != null) {
            this.skyVBO.func_177362_c();
        }
        if (this.glSkyList >= 0) {
            GLAllocation.func_74523_b((int)this.glSkyList);
            this.glSkyList = -1;
        }
        if (this.vboEnabled) {
            this.skyVBO = new VertexBuffer(this.vertexBufferFormat);
            this.renderSky(bufferbuilder, 16.0f, false);
            bufferbuilder.func_178977_d();
            bufferbuilder.func_178965_a();
            this.skyVBO.func_181722_a(bufferbuilder.func_178966_f());
        } else {
            this.glSkyList = GLAllocation.func_74526_a((int)1);
            GlStateManager.func_187423_f((int)this.glSkyList, (int)4864);
            this.renderSky(bufferbuilder, 16.0f, false);
            tessellator.func_78381_a();
            GlStateManager.func_187415_K();
        }
    }

    private void renderSky(BufferBuilder worldRendererIn, float posY, boolean reverseX) {
        int i = 64;
        int j = 6;
        worldRendererIn.func_181668_a(7, DefaultVertexFormats.field_181705_e);
        for (int k = -384; k <= 384; k += 64) {
            for (int l = -384; l <= 384; l += 64) {
                float f = k;
                float f1 = k + 64;
                if (reverseX) {
                    f1 = k;
                    f = k + 64;
                }
                worldRendererIn.func_181662_b((double)f, (double)posY, (double)l).func_181675_d();
                worldRendererIn.func_181662_b((double)f1, (double)posY, (double)l).func_181675_d();
                worldRendererIn.func_181662_b((double)f1, (double)posY, (double)(l + 64)).func_181675_d();
                worldRendererIn.func_181662_b((double)f, (double)posY, (double)(l + 64)).func_181675_d();
            }
        }
    }

    private void generateStars() {
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferbuilder = tessellator.func_178180_c();
        if (this.starVBO != null) {
            this.starVBO.func_177362_c();
        }
        if (this.starGLCallList >= 0) {
            GLAllocation.func_74523_b((int)this.starGLCallList);
            this.starGLCallList = -1;
        }
        if (this.vboEnabled) {
            this.starVBO = new VertexBuffer(this.vertexBufferFormat);
            this.renderStars(bufferbuilder);
            bufferbuilder.func_178977_d();
            bufferbuilder.func_178965_a();
            this.starVBO.func_181722_a(bufferbuilder.func_178966_f());
        } else {
            this.starGLCallList = GLAllocation.func_74526_a((int)1);
            GlStateManager.func_179094_E();
            GlStateManager.func_187423_f((int)this.starGLCallList, (int)4864);
            this.renderStars(bufferbuilder);
            tessellator.func_78381_a();
            GlStateManager.func_187415_K();
            GlStateManager.func_179121_F();
        }
    }

    private void renderStars(BufferBuilder worldRendererIn) {
        Random random = new Random(10842L);
        worldRendererIn.func_181668_a(7, DefaultVertexFormats.field_181705_e);
        for (int i = 0; i < 1500; ++i) {
            double d0 = random.nextFloat() * 2.0f - 1.0f;
            double d1 = random.nextFloat() * 2.0f - 1.0f;
            double d2 = random.nextFloat() * 2.0f - 1.0f;
            double d3 = 0.15f + random.nextFloat() * 0.1f;
            double d4 = d0 * d0 + d1 * d1 + d2 * d2;
            if (!(d4 < 1.0) || !(d4 > 0.01)) continue;
            d4 = 1.0 / Math.sqrt(d4);
            double d5 = (d0 *= d4) * 100.0;
            double d6 = (d1 *= d4) * 100.0;
            double d7 = (d2 *= d4) * 100.0;
            double d8 = Math.atan2(d0, d2);
            double d9 = Math.sin(d8);
            double d10 = Math.cos(d8);
            double d11 = Math.atan2(Math.sqrt(d0 * d0 + d2 * d2), d1);
            double d12 = Math.sin(d11);
            double d13 = Math.cos(d11);
            double d14 = random.nextDouble() * Math.PI * 2.0;
            double d15 = Math.sin(d14);
            double d16 = Math.cos(d14);
            for (int j = 0; j < 4; ++j) {
                double d17 = 0.0;
                double d18 = (double)((j & 2) - 1) * d3;
                double d19 = (double)((j + 1 & 2) - 1) * d3;
                double d20 = 0.0;
                double d21 = d18 * d16 - d19 * d15;
                double d22 = d19 * d16 + d18 * d15;
                double d23 = d21 * d12 + 0.0 * d13;
                double d24 = 0.0 * d12 - d21 * d13;
                double d25 = d24 * d9 - d22 * d10;
                double d26 = d22 * d9 + d24 * d10;
                worldRendererIn.func_181662_b(d5 + d25, d6 + d23, d7 + d26).func_181675_d();
            }
        }
    }

    public void func_72732_a(@Nullable WorldClient worldClientIn) {
        if (this.world != null) {
            this.world.func_72848_b((IWorldEventListener)this);
        }
        this.frustumUpdatePosX = Double.MIN_VALUE;
        this.frustumUpdatePosY = Double.MIN_VALUE;
        this.frustumUpdatePosZ = Double.MIN_VALUE;
        this.frustumUpdatePosChunkX = Integer.MIN_VALUE;
        this.frustumUpdatePosChunkY = Integer.MIN_VALUE;
        this.frustumUpdatePosChunkZ = Integer.MIN_VALUE;
        this.renderManager.func_78717_a((World)worldClientIn);
        this.world = worldClientIn;
        if (worldClientIn != null) {
            worldClientIn.func_72954_a((IWorldEventListener)this);
            this.func_72712_a();
        } else {
            this.chunksToUpdate.clear();
            this.renderInfos.clear();
            if (this.viewFrustum != null) {
                this.viewFrustum.func_178160_a();
                this.viewFrustum = null;
            }
            if (this.renderDispatcher != null) {
                this.renderDispatcher.func_188244_g();
            }
            this.renderDispatcher = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void func_72712_a() {
        if (this.world != null) {
            Entity entity;
            if (this.renderDispatcher == null) {
                this.renderDispatcher = new ChunkRenderDispatcher();
            }
            this.displayListEntitiesDirty = true;
            Blocks.field_150362_t.func_150122_b(this.mc.field_71474_y.field_74347_j);
            Blocks.field_150361_u.func_150122_b(this.mc.field_71474_y.field_74347_j);
            this.renderDistanceChunks = this.mc.field_71474_y.field_151451_c;
            boolean flag = this.vboEnabled;
            this.vboEnabled = OpenGlHelper.func_176075_f();
            if (flag && !this.vboEnabled) {
                this.renderContainer = new RenderList();
                this.field_175007_a = new ListChunkFactory();
            } else if (!flag && this.vboEnabled) {
                this.renderContainer = new VboRenderList();
                this.field_175007_a = new VboChunkFactory();
            }
            if (flag != this.vboEnabled) {
                this.generateStars();
                this.generateSky();
                this.generateSky2();
            }
            if (this.viewFrustum != null) {
                this.viewFrustum.func_178160_a();
            }
            this.func_174986_e();
            Set<TileEntity> set = this.setTileEntities;
            synchronized (set) {
                this.setTileEntities.clear();
            }
            this.viewFrustum = new CompatibleViewFrustum((World)this.world, this.mc.field_71474_y.field_151451_c, this, this.field_175007_a);
            if (this.world != null && (entity = this.mc.func_175606_aa()) != null) {
                this.viewFrustum.func_178163_a(entity.field_70165_t, entity.field_70161_v);
            }
            this.renderEntitiesStartupCounter = 2;
        }
    }

    protected void func_174986_e() {
        this.chunksToUpdate.clear();
        this.renderDispatcher.func_178514_b();
    }

    public void func_72720_a(int width, int height) {
        if (OpenGlHelper.field_148824_g && this.entityOutlineShader != null) {
            this.entityOutlineShader.func_148026_a(width, height);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void func_180446_a(Entity renderViewEntity, ICamera camera, float partialTicks) {
        int pass = MinecraftForgeClient.getRenderPass();
        if (this.renderEntitiesStartupCounter > 0) {
            if (pass > 0) {
                return;
            }
            --this.renderEntitiesStartupCounter;
        } else {
            double d0 = renderViewEntity.field_70169_q + (renderViewEntity.field_70165_t - renderViewEntity.field_70169_q) * (double)partialTicks;
            double d1 = renderViewEntity.field_70167_r + (renderViewEntity.field_70163_u - renderViewEntity.field_70167_r) * (double)partialTicks;
            double d2 = renderViewEntity.field_70166_s + (renderViewEntity.field_70161_v - renderViewEntity.field_70166_s) * (double)partialTicks;
            this.world.field_72984_F.func_76320_a("prepare");
            TileEntityRendererDispatcher.field_147556_a.func_190056_a((World)this.world, this.mc.func_110434_K(), this.mc.field_71466_p, this.mc.func_175606_aa(), this.mc.field_71476_x, partialTicks);
            this.renderManager.func_180597_a((World)this.world, this.mc.field_71466_p, this.mc.func_175606_aa(), this.mc.field_147125_j, this.mc.field_71474_y, partialTicks);
            if (pass == 0) {
                this.countEntitiesTotal = 0;
                this.countEntitiesRendered = 0;
                this.countEntitiesHidden = 0;
            }
            Entity entity = this.mc.func_175606_aa();
            double d3 = entity.field_70142_S + (entity.field_70165_t - entity.field_70142_S) * (double)partialTicks;
            double d4 = entity.field_70137_T + (entity.field_70163_u - entity.field_70137_T) * (double)partialTicks;
            double d5 = entity.field_70136_U + (entity.field_70161_v - entity.field_70136_U) * (double)partialTicks;
            TileEntityRendererDispatcher.field_147554_b = d3;
            TileEntityRendererDispatcher.field_147555_c = d4;
            TileEntityRendererDispatcher.field_147552_d = d5;
            this.renderManager.func_178628_a(d3, d4, d5);
            this.mc.field_71460_t.func_180436_i();
            this.world.field_72984_F.func_76318_c("global");
            List list = this.world.func_72910_y();
            if (pass == 0) {
                this.countEntitiesTotal = list.size();
            }
            for (int i = 0; i < this.world.field_73007_j.size(); ++i) {
                Entity entity1 = (Entity)this.world.field_73007_j.get(i);
                if (!entity1.shouldRenderInPass(pass)) continue;
                ++this.countEntitiesRendered;
                if (!entity1.func_145770_h(d0, d1, d2)) continue;
                this.renderManager.func_188388_a(entity1, partialTicks, false);
            }
            this.world.field_72984_F.func_76318_c("entities");
            ArrayList list1 = Lists.newArrayList();
            ArrayList list2 = Lists.newArrayList();
            BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.func_185346_s();
            for (ContainerLocalRenderInformation containerLocalRenderInformation : this.renderInfos) {
                Chunk chunk = this.world.func_175726_f(containerLocalRenderInformation.renderChunk.func_178568_j());
                ClassInheritanceMultiMap classinheritancemultimap = chunk.func_177429_s()[containerLocalRenderInformation.renderChunk.func_178568_j().func_177956_o() / 16];
                if (classinheritancemultimap.isEmpty()) continue;
                Iterator iterator = classinheritancemultimap.iterator();
                while (iterator.hasNext()) {
                    boolean flag1;
                    boolean flag;
                    Entity entity2 = (Entity)iterator.next();
                    if (!entity2.shouldRenderInPass(pass) || !(flag = this.renderManager.func_178635_a(entity2, camera, d0, d1, d2) || entity2.func_184215_y((Entity)this.mc.field_71439_g))) continue;
                    boolean bl = flag1 = this.mc.func_175606_aa() instanceof EntityLivingBase ? ((EntityLivingBase)this.mc.func_175606_aa()).func_70608_bn() : false;
                    if (entity2 == this.mc.func_175606_aa() && this.mc.field_71474_y.field_74320_O == 0 && !flag1 || !(entity2.field_70163_u < 0.0) && !(entity2.field_70163_u >= 256.0) && !this.world.func_175667_e((BlockPos)blockpos$pooledmutableblockpos.func_189535_a(entity2))) continue;
                    ++this.countEntitiesRendered;
                    this.renderManager.func_188388_a(entity2, partialTicks, false);
                    if (this.isOutlineActive(entity2, entity, camera)) {
                        list1.add(entity2);
                    }
                    if (!this.renderManager.func_188390_b(entity2)) continue;
                    list2.add(entity2);
                }
            }
            blockpos$pooledmutableblockpos.func_185344_t();
            if (!list2.isEmpty()) {
                for (Entity entity2 : list2) {
                    this.renderManager.func_188389_a(entity2, partialTicks);
                }
            }
            if (pass == 0 && this.func_174985_d() && (!list1.isEmpty() || this.entityOutlinesRendered)) {
                this.world.field_72984_F.func_76318_c("entityOutlines");
                this.entityOutlineFramebuffer.func_147614_f();
                boolean bl = this.entityOutlinesRendered = !list1.isEmpty();
                if (!list1.isEmpty()) {
                    GlStateManager.func_179143_c((int)519);
                    GlStateManager.func_179106_n();
                    this.entityOutlineFramebuffer.func_147610_a(false);
                    RenderHelper.func_74518_a();
                    this.renderManager.func_178632_c(true);
                    for (int j = 0; j < list1.size(); ++j) {
                        this.renderManager.func_188388_a((Entity)list1.get(j), partialTicks, false);
                    }
                    this.renderManager.func_178632_c(false);
                    RenderHelper.func_74519_b();
                    GlStateManager.func_179132_a((boolean)false);
                    this.entityOutlineShader.func_148018_a(partialTicks);
                    GlStateManager.func_179145_e();
                    GlStateManager.func_179132_a((boolean)true);
                    GlStateManager.func_179127_m();
                    GlStateManager.func_179147_l();
                    GlStateManager.func_179142_g();
                    GlStateManager.func_179143_c((int)515);
                    GlStateManager.func_179126_j();
                    GlStateManager.func_179141_d();
                }
                this.mc.func_147110_a().func_147610_a(false);
            }
            this.world.field_72984_F.func_76318_c("blockentities");
            RenderHelper.func_74519_b();
            TileEntityRendererDispatcher.field_147556_a.preDrawBatch();
            for (ContainerLocalRenderInformation containerLocalRenderInformation : this.renderInfos) {
                List list3 = containerLocalRenderInformation.renderChunk.func_178571_g().func_178485_b();
                if (list3.isEmpty()) continue;
                for (TileEntity tileentity2 : list3) {
                    if (!tileentity2.shouldRenderInPass(pass) || !camera.func_78546_a(tileentity2.getRenderBoundingBox())) continue;
                    TileEntityRendererDispatcher.field_147556_a.func_180546_a(tileentity2, partialTicks, -1);
                }
            }
            Iterator<DestroyBlockProgress> iterator = this.setTileEntities;
            synchronized (iterator) {
                for (TileEntity tileentity : this.setTileEntities) {
                    if (!tileentity.shouldRenderInPass(pass) || !camera.func_78546_a(tileentity.getRenderBoundingBox())) continue;
                    TileEntityRendererDispatcher.field_147556_a.func_180546_a(tileentity, partialTicks, -1);
                }
            }
            TileEntityRendererDispatcher.field_147556_a.drawBatch(pass);
            this.preRenderDamagedBlocks();
            for (DestroyBlockProgress destroyBlockProgress : this.damagedBlocks.values()) {
                BlockPos blockpos = destroyBlockProgress.func_180246_b();
                if (!this.world.func_180495_p(blockpos).func_177230_c().func_149716_u()) continue;
                TileEntity tileentity1 = this.world.func_175625_s(blockpos);
                if (tileentity1 instanceof TileEntityChest) {
                    TileEntityChest tileentitychest = (TileEntityChest)tileentity1;
                    if (tileentitychest.field_145991_k != null) {
                        blockpos = blockpos.func_177972_a(EnumFacing.WEST);
                        tileentity1 = this.world.func_175625_s(blockpos);
                    } else if (tileentitychest.field_145992_i != null) {
                        blockpos = blockpos.func_177972_a(EnumFacing.NORTH);
                        tileentity1 = this.world.func_175625_s(blockpos);
                    }
                }
                IBlockState iblockstate = this.world.func_180495_p(blockpos);
                if (tileentity1 == null || !iblockstate.func_191057_i()) continue;
                TileEntityRendererDispatcher.field_147556_a.func_180546_a(tileentity1, partialTicks, destroyBlockProgress.func_73106_e());
            }
            this.postRenderDamagedBlocks();
            this.mc.field_71460_t.func_175072_h();
            this.mc.field_71424_I.func_76319_b();
        }
    }

    private boolean isOutlineActive(Entity entityIn, Entity viewer, ICamera camera) {
        boolean flag;
        boolean bl = flag = viewer instanceof EntityLivingBase && ((EntityLivingBase)viewer).func_70608_bn();
        if (entityIn == viewer && this.mc.field_71474_y.field_74320_O == 0 && !flag) {
            return false;
        }
        if (entityIn.func_184202_aL()) {
            return true;
        }
        if (this.mc.field_71439_g.func_175149_v() && this.mc.field_71474_y.field_178883_an.func_151470_d() && entityIn instanceof EntityPlayer) {
            return entityIn.field_70158_ak || camera.func_78546_a(entityIn.func_174813_aQ()) || entityIn.func_184215_y((Entity)this.mc.field_71439_g);
        }
        return false;
    }

    public String func_72735_c() {
        int i = this.viewFrustum.field_178164_f.length;
        int j = this.func_184382_g();
        return String.format("C: %d/%d %sD: %d, L: %d, %s", j, i, this.mc.field_175612_E ? "(s) " : "", this.renderDistanceChunks, this.setLightUpdates.size(), this.renderDispatcher == null ? "null" : this.renderDispatcher.func_178504_a());
    }

    protected int func_184382_g() {
        int i = 0;
        for (ContainerLocalRenderInformation renderglobal$containerlocalrenderinformation : this.renderInfos) {
            CompiledChunk compiledchunk = renderglobal$containerlocalrenderinformation.renderChunk.field_178590_b;
            if (compiledchunk == CompiledChunk.field_178502_a || compiledchunk.func_178489_a()) continue;
            ++i;
        }
        return i;
    }

    public String func_72723_d() {
        return "E: " + this.countEntitiesRendered + "/" + this.countEntitiesTotal + ", B: " + this.countEntitiesHidden;
    }

    public void func_174970_a(Entity viewEntity, double partialTicks, ICamera camera, int frameCount, boolean playerSpectator) {
        if (this.mc.field_71474_y.field_151451_c != this.renderDistanceChunks) {
            this.func_72712_a();
        }
        this.world.field_72984_F.func_76320_a("camera");
        double d0 = viewEntity.field_70165_t - this.frustumUpdatePosX;
        double d1 = viewEntity.field_70163_u - this.frustumUpdatePosY;
        double d2 = viewEntity.field_70161_v - this.frustumUpdatePosZ;
        if (this.frustumUpdatePosChunkX != viewEntity.field_70176_ah || this.frustumUpdatePosChunkY != viewEntity.field_70162_ai || this.frustumUpdatePosChunkZ != viewEntity.field_70164_aj || d0 * d0 + d1 * d1 + d2 * d2 > 16.0) {
            this.frustumUpdatePosX = viewEntity.field_70165_t;
            this.frustumUpdatePosY = viewEntity.field_70163_u;
            this.frustumUpdatePosZ = viewEntity.field_70161_v;
            this.frustumUpdatePosChunkX = viewEntity.field_70176_ah;
            this.frustumUpdatePosChunkY = viewEntity.field_70162_ai;
            this.frustumUpdatePosChunkZ = viewEntity.field_70164_aj;
            this.viewFrustum.func_178163_a(viewEntity.field_70165_t, viewEntity.field_70161_v);
        }
        this.world.field_72984_F.func_76318_c("renderlistcamera");
        double d3 = viewEntity.field_70142_S + (viewEntity.field_70165_t - viewEntity.field_70142_S) * partialTicks;
        double d4 = viewEntity.field_70137_T + (viewEntity.field_70163_u - viewEntity.field_70137_T) * partialTicks;
        double d5 = viewEntity.field_70136_U + (viewEntity.field_70161_v - viewEntity.field_70136_U) * partialTicks;
        this.renderContainer.func_178004_a(d3, d4, d5);
        this.world.field_72984_F.func_76318_c("cull");
        if (this.debugFixedClippingHelper != null) {
            Frustum frustum = new Frustum(this.debugFixedClippingHelper);
            frustum.func_78547_a(this.debugTerrainFrustumPosition.field_181059_a, this.debugTerrainFrustumPosition.field_181060_b, this.debugTerrainFrustumPosition.field_181061_c);
            camera = frustum;
        }
        this.mc.field_71424_I.func_76318_c("culling");
        BlockPos blockpos1 = new BlockPos(d3, d4 + (double)viewEntity.func_70047_e(), d5);
        RenderChunk renderchunk = this.viewFrustum.func_178161_a(blockpos1);
        BlockPos blockpos = new BlockPos(MathHelper.func_76128_c((double)(d3 / 16.0)) * 16, MathHelper.func_76128_c((double)(d4 / 16.0)) * 16, MathHelper.func_76128_c((double)(d5 / 16.0)) * 16);
        this.displayListEntitiesDirty = this.displayListEntitiesDirty || !this.chunksToUpdate.isEmpty() || viewEntity.field_70165_t != this.lastViewEntityX || viewEntity.field_70163_u != this.lastViewEntityY || viewEntity.field_70161_v != this.lastViewEntityZ || (double)viewEntity.field_70125_A != this.lastViewEntityPitch || (double)viewEntity.field_70177_z != this.lastViewEntityYaw;
        this.lastViewEntityX = viewEntity.field_70165_t;
        this.lastViewEntityY = viewEntity.field_70163_u;
        this.lastViewEntityZ = viewEntity.field_70161_v;
        this.lastViewEntityPitch = viewEntity.field_70125_A;
        this.lastViewEntityYaw = viewEntity.field_70177_z;
        boolean flag = this.debugFixedClippingHelper != null;
        this.mc.field_71424_I.func_76318_c("update");
        if (!flag && this.displayListEntitiesDirty) {
            this.displayListEntitiesDirty = false;
            this.renderInfos = Lists.newArrayList();
            ArrayDeque queue = Queues.newArrayDeque();
            Entity.func_184227_b((double)MathHelper.func_151237_a((double)((double)this.mc.field_71474_y.field_151451_c / 8.0), (double)1.0, (double)2.5));
            boolean flag1 = this.mc.field_175612_E;
            if (renderchunk != null) {
                boolean flag2 = false;
                ContainerLocalRenderInformation renderglobal$containerlocalrenderinformation3 = new ContainerLocalRenderInformation(renderchunk, null, 0);
                Set<EnumFacing> set1 = this.getVisibleFacings(blockpos1);
                if (set1.size() == 1) {
                    Vector3f vector3f = this.func_174962_a(viewEntity, partialTicks);
                    EnumFacing enumfacing = EnumFacing.func_176737_a((float)vector3f.x, (float)vector3f.y, (float)vector3f.z).func_176734_d();
                    set1.remove(enumfacing);
                }
                if (set1.isEmpty()) {
                    flag2 = true;
                }
                if (flag2 && !playerSpectator) {
                    this.renderInfos.add(renderglobal$containerlocalrenderinformation3);
                } else {
                    if (playerSpectator && this.world.func_180495_p(blockpos1).func_185914_p()) {
                        flag1 = false;
                    }
                    renderchunk.func_178577_a(frameCount);
                    queue.add(renderglobal$containerlocalrenderinformation3);
                }
            } else {
                int i = blockpos1.func_177956_o() > 0 ? 248 : 8;
                for (int j = -this.renderDistanceChunks; j <= this.renderDistanceChunks; ++j) {
                    for (int k = -this.renderDistanceChunks; k <= this.renderDistanceChunks; ++k) {
                        RenderChunk renderchunk1 = this.viewFrustum.func_178161_a(new BlockPos((j << 4) + 8, i, (k << 4) + 8));
                        if (renderchunk1 == null || !camera.func_78546_a(renderchunk1.field_178591_c)) continue;
                        renderchunk1.func_178577_a(frameCount);
                        queue.add(new ContainerLocalRenderInformation(renderchunk1, null, 0));
                    }
                }
            }
            this.mc.field_71424_I.func_76320_a("iteration");
            while (!queue.isEmpty()) {
                ContainerLocalRenderInformation renderglobal$containerlocalrenderinformation1 = (ContainerLocalRenderInformation)queue.poll();
                RenderChunk renderchunk3 = renderglobal$containerlocalrenderinformation1.renderChunk;
                EnumFacing enumfacing2 = renderglobal$containerlocalrenderinformation1.facing;
                this.renderInfos.add(renderglobal$containerlocalrenderinformation1);
                for (RenderChunk enumfacing1 : EnumFacing.values()) {
                    RenderChunk renderchunk2 = this.getRenderChunkOffset(blockpos, renderchunk3, (EnumFacing)enumfacing1);
                    if (flag1 && renderglobal$containerlocalrenderinformation1.hasDirection(enumfacing1.func_176734_d()) || flag1 && enumfacing2 != null && !renderchunk3.func_178571_g().func_178495_a(enumfacing2.func_176734_d(), (EnumFacing)enumfacing1) || renderchunk2 == null || !renderchunk2.func_178577_a(frameCount) || !camera.func_78546_a(renderchunk2.field_178591_c)) continue;
                    ContainerLocalRenderInformation renderglobal$containerlocalrenderinformation = new ContainerLocalRenderInformation(renderchunk2, (EnumFacing)enumfacing1, renderglobal$containerlocalrenderinformation1.counter + 1);
                    renderglobal$containerlocalrenderinformation.setDirection(renderglobal$containerlocalrenderinformation1.setFacing, (EnumFacing)enumfacing1);
                    queue.add(renderglobal$containerlocalrenderinformation);
                }
            }
            this.mc.field_71424_I.func_76319_b();
        }
        this.mc.field_71424_I.func_76318_c("captureFrustum");
        if (this.debugFixTerrainFrustum) {
            this.fixTerrainFrustum(d3, d4, d5);
            this.debugFixTerrainFrustum = false;
        }
        this.mc.field_71424_I.func_76318_c("rebuildNear");
        Set<RenderChunk> set = this.chunksToUpdate;
        this.chunksToUpdate = Sets.newLinkedHashSet();
        for (ContainerLocalRenderInformation renderglobal$containerlocalrenderinformation2 : this.renderInfos) {
            boolean flag3;
            RenderChunk renderchunk4 = renderglobal$containerlocalrenderinformation2.renderChunk;
            if (!renderchunk4.func_178569_m() && !set.contains(renderchunk4)) continue;
            this.displayListEntitiesDirty = true;
            BlockPos blockpos2 = renderchunk4.func_178568_j().func_177982_a(8, 8, 8);
            boolean bl = flag3 = blockpos2.func_177951_i((Vec3i)blockpos1) < 768.0;
            if (ForgeModContainer.alwaysSetupTerrainOffThread || !renderchunk4.func_188281_o() && !flag3) {
                this.chunksToUpdate.add(renderchunk4);
                continue;
            }
            this.mc.field_71424_I.func_76320_a("build near");
            this.renderDispatcher.func_178505_b(renderchunk4);
            renderchunk4.func_188282_m();
            this.mc.field_71424_I.func_76319_b();
        }
        this.chunksToUpdate.addAll(set);
        this.mc.field_71424_I.func_76319_b();
    }

    private Set<EnumFacing> getVisibleFacings(BlockPos pos) {
        VisGraph visgraph = new VisGraph();
        BlockPos blockpos = new BlockPos(pos.func_177958_n() >> 4 << 4, pos.func_177956_o() >> 4 << 4, pos.func_177952_p() >> 4 << 4);
        Chunk chunk = this.world.func_175726_f(blockpos);
        for (BlockPos.MutableBlockPos blockpos$mutableblockpos : BlockPos.func_177975_b((BlockPos)blockpos, (BlockPos)blockpos.func_177982_a(15, 15, 15))) {
            if (!chunk.func_177435_g((BlockPos)blockpos$mutableblockpos).func_185914_p()) continue;
            visgraph.func_178606_a((BlockPos)blockpos$mutableblockpos);
        }
        return visgraph.func_178609_b(pos);
    }

    @Nullable
    private RenderChunk getRenderChunkOffset(BlockPos playerPos, RenderChunk renderChunkBase, EnumFacing facing) {
        BlockPos blockpos = renderChunkBase.func_181701_a(facing);
        if (MathHelper.func_76130_a((int)(playerPos.func_177958_n() - blockpos.func_177958_n())) > this.renderDistanceChunks * 16) {
            return null;
        }
        if (blockpos.func_177956_o() >= 0 && blockpos.func_177956_o() < 256) {
            return MathHelper.func_76130_a((int)(playerPos.func_177952_p() - blockpos.func_177952_p())) > this.renderDistanceChunks * 16 ? null : this.viewFrustum.func_178161_a(blockpos);
        }
        return null;
    }

    private void fixTerrainFrustum(double x, double y, double z) {
        this.debugFixedClippingHelper = new ClippingHelperImpl();
        ((ClippingHelperImpl)this.debugFixedClippingHelper).func_78560_b();
        net.minecraft.client.renderer.Matrix4f matrix4f = new net.minecraft.client.renderer.Matrix4f(this.debugFixedClippingHelper.field_178626_c);
        matrix4f.transpose();
        net.minecraft.client.renderer.Matrix4f matrix4f1 = new net.minecraft.client.renderer.Matrix4f(this.debugFixedClippingHelper.field_178625_b);
        matrix4f1.transpose();
        net.minecraft.client.renderer.Matrix4f matrix4f2 = new net.minecraft.client.renderer.Matrix4f();
        net.minecraft.client.renderer.Matrix4f.mul((Matrix4f)matrix4f1, (Matrix4f)matrix4f, (Matrix4f)matrix4f2);
        matrix4f2.invert();
        this.debugTerrainFrustumPosition.field_181059_a = x;
        this.debugTerrainFrustumPosition.field_181060_b = y;
        this.debugTerrainFrustumPosition.field_181061_c = z;
        this.debugTerrainMatrix[0] = new Vector4f(-1.0f, -1.0f, -1.0f, 1.0f);
        this.debugTerrainMatrix[1] = new Vector4f(1.0f, -1.0f, -1.0f, 1.0f);
        this.debugTerrainMatrix[2] = new Vector4f(1.0f, 1.0f, -1.0f, 1.0f);
        this.debugTerrainMatrix[3] = new Vector4f(-1.0f, 1.0f, -1.0f, 1.0f);
        this.debugTerrainMatrix[4] = new Vector4f(-1.0f, -1.0f, 1.0f, 1.0f);
        this.debugTerrainMatrix[5] = new Vector4f(1.0f, -1.0f, 1.0f, 1.0f);
        this.debugTerrainMatrix[6] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.debugTerrainMatrix[7] = new Vector4f(-1.0f, 1.0f, 1.0f, 1.0f);
        for (int i = 0; i < 8; ++i) {
            net.minecraft.client.renderer.Matrix4f.transform((Matrix4f)matrix4f2, (Vector4f)this.debugTerrainMatrix[i], (Vector4f)this.debugTerrainMatrix[i]);
            this.debugTerrainMatrix[i].x /= this.debugTerrainMatrix[i].w;
            this.debugTerrainMatrix[i].y /= this.debugTerrainMatrix[i].w;
            this.debugTerrainMatrix[i].z /= this.debugTerrainMatrix[i].w;
            this.debugTerrainMatrix[i].w = 1.0f;
        }
    }

    protected Vector3f func_174962_a(Entity entityIn, double partialTicks) {
        float f = (float)((double)entityIn.field_70127_C + (double)(entityIn.field_70125_A - entityIn.field_70127_C) * partialTicks);
        float f1 = (float)((double)entityIn.field_70126_B + (double)(entityIn.field_70177_z - entityIn.field_70126_B) * partialTicks);
        if (Minecraft.func_71410_x().field_71474_y.field_74320_O == 2) {
            f += 180.0f;
        }
        float f2 = MathHelper.func_76134_b((float)(-f1 * ((float)Math.PI / 180) - (float)Math.PI));
        float f3 = MathHelper.func_76126_a((float)(-f1 * ((float)Math.PI / 180) - (float)Math.PI));
        float f4 = -MathHelper.func_76134_b((float)(-f * ((float)Math.PI / 180)));
        float f5 = MathHelper.func_76126_a((float)(-f * ((float)Math.PI / 180)));
        return new Vector3f(f3 * f4, f5, f2 * f4);
    }

    public int func_174977_a(BlockRenderLayer blockLayerIn, double partialTicks, int pass, Entity entityIn) {
        RenderHelper.func_74518_a();
        if (blockLayerIn == BlockRenderLayer.TRANSLUCENT) {
            this.mc.field_71424_I.func_76320_a("translucent_sort");
            double d0 = entityIn.field_70165_t - this.prevRenderSortX;
            double d1 = entityIn.field_70163_u - this.prevRenderSortY;
            double d2 = entityIn.field_70161_v - this.prevRenderSortZ;
            if (d0 * d0 + d1 * d1 + d2 * d2 > 1.0) {
                this.prevRenderSortX = entityIn.field_70165_t;
                this.prevRenderSortY = entityIn.field_70163_u;
                this.prevRenderSortZ = entityIn.field_70161_v;
                int k = 0;
                for (ContainerLocalRenderInformation renderglobal$containerlocalrenderinformation : this.renderInfos) {
                    if (!renderglobal$containerlocalrenderinformation.renderChunk.field_178590_b.func_178492_d(blockLayerIn) || k++ >= 15) continue;
                    this.renderDispatcher.func_178509_c(renderglobal$containerlocalrenderinformation.renderChunk);
                }
            }
            this.mc.field_71424_I.func_76319_b();
        }
        this.mc.field_71424_I.func_76320_a("filterempty");
        int l = 0;
        boolean flag = blockLayerIn == BlockRenderLayer.TRANSLUCENT;
        int i1 = flag ? this.renderInfos.size() - 1 : 0;
        int i = flag ? -1 : this.renderInfos.size();
        int j1 = flag ? -1 : 1;
        for (int j = i1; j != i; j += j1) {
            RenderChunk renderchunk = this.renderInfos.get((int)j).renderChunk;
            if (renderchunk.func_178571_g().func_178491_b(blockLayerIn)) continue;
            ++l;
            this.renderContainer.func_178002_a(renderchunk, blockLayerIn);
        }
        this.mc.field_71424_I.func_76318_c("render_" + blockLayerIn);
        this.renderBlockLayer(blockLayerIn);
        this.mc.field_71424_I.func_76319_b();
        return l;
    }

    private void renderBlockLayer(BlockRenderLayer blockLayerIn) {
        this.mc.field_71460_t.func_180436_i();
        if (OpenGlHelper.func_176075_f()) {
            GlStateManager.func_187410_q((int)32884);
            OpenGlHelper.func_77472_b((int)OpenGlHelper.field_77478_a);
            GlStateManager.func_187410_q((int)32888);
            OpenGlHelper.func_77472_b((int)OpenGlHelper.field_77476_b);
            GlStateManager.func_187410_q((int)32888);
            OpenGlHelper.func_77472_b((int)OpenGlHelper.field_77478_a);
            GlStateManager.func_187410_q((int)32886);
        }
        this.renderContainer.func_178001_a(blockLayerIn);
        if (OpenGlHelper.func_176075_f()) {
            for (VertexFormatElement vertexformatelement : DefaultVertexFormats.field_176600_a.func_177343_g()) {
                VertexFormatElement.EnumUsage vertexformatelement$enumusage = vertexformatelement.func_177375_c();
                int i = vertexformatelement.func_177369_e();
                switch (vertexformatelement$enumusage) {
                    case POSITION: {
                        GlStateManager.func_187429_p((int)32884);
                        break;
                    }
                    case UV: {
                        OpenGlHelper.func_77472_b((int)(OpenGlHelper.field_77478_a + i));
                        GlStateManager.func_187429_p((int)32888);
                        OpenGlHelper.func_77472_b((int)OpenGlHelper.field_77478_a);
                        break;
                    }
                    case COLOR: {
                        GlStateManager.func_187429_p((int)32886);
                        GlStateManager.func_179117_G();
                    }
                }
            }
        }
        this.mc.field_71460_t.func_175072_h();
    }

    private void cleanupDamagedBlocks(Iterator<DestroyBlockProgress> iteratorIn) {
        while (iteratorIn.hasNext()) {
            DestroyBlockProgress destroyblockprogress = iteratorIn.next();
            int i = destroyblockprogress.func_82743_f();
            if (this.cloudTickCounter - i <= 400) continue;
            iteratorIn.remove();
        }
    }

    public void func_72734_e() {
        ++this.cloudTickCounter;
        if (this.cloudTickCounter % 20 == 0) {
            this.cleanupDamagedBlocks(this.damagedBlocks.values().iterator());
        }
        if (!this.setLightUpdates.isEmpty() && !this.renderDispatcher.func_188248_h() && this.chunksToUpdate.isEmpty()) {
            Iterator<BlockPos> iterator = this.setLightUpdates.iterator();
            while (iterator.hasNext()) {
                BlockPos blockpos = iterator.next();
                iterator.remove();
                int i = blockpos.func_177958_n();
                int j = blockpos.func_177956_o();
                int k = blockpos.func_177952_p();
                this.markBlocksForUpdate(i - 1, j - 1, k - 1, i + 1, j + 1, k + 1, false);
            }
        }
    }

    private void renderSkyEnd() {
        GlStateManager.func_179106_n();
        GlStateManager.func_179118_c();
        GlStateManager.func_179147_l();
        GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        RenderHelper.func_74518_a();
        GlStateManager.func_179132_a((boolean)false);
        this.renderEngine.func_110577_a(END_SKY_TEXTURES);
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferbuilder = tessellator.func_178180_c();
        for (int i = 0; i < 6; ++i) {
            GlStateManager.func_179094_E();
            if (i == 1) {
                GlStateManager.func_179114_b((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (i == 2) {
                GlStateManager.func_179114_b((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (i == 3) {
                GlStateManager.func_179114_b((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (i == 4) {
                GlStateManager.func_179114_b((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (i == 5) {
                GlStateManager.func_179114_b((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
            bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
            bufferbuilder.func_181662_b(-100.0, -100.0, -100.0).func_187315_a(0.0, 0.0).func_181669_b(40, 40, 40, 255).func_181675_d();
            bufferbuilder.func_181662_b(-100.0, -100.0, 100.0).func_187315_a(0.0, 16.0).func_181669_b(40, 40, 40, 255).func_181675_d();
            bufferbuilder.func_181662_b(100.0, -100.0, 100.0).func_187315_a(16.0, 16.0).func_181669_b(40, 40, 40, 255).func_181675_d();
            bufferbuilder.func_181662_b(100.0, -100.0, -100.0).func_187315_a(16.0, 0.0).func_181669_b(40, 40, 40, 255).func_181675_d();
            tessellator.func_78381_a();
            GlStateManager.func_179121_F();
        }
        GlStateManager.func_179132_a((boolean)true);
        GlStateManager.func_179098_w();
        GlStateManager.func_179141_d();
    }

    public void func_174976_a(float partialTicks, int pass) {
        IRenderHandler renderer = this.world.field_73011_w.getSkyRenderer();
        if (renderer != null) {
            renderer.render(partialTicks, this.world, this.mc);
            return;
        }
        if (this.mc.field_71441_e.field_73011_w.func_186058_p().func_186068_a() == 1) {
            this.renderSkyEnd();
        } else if (this.mc.field_71441_e.field_73011_w.func_76569_d()) {
            GlStateManager.func_179090_x();
            Vec3d vec3d = this.world.func_72833_a(this.mc.func_175606_aa(), partialTicks);
            float f = (float)vec3d.field_72450_a;
            float f1 = (float)vec3d.field_72448_b;
            float f2 = (float)vec3d.field_72449_c;
            if (pass != 2) {
                float f3 = (f * 30.0f + f1 * 59.0f + f2 * 11.0f) / 100.0f;
                float f4 = (f * 30.0f + f1 * 70.0f) / 100.0f;
                float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
                f = f3;
                f1 = f4;
                f2 = f5;
            }
            GlStateManager.func_179124_c((float)f, (float)f1, (float)f2);
            Tessellator tessellator = Tessellator.func_178181_a();
            BufferBuilder bufferbuilder = tessellator.func_178180_c();
            GlStateManager.func_179132_a((boolean)false);
            GlStateManager.func_179127_m();
            GlStateManager.func_179124_c((float)f, (float)f1, (float)f2);
            if (this.vboEnabled) {
                this.skyVBO.func_177359_a();
                GlStateManager.func_187410_q((int)32884);
                GlStateManager.func_187420_d((int)3, (int)5126, (int)12, (int)0);
                this.skyVBO.func_177358_a(7);
                this.skyVBO.func_177361_b();
                GlStateManager.func_187429_p((int)32884);
            } else {
                GlStateManager.func_179148_o((int)this.glSkyList);
            }
            GlStateManager.func_179106_n();
            GlStateManager.func_179118_c();
            GlStateManager.func_179147_l();
            GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            RenderHelper.func_74518_a();
            float[] afloat = this.world.field_73011_w.func_76560_a(this.world.func_72826_c(partialTicks), partialTicks);
            if (afloat != null) {
                GlStateManager.func_179090_x();
                GlStateManager.func_179103_j((int)7425);
                GlStateManager.func_179094_E();
                GlStateManager.func_179114_b((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)(MathHelper.func_76126_a((float)this.world.func_72929_e(partialTicks)) < 0.0f ? 180.0f : 0.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                GlStateManager.func_179114_b((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                float f6 = afloat[0];
                float f7 = afloat[1];
                float f8 = afloat[2];
                if (pass != 2) {
                    float f9 = (f6 * 30.0f + f7 * 59.0f + f8 * 11.0f) / 100.0f;
                    float f10 = (f6 * 30.0f + f7 * 70.0f) / 100.0f;
                    float f11 = (f6 * 30.0f + f8 * 70.0f) / 100.0f;
                    f6 = f9;
                    f7 = f10;
                    f8 = f11;
                }
                bufferbuilder.func_181668_a(6, DefaultVertexFormats.field_181706_f);
                bufferbuilder.func_181662_b(0.0, 100.0, 0.0).func_181666_a(f6, f7, f8, afloat[3]).func_181675_d();
                int j = 16;
                for (int l = 0; l <= 16; ++l) {
                    float f21 = (float)l * ((float)Math.PI * 2) / 16.0f;
                    float f12 = MathHelper.func_76126_a((float)f21);
                    float f13 = MathHelper.func_76134_b((float)f21);
                    bufferbuilder.func_181662_b((double)(f12 * 120.0f), (double)(f13 * 120.0f), (double)(-f13 * 40.0f * afloat[3])).func_181666_a(afloat[0], afloat[1], afloat[2], 0.0f).func_181675_d();
                }
                tessellator.func_78381_a();
                GlStateManager.func_179121_F();
                GlStateManager.func_179103_j((int)7424);
            }
            GlStateManager.func_179098_w();
            GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            GlStateManager.func_179094_E();
            float f16 = 1.0f - this.world.func_72867_j(partialTicks);
            GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)f16);
            GlStateManager.func_179114_b((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)(this.world.func_72826_c(partialTicks) * 360.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            float f17 = 30.0f;
            this.renderEngine.func_110577_a(SUN_TEXTURES);
            bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181707_g);
            bufferbuilder.func_181662_b((double)(-f17), 100.0, (double)(-f17)).func_187315_a(0.0, 0.0).func_181675_d();
            bufferbuilder.func_181662_b((double)f17, 100.0, (double)(-f17)).func_187315_a(1.0, 0.0).func_181675_d();
            bufferbuilder.func_181662_b((double)f17, 100.0, (double)f17).func_187315_a(1.0, 1.0).func_181675_d();
            bufferbuilder.func_181662_b((double)(-f17), 100.0, (double)f17).func_187315_a(0.0, 1.0).func_181675_d();
            tessellator.func_78381_a();
            f17 = 20.0f;
            this.renderEngine.func_110577_a(MOON_PHASES_TEXTURES);
            int i = this.world.func_72853_d();
            int k = i % 4;
            int i1 = i / 4 % 2;
            float f22 = (float)(k + 0) / 4.0f;
            float f23 = (float)(i1 + 0) / 2.0f;
            float f24 = (float)(k + 1) / 4.0f;
            float f14 = (float)(i1 + 1) / 2.0f;
            bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181707_g);
            bufferbuilder.func_181662_b((double)(-f17), -100.0, (double)f17).func_187315_a((double)f24, (double)f14).func_181675_d();
            bufferbuilder.func_181662_b((double)f17, -100.0, (double)f17).func_187315_a((double)f22, (double)f14).func_181675_d();
            bufferbuilder.func_181662_b((double)f17, -100.0, (double)(-f17)).func_187315_a((double)f22, (double)f23).func_181675_d();
            bufferbuilder.func_181662_b((double)(-f17), -100.0, (double)(-f17)).func_187315_a((double)f24, (double)f23).func_181675_d();
            tessellator.func_78381_a();
            GlStateManager.func_179090_x();
            float f15 = this.world.func_72880_h(partialTicks) * f16;
            if (f15 > 0.0f) {
                GlStateManager.func_179131_c((float)f15, (float)f15, (float)f15, (float)f15);
                if (this.vboEnabled) {
                    this.starVBO.func_177359_a();
                    GlStateManager.func_187410_q((int)32884);
                    GlStateManager.func_187420_d((int)3, (int)5126, (int)12, (int)0);
                    this.starVBO.func_177358_a(7);
                    this.starVBO.func_177361_b();
                    GlStateManager.func_187429_p((int)32884);
                } else {
                    GlStateManager.func_179148_o((int)this.starGLCallList);
                }
            }
            GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GlStateManager.func_179084_k();
            GlStateManager.func_179141_d();
            GlStateManager.func_179127_m();
            GlStateManager.func_179121_F();
            GlStateManager.func_179090_x();
            GlStateManager.func_179124_c((float)0.0f, (float)0.0f, (float)0.0f);
            double d0 = this.mc.field_71439_g.func_174824_e((float)partialTicks).field_72448_b - this.world.func_72919_O();
            if (d0 < 0.0) {
                GlStateManager.func_179094_E();
                GlStateManager.func_179109_b((float)0.0f, (float)12.0f, (float)0.0f);
                if (this.vboEnabled) {
                    this.sky2VBO.func_177359_a();
                    GlStateManager.func_187410_q((int)32884);
                    GlStateManager.func_187420_d((int)3, (int)5126, (int)12, (int)0);
                    this.sky2VBO.func_177358_a(7);
                    this.sky2VBO.func_177361_b();
                    GlStateManager.func_187429_p((int)32884);
                } else {
                    GlStateManager.func_179148_o((int)this.glSkyList2);
                }
                GlStateManager.func_179121_F();
                float f18 = 1.0f;
                float f19 = -((float)(d0 + 65.0));
                float f20 = -1.0f;
                bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181706_f);
                bufferbuilder.func_181662_b(-1.0, (double)f19, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(1.0, (double)f19, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(1.0, -1.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(-1.0, -1.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(-1.0, -1.0, -1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(1.0, -1.0, -1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(1.0, (double)f19, -1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(-1.0, (double)f19, -1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(1.0, -1.0, -1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(1.0, -1.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(1.0, (double)f19, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(1.0, (double)f19, -1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(-1.0, (double)f19, -1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(-1.0, (double)f19, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(-1.0, -1.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(-1.0, -1.0, -1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(-1.0, -1.0, -1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(-1.0, -1.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(1.0, -1.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b(1.0, -1.0, -1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                tessellator.func_78381_a();
            }
            if (this.world.field_73011_w.func_76561_g()) {
                GlStateManager.func_179124_c((float)(f * 0.2f + 0.04f), (float)(f1 * 0.2f + 0.04f), (float)(f2 * 0.6f + 0.1f));
            } else {
                GlStateManager.func_179124_c((float)f, (float)f1, (float)f2);
            }
            GlStateManager.func_179094_E();
            GlStateManager.func_179109_b((float)0.0f, (float)(-((float)(d0 - 16.0))), (float)0.0f);
            GlStateManager.func_179148_o((int)this.glSkyList2);
            GlStateManager.func_179121_F();
            GlStateManager.func_179098_w();
            GlStateManager.func_179132_a((boolean)true);
        }
    }

    public void func_180447_b(float partialTicks, int pass, double p_180447_3_, double p_180447_5_, double p_180447_7_) {
        IRenderHandler renderer = this.mc.field_71441_e.field_73011_w.getCloudRenderer();
        if (renderer != null) {
            renderer.render(partialTicks, this.mc.field_71441_e, this.mc);
            return;
        }
        if (this.mc.field_71441_e.field_73011_w.func_76569_d()) {
            if (this.mc.field_71474_y.func_181147_e() == 2) {
                this.renderCloudsFancy(partialTicks, pass, p_180447_3_, p_180447_5_, p_180447_7_);
            } else {
                GlStateManager.func_179129_p();
                int i = 32;
                int j = 8;
                Tessellator tessellator = Tessellator.func_178181_a();
                BufferBuilder bufferbuilder = tessellator.func_178180_c();
                this.renderEngine.func_110577_a(CLOUDS_TEXTURES);
                GlStateManager.func_179147_l();
                GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
                Vec3d vec3d = this.world.func_72824_f(partialTicks);
                float f = (float)vec3d.field_72450_a;
                float f1 = (float)vec3d.field_72448_b;
                float f2 = (float)vec3d.field_72449_c;
                if (pass != 2) {
                    float f3 = (f * 30.0f + f1 * 59.0f + f2 * 11.0f) / 100.0f;
                    float f4 = (f * 30.0f + f1 * 70.0f) / 100.0f;
                    float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
                    f = f3;
                    f1 = f4;
                    f2 = f5;
                }
                float f9 = 4.8828125E-4f;
                double d2 = (float)this.cloudTickCounter + partialTicks;
                double d0 = p_180447_3_ + d2 * (double)0.03f;
                int k = MathHelper.func_76128_c((double)(d0 / 2048.0));
                int l = MathHelper.func_76128_c((double)(p_180447_7_ / 2048.0));
                double lvt_22_1_ = p_180447_7_ - (double)(l * 2048);
                float f6 = this.world.field_73011_w.func_76571_f() - (float)p_180447_5_ + 0.33f;
                float f7 = (float)((d0 -= (double)(k * 2048)) * 4.8828125E-4);
                float f8 = (float)(lvt_22_1_ * 4.8828125E-4);
                bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
                for (int i1 = -256; i1 < 256; i1 += 32) {
                    for (int j1 = -256; j1 < 256; j1 += 32) {
                        bufferbuilder.func_181662_b((double)(i1 + 0), (double)f6, (double)(j1 + 32)).func_187315_a((double)((float)(i1 + 0) * 4.8828125E-4f + f7), (double)((float)(j1 + 32) * 4.8828125E-4f + f8)).func_181666_a(f, f1, f2, 0.8f).func_181675_d();
                        bufferbuilder.func_181662_b((double)(i1 + 32), (double)f6, (double)(j1 + 32)).func_187315_a((double)((float)(i1 + 32) * 4.8828125E-4f + f7), (double)((float)(j1 + 32) * 4.8828125E-4f + f8)).func_181666_a(f, f1, f2, 0.8f).func_181675_d();
                        bufferbuilder.func_181662_b((double)(i1 + 32), (double)f6, (double)(j1 + 0)).func_187315_a((double)((float)(i1 + 32) * 4.8828125E-4f + f7), (double)((float)(j1 + 0) * 4.8828125E-4f + f8)).func_181666_a(f, f1, f2, 0.8f).func_181675_d();
                        bufferbuilder.func_181662_b((double)(i1 + 0), (double)f6, (double)(j1 + 0)).func_187315_a((double)((float)(i1 + 0) * 4.8828125E-4f + f7), (double)((float)(j1 + 0) * 4.8828125E-4f + f8)).func_181666_a(f, f1, f2, 0.8f).func_181675_d();
                    }
                }
                tessellator.func_78381_a();
                GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GlStateManager.func_179084_k();
                GlStateManager.func_179089_o();
            }
        }
    }

    public boolean func_72721_a(double x, double y, double z, float partialTicks) {
        return false;
    }

    private void renderCloudsFancy(float partialTicks, int pass, double x, double y, double z) {
        GlStateManager.func_179129_p();
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferbuilder = tessellator.func_178180_c();
        float f = 12.0f;
        float f1 = 4.0f;
        double d0 = (float)this.cloudTickCounter + partialTicks;
        double d1 = (x + d0 * (double)0.03f) / 12.0;
        double d2 = z / 12.0 + (double)0.33f;
        float f2 = this.world.field_73011_w.func_76571_f() - (float)y + 0.33f;
        int i = MathHelper.func_76128_c((double)(d1 / 2048.0));
        int j = MathHelper.func_76128_c((double)(d2 / 2048.0));
        d1 -= (double)(i * 2048);
        d2 -= (double)(j * 2048);
        this.renderEngine.func_110577_a(CLOUDS_TEXTURES);
        GlStateManager.func_179147_l();
        GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        Vec3d vec3d = this.world.func_72824_f(partialTicks);
        float f3 = (float)vec3d.field_72450_a;
        float f4 = (float)vec3d.field_72448_b;
        float f5 = (float)vec3d.field_72449_c;
        if (pass != 2) {
            float f6 = (f3 * 30.0f + f4 * 59.0f + f5 * 11.0f) / 100.0f;
            float f7 = (f3 * 30.0f + f4 * 70.0f) / 100.0f;
            float f8 = (f3 * 30.0f + f5 * 70.0f) / 100.0f;
            f3 = f6;
            f4 = f7;
            f5 = f8;
        }
        float f25 = f3 * 0.9f;
        float f26 = f4 * 0.9f;
        float f27 = f5 * 0.9f;
        float f9 = f3 * 0.7f;
        float f10 = f4 * 0.7f;
        float f11 = f5 * 0.7f;
        float f12 = f3 * 0.8f;
        float f13 = f4 * 0.8f;
        float f14 = f5 * 0.8f;
        float f15 = 0.00390625f;
        float f16 = (float)MathHelper.func_76128_c((double)d1) * 0.00390625f;
        float f17 = (float)MathHelper.func_76128_c((double)d2) * 0.00390625f;
        float f18 = (float)(d1 - (double)MathHelper.func_76128_c((double)d1));
        float f19 = (float)(d2 - (double)MathHelper.func_76128_c((double)d2));
        int k = 8;
        int l = 4;
        float f20 = 9.765625E-4f;
        GlStateManager.func_179152_a((float)12.0f, (float)1.0f, (float)12.0f);
        for (int i1 = 0; i1 < 2; ++i1) {
            if (i1 == 0) {
                GlStateManager.func_179135_a((boolean)false, (boolean)false, (boolean)false, (boolean)false);
            } else {
                switch (pass) {
                    case 0: {
                        GlStateManager.func_179135_a((boolean)false, (boolean)true, (boolean)true, (boolean)true);
                        break;
                    }
                    case 1: {
                        GlStateManager.func_179135_a((boolean)true, (boolean)false, (boolean)false, (boolean)true);
                        break;
                    }
                    case 2: {
                        GlStateManager.func_179135_a((boolean)true, (boolean)true, (boolean)true, (boolean)true);
                    }
                }
            }
            for (int j1 = -3; j1 <= 4; ++j1) {
                for (int k1 = -3; k1 <= 4; ++k1) {
                    bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
                    float f21 = j1 * 8;
                    float f22 = k1 * 8;
                    float f23 = f21 - f18;
                    float f24 = f22 - f19;
                    if (f2 > -5.0f) {
                        bufferbuilder.func_181662_b((double)(f23 + 0.0f), (double)(f2 + 0.0f), (double)(f24 + 8.0f)).func_187315_a((double)((f21 + 0.0f) * 0.00390625f + f16), (double)((f22 + 8.0f) * 0.00390625f + f17)).func_181666_a(f9, f10, f11, 0.8f).func_181663_c(0.0f, -1.0f, 0.0f).func_181675_d();
                        bufferbuilder.func_181662_b((double)(f23 + 8.0f), (double)(f2 + 0.0f), (double)(f24 + 8.0f)).func_187315_a((double)((f21 + 8.0f) * 0.00390625f + f16), (double)((f22 + 8.0f) * 0.00390625f + f17)).func_181666_a(f9, f10, f11, 0.8f).func_181663_c(0.0f, -1.0f, 0.0f).func_181675_d();
                        bufferbuilder.func_181662_b((double)(f23 + 8.0f), (double)(f2 + 0.0f), (double)(f24 + 0.0f)).func_187315_a((double)((f21 + 8.0f) * 0.00390625f + f16), (double)((f22 + 0.0f) * 0.00390625f + f17)).func_181666_a(f9, f10, f11, 0.8f).func_181663_c(0.0f, -1.0f, 0.0f).func_181675_d();
                        bufferbuilder.func_181662_b((double)(f23 + 0.0f), (double)(f2 + 0.0f), (double)(f24 + 0.0f)).func_187315_a((double)((f21 + 0.0f) * 0.00390625f + f16), (double)((f22 + 0.0f) * 0.00390625f + f17)).func_181666_a(f9, f10, f11, 0.8f).func_181663_c(0.0f, -1.0f, 0.0f).func_181675_d();
                    }
                    if (f2 <= 5.0f) {
                        bufferbuilder.func_181662_b((double)(f23 + 0.0f), (double)(f2 + 4.0f - 9.765625E-4f), (double)(f24 + 8.0f)).func_187315_a((double)((f21 + 0.0f) * 0.00390625f + f16), (double)((f22 + 8.0f) * 0.00390625f + f17)).func_181666_a(f3, f4, f5, 0.8f).func_181663_c(0.0f, 1.0f, 0.0f).func_181675_d();
                        bufferbuilder.func_181662_b((double)(f23 + 8.0f), (double)(f2 + 4.0f - 9.765625E-4f), (double)(f24 + 8.0f)).func_187315_a((double)((f21 + 8.0f) * 0.00390625f + f16), (double)((f22 + 8.0f) * 0.00390625f + f17)).func_181666_a(f3, f4, f5, 0.8f).func_181663_c(0.0f, 1.0f, 0.0f).func_181675_d();
                        bufferbuilder.func_181662_b((double)(f23 + 8.0f), (double)(f2 + 4.0f - 9.765625E-4f), (double)(f24 + 0.0f)).func_187315_a((double)((f21 + 8.0f) * 0.00390625f + f16), (double)((f22 + 0.0f) * 0.00390625f + f17)).func_181666_a(f3, f4, f5, 0.8f).func_181663_c(0.0f, 1.0f, 0.0f).func_181675_d();
                        bufferbuilder.func_181662_b((double)(f23 + 0.0f), (double)(f2 + 4.0f - 9.765625E-4f), (double)(f24 + 0.0f)).func_187315_a((double)((f21 + 0.0f) * 0.00390625f + f16), (double)((f22 + 0.0f) * 0.00390625f + f17)).func_181666_a(f3, f4, f5, 0.8f).func_181663_c(0.0f, 1.0f, 0.0f).func_181675_d();
                    }
                    if (j1 > -1) {
                        for (int l1 = 0; l1 < 8; ++l1) {
                            bufferbuilder.func_181662_b((double)(f23 + (float)l1 + 0.0f), (double)(f2 + 0.0f), (double)(f24 + 8.0f)).func_187315_a((double)((f21 + (float)l1 + 0.5f) * 0.00390625f + f16), (double)((f22 + 8.0f) * 0.00390625f + f17)).func_181666_a(f25, f26, f27, 0.8f).func_181663_c(-1.0f, 0.0f, 0.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + (float)l1 + 0.0f), (double)(f2 + 4.0f), (double)(f24 + 8.0f)).func_187315_a((double)((f21 + (float)l1 + 0.5f) * 0.00390625f + f16), (double)((f22 + 8.0f) * 0.00390625f + f17)).func_181666_a(f25, f26, f27, 0.8f).func_181663_c(-1.0f, 0.0f, 0.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + (float)l1 + 0.0f), (double)(f2 + 4.0f), (double)(f24 + 0.0f)).func_187315_a((double)((f21 + (float)l1 + 0.5f) * 0.00390625f + f16), (double)((f22 + 0.0f) * 0.00390625f + f17)).func_181666_a(f25, f26, f27, 0.8f).func_181663_c(-1.0f, 0.0f, 0.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + (float)l1 + 0.0f), (double)(f2 + 0.0f), (double)(f24 + 0.0f)).func_187315_a((double)((f21 + (float)l1 + 0.5f) * 0.00390625f + f16), (double)((f22 + 0.0f) * 0.00390625f + f17)).func_181666_a(f25, f26, f27, 0.8f).func_181663_c(-1.0f, 0.0f, 0.0f).func_181675_d();
                        }
                    }
                    if (j1 <= 1) {
                        for (int i2 = 0; i2 < 8; ++i2) {
                            bufferbuilder.func_181662_b((double)(f23 + (float)i2 + 1.0f - 9.765625E-4f), (double)(f2 + 0.0f), (double)(f24 + 8.0f)).func_187315_a((double)((f21 + (float)i2 + 0.5f) * 0.00390625f + f16), (double)((f22 + 8.0f) * 0.00390625f + f17)).func_181666_a(f25, f26, f27, 0.8f).func_181663_c(1.0f, 0.0f, 0.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + (float)i2 + 1.0f - 9.765625E-4f), (double)(f2 + 4.0f), (double)(f24 + 8.0f)).func_187315_a((double)((f21 + (float)i2 + 0.5f) * 0.00390625f + f16), (double)((f22 + 8.0f) * 0.00390625f + f17)).func_181666_a(f25, f26, f27, 0.8f).func_181663_c(1.0f, 0.0f, 0.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + (float)i2 + 1.0f - 9.765625E-4f), (double)(f2 + 4.0f), (double)(f24 + 0.0f)).func_187315_a((double)((f21 + (float)i2 + 0.5f) * 0.00390625f + f16), (double)((f22 + 0.0f) * 0.00390625f + f17)).func_181666_a(f25, f26, f27, 0.8f).func_181663_c(1.0f, 0.0f, 0.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + (float)i2 + 1.0f - 9.765625E-4f), (double)(f2 + 0.0f), (double)(f24 + 0.0f)).func_187315_a((double)((f21 + (float)i2 + 0.5f) * 0.00390625f + f16), (double)((f22 + 0.0f) * 0.00390625f + f17)).func_181666_a(f25, f26, f27, 0.8f).func_181663_c(1.0f, 0.0f, 0.0f).func_181675_d();
                        }
                    }
                    if (k1 > -1) {
                        for (int j2 = 0; j2 < 8; ++j2) {
                            bufferbuilder.func_181662_b((double)(f23 + 0.0f), (double)(f2 + 4.0f), (double)(f24 + (float)j2 + 0.0f)).func_187315_a((double)((f21 + 0.0f) * 0.00390625f + f16), (double)((f22 + (float)j2 + 0.5f) * 0.00390625f + f17)).func_181666_a(f12, f13, f14, 0.8f).func_181663_c(0.0f, 0.0f, -1.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + 8.0f), (double)(f2 + 4.0f), (double)(f24 + (float)j2 + 0.0f)).func_187315_a((double)((f21 + 8.0f) * 0.00390625f + f16), (double)((f22 + (float)j2 + 0.5f) * 0.00390625f + f17)).func_181666_a(f12, f13, f14, 0.8f).func_181663_c(0.0f, 0.0f, -1.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + 8.0f), (double)(f2 + 0.0f), (double)(f24 + (float)j2 + 0.0f)).func_187315_a((double)((f21 + 8.0f) * 0.00390625f + f16), (double)((f22 + (float)j2 + 0.5f) * 0.00390625f + f17)).func_181666_a(f12, f13, f14, 0.8f).func_181663_c(0.0f, 0.0f, -1.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + 0.0f), (double)(f2 + 0.0f), (double)(f24 + (float)j2 + 0.0f)).func_187315_a((double)((f21 + 0.0f) * 0.00390625f + f16), (double)((f22 + (float)j2 + 0.5f) * 0.00390625f + f17)).func_181666_a(f12, f13, f14, 0.8f).func_181663_c(0.0f, 0.0f, -1.0f).func_181675_d();
                        }
                    }
                    if (k1 <= 1) {
                        for (int k2 = 0; k2 < 8; ++k2) {
                            bufferbuilder.func_181662_b((double)(f23 + 0.0f), (double)(f2 + 4.0f), (double)(f24 + (float)k2 + 1.0f - 9.765625E-4f)).func_187315_a((double)((f21 + 0.0f) * 0.00390625f + f16), (double)((f22 + (float)k2 + 0.5f) * 0.00390625f + f17)).func_181666_a(f12, f13, f14, 0.8f).func_181663_c(0.0f, 0.0f, 1.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + 8.0f), (double)(f2 + 4.0f), (double)(f24 + (float)k2 + 1.0f - 9.765625E-4f)).func_187315_a((double)((f21 + 8.0f) * 0.00390625f + f16), (double)((f22 + (float)k2 + 0.5f) * 0.00390625f + f17)).func_181666_a(f12, f13, f14, 0.8f).func_181663_c(0.0f, 0.0f, 1.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + 8.0f), (double)(f2 + 0.0f), (double)(f24 + (float)k2 + 1.0f - 9.765625E-4f)).func_187315_a((double)((f21 + 8.0f) * 0.00390625f + f16), (double)((f22 + (float)k2 + 0.5f) * 0.00390625f + f17)).func_181666_a(f12, f13, f14, 0.8f).func_181663_c(0.0f, 0.0f, 1.0f).func_181675_d();
                            bufferbuilder.func_181662_b((double)(f23 + 0.0f), (double)(f2 + 0.0f), (double)(f24 + (float)k2 + 1.0f - 9.765625E-4f)).func_187315_a((double)((f21 + 0.0f) * 0.00390625f + f16), (double)((f22 + (float)k2 + 0.5f) * 0.00390625f + f17)).func_181666_a(f12, f13, f14, 0.8f).func_181663_c(0.0f, 0.0f, 1.0f).func_181675_d();
                        }
                    }
                    tessellator.func_78381_a();
                }
            }
        }
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.func_179084_k();
        GlStateManager.func_179089_o();
    }

    public void func_174967_a(long finishTimeNano) {
        this.displayListEntitiesDirty |= this.renderDispatcher.func_178516_a(finishTimeNano);
        if (!this.chunksToUpdate.isEmpty()) {
            RenderChunk renderchunk;
            boolean flag;
            Iterator<RenderChunk> iterator = this.chunksToUpdate.iterator();
            while (iterator.hasNext() && (flag = (renderchunk = iterator.next()).func_188281_o() ? this.renderDispatcher.func_178505_b(renderchunk) : this.renderDispatcher.func_178507_a(renderchunk))) {
                renderchunk.func_188282_m();
                iterator.remove();
                long i = finishTimeNano - System.nanoTime();
                if (i >= 0L) continue;
                break;
            }
        }
    }

    public void func_180449_a(Entity entityIn, float partialTicks) {
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferbuilder = tessellator.func_178180_c();
        WorldBorder worldborder = this.world.func_175723_af();
        double d0 = this.mc.field_71474_y.field_151451_c * 16;
        if (entityIn.field_70165_t >= worldborder.func_177728_d() - d0 || entityIn.field_70165_t <= worldborder.func_177726_b() + d0 || entityIn.field_70161_v >= worldborder.func_177733_e() - d0 || entityIn.field_70161_v <= worldborder.func_177736_c() + d0) {
            double d1 = 1.0 - worldborder.func_177745_a(entityIn) / d0;
            d1 = Math.pow(d1, 4.0);
            double d2 = entityIn.field_70142_S + (entityIn.field_70165_t - entityIn.field_70142_S) * (double)partialTicks;
            double d3 = entityIn.field_70137_T + (entityIn.field_70163_u - entityIn.field_70137_T) * (double)partialTicks;
            double d4 = entityIn.field_70136_U + (entityIn.field_70161_v - entityIn.field_70136_U) * (double)partialTicks;
            GlStateManager.func_179147_l();
            GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            this.renderEngine.func_110577_a(FORCEFIELD_TEXTURES);
            GlStateManager.func_179132_a((boolean)false);
            GlStateManager.func_179094_E();
            int i = worldborder.func_177734_a().func_177766_a();
            float f = (float)(i >> 16 & 0xFF) / 255.0f;
            float f1 = (float)(i >> 8 & 0xFF) / 255.0f;
            float f2 = (float)(i & 0xFF) / 255.0f;
            GlStateManager.func_179131_c((float)f, (float)f1, (float)f2, (float)((float)d1));
            GlStateManager.func_179136_a((float)-3.0f, (float)-3.0f);
            GlStateManager.func_179088_q();
            GlStateManager.func_179092_a((int)516, (float)0.1f);
            GlStateManager.func_179141_d();
            GlStateManager.func_179129_p();
            float f3 = (float)(Minecraft.func_71386_F() % 3000L) / 3000.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 128.0f;
            bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181707_g);
            bufferbuilder.func_178969_c(-d2, -d3, -d4);
            double d5 = Math.max((double)MathHelper.func_76128_c((double)(d4 - d0)), worldborder.func_177736_c());
            double d6 = Math.min((double)MathHelper.func_76143_f((double)(d4 + d0)), worldborder.func_177733_e());
            if (d2 > worldborder.func_177728_d() - d0) {
                float f7 = 0.0f;
                double d7 = d5;
                while (d7 < d6) {
                    double d8 = Math.min(1.0, d6 - d7);
                    float f8 = (float)d8 * 0.5f;
                    bufferbuilder.func_181662_b(worldborder.func_177728_d(), 256.0, d7).func_187315_a((double)(f3 + f7), (double)(f3 + 0.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(worldborder.func_177728_d(), 256.0, d7 + d8).func_187315_a((double)(f3 + f8 + f7), (double)(f3 + 0.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(worldborder.func_177728_d(), 0.0, d7 + d8).func_187315_a((double)(f3 + f8 + f7), (double)(f3 + 128.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(worldborder.func_177728_d(), 0.0, d7).func_187315_a((double)(f3 + f7), (double)(f3 + 128.0f)).func_181675_d();
                    d7 += 1.0;
                    f7 += 0.5f;
                }
            }
            if (d2 < worldborder.func_177726_b() + d0) {
                float f9 = 0.0f;
                double d9 = d5;
                while (d9 < d6) {
                    double d12 = Math.min(1.0, d6 - d9);
                    float f12 = (float)d12 * 0.5f;
                    bufferbuilder.func_181662_b(worldborder.func_177726_b(), 256.0, d9).func_187315_a((double)(f3 + f9), (double)(f3 + 0.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(worldborder.func_177726_b(), 256.0, d9 + d12).func_187315_a((double)(f3 + f12 + f9), (double)(f3 + 0.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(worldborder.func_177726_b(), 0.0, d9 + d12).func_187315_a((double)(f3 + f12 + f9), (double)(f3 + 128.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(worldborder.func_177726_b(), 0.0, d9).func_187315_a((double)(f3 + f9), (double)(f3 + 128.0f)).func_181675_d();
                    d9 += 1.0;
                    f9 += 0.5f;
                }
            }
            d5 = Math.max((double)MathHelper.func_76128_c((double)(d2 - d0)), worldborder.func_177726_b());
            d6 = Math.min((double)MathHelper.func_76143_f((double)(d2 + d0)), worldborder.func_177728_d());
            if (d4 > worldborder.func_177733_e() - d0) {
                float f10 = 0.0f;
                double d10 = d5;
                while (d10 < d6) {
                    double d13 = Math.min(1.0, d6 - d10);
                    float f13 = (float)d13 * 0.5f;
                    bufferbuilder.func_181662_b(d10, 256.0, worldborder.func_177733_e()).func_187315_a((double)(f3 + f10), (double)(f3 + 0.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(d10 + d13, 256.0, worldborder.func_177733_e()).func_187315_a((double)(f3 + f13 + f10), (double)(f3 + 0.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(d10 + d13, 0.0, worldborder.func_177733_e()).func_187315_a((double)(f3 + f13 + f10), (double)(f3 + 128.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(d10, 0.0, worldborder.func_177733_e()).func_187315_a((double)(f3 + f10), (double)(f3 + 128.0f)).func_181675_d();
                    d10 += 1.0;
                    f10 += 0.5f;
                }
            }
            if (d4 < worldborder.func_177736_c() + d0) {
                float f11 = 0.0f;
                double d11 = d5;
                while (d11 < d6) {
                    double d14 = Math.min(1.0, d6 - d11);
                    float f14 = (float)d14 * 0.5f;
                    bufferbuilder.func_181662_b(d11, 256.0, worldborder.func_177736_c()).func_187315_a((double)(f3 + f11), (double)(f3 + 0.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(d11 + d14, 256.0, worldborder.func_177736_c()).func_187315_a((double)(f3 + f14 + f11), (double)(f3 + 0.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(d11 + d14, 0.0, worldborder.func_177736_c()).func_187315_a((double)(f3 + f14 + f11), (double)(f3 + 128.0f)).func_181675_d();
                    bufferbuilder.func_181662_b(d11, 0.0, worldborder.func_177736_c()).func_187315_a((double)(f3 + f11), (double)(f3 + 128.0f)).func_181675_d();
                    d11 += 1.0;
                    f11 += 0.5f;
                }
            }
            tessellator.func_78381_a();
            bufferbuilder.func_178969_c(0.0, 0.0, 0.0);
            GlStateManager.func_179089_o();
            GlStateManager.func_179118_c();
            GlStateManager.func_179136_a((float)0.0f, (float)0.0f);
            GlStateManager.func_179113_r();
            GlStateManager.func_179141_d();
            GlStateManager.func_179084_k();
            GlStateManager.func_179121_F();
            GlStateManager.func_179132_a((boolean)true);
        }
    }

    private void preRenderDamagedBlocks() {
        GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.DST_COLOR, (GlStateManager.DestFactor)GlStateManager.DestFactor.SRC_COLOR, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.func_179147_l();
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)0.5f);
        GlStateManager.func_179136_a((float)-3.0f, (float)-3.0f);
        GlStateManager.func_179088_q();
        GlStateManager.func_179092_a((int)516, (float)0.1f);
        GlStateManager.func_179141_d();
        GlStateManager.func_179094_E();
    }

    private void postRenderDamagedBlocks() {
        GlStateManager.func_179118_c();
        GlStateManager.func_179136_a((float)0.0f, (float)0.0f);
        GlStateManager.func_179113_r();
        GlStateManager.func_179141_d();
        GlStateManager.func_179132_a((boolean)true);
        GlStateManager.func_179121_F();
    }

    public void func_174981_a(Tessellator tessellatorIn, BufferBuilder worldRendererIn, Entity entityIn, float partialTicks) {
        double d0 = entityIn.field_70142_S + (entityIn.field_70165_t - entityIn.field_70142_S) * (double)partialTicks;
        double d1 = entityIn.field_70137_T + (entityIn.field_70163_u - entityIn.field_70137_T) * (double)partialTicks;
        double d2 = entityIn.field_70136_U + (entityIn.field_70161_v - entityIn.field_70136_U) * (double)partialTicks;
        if (!this.damagedBlocks.isEmpty()) {
            this.renderEngine.func_110577_a(TextureMap.field_110575_b);
            this.preRenderDamagedBlocks();
            worldRendererIn.func_181668_a(7, DefaultVertexFormats.field_176600_a);
            worldRendererIn.func_178969_c(-d0, -d1, -d2);
            worldRendererIn.func_78914_f();
            Iterator<DestroyBlockProgress> iterator = this.damagedBlocks.values().iterator();
            while (iterator.hasNext()) {
                boolean hasBreak;
                DestroyBlockProgress destroyblockprogress = iterator.next();
                BlockPos blockpos = destroyblockprogress.func_180246_b();
                double d3 = (double)blockpos.func_177958_n() - d0;
                double d4 = (double)blockpos.func_177956_o() - d1;
                double d5 = (double)blockpos.func_177952_p() - d2;
                Block block = this.world.func_180495_p(blockpos).func_177230_c();
                TileEntity te = this.world.func_175625_s(blockpos);
                boolean bl = hasBreak = block instanceof BlockChest || block instanceof BlockEnderChest || block instanceof BlockSign || block instanceof BlockSkull;
                if (!hasBreak) {
                    boolean bl2 = hasBreak = te != null && te.canRenderBreaking();
                }
                if (hasBreak) continue;
                if (d3 * d3 + d4 * d4 + d5 * d5 > 1024.0) {
                    iterator.remove();
                    continue;
                }
                IBlockState iblockstate = this.world.func_180495_p(blockpos);
                if (iblockstate.func_185904_a() == Material.field_151579_a) continue;
                int i = destroyblockprogress.func_73106_e();
                TextureAtlasSprite textureatlassprite = this.destroyBlockIcons[i];
                BlockRendererDispatcher blockrendererdispatcher = this.mc.func_175602_ab();
                blockrendererdispatcher.func_175020_a(iblockstate, blockpos, textureatlassprite, (IBlockAccess)this.world);
            }
            tessellatorIn.func_78381_a();
            worldRendererIn.func_178969_c(0.0, 0.0, 0.0);
            this.postRenderDamagedBlocks();
        }
    }

    public void func_72731_b(EntityPlayer player, RayTraceResult movingObjectPositionIn, int execute, float partialTicks) {
        if (execute == 0 && movingObjectPositionIn.field_72313_a == RayTraceResult.Type.BLOCK) {
            GlStateManager.func_179147_l();
            GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            GlStateManager.func_187441_d((float)2.0f);
            GlStateManager.func_179090_x();
            GlStateManager.func_179132_a((boolean)false);
            BlockPos blockpos = movingObjectPositionIn.func_178782_a();
            IBlockState iblockstate = this.world.func_180495_p(blockpos);
            if (iblockstate.func_185904_a() != Material.field_151579_a && this.world.func_175723_af().func_177746_a(blockpos)) {
                double d0 = player.field_70142_S + (player.field_70165_t - player.field_70142_S) * (double)partialTicks;
                double d1 = player.field_70137_T + (player.field_70163_u - player.field_70137_T) * (double)partialTicks;
                double d2 = player.field_70136_U + (player.field_70161_v - player.field_70136_U) * (double)partialTicks;
                CompatibleRenderGlobal.drawSelectionBoundingBox(iblockstate.func_185918_c((World)this.world, blockpos).func_186662_g((double)0.002f).func_72317_d(-d0, -d1, -d2), 0.0f, 0.0f, 0.0f, 0.4f);
            }
            GlStateManager.func_179132_a((boolean)true);
            GlStateManager.func_179098_w();
            GlStateManager.func_179084_k();
        }
    }

    public static void drawSelectionBoundingBox(AxisAlignedBB box, float red, float green, float blue, float alpha) {
        CompatibleRenderGlobal.drawBoundingBox(box.field_72340_a, box.field_72338_b, box.field_72339_c, box.field_72336_d, box.field_72337_e, box.field_72334_f, red, green, blue, alpha);
    }

    public static void drawBoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, float red, float green, float blue, float alpha) {
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferbuilder = tessellator.func_178180_c();
        bufferbuilder.func_181668_a(3, DefaultVertexFormats.field_181706_f);
        CompatibleRenderGlobal.drawBoundingBox(bufferbuilder, minX, minY, minZ, maxX, maxY, maxZ, red, green, blue, alpha);
        tessellator.func_78381_a();
    }

    public static void drawBoundingBox(BufferBuilder buffer, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, float red, float green, float blue, float alpha) {
        buffer.func_181662_b(minX, minY, minZ).func_181666_a(red, green, blue, 0.0f).func_181675_d();
        buffer.func_181662_b(minX, minY, minZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(maxX, minY, minZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(maxX, minY, maxZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(minX, minY, maxZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(minX, minY, minZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(minX, maxY, minZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(maxX, maxY, minZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(maxX, maxY, maxZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(minX, maxY, maxZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(minX, maxY, minZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(minX, maxY, maxZ).func_181666_a(red, green, blue, 0.0f).func_181675_d();
        buffer.func_181662_b(minX, minY, maxZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(maxX, maxY, maxZ).func_181666_a(red, green, blue, 0.0f).func_181675_d();
        buffer.func_181662_b(maxX, minY, maxZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(maxX, maxY, minZ).func_181666_a(red, green, blue, 0.0f).func_181675_d();
        buffer.func_181662_b(maxX, minY, minZ).func_181666_a(red, green, blue, alpha).func_181675_d();
        buffer.func_181662_b(maxX, minY, minZ).func_181666_a(red, green, blue, 0.0f).func_181675_d();
    }

    public static void renderFilledBox(AxisAlignedBB p_189696_0_, float p_189696_1_, float p_189696_2_, float p_189696_3_, float p_189696_4_) {
        CompatibleRenderGlobal.renderFilledBox(p_189696_0_.field_72340_a, p_189696_0_.field_72338_b, p_189696_0_.field_72339_c, p_189696_0_.field_72336_d, p_189696_0_.field_72337_e, p_189696_0_.field_72334_f, p_189696_1_, p_189696_2_, p_189696_3_, p_189696_4_);
    }

    public static void renderFilledBox(double p_189695_0_, double p_189695_2_, double p_189695_4_, double p_189695_6_, double p_189695_8_, double p_189695_10_, float p_189695_12_, float p_189695_13_, float p_189695_14_, float p_189695_15_) {
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferbuilder = tessellator.func_178180_c();
        bufferbuilder.func_181668_a(5, DefaultVertexFormats.field_181706_f);
        CompatibleRenderGlobal.addChainedFilledBoxVertices(bufferbuilder, p_189695_0_, p_189695_2_, p_189695_4_, p_189695_6_, p_189695_8_, p_189695_10_, p_189695_12_, p_189695_13_, p_189695_14_, p_189695_15_);
        tessellator.func_78381_a();
    }

    public static void addChainedFilledBoxVertices(BufferBuilder builder, double p_189693_1_, double p_189693_3_, double p_189693_5_, double p_189693_7_, double p_189693_9_, double p_189693_11_, float red, float green, float blue, float alpha) {
        builder.func_181662_b(p_189693_1_, p_189693_3_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_3_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_3_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_3_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_9_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_9_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_9_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_3_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_9_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_3_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_3_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_3_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_9_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_9_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_9_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_3_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_9_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_3_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_3_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_3_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_3_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_3_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_3_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_9_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_9_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_1_, p_189693_9_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_9_, p_189693_5_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_9_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_9_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
        builder.func_181662_b(p_189693_7_, p_189693_9_, p_189693_11_).func_181666_a(red, green, blue, alpha).func_181675_d();
    }

    private void markBlocksForUpdate(int minX, int minY, int minZ, int maxX, int maxY, int maxZ, boolean updateImmediately) {
        this.viewFrustum.func_187474_a(minX, minY, minZ, maxX, maxY, maxZ, updateImmediately);
    }

    public void func_184376_a(World worldIn, BlockPos pos, IBlockState oldState, IBlockState newState, int flags) {
        int i = pos.func_177958_n();
        int j = pos.func_177956_o();
        int k = pos.func_177952_p();
        this.markBlocksForUpdate(i - 1, j - 1, k - 1, i + 1, j + 1, k + 1, (flags & 8) != 0);
    }

    public void func_174959_b(BlockPos pos) {
        this.setLightUpdates.add(pos.func_185334_h());
    }

    public void func_147585_a(int x1, int y1, int z1, int x2, int y2, int z2) {
        this.markBlocksForUpdate(x1 - 1, y1 - 1, z1 - 1, x2 + 1, y2 + 1, z2 + 1, false);
    }

    public void func_184377_a(@Nullable SoundEvent soundIn, BlockPos pos) {
        ISound isound = this.mapSoundPositions.get(pos);
        if (isound != null) {
            this.mc.func_147118_V().func_147683_b(isound);
            this.mapSoundPositions.remove(pos);
        }
        if (soundIn != null) {
            ItemRecord itemrecord = ItemRecord.func_185074_a((SoundEvent)soundIn);
            if (itemrecord != null) {
                this.mc.field_71456_v.func_73833_a(itemrecord.func_150927_i());
            }
            PositionedSoundRecord positionedsoundrecord = PositionedSoundRecord.func_184372_a((SoundEvent)soundIn, (float)pos.func_177958_n(), (float)pos.func_177956_o(), (float)pos.func_177952_p());
            this.mapSoundPositions.put(pos, (ISound)positionedsoundrecord);
            this.mc.func_147118_V().func_147682_a((ISound)positionedsoundrecord);
        }
        this.setPartying((World)this.world, pos, soundIn != null);
    }

    private void setPartying(World p_193054_1_, BlockPos pos, boolean p_193054_3_) {
        for (EntityLivingBase entitylivingbase : p_193054_1_.func_72872_a(EntityLivingBase.class, new AxisAlignedBB(pos).func_186662_g(3.0))) {
            entitylivingbase.func_191987_a(pos, p_193054_3_);
        }
    }

    public void func_184375_a(@Nullable EntityPlayer player, SoundEvent soundIn, SoundCategory category, double x, double y, double z, float volume, float pitch) {
    }

    public void func_180442_a(int particleID, boolean ignoreRange, double xCoord, double yCoord, double zCoord, double xSpeed, double ySpeed, double zSpeed, int ... parameters) {
        this.func_190570_a(particleID, ignoreRange, false, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed, parameters);
    }

    public void func_190570_a(int id, boolean ignoreRange, boolean p_190570_3_, final double x, final double y, final double z, double xSpeed, double ySpeed, double zSpeed, int ... parameters) {
        try {
            this.spawnParticle0(id, ignoreRange, p_190570_3_, x, y, z, xSpeed, ySpeed, zSpeed, parameters);
        }
        catch (Throwable throwable) {
            CrashReport crashreport = CrashReport.func_85055_a((Throwable)throwable, (String)"Exception while adding particle");
            CrashReportCategory crashreportcategory = crashreport.func_85058_a("Particle being added");
            crashreportcategory.func_71507_a("ID", (Object)id);
            if (parameters != null) {
                crashreportcategory.func_71507_a("Parameters", (Object)parameters);
            }
            crashreportcategory.func_189529_a("Position", (ICrashReportDetail)new ICrashReportDetail<String>(){

                public String call() throws Exception {
                    return CrashReportCategory.func_85074_a((double)x, (double)y, (double)z);
                }
            });
            throw new ReportedException(crashreport);
        }
    }

    private void spawnParticle(EnumParticleTypes particleIn, double xCoord, double yCoord, double zCoord, double xSpeed, double ySpeed, double zSpeed, int ... parameters) {
        this.func_180442_a(particleIn.func_179348_c(), particleIn.func_179344_e(), xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed, parameters);
    }

    @Nullable
    private Particle spawnEntityFX(int particleID, boolean ignoreRange, double xCoord, double yCoord, double zCoord, double xSpeed, double ySpeed, double zSpeed, int ... parameters) {
        return this.spawnParticle0(particleID, ignoreRange, false, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed, parameters);
    }

    @Nullable
    private Particle spawnParticle0(int particleID, boolean ignoreRange, boolean minParticles, double xCoord, double yCoord, double zCoord, double xSpeed, double ySpeed, double zSpeed, int ... parameters) {
        Entity entity = this.mc.func_175606_aa();
        if (this.mc != null && entity != null && this.mc.field_71452_i != null) {
            int i = this.calculateParticleLevel(minParticles);
            double d0 = entity.field_70165_t - xCoord;
            double d1 = entity.field_70163_u - yCoord;
            double d2 = entity.field_70161_v - zCoord;
            if (ignoreRange) {
                return this.mc.field_71452_i.func_178927_a(particleID, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed, parameters);
            }
            if (d0 * d0 + d1 * d1 + d2 * d2 > 1024.0) {
                return null;
            }
            return i > 1 ? null : this.mc.field_71452_i.func_178927_a(particleID, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed, parameters);
        }
        return null;
    }

    private int calculateParticleLevel(boolean p_190572_1_) {
        int i = this.mc.field_71474_y.field_74362_aa;
        if (p_190572_1_ && i == 2 && this.world.field_73012_v.nextInt(10) == 0) {
            i = 1;
        }
        if (i == 1 && this.world.field_73012_v.nextInt(3) == 0) {
            i = 2;
        }
        return i;
    }

    public void func_72703_a(Entity entityIn) {
    }

    public void func_72709_b(Entity entityIn) {
    }

    public void func_72728_f() {
    }

    public void func_180440_a(int soundID, BlockPos pos, int data) {
        switch (soundID) {
            case 1023: 
            case 1028: 
            case 1038: {
                Entity entity = this.mc.func_175606_aa();
                if (entity == null) break;
                double d0 = (double)pos.func_177958_n() - entity.field_70165_t;
                double d1 = (double)pos.func_177956_o() - entity.field_70163_u;
                double d2 = (double)pos.func_177952_p() - entity.field_70161_v;
                double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                double d4 = entity.field_70165_t;
                double d5 = entity.field_70163_u;
                double d6 = entity.field_70161_v;
                if (d3 > 0.0) {
                    d4 += d0 / d3 * 2.0;
                    d5 += d1 / d3 * 2.0;
                    d6 += d2 / d3 * 2.0;
                }
                if (soundID == 1023) {
                    this.world.func_184134_a(d4, d5, d6, SoundEvents.field_187855_gD, SoundCategory.HOSTILE, 1.0f, 1.0f, false);
                    break;
                }
                if (soundID == 1038) {
                    this.world.func_184134_a(d4, d5, d6, SoundEvents.field_193782_bq, SoundCategory.HOSTILE, 1.0f, 1.0f, false);
                    break;
                }
                this.world.func_184134_a(d4, d5, d6, SoundEvents.field_187522_aL, SoundCategory.HOSTILE, 5.0f, 1.0f, false);
            }
        }
    }

    public void func_180439_a(EntityPlayer player, int type, BlockPos blockPosIn, int data) {
        Random random = this.world.field_73012_v;
        switch (type) {
            case 1000: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187574_as, SoundCategory.BLOCKS, 1.0f, 1.0f, false);
                break;
            }
            case 1001: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187576_at, SoundCategory.BLOCKS, 1.0f, 1.2f, false);
                break;
            }
            case 1002: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187578_au, SoundCategory.BLOCKS, 1.0f, 1.2f, false);
                break;
            }
            case 1003: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187528_aR, SoundCategory.NEUTRAL, 1.0f, 1.2f, false);
                break;
            }
            case 1004: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187634_bp, SoundCategory.NEUTRAL, 1.0f, 1.2f, false);
                break;
            }
            case 1005: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187611_cI, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1006: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187875_gN, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1007: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187879_gP, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1008: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187613_bi, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1009: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187646_bt, SoundCategory.BLOCKS, 0.5f, 2.6f + (random.nextFloat() - random.nextFloat()) * 0.8f, false);
                break;
            }
            case 1010: {
                if (Item.func_150899_d((int)data) instanceof ItemRecord) {
                    this.world.func_184149_a(blockPosIn, ((ItemRecord)Item.func_150899_d((int)data)).func_185075_h());
                    break;
                }
                this.world.func_184149_a(blockPosIn, (SoundEvent)null);
                break;
            }
            case 1011: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187608_cH, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1012: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187873_gM, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1013: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187877_gO, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1014: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187610_bh, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1015: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187559_bL, SoundCategory.HOSTILE, 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187557_bK, SoundCategory.HOSTILE, 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187527_aQ, SoundCategory.HOSTILE, 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1018: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187606_E, SoundCategory.HOSTILE, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1019: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187927_ha, SoundCategory.HOSTILE, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1020: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187928_hb, SoundCategory.HOSTILE, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1021: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187929_hc, SoundCategory.HOSTILE, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1022: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187926_gz, SoundCategory.HOSTILE, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1024: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187853_gC, SoundCategory.HOSTILE, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1025: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187744_z, SoundCategory.NEUTRAL, 0.05f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1026: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187945_hs, SoundCategory.HOSTILE, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1027: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187941_ho, SoundCategory.NEUTRAL, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1029: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187680_c, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1030: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187698_i, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1031: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187689_f, SoundCategory.BLOCKS, 0.3f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1032: {
                this.mc.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a((SoundEvent)SoundEvents.field_187812_eh, (float)(random.nextFloat() * 0.4f + 0.8f)));
                break;
            }
            case 1033: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187542_ac, SoundCategory.BLOCKS, 1.0f, 1.0f, false);
                break;
            }
            case 1034: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187540_ab, SoundCategory.BLOCKS, 1.0f, 1.0f, false);
                break;
            }
            case 1035: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187621_J, SoundCategory.BLOCKS, 1.0f, 1.0f, false);
                break;
            }
            case 1036: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187614_cJ, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1037: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187617_cK, SoundCategory.BLOCKS, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2000: {
                int l = data % 3 - 1;
                int i = data / 3 % 3 - 1;
                double d8 = (double)blockPosIn.func_177958_n() + (double)l * 0.6 + 0.5;
                double d10 = (double)blockPosIn.func_177956_o() + 0.5;
                double d12 = (double)blockPosIn.func_177952_p() + (double)i * 0.6 + 0.5;
                for (int j1 = 0; j1 < 10; ++j1) {
                    double d13 = random.nextDouble() * 0.2 + 0.01;
                    double d16 = d8 + (double)l * 0.01 + (random.nextDouble() - 0.5) * (double)i * 0.5;
                    double d19 = d10 + (random.nextDouble() - 0.5) * 0.5;
                    double d22 = d12 + (double)i * 0.01 + (random.nextDouble() - 0.5) * (double)l * 0.5;
                    double d24 = (double)l * d13 + random.nextGaussian() * 0.01;
                    double d26 = -0.03 + random.nextGaussian() * 0.01;
                    double d27 = (double)i * d13 + random.nextGaussian() * 0.01;
                    this.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d16, d19, d22, d24, d26, d27, new int[0]);
                }
                return;
            }
            case 2001: {
                Block block = Block.func_149729_e((int)(data & 0xFFF));
                if (block.func_176223_P().func_185904_a() != Material.field_151579_a) {
                    SoundType soundtype = block.getSoundType(Block.func_176220_d((int)data), (World)this.world, blockPosIn, null);
                    this.world.func_184156_a(blockPosIn, soundtype.func_185845_c(), SoundCategory.BLOCKS, (soundtype.func_185843_a() + 1.0f) / 2.0f, soundtype.func_185847_b() * 0.8f, false);
                }
                this.mc.field_71452_i.func_180533_a(blockPosIn, block.func_176203_a(data >> 12 & 0xFF));
                break;
            }
            case 2002: 
            case 2007: {
                double d6 = blockPosIn.func_177958_n();
                double d7 = blockPosIn.func_177956_o();
                double d9 = blockPosIn.func_177952_p();
                for (int i1 = 0; i1 < 8; ++i1) {
                    this.spawnParticle(EnumParticleTypes.ITEM_CRACK, d6, d7, d9, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15, Item.func_150891_b((Item)Items.field_185155_bH));
                }
                float f5 = (float)(data >> 16 & 0xFF) / 255.0f;
                float f = (float)(data >> 8 & 0xFF) / 255.0f;
                float f1 = (float)(data >> 0 & 0xFF) / 255.0f;
                EnumParticleTypes enumparticletypes = type == 2007 ? EnumParticleTypes.SPELL_INSTANT : EnumParticleTypes.SPELL;
                for (int l1 = 0; l1 < 100; ++l1) {
                    double d15 = random.nextDouble() * 4.0;
                    double d18 = random.nextDouble() * Math.PI * 2.0;
                    double d21 = Math.cos(d18) * d15;
                    double d23 = 0.01 + random.nextDouble() * 0.5;
                    double d25 = Math.sin(d18) * d15;
                    Particle particle1 = this.spawnEntityFX(enumparticletypes.func_179348_c(), enumparticletypes.func_179344_e(), d6 + d21 * 0.1, d7 + 0.3, d9 + d25 * 0.1, d21, d23, d25, new int[0]);
                    if (particle1 == null) continue;
                    float f4 = 0.75f + random.nextFloat() * 0.25f;
                    particle1.func_70538_b(f5 * f4, f * f4, f1 * f4);
                    particle1.func_70543_e((float)d15);
                }
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187825_fO, SoundCategory.NEUTRAL, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2003: {
                double d0 = (double)blockPosIn.func_177958_n() + 0.5;
                double d1 = blockPosIn.func_177956_o();
                double d2 = (double)blockPosIn.func_177952_p() + 0.5;
                for (int j = 0; j < 8; ++j) {
                    this.spawnParticle(EnumParticleTypes.ITEM_CRACK, d0, d1, d2, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15, Item.func_150891_b((Item)Items.field_151061_bv));
                }
                for (double d11 = 0.0; d11 < Math.PI * 2; d11 += 0.15707963267948966) {
                    this.spawnParticle(EnumParticleTypes.PORTAL, d0 + Math.cos(d11) * 5.0, d1 - 0.4, d2 + Math.sin(d11) * 5.0, Math.cos(d11) * -5.0, 0.0, Math.sin(d11) * -5.0, new int[0]);
                    this.spawnParticle(EnumParticleTypes.PORTAL, d0 + Math.cos(d11) * 5.0, d1 - 0.4, d2 + Math.sin(d11) * 5.0, Math.cos(d11) * -7.0, 0.0, Math.sin(d11) * -7.0, new int[0]);
                }
                return;
            }
            case 2004: {
                for (int k1 = 0; k1 < 20; ++k1) {
                    double d14 = (double)blockPosIn.func_177958_n() + 0.5 + ((double)this.world.field_73012_v.nextFloat() - 0.5) * 2.0;
                    double d17 = (double)blockPosIn.func_177956_o() + 0.5 + ((double)this.world.field_73012_v.nextFloat() - 0.5) * 2.0;
                    double d20 = (double)blockPosIn.func_177952_p() + 0.5 + ((double)this.world.field_73012_v.nextFloat() - 0.5) * 2.0;
                    this.world.func_175688_a(EnumParticleTypes.SMOKE_NORMAL, d14, d17, d20, 0.0, 0.0, 0.0, new int[0]);
                    this.world.func_175688_a(EnumParticleTypes.FLAME, d14, d17, d20, 0.0, 0.0, 0.0, new int[0]);
                }
                return;
            }
            case 2005: {
                ItemDye.func_180617_a((World)this.world, (BlockPos)blockPosIn, (int)data);
                break;
            }
            case 2006: {
                for (int k = 0; k < 200; ++k) {
                    float f2 = random.nextFloat() * 4.0f;
                    float f3 = random.nextFloat() * ((float)Math.PI * 2);
                    double d3 = MathHelper.func_76134_b((float)f3) * f2;
                    double d4 = 0.01 + random.nextDouble() * 0.5;
                    double d5 = MathHelper.func_76126_a((float)f3) * f2;
                    Particle particle = this.spawnEntityFX(EnumParticleTypes.DRAGON_BREATH.func_179348_c(), false, (double)blockPosIn.func_177958_n() + d3 * 0.1, (double)blockPosIn.func_177956_o() + 0.3, (double)blockPosIn.func_177952_p() + d5 * 0.1, d3, d4, d5, new int[0]);
                    if (particle == null) continue;
                    particle.func_70543_e(f2);
                }
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187523_aM, SoundCategory.HOSTILE, 1.0f, this.world.field_73012_v.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 3000: {
                this.world.func_175682_a(EnumParticleTypes.EXPLOSION_HUGE, true, (double)blockPosIn.func_177958_n() + 0.5, (double)blockPosIn.func_177956_o() + 0.5, (double)blockPosIn.func_177952_p() + 0.5, 0.0, 0.0, 0.0, new int[0]);
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187598_bd, SoundCategory.BLOCKS, 10.0f, (1.0f + (this.world.field_73012_v.nextFloat() - this.world.field_73012_v.nextFloat()) * 0.2f) * 0.7f, false);
                break;
            }
            case 3001: {
                this.world.func_184156_a(blockPosIn, SoundEvents.field_187525_aO, SoundCategory.HOSTILE, 64.0f, 0.8f + this.world.field_73012_v.nextFloat() * 0.3f, false);
            }
        }
    }

    public void func_180441_b(int breakerId, BlockPos pos, int progress) {
        if (progress >= 0 && progress < 10) {
            DestroyBlockProgress destroyblockprogress = this.damagedBlocks.get(breakerId);
            if (destroyblockprogress == null || destroyblockprogress.func_180246_b().func_177958_n() != pos.func_177958_n() || destroyblockprogress.func_180246_b().func_177956_o() != pos.func_177956_o() || destroyblockprogress.func_180246_b().func_177952_p() != pos.func_177952_p()) {
                destroyblockprogress = new DestroyBlockProgress(breakerId, pos);
                this.damagedBlocks.put(breakerId, destroyblockprogress);
            }
            destroyblockprogress.func_73107_a(progress);
            destroyblockprogress.func_82744_b(this.cloudTickCounter);
        } else {
            this.damagedBlocks.remove(breakerId);
        }
    }

    public boolean func_184384_n() {
        return this.chunksToUpdate.isEmpty() && this.renderDispatcher.func_188247_f();
    }

    public void func_174979_m() {
        this.displayListEntitiesDirty = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void func_181023_a(Collection<TileEntity> tileEntitiesToRemove, Collection<TileEntity> tileEntitiesToAdd) {
        Set<TileEntity> set = this.setTileEntities;
        synchronized (set) {
            this.setTileEntities.removeAll(tileEntitiesToRemove);
            this.setTileEntities.addAll(tileEntitiesToAdd);
        }
    }

    @SideOnly(value=Side.CLIENT)
    class ContainerLocalRenderInformation {
        final RenderChunk renderChunk;
        final EnumFacing facing;
        byte setFacing;
        final int counter;

        private ContainerLocalRenderInformation(RenderChunk renderChunkIn, @Nullable EnumFacing facingIn, int counterIn) {
            this.renderChunk = renderChunkIn;
            this.facing = facingIn;
            this.counter = counterIn;
        }

        public void setDirection(byte p_189561_1_, EnumFacing p_189561_2_) {
            this.setFacing = (byte)(this.setFacing | p_189561_1_ | 1 << p_189561_2_.ordinal());
        }

        public boolean hasDirection(EnumFacing p_189560_1_) {
            return (this.setFacing & 1 << p_189560_1_.ordinal()) > 0;
        }
    }

    private static class CompatibleViewFrustum
    extends ViewFrustum {
        public CompatibleViewFrustum(World worldIn, int renderDistanceChunks, CompatibleRenderGlobal n, IRenderChunkFactory renderChunkFactory) {
            super(worldIn, renderDistanceChunks, (RenderGlobal)n, renderChunkFactory);
        }

        protected RenderChunk func_178161_a(BlockPos pos) {
            return super.func_178161_a(pos);
        }
    }
}


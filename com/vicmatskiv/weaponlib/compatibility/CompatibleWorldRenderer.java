/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.MapItemRenderer
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.particle.ParticleManager
 *  net.minecraft.client.renderer.ActiveRenderInfo
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.client.renderer.GLAllocation
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$FogMode
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.ItemRenderer
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 *  net.minecraft.client.renderer.culling.ClippingHelperImpl
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.culling.ICamera
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  net.minecraft.client.renderer.texture.TextureMap
 *  net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.client.shader.ShaderLinkHelper
 *  net.minecraft.crash.CrashReport
 *  net.minecraft.crash.CrashReportCategory
 *  net.minecraft.crash.ICrashReportDetail
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItemFrame
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.entity.monster.EntitySpider
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.BlockRenderLayer
 *  net.minecraft.util.EntitySelectors
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.MouseFilter
 *  net.minecraft.util.ReportedException
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$MutableBlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.GameType
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraft.world.biome.Biome
 *  net.minecraftforge.client.ForgeHooksClient
 *  net.minecraftforge.client.IRenderHandler
 *  net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup
 *  net.minecraftforge.client.event.EntityViewRenderEvent$FogColors
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.Event
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.Project
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.MapItemRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderLinkHelper;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ICrashReportDetail;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MouseFilter;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameType;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

@SideOnly(value=Side.CLIENT)
public class CompatibleWorldRenderer
extends EntityRenderer {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final ResourceLocation RAIN_TEXTURES = new ResourceLocation("textures/environment/rain.png");
    private static final ResourceLocation SNOW_TEXTURES = new ResourceLocation("textures/environment/snow.png");
    public static boolean anaglyphEnable;
    public static int anaglyphField;
    private static final float MAX_ZOOM = 0.01f;
    private final Minecraft mc;
    private final IResourceManager resourceManager;
    private final Random random = new Random();
    private float farPlaneDistance;
    public final ItemRenderer field_78516_c;
    private final MapItemRenderer mapItemRenderer;
    private int rendererUpdateCount;
    private Entity pointedEntity;
    private final MouseFilter mouseFilterXAxis = new MouseFilter();
    private final MouseFilter mouseFilterYAxis = new MouseFilter();
    private final float thirdPersonDistance = 4.0f;
    private float thirdPersonDistancePrev = 4.0f;
    private float smoothCamYaw;
    private float smoothCamPitch;
    private float smoothCamFilterX;
    private float smoothCamFilterY;
    private float smoothCamPartialTicks;
    private float fovModifierHand;
    private float fovModifierHandPrev;
    private float bossColorModifier;
    private float bossColorModifierPrev;
    private boolean cloudFog;
    private boolean renderHand = true;
    private boolean drawBlockOutline = true;
    private long timeWorldIcon;
    private long prevFrameTime = Minecraft.func_71386_F();
    private long renderEndNanoTime;
    private final DynamicTexture lightmapTexture;
    private final int[] lightmapColors;
    private final ResourceLocation locationLightMap;
    private boolean lightmapUpdateNeeded;
    private float torchFlickerX;
    private float torchFlickerDX;
    private int rainSoundCounter;
    private final float[] rainXCoords = new float[1024];
    private final float[] rainYCoords = new float[1024];
    private final FloatBuffer fogColorBuffer = GLAllocation.func_74529_h((int)16);
    private float fogColorRed;
    private float fogColorGreen;
    private float fogColorBlue;
    private float fogColor2;
    private float fogColor1;
    private int debugViewDirection;
    private boolean debugView;
    private double cameraZoom = 1.0;
    private double cameraYaw;
    private double cameraPitch;
    private ItemStack itemActivationItem;
    private int itemActivationTicks;
    private float itemActivationOffX;
    private float itemActivationOffY;
    private ShaderGroup shaderGroup;
    private static final ResourceLocation[] SHADERS_TEXTURES;
    public static final int SHADER_COUNT;
    private int shaderIndex = SHADER_COUNT;
    private boolean useShader;
    private int frameCount;
    private boolean prepareTerrain;

    public CompatibleWorldRenderer(Minecraft mcIn, IResourceManager resourceManagerIn) {
        super(mcIn, resourceManagerIn);
        this.mc = mcIn;
        this.resourceManager = resourceManagerIn;
        this.field_78516_c = mcIn.func_175597_ag();
        this.mapItemRenderer = new MapItemRenderer(mcIn.func_110434_K());
        this.lightmapTexture = new DynamicTexture(16, 16);
        this.locationLightMap = mcIn.func_110434_K().func_110578_a("lightMap", this.lightmapTexture);
        this.lightmapColors = this.lightmapTexture.func_110565_c();
        this.shaderGroup = null;
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                float f = j - 16;
                float f1 = i - 16;
                float f2 = MathHelper.func_76129_c((float)(f * f + f1 * f1));
                this.rainXCoords[i << 5 | j] = -f1 / f2;
                this.rainYCoords[i << 5 | j] = f / f2;
            }
        }
    }

    public boolean func_147702_a() {
        return OpenGlHelper.field_148824_g && this.shaderGroup != null;
    }

    public void func_181022_b() {
        if (this.shaderGroup != null) {
            this.shaderGroup.func_148021_a();
        }
        this.shaderGroup = null;
        this.shaderIndex = SHADER_COUNT;
    }

    public void func_175071_c() {
        this.useShader = !this.useShader;
    }

    public void func_175066_a(@Nullable Entity entityIn) {
        if (OpenGlHelper.field_148824_g) {
            if (this.shaderGroup != null) {
                this.shaderGroup.func_148021_a();
            }
            this.shaderGroup = null;
            if (entityIn instanceof EntityCreeper) {
                this.func_175069_a(new ResourceLocation("shaders/post/creeper.json"));
            } else if (entityIn instanceof EntitySpider) {
                this.func_175069_a(new ResourceLocation("shaders/post/spider.json"));
            } else if (entityIn instanceof EntityEnderman) {
                this.func_175069_a(new ResourceLocation("shaders/post/invert.json"));
            } else {
                ForgeHooksClient.loadEntityShader((Entity)entityIn, (EntityRenderer)this);
            }
        }
    }

    public void func_175069_a(ResourceLocation resourceLocationIn) {
        try {
            this.shaderGroup = new ShaderGroup(this.mc.func_110434_K(), this.resourceManager, this.mc.func_147110_a(), resourceLocationIn);
            this.shaderGroup.func_148026_a(this.mc.field_71443_c, this.mc.field_71440_d);
            this.useShader = true;
        }
        catch (IOException ioexception) {
            LOGGER.warn("Failed to load shader: {}", (Object)resourceLocationIn, (Object)ioexception);
            this.shaderIndex = SHADER_COUNT;
            this.useShader = false;
        }
        catch (JsonSyntaxException jsonsyntaxexception) {
            LOGGER.warn("Failed to load shader: {}", (Object)resourceLocationIn, (Object)jsonsyntaxexception);
            this.shaderIndex = SHADER_COUNT;
            this.useShader = false;
        }
    }

    public void func_110549_a(IResourceManager resourceManager) {
        if (this.shaderGroup != null) {
            this.shaderGroup.func_148021_a();
        }
        this.shaderGroup = null;
        if (this.shaderIndex == SHADER_COUNT) {
            this.func_175066_a(this.mc.func_175606_aa());
        } else {
            this.func_175069_a(SHADERS_TEXTURES[this.shaderIndex]);
        }
    }

    public void func_78464_a() {
        if (OpenGlHelper.field_148824_g && ShaderLinkHelper.func_148074_b() == null) {
            ShaderLinkHelper.func_148076_a();
        }
        this.updateFovModifierHand();
        this.updateTorchFlicker();
        this.fogColor2 = this.fogColor1;
        this.thirdPersonDistancePrev = 4.0f;
        float f = this.mc.field_71474_y.field_74341_c * 0.6f + 0.2f;
        float f1 = f * f * f * 8.0f;
        this.smoothCamFilterX = this.mouseFilterXAxis.func_76333_a(this.smoothCamYaw, 0.05f * f1);
        this.smoothCamFilterY = this.mouseFilterYAxis.func_76333_a(this.smoothCamPitch, 0.05f * f1);
        this.smoothCamPartialTicks = 0.0f;
        this.smoothCamYaw = 0.0f;
        this.smoothCamPitch = 0.0f;
        if (this.mc.func_175606_aa() == null) {
            this.mc.func_175607_a((Entity)this.mc.field_71439_g);
        }
        float f3 = this.mc.field_71441_e.func_175724_o(new BlockPos(this.mc.func_175606_aa()));
        float f4 = (float)this.mc.field_71474_y.field_151451_c / 32.0f;
        float f2 = f3 * (1.0f - f4) + f4;
        this.fogColor1 += (f2 - this.fogColor1) * 0.1f;
        ++this.rendererUpdateCount;
        this.addRainParticles();
        this.bossColorModifierPrev = this.bossColorModifier;
        if (this.mc.field_71456_v.func_184046_j().func_184053_e()) {
            this.bossColorModifier += 0.05f;
            if (this.bossColorModifier > 1.0f) {
                this.bossColorModifier = 1.0f;
            }
        } else if (this.bossColorModifier > 0.0f) {
            this.bossColorModifier -= 0.0125f;
        }
        if (this.itemActivationTicks > 0) {
            --this.itemActivationTicks;
            if (this.itemActivationTicks == 0) {
                this.itemActivationItem = null;
            }
        }
    }

    public ShaderGroup func_147706_e() {
        return this.shaderGroup;
    }

    public void func_147704_a(int width, int height) {
        if (OpenGlHelper.field_148824_g) {
            if (this.shaderGroup != null) {
                this.shaderGroup.func_148026_a(width, height);
            }
            this.mc.field_71438_f.func_72720_a(width, height);
        }
    }

    public void func_78473_a(float partialTicks) {
        Entity entity = this.mc.func_175606_aa();
        if (entity != null && this.mc.field_71441_e != null) {
            this.mc.field_71424_I.func_76320_a("pick");
            this.mc.field_147125_j = null;
            double d0 = this.mc.field_71442_b.func_78757_d();
            this.mc.field_71476_x = entity.func_174822_a(d0, partialTicks);
            Vec3d eyePosition = entity.func_174824_e(partialTicks);
            boolean flag = false;
            int i = 3;
            double d1 = d0;
            if (this.mc.field_71442_b.func_78749_i()) {
                d0 = d1 = 6.0;
            } else if (d0 > 3.0) {
                flag = true;
            }
            if (this.mc.field_71476_x != null) {
                d1 = this.mc.field_71476_x.field_72307_f.func_72438_d(eyePosition);
            }
            Vec3d entityLookVec = entity.func_70676_i(1.0f);
            Vec3d targetPos = eyePosition.func_72441_c(entityLookVec.field_72450_a * d0, entityLookVec.field_72448_b * d0, entityLookVec.field_72449_c * d0);
            this.pointedEntity = null;
            Vec3d vec3d3 = null;
            float f = 1.0f;
            List list = this.mc.field_71441_e.func_175674_a(entity, entity.func_174813_aQ().func_72321_a(entityLookVec.field_72450_a * d0, entityLookVec.field_72448_b * d0, entityLookVec.field_72449_c * d0).func_72314_b(1.0, 1.0, 1.0), Predicates.and((Predicate)EntitySelectors.field_180132_d, (Predicate)new Predicate<Entity>(){

                public boolean apply(@Nullable Entity p_apply_1_) {
                    return p_apply_1_ != null && p_apply_1_.func_70067_L();
                }
            }));
            double d2 = d1;
            for (int j = 0; j < list.size(); ++j) {
                double d3;
                Entity entity1 = (Entity)list.get(j);
                AxisAlignedBB axisalignedbb = entity1.func_174813_aQ().func_186662_g((double)entity1.func_70111_Y());
                RayTraceResult raytraceresult = axisalignedbb.func_72327_a(eyePosition, targetPos);
                if (axisalignedbb.func_72318_a(eyePosition)) {
                    if (!(d2 >= 0.0)) continue;
                    this.pointedEntity = entity1;
                    vec3d3 = raytraceresult == null ? eyePosition : raytraceresult.field_72307_f;
                    d2 = 0.0;
                    continue;
                }
                if (raytraceresult == null || !((d3 = eyePosition.func_72438_d(raytraceresult.field_72307_f)) < d2) && d2 != 0.0) continue;
                if (entity1.func_184208_bv() == entity.func_184208_bv() && !entity1.canRiderInteract()) {
                    if (d2 != 0.0) continue;
                    this.pointedEntity = entity1;
                    vec3d3 = raytraceresult.field_72307_f;
                    continue;
                }
                this.pointedEntity = entity1;
                vec3d3 = raytraceresult.field_72307_f;
                d2 = d3;
            }
            if (this.pointedEntity != null && flag && eyePosition.func_72438_d(vec3d3) > 3.0) {
                this.pointedEntity = null;
                this.mc.field_71476_x = new RayTraceResult(RayTraceResult.Type.MISS, vec3d3, (EnumFacing)null, new BlockPos(vec3d3));
            }
            if (this.pointedEntity != null && (d2 < d1 || this.mc.field_71476_x == null)) {
                this.mc.field_71476_x = new RayTraceResult(this.pointedEntity, vec3d3);
                if (this.pointedEntity instanceof EntityLivingBase || this.pointedEntity instanceof EntityItemFrame) {
                    this.mc.field_147125_j = this.pointedEntity;
                }
            }
            this.mc.field_71424_I.func_76319_b();
        }
    }

    private void updateFovModifierHand() {
        float f = 1.0f;
        if (this.mc.func_175606_aa() instanceof AbstractClientPlayer) {
            AbstractClientPlayer abstractclientplayer = (AbstractClientPlayer)this.mc.func_175606_aa();
            f = abstractclientplayer.func_175156_o();
        }
        this.fovModifierHandPrev = this.fovModifierHand;
        this.fovModifierHand += (f - this.fovModifierHand) * 0.5f;
        if (this.fovModifierHand > 1.5f) {
            this.fovModifierHand = 1.5f;
        }
        if (this.fovModifierHand < 0.01f) {
            this.fovModifierHand = 0.01f;
        }
    }

    private float getFOVModifier(float partialTicks, boolean useFOVSetting) {
        IBlockState iblockstate;
        if (this.debugView) {
            return 90.0f;
        }
        Entity entity = this.mc.func_175606_aa();
        float f = 70.0f;
        if (useFOVSetting) {
            f = this.mc.field_71474_y.field_74334_X;
            f *= this.fovModifierHandPrev + (this.fovModifierHand - this.fovModifierHandPrev) * partialTicks;
        }
        if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).func_110143_aJ() <= 0.0f) {
            float f1 = (float)((EntityLivingBase)entity).field_70725_aQ + partialTicks;
            f /= (1.0f - 500.0f / (f1 + 500.0f)) * 2.0f + 1.0f;
        }
        if ((iblockstate = ActiveRenderInfo.func_186703_a((World)this.mc.field_71441_e, (Entity)entity, (float)partialTicks)).func_185904_a() == Material.field_151586_h) {
            f = f * 60.0f / 70.0f;
        }
        return ForgeHooksClient.getFOVModifier((EntityRenderer)this, (Entity)entity, (IBlockState)iblockstate, (double)partialTicks, (float)f);
    }

    private void hurtCameraEffect(float partialTicks) {
        if (this.mc.func_175606_aa() instanceof EntityLivingBase) {
            EntityLivingBase entitylivingbase = (EntityLivingBase)this.mc.func_175606_aa();
            float f = (float)entitylivingbase.field_70737_aN - partialTicks;
            if (entitylivingbase.func_110143_aJ() <= 0.0f) {
                float f1 = (float)entitylivingbase.field_70725_aQ + partialTicks;
                GlStateManager.func_179114_b((float)(40.0f - 8000.0f / (f1 + 200.0f)), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (f < 0.0f) {
                return;
            }
            f /= (float)entitylivingbase.field_70738_aO;
            f = MathHelper.func_76126_a((float)(f * f * f * f * (float)Math.PI));
            float f2 = entitylivingbase.field_70739_aP;
            GlStateManager.func_179114_b((float)(-f2), (float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)(-f * 14.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GlStateManager.func_179114_b((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        }
    }

    private void applyBobbing(float partialTicks) {
        if (this.mc.func_175606_aa() instanceof EntityPlayer) {
            EntityPlayer entityplayer = (EntityPlayer)this.mc.func_175606_aa();
            float f = entityplayer.field_70140_Q - entityplayer.field_70141_P;
            float f1 = -(entityplayer.field_70140_Q + f * partialTicks);
            float f2 = entityplayer.field_71107_bF + (entityplayer.field_71109_bG - entityplayer.field_71107_bF) * partialTicks;
            float f3 = entityplayer.field_70727_aS + (entityplayer.field_70726_aT - entityplayer.field_70727_aS) * partialTicks;
            GlStateManager.func_179109_b((float)(MathHelper.func_76126_a((float)(f1 * (float)Math.PI)) * f2 * 0.5f), (float)(-Math.abs(MathHelper.func_76134_b((float)(f1 * (float)Math.PI)) * f2)), (float)0.0f);
            GlStateManager.func_179114_b((float)(MathHelper.func_76126_a((float)(f1 * (float)Math.PI)) * f2 * 3.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GlStateManager.func_179114_b((float)(Math.abs(MathHelper.func_76134_b((float)(f1 * (float)Math.PI - 0.2f)) * f2) * 5.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)f3, (float)1.0f, (float)0.0f, (float)0.0f);
        }
    }

    private void orientCamera(float partialTicks) {
        Entity entity = this.mc.func_175606_aa();
        float f = entity.func_70047_e();
        double d0 = entity.field_70169_q + (entity.field_70165_t - entity.field_70169_q) * (double)partialTicks;
        double d1 = entity.field_70167_r + (entity.field_70163_u - entity.field_70167_r) * (double)partialTicks + (double)f;
        double d2 = entity.field_70166_s + (entity.field_70161_v - entity.field_70166_s) * (double)partialTicks;
        if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).func_70608_bn()) {
            f = (float)((double)f + 1.0);
            GlStateManager.func_179109_b((float)0.0f, (float)0.3f, (float)0.0f);
            if (!this.mc.field_71474_y.field_74325_U) {
                BlockPos blockpos = new BlockPos(entity);
                IBlockState iblockstate = this.mc.field_71441_e.func_180495_p(blockpos);
                ForgeHooksClient.orientBedCamera((IBlockAccess)this.mc.field_71441_e, (BlockPos)blockpos, (IBlockState)iblockstate, (Entity)entity);
                GlStateManager.func_179114_b((float)(entity.field_70126_B + (entity.field_70177_z - entity.field_70126_B) * partialTicks + 180.0f), (float)0.0f, (float)-1.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)(entity.field_70127_C + (entity.field_70125_A - entity.field_70127_C) * partialTicks), (float)-1.0f, (float)0.0f, (float)0.0f);
            }
        } else if (this.mc.field_71474_y.field_74320_O > 0) {
            double d3 = this.thirdPersonDistancePrev + (4.0f - this.thirdPersonDistancePrev) * partialTicks;
            if (this.mc.field_71474_y.field_74325_U) {
                GlStateManager.func_179109_b((float)0.0f, (float)0.0f, (float)((float)(-d3)));
            } else {
                float f1 = entity.field_70177_z;
                float f2 = entity.field_70125_A;
                if (this.mc.field_71474_y.field_74320_O == 2) {
                    f2 += 180.0f;
                }
                double d4 = (double)(-MathHelper.func_76126_a((float)(f1 * ((float)Math.PI / 180))) * MathHelper.func_76134_b((float)(f2 * ((float)Math.PI / 180)))) * d3;
                double d5 = (double)(MathHelper.func_76134_b((float)(f1 * ((float)Math.PI / 180))) * MathHelper.func_76134_b((float)(f2 * ((float)Math.PI / 180)))) * d3;
                double d6 = (double)(-MathHelper.func_76126_a((float)(f2 * ((float)Math.PI / 180)))) * d3;
                for (int i = 0; i < 8; ++i) {
                    double d7;
                    RayTraceResult raytraceresult;
                    float f3 = (i & 1) * 2 - 1;
                    float f4 = (i >> 1 & 1) * 2 - 1;
                    float f5 = (i >> 2 & 1) * 2 - 1;
                    if ((raytraceresult = this.mc.field_71441_e.func_72933_a(new Vec3d(d0 + (double)(f3 *= 0.1f), d1 + (double)(f4 *= 0.1f), d2 + (double)(f5 *= 0.1f)), new Vec3d(d0 - d4 + (double)f3 + (double)f5, d1 - d6 + (double)f4, d2 - d5 + (double)f5))) == null || !((d7 = raytraceresult.field_72307_f.func_72438_d(new Vec3d(d0, d1, d2))) < d3)) continue;
                    d3 = d7;
                }
                if (this.mc.field_71474_y.field_74320_O == 2) {
                    GlStateManager.func_179114_b((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                GlStateManager.func_179114_b((float)(entity.field_70125_A - f2), (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)(entity.field_70177_z - f1), (float)0.0f, (float)1.0f, (float)0.0f);
                GlStateManager.func_179109_b((float)0.0f, (float)0.0f, (float)((float)(-d3)));
                GlStateManager.func_179114_b((float)(f1 - entity.field_70177_z), (float)0.0f, (float)1.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)(f2 - entity.field_70125_A), (float)1.0f, (float)0.0f, (float)0.0f);
            }
        } else {
            GlStateManager.func_179109_b((float)0.0f, (float)0.0f, (float)0.05f);
        }
        if (!this.mc.field_71474_y.field_74325_U) {
            float yaw = entity.field_70126_B + (entity.field_70177_z - entity.field_70126_B) * partialTicks + 180.0f;
            float pitch = entity.field_70127_C + (entity.field_70125_A - entity.field_70127_C) * partialTicks;
            float roll = 0.0f;
            if (entity instanceof EntityAnimal) {
                EntityAnimal entityanimal = (EntityAnimal)entity;
                yaw = entityanimal.field_70758_at + (entityanimal.field_70759_as - entityanimal.field_70758_at) * partialTicks + 180.0f;
            }
            IBlockState state = ActiveRenderInfo.func_186703_a((World)this.mc.field_71441_e, (Entity)entity, (float)partialTicks);
            EntityViewRenderEvent.CameraSetup event = new EntityViewRenderEvent.CameraSetup((EntityRenderer)this, entity, state, (double)partialTicks, yaw, pitch, roll);
            MinecraftForge.EVENT_BUS.post((Event)event);
            GlStateManager.func_179114_b((float)event.getRoll(), (float)0.0f, (float)0.0f, (float)1.0f);
            GlStateManager.func_179114_b((float)event.getPitch(), (float)1.0f, (float)0.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)event.getYaw(), (float)0.0f, (float)1.0f, (float)0.0f);
        }
        GlStateManager.func_179109_b((float)0.0f, (float)(-f), (float)0.0f);
        d0 = entity.field_70169_q + (entity.field_70165_t - entity.field_70169_q) * (double)partialTicks;
        d1 = entity.field_70167_r + (entity.field_70163_u - entity.field_70167_r) * (double)partialTicks + (double)f;
        d2 = entity.field_70166_s + (entity.field_70161_v - entity.field_70166_s) * (double)partialTicks;
        this.cloudFog = this.mc.field_71438_f.func_72721_a(d0, d1, d2, partialTicks);
    }

    private void setupCameraTransform(float partialTicks, int pass) {
        float f1;
        this.farPlaneDistance = this.mc.field_71474_y.field_151451_c * 16;
        GlStateManager.func_179128_n((int)5889);
        GlStateManager.func_179096_D();
        float f = 0.07f;
        if (this.mc.field_71474_y.field_74337_g) {
            GlStateManager.func_179109_b((float)((float)(-(pass * 2 - 1)) * 0.07f), (float)0.0f, (float)0.0f);
        }
        if (this.cameraZoom != 1.0) {
            GlStateManager.func_179109_b((float)((float)this.cameraYaw), (float)((float)(-this.cameraPitch)), (float)0.0f);
            GlStateManager.func_179139_a((double)this.cameraZoom, (double)this.cameraZoom, (double)1.0);
        }
        Project.gluPerspective((float)this.getFOVModifier(partialTicks, true), (float)((float)this.mc.field_71443_c / (float)this.mc.field_71440_d), (float)0.05f, (float)(this.farPlaneDistance * MathHelper.field_180189_a));
        GlStateManager.func_179128_n((int)5888);
        GlStateManager.func_179096_D();
        if (this.mc.field_71474_y.field_74337_g) {
            GlStateManager.func_179109_b((float)((float)(pass * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
        }
        this.hurtCameraEffect(partialTicks);
        if (this.mc.field_71474_y.field_74336_f) {
            this.applyBobbing(partialTicks);
        }
        if ((f1 = this.mc.field_71439_g.field_71080_cy + (this.mc.field_71439_g.field_71086_bY - this.mc.field_71439_g.field_71080_cy) * partialTicks) > 0.0f) {
            int i = 20;
            if (this.mc.field_71439_g.func_70644_a(MobEffects.field_76431_k)) {
                i = 7;
            }
            float f2 = 5.0f / (f1 * f1 + 5.0f) - f1 * 0.04f;
            f2 *= f2;
            GlStateManager.func_179114_b((float)(((float)this.rendererUpdateCount + partialTicks) * (float)i), (float)0.0f, (float)1.0f, (float)1.0f);
            GlStateManager.func_179152_a((float)(1.0f / f2), (float)1.0f, (float)1.0f);
            GlStateManager.func_179114_b((float)(-((float)this.rendererUpdateCount + partialTicks) * (float)i), (float)0.0f, (float)1.0f, (float)1.0f);
        }
        this.orientCamera(partialTicks);
        if (this.debugView) {
            switch (this.debugViewDirection) {
                case 0: {
                    GlStateManager.func_179114_b((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    break;
                }
                case 1: {
                    GlStateManager.func_179114_b((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    break;
                }
                case 2: {
                    GlStateManager.func_179114_b((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    break;
                }
                case 3: {
                    GlStateManager.func_179114_b((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    break;
                }
                case 4: {
                    GlStateManager.func_179114_b((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
            }
        }
    }

    private void renderHand(float partialTicks, int pass) {
        if (!this.debugView) {
            boolean flag;
            GlStateManager.func_179128_n((int)5889);
            GlStateManager.func_179096_D();
            float f = 0.07f;
            if (this.mc.field_71474_y.field_74337_g) {
                GlStateManager.func_179109_b((float)((float)(-(pass * 2 - 1)) * 0.07f), (float)0.0f, (float)0.0f);
            }
            Project.gluPerspective((float)this.getFOVModifier(partialTicks, false), (float)((float)this.mc.field_71443_c / (float)this.mc.field_71440_d), (float)0.05f, (float)(this.farPlaneDistance * 2.0f));
            GlStateManager.func_179128_n((int)5888);
            GlStateManager.func_179096_D();
            if (this.mc.field_71474_y.field_74337_g) {
                GlStateManager.func_179109_b((float)((float)(pass * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
            }
            GlStateManager.func_179094_E();
            this.hurtCameraEffect(partialTicks);
            if (this.mc.field_71474_y.field_74336_f) {
                this.applyBobbing(partialTicks);
            }
            boolean bl = flag = this.mc.func_175606_aa() instanceof EntityLivingBase && ((EntityLivingBase)this.mc.func_175606_aa()).func_70608_bn();
            if (!(ForgeHooksClient.renderFirstPersonHand((RenderGlobal)this.mc.field_71438_f, (float)partialTicks, (int)pass) || this.mc.field_71474_y.field_74320_O != 0 || flag || this.mc.field_71474_y.field_74319_N || this.mc.field_71442_b.func_78747_a())) {
                this.func_180436_i();
                this.field_78516_c.func_78440_a(partialTicks);
                this.func_175072_h();
            }
            GlStateManager.func_179121_F();
            if (this.mc.field_71474_y.field_74320_O == 0 && !flag) {
                this.field_78516_c.func_78447_b(partialTicks);
                this.hurtCameraEffect(partialTicks);
            }
            if (this.mc.field_71474_y.field_74336_f) {
                this.applyBobbing(partialTicks);
            }
        }
    }

    public void func_175072_h() {
        GlStateManager.func_179138_g((int)OpenGlHelper.field_77476_b);
        GlStateManager.func_179090_x();
        GlStateManager.func_179138_g((int)OpenGlHelper.field_77478_a);
    }

    public void func_180436_i() {
        GlStateManager.func_179138_g((int)OpenGlHelper.field_77476_b);
        GlStateManager.func_179128_n((int)5890);
        GlStateManager.func_179096_D();
        float f = 0.00390625f;
        GlStateManager.func_179152_a((float)0.00390625f, (float)0.00390625f, (float)0.00390625f);
        GlStateManager.func_179109_b((float)8.0f, (float)8.0f, (float)8.0f);
        GlStateManager.func_179128_n((int)5888);
        this.mc.func_110434_K().func_110577_a(this.locationLightMap);
        GlStateManager.func_187421_b((int)3553, (int)10241, (int)9729);
        GlStateManager.func_187421_b((int)3553, (int)10240, (int)9729);
        GlStateManager.func_187421_b((int)3553, (int)10242, (int)10496);
        GlStateManager.func_187421_b((int)3553, (int)10243, (int)10496);
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.func_179098_w();
        GlStateManager.func_179138_g((int)OpenGlHelper.field_77478_a);
    }

    private void updateTorchFlicker() {
        this.torchFlickerDX = (float)((double)this.torchFlickerDX + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.torchFlickerDX = (float)((double)this.torchFlickerDX * 0.9);
        this.torchFlickerX += this.torchFlickerDX - this.torchFlickerX;
        this.lightmapUpdateNeeded = true;
    }

    private void updateLightmap(float partialTicks) {
        if (this.lightmapUpdateNeeded) {
            this.mc.field_71424_I.func_76320_a("lightTex");
            WorldClient world = this.mc.field_71441_e;
            if (world != null) {
                float f = world.func_72971_b(1.0f);
                float f1 = f * 0.95f + 0.05f;
                for (int i = 0; i < 256; ++i) {
                    float f2 = world.field_73011_w.func_177497_p()[i / 16] * f1;
                    float f3 = world.field_73011_w.func_177497_p()[i % 16] * (this.torchFlickerX * 0.1f + 1.5f);
                    if (world.func_175658_ac() > 0) {
                        f2 = world.field_73011_w.func_177497_p()[i / 16];
                    }
                    float f4 = f2 * (f * 0.65f + 0.35f);
                    float f5 = f2 * (f * 0.65f + 0.35f);
                    float f6 = f3 * ((f3 * 0.6f + 0.4f) * 0.6f + 0.4f);
                    float f7 = f3 * (f3 * f3 * 0.6f + 0.4f);
                    float f8 = f4 + f3;
                    float f9 = f5 + f6;
                    float f10 = f2 + f7;
                    f8 = f8 * 0.96f + 0.03f;
                    f9 = f9 * 0.96f + 0.03f;
                    f10 = f10 * 0.96f + 0.03f;
                    if (this.bossColorModifier > 0.0f) {
                        float f11 = this.bossColorModifierPrev + (this.bossColorModifier - this.bossColorModifierPrev) * partialTicks;
                        f8 = f8 * (1.0f - f11) + f8 * 0.7f * f11;
                        f9 = f9 * (1.0f - f11) + f9 * 0.6f * f11;
                        f10 = f10 * (1.0f - f11) + f10 * 0.6f * f11;
                    }
                    if (world.field_73011_w.func_186058_p().func_186068_a() == 1) {
                        f8 = 0.22f + f3 * 0.75f;
                        f9 = 0.28f + f6 * 0.75f;
                        f10 = 0.25f + f7 * 0.75f;
                    }
                    if (this.mc.field_71439_g.func_70644_a(MobEffects.field_76439_r)) {
                        float f15 = this.getNightVisionBrightness((EntityLivingBase)this.mc.field_71439_g, partialTicks);
                        float f12 = 1.0f / f8;
                        if (f12 > 1.0f / f9) {
                            f12 = 1.0f / f9;
                        }
                        if (f12 > 1.0f / f10) {
                            f12 = 1.0f / f10;
                        }
                        f8 = f8 * (1.0f - f15) + f8 * f12 * f15;
                        f9 = f9 * (1.0f - f15) + f9 * f12 * f15;
                        f10 = f10 * (1.0f - f15) + f10 * f12 * f15;
                    }
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    if (f9 > 1.0f) {
                        f9 = 1.0f;
                    }
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    float f16 = this.mc.field_71474_y.field_74333_Y;
                    float f17 = 1.0f - f8;
                    float f13 = 1.0f - f9;
                    float f14 = 1.0f - f10;
                    f17 = 1.0f - f17 * f17 * f17 * f17;
                    f13 = 1.0f - f13 * f13 * f13 * f13;
                    f14 = 1.0f - f14 * f14 * f14 * f14;
                    f8 = f8 * (1.0f - f16) + f17 * f16;
                    f9 = f9 * (1.0f - f16) + f13 * f16;
                    f10 = f10 * (1.0f - f16) + f14 * f16;
                    f8 = f8 * 0.96f + 0.03f;
                    f9 = f9 * 0.96f + 0.03f;
                    f10 = f10 * 0.96f + 0.03f;
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    if (f9 > 1.0f) {
                        f9 = 1.0f;
                    }
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (f8 < 0.0f) {
                        f8 = 0.0f;
                    }
                    if (f9 < 0.0f) {
                        f9 = 0.0f;
                    }
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    int j = 255;
                    int k = (int)(f8 * 255.0f);
                    int l = (int)(f9 * 255.0f);
                    int i1 = (int)(f10 * 255.0f);
                    this.lightmapColors[i] = 0xFF000000 | k << 16 | l << 8 | i1;
                }
                this.lightmapTexture.func_110564_a();
                this.lightmapUpdateNeeded = false;
                this.mc.field_71424_I.func_76319_b();
            }
        }
    }

    private float getNightVisionBrightness(EntityLivingBase entitylivingbaseIn, float partialTicks) {
        int i = entitylivingbaseIn.func_70660_b(MobEffects.field_76439_r).func_76459_b();
        return i > 200 ? 1.0f : 0.7f + MathHelper.func_76126_a((float)(((float)i - partialTicks) * (float)Math.PI * 0.2f)) * 0.3f;
    }

    public void func_181560_a(float partialTicks, long nanoTime) {
        boolean flag = Display.isActive();
        if (!(flag || !this.mc.field_71474_y.field_82881_y || this.mc.field_71474_y.field_85185_A && Mouse.isButtonDown((int)1))) {
            if (Minecraft.func_71386_F() - this.prevFrameTime > 500L) {
                this.mc.func_71385_j();
            }
        } else {
            this.prevFrameTime = Minecraft.func_71386_F();
        }
        this.mc.field_71424_I.func_76320_a("mouse");
        if (flag && Minecraft.field_142025_a && this.mc.field_71415_G && !Mouse.isInsideWindow()) {
            Mouse.setGrabbed((boolean)false);
            Mouse.setCursorPosition((int)(Display.getWidth() / 2), (int)(Display.getHeight() / 2 - 20));
            Mouse.setGrabbed((boolean)true);
        }
        if (this.mc.field_71415_G && flag) {
            this.mc.field_71417_B.func_74374_c();
            this.mc.func_193032_ao().func_193299_a(this.mc.field_71417_B);
            float f = this.mc.field_71474_y.field_74341_c * 0.6f + 0.2f;
            float f1 = f * f * f * 8.0f;
            float f2 = (float)this.mc.field_71417_B.field_74377_a * f1;
            float f3 = (float)this.mc.field_71417_B.field_74375_b * f1;
            int i = 1;
            if (this.mc.field_71474_y.field_74338_d) {
                i = -1;
            }
            if (this.mc.field_71474_y.field_74326_T) {
                this.smoothCamYaw += f2;
                this.smoothCamPitch += f3;
                float f4 = partialTicks - this.smoothCamPartialTicks;
                this.smoothCamPartialTicks = partialTicks;
                f2 = this.smoothCamFilterX * f4;
                f3 = this.smoothCamFilterY * f4;
                this.mc.field_71439_g.func_70082_c(f2, f3 * (float)i);
            } else {
                this.smoothCamYaw = 0.0f;
                this.smoothCamPitch = 0.0f;
                this.mc.field_71439_g.func_70082_c(f2, f3 * (float)i);
            }
        }
        this.mc.field_71424_I.func_76319_b();
        if (!this.mc.field_71454_w) {
            anaglyphEnable = this.mc.field_71474_y.field_74337_g;
            final ScaledResolution scaledresolution = new ScaledResolution(this.mc);
            int i1 = scaledresolution.func_78326_a();
            int j1 = scaledresolution.func_78328_b();
            final int k1 = Mouse.getX() * i1 / this.mc.field_71443_c;
            final int l1 = j1 - Mouse.getY() * j1 / this.mc.field_71440_d - 1;
            int i2 = this.mc.field_71474_y.field_74350_i;
            if (this.mc.field_71441_e != null) {
                this.mc.field_71424_I.func_76320_a("level");
                int j = Math.min(Minecraft.func_175610_ah(), i2);
                j = Math.max(j, 60);
                long k = System.nanoTime() - nanoTime;
                long l = Math.max((long)(1000000000 / j / 4) - k, 0L);
                this.func_78471_a(partialTicks, System.nanoTime() + l);
                if (this.mc.func_71356_B() && this.timeWorldIcon < Minecraft.func_71386_F() - 1000L) {
                    this.timeWorldIcon = Minecraft.func_71386_F();
                }
                if (OpenGlHelper.field_148824_g) {
                    this.mc.field_71438_f.func_174975_c();
                    if (this.shaderGroup != null && this.useShader) {
                        GlStateManager.func_179128_n((int)5890);
                        GlStateManager.func_179094_E();
                        GlStateManager.func_179096_D();
                        this.shaderGroup.func_148018_a(partialTicks);
                        GlStateManager.func_179121_F();
                    }
                    this.mc.func_147110_a().func_147610_a(true);
                }
                this.renderEndNanoTime = System.nanoTime();
                this.mc.field_71424_I.func_76318_c("gui");
                if (!this.mc.field_71474_y.field_74319_N || this.mc.field_71462_r != null) {
                    GlStateManager.func_179092_a((int)516, (float)0.1f);
                    this.func_78478_c();
                    this.renderItemActivation(i1, j1, partialTicks);
                    this.mc.field_71456_v.func_175180_a(partialTicks);
                }
                this.mc.field_71424_I.func_76319_b();
            } else {
                GlStateManager.func_179083_b((int)0, (int)0, (int)this.mc.field_71443_c, (int)this.mc.field_71440_d);
                GlStateManager.func_179128_n((int)5889);
                GlStateManager.func_179096_D();
                GlStateManager.func_179128_n((int)5888);
                GlStateManager.func_179096_D();
                this.func_78478_c();
                this.renderEndNanoTime = System.nanoTime();
                TileEntityRendererDispatcher.field_147556_a.field_147553_e = this.mc.func_110434_K();
                TileEntityRendererDispatcher.field_147556_a.field_147557_n = this.mc.field_71466_p;
            }
            if (this.mc.field_71462_r != null) {
                GlStateManager.func_179086_m((int)256);
                try {
                    ForgeHooksClient.drawScreen((GuiScreen)this.mc.field_71462_r, (int)k1, (int)l1, (float)this.mc.func_193989_ak());
                }
                catch (Throwable throwable) {
                    CrashReport crashreport = CrashReport.func_85055_a((Throwable)throwable, (String)"Rendering screen");
                    CrashReportCategory crashreportcategory = crashreport.func_85058_a("Screen render details");
                    crashreportcategory.func_189529_a("Screen name", (ICrashReportDetail)new ICrashReportDetail<String>(){

                        public String call() throws Exception {
                            return ((CompatibleWorldRenderer)CompatibleWorldRenderer.this).mc.field_71462_r.getClass().getCanonicalName();
                        }
                    });
                    crashreportcategory.func_189529_a("Mouse location", (ICrashReportDetail)new ICrashReportDetail<String>(){

                        public String call() throws Exception {
                            return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", k1, l1, Mouse.getX(), Mouse.getY());
                        }
                    });
                    crashreportcategory.func_189529_a("Screen size", (ICrashReportDetail)new ICrashReportDetail<String>(){

                        public String call() throws Exception {
                            return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", scaledresolution.func_78326_a(), scaledresolution.func_78328_b(), ((CompatibleWorldRenderer)CompatibleWorldRenderer.this).mc.field_71443_c, ((CompatibleWorldRenderer)CompatibleWorldRenderer.this).mc.field_71440_d, scaledresolution.func_78325_e());
                        }
                    });
                    throw new ReportedException(crashreport);
                }
            }
        }
    }

    public void func_152430_c(float partialTicks) {
        this.func_78478_c();
    }

    private boolean isDrawBlockOutline() {
        boolean flag;
        if (!this.drawBlockOutline) {
            return false;
        }
        Entity entity = this.mc.func_175606_aa();
        boolean bl = flag = entity instanceof EntityPlayer && !this.mc.field_71474_y.field_74319_N;
        if (flag && !((EntityPlayer)entity).field_71075_bZ.field_75099_e) {
            ItemStack itemstack = ((EntityPlayer)entity).func_184614_ca();
            if (this.mc.field_71476_x != null && this.mc.field_71476_x.field_72313_a == RayTraceResult.Type.BLOCK) {
                BlockPos blockpos = this.mc.field_71476_x.func_178782_a();
                Block block = this.mc.field_71441_e.func_180495_p(blockpos).func_177230_c();
                flag = this.mc.field_71442_b.func_178889_l() == GameType.SPECTATOR ? block.hasTileEntity(this.mc.field_71441_e.func_180495_p(blockpos)) && this.mc.field_71441_e.func_175625_s(blockpos) instanceof IInventory : !itemstack.func_190926_b() && (itemstack.func_179544_c(block) || itemstack.func_179547_d(block));
            }
        }
        return flag;
    }

    public void func_78471_a(float partialTicks, long finishTimeNano) {
        this.updateLightmap(partialTicks);
        if (this.mc.func_175606_aa() == null) {
            this.mc.func_175607_a((Entity)this.mc.field_71439_g);
        }
        this.func_78473_a(partialTicks);
        GlStateManager.func_179126_j();
        GlStateManager.func_179141_d();
        GlStateManager.func_179092_a((int)516, (float)0.5f);
        this.mc.field_71424_I.func_76320_a("center");
        if (this.mc.field_71474_y.field_74337_g) {
            anaglyphField = 0;
            GlStateManager.func_179135_a((boolean)false, (boolean)true, (boolean)true, (boolean)false);
            this.renderWorldPass(0, partialTicks, finishTimeNano);
            anaglyphField = 1;
            GlStateManager.func_179135_a((boolean)true, (boolean)false, (boolean)false, (boolean)false);
            this.renderWorldPass(1, partialTicks, finishTimeNano);
            GlStateManager.func_179135_a((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        } else {
            this.renderWorldPass(2, partialTicks, finishTimeNano);
            if (OpenGlHelper.field_148824_g) {
                this.mc.field_71438_f.func_174975_c();
                if (this.shaderGroup != null && this.useShader) {
                    GlStateManager.func_179128_n((int)5890);
                    GlStateManager.func_179094_E();
                    GlStateManager.func_179096_D();
                    this.shaderGroup.func_148018_a(partialTicks);
                    GlStateManager.func_179121_F();
                }
                this.mc.func_147110_a().func_147610_a(true);
            }
        }
        this.mc.field_71424_I.func_76319_b();
    }

    private void renderWorldPass(int pass, float partialTicks, long finishTimeNano) {
        RenderGlobal renderglobal = this.mc.field_71438_f;
        ParticleManager particlemanager = this.mc.field_71452_i;
        boolean flag = this.isDrawBlockOutline();
        GlStateManager.func_179089_o();
        this.mc.field_71424_I.func_76318_c("clear");
        GlStateManager.func_179083_b((int)0, (int)0, (int)this.mc.field_71443_c, (int)this.mc.field_71440_d);
        this.updateFogColor(partialTicks);
        GlStateManager.func_179086_m((int)16640);
        this.mc.field_71424_I.func_76318_c("camera");
        this.setupCameraTransform(partialTicks, pass);
        ActiveRenderInfo.func_74583_a((EntityPlayer)this.mc.field_71439_g, (this.mc.field_71474_y.field_74320_O == 2 ? 1 : 0) != 0);
        this.mc.field_71424_I.func_76318_c("frustum");
        ClippingHelperImpl.func_78558_a();
        this.mc.field_71424_I.func_76318_c("culling");
        Frustum icamera = new Frustum();
        Entity entity = this.mc.func_175606_aa();
        double d0 = entity.field_70142_S + (entity.field_70165_t - entity.field_70142_S) * (double)partialTicks;
        double d1 = entity.field_70137_T + (entity.field_70163_u - entity.field_70137_T) * (double)partialTicks;
        double d2 = entity.field_70136_U + (entity.field_70161_v - entity.field_70136_U) * (double)partialTicks;
        icamera.func_78547_a(d0, d1, d2);
        if (this.mc.field_71474_y.field_151451_c >= 4) {
            this.setupFog(-1, partialTicks);
            this.mc.field_71424_I.func_76318_c("sky");
            GlStateManager.func_179128_n((int)5889);
            GlStateManager.func_179096_D();
            Project.gluPerspective((float)this.getFOVModifier(partialTicks, true), (float)((float)this.mc.field_71443_c / (float)this.mc.field_71440_d), (float)0.05f, (float)(this.farPlaneDistance * 2.0f));
            GlStateManager.func_179128_n((int)5888);
            renderglobal.func_174976_a(partialTicks, pass);
            GlStateManager.func_179128_n((int)5889);
            GlStateManager.func_179096_D();
            Project.gluPerspective((float)this.getFOVModifier(partialTicks, true), (float)((float)this.mc.field_71443_c / (float)this.mc.field_71440_d), (float)0.05f, (float)(this.farPlaneDistance * MathHelper.field_180189_a));
            GlStateManager.func_179128_n((int)5888);
        }
        this.setupFog(0, partialTicks);
        GlStateManager.func_179103_j((int)7425);
        if (entity.field_70163_u + (double)entity.func_70047_e() < 128.0) {
            this.renderCloudsCheck(renderglobal, partialTicks, pass, d0, d1, d2);
        }
        this.mc.field_71424_I.func_76318_c("prepareterrain");
        this.setupFog(0, partialTicks);
        this.mc.func_110434_K().func_110577_a(TextureMap.field_110575_b);
        RenderHelper.func_74518_a();
        this.mc.field_71424_I.func_76318_c("terrain_setup");
        if (this.prepareTerrain) {
            renderglobal.func_174970_a(entity, (double)partialTicks, (ICamera)icamera, this.frameCount++, this.mc.field_71439_g.func_175149_v());
        }
        if (pass == 0 || pass == 2) {
            this.mc.field_71424_I.func_76318_c("updatechunks");
            this.mc.field_71438_f.func_174967_a(finishTimeNano);
        }
        this.mc.field_71424_I.func_76318_c("terrain");
        GlStateManager.func_179128_n((int)5888);
        GlStateManager.func_179094_E();
        GlStateManager.func_179118_c();
        renderglobal.func_174977_a(BlockRenderLayer.SOLID, (double)partialTicks, pass, entity);
        GlStateManager.func_179141_d();
        renderglobal.func_174977_a(BlockRenderLayer.CUTOUT_MIPPED, (double)partialTicks, pass, entity);
        this.mc.func_110434_K().func_110581_b(TextureMap.field_110575_b).func_174936_b(false, false);
        renderglobal.func_174977_a(BlockRenderLayer.CUTOUT, (double)partialTicks, pass, entity);
        this.mc.func_110434_K().func_110581_b(TextureMap.field_110575_b).func_174935_a();
        GlStateManager.func_179103_j((int)7424);
        GlStateManager.func_179092_a((int)516, (float)0.1f);
        if (!this.debugView) {
            GlStateManager.func_179128_n((int)5888);
            GlStateManager.func_179121_F();
            GlStateManager.func_179094_E();
            RenderHelper.func_74519_b();
            this.mc.field_71424_I.func_76318_c("entities");
            ForgeHooksClient.setRenderPass((int)0);
            renderglobal.func_180446_a(entity, (ICamera)icamera, partialTicks);
            ForgeHooksClient.setRenderPass((int)0);
            RenderHelper.func_74518_a();
            this.func_175072_h();
        }
        GlStateManager.func_179128_n((int)5888);
        GlStateManager.func_179121_F();
        if (flag && this.mc.field_71476_x != null && !entity.func_70055_a(Material.field_151586_h)) {
            EntityPlayer entityplayer = (EntityPlayer)entity;
            GlStateManager.func_179118_c();
            this.mc.field_71424_I.func_76318_c("outline");
            if (!ForgeHooksClient.onDrawBlockHighlight((RenderGlobal)renderglobal, (EntityPlayer)entityplayer, (RayTraceResult)this.mc.field_71476_x, (int)0, (float)partialTicks)) {
                renderglobal.func_72731_b(entityplayer, this.mc.field_71476_x, 0, partialTicks);
            }
            GlStateManager.func_179141_d();
        }
        if (this.mc.field_184132_p.func_190074_a()) {
            this.mc.field_184132_p.func_190073_a(partialTicks, finishTimeNano);
        }
        this.mc.field_71424_I.func_76318_c("destroyProgress");
        GlStateManager.func_179147_l();
        GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        this.mc.func_110434_K().func_110581_b(TextureMap.field_110575_b).func_174936_b(false, false);
        renderglobal.func_174981_a(Tessellator.func_178181_a(), Tessellator.func_178181_a().func_178180_c(), entity, partialTicks);
        this.mc.func_110434_K().func_110581_b(TextureMap.field_110575_b).func_174935_a();
        GlStateManager.func_179084_k();
        if (!this.debugView) {
            this.func_180436_i();
            this.mc.field_71424_I.func_76318_c("litParticles");
            particlemanager.func_78872_b(entity, partialTicks);
            RenderHelper.func_74518_a();
            this.setupFog(0, partialTicks);
            this.mc.field_71424_I.func_76318_c("particles");
            particlemanager.func_78874_a(entity, partialTicks);
            this.func_175072_h();
        }
        GlStateManager.func_179132_a((boolean)false);
        GlStateManager.func_179089_o();
        this.mc.field_71424_I.func_76318_c("weather");
        this.func_78474_d(partialTicks);
        GlStateManager.func_179132_a((boolean)true);
        renderglobal.func_180449_a(entity, partialTicks);
        GlStateManager.func_179084_k();
        GlStateManager.func_179089_o();
        GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.func_179092_a((int)516, (float)0.1f);
        this.setupFog(0, partialTicks);
        GlStateManager.func_179147_l();
        GlStateManager.func_179132_a((boolean)false);
        this.mc.func_110434_K().func_110577_a(TextureMap.field_110575_b);
        GlStateManager.func_179103_j((int)7425);
        this.mc.field_71424_I.func_76318_c("translucent");
        renderglobal.func_174977_a(BlockRenderLayer.TRANSLUCENT, (double)partialTicks, pass, entity);
        if (!this.debugView) {
            RenderHelper.func_74519_b();
            this.mc.field_71424_I.func_76318_c("entities");
            ForgeHooksClient.setRenderPass((int)1);
            renderglobal.func_180446_a(entity, (ICamera)icamera, partialTicks);
            GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            ForgeHooksClient.setRenderPass((int)-1);
            RenderHelper.func_74518_a();
        }
        GlStateManager.func_179103_j((int)7424);
        GlStateManager.func_179132_a((boolean)true);
        GlStateManager.func_179089_o();
        GlStateManager.func_179084_k();
        GlStateManager.func_179106_n();
        if (entity.field_70163_u + (double)entity.func_70047_e() >= 128.0) {
            this.mc.field_71424_I.func_76318_c("aboveClouds");
            this.renderCloudsCheck(renderglobal, partialTicks, pass, d0, d1, d2);
        }
        this.mc.field_71424_I.func_76318_c("forge_render_last");
        ForgeHooksClient.dispatchRenderLast((RenderGlobal)renderglobal, (float)partialTicks);
        this.mc.field_71424_I.func_76318_c("hand");
    }

    private void renderCloudsCheck(RenderGlobal renderGlobalIn, float partialTicks, int pass, double x, double y, double z) {
        if (this.mc.field_71474_y.func_181147_e() != 0) {
            this.mc.field_71424_I.func_76318_c("clouds");
            GlStateManager.func_179128_n((int)5889);
            GlStateManager.func_179096_D();
            Project.gluPerspective((float)this.getFOVModifier(partialTicks, true), (float)((float)this.mc.field_71443_c / (float)this.mc.field_71440_d), (float)0.05f, (float)(this.farPlaneDistance * 4.0f));
            GlStateManager.func_179128_n((int)5888);
            GlStateManager.func_179094_E();
            this.setupFog(0, partialTicks);
            renderGlobalIn.func_180447_b(partialTicks, pass, x, y, z);
            GlStateManager.func_179106_n();
            GlStateManager.func_179121_F();
            GlStateManager.func_179128_n((int)5889);
            GlStateManager.func_179096_D();
            Project.gluPerspective((float)this.getFOVModifier(partialTicks, true), (float)((float)this.mc.field_71443_c / (float)this.mc.field_71440_d), (float)0.05f, (float)(this.farPlaneDistance * MathHelper.field_180189_a));
            GlStateManager.func_179128_n((int)5888);
        }
    }

    private void addRainParticles() {
        float f = this.mc.field_71441_e.func_72867_j(1.0f);
        if (!this.mc.field_71474_y.field_74347_j) {
            f /= 2.0f;
        }
        if (f != 0.0f) {
            this.random.setSeed((long)this.rendererUpdateCount * 312987231L);
            Entity entity = this.mc.func_175606_aa();
            WorldClient world = this.mc.field_71441_e;
            BlockPos blockpos = new BlockPos(entity);
            int i = 10;
            double d0 = 0.0;
            double d1 = 0.0;
            double d2 = 0.0;
            int j = 0;
            int k = (int)(100.0f * f * f);
            if (this.mc.field_71474_y.field_74362_aa == 1) {
                k >>= 1;
            } else if (this.mc.field_71474_y.field_74362_aa == 2) {
                k = 0;
            }
            for (int l = 0; l < k; ++l) {
                BlockPos blockpos1 = world.func_175725_q(blockpos.func_177982_a(this.random.nextInt(10) - this.random.nextInt(10), 0, this.random.nextInt(10) - this.random.nextInt(10)));
                Biome biome = world.func_180494_b(blockpos1);
                BlockPos blockpos2 = blockpos1.func_177977_b();
                IBlockState iblockstate = world.func_180495_p(blockpos2);
                if (blockpos1.func_177956_o() > blockpos.func_177956_o() + 10 || blockpos1.func_177956_o() < blockpos.func_177956_o() - 10 || !biome.func_76738_d() || !(biome.func_180626_a(blockpos1) >= 0.15f)) continue;
                double d3 = this.random.nextDouble();
                double d4 = this.random.nextDouble();
                AxisAlignedBB axisalignedbb = iblockstate.func_185900_c((IBlockAccess)world, blockpos2);
                if (iblockstate.func_185904_a() != Material.field_151587_i && iblockstate.func_177230_c() != Blocks.field_189877_df) {
                    if (iblockstate.func_185904_a() == Material.field_151579_a) continue;
                    if (this.random.nextInt(++j) == 0) {
                        d0 = (double)blockpos2.func_177958_n() + d3;
                        d1 = (double)((float)blockpos2.func_177956_o() + 0.1f) + axisalignedbb.field_72337_e - 1.0;
                        d2 = (double)blockpos2.func_177952_p() + d4;
                    }
                    this.mc.field_71441_e.func_175688_a(EnumParticleTypes.WATER_DROP, (double)blockpos2.func_177958_n() + d3, (double)((float)blockpos2.func_177956_o() + 0.1f) + axisalignedbb.field_72337_e, (double)blockpos2.func_177952_p() + d4, 0.0, 0.0, 0.0, new int[0]);
                    continue;
                }
                this.mc.field_71441_e.func_175688_a(EnumParticleTypes.SMOKE_NORMAL, (double)blockpos1.func_177958_n() + d3, (double)((float)blockpos1.func_177956_o() + 0.1f) - axisalignedbb.field_72338_b, (double)blockpos1.func_177952_p() + d4, 0.0, 0.0, 0.0, new int[0]);
            }
            if (j > 0 && this.random.nextInt(3) < this.rainSoundCounter++) {
                this.rainSoundCounter = 0;
                if (d1 > (double)(blockpos.func_177956_o() + 1) && world.func_175725_q(blockpos).func_177956_o() > MathHelper.func_76141_d((float)blockpos.func_177956_o())) {
                    this.mc.field_71441_e.func_184134_a(d0, d1, d2, SoundEvents.field_187919_gs, SoundCategory.WEATHER, 0.1f, 0.5f, false);
                } else {
                    this.mc.field_71441_e.func_184134_a(d0, d1, d2, SoundEvents.field_187918_gr, SoundCategory.WEATHER, 0.2f, 1.0f, false);
                }
            }
        }
    }

    protected void func_78474_d(float partialTicks) {
        IRenderHandler renderer = this.mc.field_71441_e.field_73011_w.getWeatherRenderer();
        if (renderer != null) {
            renderer.render(partialTicks, this.mc.field_71441_e, this.mc);
            return;
        }
        float f = this.mc.field_71441_e.func_72867_j(partialTicks);
        if (f > 0.0f) {
            this.func_180436_i();
            Entity entity = this.mc.func_175606_aa();
            WorldClient world = this.mc.field_71441_e;
            int i = MathHelper.func_76128_c((double)entity.field_70165_t);
            int j = MathHelper.func_76128_c((double)entity.field_70163_u);
            int k = MathHelper.func_76128_c((double)entity.field_70161_v);
            Tessellator tessellator = Tessellator.func_178181_a();
            BufferBuilder bufferbuilder = tessellator.func_178180_c();
            GlStateManager.func_179129_p();
            GlStateManager.func_187432_a((float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManager.func_179147_l();
            GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            GlStateManager.func_179092_a((int)516, (float)0.1f);
            double d0 = entity.field_70142_S + (entity.field_70165_t - entity.field_70142_S) * (double)partialTicks;
            double d1 = entity.field_70137_T + (entity.field_70163_u - entity.field_70137_T) * (double)partialTicks;
            double d2 = entity.field_70136_U + (entity.field_70161_v - entity.field_70136_U) * (double)partialTicks;
            int l = MathHelper.func_76128_c((double)d1);
            int i1 = 5;
            if (this.mc.field_71474_y.field_74347_j) {
                i1 = 10;
            }
            int j1 = -1;
            float f1 = (float)this.rendererUpdateCount + partialTicks;
            bufferbuilder.func_178969_c(-d0, -d1, -d2);
            GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
            for (int k1 = k - i1; k1 <= k + i1; ++k1) {
                for (int l1 = i - i1; l1 <= i + i1; ++l1) {
                    int i2 = (k1 - k + 16) * 32 + l1 - i + 16;
                    double d3 = (double)this.rainXCoords[i2] * 0.5;
                    double d4 = (double)this.rainYCoords[i2] * 0.5;
                    blockpos$mutableblockpos.func_181079_c(l1, 0, k1);
                    Biome biome = world.func_180494_b((BlockPos)blockpos$mutableblockpos);
                    if (!biome.func_76738_d() && !biome.func_76746_c()) continue;
                    int j2 = world.func_175725_q((BlockPos)blockpos$mutableblockpos).func_177956_o();
                    int k2 = j - i1;
                    int l2 = j + i1;
                    if (k2 < j2) {
                        k2 = j2;
                    }
                    if (l2 < j2) {
                        l2 = j2;
                    }
                    int i3 = j2;
                    if (j2 < l) {
                        i3 = l;
                    }
                    if (k2 == l2) continue;
                    this.random.setSeed(l1 * l1 * 3121 + l1 * 45238971 ^ k1 * k1 * 418711 + k1 * 13761);
                    blockpos$mutableblockpos.func_181079_c(l1, k2, k1);
                    float f2 = biome.func_180626_a((BlockPos)blockpos$mutableblockpos);
                    if (world.func_72959_q().func_76939_a(f2, j2) >= 0.15f) {
                        if (j1 != 0) {
                            if (j1 >= 0) {
                                tessellator.func_78381_a();
                            }
                            j1 = 0;
                            this.mc.func_110434_K().func_110577_a(RAIN_TEXTURES);
                            bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181704_d);
                        }
                        double d5 = -((double)(this.rendererUpdateCount + l1 * l1 * 3121 + l1 * 45238971 + k1 * k1 * 418711 + k1 * 13761 & 0x1F) + (double)partialTicks) / 32.0 * (3.0 + this.random.nextDouble());
                        double d6 = (double)((float)l1 + 0.5f) - entity.field_70165_t;
                        double d7 = (double)((float)k1 + 0.5f) - entity.field_70161_v;
                        float f3 = MathHelper.func_76133_a((double)(d6 * d6 + d7 * d7)) / (float)i1;
                        float f4 = ((1.0f - f3 * f3) * 0.5f + 0.5f) * f;
                        blockpos$mutableblockpos.func_181079_c(l1, i3, k1);
                        int j3 = world.func_175626_b((BlockPos)blockpos$mutableblockpos, 0);
                        int k3 = j3 >> 16 & 0xFFFF;
                        int l3 = j3 & 0xFFFF;
                        bufferbuilder.func_181662_b((double)l1 - d3 + 0.5, (double)l2, (double)k1 - d4 + 0.5).func_187315_a(0.0, (double)k2 * 0.25 + d5).func_181666_a(1.0f, 1.0f, 1.0f, f4).func_187314_a(k3, l3).func_181675_d();
                        bufferbuilder.func_181662_b((double)l1 + d3 + 0.5, (double)l2, (double)k1 + d4 + 0.5).func_187315_a(1.0, (double)k2 * 0.25 + d5).func_181666_a(1.0f, 1.0f, 1.0f, f4).func_187314_a(k3, l3).func_181675_d();
                        bufferbuilder.func_181662_b((double)l1 + d3 + 0.5, (double)k2, (double)k1 + d4 + 0.5).func_187315_a(1.0, (double)l2 * 0.25 + d5).func_181666_a(1.0f, 1.0f, 1.0f, f4).func_187314_a(k3, l3).func_181675_d();
                        bufferbuilder.func_181662_b((double)l1 - d3 + 0.5, (double)k2, (double)k1 - d4 + 0.5).func_187315_a(0.0, (double)l2 * 0.25 + d5).func_181666_a(1.0f, 1.0f, 1.0f, f4).func_187314_a(k3, l3).func_181675_d();
                        continue;
                    }
                    if (j1 != 1) {
                        if (j1 >= 0) {
                            tessellator.func_78381_a();
                        }
                        j1 = 1;
                        this.mc.func_110434_K().func_110577_a(SNOW_TEXTURES);
                        bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181704_d);
                    }
                    double d8 = -((float)(this.rendererUpdateCount & 0x1FF) + partialTicks) / 512.0f;
                    double d9 = this.random.nextDouble() + (double)f1 * 0.01 * (double)((float)this.random.nextGaussian());
                    double d10 = this.random.nextDouble() + (double)(f1 * (float)this.random.nextGaussian()) * 0.001;
                    double d11 = (double)((float)l1 + 0.5f) - entity.field_70165_t;
                    double d12 = (double)((float)k1 + 0.5f) - entity.field_70161_v;
                    float f6 = MathHelper.func_76133_a((double)(d11 * d11 + d12 * d12)) / (float)i1;
                    float f5 = ((1.0f - f6 * f6) * 0.3f + 0.5f) * f;
                    blockpos$mutableblockpos.func_181079_c(l1, i3, k1);
                    int i4 = (world.func_175626_b((BlockPos)blockpos$mutableblockpos, 0) * 3 + 0xF000F0) / 4;
                    int j4 = i4 >> 16 & 0xFFFF;
                    int k4 = i4 & 0xFFFF;
                    bufferbuilder.func_181662_b((double)l1 - d3 + 0.5, (double)l2, (double)k1 - d4 + 0.5).func_187315_a(0.0 + d9, (double)k2 * 0.25 + d8 + d10).func_181666_a(1.0f, 1.0f, 1.0f, f5).func_187314_a(j4, k4).func_181675_d();
                    bufferbuilder.func_181662_b((double)l1 + d3 + 0.5, (double)l2, (double)k1 + d4 + 0.5).func_187315_a(1.0 + d9, (double)k2 * 0.25 + d8 + d10).func_181666_a(1.0f, 1.0f, 1.0f, f5).func_187314_a(j4, k4).func_181675_d();
                    bufferbuilder.func_181662_b((double)l1 + d3 + 0.5, (double)k2, (double)k1 + d4 + 0.5).func_187315_a(1.0 + d9, (double)l2 * 0.25 + d8 + d10).func_181666_a(1.0f, 1.0f, 1.0f, f5).func_187314_a(j4, k4).func_181675_d();
                    bufferbuilder.func_181662_b((double)l1 - d3 + 0.5, (double)k2, (double)k1 - d4 + 0.5).func_187315_a(0.0 + d9, (double)l2 * 0.25 + d8 + d10).func_181666_a(1.0f, 1.0f, 1.0f, f5).func_187314_a(j4, k4).func_181675_d();
                }
            }
            if (j1 >= 0) {
                tessellator.func_78381_a();
            }
            bufferbuilder.func_178969_c(0.0, 0.0, 0.0);
            GlStateManager.func_179089_o();
            GlStateManager.func_179084_k();
            GlStateManager.func_179092_a((int)516, (float)0.1f);
            this.func_175072_h();
        }
    }

    public void func_78478_c() {
        ScaledResolution scaledresolution = new ScaledResolution(this.mc);
        GlStateManager.func_179086_m((int)256);
        GlStateManager.func_179128_n((int)5889);
        GlStateManager.func_179096_D();
        GlStateManager.func_179130_a((double)0.0, (double)scaledresolution.func_78327_c(), (double)scaledresolution.func_78324_d(), (double)0.0, (double)1000.0, (double)3000.0);
        GlStateManager.func_179128_n((int)5888);
        GlStateManager.func_179096_D();
        GlStateManager.func_179109_b((float)0.0f, (float)0.0f, (float)-2000.0f);
    }

    private void updateFogColor(float partialTicks) {
        float f9;
        WorldClient world = this.mc.field_71441_e;
        Entity entity = this.mc.func_175606_aa();
        float f = 0.25f + 0.75f * (float)this.mc.field_71474_y.field_151451_c / 32.0f;
        f = 1.0f - (float)Math.pow(f, 0.25);
        Vec3d vec3d = world.func_72833_a(this.mc.func_175606_aa(), partialTicks);
        float f1 = (float)vec3d.field_72450_a;
        float f2 = (float)vec3d.field_72448_b;
        float f3 = (float)vec3d.field_72449_c;
        Vec3d vec3d1 = world.func_72948_g(partialTicks);
        this.fogColorRed = (float)vec3d1.field_72450_a;
        this.fogColorGreen = (float)vec3d1.field_72448_b;
        this.fogColorBlue = (float)vec3d1.field_72449_c;
        if (this.mc.field_71474_y.field_151451_c >= 4) {
            float[] afloat;
            double d0 = MathHelper.func_76126_a((float)world.func_72929_e(partialTicks)) > 0.0f ? -1.0 : 1.0;
            Vec3d vec3d2 = new Vec3d(d0, 0.0, 0.0);
            float f5 = (float)entity.func_70676_i(partialTicks).func_72430_b(vec3d2);
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 > 0.0f && (afloat = world.field_73011_w.func_76560_a(world.func_72826_c(partialTicks), partialTicks)) != null) {
                this.fogColorRed = this.fogColorRed * (1.0f - (f5 *= afloat[3])) + afloat[0] * f5;
                this.fogColorGreen = this.fogColorGreen * (1.0f - f5) + afloat[1] * f5;
                this.fogColorBlue = this.fogColorBlue * (1.0f - f5) + afloat[2] * f5;
            }
        }
        this.fogColorRed += (f1 - this.fogColorRed) * f;
        this.fogColorGreen += (f2 - this.fogColorGreen) * f;
        this.fogColorBlue += (f3 - this.fogColorBlue) * f;
        float f8 = world.func_72867_j(partialTicks);
        if (f8 > 0.0f) {
            float f4 = 1.0f - f8 * 0.5f;
            float f10 = 1.0f - f8 * 0.4f;
            this.fogColorRed *= f4;
            this.fogColorGreen *= f4;
            this.fogColorBlue *= f10;
        }
        if ((f9 = world.func_72819_i(partialTicks)) > 0.0f) {
            float f11 = 1.0f - f9 * 0.5f;
            this.fogColorRed *= f11;
            this.fogColorGreen *= f11;
            this.fogColorBlue *= f11;
        }
        IBlockState iblockstate = ActiveRenderInfo.func_186703_a((World)this.mc.field_71441_e, (Entity)entity, (float)partialTicks);
        if (this.cloudFog) {
            Vec3d vec3d3 = world.func_72824_f(partialTicks);
            this.fogColorRed = (float)vec3d3.field_72450_a;
            this.fogColorGreen = (float)vec3d3.field_72448_b;
            this.fogColorBlue = (float)vec3d3.field_72449_c;
        } else {
            Vec3d viewport = ActiveRenderInfo.func_178806_a((Entity)entity, (double)partialTicks);
            BlockPos viewportPos = new BlockPos(viewport);
            IBlockState viewportState = this.mc.field_71441_e.func_180495_p(viewportPos);
            Vec3d inMaterialColor = viewportState.func_177230_c().getFogColor((World)this.mc.field_71441_e, viewportPos, viewportState, entity, new Vec3d((double)this.fogColorRed, (double)this.fogColorGreen, (double)this.fogColorBlue), partialTicks);
            this.fogColorRed = (float)inMaterialColor.field_72450_a;
            this.fogColorGreen = (float)inMaterialColor.field_72448_b;
            this.fogColorBlue = (float)inMaterialColor.field_72449_c;
        }
        float f13 = this.fogColor2 + (this.fogColor1 - this.fogColor2) * partialTicks;
        this.fogColorRed *= f13;
        this.fogColorGreen *= f13;
        this.fogColorBlue *= f13;
        double d1 = (entity.field_70137_T + (entity.field_70163_u - entity.field_70137_T) * (double)partialTicks) * world.field_73011_w.func_76565_k();
        if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).func_70644_a(MobEffects.field_76440_q)) {
            int i = ((EntityLivingBase)entity).func_70660_b(MobEffects.field_76440_q).func_76459_b();
            d1 = i < 20 ? (d1 *= (double)(1.0f - (float)i / 20.0f)) : 0.0;
        }
        if (d1 < 1.0) {
            if (d1 < 0.0) {
                d1 = 0.0;
            }
            d1 *= d1;
            this.fogColorRed = (float)((double)this.fogColorRed * d1);
            this.fogColorGreen = (float)((double)this.fogColorGreen * d1);
            this.fogColorBlue = (float)((double)this.fogColorBlue * d1);
        }
        if (this.bossColorModifier > 0.0f) {
            float f14 = this.bossColorModifierPrev + (this.bossColorModifier - this.bossColorModifierPrev) * partialTicks;
            this.fogColorRed = this.fogColorRed * (1.0f - f14) + this.fogColorRed * 0.7f * f14;
            this.fogColorGreen = this.fogColorGreen * (1.0f - f14) + this.fogColorGreen * 0.6f * f14;
            this.fogColorBlue = this.fogColorBlue * (1.0f - f14) + this.fogColorBlue * 0.6f * f14;
        }
        if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).func_70644_a(MobEffects.field_76439_r)) {
            float f15 = this.getNightVisionBrightness((EntityLivingBase)entity, partialTicks);
            float f6 = 1.0f / this.fogColorRed;
            if (f6 > 1.0f / this.fogColorGreen) {
                f6 = 1.0f / this.fogColorGreen;
            }
            if (f6 > 1.0f / this.fogColorBlue) {
                f6 = 1.0f / this.fogColorBlue;
            }
            this.fogColorRed = this.fogColorRed * (1.0f - f15) + this.fogColorRed * f6 * f15;
            this.fogColorGreen = this.fogColorGreen * (1.0f - f15) + this.fogColorGreen * f6 * f15;
            this.fogColorBlue = this.fogColorBlue * (1.0f - f15) + this.fogColorBlue * f6 * f15;
        }
        if (this.mc.field_71474_y.field_74337_g) {
            float f16 = (this.fogColorRed * 30.0f + this.fogColorGreen * 59.0f + this.fogColorBlue * 11.0f) / 100.0f;
            float f17 = (this.fogColorRed * 30.0f + this.fogColorGreen * 70.0f) / 100.0f;
            float f7 = (this.fogColorRed * 30.0f + this.fogColorBlue * 70.0f) / 100.0f;
            this.fogColorRed = f16;
            this.fogColorGreen = f17;
            this.fogColorBlue = f7;
        }
        EntityViewRenderEvent.FogColors event = new EntityViewRenderEvent.FogColors((EntityRenderer)this, entity, iblockstate, (double)partialTicks, this.fogColorRed, this.fogColorGreen, this.fogColorBlue);
        MinecraftForge.EVENT_BUS.post((Event)event);
        this.fogColorRed = event.getRed();
        this.fogColorGreen = event.getGreen();
        this.fogColorBlue = event.getBlue();
        GlStateManager.func_179082_a((float)this.fogColorRed, (float)this.fogColorGreen, (float)this.fogColorBlue, (float)0.0f);
    }

    private void setupFog(int startCoords, float partialTicks) {
        Entity entity = this.mc.func_175606_aa();
        this.func_191514_d(false);
        GlStateManager.func_187432_a((float)0.0f, (float)-1.0f, (float)0.0f);
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        IBlockState iblockstate = ActiveRenderInfo.func_186703_a((World)this.mc.field_71441_e, (Entity)entity, (float)partialTicks);
        float hook = ForgeHooksClient.getFogDensity((EntityRenderer)this, (Entity)entity, (IBlockState)iblockstate, (float)partialTicks, (float)0.1f);
        if (hook >= 0.0f) {
            GlStateManager.func_179095_a((float)hook);
        } else if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).func_70644_a(MobEffects.field_76440_q)) {
            float f1 = 5.0f;
            int i = ((EntityLivingBase)entity).func_70660_b(MobEffects.field_76440_q).func_76459_b();
            if (i < 20) {
                f1 = 5.0f + (this.farPlaneDistance - 5.0f) * (1.0f - (float)i / 20.0f);
            }
            GlStateManager.func_187430_a((GlStateManager.FogMode)GlStateManager.FogMode.LINEAR);
            if (startCoords == -1) {
                GlStateManager.func_179102_b((float)0.0f);
                GlStateManager.func_179153_c((float)(f1 * 0.8f));
            } else {
                GlStateManager.func_179102_b((float)(f1 * 0.25f));
                GlStateManager.func_179153_c((float)f1);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GlStateManager.func_187412_c((int)34138, (int)34139);
            }
        } else if (this.cloudFog) {
            GlStateManager.func_187430_a((GlStateManager.FogMode)GlStateManager.FogMode.EXP);
            GlStateManager.func_179095_a((float)0.1f);
        } else if (iblockstate.func_185904_a() == Material.field_151586_h) {
            GlStateManager.func_187430_a((GlStateManager.FogMode)GlStateManager.FogMode.EXP);
            if (entity instanceof EntityLivingBase) {
                if (((EntityLivingBase)entity).func_70644_a(MobEffects.field_76427_o)) {
                    GlStateManager.func_179095_a((float)0.01f);
                } else {
                    GlStateManager.func_179095_a((float)(0.1f - (float)EnchantmentHelper.func_185292_c((EntityLivingBase)((EntityLivingBase)entity)) * 0.03f));
                }
            } else {
                GlStateManager.func_179095_a((float)0.1f);
            }
        } else if (iblockstate.func_185904_a() == Material.field_151587_i) {
            GlStateManager.func_187430_a((GlStateManager.FogMode)GlStateManager.FogMode.EXP);
            GlStateManager.func_179095_a((float)2.0f);
        } else {
            float f = this.farPlaneDistance;
            GlStateManager.func_187430_a((GlStateManager.FogMode)GlStateManager.FogMode.LINEAR);
            if (startCoords == -1) {
                GlStateManager.func_179102_b((float)0.0f);
                GlStateManager.func_179153_c((float)f);
            } else {
                GlStateManager.func_179102_b((float)(f * 0.75f));
                GlStateManager.func_179153_c((float)f);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GlStateManager.func_187412_c((int)34138, (int)34139);
            }
            if (this.mc.field_71441_e.field_73011_w.func_76568_b((int)entity.field_70165_t, (int)entity.field_70161_v) || this.mc.field_71456_v.func_184046_j().func_184056_f()) {
                GlStateManager.func_179102_b((float)(f * 0.05f));
                GlStateManager.func_179153_c((float)(Math.min(f, 192.0f) * 0.5f));
            }
            ForgeHooksClient.onFogRender((EntityRenderer)this, (Entity)entity, (IBlockState)iblockstate, (float)partialTicks, (int)startCoords, (float)f);
        }
        GlStateManager.func_179142_g();
        GlStateManager.func_179127_m();
        GlStateManager.func_179104_a((int)1028, (int)4608);
    }

    public void func_191514_d(boolean black) {
        if (black) {
            GlStateManager.func_187402_b((int)2918, (FloatBuffer)this.setFogColorBuffer(0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            GlStateManager.func_187402_b((int)2918, (FloatBuffer)this.setFogColorBuffer(this.fogColorRed, this.fogColorGreen, this.fogColorBlue, 1.0f));
        }
    }

    private FloatBuffer setFogColorBuffer(float red, float green, float blue, float alpha) {
        this.fogColorBuffer.clear();
        this.fogColorBuffer.put(red).put(green).put(blue).put(alpha);
        this.fogColorBuffer.flip();
        return this.fogColorBuffer;
    }

    public void func_190564_k() {
        this.itemActivationItem = null;
        this.mapItemRenderer.func_148249_a();
    }

    public MapItemRenderer func_147701_i() {
        return this.mapItemRenderer;
    }

    public static void drawNameplate(FontRenderer fontRendererIn, String str, float x, float y, float z, int verticalShift, float viewerYaw, float viewerPitch, boolean isThirdPersonFrontal, boolean isSneaking) {
        GlStateManager.func_179094_E();
        GlStateManager.func_179109_b((float)x, (float)y, (float)z);
        GlStateManager.func_187432_a((float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)(-viewerYaw), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)((float)(isThirdPersonFrontal ? -1 : 1) * viewerPitch), (float)1.0f, (float)0.0f, (float)0.0f);
        GlStateManager.func_179152_a((float)-0.025f, (float)-0.025f, (float)0.025f);
        GlStateManager.func_179140_f();
        GlStateManager.func_179132_a((boolean)false);
        if (!isSneaking) {
            GlStateManager.func_179097_i();
        }
        GlStateManager.func_179147_l();
        GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        int i = fontRendererIn.func_78256_a(str) / 2;
        GlStateManager.func_179090_x();
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferbuilder = tessellator.func_178180_c();
        bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        bufferbuilder.func_181662_b((double)(-i - 1), (double)(-1 + verticalShift), 0.0).func_181666_a(0.0f, 0.0f, 0.0f, 0.25f).func_181675_d();
        bufferbuilder.func_181662_b((double)(-i - 1), (double)(8 + verticalShift), 0.0).func_181666_a(0.0f, 0.0f, 0.0f, 0.25f).func_181675_d();
        bufferbuilder.func_181662_b((double)(i + 1), (double)(8 + verticalShift), 0.0).func_181666_a(0.0f, 0.0f, 0.0f, 0.25f).func_181675_d();
        bufferbuilder.func_181662_b((double)(i + 1), (double)(-1 + verticalShift), 0.0).func_181666_a(0.0f, 0.0f, 0.0f, 0.25f).func_181675_d();
        tessellator.func_78381_a();
        GlStateManager.func_179098_w();
        if (!isSneaking) {
            fontRendererIn.func_78276_b(str, -fontRendererIn.func_78256_a(str) / 2, verticalShift, 0x20FFFFFF);
            GlStateManager.func_179126_j();
        }
        GlStateManager.func_179132_a((boolean)true);
        fontRendererIn.func_78276_b(str, -fontRendererIn.func_78256_a(str) / 2, verticalShift, isSneaking ? 0x20FFFFFF : -1);
        GlStateManager.func_179145_e();
        GlStateManager.func_179084_k();
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.func_179121_F();
    }

    public void func_190565_a(ItemStack p_190565_1_) {
        this.itemActivationItem = p_190565_1_;
        this.itemActivationTicks = 40;
        this.itemActivationOffX = this.random.nextFloat() * 2.0f - 1.0f;
        this.itemActivationOffY = this.random.nextFloat() * 2.0f - 1.0f;
    }

    private void renderItemActivation(int p_190563_1_, int p_190563_2_, float p_190563_3_) {
        if (this.itemActivationItem != null && this.itemActivationTicks > 0) {
            int i = 40 - this.itemActivationTicks;
            float f = ((float)i + p_190563_3_) / 40.0f;
            float f1 = f * f;
            float f2 = f * f1;
            float f3 = 10.25f * f2 * f1 + -24.95f * f1 * f1 + 25.5f * f2 + -13.8f * f1 + 4.0f * f;
            float f4 = f3 * (float)Math.PI;
            float f5 = this.itemActivationOffX * (float)(p_190563_1_ / 4);
            float f6 = this.itemActivationOffY * (float)(p_190563_2_ / 4);
            GlStateManager.func_179141_d();
            GlStateManager.func_179094_E();
            GlStateManager.func_179123_a();
            GlStateManager.func_179126_j();
            GlStateManager.func_179129_p();
            RenderHelper.func_74519_b();
            GlStateManager.func_179109_b((float)((float)(p_190563_1_ / 2) + f5 * MathHelper.func_76135_e((float)MathHelper.func_76126_a((float)(f4 * 2.0f)))), (float)((float)(p_190563_2_ / 2) + f6 * MathHelper.func_76135_e((float)MathHelper.func_76126_a((float)(f4 * 2.0f)))), (float)-50.0f);
            float f7 = 50.0f + 175.0f * MathHelper.func_76126_a((float)f4);
            GlStateManager.func_179152_a((float)f7, (float)(-f7), (float)f7);
            GlStateManager.func_179114_b((float)(900.0f * MathHelper.func_76135_e((float)MathHelper.func_76126_a((float)f4))), (float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)(6.0f * MathHelper.func_76134_b((float)(f * 8.0f))), (float)1.0f, (float)0.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)(6.0f * MathHelper.func_76134_b((float)(f * 8.0f))), (float)0.0f, (float)0.0f, (float)1.0f);
            this.mc.func_175599_af().func_181564_a(this.itemActivationItem, ItemCameraTransforms.TransformType.FIXED);
            GlStateManager.func_179099_b();
            GlStateManager.func_179121_F();
            RenderHelper.func_74518_a();
            GlStateManager.func_179089_o();
            GlStateManager.func_179097_i();
        }
    }

    public void setPrepareTerrain(boolean prepareTerrain) {
        this.prepareTerrain = prepareTerrain;
    }

    public void setShaderGroup(ShaderGroup shaderGroup) {
        this.shaderGroup = shaderGroup;
    }

    public void useShader(boolean useShader) {
        this.useShader = useShader;
    }

    static {
        SHADERS_TEXTURES = new ResourceLocation[]{new ResourceLocation("shaders/post/notch.json"), new ResourceLocation("shaders/post/fxaa.json"), new ResourceLocation("shaders/post/art.json"), new ResourceLocation("shaders/post/bumpy.json"), new ResourceLocation("shaders/post/blobs2.json"), new ResourceLocation("shaders/post/pencil.json"), new ResourceLocation("shaders/post/color_convolve.json"), new ResourceLocation("shaders/post/deconverge.json"), new ResourceLocation("shaders/post/flip.json"), new ResourceLocation("shaders/post/invert.json"), new ResourceLocation("shaders/post/ntsc.json"), new ResourceLocation("shaders/post/outline.json"), new ResourceLocation("shaders/post/phosphor.json"), new ResourceLocation("shaders/post/scan_pincushion.json"), new ResourceLocation("shaders/post/sobel.json"), new ResourceLocation("shaders/post/bits.json"), new ResourceLocation("shaders/post/desaturate.json"), new ResourceLocation("shaders/post/green.json"), new ResourceLocation("shaders/post/blur.json"), new ResourceLocation("shaders/post/wobble.json"), new ResourceLocation("shaders/post/blobs.json"), new ResourceLocation("shaders/post/antialias.json"), new ResourceLocation("shaders/post/creeper.json"), new ResourceLocation("shaders/post/spider.json")};
        SHADER_COUNT = SHADERS_TEXTURES.length;
    }
}


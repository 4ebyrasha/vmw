/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.entity.RenderPlayer
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.client.shader.ShaderManager
 *  net.minecraft.client.shader.ShaderUniform
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAITarget
 *  net.minecraft.entity.ai.attributes.IAttribute
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.GameRules
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldType
 *  net.minecraftforge.client.event.FOVUpdateEvent
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.client.event.MouseEvent
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Pre
 *  net.minecraftforge.client.event.RenderLivingEvent$Pre
 *  net.minecraftforge.event.entity.item.ItemTossEvent
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.Explosion;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibleAchievement;
import com.vicmatskiv.weaponlib.compatibility.CompatibleAxisAlignedBB;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBiomeType;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEnumFacing;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.compatibility.CompatibleLivingHurtEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMathHelper;
import com.vicmatskiv.weaponlib.compatibility.CompatibleParticle;
import com.vicmatskiv.weaponlib.compatibility.CompatibleParticleManager;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderingRegistry;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSharedMonsterAttributes;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.compatibility.CompatibleVec3;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWorldGenerator;
import com.vicmatskiv.weaponlib.inventory.GuiHandler;
import com.vicmatskiv.weaponlib.tile.CustomTileEntityRenderer;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderManager;
import net.minecraft.client.shader.ShaderUniform;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;

public interface Compatibility {
    public World world(Entity var1);

    public EntityPlayer clientPlayer();

    public void setClientPlayer(EntityPlayer var1);

    public IAttribute getMovementSpeedAttribute();

    public NBTTagCompound getTagCompound(ItemStack var1);

    public void setTagCompound(ItemStack var1, NBTTagCompound var2);

    public ItemStack getItemStack(ItemTossEvent var1);

    public EntityPlayer getPlayer(ItemTossEvent var1);

    public ItemStack getHeldItemMainHand(EntityLivingBase var1);

    public boolean consumeInventoryItem(EntityPlayer var1, Item var2);

    public int getCurrentInventoryItemIndex(EntityPlayer var1);

    public void ensureTagCompound(ItemStack var1);

    public void playSound(EntityLivingBase var1, CompatibleSound var2, float var3, float var4);

    public void playSoundToNearExcept(EntityLivingBase var1, CompatibleSound var2, float var3, float var4);

    public boolean isClientSide();

    public CompatibleMathHelper getMathHelper();

    public EntityPlayer getClientPlayer();

    public FontRenderer getFontRenderer();

    public ScaledResolution getResolution(RenderGameOverlayEvent.Pre var1);

    public RenderGameOverlayEvent.ElementType getEventType(RenderGameOverlayEvent.Pre var1);

    public ItemStack getHelmet();

    public ItemStack getHelmet(EntityLivingBase var1);

    public CompatibleVec3 getLookVec(EntityPlayer var1);

    public void registerKeyBinding(KeyBinding var1);

    public void registerWithEventBus(Object var1);

    public void registerWithFmlEventBus(Object var1);

    public void registerSound(CompatibleSound var1);

    public void registerItem(Item var1, String var2);

    public void registerItem(Item var1, ResourceLocation var2);

    public void registerItem(String var1, Item var2, String var3);

    public void runInMainClientThread(Runnable var1);

    public void registerModEntity(Class<? extends Entity> var1, String var2, int var3, Object var4, String var5, int var6, int var7, boolean var8);

    public void registerRenderingRegistry(CompatibleRenderingRegistry var1);

    public <T, E> T getPrivateValue(Class<? super E> var1, E var2, String ... var3);

    public int getButton(MouseEvent var1);

    public EntityPlayer getEntity(FOVUpdateEvent var1);

    public EntityLivingBase getEntity(RenderLivingEvent.Pre var1);

    public void setNewFov(FOVUpdateEvent var1, float var2);

    public RenderPlayer getRenderer(RenderLivingEvent.Pre var1);

    public GuiScreen getGui(GuiOpenEvent var1);

    public void setAimed(RenderPlayer var1, boolean var2);

    public CompatibleRayTraceResult getObjectMouseOver();

    public CompatibleBlockState getBlockAtPosition(World var1, CompatibleRayTraceResult var2);

    public void destroyBlock(World var1, CompatibleRayTraceResult var2);

    public boolean addItemToPlayerInventory(EntityPlayer var1, Item var2, int var3);

    public boolean consumeInventoryItem(InventoryPlayer var1, Item var2);

    public ItemStack itemStackForItem(Item var1, Predicate<ItemStack> var2, EntityPlayer var3);

    public boolean isGlassBlock(CompatibleBlockState var1);

    public float getEffectOffsetX();

    public float getEffectOffsetY();

    public float getEffectScaleFactor();

    public void spawnEntity(EntityLivingBase var1, Entity var2);

    public void moveParticle(CompatibleParticle var1, double var2, double var4, double var6);

    public int getStackSize(ItemStack var1);

    public ItemStack consumeInventoryItem(Item var1, Predicate<ItemStack> var2, EntityPlayer var3, int var4);

    public ItemStack getInventoryItemStack(EntityPlayer var1, int var2);

    public int getInventorySlot(EntityPlayer var1, ItemStack var2);

    public boolean consumeInventoryItemFromSlot(EntityPlayer var1, int var2);

    public void addShapedRecipe(ItemStack var1, Object ... var2);

    public void addShapedOreRecipe(ItemStack var1, Object ... var2);

    public void disableLightMap();

    public void enableLightMap();

    public void registerBlock(ModContext var1, Block var2, String var3);

    public void registerWorldGenerator(CompatibleWorldGenerator var1, int var2);

    public ItemArmor.ArmorMaterial addArmorMaterial(String var1, String var2, int var3, int[] var4, int var5, CompatibleSound var6, float var7);

    public boolean inventoryHasFreeSlots(EntityPlayer var1);

    public void addBlockHitEffect(int var1, int var2, int var3, CompatibleEnumFacing var4);

    public String getDisplayName(EntityPlayer var1);

    public String getPlayerName(EntityPlayer var1);

    public void clickBlock(CompatibleBlockPos var1, CompatibleEnumFacing var2);

    public boolean isAirBlock(World var1, CompatibleBlockPos var2);

    public void addChatMessage(Entity var1, String var2);

    public RenderGlobal createCompatibleRenderGlobal();

    public CompatibleParticleManager createCompatibleParticleManager(WorldClient var1);

    public Entity getRenderViewEntity();

    public void setRenderViewEntity(Entity var1);

    public CompatibleParticleManager getCompatibleParticleManager();

    public void addBreakingParticle(ModContext var1, double var2, double var4, double var6);

    public float getAspectRatio(ModContext var1);

    public void setStackSize(ItemStack var1, int var2);

    public ItemStack tryConsumingCompatibleItem(List<? extends Item> var1, int var2, EntityPlayer var3, Predicate<ItemStack> ... var4);

    public Item findItemByName(String var1, String var2);

    public CompatibleRayTraceResult rayTraceBlocks(Entity var1, CompatibleVec3 var2, CompatibleVec3 var3);

    public CompatibleAxisAlignedBB expandEntityBoundingBox(Entity var1, double var2, double var4, double var6);

    public CompatibleAxisAlignedBB getBoundingBox(Entity var1);

    public List<Entity> getEntitiesWithinAABBExcludingEntity(World var1, Entity var2, CompatibleAxisAlignedBB var3);

    public void spawnParticle(World var1, String var2, double var3, double var5, double var7, double var9, double var11, double var13);

    public CompatibleBlockState getBlockAtPosition(World var1, CompatibleBlockPos var2);

    public boolean isBlockPenetratableByBullets(Block var1);

    public boolean isBlockPenetratableByBullets(CompatibleBlockState var1);

    public boolean canCollideCheck(Block var1, CompatibleBlockState var2, boolean var3);

    public float getCompatibleShellCasingForwardOffset();

    public boolean madeFromHardMaterial(CompatibleBlockState var1);

    public void playSoundAtEntity(Entity var1, CompatibleSound var2, float var3, float var4);

    public double getBlockDensity(World var1, CompatibleVec3 var2, CompatibleAxisAlignedBB var3);

    public boolean isImmuneToExplosions(Entity var1);

    public boolean isAirBlock(CompatibleBlockState var1);

    public boolean canDropBlockFromExplosion(CompatibleBlockState var1, Explosion var2);

    public void onBlockExploded(World var1, CompatibleBlockState var2, CompatibleBlockPos var3, Explosion var4);

    public float getExplosionResistance(World var1, CompatibleBlockState var2, CompatibleBlockPos var3, Entity var4, Explosion var5);

    public float getExplosionResistance(World var1, Entity var2, Explosion var3, CompatibleBlockPos var4, CompatibleBlockState var5);

    public boolean isSpectator(EntityPlayer var1);

    public boolean isCreative(EntityPlayer var1);

    public void setBlockToFire(World var1, CompatibleBlockPos var2);

    public DamageSource getDamageSource(Explosion var1);

    public double getBlastDamageReduction(EntityLivingBase var1, double var2);

    public boolean verifyExplosion(World var1, Entity var2, Explosion var3, CompatibleBlockPos var4, CompatibleBlockState var5, float var6);

    public boolean isFullBlock(CompatibleBlockState var1);

    public void dropBlockAsItemWithChance(World var1, CompatibleBlockState var2, CompatibleBlockPos var3, float var4, int var5);

    public CompatibleBlockState getBlockBelow(World var1, CompatibleBlockPos var2);

    public void playSound(World var1, double var2, double var4, double var6, CompatibleSound var8, float var9, float var10);

    public boolean isBlockPenetratableByGrenades(Block var1);

    public DamageSource genericDamageSource();

    public boolean isCollided(CompatibleParticle var1);

    public ItemStack createItemStack(CompatibleItems var1, int var2, int var3);

    public void addSmelting(Block var1, ItemStack var2, float var3);

    public void addSmelting(Item var1, ItemStack var2, float var3);

    public boolean isFlying(EntityPlayer var1);

    public String getLocalizedString(String var1, Object ... var2);

    public ShaderUniform getShaderUniform(ShaderManager var1, String var2);

    public void setUniform(ShaderUniform var1, float var2);

    public void setUniform(ShaderUniform var1, float var2, float var3);

    public void setUniform(ShaderUniform var1, float var2, float var3, float var4);

    public void setUniform(ShaderUniform var1, float var2, float var3, float var4, float var5);

    public CompatibleVec3 getLookVec(EntityLivingBase var1);

    public void setEntityAttribute(EntityLivingBase var1, CompatibleSharedMonsterAttributes var2, double var3);

    public EnumDifficulty getDifficulty(World var1);

    public void addStat(EntityPlayer var1, CompatibleAchievement var2);

    public float getLightBrightness(World var1, CompatibleBlockPos var2);

    public void setItemStackToSlot(Entity var1, CompatibleEntityEquipmentSlot var2, ItemStack var3);

    public boolean isStrafingSupported();

    public void strafe(EntityCustomMob var1, float var2, float var3);

    public void addSpawn(Class<? extends EntityLiving> var1, int var2, int var3, int var4, CompatibleBiomeType ... var5);

    public void registerEgg(ModContext var1, Class<? extends Entity> var2, String var3, int var4, int var5);

    public void useShader(EntityRenderer var1, boolean var2);

    public boolean is3dRenderable(Item var1);

    public float getCompatibleAimingRotationYaw(EntityLivingBase var1);

    public <T> void setPrivateValue(Class<T> var1, T var2, Object var3, String ... var4);

    public ItemStack createItemStack(NBTTagCompound var1);

    public EntityAITarget createAINearestAttackableTarget(EntityLivingBase var1, Class<? extends EntityLivingBase> var2, boolean var3);

    public EntityAIBase createAiAvoidEntity(EntityLivingBase var1, Class<? extends EntityLivingBase> var2, float var3, double var4, double var6);

    public Entity getTrueDamageSource(DamageSource var1);

    public ShaderGroup getShaderGroup(EntityRenderer var1);

    public void setShaderGroup(EntityRenderer var1, ShaderGroup var2);

    public WorldType getWorldType(World var1);

    public ItemStack tryConsumingCompatibleItem(Collection<? extends Item> var1, Comparator<ItemStack> var2, EntityPlayer var3);

    public ItemStack getItemStackFromSlot(CompatibleEntityEquipmentSlot var1);

    public boolean isStencilEnabled(Framebuffer var1);

    public void enableStencil(Framebuffer var1);

    public void resizeEntityBoundingBox(Entity var1, double var2, double var4, double var6);

    public void renderRightLegwear(ModelBiped var1, float var2);

    public void renderLeftLegwear(ModelBiped var1, float var2);

    public void renderRightArmwear(ModelBiped var1, float var2);

    public void renderLeftArmwear(ModelBiped var1, float var2);

    public void renderBodywear(ModelBiped var1, float var2);

    public void renderHeadwear(ModelBiped var1, float var2);

    public boolean isShadersModEnabled();

    public float getFlashIntencityFactor();

    public void setUniqueId(NBTTagCompound var1, String var2, UUID var3);

    public UUID getUniqueId(NBTTagCompound var1, String var2);

    public Entity getEntityByUuid(UUID var1, World var2);

    public TileEntity getTileEntity(World var1, CompatibleBlockPos var2);

    public void registerTileEntity(Class<? extends TileEntity> var1, String var2);

    public <T extends TileEntity> void bindTileEntitySpecialRenderer(Class<? extends TileEntity> var1, CustomTileEntityRenderer var2);

    public boolean isValidArmor(ItemStack var1, CompatibleEntityEquipmentSlot var2, Entity var3);

    public CompatibleEntityEquipmentSlot getArmorType(ItemArmor var1);

    public double getEntityYOffset(Entity var1);

    public NBTTagCompound readTagCompound(PacketBuffer var1) throws IOException;

    public void writeTagCompound(PacketBuffer var1, NBTTagCompound var2) throws IOException;

    public void closeScreen();

    public void applyArmor(CompatibleLivingHurtEvent var1, EntityLivingBase var2, ItemStack[] var3, DamageSource var4, float var5);

    public void dropItem(EntityPlayer var1, ItemStack var2, boolean var3, boolean var4);

    public void registerGuiHandler(Object var1, GuiHandler var2);

    public void renderItem(EntityPlayer var1, ItemStack var2);

    public float getSmokeEffectScaleFactor();

    public void adjustCustomEquippedPosition();

    public void markBlockForUpdate(World var1, CompatibleBlockPos var2);

    public boolean getGameRulesBooleanValue(GameRules var1, String var2);

    public ItemStack getEntityItem(EntityItem var1);

    public DamageSource mobDamageSource(EntityLivingBase var1);

    public ItemStack stackForEmptySlot();

    public float getBlockDensity(World var1, CompatibleVec3 var2, CompatibleAxisAlignedBB var3, BiPredicate<Block, CompatibleBlockState> var4);

    public int removeMatchingInventoryItemStacks(EntityPlayer var1, Item var2, int var3);

    public int getMatchingInventoryItemStack(EntityPlayer var1, Item var2);
}


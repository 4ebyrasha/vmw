/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelBiped$ArmPose
 *  net.minecraft.client.model.ModelPlayer
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.entity.RenderPlayer
 *  net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.client.shader.ShaderManager
 *  net.minecraft.client.shader.ShaderUniform
 *  net.minecraft.enchantment.EnchantmentProtection
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureType
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIAvoidEntity
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAINearestAttackableTarget
 *  net.minecraft.entity.ai.EntityAITarget
 *  net.minecraft.entity.ai.attributes.IAttribute
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.translation.I18n
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.Explosion
 *  net.minecraft.world.GameRules
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraft.world.WorldType
 *  net.minecraft.world.biome.Biome
 *  net.minecraftforge.client.event.FOVUpdateEvent
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.client.event.MouseEvent
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Pre
 *  net.minecraftforge.client.event.RenderLivingEvent$Pre
 *  net.minecraftforge.common.BiomeDictionary
 *  net.minecraftforge.common.BiomeDictionary$Type
 *  net.minecraftforge.common.ISpecialArmor$ArmorProperties
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.common.util.EnumHelper
 *  net.minecraftforge.event.entity.item.ItemTossEvent
 *  net.minecraftforge.fml.client.FMLClientHandler
 *  net.minecraftforge.fml.client.registry.ClientRegistry
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.IWorldGenerator
 *  net.minecraftforge.fml.common.Loader
 *  net.minecraftforge.fml.common.ObfuscationReflectionHelper
 *  net.minecraftforge.fml.common.network.IGuiHandler
 *  net.minecraftforge.fml.common.network.NetworkRegistry
 *  net.minecraftforge.fml.common.registry.EntityRegistry
 *  net.minecraftforge.fml.common.registry.ForgeRegistries
 *  net.minecraftforge.fml.common.registry.GameRegistry
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  net.minecraftforge.oredict.ShapedOreRecipe
 *  net.minecraftforge.registries.IForgeRegistryEntry
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.Explosion;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.Compatibility;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
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
import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTracing;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderGlobal;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderingRegistry;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSharedMonsterAttributes;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.compatibility.CompatibleVec3;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWorldGenerator;
import com.vicmatskiv.weaponlib.inventory.GuiHandler;
import com.vicmatskiv.weaponlib.tile.CustomTileEntityRenderer;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderManager;
import net.minecraft.client.shader.ShaderUniform;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class Compatibility1_12_2
implements Compatibility {
    private static final float DEFAULT_SHELL_CASING_FORWARD_OFFSET = 0.1f;
    private static DamageSource GENERIC_DAMAGE_SOURCE = new DamageSource("thrown");
    private static CompatibleMathHelper mathHelper = new CompatibleMathHelper();
    private Optional<Field> shadersEnabledFieldOptional;

    @Override
    public World world(Entity entity) {
        return entity.field_70170_p;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public EntityPlayer clientPlayer() {
        return Minecraft.func_71410_x().field_71439_g;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void setClientPlayer(EntityPlayer player) {
        Minecraft.func_71410_x().field_71439_g = (EntityPlayerSP)player;
    }

    @Override
    public void spawnEntity(EntityLivingBase player, Entity entity) {
        if (player != null) {
            player.field_70170_p.func_72838_d(entity);
        }
    }

    @Override
    public void moveParticle(CompatibleParticle particle, double motionX, double motionY, double motionZ) {
        particle.func_187110_a(motionX, motionY, motionZ);
    }

    @Override
    public int getStackSize(ItemStack consumedStack) {
        return consumedStack.func_190916_E();
    }

    @Override
    public NBTTagCompound getTagCompound(ItemStack itemStack) {
        return itemStack.func_77978_p();
    }

    @Override
    public ItemStack getItemStack(ItemTossEvent event) {
        return event.getEntityItem().func_92059_d();
    }

    @Override
    public EntityPlayer getPlayer(ItemTossEvent event) {
        return event.getPlayer();
    }

    @Override
    public ItemStack getHeldItemMainHand(EntityLivingBase player) {
        return player.func_184614_ca();
    }

    @Override
    public boolean consumeInventoryItem(EntityPlayer player, Item item) {
        return this.consumeInventoryItem(player.field_71071_by, item);
    }

    @Override
    public void ensureTagCompound(ItemStack itemStack) {
        if (itemStack.func_77978_p() == null) {
            itemStack.func_77982_d(new NBTTagCompound());
        }
    }

    @Override
    public void playSound(EntityLivingBase player, CompatibleSound sound, float volume, float pitch) {
        if (sound != null) {
            player.func_184185_a(sound.getSound(), volume, pitch);
        }
    }

    @Override
    public IAttribute getMovementSpeedAttribute() {
        return SharedMonsterAttributes.field_111263_d;
    }

    @Override
    public void setTagCompound(ItemStack itemStack, NBTTagCompound tagCompound) {
        itemStack.func_77982_d(tagCompound);
    }

    @Override
    public boolean isClientSide() {
        return FMLCommonHandler.instance().getSide() == Side.CLIENT;
    }

    @Override
    public CompatibleMathHelper getMathHelper() {
        return mathHelper;
    }

    @Override
    public void playSoundToNearExcept(EntityLivingBase player, CompatibleSound sound, float volume, float pitch) {
        player.field_70170_p.func_184148_a(player instanceof EntityPlayer ? (EntityPlayer)player : null, player.field_70165_t, player.field_70163_u, player.field_70161_v, sound.getSound(), player.func_184176_by(), volume, pitch);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public EntityPlayer getClientPlayer() {
        return FMLClientHandler.instance().getClientPlayerEntity();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public FontRenderer getFontRenderer() {
        return Minecraft.func_71410_x().field_71466_p;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public ScaledResolution getResolution(RenderGameOverlayEvent.Pre event) {
        return event.getResolution();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public RenderGameOverlayEvent.ElementType getEventType(RenderGameOverlayEvent.Pre event) {
        return event.getType();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public ItemStack getHelmet() {
        return Minecraft.func_71410_x().field_71439_g.func_184582_a(EntityEquipmentSlot.HEAD);
    }

    @Override
    public CompatibleVec3 getLookVec(EntityPlayer player) {
        return new CompatibleVec3(player.func_70040_Z());
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void registerKeyBinding(KeyBinding key) {
        ClientRegistry.registerKeyBinding((KeyBinding)key);
    }

    @Override
    public void registerWithEventBus(Object object) {
        MinecraftForge.EVENT_BUS.register(object);
    }

    @Override
    public void registerWithFmlEventBus(Object object) {
        MinecraftForge.EVENT_BUS.register(object);
    }

    @Override
    public void registerSound(CompatibleSound sound) {
        sound.getSound().setRegistryName(sound.getResourceLocation());
        ForgeRegistries.SOUND_EVENTS.register((IForgeRegistryEntry)sound.getSound());
    }

    @Override
    public void registerItem(Item item, String name) {
        item.setRegistryName("mw", name);
        ForgeRegistries.ITEMS.register((IForgeRegistryEntry)item);
    }

    @Override
    public void registerItem(Item item, ResourceLocation name) {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register((IForgeRegistryEntry)item);
    }

    @Override
    public void registerItem(String modId, Item item, String name) {
        if (item.getRegistryName() == null) {
            String registryName = item.func_77658_a().toLowerCase();
            int indexOfPrefix = registryName.indexOf("." + modId);
            if (indexOfPrefix > 0) {
                registryName = registryName.substring(indexOfPrefix + modId.length() + 2);
            }
            item.setRegistryName(modId, registryName);
        }
        ForgeRegistries.ITEMS.register((IForgeRegistryEntry)item);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void runInMainClientThread(Runnable runnable) {
        Minecraft.func_71410_x().func_152344_a(runnable);
    }

    @Override
    public void registerModEntity(Class<? extends Entity> entityClass, String entityName, int id, Object mod, String modId, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
        EntityRegistry.registerModEntity((ResourceLocation)new ResourceLocation(modId, entityName), entityClass, (String)entityName, (int)id, (Object)mod, (int)trackingRange, (int)updateFrequency, (boolean)sendsVelocityUpdates);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void registerRenderingRegistry(CompatibleRenderingRegistry rendererRegistry) {
    }

    @Override
    public <T, E> T getPrivateValue(Class<? super E> classToAccess, E instance, String ... fieldNames) {
        return (T)ObfuscationReflectionHelper.getPrivateValue(classToAccess, instance, (String[])fieldNames);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public int getButton(MouseEvent event) {
        return event.getButton();
    }

    @Override
    public EntityPlayer getEntity(FOVUpdateEvent event) {
        return event.getEntity();
    }

    @Override
    public EntityLivingBase getEntity(RenderLivingEvent.Pre event) {
        return event.getEntity();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void setNewFov(FOVUpdateEvent event, float fov) {
        event.setNewfov(fov);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public RenderPlayer getRenderer(RenderLivingEvent.Pre event) {
        return (RenderPlayer)event.getRenderer();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public GuiScreen getGui(GuiOpenEvent event) {
        return event.getGui();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void setAimed(RenderPlayer rp, boolean aimed) {
        if (aimed) {
            rp.func_177087_b().field_187075_l = ModelBiped.ArmPose.BOW_AND_ARROW;
            rp.func_177087_b().field_187076_m = ModelBiped.ArmPose.BOW_AND_ARROW;
        } else {
            rp.func_177087_b().field_187075_l = ModelBiped.ArmPose.EMPTY;
            rp.func_177087_b().field_187076_m = ModelBiped.ArmPose.ITEM;
        }
    }

    @Override
    public CompatibleRayTraceResult getObjectMouseOver() {
        return CompatibleRayTraceResult.fromRayTraceResult(Minecraft.func_71410_x().field_71476_x);
    }

    @Override
    public CompatibleBlockState getBlockAtPosition(World world, CompatibleRayTraceResult position) {
        IBlockState blockState = world.func_180495_p(new BlockPos(position.getBlockPosX(), position.getBlockPosY(), position.getBlockPosZ()));
        return CompatibleBlockState.fromBlockState(blockState);
    }

    @Override
    public void destroyBlock(World world, CompatibleRayTraceResult position) {
        world.func_175655_b(new BlockPos(position.getBlockPosX(), position.getBlockPosY(), position.getBlockPosZ()), true);
    }

    @Override
    public boolean consumeInventoryItem(InventoryPlayer inventoryPlayer, Item item) {
        boolean result = false;
        for (int i = 0; i < inventoryPlayer.func_70302_i_(); ++i) {
            ItemStack stack = inventoryPlayer.func_70301_a(i);
            if (stack == null || stack.func_77973_b() != item) continue;
            stack.func_190918_g(1);
            if (stack.func_190916_E() <= 0) {
                inventoryPlayer.func_70299_a(i, null);
            }
            result = true;
            break;
        }
        return result;
    }

    @Override
    public ItemStack itemStackForItem(Item item, Predicate<ItemStack> condition, EntityPlayer player) {
        ItemStack result = null;
        for (int i = 0; i < player.field_71071_by.func_70302_i_(); ++i) {
            ItemStack stack = player.field_71071_by.func_70301_a(i);
            if (stack == null || stack.func_77973_b() != item || !condition.test(stack)) continue;
            result = stack;
            break;
        }
        return result;
    }

    @Override
    public boolean isGlassBlock(CompatibleBlockState blockState) {
        Block block = blockState.getBlockState().func_177230_c();
        return block == Blocks.field_150359_w || block == Blocks.field_150410_aZ || block == Blocks.field_150399_cn || block == Blocks.field_150397_co;
    }

    @Override
    public float getEffectOffsetX() {
        return -0.02f;
    }

    @Override
    public float getEffectOffsetY() {
        return -1.65f;
    }

    @Override
    public float getEffectScaleFactor() {
        return 2.0f;
    }

    @Override
    public int getCurrentInventoryItemIndex(EntityPlayer player) {
        return player.field_71071_by.field_70461_c;
    }

    @Override
    public boolean addItemToPlayerInventory(EntityPlayer player, Item item, int slot) {
        boolean result = false;
        if (slot == -1) {
            player.field_71071_by.func_70441_a(new ItemStack(item));
        } else if (player.field_71071_by.field_70462_a.get(slot) == null || ((ItemStack)player.field_71071_by.field_70462_a.get(slot)).func_77973_b() == Items.field_190931_a) {
            player.field_71071_by.field_70462_a.set(slot, (Object)new ItemStack(item));
        }
        return result;
    }

    @Override
    public ItemStack getInventoryItemStack(EntityPlayer player, int inventoryItemIndex) {
        return player.field_71071_by.func_70301_a(inventoryItemIndex);
    }

    @Override
    public int getInventorySlot(EntityPlayer player, ItemStack itemStack) {
        int slot = -1;
        for (int i = 0; i < player.field_71071_by.field_70462_a.size(); ++i) {
            if (player.field_71071_by.field_70462_a.get(i) != itemStack) continue;
            slot = i;
            break;
        }
        return slot;
    }

    @Override
    public boolean consumeInventoryItemFromSlot(EntityPlayer player, int slot) {
        if (player.field_71071_by.func_70301_a(slot) == null) {
            return false;
        }
        player.field_71071_by.func_70301_a(slot).func_190918_g(1);
        if (((ItemStack)player.field_71071_by.field_70462_a.get(slot)).func_190916_E() <= 0) {
            player.field_71071_by.func_70304_b(slot);
        }
        return true;
    }

    @Override
    public int removeMatchingInventoryItemStacks(EntityPlayer player, Item item, int quantity) {
        return player.field_71071_by.func_174925_a(item, -1, quantity, null);
    }

    @Override
    public int getMatchingInventoryItemStack(EntityPlayer player, Item item) {
        int count = 0;
        int inventorySize = player.field_71071_by.func_70302_i_();
        for (int i = 0; i < inventorySize; ++i) {
            ItemStack itemStack = player.field_71071_by.func_70301_a(i);
            if (itemStack.func_77973_b() != item) continue;
            ++count;
        }
        return count;
    }

    @Override
    public void addShapedRecipe(ItemStack itemStack, Object ... materials) {
        ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, materials).setMirrored(false).setRegistryName("mw", itemStack.func_77973_b().func_77658_a() + "_recipe"));
    }

    @Override
    public void addShapedOreRecipe(ItemStack itemStack, Object ... materials) {
        ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, materials).setMirrored(false).setRegistryName("mw", itemStack.func_77973_b().func_77658_a() + "_recipe"));
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void disableLightMap() {
        Minecraft.func_71410_x().field_71460_t.func_175072_h();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void enableLightMap() {
        Minecraft.func_71410_x().field_71460_t.func_180436_i();
    }

    @Override
    public void registerBlock(ModContext context, Block block, String name) {
        String modId = context.getModId();
        if (block.getRegistryName() == null) {
            if (block.func_149739_a().length() < modId.length() + 2 + 5) {
                throw new IllegalArgumentException("Unlocalize block name too short " + block.func_149739_a());
            }
            String unlocalizedName = block.func_149739_a().toLowerCase();
            String registryName = unlocalizedName.substring(5 + modId.length() + 1);
            block.setRegistryName(modId, registryName);
        }
        ForgeRegistries.BLOCKS.register((IForgeRegistryEntry)block);
        ItemBlock itemBlock = new ItemBlock(block);
        context.registerRenderableItem(block.getRegistryName(), (Item)itemBlock, null);
    }

    @Override
    public void registerWorldGenerator(CompatibleWorldGenerator generator, int modGenerationWeight) {
        GameRegistry.registerWorldGenerator((IWorldGenerator)generator, (int)modGenerationWeight);
    }

    @Override
    public ItemArmor.ArmorMaterial addArmorMaterial(String name, String textureName, int durability, int[] reductionAmounts, int enchantability, CompatibleSound soundOnEquip, float toughness) {
        return EnumHelper.addArmorMaterial((String)name, (String)textureName, (int)durability, (int[])reductionAmounts, (int)enchantability, (SoundEvent)(soundOnEquip != null ? soundOnEquip.getSound() : null), (float)toughness);
    }

    @Override
    public boolean inventoryHasFreeSlots(EntityPlayer player) {
        boolean result = false;
        for (int i = 0; i < player.field_71071_by.field_70462_a.size(); ++i) {
            if (!player.field_71071_by.func_70301_a(i).func_190926_b()) continue;
            result = true;
            break;
        }
        return result;
    }

    @Override
    public String getDisplayName(EntityPlayer player) {
        return player.getDisplayNameString();
    }

    @Override
    public void clickBlock(CompatibleBlockPos blockPos, CompatibleEnumFacing sideHit) {
        Minecraft.func_71410_x().field_71442_b.func_180511_b(blockPos.getBlockPos(), sideHit.getEnumFacing());
    }

    @Override
    public boolean isAirBlock(World world, CompatibleBlockPos blockPos) {
        return world.func_175623_d(blockPos.getBlockPos());
    }

    @Override
    public void addChatMessage(Entity entity, String message) {
        entity.func_145747_a((ITextComponent)new TextComponentString(message));
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public RenderGlobal createCompatibleRenderGlobal() {
        return new CompatibleRenderGlobal(Minecraft.func_71410_x());
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public CompatibleParticleManager createCompatibleParticleManager(WorldClient world) {
        return new CompatibleParticleManager(world);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public Entity getRenderViewEntity() {
        return Minecraft.func_71410_x().func_175606_aa();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void setRenderViewEntity(Entity entity) {
        Minecraft.func_71410_x().func_175607_a(entity);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public CompatibleParticleManager getCompatibleParticleManager() {
        return new CompatibleParticleManager(Minecraft.func_71410_x().field_71452_i);
    }

    @Override
    public void addBlockHitEffect(int x, int y, int z, CompatibleEnumFacing sideHit) {
        for (int i = 0; i < 6; ++i) {
            Minecraft.func_71410_x().field_71452_i.func_180532_a(new BlockPos(x, y, z), sideHit.getEnumFacing());
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void addBreakingParticle(ModContext modContext, double x, double y, double z) {
        double yOffset = 1.0;
        CompatibleParticle.CompatibleParticleBreaking particle = CompatibleParticle.createParticleBreaking(modContext, this.world((Entity)this.clientPlayer()), x, y + yOffset, z);
        Minecraft.func_71410_x().field_71452_i.func_78873_a((Particle)particle);
    }

    @Override
    public float getAspectRatio(ModContext modContext) {
        return modContext.getAspectRatio();
    }

    private static int findGreatesItemIndex(Collection<? extends Item> compatibleItems, Comparator<ItemStack> comparator, EntityPlayer player) {
        ItemStack maxStack = null;
        int maxItemIndex = -1;
        for (int i = 0; i < player.field_71071_by.field_70462_a.size(); ++i) {
            if (player.field_71071_by.func_70301_a(i) == null || !compatibleItems.contains(player.field_71071_by.func_70301_a(i).func_77973_b()) || maxStack != null && comparator.compare(player.field_71071_by.func_70301_a(i), maxStack) <= 0) continue;
            maxStack = player.field_71071_by.func_70301_a(i);
            maxItemIndex = i;
        }
        return maxItemIndex;
    }

    @Override
    public ItemStack tryConsumingCompatibleItem(Collection<? extends Item> compatibleItems, Comparator<ItemStack> comparator, EntityPlayer player) {
        int maxSize = 1;
        int i = Compatibility1_12_2.findGreatesItemIndex(compatibleItems, comparator, player);
        if (i < 0) {
            return null;
        }
        ItemStack stackInSlot = player.field_71071_by.func_70301_a(i);
        int consumedStackSize = maxSize >= this.getStackSize(stackInSlot) ? this.getStackSize(stackInSlot) : maxSize;
        ItemStack result = stackInSlot.func_77979_a(consumedStackSize);
        if (this.getStackSize(stackInSlot) <= 0) {
            player.field_71071_by.func_70304_b(i);
        }
        return result;
    }

    @Override
    public void setStackSize(ItemStack itemStack, int size) {
        itemStack.func_190920_e(size);
    }

    private static int itemSlotIndex(Item item, Predicate<ItemStack> condition, EntityPlayer player) {
        for (int i = 0; i < player.field_71071_by.field_70462_a.size(); ++i) {
            if (player.field_71071_by.func_70301_a(i) == null || player.field_71071_by.func_70301_a(i).func_77973_b() != item || !condition.test(player.field_71071_by.func_70301_a(i))) continue;
            return i;
        }
        return -1;
    }

    @Override
    public ItemStack consumeInventoryItem(Item item, Predicate<ItemStack> condition, EntityPlayer player, int maxSize) {
        if (maxSize <= 0) {
            return null;
        }
        int i = Compatibility1_12_2.itemSlotIndex(item, condition, player);
        if (i < 0) {
            return null;
        }
        ItemStack stackInSlot = player.field_71071_by.func_70301_a(i);
        int consumedStackSize = maxSize >= this.getStackSize(stackInSlot) ? this.getStackSize(stackInSlot) : maxSize;
        ItemStack result = stackInSlot.func_77979_a(consumedStackSize);
        if (this.getStackSize(stackInSlot) <= 0) {
            player.field_71071_by.func_70304_b(i);
        }
        return result;
    }

    @Override
    public ItemStack tryConsumingCompatibleItem(List<? extends Item> compatibleParts, int maxSize, EntityPlayer player, Predicate<ItemStack> ... conditions) {
        ItemStack resultStack = null;
        for (Predicate<ItemStack> condition : conditions) {
            Item item;
            Iterator<? extends Item> iterator = compatibleParts.iterator();
            while (iterator.hasNext() && (resultStack = this.consumeInventoryItem(item = iterator.next(), condition, player, maxSize)) == null) {
            }
            if (resultStack != null) break;
        }
        return resultStack;
    }

    @Override
    public CompatibleRayTraceResult rayTraceBlocks(Entity entity, CompatibleVec3 vec3, CompatibleVec3 vec31) {
        return CompatibleRayTraceResult.fromRayTraceResult(entity.func_130014_f_().func_72933_a(vec3.getVec(), vec31.getVec()));
    }

    @Override
    public CompatibleAxisAlignedBB expandEntityBoundingBox(Entity entity1, double f1, double f2, double f3) {
        return new CompatibleAxisAlignedBB(entity1.func_174813_aQ().func_72321_a(f1, f2, f3));
    }

    @Override
    public CompatibleAxisAlignedBB getBoundingBox(Entity entity) {
        return new CompatibleAxisAlignedBB(entity.func_174813_aQ());
    }

    @Override
    public List<Entity> getEntitiesWithinAABBExcludingEntity(World world, Entity entity, CompatibleAxisAlignedBB boundingBox) {
        return world.func_72839_b(entity, boundingBox.getBoundingBox());
    }

    @Override
    public void spawnParticle(World world, String particleName, double xCoord, double yCoord, double zCoord, double xSpeed, double ySpeed, double zSpeed) {
        EnumParticleTypes particleType = EnumParticleTypes.func_186831_a((String)particleName);
        if (particleType != null) {
            world.func_175688_a(particleType, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed, new int[0]);
        }
    }

    @Override
    public CompatibleBlockState getBlockAtPosition(World world, CompatibleBlockPos blockPos) {
        return CompatibleBlockState.fromBlockState(world.func_180495_p(blockPos.getBlockPos()));
    }

    @Override
    public Item findItemByName(String modId, String itemName) {
        return (Item)Item.field_150901_e.func_82594_a((Object)new ResourceLocation(modId, itemName));
    }

    @Override
    public String getPlayerName(EntityPlayer player) {
        return player.func_70005_c_();
    }

    @Override
    public boolean isBlockPenetratableByBullets(Block block) {
        return block == Blocks.field_150350_a || block == Blocks.field_150329_H || block == Blocks.field_150362_t || block == Blocks.field_150361_u || block == Blocks.field_150480_ab || block == Blocks.field_150407_cf || block == Blocks.field_150398_cm || block == Blocks.field_150321_G || block == Blocks.field_180405_aT || block == Blocks.field_180387_bt || block == Blocks.field_150400_ck || block == Blocks.field_180401_cv || block == Blocks.field_185773_cZ || block == Blocks.field_180404_aQ || block == Blocks.field_180392_bq || block == Blocks.field_150487_bG || block == Blocks.field_150414_aQ || block == Blocks.field_150404_cg || block == Blocks.field_150459_bM || block == Blocks.field_150375_by || block == Blocks.field_180406_aS || block == Blocks.field_180385_bs || block == Blocks.field_150401_cl || block == Blocks.field_150359_w || block == Blocks.field_150410_aZ || block == Blocks.field_150426_aN || block == Blocks.field_150411_aY || block == Blocks.field_150468_ap || block == Blocks.field_150442_at || block == Blocks.field_180407_aO || block == Blocks.field_180390_bo || block == Blocks.field_150476_ad || block == Blocks.field_150344_f || block == Blocks.field_150469_bN || block == Blocks.field_150429_aA || block == Blocks.field_150345_g || block == Blocks.field_150478_aa || block == Blocks.field_150415_aT || block == Blocks.field_150395_bd || block == Blocks.field_180394_cL || block == Blocks.field_150444_as || block == Blocks.field_150392_bi || block == Blocks.field_150376_bx || block == Blocks.field_150373_bw || block == Blocks.field_150464_aj;
    }

    @Override
    public boolean isBlockPenetratableByBullets(CompatibleBlockState blockState) {
        return this.isBlockPenetratableByBullets(blockState.getBlockState().func_177230_c());
    }

    @Override
    public boolean canCollideCheck(Block block, CompatibleBlockState metadata, boolean hitIfLiquid) {
        return block.func_176209_a(metadata.getBlockState(), hitIfLiquid);
    }

    @Override
    public float getCompatibleShellCasingForwardOffset() {
        return 0.1f;
    }

    @Override
    public boolean madeFromHardMaterial(CompatibleBlockState blockState) {
        Material material = blockState.getBlockState().func_185904_a();
        return material == Material.field_151576_e || material == Material.field_151573_f || material == Material.field_151588_w || material == Material.field_151575_d;
    }

    @Override
    public void playSoundAtEntity(Entity entity, CompatibleSound sound, float volume, float pitch) {
        if (sound != null) {
            entity.func_184185_a(sound.getSound(), volume, pitch);
        }
    }

    @Override
    public double getBlockDensity(World world, CompatibleVec3 vec3, CompatibleAxisAlignedBB boundingBox) {
        return world.func_72842_a(vec3.getVec(), boundingBox.getBoundingBox());
    }

    @Override
    public float getBlockDensity(World world, CompatibleVec3 vec, CompatibleAxisAlignedBB boundingBox, BiPredicate<Block, CompatibleBlockState> isCollidable) {
        AxisAlignedBB bb = boundingBox.getBoundingBox();
        double d0 = 1.0 / ((bb.field_72336_d - bb.field_72340_a) * 2.0 + 1.0);
        double d1 = 1.0 / ((bb.field_72337_e - bb.field_72338_b) * 2.0 + 1.0);
        double d2 = 1.0 / ((bb.field_72334_f - bb.field_72339_c) * 2.0 + 1.0);
        double d3 = (1.0 - Math.floor(1.0 / d0) * d0) / 2.0;
        double d4 = (1.0 - Math.floor(1.0 / d2) * d2) / 2.0;
        if (d0 >= 0.0 && d1 >= 0.0 && d2 >= 0.0) {
            int j2 = 0;
            int k2 = 0;
            float f = 0.0f;
            while (f <= 1.0f) {
                float f1 = 0.0f;
                while (f1 <= 1.0f) {
                    float f2 = 0.0f;
                    while (f2 <= 1.0f) {
                        double d5 = bb.field_72340_a + (bb.field_72336_d - bb.field_72340_a) * (double)f;
                        double d6 = bb.field_72338_b + (bb.field_72337_e - bb.field_72338_b) * (double)f1;
                        double d7 = bb.field_72339_c + (bb.field_72334_f - bb.field_72339_c) * (double)f2;
                        if (CompatibleRayTracing.rayTraceBlocks(world, new CompatibleVec3(d5 + d3, d6, d7 + d4), vec, isCollidable) == null) {
                            ++j2;
                        }
                        ++k2;
                        f2 = (float)((double)f2 + d2);
                    }
                    f1 = (float)((double)f1 + d1);
                }
                f = (float)((double)f + d0);
            }
            return (float)j2 / (float)k2;
        }
        return 0.0f;
    }

    @Override
    public boolean isImmuneToExplosions(Entity entity) {
        return entity.func_180427_aV();
    }

    @Override
    public boolean isAirBlock(CompatibleBlockState blockState) {
        return blockState.getBlockState().func_177230_c() == Blocks.field_150350_a;
    }

    private net.minecraft.world.Explosion getCompatibleExplosion(Explosion e) {
        return new net.minecraft.world.Explosion(e.getWorld(), e.getExploder(), e.getExplosionX(), e.getExplosionY(), e.getExplosionZ(), e.getExplosionSize(), false, true);
    }

    @Override
    public boolean canDropBlockFromExplosion(CompatibleBlockState blockState, Explosion e) {
        return blockState.getBlockState().func_177230_c().func_149659_a(this.getCompatibleExplosion(e));
    }

    @Override
    public void onBlockExploded(World world, CompatibleBlockState blockState, CompatibleBlockPos blockpos, Explosion explosion) {
        blockState.getBlockState().func_177230_c().onBlockExploded(world, blockpos.getBlockPos(), this.getCompatibleExplosion(explosion));
    }

    @Override
    public float getExplosionResistance(World worldObj, CompatibleBlockState blockState, CompatibleBlockPos blockpos, Entity entity, Explosion explosion) {
        return blockState.getBlockState().func_177230_c().func_149638_a(entity);
    }

    @Override
    public float getExplosionResistance(World worldObj, Entity exploder, Explosion explosion, CompatibleBlockPos blockpos, CompatibleBlockState blockState) {
        return exploder.func_180428_a(this.getCompatibleExplosion(explosion), worldObj, blockpos.getBlockPos(), blockState.getBlockState());
    }

    @Override
    public boolean isSpectator(EntityPlayer entityplayer) {
        return entityplayer.func_175149_v();
    }

    @Override
    public boolean isCreative(EntityPlayer entityplayer) {
        return entityplayer.func_184812_l_();
    }

    @Override
    public void setBlockToFire(World world, CompatibleBlockPos blockpos1) {
        world.func_175656_a(blockpos1.getBlockPos(), Blocks.field_150480_ab.func_176223_P());
    }

    @Override
    public DamageSource getDamageSource(Explosion explosion) {
        return DamageSource.func_94539_a((net.minecraft.world.Explosion)this.getCompatibleExplosion(explosion));
    }

    @Override
    public double getBlastDamageReduction(EntityLivingBase entity, double d10) {
        return EnchantmentProtection.func_92092_a((EntityLivingBase)entity, (double)d10);
    }

    @Override
    public boolean verifyExplosion(World worldObj, Entity exploder, Explosion explosion, CompatibleBlockPos blockpos, CompatibleBlockState blockState, float f) {
        return exploder.func_174816_a(this.getCompatibleExplosion(explosion), worldObj, blockpos.getBlockPos(), blockState.getBlockState(), f);
    }

    @Override
    public boolean isFullBlock(CompatibleBlockState blockState) {
        return blockState.getBlockState().func_185913_b();
    }

    @Override
    public void dropBlockAsItemWithChance(World world, CompatibleBlockState blockState, CompatibleBlockPos blockpos, float f, int i) {
        blockState.getBlockState().func_177230_c().func_180653_a(world, blockpos.getBlockPos(), blockState.getBlockState(), f, i);
    }

    @Override
    public CompatibleBlockState getBlockBelow(World world, CompatibleBlockPos blockPos) {
        return CompatibleBlockState.fromBlockState(world.func_180495_p(blockPos.getBlockPos().func_177977_b()));
    }

    @Override
    public void playSound(World world, double posX, double posY, double posZ, CompatibleSound sound, float volume, float pitch) {
        if (sound != null) {
            world.func_184148_a(null, posX, posY, posZ, sound.getSound(), SoundCategory.BLOCKS, volume, pitch);
        }
    }

    @Override
    public boolean isBlockPenetratableByGrenades(Block block) {
        return block == Blocks.field_150350_a || block == Blocks.field_150329_H || block == Blocks.field_150362_t || block == Blocks.field_150361_u || block == Blocks.field_150480_ab || block == Blocks.field_150407_cf || block == Blocks.field_150398_cm || block == Blocks.field_150321_G || block == Blocks.field_150464_aj;
    }

    @Override
    public DamageSource genericDamageSource() {
        return GENERIC_DAMAGE_SOURCE;
    }

    @Override
    public boolean isCollided(CompatibleParticle particle) {
        return particle.isCollided();
    }

    @Override
    public ItemStack createItemStack(CompatibleItems compatibleItem, int stackSize, int damage) {
        return new ItemStack(compatibleItem.getItem(), stackSize, damage);
    }

    @Override
    public void addSmelting(Block block, ItemStack output, float f) {
        GameRegistry.addSmelting((Block)block, (ItemStack)output, (float)f);
    }

    @Override
    public void addSmelting(Item item, ItemStack output, float f) {
        GameRegistry.addSmelting((Item)item, (ItemStack)output, (float)f);
    }

    @Override
    public boolean isFlying(EntityPlayer player) {
        return player.field_71075_bZ.field_75100_b;
    }

    @Override
    public String getLocalizedString(String format, Object ... args) {
        return I18n.func_74837_a((String)format, (Object[])args);
    }

    @Override
    public void registerEgg(ModContext context, Class<? extends Entity> entityClass, String entityName, int primaryEggColor, int secondaryEggColor) {
        EntityRegistry.registerEgg((ResourceLocation)EntityList.func_191306_a(entityClass), (int)primaryEggColor, (int)secondaryEggColor);
    }

    @Override
    public void addSpawn(Class<? extends EntityLiving> entity, int weightedProb, int min, int max, CompatibleBiomeType ... biomeTypes) {
        HashSet<Biome> biomes = new HashSet<Biome>();
        for (CompatibleBiomeType compatibleType : biomeTypes) {
            for (BiomeDictionary.Type incompatibleType : compatibleType.getTypes()) {
                Set biomesForType = BiomeDictionary.getBiomes((BiomeDictionary.Type)incompatibleType);
                for (Biome b : biomesForType) {
                    biomes.add(b);
                }
            }
        }
        for (CompatibleBiomeType compatibleType : biomeTypes) {
            for (BiomeDictionary.Type incompatibleType : compatibleType.getTypes()) {
                for (Biome biome : ForgeRegistries.BIOMES) {
                    Set types = BiomeDictionary.getTypes((Biome)biome);
                    if (!types.contains(incompatibleType)) continue;
                    biomes.add(biome);
                }
            }
        }
        EntityRegistry.addSpawn(entity, (int)weightedProb, (int)min, (int)max, (EnumCreatureType)EnumCreatureType.MONSTER, (Biome[])biomes.toArray(new Biome[0]));
    }

    @Override
    public void setItemStackToSlot(Entity entity, CompatibleEntityEquipmentSlot compatibleEquipmentSlot, ItemStack itemStack) {
        entity.func_184201_a(compatibleEquipmentSlot.getSlot(), itemStack);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public ShaderUniform getShaderUniform(ShaderManager shaderManager, String uniformName) {
        return shaderManager.func_147991_a(uniformName);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void setUniform(ShaderUniform uniform, float value) {
        uniform.func_148090_a(value);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void setUniform(ShaderUniform uniform, float value1, float value2) {
        uniform.func_148087_a(value1, value2);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void setUniform(ShaderUniform uniform, float value1, float value2, float value3) {
        uniform.func_148095_a(value1, value2, value3);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void setUniform(ShaderUniform uniform, float value1, float value2, float value3, float value4) {
        uniform.func_148081_a(value1, value2, value3, value4);
    }

    @Override
    public void setEntityAttribute(EntityLivingBase entity, CompatibleSharedMonsterAttributes attributes, double value) {
        entity.func_110148_a(attributes.getAttributes()).func_111128_a(value);
    }

    @Override
    public EnumDifficulty getDifficulty(World world) {
        return world.func_175659_aa();
    }

    @Override
    public void addStat(EntityPlayer entityplayer, CompatibleAchievement compatibleAchievement) {
        entityplayer.func_71029_a(compatibleAchievement.getAchievement());
    }

    @Override
    public float getLightBrightness(World world, CompatibleBlockPos pos) {
        return world.func_175724_o(pos.getBlockPos());
    }

    @Override
    public boolean isStrafingSupported() {
        return true;
    }

    @Override
    public void strafe(EntityCustomMob entity, float forward, float strafe) {
        entity.func_70605_aq().func_188488_a(forward, strafe);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void useShader(EntityRenderer entityRenderer, boolean value) {
        ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, (Object)entityRenderer, (Object)value, (String[])new String[]{"useShader", "field_175083_ad"});
    }

    @Override
    public boolean is3dRenderable(Item item) {
        return item instanceof ItemBlock;
    }

    @Override
    public float getCompatibleAimingRotationYaw(EntityLivingBase thrower) {
        return thrower.field_70177_z;
    }

    @Override
    public <T> void setPrivateValue(Class<T> class1, T instance, Object value, String ... fieldNames) {
        ObfuscationReflectionHelper.setPrivateValue(class1, instance, (Object)value, (String[])fieldNames);
    }

    @Override
    public ItemStack getHelmet(EntityLivingBase entity) {
        return entity.func_184582_a(EntityEquipmentSlot.HEAD);
    }

    @Override
    public CompatibleVec3 getLookVec(EntityLivingBase player) {
        return new CompatibleVec3(player.func_70040_Z());
    }

    @Override
    public ItemStack createItemStack(NBTTagCompound tagCompound) {
        return new ItemStack(tagCompound);
    }

    @Override
    public EntityAITarget createAINearestAttackableTarget(EntityLivingBase e, Class<? extends EntityLivingBase> targetClass, boolean checkSight) {
        return new EntityAINearestAttackableTarget((EntityCreature)e, targetClass, checkSight);
    }

    @Override
    public EntityAIBase createAiAvoidEntity(EntityLivingBase e, Class<? extends EntityLivingBase> entityClassToAvoid, float avoidDistanceIn, double farSpeedIn, double nearSpeedIn) {
        return new EntityAIAvoidEntity((EntityCreature)e, entityClassToAvoid, avoidDistanceIn, farSpeedIn, nearSpeedIn);
    }

    @Override
    public ShaderGroup getShaderGroup(EntityRenderer entityRenderer) {
        return entityRenderer.func_147706_e();
    }

    @Override
    public void setShaderGroup(EntityRenderer entityRenderer, ShaderGroup shaderGroup) {
        CompatibilityProvider.compatibility.setPrivateValue(EntityRenderer.class, entityRenderer, shaderGroup, "shaderGroup", "field_147707_d");
    }

    @Override
    public Entity getTrueDamageSource(DamageSource cause) {
        return cause.func_76346_g();
    }

    @Override
    public WorldType getWorldType(World world) {
        return world.func_175624_G();
    }

    @Override
    public ItemStack getItemStackFromSlot(CompatibleEntityEquipmentSlot compatibleSlot) {
        return this.clientPlayer().func_184582_a(compatibleSlot.getSlot());
    }

    @Override
    public boolean isStencilEnabled(Framebuffer framebuffer) {
        return framebuffer.isStencilEnabled();
    }

    @Override
    public void enableStencil(Framebuffer framebuffer) {
        framebuffer.enableStencil();
    }

    @Override
    public void resizeEntityBoundingBox(Entity entity, double x, double y, double z) {
        AxisAlignedBB axisalignedbb = entity.func_174813_aQ();
        entity.func_174826_a(new AxisAlignedBB(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c, axisalignedbb.field_72340_a + x, axisalignedbb.field_72338_b + y, axisalignedbb.field_72339_c + z));
    }

    @Override
    public void renderLeftLegwear(ModelBiped model, float scale) {
        if (model instanceof ModelPlayer) {
            ((ModelPlayer)model).field_178733_c.func_78785_a(scale);
        }
    }

    @Override
    public void renderRightLegwear(ModelBiped model, float scale) {
        if (model instanceof ModelPlayer) {
            ((ModelPlayer)model).field_178731_d.func_78785_a(scale);
        }
    }

    @Override
    public void renderLeftArmwear(ModelBiped model, float scale) {
        if (model instanceof ModelPlayer) {
            ((ModelPlayer)model).field_178734_a.func_78785_a(scale);
        }
    }

    @Override
    public void renderRightArmwear(ModelBiped model, float scale) {
        if (model instanceof ModelPlayer) {
            ((ModelPlayer)model).field_178732_b.func_78785_a(scale);
        }
    }

    @Override
    public void renderBodywear(ModelBiped model, float scale) {
        if (model instanceof ModelPlayer) {
            ((ModelPlayer)model).field_178730_v.func_78785_a(scale);
        }
    }

    @Override
    public void renderHeadwear(ModelBiped model, float scale) {
        if (model instanceof ModelPlayer) {
            ((ModelPlayer)model).field_178720_f.func_78785_a(scale);
        }
    }

    @Override
    public boolean isShadersModEnabled() {
        boolean result = Loader.isModLoaded((String)"shadersmod");
        if (result) {
            if (this.shadersEnabledFieldOptional == null) {
                try {
                    Class shadersClass = Loader.instance().getModClassLoader().loadClass("shadersmodcore.client.Shaders");
                    this.shadersEnabledFieldOptional = Optional.of(shadersClass.getField("isInitialized"));
                }
                catch (Exception e) {
                    this.shadersEnabledFieldOptional = Optional.empty();
                }
            }
            if (this.shadersEnabledFieldOptional != null) {
                try {
                    Field field = this.shadersEnabledFieldOptional.orElse(null);
                    result = field != null && field.getBoolean(null);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
        return result;
    }

    @Override
    public float getFlashIntencityFactor() {
        return 1.0f;
    }

    @Override
    public void setUniqueId(NBTTagCompound tagCompound, String tag, UUID uuid) {
        tagCompound.func_74772_a(tag + "Most", uuid.getMostSignificantBits());
        tagCompound.func_74772_a(tag + "Least", uuid.getLeastSignificantBits());
    }

    @Override
    public UUID getUniqueId(NBTTagCompound tagCompound, String tag) {
        return new UUID(tagCompound.func_74763_f(tag + "Most"), tagCompound.func_74763_f(tag + "Least"));
    }

    @Override
    public Entity getEntityByUuid(UUID uuid, World world) {
        if (world instanceof WorldServer) {
            return ((WorldServer)world).func_175733_a(uuid);
        }
        return null;
    }

    @Override
    public TileEntity getTileEntity(World world, CompatibleBlockPos pos) {
        return world.func_175625_s(pos.getBlockPos());
    }

    @Override
    public void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String name) {
        GameRegistry.registerTileEntity(tileEntityClass, (String)name);
    }

    @Override
    public boolean isValidArmor(ItemStack itemstack, CompatibleEntityEquipmentSlot compatibleEntityEquipementSlot, Entity entity) {
        return itemstack.func_77973_b().isValidArmor(itemstack, compatibleEntityEquipementSlot.getSlot(), entity);
    }

    @Override
    public CompatibleEntityEquipmentSlot getArmorType(ItemArmor item) {
        return CompatibleEntityEquipmentSlot.valueOf(item.field_77881_a);
    }

    @Override
    public double getEntityYOffset(Entity entity) {
        return entity.func_70033_W() + 0.5;
    }

    @Override
    public NBTTagCompound readTagCompound(PacketBuffer packetBuf) throws IOException {
        return packetBuf.func_150793_b();
    }

    @Override
    public void writeTagCompound(PacketBuffer packetBuf, NBTTagCompound tagCompound) {
        packetBuf.func_150786_a(tagCompound);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void closeScreen() {
        this.clientPlayer().func_71053_j();
    }

    @Override
    public void applyArmor(CompatibleLivingHurtEvent event, EntityLivingBase entityLiving, ItemStack[] itemStacks, DamageSource damageSource, float amount) {
        NonNullList stackList = NonNullList.func_191196_a();
        for (int i = 0; i < itemStacks.length; ++i) {
            stackList.add((Object)itemStacks[i]);
        }
        ISpecialArmor.ArmorProperties.applyArmor((EntityLivingBase)entityLiving, (NonNullList)stackList, (DamageSource)damageSource, (double)amount);
    }

    @Override
    public void dropItem(EntityPlayer player, ItemStack stack, boolean dropAround, boolean traceItem) {
        player.func_146097_a(stack, dropAround, traceItem);
    }

    @Override
    public void registerGuiHandler(Object mod, GuiHandler guiHandler) {
        NetworkRegistry.INSTANCE.registerGuiHandler(mod, (IGuiHandler)guiHandler);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void renderItem(EntityPlayer player, ItemStack stack) {
        Minecraft.func_71410_x().func_175597_ag().func_178099_a((EntityLivingBase)player, stack, null);
    }

    @Override
    public float getSmokeEffectScaleFactor() {
        return 1.0f;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void adjustCustomEquippedPosition() {
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public <T extends TileEntity> void bindTileEntitySpecialRenderer(Class<? extends TileEntity> tileEntityClass, CustomTileEntityRenderer customTileEntityRenderer) {
        ClientRegistry.bindTileEntitySpecialRenderer(tileEntityClass, (TileEntitySpecialRenderer)customTileEntityRenderer);
    }

    @Override
    public void markBlockForUpdate(World world, CompatibleBlockPos pos) {
        world.func_147458_c(pos.getBlockPosX(), pos.getBlockPosY(), pos.getBlockPosZ(), pos.getBlockPosX(), pos.getBlockPosY(), pos.getBlockPosZ());
    }

    @Override
    public boolean getGameRulesBooleanValue(GameRules rules, String ruleName) {
        return rules.func_82766_b(ruleName);
    }

    @Override
    public ItemStack getEntityItem(EntityItem entityItem) {
        return entityItem.func_92059_d();
    }

    @Override
    public DamageSource mobDamageSource(EntityLivingBase thrower) {
        return DamageSource.func_76358_a((EntityLivingBase)thrower);
    }

    @Override
    public ItemStack stackForEmptySlot() {
        return new ItemStack(Items.field_190931_a);
    }
}


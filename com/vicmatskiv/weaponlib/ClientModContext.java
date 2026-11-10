/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.resources.IReloadableResourceManager
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.resources.IResourcePack
 *  net.minecraft.client.resources.SimpleReloadableResourceManager
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.command.ICommand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.ClientCommandHandler
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ClientEffectManager;
import com.vicmatskiv.weaponlib.ClientEventHandler;
import com.vicmatskiv.weaponlib.ClientWeaponTicker;
import com.vicmatskiv.weaponlib.CommonModContext;
import com.vicmatskiv.weaponlib.CustomGui;
import com.vicmatskiv.weaponlib.EffectManager;
import com.vicmatskiv.weaponlib.EntityShellCasing;
import com.vicmatskiv.weaponlib.EntitySpreadable;
import com.vicmatskiv.weaponlib.InvisibleEntityRenderer;
import com.vicmatskiv.weaponlib.KeyBindings;
import com.vicmatskiv.weaponlib.PlayerItemInstanceRegistry;
import com.vicmatskiv.weaponlib.PlayerTransitionProvider;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.SafeGlobals;
import com.vicmatskiv.weaponlib.ShellCasingRenderer;
import com.vicmatskiv.weaponlib.SpawnEntityRenderer;
import com.vicmatskiv.weaponlib.StatusMessageCenter;
import com.vicmatskiv.weaponlib.SyncManager;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponEventHandler;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WeaponResourcePack;
import com.vicmatskiv.weaponlib.WeaponSpawnEntity;
import com.vicmatskiv.weaponlib.animation.ScreenShakingAnimationManager;
import com.vicmatskiv.weaponlib.command.DebugCommand;
import com.vicmatskiv.weaponlib.command.MainCommand;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleChannel;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderingRegistry;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.electronics.EntityWirelessCamera;
import com.vicmatskiv.weaponlib.electronics.WirelessCameraRenderer;
import com.vicmatskiv.weaponlib.grenade.EntityFlashGrenade;
import com.vicmatskiv.weaponlib.grenade.EntityGasGrenade;
import com.vicmatskiv.weaponlib.grenade.EntityGrenade;
import com.vicmatskiv.weaponlib.grenade.EntityGrenadeRenderer;
import com.vicmatskiv.weaponlib.grenade.EntitySmokeGrenade;
import com.vicmatskiv.weaponlib.grenade.GrenadeRenderer;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import com.vicmatskiv.weaponlib.inventory.InventoryTabs;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeRenderer;
import com.vicmatskiv.weaponlib.melee.PlayerMeleeInstance;
import com.vicmatskiv.weaponlib.perspective.PerspectiveManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.command.ICommand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ClientCommandHandler;

public class ClientModContext
extends CommonModContext {
    private ClientEventHandler clientEventHandler;
    private Lock mainLoopLock = new ReentrantLock();
    private Queue<Runnable> runInClientThreadQueue = new LinkedBlockingQueue<Runnable>();
    protected static ThreadLocal<ClientModContext> currentContext = new ThreadLocal();
    private CompatibleRenderingRegistry rendererRegistry;
    private SafeGlobals safeGlobals = new SafeGlobals();
    private StatusMessageCenter statusMessageCenter;
    private PerspectiveManager viewManager;
    private float aspectRatio;
    private Framebuffer inventoryFramebuffer;
    private Map<Object, Integer> inventoryTextureMap;
    private EffectManager effectManager;
    private ScreenShakingAnimationManager playerRawPitchAnimationManager;
    private PlayerTransitionProvider playerTransitionProvider;

    public static ClientModContext getContext() {
        return currentContext.get();
    }

    @Override
    public void preInit(Object mod, String modId, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, CompatibleChannel channel) {
        super.preInit(mod, modId, configurationManager, event, channel);
        this.aspectRatio = (float)Minecraft.func_71410_x().field_71443_c / (float)Minecraft.func_71410_x().field_71440_d;
        ClientCommandHandler.instance.func_71560_a((ICommand)new DebugCommand(modId));
        ClientCommandHandler.instance.func_71560_a((ICommand)new MainCommand(modId, this));
        this.statusMessageCenter = new StatusMessageCenter();
        this.rendererRegistry = new CompatibleRenderingRegistry(modId);
        this.rendererRegistry.preInit();
        List defaultResourcePacks = (List)CompatibilityProvider.compatibility.getPrivateValue(Minecraft.class, Minecraft.func_71410_x(), "defaultResourcePacks", "field_110449_ao");
        WeaponResourcePack weaponResourcePack = new WeaponResourcePack();
        defaultResourcePacks.add(weaponResourcePack);
        IResourceManager resourceManager = Minecraft.func_71410_x().func_110442_L();
        if (resourceManager instanceof IReloadableResourceManager) {
            ((SimpleReloadableResourceManager)resourceManager).func_110545_a((IResourcePack)weaponResourcePack);
        }
        CompatibilityProvider.compatibility.registerWithEventBus((Object)new CustomGui(Minecraft.func_71410_x(), this, this.weaponAttachmentAspect));
        CompatibilityProvider.compatibility.registerWithEventBus(new WeaponEventHandler(this, this.safeGlobals));
        KeyBindings.init();
        ClientWeaponTicker clientWeaponTicker = new ClientWeaponTicker(this);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> clientWeaponTicker.shutdown()));
        clientWeaponTicker.start();
        this.clientEventHandler = new ClientEventHandler(this, this.mainLoopLock, this.safeGlobals, this.runInClientThreadQueue);
        CompatibilityProvider.compatibility.registerWithFmlEventBus(this.clientEventHandler);
        CompatibilityProvider.compatibility.registerWithEventBus(InventoryTabs.getInstance());
        CompatibilityProvider.compatibility.registerWithEventBus(this.clientEventHandler);
        this.viewManager = new PerspectiveManager(this);
        this.inventoryTextureMap = new HashMap<Object, Integer>();
        this.effectManager = new ClientEffectManager();
        this.playerRawPitchAnimationManager = new ScreenShakingAnimationManager();
    }

    @Override
    public void init(Object mod, String modid) {
        super.init(mod, modid);
        this.rendererRegistry.registerEntityRenderingHandler(WeaponSpawnEntity.class, (Object)new SpawnEntityRenderer());
        this.rendererRegistry.registerEntityRenderingHandler(EntityWirelessCamera.class, (Object)new WirelessCameraRenderer(this.modId));
        this.rendererRegistry.registerEntityRenderingHandler(EntityShellCasing.class, (Object)new ShellCasingRenderer());
        this.rendererRegistry.registerEntityRenderingHandler(EntityGrenade.class, (Object)new EntityGrenadeRenderer());
        this.rendererRegistry.registerEntityRenderingHandler(EntitySmokeGrenade.class, (Object)new EntityGrenadeRenderer());
        this.rendererRegistry.registerEntityRenderingHandler(EntityGasGrenade.class, (Object)new EntityGrenadeRenderer());
        this.rendererRegistry.registerEntityRenderingHandler(EntityFlashGrenade.class, (Object)new EntityGrenadeRenderer());
        this.rendererRegistry.registerEntityRenderingHandler(EntitySpreadable.class, (Object)new InvisibleEntityRenderer());
        this.rendererRegistry.processDelayedRegistrations();
    }

    @Override
    public boolean isClient() {
        return true;
    }

    @Override
    public void registerServerSideOnly() {
    }

    public PerspectiveManager getViewManager() {
        return this.viewManager;
    }

    public SafeGlobals getSafeGlobals() {
        return this.safeGlobals;
    }

    @Override
    public void registerWeapon(String name, Weapon weapon, WeaponRenderer renderer) {
        super.registerWeapon(name, weapon, renderer);
        this.rendererRegistry.register((Item)weapon, weapon.getName(), (Object)weapon.getRenderer());
        renderer.setClientModContext(this);
    }

    @Override
    public void registerRenderableItem(String name, Item item, Object renderer) {
        super.registerRenderableItem(name, item, renderer);
        this.rendererRegistry.register(item, name, renderer);
    }

    @Override
    public void registerRenderableItem(ResourceLocation name, Item item, Object renderer) {
        super.registerRenderableItem(name, item, renderer);
        this.rendererRegistry.register(item, name, renderer);
    }

    @Override
    protected EntityPlayer getPlayer(CompatibleMessageContext ctx) {
        return CompatibilityProvider.compatibility.clientPlayer();
    }

    @Override
    public void runSyncTick(Runnable runnable) {
        this.mainLoopLock.lock();
        try {
            runnable.run();
        }
        finally {
            this.mainLoopLock.unlock();
        }
    }

    @Override
    public void runInMainThread(Runnable runnable) {
        this.runInClientThreadQueue.add(runnable);
    }

    @Override
    public PlayerItemInstanceRegistry getPlayerItemInstanceRegistry() {
        return this.playerItemInstanceRegistry;
    }

    protected SyncManager<?> getSyncManager() {
        return this.syncManager;
    }

    @Override
    public PlayerWeaponInstance getMainHeldWeapon() {
        return this.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer(), PlayerWeaponInstance.class);
    }

    @Override
    public StatusMessageCenter getStatusMessageCenter() {
        return this.statusMessageCenter;
    }

    public PlayerMeleeInstance getMainHeldMeleeWeapon() {
        return this.getPlayerItemInstanceRegistry().getMainHandItemInstance((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer(), PlayerMeleeInstance.class);
    }

    @Override
    public void registerMeleeWeapon(String name, ItemMelee itemMelee, MeleeRenderer renderer) {
        super.registerMeleeWeapon(name, itemMelee, renderer);
        this.rendererRegistry.register((Item)itemMelee, itemMelee.getName(), (Object)itemMelee.getRenderer());
        renderer.setClientModContext(this);
    }

    @Override
    public void registerGrenadeWeapon(String name, ItemGrenade itemGrenade, GrenadeRenderer renderer) {
        super.registerGrenadeWeapon(name, itemGrenade, renderer);
        this.rendererRegistry.register((Item)itemGrenade, itemGrenade.getName(), (Object)itemGrenade.getRenderer());
        renderer.setClientModContext(this);
    }

    @Override
    public float getAspectRatio() {
        return this.aspectRatio;
    }

    public Framebuffer getInventoryFramebuffer() {
        if (this.inventoryFramebuffer == null) {
            this.inventoryFramebuffer = new Framebuffer(256, 256, true);
            this.inventoryFramebuffer.func_147604_a(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return this.inventoryFramebuffer;
    }

    public Map<Object, Integer> getInventoryTextureMap() {
        return this.inventoryTextureMap;
    }

    @Override
    public String getModId() {
        return this.modId;
    }

    @Override
    public EffectManager getEffectManager() {
        return this.effectManager;
    }

    public ScreenShakingAnimationManager getPlayerRawPitchAnimationManager() {
        return this.playerRawPitchAnimationManager;
    }

    @Override
    public void registerRenderableEntity(Class<? extends Entity> entityClass, Object renderer) {
        this.rendererRegistry.registerEntityRenderingHandler(entityClass, renderer);
    }

    @Override
    public void setPlayerTransitionProvider(PlayerTransitionProvider playerTransitionProvider) {
        this.playerTransitionProvider = playerTransitionProvider;
    }

    PlayerTransitionProvider getPlayerTransitionProvider() {
        return this.playerTransitionProvider;
    }
}


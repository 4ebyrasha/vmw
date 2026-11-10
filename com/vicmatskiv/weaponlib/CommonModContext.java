/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.util.ResourceLocation
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ArmorControlHandler;
import com.vicmatskiv.weaponlib.ArmorControlMessage;
import com.vicmatskiv.weaponlib.AttachmentContainer;
import com.vicmatskiv.weaponlib.BlockHitMessage;
import com.vicmatskiv.weaponlib.BlockHitMessageHandler;
import com.vicmatskiv.weaponlib.EffectManager;
import com.vicmatskiv.weaponlib.EntityControlHandler;
import com.vicmatskiv.weaponlib.EntityControlMessage;
import com.vicmatskiv.weaponlib.EntityShellCasing;
import com.vicmatskiv.weaponlib.EntitySpreadable;
import com.vicmatskiv.weaponlib.ExplosionMessage;
import com.vicmatskiv.weaponlib.ExplosionMessageHandler;
import com.vicmatskiv.weaponlib.ExposureMessage;
import com.vicmatskiv.weaponlib.ExposureMessageHandler;
import com.vicmatskiv.weaponlib.LightExposure;
import com.vicmatskiv.weaponlib.MagazineReloadAspect;
import com.vicmatskiv.weaponlib.MagazineState;
import com.vicmatskiv.weaponlib.MaterialImpactSound;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.PlayerItemInstanceRegistry;
import com.vicmatskiv.weaponlib.PlayerMagazineInstance;
import com.vicmatskiv.weaponlib.PlayerTransitionProvider;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.ServerEventHandler;
import com.vicmatskiv.weaponlib.SpreadableExposure;
import com.vicmatskiv.weaponlib.StatusMessageCenter;
import com.vicmatskiv.weaponlib.SyncManager;
import com.vicmatskiv.weaponlib.TryFireMessage;
import com.vicmatskiv.weaponlib.TryFireMessageHandler;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponFireAspect;
import com.vicmatskiv.weaponlib.WeaponKeyInputHandler;
import com.vicmatskiv.weaponlib.WeaponReloadAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WeaponSpawnEntity;
import com.vicmatskiv.weaponlib.WeaponState;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleChannel;
import com.vicmatskiv.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExposureCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMaterial;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMissionCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSide;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.RecipeManager;
import com.vicmatskiv.weaponlib.electronics.EntityWirelessCamera;
import com.vicmatskiv.weaponlib.electronics.HandheldState;
import com.vicmatskiv.weaponlib.electronics.PlayerHandheldInstance;
import com.vicmatskiv.weaponlib.electronics.PlayerTabletInstance;
import com.vicmatskiv.weaponlib.electronics.TabletState;
import com.vicmatskiv.weaponlib.grenade.EntityFlashGrenade;
import com.vicmatskiv.weaponlib.grenade.EntityGasGrenade;
import com.vicmatskiv.weaponlib.grenade.EntityGrenade;
import com.vicmatskiv.weaponlib.grenade.EntitySmokeGrenade;
import com.vicmatskiv.weaponlib.grenade.GrenadeAttackAspect;
import com.vicmatskiv.weaponlib.grenade.GrenadeMessage;
import com.vicmatskiv.weaponlib.grenade.GrenadeMessageHandler;
import com.vicmatskiv.weaponlib.grenade.GrenadeRenderer;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import com.vicmatskiv.weaponlib.grenade.PlayerGrenadeInstance;
import com.vicmatskiv.weaponlib.inventory.EntityInventorySyncHandler;
import com.vicmatskiv.weaponlib.inventory.EntityInventorySyncMessage;
import com.vicmatskiv.weaponlib.inventory.GuiHandler;
import com.vicmatskiv.weaponlib.inventory.OpenCustomInventoryGuiHandler;
import com.vicmatskiv.weaponlib.inventory.OpenCustomPlayerInventoryGuiMessage;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeAttachmentAspect;
import com.vicmatskiv.weaponlib.melee.MeleeAttackAspect;
import com.vicmatskiv.weaponlib.melee.MeleeRenderer;
import com.vicmatskiv.weaponlib.melee.MeleeState;
import com.vicmatskiv.weaponlib.melee.PlayerMeleeInstance;
import com.vicmatskiv.weaponlib.melee.TryAttackMessage;
import com.vicmatskiv.weaponlib.melee.TryAttackMessageHandler;
import com.vicmatskiv.weaponlib.mission.AcceptMissionHandler;
import com.vicmatskiv.weaponlib.mission.AcceptMissionMessage;
import com.vicmatskiv.weaponlib.mission.EntityMissionOfferingSyncHandler;
import com.vicmatskiv.weaponlib.mission.EntityMissionOfferingSyncMessage;
import com.vicmatskiv.weaponlib.mission.GoToLocationAction;
import com.vicmatskiv.weaponlib.mission.Goal;
import com.vicmatskiv.weaponlib.mission.KillEntityAction;
import com.vicmatskiv.weaponlib.mission.Mission;
import com.vicmatskiv.weaponlib.mission.MissionManager;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import com.vicmatskiv.weaponlib.mission.MissionOfferingSyncHandler;
import com.vicmatskiv.weaponlib.mission.MissionOfferingSyncMessage;
import com.vicmatskiv.weaponlib.mission.MissionReward;
import com.vicmatskiv.weaponlib.mission.ObtainItemAction;
import com.vicmatskiv.weaponlib.mission.OpenMissionGuiHandler;
import com.vicmatskiv.weaponlib.mission.OpenMissionGuiMessage;
import com.vicmatskiv.weaponlib.mission.PlayerMissionSyncHandler;
import com.vicmatskiv.weaponlib.mission.PlayerMissionSyncMessage;
import com.vicmatskiv.weaponlib.network.NetworkPermitManager;
import com.vicmatskiv.weaponlib.network.PermitMessage;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.particle.SpawnParticleMessage;
import com.vicmatskiv.weaponlib.particle.SpawnParticleMessageHandler;
import com.vicmatskiv.weaponlib.state.Permit;
import com.vicmatskiv.weaponlib.state.StateManager;
import com.vicmatskiv.weaponlib.tracking.SyncPlayerEntityTrackerMessage;
import com.vicmatskiv.weaponlib.tracking.SyncPlayerEntityTrackerMessageMessageHandler;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class CommonModContext
implements ModContext {
    protected String modId;
    protected Object mod;
    protected CompatibleChannel channel;
    protected WeaponReloadAspect weaponReloadAspect;
    protected WeaponAttachmentAspect weaponAttachmentAspect;
    protected WeaponFireAspect weaponFireAspect;
    protected MeleeAttachmentAspect meleeAttachmentAspect;
    protected MeleeAttackAspect meleeAttackAspect;
    protected SyncManager<?> syncManager;
    protected MagazineReloadAspect magazineReloadAspect;
    protected NetworkPermitManager permitManager;
    protected PlayerItemInstanceRegistry playerItemInstanceRegistry;
    private Map<ResourceLocation, CompatibleSound> registeredSounds = new HashMap<ResourceLocation, CompatibleSound>();
    private RecipeManager recipeManager;
    private CompatibleSound changeZoomSound;
    private CompatibleSound changeFireModeSound;
    private CompatibleSound noAmmoSound;
    private CompatibleSound explosionSound;
    private CompatibleSound flashExplosionSound;
    private CompatibleSound nightVisionOnSound;
    private CompatibleSound nightVisionOffSound;
    private Map<BulletImpactSoundKey, MaterialImpactSound> bulletImpactSoundEntries = new HashMap<BulletImpactSoundKey, MaterialImpactSound>();
    private int modEntityID = 256;
    private GrenadeAttackAspect grenadeAttackAspect;
    protected ConfigurationManager configurationManager;
    private Map<Integer, String> registeredTextureNames = new HashMap<Integer, String>();
    private int registeredTextureCounter;
    private MissionManager missionManager;
    protected static ThreadLocal<ModContext> currentContext;

    @Override
    public void preInit(Object mod, String modId, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, CompatibleChannel channel) {
        this.mod = mod;
        this.channel = channel;
        this.modId = modId;
        this.configurationManager = configurationManager;
        this.weaponReloadAspect = new WeaponReloadAspect(this);
        this.magazineReloadAspect = new MagazineReloadAspect(this);
        this.weaponFireAspect = new WeaponFireAspect(this);
        this.weaponAttachmentAspect = new WeaponAttachmentAspect(this);
        this.meleeAttackAspect = new MeleeAttackAspect(this);
        this.meleeAttachmentAspect = new MeleeAttachmentAspect(this);
        this.grenadeAttackAspect = new GrenadeAttackAspect(this);
        StateManager grenadeStateManager = new StateManager((s1, s2) -> s1 == s2);
        this.grenadeAttackAspect.setStateManager(grenadeStateManager);
        this.permitManager = new NetworkPermitManager(this);
        this.syncManager = new SyncManager(this.permitManager);
        this.playerItemInstanceRegistry = new PlayerItemInstanceRegistry(this.syncManager);
        StateManager weaponStateManager = new StateManager((s1, s2) -> s1 == s2);
        this.weaponReloadAspect.setPermitManager(this.permitManager);
        this.weaponReloadAspect.setStateManager(weaponStateManager);
        this.weaponFireAspect.setPermitManager(this.permitManager);
        this.weaponFireAspect.setStateManager(weaponStateManager);
        this.weaponAttachmentAspect.setPermitManager(this.permitManager);
        this.weaponAttachmentAspect.setStateManager(weaponStateManager);
        StateManager meleeStateManager = new StateManager((s1, s2) -> s1 == s2);
        this.meleeAttackAspect.setStateManager(meleeStateManager);
        this.meleeAttachmentAspect.setPermitManager(this.permitManager);
        this.meleeAttachmentAspect.setStateManager(meleeStateManager);
        StateManager magazineStateManager = new StateManager((s1, s2) -> s1 == s2);
        this.magazineReloadAspect.setPermitManager(this.permitManager);
        this.magazineReloadAspect.setStateManager(magazineStateManager);
        this.recipeManager = new RecipeManager();
        channel.registerMessage(new TryFireMessageHandler(this.weaponFireAspect), TryFireMessage.class, 11, CompatibleSide.SERVER);
        channel.registerMessage(this.permitManager, PermitMessage.class, 14, CompatibleSide.SERVER);
        channel.registerMessage(this.permitManager, PermitMessage.class, 15, CompatibleSide.CLIENT);
        channel.registerMessage(new TryAttackMessageHandler(this.meleeAttackAspect), TryAttackMessage.class, 16, CompatibleSide.SERVER);
        channel.registerMessage(new SyncPlayerEntityTrackerMessageMessageHandler(this), SyncPlayerEntityTrackerMessage.class, 17, CompatibleSide.CLIENT);
        channel.registerMessage(new SpawnParticleMessageHandler(this), SpawnParticleMessage.class, 18, CompatibleSide.CLIENT);
        channel.registerMessage(new BlockHitMessageHandler(this), BlockHitMessage.class, 19, CompatibleSide.CLIENT);
        channel.registerMessage(new GrenadeMessageHandler(this.grenadeAttackAspect), GrenadeMessage.class, 20, CompatibleSide.SERVER);
        channel.registerMessage(new ExplosionMessageHandler(this), ExplosionMessage.class, 21, CompatibleSide.CLIENT);
        channel.registerMessage(new ArmorControlHandler(this), ArmorControlMessage.class, 22, CompatibleSide.SERVER);
        channel.registerMessage(new ExposureMessageHandler(this), ExposureMessage.class, 23, CompatibleSide.CLIENT);
        channel.registerMessage(new EntityControlHandler(this), EntityControlMessage.class, 24, CompatibleSide.CLIENT);
        channel.registerMessage(new EntityControlHandler(this), EntityControlMessage.class, 25, CompatibleSide.SERVER);
        channel.registerMessage(new EntityInventorySyncHandler(this), EntityInventorySyncMessage.class, 26, CompatibleSide.CLIENT);
        channel.registerMessage(new EntityInventorySyncHandler(this), EntityInventorySyncMessage.class, 27, CompatibleSide.SERVER);
        channel.registerMessage(new OpenCustomInventoryGuiHandler(this), OpenCustomPlayerInventoryGuiMessage.class, 28, CompatibleSide.SERVER);
        channel.registerMessage(new OpenMissionGuiHandler(this), OpenMissionGuiMessage.class, 29, CompatibleSide.CLIENT);
        channel.registerMessage(new PlayerMissionSyncHandler(this), PlayerMissionSyncMessage.class, 30, CompatibleSide.CLIENT);
        channel.registerMessage(new AcceptMissionHandler(this), AcceptMissionMessage.class, 31, CompatibleSide.SERVER);
        channel.registerMessage(new MissionOfferingSyncHandler(this), MissionOfferingSyncMessage.class, 32, CompatibleSide.CLIENT);
        channel.registerMessage(new EntityMissionOfferingSyncHandler(this), EntityMissionOfferingSyncMessage.class, 33, CompatibleSide.CLIENT);
        ServerEventHandler serverHandler = new ServerEventHandler(this, modId);
        CompatibilityProvider.compatibility.registerWithFmlEventBus(serverHandler);
        CompatibilityProvider.compatibility.registerWithEventBus(serverHandler);
        CompatibilityProvider.compatibility.registerWithFmlEventBus(new WeaponKeyInputHandler(this, ctx -> this.getPlayer((CompatibleMessageContext)ctx), this.weaponAttachmentAspect, channel));
        CompatiblePlayerEntityTrackerProvider.register(this);
        CompatibleExposureCapability.register(this);
        CompatibleExtraEntityFlags.register(this);
        CompatibleCustomPlayerInventoryCapability.register(this);
        CompatibleMissionCapability.register(this);
        CompatibilityProvider.compatibility.registerModEntity(WeaponSpawnEntity.class, "Ammo" + this.modEntityID, this.modEntityID++, mod, modId, 64, 3, true);
        CompatibilityProvider.compatibility.registerModEntity(EntityWirelessCamera.class, "wcam" + this.modEntityID, this.modEntityID++, mod, modId, 200, 3, true);
        CompatibilityProvider.compatibility.registerModEntity(EntityShellCasing.class, "ShellCasing" + this.modEntityID, this.modEntityID++, mod, modId, 64, 500, true);
        CompatibilityProvider.compatibility.registerModEntity(EntityGrenade.class, "Grenade" + this.modEntityID, this.modEntityID++, mod, modId, 64, 10000, false);
        CompatibilityProvider.compatibility.registerModEntity(EntitySmokeGrenade.class, "SmokeGrenade" + this.modEntityID, this.modEntityID++, mod, modId, 64, 10000, false);
        CompatibilityProvider.compatibility.registerModEntity(EntityGasGrenade.class, "GasGrenade" + this.modEntityID, this.modEntityID++, mod, modId, 64, 10000, false);
        CompatibilityProvider.compatibility.registerModEntity(EntityFlashGrenade.class, "FlashGrenade" + this.modEntityID, this.modEntityID++, mod, modId, 64, 10000, false);
        CompatibilityProvider.compatibility.registerModEntity(EntitySpreadable.class, "EntitySpreadable" + this.modEntityID, this.modEntityID++, mod, modId, 64, 3, false);
        File missionsDir = new File(new File(event.getEvent().getSuggestedConfigurationFile().getParent(), "mw"), "missions");
        File entityMissionFile = new File(new File(event.getEvent().getSuggestedConfigurationFile().getParent(), "mw"), "entity_mission_offerings.json");
        this.missionManager = new MissionManager(modId, missionsDir, entityMissionFile);
    }

    @Override
    public MissionManager getMissionManager() {
        return this.missionManager;
    }

    @Override
    public void init(Object mod, String modid) {
        CompatibilityProvider.compatibility.registerGuiHandler(mod, new GuiHandler());
    }

    public static ModContext getContext() {
        return currentContext.get();
    }

    @Override
    public boolean isClient() {
        return false;
    }

    public void registerServerSideOnly() {
    }

    @Override
    public CompatibleSound registerSound(String sound) {
        if (sound == null) {
            return null;
        }
        ResourceLocation soundResourceLocation = new ResourceLocation(this.modId, sound);
        return this.registerSound(soundResourceLocation);
    }

    protected CompatibleSound registerSound(ResourceLocation soundResourceLocation) {
        CompatibleSound result = this.registeredSounds.get(soundResourceLocation);
        if (result == null) {
            result = new CompatibleSound(soundResourceLocation);
            this.registeredSounds.put(soundResourceLocation, result);
            CompatibilityProvider.compatibility.registerSound(result);
        }
        return result;
    }

    @Override
    public void registerWeapon(String name, Weapon weapon, WeaponRenderer renderer) {
        CompatibilityProvider.compatibility.registerItem((Item)weapon, name);
    }

    private EntityPlayer getServerPlayer(CompatibleMessageContext ctx) {
        return ctx != null ? ctx.getPlayer() : null;
    }

    protected EntityPlayer getPlayer(CompatibleMessageContext ctx) {
        return this.getServerPlayer(ctx);
    }

    @Override
    public CompatibleChannel getChannel() {
        return this.channel;
    }

    @Override
    public void runSyncTick(Runnable runnable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void runInMainThread(Runnable runnable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void registerRenderableItem(String name, Item item, Object renderer) {
        CompatibilityProvider.compatibility.registerItem(item, name);
    }

    @Override
    public void registerRenderableItem(ResourceLocation name, Item item, Object renderer) {
        CompatibilityProvider.compatibility.registerItem(item, name);
    }

    @Override
    public PlayerItemInstanceRegistry getPlayerItemInstanceRegistry() {
        return this.playerItemInstanceRegistry;
    }

    @Override
    public WeaponReloadAspect getWeaponReloadAspect() {
        return this.weaponReloadAspect;
    }

    @Override
    public WeaponFireAspect getWeaponFireAspect() {
        return this.weaponFireAspect;
    }

    @Override
    public WeaponAttachmentAspect getAttachmentAspect() {
        return this.weaponAttachmentAspect;
    }

    @Override
    public MagazineReloadAspect getMagazineReloadAspect() {
        return this.magazineReloadAspect;
    }

    @Override
    public MeleeAttackAspect getMeleeAttackAspect() {
        return this.meleeAttackAspect;
    }

    @Override
    public MeleeAttachmentAspect getMeleeAttachmentAspect() {
        return this.meleeAttachmentAspect;
    }

    @Override
    public PlayerWeaponInstance getMainHeldWeapon() {
        throw new IllegalStateException();
    }

    @Override
    public StatusMessageCenter getStatusMessageCenter() {
        throw new IllegalStateException();
    }

    @Override
    public RecipeManager getRecipeManager() {
        return this.recipeManager;
    }

    @Override
    public void setChangeZoomSound(String sound) {
        this.changeZoomSound = this.registerSound(sound.toLowerCase());
    }

    @Override
    public CompatibleSound getZoomSound() {
        return this.changeZoomSound;
    }

    @Override
    public CompatibleSound getChangeFireModeSound() {
        return this.changeFireModeSound;
    }

    @Override
    public void setChangeFireModeSound(String sound) {
        this.changeFireModeSound = this.registerSound(sound.toLowerCase());
    }

    @Override
    public void setNoAmmoSound(String sound) {
        this.noAmmoSound = this.registerSound(sound.toLowerCase());
    }

    @Override
    public CompatibleSound getNoAmmoSound() {
        return this.noAmmoSound;
    }

    @Override
    public void setExplosionSound(String sound) {
        this.explosionSound = this.registerSound(sound.toLowerCase());
    }

    @Override
    public CompatibleSound getExplosionSound() {
        return this.explosionSound;
    }

    @Override
    public CompatibleSound getFlashExplosionSound() {
        return this.flashExplosionSound;
    }

    @Override
    public void setFlashExplosionSound(String sound) {
        this.flashExplosionSound = this.registerSound(sound.toLowerCase());
    }

    @Override
    public void setNightVisionOnSound(String sound) {
        this.nightVisionOnSound = this.registerSound(sound.toLowerCase());
    }

    @Override
    public CompatibleSound getNightVisionOnSound() {
        return this.nightVisionOnSound;
    }

    @Override
    public void setNightVisionOffSound(String sound) {
        this.nightVisionOffSound = this.registerSound(sound.toLowerCase());
    }

    @Override
    public CompatibleSound getNightVisionOffSound() {
        return this.nightVisionOffSound;
    }

    @Override
    public void registerMeleeWeapon(String name, ItemMelee itemMelee, MeleeRenderer renderer) {
        CompatibilityProvider.compatibility.registerItem((Item)itemMelee, name);
    }

    @Override
    public void registerGrenadeWeapon(String name, ItemGrenade itemMelee, GrenadeRenderer renderer) {
        CompatibilityProvider.compatibility.registerItem((Item)itemMelee, name);
    }

    @Override
    public ResourceLocation getNamedResource(String name) {
        return new ResourceLocation(this.modId, name);
    }

    @Override
    public float getAspectRatio() {
        return 1.0f;
    }

    @Override
    public AttachmentContainer getGrenadeAttachmentAspect() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public GrenadeAttackAspect getGrenadeAttackAspect() {
        return this.grenadeAttackAspect;
    }

    @Override
    public String getModId() {
        return this.modId;
    }

    @Override
    public Object getMod() {
        return this.mod;
    }

    @Override
    public EffectManager getEffectManager() {
        throw new IllegalStateException();
    }

    @Override
    public ConfigurationManager getConfigurationManager() {
        return this.configurationManager;
    }

    @Override
    public void registerRenderableEntity(Class<? extends Entity> entityClass, Object renderer) {
    }

    @Override
    public void setPlayerTransitionProvider(PlayerTransitionProvider playerTransitionProvider) {
    }

    @Override
    public CommonModContext setMaterialsImpactSound(String sound, Item bulletItem, float volume, CompatibleMaterial ... materials) {
        for (CompatibleMaterial material : materials) {
            MaterialImpactSound materialImpactSound = this.bulletImpactSoundEntries.computeIfAbsent(new BulletImpactSoundKey(material, bulletItem), key -> new MaterialImpactSound(volume));
            materialImpactSound.addSound(this.registerSound(sound.toLowerCase()));
        }
        return this;
    }

    @Override
    public CommonModContext setMaterialImpactSound(String sound, float volume, CompatibleMaterial material) {
        MaterialImpactSound materialImpactSound = this.bulletImpactSoundEntries.computeIfAbsent(new BulletImpactSoundKey(material, null), key -> new MaterialImpactSound(volume));
        materialImpactSound.addSound(this.registerSound(sound.toLowerCase()));
        return this;
    }

    @Override
    public CommonModContext setMaterialsImpactSound(String sound, float volume, CompatibleMaterial ... materials) {
        for (CompatibleMaterial material : materials) {
            MaterialImpactSound materialImpactSound = this.bulletImpactSoundEntries.computeIfAbsent(new BulletImpactSoundKey(material, null), key -> new MaterialImpactSound(volume));
            materialImpactSound.addSound(this.registerSound(sound.toLowerCase()));
        }
        return this;
    }

    @Override
    public CommonModContext setMaterialsImpactSound(String sound, CompatibleMaterial ... materials) {
        for (CompatibleMaterial material : materials) {
            MaterialImpactSound materialImpactSound = this.bulletImpactSoundEntries.computeIfAbsent(new BulletImpactSoundKey(material, null), key -> new MaterialImpactSound(1.0f));
            materialImpactSound.addSound(this.registerSound(sound.toLowerCase()));
        }
        return this;
    }

    @Override
    public MaterialImpactSound getMaterialImpactSound(CompatibleBlockState blockState, WeaponSpawnEntity entity) {
        MaterialImpactSound materialImpactSound = this.bulletImpactSoundEntries.get(new BulletImpactSoundKey(blockState.getMaterial(), entity.getSpawnedItem()));
        if (materialImpactSound == null) {
            this.bulletImpactSoundEntries.get(new BulletImpactSoundKey(blockState.getMaterial(), null));
        }
        return materialImpactSound;
    }

    @Override
    public CommonModContext setMaterialImpactSounds(CompatibleMaterial material, float volume, String ... sounds) {
        for (String sound : sounds) {
            this.setMaterialImpactSound(sound, volume, material);
        }
        return this;
    }

    @Override
    public int getRegisteredTextureId(String textureName) {
        if (textureName == null) {
            return -1;
        }
        Optional<Map.Entry> existingEntry = this.registeredTextureNames.entrySet().stream().filter(e -> textureName.equals(e.getValue())).findFirst();
        return existingEntry.isPresent() ? (Integer)existingEntry.get().getKey() : -1;
    }

    @Override
    public String getRegisteredTexture(int textureId) {
        return this.registeredTextureNames.get(textureId);
    }

    @Override
    public int registerTexture(String textureName) {
        int id;
        if (textureName == null) {
            return -1;
        }
        Optional<Map.Entry> existingEntry = this.registeredTextureNames.entrySet().stream().filter(e -> textureName.equals(e.getValue())).findFirst();
        if (existingEntry.isPresent()) {
            id = (Integer)existingEntry.get().getKey();
        } else {
            id = this.registeredTextureCounter++;
            this.registeredTextureNames.put(id, textureName);
        }
        return id;
    }

    static {
        TypeRegistry.getInstance().register(MagazineReloadAspect.LoadPermit.class);
        TypeRegistry.getInstance().register(MagazineState.class);
        TypeRegistry.getInstance().register(PlayerItemInstance.class);
        TypeRegistry.getInstance().register(PlayerWeaponInstance.class);
        TypeRegistry.getInstance().register(PlayerMagazineInstance.class);
        TypeRegistry.getInstance().register(PlayerWeaponInstance.class);
        TypeRegistry.getInstance().register(Permit.class);
        TypeRegistry.getInstance().register(WeaponAttachmentAspect.EnterAttachmentModePermit.class);
        TypeRegistry.getInstance().register(WeaponAttachmentAspect.ExitAttachmentModePermit.class);
        TypeRegistry.getInstance().register(WeaponAttachmentAspect.ChangeAttachmentPermit.class);
        TypeRegistry.getInstance().register(WeaponReloadAspect.UnloadPermit.class);
        TypeRegistry.getInstance().register(MagazineReloadAspect.LoadPermit.class);
        TypeRegistry.getInstance().register(PlayerWeaponInstance.class);
        TypeRegistry.getInstance().register(WeaponState.class);
        TypeRegistry.getInstance().register(PlayerMeleeInstance.class);
        TypeRegistry.getInstance().register(PlayerGrenadeInstance.class);
        TypeRegistry.getInstance().register(PlayerTabletInstance.class);
        TypeRegistry.getInstance().register(PlayerHandheldInstance.class);
        TypeRegistry.getInstance().register(MeleeState.class);
        TypeRegistry.getInstance().register(TabletState.class);
        TypeRegistry.getInstance().register(HandheldState.class);
        TypeRegistry.getInstance().register(SpreadableExposure.class);
        TypeRegistry.getInstance().register(LightExposure.class);
        TypeRegistry.getInstance().register(Mission.class);
        TypeRegistry.getInstance().register(Goal.class);
        TypeRegistry.getInstance().register(KillEntityAction.class);
        TypeRegistry.getInstance().register(ObtainItemAction.class);
        TypeRegistry.getInstance().register(GoToLocationAction.class);
        TypeRegistry.getInstance().register(MissionReward.ItemReward.class);
        TypeRegistry.getInstance().register(MissionOffering.class);
        TypeRegistry.getInstance().register(MissionOffering.NoMissionsInProgressRequirement.class);
        TypeRegistry.getInstance().register(MissionOffering.CompletedMissionRequirement.class);
        TypeRegistry.getInstance().register(MissionOffering.CooldownMissionRequirement.class);
        TypeRegistry.getInstance().register(MissionOffering.CompositeRequirement.class);
        TypeRegistry.getInstance().register(MissionOffering.NoRequirement.class);
        currentContext = new ThreadLocal();
    }

    static class BulletImpactSoundKey {
        private CompatibleMaterial material;
        private Item bulletItem;

        public BulletImpactSoundKey(CompatibleMaterial material, Item bulletItem) {
            this.material = material;
            this.bulletItem = bulletItem;
        }

        public int hashCode() {
            int prime = 31;
            int result = 1;
            result = 31 * result + (this.bulletItem == null ? 0 : this.bulletItem.hashCode());
            result = 31 * result + (this.material == null ? 0 : this.material.hashCode());
            return result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            BulletImpactSoundKey other = (BulletImpactSoundKey)obj;
            if (this.bulletItem != other.bulletItem) {
                return false;
            }
            return !(this.material == null ? other.material != null : !this.material.equals(other.material));
        }
    }
}


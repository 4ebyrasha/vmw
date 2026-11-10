/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.Item
 *  net.minecraft.util.ResourceLocation
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AttachmentContainer;
import com.vicmatskiv.weaponlib.CommonModContext;
import com.vicmatskiv.weaponlib.EffectManager;
import com.vicmatskiv.weaponlib.MagazineReloadAspect;
import com.vicmatskiv.weaponlib.MaterialImpactSound;
import com.vicmatskiv.weaponlib.PlayerItemInstanceRegistry;
import com.vicmatskiv.weaponlib.PlayerTransitionProvider;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.StatusMessageCenter;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponFireAspect;
import com.vicmatskiv.weaponlib.WeaponReloadAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WeaponSpawnEntity;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockState;
import com.vicmatskiv.weaponlib.compatibility.CompatibleChannel;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMaterial;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.RecipeManager;
import com.vicmatskiv.weaponlib.grenade.GrenadeAttackAspect;
import com.vicmatskiv.weaponlib.grenade.GrenadeRenderer;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeAttachmentAspect;
import com.vicmatskiv.weaponlib.melee.MeleeAttackAspect;
import com.vicmatskiv.weaponlib.melee.MeleeRenderer;
import com.vicmatskiv.weaponlib.mission.MissionManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public interface ModContext {
    public boolean isClient();

    public void preInit(Object var1, String var2, ConfigurationManager var3, CompatibleFmlPreInitializationEvent var4, CompatibleChannel var5);

    public void registerWeapon(String var1, Weapon var2, WeaponRenderer var3);

    public CompatibleChannel getChannel();

    public void runSyncTick(Runnable var1);

    public void registerRenderableItem(String var1, Item var2, Object var3);

    public void registerRenderableItem(ResourceLocation var1, Item var2, Object var3);

    public CompatibleSound registerSound(String var1);

    public void runInMainThread(Runnable var1);

    public PlayerItemInstanceRegistry getPlayerItemInstanceRegistry();

    public WeaponReloadAspect getWeaponReloadAspect();

    public WeaponFireAspect getWeaponFireAspect();

    public WeaponAttachmentAspect getAttachmentAspect();

    public MagazineReloadAspect getMagazineReloadAspect();

    public PlayerWeaponInstance getMainHeldWeapon();

    public StatusMessageCenter getStatusMessageCenter();

    public RecipeManager getRecipeManager();

    public CompatibleSound getZoomSound();

    public void setChangeZoomSound(String var1);

    public CompatibleSound getChangeFireModeSound();

    public void setChangeFireModeSound(String var1);

    public CompatibleSound getNoAmmoSound();

    public void setNoAmmoSound(String var1);

    public CompatibleSound getExplosionSound();

    public void setExplosionSound(String var1);

    public CompatibleSound getFlashExplosionSound();

    public void setFlashExplosionSound(String var1);

    public void setNightVisionOnSound(String var1);

    public CompatibleSound getNightVisionOnSound();

    public void setNightVisionOffSound(String var1);

    public CompatibleSound getNightVisionOffSound();

    public void registerMeleeWeapon(String var1, ItemMelee var2, MeleeRenderer var3);

    public void registerGrenadeWeapon(String var1, ItemGrenade var2, GrenadeRenderer var3);

    public MeleeAttackAspect getMeleeAttackAspect();

    public MeleeAttachmentAspect getMeleeAttachmentAspect();

    public AttachmentContainer getGrenadeAttachmentAspect();

    public ResourceLocation getNamedResource(String var1);

    public float getAspectRatio();

    public GrenadeAttackAspect getGrenadeAttackAspect();

    public String getModId();

    public EffectManager getEffectManager();

    public ConfigurationManager getConfigurationManager();

    public Object getMod();

    public void registerRenderableEntity(Class<? extends Entity> var1, Object var2);

    public void setPlayerTransitionProvider(PlayerTransitionProvider var1);

    public void init(Object var1, String var2);

    public MaterialImpactSound getMaterialImpactSound(CompatibleBlockState var1, WeaponSpawnEntity var2);

    public CommonModContext setMaterialsImpactSound(String var1, Item var2, float var3, CompatibleMaterial ... var4);

    public CommonModContext setMaterialImpactSound(String var1, float var2, CompatibleMaterial var3);

    public CommonModContext setMaterialsImpactSound(String var1, float var2, CompatibleMaterial ... var3);

    public CommonModContext setMaterialsImpactSound(String var1, CompatibleMaterial ... var2);

    public CommonModContext setMaterialImpactSounds(CompatibleMaterial var1, float var2, String ... var3);

    public int getRegisteredTextureId(String var1);

    public int registerTexture(String var1);

    public String getRegisteredTexture(int var1);

    public MissionManager getMissionManager();
}


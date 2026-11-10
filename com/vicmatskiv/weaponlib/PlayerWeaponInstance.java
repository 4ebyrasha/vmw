/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AsyncWeaponState;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemScope;
import com.vicmatskiv.weaponlib.MiscUtils;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponState;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.perspective.OpticalScopePerspective;
import com.vicmatskiv.weaponlib.perspective.Perspective;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroupSource;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroupSourceProvider;
import com.vicmatskiv.weaponlib.shader.DynamicShaderPhase;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Deque;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerWeaponInstance
extends PlayerItemInstance<WeaponState>
implements DynamicShaderGroupSourceProvider {
    private static final int SERIAL_VERSION = 9;
    private static final Logger logger = LogManager.getLogger(PlayerWeaponInstance.class);
    private static final UUID NIGHT_VISION_SOURCE_UUID;
    private static final UUID VIGNETTE_SOURCE_UUID;
    private static final UUID BLUR_SOURCE_UUID;
    public final DynamicShaderGroupSource BLUR_SOURCE = new DynamicShaderGroupSource(BLUR_SOURCE_UUID, new ResourceLocation("weaponlib:/com/vicmatskiv/weaponlib/resources/blur.json")).withUniform("Radius", context -> Float.valueOf(this.hasOpticScope() ? 10.0f : 5.0f)).withUniform("Progress", context -> Float.valueOf(this.getAimChangeProgress()));
    public final DynamicShaderGroupSource NIGHT_VISION_SOURCE = new DynamicShaderGroupSource(NIGHT_VISION_SOURCE_UUID, new ResourceLocation("weaponlib:/com/vicmatskiv/weaponlib/resources/night-vision.json")).withUniform("IntensityAdjust", context -> Float.valueOf(40.0f - Minecraft.func_71410_x().field_71474_y.field_74333_Y * 38.0f)).withUniform("NoiseAmplification", context -> Float.valueOf(2.0f + 3.0f * Minecraft.func_71410_x().field_71474_y.field_74333_Y));
    public final DynamicShaderGroupSource VIGNETTE_SOURCE = new DynamicShaderGroupSource(VIGNETTE_SOURCE_UUID, new ResourceLocation("weaponlib:/com/vicmatskiv/weaponlib/resources/vignette.json")).withUniform("Radius", context -> Float.valueOf(this.getOpticScopeVignetteRadius(context.getPartialTicks())));
    private static final long AIM_CHANGE_DURATION = 1200L;
    private int ammo;
    private float recoil;
    private int seriesShotCount;
    private long lastFireTimestamp;
    private boolean aimed;
    private int maxShots;
    private float zoom = 1.0f;
    private byte activeTextureIndex;
    private boolean laserOn;
    private long aimChangeTimestamp;
    private boolean nightVisionOn;
    private boolean seriesResetAllowed;
    private long lastBurstEndTimestamp;
    private boolean altModificationModeEnabled;
    private int loadIterationCount;
    private boolean loadAfterUnloadEnabled;
    private Deque<AsyncWeaponState> filteredStateQueue = new LinkedBlockingDeque<AsyncWeaponState>();
    private int[] activeAttachmentIds = new int[0];
    private byte[] selectedAttachmentIndexes = new byte[0];

    public PlayerWeaponInstance() {
    }

    public PlayerWeaponInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    public PlayerWeaponInstance(int itemInventoryIndex, EntityLivingBase player) {
        super(itemInventoryIndex, player);
    }

    @Override
    protected int getSerialVersion() {
        return 9;
    }

    private void addStateToHistory(WeaponState state) {
        long expirationTimeout;
        AsyncWeaponState t;
        while ((t = this.filteredStateQueue.peekFirst()) != null && t.getState().getPriority() < state.getPriority()) {
            this.filteredStateQueue.pollFirst();
        }
        if (state == WeaponState.FIRING || state == WeaponState.RECOILED || state == WeaponState.PAUSED) {
            expirationTimeout = this.isAutomaticModeEnabled() && !this.getWeapon().hasRecoilPositioning() ? (long)(50.0f / this.getFireRate()) : 500L;
            expirationTimeout = 500L;
        } else {
            expirationTimeout = Integer.MAX_VALUE;
        }
        this.filteredStateQueue.addFirst(new AsyncWeaponState(state, this.stateUpdateTimestamp, expirationTimeout));
    }

    @Override
    public boolean setState(WeaponState state) {
        boolean result = super.setState(state);
        this.addStateToHistory(state);
        return result;
    }

    public AsyncWeaponState nextHistoryState() {
        AsyncWeaponState result = this.filteredStateQueue.pollLast();
        if (result == null) {
            result = new AsyncWeaponState((WeaponState)this.getState(), this.stateUpdateTimestamp);
        }
        return result;
    }

    public int getAmmo() {
        return this.ammo;
    }

    public void setAmmo(int ammo) {
        if (ammo != this.ammo) {
            this.ammo = ammo;
            this.markDirty();
        }
    }

    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
        this.activeAttachmentIds = PlayerWeaponInstance.initIntArray(buf);
        this.selectedAttachmentIndexes = PlayerWeaponInstance.initByteArray(buf);
        this.ammo = buf.readInt();
        this.aimed = buf.readBoolean();
        this.recoil = buf.readFloat();
        this.maxShots = buf.readInt();
        this.zoom = buf.readFloat();
        this.activeTextureIndex = buf.readByte();
        this.laserOn = buf.readBoolean();
        this.nightVisionOn = buf.readBoolean();
        this.loadIterationCount = buf.readInt();
        this.loadAfterUnloadEnabled = buf.readBoolean();
        this.altModificationModeEnabled = buf.readBoolean();
    }

    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
        PlayerWeaponInstance.serializeIntArray(buf, this.activeAttachmentIds);
        PlayerWeaponInstance.serializeByteArray(buf, this.selectedAttachmentIndexes);
        buf.writeInt(this.ammo);
        buf.writeBoolean(this.aimed);
        buf.writeFloat(this.recoil);
        buf.writeInt(this.maxShots);
        buf.writeFloat(this.zoom);
        buf.writeByte((int)this.activeTextureIndex);
        buf.writeBoolean(this.laserOn);
        buf.writeBoolean(this.nightVisionOn);
        buf.writeInt(this.loadIterationCount);
        buf.writeBoolean(this.loadAfterUnloadEnabled);
        buf.writeBoolean(this.altModificationModeEnabled);
    }

    private static void serializeIntArray(ByteBuf buf, int[] a) {
        buf.writeByte(a.length);
        for (int i = 0; i < a.length; ++i) {
            buf.writeInt(a[i]);
        }
    }

    private static void serializeByteArray(ByteBuf buf, byte[] a) {
        buf.writeByte(a.length);
        for (int i = 0; i < a.length; ++i) {
            buf.writeByte((int)a[i]);
        }
    }

    private static int[] initIntArray(ByteBuf buf) {
        int length = buf.readByte();
        int[] a = new int[length];
        for (int i = 0; i < length; ++i) {
            a[i] = buf.readInt();
        }
        return a;
    }

    private static byte[] initByteArray(ByteBuf buf) {
        int length = buf.readByte();
        byte[] a = new byte[length];
        for (int i = 0; i < length; ++i) {
            a[i] = buf.readByte();
        }
        return a;
    }

    @Override
    protected void updateWith(PlayerItemInstance<WeaponState> otherItemInstance, boolean updateManagedState) {
        super.updateWith(otherItemInstance, updateManagedState);
        PlayerWeaponInstance otherWeaponInstance = (PlayerWeaponInstance)otherItemInstance;
        this.setAmmo(otherWeaponInstance.ammo);
        this.setZoom(otherWeaponInstance.zoom);
        this.setRecoil(otherWeaponInstance.recoil);
        this.setSelectedAttachmentIndexes(otherWeaponInstance.selectedAttachmentIndexes);
        this.setActiveAttachmentIds(otherWeaponInstance.activeAttachmentIds);
        this.setActiveTextureIndex(otherWeaponInstance.activeTextureIndex);
        this.setLaserOn(otherWeaponInstance.laserOn);
        this.setMaxShots(otherWeaponInstance.maxShots);
        this.setLoadIterationCount(otherWeaponInstance.loadIterationCount);
        this.setLoadAfterUnloadEnabled(otherWeaponInstance.loadAfterUnloadEnabled);
    }

    public Weapon getWeapon() {
        return (Weapon)this.item;
    }

    public float getRecoil() {
        return this.recoil;
    }

    public void setRecoil(float recoil) {
        if (recoil != this.recoil) {
            this.recoil = recoil;
            this.markDirty();
        }
    }

    public boolean isLoadAfterUnloadEnabled() {
        return this.loadAfterUnloadEnabled;
    }

    public void setLoadAfterUnloadEnabled(boolean loadAfterUnloadEnabled) {
        this.loadAfterUnloadEnabled = loadAfterUnloadEnabled;
    }

    public int getMaxShots() {
        return this.maxShots;
    }

    void setMaxShots(int maxShots) {
        if (this.maxShots != maxShots) {
            this.maxShots = maxShots;
            this.markDirty();
        }
    }

    public int getSeriesShotCount() {
        return this.seriesShotCount;
    }

    public void setSeriesShotCount(int seriesShotCount) {
        this.seriesShotCount = seriesShotCount;
    }

    public long getLastFireTimestamp() {
        return this.lastFireTimestamp;
    }

    public void setLastFireTimestamp(long lastFireTimestamp) {
        this.lastFireTimestamp = lastFireTimestamp;
    }

    public void resetCurrentSeries() {
        this.seriesShotCount = 0;
        this.seriesResetAllowed = false;
    }

    public void setLastBurstEndTimestamp(long lastBurstEndTimestamp) {
        this.lastBurstEndTimestamp = lastBurstEndTimestamp;
    }

    public long getLastBurstEndTimestamp() {
        return this.lastBurstEndTimestamp;
    }

    public void setSeriesResetAllowed(boolean seriesResetAllowed) {
        this.seriesResetAllowed = seriesResetAllowed;
    }

    public boolean isSeriesResetAllowed() {
        return this.seriesResetAllowed;
    }

    public float getFireRate() {
        return this.getWeapon().builder.fireRate;
    }

    public boolean isOneClickBurstAllowed() {
        return this.getWeapon().builder.isOneClickBurstAllowed;
    }

    public boolean isAutomaticModeEnabled() {
        return this.maxShots > 1;
    }

    public boolean isAimed() {
        return this.aimed;
    }

    public void setAimed(boolean aimed) {
        if (aimed != this.aimed) {
            this.aimed = aimed;
            this.markDirty();
            this.aimChangeTimestamp = System.currentTimeMillis();
        }
    }

    public int[] getActiveAttachmentIds() {
        if (this.activeAttachmentIds == null || this.activeAttachmentIds.length != AttachmentCategory.values.length) {
            this.activeAttachmentIds = new int[AttachmentCategory.values.length];
            for (CompatibleAttachment<Weapon> attachment : this.getWeapon().getCompatibleAttachments().values()) {
                if (!attachment.isDefault()) continue;
                this.activeAttachmentIds[attachment.getAttachment().getCategory().ordinal()] = Item.func_150891_b(attachment.getAttachment());
            }
        }
        return this.activeAttachmentIds;
    }

    void setActiveAttachmentIds(int[] activeAttachmentIds) {
        if (!Arrays.equals(this.activeAttachmentIds, activeAttachmentIds)) {
            this.activeAttachmentIds = activeAttachmentIds;
            this.markDirty();
        }
    }

    public byte[] getSelectedAttachmentIds() {
        return this.selectedAttachmentIndexes;
    }

    void setSelectedAttachmentIndexes(byte[] selectedAttachmentIndexes) {
        if (!Arrays.equals(this.selectedAttachmentIndexes, selectedAttachmentIndexes)) {
            this.selectedAttachmentIndexes = selectedAttachmentIndexes;
            this.markDirty();
        }
    }

    public boolean isAttachmentZoomEnabled() {
        ItemAttachment<Weapon> scopeItem = this.getAttachmentItemWithCategory(AttachmentCategory.SCOPE);
        return scopeItem instanceof ItemScope;
    }

    public ItemAttachment<Weapon> getAttachmentItemWithCategory(AttachmentCategory category) {
        if (this.activeAttachmentIds == null || this.activeAttachmentIds.length <= category.ordinal()) {
            return null;
        }
        Item activeAttachment = Item.func_150899_d((int)this.activeAttachmentIds[category.ordinal()]);
        if (activeAttachment instanceof ItemAttachment) {
            return (ItemAttachment)activeAttachment;
        }
        return null;
    }

    public float getZoom() {
        return this.zoom;
    }

    public void setZoom(float zoom) {
        if (this.zoom != zoom) {
            this.zoom = zoom;
            this.markDirty();
        }
    }

    public boolean isLaserOn() {
        return this.laserOn;
    }

    public void setLaserOn(boolean laserOn) {
        if (this.laserOn != laserOn) {
            this.laserOn = laserOn;
            this.markDirty();
        }
    }

    public boolean isNightVisionOn() {
        return this.nightVisionOn;
    }

    public void setNightVisionOn(boolean nightVisionOn) {
        if (this.nightVisionOn != nightVisionOn) {
            this.nightVisionOn = nightVisionOn;
            this.markDirty();
        }
    }

    public int getActiveTextureIndex() {
        return this.activeTextureIndex;
    }

    public void setActiveTextureIndex(int activeTextureIndex) {
        if (this.activeTextureIndex != activeTextureIndex) {
            if (activeTextureIndex > 127) {
                throw new IllegalArgumentException("activeTextureIndex must be less than 127");
            }
            this.activeTextureIndex = (byte)activeTextureIndex;
            this.markDirty();
        }
    }

    @Override
    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        ItemAttachment<Weapon> scope;
        Class<OpticalScopePerspective> result = null;
        if (this.isAimed() && (scope = this.getAttachmentItemWithCategory(AttachmentCategory.SCOPE)) instanceof ItemScope && ((ItemScope)scope).isOptical()) {
            result = OpticalScopePerspective.class;
        }
        return result;
    }

    private boolean hasOpticScope() {
        ItemAttachment<Weapon> scope = this.getAttachmentItemWithCategory(AttachmentCategory.SCOPE);
        return scope instanceof ItemScope && ((ItemScope)scope).isOptical();
    }

    public ItemScope getScope() {
        ItemAttachment<Weapon> scope = this.getAttachmentItemWithCategory(AttachmentCategory.SCOPE);
        return scope instanceof ItemScope ? (ItemScope)scope : null;
    }

    private float getOpticScopeVignetteRadius(float partialTicks) {
        EntityPlayer player = CompatibilityProvider.compatibility.getClientPlayer();
        float f2 = player.field_71107_bF + (player.field_71109_bG - player.field_71107_bF) * partialTicks;
        return -2.0f * f2 + 0.55f;
    }

    private float getAimChangeProgress() {
        float p = MiscUtils.clamp((float)(System.currentTimeMillis() - this.aimChangeTimestamp) / 1200.0f, 0.0f, 1.0f);
        if (!this.isAimed()) {
            p = 1.0f - p;
        }
        return p;
    }

    @Override
    public DynamicShaderGroupSource getShaderSource(DynamicShaderPhase phase) {
        ItemScope scope;
        if (this.isAimed() && phase == DynamicShaderPhase.POST_WORLD_OPTICAL_SCOPE_RENDER && (scope = this.getScope()).isOptical()) {
            return scope.hasNightVision() && this.nightVisionOn ? this.NIGHT_VISION_SOURCE : this.VIGNETTE_SOURCE;
        }
        Boolean blurOnAim = true;
        if (this.getWeapon() != null && this.getWeapon().getModContext() != null && this.getWeapon().getModContext().getConfigurationManager().getProjectiles() != null && (blurOnAim = this.getWeapon().getModContext().getConfigurationManager().getProjectiles().isBlurOnAim()) == null) {
            blurOnAim = true;
        }
        float progress = this.getAimChangeProgress();
        return blurOnAim != false && phase == DynamicShaderPhase.PRE_ITEM_RENDER && (this.isAimed() || progress > 0.0f && progress < 1.0f) ? this.BLUR_SOURCE : null;
    }

    public void setLoadIterationCount(int loadIterationCount) {
        this.loadIterationCount = loadIterationCount;
    }

    public int getLoadIterationCount() {
        return this.loadIterationCount;
    }

    @Override
    protected void reconcile() {
        ItemStack itemStack = this.getItemStack();
        if (itemStack != null) {
            int expectedStackAmmo = Tags.getAmmo(itemStack);
            if (this.ammo > expectedStackAmmo) {
                logger.debug("Reconciling. Expected ammo: {}, actual: {}", (Object)expectedStackAmmo, (Object)this.ammo);
                this.ammo = expectedStackAmmo;
            }
            this.updateTimestamp = System.currentTimeMillis();
        }
    }

    public String toString() {
        return this.getWeapon().builder.name + "[" + this.getUuid() + "]";
    }

    public boolean isAltMofificationModeEnabled() {
        return this.altModificationModeEnabled;
    }

    public void setAltModificationModeEnabled(boolean altModificationModeEnabled) {
        this.altModificationModeEnabled = altModificationModeEnabled;
    }

    static {
        TypeRegistry.getInstance().register(PlayerWeaponInstance.class);
        NIGHT_VISION_SOURCE_UUID = UUID.randomUUID();
        VIGNETTE_SOURCE_UUID = UUID.randomUUID();
        BLUR_SOURCE_UUID = UUID.randomUUID();
    }
}


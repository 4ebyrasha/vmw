/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.melee;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.melee.AsyncMeleeState;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeState;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerMeleeInstance
extends PlayerItemInstance<MeleeState> {
    private static final int SERIAL_VERSION = 7;
    private static final Logger logger = LogManager.getLogger(PlayerMeleeInstance.class);
    private int ammo;
    private long lastFireTimestamp;
    private byte activeTextureIndex;
    private Deque<AsyncMeleeState> filteredStateQueue = new LinkedBlockingDeque<AsyncMeleeState>();
    private int[] activeAttachmentIds = new int[0];
    private byte[] selectedAttachmentIndexes = new byte[0];

    public PlayerMeleeInstance() {
    }

    public PlayerMeleeInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    public PlayerMeleeInstance(int itemInventoryIndex, EntityLivingBase player) {
        super(itemInventoryIndex, player);
    }

    @Override
    protected int getSerialVersion() {
        return 7;
    }

    private void addStateToHistory(MeleeState state) {
        AsyncMeleeState t;
        while ((t = this.filteredStateQueue.peekFirst()) != null && t.getState().getPriority() < state.getPriority()) {
            this.filteredStateQueue.pollFirst();
        }
        long expirationTimeout = 500L;
        this.filteredStateQueue.addFirst(new AsyncMeleeState(state, this.stateUpdateTimestamp, expirationTimeout));
    }

    @Override
    public boolean setState(MeleeState state) {
        boolean result = super.setState(state);
        this.addStateToHistory(state);
        return result;
    }

    public AsyncMeleeState nextHistoryState() {
        AsyncMeleeState result = this.filteredStateQueue.pollLast();
        if (result == null) {
            result = new AsyncMeleeState((MeleeState)this.getState(), this.stateUpdateTimestamp);
        }
        return result;
    }

    public int getAmmo() {
        return this.ammo;
    }

    protected void setAmmo(int ammo) {
        if (ammo != this.ammo) {
            this.ammo = ammo;
            this.markDirty();
        }
    }

    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
        this.activeAttachmentIds = PlayerMeleeInstance.initIntArray(buf);
        this.selectedAttachmentIndexes = PlayerMeleeInstance.initByteArray(buf);
        this.ammo = buf.readInt();
        this.activeTextureIndex = buf.readByte();
    }

    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
        PlayerMeleeInstance.serializeIntArray(buf, this.activeAttachmentIds);
        PlayerMeleeInstance.serializeByteArray(buf, this.selectedAttachmentIndexes);
        buf.writeInt(this.ammo);
        buf.writeByte((int)this.activeTextureIndex);
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
    protected void updateWith(PlayerItemInstance<MeleeState> otherItemInstance, boolean updateManagedState) {
        super.updateWith(otherItemInstance, updateManagedState);
        PlayerMeleeInstance otherWeaponInstance = (PlayerMeleeInstance)otherItemInstance;
        this.setAmmo(otherWeaponInstance.ammo);
        this.setSelectedAttachmentIndexes(otherWeaponInstance.selectedAttachmentIndexes);
        this.setActiveAttachmentIds(otherWeaponInstance.activeAttachmentIds);
        this.setActiveTextureIndex(otherWeaponInstance.activeTextureIndex);
    }

    public ItemMelee getWeapon() {
        return (ItemMelee)this.item;
    }

    public long getLastAttackTimestamp() {
        return this.lastFireTimestamp;
    }

    void setLastAttackTimestamp(long lastFireTimestamp) {
        this.lastFireTimestamp = lastFireTimestamp;
    }

    public int[] getActiveAttachmentIds() {
        if (this.activeAttachmentIds == null || this.activeAttachmentIds.length != AttachmentCategory.values.length) {
            this.activeAttachmentIds = new int[AttachmentCategory.values.length];
            for (CompatibleAttachment<ItemMelee> attachment : this.getWeapon().getCompatibleAttachments().values()) {
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

    public ItemAttachment<ItemMelee> getAttachmentItemWithCategory(AttachmentCategory category) {
        if (this.activeAttachmentIds == null || this.activeAttachmentIds.length <= category.ordinal()) {
            return null;
        }
        Item scopeItem = Item.func_150899_d((int)this.activeAttachmentIds[category.ordinal()]);
        return (ItemAttachment)scopeItem;
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

    public String toString() {
        return this.getWeapon().builder.name + "[" + this.getUuid() + "]";
    }

    static {
        TypeRegistry.getInstance().register(PlayerMeleeInstance.class);
    }
}


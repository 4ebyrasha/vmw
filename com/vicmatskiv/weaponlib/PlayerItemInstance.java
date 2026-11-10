/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.PlayerContext;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.network.UniversalObject;
import com.vicmatskiv.weaponlib.perspective.Perspective;
import com.vicmatskiv.weaponlib.state.ExtendedState;
import com.vicmatskiv.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerItemInstance<S extends ManagedState<S>>
extends UniversalObject
implements ExtendedState<S>,
PlayerContext {
    private static final Logger logger = LogManager.getLogger(PlayerItemInstance.class);
    protected S state;
    protected long stateUpdateTimestamp = System.currentTimeMillis();
    private long updateId;
    protected EntityLivingBase player;
    protected Item item;
    protected int itemInventoryIndex;
    private PlayerItemInstance<S> preparedState;
    private long syncStartTimestamp;
    protected long updateTimestamp;

    public PlayerItemInstance() {
    }

    public PlayerItemInstance(int itemInventoryIndex, EntityLivingBase player) {
        this.itemInventoryIndex = itemInventoryIndex;
        this.player = player;
        ItemStack itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand(player);
        if (itemStack != null) {
            this.item = itemStack.func_77973_b();
        }
    }

    public PlayerItemInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
        this.itemInventoryIndex = itemInventoryIndex;
        this.player = player;
        if (itemStack != null) {
            this.item = itemStack.func_77973_b();
        }
    }

    @Override
    public EntityLivingBase getPlayer() {
        return this.player;
    }

    @Override
    public void setPlayer(EntityLivingBase player) {
        this.player = player;
    }

    public Item getItem() {
        return this.item;
    }

    public ItemStack getItemStack() {
        return this.player instanceof EntityPlayer ? CompatibilityProvider.compatibility.getInventoryItemStack((EntityPlayer)this.player, this.itemInventoryIndex) : null;
    }

    public int getItemInventoryIndex() {
        return this.itemInventoryIndex;
    }

    protected void setItemInventoryIndex(int itemInventoryIndex) {
        this.itemInventoryIndex = itemInventoryIndex;
    }

    protected <T extends PlayerItemInstance<S>> T getPreparedState() {
        return (T)this.preparedState;
    }

    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
        this.item = Item.func_150899_d((int)buf.readInt());
        this.itemInventoryIndex = buf.readInt();
        this.updateId = buf.readLong();
        this.state = (ManagedState)TypeRegistry.getInstance().fromBytes(buf);
    }

    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
        buf.writeInt(Item.func_150891_b((Item)this.item));
        buf.writeInt(this.itemInventoryIndex);
        buf.writeLong(this.updateId);
        TypeRegistry.getInstance().toBytes(this.state, buf);
    }

    @Override
    public boolean setState(S state) {
        this.state = state;
        this.stateUpdateTimestamp = System.currentTimeMillis();
        this.markDirty();
        if (this.preparedState != null) {
            if (this.preparedState.getState().commitPhase() == state) {
                logger.debug("Committing state {} to {}", this.preparedState.getState(), this.preparedState.getState().commitPhase());
                this.updateWith(this.preparedState, false);
            } else {
                this.rollback();
            }
            this.preparedState = null;
        }
        return false;
    }

    protected void rollback() {
    }

    protected void updateWith(PlayerItemInstance<S> otherState, boolean updateManagedState) {
        if (updateManagedState) {
            this.setState(otherState.getState());
        }
    }

    @Override
    public S getState() {
        return this.state;
    }

    @Override
    public long getStateUpdateTimestamp() {
        return this.stateUpdateTimestamp;
    }

    public long getUpdateId() {
        return this.updateId;
    }

    public long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    protected void markDirty() {
        ++this.updateId;
        this.updateTimestamp = System.currentTimeMillis();
    }

    protected void markClean() {
        this.updateId = 0L;
    }

    @Override
    public <E extends ExtendedState<S>> void prepareTransaction(E preparedExtendedState) {
        this.setState(preparedExtendedState.getState());
        this.preparedState = (PlayerItemInstance)preparedExtendedState;
    }

    public long getSyncStartTimestamp() {
        return this.syncStartTimestamp;
    }

    public void setSyncStartTimestamp(long syncStartTimestamp) {
        this.syncStartTimestamp = syncStartTimestamp;
    }

    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        return null;
    }

    protected void reconcile() {
    }

    static {
        TypeRegistry.getInstance().register(PlayerItemInstance.class);
        TypeRegistry.getInstance().register(PlayerWeaponInstance.class);
    }
}


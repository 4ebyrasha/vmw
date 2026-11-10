/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.mission.Action;
import com.vicmatskiv.weaponlib.mission.Goal;
import com.vicmatskiv.weaponlib.network.UniversalObject;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Mission
extends UniversalObject {
    private List<Goal> goals;
    private UUID missionOfferingId;
    private UUID assignerId;
    private boolean isRedeemed;
    private long startTime;
    private long maxDuration;
    private long redeemTime;

    public Mission() {
        this.goals = new ArrayList<Goal>();
    }

    public Mission(UUID missionOfferingId, Entity assigner, long startTime, long maxDuration, Goal ... goals) {
        this(missionOfferingId, assigner, startTime, maxDuration, Arrays.asList(goals));
    }

    public Mission(UUID missionOfferingId, Entity assigner, long startTime, long maxDuration, List<Goal> goals) {
        this.missionOfferingId = missionOfferingId;
        this.assignerId = assigner != null ? assigner.func_110124_au() : new UUID(0L, 0L);
        this.goals = new ArrayList<Goal>();
        for (Goal goal : goals) {
            this.goals.add(goal);
        }
        this.startTime = startTime;
        this.maxDuration = maxDuration;
    }

    public UUID getAssignerId() {
        return this.assignerId;
    }

    public Entity getAssigner(World world) {
        if (this.assignerId.getMostSignificantBits() == 0L && this.assignerId.getMostSignificantBits() == 0L) {
            return null;
        }
        return CompatibilityProvider.compatibility.getEntityByUuid(this.assignerId, world);
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getMaxDuration() {
        return this.maxDuration;
    }

    public boolean isExpired(long currentWorldTime) {
        return currentWorldTime - this.startTime > this.maxDuration;
    }

    public boolean isCompleted(EntityPlayer player) {
        return this.isRedeemed || this.goals.stream().allMatch(g -> g.isCompleted(player));
    }

    public long getEndTime() {
        return this.isRedeemed ? this.redeemTime : this.startTime + this.maxDuration;
    }

    public boolean isRedeemed() {
        return this.isRedeemed;
    }

    public UUID getMissionOfferingId() {
        return this.missionOfferingId;
    }

    public List<Goal> getGoals() {
        return this.goals;
    }

    public void setRedeemed(long currentWorldTime) {
        this.isRedeemed = true;
        this.redeemTime = currentWorldTime;
    }

    public boolean update(Action action, EntityPlayer player) {
        Goal goal;
        boolean updated = false;
        Iterator<Goal> iterator = this.goals.iterator();
        while (iterator.hasNext() && !(updated = (goal = iterator.next()).update(action, player))) {
        }
        return updated;
    }

    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
        this.missionOfferingId = new UUID(buf.readLong(), buf.readLong());
        this.assignerId = new UUID(buf.readLong(), buf.readLong());
        this.startTime = buf.readLong();
        this.maxDuration = buf.readLong();
        this.isRedeemed = buf.readBoolean();
        this.redeemTime = buf.readLong();
        int len = buf.readInt();
        for (int i = 0; i < len; ++i) {
            Goal goal = new Goal();
            goal.init(buf);
            this.goals.add(goal);
        }
    }

    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
        buf.writeLong(this.missionOfferingId.getMostSignificantBits());
        buf.writeLong(this.missionOfferingId.getLeastSignificantBits());
        buf.writeLong(this.assignerId.getMostSignificantBits());
        buf.writeLong(this.assignerId.getLeastSignificantBits());
        buf.writeLong(this.startTime);
        buf.writeLong(this.maxDuration);
        buf.writeBoolean(this.isRedeemed);
        buf.writeLong(this.redeemTime);
        buf.writeInt(this.goals.size());
        for (Goal goal : this.goals) {
            goal.serialize(buf);
        }
    }
}


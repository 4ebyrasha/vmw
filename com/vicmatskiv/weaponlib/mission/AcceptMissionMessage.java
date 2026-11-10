/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.mission.MissionAssigner;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class AcceptMissionMessage
implements CompatibleMessage {
    private UUID missionOfferingId;
    private int assignerEntityId;
    private Action action;

    public AcceptMissionMessage() {
    }

    public AcceptMissionMessage(MissionAssigner assigner, MissionOffering missionOffering, Action action) {
        this.missionOfferingId = missionOffering.getId();
        this.assignerEntityId = assigner.getEntityId();
        this.action = action;
    }

    public void fromBytes(ByteBuf buf) {
        this.action = Action.values()[buf.readInt()];
        this.assignerEntityId = buf.readInt();
        this.missionOfferingId = new UUID(buf.readLong(), buf.readLong());
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.action.ordinal());
        buf.writeInt(this.assignerEntityId);
        buf.writeLong(this.missionOfferingId.getMostSignificantBits());
        buf.writeLong(this.missionOfferingId.getLeastSignificantBits());
    }

    public int getAssignerEntityId() {
        return this.assignerEntityId;
    }

    public UUID getMissionOfferingId() {
        return this.missionOfferingId;
    }

    public Action getAction() {
        return this.action;
    }

    public static enum Action {
        ASSIGN,
        REDEEM;

    }
}


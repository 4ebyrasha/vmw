/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;

public class MissionOfferingSyncMessage
implements CompatibleMessage {
    private Collection<MissionOffering> missionOfferings;

    public MissionOfferingSyncMessage() {
        this.missionOfferings = new ArrayList<MissionOffering>();
    }

    public MissionOfferingSyncMessage(Collection<MissionOffering> missionOfferings) {
        this.missionOfferings = missionOfferings;
    }

    public void fromBytes(ByteBuf buf) {
        int missionCount = buf.readInt();
        for (int i = 0; i < missionCount; ++i) {
            this.missionOfferings.add((MissionOffering)TypeRegistry.getInstance().fromBytes(buf));
        }
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.missionOfferings.size());
        for (MissionOffering missionOffering : this.missionOfferings) {
            TypeRegistry.getInstance().toBytes(missionOffering, buf);
        }
    }

    protected Collection<MissionOffering> getMissionOfferings() {
        return this.missionOfferings;
    }
}


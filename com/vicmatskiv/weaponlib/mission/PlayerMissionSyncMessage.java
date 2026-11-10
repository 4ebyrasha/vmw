/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.mission.Mission;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import java.util.HashSet;
import java.util.Set;

public class PlayerMissionSyncMessage
implements CompatibleMessage {
    private Set<Mission> missions;

    public PlayerMissionSyncMessage() {
        this.missions = new HashSet<Mission>();
    }

    public PlayerMissionSyncMessage(Set<Mission> missions) {
        this.missions = missions;
    }

    public void fromBytes(ByteBuf buf) {
        int missionCount = buf.readInt();
        for (int i = 0; i < missionCount; ++i) {
            this.missions.add((Mission)TypeRegistry.getInstance().fromBytes(buf));
        }
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.missions.size());
        for (Mission mission : this.missions) {
            TypeRegistry.getInstance().toBytes(mission, buf);
        }
    }

    protected Set<Mission> getMissions() {
        return this.missions;
    }
}


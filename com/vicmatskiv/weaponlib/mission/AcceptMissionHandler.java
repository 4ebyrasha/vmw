/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMissionCapability;
import com.vicmatskiv.weaponlib.mission.AcceptMissionMessage;
import com.vicmatskiv.weaponlib.mission.Mission;
import com.vicmatskiv.weaponlib.mission.MissionAssigner;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import java.util.Set;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class AcceptMissionHandler
implements CompatibleMessageHandler<AcceptMissionMessage, CompatibleMessage> {
    private ModContext modContext;

    public AcceptMissionHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(AcceptMissionMessage message, CompatibleMessageContext ctx) {
        if (ctx.isServerSide()) {
            ctx.runInMainThread(() -> {
                MissionOffering offering;
                EntityPlayer player = ctx.getPlayer();
                Entity assigner = CompatibilityProvider.compatibility.world((Entity)player).func_73045_a(message.getAssignerEntityId());
                if (assigner instanceof MissionAssigner && (offering = ((MissionAssigner)assigner).getMissionOfferings().get(message.getMissionOfferingId())) != null) {
                    if (message.getAction() == AcceptMissionMessage.Action.ASSIGN) {
                        ((MissionAssigner)assigner).assign(offering, player);
                    } else if (message.getAction() == AcceptMissionMessage.Action.REDEEM) {
                        Set<Mission> playerMissions = CompatibleMissionCapability.getMissions((Entity)player);
                        for (Mission mission : playerMissions) {
                            if (!mission.getMissionOfferingId().equals(offering.getId())) continue;
                            ((MissionAssigner)assigner).redeem(mission, player);
                        }
                    }
                }
            });
        }
        return null;
    }
}


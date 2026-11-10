/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.mission.MissionOfferingSyncMessage;

public class MissionOfferingSyncHandler
implements CompatibleMessageHandler<MissionOfferingSyncMessage, CompatibleMessage> {
    private ModContext modContext;

    public MissionOfferingSyncHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(MissionOfferingSyncMessage message, CompatibleMessageContext ctx) {
        if (!ctx.isServerSide()) {
            CompatibilityProvider.compatibility.runInMainClientThread(() -> this.modContext.getMissionManager().updateOfferings(message.getMissionOfferings()));
        }
        return null;
    }
}


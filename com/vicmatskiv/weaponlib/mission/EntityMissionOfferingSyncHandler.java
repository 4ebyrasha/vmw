/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.mission.EntityMissionOfferingSyncMessage;

public class EntityMissionOfferingSyncHandler
implements CompatibleMessageHandler<EntityMissionOfferingSyncMessage, CompatibleMessage> {
    private ModContext modContext;

    public EntityMissionOfferingSyncHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(EntityMissionOfferingSyncMessage message, CompatibleMessageContext ctx) {
        if (!ctx.isServerSide()) {
            CompatibilityProvider.compatibility.runInMainClientThread(() -> this.modContext.getMissionManager().updateEntityOfferings(message.getEntityOfferings()));
        }
        return null;
    }
}


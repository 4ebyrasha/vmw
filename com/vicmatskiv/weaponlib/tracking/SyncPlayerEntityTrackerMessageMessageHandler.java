/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 */
package com.vicmatskiv.weaponlib.tracking;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import com.vicmatskiv.weaponlib.tracking.SyncPlayerEntityTrackerMessage;
import net.minecraft.entity.EntityLivingBase;

public class SyncPlayerEntityTrackerMessageMessageHandler
implements CompatibleMessageHandler<SyncPlayerEntityTrackerMessage, CompatibleMessage> {
    private ModContext modContext;

    public SyncPlayerEntityTrackerMessageMessageHandler(ModContext modContex) {
        this.modContext = modContex;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(SyncPlayerEntityTrackerMessage message, CompatibleMessageContext ctx) {
        if (!ctx.isServerSide()) {
            CompatibilityProvider.compatibility.runInMainClientThread(() -> {
                CompatiblePlayerEntityTrackerProvider.setTracker((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer(), message.getTracker());
                if (message.getStatusMessage() != null) {
                    this.modContext.getStatusMessageCenter().addMessage(message.getStatusMessage(), 1000L);
                }
            });
        }
        return null;
    }
}


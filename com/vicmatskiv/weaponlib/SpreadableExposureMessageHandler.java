/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.SpreadableExposure;
import com.vicmatskiv.weaponlib.SpreadableExposureMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExposureCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.Entity;

public class SpreadableExposureMessageHandler
implements CompatibleMessageHandler<SpreadableExposureMessage, CompatibleMessage> {
    private ModContext modContext;

    public SpreadableExposureMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(SpreadableExposureMessage message, CompatibleMessageContext ctx) {
        if (!ctx.isServerSide()) {
            CompatibilityProvider.compatibility.runInMainClientThread(() -> {
                SpreadableExposure spreadableExposure = message.getSpreadableExposure();
                if (spreadableExposure != null) {
                    SpreadableExposure currentExposure = CompatibleExposureCapability.getExposure((Entity)CompatibilityProvider.compatibility.clientPlayer(), SpreadableExposure.class);
                    if (currentExposure != null) {
                        currentExposure.updateFrom(spreadableExposure);
                    } else {
                        CompatibleExposureCapability.updateExposure((Entity)CompatibilityProvider.compatibility.clientPlayer(), spreadableExposure);
                    }
                } else {
                    CompatibleExposureCapability.removeExposure((Entity)CompatibilityProvider.compatibility.clientPlayer(), SpreadableExposure.class);
                }
            });
        }
        return null;
    }
}


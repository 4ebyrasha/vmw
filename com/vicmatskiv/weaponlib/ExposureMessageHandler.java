/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ExposureMessage;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExposureCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.Entity;

public class ExposureMessageHandler
implements CompatibleMessageHandler<ExposureMessage, CompatibleMessage> {
    private ModContext modContext;

    public ExposureMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(ExposureMessage message, CompatibleMessageContext ctx) {
        if (!ctx.isServerSide()) {
            CompatibilityProvider.compatibility.runInMainClientThread(() -> CompatibleExposureCapability.updateExposures((Entity)CompatibilityProvider.compatibility.clientPlayer(), message.getExposures()));
        }
        return null;
    }
}


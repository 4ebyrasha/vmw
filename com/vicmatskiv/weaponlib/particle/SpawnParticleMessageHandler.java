/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package com.vicmatskiv.weaponlib.particle;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.particle.ExplosionSmokeFX;
import com.vicmatskiv.weaponlib.particle.SpawnParticleMessage;
import net.minecraft.entity.Entity;

public class SpawnParticleMessageHandler
implements CompatibleMessageHandler<SpawnParticleMessage, CompatibleMessage> {
    private static final String REGULAR_SMOKE_TEXTURE = "weaponlib:/com/vicmatskiv/weaponlib/resources/large-smoke.png";
    private static final String YELLOW_SMOKE_TEXTURE = "weaponlib:/com/vicmatskiv/weaponlib/resources/large-yellow-smoke.png";
    private ModContext modContext;
    private double yOffset = 1.0;

    public SpawnParticleMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(SpawnParticleMessage message, CompatibleMessageContext ctx) {
        if (!ctx.isServerSide()) {
            CompatibilityProvider.compatibility.runInMainClientThread(() -> {
                block5: for (int i = 0; i < message.getCount(); ++i) {
                    switch (message.getParticleType()) {
                        case BLOOD: {
                            CompatibilityProvider.compatibility.addBreakingParticle(this.modContext, message.getPosX(), message.getPosY(), message.getPosZ());
                            continue block5;
                        }
                        case SMOKE_GRENADE_SMOKE: {
                            this.modContext.getEffectManager().spawnExplosionSmoke(message.getPosX(), message.getPosY(), message.getPosZ(), message.getMotionX(), message.getMotionY(), message.getMotionZ(), 1.5f * CompatibilityProvider.compatibility.world((Entity)CompatibilityProvider.compatibility.clientPlayer()).field_73012_v.nextFloat(), 300, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, REGULAR_SMOKE_TEXTURE);
                            continue block5;
                        }
                        case SMOKE_GRENADE_YELLOW_SMOKE: {
                            this.modContext.getEffectManager().spawnExplosionSmoke(message.getPosX(), message.getPosY(), message.getPosZ(), message.getMotionX(), message.getMotionY(), message.getMotionZ(), 0.2f * CompatibilityProvider.compatibility.world((Entity)CompatibilityProvider.compatibility.clientPlayer()).field_73012_v.nextFloat(), 300, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, YELLOW_SMOKE_TEXTURE);
                            continue block5;
                        }
                    }
                }
            });
        }
        return null;
    }
}


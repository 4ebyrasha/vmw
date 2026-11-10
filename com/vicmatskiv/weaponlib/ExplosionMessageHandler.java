/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.Explosion;
import com.vicmatskiv.weaponlib.ExplosionMessage;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class ExplosionMessageHandler
implements CompatibleMessageHandler<ExplosionMessage, CompatibleMessage> {
    private ModContext modContext;

    public ExplosionMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(ExplosionMessage message, CompatibleMessageContext ctx) {
        if (!ctx.isServerSide()) {
            EntityPlayer player = CompatibilityProvider.compatibility.clientPlayer();
            CompatibilityProvider.compatibility.runInMainClientThread(() -> {
                Explosion explosion = new Explosion(this.modContext, CompatibilityProvider.compatibility.world((Entity)player), null, message.getPosX(), message.getPosY(), message.getPosZ(), message.getStrength(), message.getAffectedBlockPositions(), message.getExplosionParticleAgeCoefficient(), message.getSmokeParticleAgeCoefficient(), message.getExplosionParticleScaleCoefficient(), message.getSmokeParticleScaleCoefficient(), this.modContext.getRegisteredTexture(message.getExplosionParticleTextureId()), this.modContext.getRegisteredTexture(message.getSmokeParticleTextureId()), null);
                explosion.doExplosionB(true, message.isDestroyingBlocks());
                player.field_70159_w += (double)message.getMotionX();
                player.field_70181_x += (double)message.getMotionY();
                player.field_70179_y += (double)message.getMotionZ();
            });
        }
        return null;
    }
}


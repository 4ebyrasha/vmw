/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.EntityControlMessage;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTargetPoint;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class EntityControlHandler
implements CompatibleMessageHandler<EntityControlMessage, CompatibleMessage> {
    private ModContext modContext;

    public EntityControlHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(EntityControlMessage message, CompatibleMessageContext ctx) {
        if (ctx.isServerSide()) {
            ctx.runInMainThread(() -> {
                EntityPlayer player = ctx.getPlayer();
                CompatibleExtraEntityFlags.setFlags((Entity)player, message.getFlags(), message.getValues());
                CompatibleTargetPoint point = new CompatibleTargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 200.0);
                int updatedFlags = CompatibleExtraEntityFlags.getFlags((Entity)player);
                if ((updatedFlags & CompatibleExtraEntityFlags.PRONING) != 0) {
                    this.setSize(player, 0.6f, 0.6f);
                } else {
                    this.setSize(player, 0.6f, 1.8f);
                }
                this.modContext.getChannel().sendToAllAround(new EntityControlMessage((Entity)player, updatedFlags), point);
            });
        } else {
            CompatibilityProvider.compatibility.runInMainClientThread(() -> {
                EntityPlayer player = CompatibilityProvider.compatibility.clientPlayer();
                Entity targetEntity = message.getEntity(CompatibilityProvider.compatibility.world((Entity)player));
                CompatibleExtraEntityFlags.setFlags(targetEntity, message.getFlags(), message.getValues());
                int updatedFlags = CompatibleExtraEntityFlags.getFlags((Entity)player);
                if ((updatedFlags & CompatibleExtraEntityFlags.PRONING) != 0) {
                    this.setSize(player, 0.6f, 0.6f);
                } else {
                    this.setSize(player, 0.6f, 1.8f);
                }
            });
        }
        return null;
    }

    protected void setSize(EntityPlayer entityPlayer, float width, float height) {
        if (width != entityPlayer.field_70130_N || height != entityPlayer.field_70131_O) {
            entityPlayer.field_70130_N = width;
            entityPlayer.field_70131_O = height;
            CompatibilityProvider.compatibility.resizeEntityBoundingBox((Entity)entityPlayer, entityPlayer.field_70130_N, entityPlayer.field_70131_O, entityPlayer.field_70130_N);
            entityPlayer.eyeHeight = (double)height < 1.5 ? 0.6f : entityPlayer.getDefaultEyeHeight();
        }
    }
}


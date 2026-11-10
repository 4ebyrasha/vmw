/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib.grenade;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.grenade.GrenadeAttackAspect;
import com.vicmatskiv.weaponlib.grenade.GrenadeMessage;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class GrenadeMessageHandler
implements CompatibleMessageHandler<GrenadeMessage, CompatibleMessage> {
    private GrenadeAttackAspect attackAspect;

    public GrenadeMessageHandler(GrenadeAttackAspect attackAspect) {
        this.attackAspect = attackAspect;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(GrenadeMessage message, CompatibleMessageContext ctx) {
        EntityPlayer player;
        ItemStack itemStack;
        if (ctx.isServerSide() && (itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)(player = ctx.getPlayer()))) != null && itemStack.func_77973_b() instanceof ItemGrenade) {
            ctx.runInMainThread(() -> {
                message.getInstance().setPlayer((EntityLivingBase)player);
                this.attackAspect.serverThrowGrenade(player, message.getInstance(), message.getActivationTimestamp());
            });
        }
        return null;
    }
}


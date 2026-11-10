/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib.melee;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeAttackAspect;
import com.vicmatskiv.weaponlib.melee.TryAttackMessage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class TryAttackMessageHandler
implements CompatibleMessageHandler<TryAttackMessage, CompatibleMessage> {
    private MeleeAttackAspect attackAspect;

    public TryAttackMessageHandler(MeleeAttackAspect attackAspect) {
        this.attackAspect = attackAspect;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(TryAttackMessage message, CompatibleMessageContext ctx) {
        EntityPlayer player;
        ItemStack itemStack;
        if (ctx.isServerSide() && (itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)(player = ctx.getPlayer()))) != null && itemStack.func_77973_b() instanceof ItemMelee) {
            ctx.runInMainThread(() -> this.attackAspect.serverAttack(player, message.getInstance(), message.getEntity(CompatibilityProvider.compatibility.world((Entity)player)), message.isHeavyAttack()));
        }
        return null;
    }
}


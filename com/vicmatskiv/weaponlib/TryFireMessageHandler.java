/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.TryFireMessage;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponFireAspect;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class TryFireMessageHandler
implements CompatibleMessageHandler<TryFireMessage, CompatibleMessage> {
    private WeaponFireAspect fireManager;

    TryFireMessageHandler(WeaponFireAspect fireManager) {
        this.fireManager = fireManager;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(TryFireMessage message, CompatibleMessageContext ctx) {
        EntityPlayer player;
        ItemStack itemStack;
        if (ctx.isServerSide() && (itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)(player = ctx.getPlayer()))) != null && itemStack.func_77973_b() instanceof Weapon && message.isOn()) {
            ctx.runInMainThread(() -> this.fireManager.serverFire((EntityLivingBase)player, itemStack, message.isBurst()));
        }
        return null;
    }
}


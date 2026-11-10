/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.inventory.OpenCustomPlayerInventoryGuiMessage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class OpenCustomInventoryGuiHandler
implements CompatibleMessageHandler<OpenCustomPlayerInventoryGuiMessage, CompatibleMessage> {
    private ModContext modContext;

    public OpenCustomInventoryGuiHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(OpenCustomPlayerInventoryGuiMessage message, CompatibleMessageContext ctx) {
        if (ctx.isServerSide()) {
            ctx.runInMainThread(() -> {
                EntityPlayer player = ctx.getPlayer();
                player.openGui(this.modContext.getMod(), message.getGuiInventoryId(), CompatibilityProvider.compatibility.world((Entity)player), (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
            });
        }
        return null;
    }
}


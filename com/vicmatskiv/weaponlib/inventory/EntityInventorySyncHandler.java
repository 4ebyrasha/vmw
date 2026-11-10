/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTargetPoint;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventory;
import com.vicmatskiv.weaponlib.inventory.EntityInventorySyncMessage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

public class EntityInventorySyncHandler
implements CompatibleMessageHandler<EntityInventorySyncMessage, CompatibleMessage> {
    private ModContext modContext;

    public EntityInventorySyncHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(EntityInventorySyncMessage message, CompatibleMessageContext ctx) {
        if (ctx.isServerSide()) {
            ctx.runInMainThread(() -> {
                EntityPlayer player = ctx.getPlayer();
                CustomPlayerInventory inventory = message.getInventory();
                inventory.setContext(this.modContext);
                inventory.setOwner(player);
                CompatibleCustomPlayerInventoryCapability.setInventory((EntityLivingBase)player, inventory);
                CompatibleTargetPoint point = new CompatibleTargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 1000.0);
                this.modContext.getChannel().sendToAllAround(new EntityInventorySyncMessage((Entity)player, inventory, true), point);
            });
        } else {
            CompatibilityProvider.compatibility.runInMainClientThread(() -> {
                EntityPlayer player = CompatibilityProvider.compatibility.clientPlayer();
                Entity targetEntity = message.getEntity(CompatibilityProvider.compatibility.world((Entity)player));
                if (targetEntity != player || targetEntity == player && !message.isExcludeEntity()) {
                    CustomPlayerInventory inventory = message.getInventory();
                    inventory.setContext(this.modContext);
                    inventory.setOwner((EntityPlayer)targetEntity);
                    CompatibleCustomPlayerInventoryCapability.setInventory((EntityLivingBase)targetEntity, inventory);
                }
            });
        }
        return null;
    }
}


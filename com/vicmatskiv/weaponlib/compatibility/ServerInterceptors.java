/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EntityDamageSourceIndirect
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.CommonModContext;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.WeaponSpawnEntity;
import com.vicmatskiv.weaponlib.mission.Missions;
import com.vicmatskiv.weaponlib.mission.ObtainItemAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

public class ServerInterceptors {
    public static void onSlotContentChange(EntityPlayerMP player, InventoryPlayer inventory) {
        ModContext modContext = CommonModContext.getContext();
        if (modContext != null) {
            Missions.update((EntityPlayer)player, new ObtainItemAction(), modContext);
        }
    }

    public static float getKnockback(DamageSource source) {
        EntityDamageSourceIndirect indirectSource;
        float strength = 0.4f;
        if (source instanceof EntityDamageSourceIndirect && (indirectSource = (EntityDamageSourceIndirect)source).func_76364_f() instanceof WeaponSpawnEntity) {
            strength = 0.05f;
        }
        return strength;
    }
}


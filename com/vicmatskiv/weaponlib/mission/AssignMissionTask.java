/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityAIBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class AssignMissionTask
extends CompatibleEntityAIBase {
    private final EntityCustomMob merchant;

    public AssignMissionTask(EntityCustomMob merchant) {
        this.merchant = merchant;
        this.func_75248_a(5);
    }

    public boolean func_75250_a() {
        if (!this.merchant.func_70089_S()) {
            return false;
        }
        if (this.merchant.func_70090_H()) {
            return false;
        }
        if (!this.merchant.field_70122_E) {
            return false;
        }
        if (this.merchant.field_70133_I) {
            return false;
        }
        EntityPlayer entityplayer = this.merchant.getCustomer();
        if (entityplayer == null) {
            return false;
        }
        if (this.merchant.func_70068_e((Entity)entityplayer) > 16.0) {
            return false;
        }
        return entityplayer.field_71070_bA != null;
    }

    public void func_75249_e() {
        this.merchant.func_70661_as().func_75499_g();
    }

    public void func_75251_c() {
        this.merchant.setCustomer(null);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.ai.EntityAIAttackMelee
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.player.EntityPlayer;

public class CompatibleEntityAIAttackOnCollide
extends EntityAIAttackMelee {
    public CompatibleEntityAIAttackOnCollide(EntityCreature creature, Class<EntityPlayer> class1, double speedIn, boolean useLongMemory) {
        super(creature, speedIn, useLongMemory);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.attributes.IAttribute
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttribute;

public class CompatibleSharedMonsterAttributes {
    public static final CompatibleSharedMonsterAttributes FOLLOW_RANGE = new CompatibleSharedMonsterAttributes(SharedMonsterAttributes.field_111265_b);
    public static final CompatibleSharedMonsterAttributes MOVEMENT_SPEED = new CompatibleSharedMonsterAttributes(SharedMonsterAttributes.field_111263_d);
    public static final CompatibleSharedMonsterAttributes MAX_HEALTH = new CompatibleSharedMonsterAttributes(SharedMonsterAttributes.field_111267_a);
    public static final CompatibleSharedMonsterAttributes ATTACK_DAMAGE = new CompatibleSharedMonsterAttributes(SharedMonsterAttributes.field_111264_e);
    private IAttribute attributes;

    public CompatibleSharedMonsterAttributes(IAttribute attributes) {
        this.attributes = attributes;
    }

    public IAttribute getAttributes() {
        return this.attributes;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItem;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.ItemStack;

public class ItemAmmo
extends CompatibleItem {
    private List<Weapon> compatibleWeapons = new ArrayList<Weapon>();

    public void addCompatibleWeapon(Weapon weapon) {
        this.compatibleWeapons.add(weapon);
    }

    @Override
    public void addInformation(ItemStack itemStack, List<String> info, boolean flag) {
        info.add("Compatible guns:");
        this.compatibleWeapons.forEach(weapon -> info.add(weapon.getName()));
    }
}


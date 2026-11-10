/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.Weapon;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.model.ModelBase;

public class ItemBullet
extends ItemAttachment<Weapon> {
    private List<ItemMagazine> compatibleMagazines = new ArrayList<ItemMagazine>();

    public ItemBullet(String modId, AttachmentCategory category, ModelBase model, String textureName, String crosshair, ItemAttachment.ApplyHandler<Weapon> apply, ItemAttachment.ApplyHandler<Weapon> remove) {
        super(modId, category, model, textureName, crosshair, apply, remove);
    }

    public static final class Builder
    extends AttachmentBuilder<Weapon> {
        private List<ItemMagazine> compatibleMagazines = new ArrayList<ItemMagazine>();

        public Builder() {
            this.withMaxStackSize(64);
        }

        public Builder withCompatibleMagazine(ItemMagazine magazine) {
            this.compatibleMagazines.add(magazine);
            return this;
        }

        @Override
        protected ItemAttachment<Weapon> createAttachment(ModContext modContext) {
            ItemBullet bullet = new ItemBullet(this.getModId(), AttachmentCategory.BULLET, this.getModel(), this.getTextureName(), null, null, null);
            bullet.compatibleMagazines = this.compatibleMagazines;
            return bullet;
        }
    }
}


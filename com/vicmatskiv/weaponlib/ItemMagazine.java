/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.MagazineState;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.PlayerItemInstanceFactory;
import com.vicmatskiv.weaponlib.PlayerMagazineInstance;
import com.vicmatskiv.weaponlib.Reloadable;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.Updatable;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemMagazine
extends ItemAttachment<Weapon>
implements PlayerItemInstanceFactory<PlayerMagazineInstance, MagazineState>,
Reloadable,
Updatable,
Part {
    private static final long DEFAULT_RELOADING_TIMEOUT_TICKS = 25L;
    private final int DEFAULT_MAX_STACK_SIZE = 1;
    private int ammo;
    private long reloadingTimeout;
    private List<ItemBullet> compatibleBullets;
    private CompatibleSound reloadSound;
    private ModContext modContext;

    ItemMagazine(String modId, ModelBase model, String textureName, int ammo) {
        this(modId, model, textureName, ammo, null, null);
    }

    ItemMagazine(String modId, ModelBase model, String textureName, int ammo, ItemAttachment.ApplyHandler<Weapon> apply, ItemAttachment.ApplyHandler<Weapon> remove) {
        super(modId, AttachmentCategory.MAGAZINE, model, textureName, null, apply, remove);
        this.ammo = ammo;
        this.func_77625_d(1);
    }

    ItemStack createItemStack() {
        ItemStack attachmentItemStack = new ItemStack((Item)this);
        this.ensureItemStack(attachmentItemStack, this.ammo);
        return attachmentItemStack;
    }

    private void ensureItemStack(ItemStack itemStack, int initialAmmo) {
        if (CompatibilityProvider.compatibility.getTagCompound(itemStack) == null) {
            CompatibilityProvider.compatibility.setTagCompound(itemStack, new NBTTagCompound());
            Tags.setAmmo(itemStack, initialAmmo);
        }
    }

    @Override
    public void func_77622_d(ItemStack stack, World p_77622_2_, EntityPlayer p_77622_3_) {
        this.ensureItemStack(stack, 0);
        super.func_77622_d(stack, p_77622_2_, p_77622_3_);
    }

    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world) {
        return super.onItemUseFirst(stack, player, world);
    }

    public void func_77663_a(ItemStack stack, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) {
        this.ensureItemStack(stack, this.ammo);
        super.func_77663_a(stack, world, entity, p_77663_4_, p_77663_5_);
    }

    List<ItemBullet> getCompatibleBullets() {
        return this.compatibleBullets;
    }

    public int getAmmo() {
        return this.ammo;
    }

    public CompatibleSound getReloadSound() {
        return this.reloadSound;
    }

    public long getReloadTimeout() {
        return this.reloadingTimeout;
    }

    @Override
    public Part getRenderablePart() {
        return this;
    }

    @Override
    public PlayerMagazineInstance createItemInstance(EntityLivingBase player, ItemStack itemStack, int slot) {
        PlayerMagazineInstance instance = new PlayerMagazineInstance(slot, player, itemStack);
        instance.setState(MagazineState.READY);
        return instance;
    }

    @Override
    public void update(EntityPlayer player) {
        this.modContext.getMagazineReloadAspect().updateMainHeldItem(player);
    }

    @Override
    public void reloadMainHeldItemForPlayer(EntityPlayer player) {
        this.modContext.getMagazineReloadAspect().reloadMainHeldItem(player);
    }

    @Override
    public void unloadMainHeldItemForPlayer(EntityPlayer player) {
    }

    public static final class Builder
    extends AttachmentBuilder<Weapon> {
        private int ammo;
        private long reloadingTimeout = 25L;
        private Set<ItemBullet> compatibleBullets = new HashSet<ItemBullet>();
        private String reloadSound;

        public Builder withAmmo(int ammo) {
            this.ammo = ammo;
            return this;
        }

        public Builder withReloadingTimeout(int reloadingTimeout) {
            this.reloadingTimeout = reloadingTimeout;
            return this;
        }

        public Builder withReloadSound(String reloadSound) {
            this.reloadSound = reloadSound;
            return this;
        }

        public Builder withCompatibleBullet(ItemBullet compatibleBullet) {
            this.compatibleBullets.add(compatibleBullet);
            return this;
        }

        @Override
        protected ItemAttachment<Weapon> createAttachment(ModContext modContext) {
            ItemMagazine magazine = new ItemMagazine(this.getModId(), this.getModel(), this.getTextureName(), this.ammo);
            magazine.reloadingTimeout = this.reloadingTimeout;
            magazine.compatibleBullets = new ArrayList<ItemBullet>(this.compatibleBullets);
            if (this.reloadSound != null) {
                magazine.reloadSound = modContext.registerSound(this.reloadSound);
            }
            magazine.modContext = modContext;
            this.withInformationProvider(stack -> "Ammo: " + Tags.getAmmo(stack) + "/" + this.ammo);
            return magazine;
        }
    }
}


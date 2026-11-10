/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.tile;

import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.PlayerItemInstanceFactory;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlockPos;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityItem;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import com.vicmatskiv.weaponlib.grenade.PlayerGrenadeInstance;
import com.vicmatskiv.weaponlib.tile.CustomTileEntity;
import com.vicmatskiv.weaponlib.tile.LootBoxConfiguration;
import java.util.Set;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class LootBoxTileEntity
extends CustomTileEntity<LootBoxConfiguration> {
    private static final String TAG_TIME = "T";
    private long lastEquipmentDispenseTimestamp;

    @Override
    public void onEntityBlockActivated(World world, CompatibleBlockPos pos, EntityPlayer player) {
        this.dropContents(world, pos, player);
    }

    public void dropContents(World world, CompatibleBlockPos pos, EntityPlayer player) {
        LootBoxConfiguration configuration = (LootBoxConfiguration)this.getConfiguration();
        if (this.lastEquipmentDispenseTimestamp > world.func_72820_D()) {
            this.lastEquipmentDispenseTimestamp = 0L;
        }
        if (!world.field_72995_K) {
            if ((long)configuration.getEquipmentDispenseTimeoutTicks() < world.func_72820_D() - this.lastEquipmentDispenseTimestamp) {
                this.lastEquipmentDispenseTimestamp = world.func_72820_D();
                LootBoxConfiguration.Equipment equipment = configuration.getEquipmentOptions().pick(EnumDifficulty.EASY);
                if (equipment != null && equipment.item != null) {
                    System.out.println("Dropping " + equipment.item.func_77658_a());
                    CompatibilityProvider.compatibility.playSound((EntityLivingBase)player, configuration.getDispenseSound(), 0.15f, 1.0f);
                    ItemStack equipmentItemStack = null;
                    if (equipment.item instanceof Weapon) {
                        equipmentItemStack = new ItemStack(equipment.item, equipment.stackSize);
                        this.initWeaponWithAttachments(equipment, equipmentItemStack, player);
                    } else if (equipment.item instanceof ItemGrenade) {
                        equipmentItemStack = new ItemStack(equipment.item, equipment.stackSize);
                        this.initGrenade(equipment, equipmentItemStack, player);
                    } else if (equipment.item instanceof ItemBullet) {
                        ItemBullet bullet = (ItemBullet)equipment.item;
                        equipmentItemStack = new ItemStack(equipment.item, Math.min(equipment.stackSize, bullet.func_77639_j()));
                        this.initBullet(equipment, equipmentItemStack, player);
                    }
                    if (equipmentItemStack != null) {
                        CompatibleEntityItem item = new CompatibleEntityItem(this.func_145831_w(), this.getCompatiblePos().getBlockPosX() + 1, this.getCompatiblePos().getBlockPosY() + 1, this.getCompatiblePos().getBlockPosZ() + 1, equipmentItemStack);
                        item.func_174868_q();
                        CompatibilityProvider.compatibility.spawnEntity((EntityLivingBase)player, (Entity)item);
                    }
                }
            } else {
                CompatibilityProvider.compatibility.playSound((EntityLivingBase)player, configuration.getEquipmentNotAvailableSound(), 0.15f, 1.0f);
            }
        }
    }

    private void initWeaponWithAttachments(LootBoxConfiguration.Equipment equipment, ItemStack itemStack, EntityPlayer player) {
        if (equipment.attachments != null && equipment.item instanceof Weapon && equipment.item instanceof PlayerItemInstanceFactory) {
            PlayerWeaponInstance weaponInstance = (PlayerWeaponInstance)((PlayerItemInstanceFactory)equipment.item).createItemInstance((EntityLivingBase)player, new ItemStack(equipment.item), 0);
            for (ItemAttachment<Weapon> itemAttachment : equipment.attachments) {
                Set<ItemAttachment<Weapon>> compatibleAttachments = weaponInstance.getWeapon().getCompatibleAttachments().keySet();
                compatibleAttachments.contains(itemAttachment);
                WeaponAttachmentAspect.addAttachment(itemAttachment, weaponInstance);
            }
            Tags.setInstance(itemStack, weaponInstance);
        }
    }

    private void initGrenade(LootBoxConfiguration.Equipment equipment, ItemStack itemStack, EntityPlayer player) {
        if (equipment.item instanceof ItemGrenade) {
            PlayerGrenadeInstance grenadeInstance = (PlayerGrenadeInstance)((PlayerItemInstanceFactory)equipment.item).createItemInstance((EntityLivingBase)player, new ItemStack(equipment.item), 0);
            grenadeInstance.setThrowingFar(true);
            Tags.setInstance(itemStack, grenadeInstance);
        }
    }

    private void initBullet(LootBoxConfiguration.Equipment equipment, ItemStack itemStack, EntityPlayer player) {
    }

    @Override
    public void func_145839_a(NBTTagCompound tagCompound) {
        super.func_145839_a(tagCompound);
        this.lastEquipmentDispenseTimestamp = tagCompound.func_74763_f(TAG_TIME);
    }

    @Override
    public NBTTagCompound compatibleWriteToNBT(NBTTagCompound tagCompound) {
        super.compatibleWriteToNBT(tagCompound);
        tagCompound.func_74772_a(TAG_TIME, this.lastEquipmentDispenseTimestamp);
        return tagCompound;
    }
}


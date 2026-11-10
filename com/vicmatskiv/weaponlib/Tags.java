/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.UUID;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public final class Tags {
    private static final String AMMO_TAG = "Ammo";
    private static final String DEFAULT_TIMER_TAG = "DefaultTimer";
    private static final String INSTANCE_TAG = "Instance";
    private static final String ATTACHMENT_ID_TAG = "AtId";
    private static final String INSTANCE_UUID_TAG = "IUuid";

    static int getAmmo(ItemStack itemStack) {
        if (itemStack == null || CompatibilityProvider.compatibility.getTagCompound(itemStack) == null) {
            return 0;
        }
        return CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74762_e(AMMO_TAG);
    }

    public static void setAmmo(ItemStack itemStack, int ammo) {
        if (itemStack == null) {
            return;
        }
        CompatibilityProvider.compatibility.ensureTagCompound(itemStack);
        CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74768_a(AMMO_TAG, ammo);
    }

    static int[] getAttachmentIds(ItemStack itemStack) {
        if (itemStack == null || CompatibilityProvider.compatibility.getTagCompound(itemStack) == null) {
            return new int[0];
        }
        return CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74759_k(ATTACHMENT_ID_TAG);
    }

    static void setAttachmentIds(ItemStack itemStack, int[] attachmentIds) {
        if (itemStack == null) {
            return;
        }
        CompatibilityProvider.compatibility.ensureTagCompound(itemStack);
        CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74783_a(ATTACHMENT_ID_TAG, attachmentIds);
    }

    public static long getDefaultTimer(ItemStack itemStack) {
        if (itemStack == null || CompatibilityProvider.compatibility.getTagCompound(itemStack) == null) {
            return 0L;
        }
        return CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74763_f(DEFAULT_TIMER_TAG);
    }

    static void setDefaultTimer(ItemStack itemStack, long ammo) {
        if (itemStack == null || CompatibilityProvider.compatibility.getTagCompound(itemStack) == null) {
            return;
        }
        CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74772_a(DEFAULT_TIMER_TAG, ammo);
    }

    public static PlayerItemInstance<?> getInstance(ItemStack itemStack) {
        if (itemStack == null || CompatibilityProvider.compatibility.getTagCompound(itemStack) == null) {
            return null;
        }
        byte[] bytes = CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74770_j(INSTANCE_TAG);
        if (bytes != null && bytes.length > 0) {
            return (PlayerItemInstance)TypeRegistry.getInstance().fromBytes(Unpooled.wrappedBuffer((byte[])bytes));
        }
        return null;
    }

    public static <T extends PlayerItemInstance<?>> T getInstance(ItemStack itemStack, Class<T> targetClass) {
        if (itemStack == null || CompatibilityProvider.compatibility.getTagCompound(itemStack) == null) {
            return null;
        }
        byte[] bytes = CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74770_j(INSTANCE_TAG);
        if (bytes != null && bytes.length > 0) {
            try {
                return (T)((PlayerItemInstance)targetClass.cast(TypeRegistry.getInstance().fromBytes(Unpooled.wrappedBuffer((byte[])bytes))));
            }
            catch (RuntimeException e) {
                return null;
            }
        }
        return null;
    }

    public static void setInstance(ItemStack itemStack, PlayerItemInstance<?> instance) {
        if (itemStack == null) {
            return;
        }
        CompatibilityProvider.compatibility.ensureTagCompound(itemStack);
        ByteBuf buf = Unpooled.buffer();
        if (instance != null) {
            TypeRegistry.getInstance().toBytes(instance, buf);
            NBTTagCompound tagCompound = CompatibilityProvider.compatibility.getTagCompound(itemStack);
            tagCompound.func_74773_a(INSTANCE_TAG, buf.array());
            CompatibilityProvider.compatibility.setUniqueId(tagCompound, INSTANCE_UUID_TAG, instance.getUuid());
        } else {
            NBTTagCompound tagCompound = CompatibilityProvider.compatibility.getTagCompound(itemStack);
            tagCompound.func_82580_o(INSTANCE_TAG);
            tagCompound.func_82580_o(INSTANCE_UUID_TAG);
        }
    }

    public static UUID getInstanceUuid(ItemStack itemStack) {
        if (itemStack == null) {
            return null;
        }
        NBTTagCompound tagCompound = CompatibilityProvider.compatibility.getTagCompound(itemStack);
        if (tagCompound == null) {
            return null;
        }
        UUID uuid = CompatibilityProvider.compatibility.getUniqueId(tagCompound, INSTANCE_UUID_TAG);
        if (uuid.getMostSignificantBits() == 0L && uuid.getLeastSignificantBits() == 0L) {
            return null;
        }
        return uuid;
    }

    public static void setInstanceUuid(ItemStack itemStack, UUID uuid) {
        if (itemStack == null) {
            return;
        }
        CompatibilityProvider.compatibility.ensureTagCompound(itemStack);
        NBTTagCompound tagCompound = CompatibilityProvider.compatibility.getTagCompound(itemStack);
        CompatibilityProvider.compatibility.setUniqueId(tagCompound, INSTANCE_UUID_TAG, uuid);
    }

    public static byte[] getInstanceBytes(ItemStack itemStack) {
        if (itemStack == null || CompatibilityProvider.compatibility.getTagCompound(itemStack) == null) {
            return null;
        }
        return CompatibilityProvider.compatibility.getTagCompound(itemStack).func_74770_j(INSTANCE_TAG);
    }
}


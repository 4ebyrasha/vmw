/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ArmorControlMessage;
import com.vicmatskiv.weaponlib.CustomArmor;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ArmorControlHandler
implements CompatibleMessageHandler<ArmorControlMessage, CompatibleMessage> {
    public static final String TAG_NIGHT_VISION = "nv";
    private ModContext modContext;

    public ArmorControlHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(ArmorControlMessage message, CompatibleMessageContext ctx) {
        if (ctx.isServerSide()) {
            ctx.runInMainThread(() -> {
                EntityPlayer player;
                ItemStack helmetStack;
                if (message.isToggleNightVision() && (helmetStack = CompatibilityProvider.compatibility.getHelmet((EntityLivingBase)(player = ctx.getPlayer()))) != null && helmetStack.func_77973_b() instanceof CustomArmor && ((CustomArmor)helmetStack.func_77973_b()).hasNightVision()) {
                    CompatibilityProvider.compatibility.ensureTagCompound(helmetStack);
                    NBTTagCompound tagCompound = CompatibilityProvider.compatibility.getTagCompound(helmetStack);
                    boolean nightVisionOn = tagCompound.func_74767_n(TAG_NIGHT_VISION);
                    tagCompound.func_74757_a(TAG_NIGHT_VISION, !nightVisionOn);
                }
            });
        }
        return null;
    }
}


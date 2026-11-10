/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.perspective;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.perspective.ScreenPerspective;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.lwjgl.opengl.GL11;

public class GasDetectorScreenPerspective
extends ScreenPerspective {
    @Override
    protected void drawScreen() {
        float fontScale = 11.0f;
        FontRenderer fontRender = CompatibilityProvider.compatibility.getFontRenderer();
        int color = 0xAAAA07;
        GL11.glScalef((float)fontScale, (float)fontScale, (float)fontScale);
        String message = this.getMessage();
        fontRender.func_175065_a(message, (float)(5 + (int)(10.0f / fontScale)), (float)(5 + (int)(10.0f / fontScale)), color, false);
    }

    private String getMessage() {
        String message;
        NBTTagCompound nbt;
        float dose = 0.0f;
        ItemStack itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer());
        if (itemStack != null && (nbt = CompatibilityProvider.compatibility.getTagCompound(itemStack)) != null) {
            dose = nbt.func_74760_g("dose");
        }
        if ((message = String.format("%5.3f", Float.valueOf(dose))).length() > 6) {
            message = message.substring(0, 6);
        }
        return message;
    }
}


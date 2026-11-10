/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;

public abstract class CompatibleGuiButton
extends GuiButton {
    public CompatibleGuiButton(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText) {
        super(buttonId, x, y, widthIn, heightIn, buttonText);
    }

    public int getX() {
        return this.field_146128_h;
    }

    public int getY() {
        return this.field_146129_i;
    }

    public final void func_191745_a(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
        this.drawButton(mc, mouseX, mouseY);
    }

    public abstract void drawButton(Minecraft var1, int var2, int var3);

    public static void setPosition(GuiButton button, int x, int y) {
        button.field_146128_h = x;
        button.field_146129_i = y;
    }
}


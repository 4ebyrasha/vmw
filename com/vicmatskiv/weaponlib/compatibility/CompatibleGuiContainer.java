/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.inventory.Container
 */
package com.vicmatskiv.weaponlib.compatibility;

import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.Container;

public abstract class CompatibleGuiContainer
extends GuiContainer {
    public CompatibleGuiContainer(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }

    public static void renderEntityWithPosYaw(EntityLivingBase entity, double x, double y, double z, float yaw, float partialTicks) {
        Minecraft.func_71410_x().func_175598_ae().func_188391_a((Entity)entity, x, y, z, yaw, partialTicks, true);
    }

    protected static void setPlayerViewY(float f) {
        Minecraft.func_71410_x().func_175598_ae().field_78735_i = 180.0f;
    }

    protected final void func_73864_a(int mouseX, int mouseY, int mouseButton) throws IOException {
        this.compatibleMouseClicked(mouseX, mouseY, mouseButton);
    }

    protected void compatibleMouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.func_73864_a(mouseX, mouseY, mouseButton);
    }
}


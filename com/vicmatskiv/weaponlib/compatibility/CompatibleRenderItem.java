/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.renderer.RenderItem
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.ItemStack;

public class CompatibleRenderItem {
    private RenderItem getRenderItem() {
        return Minecraft.func_71410_x().func_175599_af();
    }

    public void setZLevel(float zLevel) {
        this.getRenderItem().field_77023_b = zLevel;
    }

    public void renderItemAndEffectIntoGUI(FontRenderer fontRenderer, TextureManager renderEngine, ItemStack itemStack, int x, int y) {
        this.getRenderItem().func_180450_b(itemStack, x, y);
    }

    public void renderItemOverlayIntoGUI(FontRenderer fontRenderer, TextureManager renderEngine, ItemStack itemStack, int x, int y) {
        this.getRenderItem().func_175030_a(fontRenderer, itemStack, x, y);
    }
}


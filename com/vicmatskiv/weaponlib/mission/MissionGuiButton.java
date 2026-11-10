/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.weaponlib.mission;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class MissionGuiButton
extends GuiButton {
    protected static ResourceLocation BUTTON_TEXTURES = new ResourceLocation("weaponlib", "/com/vicmatskiv/weaponlib/resources/mission-buttons.png");
    private int textureWidth = 200;
    private int textureHeight = 90;
    private int textureCount = 3;
    private int textureSegmentHeight = (int)((float)this.textureHeight / (float)this.textureCount);

    public MissionGuiButton(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText) {
        super(buttonId, x, y, widthIn, heightIn, buttonText);
        this.field_146121_g = 30;
    }

    public MissionGuiButton(int buttonId, int x, int y, String buttonText) {
        this(buttonId, x, y, 200, 30, buttonText);
    }

    public void func_191745_a(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
        if (this.field_146125_m) {
            FontRenderer fontrenderer = mc.field_71466_p;
            mc.func_110434_K().func_110577_a(BUTTON_TEXTURES);
            GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.field_146123_n = mouseX >= this.field_146128_h && mouseY >= this.field_146129_i && mouseX < this.field_146128_h + this.field_146120_f && mouseY < this.field_146129_i + this.field_146121_g;
            int i = this.func_146114_a(this.field_146123_n);
            GlStateManager.func_179147_l();
            GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            GlStateManager.func_187401_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            int textureV = this.textureSegmentHeight * i;
            MissionGuiButton.func_146110_a((int)this.field_146128_h, (int)this.field_146129_i, (float)0.0f, (float)textureV, (int)(this.field_146120_f >> 1), (int)this.field_146121_g, (float)this.textureWidth, (float)this.textureHeight);
            MissionGuiButton.func_146110_a((int)(this.field_146128_h + (this.field_146120_f >> 1)), (int)this.field_146129_i, (float)(this.textureWidth - (this.field_146120_f >> 1)), (float)textureV, (int)(this.field_146120_f >> 1), (int)this.field_146121_g, (float)this.textureWidth, (float)this.textureHeight);
            this.func_146119_b(mc, mouseX, mouseY);
            int j = 0xE0E0E0;
            if (this.packedFGColour != 0) {
                j = this.packedFGColour;
            } else if (!this.field_146124_l) {
                j = 0xA0A0A0;
            } else if (this.field_146123_n) {
                j = 0xFFFFA0;
            }
            this.func_73731_b(fontrenderer, this.field_146126_j, this.field_146128_h + 7, this.field_146129_i + (this.field_146121_g - 8) / 2, j);
        }
    }
}


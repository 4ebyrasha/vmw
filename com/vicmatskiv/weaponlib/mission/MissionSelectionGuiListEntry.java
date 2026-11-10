/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiListExtended$IGuiListEntry
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.mission.MissionAcceptGui;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import com.vicmatskiv.weaponlib.mission.MissionSelectionGuiList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class MissionSelectionGuiListEntry
implements GuiListExtended.IGuiListEntry {
    private final Minecraft client;
    private final MissionOffering missionOffering;
    private final MissionSelectionGuiList missionSelectionGuiList;
    private long lastClickTime;
    private ResourceLocation itemBackground = new ResourceLocation("weaponlib", "/com/vicmatskiv/weaponlib/resources/mission-selection-items.png");
    private int textureWidth = 200;
    private int textureHeight = 90;
    private int textureSegmentWidth = this.textureWidth;
    private int textureCount = 3;
    private int textureSegmentHeight = (int)((float)this.textureHeight / (float)this.textureCount);
    private boolean isRedeemable;

    public MissionSelectionGuiListEntry(MissionSelectionGuiList missionSelectionGuiList, MissionOffering missionOffering, boolean isRedeemable) {
        this.missionSelectionGuiList = missionSelectionGuiList;
        this.missionOffering = missionOffering;
        this.isRedeemable = isRedeemable;
        this.client = Minecraft.func_71410_x();
    }

    protected MissionOffering getMissionOffering() {
        return this.missionOffering;
    }

    public void func_192634_a(int slotIndex, int x, int y, int listWidth, int slotHeight, int mouseX, int mouseY, boolean isSelected, float partialTicks) {
        String s = this.missionOffering.getMissionName();
        this.client.func_110434_K().func_110577_a(this.itemBackground);
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.func_179147_l();
        GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.func_187401_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        int i = isSelected ? 2 : 1;
        int textureV = this.textureSegmentHeight * i;
        int buttonXPadding = 3;
        int buttonYPadding = 1;
        int buttonWidth = listWidth - buttonXPadding * 2;
        int buttonHeight = slotHeight - buttonYPadding * 2;
        int buttonLeft = x + buttonXPadding;
        int buttonTop = y + buttonYPadding;
        Gui.func_152125_a((int)buttonLeft, (int)buttonTop, (float)0.0f, (float)textureV, (int)this.textureSegmentWidth, (int)this.textureSegmentHeight, (int)buttonWidth, (int)buttonHeight, (float)this.textureWidth, (float)this.textureHeight);
        this.client.field_71466_p.func_78276_b(s, x + 10, y + 12, 0xFFFFFF);
    }

    public boolean func_148278_a(int slotIndex, int mouseX, int mouseY, int mouseEvent, int relativeX, int relativeY) {
        this.missionSelectionGuiList.selectMission(slotIndex);
        if (Minecraft.func_71386_F() - this.lastClickTime < 250L) {
            this.loadMission();
            return true;
        }
        this.lastClickTime = Minecraft.func_71386_F();
        return false;
    }

    protected void loadMission() {
        System.out.println("Loading mission...");
        this.client.func_147108_a((GuiScreen)new MissionAcceptGui(this.isRedeemable, this.missionSelectionGuiList.getSelectedMission().getMissionOffering(), this.missionSelectionGuiList.getMissionAssigner(), this.missionSelectionGuiList.getPlayer(), this.missionSelectionGuiList.getModContext(), this.missionSelectionGuiList.getMissionSelection().getContentBackground(), this.missionSelectionGuiList.getMissionSelection().getRewardsBackground(), this.missionSelectionGuiList.getMissionSelection()));
    }

    public void func_148277_b(int slotIndex, int x, int y, int mouseEvent, int relativeX, int relativeY) {
    }

    public void func_192633_a(int p_192633_1_, int p_192633_2_, int p_192633_3_, float p_192633_4_) {
    }
}


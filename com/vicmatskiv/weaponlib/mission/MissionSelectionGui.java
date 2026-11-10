/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.mission.MissionAssigner;
import com.vicmatskiv.weaponlib.mission.MissionGuiButton;
import com.vicmatskiv.weaponlib.mission.MissionSelectionGuiList;
import com.vicmatskiv.weaponlib.mission.MissionSelectionGuiListEntry;
import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class MissionSelectionGui
extends GuiScreen {
    protected GuiScreen prevScreen;
    protected String title = "Select mission";
    private GuiButton selectButton;
    private MissionSelectionGuiList selectionList;
    private MissionAssigner missionAssigner;
    private EntityPlayer player;
    private ModContext modContext;
    private ResourceLocation introImage;
    private ResourceLocation contentBackground;
    private ResourceLocation rewardsBackground;
    private int contentBackgroundTextureWidth = 460;
    private int contentBackgroundTextureHeight = 300;
    private float missionListBackgroundAspectRatio = (float)this.contentBackgroundTextureWidth / (float)this.contentBackgroundTextureHeight;
    private float introImageAspectRatio = 0.6666667f;
    private float normalizedIntroImageWidth = 0.28f;
    private float normalizedMissionListWidth = 0.5f;
    private float normalizedMissionListLeft = 0.09f;
    private float normalizedMissionListTop = 0.1f;
    private float normalizedMissionListContentLeftPadding = 0.01f;
    private float normalizedMissionListContentTopPadding = 0.03f;

    public MissionSelectionGui(MissionAssigner missionAssigner, EntityPlayer player, ModContext modContext, GuiScreen screenIn, ResourceLocation contentBackground, ResourceLocation introImage, ResourceLocation rewardsBackground) {
        this.missionAssigner = missionAssigner;
        this.player = player;
        this.modContext = modContext;
        this.prevScreen = screenIn;
        this.contentBackground = contentBackground;
        this.introImage = introImage;
        this.rewardsBackground = rewardsBackground;
    }

    public void func_73866_w_() {
        this.title = I18n.func_135052_a((String)"selectMission", (Object[])new Object[0]);
        int topPadding = (int)((float)this.field_146295_m * this.normalizedMissionListContentTopPadding);
        int missionListTop = (int)((float)this.field_146295_m * this.normalizedMissionListTop) + topPadding;
        int leftPadding = (int)((float)this.field_146294_l * this.normalizedMissionListContentLeftPadding);
        int missionListLeft = (int)((float)this.field_146294_l * this.normalizedMissionListLeft) + leftPadding;
        int missionListWidth = (int)((float)this.field_146294_l * this.normalizedMissionListWidth) - leftPadding * 2;
        if ((missionListWidth & 1) == 1) {
            --missionListWidth;
        }
        int missionListHeight = (int)((float)missionListWidth / this.missionListBackgroundAspectRatio) - topPadding * 2;
        this.selectionList = new MissionSelectionGuiList(this.missionAssigner, this.player, this.modContext, this, this.field_146297_k, missionListWidth, missionListHeight, missionListLeft, missionListTop, missionListTop + missionListHeight, 36);
        this.postInit();
    }

    public ResourceLocation getContentBackground() {
        return this.contentBackground;
    }

    public ResourceLocation getRewardsBackground() {
        return this.rewardsBackground;
    }

    public void func_146274_d() throws IOException {
        super.func_146274_d();
        this.selectionList.func_178039_p();
    }

    public void postInit() {
        int leftMargin = (int)((float)this.field_146294_l * this.normalizedMissionListLeft);
        int topMargin = (int)((float)this.field_146295_m * this.normalizedMissionListTop);
        int standardButtonWidth = 60;
        int buttonHeight = 30;
        int scaledIntroImageWidth = (int)((float)this.field_146294_l * 0.28f);
        int scaledIntroImageHeight = (int)((float)scaledIntroImageWidth / this.introImageAspectRatio);
        int scaledContentBackgroundWidth = (int)((float)this.field_146294_l * this.normalizedMissionListWidth);
        MissionGuiButton buttonDone = new MissionGuiButton(0, leftMargin, topMargin + scaledIntroImageHeight - buttonHeight, standardButtonWidth, buttonHeight, I18n.func_135052_a((String)"Done", (Object[])new Object[0]));
        MissionGuiButton buttonPreviousPage = new MissionGuiButton(2, leftMargin + (scaledContentBackgroundWidth >> 1) - standardButtonWidth / 2, topMargin + scaledIntroImageHeight - buttonHeight, standardButtonWidth, buttonHeight, "Previous");
        this.selectButton = new MissionGuiButton(1, leftMargin + scaledContentBackgroundWidth - standardButtonWidth, topMargin + scaledIntroImageHeight - buttonHeight, standardButtonWidth, buttonHeight, "Select");
        this.selectButton.field_146124_l = false;
        this.field_146292_n.add(buttonDone);
        this.field_146292_n.add(buttonPreviousPage);
        this.field_146292_n.add(this.selectButton);
    }

    protected void func_146284_a(GuiButton button) throws IOException {
        if (button.field_146124_l) {
            MissionSelectionGuiListEntry missionSelectionEntry = this.selectionList.getSelectedMission();
            if (button.field_146127_k == 0) {
                this.field_146297_k.func_147108_a(null);
            } else if (button.field_146127_k == 2) {
                this.field_146297_k.func_147108_a(this.prevScreen);
            } else if (button.field_146127_k == 1 && missionSelectionEntry != null) {
                missionSelectionEntry.loadMission();
            }
        }
    }

    public void func_73863_a(int mouseX, int mouseY, float partialTicks) {
        this.func_146276_q_();
        this.field_146297_k.func_110434_K().func_110577_a(this.contentBackground);
        int missionListWidth = (int)((float)this.field_146294_l * this.normalizedMissionListWidth);
        int missionListHeight = (int)((float)missionListWidth / this.missionListBackgroundAspectRatio);
        int missionListLeft = (int)((float)this.field_146294_l * this.normalizedMissionListLeft);
        int missionListTop = (int)((float)this.field_146295_m * this.normalizedMissionListTop);
        GL11.glPushAttrib((int)1048575);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)2896);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        MissionSelectionGui.func_152125_a((int)missionListLeft, (int)missionListTop, (float)0.0f, (float)0.0f, (int)this.contentBackgroundTextureWidth, (int)this.contentBackgroundTextureHeight, (int)missionListWidth, (int)missionListHeight, (float)this.contentBackgroundTextureWidth, (float)this.contentBackgroundTextureHeight);
        if (this.introImage != null) {
            this.field_146297_k.func_110434_K().func_110577_a(this.introImage);
            int introImageWidth = (int)((float)this.field_146294_l * this.normalizedIntroImageWidth);
            int introImageHeight = (int)((float)introImageWidth / this.introImageAspectRatio);
            int leftMargin = (int)((float)this.field_146294_l * this.normalizedMissionListLeft);
            int topMargin = (int)((float)this.field_146295_m * this.normalizedMissionListTop);
            MissionSelectionGui.func_146110_a((int)(this.field_146294_l - leftMargin - introImageWidth), (int)topMargin, (float)0.0f, (float)0.0f, (int)introImageWidth, (int)introImageHeight, (float)introImageWidth, (float)introImageHeight);
        }
        GL11.glPopAttrib();
        this.selectionList.func_148128_a(mouseX, mouseY, partialTicks);
        super.func_73863_a(mouseX, mouseY, partialTicks);
    }

    protected void func_73864_a(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.func_73864_a(mouseX, mouseY, mouseButton);
        this.selectionList.func_148179_a(mouseX, mouseY, mouseButton);
    }

    protected void func_146286_b(int mouseX, int mouseY, int state) {
        super.func_146286_b(mouseX, mouseY, state);
        this.selectionList.func_148181_b(mouseX, mouseY, state);
    }

    public void selectMission(@Nullable MissionSelectionGuiListEntry entry) {
        boolean flag;
        this.selectButton.field_146124_l = flag = entry != null;
    }
}


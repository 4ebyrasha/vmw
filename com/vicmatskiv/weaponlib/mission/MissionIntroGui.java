/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.mission.MissionAssigner;
import com.vicmatskiv.weaponlib.mission.MissionGuiButton;
import com.vicmatskiv.weaponlib.mission.MissionSelectionGui;
import java.util.List;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class MissionIntroGui
extends GuiScreen {
    private float normalizedIntroImageWidth = 0.28f;
    private float normalizedContentWidth = 0.5f;
    private float normalizedLeftMargin = 0.09f;
    private float normalizedTopMargin = 0.1f;
    private float normalizedTopContentPadding = 0.04f;
    private float normalizedLeftContentPadding = 0.04f;
    private int contentBackgroundTextureWidth = 460;
    private int contentBackgroundTextureHeight = 300;
    private float contentBackgroundAspectRatio = (float)this.contentBackgroundTextureWidth / (float)this.contentBackgroundTextureHeight;
    private int introImageTextureWidth = 240;
    private int introImageTextureHeight = 360;
    private float introImageAspectRatio = (float)this.introImageTextureWidth / (float)this.introImageTextureHeight;
    private int buttonHeight = 30;
    private int contentTextColor = 0xFFFFFF;
    private GuiButton buttonDone;
    private GuiButton buttonNextPage;
    private GuiButton buttonPreviousPage;
    private int currentContentPage;
    private List<String> contentPages;
    private ResourceLocation introImage;
    private ResourceLocation contentBackground;
    private ResourceLocation rewardsBackground;
    private ResourceLocation missionSelectionBackground;
    private MissionAssigner missionAssigner;
    private EntityPlayer player;
    private ModContext modContext;

    public MissionIntroGui(MissionAssigner missionAssigner, EntityPlayer player, ModContext modContext, List<String> contentPages, ResourceLocation contentBackground, ResourceLocation introImage, ResourceLocation rewardsBackground, ResourceLocation missionSelectionBackground) {
        this.missionAssigner = missionAssigner;
        this.player = player;
        this.modContext = modContext;
        this.contentPages = contentPages;
        this.contentBackground = contentBackground;
        this.introImage = introImage;
        this.rewardsBackground = rewardsBackground;
        this.missionSelectionBackground = missionSelectionBackground;
    }

    public void func_73866_w_() {
        this.field_146292_n.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        int leftMargin = (int)((float)this.field_146294_l * this.normalizedLeftMargin);
        int topMargin = (int)((float)this.field_146295_m * this.normalizedTopMargin);
        int standardButtonWidth = 60;
        int scaledIntroImageWidth = (int)((float)this.field_146294_l * 0.28f);
        int scaledIntroImageHeight = (int)((float)scaledIntroImageWidth / this.introImageAspectRatio);
        int scaledContentBackgroundWidth = (int)((float)this.field_146294_l * this.normalizedContentWidth);
        this.buttonDone = new MissionGuiButton(0, leftMargin, topMargin + scaledIntroImageHeight - this.buttonHeight, standardButtonWidth, this.buttonHeight, I18n.func_135052_a((String)"Done", (Object[])new Object[0]));
        this.buttonPreviousPage = new MissionGuiButton(2, leftMargin + (scaledContentBackgroundWidth >> 1) - standardButtonWidth / 2, topMargin + scaledIntroImageHeight - this.buttonHeight, standardButtonWidth, this.buttonHeight, I18n.func_135052_a((String)"Previous", (Object[])new Object[0]));
        this.buttonNextPage = new MissionGuiButton(1, leftMargin + scaledContentBackgroundWidth - standardButtonWidth, topMargin + scaledIntroImageHeight - this.buttonHeight, standardButtonWidth, this.buttonHeight, I18n.func_135052_a((String)"Next", (Object[])new Object[0]));
        this.field_146292_n.add(this.buttonDone);
        this.field_146292_n.add(this.buttonPreviousPage);
        this.field_146292_n.add(this.buttonNextPage);
        this.func_73876_c();
    }

    public void func_73876_c() {
        this.buttonNextPage.field_146125_m = this.currentContentPage < this.contentPages.size();
        this.buttonPreviousPage.field_146125_m = this.currentContentPage > 0;
    }

    public void func_73863_a(int parWidth, int parHeight, float p_73863_3_) {
        this.func_146276_q_();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        int leftMargin = (int)((float)this.field_146294_l * this.normalizedLeftMargin);
        int topMargin = (int)((float)this.field_146295_m * this.normalizedTopMargin);
        int scaledContentBackgroundWidth = (int)((float)this.field_146294_l * this.normalizedContentWidth);
        int scaledContentBackgroundHeight = (int)((float)scaledContentBackgroundWidth / this.contentBackgroundAspectRatio);
        if (this.contentBackground != null) {
            this.field_146297_k.func_110434_K().func_110577_a(this.contentBackground);
            GL11.glPushAttrib((int)1048575);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)2896);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glEnable((int)3042);
            MissionIntroGui.func_152125_a((int)leftMargin, (int)topMargin, (float)0.0f, (float)0.0f, (int)this.contentBackgroundTextureWidth, (int)this.contentBackgroundTextureHeight, (int)scaledContentBackgroundWidth, (int)scaledContentBackgroundHeight, (float)this.contentBackgroundTextureWidth, (float)this.contentBackgroundTextureHeight);
            GL11.glPopAttrib();
        }
        int leftContentPadding = (int)(this.normalizedLeftContentPadding * (float)this.field_146295_m);
        int topContentPadding = (int)(this.normalizedTopContentPadding * (float)this.field_146295_m);
        this.field_146289_q.func_78279_b(I18n.func_135052_a((String)this.contentPages.get(this.currentContentPage), (Object[])new Object[0]), leftMargin + leftContentPadding, topMargin + topContentPadding, scaledContentBackgroundWidth - leftContentPadding * 2, this.contentTextColor);
        if (this.introImage != null) {
            this.field_146297_k.func_110434_K().func_110577_a(this.introImage);
            int scaledIntroImageWidth = (int)((float)this.field_146294_l * this.normalizedIntroImageWidth);
            int scaledIntroImageHeight = (int)((float)scaledIntroImageWidth / this.introImageAspectRatio);
            GL11.glPushAttrib((int)1048575);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)2896);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glEnable((int)3042);
            MissionIntroGui.func_152125_a((int)(this.field_146294_l - leftMargin - scaledIntroImageWidth), (int)topMargin, (float)0.0f, (float)0.0f, (int)this.introImageTextureWidth, (int)this.introImageTextureHeight, (int)scaledIntroImageWidth, (int)scaledIntroImageHeight, (float)this.introImageTextureWidth, (float)this.introImageTextureHeight);
            GL11.glPopAttrib();
        }
        super.func_73863_a(parWidth, parHeight, p_73863_3_);
    }

    protected void func_146273_a(int parMouseX, int parMouseY, int parLastButtonClicked, long parTimeSinceMouseClick) {
    }

    protected void func_146284_a(GuiButton parButton) {
        if (parButton == this.buttonDone) {
            this.field_146297_k.func_147108_a((GuiScreen)null);
        } else if (parButton == this.buttonNextPage) {
            if (this.currentContentPage < this.contentPages.size() - 1) {
                ++this.currentContentPage;
            } else {
                this.field_146297_k.func_147108_a((GuiScreen)new MissionSelectionGui(this.missionAssigner, this.player, this.modContext, this, this.missionSelectionBackground, this.introImage, this.rewardsBackground));
            }
        } else if (parButton == this.buttonPreviousPage && this.currentContentPage > 0) {
            --this.currentContentPage;
        }
    }

    public void func_146281_b() {
    }

    public boolean func_73868_f() {
        return true;
    }
}


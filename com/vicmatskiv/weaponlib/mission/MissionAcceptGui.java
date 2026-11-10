/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMissionCapability;
import com.vicmatskiv.weaponlib.mission.AcceptMissionMessage;
import com.vicmatskiv.weaponlib.mission.Mission;
import com.vicmatskiv.weaponlib.mission.MissionAssigner;
import com.vicmatskiv.weaponlib.mission.MissionGuiButton;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import com.vicmatskiv.weaponlib.mission.MissionReward;
import java.util.List;
import java.util.Set;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class MissionAcceptGui
extends GuiScreen {
    private float normalizedContentWidth = 0.5f;
    private float normalizedRewardsWidth = 0.28f;
    private float normalizedLeftMargin = 0.09f;
    private float normalizedTopMargin = 0.1f;
    private float normalizedTopContentPadding = 0.04f;
    private float normalizedLeftContentPadding = 0.04f;
    private int rewardsTextureWidth = 240;
    private int rewardsTextureHeight = 360;
    private float rewardsBackgroundAspectRatio = (float)this.rewardsTextureWidth / (float)this.rewardsTextureHeight;
    private int itemBoxTextureTopMargin = 84;
    private int itemBoxTextureWidth = 60;
    private int itemBoxTextureHeight = 220;
    private int contentBackgroundTextureWidth = 460;
    private int contentBackgroundTextureHeight = 300;
    private float contentBackgroundAspectRatio = (float)this.contentBackgroundTextureWidth / (float)this.contentBackgroundTextureHeight;
    private int numberOfItemSlots = 4;
    private int buttonHeight = 30;
    private int contentTextColor = 0xFFFFFF;
    private GuiButton buttonPrevious;
    private GuiButton buttonAccept;
    private GuiButton buttonDecline;
    private ResourceLocation contentBackground;
    private ResourceLocation rewardsBackground;
    private MissionAssigner missionAssigner;
    private EntityPlayer player;
    private ModContext modContext;
    private GuiScreen previousScreen;
    private MissionOffering missionOffering;
    private boolean isRedeemable;

    public MissionAcceptGui(boolean isRedeemable, MissionOffering missionOffering, MissionAssigner missionAssigner, EntityPlayer player, ModContext modContext, ResourceLocation contentBackground, ResourceLocation rewardsBackground, GuiScreen previousScreen) {
        this.isRedeemable = isRedeemable;
        this.missionOffering = missionOffering;
        this.missionAssigner = missionAssigner;
        this.player = player;
        this.modContext = modContext;
        this.contentBackground = contentBackground;
        this.rewardsBackground = rewardsBackground;
        this.previousScreen = previousScreen;
    }

    public void func_73866_w_() {
        this.field_146292_n.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        int leftMargin = (int)((float)this.field_146294_l * this.normalizedLeftMargin);
        int topMargin = (int)((float)this.field_146295_m * this.normalizedTopMargin);
        int standardButtonWidth = 60;
        int scaledRewardsBackgroundWidth = (int)((float)this.field_146294_l * this.normalizedRewardsWidth);
        int scaledRewardsBackgroundHeight = (int)((float)scaledRewardsBackgroundWidth / this.rewardsBackgroundAspectRatio);
        int scaledContentBackgroundWidth = (int)((float)this.field_146294_l * this.normalizedContentWidth);
        this.buttonDecline = new MissionGuiButton(2, leftMargin, topMargin + scaledRewardsBackgroundHeight - this.buttonHeight, standardButtonWidth, this.buttonHeight, I18n.func_135052_a((String)"Done", (Object[])new Object[0]));
        this.field_146292_n.add(this.buttonDecline);
        if (this.previousScreen != null) {
            this.buttonPrevious = new MissionGuiButton(0, leftMargin + (scaledContentBackgroundWidth >> 1) - standardButtonWidth / 2, topMargin + scaledRewardsBackgroundHeight - this.buttonHeight, standardButtonWidth, this.buttonHeight, I18n.func_135052_a((String)"Previous", (Object[])new Object[0]));
            this.field_146292_n.add(this.buttonPrevious);
        }
        this.buttonAccept = new MissionGuiButton(1, leftMargin + scaledContentBackgroundWidth - standardButtonWidth, topMargin + scaledRewardsBackgroundHeight - this.buttonHeight, standardButtonWidth, this.buttonHeight, this.isRedeemable ? I18n.func_135052_a((String)"Redeem", (Object[])new Object[0]) : I18n.func_135052_a((String)"Accept", (Object[])new Object[0]));
        this.field_146292_n.add(this.buttonAccept);
        this.func_73876_c();
    }

    public void func_73876_c() {
    }

    public void func_73863_a(int mouseX, int mouseY, float p_73863_3_) {
        ItemStack itemStack;
        MissionReward reward;
        int i;
        this.func_146276_q_();
        super.func_73863_a(mouseX, mouseY, p_73863_3_);
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
            MissionAcceptGui.func_152125_a((int)leftMargin, (int)topMargin, (float)0.0f, (float)0.0f, (int)this.contentBackgroundTextureWidth, (int)this.contentBackgroundTextureHeight, (int)scaledContentBackgroundWidth, (int)scaledContentBackgroundHeight, (float)this.contentBackgroundTextureWidth, (float)this.contentBackgroundTextureHeight);
            GL11.glPopAttrib();
        }
        int leftContentPadding = (int)(this.normalizedLeftContentPadding * (float)this.field_146294_l);
        int topContentPadding = (int)(this.normalizedTopContentPadding * (float)this.field_146295_m);
        this.field_146289_q.func_78276_b((this.isRedeemable ? "Completed: " : "") + this.missionOffering.getMissionName(), leftMargin + leftContentPadding, topMargin + topContentPadding, this.contentTextColor);
        this.field_146289_q.func_78279_b(I18n.func_135052_a((String)this.missionOffering.getMissionDescription(), (Object[])new Object[0]), leftMargin + leftContentPadding, topMargin + topContentPadding * 3, scaledContentBackgroundWidth - (int)((float)leftContentPadding * 1.5f), this.contentTextColor);
        int scaledRewardsBackgroundWidth = (int)((float)this.field_146294_l * this.normalizedRewardsWidth);
        int scaledRewardsBackgroundHeight = (int)((float)scaledRewardsBackgroundWidth / this.rewardsBackgroundAspectRatio);
        this.field_146289_q.func_78276_b(I18n.func_135052_a((String)"Level", (Object[])new Object[0]) + ": " + I18n.func_135052_a((String)this.missionOffering.getLevel().toString(), (Object[])new Object[0]), leftMargin + leftContentPadding, topMargin + scaledContentBackgroundHeight - (int)((float)topContentPadding * 1.5f), this.contentTextColor);
        int rewardsLeftMargin = this.field_146294_l - leftMargin - scaledRewardsBackgroundWidth;
        if (this.rewardsBackground != null) {
            this.field_146297_k.func_110434_K().func_110577_a(this.rewardsBackground);
            GL11.glPushAttrib((int)1048575);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)2896);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glEnable((int)3042);
            MissionAcceptGui.func_152125_a((int)rewardsLeftMargin, (int)topMargin, (float)0.0f, (float)0.0f, (int)this.rewardsTextureWidth, (int)this.rewardsTextureHeight, (int)scaledRewardsBackgroundWidth, (int)scaledRewardsBackgroundHeight, (float)this.rewardsTextureWidth, (float)this.rewardsTextureHeight);
            GL11.glPopAttrib();
        }
        int rewardsTitleWidth = this.field_146289_q.func_78256_a(I18n.func_135052_a((String)"Rewards", (Object[])new Object[0]));
        this.field_146289_q.func_78276_b(I18n.func_135052_a((String)"Rewards", (Object[])new Object[0]), rewardsLeftMargin + (scaledRewardsBackgroundWidth - rewardsTitleWidth >> 1), topMargin + topContentPadding, this.contentTextColor);
        List<MissionReward> rewards = this.missionOffering.getRewards();
        GlStateManager.func_179094_E();
        RenderHelper.func_74520_c();
        GlStateManager.func_179140_f();
        GlStateManager.func_179091_B();
        GlStateManager.func_179142_g();
        GlStateManager.func_179145_e();
        float normalizedItemBoxTextureTopMargin = (float)this.itemBoxTextureTopMargin / (float)this.rewardsTextureHeight;
        int itemBoxSlotTextureHeight = (int)((float)this.itemBoxTextureHeight / (float)this.numberOfItemSlots);
        float normalizedItemBoxSlotTextureHeight = (float)itemBoxSlotTextureHeight / (float)this.rewardsTextureHeight;
        float normalizedItemBoxSlotTextureWidth = (float)this.itemBoxTextureWidth / (float)this.rewardsTextureWidth;
        int itemSlotWidth = (int)((float)scaledRewardsBackgroundWidth * normalizedItemBoxSlotTextureWidth);
        int itemSlotHeight = (int)((float)scaledRewardsBackgroundHeight * normalizedItemBoxSlotTextureHeight);
        int itemsTopMargin = topMargin + (int)(normalizedItemBoxTextureTopMargin * (float)scaledRewardsBackgroundHeight) + (int)((float)itemSlotHeight * 0.25f);
        int itemsLeftMargin = rewardsLeftMargin + (scaledRewardsBackgroundWidth - itemSlotWidth >> 1) + (int)((float)itemSlotWidth * 0.16f);
        for (i = 0; i < rewards.size(); ++i) {
            reward = rewards.get(i);
            if (!(reward instanceof MissionReward.ItemReward)) continue;
            this.field_146296_j.field_77023_b = 0.0f;
            itemStack = ((MissionReward.ItemReward)reward).getReward();
            this.field_146296_j.func_180450_b(itemStack, itemsLeftMargin, i * itemSlotHeight + itemsTopMargin);
            this.field_146296_j.func_175030_a(this.field_146289_q, itemStack, itemsLeftMargin, i * itemSlotHeight + itemsTopMargin);
        }
        this.field_146296_j.field_77023_b = 0.0f;
        GlStateManager.func_179140_f();
        for (i = 0; i < rewards.size(); ++i) {
            if (!this.isPointInRegion(itemsLeftMargin, i * itemSlotHeight + itemsTopMargin, itemSlotWidth, itemSlotHeight, mouseX, mouseY) || !((reward = rewards.get(i)) instanceof MissionReward.ItemReward)) continue;
            itemStack = ((MissionReward.ItemReward)reward).getReward();
            this.func_146285_a(itemStack, mouseX, mouseY);
        }
        GlStateManager.func_179121_F();
        GlStateManager.func_179145_e();
        GlStateManager.func_179126_j();
        RenderHelper.func_74519_b();
    }

    protected boolean isPointInRegion(int rectX, int rectY, int rectWidth, int rectHeight, int pointX, int pointY) {
        int i = 0;
        int j = 0;
        return (pointX -= i) >= rectX - 1 && pointX < rectX + rectWidth + 1 && (pointY -= j) >= rectY - 1 && pointY < rectY + rectHeight + 1;
    }

    protected void func_146273_a(int parMouseX, int parMouseY, int parLastButtonClicked, long parTimeSinceMouseClick) {
    }

    protected void func_146284_a(GuiButton parButton) {
        if (parButton == this.buttonPrevious) {
            this.field_146297_k.func_147108_a(this.previousScreen);
        } else if (parButton == this.buttonAccept) {
            if (this.isRedeemable) {
                Set<Mission> missions = CompatibleMissionCapability.getMissions((Entity)this.player);
                for (Mission mission : missions) {
                    if (!this.missionOffering.getId().equals(mission.getMissionOfferingId()) || !mission.isCompleted(this.player) || mission.isRedeemed()) continue;
                    mission.setRedeemed(this.player.field_70170_p.func_82737_E());
                }
                CompatibleMissionCapability.updateMissions((Entity)this.player, missions);
                this.modContext.getChannel().getChannel().sendToServer((IMessage)new AcceptMissionMessage(this.missionAssigner, this.missionOffering, AcceptMissionMessage.Action.REDEEM));
                this.field_146297_k.func_147108_a((GuiScreen)null);
            } else {
                CompatibleMissionCapability.updateMission((Entity)this.player, new Mission(this.missionOffering.getId(), (Entity)this.missionAssigner, this.field_146297_k.field_71441_e.func_82737_E(), this.missionOffering.getMaxDuration(), this.missionOffering.createGoals()));
                this.modContext.getChannel().getChannel().sendToServer((IMessage)new AcceptMissionMessage(this.missionAssigner, this.missionOffering, AcceptMissionMessage.Action.ASSIGN));
                this.field_146297_k.func_147108_a((GuiScreen)null);
            }
        } else if (parButton == this.buttonDecline) {
            this.field_146297_k.func_147108_a((GuiScreen)null);
        }
    }

    public void func_146281_b() {
    }

    public boolean func_73868_f() {
        return true;
    }
}


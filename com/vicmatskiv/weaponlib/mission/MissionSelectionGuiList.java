/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiListExtended
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.mission;

import com.google.common.collect.Lists;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.mission.MissionAssigner;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import com.vicmatskiv.weaponlib.mission.MissionSelectionGui;
import com.vicmatskiv.weaponlib.mission.MissionSelectionGuiListEntry;
import com.vicmatskiv.weaponlib.mission.Missions;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class MissionSelectionGuiList
extends GuiListExtended {
    private final MissionSelectionGui missionSelection;
    private final List<MissionSelectionGuiListEntry> entries = Lists.newArrayList();
    private int selectedIdx = -1;
    private MissionAssigner missionAssigner;
    private EntityPlayer player;
    private ModContext modContext;
    private int selectionAreaWidth = 300;
    private int selectionAreaHeight = 200;

    public MissionSelectionGuiList(MissionAssigner missionAssigner, EntityPlayer player, ModContext modContext, MissionSelectionGui missionSelection, Minecraft clientIn, int width, int height, int left, int top, int bottom, int slotHeight) {
        super(clientIn, width, height, top, bottom, slotHeight);
        this.field_148152_e = left;
        this.field_148151_d = left + width;
        this.missionAssigner = missionAssigner;
        this.player = player;
        this.modContext = modContext;
        this.missionSelection = missionSelection;
        this.player = player;
        this.refreshList();
    }

    protected MissionSelectionGui getMissionSelection() {
        return this.missionSelection;
    }

    protected MissionAssigner getMissionAssigner() {
        return this.missionAssigner;
    }

    protected EntityPlayer getPlayer() {
        return this.player;
    }

    protected ModContext getModContext() {
        return this.modContext;
    }

    public void refreshList() {
        Collection<MissionOffering> availableMissionOfferings = Missions.getAvailableOfferings(this.missionAssigner, this.player);
        Collection<MissionOffering> redeemableMissionOfferings = Missions.getRedeemableMissionOfferings(this.missionAssigner, this.player);
        if (!redeemableMissionOfferings.isEmpty()) {
            for (MissionOffering missionOffering : redeemableMissionOfferings) {
                this.entries.add(new MissionSelectionGuiListEntry(this, missionOffering, true));
            }
        } else {
            for (MissionOffering missionOffering : availableMissionOfferings) {
                this.entries.add(new MissionSelectionGuiListEntry(this, missionOffering, false));
            }
        }
    }

    public MissionSelectionGuiListEntry getListEntry(int index) {
        return this.entries.get(index);
    }

    protected int func_148127_b() {
        return this.entries.size();
    }

    protected int func_148137_d() {
        return this.field_148152_e + this.field_148155_a - 5;
    }

    public int func_148139_c() {
        return this.field_148155_a - 24;
    }

    public void selectMission(int idx) {
        this.selectedIdx = idx;
        this.missionSelection.selectMission(this.getSelectedMission());
    }

    protected boolean func_148131_a(int slotIndex) {
        return slotIndex == this.selectedIdx;
    }

    @Nullable
    public MissionSelectionGuiListEntry getSelectedMission() {
        return this.selectedIdx >= 0 && this.selectedIdx < this.func_148127_b() ? this.getListEntry(this.selectedIdx) : null;
    }

    public MissionSelectionGui getMissionSelectionGui() {
        return this.missionSelection;
    }

    protected void drawContainerBackground(Tessellator tessellator) {
    }

    protected void func_148136_c(int startY, int endY, int startAlpha, int endAlpha) {
    }

    public void func_148128_a(int mouseXIn, int mouseYIn, float partialTicks) {
        if (!CompatibilityProvider.compatibility.isStencilEnabled(this.field_148161_k.func_147110_a())) {
            CompatibilityProvider.compatibility.enableStencil(this.field_148161_k.func_147110_a());
        }
        GL11.glEnable((int)3008);
        GL11.glEnable((int)2960);
        GL11.glPushAttrib((int)8192);
        GL11.glStencilFunc((int)519, (int)1, (int)255);
        GL11.glStencilOp((int)7680, (int)7680, (int)7681);
        GL11.glStencilMask((int)255);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
        GL11.glDepthMask((boolean)false);
        GL11.glClear((int)1024);
        this.field_148161_k.field_71446_o.func_110577_a(new ResourceLocation("weaponlib", "/com/vicmatskiv/weaponlib/resources/rectangle-mask.png"));
        Gui.func_146110_a((int)this.field_148152_e, (int)this.field_148153_b, (float)0.0f, (float)0.0f, (int)this.field_148155_a, (int)(this.field_148158_l + 2), (float)this.selectionAreaWidth, (float)this.selectionAreaHeight);
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushAttrib((int)8192);
        GL11.glStencilFunc((int)514, (int)1, (int)255);
        GL11.glStencilMask((int)0);
        GL11.glDepthMask((boolean)true);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)2896);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        this.drawUnclippedScreen(mouseXIn, mouseYIn, partialTicks);
        GL11.glPopAttrib();
        GL11.glPopAttrib();
        GL11.glDisable((int)3008);
        GL11.glDisable((int)2960);
    }

    protected void drawUnclippedScreen(int mouseXIn, int mouseYIn, float partialTicks) {
        if (this.field_178041_q) {
            this.field_148150_g = mouseXIn;
            this.field_148162_h = mouseYIn;
            this.func_148123_a();
            int i = this.func_148137_d();
            int j = i + 6;
            this.func_148121_k();
            GlStateManager.func_179140_f();
            GlStateManager.func_179106_n();
            Tessellator tessellator = Tessellator.func_178181_a();
            BufferBuilder bufferbuilder = tessellator.func_178180_c();
            int insideLeft = this.field_148152_e + (this.field_148155_a - this.func_148139_c() >> 1);
            int l = this.field_148153_b + 4 - (int)this.field_148169_q;
            if (this.field_148165_u) {
                this.func_148129_a(insideLeft, l, tessellator);
            }
            this.func_192638_a(insideLeft, l, mouseXIn, mouseYIn, partialTicks);
            GlStateManager.func_179097_i();
            GlStateManager.func_179147_l();
            GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ZERO, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE);
            GlStateManager.func_179118_c();
            GlStateManager.func_179103_j((int)7425);
            GlStateManager.func_179090_x();
            int j1 = this.func_148135_f();
            if (j1 > 0) {
                int k1 = (this.field_148154_c - this.field_148153_b) * (this.field_148154_c - this.field_148153_b) / this.func_148138_e();
                int l1 = (int)this.field_148169_q * (this.field_148154_c - this.field_148153_b - (k1 = MathHelper.func_76125_a((int)k1, (int)32, (int)(this.field_148154_c - this.field_148153_b - 8)))) / j1 + this.field_148153_b;
                if (l1 < this.field_148153_b) {
                    l1 = this.field_148153_b;
                }
                bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
                bufferbuilder.func_181662_b((double)i, (double)this.field_148154_c, 0.0).func_187315_a(0.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)j, (double)this.field_148154_c, 0.0).func_187315_a(1.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)j, (double)this.field_148153_b, 0.0).func_187315_a(1.0, 0.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)i, (double)this.field_148153_b, 0.0).func_187315_a(0.0, 0.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                tessellator.func_78381_a();
                bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
                bufferbuilder.func_181662_b((double)i, (double)(l1 + k1), 0.0).func_187315_a(0.0, 1.0).func_181669_b(128, 128, 128, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)j, (double)(l1 + k1), 0.0).func_187315_a(1.0, 1.0).func_181669_b(128, 128, 128, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)j, (double)l1, 0.0).func_187315_a(1.0, 0.0).func_181669_b(128, 128, 128, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)i, (double)l1, 0.0).func_187315_a(0.0, 0.0).func_181669_b(128, 128, 128, 255).func_181675_d();
                tessellator.func_78381_a();
                bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
                bufferbuilder.func_181662_b((double)i, (double)(l1 + k1 - 1), 0.0).func_187315_a(0.0, 1.0).func_181669_b(192, 192, 192, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)(j - 1), (double)(l1 + k1 - 1), 0.0).func_187315_a(1.0, 1.0).func_181669_b(192, 192, 192, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)(j - 1), (double)l1, 0.0).func_187315_a(1.0, 0.0).func_181669_b(192, 192, 192, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)i, (double)l1, 0.0).func_187315_a(0.0, 0.0).func_181669_b(192, 192, 192, 255).func_181675_d();
                tessellator.func_78381_a();
            }
            this.func_148142_b(mouseXIn, mouseYIn);
            GlStateManager.func_179098_w();
            GlStateManager.func_179103_j((int)7424);
            GlStateManager.func_179141_d();
            GlStateManager.func_179084_k();
        }
    }

    protected void func_192638_a(int offsetX, int offsetY, int mouseXIn, int mouseYIn, float partialTicks) {
        int i = this.func_148127_b();
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferbuilder = tessellator.func_178180_c();
        for (int slotIndex = 0; slotIndex < i; ++slotIndex) {
            int vPadding = 1;
            int slotY = offsetY + slotIndex * this.field_148149_f + vPadding;
            int slotH = this.field_148149_f - vPadding * 2;
            if (slotY > this.field_148154_c || slotY + slotH < this.field_148153_b) {
                this.func_192639_a(slotIndex, offsetX, slotY, partialTicks);
            }
            if (this.field_148166_t && this.func_148131_a(slotIndex)) {
                int selectionBoxLeft = this.field_148152_e + (this.field_148155_a / 2 - this.func_148139_c() / 2);
                int selectionBoxRight = this.field_148152_e + this.field_148155_a / 2 + this.func_148139_c() / 2;
                GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GlStateManager.func_179090_x();
                bufferbuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
                int selectionVPadding = 1;
                bufferbuilder.func_181662_b((double)selectionBoxLeft, (double)(slotY + slotH + selectionVPadding * 2), 0.0).func_187315_a(0.0, 1.0).func_181669_b(128, 128, 128, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)selectionBoxRight, (double)(slotY + slotH + selectionVPadding * 2), 0.0).func_187315_a(1.0, 1.0).func_181669_b(128, 128, 128, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)selectionBoxRight, (double)(slotY - selectionVPadding * 2), 0.0).func_187315_a(1.0, 0.0).func_181669_b(128, 128, 128, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)selectionBoxLeft, (double)(slotY - selectionVPadding * 2), 0.0).func_187315_a(0.0, 0.0).func_181669_b(128, 128, 128, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)(selectionBoxLeft + 1), (double)(slotY + slotH + selectionVPadding), 0.0).func_187315_a(0.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)(selectionBoxRight - 1), (double)(slotY + slotH + selectionVPadding), 0.0).func_187315_a(1.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)(selectionBoxRight - 1), (double)(slotY - selectionVPadding), 0.0).func_187315_a(1.0, 0.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                bufferbuilder.func_181662_b((double)(selectionBoxLeft + 1), (double)(slotY - selectionVPadding), 0.0).func_187315_a(0.0, 0.0).func_181669_b(0, 0, 0, 255).func_181675_d();
                tessellator.func_78381_a();
                GlStateManager.func_179098_w();
            }
            this.func_192637_a(slotIndex, offsetX, slotY, slotH, mouseXIn, mouseYIn, partialTicks);
        }
    }

    protected void func_192637_a(int slotIndex, int x, int y, int slotHeight, int mouseX, int mouseY, float partialTicks) {
        this.getListEntry(slotIndex).func_192634_a(slotIndex, x, y, this.func_148139_c(), slotHeight, mouseX, mouseY, this.func_148141_e(mouseY) && this.func_148124_c(mouseX, mouseY) == slotIndex, partialTicks);
    }
}


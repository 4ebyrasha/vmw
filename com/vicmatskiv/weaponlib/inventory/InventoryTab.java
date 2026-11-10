/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.compatibility.CompatibleGuiButton;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class InventoryTab
extends CompatibleGuiButton {
    private ResourceLocation texture = new ResourceLocation("textures/gui/container/creative_inventory/tabs.png");
    private ItemStack itemStack;
    private CompatibleRenderItem itemRenderer = new CompatibleRenderItem();

    public InventoryTab(int id, int posX, int posY, ItemStack itemStack) {
        super(id, posX, posY, 28, 32, "");
        this.itemStack = itemStack;
    }

    public InventoryTab(int id, int posX, int posY) {
        super(id, posX, posY, 28, 32, "");
    }

    protected ItemStack getItemStack() {
        return this.itemStack;
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {
        if (this.field_146125_m) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            int yTexPos = this.field_146124_l ? 3 : 32;
            int ySize = this.field_146124_l ? 25 : 32;
            int xOffset = this.field_146127_k == 2 ? 0 : 1;
            int yPos = this.getY() + (this.field_146124_l ? 3 : 0);
            mc.field_71446_o.func_110577_a(this.texture);
            this.func_73729_b(this.getX(), yPos, xOffset * 28, yTexPos, 28, ySize);
            RenderHelper.func_74520_c();
            this.field_73735_i = 100.0f;
            this.itemRenderer.setZLevel(100.0f);
            GL11.glEnable((int)2896);
            GL11.glEnable((int)32826);
            ItemStack itemStack = this.getItemStack();
            this.itemRenderer.renderItemAndEffectIntoGUI(mc.field_71466_p, mc.field_71446_o, itemStack, this.getX() + 6, this.getY() + 8);
            this.itemRenderer.renderItemOverlayIntoGUI(mc.field_71466_p, mc.field_71446_o, itemStack, this.getX() + 6, this.getY() + 8);
            GL11.glDisable((int)2896);
            GL11.glEnable((int)3042);
            this.itemRenderer.setZLevel(0.0f);
            this.field_73735_i = 0.0f;
            RenderHelper.func_74518_a();
        }
    }

    public boolean func_146116_c(Minecraft mc, int mouseX, int mouseY) {
        boolean inWindow;
        boolean bl = inWindow = this.field_146124_l && this.field_146125_m && mouseX >= this.getX() && mouseY >= this.getY() && mouseX < this.getX() + this.field_146120_f && mouseY < this.getY() + this.field_146121_g;
        if (inWindow) {
            this.onTabClicked();
        }
        return inWindow;
    }

    public void onTabClicked() {
    }

    public boolean shouldAddToList() {
        return false;
    }
}


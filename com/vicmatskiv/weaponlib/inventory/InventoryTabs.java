/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.inventory.GuiInventory
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleGuiButton;
import com.vicmatskiv.weaponlib.compatibility.CompatibleInventoryTabs;
import com.vicmatskiv.weaponlib.inventory.InventoryTab;
import com.vicmatskiv.weaponlib.inventory.StandardPlayerInventoryTab;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;

public class InventoryTabs
extends CompatibleInventoryTabs {
    private ArrayList<InventoryTab> tabList = new ArrayList();
    private static InventoryTabs instance = new InventoryTabs();

    private InventoryTabs() {
    }

    public static InventoryTabs getInstance() {
        return instance;
    }

    public void registerTab(InventoryTab tab) {
        this.tabList.add(tab);
    }

    public ArrayList<InventoryTab> getTabList() {
        return this.tabList;
    }

    @Override
    public void guiPostInit(GuiScreen gui) {
        if (gui instanceof GuiInventory) {
            int xSize = 176;
            int ySize = 166;
            int guiLeft = (gui.field_146294_l - xSize) / 2;
            int guiTop = (gui.field_146295_m - ySize) / 2;
            this.updateTabValues(guiLeft += this.getPotionOffset(), guiTop, StandardPlayerInventoryTab.class);
            List buttonlist = (List)CompatibilityProvider.compatibility.getPrivateValue(GuiScreen.class, gui, "buttonList", "field_146292_n");
            this.addTabsToList(buttonlist);
        }
    }

    public void openInventoryGui() {
        CompatibilityProvider.compatibility.closeScreen();
        GuiInventory inventory = new GuiInventory(CompatibilityProvider.compatibility.clientPlayer());
        Minecraft.func_71410_x().func_147108_a((GuiScreen)inventory);
    }

    public void updateTabValues(int cornerX, int cornerY, Class<?> selectedButton) {
        int count = 2;
        for (int i = 0; i < this.tabList.size(); ++i) {
            InventoryTab t = this.tabList.get(i);
            if (!t.shouldAddToList()) continue;
            t.field_146127_k = count;
            CompatibleGuiButton.setPosition(t, cornerX + (count - 2) * 28, cornerY - 28);
            t.field_146124_l = !((Object)((Object)t)).getClass().equals(selectedButton);
            ++count;
        }
    }

    public void addTabsToList(List<?> buttonList) {
        for (InventoryTab tab : this.tabList) {
            if (!tab.shouldAddToList()) continue;
            buttonList.add(tab);
        }
    }
}


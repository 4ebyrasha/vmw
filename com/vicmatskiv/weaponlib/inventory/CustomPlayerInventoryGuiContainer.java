/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleGuiContainer;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventory;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventoryContainer;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventoryTab;
import com.vicmatskiv.weaponlib.inventory.InventoryTabs;
import java.io.IOException;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class CustomPlayerInventoryGuiContainer
extends CompatibleGuiContainer {
    private float xSize_lo;
    private float ySize_lo;
    private static final ResourceLocation iconLocation = new ResourceLocation("mw", "textures/gui/custom_inventory.png");
    private final CustomPlayerInventory inventory;
    private static ThreadLocal<CustomPlayerInventoryGuiContainer> threadLocalGuiContainer = new ThreadLocal();

    public CustomPlayerInventoryGuiContainer(EntityPlayer player, InventoryPlayer inventoryPlayer, CustomPlayerInventory inventoryCustom) {
        super(new CustomPlayerInventoryContainer(player, inventoryPlayer, inventoryCustom));
        this.inventory = inventoryCustom;
    }

    public void func_73866_w_() {
        super.func_73866_w_();
        int cornerX = this.field_147003_i;
        int cornerY = this.field_147009_r;
        this.field_146292_n.clear();
        InventoryTabs iventoryTabs = InventoryTabs.getInstance();
        iventoryTabs.updateTabValues(cornerX, cornerY, CustomPlayerInventoryTab.class);
        iventoryTabs.addTabsToList(this.field_146292_n);
    }

    public void func_73863_a(int mouseX, int mouseY, float f) {
        super.func_73863_a(mouseX, mouseY, f);
        this.xSize_lo = mouseX;
        this.ySize_lo = mouseY;
    }

    protected void func_146979_b(int mouseX, int mouseY) {
    }

    protected void func_146976_a(float f, int mouseX, int mouseY) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.field_146297_k.func_110434_K().func_110577_a(iconLocation);
        this.func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
        CustomPlayerInventoryGuiContainer.drawPlayerModel(this.field_147003_i + 51, this.field_147009_r + 75, 30, (float)(this.field_147003_i + 51) - this.xSize_lo, (float)(this.field_147009_r + 25) - this.ySize_lo, (EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer());
    }

    public static void drawPlayerModel(int x, int y, int scale, float yaw, float pitch, EntityLivingBase entity) {
        GL11.glEnable((int)2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)50.0f);
        GL11.glScalef((float)(-scale), (float)scale, (float)scale);
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        float f2 = entity.field_70761_aq;
        float f3 = entity.field_70177_z;
        float f4 = entity.field_70125_A;
        float f5 = entity.field_70758_at;
        float f6 = entity.field_70759_as;
        GL11.glRotatef((float)135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        RenderHelper.func_74519_b();
        GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-((float)Math.atan(pitch / 40.0f)) * 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        entity.field_70761_aq = (float)Math.atan(yaw / 40.0f) * 20.0f;
        entity.field_70177_z = (float)Math.atan(yaw / 40.0f) * 40.0f;
        entity.field_70125_A = -((float)Math.atan(pitch / 40.0f)) * 20.0f;
        entity.field_70759_as = entity.field_70177_z;
        entity.field_70758_at = entity.field_70177_z;
        GL11.glTranslatef((float)0.0f, (float)((float)CompatibilityProvider.compatibility.getEntityYOffset((Entity)entity)), (float)0.0f);
        CustomPlayerInventoryGuiContainer.setPlayerViewY(180.0f);
        CustomPlayerInventoryGuiContainer.renderEntityWithPosYaw(entity, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        entity.field_70761_aq = f2;
        entity.field_70177_z = f3;
        entity.field_70125_A = f4;
        entity.field_70758_at = f5;
        entity.field_70759_as = f6;
        GL11.glPopMatrix();
        RenderHelper.func_74518_a();
        GL11.glDisable((int)32826);
        OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77476_b);
        GL11.glDisable((int)3553);
        OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void compatibleMouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        try {
            threadLocalGuiContainer.set(this);
            super.compatibleMouseClicked(mouseX, mouseY, mouseButton);
        }
        finally {
            threadLocalGuiContainer.remove();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void func_146286_b(int mouseX, int mouseY, int state) {
        try {
            threadLocalGuiContainer.set(this);
            super.func_146286_b(mouseX, mouseY, state);
        }
        finally {
            threadLocalGuiContainer.remove();
        }
    }

    protected static CustomPlayerInventoryGuiContainer getClickedGuiContainer() {
        return threadLocalGuiContainer.get();
    }
}


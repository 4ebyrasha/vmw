/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.inventory;

import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleGuiContainer;
import com.vicmatskiv.weaponlib.inventory.BackpackInventoryTab;
import com.vicmatskiv.weaponlib.inventory.InventoryTabs;
import com.vicmatskiv.weaponlib.inventory.StorageInventory;
import com.vicmatskiv.weaponlib.inventory.StorageItemContainer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class StorageItemGuiContainer
extends CompatibleGuiContainer {
    private float xSize_lo;
    private float ySize_lo;
    private ResourceLocation guiTextureLocation;
    private final StorageInventory inventory;

    public StorageItemGuiContainer(StorageItemContainer storageItemContainer) {
        super(storageItemContainer);
        this.inventory = storageItemContainer.getStorageInventory();
        this.guiTextureLocation = this.inventory.getItemStorage().getGuiTextureLocation();
        this.field_146999_f = this.inventory.getItemStorage().getGuiTextureWidth();
    }

    public void func_73866_w_() {
        super.func_73866_w_();
        int cornerX = this.field_147003_i;
        int cornerY = this.field_147009_r;
        this.field_146292_n.clear();
        InventoryTabs iventoryTabs = InventoryTabs.getInstance();
        iventoryTabs.updateTabValues(cornerX, cornerY, BackpackInventoryTab.class);
        iventoryTabs.addTabsToList(this.field_146292_n);
    }

    public void func_73863_a(int par1, int par2, float par3) {
        super.func_73863_a(par1, par2, par3);
        this.xSize_lo = par1;
        this.ySize_lo = par2;
    }

    protected void func_146979_b(int par1, int par2) {
    }

    protected void func_146976_a(float par1, int par2, int par3) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.field_146297_k.func_110434_K().func_110577_a(this.guiTextureLocation);
        int k = (this.field_146294_l - this.field_146999_f) / 2;
        int l = (this.field_146295_m - this.field_147000_g) / 2;
        this.func_73729_b(k, l, 0, 0, this.field_146999_f, this.field_147000_g);
        StorageItemGuiContainer.drawPlayerModel(k + 51, l + 75, 30, (float)(k + 51) - this.xSize_lo, (float)(l + 75 - 50) - this.ySize_lo, (EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer());
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
        StorageItemGuiContainer.setPlayerViewY(180.0f);
        StorageItemGuiContainer.renderEntityWithPosYaw(entity, 0.0, 0.0, 0.0, 0.0f, 1.0f);
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
}


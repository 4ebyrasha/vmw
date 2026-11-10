/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.client.renderer.entity.RenderPlayer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CompatibleCustomArmor
extends ItemArmor {
    protected String textureName;
    protected ModelBiped model;
    protected String hudTextureName;
    protected String modId;

    protected CompatibleCustomArmor(String modId, ItemArmor.ArmorMaterial material, int renderIndex, CompatibleEntityEquipmentSlot armorType, String iconName, String textureName, ModelBiped model, String hudTextureName) {
        super(material, renderIndex, armorType.getSlot());
        this.modId = modId;
        this.textureName = textureName;
        this.model = model;
        this.hudTextureName = hudTextureName;
    }

    public String getHudTexture() {
        return this.modId + ":textures/hud/" + this.hudTextureName + ".png";
    }

    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return this.modId + ":textures/models/" + this.textureName + ".png";
    }

    @SideOnly(value=Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        ModelBiped armorModel = null;
        if (itemStack != null) {
            if (itemStack.func_77973_b() instanceof CompatibleCustomArmor) {
                armorModel = this.model;
            }
            if (armorModel != null) {
                armorModel.field_78116_c.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
                armorModel.field_178720_f.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
                armorModel.field_78115_e.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
                armorModel.field_178723_h.field_78806_j = armorSlot == EntityEquipmentSlot.MAINHAND || armorSlot == EntityEquipmentSlot.OFFHAND;
                armorModel.field_178724_i.field_78806_j = armorSlot == EntityEquipmentSlot.MAINHAND || armorSlot == EntityEquipmentSlot.OFFHAND;
                armorModel.field_178721_j.field_78806_j = armorSlot == EntityEquipmentSlot.FEET;
                armorModel.field_178722_k.field_78806_j = armorSlot == EntityEquipmentSlot.FEET;
                armorModel.field_78117_n = entityLiving.func_70093_af();
                armorModel.field_78093_q = entityLiving.func_184218_aH();
                armorModel.field_78091_s = entityLiving.func_70631_g_();
                if (entityLiving instanceof EntityPlayer) {
                    Render entityRenderObject = Minecraft.func_71410_x().func_175598_ae().func_78713_a((Entity)((AbstractClientPlayer)entityLiving));
                    RenderPlayer renderPlayer = (RenderPlayer)entityRenderObject;
                    armorModel.field_187075_l = renderPlayer.func_177087_b().field_187075_l;
                    armorModel.field_187076_m = renderPlayer.func_177087_b().field_187076_m;
                }
                return armorModel;
            }
        }
        return null;
    }
}


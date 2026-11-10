/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.world.EnumDifficulty
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Guns;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMaterial;
import com.vicmatskiv.weaponlib.tile.CustomTileEntityBlock;
import com.vicmatskiv.weaponlib.tile.LootBoxConfiguration;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.EnumDifficulty;
import org.lwjgl.opengl.GL11;

public class TileEntities {
    public static void init(CommonProxy commonProxy) {
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("weapons_case")).withModelClassName("com.vicmatskiv.mw.models.GunCase")).withTextureName("textures/models/gun_case.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withBoundingBox(blockState -> {
            AxisAlignedBB boundingBox = null;
            EnumFacing facing = (EnumFacing)blockState.func_177229_b((IProperty)CustomTileEntityBlock.FACING);
            switch (facing) {
                case WEST: {
                    boundingBox = new AxisAlignedBB(0.82, 0.0, -0.65, 0.18, 0.3, 1.6);
                    break;
                }
                case EAST: {
                    boundingBox = new AxisAlignedBB(0.81, 0.0, -0.6, 0.18, 0.3, 1.65);
                    break;
                }
                case NORTH: {
                    boundingBox = new AxisAlignedBB(-0.58, 0.0, 0.2, 1.63, 0.3, 0.8);
                    break;
                }
                case SOUTH: {
                    boundingBox = new AxisAlignedBB(-0.65, 0.0, 0.2, 1.6, 0.3, 0.8);
                    break;
                }
            }
            return boundingBox;
        })).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.6f, (float)0.6f, (float)0.6f);
            GL11.glTranslatef((float)0.7f, (float)1.1f, (float)0.5f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("weapons_case_small")).withModelClassName("com.vicmatskiv.mw.models.GunCaseSmall")).withTextureName("textures/models/gun_case_small.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withBoundingBox(blockState -> {
            AxisAlignedBB boundingBox = null;
            EnumFacing facing = (EnumFacing)blockState.func_177229_b((IProperty)CustomTileEntityBlock.FACING);
            switch (facing) {
                case WEST: {
                    boundingBox = new AxisAlignedBB(0.09, 0.0, 0.09, 0.77, 0.33, 0.93);
                    break;
                }
                case EAST: {
                    boundingBox = new AxisAlignedBB(0.22, 0.0, 0.05, 0.92, 0.33, 0.9);
                    break;
                }
                case NORTH: {
                    boundingBox = new AxisAlignedBB(0.05, 0.0, 0.1, 0.9, 0.33, 0.77);
                    break;
                }
                case SOUTH: {
                    boundingBox = new AxisAlignedBB(0.1, 0.0, 0.23, 0.95, 0.33, 0.92);
                    break;
                }
            }
            return boundingBox;
        })).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.6f, (float)0.6f, (float)0.6f);
            GL11.glTranslatef((float)0.8f, (float)1.1f, (float)0.8f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("russian_weapons_case")).withModelClassName("com.vicmatskiv.mw.models.MilitaryCrate")).withTextureName("textures/models/militarycrate.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withBoundingBox(blockState -> {
            AxisAlignedBB boundingBox = null;
            EnumFacing facing = (EnumFacing)blockState.func_177229_b((IProperty)CustomTileEntityBlock.FACING);
            switch (facing) {
                case WEST: {
                    boundingBox = new AxisAlignedBB(0.03, 0.0, -0.43, 0.97, 0.54, 1.47);
                    break;
                }
                case EAST: {
                    boundingBox = new AxisAlignedBB(0.03, 0.0, -0.43, 0.97, 0.54, 1.47);
                    break;
                }
                case NORTH: {
                    boundingBox = new AxisAlignedBB(-0.47, 0.0, 0.03, 1.44, 0.54, 0.98);
                    break;
                }
                case SOUTH: {
                    boundingBox = new AxisAlignedBB(-0.43, 0.0, 0.03, 1.46, 0.54, 0.98);
                    break;
                }
            }
            return boundingBox;
        })).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.6f, (float)0.6f, (float)0.6f);
            GL11.glTranslatef((float)0.8f, (float)1.15f, (float)0.75f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("ammo_box")).withModelClassName("com.vicmatskiv.mw.models.Ammobox1")).withTextureName("textures/models/ammobox.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withBoundingBox(blockState -> {
            AxisAlignedBB boundingBox = null;
            EnumFacing facing = (EnumFacing)blockState.func_177229_b((IProperty)CustomTileEntityBlock.FACING);
            switch (facing) {
                case WEST: {
                    boundingBox = new AxisAlignedBB(0.35, 0.0, 0.15, 0.7, 0.5, 0.85);
                    break;
                }
                case EAST: {
                    boundingBox = new AxisAlignedBB(0.35, 0.0, 0.15, 0.7, 0.5, 0.85);
                    break;
                }
                case NORTH: {
                    boundingBox = new AxisAlignedBB(0.15, 0.0, 0.35, 0.83, 0.5, 0.7);
                    break;
                }
                case SOUTH: {
                    boundingBox = new AxisAlignedBB(0.15, 0.0, 0.35, 0.83, 0.5, 0.7);
                    break;
                }
            }
            return boundingBox;
        })).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.4f, (float)0.4f, (float)0.4f);
            GL11.glTranslatef((float)1.2f, (float)2.5f, (float)1.1f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("weapons_locker")).withModelClassName("com.vicmatskiv.mw.models.GunRack")).withTextureName("textures/models/gunrack.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.6f, (float)0.6f, (float)0.6f);
            GL11.glTranslatef((float)0.4f, (float)1.15f, (float)0.6f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("fridge_open")).withModelClassName("com.vicmatskiv.mw.models.FridgeOpen")).withTextureName("textures/models/fridge.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glTranslatef((float)0.55f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("fridge_closed")).withModelClassName("com.vicmatskiv.mw.models.FridgeClosed")).withTextureName("textures/models/fridge.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glTranslatef((float)0.55f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("artillery_PROP")).withModelClassName("com.vicmatskiv.mw.models.ArtilleryProp20")).withTextureName("textures/models/artilleryprop.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.55f, (float)0.6f, (float)0.55f);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("supply_drop")).withModelClassName("com.vicmatskiv.mw.models.SupplyDrop")).withTextureName("textures/models/supplydrop.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
            GL11.glTranslatef((float)0.2f, (float)1.63f, (float)1.7f);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentOption(Guns.AK101, EnumDifficulty.EASY, 2.0f, new ItemAttachment[0]).withEquipmentOption(Guns.M38, EnumDifficulty.EASY, 2.0f, new ItemAttachment[0]).withEquipmentOption(Guns.APS, EnumDifficulty.EASY, 4.0f, new ItemAttachment[0]).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("medical_crate")).withModelClassName("com.vicmatskiv.mw.models.MedicalCrate")).withTextureName("textures/models/medicalcrate.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.6f, (float)0.6f, (float)0.6f);
            GL11.glTranslatef((float)0.7f, (float)1.13f, (float)0.5f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("locker")).withModelClassName("com.vicmatskiv.mw.models.Locker")).withTextureName("textures/models/locker.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
            GL11.glTranslatef((float)0.7f, (float)1.85f, (float)1.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("scp_locker")).withModelClassName("com.vicmatskiv.mw.models.SCPLocker")).withTextureName("textures/models/scplocker.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.5f, (float)0.45f, (float)0.6f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("barrel")).withModelClassName("com.vicmatskiv.mw.models.Barrel")).withTextureName("textures/models/barrel.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.9f, (float)0.8f, (float)0.9f);
            GL11.glTranslatef((float)0.55f, (float)0.4f, (float)0.55f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("explosive_barrel")).withModelClassName("com.vicmatskiv.mw.models.Barrel")).withTextureName("textures/models/barrel_explosive.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.9f, (float)0.8f, (float)0.9f);
            GL11.glTranslatef((float)0.55f, (float)0.4f, (float)0.55f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("pc")).withModelClassName("com.vicmatskiv.mw.models.PC")).withTextureName("textures/models/pc.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.9f, (float)0.9f, (float)0.9f);
            GL11.glTranslatef((float)0.7f, (float)0.25f, (float)0.6f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("laptop")).withModelClassName("com.vicmatskiv.mw.models.Laptop")).withTextureName("textures/models/pc.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.7f, (float)0.7f, (float)0.7f);
            GL11.glTranslatef((float)0.5f, (float)0.71f, (float)0.6f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("monitor")).withModelClassName("com.vicmatskiv.mw.models.Monitor")).withTextureName("textures/models/pc.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.9f, (float)0.9f, (float)0.9f);
            GL11.glTranslatef((float)0.7f, (float)0.25f, (float)0.6f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("filingcabinet")).withModelClassName("com.vicmatskiv.mw.models.FilingCabinet")).withTextureName("textures/models/filingcabinetopened.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("filingcabinet_opened")).withModelClassName("com.vicmatskiv.mw.models.FilingCabinetOpened")).withTextureName("textures/models/filingcabinetopened.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("shelf_right")).withModelClassName("com.vicmatskiv.mw.models.ShelfRight")).withTextureName("textures/models/shelf.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("shelf_left")).withModelClassName("com.vicmatskiv.mw.models.ShelfLeft")).withTextureName("textures/models/shelf.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("shelf_top")).withModelClassName("com.vicmatskiv.mw.models.ShelfTop")).withTextureName("textures/models/shelf.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("tv")).withModelClassName("com.vicmatskiv.mw.models.TV")).withTextureName("textures/models/tv.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("ceiling_tv")).withModelClassName("com.vicmatskiv.mw.models.CeilingTV")).withTextureName("textures/models/ceilingtv.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.4f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("ceiling_tv_rotated")).withModelClassName("com.vicmatskiv.mw.models.CeilingTV")).withTextureName("textures/models/ceilingtv.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.6f, (float)0.4f, (float)0.7f);
            GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("office_chair")).withModelClassName("com.vicmatskiv.mw.models.OfficeChair")).withTextureName("textures/models/officechair.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("office_chair_2")).withModelClassName("com.vicmatskiv.mw.models.OfficeChair2")).withTextureName("textures/models/officechair.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_corner")).withModelClassName("com.vicmatskiv.mw.models.DeskCorner")).withTextureName("textures/models/desk.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.07f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_corner_alt1")).withModelClassName("com.vicmatskiv.mw.models.DeskCornerAlt1")).withTextureName("textures/models/desk.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.07f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_left")).withModelClassName("com.vicmatskiv.mw.models.DeskLeft")).withTextureName("textures/models/desk.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_left_alt1")).withModelClassName("com.vicmatskiv.mw.models.DeskLeftAlt1")).withTextureName("textures/models/desk.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_middle")).withModelClassName("com.vicmatskiv.mw.models.DeskMiddle")).withTextureName("textures/models/desk.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_middle_alt1")).withModelClassName("com.vicmatskiv.mw.models.DeskMiddleAlt1")).withTextureName("textures/models/deskmiddlealt1.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_right")).withModelClassName("com.vicmatskiv.mw.models.DeskRight")).withTextureName("textures/models/desk.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_right_alt1")).withModelClassName("com.vicmatskiv.mw.models.DeskRightAlt1")).withTextureName("textures/models/desk.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_shelf")).withModelClassName("com.vicmatskiv.mw.models.DeskShelf")).withTextureName("textures/models/deskshelf.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_shelf_alt1")).withModelClassName("com.vicmatskiv.mw.models.DeskShelfAlt1")).withTextureName("textures/models/deskshelfalt1.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_shelf_alt2")).withModelClassName("com.vicmatskiv.mw.models.DeskShelfAlt2")).withTextureName("textures/models/deskshelf.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("desk_shelf_alt3")).withModelClassName("com.vicmatskiv.mw.models.DeskShelfAlt4")).withTextureName("textures/models/deskshelfalt4.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("barrier")).withModelClassName("com.vicmatskiv.mw.models.Barrier")).withTextureName("textures/models/barrier.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.1f, (float)1.2f, (float)1.0f);
            GL11.glTranslatef((float)0.42f, (float)-0.25f, (float)0.5f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("barrier_rotated")).withModelClassName("com.vicmatskiv.mw.models.Barrier")).withTextureName("textures/models/barrier.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.1f, (float)1.2f, (float)1.1f);
            GL11.glTranslatef((float)0.42f, (float)-0.25f, (float)0.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("body_bag")).withModelClassName("com.vicmatskiv.mw.models.BodyBag")).withTextureName("textures/models/bodybag.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.9f, (float)0.9f, (float)0.9f);
            GL11.glTranslatef((float)0.5f, (float)-0.9f, (float)0.55f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("hanging_body")).withModelClassName("com.vicmatskiv.mw.models.HangingBody")).withTextureName("textures/models/hangingbody.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.9f, (float)0.9f, (float)0.9f);
            GL11.glTranslatef((float)0.5f, (float)1.8f, (float)0.55f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("impaled_body")).withModelClassName("com.vicmatskiv.mw.models.ImpaledBody")).withTextureName("textures/models/impaledbody.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.9f, (float)0.9f, (float)0.9f);
            GL11.glTranslatef((float)0.5f, (float)0.2f, (float)0.55f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("dumpster")).withModelClassName("com.vicmatskiv.mw.models.Dumpster")).withTextureName("textures/models/dumpster.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.9f, (float)0.9f, (float)0.9f);
            GL11.glTranslatef((float)0.6f, (float)0.2f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("wooden_crate")).withModelClassName("com.vicmatskiv.mw.models.WoodenCrate")).withTextureName("textures/models/woodencrate.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)0.95f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.085f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("wooden_crate_opened")).withModelClassName("com.vicmatskiv.mw.models.WoodenCrateOpened")).withTextureName("textures/models/woodencrateopened.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("operating_table")).withModelClassName("com.vicmatskiv.mw.models.OperatingTable")).withTextureName("textures/models/operatingtable.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("operating_table_alt")).withModelClassName("com.vicmatskiv.mw.models.OperatingTableAlt")).withTextureName("textures/models/operatingtable.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("forklift")).withModelClassName("com.vicmatskiv.mw.models.Forklift")).withTextureName("textures/models/forklift.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glTranslatef((float)0.5f, (float)-0.5f, (float)0.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("forklift_alt")).withModelClassName("com.vicmatskiv.mw.models.ForkLiftAlt")).withTextureName("textures/models/forkliftalt.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("trusses")).withModelClassName("com.vicmatskiv.mw.models.Trusses")).withTextureName("textures/models/trusses.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ceiling_lamp")).withModelClassName("com.vicmatskiv.mw.models.CeilingLamp")).withTextureName("textures/models/ceilinglamp.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)1.8f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ceiling_lamp_alt")).withModelClassName("com.vicmatskiv.mw.models.CeilingLampAlt")).withTextureName("textures/models/ceilinglampalt.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.2f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("vent")).withModelClassName("com.vicmatskiv.mw.models.Vent")).withTextureName("textures/models/vent.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("vent_rotated")).withModelClassName("com.vicmatskiv.mw.models.Vent")).withTextureName("textures/models/vent.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)1.0f, (float)1.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("vent_corner")).withModelClassName("com.vicmatskiv.mw.models.VentCorner")).withTextureName("textures/models/vent.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("vent_corner_rotated")).withModelClassName("com.vicmatskiv.mw.models.VentCorner")).withTextureName("textures/models/vent.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)1.0f, (float)1.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("vent_corner_rotated_alt")).withModelClassName("com.vicmatskiv.mw.models.VentCorner")).withTextureName("textures/models/vent.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)1.0f, (float)-0.5f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("vent_intersection")).withModelClassName("com.vicmatskiv.mw.models.VentIntersection")).withTextureName("textures/models/vent.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("vent_end")).withModelClassName("com.vicmatskiv.mw.models.VentEnd")).withTextureName("textures/models/vent.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("white_desk_left")).withModelClassName("com.vicmatskiv.mw.models.WhiteDeskLeft")).withTextureName("textures/models/shelf.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("white_desk_middle")).withModelClassName("com.vicmatskiv.mw.models.WhiteDeskMiddle")).withTextureName("textures/models/shelf.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("white_desk_right")).withModelClassName("com.vicmatskiv.mw.models.WhiteDeskRight")).withTextureName("textures/models/shelf.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("trash_bin")).withModelClassName("com.vicmatskiv.mw.models.TrashBin")).withTextureName("textures/models/trashbin.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("caution_sign")).withModelClassName("com.vicmatskiv.mw.models.CautionSign")).withTextureName("textures/models/cautionsign.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.6f, (float)0.45f, (float)0.6f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("electric_box")).withModelClassName("com.vicmatskiv.mw.models.ElectricBox")).withTextureName("textures/models/electricbox.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.8f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("electric_box_opened")).withModelClassName("com.vicmatskiv.mw.models.ElectricBoxOpened")).withTextureName("textures/models/electricboxopened.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.8f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("home_chair")).withModelClassName("com.vicmatskiv.mw.models.HomeChair")).withTextureName("textures/models/homechair.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("outdoor_chair")).withModelClassName("com.vicmatskiv.mw.models.OutdoorChair")).withTextureName("textures/models/outdoorchair.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("home_chair_rotated")).withModelClassName("com.vicmatskiv.mw.models.HomeChair")).withTextureName("textures/models/homechair.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("outdoor_chair_rotated")).withModelClassName("com.vicmatskiv.mw.models.OutdoorChair")).withTextureName("textures/models/outdoorchair.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("vending_machine")).withModelClassName("com.vicmatskiv.mw.models.VendingMachine")).withTextureName("textures/models/vendingmachine.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.55f, (float)0.4f, (float)0.62f);
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ServerRackLeft")).withModelClassName("com.vicmatskiv.mw.models.ServerRackLeft")).withTextureName("textures/models/serverrackleft.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ServerRackEmptyLeft")).withModelClassName("com.vicmatskiv.mw.models.ServerRackEmptyLeft")).withTextureName("textures/models/serverrackemptyright.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ServerRackLeftAlt")).withModelClassName("com.vicmatskiv.mw.models.ServerRackLeftAlt")).withTextureName("textures/models/serverrackleftalt.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ServerRackLeftAlt2")).withModelClassName("com.vicmatskiv.mw.models.ServerRackLeftAlt2")).withTextureName("textures/models/serverrackleftalt2.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ServerRackLeftAlt3")).withModelClassName("com.vicmatskiv.mw.models.ServerRackLeftAlt3")).withTextureName("textures/models/serverrackleftalt3.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ServerRackEmptyRight")).withModelClassName("com.vicmatskiv.mw.models.ServerRackEmptyRight")).withTextureName("textures/models/serverrackemptyright.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ServerRackRight")).withModelClassName("com.vicmatskiv.mw.models.ServerRackRight")).withTextureName("textures/models/serverrackright.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ServerRackRightAlt")).withModelClassName("com.vicmatskiv.mw.models.ServerRackRightAlt")).withTextureName("textures/models/serverrackrightalt.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ServerRackTopLeft")).withModelClassName("com.vicmatskiv.mw.models.ServerRackTop")).withTextureName("textures/models/serverrackleft.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("ServerRackTopRight")).withModelClassName("com.vicmatskiv.mw.models.ServerRackTopRight")).withTextureName("textures/models/serverrackleft.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("DuelFloodLight")).withModelClassName("com.vicmatskiv.mw.models.DuelFloodLight")).withTextureName("textures/models/duelfloodlight.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
            GL11.glTranslatef((float)0.6f, (float)0.35f, (float)0.6f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("FloodLight")).withModelClassName("com.vicmatskiv.mw.models.Floodlight")).withTextureName("textures/models/floodlight.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.9f, (float)0.9f, (float)0.9f);
            GL11.glTranslatef((float)0.6f, (float)0.175f, (float)0.6f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("Radio_rotated")).withModelClassName("com.vicmatskiv.mw.models.Radio")).withTextureName("textures/models/radio.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.7f, (float)0.7f, (float)0.7f);
            GL11.glTranslatef((float)0.65f, (float)0.58f, (float)0.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("Radio")).withModelClassName("com.vicmatskiv.mw.models.Radio")).withTextureName("textures/models/radio.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.7f, (float)0.7f, (float)0.7f);
            GL11.glTranslatef((float)0.65f, (float)0.58f, (float)0.6f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("camera_rotated")).withModelClassName("com.vicmatskiv.mw.models.Camera")).withTextureName("textures/models/camera.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.05f, (float)0.6f);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("propanetank")).withModelClassName("com.vicmatskiv.mw.models.PropaneTank")).withTextureName("textures/models/propanetank.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)0.6f, (float)0.6f, (float)0.6f);
            GL11.glTranslatef((float)0.85f, (float)1.0f, (float)0.85f);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("towablefloodlight")).withModelClassName("com.vicmatskiv.mw.models.TowableFloodLight")).withTextureName("textures/models/towablefloodlight.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.SAND)).withName("hescobastion")).withModelClassName("com.vicmatskiv.mw.models.HescoBastion")).withTextureName("textures/models/hescobastion.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.SAND)).withName("sandbag")).withModelClassName("com.vicmatskiv.mw.models.Sandbag")).withTextureName("textures/models/sandbag.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.SAND)).withName("sandbagwall")).withModelClassName("com.vicmatskiv.mw.models.SandbagWall")).withTextureName("textures/models/sandbag.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("crossgravestone")).withModelClassName("com.vicmatskiv.mw.models.CrossGravestone")).withTextureName("textures/models/crossgravestone.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("crossgravestone2")).withModelClassName("com.vicmatskiv.mw.models.CrossGravestone2")).withTextureName("textures/models/crossgravestone2.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("crossgravestone3")).withModelClassName("com.vicmatskiv.mw.models.CrossGravestone3")).withTextureName("textures/models/crossgravestone3.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("gravestoneskull")).withModelClassName("com.vicmatskiv.mw.models.GravestoneSkull")).withTextureName("textures/models/gravestoneskull.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.ROCK)).withName("gravestone")).withModelClassName("com.vicmatskiv.mw.models.Gravestone")).withTextureName("textures/models/gravestone.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.WOOD)).withName("scarecrow")).withModelClassName("com.vicmatskiv.mw.models.Scarecrow")).withTextureName("textures/models/scarecrow.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withBoundingBox(0.3, 0.0, 0.3, 0.7, 3.5, 0.7)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.0f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.CLOTH)).withName("spookyghost")).withModelClassName("com.vicmatskiv.mw.models.SpookyGhost")).withTextureName("textures/models/spookyghost.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)1.05f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.CLOTH)).withName("spookyghost2")).withModelClassName("com.vicmatskiv.mw.models.SpookyGhost")).withTextureName("textures/models/spookyghost2.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)1.05f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.CLOTH)).withName("spookyghost3")).withModelClassName("com.vicmatskiv.mw.models.SpookyGhost")).withTextureName("textures/models/spookyghost3.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)1.05f, (float)0.5f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
        ((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)((LootBoxConfiguration)new LootBoxConfiguration().withMaterial(CompatibleMaterial.IRON)).withName("swat_truck")).withModelClassName("com.vicmatskiv.mw.models.SwatTruck")).withTextureName("textures/models/swattruck.png")).withCreativeTab(ModernWarfareMod.PropsTab)).withPositioning(tileEntity -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glTranslatef((float)0.3f, (float)-0.45f, (float)-1.0f);
        })).withEquipmentDispenseTimeout(10).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


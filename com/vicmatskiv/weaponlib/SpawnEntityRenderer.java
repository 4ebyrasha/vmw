/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponSpawnEntity;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class SpawnEntityRenderer
extends CompatibleEntityRenderer {
    @Override
    public void doCompatibleRender(Entity entity, double x, double y, double z, float yaw, float tick) {
        if (entity.field_70173_aa < 2) {
            return;
        }
        WeaponSpawnEntity weaponSpawnEntity = (WeaponSpawnEntity)entity;
        Weapon weapon = weaponSpawnEntity.getWeapon();
        if (weapon == null) {
            return;
        }
        ModelBase model = weapon.getAmmoModel();
        if (model != null) {
            ResourceLocation textureLocation;
            String ammoModelTextureName = weapon.getAmmoModelTextureName();
            ResourceLocation resourceLocation = textureLocation = ammoModelTextureName != null ? new ResourceLocation(ammoModelTextureName) : null;
            if (model != null) {
                GL11.glPushMatrix();
                if (textureLocation != null) {
                    this.func_110776_a(textureLocation);
                }
                double xxofset = 0.4 - (double)entity.field_70140_Q * weaponSpawnEntity.getAimTan();
                double angle = Math.atan(weaponSpawnEntity.getAimTan());
                double zOffset = xxofset * Math.cos(entity.field_70177_z / 180.0f * (float)Math.PI);
                double xOffset = xxofset * Math.sin(entity.field_70177_z / 180.0f * (float)Math.PI);
                GL11.glTranslated((double)(x + xOffset), (double)y, (double)(z + zOffset));
                GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(entity.field_70177_z - 90.0f + (float)(angle * 180.0 / Math.PI)), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(90.0f + entity.field_70125_A), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
                model.func_78088_a(entity, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                GL11.glPopMatrix();
            }
        }
    }

    protected ResourceLocation func_110775_a(Entity entity) {
        WeaponSpawnEntity weaponSpawnEntity = (WeaponSpawnEntity)entity;
        return new ResourceLocation(weaponSpawnEntity.getWeapon().getAmmoModelTextureName());
    }
}


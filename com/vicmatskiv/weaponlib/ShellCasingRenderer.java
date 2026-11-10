/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.EntityShellCasing;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponSpawnEntity;
import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ShellCasingRenderer
extends CompatibleEntityRenderer {
    @Override
    public void doCompatibleRender(Entity entity, double x, double y, double z, float yaw, float tick) {
        EntityShellCasing entityShellCasing = (EntityShellCasing)entity;
        Weapon weapon = entityShellCasing.getWeapon();
        if (weapon == null) {
            return;
        }
        ModelBase model = weapon.getShellCasingModel();
        if (model != null) {
            ResourceLocation textureLocation;
            String shellCasingTextureName = weapon.getShellCasingTextureName();
            ResourceLocation resourceLocation = textureLocation = shellCasingTextureName != null ? new ResourceLocation(shellCasingTextureName) : null;
            if (model != null) {
                GL11.glPushMatrix();
                if (textureLocation != null) {
                    this.func_110776_a(textureLocation);
                }
                GL11.glTranslated((double)x, (double)y, (double)z);
                float fov = Minecraft.func_71410_x().field_71474_y.field_74334_X;
                float scale = (fov * 0.001f - 0.02f) * 0.3f;
                GL11.glScalef((float)scale, (float)scale, (float)scale);
                GL11.glRotatef((float)entityShellCasing.getXRotation(), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)entityShellCasing.getYRotation(), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)entityShellCasing.getZRotation(), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
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


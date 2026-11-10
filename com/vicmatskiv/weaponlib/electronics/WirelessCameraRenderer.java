/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.electronics;

import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityRenderer;
import com.vicmatskiv.weaponlib.electronics.EntityWirelessCamera;
import com.vicmatskiv.weaponlib.electronics.ItemWirelessCamera;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class WirelessCameraRenderer
extends CompatibleEntityRenderer {
    private String modId;

    public WirelessCameraRenderer(String modId) {
        this.modId = modId;
    }

    @Override
    public void doCompatibleRender(Entity entity, double x, double y, double z, float yaw, float tick) {
        EntityWirelessCamera weaponSpawnEntity = (EntityWirelessCamera)entity;
        ItemWirelessCamera camera = weaponSpawnEntity.getItem();
        if (camera == null) {
            return;
        }
        ModelBase model = camera.getModel();
        if (model != null) {
            ResourceLocation textureLocation;
            String textureName = camera.getTextureName();
            ResourceLocation resourceLocation = textureLocation = textureName != null ? new ResourceLocation(this.modId + ":textures/models/" + textureName) : null;
            if (model != null) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
                if (textureLocation != null) {
                    this.func_110776_a(textureLocation);
                }
                GL11.glTranslated((double)x, (double)y, (double)z);
                model.func_78088_a(entity, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                GL11.glPopMatrix();
            }
        }
    }

    protected ResourceLocation func_110775_a(Entity entity) {
        EntityWirelessCamera camera = (EntityWirelessCamera)entity;
        ItemWirelessCamera item = camera.getItem();
        if (item != null) {
            return new ResourceLocation(this.modId + ":textures/models/" + item.getTextureName());
        }
        return null;
    }
}


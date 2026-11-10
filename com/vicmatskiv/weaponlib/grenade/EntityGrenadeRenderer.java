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
package com.vicmatskiv.weaponlib.grenade;

import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityRenderer;
import com.vicmatskiv.weaponlib.grenade.AbstractEntityGrenade;
import com.vicmatskiv.weaponlib.grenade.GrenadeRenderer;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class EntityGrenadeRenderer
extends CompatibleEntityRenderer {
    @Override
    public void doCompatibleRender(Entity entity, double x, double y, double z, float yaw, float tick) {
        AbstractEntityGrenade entityGrenade = (AbstractEntityGrenade)entity;
        ItemGrenade itemGrenade = entityGrenade.getItemGrenade();
        if (itemGrenade == null) {
            return;
        }
        GrenadeRenderer renderer = itemGrenade.getRenderer();
        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation(renderer.getClientModContext().getModId(), "textures/models/" + itemGrenade.getTextureName()));
        ModelBase model = renderer.getModel();
        GL11.glPushMatrix();
        GL11.glTranslated((double)x, (double)y, (double)z);
        float rotationOffsetX = renderer.getXRotationCenterOffset().get().floatValue();
        float rotationOffsetY = renderer.getYRotationCenterOffset().get().floatValue();
        float rotationOffsetZ = renderer.getZRotationCenterOffset().get().floatValue();
        GL11.glTranslatef((float)rotationOffsetX, (float)rotationOffsetY, (float)rotationOffsetZ);
        GL11.glRotatef((float)entityGrenade.getXRotation(), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)entityGrenade.getYRotation(), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)entityGrenade.getZRotation(), (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glTranslatef((float)(-rotationOffsetX), (float)(-rotationOffsetY), (float)(-rotationOffsetZ));
        renderer.getThrownEntityPositioning().run();
        model.func_78088_a(entity, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.08f);
        GL11.glPopMatrix();
    }

    protected ResourceLocation func_110775_a(Entity entity) {
        return null;
    }
}


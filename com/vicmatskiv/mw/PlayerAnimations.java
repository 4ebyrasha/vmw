/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.PlayerTransitionProvider;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.animation.MultipartTransition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import org.lwjgl.opengl.GL11;

public class PlayerAnimations {
    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {
        PlayerTransitionProvider playerTransitionProvider = new PlayerTransitionProvider.Builder().withProningTransition(new MultipartTransition<Part, RenderContext>(Part.MAIN, renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)1.36f, (float)-0.5f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 200L, 0L).withPartPositionFunction(Part.HEAD, rc -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.08f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }).withPartPositionFunction(Part.LEFT_HAND, rc -> {
            GL11.glTranslatef((float)-0.1f, (float)0.1f, (float)0.0f);
            GL11.glRotatef((float)-180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }).withPartPositionFunction(Part.RIGHT_HAND, rc -> {
            GL11.glTranslatef((float)0.08f, (float)0.1f, (float)0.0f);
            GL11.glRotatef((float)-160.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }).withPartPositionFunction(Part.LEFT_LEG, rc -> {
            GL11.glTranslatef((float)0.04f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }).withPartPositionFunction(Part.RIGHT_LEG, rc -> {
            GL11.glTranslatef((float)0.05f, (float)0.4f, (float)-0.02f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)0.5f, (float)1.0f);
        })).withProningTransition(new MultipartTransition<Part, RenderContext>(Part.MAIN, renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)1.36f, (float)-0.5f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 200L, 0L).withPartPositionFunction(Part.HEAD, rc -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.08f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }).withPartPositionFunction(Part.LEFT_HAND, rc -> {
            GL11.glTranslatef((float)-0.1f, (float)0.1f, (float)0.0f);
            GL11.glRotatef((float)-180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)0.5f, (float)1.0f);
        }).withPartPositionFunction(Part.RIGHT_HAND, rc -> {
            GL11.glTranslatef((float)0.08f, (float)0.1f, (float)0.0f);
            GL11.glRotatef((float)-160.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }).withPartPositionFunction(Part.LEFT_LEG, rc -> {
            GL11.glTranslatef((float)-0.04f, (float)0.4f, (float)-0.02f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)0.5f, (float)1.0f);
        }).withPartPositionFunction(Part.RIGHT_LEG, rc -> {
            GL11.glTranslatef((float)-0.02f, (float)0.0f, (float)-0.02f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)1.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        })).withProningAimingTransition(new MultipartTransition<Part, RenderContext>(Part.MAIN, renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)1.36f, (float)-0.5f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 200L, 0L).withPartPositionFunction(Part.HEAD, rc -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.08f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }).withPartPositionFunction(Part.LEFT_HAND, rc -> {
            GL11.glTranslatef((float)-0.1f, (float)0.12f, (float)-0.02f);
            GL11.glRotatef((float)-180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.1f, (float)1.0f);
        }).withPartPositionFunction(Part.RIGHT_HAND, rc -> {
            GL11.glTranslatef((float)0.08f, (float)0.3f, (float)0.03f);
            GL11.glRotatef((float)-160.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }).withPartPositionFunction(Part.LEFT_LEG, rc -> {
            GL11.glTranslatef((float)-0.15f, (float)0.0f, (float)-0.1f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }).withPartPositionFunction(Part.RIGHT_LEG, rc -> {
            GL11.glTranslatef((float)-0.02f, (float)0.0f, (float)-0.02f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)1.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        })).build();
        ModernWarfareMod.MOD_CONTEXT.setPlayerTransitionProvider(playerTransitionProvider);
    }
}


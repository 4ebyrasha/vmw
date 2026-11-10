/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.GasDetector;
import com.vicmatskiv.mw.models.HP;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.electronics.ItemHandheld;
import com.vicmatskiv.weaponlib.electronics.ItemTablet;
import com.vicmatskiv.weaponlib.electronics.ItemWirelessCamera;
import com.vicmatskiv.weaponlib.model.CameraModel;
import com.vicmatskiv.weaponlib.model.TabletModel;
import com.vicmatskiv.weaponlib.perspective.GasDetectorScreenPerspective;
import org.lwjgl.opengl.GL11;

public class Electronics {
    public static ItemAttachment<Object> Tablet;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        Tablet = new ItemTablet.Builder().withViewfinderPositioning((p, s) -> {
            float scale = 5.9f;
            GL11.glScalef((float)scale, (float)(scale / CompatibilityProvider.compatibility.getAspectRatio(ModernWarfareMod.MOD_CONTEXT)), (float)scale);
            GL11.glTranslatef((float)-0.12f, (float)0.56f, (float)0.01f);
        }).withCreativeTab(ModernWarfareMod.GadgetsTab).withCrosshair("HP").withModel(new TabletModel(), "IPad.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glRotatef((float)25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)1.0f, (float)0.1f, (float)-4.399998f);
            GL11.glScaled((double)5.0, (double)5.0, (double)5.0);
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof TabletModel) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof HP) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
            } else if (model instanceof LPscope) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof HP) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof LPscope) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withFirstPersonHandPositioning(c -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-145.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-1.149999f, (float)-0.1f);
        }, c -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-135.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.04f, (float)-0.575f, (float)0.125f);
        }).withName("tablet").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        new ItemWirelessCamera.Builder().withModId("mw").withName("wcam").withCreativeTab(ModernWarfareMod.GadgetsTab).withModel(new CameraModel(), "gun").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.1f, (float)-1.6f, (float)1.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof CameraModel) {
                GL11.glTranslatef((float)-0.9f, (float)-0.8f, (float)0.5f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof HP) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
            } else if (model instanceof LPscope) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof HP) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof LPscope) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withFirstPersonHandPositioning(c -> GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f), c -> GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f)).build(ModernWarfareMod.MOD_CONTEXT);
        new ItemHandheld.Builder().withScreenPerspectiveType(GasDetectorScreenPerspective.class).withScreenPositioning((p, s) -> {
            float scale = 1.9f;
            GL11.glScalef((float)scale, (float)(scale / CompatibilityProvider.compatibility.getAspectRatio(ModernWarfareMod.MOD_CONTEXT)), (float)scale);
            GL11.glTranslatef((float)0.017f, (float)0.16f, (float)0.17f);
        }).withCreativeTab(ModernWarfareMod.GadgetsTab).withCrosshair("HP").withModel(new GasDetector(), "gasdetector.png").withFirstPersonPositioning((player, itemStack) -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)0.4f, (float)-1.8f);
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof TabletModel) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof HP) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
            } else if (model instanceof LPscope) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof HP) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof LPscope) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withFirstPersonHandPositioning(c -> GL11.glScaled((double)0.0, (double)0.0, (double)0.0), c -> {
            GL11.glScalef((float)3.3f, (float)3.3f, (float)3.3f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-105.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.425f, (float)0.05f);
        }).withName("gas-detector").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
    }
}


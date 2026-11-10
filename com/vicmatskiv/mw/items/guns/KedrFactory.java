/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw.items.guns;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Kedr;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import java.util.Arrays;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class KedrFactory {
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("pp91_kedr").withFireRate(0.7f).withRecoil(2.0f).withZoom(0.9f).withMaxShots(1, Integer.MAX_VALUE).withShootSound("kedr").withSilencedShootSound("kbp9a91_silenced").withReloadSound("kedr_reload").withUnloadSound("kedr_unload").withInspectSound("inspection").withDrawSound("noaction_draw").withReloadingTime(45L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withFlashIntensity(0.4f).withFlashScale(() -> Float.valueOf(0.9f)).withFlashOffsetX(() -> Float.valueOf(0.1f)).withFlashOffsetY(() -> Float.valueOf(0.22f)).withInaccuracy(2.0f).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Submachine Gun", "Damage: 5", "Cartridge: 9x19mm", "Fire Rate: SEMI, AUTO", "Rate of Fire: 70/100", "Magazines:", "20rnd 9x19mm Magazine (Kedr)")).withCrafting(CraftingComplexity.MEDIUM, Ores.PlasticPlate, Ores.GunmetalIngot).withScreenShaking(RenderableState.SHOOTING, 2.0f, 0.1f, 3.0f).withCompatibleAttachment(AuxiliaryAttachments.KedrAction, true, model -> {}).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.KedrMag, model -> {}).withCompatibleAttachment(Attachments.Silencer9mm, model -> {
            GL11.glTranslatef((float)-0.25f, (float)-1.1f, (float)-4.8f);
            GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
        }).withCompatibleAttachment(AuxiliaryAttachments.Extra, true, model -> {
            if (model instanceof AKMiron1) {
                GL11.glTranslatef((float)0.125f, (float)-1.8f, (float)-0.5f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AKMiron2) {
                GL11.glTranslatef((float)-0.181f, (float)-1.1f, (float)-2.22f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.68f);
            } else if (model instanceof AK47iron) {
                GL11.glTranslatef((float)-0.185f, (float)-1.4f, (float)0.35f);
                GL11.glScaled((double)0.4f, (double)0.5, (double)0.1f);
            } else if (model instanceof M4Iron1) {
                GL11.glTranslatef((float)0.155f, (float)-1.74f, (float)1.0f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof M4Iron2) {
                GL11.glTranslatef((float)0.26f, (float)-1.55f, (float)-2.35f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof P90iron) {
                GL11.glTranslatef((float)0.26f, (float)-1.55f, (float)-2.35f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof G36CIron1) {
                GL11.glTranslatef((float)-0.22f, (float)-1.94f, (float)0.13f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof G36CIron2) {
                GL11.glTranslatef((float)-0.205f, (float)-1.9f, (float)-3.15f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof ScarIron1) {
                GL11.glTranslatef((float)0.165f, (float)-1.65f, (float)1.0f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof ScarIron2) {
                GL11.glTranslatef((float)0.25f, (float)-1.55f, (float)-2.0f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof FALIron) {
                GL11.glTranslatef((float)-0.112f, (float)-1.05f, (float)-2.22f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.07f, (double)0.5, (double)0.68f);
            } else if (model instanceof M14Iron) {
                GL11.glTranslatef((float)0.129f, (float)-1.63f, (float)-2.08f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof MP5Iron) {
                GL11.glTranslatef((float)0.215f, (float)-1.54f, (float)1.2f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withTextureNames("gun").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new Kedr()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.28f, (double)0.28f, (double)0.28f);
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)-1.2f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-1.8f, (float)-1.1f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.23f, (float)0.75f, (float)-0.85f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.23f, (float)0.75f, (float)-0.55f);
            GL11.glRotatef((float)-0.7f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.6f, (float)-0.85f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.6f, (float)-0.8f);
            GL11.glRotatef((float)-0.7f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.KedrAction.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.7f)).withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.KedrAction.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.7f)).withFirstPersonCustomPositioning(AuxiliaryAttachments.KedrAction.getRenderablePart(), renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.7f);
            }
        }).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-9.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.86f, (float)-0.825f);
        }, 400L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.84f, (float)-0.825f);
        }, 300L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.83f, (float)-0.825f);
        }, 100L, 140L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)1.3f, (float)-1.1f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)1.3f, (float)-1.1f);
        }, 130L, 50L)).withFirstPersonPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.8f, (float)-0.825f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.84f, (float)-0.825f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.86f, (float)-0.825f);
        }, 260L, 0L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.KedrAction.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.7f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.7f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.7f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.7f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.KedrAction.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.7f), 500L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.7f), 500L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.7f), 500L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.KedrMag, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.0f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.45f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.KedrMag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.45f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.0f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.4f, (float)-0.55f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)0.95f, (float)-0.825f);
        }, 350L, 600L)).withThirdPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 240L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 400L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 120L, 190L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 120L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 120L, 0L)).withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.KedrAction.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.449999f, (float)-0.6f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.449999f, (float)-0.6f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)1.249999f, (float)-0.5f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)13.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)1.249999f, (float)-0.45f);
        }, 190L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)27.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)1.249999f, (float)-0.5f);
        }, 190L, 0L)).withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.KedrAction.getRenderablePart(), new Transition<Object>(renderContext -> {}, 150L, 0L), new Transition<Object>(renderContext -> {}, 130L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.7f), 130L, 60L), new Transition<Object>(renderContext -> {}, 110L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.35f, (float)0.64f, (float)-1.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                GL11.glTranslatef((float)-0.07f, (float)0.13f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                GL11.glTranslatef((float)-0.015f, (float)0.17f, (float)0.7f);
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.35f, (float)0.64f, (float)-0.9f);
            GL11.glRotatef((float)-0.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                GL11.glTranslatef((float)-0.07f, (float)0.13f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                GL11.glTranslatef((float)-0.015f, (float)0.17f, (float)0.65f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)12.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)0.175f, (float)0.175f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.4f, (float)-0.55f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.45f, (float)0.2f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.45f, (float)0.2f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.45f, (float)0.2f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.4f, (float)0.075f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.6f, (float)0.1f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.475f, (float)0.15f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.55f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.25f, (float)-0.725f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)-0.725f, (float)0.075f);
        }, 250L, 0L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 280L, 0L)).withFirstPersonLeftHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.55f, (float)0.15f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.475f, (float)0.15f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.6f, (float)0.1f);
        }, 50L, 200L)).withFirstPersonRightHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.45f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.525f, (float)0.0f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 50L)).withThirdPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.025f, (float)0.0f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.025f, (float)0.0f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.075f, (float)-0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.075f, (float)-0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.025f, (float)0.0f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.025f, (float)0.0f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.025f, (float)0.075f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.1f, (float)0.125f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.025f, (float)0.075f);
        }, 300L, 0L)).withThirdPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.1f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-49.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.1f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.1f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.1f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.1f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)14.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.1f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.2f, (float)0.05f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)23.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-17.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.2f, (float)0.05f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)21.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.2f, (float)0.05f);
        }, 280L, 0L)).withFirstPersonLeftHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.3f, (float)0.25f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.3f, (float)0.25f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.3f, (float)0.25f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.3f, (float)0.25f);
        }, 130L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.3f, (float)0.25f);
        }, 110L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-190.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)140.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.225f, (float)-0.3f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-205.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)140.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.45f, (float)-0.225f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-190.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)140.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.225f, (float)-0.3f);
        }, 280L, 0L)).build()).withSpawnEntityDamage(5.0f).withSpawnEntityGravityVelocity(0.0118f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


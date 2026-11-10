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
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.items.guns.GunFactory;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.Supernova;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import java.util.Arrays;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class SupernovaFactory
implements GunFactory {
    @Override
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("supernova").withAmmoCapacity(7).withMaxBulletsPerReload(7).withFireRate(0.5f).withEjectRoundRequired().withIteratedLoad().withEjectSpentRoundSound("pump_action").withFireRate(0.2f).withRecoil(11.0f).withZoom(0.9f).withMaxShots(1).withPumpTimeout(700L).withShootSound("supernova").withSilencedShootSound("ShotgunSilenced").withReloadSound("drawweapon").withReloadIterationSound("load_shell").withInspectSound("inspection").withDrawSound("noaction_draw").withAllReloadIterationsCompletedSound("drawweapon").withReloadingTime(15L).withCrosshair("gun").withCrosshairRunning("Running").withShellCasingEjectEnabled(false).withCrosshairZoomed("Sight").withInaccuracy(15.0f).withPellets(15).withFlashIntensity(0.5f).withFlashScale(() -> Float.valueOf(0.6f)).withFlashOffsetX(() -> Float.valueOf(0.05f)).withFlashOffsetY(() -> Float.valueOf(0.12f)).withCrafting(CraftingComplexity.HIGH, Ores.PlasticPlate, Ores.GunmetalPlate).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Shotgun", "Damage per Pellet: 15", "Pellets per Shot: 15", "Cartridge: 12 Gauge Shotgun Shell", "Fire Rate: PUMP ACTION", "Rate of Fire: 30/100")).withScreenShaking(RenderableState.SHOOTING, 5.0f, 1.0f, 10.0f).withCompatibleAttachment(Attachments.M1014Stock, model -> GL11.glScaled((double)1.0, (double)1.0, (double)1.0)).withCompatibleAttachment(Attachments.M4BenelliStock, true, model -> GL11.glScaled((double)1.0, (double)1.0, (double)1.0)).withCompatibleAttachment(Attachments.ShotgunRail, model -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.156f, (float)-0.61f, (float)-1.1f);
                GL11.glScaled((double)0.55f, (double)0.4f, (double)0.4f);
            }
        }).withCompatibleAttachment(AuxiliaryAttachments.SupernovaAction, true, model -> GL11.glScaled((double)1.0, (double)1.0, (double)1.0)).withCompatibleAttachment(AuxiliaryAttachments.ShotgunShell, true, model -> {
            GL11.glTranslatef((float)-0.12f, (float)-0.08f, (float)-1.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
        }).withCompatibleAttachment(AuxiliaryAttachments.SupernovaPump, true, model -> {
            GL11.glTranslatef((float)0.017f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)1.15f, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(AuxiliaryAttachments.Extra, true, model -> {
            if (model instanceof M4Iron1) {
                GL11.glTranslatef((float)0.162f, (float)-1.75f, (float)1.0f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof M4Iron2) {
                GL11.glTranslatef((float)-0.055f, (float)-1.35f, (float)-4.05f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof P90iron) {
                GL11.glTranslatef((float)0.26f, (float)-1.55f, (float)-2.35f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AKMiron1) {
                GL11.glTranslatef((float)0.125f, (float)-1.8f, (float)-0.5f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AKMiron2) {
                GL11.glTranslatef((float)0.13f, (float)-1.55f, (float)-3.05f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AK47iron) {
                GL11.glTranslatef((float)0.092f, (float)-1.91f, (float)-0.9f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof G36CIron1) {
                GL11.glTranslatef((float)-0.111f, (float)-0.635f, (float)0.44f);
                GL11.glScaled((double)0.16f, (double)0.16f, (double)0.16f);
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
                GL11.glTranslatef((float)-0.118f, (float)-0.61f, (float)-4.3f);
                GL11.glScaled((double)0.3f, (double)0.3f, (double)1.0);
            } else if (model instanceof M14Iron) {
                GL11.glTranslatef((float)-0.145f, (float)-0.84f, (float)0.5f);
                GL11.glScaled((double)0.4f, (double)0.55f, (double)0.55f);
            } else if (model instanceof MP5Iron) {
                GL11.glTranslatef((float)0.215f, (float)-1.54f, (float)1.2f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef((float)-0.04f, (float)-0.53f, (float)-0.6f);
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.7f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef((float)-0.013f, (float)-0.57f, (float)-0.6f);
            GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef((float)-0.013f, (float)-0.57f, (float)-0.6f);
            GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef((float)-0.025f, (float)-0.58f, (float)-0.4f);
            GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.45f, (float)-0.85f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef((float)-0.125f, (float)-0.7f, (float)-0.3f);
            GL11.glScaled((double)0.28f, (double)0.28f, (double)0.28f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef((float)-0.125f, (float)-0.7f, (float)-0.3f);
            GL11.glScaled((double)0.28f, (double)0.28f, (double)0.28f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
            GL11.glTranslatef((float)-0.12f, (float)-0.7f, (float)-0.4f);
            GL11.glScaled((double)0.26f, (double)0.26f, (double)0.26f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.15f, (float)-0.03f, (float)-1.5f);
                GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            }
        }).withCompatibleBullet(Bullets.Shotgun12Guage, model -> {}).withTextureNames("gun2").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new Supernova()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glTranslatef((float)1.0f, (float)0.8f, (float)0.0f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-0.9f, (float)0.4f, (float)1.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningLoadIterationCompleted(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-44.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.349999f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.515f, (float)-1.299999f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.515f, (float)-0.899999f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.205f, (float)0.515f, (float)-1.199999f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.205f, (float)0.515f, (float)-0.699999f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withFirstPersonCustomPositioning(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.8f, (float)1.5f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonCustomPositioning(AuxiliaryAttachments.SupernovaAction.getRenderablePart(), renderContext -> {}).withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.SupernovaAction.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f)).withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.SupernovaAction.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f)).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.349999f);
        }, 250L, 0L)).withFirstPersonPositioningAllLoadIterationsCompleted(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.6f, (float)-1.45f);
        }, 290L, 0L)).withFirstPersonPositioningLoadIteration(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.349999f);
        }, 160L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-43.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.349999f);
        }, 140L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-44.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.359999f);
        }, 140L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-14.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-47.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.389999f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-12.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-43.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.379999f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-12.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.379999f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.349999f);
        }, 180L, 0L)).withFirstPersonPositioningEjectSpentRound(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)46.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.18f, (float)0.5f, (float)-1.0f);
        }, 110L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)46.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-4.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.18f, (float)0.5f, (float)-1.05f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)46.3f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-4.2f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.18f, (float)0.5f, (float)-1.02f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.18f, (float)0.45f, (float)-1.2f);
        }, 90L, 0L)).withFirstPersonPositioningEjectSpentRoundAimed(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)0.35f, (float)-0.925f);
        }, 160L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-9.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)28.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)0.35f, (float)-0.645f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)27.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)0.35f, (float)-0.655f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)39.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)26.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)0.4f, (float)-0.855f);
        }, 80L, 0L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)2.0f), 250L, 50L)).withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)2.0f), 250L, 50L)).withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.07f, (float)2.0f, (float)0.4f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.07f, (float)1.15f, (float)-0.15f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.1f, (float)0.45f, (float)0.3f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.01f, (float)0.0f, (float)0.0f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.01f, (float)0.0f, (float)0.0f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.01f, (float)0.0f, (float)0.0f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.01f, (float)-0.13f, (float)3.5f), 250L, 50L)).withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.SupernovaPump.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.SupernovaPump.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)-1.2f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)0.4f, (float)-1.2f);
        }, 350L, 600L)).withThirdPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L)).withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M500A2pump.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M4Rail.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withThirdPersonCustomPositioningReloading(Attachments.Laser2.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withThirdPersonCustomPositioningReloading(Attachments.Laser.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withThirdPersonCustomPositioningReloading(Attachments.StubbyGrip.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withThirdPersonCustomPositioningReloading(Attachments.AngledGrip.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withThirdPersonCustomPositioningReloading(Attachments.Grip2.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withThirdPersonCustomPositioningReloading(Attachments.VGrip.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)9.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.7f, (float)-1.5f);
        }, 160L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)9.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.5f, (float)-1.5f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.4f, (float)-1.6f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.18f, (float)0.5f, (float)-1.5f);
        }, 240L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.25f, (float)0.22f, (float)-1.1f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.13f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                GL11.glTranslatef((float)0.0f, (float)0.2f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                GL11.glTranslatef((float)0.0f, (float)0.2f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                GL11.glTranslatef((float)0.0f, (float)0.15f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                GL11.glTranslatef((float)0.0f, (float)0.15f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                GL11.glTranslatef((float)0.0f, (float)0.15f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                GL11.glTranslatef((float)0.0f, (float)0.07f, (float)0.0f);
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-0.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.25f, (float)0.22f, (float)-0.9f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.13f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                GL11.glTranslatef((float)0.0f, (float)0.2f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                GL11.glTranslatef((float)0.0f, (float)0.2f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                GL11.glTranslatef((float)0.0f, (float)0.15f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                GL11.glTranslatef((float)0.0f, (float)0.15f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                GL11.glTranslatef((float)0.0f, (float)0.15f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                GL11.glTranslatef((float)0.0f, (float)0.07f, (float)0.0f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.65f, (float)-1.5f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)-1.2f);
        }).withFirstPersonPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.1f, (float)0.1f, (float)-1.7f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.39f, (float)0.315f);
        }, renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.525f, (float)-0.825f, (float)0.3f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.22f, (float)-0.54f, (float)0.245f);
        }, renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.525f, (float)-0.825f, (float)0.3f);
        }).withFirstPersonHandPositioningLoadIterationCompleted(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-130.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-85.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)-1.549999f, (float)0.075f);
        }, renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.22f, (float)-0.54f, (float)0.245f);
        }, renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.525f, (float)-0.825f, (float)0.3f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)-0.675f, (float)0.175f);
        }, renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.6f, (float)-0.775f, (float)0.25f);
        }).withFirstPersonHandPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)-0.675f, (float)0.175f);
        }, renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-120.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.45f, (float)-0.925f, (float)0.075f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-1.199999f, (float)0.175f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 1000L)).withFirstPersonLeftHandPositioningLoadIteration(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-1.199999f, (float)0.175f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.975f, (float)0.2f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.825f, (float)0.125f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.775f, (float)0.175f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.775f, (float)0.175f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.775f, (float)0.175f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-1.199999f, (float)0.175f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningLoadIteration(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.47f, (float)0.19f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.3f, (float)-0.4f, (float)0.34f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.47f, (float)0.19f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.275f, (float)-0.425f, (float)0.275f);
            }
        }, 250L, 50L)).withFirstPersonRightHandPositioningAllLoadIterationsCompleted(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningEjectSpentRound(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.12f, (float)-0.64f, (float)0.365f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.12f, (float)-0.64f, (float)0.365f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.12f, (float)-0.64f, (float)0.365f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.39f, (float)0.315f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningEjectSpentRound(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningEjectSpentRoundAimed(new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.47f, (float)0.19f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.275f, (float)-0.425f, (float)0.275f);
            }
        }, 250L, 50L)).withFirstPersonRightHandPositioningEjectSpentRoundAimed(new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }, 250L, 50L)).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)-0.65f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.525f, (float)0.075f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.6f, (float)-0.775f, (float)0.25f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.6f, (float)-0.775f, (float)0.25f);
        }, 250L, 50L)).withThirdPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.0f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.075f, (float)0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.0f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.075f, (float)0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.0f, (float)0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)0.05f, (float)0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)0.05f, (float)0.075f);
        }, 50L, 200L)).withThirdPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.125f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.125f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.225f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.075f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.075f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.075f, (float)0.0f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.4f, (float)0.275f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.4f, (float)0.275f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.4f, (float)0.275f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.4f, (float)0.275f);
        }, 200L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.6f, (float)-0.775f, (float)0.25f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.6f, (float)-0.775f, (float)0.25f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.6f, (float)-0.775f, (float)0.25f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.6f, (float)-0.775f, (float)0.25f);
        }, 250L, 100L)).build()).withSpawnEntityDamage(15.0f).withSpawnEntityGravityVelocity(0.8f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


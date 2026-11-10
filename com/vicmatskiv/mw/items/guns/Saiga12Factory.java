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
import com.vicmatskiv.mw.models.OKP7;
import com.vicmatskiv.mw.models.OKP7reticle;
import com.vicmatskiv.mw.models.PSO12;
import com.vicmatskiv.mw.models.PSO1reticle;
import com.vicmatskiv.mw.models.Saiga12;
import com.vicmatskiv.mw.models.Shotgun12Gauge;
import com.vicmatskiv.mw.models.makarovfrontsight;
import com.vicmatskiv.mw.models.makarovrearsight;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import java.util.Arrays;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class Saiga12Factory {
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("saiga12").withFireRate(0.4f).withRecoil(5.0f).withZoom(0.9f).withMaxShots(1).withShootSound("saiga12").withSilencedShootSound("ak15_silenced").withReloadSound("ak15_reload").withInspectSound("inspection").withDrawSound("ak_draw").withReloadingTime(45L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withInaccuracy(10.0f).withPellets(10).withFlashIntensity(0.4f).withFlashScale(() -> Float.valueOf(1.0f)).withFlashOffsetX(() -> Float.valueOf(0.05f)).withFlashOffsetY(() -> Float.valueOf(0.15f)).withShellCasingModel(new Shotgun12Gauge()).withShellCasingModelTexture("shotgun12gauge").withShellCasingForwardOffset(0.01f).withShellCasingVerticalOffset(-0.03f).withCrafting(CraftingComplexity.HIGH, Ores.PlasticPlate, Ores.GunmetalPlate).withScreenShaking(RenderableState.SHOOTING, 5.0f, 1.0f, 10.0f).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Carbine/Shotgun", "Damage per Pellet: 6", "Pellets per Shot: 10", "Cartridge: 12 Gauge Shotgun Shell", "Fire Rate: SEMI", "Rate of Fire: 40/100", "Magazines:", "5rnd 12G Magazine")).withCompatibleAttachment(AuxiliaryAttachments.Saiga12action, true, model -> {}).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.SaigaMag, model -> {}).withCompatibleAttachment(Attachments.Silencer762x39, model -> {
            GL11.glTranslatef((float)-0.2f, (float)-1.06f, (float)-7.55f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.Bipod, model -> {
            GL11.glTranslatef((float)-0.185f, (float)-0.3f, (float)-5.7f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(AuxiliaryAttachments.Saiga12sights, true, model -> {
            if (model instanceof makarovrearsight) {
                GL11.glTranslatef((float)-0.1393f, (float)-1.3f, (float)-2.85f);
                GL11.glScaled((double)0.2f, (double)0.22f, (double)0.2f);
            } else if (model instanceof makarovfrontsight) {
                GL11.glTranslatef((float)-0.124f, (float)-1.29f, (float)-4.9f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.05f);
            }
        }).withCompatibleAttachment(Attachments.PSO1, (player, stack) -> {
            GL11.glTranslatef((float)0.14f, (float)-0.9f, (float)-1.1f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }, model -> {
            if (model instanceof PSO1reticle) {
                GL11.glTranslatef((float)-0.212f, (float)-0.486f, (float)1.27f);
                GL11.glScaled((double)0.017f, (double)0.017f, (double)0.017f);
            } else if (model instanceof PSO12) {
                GL11.glTranslatef((float)-0.27f, (float)-0.6f, (float)1.21f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            }
        }).withCompatibleAttachment(Attachments.OKP7, model -> {
            if (model instanceof OKP7) {
                GL11.glTranslatef((float)-0.18f, (float)-0.65f, (float)-1.15f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof OKP7reticle) {
                GL11.glTranslatef((float)-0.07f, (float)-1.45f, (float)-1.5f);
                GL11.glScaled((double)0.07f, (double)0.07f, (double)0.07f);
            }
        }).withTextureNames("gun").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new Saiga12()).withEntityPositioning(itemStack -> {
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
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.18f, (float)0.85f, (float)-0.17f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.18f, (float)0.85f, (float)0.05f);
            GL11.glRotatef((float)-1.5f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.26f, (float)0.6f, (float)-0.2f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.28f, (float)0.6f, (float)-0.1f);
            GL11.glRotatef((float)-0.7f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.Saiga12action.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f)).withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.Saiga12action.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f)).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.28f, (float)0.9f, (float)-0.07f);
        }, 400L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.28f, (float)0.9f, (float)-0.07f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.28f, (float)0.9f, (float)-0.07f);
        }, 100L, 150L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.28f, (float)0.85f, (float)-0.07f);
        }, 350L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.28f, (float)0.85f, (float)0.1f);
        }, 160L, 100L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.28f, (float)0.85f, (float)-0.17f);
        }, 160L, 0L)).withFirstPersonPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)9.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.28f, (float)0.9f, (float)-0.07f);
        }, 240L, 100L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)41.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.28f, (float)0.9f, (float)-0.07f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.28f, (float)0.9f, (float)-0.07f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.28f, (float)0.9f, (float)-0.07f);
        }, 180L, 0L)).withFirstPersonCustomPositioningReloading(Attachments.AK15ironsight.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AKaction.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AKaction.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.SaigaMag, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.0f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.45f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.SaigaMag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.45f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.0f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.0f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.6f, (float)0.8f, (float)-0.3f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)1.0f, (float)-0.2f);
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
            GL11.glTranslatef((float)-2.2f, (float)-2.7f, (float)3.6f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 300L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)3.6f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 120L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.7f, (float)3.6f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 120L, 0L)).withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.Saiga12action.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.449999f, (float)-0.2f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.449999f, (float)-0.2f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)1.249999f, (float)-0.0f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)13.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)1.249999f, (float)0.15f);
        }, 190L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)27.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)1.249999f, (float)-0.0f);
        }, 190L, 0L)).withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.Saiga12action.getRenderablePart(), new Transition<Object>(renderContext -> {}, 150L, 0L), new Transition<Object>(renderContext -> {}, 130L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 130L, 60L), new Transition<Object>(renderContext -> {}, 110L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.35f, (float)0.8f, (float)-0.4f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                GL11.glTranslatef((float)-0.013f, (float)0.15f, (float)0.2f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                GL11.glTranslatef((float)-0.05f, (float)0.11f, (float)0.0f);
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.35f, (float)0.8f, (float)-0.3f);
            GL11.glRotatef((float)-0.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                GL11.glTranslatef((float)-0.013f, (float)0.15f, (float)0.15f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                GL11.glTranslatef((float)-0.05f, (float)0.11f, (float)0.0f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)12.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)0.025f, (float)0.775f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.0f, (float)0.675f, (float)-0.5f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)0.0f, (float)0.225f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.1f, (float)0.25f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-97.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.25f, (float)0.25f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.575f, (float)-0.075f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.55f, (float)0.35f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.375f, (float)0.225f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.325f, (float)0.1f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.35f, (float)0.275f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.525f, (float)0.3f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.35f, (float)0.275f);
        }, 300L, 0L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
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
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 280L, 0L)).withFirstPersonLeftHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.325f, (float)0.1f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.375f, (float)0.225f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.55f, (float)0.35f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.55f, (float)0.35f);
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
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.35f, (float)-0.13f, (float)0.25f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.35f, (float)-0.13f, (float)0.25f);
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
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.025f, (float)0.0f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.025f, (float)0.0f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.025f, (float)0.0f);
        }, 280L, 0L)).withThirdPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
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
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)0.05f, (float)0.0f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.075f, (float)0.025f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)0.05f, (float)0.0f);
        }, 300L, 0L)).withFirstPersonLeftHandPositioningDrawing(new Transition<Object>(renderContext -> {
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
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.075f, (float)0.2f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.02f, (float)-0.275f, (float)0.11f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.075f, (float)0.2f);
        }, 280L, 0L)).build()).withSpawnEntityDamage(6.0f).withSpawnEntityGravityVelocity(0.0118f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


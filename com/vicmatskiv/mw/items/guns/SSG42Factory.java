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
import com.vicmatskiv.mw.models.SSG42;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import java.util.Arrays;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class SSG42Factory
implements GunFactory {
    @Override
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("ssg42").withAmmoCapacity(2).withMaxBulletsPerReload(4).withIteratedLoad().withFireRate(0.3f).withRecoil(9.0f).withZoom(0.9f).withMaxShots(1, Integer.MAX_VALUE).withPumpTimeout(500L).withShootSound("ssg42").withSilencedShootSound("ShotgunSilenced").withReloadSound("mp43ereload").withReloadIterationSound("load_shell").withDrawSound("noaction_draw").withAllReloadIterationsCompletedSound("mp43ereloadfin").withReloadingTime(15L).withCrosshair("gun").withCrosshairRunning("Running").withShellCasingEjectEnabled(false).withCrosshairZoomed("Sight").withInaccuracy(30.0f).withPellets(20).withFlashIntensity(0.8f).withFlashScale(() -> Float.valueOf(1.3f)).withFlashOffsetX(() -> Float.valueOf(0.11f)).withFlashOffsetY(() -> Float.valueOf(0.15f)).withCrafting(CraftingComplexity.HIGH, Ores.PlasticPlate, Ores.GunmetalPlate).withCreativeTab(ModernWarfareMod.CombatServerTab).withInformationProvider(stack -> Arrays.asList("Type: Super Shotgun (MkII Demon Slayer)", "Damage per Pellet: 18", "Pellets per Shot: 20", "Cartridge: 12 Gauge Shotgun Shell", "Fire Rate: SEMI", "Rate of Fire: 30/100")).withScreenShaking(RenderableState.SHOOTING, 7.0f, 1.0f, 13.0f).withCompatibleAttachment(AuxiliaryAttachments.SSG42Barrels, true, model -> GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f)).withBleedingCoefficient(2.0f).withCompatibleBullet(Bullets.Shotgun12Guage, model -> {}).withTextureNames("ssg42").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new SSG42()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glTranslatef((float)1.0f, (float)0.8f, (float)0.0f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-1.3f, (float)-0.1f, (float)1.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningLoadIterationCompleted(renderContext -> {
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.35f, (float)-1.125f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.275f, (float)-1.125f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.275f, (float)-0.9f);
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.25f, (float)0.23f, (float)-0.7f);
            GL11.glRotatef((float)-2.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                // empty if block
            }
        }).withFirstPersonCustomPositioning(AuxiliaryAttachments.SSG42Barrels.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.SSG42Barrels.getRenderablePart(), renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.SSG42Barrels.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 320L, 50L)).withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.SSG42Barrels.getRenderablePart(), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {}, 250L, 50L), new Transition<Object>(renderContext -> {}, 250L, 50L)).withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.SSG42Barrels.getRenderablePart(), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 250L, 50L)).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.275f, (float)-1.125f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.4f, (float)-1.125f);
            GL11.glRotatef((float)4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.35f, (float)-1.125f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 220L, 0L)).withFirstPersonPositioningAllLoadIterationsCompleted(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)12.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.275f, (float)-1.125f);
        }, 160L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.4f, (float)-1.125f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.4f, (float)-1.125f);
        }, 170L, 0L)).withFirstPersonPositioningLoadIteration(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.35f, (float)-1.125f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 140L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.35f, (float)-1.125f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 160L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)32.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.4f, (float)-1.125f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 190L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)31.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)6.5f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.43f, (float)-1.125f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 140L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)32.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.37f, (float)-1.125f);
            GL11.glRotatef((float)4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 160L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.35f, (float)-1.125f);
            GL11.glRotatef((float)3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 190L, 0L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.475f, (float)0.15f, (float)-0.95f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.375f, (float)0.7f, (float)-0.825f);
        }, 350L, 600L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)9.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.2f, (float)0.7f, (float)-1.4f);
        }, 160L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)9.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.2f, (float)0.5f, (float)-1.4f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.2f, (float)0.4f, (float)-1.4f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.2f, (float)0.45f, (float)-1.4f);
        }, 240L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.25f, (float)0.23f, (float)-1.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                // empty if block
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)0.6f, (float)-0.6f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)0.1f, (float)-1.324999f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.575f, (float)0.275f);
        }, renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }).withFirstPersonHandPositioningRunning(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }).withFirstPersonHandPositioningLoadIterationCompleted(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-1.025f, (float)0.675f);
        }, renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.575f, (float)0.275f);
        }, renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)0.175f, (float)0.45f);
        }, renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.925f, (float)0.03f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.6f, (float)0.25f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.5f, (float)0.35f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.575f, (float)0.4f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningLoadIteration(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-1.025f, (float)0.675f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.225f, (float)-1.025f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-120.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)-0.825f, (float)0.1f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)-0.825f, (float)0.175f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.225f, (float)-1.025f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-1.025f, (float)0.675f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningLoadIteration(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-1.025f, (float)0.675f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-1.025f, (float)0.675f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-1.025f, (float)0.675f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningAllLoadIterationsCompleted(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 200L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.65f, (float)-0.95f, (float)0.25f);
        }, 250L, 100L)).build()).withSpawnEntityDamage(18.0f).withSpawnEntityGravityVelocity(0.8f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


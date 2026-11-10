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
import com.vicmatskiv.mw.items.guns.GunFactory;
import com.vicmatskiv.mw.models.M1911frontsight;
import com.vicmatskiv.mw.models.M1911rearsight;
import com.vicmatskiv.mw.models.MP443;
import com.vicmatskiv.mw.models.MP443Slide;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import java.util.Arrays;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class MP443Factory
implements GunFactory {
    @Override
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("mp_443").withFireRate(0.5f).withRecoil(2.0f).withZoom(0.9f).withMaxShots(1).withShootSound("mp443").withSilencedShootSound("m9a1_silenced").withReloadSound("m9a1_reload").withUnloadSound("pistol_unload").withInspectSound("inspection").withDrawSound("handgun_draw").withReloadingTime(50L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withFlashIntensity(0.4f).withFlashScale(() -> Float.valueOf(1.0f)).withFlashOffsetX(() -> Float.valueOf(0.17f)).withFlashOffsetY(() -> Float.valueOf(0.18f)).withInaccuracy(3.0f).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Military Service Pistol", "Damage: 5.5", "Cartridge: 9x19mm", "Fire Rate: SEMI", "Rate of Fire: 50/100", "Magazines:", "18rnd 9x19mm 443 Magazine")).withScreenShaking(RenderableState.SHOOTING, 2.5f, 0.1f, 0.5f).withCrafting(CraftingComplexity.LOW, Ores.PlasticPlate, Ores.GunmetalPlate).withCompatibleAttachment(AuxiliaryAttachments.MP443Slide, true, model -> {
            if (model instanceof MP443Slide) {
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof M1911rearsight) {
                GL11.glTranslatef((float)0.151f, (float)-1.97f, (float)0.9f);
                GL11.glScaled((double)0.4f, (double)0.35f, (double)0.35f);
            } else if (model instanceof M1911frontsight) {
                GL11.glTranslatef((float)0.155f, (float)-1.97f, (float)-1.5f);
                GL11.glScaled((double)0.32f, (double)0.32f, (double)0.32f);
            }
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.MP443Mag, model -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.12f)).withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef((float)0.4f, (float)-1.0f, (float)-2.2f);
            GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)-4.0f);
        }).withCompatibleAttachment(Attachments.Silencer9mm, model -> {
            GL11.glTranslatef((float)0.08f, (float)-1.97f, (float)-4.15f);
            GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
        }).withTextureNames("mp443").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new MP443()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glTranslatef((float)0.0f, (float)0.8f, (float)0.0f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glTranslatef((float)-2.7f, (float)-0.4f, (float)2.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)1.7f, (float)-3.7f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)1.7f, (float)-3.5f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)11.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.8f, (float)1.4f, (float)-3.4f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)11.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.8f, (float)1.4f, (float)-3.2f);
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MP443Slide.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f)).withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.MP443Slide.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f)).withFirstPersonCustomPositioning(AuxiliaryAttachments.MP443Slide.getRenderablePart(), renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.05f);
            }
        }).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-13.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.35f, (float)1.95f, (float)-3.4f);
        }, 300L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-17.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.3f, (float)1.95f, (float)-3.4f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.5f, (float)1.95f, (float)-3.4f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.3f, (float)1.95f, (float)-3.4f);
        }, 270L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.2f, (float)1.95f, (float)-3.4f);
        }, 70L, 0L)).withFirstPersonPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)36.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.23f, (float)1.95f, (float)-3.4f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-17.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.23f, (float)1.95f, (float)-3.4f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.1f, (float)1.95f, (float)-3.4f);
        }, 230L, 0L)).withFirstPersonCustomPositioningReloading(Magazines.MP443Mag, new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)1.7f, (float)0.4f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.MP443Mag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)1.0f, (float)0.4f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)1.7f, (float)0.4f), 250L, 1000L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MP443Slide.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.05f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.05f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.05f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.05f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MP443Slide.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.05f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.05f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.05f), 250L, 1000L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-2.0f, (float)1.5f, (float)-2.0f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)2.5f, (float)-2.0f);
        }, 350L, 600L)).withThirdPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glTranslatef((float)-3.6f, (float)-0.4f, (float)3.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glTranslatef((float)-3.6f, (float)-0.4f, (float)3.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glTranslatef((float)-3.6f, (float)-0.4f, (float)3.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 130L, 10L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glTranslatef((float)-3.6f, (float)-0.4f, (float)3.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glTranslatef((float)-3.6f, (float)-0.4f, (float)3.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glTranslatef((float)-3.6f, (float)-0.4f, (float)3.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glTranslatef((float)-3.6f, (float)-0.4f, (float)3.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 270L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glTranslatef((float)-3.6f, (float)-0.4f, (float)3.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 70L, 50L)).withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.MP443Slide.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.8f, (float)2.7f, (float)-3.4f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.8f, (float)2.4f, (float)-3.4f);
        }, 90L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)32.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.8f, (float)2.05f, (float)-3.4f);
        }, 180L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)33.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-9.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.8f, (float)2.15f, (float)-3.35f);
        }, 130L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.8f, (float)2.08f, (float)-3.4f);
        }, 120L, 0L)).withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.MP443Slide.getRenderablePart(), new Transition<Object>(renderContext -> {}, 150L, 0L), new Transition<Object>(renderContext -> {}, 130L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 130L, 60L), new Transition<Object>(renderContext -> {}, 110L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)3.0, (double)3.0, (double)3.0);
            GL11.glTranslatef((float)0.03f, (float)1.43f, (float)-3.5f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                // empty if block
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)3.0, (double)3.0, (double)3.0);
            GL11.glTranslatef((float)0.03f, (float)1.35f, (float)-3.3f);
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                // empty if block
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.7f, (float)-3.7f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScaled((double)3.0, (double)3.0, (double)3.0);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-2.0f, (float)1.4f, (float)-2.5f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.25f, (float)-0.81f, (float)-0.075f);
        }, renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.25f, (float)-0.81f, (float)-0.075f);
        }, renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }).withFirstPersonHandPositioningRunning(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.25f, (float)-0.81f, (float)-0.075f);
        }, renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.125f, (float)0.7f);
        }, renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-1.0f, (float)0.25f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.85f, (float)0.125f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.85f, (float)0.125f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.8f, (float)0.075f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.8f, (float)0.075f);
        }, 250L, 0L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 250L, 0L)).withFirstPersonLeftHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.85f, (float)0.125f);
        }, 330L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-1.0f, (float)0.25f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-1.0f, (float)0.25f);
        }, 250L, 0L)).withFirstPersonRightHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 250L, 0L)).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.25f, (float)-0.81f, (float)-0.075f);
        }, renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.25f, (float)-0.81f, (float)-0.075f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.25f, (float)-0.81f, (float)-0.075f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 250L, 50L)).withThirdPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.1f, (float)0.1f);
        }, 330L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.1f, (float)0.125f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.05f, (float)0.025f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.05f, (float)0.025f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.1f, (float)0.125f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.1f, (float)0.1f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.1f, (float)0.1f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-48.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.1f, (float)0.1f);
        }, 250L, 0L)).withThirdPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-67.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-11.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-67.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-66.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-9.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-62.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-62.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-57.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 0L)).withFirstPersonLeftHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.8f, (float)0.075f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.8f, (float)0.075f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-160.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)-0.725f, (float)0.05f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-160.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)-0.7f, (float)-0.1f);
        }, 130L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-160.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)-0.725f, (float)0.05f);
        }, 110L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.5f, (float)5.5f, (float)5.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.575f, (float)0.05f);
        }, 280L, 0L)).build()).withSpawnEntityDamage(5.5f).withSpawnEntityGravityVelocity(0.02f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


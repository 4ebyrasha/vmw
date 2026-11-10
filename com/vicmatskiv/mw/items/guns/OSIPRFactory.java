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
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.OSIPR;
import com.vicmatskiv.mw.models.OSIPRscopereticle;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import java.util.Arrays;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class OSIPRFactory {
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("osipr").withAmmoCapacity(32).withFireRate(0.7f).withRecoil(1.5f).withZoom(0.9f).withMaxShots(1, Integer.MAX_VALUE).withShootSound("osipr").withSilencedShootSound("m4a1_silenced").withReloadSound("osipr_reload").withInspectSound("inspection").withDrawSound("noaction_draw").withReloadingTime(45L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withFlashIntensity(0.4f).withFlashScale(() -> Float.valueOf(0.6f)).withFlashOffsetX(() -> Float.valueOf(0.07f)).withFlashOffsetY(() -> Float.valueOf(0.16f)).withFlashTexture("pulserifle_flashes").withShellCasingEjectEnabled(false).withCreativeTab(ModernWarfareMod.CombatServerTab).withInformationProvider(stack -> Arrays.asList("Type: Assault Rifle", "Damage: 8", "Cartridge: 7.62x51mm (WIP, will change)", "Fire Rate: SEMI, AUTO", "Rate of Fire: 75/100")).withCrafting(CraftingComplexity.MEDIUM, Ores.PlasticPlate, Ores.GunmetalPlate).withScreenShaking(RenderableState.SHOOTING, 2.0f, 4.0f, 3.0f).withCompatibleBullet(Bullets.Bullet762x51, model -> {}).withCompatibleAttachment(AuxiliaryAttachments.OSIPRAutoSpanker, true, model -> {}).withCompatibleAttachment(AuxiliaryAttachments.OSIPRCell1, true, model -> {}).withCompatibleAttachment(AuxiliaryAttachments.OSIPRCell2, true, model -> {}).withCompatibleAttachment(AuxiliaryAttachments.OSIPRCellClaws, true, model -> {}).withCompatibleAttachment(AuxiliaryAttachments.OSIPRCellFinger, true, model -> {}).withCompatibleAttachment(AuxiliaryAttachments.OSIPRHeatEscaper, true, model -> {}).withCompatibleAttachment(Attachments.OSIPRMount, model -> {}).withCompatibleAttachment(Attachments.OSIPRMiniScope, true, (player, stack) -> {
            GL11.glTranslatef((float)0.07f, (float)-0.43f, (float)0.05f);
            GL11.glScaled((double)0.2f, (double)0.2f, (double)0.2f);
        }, model -> {
            if (model instanceof FALIron) {
                GL11.glTranslatef((float)-0.35f, (float)0.89f, (float)0.25f);
                GL11.glScaled((double)0.05f, (double)0.6f, (double)0.2f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
        }).withCompatibleAttachment(Attachments.OSIPRSight, (player, stack) -> GL11.glTranslatef((float)0.0f, (float)0.05f, (float)0.0f), model -> {
            if (model instanceof OSIPRscopereticle) {
                GL11.glTranslatef((float)-0.0f, (float)-0.465f, (float)-0.3f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.OSIPRLaser, (p, s) -> {}).withTextureNames("osipr").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new OSIPR()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.28f, (double)0.28f, (double)0.28f);
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)-1.2f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-1.3f, (float)-1.4f, (float)1.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.05f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)0.3f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.325f, (float)-0.3f, (float)-0.15f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.325f, (float)-0.3f, (float)0.15f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRAutoSpanker.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRCell1.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRCell2.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRCellClaws.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRCellFinger.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRHeatEscaper.getRenderablePart(), renderContext -> {}).withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.OSIPRAutoSpanker.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f)).withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.OSIPRAutoSpanker.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f)).withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.OSIPRHeatEscaper.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.1f, (float)0.0f, (float)0.0f)).withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.OSIPRHeatEscaper.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.1f, (float)0.0f, (float)0.0f)).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.05f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.05f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.05f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.05f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.05f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.05f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.05f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.05f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.05f);
        }, 1L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.05f);
        }, 200L, 0L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRAutoSpanker.getRenderablePart(), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.45f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.2f), 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.2f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.45f), 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRCell1.getRenderablePart(), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.13f, (float)-0.13f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.34f, (float)-0.14f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.34f, (float)-0.14f, (float)-0.3f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.34f, (float)-0.14f, (float)-0.44f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.34f, (float)-0.14f, (float)-0.44f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.1f, (float)0.23f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRCell2.getRenderablePart(), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.15f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.45f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.45f), 200L, 100L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.38f, (float)0.36f, (float)0.45f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.38f, (float)0.36f, (float)0.45f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.38f, (float)0.36f, (float)0.45f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.38f, (float)0.36f, (float)0.45f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRCellClaws.getRenderablePart(), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)2.2f, (float)0.0f, (float)-0.8f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)2.2f, (float)0.0f, (float)-0.8f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)2.2f, (float)0.0f, (float)-0.8f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)2.2f, (float)0.0f, (float)-0.8f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)2.2f, (float)0.0f, (float)-0.8f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)2.2f, (float)0.0f, (float)-0.8f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)2.2f, (float)0.0f, (float)-0.8f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRCellFinger.getRenderablePart(), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.07f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.1f, (float)0.25f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.1f, (float)0.25f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.1f, (float)0.25f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.1f, (float)0.25f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRHeatEscaper.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.1f, (float)0.0f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.1f, (float)0.0f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.1f, (float)0.0f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.1f, (float)0.0f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.1f, (float)0.0f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.1f, (float)0.0f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.1f, (float)0.0f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.1f, (float)0.0f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.1f, (float)0.0f, (float)0.0f), 200L, 100L), new Transition<Object>(renderContext -> {}, 200L, 100L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.3f, (float)0.0f, (float)-0.7f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)0.4f, (float)-0.35f);
        }, 350L, 600L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)0.1f, (float)0.25f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)0.05f, (float)0.25f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.1f, (float)-0.0f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.15f);
        }, 190L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.2f, (float)-0.0f);
        }, 190L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glTranslatef((float)0.14f, (float)-0.07f, (float)-0.2f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OSIPRSight)) {
                GL11.glTranslatef((float)0.0f, (float)0.15f, (float)0.0f);
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glTranslatef((float)0.14f, (float)-0.07f, (float)-0.15f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OSIPRSight)) {
                GL11.glTranslatef((float)0.0f, (float)0.15f, (float)0.1f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)0.2f, (float)-0.2f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.3f, (float)0.0f, (float)-0.7f);
        }).withFirstPersonPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.3f, (float)0.0f, (float)-0.7f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)0.075f, (float)0.525f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }).withFirstPersonHandPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)0.075f, (float)0.525f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 250L, 0L)).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)0.075f, (float)0.525f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)0.075f, (float)0.525f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.825f, (float)0.275f);
        }, 300L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.525f);
        }, 280L, 0L)).build()).withSpawnEntityDamage(8.0f).withSpawnEntityGravityVelocity(0.0118f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


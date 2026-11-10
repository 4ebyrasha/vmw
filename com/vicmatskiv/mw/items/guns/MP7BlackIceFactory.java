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
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.MP7BlackIce;
import com.vicmatskiv.mw.models.MP7FrontSights;
import com.vicmatskiv.mw.models.MP7Rail;
import com.vicmatskiv.mw.models.MP7RearSights;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import java.util.Arrays;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class MP7BlackIceFactory {
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("mp7_black_ice").withFireRate(0.9f).withRecoil(1.0f).withZoom(0.9f).withMaxShots(Integer.MAX_VALUE, 1).withShootSound("mp7a1").withSilencedShootSound("mp5_silenced").withReloadSound("mp7a1_reload").withUnloadSound("mp7a1_unload").withInspectSound("inspection").withDrawSound("mp7a1_draw").withReloadingTime(45L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withFlashIntensity(0.5f).withFlashScale(() -> Float.valueOf(0.6f)).withFlashOffsetX(() -> Float.valueOf(0.16f)).withFlashOffsetY(() -> Float.valueOf(0.2f)).withInaccuracy(2.0f).withCreativeTab(ModernWarfareMod.CombatServerTab).withInformationProvider(stack -> Arrays.asList("Type: Sub Machine Gun/ Personal Defense Weapon/ Machine Pistol", "Damage: 4", "Cartridge: 4.6x30mm", "Fire Rate: SEMI, AUTO", "Rate of Fire: 80/100", "Magazines:", "40rnd 4.6x30mm HK Magazine")).withScreenShaking(RenderableState.SHOOTING, 2.5f, 0.1f, 4.0f).withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT).withUnremovableAttachmentCategories(AttachmentCategory.RAILING).withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER).withUnremovableAttachmentCategories(AttachmentCategory.SCOPE).withCompatibleAttachment(Attachments.LaserPlaceholder, true, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.19f, (float)-0.4f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.MP7Mag, model -> GL11.glTranslatef((float)-2.75f, (float)1.2f, (float)0.0f)).withCompatibleAttachment(AuxiliaryAttachments.MP7Rail, true, model -> {
            if (model instanceof MP7Rail) {
                GL11.glTranslatef((float)-0.165f, (float)-1.02f, (float)-1.81f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.9f);
            } else if (model instanceof AKRail2) {
                GL11.glTranslatef((float)-0.5f, (float)0.11f, (float)-2.3f);
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.4f, (double)1.0, (double)0.75);
            } else if (model instanceof AKRail3) {
                GL11.glTranslatef((float)0.48f, (float)-0.28f, (float)-2.3f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.5, (double)1.2f, (double)0.75);
            }
        }).withCompatibleAttachment(AuxiliaryAttachments.MP7IronSights, true, model -> {
            if (model instanceof MP7RearSights) {
                GL11.glTranslatef((float)0.0f, (float)-1.25f, (float)2.2f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof MP7FrontSights) {
                GL11.glTranslatef((float)0.0f, (float)-1.25f, (float)-0.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withCompatibleAttachment(Attachments.Laser, model -> {
            GL11.glTranslatef((float)0.35f, (float)-0.28f, (float)-2.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withCompatibleAttachment(Attachments.Laser2, model -> {
            GL11.glTranslatef((float)0.35f, (float)-0.28f, (float)-2.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withCompatibleAttachment(Attachments.SilencerMP7, model -> {
            GL11.glTranslatef((float)-0.12f, (float)-0.35f, (float)-4.7f);
            GL11.glScaled((double)1.5, (double)1.5, (double)1.3f);
        }).withTextureNames("mp7blackice").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new MP7BlackIce()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.28f, (double)0.28f, (double)0.28f);
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)-1.2f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            GL11.glTranslatef((float)-2.0f, (float)-0.8f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glTranslatef((float)-0.6f, (float)0.6f, (float)-4.399999f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glTranslatef((float)-0.6f, (float)0.6f, (float)-3.599999f);
            GL11.glRotatef((float)1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.25f, (float)0.7f, (float)-0.7f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.25f, (float)0.7f, (float)-0.6f);
            GL11.glRotatef((float)-0.7f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MP5A5action.getRenderablePart(), renderContext -> {}).withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.MP5A5action.getRenderablePart(), renderContext -> {}).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.8f, (float)0.0f, (float)-3.549999f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-26.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.8f, (float)0.1f, (float)-3.249999f);
        }, 150L, 80L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-18.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.8f, (float)-0.2f, (float)-3.249999f);
        }, 80L, 130L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.8f, (float)-0.1f, (float)-3.249999f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)-47.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)26.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.8f, (float)0.0f, (float)-3.449999f);
        }, 70L, 0L)).withFirstPersonPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.7f, (float)0.3f, (float)-4.249998f);
        }, 180L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)-33.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.7f, (float)1.3f, (float)-4.149998f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.7f, (float)1.0f, (float)-4.249998f);
        }, 130L, 0L)).withFirstPersonCustomPositioningReloading(Magazines.MP7Mag, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)4.0f, (float)0.9f);
            GL11.glRotatef((float)30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)1.3f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.MP7Mag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)6.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)6.0f, (float)0.0f), 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.HK50Drum, new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)2.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)1.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.HK50Drum, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.45f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-2.0f, (float)0.375f, (float)-3.7f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)1.6f, (float)-3.0f);
        }, 350L, 600L)).withThirdPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            GL11.glTranslatef((float)-3.5f, (float)0.0f, (float)3.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            GL11.glTranslatef((float)-3.5f, (float)0.0f, (float)3.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            GL11.glTranslatef((float)-3.5f, (float)0.0f, (float)3.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 240L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            GL11.glTranslatef((float)-3.5f, (float)0.0f, (float)3.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 400L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            GL11.glTranslatef((float)-3.5f, (float)0.0f, (float)3.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            GL11.glTranslatef((float)-3.5f, (float)0.0f, (float)3.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 120L, 190L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            GL11.glTranslatef((float)-3.5f, (float)0.0f, (float)3.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            GL11.glTranslatef((float)-3.5f, (float)0.0f, (float)3.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 120L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            GL11.glTranslatef((float)-3.5f, (float)0.0f, (float)3.5f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 120L, 0L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.9f, (float)-3.774999f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.7f, (float)-3.774999f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.7f, (float)-3.774999f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)-4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.7f, (float)-3.474999f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.5f, (float)1.5f, (float)1.5f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.6f, (float)-3.674999f);
        }, 90L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.23f, (float)0.67f, (float)-4.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)0.9f);
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.23f, (float)0.67f, (float)-3.5f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)0.9f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.3f, (float)-3.850005f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-2.0f, (float)0.375f, (float)-3.7f);
        }).withFirstPersonPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-2.7f, (float)-0.275f, (float)-3.0f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.625f, (float)0.175f);
        }, renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.725f, (float)0.325f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.625f, (float)0.175f);
        }, renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.725f, (float)0.325f);
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.625f, (float)0.175f);
        }, renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.725f, (float)0.325f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.075f, (float)0.875f);
        }, renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.55f, (float)-0.775f, (float)0.325f);
        }).withFirstPersonHandPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)100.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.975f, (float)0.025f);
        }, renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.95f, (float)0.15f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.875f, (float)0.275f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.775f, (float)0.325f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)-0.925f, (float)0.2f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)-0.925f, (float)0.2f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)-0.925f, (float)0.2f);
        }, 250L, 0L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.57f, (float)-0.75f, (float)0.195f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.57f, (float)-0.75f, (float)0.195f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.57f, (float)-0.75f, (float)0.195f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.57f, (float)-0.75f, (float)0.195f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.57f, (float)-0.75f, (float)0.195f);
        }, 280L, 0L)).withFirstPersonLeftHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)0.0f, (float)0.75f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)0.0f, (float)0.75f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)0.0f, (float)0.75f);
        }, 50L, 200L)).withFirstPersonRightHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.57f, (float)-0.75f, (float)0.195f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.57f, (float)-0.75f, (float)0.195f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.57f, (float)-0.75f, (float)0.195f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.725f, (float)0.575f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.725f, (float)0.575f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.55f, (float)-0.775f, (float)0.325f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.55f, (float)-0.775f, (float)0.325f);
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
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.725f, (float)0.575f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.725f, (float)0.575f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.775f, (float)-0.975f, (float)0.0f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.825f, (float)-0.95f, (float)0.0f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.025f, (float)-0.85f, (float)0.05f);
        }, 300L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.725f, (float)0.325f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.725f, (float)0.325f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.725f, (float)0.325f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.725f, (float)0.325f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)6.5f, (float)6.5f, (float)6.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.725f, (float)0.325f);
        }, 280L, 0L)).build()).withSpawnEntityDamage(4.0f).withSpawnEntityGravityVelocity(0.0118f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


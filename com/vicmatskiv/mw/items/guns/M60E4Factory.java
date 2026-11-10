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
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.M60;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import java.util.Arrays;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class M60E4Factory {
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("m60e4").withFireRate(0.6f).withRecoil(2.0f).withZoom(0.9f).withMaxShots(Integer.MAX_VALUE).withShootSound("m60").withSilencedShootSound("ak15_silenced").withReloadSound("m60_reload").withUnloadSound("m60_unload").withInspectSound("inspection").withDrawSound("mg42_draw").withReloadingTime(45L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withFlashIntensity(0.5f).withFlashScale(() -> Float.valueOf(0.6f)).withFlashOffsetX(() -> Float.valueOf(0.1f)).withFlashOffsetY(() -> Float.valueOf(0.16f)).withInaccuracy(1.0f).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: General-Purpose Machine Gun", "Damage: 13", "Cartridge: 7.62x51mm", "Fire Rate: SEMI, AUTO", "Rate of Fire: 60/100", "Magazines:", "100rnd 7.62x51mm Magazine")).withCrafting(CraftingComplexity.HIGH, Ores.PlasticPlate, Ores.GunmetalPlate).withScreenShaking(RenderableState.SHOOTING, 2.0f, 1.0f, 6.0f).withUnremovableAttachmentCategories(AttachmentCategory.GUARD).withCompatibleAttachment(Attachments.M60HandGuard, true, model -> {}).withCompatibleAttachment(Attachments.M60E4HandGuard, true, model -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)0.33f, (float)0.45f, (float)0.1f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.7f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else if (model instanceof AKRail2) {
                GL11.glTranslatef((float)-0.25f, (float)0.63f, (float)0.1f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.7f);
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else if (model instanceof AKRail3) {
                GL11.glTranslatef((float)0.12f, (float)1.35f, (float)-0.7f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)1.05f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
        }).withCompatibleAttachment(Attachments.M60FrontSight, true, model -> {}).withCompatibleAttachment(Attachments.M60Rail, model -> {
            GL11.glTranslatef((float)-0.073f, (float)-0.12f, (float)2.9f);
            GL11.glScaled((double)0.78f, (double)0.83f, (double)0.6f);
        }).withCompatibleAttachment(AuxiliaryAttachments.M60Hatch, true, model -> {}).withCompatibleAttachment(AuxiliaryAttachments.M60Belt, true, model -> {}).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.M60Mag, model -> {}).withCompatibleAttachment(AuxiliaryAttachments.Extra, true, model -> {
            if (model instanceof AKMiron1) {
                GL11.glTranslatef((float)0.125f, (float)-1.8f, (float)-0.5f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AKMiron2) {
                GL11.glTranslatef((float)-0.183f, (float)-1.32f, (float)-5.0f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AK47iron) {
                GL11.glTranslatef((float)-0.25f, (float)-1.65f, (float)-3.05f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
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
                GL11.glTranslatef((float)0.06f, (float)-0.15f, (float)-2.32f);
                GL11.glScaled((double)0.15f, (double)0.3f, (double)0.8f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else if (model instanceof M14Iron) {
                GL11.glTranslatef((float)0.129f, (float)-1.63f, (float)-2.08f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof MP5Iron) {
                GL11.glTranslatef((float)0.215f, (float)-1.54f, (float)1.2f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef((float)-0.05f, (float)-0.2f, (float)2.8f);
            GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
        }, model -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)0.12f, (float)-0.2f, (float)2.49f);
                GL11.glScaled((double)0.03f, (double)0.03f, (double)0.03f);
            }
        }).withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef((float)-0.16f, (float)-0.24f, (float)4.0f);
            GL11.glScaled((double)0.83f, (double)0.83f, (double)0.83f);
        }, model -> {
            if (model instanceof AcogScope2) {
                GL11.glTranslatef((float)-0.018f, (float)-0.25f, (float)0.13f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof AcogReticle) {
                GL11.glTranslatef((float)0.243f, (float)-0.23f, (float)0.68f);
                GL11.glScaled((double)0.03f, (double)0.03f, (double)0.03f);
            }
        }).withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef((float)-0.03f, (float)0.09f, (float)3.7f);
            GL11.glScaled((double)0.43f, (double)0.43f, (double)0.43f);
        }, model -> {
            if (model instanceof Acog2) {
                GL11.glTranslatef((float)0.15f, (float)-1.035f, (float)1.513f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef((float)0.095f, (float)-0.015f, (float)3.3f);
            GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.7f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef((float)0.012f, (float)-0.73f, (float)3.3f);
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.08f, (float)0.97f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            } else if (model instanceof SightMount) {
                // empty if block
            }
        }).withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef((float)0.1f, (float)-0.0f, (float)3.3f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.68f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef((float)0.12f, (float)-0.06f, (float)3.7f);
            GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef((float)0.12f, (float)-0.06f, (float)3.7f);
            GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef((float)0.12f, (float)-0.06f, (float)3.3f);
            GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
        }, model -> {
            if (model instanceof EotechScopeRing) {
                GL11.glTranslatef((float)-0.2f, (float)-0.41f, (float)1.8f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.118f, (float)-0.535f, (float)1.9f);
                GL11.glScaled((double)0.05f, (double)0.05f, (double)0.05f);
            }
        }).withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef((float)-0.14f, (float)-0.26f, (float)3.3f);
            GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)0.395f, (float)-0.33f, (float)-0.1f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef((float)0.118f, (float)-0.06f, (float)3.8f);
            GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.45f, (float)-0.85f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
            GL11.glTranslatef((float)0.118f, (float)-0.06f, (float)3.8f);
            GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.45f, (float)-0.85f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef((float)-0.02f, (float)-0.25f, (float)3.8f);
            GL11.glScaled((double)0.38f, (double)0.38f, (double)0.38f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef((float)-0.02f, (float)-0.25f, (float)3.8f);
            GL11.glScaled((double)0.38f, (double)0.38f, (double)0.38f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Grip2, model -> {
            GL11.glTranslatef((float)-0.05f, (float)1.75f, (float)0.4f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.StubbyGrip, model -> {
            GL11.glTranslatef((float)-0.05f, (float)1.75f, (float)0.4f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.AngledGrip, model -> {
            GL11.glTranslatef((float)-0.05f, (float)1.85f, (float)0.4f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.VGrip, model -> {
            GL11.glTranslatef((float)-0.05f, (float)1.75f, (float)0.4f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef((float)0.2f, (float)0.45f, (float)0.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef((float)0.2f, (float)0.45f, (float)0.0f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withTextureNames("m60").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new M60()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.28f, (double)0.28f, (double)0.28f);
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)-1.2f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)0.0f, (float)2.3f, (float)-0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-5.074998f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-4.674998f);
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.4f, (float)-5.074998f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.4f, (float)-4.774998f);
        }).withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M60Belt.getRenderablePart(), renderContext -> {
            GL11.glTranslatef((float)0.5f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M60Belt.getRenderablePart(), renderContext -> {
            GL11.glTranslatef((float)0.5f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withFirstPersonCustomPositioning(AuxiliaryAttachments.M60Belt.getRenderablePart(), renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)-0.5f, (float)0.4f, (float)0.0f);
            }
        }).withFirstPersonPositioningReloading(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)23.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)21.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.1f, (float)-5.699997f);
        }, 300L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)22.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)18.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.13f, (float)-5.699997f);
        }, 80L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.2f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.2f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.5f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.13f, (float)-5.699997f);
        }, 95L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)21.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)19.8f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.13f, (float)-5.699997f);
        }, 105L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.7f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.9f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.13f, (float)-5.699997f);
        }, 115L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)21.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)17.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.15f, (float)-5.699997f);
        }, 220L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)14.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.14f, (float)-5.699997f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)14.2f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)21.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)18.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.13f, (float)-5.699997f);
        }, 95L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)14.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)21.2f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)19.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.13f, (float)-5.699997f);
        }, 110L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)21.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)28.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)-0.0f, (float)-5.729997f);
        }, 360L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)20.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)11.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)-0.0f, (float)-5.699997f);
        }, 120L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)18.1f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)32.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.0f, (float)-5.699997f);
        }, 140L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)17.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.5f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)-0.0f, (float)-5.699997f);
        }, 120L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.3f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.0f, (float)-5.699997f);
        }, 340L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)4.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.0f, (float)-5.699997f);
        }, 90L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)5.2f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.0f, (float)-5.699997f);
        }, 120L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.12f, (float)-5.699997f);
        }, 120L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.07f, (float)-5.699997f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.1f, (float)-5.699997f);
        }, 90L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.8f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.1f, (float)-5.699997f);
        }, 110L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.1f, (float)-5.699997f);
        }, 140L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)41.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-5.599997f);
        }, 350L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)7.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-5.599997f);
        }, 250L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-5.599997f);
        }, 200L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)41.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-5.599997f);
        }, 80L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-5.599997f);
        }, 90L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-5.599997f);
        }, 110L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)14.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.04f, (float)-5.599997f);
        }, 350L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)14.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.0f, (float)-5.599997f);
        }, 80L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)14.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.0f, (float)-5.599997f);
        }, 110L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)17.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.2f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.15f, (float)-5.599997f);
        }, 140L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)14.7f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)36.9f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.09f, (float)-5.599997f);
        }, 80L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)15.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.5f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.1f, (float)-5.599997f);
        }, 90L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)15.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.1f, (float)-5.599997f);
        }, 110L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.02f, (float)-5.599997f);
        }, 350L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.0f, (float)-5.599997f);
        }, 60L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.3f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.0f, (float)-5.599997f);
        }, 80L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.4f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)6.5f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.0f, (float)-5.599997f);
        }, 100L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)11.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.0f, (float)-5.359997f);
        }, 140L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)36.9f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)9.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.0f, (float)-5.299997f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.6f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.1f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.0f, (float)-5.369997f);
        }, 90L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.0f, (float)-5.699997f);
        }, 110L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.0f, (float)-5.599997f);
        }, 80L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.4f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.5f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.0f, (float)-5.599997f);
        }, 100L, 0L)).withFirstPersonPositioningUnloading(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)9.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)23.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.1f, (float)-5.699997f);
        }, 400L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)12.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)23.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)23.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.12f, (float)-5.699997f);
        }, 250L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)23.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)24.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.11f, (float)-5.699997f);
        }, 300L, 0L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MG42action.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 500L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 500L, 1000L), new Transition<RenderContext>(renderContext -> {}, 500L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 500L, 1000L), new Transition<RenderContext>(renderContext -> {}, 500L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 500L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 500L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 500L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 500L, 1000L), new Transition<RenderContext>(renderContext -> {}, 500L, 1000L), new Transition<RenderContext>(renderContext -> {}, 500L, 1000L), new Transition<RenderContext>(renderContext -> {}, 500L, 1000L)).withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MG42action.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M60Hatch.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.M60Rail.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.9f, (float)1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M60Hatch.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M60Belt.getRenderablePart(), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.75f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.7f, (float)0.5f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.95f, (float)-0.15f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.95f, (float)-0.3f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.9f, (float)-0.2f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.9f, (float)0.2f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.9f, (float)0.2f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.9f, (float)0.2f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.9f, (float)0.2f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.9f, (float)0.2f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.9f, (float)0.2f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.5f, (float)-0.05f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M60Belt.getRenderablePart(), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.2f, (float)-0.3f, (float)0.0f);
            }
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.7f, (float)0.95f, (float)0.0f);
            }
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.M60Mag, new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 300L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 60L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 300L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 60L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 220L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 50L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 65L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 80L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 330L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 90L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.15f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 110L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)-0.05f, (float)-0.4f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 340L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.12f, (float)-0.4f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.0f, (float)-0.4f, (float)0.0f), 90L, 0L), new Transition<RenderContext>(renderContext -> {}, 120L, 0L), new Transition<RenderContext>(renderContext -> {}, 60L, 0L), new Transition<RenderContext>(renderContext -> {}, 80L, 0L), new Transition<RenderContext>(renderContext -> {}, 100L, 0L), new Transition<RenderContext>(renderContext -> {}, 100L, 0L), new Transition<RenderContext>(renderContext -> {}, 250L, 0L), new Transition<RenderContext>(renderContext -> {}, 200L, 0L), new Transition<RenderContext>(renderContext -> {}, 180L, 0L), new Transition<RenderContext>(renderContext -> {}, 70L, 0L), new Transition<RenderContext>(renderContext -> {}, 180L, 0L), new Transition<RenderContext>(renderContext -> {}, 70L, 0L), new Transition<RenderContext>(renderContext -> {}, 300L, 0L), new Transition<RenderContext>(renderContext -> {}, 70L, 0L), new Transition<RenderContext>(renderContext -> {}, 90L, 0L), new Transition<RenderContext>(renderContext -> {}, 140L, 0L), new Transition<RenderContext>(renderContext -> {}, 70L, 0L), new Transition<RenderContext>(renderContext -> {}, 80L, 0L), new Transition<RenderContext>(renderContext -> {}, 90L, 0L), new Transition<RenderContext>(renderContext -> {}, 340L, 0L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 260L, 100L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 280L, 0L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.M60Mag, new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glTranslatef((float)0.0f, (float)-0.4f, (float)0.0f), 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)0.9f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.NightRaider.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.ACOG.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.Specter.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.Reflex.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.BijiaReflex.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.Holographic.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.HolographicAlt.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.EotechHybrid2.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.VortexRedux.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.Kobra.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.KobraGen3.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-1.6f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.MicroT1.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.AimpointCompM5.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.8f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.MicroReflex.getRenderablePart(), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)-3.3f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L), new Transition<RenderContext>(renderContext -> {}, 250L, 1000L)).withFirstPersonPositioningInspecting(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.9f, (float)-0.5f, (float)-5.199997f);
        }, 300L, 600L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.2f, (float)-4.999998f);
        }, 350L, 600L)).withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.M60Belt.getRenderablePart(), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)1.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)1.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }, 250L, 1000L)).withFirstPersonPositioningDrawing(new Transition<RenderContext>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-4.774998f);
        }, 200L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-4.774998f);
        }, 230L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-4.774998f);
        }, 300L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-4.774998f);
        }, 250L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-4.874998f);
        }, 230L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-4.704998f);
        }, 180L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.2f, (float)-4.774998f);
        }, 180L, 0L)).withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.M60Belt.getRenderablePart(), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)1.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)1.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)1.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)1.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)1.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)1.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.7f, (float)1.95f, (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }, 250L, 1000L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.19f, (float)-0.28f, (float)-4.7f);
            GL11.glRotatef((float)-0.55f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                GL11.glTranslatef((float)0.0f, (float)0.06f, (float)-0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                GL11.glTranslatef((float)0.0f, (float)0.14f, (float)0.2f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                GL11.glTranslatef((float)0.0f, (float)0.1f, (float)0.2f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                GL11.glTranslatef((float)0.0f, (float)0.1f, (float)0.2f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                GL11.glTranslatef((float)0.0f, (float)0.015f, (float)0.4f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.05f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.05f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                GL11.glTranslatef((float)0.0f, (float)0.09f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                GL11.glTranslatef((float)0.0f, (float)0.09f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                GL11.glTranslatef((float)0.0f, (float)0.07f, (float)0.2f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)0.0f);
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.19f, (float)-0.28f, (float)-4.3f);
            GL11.glRotatef((float)-0.55f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                GL11.glTranslatef((float)0.0f, (float)0.06f, (float)-0.2f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                GL11.glTranslatef((float)0.0f, (float)0.14f, (float)-0.05f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                GL11.glTranslatef((float)0.0f, (float)0.1f, (float)0.2f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                GL11.glTranslatef((float)0.0f, (float)0.1f, (float)0.2f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                GL11.glTranslatef((float)0.0f, (float)0.015f, (float)0.15f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.05f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.05f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                GL11.glTranslatef((float)0.0f, (float)0.09f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                GL11.glTranslatef((float)0.0f, (float)0.09f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                GL11.glTranslatef((float)0.0f, (float)0.07f, (float)-0.1f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)0.0f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)0.0f, (float)-4.774998f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.95f, (float)-0.725f, (float)-5.125f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)95.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.649999f, (float)-0.65f, (float)0.125f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)95.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.649999f, (float)-0.65f, (float)0.125f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)95.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.649999f, (float)-0.65f, (float)0.125f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)95.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.649999f, (float)-0.65f, (float)0.125f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)95.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.649999f, (float)-0.65f, (float)0.125f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-125.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.85f, (float)-0.675f, (float)-0.575f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-125.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.85f, (float)-0.675f, (float)-0.575f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-125.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.85f, (float)-0.675f, (float)-0.575f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-125.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.85f, (float)-0.675f, (float)-0.575f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.55f, (float)0.925f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.55f, (float)0.925f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.55f, (float)0.925f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.55f, (float)0.925f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.375f, (float)-1.624999f, (float)0.05f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)-1.599999f, (float)-0.1f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)-1.624999f, (float)-0.025f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)-1.624999f, (float)-0.025f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)-1.624999f, (float)-0.025f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)-1.624999f, (float)-0.025f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)-1.624999f, (float)-0.025f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)-1.624999f, (float)-0.025f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.705f, (float)-1.464999f, (float)0.34f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.645f, (float)-1.474999f, (float)0.19f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.785f, (float)-1.324999f, (float)0.44f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.785f, (float)-1.324999f, (float)0.44f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.785f, (float)-1.324999f, (float)0.44f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.785f, (float)-1.324999f, (float)0.44f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-125.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.85f, (float)-0.675f, (float)-0.575f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-125.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.85f, (float)-0.675f, (float)-0.575f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-125.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.85f, (float)-0.675f, (float)-0.575f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)95.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.649999f, (float)-0.65f, (float)0.125f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)95.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.649999f, (float)-0.65f, (float)0.125f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)95.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.649999f, (float)-0.65f, (float)0.125f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)95.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.649999f, (float)-0.65f, (float)0.125f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 1000L)).withFirstPersonRightHandPositioningReloading(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-1.4f, (float)0.2f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-1.4f, (float)0.2f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-1.4f, (float)0.2f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-1.4f, (float)0.2f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.44f, (float)-1.64f, (float)0.19f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.44f, (float)-1.64f, (float)0.19f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.44f, (float)-1.64f, (float)0.19f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-1.4f, (float)0.2f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-1.4f, (float)0.2f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-1.4f, (float)0.2f);
        }, 500L, 1000L)).withFirstPersonLeftHandPositioningUnloading(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)-1.624999f, (float)-0.025f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)-1.624999f, (float)-0.025f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.55f, (float)0.925f);
        }, 250L, 1000L)).withFirstPersonRightHandPositioningUnloading(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 1000L)).withFirstPersonLeftHandPositioningInspecting(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 50L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 50L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.79f, (float)-1.435f, (float)0.71f);
        }, 250L, 50L)).withThirdPersonLeftHandPositioningReloading(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.075f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.075f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.075f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.075f, (float)0.1f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.1f, (float)0.2f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.1f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)0.025f, (float)0.025f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)0.025f, (float)0.025f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.075f, (float)0.1f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.075f, (float)0.1f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.025f, (float)0.125f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.05f, (float)0.15f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.1f, (float)0.2f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.075f, (float)0.1f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.075f);
        }, 250L, 1000L)).withThirdPersonRightHandPositioningReloading(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.05f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.175f, (float)0.05f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.05f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.175f, (float)0.05f);
        }, 500L, 1000L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.05f);
        }, 500L, 1000L)).withFirstPersonLeftHandPositioningDrawing(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 150L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 130L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 200L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 200L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 130L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 200L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-1.1f, (float)0.275f);
        }, 200L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<RenderContext>(renderContext -> GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f), 150L, 0L), new Transition<RenderContext>(renderContext -> GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f), 130L, 0L), new Transition<RenderContext>(renderContext -> GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 100L), new Transition<RenderContext>(renderContext -> GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 100L), new Transition<RenderContext>(renderContext -> GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f), 500L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f), 500L, 1000L), new Transition<RenderContext>(renderContext -> GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f), 500L, 1000L)).build()).withSpawnEntityDamage(13.0f).withSpawnEntityGravityVelocity(0.0118f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


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
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.M107;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import java.util.Arrays;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class M82Factory
implements GunFactory {
    @Override
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("m82_barrett").withFireRate(0.1f).withRecoil(15.0f).withZoom(0.8f).withMaxShots(1).withShootSound("m82").withPumpTimeout(1000L).withSilencedShootSound("as50_silenced").withReloadSound("as50_reload").withUnloadSound("as50_unload").withInspectSound("inspection").withDrawSound("as50_draw").withReloadingTime(40L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withFlashIntensity(0.4f).withFlashScale(() -> Float.valueOf(0.6f)).withFlashOffsetX(() -> Float.valueOf(0.08f)).withFlashOffsetY(() -> Float.valueOf(0.08f)).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Anti-Materiel Sniper Rifle", "Damage: 50", "Cartridge: .50 BMG", "Fire Rate: SEMI", "Rate of Fire: 10/100", "Magazines:", "10rnd .50 BMG NATO Magazine")).withCrafting(CraftingComplexity.HIGH, Ores.PlasticPlate, Ores.GunmetalPlate, Ores.GunmetalIngot).withScreenShaking(RenderableState.SHOOTING, 6.0f, -5.0f, 12.0f).withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT).withUnremovableAttachmentCategories(AttachmentCategory.RAILING).withCompatibleAttachment(Attachments.Placeholder, true, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.19f, (float)-0.4f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withCompatibleAttachment(Attachments.GripPlaceholder, true, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.19f, (float)-0.4f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withCompatibleAttachment(AuxiliaryAttachments.M82Action, true, model -> {}).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.M82Mag, model -> {
            GL11.glTranslatef((float)-0.42f, (float)0.8f, (float)-1.4f);
            GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
        }).withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef((float)-0.22f, (float)-1.58f, (float)-2.5f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }, model -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)0.12f, (float)-0.2f, (float)2.49f);
                GL11.glScaled((double)0.03f, (double)0.03f, (double)0.03f);
            }
        }).withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef((float)-0.328f, (float)-1.6f, (float)-1.2f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }, model -> {
            if (model instanceof AcogScope2) {
                GL11.glTranslatef((float)-0.018f, (float)-0.25f, (float)0.13f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof AcogReticle) {
                GL11.glTranslatef((float)0.243f, (float)-0.23f, (float)0.68f);
                GL11.glScaled((double)0.03f, (double)0.03f, (double)0.03f);
            }
        }).withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef((float)-0.19f, (float)-1.22f, (float)-1.5f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }, model -> {
            if (model instanceof Acog2) {
                GL11.glTranslatef((float)0.15f, (float)-1.035f, (float)1.513f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef((float)-0.155f, (float)-1.4f, (float)-2.2f);
            GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
        }, model -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)0.076f, (float)-0.67f, (float)4.0251f);
                GL11.glScaled((double)0.04f, (double)0.04f, (double)0.04f);
            }
        }).withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef((float)-0.145f, (float)-2.15f, (float)-1.0f);
            GL11.glScaled((double)0.38f, (double)0.38f, (double)0.38f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.08f, (float)0.97f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            } else if (model instanceof SightMount) {
                // empty if block
            }
        }).withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef((float)-0.045f, (float)-1.35f, (float)-1.5f);
            GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.7f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef((float)-0.04f, (float)-1.32f, (float)-1.6f);
            GL11.glScaled((double)0.63f, (double)0.63f, (double)0.63f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.68f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef((float)-0.015f, (float)-1.4f, (float)-1.5f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef((float)-0.015f, (float)-1.4f, (float)-1.5f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef((float)-0.015f, (float)-1.4f, (float)-1.8f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
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
            GL11.glTranslatef((float)-0.315f, (float)-1.61f, (float)-1.5f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)0.395f, (float)-0.33f, (float)-0.1f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef((float)-0.025f, (float)-1.42f, (float)-1.0f);
            GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.45f, (float)-0.85f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
            GL11.glTranslatef((float)-0.025f, (float)-1.42f, (float)-1.0f);
            GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.45f, (float)-0.85f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef((float)-0.186f, (float)-1.6f, (float)-1.0f);
            GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef((float)-0.186f, (float)-1.6f, (float)-1.0f);
            GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Bipod, model -> {
            GL11.glTranslatef((float)-0.18f, (float)-0.15f, (float)-4.9f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, model -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.226f, (float)-1.48f, (float)-4.5f);
                GL11.glScaled((double)0.82f, (double)0.82f, (double)0.9f);
            } else if (model instanceof AKRail2) {
                GL11.glTranslatef((float)-0.226f, (float)-1.48f, (float)-6.25f);
                GL11.glScaled((double)0.82f, (double)0.82f, (double)0.9f);
            } else if (model instanceof AKRail3) {
                GL11.glTranslatef((float)-0.03f, (float)-0.52f, (float)-3.5f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AKRail4) {
                GL11.glTranslatef((float)-0.226f, (float)-1.48f, (float)-2.28f);
                GL11.glScaled((double)0.82f, (double)0.82f, (double)0.9f);
            } else if (model instanceof AKRail5) {
                GL11.glTranslatef((float)-0.245f, (float)-1.45f, (float)-2.33f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withCompatibleAttachment(Attachments.Silencer50BMG, model -> {
            GL11.glTranslatef((float)-0.23f, (float)-1.4f, (float)-12.4f);
            GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
        }).withTextureNames("m107").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new M107()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.28f, (double)0.28f, (double)0.28f);
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)-1.2f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
            GL11.glTranslatef((float)-2.2f, (float)-1.1f, (float)2.4f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.225f, (float)1.299999f, (float)-0.425f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.225f, (float)1.299999f, (float)0.2f);
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.6f, (float)2.2f, (float)-1.2f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.6f, (float)2.2f, (float)-1.0f);
        }).withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M82Action.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.5f)).withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M82Action.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.5f)).withFirstPersonCustomPositioning(Magazines.M82Mag, renderContext -> {}).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-37.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.65f, (float)1.499999f, (float)0.025f);
        }, 330L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-44.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.65f, (float)1.499999f, (float)0.025f);
        }, 350L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-42.7f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)9.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.65f, (float)1.499999f, (float)0.025f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-43.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.5f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.65f, (float)1.499999f, (float)0.025f);
        }, 110L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.65f, (float)1.499999f, (float)0.025f);
        }, 110L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-40.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.8f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)9.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.65f, (float)1.499999f, (float)0.025f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-40.2f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)11.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.65f, (float)1.499999f, (float)0.025f);
        }, 75L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.3f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.5f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.65f, (float)1.499999f, (float)0.025f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.1f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.65f, (float)1.499999f, (float)0.025f);
        }, 110L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)33.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)1.574999f, (float)-0.125f);
        }, 360L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-4.8f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)31.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)29.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)1.574999f, (float)-0.125f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-5.1f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.1f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)31.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)1.574999f, (float)-0.125f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)33.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)1.574999f, (float)0.105f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)36.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)1.574999f, (float)0.235f);
        }, 90L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-9.2f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)32.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)1.574999f, (float)0.245f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-8.8f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)1.574999f, (float)0.225f);
        }, 90L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-8.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)1.574999f, (float)0.228f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)1.574999f, (float)-0.165f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)1.574999f, (float)-0.115f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-3.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)1.574999f, (float)-0.125f);
        }, 80L, 0L)).withFirstPersonPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-27.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.575f, (float)1.554999f, (float)-0.35f);
        }, 300L, 80L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-24.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.575f, (float)1.564999f, (float)-0.35f);
        }, 120L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.575f, (float)1.534999f, (float)-0.35f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.575f, (float)1.674999f, (float)-0.35f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.575f, (float)1.654999f, (float)-0.35f);
        }, 200L, 0L)).withFirstPersonCustomPositioningReloading(Magazines.M82Mag, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)3.0f, (float)0.7f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 400L, 150L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.8f, (float)-0.3f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 400L, 150L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.8f, (float)-0.3f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 60L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.8f, (float)-0.3f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 100L, 170L), new Transition<Object>(renderContext -> {}, 350L, 100L), new Transition<Object>(renderContext -> {}, 220L, 200L), new Transition<Object>(renderContext -> {}, 220L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L)).withFirstPersonCustomPositioningUnloading(Magazines.M82Mag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.6f, (float)-0.3f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.8f, (float)-0.3f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)3.0f, (float)0.7f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)3.0f, (float)0.7f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M82Action.getRenderablePart(), new Transition<Object>(renderContext -> {}, 400L, 150L), new Transition<Object>(renderContext -> {}, 400L, 150L), new Transition<Object>(renderContext -> {}, 300L, 60L), new Transition<Object>(renderContext -> {}, 100L, 170L), new Transition<Object>(renderContext -> {}, 350L, 100L), new Transition<Object>(renderContext -> {}, 220L, 200L), new Transition<Object>(renderContext -> {}, 220L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 450L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.5f), 450L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.5f), 450L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.5f), 450L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.5f), 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L), new Transition<Object>(renderContext -> {}, 450L, 0L)).withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M82Action.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.125f, (float)1.949999f, (float)-1.474999f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.0f, (float)2.375f, (float)-1.424999f);
        }, 350L, 600L)).withThirdPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.47f, (double)0.47f, (double)0.47f);
            GL11.glTranslatef((float)-3.5f, (float)-1.8f, (float)3.4f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.47f, (double)0.47f, (double)0.47f);
            GL11.glTranslatef((float)-3.5f, (float)-1.8f, (float)3.4f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.47f, (double)0.47f, (double)0.47f);
            GL11.glTranslatef((float)-3.5f, (float)-1.8f, (float)3.4f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.47f, (double)0.47f, (double)0.47f);
            GL11.glTranslatef((float)-3.5f, (float)-1.8f, (float)3.4f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 400L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.47f, (double)0.47f, (double)0.47f);
            GL11.glTranslatef((float)-3.5f, (float)-1.8f, (float)3.4f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.47f, (double)0.47f, (double)0.47f);
            GL11.glTranslatef((float)-3.5f, (float)-1.8f, (float)3.4f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 100L, 170L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.47f, (double)0.47f, (double)0.47f);
            GL11.glTranslatef((float)-3.8f, (float)-2.0f, (float)4.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 350L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.47f, (double)0.47f, (double)0.47f);
            GL11.glTranslatef((float)-3.8f, (float)-2.0f, (float)4.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 220L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.47f, (double)0.47f, (double)0.47f);
            GL11.glTranslatef((float)-3.8f, (float)-2.0f, (float)4.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 220L, 0L)).withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M82Action.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)1.524999f, (float)-0.275f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.175f, (float)1.324999f, (float)-0.325f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)1.324999f, (float)1.05f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)82.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)1.324999f, (float)1.13f);
        }, 340L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)81.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)1.324999f, (float)1.05f);
        }, 350L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.225f, (float)1.299999f, (float)-0.425f);
        }, 400L, 0L)).withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.M82Action.getRenderablePart(), new Transition<Object>(renderContext -> {}, 150L, 0L), new Transition<Object>(renderContext -> {}, 130L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 130L, 60L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 110L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.345f, (float)1.125f, (float)-0.55f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.8f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                GL11.glTranslatef((float)-0.005f, (float)0.15f, (float)1.3f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                GL11.glTranslatef((float)0.0f, (float)0.05f, (float)1.2f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                GL11.glTranslatef((float)0.0f, (float)0.11f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.1f, (float)0.9f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)0.9f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.1f, (float)0.9f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                GL11.glTranslatef((float)0.0f, (float)0.14f, (float)0.9f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                GL11.glTranslatef((float)0.0f, (float)0.14f, (float)0.9f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                GL11.glTranslatef((float)0.0f, (float)0.135f, (float)0.9f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                GL11.glTranslatef((float)0.0f, (float)0.11f, (float)0.9f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.5f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.5f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                GL11.glTranslatef((float)0.0f, (float)0.11f, (float)0.9f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                GL11.glTranslatef((float)0.0f, (float)0.11f, (float)0.9f);
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.345f, (float)1.125f, (float)-0.35f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.8f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                GL11.glTranslatef((float)-0.005f, (float)0.15f, (float)1.2f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                GL11.glTranslatef((float)0.0f, (float)0.05f, (float)1.2f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                GL11.glTranslatef((float)0.0f, (float)0.11f, (float)0.55f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.1f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.1f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                GL11.glTranslatef((float)0.0f, (float)0.14f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                GL11.glTranslatef((float)0.0f, (float)0.14f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                GL11.glTranslatef((float)0.0f, (float)0.135f, (float)0.9f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                GL11.glTranslatef((float)0.0f, (float)0.11f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.5f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.5f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                GL11.glTranslatef((float)0.0f, (float)0.11f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                GL11.glTranslatef((float)0.0f, (float)0.11f, (float)1.0f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)1.5f, (float)-0.175f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.2f, (float)0.8f, (float)-0.3f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.35f, (float)-0.15f, (float)0.375f);
        }, renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.2f, (float)0.0f);
        }, 400L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.425f, (float)0.13f);
        }, 400L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.425f, (float)0.13f);
        }, 300L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.425f, (float)0.13f);
        }, 100L, 170L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.365f, (float)0.02f);
        }, 350L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.365f, (float)0.02f);
        }, 220L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.365f, (float)0.02f);
        }, 220L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.365f, (float)0.02f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.365f, (float)0.02f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 450L, 0L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 400L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 400L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 300L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 100L, 170L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 350L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 220L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 220L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.08f, (float)-0.15f, (float)0.11f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.08f, (float)-0.15f, (float)0.11f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.08f, (float)-0.15f, (float)0.11f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.01f, (float)-0.28f, (float)0.08f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.06f, (float)-0.39f, (float)0.06f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.06f, (float)-0.39f, (float)0.06f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.06f, (float)-0.39f, (float)0.06f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.06f, (float)-0.39f, (float)0.06f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-130.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.33f, (float)-0.51f, (float)0.11f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-130.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.33f, (float)-0.51f, (float)0.11f);
        }, 450L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-130.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.33f, (float)-0.51f, (float)0.11f);
        }, 450L, 0L)).withFirstPersonLeftHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.65f, (float)0.175f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.575f, (float)0.175f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.425f, (float)0.13f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.2f, (float)0.0f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.2f, (float)0.0f);
        }, 50L, 200L)).withFirstPersonRightHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.55f, (float)-0.35f, (float)0.2f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.525f, (float)-0.525f, (float)0.05f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.525f, (float)-0.525f, (float)0.05f);
        }, 250L, 50L)).withThirdPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.05f, (float)0.175f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.05f, (float)0.175f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.05f, (float)0.05f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.05f, (float)0.05f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.05f, (float)0.175f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.05f, (float)0.175f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.15f, (float)0.1f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.15f, (float)0.1f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.15f, (float)0.1f);
        }, 280L, 0L)).withThirdPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.1f, (float)0.125f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-58.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-23.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.1f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-59.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-21.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.1f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.1f, (float)0.125f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.1f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.1f, (float)0.125f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-130.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.1f, (float)0.275f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-135.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.175f, (float)0.275f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-130.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.1f, (float)0.275f);
        }, 300L, 0L)).withFirstPersonLeftHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 130L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 110L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 110L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)7.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.225f, (float)0.1f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)7.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.475f, (float)-0.425f, (float)0.025f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)7.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.175f, (float)0.075f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.475f, (float)0.175f);
        }, 130L, 0L)).build()).withSpawnEntityDamage(50.0f).withSpawnEntityGravityVelocity(0.0f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


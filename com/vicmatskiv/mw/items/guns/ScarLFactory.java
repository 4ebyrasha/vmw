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
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
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
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.Scar;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.SightMount;
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

public class ScarLFactory
implements GunFactory {
    @Override
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("scar_l").withFireRate(0.6f).withRecoil(3.0f).withZoom(0.9f).withMaxShots(1, Integer.MAX_VALUE).withShootSound("scar_l").withSilencedShootSound("m4a1_silenced").withReloadSound("scar_reload").withUnloadSound("scar_unload").withEndOfShootSound("gun_click").withInspectSound("inspection").withDrawSound("noaction_draw").withReloadingTime(50L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withFlashIntensity(0.5f).withFlashScale(() -> Float.valueOf(0.6f)).withFlashOffsetX(() -> Float.valueOf(0.1f)).withFlashOffsetY(() -> Float.valueOf(0.17f)).withShellCasingForwardOffset(0.05f).withShellCasingVerticalOffset(-0.03f).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Carbine", "Damage: 8", "Cartridge: 5.56x45mm NATO", "Fire Rate: SEMI, AUTO", "Rate of Fire: 65/100", "Magazines:", "30rnd 5.56x45mm NATO STANAG Magazine", "30rnd 5.56x45mm NATO PMAG Magazine", "50rnd 5.56x45mm NATO STANAG Drum Magazine", "60rnd 5.56x45mm NATO STANAG Drum Magazine", "100rnd 5.56x45mm NATO STANAG Drum Magazine")).withCrafting(CraftingComplexity.MEDIUM, Ores.PlasticPlate, Ores.GunmetalPlate).withScreenShaking(RenderableState.SHOOTING, 1.0f, 1.0f, 3.0f).withUnremovableAttachmentCategories(AttachmentCategory.GUARD).withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP).withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT).withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER).withUnremovableAttachmentCategories(AttachmentCategory.RAILING).withCompatibleAttachment(Attachments.Placeholder, true, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.19f, (float)-0.4f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withCompatibleAttachment(Attachments.GripPlaceholder, true, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.19f, (float)-0.4f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withCompatibleAttachment(Attachments.LaserPlaceholder, true, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.19f, (float)-0.4f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withCompatibleAttachment(Attachments.ScarHandGuard, true, model -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)0.14f, (float)-1.28f, (float)-4.25f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)1.0, (double)0.6f);
            } else if (model instanceof AKRail2) {
                GL11.glTranslatef((float)-0.38f, (float)-1.06f, (float)-4.25f);
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)1.0, (double)0.6f);
            }
        }).withCompatibleAttachment(Attachments.ScarStock, true, model -> {}).withCompatibleAttachment(Attachments.ScarHStock, model -> {}).withCompatibleAttachment(Attachments.CollapsableMOEStock, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.6f, (float)0.2f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withCompatibleAttachment(Attachments.MagpulCTRStock, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.6f, (float)0.2f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withCompatibleAttachment(Attachments.MilSpecStock, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.6f, (float)0.2f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withCompatibleAttachment(Attachments.HK416Stock, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.6f, (float)0.2f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withCompatibleAttachment(Attachments.M4Grip, model -> {}).withCompatibleAttachment(Attachments.M4GripTan, true, model -> {}).withCompatibleAttachment(Attachments.M4GripGray, model -> {}).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.M4A1Mag, model -> {
            GL11.glTranslatef((float)-0.342f, (float)0.5f, (float)-1.42f);
            GL11.glScaled((double)1.11f, (double)1.4f, (double)1.5);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.M38Mag, model -> {
            GL11.glTranslatef((float)-0.342f, (float)0.5f, (float)-1.42f);
            GL11.glScaled((double)1.11f, (double)1.4f, (double)1.5);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.Stanag50, model -> {
            GL11.glTranslatef((float)0.0f, (float)0.05f, (float)-0.1f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.Stanag60, model -> {
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)0.3f, (float)-0.1f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.Stanag100, model -> {
            GL11.glTranslatef((float)-0.37f, (float)0.5f, (float)-1.42f);
            GL11.glScaled((double)1.25, (double)1.3f, (double)1.5);
        }).withCompatibleAttachment(AuxiliaryAttachments.ScarAction, true, model -> {}).withCompatibleAttachment(Attachments.AKMIron, true, model -> {
            if (model instanceof M4Iron1) {
                GL11.glTranslatef((float)-0.16f, (float)-1.5f, (float)-0.3f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof M4Iron2) {
                GL11.glTranslatef((float)0.255f, (float)-1.55f, (float)-2.25f);
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
                GL11.glTranslatef((float)-0.22f, (float)-1.94f, (float)0.13f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof G36CIron2) {
                GL11.glTranslatef((float)-0.205f, (float)-1.9f, (float)-3.15f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof ScarIron1) {
                GL11.glTranslatef((float)-0.163f, (float)-1.85f, (float)0.2f);
                GL11.glScaled((double)0.35f, (double)0.4f, (double)0.4f);
            } else if (model instanceof ScarIron2) {
                GL11.glTranslatef((float)-0.082f, (float)-1.72f, (float)-4.4f);
                GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
            } else if (model instanceof FALIron) {
                GL11.glTranslatef((float)-0.12f, (float)-1.9f, (float)-4.35f);
                GL11.glScaled((double)0.1f, (double)0.25, (double)0.2f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else if (model instanceof M14Iron) {
                GL11.glTranslatef((float)0.129f, (float)-1.63f, (float)-2.08f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof MP5Iron) {
                GL11.glTranslatef((float)0.215f, (float)-1.54f, (float)1.2f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof MBUSiron) {
                GL11.glTranslatef((float)0.215f, (float)-1.54f, (float)1.2f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof M27rearsight) {
                GL11.glTranslatef((float)0.215f, (float)-1.54f, (float)1.2f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef((float)-0.221f, (float)-1.77f, (float)-1.9f);
            GL11.glScaled((double)0.85f, (double)0.85f, (double)0.85f);
        }, model -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)0.12f, (float)-0.2f, (float)2.49f);
                GL11.glScaled((double)0.03f, (double)0.03f, (double)0.03f);
            }
        }).withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef((float)-0.335f, (float)-1.82f, (float)-0.7f);
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
            GL11.glTranslatef((float)-0.2f, (float)-1.43f, (float)-0.7f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }, model -> {
            if (model instanceof Acog2) {
                GL11.glTranslatef((float)0.15f, (float)-1.035f, (float)1.513f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef((float)-0.165f, (float)-1.6f, (float)-1.7f);
            GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
        }, model -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)0.076f, (float)-0.67f, (float)4.0251f);
                GL11.glScaled((double)0.04f, (double)0.04f, (double)0.04f);
            }
        }).withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef((float)-0.056f, (float)-1.58f, (float)-0.9f);
            GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.7f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef((float)-0.15f, (float)-2.4f, (float)-1.0f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.08f, (float)0.97f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            } else if (model instanceof SightMount) {
                // empty if block
            }
        }).withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef((float)-0.05f, (float)-1.53f, (float)-1.0f);
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.68f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef((float)-0.035f, (float)-1.63f, (float)-0.8f);
            GL11.glScaled((double)0.73f, (double)0.73f, (double)0.73f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef((float)-0.035f, (float)-1.63f, (float)-0.8f);
            GL11.glScaled((double)0.73f, (double)0.73f, (double)0.73f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef((float)-0.042f, (float)-1.63f, (float)-1.1f);
            GL11.glScaled((double)0.73f, (double)0.73f, (double)0.73f);
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
            GL11.glTranslatef((float)-0.32f, (float)-1.85f, (float)-1.3f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)0.395f, (float)-0.33f, (float)-0.1f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef((float)-0.031f, (float)-1.63f, (float)-0.6f);
            GL11.glScaled((double)0.73f, (double)0.73f, (double)0.73f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.45f, (float)-0.85f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
            GL11.glTranslatef((float)-0.031f, (float)-1.63f, (float)-0.6f);
            GL11.glScaled((double)0.73f, (double)0.73f, (double)0.73f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.45f, (float)-0.85f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef((float)-0.18f, (float)-1.815f, (float)-0.6f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef((float)-0.18f, (float)-1.815f, (float)-0.6f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Grip2, model -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.45f, (float)-2.8f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.StubbyGrip, model -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.45f, (float)-2.8f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.AngledGrip, model -> {
            GL11.glTranslatef((float)-0.03f, (float)-0.35f, (float)-3.2f);
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)1.1f, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.JunoGrip, model -> {
            GL11.glTranslatef((float)-0.23f, (float)-0.74f, (float)-3.1f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withCompatibleAttachment(Attachments.VGrip, model -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.45f, (float)-2.8f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.Bipod, model -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.45f, (float)-4.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef((float)0.05f, (float)-1.3f, (float)-4.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef((float)0.05f, (float)-1.18f, (float)-3.6f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }).withCompatibleAttachment(Attachments.Silencer556x45, model -> {
            GL11.glTranslatef((float)-0.2f, (float)-1.32f, (float)-6.5f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withTextureNames("scar").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new Scar()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)-1.2f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.0f, (float)-1.2f, (float)2.2f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.299999f, (float)-0.975f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.36f, (float)-0.575f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.3f, (float)1.0f, (float)-0.775f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.3f, (float)1.0f, (float)-0.675f);
            GL11.glRotatef((float)-0.7f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonCustomPositioning(AuxiliaryAttachments.ScarAction.getRenderablePart(), renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f);
            }
        }).withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.ScarAction.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f)).withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.ScarAction.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f)).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-38.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.994999f, (float)-0.6f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-41.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.884999f, (float)-0.6f);
        }, 190L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-38.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.824999f, (float)-0.6f);
        }, 40L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-39.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.844999f, (float)-0.6f);
        }, 50L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.724999f, (float)-0.6f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-43.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.694999f, (float)-0.6f);
        }, 50L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-44.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.734999f, (float)-0.6f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-43.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.724999f, (float)-0.6f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-39.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.924999f, (float)-0.6f);
        }, 240L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-42.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.624999f, (float)-0.6f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-41.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.65f, (float)-0.6f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-41.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.744999f, (float)-0.6f);
        }, 90L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-40.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)1.714999f, (float)-0.6f);
        }, 110L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.4f, (float)-0.7f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.4f, (float)-0.7f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.4f, (float)-0.7f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.4f, (float)-0.85f);
        }, 30L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-8.4f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.4f, (float)-0.72f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-7.9f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.25f, (float)1.4f, (float)-0.75f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glTranslatef((float)-0.2f, (float)1.4f, (float)-0.76f);
        }, 120L, 0L)).withFirstPersonPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)64.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)1.299999f, (float)-0.95f);
        }, 240L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)62.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)1.299999f, (float)-0.95f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)66.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)1.299999f, (float)-0.95f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)64.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)1.299999f, (float)-0.95f);
        }, 90L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)2.024999f, (float)-0.6f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-47.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)2.324999f, (float)-0.6f);
        }, 140L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-41.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)2.254999f, (float)-0.6f);
        }, 180L, 0L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ScarAction.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.ScarAction.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.3f), 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.M4A1Mag, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.M4A1Mag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)0.3f, (float)-0.2f);
            GL11.glRotatef((float)50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)1.4f);
            GL11.glRotatef((float)28.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.M38Mag, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.M38Mag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)0.3f, (float)-0.2f);
            GL11.glRotatef((float)50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)1.4f);
            GL11.glRotatef((float)28.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.Stanag50, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.Stanag50, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)0.3f, (float)-0.2f);
            GL11.glRotatef((float)50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)1.4f);
            GL11.glRotatef((float)28.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.Stanag60, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.Stanag60, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)0.3f, (float)-0.2f);
            GL11.glRotatef((float)50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)1.4f);
            GL11.glRotatef((float)28.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.Stanag100, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.Stanag100, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)0.3f, (float)-0.2f);
            GL11.glRotatef((float)50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)1.4f);
            GL11.glRotatef((float)28.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.425f, (float)1.025f, (float)-0.65f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)1.549999f, (float)-0.55f);
        }, 350L, 600L)).withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.ScarAction.getRenderablePart(), new Transition<Object>(renderContext -> {}, 300L, 600L), new Transition<Object>(renderContext -> {}, 350L, 600L)).withThirdPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-2.0f, (float)-0.8f, (float)2.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 180L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-2.0f, (float)-0.8f, (float)2.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 240L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-2.0f, (float)-0.8f, (float)2.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 170L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-2.0f, (float)-0.8f, (float)2.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 170L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-2.0f, (float)-0.8f, (float)2.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-2.0f, (float)-0.8f, (float)2.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 240L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-2.0f, (float)-0.8f, (float)2.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-2.0f, (float)-0.8f, (float)2.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 170L, 170L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-2.0f, (float)-0.8f, (float)2.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 260L, 10L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-2.0f, (float)-0.8f, (float)2.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 100L, 50L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)2.049999f, (float)-0.725f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)2.049999f, (float)-0.725f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)1.949999f, (float)-0.95f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)1.649999f, (float)-1.1f);
        }, 170L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)1.579999f, (float)-1.25f);
        }, 170L, 0L)).withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.ScarAction.getRenderablePart(), new Transition<Object>(renderContext -> {}, 150L, 0L), new Transition<Object>(renderContext -> {}, 130L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 130L, 60L), new Transition<Object>(renderContext -> {}, 110L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.35f, (float)1.349999f, (float)-1.2f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                GL11.glTranslatef((float)0.0f, (float)0.068f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                GL11.glTranslatef((float)0.0f, (float)0.03f, (float)0.7f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                GL11.glTranslatef((float)-0.005f, (float)0.15f, (float)1.4f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                GL11.glTranslatef((float)-0.0f, (float)0.03f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                GL11.glTranslatef((float)0.0f, (float)0.09f, (float)0.7f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.085f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.115f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.065f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                GL11.glTranslatef((float)0.0f, (float)0.105f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                GL11.glTranslatef((float)0.0f, (float)0.105f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                GL11.glTranslatef((float)0.0f, (float)0.13f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                GL11.glTranslatef((float)0.01f, (float)0.11f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                GL11.glTranslatef((float)0.01f, (float)0.11f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                GL11.glTranslatef((float)0.01f, (float)0.1f, (float)1.0f);
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.35f, (float)1.349999f, (float)-0.9f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                GL11.glTranslatef((float)0.0f, (float)0.068f, (float)0.85f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                GL11.glTranslatef((float)0.0f, (float)0.03f, (float)0.7f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                GL11.glTranslatef((float)-0.005f, (float)0.15f, (float)1.25f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                GL11.glTranslatef((float)-0.0f, (float)0.03f, (float)0.85f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                GL11.glTranslatef((float)0.0f, (float)0.09f, (float)0.55f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.085f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.115f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.065f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                GL11.glTranslatef((float)0.0f, (float)0.105f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                GL11.glTranslatef((float)0.0f, (float)0.105f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                GL11.glTranslatef((float)0.0f, (float)0.08f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                GL11.glTranslatef((float)0.0f, (float)0.13f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                GL11.glTranslatef((float)0.01f, (float)0.11f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                GL11.glTranslatef((float)0.01f, (float)0.11f, (float)1.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                GL11.glTranslatef((float)0.01f, (float)0.1f, (float)0.85f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)1.0f, (float)-0.5f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)0.9f, (float)-0.95f);
        }).withFirstPersonPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-2.2f, (float)0.6f, (float)-1.5f);
        }).withFirstPersonHandPositioning(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.075f, (float)0.1f);
            } else if (activeAttachment == Attachments.AngledGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.175f, (float)-0.05f, (float)0.3f);
            } else {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.325f, (float)-0.275f, (float)0.05f);
            }
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.075f, (float)0.1f);
            } else if (activeAttachment == Attachments.AngledGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.175f, (float)-0.05f, (float)0.3f);
            } else {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.325f, (float)-0.275f, (float)0.05f);
            }
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.475f, (float)-0.5f, (float)0.15f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }).withFirstPersonHandPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.725f, (float)0.3f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-130.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.55f, (float)0.075f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.125f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)-0.375f, (float)0.125f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)-0.375f, (float)0.125f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)-0.375f, (float)0.125f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.4f, (float)0.1f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.4f, (float)0.1f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.4f, (float)0.1f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.4f, (float)0.1f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.225f, (float)0.075f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.31f, (float)0.09f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.31f, (float)0.09f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.31f, (float)0.09f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.31f, (float)0.09f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.65f, (float)0.125f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.65f, (float)0.125f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.625f, (float)0.19f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.625f, (float)0.19f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.625f, (float)0.19f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.625f, (float)0.19f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.625f, (float)0.19f);
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
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 250L, 0L)).withFirstPersonLeftHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.5f, (float)-0.05f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.5f, (float)-0.05f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.5f, (float)-0.05f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.5f, (float)-0.05f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.3f, (float)-0.025f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.375f, (float)0.0f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.3f, (float)-0.025f);
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
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
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
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
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
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.15f, (float)0.175f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)-0.275f, (float)0.05f);
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
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.075f, (float)0.075f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.025f, (float)0.125f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.075f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.075f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.075f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.025f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.025f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.025f, (float)0.125f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.025f, (float)0.0f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.025f, (float)0.0f);
        }, 250L, 0L)).withThirdPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.15f, (float)0.375f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-26.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-26.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-53.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-53.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-54.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-24.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-24.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-26.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.15f, (float)0.075f);
        }, 250L, 0L)).withFirstPersonLeftHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.275f, (float)0.05f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.275f, (float)0.05f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.275f, (float)0.05f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.275f, (float)0.05f);
        }, 130L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.325f, (float)-0.275f, (float)0.05f);
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
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 130L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }, 110L, 0L)).build()).withSpawnEntityDamage(7.0f).withSpawnEntityGravityVelocity(0.0118f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


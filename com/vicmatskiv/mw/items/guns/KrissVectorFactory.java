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
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.Bipod;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.KrissVector;
import com.vicmatskiv.mw.models.KrissVectorRailRiser;
import com.vicmatskiv.mw.models.KrissVectorSwordfish;
import com.vicmatskiv.mw.models.MBUSFrontSight;
import com.vicmatskiv.mw.models.MBUSRearSight;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.mw.models.TritiumRearSights;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
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

public class KrissVectorFactory {
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("kriss_vector").withFireRate(0.999f).withRecoil(3.0f).withZoom(0.9f).withMaxShots(1, Integer.MAX_VALUE).withShootSound("vector").withSilencedShootSound("mp5_silenced").withReloadSound("vector_reload").withUnloadSound("vector_unload").withInspectSound("inspection").withDrawSound("noaction_draw").withReloadingTime(45L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withFlashIntensity(0.6f).withFlashScale(() -> Float.valueOf(0.5f)).withFlashOffsetX(() -> Float.valueOf(0.12f)).withFlashOffsetY(() -> Float.valueOf(0.22f)).withInaccuracy(2.0f).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Submachine Gun", "Damage: 6.5", "Cartridge: .45 ACP", "Fire Rate: SEMI, AUTO", "Rate of Fire: 99/100", "Magazines:", "25rnd .45 ACP Vector Magazine", "30rnd 5.56x45mm NATO STANAG Magazine (w/ Vector 5.56 Handguard)", "30rnd 5.56x45mm NATO PMAG Magazine (w/ Vector 5.56 Handguard)", "50rnd 5.56x45mm NATO STANAG Drum Magazine (w/ Vector 5.56 Handguard)", "60rnd 5.56x45mm NATO STANAG Drum Magazine (w/ Vector 5.56 Handguard)", "100rnd 5.56x45mm NATO STANAG Drum Magazine (w/ Vector 5.56 Handguard)")).withUnremovableAttachmentCategories(AttachmentCategory.GUARD).withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP).withCrafting(CraftingComplexity.MEDIUM, Ores.GunmetalIngot, Ores.PlasticPlate).withScreenShaking(RenderableState.SHOOTING, 2.0f, 0.1f, 3.0f).withCompatibleAttachment(Attachments.RailRiser, model -> {
            if (model instanceof KrissVectorRailRiser) {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.245f, (float)-1.48f, (float)-4.19f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)1.38f);
            }
        }).withCompatibleAttachment(Attachments.VectorHandguard, true, model -> {}).withCompatibleAttachment(Attachments.Vector556Handguard, model -> {}).withCompatibleAttachment(Attachments.VectorSwordfish, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.Vector556Handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2.0f);
                    GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
                } else {
                    GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
                }
            }
        }, model -> {
            if (model instanceof KrissVectorSwordfish) {
                // empty if block
            }
        }, false, false).withCompatibleAttachment(Attachments.VectorStock, true, model -> {}).withCompatibleAttachment(Attachments.CollapsableMOEStock, model -> {
            GL11.glTranslatef((float)0.02f, (float)0.2f, (float)-0.2f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withCompatibleAttachment(Attachments.MagpulCTRStock, model -> {
            GL11.glTranslatef((float)0.02f, (float)0.2f, (float)-0.4f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withCompatibleAttachment(Attachments.MagpulCTRStockTan, model -> {
            GL11.glTranslatef((float)0.02f, (float)0.2f, (float)-0.4f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withCompatibleAttachment(Attachments.MilSpecStock, model -> {
            GL11.glTranslatef((float)0.02f, (float)0.2f, (float)-0.4f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withCompatibleAttachment(Attachments.MilSpecStockTan, model -> {
            GL11.glTranslatef((float)0.02f, (float)0.2f, (float)-0.4f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withCompatibleAttachment(Attachments.HK416Stock, model -> {
            GL11.glTranslatef((float)0.02f, (float)0.2f, (float)-0.4f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withCompatibleAttachment(Attachments.HK416StockTan, model -> {
            GL11.glTranslatef((float)0.02f, (float)0.2f, (float)-0.4f);
            GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.VectorMag, model -> {
            GL11.glTranslatef((float)-0.43f, (float)0.8f, (float)0.2f);
            GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
            GL11.glRotatef((float)17.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.M4A1Mag, model -> {
            GL11.glTranslatef((float)-0.43f, (float)2.0f, (float)-2.0f);
            GL11.glScaled((double)1.55f, (double)1.8f, (double)1.8f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.M38Mag, model -> {
            GL11.glTranslatef((float)-0.43f, (float)2.0f, (float)-2.0f);
            GL11.glScaled((double)1.55f, (double)1.8f, (double)1.8f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.Stanag50, model -> {
            GL11.glTranslatef((float)0.07f, (float)1.4f, (float)0.4f);
            GL11.glScaled((double)1.55f, (double)1.8f, (double)1.8f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.Stanag60, model -> {
            GL11.glTranslatef((float)0.07f, (float)1.4f, (float)0.4f);
            GL11.glScaled((double)1.55f, (double)1.8f, (double)1.8f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.Stanag100, model -> {
            GL11.glTranslatef((float)-0.43f, (float)2.0f, (float)-2.0f);
            GL11.glScaled((double)1.55f, (double)1.8f, (double)1.8f);
        }).withCompatibleAttachment(Attachments.TritiumRearSights, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.058f, (float)0.47f, (float)-0.7f);
                    GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
                } else {
                    GL11.glTranslatef((float)0.058f, (float)0.87f, (float)0.2f);
                    GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
                }
            }
        }, model -> {
            if (model instanceof TritiumRearSights) {
                GL11.glTranslatef((float)-0.16f, (float)-1.5f, (float)-0.3f);
                GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            }
        }, true, false).withCompatibleAttachment(Attachments.MBUSRearSights, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.048f, (float)0.31f, (float)-0.6f);
                    GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
                } else {
                    GL11.glTranslatef((float)0.048f, (float)0.71f, (float)0.3f);
                    GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
                }
            }
        }, model -> {
            if (model instanceof MBUSRearSight) {
                GL11.glTranslatef((float)-0.16f, (float)-1.5f, (float)-0.3f);
                GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            }
        }, false, false).withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.05f, (float)0.31f, (float)1.2f);
                    GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
                } else {
                    GL11.glTranslatef((float)0.05f, (float)0.71f, (float)1.2f);
                    GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
                }
            }
        }, model -> {
            if (model instanceof MBUSFrontSight) {
                GL11.glTranslatef((float)-0.16f, (float)-1.5f, (float)-3.3f);
                GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            }
        }, true, false).withCompatibleAttachment(Attachments.NightRaider, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.238f, (float)-1.6f, (float)-3.0f);
                    GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
                } else {
                    GL11.glTranslatef((float)-0.238f, (float)-1.24f, (float)-2.7f);
                    GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
                }
            }
        }, model -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)0.12f, (float)-0.2f, (float)2.49f);
                GL11.glScaled((double)0.03f, (double)0.03f, (double)0.03f);
            }
        }, false, false).withCompatibleAttachment(Attachments.ACOG, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.358f, (float)-1.65f, (float)-1.5f);
                    GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
                } else {
                    GL11.glTranslatef((float)-0.358f, (float)-1.28f, (float)-0.5f);
                    GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
                }
            }
        }, model -> {
            if (model instanceof AcogScope2) {
                GL11.glTranslatef((float)-0.018f, (float)-0.25f, (float)0.13f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof AcogReticle) {
                GL11.glTranslatef((float)0.243f, (float)-0.23f, (float)0.68f);
                GL11.glScaled((double)0.03f, (double)0.03f, (double)0.03f);
            }
        }, false, false).withCompatibleAttachment(Attachments.Specter, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.22f, (float)-1.2f, (float)-2.2f);
                    GL11.glScaled((double)0.62f, (double)0.62f, (double)0.62f);
                } else {
                    GL11.glTranslatef((float)-0.22f, (float)-0.83f, (float)-1.5f);
                    GL11.glScaled((double)0.62f, (double)0.62f, (double)0.62f);
                }
            }
        }, model -> {
            if (model instanceof Acog2) {
                GL11.glTranslatef((float)0.15f, (float)-1.035f, (float)1.513f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }, false, false).withCompatibleAttachment(Attachments.MicroReflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.16f, (float)-2.35f, (float)-1.8f);
                    GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
                } else {
                    GL11.glTranslatef((float)-0.16f, (float)-2.0f, (float)-1.0f);
                    GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
                }
            }
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.08f, (float)0.97f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            } else if (model instanceof SightMount) {
                // empty if block
            }
        }, false, false).withCompatibleAttachment(Attachments.Reflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.045f, (float)-1.35f, (float)-2.0f);
                    GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
                } else {
                    GL11.glTranslatef((float)-0.045f, (float)-1.0f, (float)-2.0f);
                    GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
                }
            }
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.7f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }, false, false).withCompatibleAttachment(Attachments.BijiaReflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.035f, (float)-1.3f, (float)-2.0f);
                    GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
                } else {
                    GL11.glTranslatef((float)-0.035f, (float)-0.95f, (float)-2.0f);
                    GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
                }
            }
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.68f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }, false, false).withCompatibleAttachment(Attachments.Holographic, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.005f, (float)-1.4f, (float)-2.0f);
                    GL11.glScaled((double)0.95f, (double)0.95f, (double)0.95f);
                } else {
                    GL11.glTranslatef((float)-0.005f, (float)-1.05f, (float)-1.5f);
                    GL11.glScaled((double)0.95f, (double)0.95f, (double)0.95f);
                }
            }
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }, false, false).withCompatibleAttachment(Attachments.HolographicAlt, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.005f, (float)-1.4f, (float)-2.0f);
                    GL11.glScaled((double)0.95f, (double)0.95f, (double)0.95f);
                } else {
                    GL11.glTranslatef((float)-0.005f, (float)-1.05f, (float)-1.5f);
                    GL11.glScaled((double)0.95f, (double)0.95f, (double)0.95f);
                }
            }
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }, false, false).withCompatibleAttachment(Attachments.EotechHybrid2, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.005f, (float)-1.4f, (float)-2.5f);
                    GL11.glScaled((double)0.95f, (double)0.95f, (double)0.95f);
                } else {
                    GL11.glTranslatef((float)-0.005f, (float)-1.05f, (float)-1.5f);
                    GL11.glScaled((double)0.95f, (double)0.95f, (double)0.95f);
                }
            }
        }, model -> {
            if (model instanceof EotechScopeRing) {
                GL11.glTranslatef((float)-0.2f, (float)-0.41f, (float)1.8f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.118f, (float)-0.535f, (float)1.9f);
                GL11.glScaled((double)0.05f, (double)0.05f, (double)0.05f);
            }
        }, false, false).withCompatibleAttachment(Attachments.VortexRedux, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.355f, (float)-1.66f, (float)-2.0f);
                    GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
                } else {
                    GL11.glTranslatef((float)-0.355f, (float)-1.28f, (float)-1.5f);
                    GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
                }
            }
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)0.395f, (float)-0.33f, (float)-0.1f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }, false, false).withCompatibleAttachment(Attachments.Kobra, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.025f, (float)-1.45f, (float)-2.0f);
                    GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
                } else {
                    GL11.glTranslatef((float)-0.025f, (float)-1.05f, (float)-1.0f);
                    GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
                }
            }
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.45f, (float)-0.85f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }, false, false).withCompatibleAttachment(Attachments.MicroT1, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.2f, (float)-1.65f, (float)-2.0f);
                    GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
                } else {
                    GL11.glTranslatef((float)-0.2f, (float)-1.3f, (float)-1.5f);
                    GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
                }
            }
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }, false, false).withCompatibleAttachment(Attachments.AimpointCompM5, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.2f, (float)-1.65f, (float)-2.0f);
                    GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
                } else {
                    GL11.glTranslatef((float)-0.2f, (float)-1.3f, (float)-1.5f);
                    GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
                }
            }
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }, false, false).withCompatibleAttachment(Attachments.RMR, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, instance);
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)-0.19f, (float)-1.6f, (float)-2.0f);
                    GL11.glScaled((double)0.42f, (double)0.42f, (double)0.42f);
                } else {
                    GL11.glTranslatef((float)-0.19f, (float)-1.25f, (float)-2.0f);
                    GL11.glScaled((double)0.42f, (double)0.42f, (double)0.42f);
                }
            }
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.15f, (float)-0.03f, (float)-1.5f);
                GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            }
        }, false, false).withCompatibleAttachment(Attachments.Bipod, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.Vector556Handguard) {
                    GL11.glTranslatef((float)-0.23f, (float)0.8f, (float)-6.0f);
                    GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
                } else {
                    GL11.glTranslatef((float)-0.23f, (float)0.8f, (float)-3.5f);
                    GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
                }
            }
        }, model -> {
            if (model instanceof Bipod) {
                // empty if block
            }
        }, false, false).withCompatibleAttachment(Attachments.Grip2, model -> {
            GL11.glTranslatef((float)-0.23f, (float)0.8f, (float)-3.5f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withCompatibleAttachment(Attachments.StubbyGrip, model -> {
            GL11.glTranslatef((float)-0.23f, (float)0.8f, (float)-3.5f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withCompatibleAttachment(Attachments.AngledGrip, model -> {
            GL11.glTranslatef((float)-0.23f, (float)1.0f, (float)-4.0f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withCompatibleAttachment(Attachments.VGrip, model -> {
            GL11.glTranslatef((float)-0.23f, (float)0.8f, (float)-3.5f);
            GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
        }).withCompatibleAttachment(Attachments.Silencer45ACP, model -> {
            GL11.glTranslatef((float)-0.24f, (float)-0.6f, (float)-6.5f);
            GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
        }).withTextureNames("gun").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new KrissVector()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.28f, (double)0.28f, (double)0.28f);
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)-1.2f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glTranslatef((float)-2.2f, (float)-1.1f, (float)2.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.375f, (float)0.9f, (float)-1.149999f);
        }).withFirstPersonPositioning(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
            if (activeAttachment == Attachments.RailRiser) {
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
                GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)-0.375f, (float)1.0f, (float)-0.949999f);
            } else {
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
                GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)-0.375f, (float)0.9f, (float)-1.149999f);
            }
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
            if (activeAttachment == Attachments.RailRiser) {
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
                GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)-0.375f, (float)1.0f, (float)-0.449999f);
            } else {
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
                GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)-0.375f, (float)0.9f, (float)-0.549999f);
                GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)14.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.13f, (float)0.6f, (float)-0.2f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)16.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.6f, (float)-0.1f);
            GL11.glRotatef((float)-0.7f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonCustomPositioning(Magazines.VectorMag, renderContext -> {}).withFirstPersonCustomPositioning(Magazines.M4A1Mag, renderContext -> {}).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-34.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-11.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.499999f, (float)1.15f, (float)-0.925f);
        }, 340L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-17.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.499999f, (float)0.98f, (float)-0.625f);
        }, 240L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-41.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-14.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.499999f, (float)1.05f, (float)-0.625f);
        }, 110L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-40.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-16.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.499999f, (float)1.08f, (float)-0.625f);
        }, 140L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.499999f, (float)0.85f, (float)-0.625f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.499999f, (float)0.88f, (float)-0.625f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.499999f, (float)0.87f, (float)-0.625f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-14.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.499999f, (float)0.88f, (float)-0.625f);
        }, 110L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.075f, (float)1.324999f, (float)-0.625f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-18.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.175f, (float)1.324999f, (float)-0.625f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-19.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.175f, (float)1.324999f, (float)-0.625f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-18.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.175f, (float)1.324999f, (float)-0.625f);
        }, 70L, 0L)).withFirstPersonPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.375f, (float)0.9f, (float)-1.049999f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.375f, (float)0.77f, (float)-1.049999f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.375f, (float)1.3f, (float)-1.049999f);
        }, 140L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.375f, (float)1.2f, (float)-1.049999f);
        }, 150L, 0L)).withFirstPersonCustomPositioningReloading(Magazines.VectorMag, new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.0f, (float)3.5f, (float)0.5f), 400L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)1.1f, (float)0.1f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)1.1f, (float)0.15f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)0.65f, (float)0.15f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 350L, 0L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L)).withFirstPersonCustomPositioningUnloading(Magazines.VectorMag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.0f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.M4A1Mag, new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.0f, (float)3.5f, (float)0.5f), 400L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.2f, (float)0.05f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.2f, (float)-0.05f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.1f, (float)0.1f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 350L, 0L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L)).withFirstPersonCustomPositioningUnloading(Magazines.M4A1Mag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.0f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.M38Mag, new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.0f, (float)3.5f, (float)0.5f), 400L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.2f, (float)0.05f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.2f, (float)-0.05f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.1f, (float)0.1f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 350L, 0L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L)).withFirstPersonCustomPositioningUnloading(Magazines.M38Mag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.0f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.Stanag50, new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.0f, (float)3.5f, (float)0.5f), 400L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.2f, (float)0.05f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.2f, (float)-0.05f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.1f, (float)0.1f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 350L, 0L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L)).withFirstPersonCustomPositioningUnloading(Magazines.Stanag50, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.0f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.Stanag60, new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.0f, (float)3.5f, (float)0.5f), 400L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.2f, (float)0.05f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.2f, (float)-0.05f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.1f, (float)0.1f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 350L, 0L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L)).withFirstPersonCustomPositioningUnloading(Magazines.Stanag60, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.0f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.Stanag100, new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.0f, (float)3.5f, (float)0.5f), 400L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.2f, (float)0.05f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.2f, (float)-0.05f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.1f, (float)0.1f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 100L, 150L), new Transition<Object>(renderContext -> {}, 350L, 0L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L), new Transition<Object>(renderContext -> {}, 160L, 100L)).withFirstPersonCustomPositioningUnloading(Magazines.Stanag100, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.0f, (float)-0.15f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 1000L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.0f, (float)0.8f, (float)0.0f);
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
        }, 120L, 0L)).withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.AKaction.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.45f, (float)1.524999f, (float)0.125f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)1.524999f, (float)-0.225f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)1.224999f, (float)-0.525f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.25f, (float)1.024999f, (float)-0.925f);
        }, 190L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.375f, (float)0.9f, (float)-1.149999f);
        }, 190L, 0L)).withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.AKaction.getRenderablePart(), new Transition<Object>(renderContext -> {}, 150L, 0L), new Transition<Object>(renderContext -> {}, 130L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 130L, 60L), new Transition<Object>(renderContext -> {}, 110L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            ItemAttachment<Weapon> activeAttachment;
            RenderContext rc;
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.35f, (float)0.875f, (float)0.2f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.44f, (float)0.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.045f, (float)-0.4f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.44f, (float)0.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.045f, (float)-0.6f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.42f, (float)0.3f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.06f, (float)0.0f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.48f, (float)0.7f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.12f, (float)-0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.41f, (float)1.0f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.045f, (float)0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.45f, (float)0.5f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.1f, (float)-0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.36f, (float)0.5f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.375f, (float)0.3f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.03f, (float)0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.47f, (float)0.3f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.0f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.47f, (float)0.3f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.0f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.47f, (float)0.4f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.12f, (float)-0.5f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.46f, (float)0.4f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.082f, (float)0.0f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.42f, (float)0.8f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.025f, (float)-0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.45f, (float)0.8f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.1f, (float)0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.45f, (float)0.8f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.1f, (float)0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.23f, (float)0.8f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.12f, (float)0.5f);
                }
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            ItemAttachment<Weapon> activeAttachment;
            RenderContext rc;
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.35f, (float)0.875f, (float)0.5f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.44f, (float)0.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.045f, (float)-0.4f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.44f, (float)0.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.045f, (float)-0.6f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.42f, (float)0.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.06f, (float)-0.1f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.48f, (float)0.5f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.12f, (float)-0.4f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.41f, (float)0.9f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.045f, (float)0.1f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.45f, (float)0.5f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.1f, (float)-0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.36f, (float)0.5f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.375f, (float)0.3f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.03f, (float)0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.47f, (float)0.3f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.0f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.47f, (float)0.3f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.12f, (float)0.0f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.47f, (float)0.3f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.12f, (float)-0.6f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.46f, (float)0.4f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.082f, (float)0.0f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.42f, (float)0.8f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.025f, (float)-0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.45f, (float)0.8f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.1f, (float)0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.45f, (float)0.8f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)0.1f, (float)0.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RAILING, rc.getWeaponInstance());
                if (activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef((float)0.0f, (float)0.23f, (float)0.8f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.12f, (float)0.5f);
                }
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)1.1f, (float)-1.2f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.8f, (float)0.675f, (float)-1.0f);
        }).withFirstPersonPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.8f, (float)0.675f, (float)-1.0f);
        }).withFirstPersonHandPositioning(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.45f, (float)-0.25f, (float)0.2f);
            } else if (activeAttachment == Attachments.AngledGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.25f, (float)0.375f);
            } else {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.3f, (float)-0.4f, (float)0.325f);
            }
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.45f, (float)-0.25f, (float)0.2f);
            } else if (activeAttachment == Attachments.AngledGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.25f, (float)0.375f);
            } else {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.3f, (float)-0.4f, (float)0.325f);
            }
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.45f, (float)-0.25f, (float)0.2f);
            } else if (activeAttachment == Attachments.AngledGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.25f, (float)0.375f);
            } else {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.3f, (float)-0.4f, (float)0.325f);
            }
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)0.0f, (float)0.625f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }).withFirstPersonHandPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)0.0f, (float)0.625f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.125f, (float)0.075f);
        }, 400L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.665f, (float)-0.26f, (float)0.09f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-80.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.665f, (float)-0.24f, (float)0.01f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.475f, (float)-0.1f, (float)0.025f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Vector556Handguard) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.6f, (float)-0.425f, (float)0.15f);
            } else {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.28f, (float)0.05f);
            }
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Vector556Handguard) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.6f, (float)-0.425f, (float)0.15f);
            } else {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.28f, (float)0.05f);
            }
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Vector556Handguard) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.6f, (float)-0.425f, (float)0.15f);
            } else {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.28f, (float)0.05f);
            }
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Vector556Handguard) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.6f, (float)-0.425f, (float)0.15f);
            } else {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.28f, (float)0.05f);
            }
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.475f, (float)0.075f);
        }, 350L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.285f, (float)-0.43f, (float)0.08f);
        }, 160L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.285f, (float)-0.43f, (float)0.08f);
        }, 160L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.285f, (float)-0.43f, (float)0.08f);
        }, 160L, 100L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 400L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 100L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 100L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 100L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 100L, 150L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 350L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 160L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 160L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 160L, 100L)).withFirstPersonLeftHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.475f, (float)0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)-0.25f, (float)0.175f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)-0.125f, (float)0.375f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)-0.125f, (float)0.375f);
        }, 50L, 200L)).withFirstPersonRightHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
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
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
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
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.5f, (float)0.2f);
        }, 280L, 0L)).build()).withSpawnEntityDamage(6.5f).withSpawnEntityGravityVelocity(0.0118f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


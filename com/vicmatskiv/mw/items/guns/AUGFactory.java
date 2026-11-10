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
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AUG;
import com.vicmatskiv.mw.models.AUGScope;
import com.vicmatskiv.mw.models.AUGScope_scope;
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
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
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

public class AUGFactory
implements GunFactory {
    @Override
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("steyr_aug_a1").withFireRate(0.75f).withRecoil(3.0f).withZoom(0.9f).withMaxShots(1, Integer.MAX_VALUE).withShootSound("aug").withSilencedShootSound("m4a1_silenced").withReloadSound("m4a1_reload").withUnloadSound("m4_unload").withEndOfShootSound("gun_click").withInspectSound("m4a1_inspection").withDrawSound("m4_draw").withReloadingTime(50L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withFlashIntensity(0.5f).withFlashScale(() -> Float.valueOf(0.6f)).withFlashOffsetX(() -> Float.valueOf(0.12f)).withFlashOffsetY(() -> Float.valueOf(0.16f)).withShellCasingForwardOffset(0.05f).withShellCasingVerticalOffset(-0.03f).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Bullpup Assault Rifle", "Damage: 7", "Cartridge: 5.56x45mm NATO", "Fire Rate: SEMI, AUTO", "Rate of Fire: 80/100", "Magazines:", "30rnd 5.56x45mm NATO STANAG Magazine", "30rnd 5.56x45mm NATO PMAG Magazine", "50rnd 5.56x45mm NATO STANAG Drum Magazine", "60rnd 5.56x45mm NATO STANAG Drum Magazine", "100rnd 5.56x45mm NATO STANAG Drum Magazine", "30rnd 9x19mm PARA Magazine (w/ PARA conversion kit)")).withCrafting(CraftingComplexity.MEDIUM, Ores.PlasticPlate, Ores.GunmetalPlate).withScreenShaking(RenderableState.SHOOTING, -1.0f, -2.0f, 3.0f).withUnremovableAttachmentCategories(AttachmentCategory.GUARD).withCompatibleAttachment(Attachments.AUGA1handguard, true, model -> {}).withCompatibleAttachment(Attachments.AUGDefaultKit, true, model -> GL11.glScaled((double)0.0, (double)0.0, (double)0.0)).withCompatibleAttachment(Attachments.AUGParaConversion, model -> {}).withCompatibleAttachment(Attachments.AUGA2handguard, model -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.22f, (float)-1.6f, (float)-1.35f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.8f);
            }
        }).withCompatibleAttachment(Attachments.AUGA3handguard, model -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.23f, (float)-1.27f, (float)-1.53f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.95f);
            }
        }).withCompatibleAttachment(Attachments.EF88Handguard, model -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.23f, (float)-1.27f, (float)-2.25f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)1.2f);
            }
        }).withCompatibleAttachment(Attachments.AUGA3extGuard, model -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.23f, (float)-1.27f, (float)-3.6f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.95f);
            } else if (model instanceof AKRail2) {
                GL11.glTranslatef((float)0.15f, (float)-0.935f, (float)-3.85f);
                GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else if (model instanceof AKRail3) {
                GL11.glTranslatef((float)-0.39f, (float)-0.755f, (float)-3.85f);
                GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else if (model instanceof AKRail4) {
                GL11.glTranslatef((float)-0.01f, (float)-0.48f, (float)-3.65f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.57f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.AUG9mmMag, model -> {}).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.M4A1Mag, model -> {
            GL11.glTranslatef((float)-0.28f, (float)0.9f, (float)1.2f);
            GL11.glScaled((double)0.8f, (double)1.3f, (double)1.4f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.M38Mag, model -> {
            GL11.glTranslatef((float)-0.28f, (float)0.9f, (float)1.2f);
            GL11.glScaled((double)0.8f, (double)1.3f, (double)1.4f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.Stanag50, model -> {
            GL11.glTranslatef((float)0.01f, (float)0.5f, (float)2.6f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.Stanag60, model -> {
            GL11.glTranslatef((float)0.01f, (float)0.5f, (float)2.6f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.Stanag100, model -> {
            GL11.glTranslatef((float)-0.335f, (float)0.9f, (float)1.2f);
            GL11.glScaled((double)1.1f, (double)1.3f, (double)1.3f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withCompatibleAttachment(AuxiliaryAttachments.AUGAction, true, model -> {
            GL11.glTranslatef((float)-0.02f, (float)0.03f, (float)0.3f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
        }).withCompatibleAttachment(Attachments.AKMIron, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
                    GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
                } else {
                    GL11.glTranslatef((float)0.013f, (float)0.481f, (float)0.0f);
                    GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
                }
            }
        }, model -> {
            if (model instanceof M4Iron1) {
                GL11.glTranslatef((float)0.215f, (float)-1.54f, (float)1.2f);
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
                GL11.glTranslatef((float)-0.175f, (float)-1.75f, (float)-1.15f);
                GL11.glScaled((double)0.45f, (double)0.45f, (double)0.3f);
            } else if (model instanceof AK47iron) {
                GL11.glTranslatef((float)-0.225f, (float)-2.02f, (float)-1.15f);
                GL11.glScaled((double)0.65f, (double)0.8f, (double)0.3f);
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
                GL11.glTranslatef((float)-0.131f, (float)-1.7f, (float)-1.12f);
                GL11.glScaled((double)0.08f, (double)0.45f, (double)0.1f);
                GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            } else if (model instanceof M14Iron) {
                GL11.glTranslatef((float)0.129f, (float)-1.63f, (float)-2.08f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof MP5Iron) {
                GL11.glTranslatef((float)0.215f, (float)-1.54f, (float)1.2f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof M27rearsight) {
                GL11.glTranslatef((float)0.215f, (float)-1.54f, (float)1.2f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof MBUSiron) {
                GL11.glTranslatef((float)-0.174f, (float)-1.78f, (float)0.45f);
                GL11.glScaled((double)0.45f, (double)0.4f, (double)0.4f);
            }
        }, false, false).withCompatibleAttachment(Attachments.AUGscope, true, (player, stack) -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }, model -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)-0.118f, (float)-1.458f, (float)0.685f);
                GL11.glScaled((double)0.02f, (double)0.02f, (double)0.02f);
            } else if (model instanceof AUGScope) {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof AUGScope_scope) {
                GL11.glTranslatef((float)-0.165f, (float)-1.4f, (float)-1.05f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withCompatibleAttachment(Attachments.NightRaider, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.21f, (float)-1.68f, (float)-1.2f);
                    GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
                } else {
                    GL11.glTranslatef((float)-0.21f, (float)-1.37f, (float)-1.2f);
                    GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
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
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.29f, (float)-1.7f, (float)0.3f);
                    GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
                } else {
                    GL11.glTranslatef((float)-0.307f, (float)-1.38f, (float)0.5f);
                    GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
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
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.185f, (float)-1.4f, (float)-0.3f);
                    GL11.glScaled((double)0.42f, (double)0.42f, (double)0.42f);
                } else {
                    GL11.glTranslatef((float)-0.185f, (float)-1.05f, (float)-0.1f);
                    GL11.glScaled((double)0.42f, (double)0.42f, (double)0.42f);
                }
            }
        }, model -> {
            if (model instanceof Acog2) {
                GL11.glTranslatef((float)0.15f, (float)-1.035f, (float)1.513f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }, false, false).withCompatibleAttachment(Attachments.Reflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.07f, (float)-1.5f, (float)-0.5f);
                    GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
                } else {
                    GL11.glTranslatef((float)-0.058f, (float)-1.17f, (float)-0.4f);
                    GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
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
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.066f, (float)-1.47f, (float)-0.3f);
                    GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
                } else {
                    GL11.glTranslatef((float)-0.06f, (float)-1.17f, (float)-0.3f);
                    GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
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
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.041f, (float)-1.55f, (float)-0.3f);
                    GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
                } else {
                    GL11.glTranslatef((float)-0.041f, (float)-1.22f, (float)-0.2f);
                    GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
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
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.041f, (float)-1.55f, (float)-0.3f);
                    GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
                } else {
                    GL11.glTranslatef((float)-0.041f, (float)-1.22f, (float)-0.2f);
                    GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
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
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.041f, (float)-1.55f, (float)-0.7f);
                    GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
                } else {
                    GL11.glTranslatef((float)-0.041f, (float)-1.22f, (float)-0.4f);
                    GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
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
        }, false, false).withCompatibleAttachment(Attachments.Kobra, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.041f, (float)-1.55f, (float)-0.0f);
                    GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
                } else {
                    GL11.glTranslatef((float)-0.041f, (float)-1.22f, (float)-0.0f);
                    GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
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
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.18f, (float)-1.72f, (float)-0.2f);
                    GL11.glScaled((double)0.38f, (double)0.38f, (double)0.38f);
                } else {
                    GL11.glTranslatef((float)-0.18f, (float)-1.4f, (float)-0.0f);
                    GL11.glScaled((double)0.38f, (double)0.38f, (double)0.38f);
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
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.18f, (float)-1.72f, (float)-0.2f);
                    GL11.glScaled((double)0.38f, (double)0.38f, (double)0.38f);
                } else {
                    GL11.glTranslatef((float)-0.18f, (float)-1.4f, (float)-0.0f);
                    GL11.glScaled((double)0.38f, (double)0.38f, (double)0.38f);
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
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, instance);
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.17f, (float)-1.7f, (float)0.0f);
                    GL11.glScaled((double)0.32f, (double)0.32f, (double)0.32f);
                } else {
                    GL11.glTranslatef((float)-0.17f, (float)-1.4f, (float)-0.0f);
                    GL11.glScaled((double)0.32f, (double)0.32f, (double)0.32f);
                }
            }
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.15f, (float)-0.03f, (float)-1.5f);
                GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            }
        }, false, false).withCompatibleAttachment(Attachments.AUGgrip, true, model -> {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.Grip2, model -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.07f, (float)-2.6f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.StubbyGrip, model -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.07f, (float)-2.6f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.AngledGrip, model -> {
            GL11.glTranslatef((float)-0.2f, (float)0.05f, (float)-3.0f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.VGrip, model -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.07f, (float)-2.6f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.Bipod, model -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.07f, (float)-3.5f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef((float)0.05f, (float)-0.95f, (float)-3.3f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef((float)0.05f, (float)-0.95f, (float)-3.3f);
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
        }).withCompatibleAttachment(Attachments.Silencer556x45, model -> {
            GL11.glTranslatef((float)-0.2f, (float)-1.0f, (float)-5.7f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withTextureNames("aug").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new AUG()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)-1.2f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.53f, (double)0.53f, (double)0.53f);
            GL11.glTranslatef((float)-1.8f, (float)-0.9f, (float)1.8f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.SCOPE, rc.getWeaponInstance());
            if (activeAttachment == Attachments.AUGscope) {
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glTranslatef((float)-0.225f, (float)1.149999f, (float)-1.224999f);
            } else {
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glTranslatef((float)-0.225f, (float)0.949999f, (float)-1.324999f);
            }
            RenderContext rc1 = renderContext;
            ItemAttachment<Weapon> activeAttachment1 = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc1.getWeaponInstance());
            if (activeAttachment1 == Attachments.AUGA2handguard) {
                GL11.glTranslatef((float)0.0f, (float)0.4f, (float)-0.3f);
            } else if (activeAttachment1 == Attachments.AUGA3handguard) {
                GL11.glTranslatef((float)0.0f, (float)0.2f, (float)-0.6f);
            } else if (activeAttachment1 == Attachments.EF88Handguard) {
                GL11.glTranslatef((float)-0.1f, (float)0.1f, (float)-0.8f);
            }
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.SCOPE, rc.getWeaponInstance());
            if (activeAttachment == Attachments.AUGscope) {
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glTranslatef((float)-0.225f, (float)1.149999f, (float)-0.824999f);
            } else {
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glTranslatef((float)-0.225f, (float)0.949999f, (float)-0.924999f);
            }
            RenderContext rc1 = renderContext;
            ItemAttachment<Weapon> activeAttachment1 = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc1.getWeaponInstance());
            if (activeAttachment1 == Attachments.AUGA2handguard) {
                GL11.glTranslatef((float)0.0f, (float)0.4f, (float)-0.3f);
                GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            } else if (activeAttachment1 == Attachments.AUGA3handguard) {
                GL11.glTranslatef((float)0.0f, (float)0.2f, (float)-0.6f);
                GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            } else if (activeAttachment1 == Attachments.EF88Handguard) {
                GL11.glTranslatef((float)-0.1f, (float)0.1f, (float)-0.8f);
            }
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.18f, (float)1.1f, (float)-0.75f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.18f, (float)1.1f, (float)-0.6f);
            GL11.glRotatef((float)-0.7f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonCustomPositioning(AuxiliaryAttachments.AUGAction.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioning(Magazines.M4A1Mag, renderContext -> {}).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.8f, (float)1.0f, (float)-1.675f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-44.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.8f, (float)0.7f, (float)-1.675f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.8f, (float)0.75f, (float)-1.675f);
        }, 240L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.8f, (float)0.93f, (float)-1.675f);
        }, 220L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.8f, (float)1.23f, (float)-1.575f);
        }, 180L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.8f, (float)1.53f, (float)-1.575f);
        }, 150L, 0L)).withFirstPersonPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.4f, (float)1.2f, (float)-1.55f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.4f, (float)1.2f, (float)-1.55f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)39.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.4f, (float)1.2f, (float)-1.5f);
        }, 180L, 100L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)39.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.4f, (float)1.15f, (float)-1.5f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)41.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.4f, (float)1.15f, (float)-1.55f);
        }, 220L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.4f, (float)1.1f, (float)-1.55f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-9.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)44.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.4f, (float)1.15f, (float)-1.55f);
        }, 230L, 0L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AUGAction.getRenderablePart(), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.4f, (float)0.0f, (float)0.8f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.4f, (float)0.0f, (float)0.8f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.4f, (float)0.0f, (float)0.8f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.4f, (float)0.0f, (float)0.8f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.4f, (float)0.0f, (float)0.8f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AUGAction.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.4f, (float)0.0f, (float)0.8f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.4f, (float)0.0f, (float)0.8f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.4f, (float)0.0f, (float)0.8f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.4f, (float)0.0f, (float)0.8f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.4f, (float)0.0f, (float)0.8f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.AUG9mmMag, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.AUG9mmMag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.M4A1Mag, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.M4A1Mag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.M38Mag, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.M38Mag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.Stanag50, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.Stanag50, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.Stanag60, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.Stanag60, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonCustomPositioningReloading(Magazines.Stanag100, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.01f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.01f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.01f, (float)0.0f, (float)0.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.Stanag100, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.3f, (float)1.7f, (float)0.1f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.8f, (float)0.8f, (float)-0.5f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.4f, (float)1.2f, (float)-0.8f);
        }, 350L, 600L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-12.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.4f, (float)1.2f, (float)-0.8f);
        }, 300L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-12.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.4f, (float)1.2f, (float)-0.75f);
        }, 450L, 400L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.4f, (float)1.2f, (float)-0.8f);
        }, 350L, 200L)).withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.AUGAction.getRenderablePart(), new Transition<Object>(renderContext -> {}, 300L, 600L), new Transition<Object>(renderContext -> {}, 350L, 600L), new Transition<Object>(renderContext -> {}, 300L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.4f), 450L, 400L), new Transition<Object>(renderContext -> {}, 350L, 0L)).withThirdPersonPositioningReloading(new Transition<Object>(renderContext -> {
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
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)1.749999f, (float)-0.725f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)1.749999f, (float)-0.725f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)1.749999f, (float)-0.75f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)14.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)1.349999f, (float)-1.08f);
        }, 170L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)1.149999f, (float)-1.35f);
        }, 170L, 0L)).withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.AUGAction.getRenderablePart(), new Transition<Object>(renderContext -> {}, 150L, 0L), new Transition<Object>(renderContext -> {}, 130L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 130L, 60L), new Transition<Object>(renderContext -> {}, 110L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            ItemAttachment<Weapon> activeAttachment;
            RenderContext rc;
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.35f, (float)1.0f, (float)-2.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.3f, (float)1.5f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.01f, (float)1.5f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.315f, (float)1.5f);
                } else {
                    GL11.glTranslatef((float)-0.01f, (float)0.03f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.003f, (float)0.27f, (float)1.7f);
                } else {
                    GL11.glTranslatef((float)-0.003f, (float)-0.08f, (float)1.5f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AUGscope)) {
                GL11.glTranslatef((float)0.0f, (float)-0.08f, (float)1.5f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.26f, (float)1.5f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.03f, (float)1.0f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.225f, (float)1.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.035f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.32f, (float)1.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.01f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.32f, (float)1.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.01f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.004f, (float)0.325f, (float)1.6f);
                } else {
                    GL11.glTranslatef((float)-0.004f, (float)-0.005f, (float)1.3f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.31f, (float)1.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.02f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.31f, (float)1.4f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.007f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.31f, (float)1.4f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.007f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.18f, (float)1.0f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.12f, (float)1.0f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.217f, (float)1.0f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.087f, (float)1.0f);
                }
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            ItemAttachment<Weapon> activeAttachment;
            RenderContext rc;
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.35f, (float)1.0f, (float)-1.9f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.3f, (float)1.45f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.01f, (float)1.45f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.315f, (float)1.45f);
                } else {
                    GL11.glTranslatef((float)-0.01f, (float)0.03f, (float)1.15f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.003f, (float)0.27f, (float)1.65f);
                } else {
                    GL11.glTranslatef((float)-0.003f, (float)-0.08f, (float)1.45f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AUGscope)) {
                GL11.glTranslatef((float)0.0f, (float)-0.08f, (float)1.45f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.26f, (float)1.5f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.03f, (float)1.0f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.225f, (float)1.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.035f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.32f, (float)1.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.01f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.32f, (float)1.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.01f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)-0.004f, (float)0.325f, (float)1.6f);
                } else {
                    GL11.glTranslatef((float)-0.004f, (float)-0.005f, (float)1.3f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.31f, (float)1.2f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.02f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.31f, (float)1.4f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.007f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.31f, (float)1.4f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.007f, (float)1.2f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.18f, (float)1.0f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.12f, (float)1.0f);
                }
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                rc = renderContext;
                activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GUARD, rc.getWeaponInstance());
                if (activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef((float)0.0f, (float)0.217f, (float)1.0f);
                } else {
                    GL11.glTranslatef((float)0.0f, (float)-0.087f, (float)1.0f);
                }
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.0f, (float)1.35f, (float)-1.45f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)0.7f, (float)-1.3f);
        }).withFirstPersonPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.8f, (float)0.2f, (float)-1.2f);
        }).withFirstPersonHandPositioning(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.225f, (float)-0.3f, (float)0.25f);
            } else if (activeAttachment == Attachments.AngledGrip) {
                GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.25f, (float)-0.225f, (float)0.25f);
            } else if (activeAttachment == Attachments.AUGgrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.25f, (float)-0.3f, (float)0.125f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.025f, (float)-0.4f, (float)0.2f);
            }
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.5f, (float)0.15f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.1f, (float)0.1f);
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
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)125.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.7f, (float)-0.16f);
        }, renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-120.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.21f, (float)-0.55f, (float)0.1f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.475f, (float)-0.95f, (float)0.2f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-1.1f, (float)0.15f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-1.1f, (float)0.15f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-1.1f, (float)0.15f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.45f, (float)-0.8f, (float)-0.025f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)-0.55f, (float)0.025f);
        }, 250L, 0L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
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
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.55f, (float)0.2f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.725f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.175f, (float)-0.7f, (float)0.1f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.55f, (float)-0.9f, (float)0.225f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.55f, (float)-0.9f, (float)0.275f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.55f, (float)-0.9f, (float)0.45f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.55f, (float)-0.9f, (float)0.45f);
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
        }, 250L, 50L), new Transition<Object>(renderContext -> {
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
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)5.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.35f, (float)0.225f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)-0.725f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.425f, (float)-0.775f, (float)-0.075f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)-0.725f, (float)0.0f);
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
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.4f, (float)0.2f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.4f, (float)0.2f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.4f, (float)0.2f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.4f, (float)0.2f);
        }, 130L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.4f, (float)0.2f);
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


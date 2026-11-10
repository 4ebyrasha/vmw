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
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.HK416Stock;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.M9A1frontsight;
import com.vicmatskiv.mw.models.MilSpecStock;
import com.vicmatskiv.mw.models.R870part;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.Remington870;
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

public class Remington870Factory
implements GunFactory {
    @Override
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("remington870").withAmmoCapacity(4).withMaxBulletsPerReload(4).withFireRate(0.5f).withEjectRoundRequired().withIteratedLoad().withEjectSpentRoundSound("r870_pump").withFireRate(0.1f).withRecoil(15.0f).withZoom(0.9f).withMaxShots(1).withPumpTimeout(610L).withShootSound("r870").withSilencedShootSound("ShotgunSilenced").withReloadSound("drawweapon").withReloadIterationSound("load_shell").withInspectSound("inspection").withDrawSound("noaction_draw").withAllReloadIterationsCompletedSound("r870_reload_final").withReloadingTime(15L).withCrosshair("gun").withCrosshairRunning("Running").withShellCasingEjectEnabled(false).withCrosshairZoomed("Sight").withInaccuracy(10.0f).withPellets(10).withFlashIntensity(0.5f).withFlashScale(() -> Float.valueOf(0.7f)).withFlashOffsetX(() -> Float.valueOf(0.1f)).withFlashOffsetY(() -> Float.valueOf(0.11f)).withScreenShaking(RenderableState.SHOOTING, 5.0f, 1.0f, 10.0f).withCrafting(CraftingComplexity.HIGH, Ores.PlasticPlate, Ores.GunmetalPlate).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Shotgun", "Damage per Pellet: 4", "Pellets per Shot: 10", "Cartridge: 12 Gauge Shotgun Shell", "Fire Rate: PUMP ACTION", "Rate of Fire: 10/100", "Inaccuracy Rating: Moderate")).withUnremovableAttachmentCategories(AttachmentCategory.GUARD).withUnremovableAttachmentCategories(AttachmentCategory.STOCK).withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER).withCompatibleAttachment(Attachments.Remington870Pump, true, model -> GL11.glScaled((double)1.1f, (double)1.0, (double)1.0)).withCompatibleAttachment(Attachments.Remington870Barrel, true, (player, stack) -> {}, model -> {
            if (model instanceof R870part) {
                GL11.glTranslatef((float)-0.14f, (float)-0.56f, (float)-5.49f);
                GL11.glScaled((double)0.5, (double)0.2f, (double)1.05f);
            }
        }).withCompatibleAttachment(Attachments.Remington870Stock, true, model -> {}).withCompatibleAttachment(Attachments.Remington870PoliceMagnumPump, model -> GL11.glScaled((double)1.1f, (double)1.0, (double)1.0)).withCompatibleAttachment(Attachments.Remington870SawedOffBarrel, (player, stack) -> {}, model -> {
            if (model instanceof M9A1frontsight) {
                GL11.glTranslatef((float)-0.092f, (float)-0.56f, (float)-3.2f);
                GL11.glScaled((double)0.1f, (double)0.2f, (double)0.2f);
            }
        }).withCompatibleAttachment(Attachments.Remington870SawedGrip, model -> {}).withCompatibleAttachment(Attachments.Remington870FABDefensePump, (player, stack) -> {}, model -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)0.03f, (float)0.06f, (float)-3.08f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)1.0, (double)0.45f);
            }
        }).withCompatibleAttachment(Attachments.Remington870MagpulPump, model -> GL11.glScaled((double)1.1f, (double)1.0, (double)1.0)).withCompatibleAttachment(Attachments.Remington870PoliceMagnumBarrel, (player, stack) -> {}, model -> {
            if (model instanceof M9A1frontsight) {
                GL11.glTranslatef((float)-0.092f, (float)-0.56f, (float)-4.4f);
                GL11.glScaled((double)0.1f, (double)0.2f, (double)0.2f);
            }
        }).withCompatibleAttachment(Attachments.Remington870PoliceMagnumStock, model -> {}).withCompatibleAttachment(Attachments.Remington870MilspecStock, (player, stack) -> {}, model -> {
            if (model instanceof MilSpecStock) {
                GL11.glTranslatef((float)0.0f, (float)0.62f, (float)1.1f);
                GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withCompatibleAttachment(Attachments.Remington870HK416Stock, (player, stack) -> {}, model -> {
            if (model instanceof HK416Stock) {
                GL11.glTranslatef((float)0.0f, (float)0.62f, (float)1.1f);
                GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withCompatibleAttachment(Attachments.ShotgunRail, model -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.156f, (float)-0.61f, (float)-1.1f);
                GL11.glScaled((double)0.55f, (double)0.4f, (double)0.4f);
            }
        }).withCompatibleAttachment(AuxiliaryAttachments.ShotgunShell, true, model -> {
            GL11.glTranslatef((float)-0.12f, (float)-0.08f, (float)-1.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
        }).withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef((float)-0.17f, (float)-0.73f, (float)-1.3f);
            GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
        }, model -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)0.12f, (float)-0.2f, (float)2.49f);
                GL11.glScaled((double)0.03f, (double)0.03f, (double)0.03f);
            }
        }).withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef((float)-0.25f, (float)-0.7f, (float)-0.2f);
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
        }, model -> {
            if (model instanceof AcogScope2) {
                GL11.glTranslatef((float)-0.018f, (float)-0.25f, (float)0.13f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof AcogReticle) {
                GL11.glTranslatef((float)0.243f, (float)-0.23f, (float)0.68f);
                GL11.glScaled((double)0.03f, (double)0.03f, (double)0.03f);
            }
        }).withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef((float)-0.14f, (float)-0.45f, (float)-0.6f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }, model -> {
            if (model instanceof Acog2) {
                GL11.glTranslatef((float)0.15f, (float)-1.035f, (float)1.513f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.HP, (player, stack) -> {
            GL11.glTranslatef((float)-0.26f, (float)-0.7f, (float)-0.3f);
            GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
        }, model -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)0.237f, (float)-0.215f, (float)1.155001f);
                GL11.glScaled((double)0.03f, (double)0.03f, (double)0.03f);
            }
        }).withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef((float)-0.02f, (float)-0.55f, (float)-0.7f);
            GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.7f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.58f, (float)-0.5f);
            GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.58f, (float)-0.5f);
            GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.5f, (float)-0.1f);
                GL11.glScaled((double)0.1f, (double)0.1f, (double)0.1f);
            }
        }).withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef((float)-0.24f, (float)-0.74f, (float)-0.9f);
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
        }, model -> {
            if (model instanceof Holo2) {
                GL11.glTranslatef((float)0.395f, (float)-0.33f, (float)-0.1f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef((float)-0.0f, (float)-0.58f, (float)-0.4f);
            GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.45f, (float)-0.85f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef((float)-0.14f, (float)-0.75f, (float)-0.5f);
            GL11.glScaled((double)0.38f, (double)0.38f, (double)0.38f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef((float)-0.14f, (float)-0.75f, (float)-0.5f);
            GL11.glScaled((double)0.38f, (double)0.38f, (double)0.38f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.4f, (float)-0.5f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withCompatibleAttachment(Attachments.Silencer12Gauge, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if (instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.RECEIVER, instance);
                if (activeAttachment == Attachments.Remington870SawedOffBarrel) {
                    GL11.glTranslatef((float)-0.19f, (float)-0.6f, (float)-5.5f);
                    GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
                } else if (activeAttachment == Attachments.Remington870PoliceMagnumBarrel) {
                    GL11.glTranslatef((float)-0.19f, (float)-0.6f, (float)-6.8f);
                    GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
                } else {
                    GL11.glTranslatef((float)-0.19f, (float)-0.6f, (float)-7.8f);
                    GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
                }
            }
        }, model -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.19f, (float)-0.6f, (float)-7.8f);
                GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
            }
        }, false, false).withCompatibleAttachment(Attachments.Grip2, model -> {
            GL11.glTranslatef((float)-0.155f, (float)0.45f, (float)-2.5f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withCompatibleAttachment(Attachments.StubbyGrip, model -> {
            GL11.glTranslatef((float)-0.155f, (float)0.45f, (float)-2.5f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withCompatibleAttachment(Attachments.VGrip, model -> {
            GL11.glTranslatef((float)-0.155f, (float)0.45f, (float)-2.5f);
            GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
        }).withCompatibleBullet(Bullets.Shotgun12Guage, model -> {}).withTextureNames("remington870").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new Remington870()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glTranslatef((float)1.0f, (float)0.8f, (float)0.0f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-0.9f, (float)0.4f, (float)1.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningLoadIterationCompleted(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-44.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.349999f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.35f, (float)-1.225f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.35f, (float)-0.525f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.25f, (float)0.25f, (float)-1.225f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.25f, (float)0.25f, (float)-0.525f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.25f, (float)0.21f, (float)-0.9f);
            GL11.glRotatef((float)-1.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.3f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                GL11.glTranslatef((float)0.0f, (float)0.25f, (float)0.8f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                GL11.glTranslatef((float)0.0f, (float)0.24f, (float)0.8f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                GL11.glTranslatef((float)0.0f, (float)0.28f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.27f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                GL11.glTranslatef((float)0.0f, (float)0.28f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.6f);
            }
        }).withFirstPersonCustomPositioning(Attachments.Remington870Pump.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.Remington870Pump.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioning(Attachments.Remington870PoliceMagnumPump.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.Remington870PoliceMagnumPump.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioning(Attachments.Remington870MagpulPump.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.Remington870MagpulPump.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioning(Attachments.Remington870FABDefensePump.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.Remington870FABDefensePump.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioning(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), renderContext -> {
            GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)1.4f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningEjectSpentRound(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)46.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.18f, (float)0.5f, (float)-1.0f);
        }, 110L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)46.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-4.3f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.18f, (float)0.5f, (float)-1.05f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)46.3f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-4.2f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.18f, (float)0.5f, (float)-1.02f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.18f, (float)0.45f, (float)-1.2f);
        }, 90L, 0L)).withFirstPersonCustomPositioningEjectSpentRound(Attachments.Remington870Pump.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRound(Attachments.Remington870PoliceMagnumPump.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRound(Attachments.Remington870MagpulPump.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRound(Attachments.Remington870FABDefensePump.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRound(Attachments.Grip2.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRound(Attachments.StubbyGrip.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRound(Attachments.VGrip.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.0f, (float)-0.3f, (float)0.5f), 170L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-1.9f, (float)1.0f, (float)0.5f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 150L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)1.0f, (float)5.0f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 150L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)1.0f, (float)5.0f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 150L, 50L)).withFirstPersonPositioningEjectSpentRoundAimed(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)0.35f, (float)-0.925f);
        }, 160L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-9.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)28.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)0.35f, (float)-0.645f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)27.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)0.35f, (float)-0.655f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)39.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)26.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)0.4f, (float)-0.855f);
        }, 80L, 0L)).withFirstPersonCustomPositioningEjectSpentRoundAimed(Attachments.Remington870Pump.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRoundAimed(Attachments.Remington870PoliceMagnumPump.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRoundAimed(Attachments.Remington870MagpulPump.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRoundAimed(Attachments.Remington870FABDefensePump.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 170L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.8f), 150L, 50L), new Transition<Object>(renderContext -> {}, 150L, 50L)).withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.0f, (float)-0.3f, (float)0.5f), 170L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-1.9f, (float)1.0f, (float)0.5f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 150L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)1.0f, (float)5.0f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 150L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)1.0f, (float)5.0f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 150L, 50L)).withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Remington870Pump.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> {}, 250L, 50L)).withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Remington870PoliceMagnumPump.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> {}, 250L, 50L)).withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Remington870MagpulPump.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> {}, 250L, 50L)).withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Remington870FABDefensePump.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.9f), 250L, 50L), new Transition<Object>(renderContext -> {}, 250L, 50L)).withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Grip2.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 250L, 50L), new Transition<Object>(renderContext -> {}, 250L, 50L)).withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.StubbyGrip.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 250L, 50L), new Transition<Object>(renderContext -> {}, 250L, 50L)).withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.VGrip.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.75f), 250L, 50L), new Transition<Object>(renderContext -> {}, 250L, 50L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)2.0f), 250L, 50L)).withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)2.0f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)2.0f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)2.0f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)2.0f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)2.0f), 250L, 50L)).withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.07f, (float)2.0f, (float)0.4f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.07f, (float)1.15f, (float)-0.15f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.1f, (float)0.45f, (float)0.3f);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.01f, (float)0.0f, (float)0.0f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.01f, (float)0.0f, (float)0.0f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.01f, (float)0.0f, (float)0.0f), 250L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)-0.01f, (float)-0.13f, (float)3.5f), 250L, 50L)).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.349999f);
        }, 250L, 0L)).withFirstPersonPositioningAllLoadIterationsCompleted(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.6f, (float)-1.45f);
        }, 290L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)46.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.55f, (float)-1.05f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)46.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-14.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.55f, (float)-1.05f);
        }, 50L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)46.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-11.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.55f, (float)-1.35f);
        }, 50L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-9.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.4f, (float)0.6f, (float)-1.4f);
        }, 110L, 0L)).withFirstPersonPositioningLoadIteration(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.349999f);
        }, 160L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-43.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.349999f);
        }, 140L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-44.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.359999f);
        }, 140L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-14.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-47.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.389999f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-12.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-43.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.379999f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-12.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.379999f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.675f, (float)0.175f, (float)-1.349999f);
        }, 180L, 0L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)-1.2f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)0.4f, (float)-1.2f);
        }, 350L, 600L)).withThirdPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.5f, (float)0.4f, (float)2.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 210L, 0L)).withThirdPersonCustomPositioningReloading(Attachments.Remington870Pump.getRenderablePart(), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 500L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f), 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)0.575f, (float)-1.1f);
        }, 160L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)0.475f, (float)-1.1f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.175f, (float)0.375f, (float)-1.45f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.35f, (float)-1.025f);
        }, 240L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.25f, (float)0.21f, (float)-1.1f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.4f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                GL11.glTranslatef((float)0.0f, (float)0.25f, (float)0.8f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                GL11.glTranslatef((float)0.0f, (float)0.24f, (float)0.8f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                GL11.glTranslatef((float)0.0f, (float)0.28f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.27f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                GL11.glTranslatef((float)0.0f, (float)0.28f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.6f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.6f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.5f, (float)-1.025f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.8f, (float)0.0f, (float)-1.6f);
        }).withFirstPersonPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.2f, (float)-0.2f, (float)-2.0f);
        }).withFirstPersonHandPositioning(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.47f, (float)0.19f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.275f, (float)-0.425f, (float)0.275f);
            }
        }, renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }).withFirstPersonHandPositioningProning(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.47f, (float)0.19f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.275f, (float)-0.425f, (float)0.275f);
            }
        }, renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }).withFirstPersonHandPositioningLoadIterationCompleted(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-130.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-85.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)-1.549999f, (float)0.075f);
        }, renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.4f, (float)-0.425f, (float)0.1f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.275f, (float)-0.425f, (float)0.275f);
            }
        }, renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-85.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.625f, (float)0.125f);
        }, renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }).withFirstPersonHandPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-85.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.7f, (float)0.125f);
        }, renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.875f, (float)-0.05f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-1.199999f, (float)0.175f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 1000L)).withFirstPersonLeftHandPositioningLoadIteration(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-1.199999f, (float)0.175f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.975f, (float)0.2f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.825f, (float)0.125f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.775f, (float)0.175f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.775f, (float)0.175f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.775f, (float)0.175f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-1.199999f, (float)0.175f);
            GL11.glTranslatef((float)0.07f, (float)0.1f, (float)-0.0f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningLoadIteration(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.47f, (float)0.19f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.3f, (float)-0.4f, (float)0.34f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.47f, (float)0.19f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.275f, (float)-0.425f, (float)0.275f);
            }
        }, 250L, 50L)).withFirstPersonRightHandPositioningAllLoadIterationsCompleted(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.675f, (float)-0.85f, (float)0.15f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningEjectSpentRound(new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.47f, (float)0.19f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.275f, (float)-0.425f, (float)0.275f);
            }
        }, 250L, 50L)).withFirstPersonRightHandPositioningEjectSpentRound(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningEjectSpentRoundAimed(new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.285f, (float)-0.65f, (float)0.25f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.125f, (float)-0.635f, (float)0.3f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.GRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Grip2 || activeAttachment == Attachments.StubbyGrip || activeAttachment == Attachments.VGrip) {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.425f, (float)-0.47f, (float)0.19f);
            } else {
                GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.275f, (float)-0.425f, (float)0.275f);
            }
        }, 250L, 50L)).withFirstPersonRightHandPositioningEjectSpentRoundAimed(new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            RenderContext rc = (RenderContext)renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.STOCK, rc.getWeaponInstance());
            if (activeAttachment == Attachments.Remington870SawedGrip) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.65f, (float)-0.925f, (float)0.425f);
            } else if (activeAttachment == Attachments.Remington870PoliceMagnumStock || activeAttachment == Attachments.Remington870MilspecStock || activeAttachment == Attachments.Remington870HK416Stock) {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.575f, (float)-0.925f, (float)0.3f);
            } else {
                GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)0.69f, (float)-0.905f, (float)0.185f);
            }
        }, 250L, 50L)).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)-0.65f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.525f, (float)0.075f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.6f, (float)-0.775f, (float)0.25f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.6f, (float)-0.775f, (float)0.25f);
        }, 250L, 50L)).withThirdPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.0f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.075f, (float)0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.0f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.075f, (float)0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.0f, (float)0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)0.05f, (float)0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.075f, (float)0.075f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)0.05f, (float)0.075f);
        }, 50L, 200L)).withThirdPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.125f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.125f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.025f, (float)-0.225f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.075f, (float)0.0f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.075f, (float)0.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.075f, (float)0.0f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.4f, (float)0.275f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.4f, (float)0.275f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.4f, (float)0.275f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.4f, (float)0.275f);
        }, 200L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.875f, (float)0.2f);
        }, 250L, 100L)).build()).withSpawnEntityDamage(4.0f).withSpawnEntityGravityVelocity(0.8f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw.items.guns;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.items.guns.GunFactory;
import com.vicmatskiv.mw.models.DesertEagleGun;
import com.vicmatskiv.mw.models.Reflex2;
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

public class DesertEagleFactory
implements GunFactory {
    @Override
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("desert_eagle").withFireRate(0.2f).withRecoil(9.0f).withZoom(0.9f).withMaxShots(1).withShootSound("desert_eagle").withSilencedShootSound("m9a1_silenced").withReloadSound("deagle_reload").withUnloadSound("pistol_unload").withInspectSound("inspection").withDrawSound("handgun_draw").withReloadingTime(50L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withFlashIntensity(0.5f).withFlashScale(() -> Float.valueOf(0.7f)).withFlashOffsetX(() -> Float.valueOf(0.13f)).withFlashOffsetY(() -> Float.valueOf(0.14f)).withInaccuracy(3.0f).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Semi-Automatic Pistol", "Damage: 15", "Cartridge: .50 AE", "Fire Rate: SEMI", "Rate of Fire: 20/100", "Magazines:", ".50 AE 7rnd Magazine")).withCrafting(CraftingComplexity.MEDIUM, Ores.PlasticPlate, Ores.GunmetalPlate).withScreenShaking(RenderableState.SHOOTING, 8.0f, 0.1f, 4.0f).withUnremovableAttachmentCategories(AttachmentCategory.GUARD).withUnremovableAttachmentCategories(AttachmentCategory.RAILING).withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP).withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT).withCompatibleAttachment(Attachments.PistolPlaceholder, true, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.19f, (float)-0.4f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withCompatibleAttachment(Attachments.DesertEagleBody, true, model -> {}).withCompatibleAttachment(Attachments.DesertEagleSlide, true, model -> {}).withCompatibleAttachment(Attachments.DesertEagleLongBody, model -> {}).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.DesertEagleMag, model -> {}).withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef((float)0.01f, (float)-0.59f, (float)-2.1f);
            GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)-4.0f);
        }).withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
            GL11.glTranslatef((float)-0.175f, (float)-1.1f, (float)-1.25f);
            GL11.glScaled((double)0.36f, (double)0.36f, (double)0.36f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)0.155f, (float)-0.1f, (float)-0.5f);
                GL11.glScaled((double)0.2f, (double)0.2f, (double)0.2f);
            }
        }).withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef((float)-0.05f, (float)-0.85f, (float)-1.6f);
            GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
        }, model -> {
            if (model instanceof Reflex2) {
                GL11.glTranslatef((float)-0.125f, (float)-0.68f, (float)-0.4f);
                GL11.glScaled((double)0.15f, (double)0.15f, (double)0.15f);
            }
        }).withTextureNames("deserteagle").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new DesertEagleGun()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glTranslatef((float)0.0f, (float)0.8f, (float)0.0f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            GL11.glTranslatef((float)-1.6f, (float)-1.0f, (float)1.8f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.BACKGRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.DesertEagleLongBody) {
                GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)-0.2f, (float)0.5f, (float)-2.1f);
            } else {
                GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)-0.1f, (float)0.6f, (float)-1.9f);
            }
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.BACKGRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.DesertEagleLongBody) {
                GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)-0.2f, (float)0.5f, (float)-1.4f);
                GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            } else {
                GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)-0.1f, (float)0.5f, (float)-1.2f);
                GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)14.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.45f, (float)-2.0f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)18.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.45f, (float)-1.8f);
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningCustomRecoiled(Attachments.DesertEagleSlide.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f)).withFirstPersonPositioningCustomZoomingRecoiled(Attachments.DesertEagleSlide.getRenderablePart(), renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f)).withFirstPersonCustomPositioning(Attachments.DesertEagleSlide.getRenderablePart(), renderContext -> {
            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f);
            }
        }).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.3f, (float)-0.425f);
        }, 300L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-62.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.2f, (float)-0.425f);
        }, 180L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-66.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.0f, (float)-0.425f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-66.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.0f, (float)-0.425f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-66.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.0f, (float)-0.425f);
        }, 90L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-66.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.0f, (float)-0.425f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-63.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)11.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.13f, (float)-0.425f);
        }, 230L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-62.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)11.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.14f, (float)-0.425f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-62.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)11.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.13f, (float)-0.425f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-52.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.1f, (float)-0.425f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-52.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.1f, (float)-0.425f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-52.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.1f, (float)-0.425f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-52.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.5f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.524999f, (float)1.1f, (float)-0.425f);
        }, 100L, 0L)).withFirstPersonPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)36.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.73f, (float)0.4f, (float)-1.8f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-17.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.73f, (float)1.1f, (float)-1.8f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-14.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.73f, (float)1.0f, (float)-1.8f);
        }, 120L, 0L)).withFirstPersonCustomPositioningReloading(Magazines.DesertEagleMag, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)3.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)0.8f, (float)0.15f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 270L, 50L), new Transition<Object>(renderContext -> {}, 270L, 50L), new Transition<Object>(renderContext -> {}, 270L, 50L), new Transition<Object>(renderContext -> {}, 70L, 0L), new Transition<Object>(renderContext -> {}, 70L, 0L), new Transition<Object>(renderContext -> {}, 70L, 0L), new Transition<Object>(renderContext -> {}, 70L, 0L)).withFirstPersonCustomPositioningUnloading(Magazines.DesertEagleMag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)1.0f, (float)0.4f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)1.7f, (float)0.4f), 250L, 1000L)).withFirstPersonCustomPositioningReloading(Attachments.DesertEagleSlide.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 300L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 200L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 200L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 200L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 200L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 200L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 270L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 270L, 50L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 270L, 50L), new Transition<Object>(renderContext -> {}, 70L, 0L), new Transition<Object>(renderContext -> {}, 70L, 0L), new Transition<Object>(renderContext -> {}, 70L, 0L), new Transition<Object>(renderContext -> {}, 70L, 0L)).withFirstPersonCustomPositioningUnloading(Attachments.DesertEagleSlide.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 250L, 1000L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.149999f, (float)0.575f, (float)-0.725f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)0.95f, (float)-1.075f);
        }, 350L, 600L)).withThirdPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.3f, (float)-1.0f, (float)3.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.3f, (float)-1.0f, (float)3.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.3f, (float)-1.0f, (float)3.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 130L, 10L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.3f, (float)-1.0f, (float)3.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.3f, (float)-1.0f, (float)3.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.3f, (float)-1.0f, (float)3.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.3f, (float)-1.0f, (float)3.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 270L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.3f, (float)-1.0f, (float)3.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 70L, 50L)).withThirdPersonCustomPositioningReloading(Attachments.DesertEagleSlide.getRenderablePart(), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.5f), 250L, 1000L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f), 250L, 1000L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.225f, (float)0.625f, (float)-1.424999f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.525f, (float)0.625f, (float)-1.424999f);
        }, 90L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)34.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.625f, (float)0.625f, (float)-1.424999f);
        }, 180L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)28.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.925f, (float)0.625f, (float)-1.424999f);
        }, 130L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glRotatef((float)-17.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.925f, (float)0.625f, (float)-1.424999f);
        }, 120L, 0L)).withFirstPersonCustomPositioningDrawing(Attachments.DesertEagleSlide.getRenderablePart(), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 150L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 130L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 200L, 0L), new Transition<Object>(renderContext -> GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.6f), 130L, 60L), new Transition<Object>(renderContext -> {}, 110L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)3.0, (double)3.0, (double)3.0);
            GL11.glTranslatef((float)0.35f, (float)0.5f, (float)-2.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                GL11.glTranslatef((float)0.0f, (float)0.11f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.21f, (float)0.0f);
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScaled((double)3.0, (double)3.0, (double)3.0);
            GL11.glTranslatef((float)0.35f, (float)0.5f, (float)-1.3f);
            GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                GL11.glTranslatef((float)0.0f, (float)0.11f, (float)0.0f);
            }
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                GL11.glTranslatef((float)0.0f, (float)0.21f, (float)0.0f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            RenderContext rc = renderContext;
            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.BACKGRIP, rc.getWeaponInstance());
            if (activeAttachment == Attachments.DesertEagleLongBody) {
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)-55.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-0.9f);
            } else {
                GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)7.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslatef((float)0.2f, (float)0.8f, (float)-2.1f);
            }
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScaled((double)3.0, (double)3.0, (double)3.0);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.374999f, (float)0.6f, (float)-1.449999f);
        }).withFirstPersonPositioningModifyingAlt(renderContext -> {
            GL11.glScaled((double)3.0, (double)3.0, (double)3.0);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.774999f, (float)0.1f, (float)-1.949999f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.8f, (float)0.075f);
        }, renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.8f, (float)0.075f);
        }, renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
        }).withFirstPersonHandPositioningRunning(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.8f, (float)0.075f);
        }, renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.125f, (float)0.4f);
        }, renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
        }).withFirstPersonHandPositioningModifyingAlt(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)110.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.75f, (float)0.025f);
        }, renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.55f, (float)0.125f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.61f, (float)-0.7f, (float)-0.025f);
        }, 300L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-75.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.26f, (float)-0.7f, (float)-0.025f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.775f, (float)0.025f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.775f, (float)0.025f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.775f, (float)0.025f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)-0.775f, (float)0.025f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.8f, (float)0.05f);
        }, 270L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.8f, (float)0.05f);
        }, 270L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.8f, (float)0.05f);
        }, 270L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.8f, (float)0.05f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.8f, (float)0.05f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.8f, (float)0.05f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.05f, (float)-0.8f, (float)0.05f);
        }, 70L, 0L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.125f);
        }, 300L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.125f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.125f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.125f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.125f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.125f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.55f, (float)0.15f);
        }, 270L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.55f, (float)0.15f);
        }, 270L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.55f, (float)0.15f);
        }, 270L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.535f, (float)0.14f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.535f, (float)0.14f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.535f, (float)0.14f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.4f, (float)-0.535f, (float)0.14f);
        }, 70L, 0L)).withFirstPersonLeftHandPositioningUnloading(new Transition<Object>(renderContext -> {
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
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.125f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.2f, (float)4.2f, (float)4.2f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.55f, (float)0.125f);
        }, 250L, 0L)).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.1f, (float)-0.8f, (float)0.075f);
        }, renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
        }).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.775f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.125f, (float)-0.775f, (float)0.125f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
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
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)-0.025f, (float)0.475f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)-0.025f, (float)0.475f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)-0.025f, (float)0.475f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)-0.025f, (float)0.475f);
        }, 130L, 60L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)-0.025f, (float)0.475f);
        }, 110L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.375f, (float)-0.525f, (float)0.175f);
        }, 280L, 0L)).build()).withSpawnEntityDamage(15.0f).withSpawnEntityGravityVelocity(0.02f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


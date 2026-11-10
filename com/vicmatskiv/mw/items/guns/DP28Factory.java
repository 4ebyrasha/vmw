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
import com.vicmatskiv.mw.models.DP28;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
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

public class DP28Factory {
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("dp28").withFireRate(0.5f).withRecoil(4.0f).withZoom(0.9f).withMaxShots(1, Integer.MAX_VALUE).withShootSound("dp28").withSilencedShootSound("ak15_silenced").withReloadSound("dp28_reload").withUnloadSound("dp28_unload").withInspectSound("inspection").withDrawSound("dp28_draw").withReloadingTime(45L).withCrosshair("gun").withCrosshairRunning("Running").withCrosshairZoomed("Sight").withFlashIntensity(0.5f).withFlashScale(() -> Float.valueOf(0.6f)).withFlashOffsetX(() -> Float.valueOf(0.09f)).withFlashOffsetY(() -> Float.valueOf(0.14f)).withShellCasingEjectEnabled(false).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Light Machine Gun", "Damage: 14", "Cartridge: 7.62x54mmR", "Fire Rate: SEMI, AUTO", "Rate of Fire: 50/100", "Magazines:", "47rnd 7.62x54mmR Magazine")).withCrafting(CraftingComplexity.HIGH, Ores.PlasticPlate, Ores.GunmetalPlate).withScreenShaking(RenderableState.SHOOTING, 2.5f, 2.0f, 6.0f).withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT).withCompatibleAttachment(Attachments.GripPlaceholder, true, model -> {
            GL11.glTranslatef((float)0.01f, (float)-0.19f, (float)-0.4f);
            GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
        }).withCompatibleAttachment((ItemAttachment<Weapon>)Magazines.DP28Mag, model -> {}).withCompatibleAttachment(AuxiliaryAttachments.Extra, true, model -> {
            if (model instanceof AKMiron1) {
                GL11.glTranslatef((float)0.125f, (float)-1.8f, (float)-0.5f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AKMiron2) {
                GL11.glTranslatef((float)0.011f, (float)-0.23f, (float)-3.78f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)1.0);
            } else if (model instanceof AK47iron) {
                GL11.glTranslatef((float)-0.031f, (float)-0.55f, (float)0.75f);
                GL11.glScaled((double)0.7f, (double)0.6f, (double)0.6f);
            } else if (model instanceof M4Iron1) {
                GL11.glTranslatef((float)0.155f, (float)-1.74f, (float)1.0f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof M4Iron2) {
                GL11.glTranslatef((float)0.26f, (float)-1.55f, (float)-2.35f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof P90iron) {
                GL11.glTranslatef((float)0.26f, (float)-1.55f, (float)-2.35f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
            if (model instanceof G36CIron1) {
                GL11.glTranslatef((float)-0.04f, (float)-1.216f, (float)-1.65f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else if (model instanceof G36CIron2) {
                GL11.glTranslatef((float)-0.18f, (float)-1.19f, (float)-5.63f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof ScarIron1) {
                GL11.glTranslatef((float)0.165f, (float)-1.65f, (float)1.0f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof ScarIron2) {
                GL11.glTranslatef((float)0.25f, (float)-1.55f, (float)-2.0f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof FALIron) {
                GL11.glTranslatef((float)0.093f, (float)-0.28f, (float)-3.78f);
                GL11.glScaled((double)0.08f, (double)0.2f, (double)0.6f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else if (model instanceof M14Iron) {
                GL11.glTranslatef((float)0.129f, (float)-1.63f, (float)-2.08f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof MP5Iron) {
                GL11.glTranslatef((float)-0.101f, (float)-1.27f, (float)-0.18f);
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withCompatibleAttachment(Attachments.Bipod, model -> {
            GL11.glTranslatef((float)0.0f, (float)1.0f, (float)-3.5f);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }).withTextureNames("gun").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new DP28()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.28f, (double)0.28f, (double)0.28f);
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)-1.2f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-0.8f, (float)0.2f, (float)0.8f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.624999f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.224999f);
            GL11.glRotatef((float)-0.5f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningProning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.45f, (float)0.025f, (float)-1.624999f);
        }).withFirstPersonPositioningProningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.45f, (float)0.025f, (float)-1.224999f);
            GL11.glRotatef((float)-0.7f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)38.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.624999f);
        }, 400L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)41.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.624999f);
        }, 300L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.624999f);
        }, 300L, 50L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.624999f);
        }, 170L, 100L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)41.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.025f, (float)-1.524999f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)41.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.324999f);
        }, 200L, 0L)).withFirstPersonPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.624999f);
        }, 240L, 100L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.624999f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.624999f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.624999f);
        }, 280L, 0L)).withFirstPersonCustomPositioningReloading(Magazines.DP28Mag, new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)2.6f, (float)2.5f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.45f, (float)-0.12f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.24f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {}, 250L, 1000L)).withFirstPersonCustomPositioningUnloading(Magazines.DP28Mag, new Transition<Object>(renderContext -> {}, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.24f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.45f, (float)-0.12f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)2.6f, (float)2.5f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }, 250L, 1000L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.3f, (float)-0.175f, (float)-1.5f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)0.325f, (float)-1.274999f);
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
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 300L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 120L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-2.2f, (float)-2.0f, (float)2.7f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }, 120L, 0L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.624999f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.125f, (float)-1.624999f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.225f, (float)-1.624999f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)41.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)17.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.325f, (float)-1.624999f);
        }, 240L, 100L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.3f, (float)0.265f, (float)-1.624999f);
        }, 100L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.27f, (float)-1.3f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                GL11.glTranslatef((float)0.0f, (float)0.19f, (float)0.5f);
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glTranslatef((float)0.15f, (float)-0.27f, (float)-1.0f);
            GL11.glRotatef((float)-0.1f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                GL11.glTranslatef((float)0.0f, (float)0.19f, (float)0.45f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.45f, (float)0.499999f, (float)-1.125f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.3f, (float)-0.175f, (float)-1.5f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.5f, (float)0.35f);
        }, renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }).withFirstPersonHandPositioningProning(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.5f, (float)0.35f);
        }, renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.5f, (float)0.35f);
        }, renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.5f, (float)0.35f);
        }, renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-1.349999f, (float)-0.025f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)-0.975f, (float)0.1f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)-0.875f, (float)0.175f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.175f, (float)-0.925f, (float)0.1f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.725f, (float)0.675f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)-0.75f, (float)0.5f);
        }, 250L, 0L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 280L, 0L)).withFirstPersonLeftHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-115.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.175f, (float)-0.925f, (float)0.1f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)-0.875f, (float)0.175f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)-0.975f, (float)0.1f);
        }, 50L, 200L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-1.349999f, (float)-0.025f);
        }, 50L, 200L)).withFirstPersonRightHandPositioningUnloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 250L, 1000L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.5f, (float)0.35f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.5f, (float)0.35f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
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
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.75f, (float)0.275f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.75f, (float)0.275f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.125f, (float)-0.925f, (float)0.1f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.175f, (float)-0.825f, (float)-0.05f);
        }, 250L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.2f, (float)-0.825f, (float)0.1f);
        }, 300L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 280L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.825f, (float)-1.025f, (float)0.2f);
        }, 280L, 0L)).build()).withSpawnEntityDamage(7.0f).withSpawnEntityGravityVelocity(0.0118f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


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
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G2Contender;
import com.vicmatskiv.mw.models.G2ContenderBarrelShort;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import java.util.Arrays;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class G2ContenderFactory
implements GunFactory {
    @Override
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder().withModId("mw").withName("g2_contender").withAmmoCapacity(1).withFireRate(0.3f).withRecoil(9.0f).withZoom(0.9f).withMaxShots(1).withShootSound("g2contender").withSilencedShootSound("ShotgunSilenced").withReloadSound("g2contender_reload").withDrawSound("noaction_draw").withReloadingTime(15L).withCrosshair("gun").withCrosshairRunning("Running").withShellCasingEjectEnabled(false).withCrosshairZoomed("Sight").withFlashIntensity(0.5f).withFlashScale(() -> Float.valueOf(0.6f)).withFlashOffsetX(() -> Float.valueOf(0.09f)).withFlashOffsetY(() -> Float.valueOf(0.09f)).withCrafting(CraftingComplexity.HIGH, Ores.PlasticPlate, Ores.GunmetalPlate).withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withInformationProvider(stack -> Arrays.asList("Type: Break-Action", "Damage: 20", "Cartridge: .45-70 Government", "Fire Rate: SEMI", "Rate of Fire: 30/100")).withScreenShaking(RenderableState.SHOOTING, 3.0f, 2.0f, 6.0f).withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT).withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP).withCompatibleAttachment(Attachments.G2ContenderBarrelShort, true, model -> {
            if (model instanceof G2ContenderBarrelShort) {
                GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)0.0f);
            } else if (model instanceof AK47iron) {
                GL11.glTranslatef((float)-0.175f, (float)-0.9f, (float)-0.3f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof FALIron) {
                GL11.glTranslatef((float)-0.07f, (float)-0.6f, (float)-2.7f);
                GL11.glScaled((double)0.1f, (double)0.3f, (double)0.6f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
        }).withCompatibleAttachment(Attachments.G2ContenderBarrelLong, model -> {
            if (model instanceof G2ContenderBarrelShort) {
                GL11.glTranslatef((float)0.0f, (float)-0.0f, (float)0.0f);
            } else if (model instanceof AK47iron) {
                GL11.glTranslatef((float)-0.175f, (float)-0.9f, (float)-0.3f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof FALIron) {
                GL11.glTranslatef((float)-0.07f, (float)-0.6f, (float)-5.0f);
                GL11.glScaled((double)0.1f, (double)0.3f, (double)0.6f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.16f, (float)-0.65f, (float)-2.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withCompatibleAttachment(Attachments.G2ContenderGrip, true, model -> GL11.glScaled((double)1.0, (double)1.0, (double)1.0)).withCompatibleAttachment(Attachments.G2ContenderStock, model -> GL11.glScaled((double)1.0, (double)1.0, (double)1.0)).withCompatibleAttachment(AuxiliaryAttachments.BulletSmall, true, model -> {
            GL11.glTranslatef((float)-0.14f, (float)-0.44f, (float)0.03f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        }).withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef((float)-0.115f, (float)-0.57f, (float)-2.0f);
            GL11.glScaled((double)0.48f, (double)0.48f, (double)0.48f);
        }, model -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)0.076f, (float)-0.67f, (float)4.0251f);
                GL11.glScaled((double)0.04f, (double)0.04f, (double)0.04f);
            }
        }).withCompatibleBullet(Bullets.Bullet4570, model -> {}).withTextureNames("g2contender").withRenderer(new WeaponRenderer.Builder().withModId("mw").withModel(new G2Contender()).withEntityPositioning(itemStack -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)4.0f);
        }).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            GL11.glTranslatef((float)1.0f, (float)0.8f, (float)0.0f);
            GL11.glRotatef((float)-120.0f, (float)-0.5f, (float)7.0f, (float)3.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-1.3f, (float)-0.1f, (float)1.3f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glTranslatef((float)-0.15f, (float)0.335f, (float)-1.049999f);
        }).withFirstPersonPositioningRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glTranslatef((float)-0.15f, (float)0.335f, (float)-0.349999f);
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonCustomPositioning(Attachments.G2ContenderBarrelShort.getRenderablePart(), renderContext -> {}).withFirstPersonCustomPositioning(AuxiliaryAttachments.BulletSmall.getRenderablePart(), renderContext -> {}).withFirstPersonPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.32f, (float)-0.95f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.33f, (float)-0.95f);
        }, 40L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-4.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.325f, (float)-0.95f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.43f, (float)-1.0f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)3.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.4f, (float)-0.98f);
        }, 40L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)2.7f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.4f, (float)-0.92f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.4f, (float)-0.95f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)36.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.4f, (float)-0.95f);
        }, 220L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)36.5f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.4f, (float)-0.95f);
        }, 180L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.4f, (float)-0.95f);
        }, 110L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-8.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.41f, (float)-0.95f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-9.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.41f, (float)-0.95f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.38f, (float)-0.95f);
        }, 70L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)3.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.38f, (float)-0.95f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-1.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)37.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.38f, (float)-0.95f);
        }, 80L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-2.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.4f, (float)-0.95f);
        }, 180L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.4f, (float)-0.95f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-13.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.38f, (float)-0.9f);
        }, 100L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.34f, (float)-0.94f);
        }, 40L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-10.5f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-4.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.35f, (float)-0.95f);
        }, 60L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-11.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.15f, (float)0.35f, (float)-0.95f);
        }, 80L, 0L)).withFirstPersonCustomPositioningReloading(Attachments.G2ContenderBarrelShort.getRenderablePart(), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L)).withFirstPersonCustomPositioningReloading(Attachments.G2ContenderBarrelLong.getRenderablePart(), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L)).withFirstPersonCustomPositioningReloading(Attachments.LeupoldRailScope.getRenderablePart(), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)2.4f, (float)0.2f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L)).withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.BulletSmall.getRenderablePart(), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {}, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.7f, (float)1.0f);
            GL11.glRotatef((float)30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.7f, (float)0.7f);
            GL11.glRotatef((float)-35.0f, (float)1.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.8f, (float)1.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)-0.2f, (float)-0.8f, (float)2.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.8f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)25.0f, (float)1.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.5f, (float)0.2f, (float)0.8f);
            GL11.glRotatef((float)25.0f, (float)1.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.35f, (float)-0.15f, (float)0.5f);
            GL11.glRotatef((float)25.0f, (float)1.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.24f, (float)0.23f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.24f, (float)0.23f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.105f, (float)0.005f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.105f, (float)0.005f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.105f, (float)0.005f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.105f, (float)0.005f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glTranslatef((float)0.0f, (float)-0.105f, (float)0.005f);
            GL11.glRotatef((float)35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L), new Transition<Object>(renderContext -> {}, 260L, 0L)).withFirstPersonPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.475f, (float)0.15f, (float)-0.95f);
        }, 300L, 600L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.375f, (float)0.7f, (float)-0.825f);
        }, 350L, 600L)).withFirstPersonPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)13.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)9.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.2f, (float)0.7f, (float)-1.4f);
        }, 160L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)9.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)6.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.2f, (float)0.5f, (float)-1.4f);
        }, 210L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)4.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.2f, (float)0.4f, (float)-1.4f);
        }, 270L, 0L), new Transition<Object>(renderContext -> {
            GL11.glRotatef((float)43.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)8.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-2.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)-0.2f, (float)0.45f, (float)-1.4f);
        }, 240L, 0L)).withFirstPersonPositioningZooming(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.25f, (float)0.23f, (float)-1.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                GL11.glTranslatef((float)0.0f, (float)0.27f, (float)1.0f);
            }
        }).withFirstPersonPositioningZoomingRecoiled(renderContext -> {
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glTranslatef((float)0.25f, (float)0.23f, (float)-0.4f);
            GL11.glRotatef((float)-5.0f, (float)1.0f, (float)0.0f, (float)1.0f);
            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                GL11.glTranslatef((float)0.0f, (float)0.27f, (float)0.5f);
            }
        }).withFirstPersonPositioningRunning(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)0.6f, (float)-0.6f);
        }).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)0.1f, (float)-1.324999f);
        }).withFirstPersonHandPositioning(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.16f, (float)-0.525f, (float)0.25f);
        }, renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.7f, (float)0.35f);
        }).withFirstPersonHandPositioningRunning(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.16f, (float)-0.525f, (float)0.25f);
        }, renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.475f, (float)-0.675f, (float)0.325f);
        }).withFirstPersonHandPositioningZooming(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.16f, (float)-0.525f, (float)0.25f);
        }, renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.535f, (float)-0.7f, (float)0.275f);
        }).withFirstPersonHandPositioningModifying(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.075f, (float)0.175f, (float)0.45f);
        }, renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.475f, (float)-0.675f, (float)0.325f);
        }).withFirstPersonLeftHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.6f, (float)0.2f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.6f, (float)0.2f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.025f, (float)-0.6f, (float)0.2f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)-0.525f, (float)0.225f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)-0.525f, (float)0.225f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)-0.525f, (float)0.225f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)-0.525f, (float)0.225f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.125f, (float)0.425f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.35f, (float)-1.1f, (float)0.175f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.42f, (float)-0.975f, (float)0.025f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.37f, (float)-0.765f, (float)0.175f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.37f, (float)-0.765f, (float)0.175f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.27f, (float)-0.725f, (float)0.235f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.27f, (float)-0.725f, (float)0.235f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.27f, (float)-0.725f, (float)0.235f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)-0.375f, (float)0.225f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.5f, (float)2.5f, (float)2.5f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)-0.4f, (float)0.225f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.45f, (float)0.24f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.45f, (float)0.24f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.45f, (float)0.24f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-95.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.45f, (float)0.24f);
        }, 260L, 0L)).withFirstPersonRightHandPositioningReloading(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 120L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)3.5f, (float)3.5f, (float)3.5f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)35.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.543f, (float)-0.825f, (float)0.185f);
        }, 260L, 0L)).withFirstPersonLeftHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 250L, 50L)).withFirstPersonRightHandPositioningInspecting(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.925f, (float)0.03f);
        }, 250L, 50L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.925f, (float)0.03f);
        }, 250L, 50L)).withFirstPersonLeftHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 200L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)4.0f, (float)4.0f, (float)4.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.675f, (float)0.125f);
        }, 200L, 0L)).withFirstPersonRightHandPositioningDrawing(new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.925f, (float)0.03f);
        }, 150L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.925f, (float)0.03f);
        }, 130L, 0L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.925f, (float)0.03f);
        }, 250L, 100L), new Transition<Object>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.7f, (float)-0.925f, (float)0.03f);
        }, 250L, 100L)).build()).withSpawnEntityDamage(20.0f).withSpawnEntityGravityVelocity(0.8f).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


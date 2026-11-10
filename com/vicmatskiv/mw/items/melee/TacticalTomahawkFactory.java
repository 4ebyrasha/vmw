/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw.items.melee;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.items.melee.MeleeFactory;
import com.vicmatskiv.mw.models.TacticalTomahawk;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeRenderer;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class TacticalTomahawkFactory
implements MeleeFactory {
    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder().withModId("mw").withName("tactical_tomahawk").withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withTextureNames("tacticaltomahawk").withAttackDamage(5.0f).withHeavyAttackDamage(10.0f).withPrepareStubTimeout(() -> 0).withPrepareHeavyStubTimeout(() -> 390).withAttackCooldownTimeout(() -> 0).withHeavyAttackCooldownTimeout(() -> 0).withAttackSound("swoosh").withHeavyAttackSound("swoosh").withRenderer(new MeleeRenderer.Builder().withModId("mw").withModel(new TacticalTomahawk()).withAnimationDuration(400).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            GL11.glTranslatef((float)1.0f, (float)2.0f, (float)-1.8f);
            GL11.glRotatef((float)80.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glTranslatef((float)-1.7f, (float)-1.0f, (float)1.8f);
            GL11.glRotatef((float)10.0f, (float)1.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-145.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-70.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }).withFirstPersonPositioning(context -> {
            GL11.glScalef((float)0.7f, (float)0.7f, (float)0.7f);
            GL11.glRotatef((float)50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-2.0f, (float)0.4f, (float)1.41f);
        }).withFirstPersonHandPositioning(context -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.225f, (float)-0.45f, (float)0.025f);
        }, context -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.17f, (float)-0.43f, (float)0.2f);
        }).withFirstPersonPositioningHeavyAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)0.7f, (float)0.7f, (float)0.7f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.4f, (float)-3.199999f, (float)-0.075f);
        }, 320L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)0.7f, (float)0.7f, (float)0.7f);
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.4f, (float)-1.5f, (float)1.125f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)0.7f, (float)0.7f, (float)0.7f);
            GL11.glRotatef((float)25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-2.0f, (float)-2.1f, (float)1.225f);
        }, 40L, 0L)).withFirstPersonLeftHandPositioningHeavyAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.475f, (float)0.15f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.475f, (float)0.15f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.475f, (float)0.15f);
        }, 70L, 0L)).withFirstPersonRightHandPositioningHeavyAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-150.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.4f, (float)-0.225f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-65.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.4f, (float)0.1f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.275f, (float)-0.275f, (float)0.125f);
        }, 70L, 0L)).withFirstPersonPositioningAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-110.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)1.699999f, (float)0.25f, (float)-1.624999f);
        }, 120L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-110.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)1.699999f, (float)0.25f, (float)-2.0f);
        }, 50L, 0L)).withFirstPersonLeftHandPositioningAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-125.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.525f, (float)0.175f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-120.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.525f, (float)0.175f);
        }, 70L, 0L)).withFirstPersonRightHandPositioningAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-140.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.15f, (float)0.325f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-130.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.1f, (float)0.2f);
        }, 70L, 0L)).withFirstPersonPositioningModifying(renderContext -> {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)5.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.725f, (float)-1.299999f, (float)0.8f);
        }).withFirstPersonHandPositioningModifying(context -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.05f, (float)-0.425f, (float)0.1f);
        }, context -> {
            GL11.glScalef((float)4.5f, (float)4.5f, (float)4.5f);
            GL11.glRotatef((float)-120.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.3f, (float)-0.4f, (float)0.25f);
        }).build()).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


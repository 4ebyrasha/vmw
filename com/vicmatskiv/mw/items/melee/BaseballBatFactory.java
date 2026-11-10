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
import com.vicmatskiv.mw.models.Bat;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeRenderer;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class BaseballBatFactory
implements MeleeFactory {
    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder().withModId("mw").withName("baseball_bat").withCreativeTab(ModernWarfareMod.AssaultRiflesTab).withTextureNames("bat").withAttackDamage(3.0f).withHeavyAttackDamage(7.0f).withPrepareStubTimeout(() -> 0).withPrepareHeavyStubTimeout(() -> 0).withAttackCooldownTimeout(() -> 0).withHeavyAttackCooldownTimeout(() -> 0).withAttackSound("swoosh").withHeavyAttackSound("swoosh").withRenderer(new MeleeRenderer.Builder().withModId("mw").withModel(new Bat()).withAnimationDuration(300).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            GL11.glTranslatef((float)1.0f, (float)1.3f, (float)-1.3f);
            GL11.glRotatef((float)230.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            GL11.glTranslatef((float)-0.6f, (float)-0.8f, (float)0.4f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)70.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(context -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)-35.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.249999f, (float)0.375f, (float)-1.0f);
        }).withFirstPersonHandPositioning(context -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)65.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.35f, (float)-0.075f, (float)0.025f);
        }, context -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-130.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.075f, (float)-0.3f, (float)-0.275f);
        }).withFirstPersonPositioningHeavyAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.249999f, (float)0.0f, (float)-2.0f);
        }, 60L, 0L)).withFirstPersonLeftHandPositioningHeavyAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)85.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.45f, (float)-0.4f, (float)-0.05f);
        }, 50L, 0L)).withFirstPersonRightHandPositioningHeavyAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-110.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.25f, (float)-0.25f, (float)-0.5f);
        }, 70L, 0L)).withFirstPersonPositioningAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
            GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.7f, (float)-0.175f, (float)-1.8f);
        }, 60L, 0L)).withFirstPersonLeftHandPositioningAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-135.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.6f, (float)0.475f);
        }, 70L, 0L)).withFirstPersonRightHandPositioningAttacking(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)5.0f, (float)5.0f, (float)5.0f);
            GL11.glRotatef((float)-120.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)0.025f, (float)0.325f);
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


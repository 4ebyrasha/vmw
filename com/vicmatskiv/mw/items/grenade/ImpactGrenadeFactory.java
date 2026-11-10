/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw.items.grenade;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.items.grenade.GrenadeFactory;
import com.vicmatskiv.mw.models.ImpactGrenade;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.grenade.GrenadeRenderer;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import org.lwjgl.opengl.GL11;

public class ImpactGrenadeFactory
implements GrenadeFactory {
    @Override
    public ItemGrenade createGrenade(CommonProxy commonProxy) {
        return new ItemGrenade.Builder().withModId("mw").withName("ImpactGrenade").withCreativeTab(ModernWarfareMod.GrenadesTab).withTextureNames("ImpactGrenade").withExplosionSound("grenadeexplosion").withExplosionStrength(3.0f).withBounceSoftSound("grenade-soft-bounce").withBounceHardSound("grenade-hard-bounce").withEffectiveRadius(15.0f).withFragmentCount(1500).withFragmentDamage(30.0f).withVelocity(() -> Float.valueOf(1.3f)).withGravityVelocity(() -> Float.valueOf(0.06f)).withRotationSlowdownFactor(() -> Float.valueOf(0.99f)).withExplosionOnImpact().withDestroyingBlocks(false).withRenderer(new GrenadeRenderer.Builder().withModId("mw").withModel(new ImpactGrenade()).withAnimationDuration(500).withThrownEntityPositioning(() -> {
            GL11.glScalef((float)0.2f, (float)0.2f, (float)0.2f);
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        }).withEntityRotationCenterOffsets(() -> Float.valueOf(-0.025f), () -> Float.valueOf(0.2f), () -> Float.valueOf(-0.025f)).withInventoryPositioning(itemStack -> {
            GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            GL11.glTranslatef((float)1.0f, (float)1.3f, (float)-1.3f);
            GL11.glRotatef((float)230.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withThirdPersonPositioning(renderContext -> {
            GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            GL11.glTranslatef((float)-3.0f, (float)-1.0f, (float)3.0f);
            GL11.glRotatef((float)-225.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }).withFirstPersonPositioning(context -> {
            GL11.glScalef((float)0.4f, (float)0.4f, (float)0.4f);
            GL11.glRotatef((float)25.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-3.0f, (float)-0.6f, (float)-2.2f);
        }).withFirstPersonHandPositioning(context -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-0.525f, (float)0.425f);
        }, context -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)-0.3f, (float)0.1f);
        }).withFirstPersonPositioningThrowing(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glScalef((float)0.1f, (float)0.1f, (float)0.1f);
            GL11.glRotatef((float)-40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)-6.849998f, (float)-2.4f);
        }, 260L, 120L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.475f, (float)-0.75f, (float)-0.075f);
            GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
        }, 80L, 80L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)155.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.475f, (float)-0.75f, (float)0.075f);
        }, 80L, 80L)).withFirstPersonLeftHandPositioningThrowing(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-1.025f, (float)0.225f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-105.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)75.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.175f, (float)-1.025f, (float)0.225f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)80.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.225f, (float)-0.975f, (float)0.55f);
        }, 70L, 0L)).withFirstPersonRightHandPositioningThrowing(new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-150.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.5f, (float)-0.2f, (float)-0.3f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-5.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.25f, (float)-0.5f, (float)-0.3f);
        }, 70L, 0L), new Transition<RenderContext>(renderContext -> {}, 70L, 0L)).withFirstPersonHandPositioningThrown(context -> {
            GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
            GL11.glRotatef((float)-85.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)55.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)0.1f, (float)-0.725f, (float)0.7f);
        }, context -> {}).build()).build(ModernWarfareMod.MOD_CONTEXT);
    }
}


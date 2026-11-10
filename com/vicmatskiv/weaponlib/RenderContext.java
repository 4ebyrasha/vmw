/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  org.lwjgl.util.vector.Matrix4f
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.animation.MatrixHelper;
import com.vicmatskiv.weaponlib.animation.PartPositionProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTransformType;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.util.vector.Matrix4f;

public class RenderContext<RS>
implements PartPositionProvider {
    private EntityLivingBase player;
    private ItemStack itemStack;
    private float limbSwing;
    private float flimbSwingAmount;
    private float ageInTicks;
    private float netHeadYaw;
    private float headPitch;
    private float scale;
    private float transitionProgress;
    private CompatibleTransformType compatibleTransformType;
    private RS fromState;
    private RS toState;
    private ModContext modContext;
    private PlayerItemInstance<?> playerItemInstance;
    private Map<Part, Matrix4f> attachablePartPositions;

    public RenderContext(ModContext modContext, EntityLivingBase player, ItemStack itemStack) {
        this.modContext = modContext;
        this.player = player;
        this.itemStack = itemStack;
        this.attachablePartPositions = new HashMap<Part, Matrix4f>();
    }

    public ModContext getModContext() {
        return this.modContext;
    }

    public float getLimbSwing() {
        return this.limbSwing;
    }

    public void setLimbSwing(float limbSwing) {
        this.limbSwing = limbSwing;
    }

    public float getFlimbSwingAmount() {
        return this.flimbSwingAmount;
    }

    public void setFlimbSwingAmount(float flimbSwingAmount) {
        this.flimbSwingAmount = flimbSwingAmount;
    }

    public float getAgeInTicks() {
        return this.ageInTicks;
    }

    public void setAgeInTicks(float ageInTicks) {
        this.ageInTicks = ageInTicks;
    }

    public float getNetHeadYaw() {
        return this.netHeadYaw;
    }

    public void setNetHeadYaw(float netHeadYaw) {
        this.netHeadYaw = netHeadYaw;
    }

    public float getHeadPitch() {
        return this.headPitch;
    }

    public void setHeadPitch(float headPitch) {
        this.headPitch = headPitch;
    }

    public float getScale() {
        return this.scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public void setPlayer(EntityPlayer player) {
        this.player = player;
    }

    public void setWeapon(ItemStack weapon) {
        this.itemStack = weapon;
    }

    public EntityLivingBase getPlayer() {
        return this.player;
    }

    public ItemStack getWeapon() {
        return this.itemStack;
    }

    public CompatibleTransformType getCompatibleTransformType() {
        return this.compatibleTransformType;
    }

    public void setCompatibleTransformType(CompatibleTransformType compatibleTransformType) {
        this.compatibleTransformType = compatibleTransformType;
    }

    public RS getFromState() {
        return this.fromState;
    }

    public void setFromState(RS fromState) {
        this.fromState = fromState;
    }

    public RS getToState() {
        return this.toState;
    }

    public void setToState(RS toState) {
        this.toState = toState;
    }

    public float getTransitionProgress() {
        return this.transitionProgress;
    }

    public void setTransitionProgress(float transitionProgress) {
        this.transitionProgress = transitionProgress;
    }

    public PlayerItemInstance<?> getPlayerItemInstance() {
        return this.playerItemInstance;
    }

    public void setPlayerItemInstance(PlayerItemInstance<?> playerItemInstance) {
        this.playerItemInstance = playerItemInstance;
    }

    public PlayerWeaponInstance getWeaponInstance() {
        if (this.playerItemInstance instanceof PlayerWeaponInstance) {
            return (PlayerWeaponInstance)this.playerItemInstance;
        }
        PlayerItemInstance<?> itemInstance = this.modContext.getPlayerItemInstanceRegistry().getItemInstance(this.player, this.itemStack);
        if (itemInstance instanceof PlayerWeaponInstance) {
            return (PlayerWeaponInstance)itemInstance;
        }
        return null;
    }

    public void capturePartPosition(Part part) {
        this.attachablePartPositions.put(part, MatrixHelper.captureMatrix());
    }

    @Override
    public Matrix4f getPartPosition(Object part) {
        if (part == null) {
            part = Part.MAIN_ITEM;
        }
        return this.attachablePartPositions.get(part);
    }
}


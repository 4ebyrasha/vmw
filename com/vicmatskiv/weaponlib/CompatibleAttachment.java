/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class CompatibleAttachment<T> {
    private ItemAttachment<T> attachment;
    private Consumer<ModelBase> modelPositioning;
    private Object positioning;
    private boolean isDefault;
    private boolean isPermanent;
    private ItemAttachment.ApplyHandler2<T> applyHandler;
    private ItemAttachment.ApplyHandler2<T> removeHandler;
    ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> meleeApplyHandler;
    ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> meleeRemoveHandler;

    public CompatibleAttachment(ItemAttachment<T> attachment, Object positioning, Consumer<ModelBase> modelPositioning, boolean isDefault, boolean isPermanent) {
        this.attachment = attachment;
        this.positioning = positioning;
        this.modelPositioning = modelPositioning;
        this.isDefault = isDefault;
        this.isPermanent = isPermanent;
    }

    public CompatibleAttachment(ItemAttachment<T> attachment, BiConsumer<EntityLivingBase, ItemStack> positioning, Consumer<ModelBase> modelPositioning, boolean isDefault) {
        this(attachment, positioning, modelPositioning, isDefault, false);
    }

    public CompatibleAttachment(ItemAttachment<T> attachment, Consumer<RenderContext<RenderableState>> positioning, boolean isDefault, boolean isPermanent) {
        this(attachment, positioning, null, isDefault, false);
    }

    public CompatibleAttachment(ItemAttachment<T> attachment, ItemAttachment.ApplyHandler2<T> applyHandler, ItemAttachment.ApplyHandler2<T> removeHandler) {
        this.attachment = attachment;
        this.applyHandler = applyHandler;
        this.removeHandler = removeHandler;
    }

    public CompatibleAttachment(ItemAttachment<T> attachment, ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> meleeApplyHandler, ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> meleeRemoveHandler) {
        this.attachment = attachment;
        this.meleeApplyHandler = meleeApplyHandler;
        this.meleeRemoveHandler = meleeRemoveHandler;
    }

    public CompatibleAttachment(ItemAttachment<T> attachment, Consumer<ModelBase> positioning) {
        this(attachment, null, positioning, false);
    }

    public CompatibleAttachment(ItemAttachment<T> attachment, Consumer<ModelBase> positioning, boolean isDefault) {
        this.attachment = attachment;
        this.modelPositioning = positioning;
        this.isDefault = isDefault;
    }

    public ItemAttachment<T> getAttachment() {
        return this.attachment;
    }

    public Consumer<ModelBase> getModelPositioning() {
        return this.modelPositioning;
    }

    public Object getPositioning() {
        return this.positioning;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public ItemAttachment.ApplyHandler2<T> getApplyHandler() {
        return this.applyHandler;
    }

    public ItemAttachment.ApplyHandler2<T> getRemoveHandler() {
        return this.removeHandler;
    }

    public ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> getMeleeApplyHandler() {
        return this.meleeApplyHandler;
    }

    public ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> getMeleeRemoveHandler() {
        return this.meleeRemoveHandler;
    }

    public boolean isPermanent() {
        return this.isPermanent;
    }
}


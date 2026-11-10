/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.CustomRenderer;
import com.vicmatskiv.weaponlib.ModelSource;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.Tuple;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItem;
import com.vicmatskiv.weaponlib.melee.PlayerMeleeInstance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemAttachment<T>
extends CompatibleItem
implements ModelSource {
    private AttachmentCategory category;
    private String crosshair;
    private ApplyHandler<T> apply;
    private ApplyHandler<T> remove;
    protected ApplyHandler2<T> apply2;
    protected ApplyHandler2<T> remove2;
    protected MeleeWeaponApplyHandler<T> apply3;
    protected MeleeWeaponApplyHandler<T> remove3;
    private List<Tuple<ModelBase, String>> texturedModels = new ArrayList<Tuple<ModelBase, String>>();
    private CustomRenderer<?> postRenderer;
    private CustomRenderer<?> preRenderer;
    private Part renderablePart;
    private String name;
    private Function<ItemStack, String> informationProvider;
    protected int field_77777_bU = 1;
    private List<CompatibleAttachment<T>> attachments = new ArrayList<CompatibleAttachment<T>>();
    private List<Weapon> compatibleWeapons = new ArrayList<Weapon>();
    private List<ItemAttachment<T>> requiredAttachments = new ArrayList<ItemAttachment<T>>();
    protected String textureName;

    protected ItemAttachment(String modId, AttachmentCategory category, ModelBase model, String textureName, String crosshair, ApplyHandler<T> apply, ApplyHandler<T> remove) {
        this.category = category;
        this.textureName = textureName.toLowerCase();
        this.crosshair = crosshair != null ? modId + ":textures/crosshairs/" + crosshair + ".png" : null;
        this.apply = apply;
        this.remove = remove;
    }

    protected ItemAttachment(String modId, AttachmentCategory category, String crosshair, ApplyHandler<T> apply, ApplyHandler<T> remove) {
        this.category = category;
        this.crosshair = crosshair != null ? modId + ":textures/crosshairs/" + crosshair + ".png" : null;
        this.apply = apply;
        this.remove = remove;
    }

    public int func_77639_j() {
        return this.field_77777_bU;
    }

    public Item setTextureName(String name) {
        return this;
    }

    public Part getRenderablePart() {
        return this.renderablePart;
    }

    protected void setRenderablePart(Part renderablePart) {
        this.renderablePart = renderablePart;
    }

    protected Function<ItemStack, String> getInformationProvider() {
        return this.informationProvider;
    }

    protected void setInformationProvider(Function<ItemStack, String> informationProvider) {
        this.informationProvider = informationProvider;
    }

    protected void setRequiredAttachments(List<ItemAttachment<T>> requiredAttachments) {
        this.requiredAttachments = Collections.unmodifiableList(requiredAttachments);
    }

    public List<ItemAttachment<T>> getRequiredAttachments() {
        return this.requiredAttachments;
    }

    @Deprecated
    public ItemAttachment<T> addModel(ModelBase model, String textureName) {
        this.texturedModels.add(new Tuple<ModelBase, String>(model, textureName));
        return this;
    }

    public ItemAttachment(String modId, AttachmentCategory category, String crosshair) {
        this(modId, category, crosshair, (ItemAttachment<T> a, T w, EntityLivingBase p) -> {}, (ItemAttachment<T> a, T w, EntityLivingBase p) -> {});
    }

    public ItemAttachment(String modId, AttachmentCategory category, ModelBase attachment, String textureName, String crosshair) {
        this(modId, category, attachment, textureName, crosshair, (a, w, p) -> {}, (a, w, p) -> {});
    }

    public AttachmentCategory getCategory() {
        return this.category;
    }

    @Override
    public List<Tuple<ModelBase, String>> getTexturedModels() {
        return this.texturedModels;
    }

    public String getCrosshair() {
        return this.crosshair;
    }

    public ApplyHandler<T> getApply() {
        return this.apply;
    }

    public ApplyHandler<T> getRemove() {
        return this.remove;
    }

    public void addCompatibleWeapon(Weapon weapon) {
        this.compatibleWeapons.add(weapon);
    }

    @Override
    public void addInformation(ItemStack itemStack, List<String> info, boolean flag) {
        if (info != null && this.informationProvider != null) {
            info.add(this.informationProvider.apply(itemStack));
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostRenderer(CustomRenderer<?> postRenderer) {
        this.postRenderer = postRenderer;
    }

    @Override
    public CustomRenderer<?> getPostRenderer() {
        return this.postRenderer;
    }

    public CustomRenderer<?> getPreRenderer() {
        return this.preRenderer;
    }

    public void setPreRenderer(CustomRenderer<?> preRenderer) {
        this.preRenderer = preRenderer;
    }

    protected void addCompatibleAttachment(CompatibleAttachment<T> attachment) {
        this.attachments.add(attachment);
    }

    public List<CompatibleAttachment<T>> getAttachments() {
        return Collections.unmodifiableList(this.attachments);
    }

    public String toString() {
        return this.name != null ? "Attachment [" + this.name + "]" : super.toString();
    }

    public ApplyHandler2<T> getApply2() {
        return this.apply2;
    }

    protected ApplyHandler2<T> getRemove2() {
        return this.remove2;
    }

    public MeleeWeaponApplyHandler<T> getApply3() {
        return this.apply3;
    }

    public MeleeWeaponApplyHandler<T> getRemove3() {
        return this.remove3;
    }

    public static interface MeleeWeaponApplyHandler<T> {
        public void apply(ItemAttachment<T> var1, PlayerMeleeInstance var2);
    }

    public static interface ApplyHandler2<T> {
        public void apply(ItemAttachment<T> var1, PlayerWeaponInstance var2);
    }

    public static interface ApplyHandler<T> {
        public void apply(ItemAttachment<T> var1, T var2, EntityLivingBase var3);
    }
}


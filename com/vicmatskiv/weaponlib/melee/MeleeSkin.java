/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.melee;

import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.model.FlatModel;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.model.ModelBase;
import org.lwjgl.opengl.GL11;

public class MeleeSkin
extends ItemAttachment<ItemMelee> {
    private List<String> textureVariants;

    public MeleeSkin(String modId, AttachmentCategory category, ModelBase model, String textureName, String crosshair, ItemAttachment.ApplyHandler<ItemMelee> apply, ItemAttachment.ApplyHandler<ItemMelee> remove) {
        super(modId, category, model, textureName, crosshair, apply, remove);
    }

    public String getTextureName() {
        return this.textureName;
    }

    public int getTextureVariantIndex(String name) {
        return this.textureVariants.indexOf(name.toLowerCase());
    }

    public String getTextureVariant(int textureIndex) {
        return textureIndex >= 0 && textureIndex < this.textureVariants.size() ? this.textureVariants.get(textureIndex) : null;
    }

    public static final class Builder
    extends AttachmentBuilder<ItemMelee> {
        private List<String> textureVariants = new ArrayList<String>();

        public Builder withTextureVariant(String ... textureVariantNames) {
            for (String s : textureVariantNames) {
                this.textureVariants.add(Builder.stripFileExtension(s.toLowerCase(), ".png"));
            }
            return this;
        }

        @Override
        protected ItemAttachment<ItemMelee> createAttachment(ModContext modContext) {
            MeleeSkin skin = new MeleeSkin(this.getModId(), AttachmentCategory.SKIN, this.getModel(), this.getTextureName(), null, null, null);
            skin.textureVariants = this.textureVariants;
            return skin;
        }

        @Override
        public <V extends ItemAttachment<ItemMelee>> V build(ModContext modContext, Class<V> target) {
            this.model = new FlatModel();
            if (this.textureVariants.isEmpty()) {
                this.textureVariants.add(this.getTextureName());
            } else if (this.getTextureName() == null) {
                this.textureName = this.textureVariants.get(0);
            }
            if (this.inventoryPositioning == null) {
                this.withInventoryPositioning(itemStack -> {
                    GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)-45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.0f);
                    GL11.glScaled((double)15.0, (double)15.0, (double)15.0);
                });
            }
            return super.build(modContext, target);
        }
    }
}


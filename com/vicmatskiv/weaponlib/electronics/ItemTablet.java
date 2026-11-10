/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.electronics;

import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerItemInstanceFactory;
import com.vicmatskiv.weaponlib.Updatable;
import com.vicmatskiv.weaponlib.electronics.PlayerTabletInstance;
import com.vicmatskiv.weaponlib.electronics.TabletState;
import com.vicmatskiv.weaponlib.perspective.PerspectiveRenderer;
import java.util.function.BiConsumer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ItemTablet<T>
extends ItemAttachment<T>
implements PlayerItemInstanceFactory<PlayerTabletInstance, TabletState>,
Updatable {
    private final int DEFAULT_MAX_STACK_SIZE = 1;
    private ModContext modContext;
    private Builder<T> builder;

    private ItemTablet(Builder<T> builder) {
        super(builder.getModId(), AttachmentCategory.SCOPE, builder.getModel(), builder.getTextureName(), null, null, null);
        this.builder = builder;
        this.func_77625_d(1);
    }

    @Override
    public void update(EntityPlayer player) {
    }

    @Override
    public PlayerTabletInstance createItemInstance(EntityLivingBase player, ItemStack stack, int slot) {
        PlayerTabletInstance instance = new PlayerTabletInstance(slot, player, stack);
        instance.setState(TabletState.READY);
        return instance;
    }

    public static final class Builder<T>
    extends AttachmentBuilder<T> {
        private BiConsumer<EntityLivingBase, ItemStack> viewfinderPositioning;

        public Builder<T> withViewfinderPositioning(BiConsumer<EntityLivingBase, ItemStack> viewfinderPositioning) {
            this.viewfinderPositioning = viewfinderPositioning;
            return this;
        }

        @Override
        protected ItemAttachment<T> createAttachment(ModContext modContext) {
            if (this.viewfinderPositioning == null) {
                this.viewfinderPositioning = (p, s) -> {
                    GL11.glScalef((float)3.0f, (float)3.0f, (float)3.0f);
                    GL11.glTranslatef((float)0.1f, (float)0.5f, (float)0.1f);
                };
            }
            this.withPostRender(new PerspectiveRenderer(this.viewfinderPositioning));
            ItemTablet itemTablet = new ItemTablet(this);
            itemTablet.modContext = modContext;
            return itemTablet;
        }

        @Override
        public ItemAttachment<T> build(ModContext modContext) {
            return super.build(modContext);
        }
    }
}


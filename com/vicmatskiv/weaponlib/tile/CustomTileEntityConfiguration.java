/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.AxisAlignedBB
 */
package com.vicmatskiv.weaponlib.tile;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMaterial;
import com.vicmatskiv.weaponlib.tile.CustomTileEntity;
import com.vicmatskiv.weaponlib.tile.CustomTileEntityBlock;
import com.vicmatskiv.weaponlib.tile.CustomTileEntityClassFactory;
import com.vicmatskiv.weaponlib.tile.CustomTileEntityRenderer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;

public class CustomTileEntityConfiguration<T extends CustomTileEntityConfiguration<T>> {
    private CompatibleMaterial material;
    private String name;
    private String textureName;
    private CreativeTabs creativeTab;
    private float hardness = 6.0f;
    private float resistance = 600000.0f;
    private String modelClassName;
    private AtomicInteger counter = new AtomicInteger(10000);
    private Supplier<Integer> entityIdSupplier = () -> this.counter.incrementAndGet();
    private Consumer<TileEntity> positioning = tileEntity -> {};
    private Function<IBlockState, AxisAlignedBB> boundingBox;

    private T safeCast(CustomTileEntityConfiguration<T> input) {
        return (T)input;
    }

    public T withMaterial(CompatibleMaterial material) {
        this.material = material;
        return this.safeCast(this);
    }

    public T withName(String name) {
        this.name = name;
        return this.safeCast(this);
    }

    public T withTextureName(String textureName) {
        this.textureName = textureName;
        return this.safeCast(this);
    }

    public T withCreativeTab(CreativeTabs creativeTab) {
        this.creativeTab = creativeTab;
        return this.safeCast(this);
    }

    public T withHardness(float hardness) {
        this.hardness = hardness;
        return this.safeCast(this);
    }

    public T withResistance(float resistance) {
        this.resistance = resistance;
        return this.safeCast(this);
    }

    public T withModelClassName(String modelClassName) {
        this.modelClassName = modelClassName;
        return this.safeCast(this);
    }

    public T withPositioning(Consumer<TileEntity> positioning) {
        this.positioning = positioning;
        return this.safeCast(this);
    }

    public T withBoundingBox(Function<IBlockState, AxisAlignedBB> boundingBox) {
        this.boundingBox = boundingBox;
        return this.safeCast(this);
    }

    public T withBoundingBox(double x1, double y1, double z1, double x2, double y2, double z2) {
        AxisAlignedBB bb = new AxisAlignedBB(x1, y1, z1, x2, y2, z2);
        this.boundingBox = state -> bb;
        return this.safeCast(this);
    }

    protected Class<? extends TileEntity> getBaseClass() {
        return CustomTileEntity.class;
    }

    protected Class<CustomTileEntity<T>> createTileEntityClass() {
        int modEntityId = this.entityIdSupplier.get();
        return CustomTileEntityClassFactory.getInstance().generateEntitySubclass(this.getBaseClass(), modEntityId, this);
    }

    public void build(ModContext modContext) {
        Class<CustomTileEntity<T>> tileEntityClass = this.createTileEntityClass();
        CustomTileEntityBlock tileEntityBlock = new CustomTileEntityBlock(this.material, tileEntityClass);
        tileEntityBlock.setBlockName(modContext.getModId() + "_" + this.name);
        tileEntityBlock.func_149711_c(this.hardness);
        tileEntityBlock.func_149752_b(this.resistance);
        tileEntityBlock.func_149647_a(this.creativeTab);
        tileEntityBlock.setBoundingBox(this.boundingBox);
        ResourceLocation textureResource = new ResourceLocation(modContext.getModId(), this.textureName);
        tileEntityBlock.setBlockTextureName(textureResource.toString());
        CompatibilityProvider.compatibility.registerTileEntity(tileEntityClass, "tile" + this.name);
        CompatibilityProvider.compatibility.registerBlock(modContext, (Block)tileEntityBlock, this.name);
        if (CompatibilityProvider.compatibility.isClientSide()) {
            RendererRegistration.registerRenderableEntity(modContext, this.name, tileEntityClass, this.modelClassName, textureResource, this.positioning, tileEntityBlock);
        }
    }

    private static class RendererRegistration {
        private RendererRegistration() {
        }

        private static <T extends CustomTileEntityConfiguration<T>> void registerRenderableEntity(ModContext context, String name, Class<? extends TileEntity> tileEntityClass, String modelClassName, ResourceLocation textureResource, Consumer<TileEntity> positioning, CustomTileEntityBlock tileEntityBlock) {
            try {
                ModelBase model = (ModelBase)Class.forName(modelClassName).newInstance();
                CompatibilityProvider.compatibility.bindTileEntitySpecialRenderer(tileEntityClass, new CustomTileEntityRenderer(model, textureResource, positioning));
            }
            catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}


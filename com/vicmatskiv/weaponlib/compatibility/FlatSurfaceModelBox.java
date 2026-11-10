/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBox
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.client.model.PositionTextureVertex
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FlatSurfaceModelBox
extends ModelBox {
    private PositionTextureVertex[] vertexPositions = new PositionTextureVertex[8];
    private TexturedQuad quad;

    public FlatSurfaceModelBox(ModelRenderer renderer, int par2, int par3, float posX1, float posY1, float posZ1, int sizeX, int sizeY, int sizeZ, float p_i1171_10_) {
        super(renderer, par2, par3, posX1, posY1, posZ1, sizeX, sizeY, sizeZ, p_i1171_10_);
        float adjX2 = posX1 + (float)sizeX;
        float adjY2 = posY1 + (float)sizeY;
        float adjZ2 = posZ1 + (float)sizeZ;
        posX1 -= p_i1171_10_;
        posY1 -= p_i1171_10_;
        posZ1 -= p_i1171_10_;
        adjX2 += p_i1171_10_;
        adjY2 += p_i1171_10_;
        adjZ2 += p_i1171_10_;
        if (renderer.field_78809_i) {
            float f7 = adjX2;
            adjX2 = posX1;
            posX1 = f7;
        }
        PositionTextureVertex backLowerLeft = new PositionTextureVertex(posX1, posY1, adjZ2, 0.0f, 0.0f);
        PositionTextureVertex backLowerRight = new PositionTextureVertex(adjX2, posY1, adjZ2, 0.0f, 8.0f);
        PositionTextureVertex backUpperRight = new PositionTextureVertex(adjX2, adjY2, adjZ2, 8.0f, 8.0f);
        PositionTextureVertex backUpperLeft = new PositionTextureVertex(posX1, adjY2, adjZ2, 8.0f, 0.0f);
        this.vertexPositions[4] = backLowerLeft;
        this.vertexPositions[5] = backLowerRight;
        this.vertexPositions[6] = backUpperRight;
        this.vertexPositions[7] = backUpperLeft;
        this.quad = new TexturedQuad(new PositionTextureVertex[]{backUpperRight, backUpperLeft, backLowerLeft, backLowerRight}, par2 + sizeZ + sizeX + sizeZ, par3 + sizeZ, par2 + sizeZ + sizeX + sizeZ + sizeX, par3 + sizeZ + sizeY, renderer.field_78801_a, renderer.field_78799_b);
        if (renderer.field_78809_i) {
            this.quad.flipFace();
        }
    }

    @SideOnly(value=Side.CLIENT)
    public void func_178780_a(BufferBuilder renderer, float scale) {
        this.quad.draw(renderer, scale);
    }

    private static class TexturedQuad {
        private PositionTextureVertex[] vertexPositions;
        private boolean invertNormal;

        public TexturedQuad(PositionTextureVertex[] vertices) {
            this.vertexPositions = vertices;
        }

        public TexturedQuad(PositionTextureVertex[] vertices, int texcoordU1, int texcoordV1, int texcoordU2, int texcoordV2, float textureWidth, float textureHeight) {
            this(vertices);
            vertices[0] = vertices[0].func_78240_a(0.0f, 0.0f);
            vertices[1] = vertices[1].func_78240_a(1.0f, 0.0f);
            vertices[2] = vertices[2].func_78240_a(1.0f, 1.0f);
            vertices[3] = vertices[3].func_78240_a(0.0f, 1.0f);
        }

        public void flipFace() {
            PositionTextureVertex[] apositiontexturevertex = new PositionTextureVertex[this.vertexPositions.length];
            for (int i = 0; i < this.vertexPositions.length; ++i) {
                apositiontexturevertex[i] = this.vertexPositions[this.vertexPositions.length - i - 1];
            }
            this.vertexPositions = apositiontexturevertex;
        }

        @SideOnly(value=Side.CLIENT)
        public void draw(BufferBuilder renderer, float scale) {
            Vec3d vec3d = this.vertexPositions[1].field_78243_a.func_72444_a(this.vertexPositions[0].field_78243_a);
            Vec3d vec3d1 = this.vertexPositions[1].field_78243_a.func_72444_a(this.vertexPositions[2].field_78243_a);
            Vec3d vec3d2 = vec3d1.func_72431_c(vec3d).func_72432_b();
            float f = (float)vec3d2.field_72450_a;
            float f1 = (float)vec3d2.field_72448_b;
            float f2 = (float)vec3d2.field_72449_c;
            if (this.invertNormal) {
                f = -f;
                f1 = -f1;
                f2 = -f2;
            }
            renderer.func_181668_a(7, DefaultVertexFormats.field_181703_c);
            for (int i = 0; i < 4; ++i) {
                PositionTextureVertex positiontexturevertex = this.vertexPositions[i];
                renderer.func_181662_b(positiontexturevertex.field_78243_a.field_72450_a * (double)scale, positiontexturevertex.field_78243_a.field_72448_b * (double)scale, positiontexturevertex.field_78243_a.field_72449_c * (double)scale).func_187315_a((double)positiontexturevertex.field_78241_b, (double)positiontexturevertex.field_78242_c).func_181663_c(f, f1, f2).func_181675_d();
            }
            Tessellator.func_178181_a().func_78381_a();
        }
    }
}


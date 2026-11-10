/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBox
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.client.model.TextureOffset
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GLAllocation
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.vicmatskiv.weaponlib;

import com.google.common.collect.Lists;
import com.vicmatskiv.weaponlib.compatibility.Interceptors;
import java.util.List;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.TextureOffset;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModelRenderer
extends net.minecraft.client.model.ModelRenderer {
    public float field_78801_a = 64.0f;
    public float field_78799_b = 32.0f;
    private int textureOffsetX;
    private int textureOffsetY;
    public float field_78800_c;
    public float field_78797_d;
    public float field_78798_e;
    public float field_78795_f;
    public float field_78796_g;
    public float field_78808_h;
    private boolean compiled;
    private int displayList;
    public boolean field_78809_i;
    public boolean field_78806_j = true;
    public boolean field_78807_k;
    public List<ModelBox> field_78804_l = Lists.newArrayList();
    public List<ModelRenderer> field_78805_m;
    public final String field_78802_n;
    private final ModelBase baseModel;
    public float field_82906_o;
    public float field_82908_p;
    public float field_82907_q;
    private float maxVolume;

    public ModelRenderer(ModelBase model, String boxNameIn) {
        super(model, boxNameIn);
        this.baseModel = model;
        model.field_78092_r.add(this);
        this.field_78802_n = boxNameIn;
        this.setTextureSize(model.field_78090_t, model.field_78089_u);
    }

    public ModelRenderer(ModelBase model) {
        this(model, null);
    }

    public ModelRenderer(ModelBase model, int texOffX, int texOffY) {
        this(model);
        this.setTextureOffset(texOffX, texOffY);
    }

    public void addChild(ModelRenderer renderer) {
        if (this.field_78805_m == null) {
            this.field_78805_m = Lists.newArrayList();
        }
        this.field_78805_m.add(renderer);
    }

    public ModelRenderer setTextureOffset(int x, int y) {
        this.textureOffsetX = x;
        this.textureOffsetY = y;
        return this;
    }

    public ModelRenderer addBox(String partName, float offX, float offY, float offZ, int width, int height, int depth) {
        partName = this.field_78802_n + "." + partName;
        TextureOffset textureoffset = this.baseModel.func_78084_a(partName);
        this.setTextureOffset(textureoffset.field_78783_a, textureoffset.field_78782_b);
        this.field_78804_l.add(new ModelBox((net.minecraft.client.model.ModelRenderer)this, this.textureOffsetX, this.textureOffsetY, offX, offY, offZ, width, height, depth, 0.0f).func_78244_a(partName));
        return this;
    }

    public ModelRenderer addBox(float offX, float offY, float offZ, int width, int height, int depth) {
        this.field_78804_l.add(new ModelBox((net.minecraft.client.model.ModelRenderer)this, this.textureOffsetX, this.textureOffsetY, offX, offY, offZ, width, height, depth, 0.0f));
        return this;
    }

    public ModelRenderer addBox(float offX, float offY, float offZ, int width, int height, int depth, boolean mirrored) {
        this.field_78804_l.add(new ModelBox((net.minecraft.client.model.ModelRenderer)this, this.textureOffsetX, this.textureOffsetY, offX, offY, offZ, width, height, depth, 0.0f, mirrored));
        return this;
    }

    public void func_78790_a(float offX, float offY, float offZ, int width, int height, int depth, float scaleFactor) {
        this.field_78804_l.add(new ModelBox((net.minecraft.client.model.ModelRenderer)this, this.textureOffsetX, this.textureOffsetY, offX, offY, offZ, width, height, depth, scaleFactor));
    }

    public void func_78793_a(float rotationPointXIn, float rotationPointYIn, float rotationPointZIn) {
        this.field_78800_c = rotationPointXIn;
        this.field_78797_d = rotationPointYIn;
        this.field_78798_e = rotationPointZIn;
    }

    @SideOnly(value=Side.CLIENT)
    public void func_78785_a(float scale) {
        if (!this.field_78807_k && Interceptors.shouldRender(this.field_78804_l) && this.field_78806_j) {
            if (!this.compiled) {
                this.compileDisplayList(scale);
            }
            GlStateManager.func_179109_b((float)this.field_82906_o, (float)this.field_82908_p, (float)this.field_82907_q);
            if (this.field_78795_f == 0.0f && this.field_78796_g == 0.0f && this.field_78808_h == 0.0f) {
                if (this.field_78800_c == 0.0f && this.field_78797_d == 0.0f && this.field_78798_e == 0.0f) {
                    GlStateManager.func_179148_o((int)this.displayList);
                    if (this.field_78805_m != null) {
                        for (int k = 0; k < this.field_78805_m.size(); ++k) {
                            this.field_78805_m.get(k).func_78785_a(scale);
                        }
                    }
                } else {
                    GlStateManager.func_179109_b((float)(this.field_78800_c * scale), (float)(this.field_78797_d * scale), (float)(this.field_78798_e * scale));
                    GlStateManager.func_179148_o((int)this.displayList);
                    if (this.field_78805_m != null) {
                        for (int j = 0; j < this.field_78805_m.size(); ++j) {
                            this.field_78805_m.get(j).func_78785_a(scale);
                        }
                    }
                    GlStateManager.func_179109_b((float)(-this.field_78800_c * scale), (float)(-this.field_78797_d * scale), (float)(-this.field_78798_e * scale));
                }
            } else {
                GlStateManager.func_179094_E();
                GlStateManager.func_179109_b((float)(this.field_78800_c * scale), (float)(this.field_78797_d * scale), (float)(this.field_78798_e * scale));
                if (this.field_78808_h != 0.0f) {
                    GlStateManager.func_179114_b((float)(this.field_78808_h * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
                }
                if (this.field_78796_g != 0.0f) {
                    GlStateManager.func_179114_b((float)(this.field_78796_g * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (this.field_78795_f != 0.0f) {
                    GlStateManager.func_179114_b((float)(this.field_78795_f * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
                }
                GlStateManager.func_179148_o((int)this.displayList);
                if (this.field_78805_m != null) {
                    for (int i = 0; i < this.field_78805_m.size(); ++i) {
                        this.field_78805_m.get(i).func_78785_a(scale);
                    }
                }
                GlStateManager.func_179121_F();
            }
            GlStateManager.func_179109_b((float)(-this.field_82906_o), (float)(-this.field_82908_p), (float)(-this.field_82907_q));
        }
    }

    @SideOnly(value=Side.CLIENT)
    public void func_78791_b(float scale) {
        if (!this.field_78807_k && this.field_78806_j) {
            if (!this.compiled) {
                this.compileDisplayList(scale);
            }
            GlStateManager.func_179094_E();
            GlStateManager.func_179109_b((float)(this.field_78800_c * scale), (float)(this.field_78797_d * scale), (float)(this.field_78798_e * scale));
            if (this.field_78796_g != 0.0f) {
                GlStateManager.func_179114_b((float)(this.field_78796_g * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (this.field_78795_f != 0.0f) {
                GlStateManager.func_179114_b((float)(this.field_78795_f * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (this.field_78808_h != 0.0f) {
                GlStateManager.func_179114_b((float)(this.field_78808_h * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            GlStateManager.func_179148_o((int)this.displayList);
            GlStateManager.func_179121_F();
        }
    }

    @SideOnly(value=Side.CLIENT)
    public void func_78794_c(float scale) {
        if (!this.field_78807_k && this.field_78806_j) {
            if (!this.compiled) {
                this.compileDisplayList(scale);
            }
            if (this.field_78795_f == 0.0f && this.field_78796_g == 0.0f && this.field_78808_h == 0.0f) {
                if (this.field_78800_c != 0.0f || this.field_78797_d != 0.0f || this.field_78798_e != 0.0f) {
                    GlStateManager.func_179109_b((float)(this.field_78800_c * scale), (float)(this.field_78797_d * scale), (float)(this.field_78798_e * scale));
                }
            } else {
                GlStateManager.func_179109_b((float)(this.field_78800_c * scale), (float)(this.field_78797_d * scale), (float)(this.field_78798_e * scale));
                if (this.field_78808_h != 0.0f) {
                    GlStateManager.func_179114_b((float)(this.field_78808_h * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
                }
                if (this.field_78796_g != 0.0f) {
                    GlStateManager.func_179114_b((float)(this.field_78796_g * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (this.field_78795_f != 0.0f) {
                    GlStateManager.func_179114_b((float)(this.field_78795_f * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
                }
            }
        }
    }

    @SideOnly(value=Side.CLIENT)
    private void compileDisplayList(float scale) {
        this.displayList = GLAllocation.func_74526_a((int)1);
        GlStateManager.func_187423_f((int)this.displayList, (int)4864);
        BufferBuilder bufferbuilder = Tessellator.func_178181_a().func_178180_c();
        for (int i = 0; i < this.field_78804_l.size(); ++i) {
            this.field_78804_l.get(i).func_178780_a(bufferbuilder, scale);
        }
        GlStateManager.func_187415_K();
        this.compiled = true;
    }

    public ModelRenderer setTextureSize(int textureWidthIn, int textureHeightIn) {
        this.field_78801_a = textureWidthIn;
        this.field_78799_b = textureHeightIn;
        return this;
    }
}


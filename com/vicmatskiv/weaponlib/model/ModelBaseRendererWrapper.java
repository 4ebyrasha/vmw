/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.weaponlib.model;

import com.vicmatskiv.weaponlib.model.WrappableModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import org.lwjgl.opengl.GL11;

public class ModelBaseRendererWrapper
extends ModelRenderer {
    private WrappableModel model;

    public ModelBaseRendererWrapper(WrappableModel model) {
        super(new ModelBase(){});
        this.model = model;
    }

    public void func_78785_a(float scale) {
        if (!this.field_78807_k && this.field_78806_j) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(this.field_78800_c * scale), (float)(this.field_78797_d * scale), (float)(this.field_78798_e * scale));
            if (this.field_78796_g != 0.0f) {
                GL11.glRotatef((float)(this.field_78796_g * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (this.field_78795_f != 0.0f) {
                GL11.glRotatef((float)(this.field_78795_f * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (this.field_78808_h != 0.0f) {
                GL11.glRotatef((float)(this.field_78808_h * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            this.model.render(scale);
            GL11.glPopMatrix();
        }
    }
}


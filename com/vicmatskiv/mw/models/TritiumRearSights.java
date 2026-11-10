/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBox
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TritiumRearSights
extends ModelBase {
    private final ModelRenderer sight23;
    private final ModelRenderer sight26;
    private final ModelRenderer sight32;
    private final ModelRenderer sight38;
    private final ModelRenderer sight44;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone5;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;

    public TritiumRearSights() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.sight23 = new ModelRenderer((ModelBase)this);
        this.sight23.func_78793_a(3.0f, -4.0f, -1.0f);
        this.setRotationAngle(this.sight23, 0.0f, 0.0f, 2.3562f);
        this.sight23.field_78804_l.add(new ModelBox(this.sight23, 0, 20, -0.7071f, 0.0f, 0.0f, 1, 1, 2, 0.0f, true));
        this.sight23.field_78804_l.add(new ModelBox(this.sight23, 0, 20, -0.7071f, 0.4f, 0.0f, 1, 1, 2, 0.0f, true));
        this.sight26 = new ModelRenderer((ModelBase)this);
        this.sight26.func_78793_a(0.0f, -4.0f, -1.0f);
        this.setRotationAngle(this.sight26, 0.0f, 0.0f, -0.7854f);
        this.sight26.field_78804_l.add(new ModelBox(this.sight26, 0, 20, 0.0f, -0.7071f, 0.0f, 1, 1, 2, 0.0f, true));
        this.sight26.field_78804_l.add(new ModelBox(this.sight26, 0, 20, 0.4f, -0.7071f, 0.0f, 1, 1, 2, 0.0f, true));
        this.sight32 = new ModelRenderer((ModelBase)this);
        this.sight32.func_78793_a(-3.7f, 5.0f, 1.7f);
        this.setRotationAngle(this.sight32, -0.7717f, 0.0f, 0.0f);
        this.sight32.field_78804_l.add(new ModelBox(this.sight32, 0, 0, 0.0f, 0.0f, 0.0f, 3, 2, 3, 0.0f, true));
        this.sight38 = new ModelRenderer((ModelBase)this);
        this.sight38.func_78793_a(5.2f, 6.5f, -1.5f);
        this.setRotationAngle(this.sight38, 0.7854f, 0.0f, 0.0f);
        this.sight38.field_78804_l.add(new ModelBox(this.sight38, 0, 0, 0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, true));
        this.sight44 = new ModelRenderer((ModelBase)this);
        this.sight44.func_78793_a(-3.7f, 5.0f, -4.3f);
        this.setRotationAngle(this.sight44, -1.1525f, 0.0f, 0.0f);
        this.sight44.field_78804_l.add(new ModelBox(this.sight44, 0, 0, 0.0f, 0.0f, 0.0f, 8, 3, 3, 0.0f, true));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -3.7f, -17.5f, -7.3f, 8, 3, 3, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 4.2f, -18.3f, -6.3f, 2, 3, 4, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.8f, -18.5f, -1.0f, 6, 2, 2, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 3.7f, -19.0f, -2.3f, 2, 3, 4, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -3.7f, -17.0f, -4.3f, 3, 3, 8, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -3.7f, -19.0f, -2.3f, 3, 2, 4, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -0.5f, -23.2f, -2.0f, 4, 7, 4, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.5f, -26.7f, -2.0f, 1, 3, 4, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 4.5f, -26.7f, -2.0f, 1, 3, 4, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.5f, -28.7f, 1.0f, 1, 2, 1, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 4.5f, -28.7f, 1.0f, 1, 2, 1, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -2.511f, -29.4f, -0.7f, 1, 3, 2, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 4.489f, -29.4f, -0.7f, 1, 3, 2, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 0.5f, -26.5f, -1.0f, 2, 3, 2, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -3.7f, -19.0f, -4.3f, 8, 2, 2, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 20, 0.5f, -29.5f, -1.0f, 2, 1, 2, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 20, 2.5f, -28.5f, -1.0f, 1, 5, 2, 0.0f, true));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 20, -0.5f, -28.5f, -1.0f, 1, 5, 2, 0.0f, true));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-2.5f, -27.2f, -2.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 1.1345f, 0.0f, 0.0f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, -0.01f, 0.2113f, -0.4532f, 1, 2, 3, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 6.99f, 0.2113f, -0.4532f, 1, 2, 3, 0.0f, false));
        this.bone3 = new ModelRenderer((ModelBase)this);
        this.bone3.func_78793_a(-1.5f, -29.9f, 1.3f);
        this.bone.func_78792_a(this.bone3);
        this.setRotationAngle(this.bone3, -2.3562f, 0.0f, 0.0f);
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, -1.0f, -1.3536f, 0.3536f, 1, 1, 1, 0.0f, false));
        this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 0, 6.0f, -1.3536f, 0.3536f, 1, 1, 1, 0.0f, false));
        this.bone5 = new ModelRenderer((ModelBase)this);
        this.bone5.func_78793_a(5.5f, -23.7f, -2.0f);
        this.bone.func_78792_a(this.bone5);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, 0.8203f);
        this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 0, -1.0f, 0.0f, 0.0f, 1, 3, 4, 0.0f, false));
        this.bone4 = new ModelRenderer((ModelBase)this);
        this.bone4.func_78793_a(-2.5f, -23.7f, -2.0f);
        this.bone.func_78792_a(this.bone4);
        this.setRotationAngle(this.bone4, 0.0f, 0.0f, -0.8203f);
        this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, 0.0f, 0.0f, 0.0f, 1, 3, 4, 0.0f, false));
        this.bone6 = new ModelRenderer((ModelBase)this);
        this.bone6.func_78793_a(0.5f, -24.9f, 0.7f);
        this.bone.func_78792_a(this.bone6);
        this.setRotationAngle(this.bone6, 0.7854f, 0.0f, 0.0f);
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, -0.99f, -1.0f, -1.0f, 4, 2, 2, 0.0f, false));
        this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, -1.99f, -1.0f, -1.0f, 6, 1, 1, 0.0f, false));
        this.bone7 = new ModelRenderer((ModelBase)this);
        this.bone7.func_78793_a(-2.6f, -0.8f, -0.4f);
        this.setRotationAngle(this.bone7, -1.0996f, 0.0f, 0.0f);
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, 0.0f, -3.0f, -2.0f, 1, 3, 3, 0.0f, false));
        this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 0, -1.3f, 0.8657f, 6.468f, 1, 3, 3, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.sight23.func_78785_a(f5);
        this.sight26.func_78785_a(f5);
        this.sight32.func_78785_a(f5);
        this.sight38.func_78785_a(f5);
        this.sight44.func_78785_a(f5);
        this.bone.func_78785_a(f5);
        this.bone7.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


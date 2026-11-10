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

public class G95_upright_rearsights
extends ModelBase {
    private final ModelRenderer sight8;
    private final ModelRenderer sight13;
    private final ModelRenderer sight17;
    private final ModelRenderer sight19;
    private final ModelRenderer sight31;
    private final ModelRenderer sight35;
    private final ModelRenderer sight36;
    private final ModelRenderer sight37;
    private final ModelRenderer sight38;
    private final ModelRenderer sight39;
    private final ModelRenderer sight40;
    private final ModelRenderer sight43;
    private final ModelRenderer sight44;
    private final ModelRenderer sight56;
    private final ModelRenderer sight57;
    private final ModelRenderer sight58;
    private final ModelRenderer sight59;
    private final ModelRenderer sight60;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;

    public G95_upright_rearsights() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.sight8 = new ModelRenderer((ModelBase)this);
        this.sight8.func_78793_a(-4.7f, 5.0f, -4.3f);
        this.sight8.field_78804_l.add(new ModelBox(this.sight8, 0, 0, 0.0f, 0.0f, 0.0f, 8, 4, 2, 0.0f, true));
        this.sight13 = new ModelRenderer((ModelBase)this);
        this.sight13.func_78793_a(-7.5f, 6.5f, -5.0f);
        this.setRotationAngle(this.sight13, 0.7854f, 0.0f, 0.0f);
        this.sight13.field_78804_l.add(new ModelBox(this.sight13, 0, 0, 0.0f, 0.0f, 0.0f, 3, 4, 4, 0.0f, true));
        this.sight17 = new ModelRenderer((ModelBase)this);
        this.sight17.func_78793_a(0.0f, 5.3f, 0.8f);
        this.sight17.field_78804_l.add(new ModelBox(this.sight17, 0, 0, 0.0f, -8.0f, -1.5f, 3, 8, 2, 0.0f, true));
        this.sight19 = new ModelRenderer((ModelBase)this);
        this.sight19.func_78793_a(-0.5f, 4.5f, -1.5f);
        this.sight19.field_78804_l.add(new ModelBox(this.sight19, 0, 0, 0.0f, 0.0f, 0.0f, 4, 4, 3, 0.0f, true));
        this.sight31 = new ModelRenderer((ModelBase)this);
        this.sight31.func_78793_a(-4.7f, 5.0f, -2.3f);
        this.sight31.field_78804_l.add(new ModelBox(this.sight31, 0, 0, 0.0f, 0.0f, 0.0f, 2, 4, 6, 0.0f, true));
        this.sight35 = new ModelRenderer((ModelBase)this);
        this.sight35.func_78793_a(3.7f, 5.0f, -2.3f);
        this.sight35.field_78804_l.add(new ModelBox(this.sight35, 0, 0, 0.0f, 0.0f, 0.0f, 2, 3, 11, 0.0f, true));
        this.sight36 = new ModelRenderer((ModelBase)this);
        this.sight36.func_78793_a(5.7f, 5.0f, -2.3f);
        this.setRotationAngle(this.sight36, 0.0f, -2.1935f, 0.0f);
        this.sight36.field_78804_l.add(new ModelBox(this.sight36, 0, 0, 0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, true));
        this.sight37 = new ModelRenderer((ModelBase)this);
        this.sight37.func_78793_a(5.7f, 5.0f, -2.3f);
        this.setRotationAngle(this.sight37, 0.0f, -2.1935f, 0.0f);
        this.sight37.field_78804_l.add(new ModelBox(this.sight37, 0, 0, 0.5f, 0.0f, 0.0f, 1, 3, 3, 0.0f, true));
        this.sight38 = new ModelRenderer((ModelBase)this);
        this.sight38.func_78793_a(5.2f, 6.0f, -1.5f);
        this.setRotationAngle(this.sight38, 0.7854f, 0.0f, 0.0f);
        this.sight38.field_78804_l.add(new ModelBox(this.sight38, 0, 0, 0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, true));
        this.sight39 = new ModelRenderer((ModelBase)this);
        this.sight39.func_78793_a(-1.8f, 5.5f, -1.0f);
        this.sight39.field_78804_l.add(new ModelBox(this.sight39, 0, 0, 0.0f, 0.0f, 0.0f, 6, 2, 2, 0.0f, true));
        this.sight40 = new ModelRenderer((ModelBase)this);
        this.sight40.func_78793_a(5.0f, 8.0f, -9.3f);
        this.sight40.field_78804_l.add(new ModelBox(this.sight40, 0, 0, 0.0f, 0.0f, 0.0f, 2, 3, 17, 0.0f, true));
        this.sight43 = new ModelRenderer((ModelBase)this);
        this.sight43.func_78793_a(-3.7f, 6.5f, -10.3f);
        this.sight43.field_78804_l.add(new ModelBox(this.sight43, 0, 0, 0.0f, 0.0f, 0.0f, 9, 3, 6, 0.0f, true));
        this.sight44 = new ModelRenderer((ModelBase)this);
        this.sight44.func_78793_a(-0.5f, 5.0f, -7.3f);
        this.setRotationAngle(this.sight44, -1.1525f, 0.0f, 0.0f);
        this.sight44.field_78804_l.add(new ModelBox(this.sight44, 0, 0, 0.0f, 0.0f, 0.0f, 4, 3, 3, 0.0f, true));
        this.sight56 = new ModelRenderer((ModelBase)this);
        this.sight56.func_78793_a(-2.7f, 5.0f, -2.3f);
        this.sight56.field_78804_l.add(new ModelBox(this.sight56, 0, 0, 0.0f, 0.0f, 0.0f, 2, 3, 11, 0.0f, true));
        this.sight57 = new ModelRenderer((ModelBase)this);
        this.sight57.func_78793_a(-0.5f, 5.0f, -7.3f);
        this.sight57.field_78804_l.add(new ModelBox(this.sight57, 0, 0, 0.0f, 0.0f, 0.0f, 4, 3, 3, 0.0f, true));
        this.sight58 = new ModelRenderer((ModelBase)this);
        this.sight58.func_78793_a(-4.0f, 7.0f, -9.3f);
        this.sight58.field_78804_l.add(new ModelBox(this.sight58, 0, 0, 0.0f, 0.0f, 0.0f, 2, 4, 17, 0.0f, true));
        this.sight59 = new ModelRenderer((ModelBase)this);
        this.sight59.func_78793_a(-2.9f, 7.5f, -9.35f);
        this.sight59.field_78804_l.add(new ModelBox(this.sight59, 0, 0, 0.0f, 0.0f, 0.0f, 9, 2, 17, 0.0f, true));
        this.sight60 = new ModelRenderer((ModelBase)this);
        this.sight60.func_78793_a(6.1f, 7.5f, -9.3f);
        this.setRotationAngle(this.sight60, 0.0f, 0.0f, 0.5205f);
        this.sight60.field_78804_l.add(new ModelBox(this.sight60, 0, 0, 0.0f, 0.0f, 0.0f, 1, 1, 17, 0.0f, true));
        this.bone = new ModelRenderer((ModelBase)this);
        this.bone.func_78793_a(0.5f, -3.75f, -0.75f);
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -1.0f, -1.0f, 0.05f, 1, 2, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 2.0f, -1.0f, 0.05f, 1, 2, 2, 0.0f, false));
        this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, 0.0f, -2.0f, 0.05f, 2, 1, 2, 0.0f, false));
        this.bone2 = new ModelRenderer((ModelBase)this);
        this.bone2.func_78793_a(-1.5f, 0.5f, 0.0f);
        this.bone.func_78792_a(this.bone2);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.7854f);
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 0.0f, 0.7071f, 0.05f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 1.4142f, -0.7071f, 0.05f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 1.8f, -0.7071f, 0.05f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 3.2426f, 1.1213f, 0.05f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 3.2426f, 0.75f, 0.05f, 1, 1, 2, 0.0f, false));
        this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 0, 1.8284f, 2.5355f, 0.05f, 1, 1, 2, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.sight8.func_78785_a(f5);
        this.sight13.func_78785_a(f5);
        this.sight17.func_78785_a(f5);
        this.sight19.func_78785_a(f5);
        this.sight31.func_78785_a(f5);
        this.sight35.func_78785_a(f5);
        this.sight36.func_78785_a(f5);
        this.sight37.func_78785_a(f5);
        this.sight38.func_78785_a(f5);
        this.sight39.func_78785_a(f5);
        this.sight40.func_78785_a(f5);
        this.sight43.func_78785_a(f5);
        this.sight44.func_78785_a(f5);
        this.sight56.func_78785_a(f5);
        this.sight57.func_78785_a(f5);
        this.sight58.func_78785_a(f5);
        this.sight59.func_78785_a(f5);
        this.sight60.func_78785_a(f5);
        this.bone.func_78785_a(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBox
 */
package com.vicmatskiv.weaponlib;

import java.util.ArrayList;
import net.minecraft.client.model.ModelBox;

public class OptimizedCubeList
extends ArrayList<ModelBox> {
    private static final long serialVersionUID = 1L;
    private float maxVol;

    public static OptimizedCubeList newList() {
        return new OptimizedCubeList();
    }

    @Override
    public boolean add(ModelBox cube) {
        float vol = Math.abs((cube.field_78248_d - cube.field_78252_a) * (cube.field_78249_e - cube.field_78250_b) * (cube.field_78246_f - cube.field_78251_c));
        if (vol > this.maxVol) {
            this.maxVol = vol;
        }
        return super.add(cube);
    }

    public float getMaxVol() {
        return this.maxVol;
    }
}


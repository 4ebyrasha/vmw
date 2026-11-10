/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.MathHelper
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.util.math.MathHelper;

public class CompatibleMathHelper {
    public static float cos(float in) {
        return MathHelper.func_76134_b((float)in);
    }

    public static float sin(float in) {
        return MathHelper.func_76126_a((float)in);
    }

    public static float sqrt_float(float in) {
        return MathHelper.func_76129_c((float)in);
    }

    public static float sqrt_double(double in) {
        return MathHelper.func_76133_a((double)in);
    }

    public static int floor_double(double d) {
        return MathHelper.func_76128_c((double)d);
    }

    public static double clamp_double(double num, double min, double max) {
        return MathHelper.func_151237_a((double)num, (double)min, (double)max);
    }
}


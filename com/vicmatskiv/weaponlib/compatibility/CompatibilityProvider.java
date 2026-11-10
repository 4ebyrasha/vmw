/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.Compatibility;

public final class CompatibilityProvider {
    public static Compatibility compatibility = CompatibilityProvider.initCompatibility();

    private static Compatibility initCompatibility() {
        String compatibilityClassName = Compatibility.class.getName() + "1.12.2".replace('.', '_');
        try {
            return (Compatibility)Class.forName(compatibilityClassName).newInstance();
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new IllegalStateException("Cannot find compatible implementation class " + compatibilityClassName);
        }
    }
}


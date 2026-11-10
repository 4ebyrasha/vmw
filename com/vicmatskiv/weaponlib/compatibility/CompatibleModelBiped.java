/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBiped
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.model.ModelBiped;

public class CompatibleModelBiped
extends ModelBiped {
    protected ModelBiped delegate;

    protected CompatibleModelBiped(ModelBiped delegate) {
        this.delegate = delegate;
    }
}


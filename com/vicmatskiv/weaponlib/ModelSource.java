/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.CustomRenderer;
import com.vicmatskiv.weaponlib.Tuple;
import java.util.List;
import net.minecraft.client.model.ModelBase;

public interface ModelSource {
    public List<Tuple<ModelBase, String>> getTexturedModels();

    public CustomRenderer<?> getPostRenderer();
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin$MCVersion
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin$Name
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin$TransformerExclusions
 */
package com.vicmatskiv.weaponlib.core;

import java.util.Map;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.Name(value="weaponlib")
@IFMLLoadingPlugin.TransformerExclusions(value={"com.vicmatskiv.weaponlib.core"})
@IFMLLoadingPlugin.MCVersion(value="1.12.2")
public class WeaponlibCorePlugin
implements IFMLLoadingPlugin {
    public String getAccessTransformerClass() {
        return null;
    }

    public String[] getASMTransformerClass() {
        return new String[]{"com.vicmatskiv.weaponlib.core.WeaponlibClassTransformer"};
    }

    public String getModContainerClass() {
        return null;
    }

    public String getSetupClass() {
        return null;
    }

    public void injectData(Map<String, Object> data) {
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.items.grenade.FlashGrenadeFactory;
import com.vicmatskiv.mw.items.grenade.FuseGrenadeFactory;
import com.vicmatskiv.mw.items.grenade.GasGrenadeFactory;
import com.vicmatskiv.mw.items.grenade.ImpactGrenadeFactory;
import com.vicmatskiv.mw.items.grenade.SmokeGrenadeFactory;
import com.vicmatskiv.mw.models.Pin;
import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;

public class Grenades {
    public static ItemGrenade FuseGrenade;
    public static ItemGrenade ImpactGrenade;
    public static ItemGrenade SmokeGrenade;
    public static ItemGrenade GasGrenade;
    public static ItemGrenade FlashGrenade;
    public static ItemAttachment<ItemGrenade> GrenadeSafetyPin;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, CommonProxy commonProxy) {
        GrenadeSafetyPin = new AttachmentBuilder().withCategory(AttachmentCategory.EXTRA).withModel(new Pin(), "gun.png").withName("GrenadeSafetyPin").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        FuseGrenade = new FuseGrenadeFactory().createGrenade(commonProxy);
        ImpactGrenade = new ImpactGrenadeFactory().createGrenade(commonProxy);
        SmokeGrenade = new SmokeGrenadeFactory().createGrenade(commonProxy);
        GasGrenade = new GasGrenadeFactory().createGrenade(commonProxy);
        FlashGrenade = new FlashGrenadeFactory().createGrenade(commonProxy);
    }
}


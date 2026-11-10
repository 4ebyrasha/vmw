/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.IThreadListener
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class CompatibleMessageContext {
    private MessageContext ctx;

    public CompatibleMessageContext(MessageContext ctx) {
        this.ctx = ctx;
    }

    public boolean isServerSide() {
        return this.ctx.side == Side.SERVER;
    }

    public EntityPlayer getPlayer() {
        return this.ctx.getServerHandler().field_147369_b;
    }

    public void runInMainThread(Runnable runnable) {
        IThreadListener mainThread = (IThreadListener)this.ctx.getServerHandler().field_147369_b.field_70170_p;
        mainThread.func_152344_a(runnable);
    }
}


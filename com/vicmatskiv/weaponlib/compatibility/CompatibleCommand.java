/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.CommandException
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.server.MinecraftServer
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public abstract class CompatibleCommand
extends CommandBase {
    public void func_184881_a(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        this.execCommand(sender, args);
    }

    protected abstract void execCommand(ICommandSender var1, String[] var2);

    public String func_71517_b() {
        return this.getCompatibleName();
    }

    public abstract String getCompatibleName();

    public String func_71518_a(ICommandSender sender) {
        return this.getCompatibleUsage(sender);
    }

    public abstract String getCompatibleUsage(ICommandSender var1);
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public interface CompatibleMessageHandler<Request extends CompatibleMessage, Response extends CompatibleMessage>
extends IMessageHandler<Request, Response> {
    default public Response onMessage(Request message, MessageContext ctx) {
        return (Response)this.onCompatibleMessage(message, new CompatibleMessageContext(ctx));
    }

    public <T extends CompatibleMessage> T onCompatibleMessage(Request var1, CompatibleMessageContext var2);
}


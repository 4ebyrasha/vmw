/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper
 */
package com.vicmatskiv.weaponlib.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSide;
import com.vicmatskiv.weaponlib.compatibility.CompatibleTargetPoint;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class CompatibleChannel {
    private SimpleNetworkWrapper channel;

    public CompatibleChannel(SimpleNetworkWrapper channel) {
        this.channel = channel;
    }

    public SimpleNetworkWrapper getChannel() {
        return this.channel;
    }

    public <Request extends CompatibleMessage, Response extends CompatibleMessage> void registerMessage(CompatibleMessageHandler<? super Request, ? extends Response> messageHandler, Class<Request> requestMessageType, int discriminator, CompatibleSide side) {
        this.channel.registerMessage(messageHandler, requestMessageType, discriminator, side.getSide());
    }

    public void sendToAllAround(CompatibleMessage spawnParticleMessage, CompatibleTargetPoint point) {
        this.channel.sendToAllAround((IMessage)spawnParticleMessage, point.getTargetPoint());
    }
}


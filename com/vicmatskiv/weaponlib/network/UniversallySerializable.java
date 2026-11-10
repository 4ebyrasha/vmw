/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib.network;

import io.netty.buffer.ByteBuf;

public interface UniversallySerializable {
    public void init(ByteBuf var1);

    public void serialize(ByteBuf var1);
}


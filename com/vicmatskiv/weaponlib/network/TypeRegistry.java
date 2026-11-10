/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib.network;

import com.vicmatskiv.weaponlib.network.UniversallySerializable;
import io.netty.buffer.ByteBuf;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TypeRegistry {
    private static final String SHA1PRNG_ALG = "SHA1PRNG";
    private ConcurrentMap<UUID, Class<? extends UniversallySerializable>> typeRegistry = new ConcurrentHashMap<UUID, Class<? extends UniversallySerializable>>();
    private static final TypeRegistry instance = new TypeRegistry();

    public static TypeRegistry getInstance() {
        return instance;
    }

    private TypeRegistry() {
    }

    public <T extends UniversallySerializable> void register(Class<T> cls) {
        this.typeRegistry.put(this.getUuid(cls), cls);
    }

    public UUID getUuid(Class<?> cls) {
        try {
            SecureRandom random = SecureRandom.getInstance(SHA1PRNG_ALG);
            random.setSeed(cls.getName().getBytes());
            return new UUID(random.nextLong(), random.nextLong());
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return UUID.fromString(this.getClass().getName());
        }
    }

    public <T extends UniversallySerializable> void toBytes(T object, ByteBuf buf) {
        UUID typeUuid = this.getUuid(object.getClass());
        if (!this.typeRegistry.containsKey(typeUuid)) {
            throw new RuntimeException("Failed to serialize object " + object + " because its class is not registered: " + object.getClass());
        }
        buf.writeLong(typeUuid.getMostSignificantBits());
        buf.writeLong(typeUuid.getLeastSignificantBits());
        if (object.getClass().isEnum()) {
            buf.writeInt(((Enum)((Object)object)).ordinal());
        } else {
            object.serialize(buf);
        }
    }

    public <T extends UniversallySerializable> T fromBytes(ByteBuf buf) {
        UniversallySerializable instance;
        long leastSigBits;
        long mostSigBits = buf.readLong();
        UUID typeUuid = new UUID(mostSigBits, leastSigBits = buf.readLong());
        Class targetClass = (Class)this.typeRegistry.get(typeUuid);
        if (targetClass == null) {
            throw new RuntimeException("Failed to deserailize object. Did you forget to register type?");
        }
        if (targetClass.isEnum()) {
            UniversallySerializable[] constants = (UniversallySerializable[])targetClass.getEnumConstants();
            instance = constants[buf.readInt()];
        } else {
            try {
                instance = (UniversallySerializable)targetClass.newInstance();
            }
            catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
                throw new RuntimeException("Cannot create instance of  " + targetClass);
            }
            instance.init(buf);
        }
        return (T)((UniversallySerializable)targetClass.cast(instance));
    }
}


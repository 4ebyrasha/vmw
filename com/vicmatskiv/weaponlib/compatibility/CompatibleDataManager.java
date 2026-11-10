/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;

public class CompatibleDataManager {
    private EntityDataManager dataManager;

    public CompatibleDataManager(EntityDataManager dataManager) {
        this.dataManager = dataManager;
    }

    public <T> void register(Key key, T value) {
        this.dataManager.func_187214_a(key.key, value);
    }

    public static Key createKey(Class<? extends Entity> entityClass, Class<?> valueType) {
        Key key;
        if (valueType == Integer.TYPE) {
            key = new Key(EntityDataManager.func_187226_a(entityClass, (DataSerializer)DataSerializers.field_187192_b));
        } else if (valueType == Boolean.TYPE) {
            key = new Key(EntityDataManager.func_187226_a(entityClass, (DataSerializer)DataSerializers.field_187198_h));
        } else {
            throw new IllegalArgumentException("Value type " + valueType + " not supported");
        }
        return key;
    }

    public <T> Value<T> get(Key key) {
        return new Value(key.key);
    }

    public <T> void set(Key key, T value) {
        this.dataManager.func_187227_b(key.key, value);
    }

    public class Value<T> {
        DataParameter<T> key;

        Value(DataParameter<T> key) {
            this.key = key;
        }

        public int intValue() {
            return (Integer)CompatibleDataManager.this.dataManager.func_187225_a(this.key);
        }

        public boolean booleanValue() {
            return (Boolean)CompatibleDataManager.this.dataManager.func_187225_a(this.key);
        }
    }

    public static class Key {
        private DataParameter<?> key;

        public Key(DataParameter<?> key) {
            this.key = key;
        }
    }
}


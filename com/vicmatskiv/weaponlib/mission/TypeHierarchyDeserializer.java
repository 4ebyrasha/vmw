/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.vicmatskiv.weaponlib.mission;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class TypeHierarchyDeserializer<T>
implements JsonDeserializer<T> {
    private static final String TYPE_ELEMENT_NAME = "type";
    private Map<String, Class<? extends T>> typeRegistry = new HashMap<String, Class<? extends T>>();

    public TypeHierarchyDeserializer<T> registerType(Class<? extends T> typeClass) {
        this.typeRegistry.put(typeClass.getSimpleName(), typeClass);
        return this;
    }

    public T deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context) {
        JsonObject actionObject = jsonElement.getAsJsonObject();
        JsonElement actionTypeElement = actionObject.get(TYPE_ELEMENT_NAME);
        Class<? extends T> actionType = this.typeRegistry.get(actionTypeElement.getAsString());
        return (T)context.deserialize((JsonElement)actionObject, actionType);
    }
}


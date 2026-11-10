/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.JsonUtils
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.registries.GameData
 */
package com.vicmatskiv.weaponlib.mission;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.vicmatskiv.weaponlib.mission.Action;
import io.netty.buffer.ByteBuf;
import java.lang.reflect.Type;
import java.util.function.Supplier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.GameData;

public class KillEntityAction
extends Action {
    private Supplier<Integer> registrationIdSupplier;

    public KillEntityAction(Entity entity) {
        this.registrationIdSupplier = () -> EntityList.getID(entity.getClass());
    }

    public KillEntityAction(Class<Entity> entityClass) {
        this.registrationIdSupplier = () -> EntityList.getID((Class)entityClass);
    }

    public KillEntityAction(ResourceLocation entityResource) {
        this.registrationIdSupplier = () -> GameData.getEntityRegistry().getID(entityResource);
    }

    public KillEntityAction(String entityName) {
        this.registrationIdSupplier = () -> {
            Class entityClass = EntityList.func_192839_a((String)entityName);
            return EntityList.getID((Class)entityClass);
        };
    }

    public KillEntityAction() {
    }

    private int getTargetEntityRegistrationId() {
        return this.registrationIdSupplier.get();
    }

    private void setTargetEntityRegistrationId(int id) {
        this.registrationIdSupplier = () -> id;
    }

    @Override
    public int matches(Action anotherAction, EntityPlayer player) {
        return anotherAction instanceof KillEntityAction && this.getTargetEntityRegistrationId() == ((KillEntityAction)anotherAction).getTargetEntityRegistrationId() ? 1 : 0;
    }

    @Override
    public void init(ByteBuf buf) {
        this.setTargetEntityRegistrationId(buf.readInt());
    }

    @Override
    public void serialize(ByteBuf buf) {
        buf.writeInt(this.getTargetEntityRegistrationId());
    }

    public static class Deserializer
    implements JsonDeserializer<KillEntityAction> {
        public KillEntityAction deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject jsonObject = element.getAsJsonObject();
            String entityName = JsonUtils.func_151200_h((JsonObject)jsonObject, (String)"entity");
            return new KillEntityAction(entityName);
        }
    }
}


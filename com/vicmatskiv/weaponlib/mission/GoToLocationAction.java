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
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.JsonUtils
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.JsonUtils;

public class GoToLocationAction
extends Action {
    private float x;
    private float y;
    private float z;
    private float minSqDistance;

    public GoToLocationAction(float x, float y, float z, float minDistance) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.minSqDistance = minDistance * minDistance;
    }

    public GoToLocationAction() {
    }

    @Override
    public int matches(Action anotherAction, EntityPlayer player) {
        return anotherAction instanceof GoToLocationAction && (this.x - ((GoToLocationAction)anotherAction).x) * (this.x - ((GoToLocationAction)anotherAction).x) + (this.y - ((GoToLocationAction)anotherAction).y) * (this.y - ((GoToLocationAction)anotherAction).y) + (this.z - ((GoToLocationAction)anotherAction).z) * (this.z - ((GoToLocationAction)anotherAction).z) <= this.minSqDistance ? 1 : 0;
    }

    @Override
    public void init(ByteBuf buf) {
        this.x = buf.readFloat();
        this.y = buf.readFloat();
        this.z = buf.readFloat();
        this.minSqDistance = buf.readFloat();
    }

    @Override
    public void serialize(ByteBuf buf) {
        buf.writeFloat(this.x);
        buf.writeFloat(this.y);
        buf.writeFloat(this.z);
        buf.writeFloat(this.minSqDistance);
    }

    public static class Deserializer
    implements JsonDeserializer<GoToLocationAction> {
        public GoToLocationAction deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject jsonObject = element.getAsJsonObject();
            float x = JsonUtils.func_151217_k((JsonObject)jsonObject, (String)"x");
            float y = JsonUtils.func_151217_k((JsonObject)jsonObject, (String)"y");
            float z = JsonUtils.func_151217_k((JsonObject)jsonObject, (String)"z");
            float minDistance = JsonUtils.func_151217_k((JsonObject)jsonObject, (String)"minDistance");
            return new GoToLocationAction(x, y, z, minDistance);
        }
    }
}


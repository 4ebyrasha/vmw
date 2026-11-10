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
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.network.UniversallySerializable;
import io.netty.buffer.ByteBuf;
import java.lang.reflect.Type;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.JsonUtils;

public class Goal
implements UniversallySerializable {
    private Action requiredAction;
    private int quantity;

    public Goal() {
    }

    public Goal(Action requiredAction, int quantity) {
        this.requiredAction = requiredAction;
        this.quantity = quantity;
    }

    public Action getRequiredAction() {
        return this.requiredAction;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean update(Action action, EntityPlayer player) {
        int matchedCount = this.requiredAction.matches(action, player);
        if (matchedCount > 0) {
            if (this.requiredAction.isTransient()) {
                if (this.quantity > 0) {
                    this.quantity -= Math.min(matchedCount, this.quantity);
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean isCompleted(EntityPlayer player) {
        return this.requiredAction.isTransient() ? this.quantity == 0 : this.requiredAction.quantityMatches(player, this.quantity);
    }

    @Override
    public void init(ByteBuf buf) {
        this.requiredAction = (Action)TypeRegistry.getInstance().fromBytes(buf);
        this.quantity = buf.readInt();
    }

    @Override
    public void serialize(ByteBuf buf) {
        TypeRegistry.getInstance().toBytes(this.requiredAction, buf);
        buf.writeInt(this.quantity);
    }

    public static class Deserializer
    implements JsonDeserializer<Goal> {
        public Goal deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject goalObject = jsonElement.getAsJsonObject();
            JsonObject actionObject = JsonUtils.func_152754_s((JsonObject)goalObject, (String)"action");
            Action action = (Action)context.deserialize((JsonElement)actionObject, Action.class);
            int quantity = JsonUtils.func_151208_a((JsonObject)goalObject, (String)"quantity", (int)1);
            return new Goal(action, quantity);
        }
    }
}


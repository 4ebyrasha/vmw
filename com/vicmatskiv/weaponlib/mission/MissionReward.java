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
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.JsonUtils
 */
package com.vicmatskiv.weaponlib.mission;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.vicmatskiv.weaponlib.network.UniversallySerializable;
import io.netty.buffer.ByteBuf;
import java.lang.reflect.Type;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.JsonUtils;

public interface MissionReward
extends UniversallySerializable {
    public void redeem(EntityPlayer var1);

    public static class ItemReward
    implements MissionReward {
        private Item item;
        private int quantity;
        private ItemStack reward;

        public ItemReward() {
        }

        public ItemReward(Item item, int quantity) {
            this.reward = new ItemStack(item, quantity);
        }

        public ItemStack getReward() {
            return this.reward;
        }

        @Override
        public void redeem(EntityPlayer player) {
            player.field_71071_by.func_70441_a(new ItemStack(this.reward.func_77973_b(), this.reward.func_190916_E()));
        }

        @Override
        public void init(ByteBuf buf) {
            this.item = Item.func_150899_d((int)buf.readInt());
            this.quantity = buf.readInt();
        }

        @Override
        public void serialize(ByteBuf buf) {
            buf.writeInt(Item.func_150891_b((Item)this.item));
            buf.writeInt(this.quantity);
        }

        public static class Deserializer
        implements JsonDeserializer<ItemReward> {
            public ItemReward deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                JsonObject jsonObject = element.getAsJsonObject();
                String itemName = JsonUtils.func_151200_h((JsonObject)jsonObject, (String)"item");
                int quantity = JsonUtils.func_151208_a((JsonObject)jsonObject, (String)"quantity", (int)1);
                return new ItemReward(Item.func_111206_d((String)itemName), quantity);
            }
        }
    }
}


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
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.mission.Action;
import io.netty.buffer.ByteBuf;
import java.lang.reflect.Type;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.JsonUtils;

public class ObtainItemAction
extends Action {
    private int itemId;
    private boolean isForTrade;

    public ObtainItemAction(Item item, boolean isForTrade) {
        this.itemId = Item.func_150891_b((Item)item);
        this.isForTrade = isForTrade;
    }

    public ObtainItemAction() {
    }

    @Override
    public boolean isTransient() {
        return !this.isForTrade;
    }

    @Override
    public int matches(Action anotherAction, EntityPlayer player) {
        return anotherAction instanceof ObtainItemAction ? this.playerInventoryContains(player) : 0;
    }

    private int playerInventoryContains(EntityPlayer player) {
        int count = 0;
        for (int i = 0; i < player.field_71071_by.func_70302_i_(); ++i) {
            ItemStack itemStack = player.field_71071_by.func_70301_a(i);
            if (itemStack == null || Item.func_150891_b((Item)itemStack.func_77973_b()) != this.itemId) continue;
            count += itemStack.func_190916_E();
        }
        return count;
    }

    public Item getItem() {
        return Item.func_150899_d((int)this.itemId);
    }

    @Override
    public Object getResult(EntityPlayer player) {
        return super.getResult(player);
    }

    @Override
    public boolean quantityMatches(EntityPlayer player, int requiredQuantity) {
        return CompatibilityProvider.compatibility.getMatchingInventoryItemStack(player, this.getItem()) >= requiredQuantity;
    }

    @Override
    public void init(ByteBuf buf) {
        this.itemId = buf.readInt();
        this.isForTrade = buf.readBoolean();
    }

    @Override
    public void serialize(ByteBuf buf) {
        buf.writeInt(this.itemId);
        buf.writeBoolean(this.isForTrade);
    }

    public static class Deserializer
    implements JsonDeserializer<ObtainItemAction> {
        public ObtainItemAction deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject jsonObject = element.getAsJsonObject();
            String itemName = JsonUtils.func_151200_h((JsonObject)jsonObject, (String)"item");
            boolean isForTrade = JsonUtils.func_151212_i((JsonObject)jsonObject, (String)"isForTrade");
            Item item = Item.func_111206_d((String)itemName);
            return new ObtainItemAction(item, isForTrade);
        }
    }
}


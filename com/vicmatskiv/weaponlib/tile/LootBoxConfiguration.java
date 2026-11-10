/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.world.EnumDifficulty
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.tile;

import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.WeightedOptions;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import com.vicmatskiv.weaponlib.tile.CustomTileEntityConfiguration;
import com.vicmatskiv.weaponlib.tile.LootBoxTileEntity;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.EnumDifficulty;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LootBoxConfiguration
extends CustomTileEntityConfiguration<LootBoxConfiguration> {
    private static final int DEFAULT_EQUIPMENT_DISPENSE_TIMEOUT_TICKS = 100;
    private static final Logger logger = LogManager.getLogger(LootBoxConfiguration.class);
    private Map<EquipmentKey, EquipmentValue> equipmentOptions = new HashMap<EquipmentKey, EquipmentValue>();
    private WeightedOptions<EnumDifficulty, Equipment> builtEquipmentOptions;
    private int equipmentDispenseTimeoutTicks = 100;
    private String dispenseSound;
    private String equipmentNotAvailableSound;
    private CompatibleSound dispenseCompatibleSound;
    private CompatibleSound equipmentNotAvailableCompatibleSound;

    public LootBoxConfiguration withEquipmentOption(Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?> ... attachments) {
        this.withEquipmentOption(this.equipmentOptions, item, difficultyLevel, weight, attachments);
        return this;
    }

    public LootBoxConfiguration withEquipmentOption(Item item, EnumDifficulty difficultyLevel, float weight, int stackSize) {
        this.withEquipmentOption(this.equipmentOptions, item, difficultyLevel, weight, stackSize);
        return this;
    }

    public LootBoxConfiguration withEquipmentDispenseTimeout(int timeoutSeconds) {
        this.equipmentDispenseTimeoutTicks = timeoutSeconds * 20;
        return this;
    }

    public LootBoxConfiguration withEquipementDispenseSound(String sound) {
        this.dispenseSound = sound.toLowerCase();
        return this;
    }

    public LootBoxConfiguration withEquipmentNotAvailableSound(String sound) {
        this.equipmentNotAvailableSound = sound.toLowerCase();
        return this;
    }

    private LootBoxConfiguration withEquipmentOption(Map<EquipmentKey, EquipmentValue> equipmentOptions, Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?> ... attachments) {
        Equipment equipment = new Equipment();
        equipment.item = item;
        equipment.attachments = Arrays.asList(attachments);
        EnumDifficulty[] difficultyValues = EnumDifficulty.values();
        for (int i = difficultyLevel.ordinal(); i < difficultyValues.length; ++i) {
            equipmentOptions.put(new EquipmentKey(difficultyValues[i], equipment.item, attachments), new EquipmentValue(equipment, weight));
        }
        return this;
    }

    private LootBoxConfiguration withEquipmentOption(Map<EquipmentKey, EquipmentValue> equipmentOptions, Item item, EnumDifficulty difficultyLevel, float weight, int stackSize) {
        Equipment equipment = new Equipment();
        equipment.item = item;
        equipment.stackSize = stackSize;
        equipment.attachments = Collections.emptyList();
        EnumDifficulty[] difficultyValues = EnumDifficulty.values();
        for (int i = difficultyLevel.ordinal(); i < difficultyValues.length; ++i) {
            equipmentOptions.put(new EquipmentKey(difficultyValues[i], equipment.item, stackSize), new EquipmentValue(equipment, weight));
        }
        return this;
    }

    @Override
    protected Class<? extends TileEntity> getBaseClass() {
        return LootBoxTileEntity.class;
    }

    @Override
    public void build(ModContext modContext) {
        WeightedOptions.Builder equipmentOptionsBuilder = new WeightedOptions.Builder();
        this.equipmentOptions.forEach((key, value) -> equipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight));
        this.builtEquipmentOptions = equipmentOptionsBuilder.build();
        this.dispenseCompatibleSound = modContext.registerSound(this.dispenseSound);
        this.equipmentNotAvailableCompatibleSound = modContext.registerSound(this.equipmentNotAvailableSound);
        super.build(modContext);
    }

    public WeightedOptions<EnumDifficulty, Equipment> getEquipmentOptions() {
        return this.builtEquipmentOptions;
    }

    public int getEquipmentDispenseTimeoutTicks() {
        return this.equipmentDispenseTimeoutTicks;
    }

    public CompatibleSound getDispenseSound() {
        return this.dispenseCompatibleSound;
    }

    public CompatibleSound getEquipmentNotAvailableSound() {
        return this.equipmentNotAvailableCompatibleSound;
    }

    private static class EquipmentKey {
        EnumDifficulty difficulty;
        Item item;
        ItemAttachment<?>[] attachments;
        int stackSize;

        public EquipmentKey(EnumDifficulty difficulty, Item item, ItemAttachment<?>[] attachments) {
            this.difficulty = difficulty;
            this.item = item;
            this.attachments = attachments;
        }

        public EquipmentKey(EnumDifficulty difficulty, Item item, int stackSize) {
            this.difficulty = difficulty;
            this.item = item;
            this.attachments = new ItemAttachment[0];
            this.stackSize = stackSize;
        }

        public int hashCode() {
            int prime = 31;
            int result = 1;
            result = 31 * result + Arrays.hashCode(this.attachments);
            result = 31 * result + (this.difficulty == null ? 0 : this.difficulty.hashCode());
            result = 31 * result + (this.item == null ? 0 : this.item.hashCode());
            result = 31 * result + this.stackSize;
            return result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            EquipmentKey other = (EquipmentKey)obj;
            if (!Arrays.equals(this.attachments, other.attachments)) {
                return false;
            }
            if (this.difficulty != other.difficulty) {
                return false;
            }
            if (this.item == null ? other.item != null : !this.item.equals(other.item)) {
                return false;
            }
            return this.stackSize == other.stackSize;
        }
    }

    private static class EquipmentValue {
        Equipment equipment;
        float weight;

        public EquipmentValue(Equipment equipment, float weight) {
            this.equipment = equipment;
            this.weight = weight;
        }
    }

    static class Equipment {
        Item item;
        List<ItemAttachment<?>> attachments;
        int stackSize = 1;

        Equipment() {
        }
    }
}


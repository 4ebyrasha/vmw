/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.crafting;

import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import java.util.LinkedHashMap;

public class OptionsMetadata {
    public static final Object EMPTY_OPTION = new Object();
    private OptionMetadata[] metadata;
    private boolean hasOres;

    private OptionsMetadata(OptionMetadata[] metadata, boolean hasOres) {
        this.metadata = metadata;
        this.hasOres = hasOres;
    }

    public OptionMetadata[] getMetadata() {
        return this.metadata;
    }

    public boolean hasOres() {
        return this.hasOres;
    }

    public static class OptionMetadataBuilder {
        LinkedHashMap<Object, OptionMetadata> optionMetadata = new LinkedHashMap();
        private int slotCount;

        public OptionMetadataBuilder withSlotCount(int slotCount) {
            this.slotCount = slotCount;
            return this;
        }

        public OptionMetadataBuilder withOption(int minOccurs, int maxOccurs) {
            OptionMetadata metadata = new OptionMetadata(EMPTY_OPTION, minOccurs, maxOccurs);
            metadata.minOccurs = minOccurs;
            metadata.maxOccurs = maxOccurs;
            this.optionMetadata.put(EMPTY_OPTION, metadata);
            return this;
        }

        public OptionMetadataBuilder withOption(Object option, int minOccurs, int maxOccurs) {
            String stringOption;
            if (minOccurs > maxOccurs) {
                throw new IllegalArgumentException("Min occurs must be less or equals maxOccurs");
            }
            if (option instanceof CompatibleBlocks) {
                option = ((CompatibleBlocks)option).getBlock();
            } else if (option instanceof CompatibleItems) {
                option = ((CompatibleItems)option).getItem();
            } else if (!(option instanceof String && ((stringOption = ((String)option).toLowerCase()).contains("ore") || stringOption.contains("ingot") || stringOption.contains("dust")) && stringOption.startsWith(":"))) {
                // empty if block
            }
            OptionMetadata metadata = new OptionMetadata(option, minOccurs, maxOccurs);
            metadata.minOccurs = minOccurs;
            metadata.maxOccurs = maxOccurs;
            this.optionMetadata.put(option, metadata);
            return this;
        }

        public OptionsMetadata build(CraftingComplexity complexity, Object ... options) {
            int complexityIndex = complexity.ordinal() + 1;
            if (options.length * complexityIndex > this.slotCount) {
                throw new IllegalArgumentException("Too many options for complexity level " + (Object)((Object)complexity));
            }
            for (Object option : options) {
                if (option == null) {
                    throw new IllegalArgumentException("Option cannot be null, make sure to initialize it before generating receipe");
                }
                this.withOption(option, complexityIndex, complexityIndex);
            }
            this.withOption(EMPTY_OPTION, 0, this.slotCount - options.length * complexityIndex);
            return this.build();
        }

        public OptionsMetadata build() {
            if (this.slotCount == 0) {
                throw new IllegalStateException("Slot count not set");
            }
            int totalMaxOccurs = 0;
            int totalMinOccurs = 0;
            boolean hasOres = false;
            for (OptionMetadata m : this.optionMetadata.values()) {
                totalMaxOccurs += m.maxOccurs;
                totalMinOccurs += m.minOccurs;
                if (!(m.getOption() instanceof String)) continue;
                hasOres = true;
            }
            if (totalMaxOccurs < this.slotCount) {
                throw new IllegalStateException("Total slot count is less than total max occurs");
            }
            if (totalMinOccurs > this.slotCount) {
                throw new IllegalStateException("Total max occurs exceeds the number of slots");
            }
            OptionMetadata[] metadata = (OptionMetadata[])this.optionMetadata.entrySet().stream().map(e -> new OptionMetadata(e.getKey(), ((OptionMetadata)e.getValue()).minOccurs, ((OptionMetadata)e.getValue()).maxOccurs)).toArray(OptionMetadata[]::new);
            return new OptionsMetadata(metadata, hasOres);
        }
    }

    static class OptionMetadata {
        private int minOccurs;
        private int maxOccurs;
        private Object option;

        private OptionMetadata(Object option, int minOccurs, int maxOccurs) {
            this.option = option;
            this.minOccurs = minOccurs;
            this.maxOccurs = maxOccurs;
        }

        protected int getMinOccurs() {
            return this.minOccurs;
        }

        protected int getMaxOccurs() {
            return this.maxOccurs;
        }

        protected Object getOption() {
            return this.option;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.crafting;

import com.vicmatskiv.weaponlib.crafting.OptionsMetadata;
import com.vicmatskiv.weaponlib.crafting.SequenceGenerator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

final class RecipeGenerator {
    private static final int SLOT_COUNT = 9;
    private SequenceGenerator sequenceGenerator = new SequenceGenerator(9);

    RecipeGenerator() {
    }

    public List<Object> createShapedRecipe(String name, OptionsMetadata metadata) {
        List<Object> sequence = this.sequenceGenerator.generate(name, this.createSeed(name, metadata), metadata);
        LinkedHashMap<Object, Character> encodingMap = new LinkedHashMap<Object, Character>();
        char startFrom = 'A';
        for (OptionsMetadata.OptionMetadata optionMetadata : metadata.getMetadata()) {
            char code;
            if (optionMetadata.getOption() == OptionsMetadata.EMPTY_OPTION) {
                code = ' ';
            } else {
                char c = startFrom;
                startFrom = (char)(startFrom + 1);
                code = c;
            }
            encodingMap.put(optionMetadata.getOption(), Character.valueOf(code));
        }
        ArrayList<Object> output = new ArrayList<Object>();
        StringBuilder builder = new StringBuilder();
        int i = 0;
        for (Object t : sequence) {
            builder.append(encodingMap.get(t));
            if (++i % 3 != 0) continue;
            output.add(builder.toString());
            builder.setLength(0);
        }
        encodingMap.entrySet().stream().filter(e -> e.getKey() != OptionsMetadata.EMPTY_OPTION).forEach(e -> {
            output.add(e.getValue());
            output.add(e.getKey());
        });
        return output;
    }

    private byte[] createSeed(String name, OptionsMetadata metadata) {
        return (name + metadata.getMetadata().length).getBytes();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class WeightedOptions<Category, T> {
    private Map<Category, OptionsByCategory<Category, T>> optionsByCategory;
    private Random random = new Random();

    private WeightedOptions(Map<Category, OptionsByCategory<Category, T>> optionsByCategory) {
        this.optionsByCategory = optionsByCategory;
    }

    public WeightedOptions() {
        this.optionsByCategory = new HashMap<Category, OptionsByCategory<Category, T>>();
    }

    public T pick(Category category) {
        T item = null;
        OptionsByCategory<Category, T> options = this.optionsByCategory.get(category);
        if (options != null) {
            Option marker = new Option();
            marker.rangeStart = this.random.nextFloat() * options.totalWeight;
            Option result = options.options.floor(marker);
            if (result != null) {
                item = result.item;
            }
        }
        return item;
    }

    public void serialize(ByteBuf buf, BiConsumer<T, ByteBuf> itemWriter, BiConsumer<Category, ByteBuf> categoryWriter) {
        int total = this.optionsByCategory.entrySet().stream().flatMap(e -> ((OptionsByCategory)e.getValue()).options.stream()).mapToInt(e -> 1).sum();
        buf.writeInt(total);
        for (OptionsByCategory<Category, T> options : this.optionsByCategory.values()) {
            for (Option option : options.options) {
                categoryWriter.accept(option.category, buf);
                itemWriter.accept(option.item, buf);
                buf.writeFloat(option.weight);
            }
        }
    }

    public void deserialize(ByteBuf buf, Function<ByteBuf, T> itemReader, Function<ByteBuf, Category> categoryReader) {
        int total = buf.readInt();
        for (int i = 0; i < total; ++i) {
            Option option = new Option();
            option.category = categoryReader.apply(buf);
            option.item = itemReader.apply(buf);
            option.weight = buf.readFloat();
            OptionsByCategory optionsForSingleCategory = this.optionsByCategory.computeIfAbsent(option.category, d -> new OptionsByCategory());
            option.rangeStart = optionsForSingleCategory.totalWeight;
            optionsForSingleCategory.totalWeight += option.weight;
            optionsForSingleCategory.options.add(option);
        }
    }

    public static class Builder<Category, T> {
        private List<Option<Category, T>> options = new ArrayList<Option<Category, T>>();

        public Builder<Category, T> withOption(T item, Category category, float weight) {
            Option o = new Option();
            o.item = item;
            o.category = category;
            o.weight = weight;
            this.options.add(o);
            return this;
        }

        public WeightedOptions<Category, T> build() {
            HashMap<Object, OptionsByCategory> optionsByCategory = new HashMap<Object, OptionsByCategory>();
            for (Option<Category, T> option : this.options) {
                OptionsByCategory optionsForSingleCategory = optionsByCategory.computeIfAbsent(option.category, d -> new OptionsByCategory());
                option.rangeStart = optionsForSingleCategory.totalWeight;
                optionsForSingleCategory.totalWeight += option.weight;
                optionsForSingleCategory.options.add(option);
            }
            return new WeightedOptions(optionsByCategory);
        }
    }

    private static class OptionsByCategory<Category, T> {
        NavigableSet<Option<Category, T>> options = new TreeSet<Option<Category, T>>((o1, o2) -> Float.valueOf(o1.rangeStart).compareTo(Float.valueOf(o2.rangeStart)));
        float totalWeight;

        private OptionsByCategory() {
        }
    }

    private static class Option<Category, T> {
        T item;
        Category category;
        float weight;
        float rangeStart;

        private Option() {
        }
    }
}


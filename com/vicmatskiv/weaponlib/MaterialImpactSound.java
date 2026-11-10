/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaterialImpactSound {
    private List<CompatibleSound> sounds = new ArrayList<CompatibleSound>();
    private float volume;
    private Random rand = new Random();

    public MaterialImpactSound(float volume) {
        this.volume = volume;
    }

    public void addSound(CompatibleSound sound) {
        this.sounds.add(sound);
    }

    public CompatibleSound getSound() {
        int soundIndex = this.rand.nextInt(this.sounds.size());
        return this.sounds.get(soundIndex);
    }

    public float getVolume() {
        return this.volume;
    }
}


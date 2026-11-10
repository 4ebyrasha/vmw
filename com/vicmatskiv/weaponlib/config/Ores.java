/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.config;

import com.vicmatskiv.weaponlib.config.Ore;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="Ores", propOrder={"ore"})
public class Ores {
    protected List<Ore> ore;

    public List<Ore> getOre() {
        if (this.ore == null) {
            this.ore = new ArrayList<Ore>();
        }
        return this.ore;
    }
}


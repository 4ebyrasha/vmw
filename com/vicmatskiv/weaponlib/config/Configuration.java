/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.config;

import com.vicmatskiv.weaponlib.config.AI;
import com.vicmatskiv.weaponlib.config.Explosions;
import com.vicmatskiv.weaponlib.config.Gui;
import com.vicmatskiv.weaponlib.config.Ores;
import com.vicmatskiv.weaponlib.config.Projectiles;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="Configuration", propOrder={"ores", "explosions", "projectiles", "gui", "ai"})
public class Configuration {
    protected Ores ores;
    protected Explosions explosions;
    protected Projectiles projectiles;
    protected Gui gui;
    protected AI ai;

    public Ores getOres() {
        return this.ores;
    }

    public void setOres(Ores value) {
        this.ores = value;
    }

    public Explosions getExplosions() {
        return this.explosions;
    }

    public void setExplosions(Explosions value) {
        this.explosions = value;
    }

    public Projectiles getProjectiles() {
        return this.projectiles;
    }

    public void setProjectiles(Projectiles value) {
        this.projectiles = value;
    }

    public Gui getGui() {
        return this.gui;
    }

    public void setGui(Gui value) {
        this.gui = value;
    }

    public AI getAi() {
        return this.ai;
    }

    public void setAi(AI value) {
        this.ai = value;
    }
}


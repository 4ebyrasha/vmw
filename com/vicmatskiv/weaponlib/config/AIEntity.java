/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.config;

import com.vicmatskiv.weaponlib.config.EntityEquipment;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="AIEntity", propOrder={"equipment"})
public class AIEntity {
    protected List<EntityEquipment> equipment;
    @XmlAttribute(name="name")
    protected String name;
    @XmlAttribute(name="health")
    protected Float health;
    @XmlAttribute(name="spawn")
    protected Float spawn;

    public List<EntityEquipment> getEquipment() {
        if (this.equipment == null) {
            this.equipment = new ArrayList<EntityEquipment>();
        }
        return this.equipment;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Float getHealth() {
        return this.health;
    }

    public void setHealth(Float value) {
        this.health = value;
    }

    public Float getSpawn() {
        return this.spawn;
    }

    public void setSpawn(Float value) {
        this.spawn = value;
    }
}


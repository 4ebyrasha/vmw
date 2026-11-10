/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="Gun")
public class Gun {
    @XmlAttribute(name="id")
    protected String id;
    @XmlAttribute(name="enabled")
    protected Boolean enabled;
    @XmlAttribute(name="damage")
    protected Float damage;

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public boolean isEnabled() {
        if (this.enabled == null) {
            return true;
        }
        return this.enabled;
    }

    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    public float getDamage() {
        if (this.damage == null) {
            return 1.0f;
        }
        return this.damage.floatValue();
    }

    public void setDamage(Float value) {
        this.damage = value;
    }
}


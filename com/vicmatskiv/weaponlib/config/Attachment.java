/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="Attachment")
public class Attachment {
    @XmlAttribute(name="id")
    protected String id;

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }
}


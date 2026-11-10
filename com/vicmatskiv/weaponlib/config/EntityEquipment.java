/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.config;

import com.vicmatskiv.weaponlib.config.Attachment;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="EntityEquipment", propOrder={"attachment"})
public class EntityEquipment {
    protected List<Attachment> attachment;
    @XmlAttribute(name="id")
    protected String id;
    @XmlAttribute(name="weight")
    protected Float weight;

    public List<Attachment> getAttachment() {
        if (this.attachment == null) {
            this.attachment = new ArrayList<Attachment>();
        }
        return this.attachment;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public Float getWeight() {
        return this.weight;
    }

    public void setWeight(Float value) {
        this.weight = value;
    }
}


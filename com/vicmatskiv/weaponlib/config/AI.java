/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.config;

import com.vicmatskiv.weaponlib.config.AIEntity;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="AI", propOrder={"entity"})
public class AI {
    protected List<AIEntity> entity;

    public List<AIEntity> getEntity() {
        if (this.entity == null) {
            this.entity = new ArrayList<AIEntity>();
        }
        return this.entity;
    }
}


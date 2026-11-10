/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.config;

import com.vicmatskiv.weaponlib.config.Gun;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="Projectiles", propOrder={"gun"})
public class Projectiles {
    protected List<Gun> gun;
    @XmlAttribute(name="bleedingOnHit")
    protected Float bleedingOnHit;
    @XmlAttribute(name="destroyGlassBlocks")
    protected Boolean destroyGlassBlocks;
    @XmlAttribute(name="knockbackOnHit")
    protected Boolean knockbackOnHit;
    @XmlAttribute(name="muzzleEffects")
    protected Boolean muzzleEffects;
    @XmlAttribute(name="blurOnAim")
    protected Boolean blurOnAim;
    @XmlAttribute(name="renderOptimization")
    protected Float renderOptimization;

    public List<Gun> getGun() {
        if (this.gun == null) {
            this.gun = new ArrayList<Gun>();
        }
        return this.gun;
    }

    public Float getBleedingOnHit() {
        return this.bleedingOnHit;
    }

    public void setBleedingOnHit(Float value) {
        this.bleedingOnHit = value;
    }

    public Boolean isDestroyGlassBlocks() {
        return this.destroyGlassBlocks;
    }

    public void setDestroyGlassBlocks(Boolean value) {
        this.destroyGlassBlocks = value;
    }

    public Boolean isKnockbackOnHit() {
        return this.knockbackOnHit;
    }

    public void setKnockbackOnHit(Boolean value) {
        this.knockbackOnHit = value;
    }

    public Boolean isMuzzleEffects() {
        return this.muzzleEffects;
    }

    public void setMuzzleEffects(Boolean value) {
        this.muzzleEffects = value;
    }

    public Boolean isBlurOnAim() {
        return this.blurOnAim;
    }

    public void setBlurOnAim(Boolean value) {
        this.blurOnAim = value;
    }

    public Float getRenderOptimization() {
        return this.renderOptimization;
    }

    public void setRenderOptimization(Float renderOptimization) {
        this.renderOptimization = renderOptimization;
    }
}


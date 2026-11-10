/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib.config;

import com.vicmatskiv.weaponlib.config.AI;
import com.vicmatskiv.weaponlib.config.AIEntity;
import com.vicmatskiv.weaponlib.config.Attachment;
import com.vicmatskiv.weaponlib.config.Configuration;
import com.vicmatskiv.weaponlib.config.EntityEquipment;
import com.vicmatskiv.weaponlib.config.Explosions;
import com.vicmatskiv.weaponlib.config.Gui;
import com.vicmatskiv.weaponlib.config.Gun;
import com.vicmatskiv.weaponlib.config.Ore;
import com.vicmatskiv.weaponlib.config.Ores;
import com.vicmatskiv.weaponlib.config.Projectiles;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private static final QName _Configuration_QNAME = new QName("http://moderwarfaremod.org/config", "configuration");

    public Configuration createConfiguration() {
        return new Configuration();
    }

    public Gun createGun() {
        return new Gun();
    }

    public Ore createOre() {
        return new Ore();
    }

    public Ores createOres() {
        return new Ores();
    }

    public Projectiles createProjectiles() {
        return new Projectiles();
    }

    public EntityEquipment createEntityEquipment() {
        return new EntityEquipment();
    }

    public AI createAI() {
        return new AI();
    }

    public Explosions createExplosions() {
        return new Explosions();
    }

    public Gui createGui() {
        return new Gui();
    }

    public Attachment createAttachment() {
        return new Attachment();
    }

    public AIEntity createAIEntity() {
        return new AIEntity();
    }

    @XmlElementDecl(namespace="http://moderwarfaremod.org/config", name="configuration")
    public JAXBElement<Configuration> createConfiguration(Configuration value) {
        return new JAXBElement<Configuration>(_Configuration_QNAME, Configuration.class, null, value);
    }
}


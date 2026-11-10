/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.config;

import com.vicmatskiv.weaponlib.config.AI;
import com.vicmatskiv.weaponlib.config.AIEntity;
import com.vicmatskiv.weaponlib.config.Configuration;
import com.vicmatskiv.weaponlib.config.Explosions;
import com.vicmatskiv.weaponlib.config.Gui;
import com.vicmatskiv.weaponlib.config.Gun;
import com.vicmatskiv.weaponlib.config.ObjectFactory;
import com.vicmatskiv.weaponlib.config.Ore;
import com.vicmatskiv.weaponlib.config.Ores;
import com.vicmatskiv.weaponlib.config.Projectiles;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigurationManager {
    private static final Logger logger = LogManager.getLogger(ConfigurationManager.class);
    private static final float DROP_BLOCK_COEFFICIENT_MIN = 0.0f;
    private static final float DROP_BLOCK_COEFFICIENT_MAX = 5.0f;
    private static final float EXPLOSION_COEFFICIENT_MAX = 2.0f;
    private static final float EXPLOSION_COEFFICIENT_MIN = 0.2f;
    private static final float BLEEDING_ON_HIT_COEFFICIENT_MIN = 0.0f;
    private static final float BLEEDING_ON_HIT_COEFFICIENT_MAX = 1.0f;
    private static final float RENDER_OPTIMIZATION_MIN = 0.0f;
    private static final float RENDER_OPTIMIZATION_MAX = 1.0f;
    private static final int ORE_MIN_PER_CHUNK = 0;
    private static final int ORE_MAX_PER_CHUNK = 50;
    private static final Predicate<Ore> DEFAULT_ORE_VALIDATOR = ore -> ore.spawnsPerChunk >= 0 && ore.spawnsPerChunk <= 50;
    private static final Predicate<Explosions> DEFAULT_EXPLOSIONS_VALIDATOR = explosions -> explosions != null;
    private Configuration config;
    private File userConfigFile;
    private Builder builder;

    protected ConfigurationManager(Configuration config, File userConfigFile, Builder builder) {
        this.config = config;
        this.userConfigFile = userConfigFile;
        this.builder = builder;
    }

    protected Configuration getConfiguration() {
        return this.config;
    }

    public void save() {
        if (this.userConfigFile.exists() && this.builder.userConfig == null) {
            String extension = ".invalid." + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            File invalidFileCopy = new File(this.userConfigFile.toString() + extension);
            try {
                Files.move(this.userConfigFile.toPath(), invalidFileCopy.toPath(), new CopyOption[0]);
            }
            catch (IOException e) {
                logger.error("Failed to rename {} to {}", (Object)this.userConfigFile, (Object)invalidFileCopy);
            }
        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty("jaxb.formatted.output", true);
            if (this.userConfigFile != null) {
                marshaller.marshal(new ObjectFactory().createConfiguration(this.config), this.userConfigFile);
            } else {
                marshaller.marshal(new ObjectFactory().createConfiguration(this.config), System.out);
            }
        }
        catch (JAXBException e) {
            logger.error("Failed to save configuration to {}", (Object)this.userConfigFile);
        }
    }

    public Explosions getExplosions() {
        return this.config.getExplosions();
    }

    public Ore getOre(String oreName) {
        Ores ores = this.config.getOres();
        if (ores == null) {
            return null;
        }
        return ores.getOre().stream().filter(o -> oreName.equalsIgnoreCase(o.getName())).findFirst().orElse(null);
    }

    public Projectiles getProjectiles() {
        return this.config.getProjectiles();
    }

    public StatusBarPosition getStatusBarPosition() {
        return this.builder.statusBarPosition;
    }

    public Gun getGun(String id) {
        return (Gun)this.builder.guns.get(id);
    }

    public AIEntity getAIEntity(String name) {
        return (AIEntity)this.builder.aiEntities.get(name);
    }

    static /* synthetic */ Predicate access$000() {
        return DEFAULT_ORE_VALIDATOR;
    }

    static /* synthetic */ Predicate access$100() {
        return DEFAULT_EXPLOSIONS_VALIDATOR;
    }

    public static final class Builder {
        private static final float DEFAULT_GUN_DAMAGE_MULTIPLIER = 1.0f;
        private static final float MAX_GUN_DAMAGE_MULTIPLIER = 2.0f;
        private static final float MIN_GUN_DAMAGE_MULTIPLIER = 0.1f;
        private Map<String, Gun> guns = new LinkedHashMap<String, Gun>();
        private Map<String, AIEntity> aiEntities = new LinkedHashMap<String, AIEntity>();
        private Source defaultConfigSource;
        private Source userConfigSource;
        private File userConfigFile;
        private StatusBarPosition statusBarPosition = StatusBarPosition.TOP_RIGHT;
        private Predicate<Ore> oreValidator = ConfigurationManager.access$000();
        private Predicate<Explosions> explosionsValidator = ConfigurationManager.access$100();
        private Configuration userConfig;

        public Builder withDefaultConfiguration(Source defaultConfigSource) {
            this.defaultConfigSource = defaultConfigSource;
            return this;
        }

        Builder withUserConfiguration(Source userConfigSource) {
            this.userConfigSource = userConfigSource;
            return this;
        }

        public Builder withUserConfiguration(File userConfigFile) {
            this.userConfigFile = userConfigFile;
            this.userConfigSource = new StreamSource(userConfigFile);
            return this;
        }

        public Builder withOreValidator(Predicate<Ore> oreValidator) {
            this.oreValidator = oreValidator;
            return this;
        }

        public Builder withExplosionsValidator(Predicate<Explosions> explosionsValidator) {
            this.explosionsValidator = explosionsValidator;
            return this;
        }

        public ConfigurationManager build() {
            Configuration defaultUpdatableConfig = Builder.createConfiguration(this.defaultConfigSource);
            this.userConfig = Builder.createConfiguration(this.userConfigSource);
            return new ConfigurationManager(this.merge(this.userConfig, defaultUpdatableConfig), this.userConfigFile, this);
        }

        static Configuration createConfiguration(Source source) {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                JAXBElement<Configuration> configElement = jaxbUnmarshaller.unmarshal(source, Configuration.class);
                return configElement.getValue();
            }
            catch (JAXBException e) {
                System.err.println("Failed to parse configuration: " + e);
                return null;
            }
        }

        private Configuration merge(Configuration userConfig, Configuration defaultUpdatableConfig) {
            this.mergeOres(userConfig, defaultUpdatableConfig);
            this.mergeExplosions(userConfig, defaultUpdatableConfig);
            this.mergeProjectiles(userConfig, defaultUpdatableConfig);
            this.mergeGui(userConfig, defaultUpdatableConfig);
            this.mergeAi(userConfig, defaultUpdatableConfig);
            return defaultUpdatableConfig;
        }

        private void mergeExplosions(Configuration userConfig, Configuration defaultUpdatableConfig) {
            if (userConfig != null && this.explosionsValidator.test(userConfig.getExplosions())) {
                Float userDamageCoefficient = userConfig.getExplosions().getDamage();
                if (userDamageCoefficient == null) {
                    userDamageCoefficient = defaultUpdatableConfig.getExplosions().getDamage();
                } else if (userDamageCoefficient.floatValue() < 0.2f) {
                    userDamageCoefficient = Float.valueOf(0.2f);
                } else if (userDamageCoefficient.floatValue() > 2.0f) {
                    userDamageCoefficient = Float.valueOf(2.0f);
                }
                defaultUpdatableConfig.getExplosions().setDamage(userDamageCoefficient);
                Float userDropBlockChance = userConfig.getExplosions().getDropBlockChance();
                if (userDropBlockChance == null) {
                    userDropBlockChance = defaultUpdatableConfig.getExplosions().getDropBlockChance();
                } else if (userDropBlockChance.floatValue() < 0.0f) {
                    userDropBlockChance = Float.valueOf(0.0f);
                } else if (userDropBlockChance.floatValue() > 5.0f) {
                    userDropBlockChance = Float.valueOf(5.0f);
                }
                defaultUpdatableConfig.getExplosions().setDropBlockChance(userDropBlockChance);
            }
        }

        private void mergeAi(Configuration userConfig, Configuration defaultUpdatableConfig) {
            if (defaultUpdatableConfig.getAi() != null) {
                defaultUpdatableConfig.getAi().getEntity().stream().filter(aiEntity -> aiEntity.getName() != null).forEach(aiEntity -> {
                    if (aiEntity.getHealth().floatValue() <= 0.1f || aiEntity.getHealth().floatValue() > 2.0f) {
                        aiEntity.setHealth(Float.valueOf(1.0f));
                    }
                    if (aiEntity.getSpawn().floatValue() < 0.0f || aiEntity.getSpawn().floatValue() > 5.0f) {
                        aiEntity.setSpawn(Float.valueOf(1.0f));
                    }
                    this.aiEntities.put(aiEntity.getName(), (AIEntity)aiEntity);
                });
            }
            if (userConfig != null && userConfig.getAi() != null) {
                for (AIEntity aiEntity2 : userConfig.getAi().getEntity()) {
                    if (aiEntity2.getName() == null) continue;
                    if (aiEntity2.getHealth().floatValue() <= 0.1f || aiEntity2.getHealth().floatValue() > 2.0f) {
                        aiEntity2.setHealth(Float.valueOf(1.0f));
                    }
                    if (aiEntity2.getSpawn().floatValue() < 0.0f || aiEntity2.getSpawn().floatValue() > 5.0f) {
                        aiEntity2.setSpawn(Float.valueOf(1.0f));
                    }
                    this.aiEntities.put(aiEntity2.getName(), aiEntity2);
                }
            }
            if (!this.aiEntities.isEmpty()) {
                AI ai = defaultUpdatableConfig.getAi();
                if (ai == null) {
                    ai = new AI();
                    defaultUpdatableConfig.setAi(ai);
                }
                ai.getEntity().clear();
                ai.getEntity().addAll(this.aiEntities.values());
            }
        }

        private void mergeProjectiles(Configuration userConfig, Configuration defaultUpdatableConfig) {
            if (defaultUpdatableConfig.getProjectiles() != null) {
                defaultUpdatableConfig.getProjectiles().getGun().stream().filter(gun -> gun.getId() != null).forEach(gun -> {
                    if (gun.getDamage() < 0.1f || gun.getDamage() > 2.0f) {
                        gun.setDamage(Float.valueOf(1.0f));
                    }
                    this.guns.put(gun.getId(), (Gun)gun);
                });
            }
            if (userConfig != null && userConfig.getProjectiles() != null) {
                Float bleedingOnHit;
                Float renderOptimization = userConfig.getProjectiles().getRenderOptimization();
                if (renderOptimization != null) {
                    if (renderOptimization.floatValue() < 0.0f) {
                        renderOptimization = Float.valueOf(0.0f);
                    } else if (renderOptimization.floatValue() > 1.0f) {
                        renderOptimization = Float.valueOf(1.0f);
                    }
                    defaultUpdatableConfig.getProjectiles().setRenderOptimization(renderOptimization);
                }
                if ((bleedingOnHit = userConfig.getProjectiles().getBleedingOnHit()) != null) {
                    if (bleedingOnHit.floatValue() < 0.0f) {
                        bleedingOnHit = Float.valueOf(0.0f);
                    } else if (bleedingOnHit.floatValue() > 1.0f) {
                        bleedingOnHit = Float.valueOf(1.0f);
                    }
                    defaultUpdatableConfig.getProjectiles().setBleedingOnHit(bleedingOnHit);
                }
                if (userConfig.getProjectiles().isDestroyGlassBlocks() != null) {
                    defaultUpdatableConfig.getProjectiles().setDestroyGlassBlocks(userConfig.getProjectiles().isDestroyGlassBlocks());
                }
                if (userConfig.getProjectiles().isKnockbackOnHit() != null) {
                    defaultUpdatableConfig.getProjectiles().setKnockbackOnHit(userConfig.getProjectiles().isKnockbackOnHit());
                }
                if (userConfig.getProjectiles().isMuzzleEffects() != null) {
                    defaultUpdatableConfig.getProjectiles().setMuzzleEffects(userConfig.getProjectiles().isMuzzleEffects());
                }
                if (userConfig.getProjectiles().isBlurOnAim() != null) {
                    defaultUpdatableConfig.getProjectiles().setBlurOnAim(userConfig.getProjectiles().isBlurOnAim());
                }
                for (Gun gun2 : userConfig.getProjectiles().getGun()) {
                    if (gun2.getDamage() < 0.1f || gun2.getDamage() > 2.0f) {
                        gun2.setDamage(Float.valueOf(1.0f));
                    }
                    if (gun2.getId() == null) continue;
                    this.guns.put(gun2.getId(), gun2);
                }
            }
            if (defaultUpdatableConfig.getProjectiles() != null) {
                defaultUpdatableConfig.getProjectiles().getGun().clear();
                defaultUpdatableConfig.getProjectiles().getGun().addAll(this.guns.values());
            }
        }

        private void mergeOres(Configuration userConfiguration, Configuration updatableDefaults) {
            if (userConfiguration != null && userConfiguration.getOres() != null) {
                updatableDefaults.getOres().getOre().forEach(updatableDefaultOre -> userConfiguration.getOres().getOre().stream().filter(o -> updatableDefaultOre.getName().equalsIgnoreCase(o.getName())).findFirst().ifPresent(userOre -> this.mergeOre((Ore)userOre, (Ore)updatableDefaultOre)));
            }
        }

        private void mergeOre(Ore userOre, Ore updatableDefaultOre) {
            if (this.oreValidator.test(userOre)) {
                updatableDefaultOre.spawnsPerChunk = userOre.spawnsPerChunk;
            }
        }

        private void mergeGui(Configuration userConfig, Configuration defaultUpdatableConfig) {
            if (userConfig != null && userConfig.getGui() != null && userConfig.getGui().getStatusBarPosition() != null) {
                try {
                    String positionValue = userConfig.getGui().getStatusBarPosition().toUpperCase().replaceAll("[\\.\\-\\s]+", "_");
                    this.statusBarPosition = StatusBarPosition.valueOf(positionValue);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    // empty catch block
                }
            }
            if (this.statusBarPosition == null) {
                this.statusBarPosition = StatusBarPosition.TOP_RIGHT;
            }
            if (defaultUpdatableConfig.getGui() == null) {
                defaultUpdatableConfig.setGui(new Gui());
            }
            defaultUpdatableConfig.getGui().setStatusBarPosition(this.statusBarPosition.toString());
        }
    }

    public static enum StatusBarPosition {
        TOP_RIGHT,
        BOTTOM_RIGHT,
        TOP_LEFT,
        BOTTOM_LEFT;

    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 *  net.minecraft.advancements.AdvancementManager
 *  net.minecraft.item.crafting.CraftingManager
 *  net.minecraft.util.JsonUtils
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.FilenameUtils
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.mission;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.vicmatskiv.weaponlib.mission.Action;
import com.vicmatskiv.weaponlib.mission.GoToLocationAction;
import com.vicmatskiv.weaponlib.mission.Goal;
import com.vicmatskiv.weaponlib.mission.KillEntityAction;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import com.vicmatskiv.weaponlib.mission.MissionReward;
import com.vicmatskiv.weaponlib.mission.ObtainItemAction;
import com.vicmatskiv.weaponlib.mission.TypeHierarchyDeserializer;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import net.minecraft.advancements.AdvancementManager;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.JsonUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MissionManager {
    private static final Logger logger = LogManager.getLogger(MissionManager.class);
    private Gson gson;
    private String modId;
    private Map<String, MissionOffering> offeringsByName = new HashMap<String, MissionOffering>();
    private Map<UUID, MissionOffering> offeringsById = new HashMap<UUID, MissionOffering>();
    private Map<String, List<UUID>> entityOfferings = new HashMap<String, List<UUID>>();
    private File missionsDir;
    private File entityMissionsFile;

    public MissionManager(String modId, File missionsDir, File entityMissionsFile) {
        this.modId = modId;
        this.missionsDir = missionsDir;
        this.entityMissionsFile = entityMissionsFile;
        this.gson = new GsonBuilder().registerTypeAdapter(MissionOffering.class, (Object)new MissionOffering.Deserializer()).registerTypeAdapter(Goal.class, (Object)new Goal.Deserializer()).registerTypeAdapter(KillEntityAction.class, (Object)new KillEntityAction.Deserializer()).registerTypeAdapter(ObtainItemAction.class, (Object)new ObtainItemAction.Deserializer()).registerTypeAdapter(GoToLocationAction.class, (Object)new GoToLocationAction.Deserializer()).registerTypeAdapter(MissionReward.ItemReward.class, (Object)new MissionReward.ItemReward.Deserializer()).registerTypeHierarchyAdapter(Action.class, new TypeHierarchyDeserializer<KillEntityAction>().registerType(KillEntityAction.class).registerType(ObtainItemAction.class).registerType(GoToLocationAction.class)).registerTypeAdapter(MissionReward.class, new TypeHierarchyDeserializer<MissionReward.ItemReward>().registerType(MissionReward.ItemReward.class)).create();
        this.reload();
    }

    private void reload() {
        this.loadCustomMissionOfferings();
        this.loadBuiltInMissionOfferings();
        this.loadEntityMissionsMappings();
    }

    private void loadEntityMissionsMappings() {
        if (!this.entityMissionsFile.exists()) {
            return;
        }
        try (FileReader reader = new FileReader(this.entityMissionsFile);){
            Map result = (Map)this.gson.fromJson((Reader)reader, Map.class);
            for (Map.Entry entry : result.entrySet()) {
                String entityName = (String)entry.getKey();
                ArrayList<UUID> offeringIds = new ArrayList<UUID>();
                List missionNames = (List)entry.getValue();
                for (Object missionName : missionNames) {
                    MissionOffering offering = this.offeringsByName.get(missionName);
                    if (offering == null) continue;
                    offeringIds.add(offering.getId());
                }
                this.entityOfferings.put(entityName, offeringIds);
            }
        }
        catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        catch (JsonIOException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateOfferings(Collection<MissionOffering> missionOfferings) {
        this.offeringsByName.clear();
        this.offeringsById.clear();
        missionOfferings.stream().forEach(m -> {
            this.offeringsByName.put(m.getMissionName(), (MissionOffering)m);
            this.offeringsById.put(m.getId(), (MissionOffering)m);
        });
        logger.info("Updated " + missionOfferings.size() + " mission offerings");
    }

    public void updateEntityOfferings(Map<String, List<UUID>> entityOfferings) {
        this.entityOfferings.clear();
        this.entityOfferings.putAll(entityOfferings);
    }

    public Map<String, List<UUID>> getEntityMissionOfferings() {
        return this.entityOfferings;
    }

    public Collection<MissionOffering> getOfferings() {
        return this.offeringsByName.values();
    }

    public MissionOffering getOffering(String missionName) {
        return this.offeringsByName.get(missionName);
    }

    public MissionOffering getOffering(UUID id) {
        return this.offeringsById.get(id);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void loadBuiltInMissionOfferings() {
        FileSystem filesystem = null;
        try {
            URI uri;
            block28: {
                block25: {
                    Path path;
                    block27: {
                        block26: {
                            URL url = AdvancementManager.class.getResource("/assets/" + this.modId + "/sounds.json");
                            if (url == null) break block25;
                            uri = url.toURI();
                            if (!"file".equals(uri.getScheme())) break block26;
                            URL resource = CraftingManager.class.getResource("/assets/" + this.modId + "/missions");
                            if (resource == null) {
                                IOUtils.closeQuietly((Closeable)filesystem);
                                return;
                            }
                            path = Paths.get(resource.toURI());
                            break block27;
                        }
                        if (!"jar".equals(uri.getScheme())) break block28;
                        filesystem = FileSystems.newFileSystem(uri, Collections.emptyMap());
                        path = filesystem.getPath("/assets/" + this.modId + "/missions", new String[0]);
                    }
                    Iterator iterator = Files.walk(path, new FileVisitOption[0]).iterator();
                    while (iterator.hasNext()) {
                        Path path1 = (Path)iterator.next();
                        if (!"json".equals(FilenameUtils.getExtension((String)path1.toString()))) continue;
                        try {
                            BufferedReader bufferedreader = Files.newBufferedReader(path1);
                            Throwable throwable = null;
                            try {
                                MissionOffering missionOffering = (MissionOffering)JsonUtils.func_193839_a((Gson)this.gson, (Reader)bufferedreader, MissionOffering.class);
                                this.offeringsByName.putIfAbsent(missionOffering.getMissionName(), missionOffering);
                                this.offeringsById.putIfAbsent(missionOffering.getId(), missionOffering);
                            }
                            catch (Throwable throwable2) {
                                throwable = throwable2;
                                throw throwable2;
                            }
                            finally {
                                if (bufferedreader == null) continue;
                                if (throwable != null) {
                                    try {
                                        bufferedreader.close();
                                    }
                                    catch (Throwable throwable3) {
                                        throwable.addSuppressed(throwable3);
                                    }
                                    continue;
                                }
                                bufferedreader.close();
                            }
                        }
                        catch (JsonParseException jsonparseexception) {
                            logger.error("Parsing error loading built-in mission " + path1, (Throwable)jsonparseexception);
                        }
                        catch (IOException ioexception) {
                            logger.error("Couldn't read mission from " + path1, (Throwable)ioexception);
                        }
                    }
                    IOUtils.closeQuietly((Closeable)filesystem);
                    return;
                }
                logger.error("Couldn't find mod resource root");
                return;
            }
            logger.error("Unsupported scheme " + uri + " trying to list all built-in missions");
            IOUtils.closeQuietly((Closeable)filesystem);
            return;
        }
        catch (IOException | URISyntaxException urisyntaxexception) {
            logger.error("Couldn't get a list of all built-in mission files", (Throwable)urisyntaxexception);
            return;
        }
        finally {
            IOUtils.closeQuietly(filesystem);
        }
    }

    private void loadCustomMissionOfferings() {
        this.missionsDir.mkdirs();
        for (File file1 : FileUtils.listFiles((File)this.missionsDir, (String[])new String[]{"json"}, (boolean)true)) {
            try {
                MissionOffering missionOffering = (MissionOffering)JsonUtils.func_193839_a((Gson)this.gson, (Reader)new FileReader(file1), MissionOffering.class);
                if (missionOffering == null) {
                    logger.error("Couldn't load custom mission from " + file1 + " as it's empty or null");
                    continue;
                }
                this.offeringsByName.put(missionOffering.getMissionName(), missionOffering);
                this.offeringsById.put(missionOffering.getId(), missionOffering);
            }
            catch (JsonParseException | IllegalArgumentException jsonparseexception) {
                logger.error("Parsing error loading custom mission from " + file1, jsonparseexception);
            }
            catch (IOException ioexception) {
                logger.error("Couldn't read custom mission from " + file1, (Throwable)ioexception);
            }
        }
    }

    public Map<UUID, MissionOffering> getEntityMissionOfferings(String name) {
        List<UUID> entityOfferingUuids = this.entityOfferings.get(name);
        Map<UUID, MissionOffering> result = null;
        result = entityOfferingUuids != null ? entityOfferingUuids.stream().map(id -> this.offeringsById.get(id)).filter(o -> o != null).collect(Collectors.toMap(e -> e.getId(), e -> e)) : Collections.emptyMap();
        return result;
    }
}


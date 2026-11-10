/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.vicmatskiv.weaponlib.mission;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMissionCapability;
import com.vicmatskiv.weaponlib.mission.Action;
import com.vicmatskiv.weaponlib.mission.GoToLocationAction;
import com.vicmatskiv.weaponlib.mission.Goal;
import com.vicmatskiv.weaponlib.mission.KillEntityAction;
import com.vicmatskiv.weaponlib.mission.Mission;
import com.vicmatskiv.weaponlib.mission.MissionAssigner;
import com.vicmatskiv.weaponlib.mission.MissionOffering;
import com.vicmatskiv.weaponlib.mission.MissionReward;
import com.vicmatskiv.weaponlib.mission.ObtainItemAction;
import com.vicmatskiv.weaponlib.mission.PlayerMissionSyncMessage;
import com.vicmatskiv.weaponlib.mission.TypeHierarchyDeserializer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class Missions {
    public static MissionOffering parse(String fileName) throws FileNotFoundException {
        Gson gson = new GsonBuilder().registerTypeAdapter(MissionOffering.class, (Object)new MissionOffering.Deserializer()).registerTypeAdapter(Goal.class, (Object)new Goal.Deserializer()).registerTypeAdapter(KillEntityAction.class, (Object)new KillEntityAction.Deserializer()).registerTypeAdapter(ObtainItemAction.class, (Object)new ObtainItemAction.Deserializer()).registerTypeAdapter(GoToLocationAction.class, (Object)new GoToLocationAction.Deserializer()).registerTypeAdapter(MissionReward.ItemReward.class, (Object)new MissionReward.ItemReward.Deserializer()).registerTypeHierarchyAdapter(Action.class, new TypeHierarchyDeserializer<KillEntityAction>().registerType(KillEntityAction.class).registerType(ObtainItemAction.class).registerType(GoToLocationAction.class)).registerTypeAdapter(MissionReward.class, new TypeHierarchyDeserializer<MissionReward.ItemReward>().registerType(MissionReward.ItemReward.class)).create();
        FileReader reader = new FileReader(fileName);
        MissionOffering offering = (MissionOffering)gson.fromJson((Reader)reader, MissionOffering.class);
        return offering;
    }

    public static void update(EntityPlayer player, Action action, ModContext modContext) {
        Set<Mission> missions = CompatibleMissionCapability.getMissions((Entity)player);
        for (Mission mission : missions) {
            if (mission.isCompleted(player) || !mission.update(action, player)) continue;
            if (mission.isCompleted(player)) {
                modContext.getStatusMessageCenter().addAlertMessage(CompatibilityProvider.compatibility.getLocalizedString("Mission accomplished!", new Object[0]), 3, 250L, 200L);
            }
            CompatibleMissionCapability.updateMission((Entity)player, mission);
            modContext.getChannel().getChannel().sendTo((IMessage)new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions((Entity)player)), (EntityPlayerMP)player);
            break;
        }
    }

    public static void redeem(EntityPlayer player, Mission mission, Entity assigner, ModContext modContext) {
    }

    public static void assign(EntityPlayer player, Mission mission, ModContext modContext) {
        CompatibleMissionCapability.updateMission((Entity)player, mission);
        modContext.getChannel().getChannel().sendTo((IMessage)new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions((Entity)player)), (EntityPlayerMP)player);
    }

    public static Collection<Mission> getMatchingMissions(MissionOffering missionOffering, EntityPlayer player, Predicate<Mission> predicate) {
        ArrayList<Mission> result = new ArrayList<Mission>();
        Set<Mission> missions = CompatibleMissionCapability.getMissions((Entity)player);
        for (Mission mission : missions) {
            if (!missionOffering.getId().equals(mission.getMissionOfferingId()) || !predicate.test(mission)) continue;
            result.add(mission);
        }
        return result;
    }

    public static Collection<Mission> getRedeemableMissions(MissionOffering missionOffering, EntityPlayer player) {
        return Missions.getMatchingMissions(missionOffering, player, mission -> mission.isCompleted(player) && !mission.isExpired(CompatibilityProvider.compatibility.world((Entity)player).func_82737_E()) && !mission.isRedeemed());
    }

    public static Collection<MissionOffering> getRedeemableMissionOfferings(MissionAssigner missionAssigner, EntityPlayer player) {
        ArrayList<MissionOffering> result = new ArrayList<MissionOffering>();
        for (MissionOffering missionOffering : missionAssigner.getMissionOfferings().values()) {
            if (Missions.getMatchingMissions(missionOffering, player, mission -> mission.isCompleted(player) && !mission.isExpired(CompatibilityProvider.compatibility.world((Entity)player).func_82737_E()) && !mission.isRedeemed()).isEmpty()) continue;
            result.add(missionOffering);
        }
        return result;
    }

    public static Collection<MissionOffering> getAvailableOfferings(MissionAssigner missionAssigner, EntityPlayer player) {
        ArrayList<MissionOffering> result = new ArrayList<MissionOffering>();
        for (MissionOffering missionOffering : missionAssigner.getMissionOfferings().values()) {
            if (!missionOffering.isAvailableFor(player)) continue;
            result.add(missionOffering);
        }
        return result;
    }
}


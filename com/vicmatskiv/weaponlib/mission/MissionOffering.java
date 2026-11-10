/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.util.JsonUtils
 */
package com.vicmatskiv.weaponlib.mission;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMissionCapability;
import com.vicmatskiv.weaponlib.mission.Action;
import com.vicmatskiv.weaponlib.mission.Goal;
import com.vicmatskiv.weaponlib.mission.Mission;
import com.vicmatskiv.weaponlib.mission.MissionReward;
import com.vicmatskiv.weaponlib.network.TypeRegistry;
import com.vicmatskiv.weaponlib.network.UniversallySerializable;
import io.netty.buffer.ByteBuf;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.JsonUtils;

public class MissionOffering
implements UniversallySerializable {
    public static final int DEFAULT_MAX_DURATION = 720000;
    public static final int DEFAULT_COOLDOWN_TIME = 24000000;
    private static Map<String, MissionOffering> allOfferings = new HashMap<String, MissionOffering>();
    private static Map<UUID, MissionOffering> allOfferingsById = new HashMap<UUID, MissionOffering>();
    private UUID id;
    private String missionName;
    private String missionDescription = "";
    private Level level = Level.EASY;
    private List<Goal> goals = new ArrayList<Goal>();
    private List<MissionReward> rewards = new ArrayList<MissionReward>();
    private long cooldownTime = 24000000L;
    private CompositeRequirement requirement = new CompositeRequirement();
    private long maxDuration = 720000L;

    private static void registerOffering(MissionOffering offering) {
        allOfferings.put(offering.getMissionName(), offering);
        allOfferingsById.put(offering.getId(), offering);
    }

    public static MissionOffering getOffering(UUID offeringId) {
        return allOfferingsById.get(offeringId);
    }

    public UUID getId() {
        return this.id;
    }

    public String getMissionName() {
        return this.missionName;
    }

    public String getMissionDescription() {
        return this.missionDescription;
    }

    public Level getLevel() {
        return this.level;
    }

    public List<MissionReward> getRewards() {
        return this.rewards;
    }

    public List<Goal> createGoals() {
        return this.goals.stream().map(s -> new Goal(s.getRequiredAction(), s.getQuantity())).collect(Collectors.toList());
    }

    public boolean isAvailableFor(EntityPlayer player) {
        return this.requirement.isSatisfied(player);
    }

    public long getMaxDuration() {
        return this.maxDuration;
    }

    public long getCooldownTime() {
        return this.cooldownTime;
    }

    @Override
    public void init(ByteBuf buf) {
        this.id = new UUID(buf.readLong(), buf.readLong());
        int nameBytesLen = buf.readInt();
        byte[] nameBytes = new byte[nameBytesLen];
        buf.readBytes(nameBytes);
        this.missionName = new String(nameBytes);
        int descriptionBytesLen = buf.readInt();
        byte[] descriptionBytes = new byte[descriptionBytesLen];
        buf.readBytes(descriptionBytes);
        this.missionDescription = new String(descriptionBytes);
        this.level = Level.values()[buf.readInt()];
        TypeRegistry typeRegistry = TypeRegistry.getInstance();
        this.requirement = (CompositeRequirement)typeRegistry.fromBytes(buf);
        int goalCount = buf.readInt();
        for (int i = 0; i < goalCount; ++i) {
            this.goals.add((Goal)typeRegistry.fromBytes(buf));
        }
        int rewardCount = buf.readInt();
        for (int i = 0; i < rewardCount; ++i) {
            this.rewards.add((MissionReward)typeRegistry.fromBytes(buf));
        }
    }

    @Override
    public void serialize(ByteBuf buf) {
        buf.writeLong(this.id.getMostSignificantBits());
        buf.writeLong(this.id.getLeastSignificantBits());
        byte[] nameBytes = this.missionName.getBytes(Charset.defaultCharset());
        buf.writeInt(nameBytes.length);
        buf.writeBytes(nameBytes);
        byte[] descriptionBytes = this.missionDescription.getBytes(Charset.defaultCharset());
        buf.writeInt(descriptionBytes.length);
        buf.writeBytes(descriptionBytes);
        buf.writeInt(this.level.ordinal());
        TypeRegistry typeRegistry = TypeRegistry.getInstance();
        typeRegistry.toBytes(this.requirement, buf);
        buf.writeInt(this.goals.size());
        for (Goal goal : this.goals) {
            typeRegistry.toBytes(goal, buf);
        }
        buf.writeInt(this.rewards.size());
        for (MissionReward reward : this.rewards) {
            typeRegistry.toBytes(reward, buf);
        }
    }

    public static class Builder {
        private static final String SHA1PRNG_ALG = "SHA1PRNG";
        private UUID id;
        private String missionName;
        private String missionDescription = "";
        private Level level = Level.EASY;
        private List<Goal> goals = new ArrayList<Goal>();
        private List<MissionReward> rewards = new ArrayList<MissionReward>();
        private long cooldownTime = 24000000L;
        private boolean isConcurrent;
        private CompositeRequirement requirement = new CompositeRequirement();
        private long maxDuration = 720000L;

        public Builder(String missionName) {
            this.missionName = missionName;
        }

        private static UUID getUuid(String seed) {
            try {
                SecureRandom random = SecureRandom.getInstance(SHA1PRNG_ALG);
                random.setSeed(seed.getBytes());
                return new UUID(random.nextLong(), random.nextLong());
            }
            catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Cannot generate unique id", e);
            }
        }

        public Builder withMissionDescription(String missionDescription) {
            this.missionDescription = missionDescription;
            return this;
        }

        public Builder withLevel(Level level) {
            this.level = level;
            return this;
        }

        public Builder withGoal(Action action, int quantity) {
            this.goals.add(new Goal(action, quantity));
            return this;
        }

        public Builder withReward(MissionReward reward) {
            this.rewards.add(reward);
            return this;
        }

        public Builder withReward(Item item) {
            this.rewards.add(new MissionReward.ItemReward(item, 1));
            return this;
        }

        public Builder withReward(Item item, int count) {
            this.rewards.add(new MissionReward.ItemReward(item, count));
            return this;
        }

        public Builder requiresAny(String ... requiredMissionNames) {
            this.requirement.requirements.add(new CompletedMissionRequirement(Arrays.asList(requiredMissionNames), false));
            return this;
        }

        public Builder requiresAll(String ... requiredMissionNames) {
            this.requirement.requirements.add(new CompletedMissionRequirement(Arrays.asList(requiredMissionNames), true));
            return this;
        }

        public Builder withCooldownTime(int cooldownTime) {
            this.cooldownTime = cooldownTime;
            return this;
        }

        public Builder allowConcurrent() {
            this.isConcurrent = true;
            return this;
        }

        public Builder withMaxDuration(long maxDuration) {
            this.maxDuration = maxDuration;
            return this;
        }

        public MissionOffering build() {
            this.id = Builder.getUuid(this.missionName);
            if (!this.isConcurrent) {
                this.requirement.requirements.add(new NoMissionsInProgressRequirement());
            }
            MissionOffering offering = new MissionOffering();
            offering.id = this.id;
            offering.missionName = this.missionName;
            offering.missionDescription = this.missionDescription;
            offering.level = this.level;
            offering.goals = this.goals;
            offering.rewards = this.rewards;
            offering.cooldownTime = this.cooldownTime;
            offering.requirement = this.requirement;
            offering.maxDuration = this.maxDuration;
            this.requirement.requirements.add(new CooldownMissionRequirement(offering.getId(), this.cooldownTime));
            MissionOffering.registerOffering(offering);
            return offering;
        }
    }

    public static class CompletedMissionRequirement
    implements Requirement {
        private boolean all;
        private Collection<String> requiredMissionNames;

        public CompletedMissionRequirement() {
            this.requiredMissionNames = new ArrayList<String>();
        }

        private CompletedMissionRequirement(Collection<String> requiredMissionNames, boolean all) {
            this.all = all;
            this.requiredMissionNames = Collections.unmodifiableCollection(requiredMissionNames);
        }

        @Override
        public boolean isSatisfied(EntityPlayer player) {
            Set<Mission> missions = CompatibleMissionCapability.getMissions((Entity)player);
            boolean completed = true;
            for (String requiredMissionName : this.requiredMissionNames) {
                MissionOffering offering = (MissionOffering)allOfferings.get(requiredMissionName);
                if (offering != null) {
                    Mission matchingMission = null;
                    for (Mission mission : missions) {
                        if (!mission.getMissionOfferingId().equals(offering.getId())) continue;
                        matchingMission = mission;
                        break;
                    }
                    if (!(completed &= matchingMission != null && matchingMission.isCompleted(player) && !matchingMission.isExpired(CompatibilityProvider.compatibility.world((Entity)player).func_82737_E())) || this.all) continue;
                    break;
                }
                System.err.print("Invalid mission name: " + requiredMissionName);
            }
            return completed;
        }

        @Override
        public void init(ByteBuf buf) {
            this.all = buf.readBoolean();
            int count = buf.readInt();
            for (int i = 0; i < count; ++i) {
                int strLen = buf.readInt();
                byte[] nameBytes = new byte[strLen];
                buf.readBytes(nameBytes);
                this.requiredMissionNames.add(new String(nameBytes));
            }
        }

        @Override
        public void serialize(ByteBuf buf) {
            buf.writeBoolean(this.all);
            buf.writeInt(this.requiredMissionNames.size());
            for (String missionName : this.requiredMissionNames) {
                byte[] nameBytes = missionName.getBytes(Charset.defaultCharset());
                buf.writeInt(nameBytes.length);
                buf.writeBytes(nameBytes);
            }
        }
    }

    public static class CompositeRequirement
    implements Requirement {
        private Collection<Requirement> requirements = new ArrayList<Requirement>();

        @Override
        public boolean isSatisfied(EntityPlayer player) {
            return this.requirements.stream().allMatch(r -> r.isSatisfied(player));
        }

        @Override
        public void init(ByteBuf buf) {
            int count = buf.readInt();
            for (int i = 0; i < count; ++i) {
                this.requirements.add((Requirement)TypeRegistry.getInstance().fromBytes(buf));
            }
        }

        @Override
        public void serialize(ByteBuf buf) {
            buf.writeInt(this.requirements.size());
            for (Requirement requirement : this.requirements) {
                TypeRegistry.getInstance().toBytes(requirement, buf);
            }
        }
    }

    public static class NoMissionsInProgressRequirement
    implements Requirement {
        @Override
        public boolean isSatisfied(EntityPlayer player) {
            Set<Mission> missions = CompatibleMissionCapability.getMissions((Entity)player);
            return missions.stream().allMatch(m -> m.isCompleted(player) || m.isExpired(CompatibilityProvider.compatibility.world((Entity)player).func_82737_E()));
        }

        @Override
        public void init(ByteBuf buf) {
        }

        @Override
        public void serialize(ByteBuf buf) {
        }
    }

    public static class CooldownMissionRequirement
    implements Requirement {
        private long cooldownTime;
        private UUID parentMissionOfferingId;

        public CooldownMissionRequirement() {
        }

        public CooldownMissionRequirement(UUID parentMissionOfferingId, long cooldownTime) {
            this.cooldownTime = cooldownTime;
            this.parentMissionOfferingId = parentMissionOfferingId;
        }

        @Override
        public boolean isSatisfied(EntityPlayer player) {
            Set<Mission> missions = CompatibleMissionCapability.getMissions((Entity)player);
            boolean isSatisfied = true;
            return isSatisfied &= missions.stream().allMatch(m -> !m.getMissionOfferingId().equals(this.parentMissionOfferingId) || m.getEndTime() + this.cooldownTime < CompatibilityProvider.compatibility.world((Entity)player).func_82737_E());
        }

        @Override
        public void init(ByteBuf buf) {
            this.parentMissionOfferingId = new UUID(buf.readLong(), buf.readLong());
            this.cooldownTime = buf.readLong();
        }

        @Override
        public void serialize(ByteBuf buf) {
            buf.writeLong(this.parentMissionOfferingId.getMostSignificantBits());
            buf.writeLong(this.parentMissionOfferingId.getLeastSignificantBits());
            buf.writeLong(this.cooldownTime);
        }
    }

    public static class NoRequirement
    implements Requirement {
        @Override
        public boolean isSatisfied(EntityPlayer player) {
            return true;
        }

        @Override
        public void init(ByteBuf buf) {
        }

        @Override
        public void serialize(ByteBuf buf) {
        }
    }

    public static interface Requirement
    extends UniversallySerializable {
        public boolean isSatisfied(EntityPlayer var1);
    }

    public static enum Level {
        EASY,
        MEDIUM,
        HARD;

    }

    public static class Deserializer
    implements JsonDeserializer<MissionOffering> {
        public MissionOffering deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            String missionName = JsonUtils.func_151200_h((JsonObject)jsonObject, (String)"name");
            Builder builder = new Builder(missionName);
            String missionDescription = JsonUtils.func_151200_h((JsonObject)jsonObject, (String)"description");
            builder.withMissionDescription(missionDescription);
            String levelName = JsonUtils.func_151200_h((JsonObject)jsonObject, (String)"level");
            builder.withLevel(Level.valueOf(levelName.toUpperCase()));
            JsonArray requiresAllArray = JsonUtils.func_151213_a((JsonObject)jsonObject, (String)"requiresAll", (JsonArray)new JsonArray());
            ArrayList<String> requiresAll = new ArrayList<String>();
            for (JsonElement requiresAllElement : requiresAllArray) {
                requiresAll.add(requiresAllElement.getAsString());
            }
            builder.requiresAll(requiresAll.toArray(new String[0]));
            JsonArray requiresAnyArray = JsonUtils.func_151213_a((JsonObject)jsonObject, (String)"requiresAny", (JsonArray)new JsonArray());
            if (requiresAnyArray.size() > 0 && requiresAllArray.size() > 0) {
                throw new IllegalArgumentException("Cannot use both requiresAll and requiresAny at the same time");
            }
            ArrayList<String> requiresAny = new ArrayList<String>();
            for (JsonElement requiresAnyElement : requiresAnyArray) {
                requiresAny.add(requiresAnyElement.getAsString());
            }
            builder.requiresAny(requiresAny.toArray(new String[0]));
            int cooldownTime = JsonUtils.func_151208_a((JsonObject)jsonObject, (String)"cooldownTime", (int)24000000);
            builder.withCooldownTime(cooldownTime);
            int maxDuration = JsonUtils.func_151208_a((JsonObject)jsonObject, (String)"maxDuration", (int)720000);
            builder.withMaxDuration(maxDuration);
            boolean allowConcurrent = JsonUtils.func_151209_a((JsonObject)jsonObject, (String)"allowConcurrent", (boolean)false);
            if (allowConcurrent) {
                builder.allowConcurrent();
            }
            JsonArray goalsArray = JsonUtils.func_151213_a((JsonObject)jsonObject, (String)"goals", (JsonArray)new JsonArray());
            for (JsonElement goalElement : goalsArray) {
                Goal goal = (Goal)context.deserialize(goalElement, Goal.class);
                builder.withGoal(goal.getRequiredAction(), goal.getQuantity());
            }
            JsonArray rewardsArray = JsonUtils.func_151213_a((JsonObject)jsonObject, (String)"rewards", (JsonArray)new JsonArray());
            for (JsonElement rewardElement : rewardsArray) {
                MissionReward reward = (MissionReward)context.deserialize(rewardElement, MissionReward.class);
                builder.withReward(reward);
            }
            return builder.build();
        }
    }
}


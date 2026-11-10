/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Matrix4f
 */
package com.vicmatskiv.weaponlib.animation;

import com.vicmatskiv.weaponlib.KeyBindings;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.animation.MatrixHelper;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.tracking.PlayerEntityTracker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

public class DebugPositioner {
    private static final Logger logger = LogManager.getLogger(DebugPositioner.class);
    private static final String WEAPONLIB_DEBUG_PROPERTY = "weaponlib.debug";
    private static Boolean debugModeEnabled;
    private static Part currentPart;
    private static Set<Part> debugParts;
    private static Entity watchableEntity;
    private static Map<Part, Position> partPositions;
    private static Map<Integer, TransitionConfiguration> transitionConfigurations;

    private static Position getCurrentPartPosition() {
        return partPositions.get(currentPart);
    }

    private static Position getDebugPartPosition(Part part) {
        return partPositions.get(part);
    }

    public static void incrementXRotation(float increment) {
        Position partPosition = DebugPositioner.getCurrentPartPosition();
        if (partPosition == null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
            return;
        }
        Position position = partPosition;
        position.xRotation = position.xRotation + increment;
        logger.debug("Debug rotations: ({}, {}, {}) ", (Object)Float.valueOf(partPosition.xRotation), (Object)Float.valueOf(partPosition.yRotation), (Object)Float.valueOf(partPosition.zRotation));
    }

    public static void incrementYRotation(float increment) {
        Position partPosition = DebugPositioner.getCurrentPartPosition();
        if (partPosition == null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
            return;
        }
        Position position = partPosition;
        position.yRotation = position.yRotation + increment;
        logger.debug("Debug rotations: ({}, {}, {}) ", (Object)Float.valueOf(partPosition.xRotation), (Object)Float.valueOf(partPosition.yRotation), (Object)Float.valueOf(partPosition.zRotation));
    }

    public static void incrementZRotation(float increment) {
        Position partPosition = DebugPositioner.getCurrentPartPosition();
        if (partPosition == null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
            return;
        }
        Position position = partPosition;
        position.zRotation = position.zRotation + increment;
        logger.debug("Debug rotations: ({}, {}, {}) ", (Object)Float.valueOf(partPosition.xRotation), (Object)Float.valueOf(partPosition.yRotation), (Object)Float.valueOf(partPosition.zRotation));
    }

    public static void incrementXPosition(float increment) {
        Position partPosition = DebugPositioner.getCurrentPartPosition();
        if (partPosition == null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
            return;
        }
        Position position = partPosition;
        position.x = position.x + partPosition.step * increment;
        logger.debug("Debug position: ({}, {}, {}) ", (Object)Float.valueOf(partPosition.x), (Object)Float.valueOf(partPosition.y), (Object)Float.valueOf(partPosition.z));
    }

    public static void incrementYPosition(float increment) {
        Position partPosition = DebugPositioner.getCurrentPartPosition();
        if (partPosition == null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
            return;
        }
        Position position = partPosition;
        position.y = position.y + partPosition.step * increment;
        logger.debug("Debug position: ({}, {}, {}) ", (Object)Float.valueOf(partPosition.x), (Object)Float.valueOf(partPosition.y), (Object)Float.valueOf(partPosition.z));
    }

    public static void incrementZPosition(float increment) {
        Position partPosition = DebugPositioner.getCurrentPartPosition();
        if (partPosition == null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
            return;
        }
        Position position = partPosition;
        position.z = position.z + partPosition.step * increment;
        logger.debug("Debug position: ({}, {}, {}) ", (Object)Float.valueOf(partPosition.x), (Object)Float.valueOf(partPosition.y), (Object)Float.valueOf(partPosition.z));
    }

    public static void setScale(float scale) {
        Position partPosition = DebugPositioner.getCurrentPartPosition();
        if (partPosition == null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
            return;
        }
        partPosition.scale = scale;
        logger.debug("Scale set to {}", (Object)Float.valueOf(scale));
    }

    public static void setStep(float step) {
        Position partPosition = DebugPositioner.getCurrentPartPosition();
        if (partPosition == null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
            return;
        }
        partPosition.step = step;
        logger.debug("Step set to {}", (Object)Float.valueOf(step));
    }

    public static void setDebugMode(boolean enabled) {
        debugModeEnabled = enabled;
        if (debugModeEnabled.booleanValue()) {
            KeyBindings.bindDebugKeys();
        }
    }

    public static boolean isDebugModeEnabled() {
        if (debugModeEnabled == null) {
            debugModeEnabled = Boolean.getBoolean(WEAPONLIB_DEBUG_PROPERTY);
        }
        return debugModeEnabled;
    }

    public static void reset() {
        for (Part debugPart : debugParts) {
            Position partPosition = DebugPositioner.getDebugPartPosition(debugPart);
            if (partPosition == null) {
                CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
                return;
            }
            transitionConfigurations.clear();
            partPosition.x = (partPosition.y = (partPosition.z = (partPosition.xRotation = (partPosition.yRotation = (partPosition.zRotation = 0.0f)))));
            partPosition.scale = 1.0f;
            partPosition.step = 0.025f;
        }
    }

    public static void setDebugPart(Part part) {
        currentPart = part;
        debugParts.add(part);
        partPositions.computeIfAbsent(part, p -> new Position());
    }

    public static Part getDebugPart() {
        return currentPart;
    }

    public static void configureTransitionPause(int transitionNumber, long pause) {
        TransitionConfiguration transitionConfiguration = DebugPositioner.getTransitionConfiguration(transitionNumber, true);
        transitionConfiguration.pause = pause;
    }

    public static TransitionConfiguration getTransitionConfiguration(int transitionNumber, boolean init) {
        return transitionConfigurations.computeIfAbsent(transitionNumber, k -> init ? new TransitionConfiguration() : null);
    }

    public static void position(Part part, RenderContext<?> renderContext) {
        if (!debugParts.contains(part)) {
            return;
        }
        Position partPosition = DebugPositioner.getDebugPartPosition(part);
        if (partPosition == null) {
            return;
        }
        GL11.glScalef((float)partPosition.scale, (float)partPosition.scale, (float)partPosition.scale);
        GL11.glRotatef((float)partPosition.xRotation, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)partPosition.yRotation, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)partPosition.zRotation, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glTranslatef((float)partPosition.x, (float)partPosition.y, (float)partPosition.z);
    }

    public static void showCode() {
        Position partPosition = DebugPositioner.getCurrentPartPosition();
        if (partPosition == null) {
            return;
        }
        StringBuilder result = new StringBuilder();
        result.append(String.format("GL11.glScalef(%ff, %ff, %ff);\n", Float.valueOf(partPosition.scale), Float.valueOf(partPosition.scale), Float.valueOf(partPosition.scale)));
        result.append(String.format("GL11.glRotatef(%ff, 1f, 0f, 0f);\n", Float.valueOf(partPosition.xRotation)));
        result.append(String.format("GL11.glRotatef(%ff, 0f, 1f, 0f);\n", Float.valueOf(partPosition.yRotation)));
        result.append(String.format("GL11.glRotatef(%ff, 0f, 0f, 1f);\n", Float.valueOf(partPosition.zRotation)));
        result.append(String.format("GL11.glTranslatef(%ff, %ff, %ff);", Float.valueOf(partPosition.x), Float.valueOf(partPosition.y), Float.valueOf(partPosition.z)));
        logger.debug("Generated positioning code: \n" + result);
        System.out.println("\n" + result);
    }

    public static void watch() {
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer());
        System.out.println("Trackable entities: " + tracker.getTrackableEntitites());
    }

    public static Entity getWatchableEntity() {
        return watchableEntity;
    }

    public static void showCurrentMatrix(String message) {
        DebugPositioner.showCurrentMatrix(null, message);
    }

    public static void showCurrentMatrix(Object part, String message) {
        if (part != null && part != currentPart) {
            return;
        }
        Matrix4f preparedPositionMatrix = MatrixHelper.captureMatrix();
        logger.trace("Current matrix: {} {}", (Object)message, (Object)DebugPositioner.formatMatrix(preparedPositionMatrix));
    }

    public static String formatMatrix(Matrix4f m) {
        StringBuilder buf = new StringBuilder();
        buf.append("\n");
        buf.append(String.format("%4.2f %4.2f %4.2f %4.2f\n", Float.valueOf(m.m00), Float.valueOf(m.m10), Float.valueOf(m.m20), Float.valueOf(m.m30)));
        buf.append(String.format("%4.2f %4.2f %4.2f %4.2f\n", Float.valueOf(m.m01), Float.valueOf(m.m11), Float.valueOf(m.m21), Float.valueOf(m.m31)));
        buf.append(String.format("%4.2f %4.2f %4.2f %4.2f\n", Float.valueOf(m.m02), Float.valueOf(m.m12), Float.valueOf(m.m22), Float.valueOf(m.m32)));
        buf.append(String.format("%4.2f %4.2f %4.2f %4.2f\n", Float.valueOf(m.m03), Float.valueOf(m.m13), Float.valueOf(m.m23), Float.valueOf(m.m33)));
        return buf.toString();
    }

    static {
        debugParts = new HashSet<Part>();
        partPositions = new HashMap<Part, Position>();
        transitionConfigurations = new HashMap<Integer, TransitionConfiguration>();
    }

    private static class Position {
        private float xRotation;
        private float yRotation;
        private float zRotation;
        private float x;
        private float y;
        private float z;
        private float scale = 1.0f;
        private float step = 0.025f;

        private Position() {
        }
    }

    public static final class TransitionConfiguration {
        private long pause;

        public long getPause() {
            return this.pause;
        }

        public void setPause(long pause) {
            this.pause = pause;
        }
    }
}


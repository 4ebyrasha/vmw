/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.Item
 */
package com.vicmatskiv.weaponlib.command;

import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.animation.DebugPositioner;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleCommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;

public class DebugCommand
extends CompatibleCommand {
    private static final String SHOW_OPTION_CODE = "code";
    private static final String COMMAND_DEBUG = "wdb";
    private static final String DEBUG_ARG_ON = "on";
    private static final String DEBUG_ARG_OFF = "off";
    private static final String DEBUG_ARG_PAUSE = "pause";
    private static final String DEBUG_ARG_PART = "part";
    private static final String DEBUG_ARG_SCALE = "scale";
    private static final String DEBUG_ARG_SHOW = "show";
    private static final String DEBUG_ARG_WATCH = "watch";
    private static final String DEBUG_ARG_STEP = "step";
    private String modId;

    public DebugCommand(String modId) {
        this.modId = modId;
    }

    @Override
    public String getCompatibleName() {
        return COMMAND_DEBUG;
    }

    @Override
    public String getCompatibleUsage(ICommandSender sender) {
        return "/wdb<options>";
    }

    private String getSubCommandDebugUsage() {
        return "/wdb <on|off>";
    }

    private String getSubCommandPauseUsage() {
        return String.format("/%s %s <transition-number> <pause-duration>", COMMAND_DEBUG, DEBUG_ARG_PAUSE);
    }

    private String getSubCommandPartUsage() {
        return String.format("/%s %s main|lhand|rhand", COMMAND_DEBUG, DEBUG_ARG_PART);
    }

    private String getSubCommandShowUsage() {
        return String.format("/%s %s code", COMMAND_DEBUG, DEBUG_ARG_SHOW);
    }

    private String getSubCommandScaleUsage() {
        return String.format("/%s %s <scale>", COMMAND_DEBUG, DEBUG_ARG_SCALE);
    }

    private String getSubCommandStepUsage() {
        return String.format("/%s %s <scale>", COMMAND_DEBUG, DEBUG_ARG_STEP);
    }

    private String getSubCommandWatchUsage() {
        return String.format("/%s %s [entity-id]", COMMAND_DEBUG, DEBUG_ARG_WATCH);
    }

    @Override
    public void execCommand(ICommandSender sender, String[] args) {
        if (args.length > 0) {
            switch (args[0].toLowerCase()) {
                case "on": {
                    this.processDebugModeSubCommand(args);
                    break;
                }
                case "off": {
                    this.processDebugModeSubCommand(args);
                    break;
                }
                case "pause": {
                    this.processPauseSubCommand(args);
                    break;
                }
                case "part": {
                    this.processPartSubCommand(args);
                    break;
                }
                case "show": {
                    this.processShowSubCommand(args);
                    break;
                }
                case "scale": {
                    this.processScaleSubCommand(args);
                    break;
                }
                case "step": {
                    this.processStepSubCommand(args);
                    break;
                }
                case "watch": {
                    this.processWatchSubCommand(args);
                    break;
                }
                default: {
                    CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getCompatibleUsage(sender));
                    break;
                }
            }
        } else {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getCompatibleUsage(sender));
        }
    }

    private void processDebugModeSubCommand(String[] args) {
        Boolean debugMode = null;
        switch (args[0].toLowerCase()) {
            case "on": {
                debugMode = true;
                break;
            }
            case "off": {
                debugMode = false;
            }
        }
        if (debugMode != null) {
            DebugPositioner.setDebugMode(debugMode);
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug mode " + args[0].toLowerCase());
        } else {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandDebugUsage());
        }
    }

    private void processPauseSubCommand(String[] args) {
        if (args.length != 3) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandPauseUsage());
            return;
        }
        try {
            int transitionNumber = Integer.parseInt(args[1]);
            long pauseDuration = Long.parseLong(args[2]);
            DebugPositioner.configureTransitionPause(transitionNumber, pauseDuration);
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Set transition " + transitionNumber + " pause to " + pauseDuration + "ms");
        }
        catch (NumberFormatException e) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandPauseUsage());
        }
    }

    private void processWatchSubCommand(String[] args) {
        if (args.length < 1) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandWatchUsage());
            return;
        }
        DebugPositioner.watch();
    }

    private void processScaleSubCommand(String[] args) {
        if (args.length != 2) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandScaleUsage());
            return;
        }
        if (DebugPositioner.getDebugPart() == null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
            return;
        }
        try {
            float scale = Float.parseFloat(args[1]);
            DebugPositioner.setScale(scale);
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Set scale to " + scale);
        }
        catch (NumberFormatException e) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandScaleUsage());
        }
    }

    private void processStepSubCommand(String[] args) {
        if (args.length != 2) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandStepUsage());
            return;
        }
        if (DebugPositioner.getDebugPart() == null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
            return;
        }
        try {
            float step = Float.parseFloat(args[1]);
            DebugPositioner.setStep(step);
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Set step to " + step);
        }
        catch (NumberFormatException e) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandStepUsage());
        }
    }

    private void processShowSubCommand(String[] args) {
        if (args.length != 2) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandShowUsage());
            return;
        }
        if (DebugPositioner.getDebugPart() == null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debug part not selected");
            return;
        }
        switch (args[1].toLowerCase()) {
            case "code": {
                DebugPositioner.showCode();
                CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Code is copied to the console");
                break;
            }
            default: {
                CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandShowUsage());
            }
        }
    }

    private void processPartSubCommand(String[] args) {
        if (args.length != 2) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandPartUsage());
            return;
        }
        try {
            switch (args[1].toLowerCase()) {
                case "main": {
                    DebugPositioner.setDebugPart(Part.MAIN_ITEM);
                    break;
                }
                case "lhand": {
                    DebugPositioner.setDebugPart(Part.LEFT_HAND);
                    break;
                }
                case "rhand": {
                    DebugPositioner.setDebugPart(Part.RIGHT_HAND);
                    break;
                }
                case "inventory": {
                    DebugPositioner.setDebugPart(Part.INVENTORY);
                    break;
                }
                default: {
                    String partName = args[1];
                    Item item = CompatibilityProvider.compatibility.findItemByName(this.modId, partName);
                    Part part = null;
                    if (item instanceof Part) {
                        part = (Part)item;
                    } else if (item instanceof ItemAttachment) {
                        part = ((ItemAttachment)item).getRenderablePart();
                    }
                    if (part == null) break;
                    DebugPositioner.setDebugPart(part);
                }
            }
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Debugging part " + args[1]);
        }
        catch (NumberFormatException e) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandPartUsage());
        }
    }

    public int func_82362_a() {
        return 0;
    }
}


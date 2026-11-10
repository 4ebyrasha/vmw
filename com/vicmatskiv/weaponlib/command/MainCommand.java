/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package com.vicmatskiv.weaponlib.command;

import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.AttachmentContainer;
import com.vicmatskiv.weaponlib.CompatibleAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MainCommand
extends CompatibleCommand {
    private static final String SHOW_OPTION_RECIPE = "recipe";
    private static final String SHOW_OPTION_ATTACHMENTS = "attachments";
    private static final String ARG_SHOW = "show";
    private String modId;
    private String mainCommandName;
    private ModContext modContext;

    public MainCommand(String modId, ModContext modContext) {
        this.modId = modId;
        this.modContext = modContext;
        this.mainCommandName = modId;
    }

    @Override
    public String getCompatibleName() {
        return this.modId;
    }

    @Override
    public String getCompatibleUsage(ICommandSender sender) {
        return "/" + this.mainCommandName + "<options>";
    }

    private String getSubCommandShowUsage() {
        return String.format("/%s %s recipe|attachments", this.mainCommandName, ARG_SHOW);
    }

    @Override
    public void execCommand(ICommandSender sender, String[] args) {
        if (args.length > 0) {
            if (ARG_SHOW.indexOf(args[0].toLowerCase()) == 0) {
                this.processShowSubCommand(args);
            } else {
                CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getCompatibleUsage(sender));
            }
        } else {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getCompatibleUsage(sender));
        }
    }

    private void processShowSubCommand(String[] args) {
        if (args.length < 2) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandShowUsage());
            return;
        }
        if (SHOW_OPTION_RECIPE.indexOf(args[1].toLowerCase()) == 0) {
            this.showRecipe();
        } else if (SHOW_OPTION_ATTACHMENTS.indexOf(args[1].toLowerCase()) == 0) {
            int page = 1;
            if (args.length == 3) {
                page = Integer.parseInt(args[2]);
            }
            this.showAttachments(page);
        } else {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), this.getSubCommandShowUsage());
        }
    }

    private void showAttachments(int page) {
        Item item;
        ItemStack itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer());
        if (itemStack != null && (item = itemStack.func_77973_b()) instanceof AttachmentContainer) {
            AttachmentContainer container = (AttachmentContainer)item;
            Collection<CompatibleAttachment<? extends AttachmentContainer>> compatibleAttachments = container.getCompatibleAttachments(AttachmentCategory.BULLET, AttachmentCategory.GRIP, AttachmentCategory.MAGAZINE, AttachmentCategory.SCOPE, AttachmentCategory.SILENCER, AttachmentCategory.SKIN);
            ArrayList<CompatibleAttachment<? extends AttachmentContainer>> sorted = new ArrayList<CompatibleAttachment<? extends AttachmentContainer>>(compatibleAttachments);
            sorted.sort((c1, c2) -> c1.getAttachment().func_77658_a().compareTo(c2.getAttachment().func_77658_a()));
            int pageSize = 8;
            int offset = pageSize * (page - 1);
            if (page < 1) {
                CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Invalid page");
            } else if (sorted.size() == 0) {
                CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "No attachments found for " + item.func_77653_i(itemStack));
            } else if (offset < sorted.size()) {
                CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Attachments for " + item.func_77653_i(itemStack) + ", page " + page + " of " + (int)Math.ceil((double)sorted.size() / (double)pageSize));
                for (int i = offset; i < offset + pageSize && i >= 0 && i < sorted.size(); ++i) {
                    CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), " - " + ((CompatibleAttachment)sorted.get(i)).getAttachment().func_77653_i(null));
                }
            } else {
                CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Invalid page");
            }
        }
    }

    public int func_82362_a() {
        return 0;
    }

    private void showRecipe() {
        ItemStack itemStack = CompatibilityProvider.compatibility.getHeldItemMainHand((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer());
        if (itemStack != null) {
            Item item = itemStack.func_77973_b();
            this.showRecipe(item);
        }
    }

    private void showRecipe(Item item) {
        if (item != null) {
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "");
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Recipe for " + item.func_77653_i(null));
            List<Object> recipe = this.modContext.getRecipeManager().getRecipe(item);
            if (recipe != null) {
                this.formatRecipe(recipe);
            } else {
                CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "Recipe for " + item.func_77653_i(null) + " not found");
            }
        }
    }

    private String formatRecipe(List<Object> recipe) {
        Object element;
        int i;
        StringBuilder output = new StringBuilder();
        HashMap<Character, Object> decoder = new HashMap<Character, Object>();
        boolean inRow = true;
        for (i = 0; i < recipe.size(); ++i) {
            element = recipe.get(i);
            if (inRow && !(element instanceof String)) {
                inRow = false;
            }
            if (inRow || !(element instanceof Character) || recipe.size() <= i + 1) continue;
            Object value = recipe.get(i + 1);
            if (value instanceof Item) {
                value = ((Item)value).func_77653_i(null);
            } else if (value instanceof Block) {
                value = ((Block)value).func_149732_F();
            }
            decoder.put((Character)element, value);
            ++i;
        }
        CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "");
        for (i = 0; i < recipe.size() && (element = recipe.get(i)) instanceof String; ++i) {
            StringBuilder builder = new StringBuilder();
            char[] cArray = ((String)element).toCharArray();
            int n = cArray.length;
            for (int j = 0; j < n; ++j) {
                Character c = Character.valueOf(cArray[j]);
                Object decoded = decoder.get(c);
                builder.append(String.format("[%.20s] ", decoded != null ? decoded : "*"));
            }
            CompatibilityProvider.compatibility.addChatMessage((Entity)CompatibilityProvider.compatibility.clientPlayer(), "" + builder.toString());
        }
        return output.toString();
    }
}


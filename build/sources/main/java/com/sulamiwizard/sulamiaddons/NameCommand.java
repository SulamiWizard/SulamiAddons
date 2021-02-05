
package com.sulamiwizard.sulamiaddons;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import java.util.Iterator;

public class NameCommand extends CommandBase {
    @Override
    public String getCommandName() {
        return "name";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "";
    }

    @Override
    public void processCommand(final ICommandSender sender, final String[] args) throws CommandException {
        if(args.length > 0) {
            new Thread() {
                @Override
                public void run() {
                    JsonObject response = Utils.getJsonResponse("https://api.mojang.com/users/profiles/minecraft/" + args[0]).getAsJsonObject();
                    if(response.has("error")){
                        sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "error: " + response.get("errorMessage").getAsString()));
                        return;
                    }
                    if(!response.has("id")){
                        sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "error: Player does not exist."));
                    }
                    JsonArray response2 = Utils.getJsonResponse("https://api.mojang.com/user/profiles/" + response.get("id").getAsString() + "/names").getAsJsonArray();
                    for (Iterator<JsonElement> it = response2.iterator(); it.hasNext(); ) {
                        JsonObject jsonObject = it.next().getAsJsonObject();
                        if(jsonObject.has("name")){
                            sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + jsonObject.get("name").getAsString()));
                        }
                    }
                }
            }.start();
        }

    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}
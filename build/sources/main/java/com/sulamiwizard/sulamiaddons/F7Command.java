package com.sulamiwizard.sulamiaddons;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class F7Command extends CommandBase {

    @Override
    public String getCommandName() {
        return "f7";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        Minecraft.getMinecraft().thePlayer.sendChatMessage("/joindungeon CATACOMBS 7");
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}

package com.sulamiwizard.sulamiaddons;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class F1Command extends CommandBase {

    @Override
    public String getCommandName() {
        return "f1";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        Minecraft.getMinecraft().thePlayer.sendChatMessage("/joindungeon CATACOMBS 1");
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}

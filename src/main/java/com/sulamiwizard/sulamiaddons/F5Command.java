package com.sulamiwizard.sulamiaddons;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class F5Command extends CommandBase {

    @Override
    public String getCommandName() {
        return "f5";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        Minecraft.getMinecraft().thePlayer.sendChatMessage("/joindungeon CATACOMBS 5");
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}

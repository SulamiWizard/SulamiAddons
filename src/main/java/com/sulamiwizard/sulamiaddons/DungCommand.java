package com.sulamiwizard.sulamiaddons;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class DungCommand extends CommandBase {
    @Override
    public String getCommandName() {
        return "dung";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
       return "";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        Minecraft.getMinecraft().thePlayer.sendChatMessage("/warp dungeon_hub");
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}

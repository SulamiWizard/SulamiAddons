package com.sulamiwizard.sulamiaddons;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class LDungCommand extends CommandBase {
    Thread commandThread = new Thread();

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

        new Thread() {
            @Override
            public void run() {
                try {
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/lobby");
                    Thread.sleep(600);
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/play skyblock");
                    Thread.sleep(600);
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/warp dungeon_hub");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();



    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}

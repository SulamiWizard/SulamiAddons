package com.sulamiwizard.sulamiaddons;

import net.minecraft.client.Minecraft;

import java.beans.EventHandler;


public class AutoJoinSkyblock {

    public boolean isOnSkyblock(){
        if(Minecraft.getMinecraft().getCurrentServerData().serverName.equalsIgnoreCase("Skyblock.Hypixel.net")){
            return true;
        }
        else {
            return false;
        }
    }
}

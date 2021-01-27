package com.sulamiwizard.sulamiaddons;


import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SulamiAddons.MODID, version = SulamiAddons.VERSION, name = SulamiAddons.NAME)
public class SulamiAddons {
    public static final String MODID = "sulamiaddons";
    public static final String VERSION = "1.0";
    public static final String NAME = "SulamiAddons";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        ClientCommandHandler.instance.registerCommand(new LDungCommand());
        ClientCommandHandler.instance.registerCommand(new DungCommand());
        ClientCommandHandler.instance.registerCommand(new NameCommand());
        ClientCommandHandler.instance.registerCommand(new GuildOnlineCommand());
        ClientCommandHandler.instance.registerCommand(new DoubleHubWarpCommand());
        ClientCommandHandler.instance.registerCommand(new F1Command());
        ClientCommandHandler.instance.registerCommand(new F2Command());
        ClientCommandHandler.instance.registerCommand(new F3Command());
        ClientCommandHandler.instance.registerCommand(new F4Command());
        ClientCommandHandler.instance.registerCommand(new F5Command());
        ClientCommandHandler.instance.registerCommand(new F6Command());
        ClientCommandHandler.instance.registerCommand(new F7Command());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}

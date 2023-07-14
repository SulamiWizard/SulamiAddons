package com.sulamiaddons;

import com.sulamiaddons.block.ModBlocks;
import com.sulamiaddons.item.ModItemGroups;
import com.sulamiaddons.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SulamiAddons implements ModInitializer {
    public static final String MOD_ID = "sulamiaddons";

    // This logger is used to write text to the console and the log file.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.

        LOGGER.info("Hello Fabric world!");
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

    }
}
package com.sulamiaddons.block;


import com.sulamiaddons.SulamiAddons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


/*
    Basic Block class to make and register blocks. May be changed in the future.
 */
public class ModBlocks {
    //new ore blocks
    public static final Block ADAMANTITE_ORE = Registry.register(Registries.BLOCK,
            new Identifier("sulamiaddons", "adamantite_ore"),
            new Block(FabricBlockSettings.create().strength(4.0f)));

    public static void registerModBlocks() {
        SulamiAddons.LOGGER.debug("Registering Mod Blocks for " + SulamiAddons.MOD_ID);
    }

}

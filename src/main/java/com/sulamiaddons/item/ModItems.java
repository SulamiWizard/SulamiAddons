package com.sulamiaddons.item;

import com.sulamiaddons.SulamiAddons;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/*
    Basic Item class to make and register items. May be changed in the future.
 */
public class ModItems {

    public static final Item RAW_ADAMANTITE = registerItem("raw_adamantite",
            new Item(new FabricItemSettings()));
    public static final Item ADAMANTITE_INGOT = registerItem("adamantite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item REFINED_ADAMANTITE = registerItem("refined_adamantite",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SulamiAddons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SulamiAddons.LOGGER.debug("Registering Mod Items for " + SulamiAddons.MOD_ID);
    }

}

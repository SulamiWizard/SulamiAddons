package com.sulamiaddons.item;

import com.sulamiaddons.SulamiAddons;
import com.sulamiaddons.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SulamiAddons.MOD_ID, "item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.item_group"))
                    .icon(() -> new ItemStack(ModItems.ADAMANTITE_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ADAMANTITE_ORE);
                        entries.add(ModItems.RAW_ADAMANTITE);
                        entries.add(ModItems.ADAMANTITE_INGOT);
                        entries.add(ModBlocks.ADAMANTITE_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        SulamiAddons.LOGGER.info("Registering Item Groups for " + SulamiAddons.MOD_ID);
    }
}

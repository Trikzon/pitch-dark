package net.dodogang.examplemod;

import net.dodogang.plume.ash.registry.ItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod {
    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static final ItemGroup ITEM_GROUP = ItemGroupBuilder
            .build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(Blocks.DIRT));

    public static void initialize() {
        ModBlocks.register();
    }
}

package net.dodogang.examplemod;

import net.dodogang.plume.ash.registry.RegistryBatch;
import net.dodogang.plume.ash.registry.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    private ModBlocks() {}

    public static RegistrySupplier<Block> TEST_BLOCK;
    public static RegistrySupplier<Block> EXAMPLE_BLOCK;

    public static void register() {
        RegistryBatch<Block> blockRegister = RegistryBatch.create(Registry.BLOCK_KEY, ExampleMod.MOD_ID);
        RegistryBatch<Item> itemRegister = RegistryBatch.create(Registry.ITEM_KEY, ExampleMod.MOD_ID);

        TEST_BLOCK = blockRegister.add("test_block", new Block(AbstractBlock.Settings.copy(Blocks.DIRT)));
        itemRegister.add("test_block", new BlockItem(TEST_BLOCK.getInitialValue(), new Item.Settings().group(ExampleMod.ITEM_GROUP)));

        EXAMPLE_BLOCK = blockRegister.add("example_block", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        itemRegister.add("example_block", new BlockItem(EXAMPLE_BLOCK.getInitialValue(), new Item.Settings().group(ExampleMod.ITEM_GROUP)));

        blockRegister.register();
        itemRegister.register();
    }
}

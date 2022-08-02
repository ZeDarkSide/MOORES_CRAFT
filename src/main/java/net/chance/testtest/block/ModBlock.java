package net.chance.testtest.block;

import net.chance.testtest.TESTTEST;
import net.chance.testtest.item.ModItemGroup;
import net.chance.testtest.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlock {

//-----------------------------------------Uranium----------------------------------------------------------------------
    public static final Block UREANIUM_ORE = registerBlock("uranium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3f, 3f),
                    UniformIntProvider.create(3, 6)), ModItemGroup.NEWBLOCKS);

    public static final Block DEEPSLATE_UREANIUM_ORE = registerBlock("deepslate_uranium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3f, 4f),
                    UniformIntProvider.create(2, 9)), ModItemGroup.NEWBLOCKS);
//-----------------------------------------Ruby-------------------------------------------------------------------------
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
        new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3f, 3f),
                UniformIntProvider.create(3, 6)), ModItemGroup.NEWBLOCKS);

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3f, 4f),
                    UniformIntProvider.create(2, 9)), ModItemGroup.NEWBLOCKS);
//--------------------------------------Plutonium-----------------------------------------------------------------------
    public static final Block PLUTONIUM_ORE = registerBlock("plutonium_ore",
        new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(4f, 3f),
                UniformIntProvider.create(3, 6)), ModItemGroup.NEWBLOCKS);

    public static final Block DEEPSLATE_PLUTONIUM_ORE = registerBlock("deepslate_plutonium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(4f, 4f),
                    UniformIntProvider.create(2, 9)), ModItemGroup.NEWBLOCKS);

//----------------------------------------------------------------------------------------------------------------------











//------------------------------------Important-Stuff-------------------------------------------------------------------

    private static Block registerBlock(String name, Block block, ItemGroup group){
        regisBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TESTTEST.MOD_ID, name), block);
    }

    private static Item regisBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(TESTTEST.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        TESTTEST.LOGGER.info("registering ModBlocks for " + TESTTEST.MOD_ID);
    }
}

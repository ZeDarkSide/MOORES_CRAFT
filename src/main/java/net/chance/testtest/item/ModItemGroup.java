package net.chance.testtest.item;

import net.chance.testtest.TESTTEST;
import net.chance.testtest.block.ModBlock;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup NEWITEMS = FabricItemGroupBuilder.build(new Identifier(TESTTEST.MOD_ID, "newitems"),
            () -> new ItemStack(ModItems.URANIUM_INGOT));

    public static final ItemGroup NEWBLOCKS = FabricItemGroupBuilder.build(new Identifier(TESTTEST.MOD_ID, "newblocks"),
            () -> new ItemStack(ModBlock.UREANIUM_ORE));

    public static final ItemGroup NEWTOOLS = FabricItemGroupBuilder.build(new Identifier(TESTTEST.MOD_ID, "newtools"),
            () -> new ItemStack(ModItems.URANIUM_PICKAXE));

    public static final ItemGroup NEWWEAPONS = FabricItemGroupBuilder.build(new Identifier(TESTTEST.MOD_ID, "newwepons"),
            () -> new ItemStack(ModItems.URANIUM_SWORD));


    public static final ItemGroup DUNGEONGEAR = FabricItemGroupBuilder.build(new Identifier(TESTTEST.MOD_ID, "dungeongear"),
            () -> new ItemStack(ModItems.IDK_SWORD));
}

package net.chance.testtest.world.feature;

import net.chance.testtest.TESTTEST;
import net.chance.testtest.block.ModBlock;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {




    public static final List<OreFeatureConfig.Target> OVERWORLD_UREANIUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
            ModBlock.UREANIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlock.DEEPSLATE_UREANIUM_ORE.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> UREANIUM_ORE =
            ConfiguredFeatures.register("uranium_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_UREANIUM_ORE, 13));



    public static final List<OreFeatureConfig.Target> OVERWORLD_RUBY_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlock.RUBY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlock.DEEPSLATE_RUBY_ORE.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE =
            ConfiguredFeatures.register("ruby_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_RUBY_ORE, 9, .7f ));

    public static final List<OreFeatureConfig.Target> OVERWORLD_PLUTONIUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlock.PLUTONIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlock.DEEPSLATE_PLUTONIUM_ORE.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PLUTONIUM_ORE =
            ConfiguredFeatures.register("plutonium_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_PLUTONIUM_ORE, 7 ));

    public static void registerConfiguredFeature(){
        System.out.println("Reging ModConFig for" + TESTTEST.MOD_ID);
    }

}

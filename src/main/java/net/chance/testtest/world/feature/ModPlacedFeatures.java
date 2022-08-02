package net.chance.testtest.world.feature;

import net.chance.testtest.TESTTEST;
import net.chance.testtest.block.ModBlock;
import net.chance.testtest.world.ModOreFeatures;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

import java.util.List;

public class ModPlacedFeatures {


    public static final RegistryEntry<PlacedFeature> UREANIUM_ORE_PLACED = PlacedFeatures.register
            ("ureanium_ore_placed",ModConfiguredFeatures.UREANIUM_ORE, ModOreFeatures.modifiersWithCount(12,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> RUBY_ORE_PLACED = PlacedFeatures.register
            ("ruby_ore_placed",ModConfiguredFeatures.RUBY_ORE, ModOreFeatures.modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> PLUTONIUM_ORE_PLACED = PlacedFeatures.register
            ("plutonium_ore_placed",ModConfiguredFeatures.PLUTONIUM_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(50))));
}

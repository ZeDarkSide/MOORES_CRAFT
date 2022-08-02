package net.chance.testtest;

import net.chance.testtest.block.ModBlock;
import net.chance.testtest.item.ModItems;
import net.chance.testtest.world.feature.ModConfiguredFeatures;
import net.chance.testtest.world.gen.ModWorldGen;
import net.chance.testtest.world.structure.ModStructures;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.player.PlayerEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class TESTTEST implements ModInitializer {

	public static final String MOD_ID = "testtest";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID );

	@Override
	public void onInitialize() {



		ModConfiguredFeatures.registerConfiguredFeature();

		ModItems.registerModItems();
		ModBlock.registerModBlocks();
		ModStructures.registerStructureFeature();

		ModWorldGen.generateModWorldGen();
	}
}

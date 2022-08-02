package net.chance.testtest.world.structure;

import net.chance.testtest.TESTTEST;
import net.chance.testtest.mixin.StructureFeatureAccessor;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.StructureFeature;

public class ModStructures {





    public static StructureFeature<?> SKY_STRUCTURES = new SkyStructures();

    public static void registerStructureFeature(){
        StructureFeatureAccessor.callRegister(TESTTEST.MOD_ID + ":sky_structure",
                SKY_STRUCTURES, GenerationStep.Feature.SURFACE_STRUCTURES);
    }
}

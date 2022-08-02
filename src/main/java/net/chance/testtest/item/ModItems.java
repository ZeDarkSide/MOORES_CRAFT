package net.chance.testtest.item;

import net.chance.testtest.TESTTEST;
import net.chance.testtest.item.custom.*;
import net.chance.testtest.item.custom.DungeonSwordsPerks.IdkModSwordItem;
import net.chance.testtest.item.custom.DungeonSwordsPerks.SwordOfDeathModItem;
import net.chance.testtest.item.custom.DungeonSwordsPerks.SwordOfLifeModItem;
import net.chance.testtest.item.custom.ModAxeItem;
import net.chance.testtest.item.custom.NormalItemsEffects.ModDecayAxeItemUranium;
import net.chance.testtest.item.custom.NormalItemsEffects.ModSwordLightingItem;
import net.chance.testtest.item.custom.NormalItemsEffects.ModWitherSwordItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

//--------------------------------------Items---------------------------------------------------------------------------
//--------------------------------------Uranium-------------------------------------------------------------------------
    public static final Item URANIUM_INGOT = registerItem("uranium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.NEWITEMS)));

    public static final Item RAW_URANIUM = registerItem("raw_uranium",
            new Item(new FabricItemSettings().group(ModItemGroup.NEWITEMS)));
//--------------------------------------Ruby----------------------------------------------------------------------------
    public static final Item RUBY_INGOT = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.NEWITEMS)));
//--------------------------------------Plutonium-----------------------------------------------------------------------
public static final Item PLUTONIUM_CHUNK = registerItem("plutonium_chunk",
        new Item(new FabricItemSettings().group(ModItemGroup.NEWITEMS)));

    public static final Item PLUTONIUM_INGOT = registerItem("plutonium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.NEWITEMS)));
//----------------------------------------------------------------------------------------------------------------------






//--------------------------------------Tools---------------------------------------------------------------------------
//--------------------------------------Uranium-------------------------------------------------------------------------
    public static final Item URANIUM_SWORD = registerItem("uranium_sword",
            new ModWitherSwordItem(ModToolMaterials.URANIUM,5, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));
    public static final Item URANIUM_PICKAXE = registerItem("uranium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.URANIUM,2, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));

    public static final Item URANIUM_AXE= registerItem("uranium_axe",
            new ModDecayAxeItemUranium(ModToolMaterials.URANIUM,6, -2.6f,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));

    public static final Item URANIUM_SHOVEL = registerItem("uranium_shovel",
            new ShovelItem(ModToolMaterials.URANIUM,2, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));

    public static final Item URANIUM_HOE = registerItem("uranium_hoe",
            new ModHoeItem(ModToolMaterials.URANIUM,0, 0,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));
//--------------------------------------Ruby----------------------------------------------------------------------------
public static final Item RUBY_SWORD = registerItem("ruby_sword",
        new SwordItem(ModToolMaterials.RUBY,4, -2.4f,
                new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new ModPickaxeItem(ModToolMaterials.RUBY,2, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));

    public static final Item RUBY_AXE= registerItem("ruby_axe",
            new ModAxeItem(ModToolMaterials.RUBY,5, -2.6f,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY,2, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));

    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new ModHoeItem(ModToolMaterials.RUBY,0, 0,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));
//--------------------------------------Plutonium-----------------------------------------------------------------------
public static final Item PLUTONIUM_SWORD = registerItem("plutonium_sword",
        new ModSwordLightingItem(ModToolMaterials.PLUTONIUM,5, -2.4f,
                new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));

    public static final Item PLUTONIUM_PICKAXE = registerItem("plutonium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.PLUTONIUM,3, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));

    public static final Item PLUTONIUM_AXE= registerItem("plutonium_axe",
            new ModAxeItem(ModToolMaterials.PLUTONIUM,6, -2.6f,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));

    public static final Item PLUTONIUM_SHOVEL = registerItem("plutonium_shovel",
            new ShovelItem(ModToolMaterials.PLUTONIUM,3, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));

    public static final Item PLUTONIUM_HOE = registerItem("plutonium_hoe",
            new ModHoeItem(ModToolMaterials.PLUTONIUM,1, 0,
                    new FabricItemSettings().group(ModItemGroup.NEWTOOLS)));
//----------------------------------------------------------------------------------------------------------------------









//--------------------------------------DUNGEON-GEAR--------------------------------------------------------------------
    public static final Item IDK_SWORD = registerItem("idk_sword",
             new IdkModSwordItem(ModToolMaterials.IDK,10, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.DUNGEONGEAR)));
    public static final Item SWORDOFLIFE = registerItem("swordoflife",
            new SwordOfLifeModItem(ModToolMaterials.LIFE,10, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.DUNGEONGEAR)));
    public static final Item SWORDOFDEATH = registerItem("swordofdeath",
            new SwordOfDeathModItem(ModToolMaterials.DEATH,10, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.DUNGEONGEAR)));
    public static final Item DEATHCHESTPLATE = registerItem("deathchestplate",
            new ArmorItem(ModArmorMaterial.DEATH, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.DUNGEONGEAR)));

//----------------------------------------------------------------------------------------------------------------------








//--------------------------------------ARMOR---------------------------------------------------------------------------
//--------------------------------------Uranium-------------------------------------------------------------------------
    public static final Item URANIUM_HELMET = registerItem("uranium_helmet",
            new ArmorItem(ModArmorMaterial.URANIUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));

    public static final Item URANIUM_CHESTPLATE = registerItem("uranium_chestplate",
            new ArmorItem(ModArmorMaterial.URANIUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));

    public static final Item URANIUM_LEGGINGS = registerItem("uranium_leggings",
            new ArmorItem(ModArmorMaterial.URANIUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));

    public static final Item URANIUM_BOOTS = registerItem("uranium_boots",
            new ArmorItem(ModArmorMaterial.URANIUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));
//--------------------------------------Ruby----------------------------------------------------------------------------
public static final Item RUBY_HELMET = registerItem("ruby_helmet",
        new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.HEAD,
                new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));
//--------------------------------------Plutonium-----------------------------------------------------------------------
public static final Item PLUTONIUM_HELMET = registerItem("plutonium_helmet",
        new ArmorItem(ModArmorMaterial.PLUTONIUM, EquipmentSlot.HEAD,
                new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));

    public static final Item PLUTONIUM_CHESTPLATE = registerItem("plutonium_chestplate",
            new ArmorItem(ModArmorMaterial.PLUTONIUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));

    public static final Item PLUTONIUM_LEGGINGS = registerItem("plutonium_leggings",
            new ArmorItem(ModArmorMaterial.PLUTONIUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));

    public static final Item PLUTONIUM_BOOTS = registerItem("plutonium_boots",
            new ArmorItem(ModArmorMaterial.PLUTONIUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.NEWWEAPONS)));




//----------------------------------------------------------------------------------------------------------------------


//------------------------------------Important-Stuff-----------------------------------------------------------------\\
    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TESTTEST.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TESTTEST.LOGGER.info("registering mod items for " + TESTTEST.MOD_ID);
    }

}

package net.chance.testtest.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
//0wood   1stone    2 iron    3 diamond    4 netherite
//--------------------------------------ORE-GEAR------------------------------------------------------------------------
    URANIUM(2, 38, 10.5F, 2.0F, 8, () -> {
        return Ingredient.ofItems(ModItems.URANIUM_INGOT);
    }),
    RUBY(3, 850, 8.8F, 3.0F, 10, () -> {
        return Ingredient.ofItems(ModItems.RUBY_INGOT);
    }),
    PLUTONIUM(4, 1581, 8.5F, 4.0F, 12, () -> {
        return Ingredient.ofItems(ModItems.PLUTONIUM_INGOT);
    }),
//--------------------------------------DUNGEON-GEAR--------------------------------------------------------------------
    IDK(4, 2582, 8.5F, 4.0F, 12, () -> {
        return Ingredient.EMPTY;
    }),
    LIFE(4, 3482, 8.5F, 6.0F, 15, () -> {
        return Ingredient.EMPTY;
    }) ,
    DEATH(4, 3482, 8.5F, 8.0F, 15, () -> {
        return Ingredient.EMPTY;
    });

//----------------------------------------------------------------------------------------------------------------------


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

//---------------------------------------STATS TO LOOK AT-------------------------------------------------------------\\
//    WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
//        return Ingredient.fromTag(ItemTags.PLANKS);
//    }),
//    STONE(1, 131, 4.0F, 1.0F, 5, () -> {
//        return Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS);
//    }),
//    IRON(2, 250, 6.0F, 2.0F, 14, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
//    }),
//    DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
//    }),
//    GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
//    }),
//    NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
//    });



}


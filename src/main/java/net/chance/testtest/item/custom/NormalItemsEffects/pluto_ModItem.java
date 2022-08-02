package net.chance.testtest.item.custom.NormalItemsEffects;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class pluto_ModItem extends Item {
    public pluto_ModItem(Settings settings) {
        super(settings);
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            tooltip.add(new TranslatableText("item.testtest.Plutonium_ingot.tooltip.shift"));
            tooltip.add(new TranslatableText("item.testtest.Plutonium_ingot.tooltip.shift2"));
        }else {
            tooltip.add(new TranslatableText("item.testtest.Plutonium_ingot.tooltip"));
            tooltip.add(new TranslatableText("item.testtest.Plutonium_ingot.tooltip2"));
        }

    }
}

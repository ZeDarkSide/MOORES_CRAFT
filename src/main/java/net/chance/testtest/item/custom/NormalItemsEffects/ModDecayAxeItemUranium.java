package net.chance.testtest.item.custom.NormalItemsEffects;

import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModDecayAxeItemUranium extends AxeItem {
    public ModDecayAxeItemUranium(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 300,3));
        return super.postHit(stack, target, attacker);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        miner.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 2));
        return super.postMine(stack, world, state, pos, miner);
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltip.shift"));
            tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltip.shift2"));
        }else {
            tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltip"));
            tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltip2"));
            tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltipSPACE"));
            tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltip3"));
        }
    }


}

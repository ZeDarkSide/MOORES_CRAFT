package net.chance.testtest.item.custom.DungeonSwordsPerks;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SwordOfDeathModItem extends SwordItem {
    public SwordOfDeathModItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ServerWorld world = (ServerWorld)attacker.world;
        BlockPos position = target.getBlockPos();
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 300,3));
        target.setOnFireFor(3);//fire damage 1\

        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.testtest.fireoneshift"));
            tooltip.add(new TranslatableText("item.testtest.tooltipSPACE"));
            tooltip.add(new TranslatableText("item.testtest.wither2"));
        } else {
            tooltip.add(new TranslatableText("item.testtest.fireone"));
            tooltip.add(new TranslatableText("item.testtest.tooltipSPACE"));
            tooltip.add(new TranslatableText("item.testtest.wither23"));
            tooltip.add(new TranslatableText("item.testtest.tooltipSPACE"));
            tooltip.add(new TranslatableText( "item.testtest.shift"));
            //tooltip.add(new TranslatableText("item.testtest.tooltipSPACE"));

        }


    }


}

package net.chance.testtest.item.custom.DungeonSwordsPerks;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
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

public class SwordOfLifeModItem extends SwordItem {
    public SwordOfLifeModItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }



    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ServerWorld world = (ServerWorld)attacker.world;
        BlockPos position = target.getBlockPos();
//        EntityType.LIGHTNING_BOLT.spawn(world ,null , null, null, position,
//                SpawnReason.TRIGGERED, true , true);
        //target.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 10, 2));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 300,3));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 300,2));

        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.testtest.instanthealthshift"));
            tooltip.add(new TranslatableText("item.testtest.tooltipSPACE"));
            tooltip.add(new TranslatableText("item.testtest.withereffect"));
            //tooltip.add(new TranslatableText("item.testtest.withereffectshift"));
            tooltip.add(new TranslatableText("item.testtest.tooltipSPACE"));

        } else {
            tooltip.add(new TranslatableText("item.testtest.instanthealth"));
            tooltip.add(new TranslatableText("item.testtest.tooltipSPACE"));
            tooltip.add(new TranslatableText("item.testtest.withereffectshift"));
          //  tooltip.add(new TranslatableText("item.testtest.withereffect"));
            tooltip.add(new TranslatableText("item.testtest.tooltipSPACE"));
            tooltip.add(new TranslatableText("item.testtest.shift"));
        }


    }



}

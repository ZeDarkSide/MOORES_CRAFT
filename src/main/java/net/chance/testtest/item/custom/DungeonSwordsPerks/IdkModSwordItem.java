package net.chance.testtest.item.custom.DungeonSwordsPerks;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.KnockbackEnchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class IdkModSwordItem extends SwordItem  {
    public IdkModSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
   // private int useses = 3;

//    @Override
//    public ActionResult useOnBlock(ItemUsageContext context) {
//        if(context.getWorld().isClient && useses != 0){
//            PlayerEntity player = context.getPlayer();
//            player.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10 ,2) );
//            useses -= 1;
//        }
//
//        return super.useOnBlock(context);
//    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ServerWorld world = (ServerWorld)attacker.world;
        BlockPos position = target.getBlockPos();
        EntityType.LIGHTNING_BOLT.spawn(world ,null , null, null, position,
                SpawnReason.TRIGGERED, true , true);
        //target.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 10, 2));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 300,3));

        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            tooltip.add(new TranslatableText("item.testtest.Lighting.tooltip.shift"));
            tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltipSPACE"));
            tooltip.add(new TranslatableText("item.testtest.uranium_sword.tooltip.shift"));
           // tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltipSPACE"));
            //tooltip.add(new TranslatableText("item.testtest.idk.tooltip.shift"));
        }else {
            tooltip.add(new TranslatableText("item.testtest.uranium_sword.tooltip"));
            tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltipSPACE"));
            tooltip.add(new TranslatableText("item.testtest.Lighting.tooltip"));
            tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltipSPACE"));
            //tooltip.add(new TranslatableText("item.testtest.Lighting.tooltip4"));
            //tooltip.add(new TranslatableText("item.testtest.Lighting.tooltip44 "+ useses));
           // tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltipSPACE"));
            tooltip.add(new TranslatableText("item.testtest.Lighting.tooltip2"));
        }
    }

}

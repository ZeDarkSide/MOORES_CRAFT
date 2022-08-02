package net.chance.testtest.item.custom.NormalItemsEffects;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
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

public class ModSwordLightingItem extends SwordItem {
    public ModSwordLightingItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ServerWorld world = (ServerWorld)attacker.world;
        BlockPos position = target.getBlockPos();
        EntityType.LIGHTNING_BOLT.spawn(world ,null , null, null, position,
                SpawnReason.TRIGGERED, true , true);
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            tooltip.add(new TranslatableText("item.testtest.Lighting.tooltip.shift"));
        }else {
            tooltip.add(new TranslatableText("item.testtest.Lighting.tooltip"));
            tooltip.add(new TranslatableText("item.testtest.uranium_axe.tooltipSPACE"));
            tooltip.add(new TranslatableText("item.testtest.Lighting.tooltip2"));
        }
    }



}

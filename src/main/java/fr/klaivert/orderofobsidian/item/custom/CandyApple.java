
package fr.klaivert.orderofobsidian.item.custom;

import fr.klaivert.orderofobsidian.effect.food.CandyAppleFoodEatenProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CandyApple extends Item {
	public CandyApple() {
		super(new Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64)
				.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5f)

						.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CandyAppleFoodEatenProcedure.execute(entity);
		return retval;
	}
}

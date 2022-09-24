
package fr.klaivert.orderofobsidian.item.custom;

import fr.klaivert.orderofobsidian.event.HammerBlockDestroyedWithToolProcedure;
import fr.klaivert.orderofobsidian.item.ModCreativeModeTab;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class Obsidianhammer extends PickaxeItem {
	public Obsidianhammer() {
		super(new Tier() {
			public int getUses() {
				return 700;
			}

			public float getSpeed() {
				return 1.7f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OBSIDIAN));
			}
		}, 1, -3f, new Properties().tab(ModCreativeModeTab.TOOLS_TAB));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		HammerBlockDestroyedWithToolProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}

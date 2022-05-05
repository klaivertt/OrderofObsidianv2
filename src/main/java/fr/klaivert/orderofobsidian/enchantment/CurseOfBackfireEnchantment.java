
package fr.klaivert.orderofobsidian.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;

public class CurseOfBackfireEnchantment extends Enchantment {
	public CurseOfBackfireEnchantment(EquipmentSlot... slots) {
		super(Rarity.UNCOMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		if (ench == Enchantments.FIRE_ASPECT)
			return true;
		return false;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}

	@Override
	public boolean isCurse() {
		return true;
	}
}

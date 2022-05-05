
package fr.klaivert.orderofobsidian.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class AutoSmeltEnchantment extends Enchantment {
	public AutoSmeltEnchantment(EquipmentSlot... slots) {
		super(Rarity.UNCOMMON, EnchantmentCategory.DIGGER, slots);
	}

}
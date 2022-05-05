package fr.klaivert.orderofobsidian.enchantment;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
	public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, OrderOfObsidianMod.MOD_ID);

	public static RegistryObject<Enchantment> LIGHTNING_STRIKER =
			ENCHANTMENTS.register("lightning_striker",
					() -> new LightningStrikerEnchantment(Enchantment.Rarity.VERY_RARE,
							EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));
	public static final RegistryObject<Enchantment> AUTO_SMELT = ENCHANTMENTS.register("auto_smelt",
			() -> new AutoSmeltEnchantment());

	public static final RegistryObject<Enchantment> CURSE_OF_BACKFIRE = ENCHANTMENTS.register("curse_of_backfire",
			() -> new CurseOfBackfireEnchantment());

	public static void register(IEventBus eventBus) {
		ENCHANTMENTS.register(eventBus);
	}
}

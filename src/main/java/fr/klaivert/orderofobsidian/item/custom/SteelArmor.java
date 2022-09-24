
package fr.klaivert.orderofobsidian.item.custom;


import fr.klaivert.orderofobsidian.item.ModCreativeModeTab;
import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class SteelArmor extends ArmorItem {
	public SteelArmor(EquipmentSlot slot, Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 7, 7, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ModItems.STEEL_INGOT.get()));
			}

			@Override
			public String getName() {
				return "steel_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SteelArmor {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Properties().tab(ModCreativeModeTab.ARMOR_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/armor_steel__layer_1.png";
		}
	}

	public static class Chestplate extends SteelArmor {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Properties().tab(ModCreativeModeTab.ARMOR_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/armor_steel__layer_1.png";
		}
	}

	public static class Leggings extends SteelArmor {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Properties().tab(ModCreativeModeTab.ARMOR_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/armor_steel__layer_2.png";
		}
	}

	public static class Boots extends SteelArmor {
		public Boots() {
			super(EquipmentSlot.FEET, new Properties().tab(ModCreativeModeTab.ARMOR_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/armor_steel__layer_1.png";
		}
	}
}

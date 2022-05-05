
package fr.klaivert.orderofobsidian.item.custom;


import fr.klaivert.orderofobsidian.item.ModCreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class NetherackArmor extends ArmorItem {
	public NetherackArmor(EquipmentSlot slot, Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 18;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 4, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 11;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.NETHERRACK));
			}

			@Override
			public String getName() {
				return "netherrack_armor_armor";
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

	public static class Helmet extends NetherackArmor {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Properties().tab(ModCreativeModeTab.ARMOR_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/netherrack_layer_1.png";
		}
	}

	public static class Chestplate extends NetherackArmor {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Properties().tab(ModCreativeModeTab.ARMOR_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/netherrack_layer_1.png";
		}
	}

	public static class Leggings extends NetherackArmor {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Properties().tab(ModCreativeModeTab.ARMOR_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/netherrack_layer_2.png";
		}
	}

	public static class Boots extends NetherackArmor {
		public Boots() {
			super(EquipmentSlot.FEET, new Properties().tab(ModCreativeModeTab.ARMOR_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/netherrack_layer_1.png";
		}
	}
}

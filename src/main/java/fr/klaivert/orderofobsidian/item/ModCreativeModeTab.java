package fr.klaivert.orderofobsidian.item;

import fr.klaivert.orderofobsidian.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TOOLS_TAB = new CreativeModeTab("tabtools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OXYS_PICKAXE.get());
        }
    };
    public static final CreativeModeTab ITEM_TAB = new CreativeModeTab("tabitems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OXYS.get());
        }
    };
    public static final CreativeModeTab BLOCK_TAB = new CreativeModeTab("tabblock") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.OXYS_ORE.get());
        }
    };
    public static final CreativeModeTab ARMOR_TAB = new CreativeModeTab("tabarmor") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OBSIDIAN_HELMET.get());
        }
    };
    public static final CreativeModeTab WEAPON_TAB = new CreativeModeTab("weapontab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OXYS_BOW.get());
        }
    };
}

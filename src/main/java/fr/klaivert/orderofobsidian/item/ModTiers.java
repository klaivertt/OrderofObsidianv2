package fr.klaivert.orderofobsidian.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier AIKIGITE = new ForgeTier(3, 1800, 2f,
            1f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.AIKIGITE_INGOT.get()));

    public static final ForgeTier AVENRONITE = new ForgeTier(4, 2200, 4f,
            1f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.AVENRONITE_INGOT.get()));

    public static final ForgeTier BAUHERITE = new ForgeTier(3, 2000, 2.2f,
            1f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.BAUHERITE_INGOT.get()));

    public static final ForgeTier BONE = new ForgeTier(2, 750,  1.7f,
            1f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.BONE));

    public static final ForgeTier CITRINE = new ForgeTier(2, 750, 1.5f,
            1f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));

    public static final ForgeTier EDRUELIUM = new ForgeTier(4, 2200, 4f,
            1f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.EDRUELIUM_INGOT.get()));

    public static final ForgeTier MITHRIL = new ForgeTier(3, 1850, 2.2f,
            1f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.MITHRIL_INGOT.get()));

    public static final ForgeTier OBSIDIAN = new ForgeTier(3, 1800, 2.1f,
            1f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.OBSIDIAN));

    public static final ForgeTier OXYS = new ForgeTier(5, 3100, 15f,
            7f, 30, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.OXYS.get()));

    public static final ForgeTier PENDORITE = new ForgeTier(4, 1700, 5.7f,
            1f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.PENDORITE_INGOT.get()));

    public static final ForgeTier STEEL = new ForgeTier(3, 1500, 2,
            1f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.STEEL_INGOT.get()));
}

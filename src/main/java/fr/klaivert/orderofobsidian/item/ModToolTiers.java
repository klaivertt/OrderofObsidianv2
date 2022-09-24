package fr.klaivert.orderofobsidian.item;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static Tier AIKIGITE;
    public static Tier AVENRONITE;
    static {

        AIKIGITE = TierSortingRegistry.registerTier(
                new ForgeTier(4, 1700, 8f, 2f, 20,
                        BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.AIKIGITE_INGOT.get())),
                new ResourceLocation(OrderOfObsidianMod.MOD_ID, "aikigite"), List.of(Tiers.DIAMOND), List.of());

    }
}

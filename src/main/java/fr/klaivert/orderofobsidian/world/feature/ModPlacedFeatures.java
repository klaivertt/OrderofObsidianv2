package fr.klaivert.orderofobsidian.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> EBONY_PLACED = PlacementUtils.register("ebony_placed",
            ModConfiguredFeatures.EBONY_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));

    public static final Holder<PlacedFeature> PINK_ROSE_PLACED = PlacementUtils.register("pink_rose_placed",
            ModConfiguredFeatures.PINK_ROSE, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> CITRINE_ORE_PLACED = PlacementUtils.register("citrine_ore_placed",
            ModConfiguredFeatures.CITRINE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(150))));

    public static final Holder<PlacedFeature> AIKIGITE_ORE_PLACED = PlacementUtils.register("aikigite_ore_placed",
            ModConfiguredFeatures.AIKIGITE_ORE, ModOrePlacement.commonOrePlacement(4, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-44), VerticalAnchor.aboveBottom(110))));

    public static final Holder<PlacedFeature> ALUMINIUM_ORE_PLACED = PlacementUtils.register("aluminium_ore_placed",
            ModConfiguredFeatures.ALUMINIUM_ORE, ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(200))));

    public static final Holder<PlacedFeature> BAUHERITE_ORE_PLACED = PlacementUtils.register("bauherite_ore_placed",
            ModConfiguredFeatures.BAUHERITE_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(90))));

    public static final Holder<PlacedFeature> GRAPHITE_ORE_PLACED = PlacementUtils.register("graphite_ore_placed",
            ModConfiguredFeatures.GRAPHITE_ORE, ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(200))));

    public static final Holder<PlacedFeature> MITRIL_ORE_PLACED = PlacementUtils.register("mitril_ore_placed",
            ModConfiguredFeatures.MITRIL_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(120))));

    public static final Holder<PlacedFeature> SILVER_ORE_PLACED = PlacementUtils.register("silver_ore_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(120))));

    public static final Holder<PlacedFeature> LEAD_ORE_PLACED = PlacementUtils.register("lead_ore_placed",
            ModConfiguredFeatures.LEAD_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(120))));

    public static final Holder<PlacedFeature> NETHERRACK_CITRINE_ORE_PLACED = PlacementUtils.register("netherrack_citrine_ore_placed",
            ModConfiguredFeatures.NETHERRACK_CITRINE_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(120))));

    public static final Holder<PlacedFeature> AVENRONITE_ORE_PLACED = PlacementUtils.register("avenronite_ore_placed",
            ModConfiguredFeatures.AVENRONITE_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(120))));

    public static final Holder<PlacedFeature> EDRUELIUM_ORE_PLACED = PlacementUtils.register("edruelium_ore_placed",
            ModConfiguredFeatures.EDRUELIUM_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(120))));

    public static final Holder<PlacedFeature> PENDORITE_ORE_PLACED = PlacementUtils.register("pendorite_ore_placed",
            ModConfiguredFeatures.PENDORITE_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(120))));

    public static final Holder<PlacedFeature> OXYS_ORE_FEATURE = PlacementUtils.register("oxys_ore_placed",
            ModConfiguredFeatures.OXYS_ORE, ModOrePlacement.commonOrePlacement(4, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(1), VerticalAnchor.aboveBottom(70))));

    public static final Holder<PlacedFeature> ENSTONE_CITRINE_ORE_FEATURE = PlacementUtils.register("endstone_citrine_ore_placed",
            ModConfiguredFeatures.ENDSTONE_CITRINE_ORE, ModOrePlacement.commonOrePlacement(10, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(1), VerticalAnchor.aboveBottom(70))));

    public static final Holder<PlacedFeature> ENSTONE_PENDORITE_ORE_FEATURE = PlacementUtils.register("endstone_pendorite_ore_placed",
            ModConfiguredFeatures.ENDSTONE_PENDORITE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(1), VerticalAnchor.aboveBottom(70))));

}

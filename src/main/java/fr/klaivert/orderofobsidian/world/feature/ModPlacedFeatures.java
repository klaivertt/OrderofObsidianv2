package fr.klaivert.orderofobsidian.world.feature;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, OrderOfObsidianMod.MOD_ID);


    public static final RegistryObject<PlacedFeature> AIKIGITE_ORE_PLACED = PLACED_FEATURES.register("aikigite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.AIKIGITE_ORE.getHolder().get(),
                    commonOrePlacement(6, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-70), VerticalAnchor.aboveBottom(90)))));

    public static final RegistryObject<PlacedFeature> ALUMINIUM_ORE_PLACED = PLACED_FEATURES.register("aluminium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ALUMINIUM_ORE.getHolder().get(),
                    commonOrePlacement(10, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> BAUHERITE_ORE_PLACED = PLACED_FEATURES.register("bauherite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.BAUHERITE_ORE.getHolder().get(),
                    commonOrePlacement(6, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> GRAPHITE_ORE_PLACED = PLACED_FEATURES.register("graphite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.GRAPHITE_ORE.getHolder().get(),
                    commonOrePlacement(10, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> MITHRIL_ORE_PLACED = PLACED_FEATURES.register("mithril_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.MITHRIL_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> SILVER_ORE_PLACED = PLACED_FEATURES.register("silver_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE.getHolder().get(),
                    commonOrePlacement(8, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(100)))));

    public static final RegistryObject<PlacedFeature> LEAD_ORE_PLACED = PLACED_FEATURES.register("lead_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.LEAD_ORE.getHolder().get(),
                    commonOrePlacement(9, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-70), VerticalAnchor.aboveBottom(100)))));


       public static final RegistryObject<PlacedFeature> END_PENDORITE_ORE_PLACED = PLACED_FEATURES.register("end_pendorite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_PENDORITE_ORES.getHolder().get(), commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> END_OXYS_ORE_PLACED = PLACED_FEATURES.register("oxys_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.OXYS_ORES.getHolder().get(), commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_AVENRONITE_ORE_PLACED = PLACED_FEATURES.register("avenronite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHERACK_AVENRONITE_ORE.getHolder().get(), commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(150)))));

    public static final RegistryObject<PlacedFeature> NETHER_EDRUELIUM_ORE_PLACED = PLACED_FEATURES.register("eduelium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHERACK_EDRUELIUM_ORE.getHolder().get(), commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(150)))));

    public static final RegistryObject<PlacedFeature> NETHER_PENDORITE_ORE_PLACED = PLACED_FEATURES.register("nether_pendorite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHERACK_PENDORITE_ORE.getHolder().get(), commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(170)))));



    public static final RegistryObject<PlacedFeature> JASMINE_PLACED = PLACED_FEATURES.register("jasmine_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.JASMINE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));



    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}

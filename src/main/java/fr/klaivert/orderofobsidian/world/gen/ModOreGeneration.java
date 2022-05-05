package fr.klaivert.orderofobsidian.world.gen;

import fr.klaivert.orderofobsidian.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.CITRINE_ORE_PLACED);
        base.add(ModPlacedFeatures.AIKIGITE_ORE_PLACED);
        base.add(ModPlacedFeatures.ALUMINIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.BAUHERITE_ORE_PLACED);
        base.add(ModPlacedFeatures.GRAPHITE_ORE_PLACED);
        base.add(ModPlacedFeatures.MITRIL_ORE_PLACED);
        base.add(ModPlacedFeatures.SILVER_ORE_PLACED);
        base.add(ModPlacedFeatures.LEAD_ORE_PLACED);
        base.add(ModPlacedFeatures.NETHERRACK_CITRINE_ORE_PLACED);
        base.add(ModPlacedFeatures.AVENRONITE_ORE_PLACED);
        base.add(ModPlacedFeatures.EDRUELIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.PENDORITE_ORE_PLACED);
        base.add(ModPlacedFeatures.ENSTONE_PENDORITE_ORE_FEATURE);
        base.add(ModPlacedFeatures.ENSTONE_CITRINE_ORE_FEATURE);
        base.add(ModPlacedFeatures.OXYS_ORE_FEATURE);
    }
}

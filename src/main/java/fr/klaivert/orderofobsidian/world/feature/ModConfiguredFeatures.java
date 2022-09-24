package fr.klaivert.orderofobsidian.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, OrderOfObsidianMod.MOD_ID);
    //overworld
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_AIKIGITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AIKIGITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_AIKIGITE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ALUMINIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ALUMINIUM_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BAUHERITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BAUHERITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BAUHERITE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_GRAPHITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.GRAPHITE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MITHRIL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MITRIL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MITRIL_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_LEAD_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LEAD_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState())));
     //end overworld
    //nether
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_AVENRONITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.AVENRONITE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_EDRUELIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.EDRUELIUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_PENDORITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.PENDORITE_ORE.get().defaultBlockState())));

     //end nether
    //end
    public static final Supplier<List<OreConfiguration.TargetBlockState>> ENDSTONE_PENDORITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ENDSTONE_PENDORITE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_OXYS_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.OXYS_ORE.get().defaultBlockState())));

    // end end

    public static final RegistryObject<ConfiguredFeature<?, ?>> END_PENDORITE_ORES = CONFIGURED_FEATURES.register("end_pendorite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ENDSTONE_PENDORITE_ORES.get(), 5)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OXYS_ORES = CONFIGURED_FEATURES.register("oxys_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_OXYS_ORES.get(), 3)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERACK_AVENRONITE_ORE = CONFIGURED_FEATURES.register("netherack_avenronite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_AVENRONITE_ORES.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERACK_EDRUELIUM_ORE = CONFIGURED_FEATURES.register("netherack_edruelium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_EDRUELIUM_ORES.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERACK_PENDORITE_ORE = CONFIGURED_FEATURES.register("netherack_pendorite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_PENDORITE_ORES.get(), 4)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> AIKIGITE_ORE = CONFIGURED_FEATURES.register("aikigite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_AIKIGITE_ORES.get(),5)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ALUMINIUM_ORE = CONFIGURED_FEATURES.register("aluminium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ALUMINIUM_ORES.get(),10)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BAUHERITE_ORE = CONFIGURED_FEATURES.register("bauherite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_BAUHERITE_ORES.get(),5)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> GRAPHITE_ORE = CONFIGURED_FEATURES.register("graphite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_GRAPHITE_ORES.get(),12)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MITHRIL_ORE = CONFIGURED_FEATURES.register("mithril_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MITHRIL_ORES.get(),7)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SILVER_ORE = CONFIGURED_FEATURES.register("silver_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LEAD_ORE = CONFIGURED_FEATURES.register("lead_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_LEAD_ORES.get(),7)));


    public static final RegistryObject<ConfiguredFeature<?, ?>> JASMINE = CONFIGURED_FEATURES.register("jasmine",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.JASMINE.get()))))));


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}

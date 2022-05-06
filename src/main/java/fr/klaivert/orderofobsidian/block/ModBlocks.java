package fr.klaivert.orderofobsidian.block;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.block.custom.*;
import fr.klaivert.orderofobsidian.item.ModCreativeModeTab;
import fr.klaivert.orderofobsidian.sound.ModSounds;
import fr.klaivert.orderofobsidian.world.feature.tree.EbonyTreeGrower;
import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.MOSS_BLOCK;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OrderOfObsidianMod.MOD_ID);

    public static final RegistryObject<Block> EBONY_SAPLING = registerBlock("ebony_sapling",
            () -> new SaplingBlock(new EbonyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), CreativeModeTab.TAB_DECORATIONS);


    public static final RegistryObject<Block> GEM_CUTTING_STATION = registerBlock("gem_cutting_station",
            () -> new GemCuttingStationBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> AIKIGITE_ORE = registerBlock("aikigite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.7f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> DEEPSLATE_AIKIGITE_ORE = registerBlock("deepslate_aikigite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> ALUMINIUM_ORE = registerBlock("aluminium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> BAUHERITE_ORE = registerBlock("bauherite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.7f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> DEEPSLATE_BAUHERITE_ORE = registerBlock("deepslate_bauherite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.55f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> GRAPHITE_ORE = registerBlock("graphite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f, 10f).requiresCorrectToolForDrops(), UniformInt.of(4,6)),ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> MITRIL_ORE = registerBlock("mitril_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> DEEPSLATE_MITRIL_ORE = registerBlock("deepslate_mitril_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);


    public static final RegistryObject<Block> NETHERRACK_CITRINE_ORE = registerBlock("netherrack_citrine_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.2f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> AVENRONITE_ORE = registerBlock("avenronite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops(), UniformInt.of(7, 14)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> EDRUELIUM_ORE = registerBlock("edruelium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops(), UniformInt.of(7, 14)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> PENDORITE_ORE = registerBlock("pendorite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops(), UniformInt.of(7, 14)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> ENDSTONE_CITRINE_ORE = registerBlock("endstone_citrine_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops(), UniformInt.of(7, 13)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> ENDSTONE_PENDORITE_ORE = registerBlock("endstone_pendorite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(7, 13)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> OXYS_ORE = registerBlock("oxys_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).requiresCorrectToolForDrops(), UniformInt.of(15, 25)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> RAW_AIKIGITE_BLOCK = registerBlock("raw_aikigite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> RAW_AVENRONTE_BLOCK = registerBlock("raw_avenronite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> RAW_BAUHERITE_BLOCK = registerBlock("raw_bauherite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> RAW_EDUELIUM_BLOCK = registerBlock("raw_edruelium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> RAW_PENDORITE_BLOCK = registerBlock("raw_pendorite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1.1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> AIKIGITE_BLOCK = registerBlock("aikigite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.7f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> AVENRONITE_BLOCK = registerBlock("avenronite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> BAUHERITE_BLOCK = registerBlock("bauherite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> EDRUELIUM_BLOCK = registerBlock("edruelium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> MITRHIL_BLOCK = registerBlock("mitril_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> OXYS_BLOCK = registerBlock("oxys_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> PENDORITE_BLOCK = registerBlock("pendorite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);


    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> RAW_CITRINE_BLOCK = registerBlock("raw_citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> SPEEDY_BLOCK = registerBlock("speedy_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB, "tooltip.tutorialmod.block.speedy_block");


    public static final RegistryObject<Block> CITRINE_STAIRS = registerBlock("citrine_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> CITRINE_SLAB = registerBlock("citrine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> CITRINE_FENCE = registerBlock("citrine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> CITRINE_FENCE_GATE = registerBlock("citrine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> CITRINE_WALL = registerBlock("citrine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> CITRINE_BUTTON = registerBlock("citrine_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.2f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> CITRINE_PRESSURE_PLATE = registerBlock("citrine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> PINK_ROSE = registerBlock("pink_rose",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> POTTED_PINK_ROSE = registerBlockWithoutBlockItem("potted_pink_rose",
            () -> new FlowerPotBlock(null, ModBlocks.PINK_ROSE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> WINTER_WINDOW = registerBlock("winter_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion()), ModCreativeModeTab.BLOCK_TAB);


    public static final RegistryObject<Block> CITRINE_LAMP = registerBlock("citrine_lamp",
            () -> new CitrineLampBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.3f).requiresCorrectToolForDrops().lightLevel(
                            (state) -> state.getValue(CitrineLampBlock.CLICKED) ? 15 : 0)
                    .sound(ModSounds.CITRINE_LAMP_SOUNDS)),
            ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> CUCUMBER_PLANT = registerBlockWithoutBlockItem("cucumber_plant",
            () -> new CucumberPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> RICE_PLANT = registerBlockWithoutBlockItem("rice_plant",
            () -> new RicePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


    public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> EBONY_WOOD = registerBlock("ebony_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.BLOCK_TAB);

    //Moss Bricks
    public static final RegistryObject<Block> MOSS_BRICKS = registerBlock("moss_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.MOSS)
                    .strength(0.5f)),ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> MOSS_BRICKS_STAIRS = registerBlock("moss_bricks_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSS_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.MOSS).strength(0.5f)),ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> MOSS_BRICKS_SLAB = registerBlock("moss_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.MOSS)
                    .strength(0.5f)), ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> MOSS_BRICKS_WALL = registerBlock("moss_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.MOSS)
                    .strength(0.5f)), ModCreativeModeTab.BLOCK_TAB);

    //Moss Blocks
    public static final RegistryObject<Block> MOSS_BLOCK_STAIRS = registerBlock("moss_block_stairs",
            () -> new StairBlock(() -> MOSS_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.MOSS).strength(0.5f)),
            ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> MOSS_BLOCK_SLAB = registerBlock("moss_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.MOSS)
                    .strength(0.5f)),ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> MOSS_BLOCK_WALL = registerBlock("moss_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.MOSS)
                    .strength(0.5f)), ModCreativeModeTab.BLOCK_TAB);


    public static final RegistryObject<Block> EBONY_PLANKS = registerBlock("ebony_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.BLOCK_TAB);


    public static final RegistryObject<Block> EBONY_LEAVES = registerBlock("ebony_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.BLOCK_TAB);


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }


    //cut graphite Blocks
    public static final RegistryObject<Block> CUT_GRAPHITE = registerBlock("cut_graphite",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.5f)),ModCreativeModeTab.BLOCK_TAB);


    public static final RegistryObject<Block> CUT_GRAPHITE_STAIRS = registerBlock("cut_graphite_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSS_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL).strength(0.5f)),ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> CUT_GRAPHITE_SLAB = registerBlock("cut_graphite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.5f)), ModCreativeModeTab.BLOCK_TAB);
    public static final RegistryObject<Block> CUT_GRAPHITE_WALL = registerBlock("cut_graphite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.5f)), ModCreativeModeTab.BLOCK_TAB);

    //graphite Blocks
    public static final RegistryObject<Block> GRAPHITE_BLOCK = registerBlock("graphite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.5f)),ModCreativeModeTab.BLOCK_TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));

    }

}

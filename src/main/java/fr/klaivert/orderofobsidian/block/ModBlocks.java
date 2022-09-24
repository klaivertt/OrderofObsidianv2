package fr.klaivert.orderofobsidian.block;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.block.custom.BlueberryCropBlock;
import fr.klaivert.orderofobsidian.item.ModCreativeModeTab;
import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.MOSS_BLOCK;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OrderOfObsidianMod.MOD_ID);
    public static final RegistryObject<Block> BLUEBERRY_CROP = BLOCKS.register("blueberry_crop",
            () -> new BlueberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> JASMINE = registerBlock("jasmine",
            () -> new FlowerBlock(MobEffects.GLOWING, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> POTTED_JASMINE = BLOCKS.register("potted_jasmine",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.JASMINE,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));



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

    public static final RegistryObject<Block> GRAPHITE_ORE = registerBlock("graphite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f, 10f).requiresCorrectToolForDrops(), UniformInt.of(3,6)),ModCreativeModeTab.BLOCK_TAB);

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


    //nether ore
    public static final RegistryObject<Block> AVENRONITE_ORE = registerBlock("avenronite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops(), UniformInt.of(7, 14)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> EDRUELIUM_ORE = registerBlock("edruelium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops(), UniformInt.of(7, 14)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> PENDORITE_ORE = registerBlock("pendorite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops(), UniformInt.of(7, 14)), ModCreativeModeTab.BLOCK_TAB);
    //end nether ore
//end ore
    public static final RegistryObject<Block> ENDSTONE_PENDORITE_ORE = registerBlock("endstone_pendorite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(7, 13)), ModCreativeModeTab.BLOCK_TAB);

    public static final RegistryObject<Block> OXYS_ORE = registerBlock("oxys_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
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

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
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



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

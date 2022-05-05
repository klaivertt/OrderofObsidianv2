package fr.klaivert.orderofobsidian.item;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.block.ModBlocks;
import fr.klaivert.orderofobsidian.item.custom.*;
import fr.klaivert.orderofobsidian.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OrderOfObsidianMod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));
//raw and ingot
    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> RAW_AIKIGITE = ITEMS.register("raw_aikigite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> AIKIGITE_INGOT = ITEMS.register("aikigite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> RAW_AVENRONITE = ITEMS.register("raw_avenronite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> AVENRONITE_INGOT = ITEMS.register("avenronite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> RAW_BAUHERITE = ITEMS.register("raw_bauherite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> BAUHERITE_INGOT = ITEMS.register("bauherite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> RAW_EDRUELIUM = ITEMS.register("raw_edruelium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> EDRUELIUM_INGOT = ITEMS.register("edruelium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> GRAPHITE_DUST = ITEMS.register("graphite_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> GRAPHITE_INGOT = ITEMS.register("graphite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> RAW_PENDORITE = ITEMS.register("raw_pendorite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> PENDORITE_INGOT = ITEMS.register("pendorite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> DUST_STEEL = ITEMS.register("steel_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));
    //end raw and ingot
    //plate
    public static final RegistryObject<Item> ALUMINIUM_PLATE = ITEMS.register("aluminium_plate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));
    //end plate
    //Stick
    public static final RegistryObject<Item> OXYS_STICK = ITEMS.register("oxys_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));
    //End Stick
    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB).durability(16)));

    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.CUCUMBER)));

    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new CoalCokeItem(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> MAGIC_DUST = ITEMS.register("magic_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> DATA_TABLET = ITEMS.register("data_tablet",
            () -> new DataTabletItem(new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CUCUMBER_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> BAR_BRAWL_MUSIC_DISC = ITEMS.register("bar_brawl_music_disc",
            () -> new RecordItem(4, ModSounds.BAR_BRAWL,
                    new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB).stacksTo(1)));



    public static final RegistryObject<Item> GEM_CUTTER_TOOL = ITEMS.register("gem_cutter_tool",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLOCK_TAB).durability(32)));
    //Aikigite
    public static final RegistryObject<Item> AIKIGITE_HELMET = ITEMS.register("aikigite_helmet",
            () -> new AikigiteArmor.Helmet());
    public static final RegistryObject<Item> AIKIGITE_CHESTPLATE = ITEMS.register("aikigite_chestplate",
            () -> new AikigiteArmor.Chestplate());
    public static final RegistryObject<Item> AIKIGITE_LEGGINGS = ITEMS.register("aikigite_leggings",
            () -> new AikigiteArmor.Leggings());
    public static final RegistryObject<Item> AIKIGITE_BOOTS = ITEMS.register("aikigite_boots",
            () -> new AikigiteArmor.Boots());
    public static final RegistryObject<Item> AIKIGITE_SWORD = ITEMS.register("aikigite_sword",
            () -> new SwordItem(ModTiers.AIKIGITE, 5, 1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB)));
    public static final RegistryObject<Item> AIKIGITE_PICKAXE = ITEMS.register("aikigite_pickaxe",
            () -> new PickaxeItem(ModTiers.AIKIGITE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> AIKIGITE_SHOVEL = ITEMS.register("aikigite_shovel",
            () -> new ShovelItem(ModTiers.AIKIGITE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> AIKIGITE_AXE = ITEMS.register("aikigite_axe",
            () -> new AxeItem(ModTiers.AIKIGITE, 15, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> AIKIGITE_BOW = ITEMS.register("aikigite_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB).durability(600)));
    public static final RegistryObject<Item> AIKIGITE_HAMMER = ITEMS.register("aikigite_hammer",
            () -> new Aikigitehammer());

    //end Aikigite
    //avenronite
    public static final RegistryObject<Item> AVENRONITE_HELMET = ITEMS.register("avenronite_helmet",
            () -> new AvenroniteArmor.Helmet());
    public static final RegistryObject<Item> AVENRONITE_CHESTPLATE = ITEMS.register("avenronite_chestplate",
            () -> new AvenroniteArmor.Chestplate());
    public static final RegistryObject<Item> AVENRONITE_LEGGINGS = ITEMS.register("avenronite_leggings",
            () -> new AvenroniteArmor.Leggings());
    public static final RegistryObject<Item> AVENRONITE_BOOTS = ITEMS.register("avenronite_boots",
            () -> new AvenroniteArmor.Boots());
    public static final RegistryObject<Item> AVENRONITE_SWORD = ITEMS.register("avenronite_sword",
            () -> new SwordItem(ModTiers.AVENRONITE, 5, 1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB)));
    public static final RegistryObject<Item> AVENRONITE_PICKAXE = ITEMS.register("avenronite_pickaxe",
            () -> new PickaxeItem(ModTiers.AVENRONITE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> AVENRONITE_SHOVEL = ITEMS.register("avenronite_shovel",
            () -> new ShovelItem(ModTiers.AVENRONITE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> AVENRONITE_AXE = ITEMS.register("avenronite_axe",
            () -> new AxeItem(ModTiers.AVENRONITE, 15, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> AVENRONITE_HOE = ITEMS.register("avenronite_hoe",
            () -> new HoeItem(ModTiers.AVENRONITE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> AVENRONITE_BOW = ITEMS.register("avenronite_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB).durability(800)));
    public static final RegistryObject<Item> AVENRONITE_HAMMER = ITEMS.register("avenronite_hammer",
            () -> new Avenronitehammer());
    //end avenronite
    //bauherite
    public static final RegistryObject<Item> BAUHERITE_HELMET = ITEMS.register("bauherite_helmet",
            () -> new BauheriteArmor.Helmet());
    public static final RegistryObject<Item> BAUHERITE_CHESTPLATE = ITEMS.register("bauherite_chestplate",
            () -> new BauheriteArmor.Chestplate());
    public static final RegistryObject<Item> BAUHERITE_LEGGINGS = ITEMS.register("bauherite_leggings",
            () -> new BauheriteArmor.Leggings());
    public static final RegistryObject<Item> BAUHERITE_BOOTS = ITEMS.register("bauherite_boots", ()
            -> new BauheriteArmor.Boots());
    public static final RegistryObject<Item> BAUHERITE_SWORD = ITEMS.register("bauherite_sword",
            () -> new SwordItem(ModTiers.BAUHERITE, 5, 1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB)));
    public static final RegistryObject<Item> BAUHERITE_PICKAXE = ITEMS.register("bauherite_pickaxe",
            () -> new PickaxeItem(ModTiers.BAUHERITE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> BAUHERITE_SHOVEL = ITEMS.register("bauherite_shovel",
            () -> new ShovelItem(ModTiers.BAUHERITE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> BAUHERITE_AXE = ITEMS.register("bauherite_axe",
            () -> new AxeItem(ModTiers.BAUHERITE, 15, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> BAUHERITE_BOW = ITEMS.register("bauherite_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB).durability(650)));
    public static final RegistryObject<Item> BAUHERITE_HAMMER = ITEMS.register("bauherite_hammer",
            () -> new Bauheritehammer());
    //end bauherite
    //bone
    public static final RegistryObject<Item> BONE_HELMET = ITEMS.register("bone_helmet",
            () -> new BoneArmor.Helmet());
    public static final RegistryObject<Item> BONE_CHESTPLATE = ITEMS.register("bone_chestplate",
            () -> new BoneArmor.Chestplate());
    public static final RegistryObject<Item> BONE_LEGGINGS = ITEMS.register("bone_leggings",
            () -> new BoneArmor.Leggings());
    public static final RegistryObject<Item> BONE_BOOTS = ITEMS.register("bone_boots",
            () -> new BoneArmor.Boots());
    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword",
            () -> new SwordItem(ModTiers.BONE, 5, 1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB)));
    public static final RegistryObject<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe",
            () -> new PickaxeItem(ModTiers.BONE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> BONE_SHOVEL = ITEMS.register("bone_shovel",
            () -> new ShovelItem(ModTiers.BONE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> BONE_AXE = ITEMS.register("bone_axe",
            () -> new AxeItem(ModTiers.BONE, 15, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> BONE_HOE = ITEMS.register("bone_hoe",
            () -> new HoeItem(ModTiers.BONE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    //end bone
    //candy apple
    public static final RegistryObject<Item> CANDY_APPLE = ITEMS.register("candy_apple",
            () -> new CandyApple());
    //end candy apple
    //citrine
    public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
            () -> new LevitationSwordItem(ModTiers.CITRINE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB)));
    public static final RegistryObject<Item> CITRINE_PICKAXE = ITEMS.register("citrine_pickaxe",
            () -> new PickaxeItem(ModTiers.CITRINE, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> CITRINE_SHOVEL = ITEMS.register("citrine_shovel",
            () -> new ShovelItem(ModTiers.CITRINE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> CITRINE_AXE = ITEMS.register("citrine_axe",
            () -> new AxeItem(ModTiers.CITRINE, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> CITRINE_HOE = ITEMS.register("citrine_hoe",
            () -> new HoeItem(ModTiers.CITRINE, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    public static final RegistryObject<Item> CITRINE_HELMET = ITEMS.register("citrine_helmet",
            () -> new ModArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ARMOR_TAB)));
    public static final RegistryObject<Item> CITRINE_CHESTPLATE = ITEMS.register("citrine_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ARMOR_TAB)));
    public static final RegistryObject<Item> CITRINE_LEGGING = ITEMS.register("citrine_leggings",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ARMOR_TAB)));
    public static final RegistryObject<Item> CITRINE_BOOTS = ITEMS.register("citrine_boots",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ARMOR_TAB)));
    public static final RegistryObject<Item> CITRINE_STAFF = ITEMS.register("citrine_staff",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CITRINE_BOW = ITEMS.register("citrine_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB).durability(550)));
    //end citrine

    //diamond
    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple",
            () -> new DiamondApple());
    //end diamond
    //edruelium
    public static final RegistryObject<Item> EDRUELIUM_HELMET = ITEMS.register("edruelium_helmet",
            () -> new Edrueliumarmor.Helmet());
    public static final RegistryObject<Item> EDRUELIUM_CHESTPLATE = ITEMS.register("edruelium_chestplate",
            () -> new Edrueliumarmor.Chestplate());
    public static final RegistryObject<Item> EDRUELIUM_LEGGINGS = ITEMS.register("edruelium_leggings",
            () -> new Edrueliumarmor.Leggings());
    public static final RegistryObject<Item> EDRUELIUM_BOOTS = ITEMS.register("edruelium_boots",
            () -> new Edrueliumarmor.Boots());
    public static final RegistryObject<Item> EDRUELIUM_SWORD = ITEMS.register("edruelium_sword",
            () -> new SwordItem(ModTiers.EDRUELIUM, 5, 1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB)));
    public static final RegistryObject<Item> EDRUELIUM_PICKAXE = ITEMS.register("edruelium_pickaxe",
            () -> new PickaxeItem(ModTiers.EDRUELIUM, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> EDRUELIUM_SHOVEL = ITEMS.register("edruelium_shovel",
            () -> new ShovelItem(ModTiers.EDRUELIUM, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> EDRUELIUM_AXE = ITEMS.register("edruelium_axe",
            () -> new AxeItem(ModTiers.EDRUELIUM, 15, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> EDRUELIUM_HOE = ITEMS.register("edruelium_hoe",
            () -> new HoeItem(ModTiers.EDRUELIUM, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> EDRUELIUM_HAMMER = ITEMS.register("edruelium_hammer",
            () -> new Edrueliumhammer());
    public static final RegistryObject<Item> EDRUELIUM_BOW = ITEMS.register("edruelium_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB).durability(800)));
    //end edruelium
    //faraday
    public static final RegistryObject<Item> FARAFAY_HELMET = ITEMS.register("faraday_helmet",
            () -> new FaradayArmor.Helmet());
    public static final RegistryObject<Item> FARAFAY_CHESTPLATE = ITEMS.register("faraday_chestplate",
            () -> new FaradayArmor.Chestplate());
    public static final RegistryObject<Item> FARAFAY_LEGGINGS = ITEMS.register("faraday_leggings",
            () -> new FaradayArmor.Leggings());
    public static final RegistryObject<Item> FARAFAY_BOOTS = ITEMS.register("faraday_boots",
            () -> new FaradayArmor.Boots());
    //end farraday
    //mithril
    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new MithrilArmor.Helmet());
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new MithrilArmor.Chestplate());
    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new MithrilArmor.Leggings());
    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new MithrilArmor.Boots());

    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ModTiers.MITHRIL, 5, 1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB)));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModTiers.MITHRIL, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModTiers.MITHRIL, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModTiers.MITHRIL, 15, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModTiers.MITHRIL, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    //end mithril
    //netherite
    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor",
            () -> new HorseArmorItem(13,"netherite", new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB).stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_APPLE = ITEMS.register("netherite_apple",
            () -> new NetheriteApple());
    //end netherite
    //netherrack
    public static final RegistryObject<Item> NETHERRACK_HELMET = ITEMS.register("netherrack_helmet",
            () -> new NetherackArmor.Helmet());
    public static final RegistryObject<Item> NETHERRACK_CHESTPLATE = ITEMS.register("netherrack_chestplate",
            () -> new NetherackArmor.Chestplate());
    public static final RegistryObject<Item> NETHERRACK_LEGGINGS = ITEMS.register("netherrack_leggings",
            () -> new NetherackArmor.Leggings());
    public static final RegistryObject<Item> NETHERRACK_BOOTS = ITEMS.register("netherrack_boots",
            () -> new NetherackArmor.Boots());
    //end netherrack
    //obsidian
    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
            () -> new ObsidianArmor.Helmet());
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
            () -> new ObsidianArmor.Chestplate());
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
            () -> new ObsidianArmor.Leggings());
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
            () -> new ObsidianArmor.Boots());
    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(ModTiers.OBSIDIAN, 5, 1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(ModTiers.OBSIDIAN, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",
            () -> new ShovelItem(ModTiers.OBSIDIAN, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
            () -> new AxeItem(ModTiers.OBSIDIAN, 15, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",
            () -> new HoeItem(ModTiers.OBSIDIAN, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_HAMMER = ITEMS.register("obsidian_hammer",
            () -> new Obsidianhammer());
    //end Obsidian
    //oxys
    public static final RegistryObject<Item> OXYS = ITEMS.register("oxys",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> OXYS_HORSE_ARMOR = ITEMS.register("oxys_horse_armor",
            () -> new HorseArmorItem(23,"oxys", new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB).stacksTo(1)));

    public static final RegistryObject<Item> OXYS_SWORD = ITEMS.register("oxys_sword",
            () -> new SwordItem(ModTiers.OXYS, 14, 1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB)));
    public static final RegistryObject<Item> OXYS_BOW = ITEMS.register("oxys_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB).durability(1200)));

    public static final RegistryObject<Item> OXYS_PICKAXE = ITEMS.register("oxys_pickaxe",
            () -> new PickaxeItem(ModTiers.OXYS, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> OXYS_SHOVEL = ITEMS.register("oxys_shovel",
            () -> new ShovelItem(ModTiers.OXYS, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> OXYS_AXE = ITEMS.register("oxys_axe",
            () -> new AxeItem(ModTiers.OXYS, 15, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> OXYS_HOE = ITEMS.register("oxys_hoe",
            () -> new HoeItem(ModTiers.OXYS, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> OXYS_HAMMER = ITEMS.register("oxys_hammer",
            () -> new OxysHammer());

    public static final RegistryObject<Item> OXYS_HELMET = ITEMS.register("oxys_helmet",
            () -> new  OxysArmor.Helmet());
    public static final RegistryObject<Item> OXYS_CHESTPLATE = ITEMS.register("oxys_chestplate",
            () -> new OxysArmor.Chestplate());
    public static final RegistryObject<Item> OXYS_LEGGING = ITEMS.register("oxys_leggings",
            () -> new OxysArmor.Leggings());
    public static final RegistryObject<Item> OXYS_BOOTS = ITEMS.register("oxys_boots",
            () -> new OxysArmor.Boots());

    public static final RegistryObject<Item> OXYS_APPLE = ITEMS.register("oxys_apple",
            () -> new Oxysapple());

    //end oxys
    //pendorite

    public static final RegistryObject<Item> PENDORITE_SWORD = ITEMS.register("pendorite_sword",
            () -> new LevitationSwordItem(ModTiers.PENDORITE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB)));
    public static final RegistryObject<Item> PENDORITE_PICKAXE = ITEMS.register("pendorite_pickaxe",
            () -> new PickaxeItem(ModTiers.PENDORITE, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> PENDORITE_SHOVEL = ITEMS.register("pendorite_shovel",
            () -> new ShovelItem(ModTiers.PENDORITE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item>PENDORITE_AXE = ITEMS.register("pendorite_axe",
            () -> new AxeItem(ModTiers.PENDORITE, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> PENDORITE_HOE = ITEMS.register("pendorite_hoe",
            () -> new HoeItem(ModTiers.PENDORITE, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> PENDORITE_HORSE_ARMOR = ITEMS.register("pendorite_horse_armor",
            () -> new HorseArmorItem(15,"pendorite", new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PENDORITE_APPLE = ITEMS.register("pendorite_apple",
            () -> new PendoriteApple());

    //end pendorite
    //steel
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new SteelArmor.Helmet());
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new SteelArmor.Chestplate());
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new SteelArmor.Leggings());
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new SteelArmor.Boots());
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModTiers.STEEL, 5, 1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.WEAPON_TAB)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModTiers.STEEL, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModTiers.STEEL, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModTiers.STEEL, 15, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModTiers.STEEL, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    //end steel
    //Stone
    public static final RegistryObject<Item> STONE_HELMET = ITEMS.register("stone_helmet",
            () -> new StoneArmor.Helmet());
    public static final RegistryObject<Item> STONE_CHESTPLATE = ITEMS.register("stone_chestplate",
            () -> new StoneArmor.Chestplate());
    public static final RegistryObject<Item> STONE_LEGGINGS = ITEMS.register("stone_leggings",
            () -> new StoneArmor.Leggings());
    public static final RegistryObject<Item> STONE_BOOTS = ITEMS.register("stone_boots",
            () -> new StoneArmor.Boots());
    //end stone
    //woden
    public static final RegistryObject<Item> WOODEN_HELMET = ITEMS.register("wooden_helmet",
            () -> new WoodenArmor.Helmet());
    public static final RegistryObject<Item> WOODEN_CHESTPLATE = ITEMS.register("wooden_chestplate",
            () -> new WoodenArmor.Chestplate());
    public static final RegistryObject<Item> WOODEN_LEGGINGS = ITEMS.register("wooden_leggings",
            () -> new WoodenArmor.Leggings());
    public static final RegistryObject<Item> WOODEN_BOOTS = ITEMS.register("wooden_boots",
            () -> new WoodenArmor.Boots());
    //end woden



    public static final RegistryObject<Item> MOSS_HORSE_ARMROR = ITEMS.register("moss_horse_armor",
            () -> new HorseArmorItem(6, "moss", new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB).stacksTo(1)));


    public static final RegistryObject<Item> MOSS_WHEAT = ITEMS.register("wheat_with_moss",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

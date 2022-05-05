package fr.klaivert.orderofobsidian.util;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DOWSING_ROD_VALUABLES
                = tag("dowsing_rod_valuables");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(OrderOfObsidianMod.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CITRINE_GEMS = forgeTag("gems/citrine");
        public static final TagKey<Item> OXYS_GEMS = forgeTag("ingot/oxys");

        public static final TagKey<Item> AIKIGITE_INGOT = forgeTag("ingot/aikigite");
        public static final TagKey<Item> ALUMINIUM_INGOT = forgeTag("ingot/aluminium");
        public static final TagKey<Item> AVENRONITE_INGOT = forgeTag("ingot/avenronite");
        public static final TagKey<Item> BAHERITE_INGOT = forgeTag("ingot/bauherite");
        public static final TagKey<Item> EDRUELIUM_INGOT = forgeTag("ingot/aikigite");
        public static final TagKey<Item> LEAD_INGOT = forgeTag("ingot/lead_ingot");
        public static final TagKey<Item> MITHRIL_INGOT = forgeTag("ingot/mithril_ingot");
        public static final TagKey<Item> PENDORITE_INGOT = forgeTag("ingot/pendorite");
        public static final TagKey<Item> SILVER_INGOT = forgeTag("ingot/silver");
        public static final TagKey<Item> STEEL_INGOT = forgeTag("ingot/steel");

        public static final TagKey<Item> RAW_AIKIGITE = forgeTag("raw/aikigite");
        public static final TagKey<Item> RAW_ALUMINIUM = forgeTag("raw/aluminium");
        public static final TagKey<Item> RAW_AVENRONITE = forgeTag("raw/avenronite");
        public static final TagKey<Item> RAW_BAHERITE = forgeTag("raw/bauherite");
        public static final TagKey<Item> RAW_EDRUELIUM = forgeTag("raw/aikigite");
        public static final TagKey<Item> RAW_LEAD = forgeTag("raw/lead_ingot");
        public static final TagKey<Item> RAW_MITHRIL = forgeTag("raw/mithril");
        public static final TagKey<Item> RAW_PENDORITE = forgeTag("raw/pendorite");
        public static final TagKey<Item> RAW_SILVER = forgeTag("raw/silver");
        public static final TagKey<Item> RAW_STEEL = forgeTag("raw/steel");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(OrderOfObsidianMod.MOD_ID, name));
        }


        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
